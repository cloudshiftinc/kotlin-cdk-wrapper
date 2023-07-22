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
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps

@CdkDslMarker
public class CfnFirewallPolicyPropsDsl {
  private val cdkBuilder: CfnFirewallPolicyProps.Builder = CfnFirewallPolicyProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description A description of the firewall policy.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
   * collection of stateless and stateful rule groups and other settings. 
   */
  public fun firewallPolicy(firewallPolicy: IResolvable) {
    cdkBuilder.firewallPolicy(firewallPolicy)
  }

  /**
   * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
   * collection of stateless and stateful rule groups and other settings. 
   */
  public fun firewallPolicy(firewallPolicy: CfnFirewallPolicy.FirewallPolicyProperty) {
    cdkBuilder.firewallPolicy(firewallPolicy)
  }

  /**
   * @param firewallPolicyName The descriptive name of the firewall policy. 
   * You can't change the name of a firewall policy after you create it.
   */
  public fun firewallPolicyName(firewallPolicyName: String) {
    cdkBuilder.firewallPolicyName(firewallPolicyName)
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

  public fun build(): CfnFirewallPolicyProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
