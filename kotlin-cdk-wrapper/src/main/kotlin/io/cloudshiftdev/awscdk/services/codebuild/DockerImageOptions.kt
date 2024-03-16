@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Unit

/**
 * The options when creating a CodeBuild Docker build image using
 * `LinuxBuildImage.fromDockerRegistry` or `WindowsBuildImage.fromDockerRegistry`.
 *
 * Example:
 *
 * ```
 * .environment(BuildEnvironment.builder()
 * .buildImage(LinuxBuildImage.fromDockerRegistry("my-registry/my-repo",
 * DockerImageOptions.builder()
 * .secretsManagerCredentials(secrets)
 * .build()))
 * .build())
 * .build();
 * ```
 */
public interface DockerImageOptions {
  /**
   * The credentials, stored in Secrets Manager, used for accessing the repository holding the
   * image, if the repository is private.
   *
   * Default: no credentials will be used (we assume the repository is public)
   */
  public fun secretsManagerCredentials(): ISecret? =
      unwrap(this).getSecretsManagerCredentials()?.let(ISecret::wrap)

  /**
   * A builder for [DockerImageOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param secretsManagerCredentials The credentials, stored in Secrets Manager, used for
     * accessing the repository holding the image, if the repository is private.
     */
    public fun secretsManagerCredentials(secretsManagerCredentials: ISecret)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.DockerImageOptions.Builder =
        software.amazon.awscdk.services.codebuild.DockerImageOptions.builder()

    /**
     * @param secretsManagerCredentials The credentials, stored in Secrets Manager, used for
     * accessing the repository holding the image, if the repository is private.
     */
    override fun secretsManagerCredentials(secretsManagerCredentials: ISecret) {
      cdkBuilder.secretsManagerCredentials(secretsManagerCredentials.let(ISecret::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.DockerImageOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.DockerImageOptions,
  ) : CdkObject(cdkObject), DockerImageOptions {
    /**
     * The credentials, stored in Secrets Manager, used for accessing the repository holding the
     * image, if the repository is private.
     *
     * Default: no credentials will be used (we assume the repository is public)
     */
    override fun secretsManagerCredentials(): ISecret? =
        unwrap(this).getSecretsManagerCredentials()?.let(ISecret::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.DockerImageOptions):
        DockerImageOptions = CdkObjectWrappers.wrap(cdkObject) as DockerImageOptions

    internal fun unwrap(wrapped: DockerImageOptions):
        software.amazon.awscdk.services.codebuild.DockerImageOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.DockerImageOptions
  }
}
