@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnEventSubscription
import software.constructs.Construct

@CdkDslMarker
public class CfnEventSubscriptionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEventSubscription.Builder = CfnEventSubscription.Builder.create(scope,
      id)

  private val _eventCategories: MutableList<String> = mutableListOf()

  private val _sourceIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * A value that indicates whether to activate the subscription.
   *
   * If the event notification subscription isn't activated, the subscription is created but not
   * active.
   *
   * Default: - true
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled)
   * @param enabled A value that indicates whether to activate the subscription. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * A value that indicates whether to activate the subscription.
   *
   * If the event notification subscription isn't activated, the subscription is created but not
   * active.
   *
   * Default: - true
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled)
   * @param enabled A value that indicates whether to activate the subscription. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * A list of event categories for a particular source type ( `SourceType` ) that you want to
   * subscribe to.
   *
   * You can see a list of the categories for a given source type in the "Amazon RDS event
   * categories and event messages" section of the [*Amazon RDS User
   * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html) or the
   * [*Amazon Aurora User
   * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html) .
   * You can also see this list by using the `DescribeEventCategories` operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories)
   * @param eventCategories A list of event categories for a particular source type ( `SourceType` )
   * that you want to subscribe to. 
   */
  public fun eventCategories(vararg eventCategories: String) {
    _eventCategories.addAll(listOf(*eventCategories))
  }

  /**
   * A list of event categories for a particular source type ( `SourceType` ) that you want to
   * subscribe to.
   *
   * You can see a list of the categories for a given source type in the "Amazon RDS event
   * categories and event messages" section of the [*Amazon RDS User
   * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html) or the
   * [*Amazon Aurora User
   * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html) .
   * You can also see this list by using the `DescribeEventCategories` operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories)
   * @param eventCategories A list of event categories for a particular source type ( `SourceType` )
   * that you want to subscribe to. 
   */
  public fun eventCategories(eventCategories: Collection<String>) {
    _eventCategories.addAll(eventCategories)
  }

  /**
   * The Amazon Resource Name (ARN) of the SNS topic created for event notification.
   *
   * The ARN is created by Amazon SNS when you create a topic and subscribe to it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn)
   * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic created for event
   * notification. 
   */
  public fun snsTopicArn(snsTopicArn: String) {
    cdkBuilder.snsTopicArn(snsTopicArn)
  }

  /**
   * The list of identifiers of the event sources for which events are returned.
   *
   * If not specified, then all sources are included in the response. An identifier must begin with
   * a letter and must contain only ASCII letters, digits, and hyphens. It can't end with a hyphen or
   * contain two consecutive hyphens.
   *
   * Constraints:
   *
   * * If a `SourceIds` value is supplied, `SourceType` must also be provided.
   * * If the source type is a DB instance, a `DBInstanceIdentifier` value must be supplied.
   * * If the source type is a DB cluster, a `DBClusterIdentifier` value must be supplied.
   * * If the source type is a DB parameter group, a `DBParameterGroupName` value must be supplied.
   * * If the source type is a DB security group, a `DBSecurityGroupName` value must be supplied.
   * * If the source type is a DB snapshot, a `DBSnapshotIdentifier` value must be supplied.
   * * If the source type is a DB cluster snapshot, a `DBClusterSnapshotIdentifier` value must be
   * supplied.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids)
   * @param sourceIds The list of identifiers of the event sources for which events are returned. 
   */
  public fun sourceIds(vararg sourceIds: String) {
    _sourceIds.addAll(listOf(*sourceIds))
  }

  /**
   * The list of identifiers of the event sources for which events are returned.
   *
   * If not specified, then all sources are included in the response. An identifier must begin with
   * a letter and must contain only ASCII letters, digits, and hyphens. It can't end with a hyphen or
   * contain two consecutive hyphens.
   *
   * Constraints:
   *
   * * If a `SourceIds` value is supplied, `SourceType` must also be provided.
   * * If the source type is a DB instance, a `DBInstanceIdentifier` value must be supplied.
   * * If the source type is a DB cluster, a `DBClusterIdentifier` value must be supplied.
   * * If the source type is a DB parameter group, a `DBParameterGroupName` value must be supplied.
   * * If the source type is a DB security group, a `DBSecurityGroupName` value must be supplied.
   * * If the source type is a DB snapshot, a `DBSnapshotIdentifier` value must be supplied.
   * * If the source type is a DB cluster snapshot, a `DBClusterSnapshotIdentifier` value must be
   * supplied.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids)
   * @param sourceIds The list of identifiers of the event sources for which events are returned. 
   */
  public fun sourceIds(sourceIds: Collection<String>) {
    _sourceIds.addAll(sourceIds)
  }

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
  public fun sourceType(sourceType: String) {
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
  public fun subscriptionName(subscriptionName: String) {
    cdkBuilder.subscriptionName(subscriptionName)
  }

  /**
   * An optional array of key-value pairs to apply to this subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-tags)
   * @param tags An optional array of key-value pairs to apply to this subscription. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An optional array of key-value pairs to apply to this subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-tags)
   * @param tags An optional array of key-value pairs to apply to this subscription. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnEventSubscription {
    if(_eventCategories.isNotEmpty()) cdkBuilder.eventCategories(_eventCategories)
    if(_sourceIds.isNotEmpty()) cdkBuilder.sourceIds(_sourceIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
