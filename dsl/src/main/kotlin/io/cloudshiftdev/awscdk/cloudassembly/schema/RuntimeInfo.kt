package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface RuntimeInfo {
  public fun libraries(): Map<String, String>

  public interface Builder {
    public fun libraries(libraries: Map<String, String>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.RuntimeInfo.Builder =
        software.amazon.awscdk.cloudassembly.schema.RuntimeInfo.builder()

    public override fun libraries(libraries: Map<String, String>) {
      cdkBuilder.libraries(libraries)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.RuntimeInfo = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.RuntimeInfo,
  ) : RuntimeInfo {
    public override fun libraries(): Map<String, String> = unwrap(this).getLibraries() ?: emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RuntimeInfo {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.RuntimeInfo):
        RuntimeInfo = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuntimeInfo):
        software.amazon.awscdk.cloudassembly.schema.RuntimeInfo = (wrapped as Wrapper).cdkObject
  }
}
