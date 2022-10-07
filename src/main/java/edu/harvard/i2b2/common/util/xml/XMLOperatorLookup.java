/** *****************************************************************************
 * Copyright (c) 2006-2018 Massachusetts General Hospital
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. I2b2 is also distributed under
 * the terms of the Healthcare Disclaimer.
 ***************************************************************************** */
package edu.harvard.i2b2.common.util.xml;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rkuttan
 *
 */
public class XMLOperatorLookup {

    static Map<String, String> operatorMap = new HashMap<String, String>();

    static {
        operatorMap.put("GE", ">=");
        operatorMap.put("GT", ">");
        operatorMap.put("LT", "<");
        operatorMap.put("LE", "<=");
        operatorMap.put("EQ", "=");
        operatorMap.put("NE", "<>");
    }

    public static String getComparisonOperatorFromAcronum(String operatorAcronym) {
        if (operatorAcronym == null) {
            return null;
        }
        String comparisonOperator = operatorMap.get(operatorAcronym.toUpperCase());
        return comparisonOperator;
    }
}