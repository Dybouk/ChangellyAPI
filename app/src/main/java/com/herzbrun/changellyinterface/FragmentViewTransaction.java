package com.herzbrun.changellyinterface;

public class FragmentViewTransaction extends AppCompatActivity {

    private ListView ViewTransaction;
    Context mContext;

    ChangellyWrapper wrapper = new ChangellyWrapper();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_changelly_view_transaction);
        ViewTransaction = (ListView) findViewById(R.id.output_rows);
        SetupGetTransaction();
        //getTransaction
    }
    private void SetupGetTransaction() {
        wrapper.setTransactionListener(new ChangellyWrapper.GetTransactionInterface() {
            @Override
            public void onGetTransactionInterface(List<ListTransaction> listTransactions) {
                List<String> listTransactionView = new ArrayList<>();
                for (int i = 0; i < listTransactions.size(); i++) {
                    listTransactionView.add(listTransactions.get(i).getStatus());
                    //listTransactionView.add(listTransactions.get(i).getAmountExpectedFrom());

                }
                ArrayAdapter<String> newAdapter = new ArrayAdapter<>(mContext, android.R.layout.simple_list_item_1, listTransactionView);
                newAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
                ViewTransaction.setAdapter(newAdapter);


                /*Transaction tr = new Transaction();
                ViewTransaction.setText(String.valueOf(tr.getResult()));
                Log.d("TAG", String.valueOf(tr.getResult()));*/


            }
        });
    }

}
