package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEventBus internal constructor(
  private val cdkObject: software.amazon.awscdk.services.events.CfnEventBus,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun attrPolicy(): String = unwrap(this).getAttrPolicy()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun eventSourceName(): String? = unwrap(this).getEventSourceName()

  public open fun eventSourceName(`value`: String) {
    unwrap(this).setEventSourceName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun policy(): Any? = unwrap(this).getPolicy()

  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun eventSourceName(eventSourceName: String)

    public fun name(name: String)

    public fun policy(policy: Any)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnEventBus.Builder =
        software.amazon.awscdk.services.events.CfnEventBus.Builder.create(scope, id)

    override fun eventSourceName(eventSourceName: String) {
      cdkBuilder.eventSourceName(eventSourceName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.CfnEventBus = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventBus {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventBus(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEventBus): CfnEventBus =
        CfnEventBus(cdkObject)

    internal fun unwrap(wrapped: CfnEventBus): software.amazon.awscdk.services.events.CfnEventBus =
        wrapped.cdkObject
  }
}
