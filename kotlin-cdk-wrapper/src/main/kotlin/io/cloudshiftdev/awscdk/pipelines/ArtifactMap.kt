@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact

/**
 * Translate FileSets to CodePipeline Artifacts.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.pipelines.*;
 * ArtifactMap artifactMap = new ArtifactMap();
 * ```
 */
public open class ArtifactMap internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.ArtifactMap,
) : CdkObject(cdkObject) {
  /**
   * Return the matching CodePipeline artifact for a FileSet.
   *
   * @param x 
   */
  public open fun toCodePipeline(x: FileSet): Artifact =
      unwrap(this).toCodePipeline(x.let(FileSet::unwrap)).let(Artifact::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ArtifactMap): ArtifactMap =
        ArtifactMap(cdkObject)

    internal fun unwrap(wrapped: ArtifactMap): software.amazon.awscdk.pipelines.ArtifactMap =
        wrapped.cdkObject
  }
}
