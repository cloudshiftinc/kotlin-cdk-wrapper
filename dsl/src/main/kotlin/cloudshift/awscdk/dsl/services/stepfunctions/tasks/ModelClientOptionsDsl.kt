@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions

@CdkDslMarker
public class ModelClientOptionsDsl {
  private val cdkBuilder: ModelClientOptions.Builder = ModelClientOptions.builder()

  /**
   * @param invocationsMaxRetries The maximum number of retries when invocation requests are
   * failing.
   */
  public fun invocationsMaxRetries(invocationsMaxRetries: Number) {
    cdkBuilder.invocationsMaxRetries(invocationsMaxRetries)
  }

  /**
   * @param invocationsTimeout The timeout duration for an invocation request.
   */
  public fun invocationsTimeout(invocationsTimeout: Duration) {
    cdkBuilder.invocationsTimeout(invocationsTimeout)
  }

  public fun build(): ModelClientOptions = cdkBuilder.build()
}
