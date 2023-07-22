@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateElasticGpuSpecificationPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.ElasticGpuSpecificationProperty.Builder =
      CfnLaunchTemplate.ElasticGpuSpecificationProperty.builder()

  /**
   * @param type The type of Elastic Graphics accelerator.
   * For more information about the values to specify for `Type` , see [Elastic Graphics
   * Basics](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics)
   * , specifically the Elastic Graphics accelerator column, in the *Amazon Elastic Compute Cloud User
   * Guide for Windows Instances* .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnLaunchTemplate.ElasticGpuSpecificationProperty = cdkBuilder.build()
}
