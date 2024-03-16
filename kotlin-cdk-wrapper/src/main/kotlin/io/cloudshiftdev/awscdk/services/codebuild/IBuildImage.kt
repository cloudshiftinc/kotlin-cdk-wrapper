@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Represents a Docker image used for the CodeBuild Project builds.
 *
 * Use the concrete subclasses, either:
 * `LinuxBuildImage` or `WindowsBuildImage`.
 */
public interface IBuildImage {
  /**
   * The default `ComputeType` to use with this image, if one was not specified in
   * `BuildEnvironment#computeType` explicitly.
   */
  public fun defaultComputeType(): ComputeType

  /**
   * The Docker image identifier that the build environment uses.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html)
   */
  public fun imageId(): String

  /**
   * The type of principal that CodeBuild will use to pull this build Docker image.
   *
   * Default: ImagePullPrincipalType.SERVICE_ROLE
   */
  public fun imagePullPrincipalType(): ImagePullPrincipalType? =
      unwrap(this).getImagePullPrincipalType()?.let(ImagePullPrincipalType::wrap)

  /**
   * An optional ECR repository that the image is hosted in.
   *
   * Default: no repository
   */
  public fun repository(): IRepository? = unwrap(this).getRepository()?.let(IRepository::wrap)

  /**
   * Make a buildspec to run the indicated script.
   *
   * @param entrypoint 
   */
  public fun runScriptBuildspec(entrypoint: String): BuildSpec

  /**
   * The secretsManagerCredentials for access to a private registry.
   *
   * Default: no credentials will be used
   */
  public fun secretsManagerCredentials(): ISecret? =
      unwrap(this).getSecretsManagerCredentials()?.let(ISecret::wrap)

  /**
   * The type of build environment.
   */
  public fun type(): String

  /**
   * Allows the image a chance to validate whether the passed configuration is correct.
   *
   * @param buildEnvironment the current build environment. 
   */
  public fun validate(buildEnvironment: BuildEnvironment): List<String>

  /**
   * Allows the image a chance to validate whether the passed configuration is correct.
   *
   * @param buildEnvironment the current build environment. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff36d333164150adb92277700abb7153d45f26e16fa225966e7bf6fc0bedfcee")
  public fun validate(buildEnvironment: BuildEnvironment.Builder.() -> Unit): List<String>

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IBuildImage): IBuildImage
        = CdkObjectWrappers.wrap(cdkObject) as IBuildImage

    internal fun unwrap(wrapped: IBuildImage): software.amazon.awscdk.services.codebuild.IBuildImage
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.IBuildImage
  }
}
