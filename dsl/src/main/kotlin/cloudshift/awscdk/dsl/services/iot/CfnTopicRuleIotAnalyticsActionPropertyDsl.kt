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
public class CfnTopicRuleIotAnalyticsActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.IotAnalyticsActionProperty.Builder =
        CfnTopicRule.IotAnalyticsActionProperty.builder()

    public fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
    }

    public fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode)
    }

    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnTopicRule.IotAnalyticsActionProperty = cdkBuilder.build()
}
