@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@CdkDslMarker
public class CfnLifecyclePolicyEventSourcePropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.EventSourceProperty.Builder =
      CfnLifecyclePolicy.EventSourceProperty.builder()

  /**
   * @param parameters Information about the event.
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param parameters Information about the event.
   */
  public fun parameters(parameters: CfnLifecyclePolicy.EventParametersProperty) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param type The source of the event. 
   * Currently only managed CloudWatch Events rules are supported.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnLifecyclePolicy.EventSourceProperty = cdkBuilder.build()
}
