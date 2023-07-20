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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnTopicRule
import kotlin.String

@CdkDslMarker
public class CfnTopicRuleLambdaActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.LambdaActionProperty.Builder =
        CfnTopicRule.LambdaActionProperty.builder()

    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    public fun build(): CfnTopicRule.LambdaActionProperty = cdkBuilder.build()
}
