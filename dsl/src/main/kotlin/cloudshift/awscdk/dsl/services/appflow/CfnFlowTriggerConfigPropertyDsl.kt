@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowTriggerConfigPropertyDsl {
  private val cdkBuilder: CfnFlow.TriggerConfigProperty.Builder =
      CfnFlow.TriggerConfigProperty.builder()

  public fun triggerProperties(triggerProperties: IResolvable) {
    cdkBuilder.triggerProperties(triggerProperties)
  }

  public fun triggerProperties(triggerProperties: CfnFlow.ScheduledTriggerPropertiesProperty) {
    cdkBuilder.triggerProperties(triggerProperties)
  }

  public fun triggerType(triggerType: String) {
    cdkBuilder.triggerType(triggerType)
  }

  public fun build(): CfnFlow.TriggerConfigProperty = cdkBuilder.build()
}
