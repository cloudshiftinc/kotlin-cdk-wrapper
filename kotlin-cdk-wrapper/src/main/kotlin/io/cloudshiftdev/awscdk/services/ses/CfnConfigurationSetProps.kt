@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConfigurationSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
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
public interface CfnConfigurationSetProps {
  /**
   * Specifies whether messages that use the configuration set are required to use Transport Layer
   * Security (TLS).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-deliveryoptions)
   */
  public fun deliveryOptions(): Any? = unwrap(this).getDeliveryOptions()

  /**
   * The name of the configuration set. The name must meet the following requirements:.
   *
   * * Contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
   * * Contain 64 characters or fewer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * An object that represents the reputation settings for the configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-reputationoptions)
   */
  public fun reputationOptions(): Any? = unwrap(this).getReputationOptions()

  /**
   * An object that defines whether or not Amazon SES can send email that you send using the
   * configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-sendingoptions)
   */
  public fun sendingOptions(): Any? = unwrap(this).getSendingOptions()

  /**
   * An object that contains information about the suppression list preferences for your account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-suppressionoptions)
   */
  public fun suppressionOptions(): Any? = unwrap(this).getSuppressionOptions()

  /**
   * The name of the custom open and click tracking domain associated with the configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-trackingoptions)
   */
  public fun trackingOptions(): Any? = unwrap(this).getTrackingOptions()

  /**
   * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-vdmoptions)
   */
  public fun vdmOptions(): Any? = unwrap(this).getVdmOptions()

  /**
   * A builder for [CfnConfigurationSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deliveryOptions Specifies whether messages that use the configuration set are required
     * to use Transport Layer Security (TLS).
     */
    public fun deliveryOptions(deliveryOptions: IResolvable)

    /**
     * @param deliveryOptions Specifies whether messages that use the configuration set are required
     * to use Transport Layer Security (TLS).
     */
    public fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty)

    /**
     * @param deliveryOptions Specifies whether messages that use the configuration set are required
     * to use Transport Layer Security (TLS).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bf6289bbefa5e46969b3364e4d6b808c8b989b975f87416589ce94051d1fc36")
    public
        fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty.Builder.() -> Unit)

    /**
     * @param name The name of the configuration set. The name must meet the following
     * requirements:.
     * * Contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * * Contain 64 characters or fewer.
     */
    public fun name(name: String)

    /**
     * @param reputationOptions An object that represents the reputation settings for the
     * configuration set.
     */
    public fun reputationOptions(reputationOptions: IResolvable)

    /**
     * @param reputationOptions An object that represents the reputation settings for the
     * configuration set.
     */
    public fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty)

    /**
     * @param reputationOptions An object that represents the reputation settings for the
     * configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c7b8a0979b6dd4bf62103f4b02e718f928a3daed90946a3d903d7ee044eddb6")
    public
        fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty.Builder.() -> Unit)

    /**
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that
     * you send using the configuration set.
     */
    public fun sendingOptions(sendingOptions: IResolvable)

    /**
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that
     * you send using the configuration set.
     */
    public fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty)

    /**
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that
     * you send using the configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af6dfaf61c62e11864702199d9943b5a7f857e760df422e64d9e69de22ff5408")
    public
        fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty.Builder.() -> Unit)

    /**
     * @param suppressionOptions An object that contains information about the suppression list
     * preferences for your account.
     */
    public fun suppressionOptions(suppressionOptions: IResolvable)

    /**
     * @param suppressionOptions An object that contains information about the suppression list
     * preferences for your account.
     */
    public
        fun suppressionOptions(suppressionOptions: CfnConfigurationSet.SuppressionOptionsProperty)

    /**
     * @param suppressionOptions An object that contains information about the suppression list
     * preferences for your account.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1766b436ee2ace67fccd7b8e27f9639a0748817207fa01d61224cb821c592cad")
    public
        fun suppressionOptions(suppressionOptions: CfnConfigurationSet.SuppressionOptionsProperty.Builder.() -> Unit)

    /**
     * @param trackingOptions The name of the custom open and click tracking domain associated with
     * the configuration set.
     */
    public fun trackingOptions(trackingOptions: IResolvable)

    /**
     * @param trackingOptions The name of the custom open and click tracking domain associated with
     * the configuration set.
     */
    public fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty)

    /**
     * @param trackingOptions The name of the custom open and click tracking domain associated with
     * the configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a270122f66bb2d23246474cc97c9b86630efa5b4188f0024907557c8ab4dd13c")
    public
        fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty.Builder.() -> Unit)

    /**
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set.
     */
    public fun vdmOptions(vdmOptions: IResolvable)

    /**
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set.
     */
    public fun vdmOptions(vdmOptions: CfnConfigurationSet.VdmOptionsProperty)

    /**
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5a18daf2058f44250195442572a690d207b0100f0fe949a03b4b22e620fb2a3")
    public fun vdmOptions(vdmOptions: CfnConfigurationSet.VdmOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnConfigurationSetProps.Builder =
        software.amazon.awscdk.services.ses.CfnConfigurationSetProps.builder()

    /**
     * @param deliveryOptions Specifies whether messages that use the configuration set are required
     * to use Transport Layer Security (TLS).
     */
    override fun deliveryOptions(deliveryOptions: IResolvable) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(IResolvable::unwrap))
    }

    /**
     * @param deliveryOptions Specifies whether messages that use the configuration set are required
     * to use Transport Layer Security (TLS).
     */
    override fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(CfnConfigurationSet.DeliveryOptionsProperty::unwrap))
    }

    /**
     * @param deliveryOptions Specifies whether messages that use the configuration set are required
     * to use Transport Layer Security (TLS).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bf6289bbefa5e46969b3364e4d6b808c8b989b975f87416589ce94051d1fc36")
    override
        fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty.Builder.() -> Unit):
        Unit = deliveryOptions(CfnConfigurationSet.DeliveryOptionsProperty(deliveryOptions))

    /**
     * @param name The name of the configuration set. The name must meet the following
     * requirements:.
     * * Contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * * Contain 64 characters or fewer.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param reputationOptions An object that represents the reputation settings for the
     * configuration set.
     */
    override fun reputationOptions(reputationOptions: IResolvable) {
      cdkBuilder.reputationOptions(reputationOptions.let(IResolvable::unwrap))
    }

    /**
     * @param reputationOptions An object that represents the reputation settings for the
     * configuration set.
     */
    override
        fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty) {
      cdkBuilder.reputationOptions(reputationOptions.let(CfnConfigurationSet.ReputationOptionsProperty::unwrap))
    }

    /**
     * @param reputationOptions An object that represents the reputation settings for the
     * configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c7b8a0979b6dd4bf62103f4b02e718f928a3daed90946a3d903d7ee044eddb6")
    override
        fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty.Builder.() -> Unit):
        Unit = reputationOptions(CfnConfigurationSet.ReputationOptionsProperty(reputationOptions))

    /**
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that
     * you send using the configuration set.
     */
    override fun sendingOptions(sendingOptions: IResolvable) {
      cdkBuilder.sendingOptions(sendingOptions.let(IResolvable::unwrap))
    }

    /**
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that
     * you send using the configuration set.
     */
    override fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty) {
      cdkBuilder.sendingOptions(sendingOptions.let(CfnConfigurationSet.SendingOptionsProperty::unwrap))
    }

    /**
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that
     * you send using the configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af6dfaf61c62e11864702199d9943b5a7f857e760df422e64d9e69de22ff5408")
    override
        fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty.Builder.() -> Unit):
        Unit = sendingOptions(CfnConfigurationSet.SendingOptionsProperty(sendingOptions))

    /**
     * @param suppressionOptions An object that contains information about the suppression list
     * preferences for your account.
     */
    override fun suppressionOptions(suppressionOptions: IResolvable) {
      cdkBuilder.suppressionOptions(suppressionOptions.let(IResolvable::unwrap))
    }

    /**
     * @param suppressionOptions An object that contains information about the suppression list
     * preferences for your account.
     */
    override
        fun suppressionOptions(suppressionOptions: CfnConfigurationSet.SuppressionOptionsProperty) {
      cdkBuilder.suppressionOptions(suppressionOptions.let(CfnConfigurationSet.SuppressionOptionsProperty::unwrap))
    }

    /**
     * @param suppressionOptions An object that contains information about the suppression list
     * preferences for your account.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1766b436ee2ace67fccd7b8e27f9639a0748817207fa01d61224cb821c592cad")
    override
        fun suppressionOptions(suppressionOptions: CfnConfigurationSet.SuppressionOptionsProperty.Builder.() -> Unit):
        Unit =
        suppressionOptions(CfnConfigurationSet.SuppressionOptionsProperty(suppressionOptions))

    /**
     * @param trackingOptions The name of the custom open and click tracking domain associated with
     * the configuration set.
     */
    override fun trackingOptions(trackingOptions: IResolvable) {
      cdkBuilder.trackingOptions(trackingOptions.let(IResolvable::unwrap))
    }

    /**
     * @param trackingOptions The name of the custom open and click tracking domain associated with
     * the configuration set.
     */
    override fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty) {
      cdkBuilder.trackingOptions(trackingOptions.let(CfnConfigurationSet.TrackingOptionsProperty::unwrap))
    }

    /**
     * @param trackingOptions The name of the custom open and click tracking domain associated with
     * the configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a270122f66bb2d23246474cc97c9b86630efa5b4188f0024907557c8ab4dd13c")
    override
        fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty.Builder.() -> Unit):
        Unit = trackingOptions(CfnConfigurationSet.TrackingOptionsProperty(trackingOptions))

    /**
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set.
     */
    override fun vdmOptions(vdmOptions: IResolvable) {
      cdkBuilder.vdmOptions(vdmOptions.let(IResolvable::unwrap))
    }

    /**
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set.
     */
    override fun vdmOptions(vdmOptions: CfnConfigurationSet.VdmOptionsProperty) {
      cdkBuilder.vdmOptions(vdmOptions.let(CfnConfigurationSet.VdmOptionsProperty::unwrap))
    }

    /**
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5a18daf2058f44250195442572a690d207b0100f0fe949a03b4b22e620fb2a3")
    override fun vdmOptions(vdmOptions: CfnConfigurationSet.VdmOptionsProperty.Builder.() -> Unit):
        Unit = vdmOptions(CfnConfigurationSet.VdmOptionsProperty(vdmOptions))

    public fun build(): software.amazon.awscdk.services.ses.CfnConfigurationSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetProps,
  ) : CdkObject(cdkObject), CfnConfigurationSetProps {
    /**
     * Specifies whether messages that use the configuration set are required to use Transport Layer
     * Security (TLS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-deliveryoptions)
     */
    override fun deliveryOptions(): Any? = unwrap(this).getDeliveryOptions()

    /**
     * The name of the configuration set. The name must meet the following requirements:.
     *
     * * Contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * * Contain 64 characters or fewer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * An object that represents the reputation settings for the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-reputationoptions)
     */
    override fun reputationOptions(): Any? = unwrap(this).getReputationOptions()

    /**
     * An object that defines whether or not Amazon SES can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-sendingoptions)
     */
    override fun sendingOptions(): Any? = unwrap(this).getSendingOptions()

    /**
     * An object that contains information about the suppression list preferences for your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-suppressionoptions)
     */
    override fun suppressionOptions(): Any? = unwrap(this).getSuppressionOptions()

    /**
     * The name of the custom open and click tracking domain associated with the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-trackingoptions)
     */
    override fun trackingOptions(): Any? = unwrap(this).getTrackingOptions()

    /**
     * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-vdmoptions)
     */
    override fun vdmOptions(): Any? = unwrap(this).getVdmOptions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetProps):
        CfnConfigurationSetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConfigurationSetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationSetProps):
        software.amazon.awscdk.services.ses.CfnConfigurationSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnConfigurationSetProps
  }
}
