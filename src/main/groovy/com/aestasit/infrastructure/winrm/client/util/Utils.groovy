/*
 * Copyright (C) 2011-2014 Aestas/IT
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aestasit.infrastructure.winrm.client.util

import com.aestasit.infrastructure.winrm.WinRMException
/**
 * Help methods
 *
 * @author Sergey Korenko
 */
class Utils {
  static URL buildUrl(String scheme, String address, int port) {
    try {
      new URL(scheme, address, port, "/wsman")
    } catch (MalformedURLException e) {
      throw new WinRMException("Invalid winrm url", e)
    }
  }

  static String composeUUID() {
    "uuid:" + UUID.randomUUID().toString().toUpperCase();
  }
}