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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnWorkteam
import kotlin.String

@CdkDslMarker
public class CfnWorkteamNotificationConfigurationPropertyDsl {
    private val cdkBuilder: CfnWorkteam.NotificationConfigurationProperty.Builder =
        CfnWorkteam.NotificationConfigurationProperty.builder()

    public fun notificationTopicArn(notificationTopicArn: String) {
        cdkBuilder.notificationTopicArn(notificationTopicArn)
    }

    public fun build(): CfnWorkteam.NotificationConfigurationProperty = cdkBuilder.build()
}
