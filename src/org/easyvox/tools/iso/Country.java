/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *  ISO-3166 Country Codes
 *  ISO-639 Language Codes
 *  ISO 8601 Time Zone
 */
package org.easyvox.tools.iso;

import java.util.HashMap;

/**
 *
 * @author ecrispin
 */
public class Country {
    
private static final HashMap<String, String> country2telecomPrefix = new HashMap<>();

    /**
     *
     * @param iso2CountryCode
     * @return
     */
    public String telecomPrefix(String iso2CountryCode) {
        String result = country2telecomPrefix.get(iso2CountryCode);
        if (result == null) {
            throw new IllegalArgumentException("Unknown country code " + iso2CountryCode);
        }
    return result;
}

    /**
     *
     * @return
     */
    public HashMap<String, String> telecomPrefix(){
    return country2telecomPrefix;
}

    static {
    country2telecomPrefix.put("AC", "+247");
    country2telecomPrefix.put("AD", "+376");
    country2telecomPrefix.put("AE", "+971");
    country2telecomPrefix.put("AF", "+93");
    country2telecomPrefix.put("AG", "+1-268");
    country2telecomPrefix.put("AI", "+1-264");
    country2telecomPrefix.put("AL", "+355");
    country2telecomPrefix.put("AM", "+374");
    country2telecomPrefix.put("AN", "+599");
    country2telecomPrefix.put("AO", "+244");
    country2telecomPrefix.put("AR", "+54");
    country2telecomPrefix.put("AS", "+1-684");
    country2telecomPrefix.put("AT", "+43");
    country2telecomPrefix.put("AU", "+61");
    country2telecomPrefix.put("AW", "+297");
    country2telecomPrefix.put("AX", "+358-18");
    country2telecomPrefix.put("AZ", "+374-97");
    country2telecomPrefix.put("AZ", "+994");
    country2telecomPrefix.put("BA", "+387");
    country2telecomPrefix.put("BB", "+1-246");
    country2telecomPrefix.put("BD", "+880");
    country2telecomPrefix.put("BE", "+32");
    country2telecomPrefix.put("BF", "+226");
    country2telecomPrefix.put("BG", "+359");
    country2telecomPrefix.put("BH", "+973");
    country2telecomPrefix.put("BI", "+257");
    country2telecomPrefix.put("BJ", "+229");
    country2telecomPrefix.put("BM", "+1-441");
    country2telecomPrefix.put("BN", "+673");
    country2telecomPrefix.put("BO", "+591");
    country2telecomPrefix.put("BR", "+55");
    country2telecomPrefix.put("BS", "+1-242");
    country2telecomPrefix.put("BT", "+975");
    country2telecomPrefix.put("BW", "+267");
    country2telecomPrefix.put("BY", "+375");
    country2telecomPrefix.put("BZ", "+501");
    country2telecomPrefix.put("CA", "+1");
    country2telecomPrefix.put("CC", "+61");
    country2telecomPrefix.put("CD", "+243");
    country2telecomPrefix.put("CF", "+236");
    country2telecomPrefix.put("CG", "+242");
    country2telecomPrefix.put("CH", "+41");
    country2telecomPrefix.put("CI", "+225");
    country2telecomPrefix.put("CK", "+682");
    country2telecomPrefix.put("CL", "+56");
    country2telecomPrefix.put("CM", "+237");
    country2telecomPrefix.put("CN", "+86");
    country2telecomPrefix.put("CO", "+57");
    country2telecomPrefix.put("CR", "+506");
    country2telecomPrefix.put("CS", "+381");
    country2telecomPrefix.put("CU", "+53");
    country2telecomPrefix.put("CV", "+238");
    country2telecomPrefix.put("CX", "+61");
    country2telecomPrefix.put("CY", "+90-392");
    country2telecomPrefix.put("CY", "+357");
    country2telecomPrefix.put("CZ", "+420");
    country2telecomPrefix.put("DE", "+49");
    country2telecomPrefix.put("DJ", "+253");
    country2telecomPrefix.put("DK", "+45");
    country2telecomPrefix.put("DM", "+1-767");
    country2telecomPrefix.put("DO", "+1-809"); // and 1-829?
    country2telecomPrefix.put("DZ", "+213");
    country2telecomPrefix.put("EC", "+593");
    country2telecomPrefix.put("EE", "+372");
    country2telecomPrefix.put("EG", "+20");
    country2telecomPrefix.put("EH", "+212");
    country2telecomPrefix.put("ER", "+291");
    country2telecomPrefix.put("ES", "+34");
    country2telecomPrefix.put("ET", "+251");
    country2telecomPrefix.put("FI", "+358");
    country2telecomPrefix.put("FJ", "+679");
    country2telecomPrefix.put("FK", "+500");
    country2telecomPrefix.put("FM", "+691");
    country2telecomPrefix.put("FO", "+298");
    country2telecomPrefix.put("FR", "+33");
    country2telecomPrefix.put("GA", "+241");
    country2telecomPrefix.put("GB", "+44");
    country2telecomPrefix.put("GD", "+1-473");
    country2telecomPrefix.put("GE", "+995");
    country2telecomPrefix.put("GF", "+594");
    country2telecomPrefix.put("GG", "+44");
    country2telecomPrefix.put("GH", "+233");
    country2telecomPrefix.put("GI", "+350");
    country2telecomPrefix.put("GL", "+299");
    country2telecomPrefix.put("GM", "+220");
    country2telecomPrefix.put("GN", "+224");
    country2telecomPrefix.put("GP", "+590");
    country2telecomPrefix.put("GQ", "+240");
    country2telecomPrefix.put("GR", "+30");
    country2telecomPrefix.put("GT", "+502");
    country2telecomPrefix.put("GU", "+1-671");
    country2telecomPrefix.put("GW", "+245");
    country2telecomPrefix.put("GY", "+592");
    country2telecomPrefix.put("HK", "+852");
    country2telecomPrefix.put("HN", "+504");
    country2telecomPrefix.put("HR", "+385");
    country2telecomPrefix.put("HT", "+509");
    country2telecomPrefix.put("HU", "+36");
    country2telecomPrefix.put("ID", "+62");
    country2telecomPrefix.put("IE", "+353");
    country2telecomPrefix.put("IL", "+972");
    country2telecomPrefix.put("IM", "+44");
    country2telecomPrefix.put("IN", "+91");
    country2telecomPrefix.put("IO", "+246");
    country2telecomPrefix.put("IQ", "+964");
    country2telecomPrefix.put("IR", "+98");
    country2telecomPrefix.put("IS", "+354");
    country2telecomPrefix.put("IT", "+39");
    country2telecomPrefix.put("JE", "+44");
    country2telecomPrefix.put("JM", "+1-876");
    country2telecomPrefix.put("JO", "+962");
    country2telecomPrefix.put("JP", "+81");
    country2telecomPrefix.put("KE", "+254");
    country2telecomPrefix.put("KG", "+996");
    country2telecomPrefix.put("KH", "+855");
    country2telecomPrefix.put("KI", "+686");
    country2telecomPrefix.put("KM", "+269");
    country2telecomPrefix.put("KN", "+1-869");
    country2telecomPrefix.put("KP", "+850");
    country2telecomPrefix.put("KR", "+82");
    country2telecomPrefix.put("KW", "+965");
    country2telecomPrefix.put("KY", "+1-345");
    country2telecomPrefix.put("KZ", "+7");
    country2telecomPrefix.put("LA", "+856");
    country2telecomPrefix.put("LB", "+961");
    country2telecomPrefix.put("LC", "+1-758");
    country2telecomPrefix.put("LI", "+423");
    country2telecomPrefix.put("LK", "+94");
    country2telecomPrefix.put("LR", "+231");
    country2telecomPrefix.put("LS", "+266");
    country2telecomPrefix.put("LT", "+370");
    country2telecomPrefix.put("LU", "+352");
    country2telecomPrefix.put("LV", "+371");
    country2telecomPrefix.put("LY", "+218");
    country2telecomPrefix.put("MA", "+212");
    country2telecomPrefix.put("MC", "+377");
    country2telecomPrefix.put("MD", "+373-533");
    country2telecomPrefix.put("MD", "+373");
    country2telecomPrefix.put("ME", "+382");
    country2telecomPrefix.put("MG", "+261");
    country2telecomPrefix.put("MH", "+692");
    country2telecomPrefix.put("MK", "+389");
    country2telecomPrefix.put("ML", "+223");
    country2telecomPrefix.put("MM", "+95");
    country2telecomPrefix.put("MN", "+976");
    country2telecomPrefix.put("MO", "+853");
    country2telecomPrefix.put("MP", "+1-670");
    country2telecomPrefix.put("MQ", "+596");
    country2telecomPrefix.put("MR", "+222");
    country2telecomPrefix.put("MS", "+1-664");
    country2telecomPrefix.put("MT", "+356");
    country2telecomPrefix.put("MU", "+230");
    country2telecomPrefix.put("MV", "+960");
    country2telecomPrefix.put("MW", "+265");
    country2telecomPrefix.put("MX", "+52");
    country2telecomPrefix.put("MY", "+60");
    country2telecomPrefix.put("MZ", "+258");
    country2telecomPrefix.put("NA", "+264");
    country2telecomPrefix.put("NC", "+687");
    country2telecomPrefix.put("NE", "+227");
    country2telecomPrefix.put("NF", "+672");
    country2telecomPrefix.put("NG", "+234");
    country2telecomPrefix.put("NI", "+505");
    country2telecomPrefix.put("NL", "+31");
    country2telecomPrefix.put("NO", "+47");
    country2telecomPrefix.put("NP", "+977");
    country2telecomPrefix.put("NR", "+674");
    country2telecomPrefix.put("NU", "+683");
    country2telecomPrefix.put("NZ", "+64");
    country2telecomPrefix.put("OM", "+968");
    country2telecomPrefix.put("PA", "+507");
    country2telecomPrefix.put("PE", "+51");
    country2telecomPrefix.put("PF", "+689");
    country2telecomPrefix.put("PG", "+675");
    country2telecomPrefix.put("PH", "+63");
    country2telecomPrefix.put("PK", "+92");
    country2telecomPrefix.put("PL", "+48");
    country2telecomPrefix.put("PM", "+508");
    country2telecomPrefix.put("PR", "+1-787"); // and 1-939 ?
    country2telecomPrefix.put("PS", "+970");
    country2telecomPrefix.put("PT", "+351");
    country2telecomPrefix.put("PW", "+680");
    country2telecomPrefix.put("PY", "+595");
    country2telecomPrefix.put("QA", "+974");
    country2telecomPrefix.put("RE", "+262");
    country2telecomPrefix.put("RO", "+40");
    country2telecomPrefix.put("RS", "+381");
    country2telecomPrefix.put("RU", "+7");
    country2telecomPrefix.put("RW", "+250");
    country2telecomPrefix.put("SA", "+966");
    country2telecomPrefix.put("SB", "+677");
    country2telecomPrefix.put("SC", "+248");
    country2telecomPrefix.put("SD", "+249");
    country2telecomPrefix.put("SE", "+46");
    country2telecomPrefix.put("SG", "+65");
    country2telecomPrefix.put("SH", "+290");
    country2telecomPrefix.put("SI", "+386");
    country2telecomPrefix.put("SJ", "+47");
    country2telecomPrefix.put("SK", "+421");
    country2telecomPrefix.put("SL", "+232");
    country2telecomPrefix.put("SM", "+378");
    country2telecomPrefix.put("SN", "+221");
    country2telecomPrefix.put("SO", "+252");
    country2telecomPrefix.put("SO", "+252");
    country2telecomPrefix.put("SR", "+597");
    country2telecomPrefix.put("ST", "+239");
    country2telecomPrefix.put("SV", "+503");
    country2telecomPrefix.put("SY", "+963");
    country2telecomPrefix.put("SZ", "+268");
    country2telecomPrefix.put("TA", "+290");
    country2telecomPrefix.put("TC", "+1-649");
    country2telecomPrefix.put("TD", "+235");
    country2telecomPrefix.put("TG", "+228");
    country2telecomPrefix.put("TH", "+66");
    country2telecomPrefix.put("TJ", "+992");
    country2telecomPrefix.put("TK", "+690");
    country2telecomPrefix.put("TL", "+670");
    country2telecomPrefix.put("TM", "+993");
    country2telecomPrefix.put("TN", "+216");
    country2telecomPrefix.put("TO", "+676");
    country2telecomPrefix.put("TR", "+90");
    country2telecomPrefix.put("TT", "+1-868");
    country2telecomPrefix.put("TV", "+688");
    country2telecomPrefix.put("TW", "+886");
    country2telecomPrefix.put("TZ", "+255");
    country2telecomPrefix.put("UA", "+380");
    country2telecomPrefix.put("UG", "+256");
    country2telecomPrefix.put("US", "+1");
    country2telecomPrefix.put("UY", "+598");
    country2telecomPrefix.put("UZ", "+998");
    country2telecomPrefix.put("VA", "+379");
    country2telecomPrefix.put("VC", "+1-784");
    country2telecomPrefix.put("VE", "+58");
    country2telecomPrefix.put("VG", "+1-284");
    country2telecomPrefix.put("VI", "+1-340");
    country2telecomPrefix.put("VN", "+84");
    country2telecomPrefix.put("VU", "+678");
    country2telecomPrefix.put("WF", "+681");
    country2telecomPrefix.put("WS", "+685");
    country2telecomPrefix.put("YE", "+967");
    country2telecomPrefix.put("YT", "+262");
    country2telecomPrefix.put("ZA", "+27");
    country2telecomPrefix.put("ZM", "+260");
    country2telecomPrefix.put("ZW", "+263");
}
    
}
