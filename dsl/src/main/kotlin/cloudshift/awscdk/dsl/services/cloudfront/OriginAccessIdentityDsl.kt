@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.OriginAccessIdentity
import software.constructs.Construct

@CdkDslMarker
public class OriginAccessIdentityDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: OriginAccessIdentity.Builder = OriginAccessIdentity.Builder.create(scope,
      id)

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun build(): OriginAccessIdentity = cdkBuilder.build()
}
