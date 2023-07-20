@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator.endpoints

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnEIP
import software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint

@CdkDslMarker
public class CfnEipEndpointDsl(
  eip: CfnEIP,
) {
  private val cdkBuilder: CfnEipEndpoint.Builder = CfnEipEndpoint.Builder.create(eip)

  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnEipEndpoint = cdkBuilder.build()
}
