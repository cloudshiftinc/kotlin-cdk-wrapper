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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnConfigurationSet
import software.amazon.awscdk.services.ses.CfnConfigurationSetProps

/**
 * Properties for defining a `CfnConfigurationSet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * CfnConfigurationSetProps cfnConfigurationSetProps = CfnConfigurationSetProps.builder()
 * .deliveryOptions(DeliveryOptionsProperty.builder()
 * .sendingPoolName("sendingPoolName")
 * .tlsPolicy("tlsPolicy")
 * .build())
 * .name("name")
 * .reputationOptions(ReputationOptionsProperty.builder()
 * .reputationMetricsEnabled(false)
 * .build())
 * .sendingOptions(SendingOptionsProperty.builder()
 * .sendingEnabled(false)
 * .build())
 * .suppressionOptions(SuppressionOptionsProperty.builder()
 * .suppressedReasons(List.of("suppressedReasons"))
 * .build())
 * .trackingOptions(TrackingOptionsProperty.builder()
 * .customRedirectDomain("customRedirectDomain")
 * .build())
 * .vdmOptions(VdmOptionsProperty.builder()
 * .dashboardOptions(DashboardOptionsProperty.builder()
 * .engagementMetrics("engagementMetrics")
 * .build())
 * .guardianOptions(GuardianOptionsProperty.builder()
 * .optimizedSharedDelivery("optimizedSharedDelivery")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html)
 */
@CdkDslMarker
public class CfnConfigurationSetPropsDsl {
    private val cdkBuilder: CfnConfigurationSetProps.Builder = CfnConfigurationSetProps.builder()

    /**
     * @param deliveryOptions Specifies whether messages that use the configuration set are required
     *   to use Transport Layer Security (TLS).
     */
    public fun deliveryOptions(deliveryOptions: IResolvable) {
        cdkBuilder.deliveryOptions(deliveryOptions)
    }

    /**
     * @param deliveryOptions Specifies whether messages that use the configuration set are required
     *   to use Transport Layer Security (TLS).
     */
    public fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty) {
        cdkBuilder.deliveryOptions(deliveryOptions)
    }

    /**
     * @param name The name of the configuration set. The name must meet the following
     *   requirements:.
     * * Contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * * Contain 64 characters or fewer.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param reputationOptions An object that represents the reputation settings for the
     *   configuration set.
     */
    public fun reputationOptions(reputationOptions: IResolvable) {
        cdkBuilder.reputationOptions(reputationOptions)
    }

    /**
     * @param reputationOptions An object that represents the reputation settings for the
     *   configuration set.
     */
    public fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty) {
        cdkBuilder.reputationOptions(reputationOptions)
    }

    /**
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that
     *   you send using the configuration set.
     */
    public fun sendingOptions(sendingOptions: IResolvable) {
        cdkBuilder.sendingOptions(sendingOptions)
    }

    /**
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that
     *   you send using the configuration set.
     */
    public fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty) {
        cdkBuilder.sendingOptions(sendingOptions)
    }

    /**
     * @param suppressionOptions An object that contains information about the suppression list
     *   preferences for your account.
     */
    public fun suppressionOptions(suppressionOptions: IResolvable) {
        cdkBuilder.suppressionOptions(suppressionOptions)
    }

    /**
     * @param suppressionOptions An object that contains information about the suppression list
     *   preferences for your account.
     */
    public fun suppressionOptions(
        suppressionOptions: CfnConfigurationSet.SuppressionOptionsProperty
    ) {
        cdkBuilder.suppressionOptions(suppressionOptions)
    }

    /**
     * @param trackingOptions The name of the custom open and click tracking domain associated with
     *   the configuration set.
     */
    public fun trackingOptions(trackingOptions: IResolvable) {
        cdkBuilder.trackingOptions(trackingOptions)
    }

    /**
     * @param trackingOptions The name of the custom open and click tracking domain associated with
     *   the configuration set.
     */
    public fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty) {
        cdkBuilder.trackingOptions(trackingOptions)
    }

    /**
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     *   configuration set.
     */
    public fun vdmOptions(vdmOptions: IResolvable) {
        cdkBuilder.vdmOptions(vdmOptions)
    }

    /**
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     *   configuration set.
     */
    public fun vdmOptions(vdmOptions: CfnConfigurationSet.VdmOptionsProperty) {
        cdkBuilder.vdmOptions(vdmOptions)
    }

    public fun build(): CfnConfigurationSetProps = cdkBuilder.build()
}
