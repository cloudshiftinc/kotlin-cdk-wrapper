@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnComputeEnvironment

@CdkDslMarker
public class CfnComputeEnvironmentLaunchTemplateSpecificationPropertyDsl {
  private val cdkBuilder: CfnComputeEnvironment.LaunchTemplateSpecificationProperty.Builder =
      CfnComputeEnvironment.LaunchTemplateSpecificationProperty.builder()

  public fun launchTemplateId(launchTemplateId: String) {
    cdkBuilder.launchTemplateId(launchTemplateId)
  }

  public fun launchTemplateName(launchTemplateName: String) {
    cdkBuilder.launchTemplateName(launchTemplateName)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnComputeEnvironment.LaunchTemplateSpecificationProperty = cdkBuilder.build()
}
