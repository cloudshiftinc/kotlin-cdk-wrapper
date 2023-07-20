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
public class CfnTopicRuleSnsActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.SnsActionProperty.Builder =
        CfnTopicRule.SnsActionProperty.builder()

    public fun messageFormat(messageFormat: String) {
        cdkBuilder.messageFormat(messageFormat)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CfnTopicRule.SnsActionProperty = cdkBuilder.build()
}
