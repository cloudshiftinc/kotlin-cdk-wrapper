@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Artifacts definition for a CodeBuild Project.
 *
 * Example:
 *
 * ```
 * Bucket bucket;
 * Project project = Project.Builder.create(this, "MyProject")
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2")))
 * .artifacts(Artifacts.s3(S3ArtifactsProps.builder()
 * .bucket(bucket)
 * .includeBuildId(false)
 * .packageZip(true)
 * .path("another/path")
 * .identifier("AddArtifact1")
 * .build()))
 * .build();
 * ```
 */
public abstract class Artifacts internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.Artifacts,
) : CdkObject(cdkObject), IArtifacts {
  /**
   * Callback when an Artifacts class is used in a CodeBuild Project.
   *
   * @param _scope 
   * @param _project 
   */
  public override fun bind(scope: Construct, project: IProject): ArtifactsConfig =
      unwrap(this).bind(scope.let(Construct::unwrap),
      project.let(IProject::unwrap)).let(ArtifactsConfig::wrap)

  /**
   * The artifact identifier.
   *
   * This property is required on secondary artifacts.
   */
  public override fun identifier(): String? = unwrap(this).getIdentifier()

  /**
   * The CodeBuild type of this artifact.
   */
  public override fun type(): String = unwrap(this).getType()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.Artifacts,
  ) : Artifacts(cdkObject)

  public companion object {
    public fun s3(props: S3ArtifactsProps): IArtifacts =
        software.amazon.awscdk.services.codebuild.Artifacts.s3(props.let(S3ArtifactsProps::unwrap)).let(IArtifacts::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d63d027642e646b44f6750fe1ce755acaee0627a88e8371711800562702f65de")
    public fun s3(props: S3ArtifactsProps.Builder.() -> Unit): IArtifacts =
        s3(S3ArtifactsProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.Artifacts): Artifacts =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Artifacts): software.amazon.awscdk.services.codebuild.Artifacts =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.Artifacts
  }
}
