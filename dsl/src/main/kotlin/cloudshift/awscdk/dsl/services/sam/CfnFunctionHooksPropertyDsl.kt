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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionHooksPropertyDsl {
    private val cdkBuilder: CfnFunction.HooksProperty.Builder = CfnFunction.HooksProperty.builder()

    public fun postTraffic(postTraffic: String) {
        cdkBuilder.postTraffic(postTraffic)
    }

    public fun preTraffic(preTraffic: String) {
        cdkBuilder.preTraffic(preTraffic)
    }

    public fun build(): CfnFunction.HooksProperty = cdkBuilder.build()
}
