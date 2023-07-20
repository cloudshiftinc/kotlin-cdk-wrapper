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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps

@CdkDslMarker
public class CfnNotificationChannelPropsDsl {
    private val cdkBuilder: CfnNotificationChannelProps.Builder =
        CfnNotificationChannelProps.builder()

    public fun config(config: IResolvable) {
        cdkBuilder.config(config)
    }

    public fun config(config: CfnNotificationChannel.NotificationChannelConfigProperty) {
        cdkBuilder.config(config)
    }

    public fun build(): CfnNotificationChannelProps = cdkBuilder.build()
}
