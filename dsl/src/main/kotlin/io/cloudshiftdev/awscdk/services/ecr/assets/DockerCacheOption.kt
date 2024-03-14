package io.cloudshiftdev.awscdk.services.ecr.assets

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface DockerCacheOption {
  public fun params(): Map<String, String> = unwrap(this).getParams() ?: emptyMap()

  public fun type(): String

  public interface Builder {
    public fun params(params: Map<String, String>)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.assets.DockerCacheOption.Builder =
        software.amazon.awscdk.services.ecr.assets.DockerCacheOption.builder()

    override fun params(params: Map<String, String>) {
      cdkBuilder.params(params)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ecr.assets.DockerCacheOption =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecr.assets.DockerCacheOption,
  ) : DockerCacheOption {
    override fun params(): Map<String, String> = unwrap(this).getParams() ?: emptyMap()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DockerCacheOption {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.DockerCacheOption):
        DockerCacheOption = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerCacheOption):
        software.amazon.awscdk.services.ecr.assets.DockerCacheOption = (wrapped as
        Wrapper).cdkObject
  }
}
