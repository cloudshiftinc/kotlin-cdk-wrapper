@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.aps

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.aps.CfnWorkspace

@CdkDslMarker
public class CfnWorkspaceLoggingConfigurationPropertyDsl {
  private val cdkBuilder: CfnWorkspace.LoggingConfigurationProperty.Builder =
      CfnWorkspace.LoggingConfigurationProperty.builder()

  /**
   * @param logGroupArn The Amazon Resource Name (ARN) of the CloudWatch log group the logs are
   * emitted to.
   */
  public fun logGroupArn(logGroupArn: String) {
    cdkBuilder.logGroupArn(logGroupArn)
  }

  public fun build(): CfnWorkspace.LoggingConfigurationProperty = cdkBuilder.build()
}
