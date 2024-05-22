@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpointemail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConfigurationSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpointemail.*;
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
public interface CfnConfigurationSetProps {
  /**
   * An object that defines the dedicated IP pool that is used to send emails that you send using
   * the configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-deliveryoptions)
   */
  public fun deliveryOptions(): Any? = unwrap(this).getDeliveryOptions()

  /**
   * The name of the configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-name)
   */
  public fun name(): String

  /**
   * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the
   * emails that you send that use the configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-reputationoptions)
   */
  public fun reputationOptions(): Any? = unwrap(this).getReputationOptions()

  /**
   * An object that defines whether or not Amazon Pinpoint can send email that you send using the
   * configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-sendingoptions)
   */
  public fun sendingOptions(): Any? = unwrap(this).getSendingOptions()

  /**
   * An object that defines the tags (keys and values) that you want to associate with the
   * configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An object that defines the open and click tracking options for emails that you send using the
   * configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-trackingoptions)
   */
  public fun trackingOptions(): Any? = unwrap(this).getTrackingOptions()

  /**
   * A builder for [CfnConfigurationSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     * emails that you send using the configuration set.
     */
    public fun deliveryOptions(deliveryOptions: IResolvable)

    /**
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     * emails that you send using the configuration set.
     */
    public fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty)

    /**
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     * emails that you send using the configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("552bb815a44a56c376f26c9659bc71d6ab8af1fdcfa1e9f4639d86100a5ea881")
    public
        fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty.Builder.() -> Unit)

    /**
     * @param name The name of the configuration set. 
     */
    public fun name(name: String)

    /**
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     * reputation metrics for the emails that you send that use the configuration set.
     */
    public fun reputationOptions(reputationOptions: IResolvable)

    /**
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     * reputation metrics for the emails that you send that use the configuration set.
     */
    public fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty)

    /**
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     * reputation metrics for the emails that you send that use the configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a25f728e0ecd1a17c04905aa358a990758abd47cbd826403340772a78248787")
    public
        fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty.Builder.() -> Unit)

    /**
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     * that you send using the configuration set.
     */
    public fun sendingOptions(sendingOptions: IResolvable)

    /**
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     * that you send using the configuration set.
     */
    public fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty)

    /**
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     * that you send using the configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b6621e583f0961322ff9446a6e8cfe66178970cd92da7efa571f61889dd2b9b")
    public
        fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty.Builder.() -> Unit)

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the configuration set.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the configuration set.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set.
     */
    public fun trackingOptions(trackingOptions: IResolvable)

    /**
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set.
     */
    public fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty)

    /**
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d53dd18c418c99f31e03b64105254319ceafcf775f9c8d6778a2d38275c9edd6")
    public
        fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps.Builder =
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps.builder()

    /**
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     * emails that you send using the configuration set.
     */
    override fun deliveryOptions(deliveryOptions: IResolvable) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     * emails that you send using the configuration set.
     */
    override fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(CfnConfigurationSet.DeliveryOptionsProperty.Companion::unwrap))
    }

    /**
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send
     * emails that you send using the configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("552bb815a44a56c376f26c9659bc71d6ab8af1fdcfa1e9f4639d86100a5ea881")
    override
        fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty.Builder.() -> Unit):
        Unit = deliveryOptions(CfnConfigurationSet.DeliveryOptionsProperty(deliveryOptions))

    /**
     * @param name The name of the configuration set. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     * reputation metrics for the emails that you send that use the configuration set.
     */
    override fun reputationOptions(reputationOptions: IResolvable) {
      cdkBuilder.reputationOptions(reputationOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     * reputation metrics for the emails that you send that use the configuration set.
     */
    override
        fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty) {
      cdkBuilder.reputationOptions(reputationOptions.let(CfnConfigurationSet.ReputationOptionsProperty.Companion::unwrap))
    }

    /**
     * @param reputationOptions An object that defines whether or not Amazon Pinpoint collects
     * reputation metrics for the emails that you send that use the configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a25f728e0ecd1a17c04905aa358a990758abd47cbd826403340772a78248787")
    override
        fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty.Builder.() -> Unit):
        Unit = reputationOptions(CfnConfigurationSet.ReputationOptionsProperty(reputationOptions))

    /**
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     * that you send using the configuration set.
     */
    override fun sendingOptions(sendingOptions: IResolvable) {
      cdkBuilder.sendingOptions(sendingOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     * that you send using the configuration set.
     */
    override fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty) {
      cdkBuilder.sendingOptions(sendingOptions.let(CfnConfigurationSet.SendingOptionsProperty.Companion::unwrap))
    }

    /**
     * @param sendingOptions An object that defines whether or not Amazon Pinpoint can send email
     * that you send using the configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b6621e583f0961322ff9446a6e8cfe66178970cd92da7efa571f61889dd2b9b")
    override
        fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty.Builder.() -> Unit):
        Unit = sendingOptions(CfnConfigurationSet.SendingOptionsProperty(sendingOptions))

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the configuration set.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the configuration set.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set.
     */
    override fun trackingOptions(trackingOptions: IResolvable) {
      cdkBuilder.trackingOptions(trackingOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set.
     */
    override fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty) {
      cdkBuilder.trackingOptions(trackingOptions.let(CfnConfigurationSet.TrackingOptionsProperty.Companion::unwrap))
    }

    /**
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d53dd18c418c99f31e03b64105254319ceafcf775f9c8d6778a2d38275c9edd6")
    override
        fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty.Builder.() -> Unit):
        Unit = trackingOptions(CfnConfigurationSet.TrackingOptionsProperty(trackingOptions))

    public fun build(): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps,
  ) : CdkObject(cdkObject), CfnConfigurationSetProps {
    /**
     * An object that defines the dedicated IP pool that is used to send emails that you send using
     * the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-deliveryoptions)
     */
    override fun deliveryOptions(): Any? = unwrap(this).getDeliveryOptions()

    /**
     * The name of the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the
     * emails that you send that use the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-reputationoptions)
     */
    override fun reputationOptions(): Any? = unwrap(this).getReputationOptions()

    /**
     * An object that defines whether or not Amazon Pinpoint can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-sendingoptions)
     */
    override fun sendingOptions(): Any? = unwrap(this).getSendingOptions()

    /**
     * An object that defines the tags (keys and values) that you want to associate with the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * An object that defines the open and click tracking options for emails that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-trackingoptions)
     */
    override fun trackingOptions(): Any? = unwrap(this).getTrackingOptions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps):
        CfnConfigurationSetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConfigurationSetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationSetProps):
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps
  }
}
