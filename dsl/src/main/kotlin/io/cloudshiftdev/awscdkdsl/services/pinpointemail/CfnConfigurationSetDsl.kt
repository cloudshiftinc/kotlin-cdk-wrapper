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
import software.constructs.Construct

/**
 * Create a configuration set.
 *
 * *Configuration sets* are groups of rules that you can apply to the emails you send using Amazon
 * Pinpoint. You apply a configuration set to an email by including a reference to the configuration
 * set in the headers of the email. When you apply a configuration set to an email, all of the rules
 * in that configuration set are applied to the email.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpointemail.*;
 * CfnConfigurationSet cfnConfigurationSet = CfnConfigurationSet.Builder.create(this,
 * "MyCfnConfigurationSet")
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
public class CfnConfigurationSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConfigurationSet.Builder =
        CfnConfigurationSet.Builder.create(scope, id)

    private val _tags: MutableList<CfnConfigurationSet.TagsProperty> = mutableListOf()

    /**
     * An object that defines the dedicated IP pool that is used to send emails that you send using
     * the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-deliveryoptions)
     *
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     *   emails that you send using the configuration set.
     */
    public fun deliveryOptions(deliveryOptions: IResolvable) {
        cdkBuilder.deliveryOptions(deliveryOptions)
    }

    /**
     * An object that defines the dedicated IP pool that is used to send emails that you send using
     * the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-deliveryoptions)
     *
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     *   emails that you send using the configuration set.
     */
    public fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty) {
        cdkBuilder.deliveryOptions(deliveryOptions)
    }

    /**
     * The name of the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-name)
     *
     * @param name The name of the configuration set.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the
     * emails that you send that use the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-reputationoptions)
     *
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     *   reputation metrics for the emails that you send that use the configuration set.
     */
    public fun reputationOptions(reputationOptions: IResolvable) {
        cdkBuilder.reputationOptions(reputationOptions)
    }

    /**
     * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the
     * emails that you send that use the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-reputationoptions)
     *
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     *   reputation metrics for the emails that you send that use the configuration set.
     */
    public fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty) {
        cdkBuilder.reputationOptions(reputationOptions)
    }

    /**
     * An object that defines whether or not Amazon Pinpoint can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-sendingoptions)
     *
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     *   that you send using the configuration set.
     */
    public fun sendingOptions(sendingOptions: IResolvable) {
        cdkBuilder.sendingOptions(sendingOptions)
    }

    /**
     * An object that defines whether or not Amazon Pinpoint can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-sendingoptions)
     *
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     *   that you send using the configuration set.
     */
    public fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty) {
        cdkBuilder.sendingOptions(sendingOptions)
    }

    /**
     * An object that defines the tags (keys and values) that you want to associate with the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-tags)
     *
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     *   the configuration set.
     */
    public fun tags(tags: CfnConfigurationSetTagsPropertyDsl.() -> Unit) {
        _tags.add(CfnConfigurationSetTagsPropertyDsl().apply(tags).build())
    }

    /**
     * An object that defines the tags (keys and values) that you want to associate with the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-tags)
     *
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     *   the configuration set.
     */
    public fun tags(tags: Collection<CfnConfigurationSet.TagsProperty>) {
        _tags.addAll(tags)
    }

    /**
     * An object that defines the open and click tracking options for emails that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-trackingoptions)
     *
     * @param trackingOptions An object that defines the open and click tracking options for emails
     *   that you send using the configuration set.
     */
    public fun trackingOptions(trackingOptions: IResolvable) {
        cdkBuilder.trackingOptions(trackingOptions)
    }

    /**
     * An object that defines the open and click tracking options for emails that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-trackingoptions)
     *
     * @param trackingOptions An object that defines the open and click tracking options for emails
     *   that you send using the configuration set.
     */
    public fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty) {
        cdkBuilder.trackingOptions(trackingOptions)
    }

    public fun build(): CfnConfigurationSet {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
