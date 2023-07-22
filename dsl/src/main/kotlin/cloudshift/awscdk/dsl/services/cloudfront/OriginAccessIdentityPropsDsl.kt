@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps

@CdkDslMarker
public class OriginAccessIdentityPropsDsl {
  private val cdkBuilder: OriginAccessIdentityProps.Builder = OriginAccessIdentityProps.builder()

  /**
   * @param comment Any comments you want to include about the origin access identity.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun build(): OriginAccessIdentityProps = cdkBuilder.build()
}
