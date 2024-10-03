@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ContainerImageAssetCacheOption {
  public fun params(): Map<String, String> = unwrap(this).getParams() ?: emptyMap()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun params(params: Map<String, String>)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption.Builder =
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption.builder()

    override fun params(params: Map<String, String>) {
      cdkBuilder.params(params)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption,
  ) : CdkObject(cdkObject),
      ContainerImageAssetCacheOption {
    override fun params(): Map<String, String> = unwrap(this).getParams() ?: emptyMap()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerImageAssetCacheOption {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption):
        ContainerImageAssetCacheOption = CdkObjectWrappers.wrap(cdkObject) as?
        ContainerImageAssetCacheOption ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerImageAssetCacheOption):
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption
  }
}
