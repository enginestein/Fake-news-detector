package com.example.fakenewsdetector;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String selectedState, selectedCountry;
    private TextView tvCountrySpinner, tvStateSpinner;
    private Spinner countrySpinner, stateSpinner;
    private ArrayAdapter<CharSequence> countryAdapter, stateAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countrySpinner = findViewById(R.id.spinner_indian_states);
        countryAdapter = ArrayAdapter.createFromResource(this,
                R.array.array_countries, R.layout.spinner_layout);

        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        countrySpinner.setAdapter(countryAdapter);

        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                stateSpinner = findViewById(R.id.spinner_indian_states);
                selectedCountry = countrySpinner.getSelectedItem().toString();
                int parentID = parent.getId();

                if (parentID == R.id.spinner_indian_states) {
                    switch (selectedCountry) {
                        case "Select Your Country":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_default_states, R.layout.spinner_layout);
                            break;
                        case "Afghanistan":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_afghanistan_states, R.layout.spinner_layout);
                            break;

                        case "Albania":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_albania_states, R.layout.spinner_layout);
                            break;

                        case "Algeria":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_algeria_states, R.layout.spinner_layout);
                            break;

                        case "American Samoa":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_american_samoa_states, R.layout.spinner_layout);
                            break;

                        case "Andorra":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_andorra_states, R.layout.spinner_layout);
                            break;

                        case "Angola":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_angola_states, R.layout.spinner_layout);
                            break;


                        case "Anguilla":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_anguilla_states, R.layout.spinner_layout);
                            break;

                        case "Antarctica":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_antarctica_states, R.layout.spinner_layout);
                            break;

                        case "Antigua and Barbuda":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_antigua_and_barbuda_states, R.layout.spinner_layout);
                            break;

                        case "Argentina":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_argentina_states, R.layout.spinner_layout);
                            break;

                        case "Armenia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_armenia_states, R.layout.spinner_layout);
                            break;

                        case "Aruba":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_aruba_states, R.layout.spinner_layout);
                            break;

                        case "Australia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_australia_states, R.layout.spinner_layout);
                            break;

                        case "Austria":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_austria_states, R.layout.spinner_layout);
                            break;

                        case "Azerbaijan":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_azerbaijan_states, R.layout.spinner_layout);
                            break;

                        case "Bahrain":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_bahrain_states, R.layout.spinner_layout);
                            break;

                        case "Bangladesh":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_bangladesh_states, R.layout.spinner_layout);
                            break;

                        case "Barbados":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_barbados_states, R.layout.spinner_layout);
                            break;

                        case "Belarus":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_belarus_states, R.layout.spinner_layout);
                            break;

                        case "Belgium":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_belgium_states, R.layout.spinner_layout);
                            break;

                        case "Belize":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_belize_states, R.layout.spinner_layout);
                            break;

                        case "Benin":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_benin_states, R.layout.spinner_layout);
                            break;

                        case "Bhutan":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_bhutan_states, R.layout.spinner_layout);
                            break;

                        case "Bolivia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_bolivia_states, R.layout.spinner_layout);
                            break;

                        case "Bosnia and Herzegovina":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_bosnia_and_herzegovina_states, R.layout.spinner_layout);
                            break;

                        case "Bouvet Island":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_bouvet_island_states, R.layout.spinner_layout);
                            break;

                        case "Brazil":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_brazil_states, R.layout.spinner_layout);
                            break;

                        case "biot":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_biot_states, R.layout.spinner_layout);
                            break;

                        case "British Virgin Islands":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_british_virgin_islands_states, R.layout.spinner_layout);
                            break;

                        case "Brunei":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_brunei_states, R.layout.spinner_layout);
                            break;

                        case "Bulgaria":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_bulgaria_states, R.layout.spinner_layout);
                            break;

                        case "Burkina Faso":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_burkina_faso_states, R.layout.spinner_layout);
                            break;

                        case "Burundi":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_burundi_states, R.layout.spinner_layout);
                            break;

                        case "Cambodia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_combodia_states, R.layout.spinner_layout);
                            break;

                        case "Cameroon":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_cameroon_states, R.layout.spinner_layout);
                            break;

                        case "Canada":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_canada_states, R.layout.spinner_layout);
                            break;

                        case "Cape Verde":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_cape_verde_states, R.layout.spinner_layout);
                            break;

                        case "Cayman Islands":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_cayman_islands_states, R.layout.spinner_layout);
                            break;

                        case "Central African Republic":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_central_african_republic_states, R.layout.spinner_layout);
                            break;

                        case "Chad":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_chad_states, R.layout.spinner_layout);
                            break;

                        case "Chile":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_chile_states, R.layout.spinner_layout);
                            break;

                        case "China":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_china_states, R.layout.spinner_layout);
                            break;

                        case "Christmas Island":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_christmas_island_states, R.layout.spinner_layout);
                            break;

                        case "Cocos (Keeling) Islands":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_cocos_island_states, R.layout.spinner_layout);
                            break;

                        case "Colombia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_colombia_states, R.layout.spinner_layout);
                            break;

                        case "Comoros":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_comoros_states, R.layout.spinner_layout);
                            break;

                        case "Congo":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_congo_states, R.layout.spinner_layout);
                            break;

                        case "Cook Islands":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_cook_islands_states, R.layout.spinner_layout);
                            break;

                        case "Cote d\'Ivoire":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_cote_divore_states, R.layout.spinner_layout);
                            break;

                        case "Croatia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_croatia_states, R.layout.spinner_layout);
                            break;

                        case "Cuba":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_cuba_states, R.layout.spinner_layout);
                            break;

                        case "Cyprus":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_cyprus_states, R.layout.spinner_layout);
                            break;

                        case "Czech Republic":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_czech_states, R.layout.spinner_layout);
                            break;

                        case "Democratic Republic of the Congo":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_dr_congo_states, R.layout.spinner_layout);
                            break;

                        case "Denmark":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_denmark_states, R.layout.spinner_layout);
                            break;

                        case "Djibouti":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_djibouti_states, R.layout.spinner_layout);
                            break;

                        case "Dominica":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_dominica_states, R.layout.spinner_layout);
                            break;

                        case "Dominican Republic":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_dominican_republic_states, R.layout.spinner_layout);
                            break;

                        case "East Timor":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_east_timor_states, R.layout.spinner_layout);
                            break;

                        case "Ecuador":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_ecuador_states, R.layout.spinner_layout);
                            break;

                        case "Egypt":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_egypt_states, R.layout.spinner_layout);
                            break;

                        case "El Salvador":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_el_salvador_states, R.layout.spinner_layout);
                            break;

                        case "Equatorial Guinea":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_equatorial_guinea_states, R.layout.spinner_layout);
                            break;

                        case "Eritrea":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_eritrea_states, R.layout.spinner_layout);
                            break;

                        case "Estonia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_estonia_states, R.layout.spinner_layout);
                            break;

                        case "Eswatini":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_eswatini_states, R.layout.spinner_layout);
                            break;

                        case "Ethiopia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_ethiopia_states, R.layout.spinner_layout);
                            break;

                        case "Faeroe Islands":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_faeroe_islands_states, R.layout.spinner_layout);
                            break;

                        case "Falkland Islands":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_falkland_islands_states, R.layout.spinner_layout);
                            break;

                        case "Fiji":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_fiji_states, R.layout.spinner_layout);
                            break;

                        case "Finland":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_finland_states, R.layout.spinner_layout);
                            break;

                        case "Former Yugoslav Republic of Macedonia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_north_macedonia_states, R.layout.spinner_layout);
                            break;

                        case "France":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_france_states, R.layout.spinner_layout);
                            break;

                        case "Gabon":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_gabon_states, R.layout.spinner_layout);
                            break;

                        case "Georgia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_georgia_states, R.layout.spinner_layout);
                            break;

                        case "Germany":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_germany_states, R.layout.spinner_layout);
                            break;

                        case "Ghana":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_ghana_states, R.layout.spinner_layout);
                            break;

                        case "Gibraltar":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_gibraltar_states, R.layout.spinner_layout);
                            break;

                        case "Greece":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_greece_states, R.layout.spinner_layout);
                            break;

                        case "Greenland":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_greenland_states, R.layout.spinner_layout);
                            break;

                        case "Grenada":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_grenada_states, R.layout.spinner_layout);
                            break;

                        case "Guadeloupe":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_guadeloupe_states, R.layout.spinner_layout);
                            break;

                        case "Guam":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_guam_states, R.layout.spinner_layout);
                            break;

                        case "Guatemala":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_guatemala_states, R.layout.spinner_layout);
                            break;

                        case "Guinea":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_guinea_states, R.layout.spinner_layout);
                            break;

                        case "Guinea-Bissau":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_guinea_bissau_states, R.layout.spinner_layout);
                            break;

                        case "Guyana":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_guyana_states, R.layout.spinner_layout);
                            break;

                        case "Haiti":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_haiti_states, R.layout.spinner_layout);
                            break;

                        case "Heard Island and McDonald Islands":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_himi_states, R.layout.spinner_layout);
                            break;

                        case "Honduras":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_honduras_states, R.layout.spinner_layout);
                            break;

                        case "Hong Kong":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_hong_kong_states, R.layout.spinner_layout);
                            break;

                        case "Hungary":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_hungary_states, R.layout.spinner_layout);
                            break;

                        case "Iceland":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_iceland_states, R.layout.spinner_layout);
                            break;

                        case "India":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_india_states, R.layout.spinner_layout);
                            break;

                        case "Indonesia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_indonesia_states, R.layout.spinner_layout);
                            break;

                        case "Iran":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_iran_states, R.layout.spinner_layout);
                            break;

                        case "Iraq":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_iraq_states, R.layout.spinner_layout);
                            break;

                        case "Ireland":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_ireland_states, R.layout.spinner_layout);
                            break;

                        case "Israel":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_israel_states, R.layout.spinner_layout);
                            break;

                        case "Italy":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_israel_states, R.layout.spinner_layout);
                            break;

                        case "Jamaica":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_jamaica_states, R.layout.spinner_layout);
                            break;

                        case "Japan":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_japan_states, R.layout.spinner_layout);
                            break;

                        case "Kazakhstan":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_kazakhstan_states, R.layout.spinner_layout);
                            break;

                        case "Kenya":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_kenya_states, R.layout.spinner_layout);
                            break;

                        case "Kiribati":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_kiribati_states, R.layout.spinner_layout);
                            break;

                        case "Kuwait":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_kuwait_states, R.layout.spinner_layout);
                            break;

                        case "Kyrgyzstan":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_kyrgystan_states, R.layout.spinner_layout);
                            break;

                        case "Laos":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_laos_states, R.layout.spinner_layout);
                            break;

                        case "Latvia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_latvia_states, R.layout.spinner_layout);
                            break;

                        case "Lebanon":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_lebanon_states, R.layout.spinner_layout);
                            break;

                        case "Lesotho":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_lesotho_states, R.layout.spinner_layout);
                            break;

                        case "Liberia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_liberia_states, R.layout.spinner_layout);
                            break;

                        case "Libya":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_liberia_states, R.layout.spinner_layout);
                            break;

                        case "Liechtenstein":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_liechtenstein_states, R.layout.spinner_layout);
                            break;

                        case "Lithuania":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_lithuania_states, R.layout.spinner_layout);
                            break;

                        case "Luxembourg":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_luxembourg_states, R.layout.spinner_layout);
                            break;

                        case "Macau":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_macau_states, R.layout.spinner_layout);
                            break;

                        case "Madagascar":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_madagascar_states, R.layout.spinner_layout);
                            break;

                        case "Malawi":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_malawi_states, R.layout.spinner_layout);
                            break;

                        case "Malaysia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_malaysia_states, R.layout.spinner_layout);
                            break;

                        case "Maldives":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_maldives_states, R.layout.spinner_layout);
                            break;

                        case "Mali":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_mali_states, R.layout.spinner_layout);
                            break;

                        case "Malta":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_malta_states, R.layout.spinner_layout);
                            break;

                        case "Marshall Islands":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_marshall_island_states, R.layout.spinner_layout);
                            break;

                        case "Martinique":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_martinique_states, R.layout.spinner_layout);
                            break;

                        case "Mauritania":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_mauritania_states, R.layout.spinner_layout);
                            break;

                        case "Mauritius":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_mauritius_states, R.layout.spinner_layout);
                            break;

                        case "Mayotte":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_mayotte_states, R.layout.spinner_layout);
                            break;

                        case "Mexico":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_mexico_states, R.layout.spinner_layout);
                            break;

                        case "Micronesia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_micronesia_states, R.layout.spinner_layout);
                            break;

                        case "Moldova":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_moldova_states, R.layout.spinner_layout);
                            break;

                        case "Monaco":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_monaco_states, R.layout.spinner_layout);
                            break;

                        case "Mongolia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_mongolia_states, R.layout.spinner_layout);
                            break;

                        case "Montenegro":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_montenegro_states, R.layout.spinner_layout);
                            break;

                        case "Montserrat":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_montserrat_states, R.layout.spinner_layout);
                            break;

                        case "Morocco":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_morocco_states, R.layout.spinner_layout);
                            break;

                        case "Mozambique":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_mozambique_states, R.layout.spinner_layout);
                            break;

                        case "Myanmar":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_myanmar_states, R.layout.spinner_layout);
                            break;

                        case "Namibia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_namibia_states, R.layout.spinner_layout);
                            break;

                        case "Nauru":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_nauru_states, R.layout.spinner_layout);
                            break;

                        case "Nepal":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_nepal_states, R.layout.spinner_layout);
                            break;

                        case "Netherlands":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_netherlands_states, R.layout.spinner_layout);
                            break;

                        case "Netherlands Antilles":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_netherlands_antilles_states, R.layout.spinner_layout);
                            break;

                        case "New Caledonia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_new_caledonia_states, R.layout.spinner_layout);
                            break;

                        case "New Zealand":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_new_zealand_states, R.layout.spinner_layout);
                            break;

                        case "Nicaragua":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_nicaragua_states, R.layout.spinner_layout);
                            break;

                        case "Niger":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_niger_states, R.layout.spinner_layout);
                            break;

                        case "Nigeria":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_nigeria_states, R.layout.spinner_layout);
                            break;

                        case "Niue":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_niue_states, R.layout.spinner_layout);
                            break;

                        case "Norfolk Island":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_norfolk_island_states, R.layout.spinner_layout);
                            break;

                        case "North Korea":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_north_korea_states, R.layout.spinner_layout);
                            break;

                        case "Northern Marianas":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_northern_marianas_states, R.layout.spinner_layout);
                            break;

                        case "Norway":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_norway_states, R.layout.spinner_layout);
                            break;

                        case "Oman":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_oman_states, R.layout.spinner_layout);
                            break;

                        case "Pakistan":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_pakistan_states, R.layout.spinner_layout);
                            break;

                        case "Palau":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_palau_states, R.layout.spinner_layout);
                            break;

                        case "Panama":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_panama_states, R.layout.spinner_layout);
                            break;

                        case "Papua New Guinea":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_papua_new_guinea_states, R.layout.spinner_layout);
                            break;

                        case "Paraguay":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_paraguay_states, R.layout.spinner_layout);
                            break;

                        case "Peru":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_peru_states, R.layout.spinner_layout);
                            break;

                        case "Philippines":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_philippines_states, R.layout.spinner_layout);
                            break;

                        case "Pitcairn Islands":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_pitcairn_islands_states, R.layout.spinner_layout);
                            break;

                        case "Poland":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_poland_states, R.layout.spinner_layout);
                            break;

                        case "Portugal":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_portugal_states, R.layout.spinner_layout);
                            break;

                        case "Puerto Rico":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_puerto_rico_states, R.layout.spinner_layout);
                            break;

                        case "Qatar":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_qatar_states, R.layout.spinner_layout);
                            break;

                        case "Reunion":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_reunion_states, R.layout.spinner_layout);
                            break;

                        case "Romania":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_romania_states, R.layout.spinner_layout);
                            break;

                        case "Russia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_russia_states, R.layout.spinner_layout);
                            break;

                        case "Rwanda":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_rwanda_states, R.layout.spinner_layout);
                            break;

                        case "Sqo Tome and Principe":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_sqo_tome_principe_states, R.layout.spinner_layout);
                            break;

                        case "Saint Helena":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_saint_helena_states, R.layout.spinner_layout);
                            break;

                        case "Saint Kitts and Nevis":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_saint_kitts_nevis_states, R.layout.spinner_layout);
                            break;

                        case "Saint Lucia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_saint_lucia_states, R.layout.spinner_layout);
                            break;

                        case "Saint Pierre and Miquelon":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_saint_pierra_miquelon_states, R.layout.spinner_layout);
                            break;

                        case "Saint Vincent and the Grenadines":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_saint_vincent_grenadines_states, R.layout.spinner_layout);
                            break;

                        case "Samoa":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_samoa_states, R.layout.spinner_layout);
                            break;

                        case "San Marino":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_san_marino_states, R.layout.spinner_layout);
                            break;

                        case "Saudi Arabia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_saudi_arabia_states, R.layout.spinner_layout);
                            break;

                        case "Senegal":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_senegal_states, R.layout.spinner_layout);
                            break;

                        case "Serbia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_serbia_states, R.layout.spinner_layout);
                            break;

                        case "Seychelles":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_seychelles_states, R.layout.spinner_layout);
                            break;

                        case "Sierra Leone":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_sierra_leone_states, R.layout.spinner_layout);
                            break;

                        case "Singapore":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_singapore_states, R.layout.spinner_layout);
                            break;

                        case "Slovakia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_slovakia_states, R.layout.spinner_layout);
                            break;

                        case "Slovenia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_slovenia_states, R.layout.spinner_layout);
                            break;

                        case "Solomon Islands":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_solomon_islands_states, R.layout.spinner_layout);
                            break;

                        case "Somalia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_somalia_states, R.layout.spinner_layout);
                            break;

                        case "South Africa":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_south_africa_states, R.layout.spinner_layout);
                            break;

                        case "South Georgia and the South Sandwich Islands":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_south_georgia_south_sandwich_states, R.layout.spinner_layout);
                            break;

                        case "South Korea":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_south_korea_states, R.layout.spinner_layout);
                            break;

                        case "South Sudan":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_south_sudan_states, R.layout.spinner_layout);
                            break;

                        case "Spain":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_spain_states, R.layout.spinner_layout);
                            break;

                        case "Sri Lanka":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_sri_lanka_states, R.layout.spinner_layout);
                            break;

                        case "Sudan":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_sudan_states, R.layout.spinner_layout);
                            break;

                        case "Suriname":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_suriname_states, R.layout.spinner_layout);
                            break;

                        case "Svalbard and Jan Mayen":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_svalbard_jan_mayen_states, R.layout.spinner_layout);
                            break;

                        case "Swaziland":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_swaziland_states, R.layout.spinner_layout);
                            break;

                        case "Sweden":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_sweden_states, R.layout.spinner_layout);
                            break;

                        case "Switzerland":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_switzerland_states, R.layout.spinner_layout);
                            break;

                        case "Syria":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_syria_states, R.layout.spinner_layout);
                            break;

                        case "Taiwan":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_taiwan_states, R.layout.spinner_layout);
                            break;

                        case "Tajikistan":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_tajikistan_states, R.layout.spinner_layout);
                            break;

                        case "Tanzania":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_tanzania_states, R.layout.spinner_layout);
                            break;

                        case "Thailand":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_thailand_states, R.layout.spinner_layout);
                            break;

                        case "The Bahamas":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_the_bahamas_states, R.layout.spinner_layout);
                            break;

                        case "The Gambia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_the_gambia_states, R.layout.spinner_layout);
                            break;

                        case "Togo":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_togo_states, R.layout.spinner_layout);
                            break;

                        case "Tokelau":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_tokelau_states, R.layout.spinner_layout);
                            break;

                        case "Tonga":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_tonga_states, R.layout.spinner_layout);
                            break;

                        case "Trinidad and Tobago":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_trinidad_and_tobago_states, R.layout.spinner_layout);
                            break;

                        case "Tunisia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_tunisia_states, R.layout.spinner_layout);
                            break;

                        case "Turkey":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_turkey_states, R.layout.spinner_layout);
                            break;

                        case "Turkmenistan":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_turkmenistan_states, R.layout.spinner_layout);
                            break;

                        case "Turks and Caicos Islands":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_turks_caicos_islands_states, R.layout.spinner_layout);
                            break;

                        case "Tuvalu":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_tuvalu_states, R.layout.spinner_layout);
                            break;

                        case "Virgin Islands":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_virgin_islands_states, R.layout.spinner_layout);
                            break;

                        case "Uganda":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_uganda_states, R.layout.spinner_layout);
                            break;

                        case "Ukraine":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_ukraine_states, R.layout.spinner_layout);
                            break;

                        case "United Arab Emirates":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_uae_states, R.layout.spinner_layout);
                            break;

                        case "United Kingdom":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_uk_states, R.layout.spinner_layout);
                            break;

                        case "United States of America":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_usa_states, R.layout.spinner_layout);
                            break;

                        case "United States Minor Outlying Islands":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_usmoi_states, R.layout.spinner_layout);
                            break;

                        case "Uruguay":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_uruguay_states, R.layout.spinner_layout);
                            break;

                        case "Uzbekistan":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_uzbekistan_states, R.layout.spinner_layout);
                            break;

                        case "Vanuatu":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_vanuatu_states, R.layout.spinner_layout);
                            break;

                        case "Vatican City":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_vatican_city_states, R.layout.spinner_layout);
                            break;

                        case "Venezuela":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_venenzuela_states, R.layout.spinner_layout);
                            break;

                        case "Vietnam":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_vietnam_states, R.layout.spinner_layout);
                            break;

                        case "Wallis and Futuna":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_wallis_and_futuna_states, R.layout.spinner_layout);
                            break;

                        case "Western Sahara":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_western_sahara_states, R.layout.spinner_layout);
                            break;

                        case "Yemen":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_yemen_states, R.layout.spinner_layout);
                            break;

                        case "Yugoslavia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_yugoslavia_states, R.layout.spinner_layout);
                            break;

                        case "Zambia":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_zambia_states, R.layout.spinner_layout);
                            break;

                        case "Zimbabwe":
                            stateAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_zimbabwe_states, R.layout.spinner_layout);
                            break;

                        default:
                            break;
                    }
                    stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    stateSpinner.setAdapter(stateAdapter);

                    stateSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            selectedState = stateSpinner.getSelectedItem().toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button submitButton;
        submitButton = findViewById(R.id.button_submit);
        tvCountrySpinner = findViewById(R.id.textView_countries);
        tvStateSpinner = findViewById(R.id.textView_states);

        submitButton.setOnClickListener(v -> {
            if (selectedCountry.equals("Select Your Country")) {
                Toast.makeText(MainActivity.this, "Please select your country from the list", Toast.LENGTH_LONG).show();
                tvCountrySpinner.setError("Country is required!");
                tvCountrySpinner.requestFocus();
            } else if (selectedState.equals("Select Your State")) {
                Toast.makeText(MainActivity.this, "Please select your country from the list", Toast.LENGTH_LONG).show();
                tvStateSpinner.setError("State is required!");
                tvStateSpinner.requestFocus();
                tvCountrySpinner.setError(null);
            } else {
                tvCountrySpinner.setError(null);
                tvStateSpinner.setError(null);
                Toast.makeText(MainActivity.this, "Selected Country: " + selectedCountry + "\nSelected State: " + selectedState, Toast.LENGTH_LONG).show();
            }
        });
    }
}