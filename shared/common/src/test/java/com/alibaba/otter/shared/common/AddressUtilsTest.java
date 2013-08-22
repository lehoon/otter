/*
 * Copyright (C) 2010-2101 Alibaba Group Holding Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.otter.shared.common;

import java.net.InetAddress;

import org.testng.annotations.Test;

import com.alibaba.otter.shared.common.utils.AddressUtils;

public class AddressUtilsTest extends BaseOtterTest {

    @Test
    public void testHostIp() {
        InetAddress address = AddressUtils.getHostAddress();
        want.bool(address.isLoopbackAddress()).is(false);

        // want.bool(AddressUtils.isHostIp("10.12.48.171")).is(true);
    }

    @Test
    public void testPort() {
        want.bool(AddressUtils.isAvailablePort(23)).is(false);
    }

}
