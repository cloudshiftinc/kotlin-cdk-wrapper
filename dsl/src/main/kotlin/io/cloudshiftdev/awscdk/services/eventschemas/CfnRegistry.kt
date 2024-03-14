package io.cloudshiftdev.awscdk.services.eventschemas

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRegistry internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eventschemas.CfnRegistry,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrRegistryArn(): String = unwrap(this).getAttrRegistryArn()

  public open fun attrRegistryName(): String = unwrap(this).getAttrRegistryName()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun registryName(): String? = unwrap(this).getRegistryName()

  public open fun registryName(`value`: String) {
    unwrap(this).setRegistryName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<TagsEntryProperty> =
      unwrap(this).getTagsRaw()?.map(TagsEntryProperty::wrap) ?: emptyList()

  public open fun tagsRaw(`value`: List<TagsEntryProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagsEntryProperty::unwrap))
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun registryName(registryName: String) {
    }

    public fun tags(tags: List<TagsEntryProperty>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eventschemas.CfnRegistry.Builder =
        software.amazon.awscdk.services.eventschemas.CfnRegistry.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun registryName(registryName: String) {
      cdkBuilder.registryName(registryName)
    }

    public override fun tags(tags: List<TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(TagsEntryProperty::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eventschemas.CfnRegistry =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRegistry {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRegistry(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnRegistry):
        CfnRegistry = CfnRegistry(cdkObject)

    internal fun unwrap(wrapped: CfnRegistry):
        software.amazon.awscdk.services.eventschemas.CfnRegistry = wrapped.cdkObject
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
          software.amazon.awscdk.services.eventschemas.CfnRegistry.TagsEntryProperty.Builder =
          software.amazon.awscdk.services.eventschemas.CfnRegistry.TagsEntryProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.eventschemas.CfnRegistry.TagsEntryProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eventschemas.CfnRegistry.TagsEntryProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnRegistry.TagsEntryProperty):
          TagsEntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagsEntryProperty):
          software.amazon.awscdk.services.eventschemas.CfnRegistry.TagsEntryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
