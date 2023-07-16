@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions
import software.amazon.awscdk.services.logs.ILogGroup

@CdkDslMarker
public class CloudWatchLoggingOptionsDsl {
  private val cdkBuilder: CloudWatchLoggingOptions.Builder = CloudWatchLoggingOptions.builder()

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun logGroup(logGroup: ILogGroup) {
    cdkBuilder.logGroup(logGroup)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): CloudWatchLoggingOptions = cdkBuilder.build()
}
