@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.certificatemanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.certificatemanager.CfnAccount

/**
 * Object containing expiration events options associated with an AWS account .
 *
 * For more information, see
 * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
 * in the API reference.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.certificatemanager.*;
 * ExpiryEventsConfigurationProperty expiryEventsConfigurationProperty =
 * ExpiryEventsConfigurationProperty.builder()
 * .daysBeforeExpiry(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-account-expiryeventsconfiguration.html)
 */
@CdkDslMarker
public class CfnAccountExpiryEventsConfigurationPropertyDsl {
    private val cdkBuilder: CfnAccount.ExpiryEventsConfigurationProperty.Builder =
        CfnAccount.ExpiryEventsConfigurationProperty.builder()

    /**
     * @param daysBeforeExpiry This option specifies the number of days prior to certificate
     *   expiration when ACM starts generating `EventBridge` events. ACM sends one event per day per
     *   certificate until the certificate expires. By default, accounts receive events starting 45
     *   days before certificate expiration.
     */
    public fun daysBeforeExpiry(daysBeforeExpiry: Number) {
        cdkBuilder.daysBeforeExpiry(daysBeforeExpiry)
    }

    public fun build(): CfnAccount.ExpiryEventsConfigurationProperty = cdkBuilder.build()
}
