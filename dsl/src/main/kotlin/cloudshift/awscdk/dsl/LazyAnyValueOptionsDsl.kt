@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.LazyAnyValueOptions

@CdkDslMarker
public class LazyAnyValueOptionsDsl {
  private val cdkBuilder: LazyAnyValueOptions.Builder = LazyAnyValueOptions.builder()

  /**
   * @param displayHint Use the given name as a display hint.
   */
  public fun displayHint(displayHint: String) {
    cdkBuilder.displayHint(displayHint)
  }

  /**
   * @param omitEmptyArray If the produced value is an array and it is empty, return 'undefined'
   * instead.
   */
  public fun omitEmptyArray(omitEmptyArray: Boolean) {
    cdkBuilder.omitEmptyArray(omitEmptyArray)
  }

  public fun build(): LazyAnyValueOptions = cdkBuilder.build()
}
