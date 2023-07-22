@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy

@CdkDslMarker
public class CfnOriginRequestPolicyOriginRequestPolicyConfigPropertyDsl {
  private val cdkBuilder: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.Builder =
      CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.builder()

  /**
   * @param comment A comment to describe the origin request policy.
   * The comment cannot be longer than 128 characters.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param cookiesConfig The cookies from viewer requests to include in origin requests. 
   */
  public fun cookiesConfig(cookiesConfig: IResolvable) {
    cdkBuilder.cookiesConfig(cookiesConfig)
  }

  /**
   * @param cookiesConfig The cookies from viewer requests to include in origin requests. 
   */
  public fun cookiesConfig(cookiesConfig: CfnOriginRequestPolicy.CookiesConfigProperty) {
    cdkBuilder.cookiesConfig(cookiesConfig)
  }

  /**
   * @param headersConfig The HTTP headers to include in origin requests. 
   * These can include headers from viewer requests and additional headers added by CloudFront.
   */
  public fun headersConfig(headersConfig: IResolvable) {
    cdkBuilder.headersConfig(headersConfig)
  }

  /**
   * @param headersConfig The HTTP headers to include in origin requests. 
   * These can include headers from viewer requests and additional headers added by CloudFront.
   */
  public fun headersConfig(headersConfig: CfnOriginRequestPolicy.HeadersConfigProperty) {
    cdkBuilder.headersConfig(headersConfig)
  }

  /**
   * @param name A unique name to identify the origin request policy. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param queryStringsConfig The URL query strings from viewer requests to include in origin
   * requests. 
   */
  public fun queryStringsConfig(queryStringsConfig: IResolvable) {
    cdkBuilder.queryStringsConfig(queryStringsConfig)
  }

  /**
   * @param queryStringsConfig The URL query strings from viewer requests to include in origin
   * requests. 
   */
  public
      fun queryStringsConfig(queryStringsConfig: CfnOriginRequestPolicy.QueryStringsConfigProperty) {
    cdkBuilder.queryStringsConfig(queryStringsConfig)
  }

  public fun build(): CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty = cdkBuilder.build()
}
