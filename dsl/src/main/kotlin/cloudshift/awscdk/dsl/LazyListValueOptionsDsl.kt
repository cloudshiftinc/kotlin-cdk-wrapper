@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.LazyListValueOptions

@CdkDslMarker
public class LazyListValueOptionsDsl {
  private val cdkBuilder: LazyListValueOptions.Builder = LazyListValueOptions.builder()

  /**
   * @param displayHint Use the given name as a display hint.
   */
  public fun displayHint(displayHint: String) {
    cdkBuilder.displayHint(displayHint)
  }

  /**
   * @param omitEmpty If the produced list is empty, return 'undefined' instead.
   */
  public fun omitEmpty(omitEmpty: Boolean) {
    cdkBuilder.omitEmpty(omitEmpty)
  }

  public fun build(): LazyListValueOptions = cdkBuilder.build()
}
