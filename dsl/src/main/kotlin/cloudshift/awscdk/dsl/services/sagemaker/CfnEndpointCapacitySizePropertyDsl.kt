@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

@CdkDslMarker
public class CfnEndpointCapacitySizePropertyDsl {
  private val cdkBuilder: CfnEndpoint.CapacitySizeProperty.Builder =
      CfnEndpoint.CapacitySizeProperty.builder()

  /**
   * @param type Specifies the endpoint capacity type. 
   * * `INSTANCE_COUNT` : The endpoint activates based on the number of instances.
   * * `CAPACITY_PERCENT` : The endpoint activates based on the specified percentage of capacity.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param value Defines the capacity size, either as a number of instances or a capacity
   * percentage. 
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnEndpoint.CapacitySizeProperty = cdkBuilder.build()
}
