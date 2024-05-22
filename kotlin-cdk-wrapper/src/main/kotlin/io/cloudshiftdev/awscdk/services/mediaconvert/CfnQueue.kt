@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconvert

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::MediaConvert::Queue resource is an AWS Elemental MediaConvert resource type that you can
 * use to manage the resources that are available to your account for parallel processing of jobs.
 *
 * For more information about queues, see [Working with AWS Elemental MediaConvert
 * Queues](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html) in the ** .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconvert.*;
 * Object tags;
 * CfnQueue cfnQueue = CfnQueue.Builder.create(this, "MyCfnQueue")
 * .description("description")
 * .name("name")
 * .pricingPlan("pricingPlan")
 * .status("status")
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html)
 */
public open class CfnQueue(
  cdkObject: software.amazon.awscdk.services.mediaconvert.CfnQueue,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.mediaconvert.CfnQueue(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueProps,
  ) :
      this(software.amazon.awscdk.services.mediaconvert.CfnQueue(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnQueueProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueProps.Builder.() -> Unit,
  ) : this(scope, id, CfnQueueProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the queue, such as
   * `arn:aws:mediaconvert:us-west-2:123456789012` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the queue, such as `Queue 2` .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * Optional.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Optional.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The name of the queue that you are creating.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the queue that you are creating.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * When you use AWS CloudFormation , you can create only on-demand queues.
   */
  public open fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  /**
   * When you use AWS CloudFormation , you can create only on-demand queues.
   */
  public open fun pricingPlan(`value`: String) {
    unwrap(this).setPricingPlan(`value`)
  }

  /**
   * Initial state of the queue.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * Initial state of the queue.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediaconvert.CfnQueue].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Optional.
     *
     * A description of the queue that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-description)
     * @param description Optional. 
     */
    public fun description(description: String)

    /**
     * The name of the queue that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-name)
     * @param name The name of the queue that you are creating. 
     */
    public fun name(name: String)

    /**
     * When you use AWS CloudFormation , you can create only on-demand queues.
     *
     * Therefore, always set `PricingPlan` to the value "ON_DEMAND" when declaring an
     * AWS::MediaConvert::Queue in your AWS CloudFormation template.
     *
     * To create a reserved queue, use the AWS Elemental MediaConvert console at
     * https://console.aws.amazon.com/mediaconvert to set up a contract. For more information, see
     * [Working with AWS Elemental MediaConvert
     * Queues](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html) in the ** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-pricingplan)
     * @param pricingPlan When you use AWS CloudFormation , you can create only on-demand queues. 
     */
    public fun pricingPlan(pricingPlan: String)

    /**
     * Initial state of the queue.
     *
     * Queues can be either ACTIVE or PAUSED. If you create a paused queue, then jobs that you send
     * to that queue won't begin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-status)
     * @param status Initial state of the queue. 
     */
    public fun status(status: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconvert.CfnQueue.Builder =
        software.amazon.awscdk.services.mediaconvert.CfnQueue.Builder.create(scope, id)

    /**
     * Optional.
     *
     * A description of the queue that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-description)
     * @param description Optional. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the queue that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-name)
     * @param name The name of the queue that you are creating. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * When you use AWS CloudFormation , you can create only on-demand queues.
     *
     * Therefore, always set `PricingPlan` to the value "ON_DEMAND" when declaring an
     * AWS::MediaConvert::Queue in your AWS CloudFormation template.
     *
     * To create a reserved queue, use the AWS Elemental MediaConvert console at
     * https://console.aws.amazon.com/mediaconvert to set up a contract. For more information, see
     * [Working with AWS Elemental MediaConvert
     * Queues](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html) in the ** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-pricingplan)
     * @param pricingPlan When you use AWS CloudFormation , you can create only on-demand queues. 
     */
    override fun pricingPlan(pricingPlan: String) {
      cdkBuilder.pricingPlan(pricingPlan)
    }

    /**
     * Initial state of the queue.
     *
     * Queues can be either ACTIVE or PAUSED. If you create a paused queue, then jobs that you send
     * to that queue won't begin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-status)
     * @param status Initial state of the queue. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.mediaconvert.CfnQueue = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconvert.CfnQueue.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconvert.CfnQueue): CfnQueue =
        CfnQueue(cdkObject)

    internal fun unwrap(wrapped: CfnQueue): software.amazon.awscdk.services.mediaconvert.CfnQueue =
        wrapped.cdkObject as software.amazon.awscdk.services.mediaconvert.CfnQueue
  }
}
