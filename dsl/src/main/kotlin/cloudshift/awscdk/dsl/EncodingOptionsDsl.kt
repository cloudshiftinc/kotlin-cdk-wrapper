@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.EncodingOptions

@CdkDslMarker
public class EncodingOptionsDsl {
  private val cdkBuilder: EncodingOptions.Builder = EncodingOptions.builder()

  /**
   * @param displayHint A hint for the Token's purpose when stringifying it.
   */
  public fun displayHint(displayHint: String) {
    cdkBuilder.displayHint(displayHint)
  }

  public fun build(): EncodingOptions = cdkBuilder.build()
}
