@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.TimeConversionOptions

/**
 * Options for how to convert time to a different unit.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * TimeConversionOptions timeConversionOptions = TimeConversionOptions.builder()
 * .integral(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class TimeConversionOptionsDsl {
  private val cdkBuilder: TimeConversionOptions.Builder = TimeConversionOptions.builder()

  /**
   * @param integral If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`)
   * will fail if the result is not an integer.
   */
  public fun integral(integral: Boolean) {
    cdkBuilder.integral(integral)
  }

  public fun build(): TimeConversionOptions = cdkBuilder.build()
}
