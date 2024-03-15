@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eventschemas

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRegistryProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun registryName(): String? = unwrap(this).getRegistryName()

  public fun tags(): List<CfnRegistry.TagsEntryProperty> =
      unwrap(this).getTags()?.map(CfnRegistry.TagsEntryProperty::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun registryName(registryName: String)

    public fun tags(tags: List<CfnRegistry.TagsEntryProperty>)

    public fun tags(vararg tags: CfnRegistry.TagsEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eventschemas.CfnRegistryProps.Builder =
        software.amazon.awscdk.services.eventschemas.CfnRegistryProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun registryName(registryName: String) {
      cdkBuilder.registryName(registryName)
    }

    override fun tags(tags: List<CfnRegistry.TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(CfnRegistry.TagsEntryProperty::unwrap))
    }

    override fun tags(vararg tags: CfnRegistry.TagsEntryProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.eventschemas.CfnRegistryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eventschemas.CfnRegistryProps,
  ) : CdkObject(cdkObject), CfnRegistryProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun registryName(): String? = unwrap(this).getRegistryName()

    override fun tags(): List<CfnRegistry.TagsEntryProperty> =
        unwrap(this).getTags()?.map(CfnRegistry.TagsEntryProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRegistryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnRegistryProps):
        CfnRegistryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRegistryProps):
        software.amazon.awscdk.services.eventschemas.CfnRegistryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eventschemas.CfnRegistryProps
  }
}
