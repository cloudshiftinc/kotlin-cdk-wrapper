package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnContactList internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.CfnContactList,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun contactListName(): String? = unwrap(this).getContactListName()

  public open fun contactListName(`value`: String) {
    unwrap(this).setContactListName(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun topics(): Any? = unwrap(this).getTopics()

  public open fun topics(`value`: IResolvable) {
    unwrap(this).setTopics(`value`.let(IResolvable::unwrap))
  }

  public open fun topics(__idx_ac66f0: List<Any>) {
    unwrap(this).setTopics(__idx_ac66f0)
  }

  public open fun topics(vararg __idx_ac66f0: Any): Unit = topics(__idx_ac66f0.toList())

  public interface Builder {
    public fun contactListName(contactListName: String)

    public fun description(description: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun topics(topics: IResolvable)

    public fun topics(topics: List<Any>)

    public fun topics(vararg topics: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnContactList.Builder =
        software.amazon.awscdk.services.ses.CfnContactList.Builder.create(scope, id)

    override fun contactListName(contactListName: String) {
      cdkBuilder.contactListName(contactListName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun topics(topics: IResolvable) {
      cdkBuilder.topics(topics.let(IResolvable::unwrap))
    }

    override fun topics(topics: List<Any>) {
      cdkBuilder.topics(topics)
    }

    override fun topics(vararg topics: Any): Unit = topics(topics.toList())

    public fun build(): software.amazon.awscdk.services.ses.CfnContactList = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        = wrapped.cdkObject
  }

  public interface TopicProperty {
    public fun defaultSubscriptionStatus(): String

    public fun description(): String? = unwrap(this).getDescription()

    public fun displayName(): String

    public fun topicName(): String

    public interface Builder {
      public fun defaultSubscriptionStatus(defaultSubscriptionStatus: String)

      public fun description(description: String)

      public fun displayName(displayName: String)

      public fun topicName(topicName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnContactList.TopicProperty.Builder =
          software.amazon.awscdk.services.ses.CfnContactList.TopicProperty.builder()

      override fun defaultSubscriptionStatus(defaultSubscriptionStatus: String) {
        cdkBuilder.defaultSubscriptionStatus(defaultSubscriptionStatus)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
      }

      override fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnContactList.TopicProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ses.CfnContactList.TopicProperty,
    ) : TopicProperty {
      override fun defaultSubscriptionStatus(): String = unwrap(this).getDefaultSubscriptionStatus()

      override fun description(): String? = unwrap(this).getDescription()

      override fun displayName(): String = unwrap(this).getDisplayName()

      override fun topicName(): String = unwrap(this).getTopicName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TopicProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnContactList.TopicProperty):
          TopicProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicProperty):
          software.amazon.awscdk.services.ses.CfnContactList.TopicProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
