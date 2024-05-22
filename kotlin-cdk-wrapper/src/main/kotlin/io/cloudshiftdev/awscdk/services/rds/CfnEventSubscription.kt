@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

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
 * The `AWS::RDS::EventSubscription` resource allows you to receive notifications for Amazon
 * Relational Database Service events through the Amazon Simple Notification Service (Amazon SNS).
 *
 * For more information, see [Using Amazon RDS Event
 * Notification](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html) in the
 * *Amazon RDS User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html)
 */
public open class CfnEventSubscription(
  cdkObject: software.amazon.awscdk.services.rds.CfnEventSubscription,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventSubscriptionProps,
  ) :
      this(software.amazon.awscdk.services.rds.CfnEventSubscription(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEventSubscriptionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventSubscriptionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventSubscriptionProps(props)
  )

  /**
   * Specifies whether to activate the subscription.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Specifies whether to activate the subscription.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Specifies whether to activate the subscription.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of event categories for a particular source type ( `SourceType` ) that you want to
   * subscribe to.
   */
  public open fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

  /**
   * A list of event categories for a particular source type ( `SourceType` ) that you want to
   * subscribe to.
   */
  public open fun eventCategories(`value`: List<String>) {
    unwrap(this).setEventCategories(`value`)
  }

  /**
   * A list of event categories for a particular source type ( `SourceType` ) that you want to
   * subscribe to.
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
   * The Amazon Resource Name (ARN) of the SNS topic created for event notification.
   */
  public open fun snsTopicArn(): String = unwrap(this).getSnsTopicArn()

  /**
   * The Amazon Resource Name (ARN) of the SNS topic created for event notification.
   */
  public open fun snsTopicArn(`value`: String) {
    unwrap(this).setSnsTopicArn(`value`)
  }

  /**
   * The list of identifiers of the event sources for which events are returned.
   */
  public open fun sourceIds(): List<String> = unwrap(this).getSourceIds() ?: emptyList()

  /**
   * The list of identifiers of the event sources for which events are returned.
   */
  public open fun sourceIds(`value`: List<String>) {
    unwrap(this).setSourceIds(`value`)
  }

  /**
   * The list of identifiers of the event sources for which events are returned.
   */
  public open fun sourceIds(vararg `value`: String): Unit = sourceIds(`value`.toList())

  /**
   * The type of source that is generating the events.
   */
  public open fun sourceType(): String? = unwrap(this).getSourceType()

  /**
   * The type of source that is generating the events.
   */
  public open fun sourceType(`value`: String) {
    unwrap(this).setSourceType(`value`)
  }

  /**
   * The name of the subscription.
   */
  public open fun subscriptionName(): String? = unwrap(this).getSubscriptionName()

  /**
   * The name of the subscription.
   */
  public open fun subscriptionName(`value`: String) {
    unwrap(this).setSubscriptionName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An optional array of key-value pairs to apply to this subscription.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An optional array of key-value pairs to apply to this subscription.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An optional array of key-value pairs to apply to this subscription.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnEventSubscription].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether to activate the subscription.
     *
     * If the event notification subscription isn't activated, the subscription is created but not
     * active.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled)
     * @param enabled Specifies whether to activate the subscription. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Specifies whether to activate the subscription.
     *
     * If the event notification subscription isn't activated, the subscription is created but not
     * active.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled)
     * @param enabled Specifies whether to activate the subscription. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * A list of event categories for a particular source type ( `SourceType` ) that you want to
     * subscribe to.
     *
     * You can see a list of the categories for a given source type in the "Amazon RDS event
     * categories and event messages" section of the [*Amazon RDS User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html) or the
     * [*Amazon Aurora User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html)
     * . You can also see this list by using the `DescribeEventCategories` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories)
     * @param eventCategories A list of event categories for a particular source type ( `SourceType`
     * ) that you want to subscribe to. 
     */
    public fun eventCategories(eventCategories: List<String>)

    /**
     * A list of event categories for a particular source type ( `SourceType` ) that you want to
     * subscribe to.
     *
     * You can see a list of the categories for a given source type in the "Amazon RDS event
     * categories and event messages" section of the [*Amazon RDS User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html) or the
     * [*Amazon Aurora User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html)
     * . You can also see this list by using the `DescribeEventCategories` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories)
     * @param eventCategories A list of event categories for a particular source type ( `SourceType`
     * ) that you want to subscribe to. 
     */
    public fun eventCategories(vararg eventCategories: String)

    /**
     * The Amazon Resource Name (ARN) of the SNS topic created for event notification.
     *
     * SNS automatically creates the ARN when you create a topic and subscribe to it.
     *
     *
     * RDS doesn't support FIFO (first in, first out) topics. For more information, see [Message
     * ordering and deduplication (FIFO
     * topics)](https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html) in the *Amazon Simple
     * Notification Service Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn)
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic created for event
     * notification. 
     */
    public fun snsTopicArn(snsTopicArn: String)

    /**
     * The list of identifiers of the event sources for which events are returned.
     *
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens. It can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If a `SourceIds` value is supplied, `SourceType` must also be provided.
     * * If the source type is a DB instance, a `DBInstanceIdentifier` value must be supplied.
     * * If the source type is a DB cluster, a `DBClusterIdentifier` value must be supplied.
     * * If the source type is a DB parameter group, a `DBParameterGroupName` value must be
     * supplied.
     * * If the source type is a DB security group, a `DBSecurityGroupName` value must be supplied.
     * * If the source type is a DB snapshot, a `DBSnapshotIdentifier` value must be supplied.
     * * If the source type is a DB cluster snapshot, a `DBClusterSnapshotIdentifier` value must be
     * supplied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids)
     * @param sourceIds The list of identifiers of the event sources for which events are returned. 
     */
    public fun sourceIds(sourceIds: List<String>)

    /**
     * The list of identifiers of the event sources for which events are returned.
     *
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens. It can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If a `SourceIds` value is supplied, `SourceType` must also be provided.
     * * If the source type is a DB instance, a `DBInstanceIdentifier` value must be supplied.
     * * If the source type is a DB cluster, a `DBClusterIdentifier` value must be supplied.
     * * If the source type is a DB parameter group, a `DBParameterGroupName` value must be
     * supplied.
     * * If the source type is a DB security group, a `DBSecurityGroupName` value must be supplied.
     * * If the source type is a DB snapshot, a `DBSnapshotIdentifier` value must be supplied.
     * * If the source type is a DB cluster snapshot, a `DBClusterSnapshotIdentifier` value must be
     * supplied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids)
     * @param sourceIds The list of identifiers of the event sources for which events are returned. 
     */
    public fun sourceIds(vararg sourceIds: String)

    /**
     * The type of source that is generating the events.
     *
     * For example, if you want to be notified of events generated by a DB instance, set this
     * parameter to `db-instance` . If this value isn't specified, all events are returned.
     *
     * Valid values: `db-instance` | `db-cluster` | `db-parameter-group` | `db-security-group` |
     * `db-snapshot` | `db-cluster-snapshot`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourcetype)
     * @param sourceType The type of source that is generating the events. 
     */
    public fun sourceType(sourceType: String)

    /**
     * The name of the subscription.
     *
     * Constraints: The name must be less than 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-subscriptionname)
     * @param subscriptionName The name of the subscription. 
     */
    public fun subscriptionName(subscriptionName: String)

    /**
     * An optional array of key-value pairs to apply to this subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-tags)
     * @param tags An optional array of key-value pairs to apply to this subscription. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An optional array of key-value pairs to apply to this subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-tags)
     * @param tags An optional array of key-value pairs to apply to this subscription. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnEventSubscription.Builder =
        software.amazon.awscdk.services.rds.CfnEventSubscription.Builder.create(scope, id)

    /**
     * Specifies whether to activate the subscription.
     *
     * If the event notification subscription isn't activated, the subscription is created but not
     * active.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled)
     * @param enabled Specifies whether to activate the subscription. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether to activate the subscription.
     *
     * If the event notification subscription isn't activated, the subscription is created but not
     * active.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled)
     * @param enabled Specifies whether to activate the subscription. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of event categories for a particular source type ( `SourceType` ) that you want to
     * subscribe to.
     *
     * You can see a list of the categories for a given source type in the "Amazon RDS event
     * categories and event messages" section of the [*Amazon RDS User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html) or the
     * [*Amazon Aurora User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html)
     * . You can also see this list by using the `DescribeEventCategories` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories)
     * @param eventCategories A list of event categories for a particular source type ( `SourceType`
     * ) that you want to subscribe to. 
     */
    override fun eventCategories(eventCategories: List<String>) {
      cdkBuilder.eventCategories(eventCategories)
    }

    /**
     * A list of event categories for a particular source type ( `SourceType` ) that you want to
     * subscribe to.
     *
     * You can see a list of the categories for a given source type in the "Amazon RDS event
     * categories and event messages" section of the [*Amazon RDS User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html) or the
     * [*Amazon Aurora User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html)
     * . You can also see this list by using the `DescribeEventCategories` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories)
     * @param eventCategories A list of event categories for a particular source type ( `SourceType`
     * ) that you want to subscribe to. 
     */
    override fun eventCategories(vararg eventCategories: String): Unit =
        eventCategories(eventCategories.toList())

    /**
     * The Amazon Resource Name (ARN) of the SNS topic created for event notification.
     *
     * SNS automatically creates the ARN when you create a topic and subscribe to it.
     *
     *
     * RDS doesn't support FIFO (first in, first out) topics. For more information, see [Message
     * ordering and deduplication (FIFO
     * topics)](https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html) in the *Amazon Simple
     * Notification Service Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn)
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic created for event
     * notification. 
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * The list of identifiers of the event sources for which events are returned.
     *
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens. It can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If a `SourceIds` value is supplied, `SourceType` must also be provided.
     * * If the source type is a DB instance, a `DBInstanceIdentifier` value must be supplied.
     * * If the source type is a DB cluster, a `DBClusterIdentifier` value must be supplied.
     * * If the source type is a DB parameter group, a `DBParameterGroupName` value must be
     * supplied.
     * * If the source type is a DB security group, a `DBSecurityGroupName` value must be supplied.
     * * If the source type is a DB snapshot, a `DBSnapshotIdentifier` value must be supplied.
     * * If the source type is a DB cluster snapshot, a `DBClusterSnapshotIdentifier` value must be
     * supplied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids)
     * @param sourceIds The list of identifiers of the event sources for which events are returned. 
     */
    override fun sourceIds(sourceIds: List<String>) {
      cdkBuilder.sourceIds(sourceIds)
    }

    /**
     * The list of identifiers of the event sources for which events are returned.
     *
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens. It can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If a `SourceIds` value is supplied, `SourceType` must also be provided.
     * * If the source type is a DB instance, a `DBInstanceIdentifier` value must be supplied.
     * * If the source type is a DB cluster, a `DBClusterIdentifier` value must be supplied.
     * * If the source type is a DB parameter group, a `DBParameterGroupName` value must be
     * supplied.
     * * If the source type is a DB security group, a `DBSecurityGroupName` value must be supplied.
     * * If the source type is a DB snapshot, a `DBSnapshotIdentifier` value must be supplied.
     * * If the source type is a DB cluster snapshot, a `DBClusterSnapshotIdentifier` value must be
     * supplied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids)
     * @param sourceIds The list of identifiers of the event sources for which events are returned. 
     */
    override fun sourceIds(vararg sourceIds: String): Unit = sourceIds(sourceIds.toList())

    /**
     * The type of source that is generating the events.
     *
     * For example, if you want to be notified of events generated by a DB instance, set this
     * parameter to `db-instance` . If this value isn't specified, all events are returned.
     *
     * Valid values: `db-instance` | `db-cluster` | `db-parameter-group` | `db-security-group` |
     * `db-snapshot` | `db-cluster-snapshot`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourcetype)
     * @param sourceType The type of source that is generating the events. 
     */
    override fun sourceType(sourceType: String) {
      cdkBuilder.sourceType(sourceType)
    }

    /**
     * The name of the subscription.
     *
     * Constraints: The name must be less than 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-subscriptionname)
     * @param subscriptionName The name of the subscription. 
     */
    override fun subscriptionName(subscriptionName: String) {
      cdkBuilder.subscriptionName(subscriptionName)
    }

    /**
     * An optional array of key-value pairs to apply to this subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-tags)
     * @param tags An optional array of key-value pairs to apply to this subscription. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An optional array of key-value pairs to apply to this subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-tags)
     * @param tags An optional array of key-value pairs to apply to this subscription. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnEventSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnEventSubscription.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventSubscription(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnEventSubscription):
        CfnEventSubscription = CfnEventSubscription(cdkObject)

    internal fun unwrap(wrapped: CfnEventSubscription):
        software.amazon.awscdk.services.rds.CfnEventSubscription = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.CfnEventSubscription
  }
}
