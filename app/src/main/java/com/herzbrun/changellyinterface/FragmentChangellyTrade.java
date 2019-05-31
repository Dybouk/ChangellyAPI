package com.herzbrun.changellyinterface;

public class FragmentChangellyTrade extends AppCompatActivity {

    ChangellyService mApiservice;
    Context mContext;
    private Button submitButton;
    private Spinner sourceSpinner;
    private Spinner destinationSpinner;
    private EditText sendAmount;
    private TextView exchangeAmount;
    private TextView minimumAmount;
    // private TextView generateAddress;
    private TextView createTransaction;
    private TextView createTransaction2;
    private TextView validateAddress;

    ChangellyWrapper wrapper = new ChangellyWrapper();
    String from = "btc";
    String to = "eth";
    String amount = "1";
    String address = "";
    String currency = "eth";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_changelly_trade);
        sourceSpinner = (Spinner) findViewById(R.id.from_coin_changelly);
        destinationSpinner = (Spinner) findViewById(R.id.to_coin_changelly);
        sendAmount = (EditText) findViewById(R.id.amount_to_send);
        exchangeAmount = (TextView) findViewById(R.id.exchange_amounts);
        minimumAmount = (TextView) findViewById(R.id.amount_minimum);
        // View minimumAmount = inflater.inflate(R.id.amount_minimum);
        createTransaction = (TextView) findViewById(R.id.address_exchange_changelly);
        createTransaction2 = (TextView) findViewById(R.id.address_receive_changelly);
        validateAddress = (TextView) findViewById(R.id.validate_address);
        mContext = FragmentChangellyTrade.this;
        mApiservice = UtilsChangellyApi.getAPIService();
        ArrayAdapter<String> adapter = null;
        sourceSpinner.setAdapter(adapter);
        destinationSpinner.setAdapter(adapter);
        submitButton = (Button) findViewById(R.id.submit_button);

        setupCurrencySpinner();
        setupExchangeAmount();
        setupCreateTransaction();
        setupMinAmount();
        setupValidateAddress();

        wrapper.getExchangeAmount(from, to, amount);
        wrapper.createTransaction(from, to, amount, address);
        wrapper.getMinAmount(from, to);
        wrapper.validateAddress(currency, address);
        wrapper.getCurrenciesFull();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChangellyStatus();
            }
        });

        /*sourceSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

               // String selectedCoin = parent.getItemAtPosition(position).toString().toUpperCase();
                // set amount and min
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //handle error
            }
        });
        destinationSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //String selectedCoin = parent.getItemAtPosition(position).toString().toUpperCase();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //handle error
            }
        });*/
    }
    //end onCreate-------------------------------------------------------------------------------

    private void fragmentChangellyStatus() {
        Intent intent = new Intent(this, FragmentChangellyStatus.class);
        startActivity(intent);
    }

    private void setupCurrencySpinner() {
        wrapper.setCurrencyFullListener(new ChangellyWrapper.GetCurrencyFullInterface() {
            @Override
            public void onGetCurrencyFullInterface(List<CurrenciesFullValue> currencyName) {
                List<String> listSpinner = new ArrayList<>();
                for (int i = 0; i < currencyName.size(); i++) {
                    listSpinner.add(currencyName.get(i).getName().toUpperCase());
                }
                ArrayAdapter<String> newAdapter = new ArrayAdapter<>(mContext, android.R.layout.simple_spinner_item, listSpinner);
                newAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sourceSpinner.setAdapter(newAdapter);
                destinationSpinner.setAdapter(newAdapter);
            }
        });
    }

    private void setupExchangeAmount() {
        wrapper.setExchangeAmountListener(new ChangellyWrapper.ExchangeAmountInterface() {
            @Override
            public void onExchangeAmountInterface(String result) {
                //  ExchangeAmount ea = new ExchangeAmount();
                exchangeAmount.setText(String.valueOf(result));
                Log.d("setupExchangeAmount", String.valueOf(result));
            }
        });
    }

    private void setupCreateTransaction() {
        wrapper.setCreateTransactionListener(new ChangellyWrapper.CreateTransactionInterface() {
            @Override
            public void onCreateTransactionInterface(TransactionInfo id) {
                //TransactionInfo ct = new TransactionInfo();
                createTransaction.setText(String.valueOf(id));
                //  createTransaction2.setText(String.valueOf(id.getPayoutAddress()));
//                Log.d("setupCreateTransaction", String.valueOf(getResult.getAmountExpectedFrom()));
                //              Log.d("setupCreateTransaction2", String.valueOf(getResult.getPayoutAddress()));
            }
        });
    }

    private void setupMinAmount() {
        wrapper.setMinAmountListener(new ChangellyWrapper.MinAmountInterface() {
            @Override
            public void onMinAmountInterface(String result) {
                //MinAmount ma = new MinAmount();
                minimumAmount.setText(String.valueOf(result));
                //Log.d("setupMinAmount", String.valueOf(result.getResult()));
            }
        });
    }

    private void setupValidateAddress() {
        wrapper.setValidateAddressListener(new ChangellyWrapper.ValidateAddressInterface() {
            @Override
            public void onValidateAddressInterface(AddressValid addressValid) {


                //validateAddress.setText(String(va.isAddressValid());
                Log.d("setupValidateAddress", String.valueOf(addressValid.isAddressValid()));
            }
        });
    }


}
