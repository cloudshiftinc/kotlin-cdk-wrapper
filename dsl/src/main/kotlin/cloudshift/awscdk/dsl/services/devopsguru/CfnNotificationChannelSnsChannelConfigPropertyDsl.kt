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

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel
import kotlin.String

@CdkDslMarker
public class CfnNotificationChannelSnsChannelConfigPropertyDsl {
    private val cdkBuilder: CfnNotificationChannel.SnsChannelConfigProperty.Builder =
        CfnNotificationChannel.SnsChannelConfigProperty.builder()

    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): CfnNotificationChannel.SnsChannelConfigProperty = cdkBuilder.build()
}
