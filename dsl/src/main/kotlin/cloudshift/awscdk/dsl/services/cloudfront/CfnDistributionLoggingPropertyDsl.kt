@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionLoggingPropertyDsl {
  private val cdkBuilder: CfnDistribution.LoggingProperty.Builder =
      CfnDistribution.LoggingProperty.builder()

  /**
   * @param bucket The Amazon S3 bucket to store the access logs in, for example,
   * `myawslogbucket.s3.amazonaws.com` . 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param includeCookies Specifies whether you want CloudFront to include cookies in access logs,
   * specify `true` for `IncludeCookies` .
   * If you choose to include cookies in logs, CloudFront logs all cookies regardless of how you
   * configure the cache behaviors for this distribution. If you don't want to include cookies when you
   * create a distribution or if you want to disable include cookies for an existing distribution,
   * specify `false` for `IncludeCookies` .
   */
  public fun includeCookies(includeCookies: Boolean) {
    cdkBuilder.includeCookies(includeCookies)
  }

  /**
   * @param includeCookies Specifies whether you want CloudFront to include cookies in access logs,
   * specify `true` for `IncludeCookies` .
   * If you choose to include cookies in logs, CloudFront logs all cookies regardless of how you
   * configure the cache behaviors for this distribution. If you don't want to include cookies when you
   * create a distribution or if you want to disable include cookies for an existing distribution,
   * specify `false` for `IncludeCookies` .
   */
  public fun includeCookies(includeCookies: IResolvable) {
    cdkBuilder.includeCookies(includeCookies)
  }

  /**
   * @param prefix An optional string that you want CloudFront to prefix to the access log
   * `filenames` for this distribution, for example, `myprefix/` .
   * If you want to enable logging, but you don't want to specify a prefix, you still must include
   * an empty `Prefix` element in the `Logging` element.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): CfnDistribution.LoggingProperty = cdkBuilder.build()
}
