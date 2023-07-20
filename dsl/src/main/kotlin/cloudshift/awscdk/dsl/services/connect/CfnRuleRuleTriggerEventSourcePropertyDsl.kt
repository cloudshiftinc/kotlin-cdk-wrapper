@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnRule

@CdkDslMarker
public class CfnRuleRuleTriggerEventSourcePropertyDsl {
  private val cdkBuilder: CfnRule.RuleTriggerEventSourceProperty.Builder =
      CfnRule.RuleTriggerEventSourceProperty.builder()

  public fun eventSourceName(eventSourceName: String) {
    cdkBuilder.eventSourceName(eventSourceName)
  }

  public fun integrationAssociationArn(integrationAssociationArn: String) {
    cdkBuilder.integrationAssociationArn(integrationAssociationArn)
  }

  public fun build(): CfnRule.RuleTriggerEventSourceProperty = cdkBuilder.build()
}
