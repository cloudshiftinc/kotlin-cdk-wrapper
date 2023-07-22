@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

@CdkDslMarker
public class CfnFirewallPolicyCustomActionPropertyDsl {
  private val cdkBuilder: CfnFirewallPolicy.CustomActionProperty.Builder =
      CfnFirewallPolicy.CustomActionProperty.builder()

  /**
   * @param actionDefinition The custom action associated with the action name. 
   */
  public fun actionDefinition(actionDefinition: IResolvable) {
    cdkBuilder.actionDefinition(actionDefinition)
  }

  /**
   * @param actionDefinition The custom action associated with the action name. 
   */
  public fun actionDefinition(actionDefinition: CfnFirewallPolicy.ActionDefinitionProperty) {
    cdkBuilder.actionDefinition(actionDefinition)
  }

  /**
   * @param actionName The descriptive name of the custom action. 
   * You can't change the name of a custom action after you create it.
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  public fun build(): CfnFirewallPolicy.CustomActionProperty = cdkBuilder.build()
}
