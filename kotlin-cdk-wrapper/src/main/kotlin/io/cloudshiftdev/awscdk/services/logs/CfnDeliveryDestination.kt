@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This structure contains information about one *delivery destination* in your account.
 *
 * A delivery destination is an AWS resource that represents an AWS service that logs can be sent
 * to. CloudWatch Logs, Amazon S3, Firehose, and X-Ray are supported as delivery destinations.
 *
 * To configure logs delivery between a supported AWS service and a destination, you must do the
 * following:
 *
 * * Create a delivery source, which is a logical object that represents the resource that is
 * actually sending the logs. For more information, see
 * [PutDeliverySource](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliverySource.html)
 * .
 * * Create a *delivery destination* , which is a logical object that represents the actual delivery
 * destination.
 * * If you are delivering logs cross-account, you must use
 * [PutDeliveryDestinationPolicy](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html)
 * in the destination account to assign an IAM policy to the destination. This policy allows delivery
 * to that destination.
 * * Create a *delivery* by pairing exactly one delivery source and one delivery destination. For
 * more information, see
 * [CreateDelivery](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateDelivery.html)
 * .
 *
 * You can configure a single delivery source to send logs to multiple destinations by creating
 * multiple deliveries. You can also create multiple deliveries to configure multiple delivery sources
 * to send logs to the same delivery destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * Object deliveryDestinationPolicy;
 * CfnDeliveryDestination cfnDeliveryDestination = CfnDeliveryDestination.Builder.create(this,
 * "MyCfnDeliveryDestination")
 * .name("name")
 * // the properties below are optional
 * .deliveryDestinationPolicy(DestinationPolicyProperty.builder()
 * .deliveryDestinationName("deliveryDestinationName")
 * .deliveryDestinationPolicy(deliveryDestinationPolicy)
 * .build())
 * .destinationResourceArn("destinationResourceArn")
 * .outputFormat("outputFormat")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html)
 */
public open class CfnDeliveryDestination(
  cdkObject: software.amazon.awscdk.services.logs.CfnDeliveryDestination,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeliveryDestinationProps,
  ) :
      this(software.amazon.awscdk.services.logs.CfnDeliveryDestination(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDeliveryDestinationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeliveryDestinationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeliveryDestinationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) that uniquely identifies this delivery destination.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Displays whether this delivery destination is CloudWatch Logs, Amazon S3, Firehose, or X-Ray.
   */
  public open fun attrDeliveryDestinationType(): String =
      unwrap(this).getAttrDeliveryDestinationType()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * An IAM policy that grants permissions to CloudWatch Logs to deliver logs cross-account to a
   * specified destination in this account.
   */
  public open fun deliveryDestinationPolicy(): Any? = unwrap(this).getDeliveryDestinationPolicy()

  /**
   * An IAM policy that grants permissions to CloudWatch Logs to deliver logs cross-account to a
   * specified destination in this account.
   */
  public open fun deliveryDestinationPolicy(`value`: IResolvable) {
    unwrap(this).setDeliveryDestinationPolicy(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An IAM policy that grants permissions to CloudWatch Logs to deliver logs cross-account to a
   * specified destination in this account.
   */
  public open fun deliveryDestinationPolicy(`value`: DestinationPolicyProperty) {
    unwrap(this).setDeliveryDestinationPolicy(`value`.let(DestinationPolicyProperty.Companion::unwrap))
  }

  /**
   * An IAM policy that grants permissions to CloudWatch Logs to deliver logs cross-account to a
   * specified destination in this account.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("924db3eb059c4eb08818f353e8dafaa4f66fbcff2f392532fcc616d172b1015e")
  public open fun deliveryDestinationPolicy(`value`: DestinationPolicyProperty.Builder.() -> Unit):
      Unit = deliveryDestinationPolicy(DestinationPolicyProperty(`value`))

  /**
   * The ARN of the AWS destination that this delivery destination represents.
   */
  public open fun destinationResourceArn(): String? = unwrap(this).getDestinationResourceArn()

  /**
   * The ARN of the AWS destination that this delivery destination represents.
   */
  public open fun destinationResourceArn(`value`: String) {
    unwrap(this).setDestinationResourceArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of this delivery destination.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of this delivery destination.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The format of the logs that are sent to this delivery destination.
   */
  public open fun outputFormat(): String? = unwrap(this).getOutputFormat()

  /**
   * The format of the logs that are sent to this delivery destination.
   */
  public open fun outputFormat(`value`: String) {
    unwrap(this).setOutputFormat(`value`)
  }

  /**
   * An array of key-value pairs to apply to the delivery destination.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to the delivery destination.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to the delivery destination.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CfnDeliveryDestination].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An IAM policy that grants permissions to CloudWatch Logs to deliver logs cross-account to a
     * specified destination in this account.
     *
     * For examples of this policy, see
     * [Examples](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html#API_PutDeliveryDestinationPolicy_Examples)
     * in the CloudWatch Logs API Reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-deliverydestinationpolicy)
     * @param deliveryDestinationPolicy An IAM policy that grants permissions to CloudWatch Logs to
     * deliver logs cross-account to a specified destination in this account. 
     */
    public fun deliveryDestinationPolicy(deliveryDestinationPolicy: IResolvable)

    /**
     * An IAM policy that grants permissions to CloudWatch Logs to deliver logs cross-account to a
     * specified destination in this account.
     *
     * For examples of this policy, see
     * [Examples](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html#API_PutDeliveryDestinationPolicy_Examples)
     * in the CloudWatch Logs API Reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-deliverydestinationpolicy)
     * @param deliveryDestinationPolicy An IAM policy that grants permissions to CloudWatch Logs to
     * deliver logs cross-account to a specified destination in this account. 
     */
    public fun deliveryDestinationPolicy(deliveryDestinationPolicy: DestinationPolicyProperty)

    /**
     * An IAM policy that grants permissions to CloudWatch Logs to deliver logs cross-account to a
     * specified destination in this account.
     *
     * For examples of this policy, see
     * [Examples](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html#API_PutDeliveryDestinationPolicy_Examples)
     * in the CloudWatch Logs API Reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-deliverydestinationpolicy)
     * @param deliveryDestinationPolicy An IAM policy that grants permissions to CloudWatch Logs to
     * deliver logs cross-account to a specified destination in this account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95249d964b9c67024c4eece04b2c06f7525c86dd25b2b4469587c4df20f69f42")
    public
        fun deliveryDestinationPolicy(deliveryDestinationPolicy: DestinationPolicyProperty.Builder.() -> Unit)

    /**
     * The ARN of the AWS destination that this delivery destination represents.
     *
     * That AWS destination can be a log group in CloudWatch Logs , an Amazon S3 bucket, or a
     * Firehose stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-destinationresourcearn)
     * @param destinationResourceArn The ARN of the AWS destination that this delivery destination
     * represents. 
     */
    public fun destinationResourceArn(destinationResourceArn: String)

    /**
     * The name of this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-name)
     * @param name The name of this delivery destination. 
     */
    public fun name(name: String)

    /**
     * The format of the logs that are sent to this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-outputformat)
     * @param outputFormat The format of the logs that are sent to this delivery destination. 
     */
    public fun outputFormat(outputFormat: String)

    /**
     * An array of key-value pairs to apply to the delivery destination.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-tags)
     * @param tags An array of key-value pairs to apply to the delivery destination. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to the delivery destination.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-tags)
     * @param tags An array of key-value pairs to apply to the delivery destination. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDeliveryDestination.Builder =
        software.amazon.awscdk.services.logs.CfnDeliveryDestination.Builder.create(scope, id)

    /**
     * An IAM policy that grants permissions to CloudWatch Logs to deliver logs cross-account to a
     * specified destination in this account.
     *
     * For examples of this policy, see
     * [Examples](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html#API_PutDeliveryDestinationPolicy_Examples)
     * in the CloudWatch Logs API Reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-deliverydestinationpolicy)
     * @param deliveryDestinationPolicy An IAM policy that grants permissions to CloudWatch Logs to
     * deliver logs cross-account to a specified destination in this account. 
     */
    override fun deliveryDestinationPolicy(deliveryDestinationPolicy: IResolvable) {
      cdkBuilder.deliveryDestinationPolicy(deliveryDestinationPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * An IAM policy that grants permissions to CloudWatch Logs to deliver logs cross-account to a
     * specified destination in this account.
     *
     * For examples of this policy, see
     * [Examples](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html#API_PutDeliveryDestinationPolicy_Examples)
     * in the CloudWatch Logs API Reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-deliverydestinationpolicy)
     * @param deliveryDestinationPolicy An IAM policy that grants permissions to CloudWatch Logs to
     * deliver logs cross-account to a specified destination in this account. 
     */
    override fun deliveryDestinationPolicy(deliveryDestinationPolicy: DestinationPolicyProperty) {
      cdkBuilder.deliveryDestinationPolicy(deliveryDestinationPolicy.let(DestinationPolicyProperty.Companion::unwrap))
    }

    /**
     * An IAM policy that grants permissions to CloudWatch Logs to deliver logs cross-account to a
     * specified destination in this account.
     *
     * For examples of this policy, see
     * [Examples](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html#API_PutDeliveryDestinationPolicy_Examples)
     * in the CloudWatch Logs API Reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-deliverydestinationpolicy)
     * @param deliveryDestinationPolicy An IAM policy that grants permissions to CloudWatch Logs to
     * deliver logs cross-account to a specified destination in this account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95249d964b9c67024c4eece04b2c06f7525c86dd25b2b4469587c4df20f69f42")
    override
        fun deliveryDestinationPolicy(deliveryDestinationPolicy: DestinationPolicyProperty.Builder.() -> Unit):
        Unit = deliveryDestinationPolicy(DestinationPolicyProperty(deliveryDestinationPolicy))

    /**
     * The ARN of the AWS destination that this delivery destination represents.
     *
     * That AWS destination can be a log group in CloudWatch Logs , an Amazon S3 bucket, or a
     * Firehose stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-destinationresourcearn)
     * @param destinationResourceArn The ARN of the AWS destination that this delivery destination
     * represents. 
     */
    override fun destinationResourceArn(destinationResourceArn: String) {
      cdkBuilder.destinationResourceArn(destinationResourceArn)
    }

    /**
     * The name of this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-name)
     * @param name The name of this delivery destination. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The format of the logs that are sent to this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-outputformat)
     * @param outputFormat The format of the logs that are sent to this delivery destination. 
     */
    override fun outputFormat(outputFormat: String) {
      cdkBuilder.outputFormat(outputFormat)
    }

    /**
     * An array of key-value pairs to apply to the delivery destination.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-tags)
     * @param tags An array of key-value pairs to apply to the delivery destination. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to the delivery destination.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-tags)
     * @param tags An array of key-value pairs to apply to the delivery destination. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnDeliveryDestination =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.logs.CfnDeliveryDestination.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeliveryDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeliveryDestination(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDeliveryDestination):
        CfnDeliveryDestination = CfnDeliveryDestination(cdkObject)

    internal fun unwrap(wrapped: CfnDeliveryDestination):
        software.amazon.awscdk.services.logs.CfnDeliveryDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.CfnDeliveryDestination
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * Object deliveryDestinationPolicy;
   * DestinationPolicyProperty destinationPolicyProperty = DestinationPolicyProperty.builder()
   * .deliveryDestinationName("deliveryDestinationName")
   * .deliveryDestinationPolicy(deliveryDestinationPolicy)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-deliverydestination-destinationpolicy.html)
   */
  public interface DestinationPolicyProperty {
    /**
     * The name of the delivery destination to assign this policy to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-deliverydestination-destinationpolicy.html#cfn-logs-deliverydestination-destinationpolicy-deliverydestinationname)
     */
    public fun deliveryDestinationName(): String? = unwrap(this).getDeliveryDestinationName()

    /**
     * The contents of the policy attached to the delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-deliverydestination-destinationpolicy.html#cfn-logs-deliverydestination-destinationpolicy-deliverydestinationpolicy)
     */
    public fun deliveryDestinationPolicy(): Any? = unwrap(this).getDeliveryDestinationPolicy()

    /**
     * A builder for [DestinationPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deliveryDestinationName The name of the delivery destination to assign this policy
       * to.
       */
      public fun deliveryDestinationName(deliveryDestinationName: String)

      /**
       * @param deliveryDestinationPolicy The contents of the policy attached to the delivery
       * destination.
       */
      public fun deliveryDestinationPolicy(deliveryDestinationPolicy: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnDeliveryDestination.DestinationPolicyProperty.Builder
          =
          software.amazon.awscdk.services.logs.CfnDeliveryDestination.DestinationPolicyProperty.builder()

      /**
       * @param deliveryDestinationName The name of the delivery destination to assign this policy
       * to.
       */
      override fun deliveryDestinationName(deliveryDestinationName: String) {
        cdkBuilder.deliveryDestinationName(deliveryDestinationName)
      }

      /**
       * @param deliveryDestinationPolicy The contents of the policy attached to the delivery
       * destination.
       */
      override fun deliveryDestinationPolicy(deliveryDestinationPolicy: Any) {
        cdkBuilder.deliveryDestinationPolicy(deliveryDestinationPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.logs.CfnDeliveryDestination.DestinationPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnDeliveryDestination.DestinationPolicyProperty,
    ) : CdkObject(cdkObject),
        DestinationPolicyProperty {
      /**
       * The name of the delivery destination to assign this policy to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-deliverydestination-destinationpolicy.html#cfn-logs-deliverydestination-destinationpolicy-deliverydestinationname)
       */
      override fun deliveryDestinationName(): String? = unwrap(this).getDeliveryDestinationName()

      /**
       * The contents of the policy attached to the delivery destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-deliverydestination-destinationpolicy.html#cfn-logs-deliverydestination-destinationpolicy-deliverydestinationpolicy)
       */
      override fun deliveryDestinationPolicy(): Any? = unwrap(this).getDeliveryDestinationPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDeliveryDestination.DestinationPolicyProperty):
          DestinationPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DestinationPolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationPolicyProperty):
          software.amazon.awscdk.services.logs.CfnDeliveryDestination.DestinationPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnDeliveryDestination.DestinationPolicyProperty
    }
  }
}
