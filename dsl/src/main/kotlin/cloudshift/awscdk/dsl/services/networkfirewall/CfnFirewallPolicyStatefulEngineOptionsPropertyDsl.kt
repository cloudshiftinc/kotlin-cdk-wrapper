@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

@CdkDslMarker
public class CfnFirewallPolicyStatefulEngineOptionsPropertyDsl {
  private val cdkBuilder: CfnFirewallPolicy.StatefulEngineOptionsProperty.Builder =
      CfnFirewallPolicy.StatefulEngineOptionsProperty.builder()

  public fun ruleOrder(ruleOrder: String) {
    cdkBuilder.ruleOrder(ruleOrder)
  }

  public fun streamExceptionPolicy(streamExceptionPolicy: String) {
    cdkBuilder.streamExceptionPolicy(streamExceptionPolicy)
  }

  public fun build(): CfnFirewallPolicy.StatefulEngineOptionsProperty = cdkBuilder.build()
}
