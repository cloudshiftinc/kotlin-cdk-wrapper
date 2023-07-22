@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.OriginBindOptions

/**
 * Options passed to Origin.bind().
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * OriginBindOptions originBindOptions = OriginBindOptions.builder()
 * .originId("originId")
 * .build();
 * ```
 */
@CdkDslMarker
public class OriginBindOptionsDsl {
  private val cdkBuilder: OriginBindOptions.Builder = OriginBindOptions.builder()

  /**
   * @param originId The identifier of this Origin, as assigned by the Distribution this Origin has
   * been used added to. 
   */
  public fun originId(originId: String) {
    cdkBuilder.originId(originId)
  }

  public fun build(): OriginBindOptions = cdkBuilder.build()
}
