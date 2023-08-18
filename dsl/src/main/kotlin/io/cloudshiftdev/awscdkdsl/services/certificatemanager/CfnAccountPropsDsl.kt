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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.certificatemanager.CfnAccount
import software.amazon.awscdk.services.certificatemanager.CfnAccountProps

/**
 * Properties for defining a `CfnAccount`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.certificatemanager.*;
 * CfnAccountProps cfnAccountProps = CfnAccountProps.builder()
 * .expiryEventsConfiguration(ExpiryEventsConfigurationProperty.builder()
 * .daysBeforeExpiry(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-account.html)
 */
@CdkDslMarker
public class CfnAccountPropsDsl {
    private val cdkBuilder: CfnAccountProps.Builder = CfnAccountProps.builder()

    /**
     * @param expiryEventsConfiguration Object containing expiration events options associated with
     *   an AWS account . For more information, see
     *   [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
     *   in the API reference.
     */
    public fun expiryEventsConfiguration(expiryEventsConfiguration: IResolvable) {
        cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration)
    }

    /**
     * @param expiryEventsConfiguration Object containing expiration events options associated with
     *   an AWS account . For more information, see
     *   [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
     *   in the API reference.
     */
    public fun expiryEventsConfiguration(
        expiryEventsConfiguration: CfnAccount.ExpiryEventsConfigurationProperty
    ) {
        cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration)
    }

    public fun build(): CfnAccountProps = cdkBuilder.build()
}
