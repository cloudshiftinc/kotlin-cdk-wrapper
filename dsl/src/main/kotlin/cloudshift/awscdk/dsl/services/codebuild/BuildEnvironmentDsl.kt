@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.codebuild.BuildEnvironment
import software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate
import software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable
import software.amazon.awscdk.services.codebuild.ComputeType
import software.amazon.awscdk.services.codebuild.IBuildImage

@CdkDslMarker
public class BuildEnvironmentDsl {
  private val cdkBuilder: BuildEnvironment.Builder = BuildEnvironment.builder()

  /**
   * @param buildImage The image used for the builds.
   */
  public fun buildImage(buildImage: IBuildImage) {
    cdkBuilder.buildImage(buildImage)
  }

  /**
   * @param certificate The location of the PEM-encoded certificate for the build project.
   */
  public fun certificate(certificate: BuildEnvironmentCertificateDsl.() -> Unit = {}) {
    val builder = BuildEnvironmentCertificateDsl()
    builder.apply(certificate)
    cdkBuilder.certificate(builder.build())
  }

  /**
   * @param certificate The location of the PEM-encoded certificate for the build project.
   */
  public fun certificate(certificate: BuildEnvironmentCertificate) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param computeType The type of compute to use for this build.
   * See the `ComputeType` enum for the possible values.
   */
  public fun computeType(computeType: ComputeType) {
    cdkBuilder.computeType(computeType)
  }

  /**
   * @param environmentVariables The environment variables that your builds can use.
   */
  public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
    cdkBuilder.environmentVariables(environmentVariables)
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
  public fun privileged(privileged: Boolean) {
    cdkBuilder.privileged(privileged)
  }

  public fun build(): BuildEnvironment = cdkBuilder.build()
}
