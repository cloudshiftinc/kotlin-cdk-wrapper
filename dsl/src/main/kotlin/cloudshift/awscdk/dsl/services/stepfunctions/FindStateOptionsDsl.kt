@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.stepfunctions.FindStateOptions

@CdkDslMarker
public class FindStateOptionsDsl {
  private val cdkBuilder: FindStateOptions.Builder = FindStateOptions.builder()

  /**
   * @param includeErrorHandlers Whether or not to follow error-handling transitions.
   */
  public fun includeErrorHandlers(includeErrorHandlers: Boolean) {
    cdkBuilder.includeErrorHandlers(includeErrorHandlers)
  }

  public fun build(): FindStateOptions = cdkBuilder.build()
}
