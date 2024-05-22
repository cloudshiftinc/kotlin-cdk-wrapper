@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A list that contains contacts that have subscribed to a particular topic or topics.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnContactList cfnContactList = CfnContactList.Builder.create(this, "MyCfnContactList")
 * .contactListName("contactListName")
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .topics(List.of(TopicProperty.builder()
 * .defaultSubscriptionStatus("defaultSubscriptionStatus")
 * .displayName("displayName")
 * .topicName("topicName")
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html)
 */
public open class CfnContactList(
  cdkObject: software.amazon.awscdk.services.ses.CfnContactList,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ses.CfnContactList(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContactListProps,
  ) :
      this(software.amazon.awscdk.services.ses.CfnContactList(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnContactListProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContactListProps.Builder.() -> Unit,
  ) : this(scope, id, CfnContactListProps(props)
  )

  /**
   * The name of the contact list.
   */
  public open fun contactListName(): String? = unwrap(this).getContactListName()

  /**
   * The name of the contact list.
   */
  public open fun contactListName(`value`: String) {
    unwrap(this).setContactListName(`value`)
  }

  /**
   * A description of what the contact list is about.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of what the contact list is about.
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
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags associated with a contact list.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags associated with a contact list.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags associated with a contact list.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * An interest group, theme, or label within a list.
   */
  public open fun topics(): Any? = unwrap(this).getTopics()

  /**
   * An interest group, theme, or label within a list.
   */
  public open fun topics(`value`: IResolvable) {
    unwrap(this).setTopics(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An interest group, theme, or label within a list.
   */
  public open fun topics(`value`: List<Any>) {
    unwrap(this).setTopics(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An interest group, theme, or label within a list.
   */
  public open fun topics(vararg `value`: Any): Unit = topics(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnContactList].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the contact list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-contactlistname)
     * @param contactListName The name of the contact list. 
     */
    public fun contactListName(contactListName: String)

    /**
     * A description of what the contact list is about.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-description)
     * @param description A description of what the contact list is about. 
     */
    public fun description(description: String)

    /**
     * The tags associated with a contact list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-tags)
     * @param tags The tags associated with a contact list. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags associated with a contact list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-tags)
     * @param tags The tags associated with a contact list. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * An interest group, theme, or label within a list.
     *
     * A contact list can have multiple topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-topics)
     * @param topics An interest group, theme, or label within a list. 
     */
    public fun topics(topics: IResolvable)

    /**
     * An interest group, theme, or label within a list.
     *
     * A contact list can have multiple topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-topics)
     * @param topics An interest group, theme, or label within a list. 
     */
    public fun topics(topics: List<Any>)

    /**
     * An interest group, theme, or label within a list.
     *
     * A contact list can have multiple topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-topics)
     * @param topics An interest group, theme, or label within a list. 
     */
    public fun topics(vararg topics: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnContactList.Builder =
        software.amazon.awscdk.services.ses.CfnContactList.Builder.create(scope, id)

    /**
     * The name of the contact list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-contactlistname)
     * @param contactListName The name of the contact list. 
     */
    override fun contactListName(contactListName: String) {
      cdkBuilder.contactListName(contactListName)
    }

    /**
     * A description of what the contact list is about.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-description)
     * @param description A description of what the contact list is about. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The tags associated with a contact list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-tags)
     * @param tags The tags associated with a contact list. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags associated with a contact list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-tags)
     * @param tags The tags associated with a contact list. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * An interest group, theme, or label within a list.
     *
     * A contact list can have multiple topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-topics)
     * @param topics An interest group, theme, or label within a list. 
     */
    override fun topics(topics: IResolvable) {
      cdkBuilder.topics(topics.let(IResolvable.Companion::unwrap))
    }

    /**
     * An interest group, theme, or label within a list.
     *
     * A contact list can have multiple topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-topics)
     * @param topics An interest group, theme, or label within a list. 
     */
    override fun topics(topics: List<Any>) {
      cdkBuilder.topics(topics.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An interest group, theme, or label within a list.
     *
     * A contact list can have multiple topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-topics)
     * @param topics An interest group, theme, or label within a list. 
     */
    override fun topics(vararg topics: Any): Unit = topics(topics.toList())

    public fun build(): software.amazon.awscdk.services.ses.CfnContactList = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnContactList.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContactList {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContactList(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnContactList): CfnContactList
        = CfnContactList(cdkObject)

    internal fun unwrap(wrapped: CfnContactList): software.amazon.awscdk.services.ses.CfnContactList
        = wrapped.cdkObject as software.amazon.awscdk.services.ses.CfnContactList
  }

  /**
   * An interest group, theme, or label within a list.
   *
   * Lists can have multiple topics.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * TopicProperty topicProperty = TopicProperty.builder()
   * .defaultSubscriptionStatus("defaultSubscriptionStatus")
   * .displayName("displayName")
   * .topicName("topicName")
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-contactlist-topic.html)
   */
  public interface TopicProperty {
    /**
     * The default subscription status to be applied to a contact if the contact has not noted their
     * preference for subscribing to a topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-contactlist-topic.html#cfn-ses-contactlist-topic-defaultsubscriptionstatus)
     */
    public fun defaultSubscriptionStatus(): String

    /**
     * A description of what the topic is about, which the contact will see.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-contactlist-topic.html#cfn-ses-contactlist-topic-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the topic the contact will see.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-contactlist-topic.html#cfn-ses-contactlist-topic-displayname)
     */
    public fun displayName(): String

    /**
     * The name of the topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-contactlist-topic.html#cfn-ses-contactlist-topic-topicname)
     */
    public fun topicName(): String

    /**
     * A builder for [TopicProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultSubscriptionStatus The default subscription status to be applied to a contact
       * if the contact has not noted their preference for subscribing to a topic. 
       */
      public fun defaultSubscriptionStatus(defaultSubscriptionStatus: String)

      /**
       * @param description A description of what the topic is about, which the contact will see.
       */
      public fun description(description: String)

      /**
       * @param displayName The name of the topic the contact will see. 
       */
      public fun displayName(displayName: String)

      /**
       * @param topicName The name of the topic. 
       */
      public fun topicName(topicName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnContactList.TopicProperty.Builder =
          software.amazon.awscdk.services.ses.CfnContactList.TopicProperty.builder()

      /**
       * @param defaultSubscriptionStatus The default subscription status to be applied to a contact
       * if the contact has not noted their preference for subscribing to a topic. 
       */
      override fun defaultSubscriptionStatus(defaultSubscriptionStatus: String) {
        cdkBuilder.defaultSubscriptionStatus(defaultSubscriptionStatus)
      }

      /**
       * @param description A description of what the topic is about, which the contact will see.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param displayName The name of the topic the contact will see. 
       */
      override fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
      }

      /**
       * @param topicName The name of the topic. 
       */
      override fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnContactList.TopicProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnContactList.TopicProperty,
    ) : CdkObject(cdkObject), TopicProperty {
      /**
       * The default subscription status to be applied to a contact if the contact has not noted
       * their preference for subscribing to a topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-contactlist-topic.html#cfn-ses-contactlist-topic-defaultsubscriptionstatus)
       */
      override fun defaultSubscriptionStatus(): String = unwrap(this).getDefaultSubscriptionStatus()

      /**
       * A description of what the topic is about, which the contact will see.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-contactlist-topic.html#cfn-ses-contactlist-topic-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The name of the topic the contact will see.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-contactlist-topic.html#cfn-ses-contactlist-topic-displayname)
       */
      override fun displayName(): String = unwrap(this).getDisplayName()

      /**
       * The name of the topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-contactlist-topic.html#cfn-ses-contactlist-topic-topicname)
       */
      override fun topicName(): String = unwrap(this).getTopicName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnContactList.TopicProperty):
          TopicProperty = CdkObjectWrappers.wrap(cdkObject) as? TopicProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicProperty):
          software.amazon.awscdk.services.ses.CfnContactList.TopicProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnContactList.TopicProperty
    }
  }
}
