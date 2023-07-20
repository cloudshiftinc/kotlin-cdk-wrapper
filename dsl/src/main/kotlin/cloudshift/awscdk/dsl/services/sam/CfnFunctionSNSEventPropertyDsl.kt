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
public class CfnFunctionSNSEventPropertyDsl {
    private val cdkBuilder: CfnFunction.SNSEventProperty.Builder =
        CfnFunction.SNSEventProperty.builder()

    public fun topic(topic: String) {
        cdkBuilder.topic(topic)
    }

    public fun build(): CfnFunction.SNSEventProperty = cdkBuilder.build()
}
