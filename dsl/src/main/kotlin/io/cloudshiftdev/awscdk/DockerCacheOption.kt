package io.cloudshiftdev.awscdk

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
    private val cdkBuilder: software.amazon.awscdk.DockerCacheOption.Builder =
        software.amazon.awscdk.DockerCacheOption.builder()

    override fun params(params: Map<String, String>) {
      cdkBuilder.params(params)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.DockerCacheOption = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.DockerCacheOption,
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

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerCacheOption): DockerCacheOption =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerCacheOption): software.amazon.awscdk.DockerCacheOption =
        (wrapped as Wrapper).cdkObject
  }
}
