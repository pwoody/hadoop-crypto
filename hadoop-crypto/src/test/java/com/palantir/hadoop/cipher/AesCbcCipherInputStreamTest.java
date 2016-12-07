/*
 * Copyright 2016 Palantir Technologies, Inc. All rights reserved.
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

package com.palantir.hadoop.cipher;

import com.palantir.crypto.KeyMaterial;
import com.palantir.crypto.cipher.AesCbcCipher;
import com.palantir.crypto.cipher.SeekableCipher;

public final class AesCbcCipherInputStreamTest extends AbstractFsCipherInputStreamTest {

    @Override
    SeekableCipher getSeekableCipher() {
        KeyMaterial keyMaterial = AesCbcCipher.generateKeyMaterial();
        return new AesCbcCipher(keyMaterial);
    }

}
