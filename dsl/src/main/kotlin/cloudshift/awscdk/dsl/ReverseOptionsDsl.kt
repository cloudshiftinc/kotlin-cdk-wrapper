@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.ReverseOptions

@CdkDslMarker
public class ReverseOptionsDsl {
  private val cdkBuilder: ReverseOptions.Builder = ReverseOptions.builder()

  /**
   * @param failConcat Fail if the given string is a concatenation.
   * If `false`, just return `undefined`.
   */
  public fun failConcat(failConcat: Boolean) {
    cdkBuilder.failConcat(failConcat)
  }

  public fun build(): ReverseOptions = cdkBuilder.build()
}
