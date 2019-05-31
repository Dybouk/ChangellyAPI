package com.herzbrun.changellyinterface;

public class FragmentChangellyStatus extends AppCompatActivity {
    private Button tradeEmailReceipt;
    private TextView ValidDeposit;
    String id ="transId";
    ChangellyWrapper wrapper = new ChangellyWrapper();
    //Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_changelly_status);
        ValidDeposit = (TextView) findViewById(R.id.trade_deposit_status_text);
        tradeEmailReceipt = (Button) findViewById(R.id.trade_view_transaction);

        setupStatus();
        wrapper.getStatus(id);

        tradeEmailReceipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewTransaction();
            }
        });
    }

    public void viewTransaction() {
        Intent intent = new Intent(this, FragmentViewTransaction.class);
        startActivity(intent);
    }

    private void setupStatus() {
        wrapper.setStatusListener(new ChangellyWrapper.GetStatusInterface() {
            @Override
            public void onGetStatusInterface(String result) {
                Status status = new Status();
                ValidDeposit.setText(String.valueOf(status.getResult()));
                Log.d("TAG", String.valueOf(status.getResult()));
                Log.d("TAG2", String.valueOf(status.getId()));

            }
        });
    }

    //

}