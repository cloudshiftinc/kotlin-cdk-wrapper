@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

@CdkDslMarker
public class CfnDistributionConfigurationFastLaunchLaunchTemplateSpecificationPropertyDsl {
  private val cdkBuilder:
      CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty.Builder =
      CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty.builder()

  /**
   * @param launchTemplateId The ID of the launch template to use for faster launching for a Windows
   * AMI.
   */
  public fun launchTemplateId(launchTemplateId: String) {
    cdkBuilder.launchTemplateId(launchTemplateId)
  }

  /**
   * @param launchTemplateName The name of the launch template to use for faster launching for a
   * Windows AMI.
   */
  public fun launchTemplateName(launchTemplateName: String) {
    cdkBuilder.launchTemplateName(launchTemplateName)
  }

  /**
   * @param launchTemplateVersion The version of the launch template to use for faster launching for
   * a Windows AMI.
   */
  public fun launchTemplateVersion(launchTemplateVersion: String) {
    cdkBuilder.launchTemplateVersion(launchTemplateVersion)
  }

  public fun build(): CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty =
      cdkBuilder.build()
}
