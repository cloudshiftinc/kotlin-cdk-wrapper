@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnResourceSignal
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnResourceSignalDsl {
    private val cdkBuilder: CfnResourceSignal.Builder = CfnResourceSignal.builder()

    public fun count(count: Number) {
        cdkBuilder.count(count)
    }

    public fun timeout(timeout: String) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): CfnResourceSignal = cdkBuilder.build()
}
