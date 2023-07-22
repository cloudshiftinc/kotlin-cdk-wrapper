@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionDeadLetterQueuePropertyDsl {
  private val cdkBuilder: CfnFunction.DeadLetterQueueProperty.Builder =
      CfnFunction.DeadLetterQueueProperty.builder()

  /**
   * @param targetArn the value to be set. 
   */
  public fun targetArn(targetArn: String) {
    cdkBuilder.targetArn(targetArn)
  }

  /**
   * @param type the value to be set. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnFunction.DeadLetterQueueProperty = cdkBuilder.build()
}
