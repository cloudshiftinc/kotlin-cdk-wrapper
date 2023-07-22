@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionStateMachineSAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.StateMachineSAMPTProperty.Builder =
      CfnFunction.StateMachineSAMPTProperty.builder()

  /**
   * @param stateMachineName the value to be set. 
   */
  public fun stateMachineName(stateMachineName: String) {
    cdkBuilder.stateMachineName(stateMachineName)
  }

  public fun build(): CfnFunction.StateMachineSAMPTProperty = cdkBuilder.build()
}
