@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps

@CdkDslMarker
public class CfnResponseHeadersPolicyPropsDsl {
  private val cdkBuilder: CfnResponseHeadersPolicyProps.Builder =
      CfnResponseHeadersPolicyProps.builder()

  public fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: IResolvable) {
    cdkBuilder.responseHeadersPolicyConfig(responseHeadersPolicyConfig)
  }

  public
      fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty) {
    cdkBuilder.responseHeadersPolicyConfig(responseHeadersPolicyConfig)
  }

  public fun build(): CfnResponseHeadersPolicyProps = cdkBuilder.build()
}
