@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateLaunchTemplateElasticInferenceAcceleratorPropertyDsl {
  private val cdkBuilder:
      CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty.Builder =
      CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty.builder()

  /**
   * @param count The number of elastic inference accelerators to attach to the instance.
   * Default: 1
   */
  public fun count(count: Number) {
    cdkBuilder.count(count)
  }

  /**
   * @param type The type of elastic inference accelerator.
   * The possible values are eia1.medium, eia1.large, and eia1.xlarge.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty =
      cdkBuilder.build()
}
