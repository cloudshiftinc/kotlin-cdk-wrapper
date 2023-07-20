@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps

@CdkDslMarker
public class CfnOriginRequestPolicyPropsDsl {
  private val cdkBuilder: CfnOriginRequestPolicyProps.Builder =
      CfnOriginRequestPolicyProps.builder()

  public fun originRequestPolicyConfig(originRequestPolicyConfig: IResolvable) {
    cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig)
  }

  public
      fun originRequestPolicyConfig(originRequestPolicyConfig: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty) {
    cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig)
  }

  public fun build(): CfnOriginRequestPolicyProps = cdkBuilder.build()
}
