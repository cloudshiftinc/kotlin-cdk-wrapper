@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntry
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps

@CdkDslMarker
public class CfnNetworkAclEntryPropsDsl {
  private val cdkBuilder: CfnNetworkAclEntryProps.Builder = CfnNetworkAclEntryProps.builder()

  public fun cidrBlock(cidrBlock: String) {
    cdkBuilder.cidrBlock(cidrBlock)
  }

  public fun egress(egress: Boolean) {
    cdkBuilder.egress(egress)
  }

  public fun egress(egress: IResolvable) {
    cdkBuilder.egress(egress)
  }

  public fun icmp(icmp: IResolvable) {
    cdkBuilder.icmp(icmp)
  }

  public fun icmp(icmp: CfnNetworkAclEntry.IcmpProperty) {
    cdkBuilder.icmp(icmp)
  }

  public fun ipv6CidrBlock(ipv6CidrBlock: String) {
    cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
  }

  public fun networkAclId(networkAclId: String) {
    cdkBuilder.networkAclId(networkAclId)
  }

  public fun portRange(portRange: IResolvable) {
    cdkBuilder.portRange(portRange)
  }

  public fun portRange(portRange: CfnNetworkAclEntry.PortRangeProperty) {
    cdkBuilder.portRange(portRange)
  }

  public fun protocol(protocol: Number) {
    cdkBuilder.protocol(protocol)
  }

  public fun ruleAction(ruleAction: String) {
    cdkBuilder.ruleAction(ruleAction)
  }

  public fun ruleNumber(ruleNumber: Number) {
    cdkBuilder.ruleNumber(ruleNumber)
  }

  public fun build(): CfnNetworkAclEntryProps = cdkBuilder.build()
}
