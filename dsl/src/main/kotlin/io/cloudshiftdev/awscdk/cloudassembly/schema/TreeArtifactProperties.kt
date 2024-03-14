package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.String
import kotlin.Unit

public interface TreeArtifactProperties {
  public fun `file`(): String

  public interface Builder {
    public fun `file`(`file`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties.Builder =
        software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties.builder()

    override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties,
  ) : TreeArtifactProperties {
    override fun `file`(): String = unwrap(this).getFile()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TreeArtifactProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties):
        TreeArtifactProperties = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TreeArtifactProperties):
        software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties = (wrapped as
        Wrapper).cdkObject
  }
}
