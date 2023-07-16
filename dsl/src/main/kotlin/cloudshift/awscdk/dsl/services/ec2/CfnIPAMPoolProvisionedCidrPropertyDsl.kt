@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnIPAMPool

@CdkDslMarker
public class CfnIPAMPoolProvisionedCidrPropertyDsl {
  private val cdkBuilder: CfnIPAMPool.ProvisionedCidrProperty.Builder =
      CfnIPAMPool.ProvisionedCidrProperty.builder()

  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  public fun build(): CfnIPAMPool.ProvisionedCidrProperty = cdkBuilder.build()
}
