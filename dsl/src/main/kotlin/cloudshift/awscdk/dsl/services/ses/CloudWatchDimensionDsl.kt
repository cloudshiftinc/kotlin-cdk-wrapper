@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CloudWatchDimension
import software.amazon.awscdk.services.ses.CloudWatchDimensionSource

@CdkDslMarker
public class CloudWatchDimensionDsl {
  private val cdkBuilder: CloudWatchDimension.Builder = CloudWatchDimension.builder()

  public fun defaultValue(defaultValue: String) {
    cdkBuilder.defaultValue(defaultValue)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun source(source: CloudWatchDimensionSource) {
    cdkBuilder.source(source)
  }

  public fun build(): CloudWatchDimension = cdkBuilder.build()
}
