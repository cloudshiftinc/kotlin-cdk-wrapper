@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnRule

@CdkDslMarker
public class CfnRuleRuleTriggerEventSourcePropertyDsl {
  private val cdkBuilder: CfnRule.RuleTriggerEventSourceProperty.Builder =
      CfnRule.RuleTriggerEventSourceProperty.builder()

  /**
   * @param eventSourceName The name of the event source. 
   * *Allowed values* : `OnPostCallAnalysisAvailable` | `OnRealTimeCallAnalysisAvailable` |
   * `OnPostChatAnalysisAvailable` | `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` |
   * `OnSalesforceCaseCreate`
   */
  public fun eventSourceName(eventSourceName: String) {
    cdkBuilder.eventSourceName(eventSourceName)
  }

  /**
   * @param integrationAssociationArn The Amazon Resource Name (ARN) for the integration
   * association.
   * `IntegrationAssociationArn` is required if `TriggerEventSource` is one of the following values:
   * `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
   */
  public fun integrationAssociationArn(integrationAssociationArn: String) {
    cdkBuilder.integrationAssociationArn(integrationAssociationArn)
  }

  public fun build(): CfnRule.RuleTriggerEventSourceProperty = cdkBuilder.build()
}
