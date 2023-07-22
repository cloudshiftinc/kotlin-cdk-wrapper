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

/**
 * Properties to create NetworkAclEntry.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AclCidr aclCidr;
 * AclTraffic aclTraffic;
 * NetworkAcl networkAcl;
 * NetworkAclEntryProps networkAclEntryProps = NetworkAclEntryProps.builder()
 * .cidr(aclCidr)
 * .networkAcl(networkAcl)
 * .ruleNumber(123)
 * .traffic(aclTraffic)
 * // the properties below are optional
 * .direction(TrafficDirection.EGRESS)
 * .networkAclEntryName("networkAclEntryName")
 * .ruleAction(Action.ALLOW)
 * .build();
 * ```
 */
@CdkDslMarker
public class NetworkAclEntryPropsDsl {
  private val cdkBuilder: NetworkAclEntryProps.Builder = NetworkAclEntryProps.builder()

  /**
   * @param cidr The CIDR range to allow or deny. 
   */
  public fun cidr(cidr: AclCidr) {
    cdkBuilder.cidr(cidr)
  }

  /**
   * @param direction Traffic direction, with respect to the subnet, this rule applies to.
   */
  public fun direction(direction: TrafficDirection) {
    cdkBuilder.direction(direction)
  }

  /**
   * @param networkAcl The network ACL this entry applies to. 
   */
  public fun networkAcl(networkAcl: INetworkAcl) {
    cdkBuilder.networkAcl(networkAcl)
  }

  /**
   * @param networkAclEntryName The name of the NetworkAclEntry.
   * It is not recommended to use an explicit group name.
   */
  public fun networkAclEntryName(networkAclEntryName: String) {
    cdkBuilder.networkAclEntryName(networkAclEntryName)
  }

  /**
   * @param ruleAction Whether to allow or deny traffic that matches the rule; valid values are
   * "allow" or "deny".
   * Any traffic that is not explicitly allowed is automatically denied in a custom
   * ACL, all traffic is automatically allowed in a default ACL.
   */
  public fun ruleAction(ruleAction: Action) {
    cdkBuilder.ruleAction(ruleAction)
  }

  /**
   * @param ruleNumber Rule number to assign to the entry, such as 100. 
   * ACL entries are processed in ascending order by rule number.
   * Entries can't use the same rule number unless one is an egress rule and the other is an ingress
   * rule.
   */
  public fun ruleNumber(ruleNumber: Number) {
    cdkBuilder.ruleNumber(ruleNumber)
  }

  /**
   * @param traffic What kind of traffic this ACL rule applies to. 
   */
  public fun traffic(traffic: AclTraffic) {
    cdkBuilder.traffic(traffic)
  }

  public fun build(): NetworkAclEntryProps = cdkBuilder.build()
}
