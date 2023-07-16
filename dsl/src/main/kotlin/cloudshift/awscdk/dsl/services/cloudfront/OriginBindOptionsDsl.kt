@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.OriginBindOptions

@CdkDslMarker
public class OriginBindOptionsDsl {
  private val cdkBuilder: OriginBindOptions.Builder = OriginBindOptions.builder()

  public fun originId(originId: String) {
    cdkBuilder.originId(originId)
  }

  public fun build(): OriginBindOptions = cdkBuilder.build()
}
