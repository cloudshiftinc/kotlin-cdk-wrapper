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

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnEndpoint.CapacitySizeProperty = cdkBuilder.build()
}
