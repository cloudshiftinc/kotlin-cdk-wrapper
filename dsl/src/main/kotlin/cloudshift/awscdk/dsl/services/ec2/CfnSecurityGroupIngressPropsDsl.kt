@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps

@CdkDslMarker
public class CfnSecurityGroupIngressPropsDsl {
  private val cdkBuilder: CfnSecurityGroupIngressProps.Builder =
      CfnSecurityGroupIngressProps.builder()

  public fun cidrIp(cidrIp: String) {
    cdkBuilder.cidrIp(cidrIp)
  }

  public fun cidrIpv6(cidrIpv6: String) {
    cdkBuilder.cidrIpv6(cidrIpv6)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun fromPort(fromPort: Number) {
    cdkBuilder.fromPort(fromPort)
  }

  public fun groupId(groupId: String) {
    cdkBuilder.groupId(groupId)
  }

  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  public fun ipProtocol(ipProtocol: String) {
    cdkBuilder.ipProtocol(ipProtocol)
  }

  public fun sourcePrefixListId(sourcePrefixListId: String) {
    cdkBuilder.sourcePrefixListId(sourcePrefixListId)
  }

  public fun sourceSecurityGroupId(sourceSecurityGroupId: String) {
    cdkBuilder.sourceSecurityGroupId(sourceSecurityGroupId)
  }

  public fun sourceSecurityGroupName(sourceSecurityGroupName: String) {
    cdkBuilder.sourceSecurityGroupName(sourceSecurityGroupName)
  }

  public fun sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId: String) {
    cdkBuilder.sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId)
  }

  public fun toPort(toPort: Number) {
    cdkBuilder.toPort(toPort)
  }

  public fun build(): CfnSecurityGroupIngressProps = cdkBuilder.build()
}
