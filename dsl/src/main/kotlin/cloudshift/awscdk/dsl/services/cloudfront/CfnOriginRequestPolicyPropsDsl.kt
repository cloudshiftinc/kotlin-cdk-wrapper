@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps

/**
 * Properties for defining a `CfnOriginRequestPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnOriginRequestPolicyProps cfnOriginRequestPolicyProps = CfnOriginRequestPolicyProps.builder()
 * .originRequestPolicyConfig(OriginRequestPolicyConfigProperty.builder()
 * .cookiesConfig(CookiesConfigProperty.builder()
 * .cookieBehavior("cookieBehavior")
 * // the properties below are optional
 * .cookies(List.of("cookies"))
 * .build())
 * .headersConfig(HeadersConfigProperty.builder()
 * .headerBehavior("headerBehavior")
 * // the properties below are optional
 * .headers(List.of("headers"))
 * .build())
 * .name("name")
 * .queryStringsConfig(QueryStringsConfigProperty.builder()
 * .queryStringBehavior("queryStringBehavior")
 * // the properties below are optional
 * .queryStrings(List.of("queryStrings"))
 * .build())
 * // the properties below are optional
 * .comment("comment")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originrequestpolicy.html)
 */
@CdkDslMarker
public class CfnOriginRequestPolicyPropsDsl {
  private val cdkBuilder: CfnOriginRequestPolicyProps.Builder =
      CfnOriginRequestPolicyProps.builder()

  /**
   * @param originRequestPolicyConfig The origin request policy configuration. 
   */
  public fun originRequestPolicyConfig(originRequestPolicyConfig: IResolvable) {
    cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig)
  }

  /**
   * @param originRequestPolicyConfig The origin request policy configuration. 
   */
  public
      fun originRequestPolicyConfig(originRequestPolicyConfig: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty) {
    cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig)
  }

  public fun build(): CfnOriginRequestPolicyProps = cdkBuilder.build()
}
