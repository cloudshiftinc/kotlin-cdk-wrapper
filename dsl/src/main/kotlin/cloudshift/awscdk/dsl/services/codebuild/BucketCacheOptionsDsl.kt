@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.BucketCacheOptions

@CdkDslMarker
public class BucketCacheOptionsDsl {
  private val cdkBuilder: BucketCacheOptions.Builder = BucketCacheOptions.builder()

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): BucketCacheOptions = cdkBuilder.build()
}
