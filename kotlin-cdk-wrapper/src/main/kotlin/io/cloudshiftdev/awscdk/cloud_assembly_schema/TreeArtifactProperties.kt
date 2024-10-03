@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Artifact properties for the Construct Tree Artifact.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * TreeArtifactProperties treeArtifactProperties = TreeArtifactProperties.builder()
 * .file("file")
 * .build();
 * ```
 */
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
        software.amazon.awscdk.cloud_assembly_schema.TreeArtifactProperties.Builder =
        software.amazon.awscdk.cloud_assembly_schema.TreeArtifactProperties.builder()

    /**
     * @param file Filename of the tree artifact. 
     */
    override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.TreeArtifactProperties =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.TreeArtifactProperties,
  ) : CdkObject(cdkObject),
      TreeArtifactProperties {
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
        fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.TreeArtifactProperties):
        TreeArtifactProperties = CdkObjectWrappers.wrap(cdkObject) as? TreeArtifactProperties ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TreeArtifactProperties):
        software.amazon.awscdk.cloud_assembly_schema.TreeArtifactProperties = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.TreeArtifactProperties
  }
}
