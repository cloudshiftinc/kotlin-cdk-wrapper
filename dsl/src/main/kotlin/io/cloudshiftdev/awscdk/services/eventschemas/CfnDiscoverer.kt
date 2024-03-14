package io.cloudshiftdev.awscdk.services.eventschemas

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDiscoverer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eventschemas.CfnDiscoverer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCrossAccount(): IResolvable =
      unwrap(this).getAttrCrossAccount().let(IResolvable::wrap)

  public open fun attrDiscovererArn(): String = unwrap(this).getAttrDiscovererArn()

  public open fun attrDiscovererId(): String = unwrap(this).getAttrDiscovererId()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun crossAccount(): Any? = unwrap(this).getCrossAccount()

  public open fun crossAccount(`value`: Boolean) {
    unwrap(this).setCrossAccount(`value`)
  }

  public open fun crossAccount(`value`: IResolvable) {
    unwrap(this).setCrossAccount(`value`.let(IResolvable::unwrap))
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun sourceArn(): String = unwrap(this).getSourceArn()

  public open fun sourceArn(`value`: String) {
    unwrap(this).setSourceArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<TagsEntryProperty> =
      unwrap(this).getTagsRaw()?.map(TagsEntryProperty::wrap) ?: emptyList()

  public open fun tagsRaw(`value`: List<TagsEntryProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagsEntryProperty::unwrap))
  }

  public interface Builder {
    public fun crossAccount(crossAccount: Boolean) {
    }

    public fun crossAccount(crossAccount: IResolvable) {
    }

    public fun description(description: String) {
    }

    public fun sourceArn(sourceArn: String) {
    }

    public fun tags(tags: List<TagsEntryProperty>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eventschemas.CfnDiscoverer.Builder =
        software.amazon.awscdk.services.eventschemas.CfnDiscoverer.Builder.create(scope, id)

    public override fun crossAccount(crossAccount: Boolean) {
      cdkBuilder.crossAccount(crossAccount)
    }

    public override fun crossAccount(crossAccount: IResolvable) {
      cdkBuilder.crossAccount(crossAccount.let(IResolvable::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    public override fun tags(tags: List<TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(TagsEntryProperty::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eventschemas.CfnDiscoverer =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDiscoverer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDiscoverer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnDiscoverer):
        CfnDiscoverer = CfnDiscoverer(cdkObject)

    internal fun unwrap(wrapped: CfnDiscoverer):
        software.amazon.awscdk.services.eventschemas.CfnDiscoverer = wrapped.cdkObject
  }

  public interface TagsEntryProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty.Builder =
          software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty,
    ) : TagsEntryProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagsEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty):
          TagsEntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagsEntryProperty):
          software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
