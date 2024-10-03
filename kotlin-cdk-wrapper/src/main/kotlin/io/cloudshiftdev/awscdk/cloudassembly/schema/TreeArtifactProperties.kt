@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

public interface TreeArtifactProperties {
  public fun `file`(): String

  @CdkDslMarker
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

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties,
  ) : CdkObject(cdkObject),
      TreeArtifactProperties {
    override fun `file`(): String = unwrap(this).getFile()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TreeArtifactProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties):
        TreeArtifactProperties = CdkObjectWrappers.wrap(cdkObject) as? TreeArtifactProperties ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TreeArtifactProperties):
        software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties
  }
}
