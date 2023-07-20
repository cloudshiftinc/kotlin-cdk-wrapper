@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps

@CdkDslMarker
public class CfnFirewallRuleGroupAssociationPropsDsl {
  private val cdkBuilder: CfnFirewallRuleGroupAssociationProps.Builder =
      CfnFirewallRuleGroupAssociationProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun firewallRuleGroupId(firewallRuleGroupId: String) {
    cdkBuilder.firewallRuleGroupId(firewallRuleGroupId)
  }

  public fun mutationProtection(mutationProtection: String) {
    cdkBuilder.mutationProtection(mutationProtection)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
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

  public fun build(): CfnFirewallRuleGroupAssociationProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
