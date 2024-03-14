package io.cloudshiftdev.awscdk.services.docdb

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

public open class CfnEventSubscription internal constructor(
  private val cdkObject: software.amazon.awscdk.services.docdb.CfnEventSubscription,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A Boolean value;
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * A Boolean value;
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * A Boolean value;
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of event categories for a `SourceType` that you want to subscribe to.
   */
  public open fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

  /**
   * A list of event categories for a `SourceType` that you want to subscribe to.
   */
  public open fun eventCategories(`value`: List<String>) {
    unwrap(this).setEventCategories(`value`)
  }

  /**
   * A list of event categories for a `SourceType` that you want to subscribe to.
   */
  public open fun eventCategories(vararg `value`: String): Unit = eventCategories(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.docdb.CfnEventSubscription].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A Boolean value;
     *
     * set to `true` to activate the subscription, set to `false` to create the subscription but not
     * active it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-enabled)
     * @param enabled A Boolean value;. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * A Boolean value;
     *
     * set to `true` to activate the subscription, set to `false` to create the subscription but not
     * active it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-enabled)
     * @param enabled A Boolean value;. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * A list of event categories for a `SourceType` that you want to subscribe to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-eventcategories)
     * @param eventCategories A list of event categories for a `SourceType` that you want to
     * subscribe to. 
     */
    public fun eventCategories(eventCategories: List<String>)

    /**
     * A list of event categories for a `SourceType` that you want to subscribe to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-eventcategories)
     * @param eventCategories A list of event categories for a `SourceType` that you want to
     * subscribe to. 
     */
    public fun eventCategories(vararg eventCategories: String)

    /**
     * The Amazon Resource Name (ARN) of the SNS topic created for event notification.
     *
     * Amazon SNS creates the ARN when you create a topic and subscribe to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-snstopicarn)
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic created for event
     * notification. 
     */
    public fun snsTopicArn(snsTopicArn: String)

    /**
     * The list of identifiers of the event sources for which events are returned.
     *
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If `SourceIds` are provided, `SourceType` must also be provided.
     * * If the source type is an instance, a `DBInstanceIdentifier` must be provided.
     * * If the source type is a security group, a `DBSecurityGroupName` must be provided.
     * * If the source type is a parameter group, a `DBParameterGroupName` must be provided.
     * * If the source type is a snapshot, a `DBSnapshotIdentifier` must be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-sourceids)
     * @param sourceIds The list of identifiers of the event sources for which events are returned. 
     */
    public fun sourceIds(sourceIds: List<String>)

    /**
     * The list of identifiers of the event sources for which events are returned.
     *
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If `SourceIds` are provided, `SourceType` must also be provided.
     * * If the source type is an instance, a `DBInstanceIdentifier` must be provided.
     * * If the source type is a security group, a `DBSecurityGroupName` must be provided.
     * * If the source type is a parameter group, a `DBParameterGroupName` must be provided.
     * * If the source type is a snapshot, a `DBSnapshotIdentifier` must be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-sourceids)
     * @param sourceIds The list of identifiers of the event sources for which events are returned. 
     */
    public fun sourceIds(vararg sourceIds: String)

    /**
     * The type of source that is generating the events.
     *
     * For example, if you want to be notified of events generated by an instance, you would set
     * this parameter to `db-instance` . If this value is not specified, all events are returned.
     *
     * Valid values: `db-instance` , `db-cluster` , `db-parameter-group` , `db-security-group` ,
     * `db-cluster-snapshot`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-sourcetype)
     * @param sourceType The type of source that is generating the events. 
     */
    public fun sourceType(sourceType: String)

    /**
     * The name of the subscription.
     *
     * Constraints: The name must be fewer than 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-subscriptionname)
     * @param subscriptionName The name of the subscription. 
     */
    public fun subscriptionName(subscriptionName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.CfnEventSubscription.Builder =
        software.amazon.awscdk.services.docdb.CfnEventSubscription.Builder.create(scope, id)

    /**
     * A Boolean value;
     *
     * set to `true` to activate the subscription, set to `false` to create the subscription but not
     * active it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-enabled)
     * @param enabled A Boolean value;. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * A Boolean value;
     *
     * set to `true` to activate the subscription, set to `false` to create the subscription but not
     * active it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-enabled)
     * @param enabled A Boolean value;. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * A list of event categories for a `SourceType` that you want to subscribe to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-eventcategories)
     * @param eventCategories A list of event categories for a `SourceType` that you want to
     * subscribe to. 
     */
    override fun eventCategories(eventCategories: List<String>) {
      cdkBuilder.eventCategories(eventCategories)
    }

    /**
     * A list of event categories for a `SourceType` that you want to subscribe to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-eventcategories)
     * @param eventCategories A list of event categories for a `SourceType` that you want to
     * subscribe to. 
     */
    override fun eventCategories(vararg eventCategories: String): Unit =
        eventCategories(eventCategories.toList())

    /**
     * The Amazon Resource Name (ARN) of the SNS topic created for event notification.
     *
     * Amazon SNS creates the ARN when you create a topic and subscribe to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-snstopicarn)
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
     * with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If `SourceIds` are provided, `SourceType` must also be provided.
     * * If the source type is an instance, a `DBInstanceIdentifier` must be provided.
     * * If the source type is a security group, a `DBSecurityGroupName` must be provided.
     * * If the source type is a parameter group, a `DBParameterGroupName` must be provided.
     * * If the source type is a snapshot, a `DBSnapshotIdentifier` must be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-sourceids)
     * @param sourceIds The list of identifiers of the event sources for which events are returned. 
     */
    override fun sourceIds(sourceIds: List<String>) {
      cdkBuilder.sourceIds(sourceIds)
    }

    /**
     * The list of identifiers of the event sources for which events are returned.
     *
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If `SourceIds` are provided, `SourceType` must also be provided.
     * * If the source type is an instance, a `DBInstanceIdentifier` must be provided.
     * * If the source type is a security group, a `DBSecurityGroupName` must be provided.
     * * If the source type is a parameter group, a `DBParameterGroupName` must be provided.
     * * If the source type is a snapshot, a `DBSnapshotIdentifier` must be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-sourceids)
     * @param sourceIds The list of identifiers of the event sources for which events are returned. 
     */
    override fun sourceIds(vararg sourceIds: String): Unit = sourceIds(sourceIds.toList())

    /**
     * The type of source that is generating the events.
     *
     * For example, if you want to be notified of events generated by an instance, you would set
     * this parameter to `db-instance` . If this value is not specified, all events are returned.
     *
     * Valid values: `db-instance` , `db-cluster` , `db-parameter-group` , `db-security-group` ,
     * `db-cluster-snapshot`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-sourcetype)
     * @param sourceType The type of source that is generating the events. 
     */
    override fun sourceType(sourceType: String) {
      cdkBuilder.sourceType(sourceType)
    }

    /**
     * The name of the subscription.
     *
     * Constraints: The name must be fewer than 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-subscriptionname)
     * @param subscriptionName The name of the subscription. 
     */
    override fun subscriptionName(subscriptionName: String) {
      cdkBuilder.subscriptionName(subscriptionName)
    }

    public fun build(): software.amazon.awscdk.services.docdb.CfnEventSubscription =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventSubscription(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CfnEventSubscription):
        CfnEventSubscription = CfnEventSubscription(cdkObject)

    internal fun unwrap(wrapped: CfnEventSubscription):
        software.amazon.awscdk.services.docdb.CfnEventSubscription = wrapped.cdkObject
  }
}
