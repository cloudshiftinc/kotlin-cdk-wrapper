@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress
import software.constructs.Construct

@CdkDslMarker
public class CfnSecurityGroupEgressDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSecurityGroupEgress.Builder =
      CfnSecurityGroupEgress.Builder.create(scope, id)

  public fun cidrIp(cidrIp: String) {
    cdkBuilder.cidrIp(cidrIp)
  }

  public fun cidrIpv6(cidrIpv6: String) {
    cdkBuilder.cidrIpv6(cidrIpv6)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun destinationPrefixListId(destinationPrefixListId: String) {
    cdkBuilder.destinationPrefixListId(destinationPrefixListId)
  }

  public fun destinationSecurityGroupId(destinationSecurityGroupId: String) {
    cdkBuilder.destinationSecurityGroupId(destinationSecurityGroupId)
  }

  public fun fromPort(fromPort: Number) {
    cdkBuilder.fromPort(fromPort)
  }

  public fun groupId(groupId: String) {
    cdkBuilder.groupId(groupId)
  }

  public fun ipProtocol(ipProtocol: String) {
    cdkBuilder.ipProtocol(ipProtocol)
  }

  public fun toPort(toPort: Number) {
    cdkBuilder.toPort(toPort)
  }

  public fun build(): CfnSecurityGroupEgress = cdkBuilder.build()
}
