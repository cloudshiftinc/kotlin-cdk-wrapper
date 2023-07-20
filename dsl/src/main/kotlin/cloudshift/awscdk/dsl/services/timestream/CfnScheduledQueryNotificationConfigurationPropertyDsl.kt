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

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@CdkDslMarker
public class CfnScheduledQueryNotificationConfigurationPropertyDsl {
    private val cdkBuilder: CfnScheduledQuery.NotificationConfigurationProperty.Builder =
        CfnScheduledQuery.NotificationConfigurationProperty.builder()

    public fun snsConfiguration(snsConfiguration: IResolvable) {
        cdkBuilder.snsConfiguration(snsConfiguration)
    }

    public fun snsConfiguration(snsConfiguration: CfnScheduledQuery.SnsConfigurationProperty) {
        cdkBuilder.snsConfiguration(snsConfiguration)
    }

    public fun build(): CfnScheduledQuery.NotificationConfigurationProperty = cdkBuilder.build()
}
