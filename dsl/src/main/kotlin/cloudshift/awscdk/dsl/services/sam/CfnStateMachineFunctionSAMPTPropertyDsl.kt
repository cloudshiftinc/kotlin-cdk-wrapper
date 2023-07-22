@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnStateMachine

@CdkDslMarker
public class CfnStateMachineFunctionSAMPTPropertyDsl {
  private val cdkBuilder: CfnStateMachine.FunctionSAMPTProperty.Builder =
      CfnStateMachine.FunctionSAMPTProperty.builder()

  /**
   * @param functionName the value to be set. 
   */
  public fun functionName(functionName: String) {
    cdkBuilder.functionName(functionName)
  }

  public fun build(): CfnStateMachine.FunctionSAMPTProperty = cdkBuilder.build()
}
