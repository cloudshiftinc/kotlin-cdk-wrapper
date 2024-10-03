@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpointemail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a configuration set.
 *
 * *Configuration sets* are groups of rules that you can apply to the emails you send using Amazon
 * Pinpoint. You apply a configuration set to an email by including a reference to the configuration
 * set in the headers of the email. When you apply a configuration set to an email, all of the rules in
 * that configuration set are applied to the email.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpointemail.*;
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
 * .tags(List.of(CfnTag.builder()
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
public open class CfnConfigurationSet(
  cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationSetProps,
  ) :
      this(software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConfigurationSetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationSetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConfigurationSetProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * An object that defines the dedicated IP pool that is used to send emails that you send using
   * the configuration set.
   */
  public open fun deliveryOptions(): Any? = unwrap(this).getDeliveryOptions()

  /**
   * An object that defines the dedicated IP pool that is used to send emails that you send using
   * the configuration set.
   */
  public open fun deliveryOptions(`value`: IResolvable) {
    unwrap(this).setDeliveryOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that defines the dedicated IP pool that is used to send emails that you send using
   * the configuration set.
   */
  public open fun deliveryOptions(`value`: DeliveryOptionsProperty) {
    unwrap(this).setDeliveryOptions(`value`.let(DeliveryOptionsProperty.Companion::unwrap))
  }

  /**
   * An object that defines the dedicated IP pool that is used to send emails that you send using
   * the configuration set.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d696b86f9b64e27073d36b6ccd62589eaedf8e1aaabc012d4734668fe4845bad")
  public open fun deliveryOptions(`value`: DeliveryOptionsProperty.Builder.() -> Unit): Unit =
      deliveryOptions(DeliveryOptionsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the configuration set.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the configuration set.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the
   * emails that you send that use the configuration set.
   */
  public open fun reputationOptions(): Any? = unwrap(this).getReputationOptions()

  /**
   * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the
   * emails that you send that use the configuration set.
   */
  public open fun reputationOptions(`value`: IResolvable) {
    unwrap(this).setReputationOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the
   * emails that you send that use the configuration set.
   */
  public open fun reputationOptions(`value`: ReputationOptionsProperty) {
    unwrap(this).setReputationOptions(`value`.let(ReputationOptionsProperty.Companion::unwrap))
  }

  /**
   * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the
   * emails that you send that use the configuration set.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("de5f867ede2460fbe422a4cac1cb4b69fb8fbe348273b21a2f4381a43f9b7371")
  public open fun reputationOptions(`value`: ReputationOptionsProperty.Builder.() -> Unit): Unit =
      reputationOptions(ReputationOptionsProperty(`value`))

  /**
   * An object that defines whether or not Amazon Pinpoint can send email that you send using the
   * configuration set.
   */
  public open fun sendingOptions(): Any? = unwrap(this).getSendingOptions()

  /**
   * An object that defines whether or not Amazon Pinpoint can send email that you send using the
   * configuration set.
   */
  public open fun sendingOptions(`value`: IResolvable) {
    unwrap(this).setSendingOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that defines whether or not Amazon Pinpoint can send email that you send using the
   * configuration set.
   */
  public open fun sendingOptions(`value`: SendingOptionsProperty) {
    unwrap(this).setSendingOptions(`value`.let(SendingOptionsProperty.Companion::unwrap))
  }

  /**
   * An object that defines whether or not Amazon Pinpoint can send email that you send using the
   * configuration set.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1e2c939ba18db2115dc0e81b7dfabd6de49e625132ae2d2283824f4e8593eced")
  public open fun sendingOptions(`value`: SendingOptionsProperty.Builder.() -> Unit): Unit =
      sendingOptions(SendingOptionsProperty(`value`))

  /**
   * An object that defines the tags (keys and values) that you want to associate with the
   * configuration set.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An object that defines the tags (keys and values) that you want to associate with the
   * configuration set.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An object that defines the tags (keys and values) that you want to associate with the
   * configuration set.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * An object that defines the open and click tracking options for emails that you send using the
   * configuration set.
   */
  public open fun trackingOptions(): Any? = unwrap(this).getTrackingOptions()

  /**
   * An object that defines the open and click tracking options for emails that you send using the
   * configuration set.
   */
  public open fun trackingOptions(`value`: IResolvable) {
    unwrap(this).setTrackingOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that defines the open and click tracking options for emails that you send using the
   * configuration set.
   */
  public open fun trackingOptions(`value`: TrackingOptionsProperty) {
    unwrap(this).setTrackingOptions(`value`.let(TrackingOptionsProperty.Companion::unwrap))
  }

  /**
   * An object that defines the open and click tracking options for emails that you send using the
   * configuration set.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("414a77bb9f916bbb50572293f156ca82cb258f9e4bef9195ba9b7179837ea611")
  public open fun trackingOptions(`value`: TrackingOptionsProperty.Builder.() -> Unit): Unit =
      trackingOptions(TrackingOptionsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pinpointemail.CfnConfigurationSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An object that defines the dedicated IP pool that is used to send emails that you send using
     * the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-deliveryoptions)
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     * emails that you send using the configuration set. 
     */
    public fun deliveryOptions(deliveryOptions: IResolvable)

    /**
     * An object that defines the dedicated IP pool that is used to send emails that you send using
     * the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-deliveryoptions)
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     * emails that you send using the configuration set. 
     */
    public fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty)

    /**
     * An object that defines the dedicated IP pool that is used to send emails that you send using
     * the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-deliveryoptions)
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     * emails that you send using the configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a07871b3acc4af8f790d4a826c2cacd3a072660b2c5dd6e40348c3602776c251")
    public fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty.Builder.() -> Unit)

    /**
     * The name of the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-name)
     * @param name The name of the configuration set. 
     */
    public fun name(name: String)

    /**
     * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the
     * emails that you send that use the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-reputationoptions)
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     * reputation metrics for the emails that you send that use the configuration set. 
     */
    public fun reputationOptions(reputationOptions: IResolvable)

    /**
     * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the
     * emails that you send that use the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-reputationoptions)
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     * reputation metrics for the emails that you send that use the configuration set. 
     */
    public fun reputationOptions(reputationOptions: ReputationOptionsProperty)

    /**
     * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the
     * emails that you send that use the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-reputationoptions)
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     * reputation metrics for the emails that you send that use the configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c87f58ba9ab7d77bf51962c018f0732efc87ba85fd3f97271fe17bec0169749b")
    public fun reputationOptions(reputationOptions: ReputationOptionsProperty.Builder.() -> Unit)

    /**
     * An object that defines whether or not Amazon Pinpoint can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-sendingoptions)
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     * that you send using the configuration set. 
     */
    public fun sendingOptions(sendingOptions: IResolvable)

    /**
     * An object that defines whether or not Amazon Pinpoint can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-sendingoptions)
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     * that you send using the configuration set. 
     */
    public fun sendingOptions(sendingOptions: SendingOptionsProperty)

    /**
     * An object that defines whether or not Amazon Pinpoint can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-sendingoptions)
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     * that you send using the configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9bf94ab737b0c4433e761b89676a3a65789808e2fb25788d73e5f789825af2df")
    public fun sendingOptions(sendingOptions: SendingOptionsProperty.Builder.() -> Unit)

    /**
     * An object that defines the tags (keys and values) that you want to associate with the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-tags)
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the configuration set. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An object that defines the tags (keys and values) that you want to associate with the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-tags)
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the configuration set. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * An object that defines the open and click tracking options for emails that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-trackingoptions)
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set. 
     */
    public fun trackingOptions(trackingOptions: IResolvable)

    /**
     * An object that defines the open and click tracking options for emails that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-trackingoptions)
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set. 
     */
    public fun trackingOptions(trackingOptions: TrackingOptionsProperty)

    /**
     * An object that defines the open and click tracking options for emails that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-trackingoptions)
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("952610ede443fa8b88b6802bf9c4d9d2d717839104b58c7c328e1f4be9aeb7c8")
    public fun trackingOptions(trackingOptions: TrackingOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.Builder =
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.Builder.create(scope, id)

    /**
     * An object that defines the dedicated IP pool that is used to send emails that you send using
     * the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-deliveryoptions)
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     * emails that you send using the configuration set. 
     */
    override fun deliveryOptions(deliveryOptions: IResolvable) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that defines the dedicated IP pool that is used to send emails that you send using
     * the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-deliveryoptions)
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     * emails that you send using the configuration set. 
     */
    override fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(DeliveryOptionsProperty.Companion::unwrap))
    }

    /**
     * An object that defines the dedicated IP pool that is used to send emails that you send using
     * the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-deliveryoptions)
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     * emails that you send using the configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a07871b3acc4af8f790d4a826c2cacd3a072660b2c5dd6e40348c3602776c251")
    override fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty.Builder.() -> Unit): Unit
        = deliveryOptions(DeliveryOptionsProperty(deliveryOptions))

    /**
     * The name of the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-name)
     * @param name The name of the configuration set. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the
     * emails that you send that use the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-reputationoptions)
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     * reputation metrics for the emails that you send that use the configuration set. 
     */
    override fun reputationOptions(reputationOptions: IResolvable) {
      cdkBuilder.reputationOptions(reputationOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the
     * emails that you send that use the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-reputationoptions)
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     * reputation metrics for the emails that you send that use the configuration set. 
     */
    override fun reputationOptions(reputationOptions: ReputationOptionsProperty) {
      cdkBuilder.reputationOptions(reputationOptions.let(ReputationOptionsProperty.Companion::unwrap))
    }

    /**
     * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the
     * emails that you send that use the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-reputationoptions)
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     * reputation metrics for the emails that you send that use the configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c87f58ba9ab7d77bf51962c018f0732efc87ba85fd3f97271fe17bec0169749b")
    override fun reputationOptions(reputationOptions: ReputationOptionsProperty.Builder.() -> Unit):
        Unit = reputationOptions(ReputationOptionsProperty(reputationOptions))

    /**
     * An object that defines whether or not Amazon Pinpoint can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-sendingoptions)
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     * that you send using the configuration set. 
     */
    override fun sendingOptions(sendingOptions: IResolvable) {
      cdkBuilder.sendingOptions(sendingOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that defines whether or not Amazon Pinpoint can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-sendingoptions)
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     * that you send using the configuration set. 
     */
    override fun sendingOptions(sendingOptions: SendingOptionsProperty) {
      cdkBuilder.sendingOptions(sendingOptions.let(SendingOptionsProperty.Companion::unwrap))
    }

    /**
     * An object that defines whether or not Amazon Pinpoint can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-sendingoptions)
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     * that you send using the configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9bf94ab737b0c4433e761b89676a3a65789808e2fb25788d73e5f789825af2df")
    override fun sendingOptions(sendingOptions: SendingOptionsProperty.Builder.() -> Unit): Unit =
        sendingOptions(SendingOptionsProperty(sendingOptions))

    /**
     * An object that defines the tags (keys and values) that you want to associate with the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-tags)
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the configuration set. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An object that defines the tags (keys and values) that you want to associate with the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-tags)
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the configuration set. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * An object that defines the open and click tracking options for emails that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-trackingoptions)
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set. 
     */
    override fun trackingOptions(trackingOptions: IResolvable) {
      cdkBuilder.trackingOptions(trackingOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that defines the open and click tracking options for emails that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-trackingoptions)
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set. 
     */
    override fun trackingOptions(trackingOptions: TrackingOptionsProperty) {
      cdkBuilder.trackingOptions(trackingOptions.let(TrackingOptionsProperty.Companion::unwrap))
    }

    /**
     * An object that defines the open and click tracking options for emails that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-trackingoptions)
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("952610ede443fa8b88b6802bf9c4d9d2d717839104b58c7c328e1f4be9aeb7c8")
    override fun trackingOptions(trackingOptions: TrackingOptionsProperty.Builder.() -> Unit): Unit
        = trackingOptions(TrackingOptionsProperty(trackingOptions))

    public fun build(): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet):
        CfnConfigurationSet = CfnConfigurationSet(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationSet):
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet = wrapped.cdkObject as
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet
  }

  /**
   * Used to associate a configuration set with a dedicated IP pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpointemail.*;
   * DeliveryOptionsProperty deliveryOptionsProperty = DeliveryOptionsProperty.builder()
   * .sendingPoolName("sendingPoolName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-deliveryoptions.html)
   */
  public interface DeliveryOptionsProperty {
    /**
     * The name of the dedicated IP pool that you want to associate with the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-deliveryoptions.html#cfn-pinpointemail-configurationset-deliveryoptions-sendingpoolname)
     */
    public fun sendingPoolName(): String? = unwrap(this).getSendingPoolName()

    /**
     * A builder for [DeliveryOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sendingPoolName The name of the dedicated IP pool that you want to associate with
       * the configuration set.
       */
      public fun sendingPoolName(sendingPoolName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty.builder()

      /**
       * @param sendingPoolName The name of the dedicated IP pool that you want to associate with
       * the configuration set.
       */
      override fun sendingPoolName(sendingPoolName: String) {
        cdkBuilder.sendingPoolName(sendingPoolName)
      }

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty,
    ) : CdkObject(cdkObject),
        DeliveryOptionsProperty {
      /**
       * The name of the dedicated IP pool that you want to associate with the configuration set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-deliveryoptions.html#cfn-pinpointemail-configurationset-deliveryoptions-sendingpoolname)
       */
      override fun sendingPoolName(): String? = unwrap(this).getSendingPoolName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeliveryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty):
          DeliveryOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? DeliveryOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeliveryOptionsProperty):
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty
    }
  }

  /**
   * Enable or disable collection of reputation metrics for emails that you send using this
   * configuration set in the current AWS Region.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpointemail.*;
   * ReputationOptionsProperty reputationOptionsProperty = ReputationOptionsProperty.builder()
   * .reputationMetricsEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-reputationoptions.html)
   */
  public interface ReputationOptionsProperty {
    /**
     * If `true` , tracking of reputation metrics is enabled for the configuration set.
     *
     * If `false` , tracking of reputation metrics is disabled for the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-reputationoptions.html#cfn-pinpointemail-configurationset-reputationoptions-reputationmetricsenabled)
     */
    public fun reputationMetricsEnabled(): Any? = unwrap(this).getReputationMetricsEnabled()

    /**
     * A builder for [ReputationOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param reputationMetricsEnabled If `true` , tracking of reputation metrics is enabled for
       * the configuration set.
       * If `false` , tracking of reputation metrics is disabled for the configuration set.
       */
      public fun reputationMetricsEnabled(reputationMetricsEnabled: Boolean)

      /**
       * @param reputationMetricsEnabled If `true` , tracking of reputation metrics is enabled for
       * the configuration set.
       * If `false` , tracking of reputation metrics is disabled for the configuration set.
       */
      public fun reputationMetricsEnabled(reputationMetricsEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty.builder()

      /**
       * @param reputationMetricsEnabled If `true` , tracking of reputation metrics is enabled for
       * the configuration set.
       * If `false` , tracking of reputation metrics is disabled for the configuration set.
       */
      override fun reputationMetricsEnabled(reputationMetricsEnabled: Boolean) {
        cdkBuilder.reputationMetricsEnabled(reputationMetricsEnabled)
      }

      /**
       * @param reputationMetricsEnabled If `true` , tracking of reputation metrics is enabled for
       * the configuration set.
       * If `false` , tracking of reputation metrics is disabled for the configuration set.
       */
      override fun reputationMetricsEnabled(reputationMetricsEnabled: IResolvable) {
        cdkBuilder.reputationMetricsEnabled(reputationMetricsEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty,
    ) : CdkObject(cdkObject),
        ReputationOptionsProperty {
      /**
       * If `true` , tracking of reputation metrics is enabled for the configuration set.
       *
       * If `false` , tracking of reputation metrics is disabled for the configuration set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-reputationoptions.html#cfn-pinpointemail-configurationset-reputationoptions-reputationmetricsenabled)
       */
      override fun reputationMetricsEnabled(): Any? = unwrap(this).getReputationMetricsEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReputationOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty):
          ReputationOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReputationOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReputationOptionsProperty):
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty
    }
  }

  /**
   * Used to enable or disable email sending for messages that use this configuration set in the
   * current AWS Region.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpointemail.*;
   * SendingOptionsProperty sendingOptionsProperty = SendingOptionsProperty.builder()
   * .sendingEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-sendingoptions.html)
   */
  public interface SendingOptionsProperty {
    /**
     * If `true` , email sending is enabled for the configuration set.
     *
     * If `false` , email sending is disabled for the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-sendingoptions.html#cfn-pinpointemail-configurationset-sendingoptions-sendingenabled)
     */
    public fun sendingEnabled(): Any? = unwrap(this).getSendingEnabled()

    /**
     * A builder for [SendingOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sendingEnabled If `true` , email sending is enabled for the configuration set.
       * If `false` , email sending is disabled for the configuration set.
       */
      public fun sendingEnabled(sendingEnabled: Boolean)

      /**
       * @param sendingEnabled If `true` , email sending is enabled for the configuration set.
       * If `false` , email sending is disabled for the configuration set.
       */
      public fun sendingEnabled(sendingEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty.builder()

      /**
       * @param sendingEnabled If `true` , email sending is enabled for the configuration set.
       * If `false` , email sending is disabled for the configuration set.
       */
      override fun sendingEnabled(sendingEnabled: Boolean) {
        cdkBuilder.sendingEnabled(sendingEnabled)
      }

      /**
       * @param sendingEnabled If `true` , email sending is enabled for the configuration set.
       * If `false` , email sending is disabled for the configuration set.
       */
      override fun sendingEnabled(sendingEnabled: IResolvable) {
        cdkBuilder.sendingEnabled(sendingEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty,
    ) : CdkObject(cdkObject),
        SendingOptionsProperty {
      /**
       * If `true` , email sending is enabled for the configuration set.
       *
       * If `false` , email sending is disabled for the configuration set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-sendingoptions.html#cfn-pinpointemail-configurationset-sendingoptions-sendingenabled)
       */
      override fun sendingEnabled(): Any? = unwrap(this).getSendingEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SendingOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty):
          SendingOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? SendingOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SendingOptionsProperty):
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty
    }
  }

  /**
   * An object that defines the tracking options for a configuration set.
   *
   * When you use Amazon Pinpoint to send an email, it contains an invisible image that's used to
   * track when recipients open your email. If your email contains links, those links are changed
   * slightly in order to track when recipients click them.
   *
   * These images and links include references to a domain operated by AWS . You can optionally
   * configure Amazon Pinpoint to use a domain that you operate for these images and links.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpointemail.*;
   * TrackingOptionsProperty trackingOptionsProperty = TrackingOptionsProperty.builder()
   * .customRedirectDomain("customRedirectDomain")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-trackingoptions.html)
   */
  public interface TrackingOptionsProperty {
    /**
     * The domain that you want to use for tracking open and click events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-trackingoptions.html#cfn-pinpointemail-configurationset-trackingoptions-customredirectdomain)
     */
    public fun customRedirectDomain(): String? = unwrap(this).getCustomRedirectDomain()

    /**
     * A builder for [TrackingOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customRedirectDomain The domain that you want to use for tracking open and click
       * events.
       */
      public fun customRedirectDomain(customRedirectDomain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty.builder()

      /**
       * @param customRedirectDomain The domain that you want to use for tracking open and click
       * events.
       */
      override fun customRedirectDomain(customRedirectDomain: String) {
        cdkBuilder.customRedirectDomain(customRedirectDomain)
      }

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty,
    ) : CdkObject(cdkObject),
        TrackingOptionsProperty {
      /**
       * The domain that you want to use for tracking open and click events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-trackingoptions.html#cfn-pinpointemail-configurationset-trackingoptions-customredirectdomain)
       */
      override fun customRedirectDomain(): String? = unwrap(this).getCustomRedirectDomain()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrackingOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty):
          TrackingOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? TrackingOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrackingOptionsProperty):
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty
    }
  }
}
