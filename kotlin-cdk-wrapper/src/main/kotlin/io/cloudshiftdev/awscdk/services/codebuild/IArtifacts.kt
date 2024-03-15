@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

public interface IArtifacts {
  public fun bind(arg0: Construct, arg1: IProject): ArtifactsConfig

  public fun identifier(): String? = unwrap(this).getIdentifier()

  public fun type(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.IArtifacts,
  ) : CdkObject(cdkObject), IArtifacts {
    override fun bind(arg0: Construct, arg1: IProject): ArtifactsConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(IProject::unwrap)).let(ArtifactsConfig::wrap)

    override fun identifier(): String? = unwrap(this).getIdentifier()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IArtifacts): IArtifacts =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IArtifacts): software.amazon.awscdk.services.codebuild.IArtifacts =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.IArtifacts
  }
}
