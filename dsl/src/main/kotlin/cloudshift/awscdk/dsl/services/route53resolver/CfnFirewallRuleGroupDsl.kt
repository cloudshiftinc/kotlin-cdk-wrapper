@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnFirewallRuleGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFirewallRuleGroup.Builder = CfnFirewallRuleGroup.Builder.create(scope,
      id)

  private val _firewallRules: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun firewallRules(vararg firewallRules: Any) {
    _firewallRules.addAll(listOf(*firewallRules))
  }

  public fun firewallRules(firewallRules: Collection<Any>) {
    _firewallRules.addAll(firewallRules)
  }

  public fun firewallRules(firewallRules: IResolvable) {
    cdkBuilder.firewallRules(firewallRules)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnFirewallRuleGroup {
    if(_firewallRules.isNotEmpty()) cdkBuilder.firewallRules(_firewallRules)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
