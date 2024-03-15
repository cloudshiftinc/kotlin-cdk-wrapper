/*
 * Copyright 2023 the original author or authors.
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

package io.cloudshiftdev.awscdk.ext.core

import io.kotest.common.ExperimentalKotest
import io.kotest.core.config.AbstractProjectConfig
import kotlin.math.max
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds

class KotestConfig : AbstractProjectConfig() {

    override val parallelism: Int
        get() {
            val availableProcs = Runtime.getRuntime().availableProcessors()
            val ci = System.getenv("CI") != null
            return when (ci) {
                true -> availableProcs
                else -> max(availableProcs - 2, 2)
            }
        }

    @ExperimentalKotest override val concurrentSpecs: Int = 5

    @ExperimentalKotest override val concurrentTests: Int = 5

    override val timeout: Duration = 45.seconds
}
