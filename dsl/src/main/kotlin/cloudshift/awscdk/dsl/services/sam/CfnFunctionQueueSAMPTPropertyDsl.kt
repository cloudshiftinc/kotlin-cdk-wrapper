@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionQueueSAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.QueueSAMPTProperty.Builder =
      CfnFunction.QueueSAMPTProperty.builder()

  /**
   * @param queueName the value to be set. 
   */
  public fun queueName(queueName: String) {
    cdkBuilder.queueName(queueName)
  }

  public fun build(): CfnFunction.QueueSAMPTProperty = cdkBuilder.build()
}
