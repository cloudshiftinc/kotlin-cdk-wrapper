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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnTopicRuleIotEventsActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.IotEventsActionProperty.Builder =
        CfnTopicRule.IotEventsActionProperty.builder()

    public fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
    }

    public fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode)
    }

    public fun inputName(inputName: String) {
        cdkBuilder.inputName(inputName)
    }

    public fun messageId(messageId: String) {
        cdkBuilder.messageId(messageId)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnTopicRule.IotEventsActionProperty = cdkBuilder.build()
}
