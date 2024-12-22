@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Configuration sets let you create groups of rules that you can apply to the emails you send using
 * Amazon SES.
 *
 * For more information about using configuration sets, see [Using Amazon SES Configuration
 * Sets](https://docs.aws.amazon.com/ses/latest/dg/using-configuration-sets.html) in the [Amazon SES
 * Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/) .
 *
 *
 * *Required permissions:*
 *
 * To apply any of the resource options, you will need to have the corresponding AWS Identity and
 * Access Management (IAM) SES API v2 permissions:
 *
 * * `ses:GetConfigurationSet`
 * * (This permission is replacing the v1 *ses:DescribeConfigurationSet* permission which will not
 * work with these v2 resource options.)
 * * `ses:PutConfigurationSetDeliveryOptions`
 * * `ses:PutConfigurationSetReputationOptions`
 * * `ses:PutConfigurationSetSendingOptions`
 * * `ses:PutConfigurationSetSuppressionOptions`
 * * `ses:PutConfigurationSetTrackingOptions`
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnConfigurationSet cfnConfigurationSet = CfnConfigurationSet.Builder.create(this,
 * "MyCfnConfigurationSet")
 * .deliveryOptions(DeliveryOptionsProperty.builder()
 * .maxDeliverySeconds(123)
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
public open class CfnConfigurationSet(
  cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ses.CfnConfigurationSet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationSetProps,
  ) :
      this(software.amazon.awscdk.services.ses.CfnConfigurationSet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConfigurationSetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationSetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConfigurationSetProps(props)
  )

  /**
   * Specifies the name of the dedicated IP pool to associate with the configuration set and whether
   * messages that use the configuration set are required to use Transport Layer Security (TLS).
   */
  public open fun deliveryOptions(): Any? = unwrap(this).getDeliveryOptions()

  /**
   * Specifies the name of the dedicated IP pool to associate with the configuration set and whether
   * messages that use the configuration set are required to use Transport Layer Security (TLS).
   */
  public open fun deliveryOptions(`value`: IResolvable) {
    unwrap(this).setDeliveryOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the name of the dedicated IP pool to associate with the configuration set and whether
   * messages that use the configuration set are required to use Transport Layer Security (TLS).
   */
  public open fun deliveryOptions(`value`: DeliveryOptionsProperty) {
    unwrap(this).setDeliveryOptions(`value`.let(DeliveryOptionsProperty.Companion::unwrap))
  }

  /**
   * Specifies the name of the dedicated IP pool to associate with the configuration set and whether
   * messages that use the configuration set are required to use Transport Layer Security (TLS).
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b48406aebe495571c3988281305bd27e18418f1ed8d88a707fb40bb854bd97b1")
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
   *
   * The name must meet the following requirements:.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the configuration set.
   *
   * The name must meet the following requirements:.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An object that defines whether or not Amazon SES collects reputation metrics for the emails
   * that you send that use the configuration set.
   */
  public open fun reputationOptions(): Any? = unwrap(this).getReputationOptions()

  /**
   * An object that defines whether or not Amazon SES collects reputation metrics for the emails
   * that you send that use the configuration set.
   */
  public open fun reputationOptions(`value`: IResolvable) {
    unwrap(this).setReputationOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that defines whether or not Amazon SES collects reputation metrics for the emails
   * that you send that use the configuration set.
   */
  public open fun reputationOptions(`value`: ReputationOptionsProperty) {
    unwrap(this).setReputationOptions(`value`.let(ReputationOptionsProperty.Companion::unwrap))
  }

  /**
   * An object that defines whether or not Amazon SES collects reputation metrics for the emails
   * that you send that use the configuration set.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("227804c3f3b263a655a52d0e1bea02051bfe38dd33043fb95ebe45c23c13ffd3")
  public open fun reputationOptions(`value`: ReputationOptionsProperty.Builder.() -> Unit): Unit =
      reputationOptions(ReputationOptionsProperty(`value`))

  /**
   * An object that defines whether or not Amazon SES can send email that you send using the
   * configuration set.
   */
  public open fun sendingOptions(): Any? = unwrap(this).getSendingOptions()

  /**
   * An object that defines whether or not Amazon SES can send email that you send using the
   * configuration set.
   */
  public open fun sendingOptions(`value`: IResolvable) {
    unwrap(this).setSendingOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that defines whether or not Amazon SES can send email that you send using the
   * configuration set.
   */
  public open fun sendingOptions(`value`: SendingOptionsProperty) {
    unwrap(this).setSendingOptions(`value`.let(SendingOptionsProperty.Companion::unwrap))
  }

  /**
   * An object that defines whether or not Amazon SES can send email that you send using the
   * configuration set.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e4e3cd59af11992de306054f8ff718fcf963a7eeb4e39600799f80a5e520af4")
  public open fun sendingOptions(`value`: SendingOptionsProperty.Builder.() -> Unit): Unit =
      sendingOptions(SendingOptionsProperty(`value`))

  /**
   * An object that contains information about the suppression list preferences for your account.
   */
  public open fun suppressionOptions(): Any? = unwrap(this).getSuppressionOptions()

  /**
   * An object that contains information about the suppression list preferences for your account.
   */
  public open fun suppressionOptions(`value`: IResolvable) {
    unwrap(this).setSuppressionOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that contains information about the suppression list preferences for your account.
   */
  public open fun suppressionOptions(`value`: SuppressionOptionsProperty) {
    unwrap(this).setSuppressionOptions(`value`.let(SuppressionOptionsProperty.Companion::unwrap))
  }

  /**
   * An object that contains information about the suppression list preferences for your account.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8757f0e719bb535158fdcaad6e5744831cfa05c271b21f1d7f8662adafe694dc")
  public open fun suppressionOptions(`value`: SuppressionOptionsProperty.Builder.() -> Unit): Unit =
      suppressionOptions(SuppressionOptionsProperty(`value`))

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
  @JvmName("64178774d79abefec51ad3f5d3e00d4ac1826e8e00ae6ce9fa1a2aee536102f8")
  public open fun trackingOptions(`value`: TrackingOptionsProperty.Builder.() -> Unit): Unit =
      trackingOptions(TrackingOptionsProperty(`value`))

  /**
   * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
   */
  public open fun vdmOptions(): Any? = unwrap(this).getVdmOptions()

  /**
   * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
   */
  public open fun vdmOptions(`value`: IResolvable) {
    unwrap(this).setVdmOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
   */
  public open fun vdmOptions(`value`: VdmOptionsProperty) {
    unwrap(this).setVdmOptions(`value`.let(VdmOptionsProperty.Companion::unwrap))
  }

  /**
   * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c497458775f4b4966b0e481d739d29db2add5f48b6ee35ccf3ddc647585d7840")
  public open fun vdmOptions(`value`: VdmOptionsProperty.Builder.() -> Unit): Unit =
      vdmOptions(VdmOptionsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnConfigurationSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the name of the dedicated IP pool to associate with the configuration set and
     * whether messages that use the configuration set are required to use Transport Layer Security
     * (TLS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-deliveryoptions)
     * @param deliveryOptions Specifies the name of the dedicated IP pool to associate with the
     * configuration set and whether messages that use the configuration set are required to use
     * Transport Layer Security (TLS). 
     */
    public fun deliveryOptions(deliveryOptions: IResolvable)

    /**
     * Specifies the name of the dedicated IP pool to associate with the configuration set and
     * whether messages that use the configuration set are required to use Transport Layer Security
     * (TLS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-deliveryoptions)
     * @param deliveryOptions Specifies the name of the dedicated IP pool to associate with the
     * configuration set and whether messages that use the configuration set are required to use
     * Transport Layer Security (TLS). 
     */
    public fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty)

    /**
     * Specifies the name of the dedicated IP pool to associate with the configuration set and
     * whether messages that use the configuration set are required to use Transport Layer Security
     * (TLS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-deliveryoptions)
     * @param deliveryOptions Specifies the name of the dedicated IP pool to associate with the
     * configuration set and whether messages that use the configuration set are required to use
     * Transport Layer Security (TLS). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bea76d4086f6acc6c515602f5efc12d6f5d2dcd3e9dc35e7920f14a83af7c1e7")
    public fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty.Builder.() -> Unit)

    /**
     * The name of the configuration set. The name must meet the following requirements:.
     *
     * * Contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * * Contain 64 characters or fewer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-name)
     * @param name The name of the configuration set. The name must meet the following
     * requirements:. 
     */
    public fun name(name: String)

    /**
     * An object that defines whether or not Amazon SES collects reputation metrics for the emails
     * that you send that use the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-reputationoptions)
     * @param reputationOptions An object that defines whether or not Amazon SES collects reputation
     * metrics for the emails that you send that use the configuration set. 
     */
    public fun reputationOptions(reputationOptions: IResolvable)

    /**
     * An object that defines whether or not Amazon SES collects reputation metrics for the emails
     * that you send that use the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-reputationoptions)
     * @param reputationOptions An object that defines whether or not Amazon SES collects reputation
     * metrics for the emails that you send that use the configuration set. 
     */
    public fun reputationOptions(reputationOptions: ReputationOptionsProperty)

    /**
     * An object that defines whether or not Amazon SES collects reputation metrics for the emails
     * that you send that use the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-reputationoptions)
     * @param reputationOptions An object that defines whether or not Amazon SES collects reputation
     * metrics for the emails that you send that use the configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c733d8e8b31cc6e04a50d62a5a57004f2628da598b37f0ba686bba934b96d4a")
    public fun reputationOptions(reputationOptions: ReputationOptionsProperty.Builder.() -> Unit)

    /**
     * An object that defines whether or not Amazon SES can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-sendingoptions)
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that
     * you send using the configuration set. 
     */
    public fun sendingOptions(sendingOptions: IResolvable)

    /**
     * An object that defines whether or not Amazon SES can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-sendingoptions)
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that
     * you send using the configuration set. 
     */
    public fun sendingOptions(sendingOptions: SendingOptionsProperty)

    /**
     * An object that defines whether or not Amazon SES can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-sendingoptions)
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that
     * you send using the configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e9c3e2a8b9ec17cd157bffa04702b878b5ea0856e2d9133e5a9b4be6ebae26a")
    public fun sendingOptions(sendingOptions: SendingOptionsProperty.Builder.() -> Unit)

    /**
     * An object that contains information about the suppression list preferences for your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-suppressionoptions)
     * @param suppressionOptions An object that contains information about the suppression list
     * preferences for your account. 
     */
    public fun suppressionOptions(suppressionOptions: IResolvable)

    /**
     * An object that contains information about the suppression list preferences for your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-suppressionoptions)
     * @param suppressionOptions An object that contains information about the suppression list
     * preferences for your account. 
     */
    public fun suppressionOptions(suppressionOptions: SuppressionOptionsProperty)

    /**
     * An object that contains information about the suppression list preferences for your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-suppressionoptions)
     * @param suppressionOptions An object that contains information about the suppression list
     * preferences for your account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f217a82d0ce4dd438c1e6ecf7a3e479a7082ceb507fd0c05826e87dbef8e7958")
    public fun suppressionOptions(suppressionOptions: SuppressionOptionsProperty.Builder.() -> Unit)

    /**
     * An object that defines the open and click tracking options for emails that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-trackingoptions)
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set. 
     */
    public fun trackingOptions(trackingOptions: IResolvable)

    /**
     * An object that defines the open and click tracking options for emails that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-trackingoptions)
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set. 
     */
    public fun trackingOptions(trackingOptions: TrackingOptionsProperty)

    /**
     * An object that defines the open and click tracking options for emails that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-trackingoptions)
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb098918d914c45ab533668f71503aab74c3c4da79158f851169d8676c5dceaa")
    public fun trackingOptions(trackingOptions: TrackingOptionsProperty.Builder.() -> Unit)

    /**
     * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-vdmoptions)
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set. 
     */
    public fun vdmOptions(vdmOptions: IResolvable)

    /**
     * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-vdmoptions)
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set. 
     */
    public fun vdmOptions(vdmOptions: VdmOptionsProperty)

    /**
     * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-vdmoptions)
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("663fd102ee17bf2c720f3055c7766e60ebd408cc3c6bf6665f8eb2e8c30df482")
    public fun vdmOptions(vdmOptions: VdmOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnConfigurationSet.Builder =
        software.amazon.awscdk.services.ses.CfnConfigurationSet.Builder.create(scope, id)

    /**
     * Specifies the name of the dedicated IP pool to associate with the configuration set and
     * whether messages that use the configuration set are required to use Transport Layer Security
     * (TLS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-deliveryoptions)
     * @param deliveryOptions Specifies the name of the dedicated IP pool to associate with the
     * configuration set and whether messages that use the configuration set are required to use
     * Transport Layer Security (TLS). 
     */
    override fun deliveryOptions(deliveryOptions: IResolvable) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the name of the dedicated IP pool to associate with the configuration set and
     * whether messages that use the configuration set are required to use Transport Layer Security
     * (TLS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-deliveryoptions)
     * @param deliveryOptions Specifies the name of the dedicated IP pool to associate with the
     * configuration set and whether messages that use the configuration set are required to use
     * Transport Layer Security (TLS). 
     */
    override fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(DeliveryOptionsProperty.Companion::unwrap))
    }

    /**
     * Specifies the name of the dedicated IP pool to associate with the configuration set and
     * whether messages that use the configuration set are required to use Transport Layer Security
     * (TLS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-deliveryoptions)
     * @param deliveryOptions Specifies the name of the dedicated IP pool to associate with the
     * configuration set and whether messages that use the configuration set are required to use
     * Transport Layer Security (TLS). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bea76d4086f6acc6c515602f5efc12d6f5d2dcd3e9dc35e7920f14a83af7c1e7")
    override fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty.Builder.() -> Unit): Unit
        = deliveryOptions(DeliveryOptionsProperty(deliveryOptions))

    /**
     * The name of the configuration set. The name must meet the following requirements:.
     *
     * * Contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * * Contain 64 characters or fewer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-name)
     * @param name The name of the configuration set. The name must meet the following
     * requirements:. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An object that defines whether or not Amazon SES collects reputation metrics for the emails
     * that you send that use the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-reputationoptions)
     * @param reputationOptions An object that defines whether or not Amazon SES collects reputation
     * metrics for the emails that you send that use the configuration set. 
     */
    override fun reputationOptions(reputationOptions: IResolvable) {
      cdkBuilder.reputationOptions(reputationOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that defines whether or not Amazon SES collects reputation metrics for the emails
     * that you send that use the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-reputationoptions)
     * @param reputationOptions An object that defines whether or not Amazon SES collects reputation
     * metrics for the emails that you send that use the configuration set. 
     */
    override fun reputationOptions(reputationOptions: ReputationOptionsProperty) {
      cdkBuilder.reputationOptions(reputationOptions.let(ReputationOptionsProperty.Companion::unwrap))
    }

    /**
     * An object that defines whether or not Amazon SES collects reputation metrics for the emails
     * that you send that use the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-reputationoptions)
     * @param reputationOptions An object that defines whether or not Amazon SES collects reputation
     * metrics for the emails that you send that use the configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c733d8e8b31cc6e04a50d62a5a57004f2628da598b37f0ba686bba934b96d4a")
    override fun reputationOptions(reputationOptions: ReputationOptionsProperty.Builder.() -> Unit):
        Unit = reputationOptions(ReputationOptionsProperty(reputationOptions))

    /**
     * An object that defines whether or not Amazon SES can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-sendingoptions)
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that
     * you send using the configuration set. 
     */
    override fun sendingOptions(sendingOptions: IResolvable) {
      cdkBuilder.sendingOptions(sendingOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that defines whether or not Amazon SES can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-sendingoptions)
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that
     * you send using the configuration set. 
     */
    override fun sendingOptions(sendingOptions: SendingOptionsProperty) {
      cdkBuilder.sendingOptions(sendingOptions.let(SendingOptionsProperty.Companion::unwrap))
    }

    /**
     * An object that defines whether or not Amazon SES can send email that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-sendingoptions)
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that
     * you send using the configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e9c3e2a8b9ec17cd157bffa04702b878b5ea0856e2d9133e5a9b4be6ebae26a")
    override fun sendingOptions(sendingOptions: SendingOptionsProperty.Builder.() -> Unit): Unit =
        sendingOptions(SendingOptionsProperty(sendingOptions))

    /**
     * An object that contains information about the suppression list preferences for your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-suppressionoptions)
     * @param suppressionOptions An object that contains information about the suppression list
     * preferences for your account. 
     */
    override fun suppressionOptions(suppressionOptions: IResolvable) {
      cdkBuilder.suppressionOptions(suppressionOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that contains information about the suppression list preferences for your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-suppressionoptions)
     * @param suppressionOptions An object that contains information about the suppression list
     * preferences for your account. 
     */
    override fun suppressionOptions(suppressionOptions: SuppressionOptionsProperty) {
      cdkBuilder.suppressionOptions(suppressionOptions.let(SuppressionOptionsProperty.Companion::unwrap))
    }

    /**
     * An object that contains information about the suppression list preferences for your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-suppressionoptions)
     * @param suppressionOptions An object that contains information about the suppression list
     * preferences for your account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f217a82d0ce4dd438c1e6ecf7a3e479a7082ceb507fd0c05826e87dbef8e7958")
    override
        fun suppressionOptions(suppressionOptions: SuppressionOptionsProperty.Builder.() -> Unit):
        Unit = suppressionOptions(SuppressionOptionsProperty(suppressionOptions))

    /**
     * An object that defines the open and click tracking options for emails that you send using the
     * configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-trackingoptions)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-trackingoptions)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-trackingoptions)
     * @param trackingOptions An object that defines the open and click tracking options for emails
     * that you send using the configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb098918d914c45ab533668f71503aab74c3c4da79158f851169d8676c5dceaa")
    override fun trackingOptions(trackingOptions: TrackingOptionsProperty.Builder.() -> Unit): Unit
        = trackingOptions(TrackingOptionsProperty(trackingOptions))

    /**
     * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-vdmoptions)
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set. 
     */
    override fun vdmOptions(vdmOptions: IResolvable) {
      cdkBuilder.vdmOptions(vdmOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-vdmoptions)
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set. 
     */
    override fun vdmOptions(vdmOptions: VdmOptionsProperty) {
      cdkBuilder.vdmOptions(vdmOptions.let(VdmOptionsProperty.Companion::unwrap))
    }

    /**
     * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-vdmoptions)
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("663fd102ee17bf2c720f3055c7766e60ebd408cc3c6bf6665f8eb2e8c30df482")
    override fun vdmOptions(vdmOptions: VdmOptionsProperty.Builder.() -> Unit): Unit =
        vdmOptions(VdmOptionsProperty(vdmOptions))

    public fun build(): software.amazon.awscdk.services.ses.CfnConfigurationSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnConfigurationSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet):
        CfnConfigurationSet = CfnConfigurationSet(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationSet):
        software.amazon.awscdk.services.ses.CfnConfigurationSet = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.CfnConfigurationSet
  }

  /**
   * An object containing additional settings for your VDM configuration as applicable to the
   * Dashboard.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * DashboardOptionsProperty dashboardOptionsProperty = DashboardOptionsProperty.builder()
   * .engagementMetrics("engagementMetrics")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-dashboardoptions.html)
   */
  public interface DashboardOptionsProperty {
    /**
     * Specifies the status of your VDM engagement metrics collection. Can be one of the following:.
     *
     * * `ENABLED` – Amazon SES enables engagement metrics for the configuration set.
     * * `DISABLED` – Amazon SES disables engagement metrics for the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-dashboardoptions.html#cfn-ses-configurationset-dashboardoptions-engagementmetrics)
     */
    public fun engagementMetrics(): String

    /**
     * A builder for [DashboardOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param engagementMetrics Specifies the status of your VDM engagement metrics collection.
       * Can be one of the following:. 
       * * `ENABLED` – Amazon SES enables engagement metrics for the configuration set.
       * * `DISABLED` – Amazon SES disables engagement metrics for the configuration set.
       */
      public fun engagementMetrics(engagementMetrics: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DashboardOptionsProperty.Builder =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DashboardOptionsProperty.builder()

      /**
       * @param engagementMetrics Specifies the status of your VDM engagement metrics collection.
       * Can be one of the following:. 
       * * `ENABLED` – Amazon SES enables engagement metrics for the configuration set.
       * * `DISABLED` – Amazon SES disables engagement metrics for the configuration set.
       */
      override fun engagementMetrics(engagementMetrics: String) {
        cdkBuilder.engagementMetrics(engagementMetrics)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DashboardOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.DashboardOptionsProperty,
    ) : CdkObject(cdkObject),
        DashboardOptionsProperty {
      /**
       * Specifies the status of your VDM engagement metrics collection. Can be one of the
       * following:.
       *
       * * `ENABLED` – Amazon SES enables engagement metrics for the configuration set.
       * * `DISABLED` – Amazon SES disables engagement metrics for the configuration set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-dashboardoptions.html#cfn-ses-configurationset-dashboardoptions-engagementmetrics)
       */
      override fun engagementMetrics(): String = unwrap(this).getEngagementMetrics()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DashboardOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.DashboardOptionsProperty):
          DashboardOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? DashboardOptionsProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashboardOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DashboardOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DashboardOptionsProperty
    }
  }

  /**
   * Specifies the name of the dedicated IP pool to associate with the configuration set and whether
   * messages that use the configuration set are required to use Transport Layer Security (TLS).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * DeliveryOptionsProperty deliveryOptionsProperty = DeliveryOptionsProperty.builder()
   * .maxDeliverySeconds(123)
   * .sendingPoolName("sendingPoolName")
   * .tlsPolicy("tlsPolicy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-deliveryoptions.html)
   */
  public interface DeliveryOptionsProperty {
    /**
     * The maximum amount of time, in seconds, that Amazon SES API v2 will attempt delivery of
     * email.
     *
     * If specified, the value must greater than or equal to 300 seconds (5 minutes) and less than
     * or equal to 50400 seconds (840 minutes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-deliveryoptions.html#cfn-ses-configurationset-deliveryoptions-maxdeliveryseconds)
     */
    public fun maxDeliverySeconds(): Number? = unwrap(this).getMaxDeliverySeconds()

    /**
     * The name of the dedicated IP pool to associate with the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-deliveryoptions.html#cfn-ses-configurationset-deliveryoptions-sendingpoolname)
     */
    public fun sendingPoolName(): String? = unwrap(this).getSendingPoolName()

    /**
     * Specifies whether messages that use the configuration set are required to use Transport Layer
     * Security (TLS).
     *
     * If the value is `REQUIRE` , messages are only delivered if a TLS connection can be
     * established. If the value is `OPTIONAL` , messages can be delivered in plain text if a TLS
     * connection can't be established.
     *
     * Valid Values: `REQUIRE | OPTIONAL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-deliveryoptions.html#cfn-ses-configurationset-deliveryoptions-tlspolicy)
     */
    public fun tlsPolicy(): String? = unwrap(this).getTlsPolicy()

    /**
     * A builder for [DeliveryOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxDeliverySeconds The maximum amount of time, in seconds, that Amazon SES API v2
       * will attempt delivery of email.
       * If specified, the value must greater than or equal to 300 seconds (5 minutes) and less than
       * or equal to 50400 seconds (840 minutes).
       */
      public fun maxDeliverySeconds(maxDeliverySeconds: Number)

      /**
       * @param sendingPoolName The name of the dedicated IP pool to associate with the
       * configuration set.
       */
      public fun sendingPoolName(sendingPoolName: String)

      /**
       * @param tlsPolicy Specifies whether messages that use the configuration set are required to
       * use Transport Layer Security (TLS).
       * If the value is `REQUIRE` , messages are only delivered if a TLS connection can be
       * established. If the value is `OPTIONAL` , messages can be delivered in plain text if a TLS
       * connection can't be established.
       *
       * Valid Values: `REQUIRE | OPTIONAL`
       */
      public fun tlsPolicy(tlsPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DeliveryOptionsProperty.Builder =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DeliveryOptionsProperty.builder()

      /**
       * @param maxDeliverySeconds The maximum amount of time, in seconds, that Amazon SES API v2
       * will attempt delivery of email.
       * If specified, the value must greater than or equal to 300 seconds (5 minutes) and less than
       * or equal to 50400 seconds (840 minutes).
       */
      override fun maxDeliverySeconds(maxDeliverySeconds: Number) {
        cdkBuilder.maxDeliverySeconds(maxDeliverySeconds)
      }

      /**
       * @param sendingPoolName The name of the dedicated IP pool to associate with the
       * configuration set.
       */
      override fun sendingPoolName(sendingPoolName: String) {
        cdkBuilder.sendingPoolName(sendingPoolName)
      }

      /**
       * @param tlsPolicy Specifies whether messages that use the configuration set are required to
       * use Transport Layer Security (TLS).
       * If the value is `REQUIRE` , messages are only delivered if a TLS connection can be
       * established. If the value is `OPTIONAL` , messages can be delivered in plain text if a TLS
       * connection can't be established.
       *
       * Valid Values: `REQUIRE | OPTIONAL`
       */
      override fun tlsPolicy(tlsPolicy: String) {
        cdkBuilder.tlsPolicy(tlsPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DeliveryOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.DeliveryOptionsProperty,
    ) : CdkObject(cdkObject),
        DeliveryOptionsProperty {
      /**
       * The maximum amount of time, in seconds, that Amazon SES API v2 will attempt delivery of
       * email.
       *
       * If specified, the value must greater than or equal to 300 seconds (5 minutes) and less than
       * or equal to 50400 seconds (840 minutes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-deliveryoptions.html#cfn-ses-configurationset-deliveryoptions-maxdeliveryseconds)
       */
      override fun maxDeliverySeconds(): Number? = unwrap(this).getMaxDeliverySeconds()

      /**
       * The name of the dedicated IP pool to associate with the configuration set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-deliveryoptions.html#cfn-ses-configurationset-deliveryoptions-sendingpoolname)
       */
      override fun sendingPoolName(): String? = unwrap(this).getSendingPoolName()

      /**
       * Specifies whether messages that use the configuration set are required to use Transport
       * Layer Security (TLS).
       *
       * If the value is `REQUIRE` , messages are only delivered if a TLS connection can be
       * established. If the value is `OPTIONAL` , messages can be delivered in plain text if a TLS
       * connection can't be established.
       *
       * Valid Values: `REQUIRE | OPTIONAL`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-deliveryoptions.html#cfn-ses-configurationset-deliveryoptions-tlspolicy)
       */
      override fun tlsPolicy(): String? = unwrap(this).getTlsPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeliveryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.DeliveryOptionsProperty):
          DeliveryOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? DeliveryOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeliveryOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DeliveryOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DeliveryOptionsProperty
    }
  }

  /**
   * An object containing additional settings for your VDM configuration as applicable to the
   * Guardian.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * GuardianOptionsProperty guardianOptionsProperty = GuardianOptionsProperty.builder()
   * .optimizedSharedDelivery("optimizedSharedDelivery")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-guardianoptions.html)
   */
  public interface GuardianOptionsProperty {
    /**
     * Specifies the status of your VDM optimized shared delivery. Can be one of the following:.
     *
     * * `ENABLED` – Amazon SES enables optimized shared delivery for the configuration set.
     * * `DISABLED` – Amazon SES disables optimized shared delivery for the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-guardianoptions.html#cfn-ses-configurationset-guardianoptions-optimizedshareddelivery)
     */
    public fun optimizedSharedDelivery(): String

    /**
     * A builder for [GuardianOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param optimizedSharedDelivery Specifies the status of your VDM optimized shared delivery.
       * Can be one of the following:. 
       * * `ENABLED` – Amazon SES enables optimized shared delivery for the configuration set.
       * * `DISABLED` – Amazon SES disables optimized shared delivery for the configuration set.
       */
      public fun optimizedSharedDelivery(optimizedSharedDelivery: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.GuardianOptionsProperty.Builder =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.GuardianOptionsProperty.builder()

      /**
       * @param optimizedSharedDelivery Specifies the status of your VDM optimized shared delivery.
       * Can be one of the following:. 
       * * `ENABLED` – Amazon SES enables optimized shared delivery for the configuration set.
       * * `DISABLED` – Amazon SES disables optimized shared delivery for the configuration set.
       */
      override fun optimizedSharedDelivery(optimizedSharedDelivery: String) {
        cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSet.GuardianOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.GuardianOptionsProperty,
    ) : CdkObject(cdkObject),
        GuardianOptionsProperty {
      /**
       * Specifies the status of your VDM optimized shared delivery. Can be one of the following:.
       *
       * * `ENABLED` – Amazon SES enables optimized shared delivery for the configuration set.
       * * `DISABLED` – Amazon SES disables optimized shared delivery for the configuration set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-guardianoptions.html#cfn-ses-configurationset-guardianoptions-optimizedshareddelivery)
       */
      override fun optimizedSharedDelivery(): String = unwrap(this).getOptimizedSharedDelivery()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GuardianOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.GuardianOptionsProperty):
          GuardianOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? GuardianOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GuardianOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.GuardianOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSet.GuardianOptionsProperty
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
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * ReputationOptionsProperty reputationOptionsProperty = ReputationOptionsProperty.builder()
   * .reputationMetricsEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-reputationoptions.html)
   */
  public interface ReputationOptionsProperty {
    /**
     * If `true` , tracking of reputation metrics is enabled for the configuration set.
     *
     * If `false` , tracking of reputation metrics is disabled for the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-reputationoptions.html#cfn-ses-configurationset-reputationoptions-reputationmetricsenabled)
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
          software.amazon.awscdk.services.ses.CfnConfigurationSet.ReputationOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.ReputationOptionsProperty.builder()

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
          software.amazon.awscdk.services.ses.CfnConfigurationSet.ReputationOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.ReputationOptionsProperty,
    ) : CdkObject(cdkObject),
        ReputationOptionsProperty {
      /**
       * If `true` , tracking of reputation metrics is enabled for the configuration set.
       *
       * If `false` , tracking of reputation metrics is disabled for the configuration set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-reputationoptions.html#cfn-ses-configurationset-reputationoptions-reputationmetricsenabled)
       */
      override fun reputationMetricsEnabled(): Any? = unwrap(this).getReputationMetricsEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReputationOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.ReputationOptionsProperty):
          ReputationOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReputationOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReputationOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.ReputationOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSet.ReputationOptionsProperty
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
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * SendingOptionsProperty sendingOptionsProperty = SendingOptionsProperty.builder()
   * .sendingEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-sendingoptions.html)
   */
  public interface SendingOptionsProperty {
    /**
     * If `true` , email sending is enabled for the configuration set.
     *
     * If `false` , email sending is disabled for the configuration set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-sendingoptions.html#cfn-ses-configurationset-sendingoptions-sendingenabled)
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
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SendingOptionsProperty.Builder =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SendingOptionsProperty.builder()

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
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SendingOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.SendingOptionsProperty,
    ) : CdkObject(cdkObject),
        SendingOptionsProperty {
      /**
       * If `true` , email sending is enabled for the configuration set.
       *
       * If `false` , email sending is disabled for the configuration set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-sendingoptions.html#cfn-ses-configurationset-sendingoptions-sendingenabled)
       */
      override fun sendingEnabled(): Any? = unwrap(this).getSendingEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SendingOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.SendingOptionsProperty):
          SendingOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? SendingOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SendingOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SendingOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SendingOptionsProperty
    }
  }

  /**
   * An object that contains information about the suppression list preferences for your account.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * SuppressionOptionsProperty suppressionOptionsProperty = SuppressionOptionsProperty.builder()
   * .suppressedReasons(List.of("suppressedReasons"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-suppressionoptions.html)
   */
  public interface SuppressionOptionsProperty {
    /**
     * A list that contains the reasons that email addresses are automatically added to the
     * suppression list for your account.
     *
     * This list can contain any or all of the following:
     *
     * * `COMPLAINT` – Amazon SES adds an email address to the suppression list for your account
     * when a message sent to that address results in a complaint.
     * * `BOUNCE` – Amazon SES adds an email address to the suppression list for your account when a
     * message sent to that address results in a hard bounce.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-suppressionoptions.html#cfn-ses-configurationset-suppressionoptions-suppressedreasons)
     */
    public fun suppressedReasons(): List<String> = unwrap(this).getSuppressedReasons() ?:
        emptyList()

    /**
     * A builder for [SuppressionOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param suppressedReasons A list that contains the reasons that email addresses are
       * automatically added to the suppression list for your account.
       * This list can contain any or all of the following:
       *
       * * `COMPLAINT` – Amazon SES adds an email address to the suppression list for your account
       * when a message sent to that address results in a complaint.
       * * `BOUNCE` – Amazon SES adds an email address to the suppression list for your account when
       * a message sent to that address results in a hard bounce.
       */
      public fun suppressedReasons(suppressedReasons: List<String>)

      /**
       * @param suppressedReasons A list that contains the reasons that email addresses are
       * automatically added to the suppression list for your account.
       * This list can contain any or all of the following:
       *
       * * `COMPLAINT` – Amazon SES adds an email address to the suppression list for your account
       * when a message sent to that address results in a complaint.
       * * `BOUNCE` – Amazon SES adds an email address to the suppression list for your account when
       * a message sent to that address results in a hard bounce.
       */
      public fun suppressedReasons(vararg suppressedReasons: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SuppressionOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SuppressionOptionsProperty.builder()

      /**
       * @param suppressedReasons A list that contains the reasons that email addresses are
       * automatically added to the suppression list for your account.
       * This list can contain any or all of the following:
       *
       * * `COMPLAINT` – Amazon SES adds an email address to the suppression list for your account
       * when a message sent to that address results in a complaint.
       * * `BOUNCE` – Amazon SES adds an email address to the suppression list for your account when
       * a message sent to that address results in a hard bounce.
       */
      override fun suppressedReasons(suppressedReasons: List<String>) {
        cdkBuilder.suppressedReasons(suppressedReasons)
      }

      /**
       * @param suppressedReasons A list that contains the reasons that email addresses are
       * automatically added to the suppression list for your account.
       * This list can contain any or all of the following:
       *
       * * `COMPLAINT` – Amazon SES adds an email address to the suppression list for your account
       * when a message sent to that address results in a complaint.
       * * `BOUNCE` – Amazon SES adds an email address to the suppression list for your account when
       * a message sent to that address results in a hard bounce.
       */
      override fun suppressedReasons(vararg suppressedReasons: String): Unit =
          suppressedReasons(suppressedReasons.toList())

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SuppressionOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.SuppressionOptionsProperty,
    ) : CdkObject(cdkObject),
        SuppressionOptionsProperty {
      /**
       * A list that contains the reasons that email addresses are automatically added to the
       * suppression list for your account.
       *
       * This list can contain any or all of the following:
       *
       * * `COMPLAINT` – Amazon SES adds an email address to the suppression list for your account
       * when a message sent to that address results in a complaint.
       * * `BOUNCE` – Amazon SES adds an email address to the suppression list for your account when
       * a message sent to that address results in a hard bounce.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-suppressionoptions.html#cfn-ses-configurationset-suppressionoptions-suppressedreasons)
       */
      override fun suppressedReasons(): List<String> = unwrap(this).getSuppressedReasons() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SuppressionOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.SuppressionOptionsProperty):
          SuppressionOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SuppressionOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SuppressionOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SuppressionOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SuppressionOptionsProperty
    }
  }

  /**
   * An object that defines the tracking options for a configuration set.
   *
   * When you use the Amazon SES API v2 to send an email, it contains an invisible image that's used
   * to track when recipients open your email. If your email contains links, those links are changed
   * slightly in order to track when recipients click them.
   *
   * You can optionally configure a custom subdomain that is used to redirect email recipients to an
   * Amazon SES-operated domain. This domain captures open and click events generated by Amazon SES
   * emails.
   *
   * For more information, see [Configuring Custom Domains to Handle Open and Click
   * Tracking](https://docs.aws.amazon.com/ses/latest/dg/configure-custom-open-click-domains.html) in
   * the *Amazon SES Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * TrackingOptionsProperty trackingOptionsProperty = TrackingOptionsProperty.builder()
   * .customRedirectDomain("customRedirectDomain")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-trackingoptions.html)
   */
  public interface TrackingOptionsProperty {
    /**
     * The custom subdomain that is used to redirect email recipients to the Amazon SES event
     * tracking domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-trackingoptions.html#cfn-ses-configurationset-trackingoptions-customredirectdomain)
     */
    public fun customRedirectDomain(): String? = unwrap(this).getCustomRedirectDomain()

    /**
     * A builder for [TrackingOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customRedirectDomain The custom subdomain that is used to redirect email recipients
       * to the Amazon SES event tracking domain.
       */
      public fun customRedirectDomain(customRedirectDomain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.TrackingOptionsProperty.Builder =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.TrackingOptionsProperty.builder()

      /**
       * @param customRedirectDomain The custom subdomain that is used to redirect email recipients
       * to the Amazon SES event tracking domain.
       */
      override fun customRedirectDomain(customRedirectDomain: String) {
        cdkBuilder.customRedirectDomain(customRedirectDomain)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSet.TrackingOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.TrackingOptionsProperty,
    ) : CdkObject(cdkObject),
        TrackingOptionsProperty {
      /**
       * The custom subdomain that is used to redirect email recipients to the Amazon SES event
       * tracking domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-trackingoptions.html#cfn-ses-configurationset-trackingoptions-customredirectdomain)
       */
      override fun customRedirectDomain(): String? = unwrap(this).getCustomRedirectDomain()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrackingOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.TrackingOptionsProperty):
          TrackingOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? TrackingOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrackingOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.TrackingOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSet.TrackingOptionsProperty
    }
  }

  /**
   * The Virtual Deliverability Manager (VDM) options that apply to a configuration set.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * VdmOptionsProperty vdmOptionsProperty = VdmOptionsProperty.builder()
   * .dashboardOptions(DashboardOptionsProperty.builder()
   * .engagementMetrics("engagementMetrics")
   * .build())
   * .guardianOptions(GuardianOptionsProperty.builder()
   * .optimizedSharedDelivery("optimizedSharedDelivery")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-vdmoptions.html)
   */
  public interface VdmOptionsProperty {
    /**
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-vdmoptions.html#cfn-ses-configurationset-vdmoptions-dashboardoptions)
     */
    public fun dashboardOptions(): Any? = unwrap(this).getDashboardOptions()

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-vdmoptions.html#cfn-ses-configurationset-vdmoptions-guardianoptions)
     */
    public fun guardianOptions(): Any? = unwrap(this).getGuardianOptions()

    /**
     * A builder for [VdmOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dashboardOptions Specifies additional settings for your VDM configuration as
       * applicable to the Dashboard.
       */
      public fun dashboardOptions(dashboardOptions: IResolvable)

      /**
       * @param dashboardOptions Specifies additional settings for your VDM configuration as
       * applicable to the Dashboard.
       */
      public fun dashboardOptions(dashboardOptions: DashboardOptionsProperty)

      /**
       * @param dashboardOptions Specifies additional settings for your VDM configuration as
       * applicable to the Dashboard.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ae1370c8118b3db5fccd7c5d77a47a0c9fc5c5ae23baf050aa25ce11aa094cd")
      public fun dashboardOptions(dashboardOptions: DashboardOptionsProperty.Builder.() -> Unit)

      /**
       * @param guardianOptions Specifies additional settings for your VDM configuration as
       * applicable to the Guardian.
       */
      public fun guardianOptions(guardianOptions: IResolvable)

      /**
       * @param guardianOptions Specifies additional settings for your VDM configuration as
       * applicable to the Guardian.
       */
      public fun guardianOptions(guardianOptions: GuardianOptionsProperty)

      /**
       * @param guardianOptions Specifies additional settings for your VDM configuration as
       * applicable to the Guardian.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9632d1b5dcfc878d2221fd033755a8f3e6b6e1ed1099d509a3393553918608b9")
      public fun guardianOptions(guardianOptions: GuardianOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.VdmOptionsProperty.Builder =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.VdmOptionsProperty.builder()

      /**
       * @param dashboardOptions Specifies additional settings for your VDM configuration as
       * applicable to the Dashboard.
       */
      override fun dashboardOptions(dashboardOptions: IResolvable) {
        cdkBuilder.dashboardOptions(dashboardOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dashboardOptions Specifies additional settings for your VDM configuration as
       * applicable to the Dashboard.
       */
      override fun dashboardOptions(dashboardOptions: DashboardOptionsProperty) {
        cdkBuilder.dashboardOptions(dashboardOptions.let(DashboardOptionsProperty.Companion::unwrap))
      }

      /**
       * @param dashboardOptions Specifies additional settings for your VDM configuration as
       * applicable to the Dashboard.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ae1370c8118b3db5fccd7c5d77a47a0c9fc5c5ae23baf050aa25ce11aa094cd")
      override fun dashboardOptions(dashboardOptions: DashboardOptionsProperty.Builder.() -> Unit):
          Unit = dashboardOptions(DashboardOptionsProperty(dashboardOptions))

      /**
       * @param guardianOptions Specifies additional settings for your VDM configuration as
       * applicable to the Guardian.
       */
      override fun guardianOptions(guardianOptions: IResolvable) {
        cdkBuilder.guardianOptions(guardianOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param guardianOptions Specifies additional settings for your VDM configuration as
       * applicable to the Guardian.
       */
      override fun guardianOptions(guardianOptions: GuardianOptionsProperty) {
        cdkBuilder.guardianOptions(guardianOptions.let(GuardianOptionsProperty.Companion::unwrap))
      }

      /**
       * @param guardianOptions Specifies additional settings for your VDM configuration as
       * applicable to the Guardian.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9632d1b5dcfc878d2221fd033755a8f3e6b6e1ed1099d509a3393553918608b9")
      override fun guardianOptions(guardianOptions: GuardianOptionsProperty.Builder.() -> Unit):
          Unit = guardianOptions(GuardianOptionsProperty(guardianOptions))

      public fun build(): software.amazon.awscdk.services.ses.CfnConfigurationSet.VdmOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.VdmOptionsProperty,
    ) : CdkObject(cdkObject),
        VdmOptionsProperty {
      /**
       * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-vdmoptions.html#cfn-ses-configurationset-vdmoptions-dashboardoptions)
       */
      override fun dashboardOptions(): Any? = unwrap(this).getDashboardOptions()

      /**
       * Specifies additional settings for your VDM configuration as applicable to the Guardian.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-vdmoptions.html#cfn-ses-configurationset-vdmoptions-guardianoptions)
       */
      override fun guardianOptions(): Any? = unwrap(this).getGuardianOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VdmOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.VdmOptionsProperty):
          VdmOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? VdmOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VdmOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.VdmOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnConfigurationSet.VdmOptionsProperty
    }
  }
}
