package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ContainerImageAssetCacheOption {
  public fun params(): Map<String, String> = unwrap(this).getParams() ?: emptyMap()

  public fun type(): String

  public interface Builder {
    public fun params(params: Map<String, String>) {
    }

    public fun type(type: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption.Builder =
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption.builder()

    public override fun params(params: Map<String, String>) {
      cdkBuilder.params(params)
    }

    public override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption,
  ) : ContainerImageAssetCacheOption {
    public override fun params(): Map<String, String> = unwrap(this).getParams() ?: emptyMap()

    public override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerImageAssetCacheOption {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption):
        ContainerImageAssetCacheOption = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerImageAssetCacheOption):
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption = (wrapped as
        Wrapper).cdkObject
  }
}
