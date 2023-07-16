@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.AclCidr
import software.amazon.awscdk.services.ec2.AclTraffic
import software.amazon.awscdk.services.ec2.Action
import software.amazon.awscdk.services.ec2.INetworkAcl
import software.amazon.awscdk.services.ec2.NetworkAclEntryProps
import software.amazon.awscdk.services.ec2.TrafficDirection

@CdkDslMarker
public class NetworkAclEntryPropsDsl {
  private val cdkBuilder: NetworkAclEntryProps.Builder = NetworkAclEntryProps.builder()

  public fun cidr(cidr: AclCidr) {
    cdkBuilder.cidr(cidr)
  }

  public fun direction(direction: TrafficDirection) {
    cdkBuilder.direction(direction)
  }

  public fun networkAcl(networkAcl: INetworkAcl) {
    cdkBuilder.networkAcl(networkAcl)
  }

  public fun networkAclEntryName(networkAclEntryName: String) {
    cdkBuilder.networkAclEntryName(networkAclEntryName)
  }

  public fun ruleAction(ruleAction: Action) {
    cdkBuilder.ruleAction(ruleAction)
  }

  public fun ruleNumber(ruleNumber: Number) {
    cdkBuilder.ruleNumber(ruleNumber)
  }

  public fun traffic(traffic: AclTraffic) {
    cdkBuilder.traffic(traffic)
  }

  public fun build(): NetworkAclEntryProps = cdkBuilder.build()
}
