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

package io.cloudshiftdev.awscdkdsl.services.pinpointemail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps

/**
 * Properties for defining a `CfnConfigurationSet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpointemail.*;
 * CfnConfigurationSetProps cfnConfigurationSetProps = CfnConfigurationSetProps.builder()
 * .name("name")
 * // the properties below are optional
 * .deliveryOptions(DeliveryOptionsProperty.builder()
 * .sendingPoolName("sendingPoolName")
 * .build())
 * .reputationOptions(ReputationOptionsProperty.builder()
 * .reputationMetricsEnabled(false)
 * .build())
 * .sendingOptions(SendingOptionsProperty.builder()
 * .sendingEnabled(false)
 * .build())
 * .tags(List.of(TagsProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .trackingOptions(TrackingOptionsProperty.builder()
 * .customRedirectDomain("customRedirectDomain")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html)
 */
@CdkDslMarker
public class CfnConfigurationSetPropsDsl {
    private val cdkBuilder: CfnConfigurationSetProps.Builder = CfnConfigurationSetProps.builder()

    private val _tags: MutableList<CfnConfigurationSet.TagsProperty> = mutableListOf()

    /**
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     *   emails that you send using the configuration set.
     */
    public fun deliveryOptions(deliveryOptions: IResolvable) {
        cdkBuilder.deliveryOptions(deliveryOptions)
    }

    /**
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     *   emails that you send using the configuration set.
     */
    public fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty) {
        cdkBuilder.deliveryOptions(deliveryOptions)
    }

    /** @param name The name of the configuration set. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     *   reputation metrics for the emails that you send that use the configuration set.
     */
    public fun reputationOptions(reputationOptions: IResolvable) {
        cdkBuilder.reputationOptions(reputationOptions)
    }

    /**
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     *   reputation metrics for the emails that you send that use the configuration set.
     */
    public fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty) {
        cdkBuilder.reputationOptions(reputationOptions)
    }

    /**
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     *   that you send using the configuration set.
     */
    public fun sendingOptions(sendingOptions: IResolvable) {
        cdkBuilder.sendingOptions(sendingOptions)
    }

    /**
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     *   that you send using the configuration set.
     */
    public fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty) {
        cdkBuilder.sendingOptions(sendingOptions)
    }

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     *   the configuration set.
     */
    public fun tags(tags: CfnConfigurationSetTagsPropertyDsl.() -> Unit) {
        _tags.add(CfnConfigurationSetTagsPropertyDsl().apply(tags).build())
    }

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     *   the configuration set.
     */
    public fun tags(tags: Collection<CfnConfigurationSet.TagsProperty>) {
        _tags.addAll(tags)
    }

    /**
     * @param trackingOptions An object that defines the open and click tracking options for emails
     *   that you send using the configuration set.
     */
    public fun trackingOptions(trackingOptions: IResolvable) {
        cdkBuilder.trackingOptions(trackingOptions)
    }

    /**
     * @param trackingOptions An object that defines the open and click tracking options for emails
     *   that you send using the configuration set.
     */
    public fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty) {
        cdkBuilder.trackingOptions(trackingOptions)
    }

    public fun build(): CfnConfigurationSetProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
