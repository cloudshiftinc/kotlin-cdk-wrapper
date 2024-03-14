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

public open class CfnSchema internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eventschemas.CfnSchema,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrLastModified(): String = unwrap(this).getAttrLastModified()

  public open fun attrSchemaArn(): String = unwrap(this).getAttrSchemaArn()

  public open fun attrSchemaName(): String = unwrap(this).getAttrSchemaName()

  public open fun attrSchemaVersion(): String = unwrap(this).getAttrSchemaVersion()

  public open fun attrVersionCreatedDate(): String = unwrap(this).getAttrVersionCreatedDate()

  public open fun content(): String = unwrap(this).getContent()

  public open fun content(`value`: String) {
    unwrap(this).setContent(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun registryName(): String = unwrap(this).getRegistryName()

  public open fun registryName(`value`: String) {
    unwrap(this).setRegistryName(`value`)
  }

  public open fun schemaName(): String? = unwrap(this).getSchemaName()

  public open fun schemaName(`value`: String) {
    unwrap(this).setSchemaName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<TagsEntryProperty> =
      unwrap(this).getTagsRaw()?.map(TagsEntryProperty::wrap) ?: emptyList()

  public open fun tagsRaw(`value`: List<TagsEntryProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagsEntryProperty::unwrap))
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun content(content: String) {
    }

    public fun description(description: String) {
    }

    public fun registryName(registryName: String) {
    }

    public fun schemaName(schemaName: String) {
    }

    public fun tags(tags: List<TagsEntryProperty>) {
    }

    public fun type(type: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eventschemas.CfnSchema.Builder =
        software.amazon.awscdk.services.eventschemas.CfnSchema.Builder.create(scope, id)

    public override fun content(content: String) {
      cdkBuilder.content(content)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun registryName(registryName: String) {
      cdkBuilder.registryName(registryName)
    }

    public override fun schemaName(schemaName: String) {
      cdkBuilder.schemaName(schemaName)
    }

    public override fun tags(tags: List<TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(TagsEntryProperty::unwrap))
    }

    public override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.eventschemas.CfnSchema = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchema {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchema(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnSchema): CfnSchema
        = CfnSchema(cdkObject)

    internal fun unwrap(wrapped: CfnSchema): software.amazon.awscdk.services.eventschemas.CfnSchema
        = wrapped.cdkObject
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
          software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty.Builder =
          software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty):
          TagsEntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagsEntryProperty):
          software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
