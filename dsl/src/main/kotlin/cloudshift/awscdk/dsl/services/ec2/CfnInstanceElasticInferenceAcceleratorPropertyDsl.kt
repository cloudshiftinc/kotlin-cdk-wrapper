@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnInstance

@CdkDslMarker
public class CfnInstanceElasticInferenceAcceleratorPropertyDsl {
  private val cdkBuilder: CfnInstance.ElasticInferenceAcceleratorProperty.Builder =
      CfnInstance.ElasticInferenceAcceleratorProperty.builder()

  /**
   * @param count The number of elastic inference accelerators to attach to the instance.
   */
  public fun count(count: Number) {
    cdkBuilder.count(count)
  }

  /**
   * @param type The type of elastic inference accelerator. 
   * The possible values are `eia1.medium` , `eia1.large` , `eia1.xlarge` , `eia2.medium` ,
   * `eia2.large` , and `eia2.xlarge` .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnInstance.ElasticInferenceAcceleratorProperty = cdkBuilder.build()
}
