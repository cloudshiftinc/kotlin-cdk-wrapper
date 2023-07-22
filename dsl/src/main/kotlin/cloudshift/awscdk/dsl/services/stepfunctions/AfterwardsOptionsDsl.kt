@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.stepfunctions.AfterwardsOptions

@CdkDslMarker
public class AfterwardsOptionsDsl {
  private val cdkBuilder: AfterwardsOptions.Builder = AfterwardsOptions.builder()

  /**
   * @param includeErrorHandlers Whether to include error handling states.
   * If this is true, all states which are error handlers (added through 'onError')
   * and states reachable via error handlers will be included as well.
   */
  public fun includeErrorHandlers(includeErrorHandlers: Boolean) {
    cdkBuilder.includeErrorHandlers(includeErrorHandlers)
  }

  /**
   * @param includeOtherwise Whether to include the default/otherwise transition for the current
   * Choice state.
   * If this is true and the current Choice does not have a default outgoing
   * transition, one will be added included when .next() is called on the chain.
   */
  public fun includeOtherwise(includeOtherwise: Boolean) {
    cdkBuilder.includeOtherwise(includeOtherwise)
  }

  public fun build(): AfterwardsOptions = cdkBuilder.build()
}
