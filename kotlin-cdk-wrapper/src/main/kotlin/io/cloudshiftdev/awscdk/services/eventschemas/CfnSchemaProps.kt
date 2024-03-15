@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eventschemas

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSchemaProps {
  public fun content(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun registryName(): String

  public fun schemaName(): String? = unwrap(this).getSchemaName()

  public fun tags(): List<CfnSchema.TagsEntryProperty> =
      unwrap(this).getTags()?.map(CfnSchema.TagsEntryProperty::wrap) ?: emptyList()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun content(content: String)

    public fun description(description: String)

    public fun registryName(registryName: String)

    public fun schemaName(schemaName: String)

    public fun tags(tags: List<CfnSchema.TagsEntryProperty>)

    public fun tags(vararg tags: CfnSchema.TagsEntryProperty)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eventschemas.CfnSchemaProps.Builder =
        software.amazon.awscdk.services.eventschemas.CfnSchemaProps.builder()

    override fun content(content: String) {
      cdkBuilder.content(content)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun registryName(registryName: String) {
      cdkBuilder.registryName(registryName)
    }

    override fun schemaName(schemaName: String) {
      cdkBuilder.schemaName(schemaName)
    }

    override fun tags(tags: List<CfnSchema.TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(CfnSchema.TagsEntryProperty::unwrap))
    }

    override fun tags(vararg tags: CfnSchema.TagsEntryProperty): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.eventschemas.CfnSchemaProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eventschemas.CfnSchemaProps,
  ) : CdkObject(cdkObject), CfnSchemaProps {
    override fun content(): String = unwrap(this).getContent()

    override fun description(): String? = unwrap(this).getDescription()

    override fun registryName(): String = unwrap(this).getRegistryName()

    override fun schemaName(): String? = unwrap(this).getSchemaName()

    override fun tags(): List<CfnSchema.TagsEntryProperty> =
        unwrap(this).getTags()?.map(CfnSchema.TagsEntryProperty::wrap) ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSchemaProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnSchemaProps):
        CfnSchemaProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSchemaProps):
        software.amazon.awscdk.services.eventschemas.CfnSchemaProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eventschemas.CfnSchemaProps
  }
}
