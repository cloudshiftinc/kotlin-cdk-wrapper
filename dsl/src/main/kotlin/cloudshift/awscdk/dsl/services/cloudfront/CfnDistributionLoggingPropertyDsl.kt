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

  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  public fun includeCookies(includeCookies: Boolean) {
    cdkBuilder.includeCookies(includeCookies)
  }

  public fun includeCookies(includeCookies: IResolvable) {
    cdkBuilder.includeCookies(includeCookies)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): CfnDistribution.LoggingProperty = cdkBuilder.build()
}
