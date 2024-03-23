@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshift.*;
 * CfnEventSubscription cfnEventSubscription = CfnEventSubscription.Builder.create(this,
 * "MyCfnEventSubscription")
 * .subscriptionName("subscriptionName")
 * // the properties below are optional
 * .enabled(false)
 * .eventCategories(List.of("eventCategories"))
 * .severity("severity")
 * .snsTopicArn("snsTopicArn")
 * .sourceIds(List.of("sourceIds"))
 * .sourceType("sourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html)
 */
public open class CfnEventSubscription(
  cdkObject: software.amazon.awscdk.services.redshift.CfnEventSubscription,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventSubscriptionProps,
  ) :
      this(software.amazon.awscdk.services.redshift.CfnEventSubscription(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnEventSubscriptionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventSubscriptionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventSubscriptionProps(props)
  )

  /**
   * The name of the Amazon Redshift event notification subscription.
   */
  public open fun attrCustSubscriptionId(): String = unwrap(this).getAttrCustSubscriptionId()

  /**
   * The AWS account associated with the Amazon Redshift event notification subscription.
   */
  public open fun attrCustomerAwsId(): String = unwrap(this).getAttrCustomerAwsId()

  /**
   * The list of Amazon Redshift event categories specified in the event notification subscription.
   *
   * Values: Configuration, Management, Monitoring, Security, Pending
   */
  public open fun attrEventCategoriesList(): List<String> =
      unwrap(this).getAttrEventCategoriesList()

  /**
   * A list of the sources that publish events to the Amazon Redshift event notification
   * subscription.
   */
  public open fun attrSourceIdsList(): List<String> = unwrap(this).getAttrSourceIdsList()

  /**
   * The status of the Amazon Redshift event notification subscription.
   *
   * Constraints:
   *
   * * Can be one of the following: active | no-permission | topic-not-exist
   * * The status "no-permission" indicates that Amazon Redshift no longer has permission to post to
   * the Amazon SNS topic. The status "topic-not-exist" indicates that the topic was deleted after the
   * subscription was created.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The date and time the Amazon Redshift event notification subscription was created.
   */
  public open fun attrSubscriptionCreationTime(): String =
      unwrap(this).getAttrSubscriptionCreationTime()

  /**
   * A boolean value;
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * A boolean value;
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * A boolean value;
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the Amazon Redshift event categories to be published by the event notification
   * subscription.
   */
  public open fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

  /**
   * Specifies the Amazon Redshift event categories to be published by the event notification
   * subscription.
   */
  public open fun eventCategories(`value`: List<String>) {
    unwrap(this).setEventCategories(`value`)
  }

  /**
   * Specifies the Amazon Redshift event categories to be published by the event notification
   * subscription.
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
   * Specifies the Amazon Redshift event severity to be published by the event notification
   * subscription.
   */
  public open fun severity(): String? = unwrap(this).getSeverity()

  /**
   * Specifies the Amazon Redshift event severity to be published by the event notification
   * subscription.
   */
  public open fun severity(`value`: String) {
    unwrap(this).setSeverity(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event
   * notifications.
   */
  public open fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event
   * notifications.
   */
  public open fun snsTopicArn(`value`: String) {
    unwrap(this).setSnsTopicArn(`value`)
  }

  /**
   * A list of one or more identifiers of Amazon Redshift source objects.
   */
  public open fun sourceIds(): List<String> = unwrap(this).getSourceIds() ?: emptyList()

  /**
   * A list of one or more identifiers of Amazon Redshift source objects.
   */
  public open fun sourceIds(`value`: List<String>) {
    unwrap(this).setSourceIds(`value`)
  }

  /**
   * A list of one or more identifiers of Amazon Redshift source objects.
   */
  public open fun sourceIds(vararg `value`: String): Unit = sourceIds(`value`.toList())

  /**
   * The type of source that will be generating the events.
   */
  public open fun sourceType(): String? = unwrap(this).getSourceType()

  /**
   * The type of source that will be generating the events.
   */
  public open fun sourceType(`value`: String) {
    unwrap(this).setSourceType(`value`)
  }

  /**
   * The name of the event subscription to be created.
   */
  public open fun subscriptionName(): String = unwrap(this).getSubscriptionName()

  /**
   * The name of the event subscription to be created.
   */
  public open fun subscriptionName(`value`: String) {
    unwrap(this).setSubscriptionName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tag instances.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tag instances.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tag instances.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.redshift.CfnEventSubscription].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A boolean value;
     *
     * set to `true` to activate the subscription, and set to `false` to create the subscription but
     * not activate it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-enabled)
     * @param enabled A boolean value;. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * A boolean value;
     *
     * set to `true` to activate the subscription, and set to `false` to create the subscription but
     * not activate it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-enabled)
     * @param enabled A boolean value;. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * Specifies the Amazon Redshift event categories to be published by the event notification
     * subscription.
     *
     * Values: configuration, management, monitoring, security, pending
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-eventcategories)
     * @param eventCategories Specifies the Amazon Redshift event categories to be published by the
     * event notification subscription. 
     */
    public fun eventCategories(eventCategories: List<String>)

    /**
     * Specifies the Amazon Redshift event categories to be published by the event notification
     * subscription.
     *
     * Values: configuration, management, monitoring, security, pending
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-eventcategories)
     * @param eventCategories Specifies the Amazon Redshift event categories to be published by the
     * event notification subscription. 
     */
    public fun eventCategories(vararg eventCategories: String)

    /**
     * Specifies the Amazon Redshift event severity to be published by the event notification
     * subscription.
     *
     * Values: ERROR, INFO
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-severity)
     * @param severity Specifies the Amazon Redshift event severity to be published by the event
     * notification subscription. 
     */
    public fun severity(severity: String)

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event
     * notifications.
     *
     * The ARN is created by Amazon SNS when you create a topic and subscribe to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-snstopicarn)
     * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit
     * the event notifications. 
     */
    public fun snsTopicArn(snsTopicArn: String)

    /**
     * A list of one or more identifiers of Amazon Redshift source objects.
     *
     * All of the objects must be of the same type as was specified in the source type parameter.
     * The event subscription will return only events generated by the specified objects. If not
     * specified, then events are returned for all objects within the source type specified.
     *
     * Example: my-cluster-1, my-cluster-2
     *
     * Example: my-snapshot-20131010
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-sourceids)
     * @param sourceIds A list of one or more identifiers of Amazon Redshift source objects. 
     */
    public fun sourceIds(sourceIds: List<String>)

    /**
     * A list of one or more identifiers of Amazon Redshift source objects.
     *
     * All of the objects must be of the same type as was specified in the source type parameter.
     * The event subscription will return only events generated by the specified objects. If not
     * specified, then events are returned for all objects within the source type specified.
     *
     * Example: my-cluster-1, my-cluster-2
     *
     * Example: my-snapshot-20131010
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-sourceids)
     * @param sourceIds A list of one or more identifiers of Amazon Redshift source objects. 
     */
    public fun sourceIds(vararg sourceIds: String)

    /**
     * The type of source that will be generating the events.
     *
     * For example, if you want to be notified of events generated by a cluster, you would set this
     * parameter to cluster. If this value is not specified, events are returned for all Amazon
     * Redshift objects in your AWS account . You must specify a source type in order to specify source
     * IDs.
     *
     * Valid values: cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot, and
     * scheduled-action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-sourcetype)
     * @param sourceType The type of source that will be generating the events. 
     */
    public fun sourceType(sourceType: String)

    /**
     * The name of the event subscription to be created.
     *
     * Constraints:
     *
     * * Cannot be null, empty, or blank.
     * * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-subscriptionname)
     * @param subscriptionName The name of the event subscription to be created. 
     */
    public fun subscriptionName(subscriptionName: String)

    /**
     * A list of tag instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-tags)
     * @param tags A list of tag instances. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tag instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-tags)
     * @param tags A list of tag instances. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnEventSubscription.Builder =
        software.amazon.awscdk.services.redshift.CfnEventSubscription.Builder.create(scope, id)

    /**
     * A boolean value;
     *
     * set to `true` to activate the subscription, and set to `false` to create the subscription but
     * not activate it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-enabled)
     * @param enabled A boolean value;. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * A boolean value;
     *
     * set to `true` to activate the subscription, and set to `false` to create the subscription but
     * not activate it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-enabled)
     * @param enabled A boolean value;. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * Specifies the Amazon Redshift event categories to be published by the event notification
     * subscription.
     *
     * Values: configuration, management, monitoring, security, pending
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-eventcategories)
     * @param eventCategories Specifies the Amazon Redshift event categories to be published by the
     * event notification subscription. 
     */
    override fun eventCategories(eventCategories: List<String>) {
      cdkBuilder.eventCategories(eventCategories)
    }

    /**
     * Specifies the Amazon Redshift event categories to be published by the event notification
     * subscription.
     *
     * Values: configuration, management, monitoring, security, pending
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-eventcategories)
     * @param eventCategories Specifies the Amazon Redshift event categories to be published by the
     * event notification subscription. 
     */
    override fun eventCategories(vararg eventCategories: String): Unit =
        eventCategories(eventCategories.toList())

    /**
     * Specifies the Amazon Redshift event severity to be published by the event notification
     * subscription.
     *
     * Values: ERROR, INFO
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-severity)
     * @param severity Specifies the Amazon Redshift event severity to be published by the event
     * notification subscription. 
     */
    override fun severity(severity: String) {
      cdkBuilder.severity(severity)
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event
     * notifications.
     *
     * The ARN is created by Amazon SNS when you create a topic and subscribe to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-snstopicarn)
     * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit
     * the event notifications. 
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * A list of one or more identifiers of Amazon Redshift source objects.
     *
     * All of the objects must be of the same type as was specified in the source type parameter.
     * The event subscription will return only events generated by the specified objects. If not
     * specified, then events are returned for all objects within the source type specified.
     *
     * Example: my-cluster-1, my-cluster-2
     *
     * Example: my-snapshot-20131010
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-sourceids)
     * @param sourceIds A list of one or more identifiers of Amazon Redshift source objects. 
     */
    override fun sourceIds(sourceIds: List<String>) {
      cdkBuilder.sourceIds(sourceIds)
    }

    /**
     * A list of one or more identifiers of Amazon Redshift source objects.
     *
     * All of the objects must be of the same type as was specified in the source type parameter.
     * The event subscription will return only events generated by the specified objects. If not
     * specified, then events are returned for all objects within the source type specified.
     *
     * Example: my-cluster-1, my-cluster-2
     *
     * Example: my-snapshot-20131010
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-sourceids)
     * @param sourceIds A list of one or more identifiers of Amazon Redshift source objects. 
     */
    override fun sourceIds(vararg sourceIds: String): Unit = sourceIds(sourceIds.toList())

    /**
     * The type of source that will be generating the events.
     *
     * For example, if you want to be notified of events generated by a cluster, you would set this
     * parameter to cluster. If this value is not specified, events are returned for all Amazon
     * Redshift objects in your AWS account . You must specify a source type in order to specify source
     * IDs.
     *
     * Valid values: cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot, and
     * scheduled-action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-sourcetype)
     * @param sourceType The type of source that will be generating the events. 
     */
    override fun sourceType(sourceType: String) {
      cdkBuilder.sourceType(sourceType)
    }

    /**
     * The name of the event subscription to be created.
     *
     * Constraints:
     *
     * * Cannot be null, empty, or blank.
     * * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-subscriptionname)
     * @param subscriptionName The name of the event subscription to be created. 
     */
    override fun subscriptionName(subscriptionName: String) {
      cdkBuilder.subscriptionName(subscriptionName)
    }

    /**
     * A list of tag instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-tags)
     * @param tags A list of tag instances. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tag instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-tags)
     * @param tags A list of tag instances. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnEventSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.redshift.CfnEventSubscription.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventSubscription(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEventSubscription):
        CfnEventSubscription = CfnEventSubscription(cdkObject)

    internal fun unwrap(wrapped: CfnEventSubscription):
        software.amazon.awscdk.services.redshift.CfnEventSubscription = wrapped.cdkObject as
        software.amazon.awscdk.services.redshift.CfnEventSubscription
  }
}
