@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntry

@CdkDslMarker
public class CfnNetworkAclEntryPortRangePropertyDsl {
  private val cdkBuilder: CfnNetworkAclEntry.PortRangeProperty.Builder =
      CfnNetworkAclEntry.PortRangeProperty.builder()

  public fun from(from: Number) {
    cdkBuilder.from(from)
  }

  public fun to(to: Number) {
    cdkBuilder.to(to)
  }

  public fun build(): CfnNetworkAclEntry.PortRangeProperty = cdkBuilder.build()
}
