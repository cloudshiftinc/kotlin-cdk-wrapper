@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * The abstract interface of a CodeBuild build output.
 *
 * Implemented by `Artifacts`.
 */
public interface IArtifacts {
  /**
   * Callback when an Artifacts class is used in a CodeBuild Project.
   *
   * @param scope a root Construct that allows creating new Constructs. 
   * @param project the Project this Artifacts is used in. 
   */
  public fun bind(scope: Construct, project: IProject): ArtifactsConfig

  /**
   * The artifact identifier.
   *
   * This property is required on secondary artifacts.
   */
  public fun identifier(): String? = unwrap(this).getIdentifier()

  /**
   * The CodeBuild type of this artifact.
   */
  public fun type(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.IArtifacts,
  ) : CdkObject(cdkObject), IArtifacts {
    /**
     * Callback when an Artifacts class is used in a CodeBuild Project.
     *
     * @param scope a root Construct that allows creating new Constructs. 
     * @param project the Project this Artifacts is used in. 
     */
    override fun bind(scope: Construct, project: IProject): ArtifactsConfig =
        unwrap(this).bind(scope.let(Construct::unwrap),
        project.let(IProject::unwrap)).let(ArtifactsConfig::wrap)

    /**
     * The artifact identifier.
     *
     * This property is required on secondary artifacts.
     */
    override fun identifier(): String? = unwrap(this).getIdentifier()

    /**
     * The CodeBuild type of this artifact.
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IArtifacts): IArtifacts =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IArtifacts): software.amazon.awscdk.services.codebuild.IArtifacts =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.IArtifacts
  }
}
