@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionCloudWatchLogsEventPropertyDsl {
  private val cdkBuilder: CfnFunction.CloudWatchLogsEventProperty.Builder =
      CfnFunction.CloudWatchLogsEventProperty.builder()

  /**
   * @param filterPattern the value to be set. 
   */
  public fun filterPattern(filterPattern: String) {
    cdkBuilder.filterPattern(filterPattern)
  }

  /**
   * @param logGroupName the value to be set. 
   */
  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  public fun build(): CfnFunction.CloudWatchLogsEventProperty = cdkBuilder.build()
}
