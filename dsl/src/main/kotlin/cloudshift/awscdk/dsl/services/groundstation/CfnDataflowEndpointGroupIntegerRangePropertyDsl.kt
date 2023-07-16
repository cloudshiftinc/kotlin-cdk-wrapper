@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

@CdkDslMarker
public class CfnDataflowEndpointGroupIntegerRangePropertyDsl {
  private val cdkBuilder: CfnDataflowEndpointGroup.IntegerRangeProperty.Builder =
      CfnDataflowEndpointGroup.IntegerRangeProperty.builder()

  public fun maximum(maximum: Number) {
    cdkBuilder.maximum(maximum)
  }

  public fun minimum(minimum: Number) {
    cdkBuilder.minimum(minimum)
  }

  public fun build(): CfnDataflowEndpointGroup.IntegerRangeProperty = cdkBuilder.build()
}
