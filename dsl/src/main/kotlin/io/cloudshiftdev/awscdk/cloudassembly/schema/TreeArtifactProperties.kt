package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface TreeArtifactProperties {
  /**
   * Filename of the tree artifact.
   */
  public fun `file`(): String

  /**
   * A builder for [TreeArtifactProperties]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param file Filename of the tree artifact. 
     */
    public fun `file`(`file`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties.Builder =
        software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties.builder()

    /**
     * @param file Filename of the tree artifact. 
     */
    override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties,
  ) : CdkObject(cdkObject), TreeArtifactProperties {
    /**
     * Filename of the tree artifact.
     */
    override fun `file`(): String = unwrap(this).getFile()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TreeArtifactProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties):
        TreeArtifactProperties = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TreeArtifactProperties):
        software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties
  }
}
