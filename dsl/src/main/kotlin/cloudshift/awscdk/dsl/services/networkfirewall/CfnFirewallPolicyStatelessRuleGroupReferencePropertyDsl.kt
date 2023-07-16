@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

@CdkDslMarker
public class CfnFirewallPolicyStatelessRuleGroupReferencePropertyDsl {
  private val cdkBuilder: CfnFirewallPolicy.StatelessRuleGroupReferenceProperty.Builder =
      CfnFirewallPolicy.StatelessRuleGroupReferenceProperty.builder()

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnFirewallPolicy.StatelessRuleGroupReferenceProperty = cdkBuilder.build()
}
