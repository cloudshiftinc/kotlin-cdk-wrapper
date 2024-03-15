@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Base parameters for the StackSet.
 *
 * Example:
 *
 * ```
 * StackSetParameters parameters = StackSetParameters.fromLiteral(Map.of(
 * "BucketName", "my-bucket",
 * "Asset1", "true"));
 * ```
 */
public abstract class StackSetParameters internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.StackSetParameters,
) : CdkObject(cdkObject) {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.actions.StackSetParameters,
  ) : StackSetParameters(cdkObject)

  public companion object {
    public fun fromArtifactPath(artifactPath: ArtifactPath): StackSetParameters =
        software.amazon.awscdk.services.codepipeline.actions.StackSetParameters.fromArtifactPath(artifactPath.let(ArtifactPath::unwrap)).let(StackSetParameters::wrap)

    public fun fromLiteral(parameters: Map<String, String>): StackSetParameters =
        software.amazon.awscdk.services.codepipeline.actions.StackSetParameters.fromLiteral(parameters).let(StackSetParameters::wrap)

    public fun fromLiteral(parameters: Map<String, String>, usePreviousValues: List<String>):
        StackSetParameters =
        software.amazon.awscdk.services.codepipeline.actions.StackSetParameters.fromLiteral(parameters,
        usePreviousValues).let(StackSetParameters::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.StackSetParameters):
        StackSetParameters = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackSetParameters):
        software.amazon.awscdk.services.codepipeline.actions.StackSetParameters = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.StackSetParameters
  }
}
