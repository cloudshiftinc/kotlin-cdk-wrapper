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
import software.amazon.awscdk.services.networkfirewall.CfnFirewall
import software.constructs.Construct

@CdkDslMarker
public class CfnFirewallDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFirewall.Builder = CfnFirewall.Builder.create(scope, id)

  private val _subnetMappings: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun deleteProtection(deleteProtection: Boolean) {
    cdkBuilder.deleteProtection(deleteProtection)
  }

  public fun deleteProtection(deleteProtection: IResolvable) {
    cdkBuilder.deleteProtection(deleteProtection)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun firewallName(firewallName: String) {
    cdkBuilder.firewallName(firewallName)
  }

  public fun firewallPolicyArn(firewallPolicyArn: String) {
    cdkBuilder.firewallPolicyArn(firewallPolicyArn)
  }

  public fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: Boolean) {
    cdkBuilder.firewallPolicyChangeProtection(firewallPolicyChangeProtection)
  }

  public fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: IResolvable) {
    cdkBuilder.firewallPolicyChangeProtection(firewallPolicyChangeProtection)
  }

  public fun subnetChangeProtection(subnetChangeProtection: Boolean) {
    cdkBuilder.subnetChangeProtection(subnetChangeProtection)
  }

  public fun subnetChangeProtection(subnetChangeProtection: IResolvable) {
    cdkBuilder.subnetChangeProtection(subnetChangeProtection)
  }

  public fun subnetMappings(vararg subnetMappings: Any) {
    _subnetMappings.addAll(listOf(*subnetMappings))
  }

  public fun subnetMappings(subnetMappings: Collection<Any>) {
    _subnetMappings.addAll(subnetMappings)
  }

  public fun subnetMappings(subnetMappings: IResolvable) {
    cdkBuilder.subnetMappings(subnetMappings)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnFirewall {
    if(_subnetMappings.isNotEmpty()) cdkBuilder.subnetMappings(_subnetMappings)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
