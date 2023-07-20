@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnOriginRequestPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnOriginRequestPolicy.Builder =
      CfnOriginRequestPolicy.Builder.create(scope, id)

  public fun originRequestPolicyConfig(originRequestPolicyConfig: IResolvable) {
    cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig)
  }

  public
      fun originRequestPolicyConfig(originRequestPolicyConfig: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty) {
    cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig)
  }

  public fun build(): CfnOriginRequestPolicy = cdkBuilder.build()
}
