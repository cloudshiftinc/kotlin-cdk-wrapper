@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sns.BetweenCondition

@CdkDslMarker
public class BetweenConditionDsl {
  private val cdkBuilder: BetweenCondition.Builder = BetweenCondition.builder()

  /**
   * @param start The start value. 
   */
  public fun start(start: Number) {
    cdkBuilder.start(start)
  }

  /**
   * @param stop The stop value. 
   */
  public fun stop(stop: Number) {
    cdkBuilder.stop(stop)
  }

  public fun build(): BetweenCondition = cdkBuilder.build()
}
