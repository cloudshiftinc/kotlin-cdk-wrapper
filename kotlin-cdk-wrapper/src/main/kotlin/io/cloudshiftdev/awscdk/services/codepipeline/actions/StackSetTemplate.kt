@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath

public abstract class StackSetTemplate internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate,
) : CdkObject(cdkObject) {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate,
  ) : StackSetTemplate(cdkObject)

  public companion object {
    public fun fromArtifactPath(artifactPath: ArtifactPath): StackSetTemplate =
        software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate.fromArtifactPath(artifactPath.let(ArtifactPath::unwrap)).let(StackSetTemplate::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate):
        StackSetTemplate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackSetTemplate):
        software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate
  }
}
