@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy

@CdkDslMarker
public class CfnCachePolicyParametersInCacheKeyAndForwardedToOriginPropertyDsl {
  private val cdkBuilder: CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty.Builder =
      CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty.builder()

  public fun cookiesConfig(cookiesConfig: IResolvable) {
    cdkBuilder.cookiesConfig(cookiesConfig)
  }

  public fun cookiesConfig(cookiesConfig: CfnCachePolicy.CookiesConfigProperty) {
    cdkBuilder.cookiesConfig(cookiesConfig)
  }

  public fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean) {
    cdkBuilder.enableAcceptEncodingBrotli(enableAcceptEncodingBrotli)
  }

  public fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: IResolvable) {
    cdkBuilder.enableAcceptEncodingBrotli(enableAcceptEncodingBrotli)
  }

  public fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean) {
    cdkBuilder.enableAcceptEncodingGzip(enableAcceptEncodingGzip)
  }

  public fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: IResolvable) {
    cdkBuilder.enableAcceptEncodingGzip(enableAcceptEncodingGzip)
  }

  public fun headersConfig(headersConfig: IResolvable) {
    cdkBuilder.headersConfig(headersConfig)
  }

  public fun headersConfig(headersConfig: CfnCachePolicy.HeadersConfigProperty) {
    cdkBuilder.headersConfig(headersConfig)
  }

  public fun queryStringsConfig(queryStringsConfig: IResolvable) {
    cdkBuilder.queryStringsConfig(queryStringsConfig)
  }

  public fun queryStringsConfig(queryStringsConfig: CfnCachePolicy.QueryStringsConfigProperty) {
    cdkBuilder.queryStringsConfig(queryStringsConfig)
  }

  public fun build(): CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty =
      cdkBuilder.build()
}
