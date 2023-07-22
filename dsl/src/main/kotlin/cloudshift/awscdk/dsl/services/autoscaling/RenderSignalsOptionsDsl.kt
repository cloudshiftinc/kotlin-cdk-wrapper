@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.RenderSignalsOptions

/**
 * Input for Signals.renderCreationPolicy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * RenderSignalsOptions renderSignalsOptions = RenderSignalsOptions.builder()
 * .desiredCapacity(123)
 * .minCapacity(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class RenderSignalsOptionsDsl {
  private val cdkBuilder: RenderSignalsOptions.Builder = RenderSignalsOptions.builder()

  /**
   * @param desiredCapacity The desiredCapacity of the ASG.
   */
  public fun desiredCapacity(desiredCapacity: Number) {
    cdkBuilder.desiredCapacity(desiredCapacity)
  }

  /**
   * @param minCapacity The minSize of the ASG.
   */
  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun build(): RenderSignalsOptions = cdkBuilder.build()
}
