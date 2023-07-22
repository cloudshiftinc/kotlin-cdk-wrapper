@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.AclCidr
import software.amazon.awscdk.services.ec2.AclTraffic
import software.amazon.awscdk.services.ec2.Action
import software.amazon.awscdk.services.ec2.INetworkAcl
import software.amazon.awscdk.services.ec2.NetworkAclEntry
import software.amazon.awscdk.services.ec2.TrafficDirection
import software.constructs.Construct

/**
 * Define an entry in a Network ACL table.
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
 * NetworkAclEntry networkAclEntry = NetworkAclEntry.Builder.create(this, "MyNetworkAclEntry")
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
public class NetworkAclEntryDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: NetworkAclEntry.Builder = NetworkAclEntry.Builder.create(scope, id)

  /**
   * The CIDR range to allow or deny.
   *
   * @param cidr The CIDR range to allow or deny. 
   */
  public fun cidr(cidr: AclCidr) {
    cdkBuilder.cidr(cidr)
  }

  /**
   * Traffic direction, with respect to the subnet, this rule applies to.
   *
   * Default: TrafficDirection.INGRESS
   *
   * @param direction Traffic direction, with respect to the subnet, this rule applies to. 
   */
  public fun direction(direction: TrafficDirection) {
    cdkBuilder.direction(direction)
  }

  /**
   * The network ACL this entry applies to.
   *
   * @param networkAcl The network ACL this entry applies to. 
   */
  public fun networkAcl(networkAcl: INetworkAcl) {
    cdkBuilder.networkAcl(networkAcl)
  }

  /**
   * The name of the NetworkAclEntry.
   *
   * It is not recommended to use an explicit group name.
   *
   * Default: If you don't specify a NetworkAclName, AWS CloudFormation generates a
   * unique physical ID and uses that ID for the group name.
   *
   * @param networkAclEntryName The name of the NetworkAclEntry. 
   */
  public fun networkAclEntryName(networkAclEntryName: String) {
    cdkBuilder.networkAclEntryName(networkAclEntryName)
  }

  /**
   * Whether to allow or deny traffic that matches the rule; valid values are "allow" or "deny".
   *
   * Any traffic that is not explicitly allowed is automatically denied in a custom
   * ACL, all traffic is automatically allowed in a default ACL.
   *
   * Default: ALLOW
   *
   * @param ruleAction Whether to allow or deny traffic that matches the rule; valid values are
   * "allow" or "deny". 
   */
  public fun ruleAction(ruleAction: Action) {
    cdkBuilder.ruleAction(ruleAction)
  }

  /**
   * Rule number to assign to the entry, such as 100.
   *
   * ACL entries are processed in ascending order by rule number.
   * Entries can't use the same rule number unless one is an egress rule and the other is an ingress
   * rule.
   *
   * @param ruleNumber Rule number to assign to the entry, such as 100. 
   */
  public fun ruleNumber(ruleNumber: Number) {
    cdkBuilder.ruleNumber(ruleNumber)
  }

  /**
   * What kind of traffic this ACL rule applies to.
   *
   * @param traffic What kind of traffic this ACL rule applies to. 
   */
  public fun traffic(traffic: AclTraffic) {
    cdkBuilder.traffic(traffic)
  }

  public fun build(): NetworkAclEntry = cdkBuilder.build()
}
