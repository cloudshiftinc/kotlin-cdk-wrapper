@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

@CdkDslMarker
public class CfnFirewallPolicyStatefulRuleGroupReferencePropertyDsl {
  private val cdkBuilder: CfnFirewallPolicy.StatefulRuleGroupReferenceProperty.Builder =
      CfnFirewallPolicy.StatefulRuleGroupReferenceProperty.builder()

  public fun `override`(`override`: IResolvable) {
    cdkBuilder.`override`(`override`)
  }

  public fun `override`(`override`: CfnFirewallPolicy.StatefulRuleGroupOverrideProperty) {
    cdkBuilder.`override`(`override`)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnFirewallPolicy.StatefulRuleGroupReferenceProperty = cdkBuilder.build()
}
