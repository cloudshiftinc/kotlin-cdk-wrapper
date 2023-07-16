@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.codebuild.S3LoggingOptions
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class S3LoggingOptionsDsl {
  private val cdkBuilder: S3LoggingOptions.Builder = S3LoggingOptions.builder()

  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun encrypted(encrypted: Boolean) {
    cdkBuilder.encrypted(encrypted)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): S3LoggingOptions = cdkBuilder.build()
}
