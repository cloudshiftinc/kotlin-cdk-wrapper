package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface BuildEnvironment {
  /**
   * The image used for the builds.
   *
   * Default: LinuxBuildImage.STANDARD_1_0
   */
  public fun buildImage(): IBuildImage? = unwrap(this).getBuildImage()?.let(IBuildImage::wrap)

  /**
   * The location of the PEM-encoded certificate for the build project.
   *
   * Default: - No external certificate is added to the project
   */
  public fun certificate(): BuildEnvironmentCertificate? =
      unwrap(this).getCertificate()?.let(BuildEnvironmentCertificate::wrap)

  /**
   * The type of compute to use for this build.
   *
   * See the `ComputeType` enum for the possible values.
   *
   * Default: taken from `#buildImage#defaultComputeType`
   */
  public fun computeType(): ComputeType? = unwrap(this).getComputeType()?.let(ComputeType::wrap)

  /**
   * The environment variables that your builds can use.
   */
  public fun environmentVariables(): Map<String, BuildEnvironmentVariable> =
      unwrap(this).getEnvironmentVariables()?.mapValues{BuildEnvironmentVariable.wrap(it.value)} ?:
      emptyMap()

  /**
   * Indicates how the project builds Docker images.
   *
   * Specify true to enable
   * running the Docker daemon inside a Docker container. This value must be
   * set to true only if this build project will be used to build Docker
   * images, and the specified build environment image is not one provided by
   * AWS CodeBuild with Docker support. Otherwise, all associated builds that
   * attempt to interact with the Docker daemon will fail.
   *
   * Default: false
   */
  public fun privileged(): Boolean? = unwrap(this).getPrivileged()

  /**
   * A builder for [BuildEnvironment]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param buildImage The image used for the builds.
     */
    public fun buildImage(buildImage: IBuildImage)

    /**
     * @param certificate The location of the PEM-encoded certificate for the build project.
     */
    public fun certificate(certificate: BuildEnvironmentCertificate)

    /**
     * @param certificate The location of the PEM-encoded certificate for the build project.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09017eab37f62dfd6f983cd063f7b91ffaaed137d75b90a84954e0ca86761e58")
    public fun certificate(certificate: BuildEnvironmentCertificate.Builder.() -> Unit)

    /**
     * @param computeType The type of compute to use for this build.
     * See the `ComputeType` enum for the possible values.
     */
    public fun computeType(computeType: ComputeType)

    /**
     * @param environmentVariables The environment variables that your builds can use.
     */
    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>)

    /**
     * @param privileged Indicates how the project builds Docker images.
     * Specify true to enable
     * running the Docker daemon inside a Docker container. This value must be
     * set to true only if this build project will be used to build Docker
     * images, and the specified build environment image is not one provided by
     * AWS CodeBuild with Docker support. Otherwise, all associated builds that
     * attempt to interact with the Docker daemon will fail.
     */
    public fun privileged(privileged: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.BuildEnvironment.Builder =
        software.amazon.awscdk.services.codebuild.BuildEnvironment.builder()

    /**
     * @param buildImage The image used for the builds.
     */
    override fun buildImage(buildImage: IBuildImage) {
      cdkBuilder.buildImage(buildImage.let(IBuildImage::unwrap))
    }

    /**
     * @param certificate The location of the PEM-encoded certificate for the build project.
     */
    override fun certificate(certificate: BuildEnvironmentCertificate) {
      cdkBuilder.certificate(certificate.let(BuildEnvironmentCertificate::unwrap))
    }

    /**
     * @param certificate The location of the PEM-encoded certificate for the build project.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09017eab37f62dfd6f983cd063f7b91ffaaed137d75b90a84954e0ca86761e58")
    override fun certificate(certificate: BuildEnvironmentCertificate.Builder.() -> Unit): Unit =
        certificate(BuildEnvironmentCertificate(certificate))

    /**
     * @param computeType The type of compute to use for this build.
     * See the `ComputeType` enum for the possible values.
     */
    override fun computeType(computeType: ComputeType) {
      cdkBuilder.computeType(computeType.let(ComputeType::unwrap))
    }

    /**
     * @param environmentVariables The environment variables that your builds can use.
     */
    override fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
      cdkBuilder.environmentVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)})
    }

    /**
     * @param privileged Indicates how the project builds Docker images.
     * Specify true to enable
     * running the Docker daemon inside a Docker container. This value must be
     * set to true only if this build project will be used to build Docker
     * images, and the specified build environment image is not one provided by
     * AWS CodeBuild with Docker support. Otherwise, all associated builds that
     * attempt to interact with the Docker daemon will fail.
     */
    override fun privileged(privileged: Boolean) {
      cdkBuilder.privileged(privileged)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BuildEnvironment =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.BuildEnvironment,
  ) : BuildEnvironment {
    /**
     * The image used for the builds.
     *
     * Default: LinuxBuildImage.STANDARD_1_0
     */
    override fun buildImage(): IBuildImage? = unwrap(this).getBuildImage()?.let(IBuildImage::wrap)

    /**
     * The location of the PEM-encoded certificate for the build project.
     *
     * Default: - No external certificate is added to the project
     */
    override fun certificate(): BuildEnvironmentCertificate? =
        unwrap(this).getCertificate()?.let(BuildEnvironmentCertificate::wrap)

    /**
     * The type of compute to use for this build.
     *
     * See the `ComputeType` enum for the possible values.
     *
     * Default: taken from `#buildImage#defaultComputeType`
     */
    override fun computeType(): ComputeType? = unwrap(this).getComputeType()?.let(ComputeType::wrap)

    /**
     * The environment variables that your builds can use.
     */
    override fun environmentVariables(): Map<String, BuildEnvironmentVariable> =
        unwrap(this).getEnvironmentVariables()?.mapValues{BuildEnvironmentVariable.wrap(it.value)}
        ?: emptyMap()

    /**
     * Indicates how the project builds Docker images.
     *
     * Specify true to enable
     * running the Docker daemon inside a Docker container. This value must be
     * set to true only if this build project will be used to build Docker
     * images, and the specified build environment image is not one provided by
     * AWS CodeBuild with Docker support. Otherwise, all associated builds that
     * attempt to interact with the Docker daemon will fail.
     *
     * Default: false
     */
    override fun privileged(): Boolean? = unwrap(this).getPrivileged()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BuildEnvironment {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BuildEnvironment):
        BuildEnvironment = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BuildEnvironment):
        software.amazon.awscdk.services.codebuild.BuildEnvironment = (wrapped as Wrapper).cdkObject
  }
}
