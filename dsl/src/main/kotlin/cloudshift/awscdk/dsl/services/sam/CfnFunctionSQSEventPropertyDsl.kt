@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionSQSEventPropertyDsl {
  private val cdkBuilder: CfnFunction.SQSEventProperty.Builder =
      CfnFunction.SQSEventProperty.builder()

  /**
   * @param batchSize the value to be set.
   */
  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  /**
   * @param enabled the value to be set.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled the value to be set.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param queue the value to be set. 
   */
  public fun queue(queue: String) {
    cdkBuilder.queue(queue)
  }

  public fun build(): CfnFunction.SQSEventProperty = cdkBuilder.build()
}
