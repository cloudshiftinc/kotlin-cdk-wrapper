@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnHookVersion

@CdkDslMarker
public class CfnHookVersionLoggingConfigPropertyDsl {
  private val cdkBuilder: CfnHookVersion.LoggingConfigProperty.Builder =
      CfnHookVersion.LoggingConfigProperty.builder()

  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  public fun logRoleArn(logRoleArn: String) {
    cdkBuilder.logRoleArn(logRoleArn)
  }

  public fun build(): CfnHookVersion.LoggingConfigProperty = cdkBuilder.build()
}
