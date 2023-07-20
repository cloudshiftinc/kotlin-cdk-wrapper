@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnFirewallPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFirewallPolicy.Builder = CfnFirewallPolicy.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun firewallPolicy(firewallPolicy: IResolvable) {
    cdkBuilder.firewallPolicy(firewallPolicy)
  }

  public fun firewallPolicy(firewallPolicy: CfnFirewallPolicy.FirewallPolicyProperty) {
    cdkBuilder.firewallPolicy(firewallPolicy)
  }

  public fun firewallPolicyName(firewallPolicyName: String) {
    cdkBuilder.firewallPolicyName(firewallPolicyName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnFirewallPolicy {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
