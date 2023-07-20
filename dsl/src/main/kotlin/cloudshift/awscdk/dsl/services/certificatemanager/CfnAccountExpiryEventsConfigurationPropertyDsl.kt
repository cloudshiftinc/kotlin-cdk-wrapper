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

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.certificatemanager.CfnAccount
import kotlin.Number

@CdkDslMarker
public class CfnAccountExpiryEventsConfigurationPropertyDsl {
    private val cdkBuilder: CfnAccount.ExpiryEventsConfigurationProperty.Builder =
        CfnAccount.ExpiryEventsConfigurationProperty.builder()

    public fun daysBeforeExpiry(daysBeforeExpiry: Number) {
        cdkBuilder.daysBeforeExpiry(daysBeforeExpiry)
    }

    public fun build(): CfnAccount.ExpiryEventsConfigurationProperty = cdkBuilder.build()
}
