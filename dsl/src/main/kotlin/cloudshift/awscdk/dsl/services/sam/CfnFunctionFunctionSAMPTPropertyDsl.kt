@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionFunctionSAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.FunctionSAMPTProperty.Builder =
      CfnFunction.FunctionSAMPTProperty.builder()

  /**
   * @param functionName the value to be set. 
   */
  public fun functionName(functionName: String) {
    cdkBuilder.functionName(functionName)
  }

  public fun build(): CfnFunction.FunctionSAMPTProperty = cdkBuilder.build()
}
