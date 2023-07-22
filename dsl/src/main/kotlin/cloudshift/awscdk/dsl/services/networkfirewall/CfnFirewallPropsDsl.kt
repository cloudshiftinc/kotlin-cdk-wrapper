@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewallProps

@CdkDslMarker
public class CfnFirewallPropsDsl {
  private val cdkBuilder: CfnFirewallProps.Builder = CfnFirewallProps.builder()

  private val _subnetMappings: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param deleteProtection A flag indicating whether it is possible to delete the firewall.
   * A setting of `TRUE` indicates that the firewall is protected against deletion. Use this setting
   * to protect against accidentally deleting a firewall that is in use. When you create a firewall,
   * the operation initializes this flag to `TRUE` .
   */
  public fun deleteProtection(deleteProtection: Boolean) {
    cdkBuilder.deleteProtection(deleteProtection)
  }

  /**
   * @param deleteProtection A flag indicating whether it is possible to delete the firewall.
   * A setting of `TRUE` indicates that the firewall is protected against deletion. Use this setting
   * to protect against accidentally deleting a firewall that is in use. When you create a firewall,
   * the operation initializes this flag to `TRUE` .
   */
  public fun deleteProtection(deleteProtection: IResolvable) {
    cdkBuilder.deleteProtection(deleteProtection)
  }

  /**
   * @param description A description of the firewall.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param firewallName The descriptive name of the firewall. 
   * You can't change the name of a firewall after you create it.
   */
  public fun firewallName(firewallName: String) {
    cdkBuilder.firewallName(firewallName)
  }

  /**
   * @param firewallPolicyArn The Amazon Resource Name (ARN) of the firewall policy. 
   * The relationship of firewall to firewall policy is many to one. Each firewall requires one
   * firewall policy association, and you can use the same firewall policy for multiple firewalls.
   */
  public fun firewallPolicyArn(firewallPolicyArn: String) {
    cdkBuilder.firewallPolicyArn(firewallPolicyArn)
  }

  /**
   * @param firewallPolicyChangeProtection A setting indicating whether the firewall is protected
   * against a change to the firewall policy association.
   * Use this setting to protect against accidentally modifying the firewall policy for a firewall
   * that is in use. When you create a firewall, the operation initializes this setting to `TRUE` .
   */
  public fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: Boolean) {
    cdkBuilder.firewallPolicyChangeProtection(firewallPolicyChangeProtection)
  }

  /**
   * @param firewallPolicyChangeProtection A setting indicating whether the firewall is protected
   * against a change to the firewall policy association.
   * Use this setting to protect against accidentally modifying the firewall policy for a firewall
   * that is in use. When you create a firewall, the operation initializes this setting to `TRUE` .
   */
  public fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: IResolvable) {
    cdkBuilder.firewallPolicyChangeProtection(firewallPolicyChangeProtection)
  }

  /**
   * @param subnetChangeProtection A setting indicating whether the firewall is protected against
   * changes to the subnet associations.
   * Use this setting to protect against accidentally modifying the subnet associations for a
   * firewall that is in use. When you create a firewall, the operation initializes this setting to
   * `TRUE` .
   */
  public fun subnetChangeProtection(subnetChangeProtection: Boolean) {
    cdkBuilder.subnetChangeProtection(subnetChangeProtection)
  }

  /**
   * @param subnetChangeProtection A setting indicating whether the firewall is protected against
   * changes to the subnet associations.
   * Use this setting to protect against accidentally modifying the subnet associations for a
   * firewall that is in use. When you create a firewall, the operation initializes this setting to
   * `TRUE` .
   */
  public fun subnetChangeProtection(subnetChangeProtection: IResolvable) {
    cdkBuilder.subnetChangeProtection(subnetChangeProtection)
  }

  /**
   * @param subnetMappings The public subnets that Network Firewall is using for the firewall. 
   * Each subnet must belong to a different Availability Zone.
   */
  public fun subnetMappings(vararg subnetMappings: Any) {
    _subnetMappings.addAll(listOf(*subnetMappings))
  }

  /**
   * @param subnetMappings The public subnets that Network Firewall is using for the firewall. 
   * Each subnet must belong to a different Availability Zone.
   */
  public fun subnetMappings(subnetMappings: Collection<Any>) {
    _subnetMappings.addAll(subnetMappings)
  }

  /**
   * @param subnetMappings The public subnets that Network Firewall is using for the firewall. 
   * Each subnet must belong to a different Availability Zone.
   */
  public fun subnetMappings(subnetMappings: IResolvable) {
    cdkBuilder.subnetMappings(subnetMappings)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param vpcId The unique identifier of the VPC where the firewall is in use. 
   * You can't change the VPC of a firewall after you create the firewall.
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnFirewallProps {
    if(_subnetMappings.isNotEmpty()) cdkBuilder.subnetMappings(_subnetMappings)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
