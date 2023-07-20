@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnIPAMAllocationProps

@CdkDslMarker
public class CfnIPAMAllocationPropsDsl {
  private val cdkBuilder: CfnIPAMAllocationProps.Builder = CfnIPAMAllocationProps.builder()

  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun ipamPoolId(ipamPoolId: String) {
    cdkBuilder.ipamPoolId(ipamPoolId)
  }

  public fun netmaskLength(netmaskLength: Number) {
    cdkBuilder.netmaskLength(netmaskLength)
  }

  public fun build(): CfnIPAMAllocationProps = cdkBuilder.build()
}
