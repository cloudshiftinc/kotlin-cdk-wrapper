@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.lambda.EnvironmentOptions

@CdkDslMarker
public class EnvironmentOptionsDsl {
  private val cdkBuilder: EnvironmentOptions.Builder = EnvironmentOptions.builder()

  /**
   * @param removeInEdge When used in Lambda&#64;Edge via edgeArn() API, these environment variables
   * will be removed.
   * If not set, an error will be thrown.
   */
  public fun removeInEdge(removeInEdge: Boolean) {
    cdkBuilder.removeInEdge(removeInEdge)
  }

  public fun build(): EnvironmentOptions = cdkBuilder.build()
}
