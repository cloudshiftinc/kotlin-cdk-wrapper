@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.cloudfront.LoggingConfiguration
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class LoggingConfigurationDsl {
  private val cdkBuilder: LoggingConfiguration.Builder = LoggingConfiguration.builder()

  /**
   * @param bucket Bucket to log requests to.
   */
  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param includeCookies Whether to include the cookies in the logs.
   */
  public fun includeCookies(includeCookies: Boolean) {
    cdkBuilder.includeCookies(includeCookies)
  }

  /**
   * @param prefix Where in the bucket to store logs.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): LoggingConfiguration = cdkBuilder.build()
}
