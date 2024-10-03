@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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
 * Use the `AWS::DMS::EventSubscription` resource to get notifications for AWS Database Migration
 * Service events through the Amazon Simple Notification Service .
 *
 * For more information, see [Working with events and notifications in AWS Database Migration
 * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html) in the *AWS Database
 * Migration Service User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dms.*;
 * CfnEventSubscription cfnEventSubscription = CfnEventSubscription.Builder.create(this,
 * "MyCfnEventSubscription")
 * .snsTopicArn("snsTopicArn")
 * // the properties below are optional
 * .enabled(false)
 * .eventCategories(List.of("eventCategories"))
 * .sourceIds(List.of("sourceIds"))
 * .sourceType("sourceType")
 * .subscriptionName("subscriptionName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html)
 */
public open class CfnEventSubscription(
  cdkObject: software.amazon.awscdk.services.dms.CfnEventSubscription,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventSubscriptionProps,
  ) :
      this(software.amazon.awscdk.services.dms.CfnEventSubscription(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
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
   * Indicates whether to activate the subscription.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Indicates whether to activate the subscription.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Indicates whether to activate the subscription.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of event categories for a source type that you want to subscribe to.
   */
  public open fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

  /**
   * A list of event categories for a source type that you want to subscribe to.
   */
  public open fun eventCategories(`value`: List<String>) {
    unwrap(this).setEventCategories(`value`)
  }

  /**
   * A list of event categories for a source type that you want to subscribe to.
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
   * The Amazon Resource Name (ARN) of the Amazon SNS topic created for event notification.
   */
  public open fun snsTopicArn(): String = unwrap(this).getSnsTopicArn()

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic created for event notification.
   */
  public open fun snsTopicArn(`value`: String) {
    unwrap(this).setSnsTopicArn(`value`)
  }

  /**
   * A list of identifiers for which AWS DMS provides notification events.
   */
  public open fun sourceIds(): List<String> = unwrap(this).getSourceIds() ?: emptyList()

  /**
   * A list of identifiers for which AWS DMS provides notification events.
   */
  public open fun sourceIds(`value`: List<String>) {
    unwrap(this).setSourceIds(`value`)
  }

  /**
   * A list of identifiers for which AWS DMS provides notification events.
   */
  public open fun sourceIds(vararg `value`: String): Unit = sourceIds(`value`.toList())

  /**
   * The type of AWS DMS resource that generates the events.
   */
  public open fun sourceType(): String? = unwrap(this).getSourceType()

  /**
   * The type of AWS DMS resource that generates the events.
   */
  public open fun sourceType(`value`: String) {
    unwrap(this).setSourceType(`value`)
  }

  /**
   * The name of the AWS DMS event notification subscription.
   */
  public open fun subscriptionName(): String? = unwrap(this).getSubscriptionName()

  /**
   * The name of the AWS DMS event notification subscription.
   */
  public open fun subscriptionName(`value`: String) {
    unwrap(this).setSubscriptionName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * One or more tags to be assigned to the event subscription.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * One or more tags to be assigned to the event subscription.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * One or more tags to be assigned to the event subscription.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dms.CfnEventSubscription].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether to activate the subscription.
     *
     * If you don't specify this property, AWS CloudFormation activates the subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-enabled)
     * @param enabled Indicates whether to activate the subscription. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Indicates whether to activate the subscription.
     *
     * If you don't specify this property, AWS CloudFormation activates the subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-enabled)
     * @param enabled Indicates whether to activate the subscription. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * A list of event categories for a source type that you want to subscribe to.
     *
     * If you don't specify this property, you are notified about all event categories. For more
     * information, see [Working with Events and
     * Notifications](https://docs.aws.amazon.com//dms/latest/userguide/CHAP_Events.html) in the *AWS
     * DMS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-eventcategories)
     * @param eventCategories A list of event categories for a source type that you want to
     * subscribe to. 
     */
    public fun eventCategories(eventCategories: List<String>)

    /**
     * A list of event categories for a source type that you want to subscribe to.
     *
     * If you don't specify this property, you are notified about all event categories. For more
     * information, see [Working with Events and
     * Notifications](https://docs.aws.amazon.com//dms/latest/userguide/CHAP_Events.html) in the *AWS
     * DMS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-eventcategories)
     * @param eventCategories A list of event categories for a source type that you want to
     * subscribe to. 
     */
    public fun eventCategories(vararg eventCategories: String)

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic created for event notification.
     *
     * The ARN is created by Amazon SNS when you create a topic and subscribe to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-snstopicarn)
     * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic created for event
     * notification. 
     */
    public fun snsTopicArn(snsTopicArn: String)

    /**
     * A list of identifiers for which AWS DMS provides notification events.
     *
     * If you don't specify a value, notifications are provided for all sources.
     *
     * If you specify multiple values, they must be of the same type. For example, if you specify a
     * database instance ID, then all of the other values must be database instance IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourceids)
     * @param sourceIds A list of identifiers for which AWS DMS provides notification events. 
     */
    public fun sourceIds(sourceIds: List<String>)

    /**
     * A list of identifiers for which AWS DMS provides notification events.
     *
     * If you don't specify a value, notifications are provided for all sources.
     *
     * If you specify multiple values, they must be of the same type. For example, if you specify a
     * database instance ID, then all of the other values must be database instance IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourceids)
     * @param sourceIds A list of identifiers for which AWS DMS provides notification events. 
     */
    public fun sourceIds(vararg sourceIds: String)

    /**
     * The type of AWS DMS resource that generates the events.
     *
     * For example, if you want to be notified of events generated by a replication instance, you
     * set this parameter to `replication-instance` . If this value isn't specified, all events are
     * returned.
     *
     * *Valid values* : `replication-instance` | `replication-task`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourcetype)
     * @param sourceType The type of AWS DMS resource that generates the events. 
     */
    public fun sourceType(sourceType: String)

    /**
     * The name of the AWS DMS event notification subscription.
     *
     * This name must be less than 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-subscriptionname)
     * @param subscriptionName The name of the AWS DMS event notification subscription. 
     */
    public fun subscriptionName(subscriptionName: String)

    /**
     * One or more tags to be assigned to the event subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-tags)
     * @param tags One or more tags to be assigned to the event subscription. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * One or more tags to be assigned to the event subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-tags)
     * @param tags One or more tags to be assigned to the event subscription. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnEventSubscription.Builder =
        software.amazon.awscdk.services.dms.CfnEventSubscription.Builder.create(scope, id)

    /**
     * Indicates whether to activate the subscription.
     *
     * If you don't specify this property, AWS CloudFormation activates the subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-enabled)
     * @param enabled Indicates whether to activate the subscription. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Indicates whether to activate the subscription.
     *
     * If you don't specify this property, AWS CloudFormation activates the subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-enabled)
     * @param enabled Indicates whether to activate the subscription. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of event categories for a source type that you want to subscribe to.
     *
     * If you don't specify this property, you are notified about all event categories. For more
     * information, see [Working with Events and
     * Notifications](https://docs.aws.amazon.com//dms/latest/userguide/CHAP_Events.html) in the *AWS
     * DMS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-eventcategories)
     * @param eventCategories A list of event categories for a source type that you want to
     * subscribe to. 
     */
    override fun eventCategories(eventCategories: List<String>) {
      cdkBuilder.eventCategories(eventCategories)
    }

    /**
     * A list of event categories for a source type that you want to subscribe to.
     *
     * If you don't specify this property, you are notified about all event categories. For more
     * information, see [Working with Events and
     * Notifications](https://docs.aws.amazon.com//dms/latest/userguide/CHAP_Events.html) in the *AWS
     * DMS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-eventcategories)
     * @param eventCategories A list of event categories for a source type that you want to
     * subscribe to. 
     */
    override fun eventCategories(vararg eventCategories: String): Unit =
        eventCategories(eventCategories.toList())

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic created for event notification.
     *
     * The ARN is created by Amazon SNS when you create a topic and subscribe to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-snstopicarn)
     * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic created for event
     * notification. 
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * A list of identifiers for which AWS DMS provides notification events.
     *
     * If you don't specify a value, notifications are provided for all sources.
     *
     * If you specify multiple values, they must be of the same type. For example, if you specify a
     * database instance ID, then all of the other values must be database instance IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourceids)
     * @param sourceIds A list of identifiers for which AWS DMS provides notification events. 
     */
    override fun sourceIds(sourceIds: List<String>) {
      cdkBuilder.sourceIds(sourceIds)
    }

    /**
     * A list of identifiers for which AWS DMS provides notification events.
     *
     * If you don't specify a value, notifications are provided for all sources.
     *
     * If you specify multiple values, they must be of the same type. For example, if you specify a
     * database instance ID, then all of the other values must be database instance IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourceids)
     * @param sourceIds A list of identifiers for which AWS DMS provides notification events. 
     */
    override fun sourceIds(vararg sourceIds: String): Unit = sourceIds(sourceIds.toList())

    /**
     * The type of AWS DMS resource that generates the events.
     *
     * For example, if you want to be notified of events generated by a replication instance, you
     * set this parameter to `replication-instance` . If this value isn't specified, all events are
     * returned.
     *
     * *Valid values* : `replication-instance` | `replication-task`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourcetype)
     * @param sourceType The type of AWS DMS resource that generates the events. 
     */
    override fun sourceType(sourceType: String) {
      cdkBuilder.sourceType(sourceType)
    }

    /**
     * The name of the AWS DMS event notification subscription.
     *
     * This name must be less than 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-subscriptionname)
     * @param subscriptionName The name of the AWS DMS event notification subscription. 
     */
    override fun subscriptionName(subscriptionName: String) {
      cdkBuilder.subscriptionName(subscriptionName)
    }

    /**
     * One or more tags to be assigned to the event subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-tags)
     * @param tags One or more tags to be assigned to the event subscription. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * One or more tags to be assigned to the event subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-tags)
     * @param tags One or more tags to be assigned to the event subscription. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.dms.CfnEventSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dms.CfnEventSubscription.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventSubscription(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEventSubscription):
        CfnEventSubscription = CfnEventSubscription(cdkObject)

    internal fun unwrap(wrapped: CfnEventSubscription):
        software.amazon.awscdk.services.dms.CfnEventSubscription = wrapped.cdkObject as
        software.amazon.awscdk.services.dms.CfnEventSubscription
  }
}
