@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.LazyStringValueOptions

/**
 * Options for creating a lazy string token.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * LazyStringValueOptions lazyStringValueOptions = LazyStringValueOptions.builder()
 * .displayHint("displayHint")
 * .build();
 * ```
 */
@CdkDslMarker
public class LazyStringValueOptionsDsl {
  private val cdkBuilder: LazyStringValueOptions.Builder = LazyStringValueOptions.builder()

  /**
   * @param displayHint Use the given name as a display hint.
   */
  public fun displayHint(displayHint: String) {
    cdkBuilder.displayHint(displayHint)
  }

  public fun build(): LazyStringValueOptions = cdkBuilder.build()
}
