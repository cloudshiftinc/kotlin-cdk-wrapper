@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

@CdkDslMarker
public class CfnStateMachineTracingConfigurationPropertyDsl {
  private val cdkBuilder: CfnStateMachine.TracingConfigurationProperty.Builder =
      CfnStateMachine.TracingConfigurationProperty.builder()

  /**
   * @param enabled When set to `true` , X-Ray tracing is enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled When set to `true` , X-Ray tracing is enabled.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnStateMachine.TracingConfigurationProperty = cdkBuilder.build()
}
