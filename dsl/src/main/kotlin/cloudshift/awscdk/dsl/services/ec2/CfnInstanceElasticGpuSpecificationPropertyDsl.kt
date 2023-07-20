@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnInstance

@CdkDslMarker
public class CfnInstanceElasticGpuSpecificationPropertyDsl {
  private val cdkBuilder: CfnInstance.ElasticGpuSpecificationProperty.Builder =
      CfnInstance.ElasticGpuSpecificationProperty.builder()

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnInstance.ElasticGpuSpecificationProperty = cdkBuilder.build()
}
