@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.neptune

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an event notification subscription.
 *
 * This action requires a topic ARN (Amazon Resource Name) created by either the Neptune console,
 * the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in Amazon SNS
 * and subscribe to the topic. The ARN is displayed in the SNS console.
 *
 * You can specify the type of source (SourceType) you want to be notified of, provide a list of
 * Neptune sources (SourceIds) that triggers the events, and provide a list of event categories
 * (EventCategories) for events you want to be notified of. For example, you can specify SourceType =
 * db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories = Availability, Backup.
 *
 * If you specify both the SourceType and SourceIds, such as SourceType = db-instance and
 * SourceIdentifier = myDBInstance1, you are notified of all the db-instance events for the specified
 * source. If you specify a SourceType but do not specify a SourceIdentifier, you receive notice of the
 * events for that source type for all your Neptune sources. If you do not specify either the
 * SourceType nor the SourceIdentifier, you are notified of events generated from all Neptune sources
 * belonging to your customer account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.neptune.*;
 * CfnEventSubscription cfnEventSubscription = CfnEventSubscription.Builder.create(this,
 * "MyCfnEventSubscription")
 * .enabled(false)
 * .eventCategories(List.of("eventCategories"))
 * .snsTopicArn("snsTopicArn")
 * .sourceIds(List.of("sourceIds"))
 * .sourceType("sourceType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html)
 */
public open class CfnEventSubscription(
  cdkObject: software.amazon.awscdk.services.neptune.CfnEventSubscription,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.neptune.CfnEventSubscription(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventSubscriptionProps,
  ) :
      this(software.amazon.awscdk.services.neptune.CfnEventSubscription(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEventSubscriptionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventSubscriptionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventSubscriptionProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A Boolean value indicating if the subscription is enabled.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * A Boolean value indicating if the subscription is enabled.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * A Boolean value indicating if the subscription is enabled.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

  /**
   *
   */
  public open fun eventCategories(`value`: List<String>) {
    unwrap(this).setEventCategories(`value`)
  }

  /**
   *
   */
  public open fun eventCategories(vararg `value`: String): Unit = eventCategories(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The topic ARN of the event notification subscription.
   */
  public open fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  /**
   * The topic ARN of the event notification subscription.
   */
  public open fun snsTopicArn(`value`: String) {
    unwrap(this).setSnsTopicArn(`value`)
  }

  /**
   *
   */
  public open fun sourceIds(): List<String> = unwrap(this).getSourceIds() ?: emptyList()

  /**
   *
   */
  public open fun sourceIds(`value`: List<String>) {
    unwrap(this).setSourceIds(`value`)
  }

  /**
   *
   */
  public open fun sourceIds(vararg `value`: String): Unit = sourceIds(`value`.toList())

  /**
   * The source type for the event notification subscription.
   */
  public open fun sourceType(): String? = unwrap(this).getSourceType()

  /**
   * The source type for the event notification subscription.
   */
  public open fun sourceType(`value`: String) {
    unwrap(this).setSourceType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.neptune.CfnEventSubscription].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A Boolean value indicating if the subscription is enabled.
     *
     * True indicates the subscription is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-enabled)
     * @param enabled A Boolean value indicating if the subscription is enabled. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * A Boolean value indicating if the subscription is enabled.
     *
     * True indicates the subscription is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-enabled)
     * @param enabled A Boolean value indicating if the subscription is enabled. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-eventcategories)
     * @param eventCategories 
     */
    public fun eventCategories(eventCategories: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-eventcategories)
     * @param eventCategories 
     */
    public fun eventCategories(vararg eventCategories: String)

    /**
     * The topic ARN of the event notification subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-snstopicarn)
     * @param snsTopicArn The topic ARN of the event notification subscription. 
     */
    public fun snsTopicArn(snsTopicArn: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-sourceids)
     * @param sourceIds 
     */
    public fun sourceIds(sourceIds: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-sourceids)
     * @param sourceIds 
     */
    public fun sourceIds(vararg sourceIds: String)

    /**
     * The source type for the event notification subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-sourcetype)
     * @param sourceType The source type for the event notification subscription. 
     */
    public fun sourceType(sourceType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.neptune.CfnEventSubscription.Builder =
        software.amazon.awscdk.services.neptune.CfnEventSubscription.Builder.create(scope, id)

    /**
     * A Boolean value indicating if the subscription is enabled.
     *
     * True indicates the subscription is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-enabled)
     * @param enabled A Boolean value indicating if the subscription is enabled. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * A Boolean value indicating if the subscription is enabled.
     *
     * True indicates the subscription is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-enabled)
     * @param enabled A Boolean value indicating if the subscription is enabled. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-eventcategories)
     * @param eventCategories 
     */
    override fun eventCategories(eventCategories: List<String>) {
      cdkBuilder.eventCategories(eventCategories)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-eventcategories)
     * @param eventCategories 
     */
    override fun eventCategories(vararg eventCategories: String): Unit =
        eventCategories(eventCategories.toList())

    /**
     * The topic ARN of the event notification subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-snstopicarn)
     * @param snsTopicArn The topic ARN of the event notification subscription. 
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-sourceids)
     * @param sourceIds 
     */
    override fun sourceIds(sourceIds: List<String>) {
      cdkBuilder.sourceIds(sourceIds)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-sourceids)
     * @param sourceIds 
     */
    override fun sourceIds(vararg sourceIds: String): Unit = sourceIds(sourceIds.toList())

    /**
     * The source type for the event notification subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-sourcetype)
     * @param sourceType The source type for the event notification subscription. 
     */
    override fun sourceType(sourceType: String) {
      cdkBuilder.sourceType(sourceType)
    }

    public fun build(): software.amazon.awscdk.services.neptune.CfnEventSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.neptune.CfnEventSubscription.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventSubscription(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnEventSubscription):
        CfnEventSubscription = CfnEventSubscription(cdkObject)

    internal fun unwrap(wrapped: CfnEventSubscription):
        software.amazon.awscdk.services.neptune.CfnEventSubscription = wrapped.cdkObject as
        software.amazon.awscdk.services.neptune.CfnEventSubscription
  }
}
