@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnStateMachine

@CdkDslMarker
public class CfnStateMachineApiEventPropertyDsl {
  private val cdkBuilder: CfnStateMachine.ApiEventProperty.Builder =
      CfnStateMachine.ApiEventProperty.builder()

  /**
   * @param method the value to be set. 
   */
  public fun method(method: String) {
    cdkBuilder.method(method)
  }

  /**
   * @param path the value to be set. 
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  /**
   * @param restApiId the value to be set.
   */
  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun build(): CfnStateMachine.ApiEventProperty = cdkBuilder.build()
}
