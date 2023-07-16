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

  public fun buildImage(buildImage: IBuildImage) {
    cdkBuilder.buildImage(buildImage)
  }

  public fun certificate(block: BuildEnvironmentCertificateDsl.() -> Unit = {}) {
    val builder = BuildEnvironmentCertificateDsl()
    builder.apply(block)
    cdkBuilder.certificate(builder.build())
  }

  public fun certificate(certificate: BuildEnvironmentCertificate) {
    cdkBuilder.certificate(certificate)
  }

  public fun computeType(computeType: ComputeType) {
    cdkBuilder.computeType(computeType)
  }

  public fun environmentVariables(environmentVariables: Map<String, out BuildEnvironmentVariable>) {
    cdkBuilder.environmentVariables(environmentVariables)
  }

  public fun privileged(privileged: Boolean) {
    cdkBuilder.privileged(privileged)
  }

  public fun build(): BuildEnvironment = cdkBuilder.build()
}
