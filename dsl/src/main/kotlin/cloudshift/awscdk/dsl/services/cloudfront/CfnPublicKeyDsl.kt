@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnPublicKey
import software.constructs.Construct

@CdkDslMarker
public class CfnPublicKeyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPublicKey.Builder = CfnPublicKey.Builder.create(scope, id)

  public fun publicKeyConfig(publicKeyConfig: IResolvable) {
    cdkBuilder.publicKeyConfig(publicKeyConfig)
  }

  public fun publicKeyConfig(publicKeyConfig: CfnPublicKey.PublicKeyConfigProperty) {
    cdkBuilder.publicKeyConfig(publicKeyConfig)
  }

  public fun build(): CfnPublicKey = cdkBuilder.build()
}
