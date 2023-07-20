@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnTypeActivation

@CdkDslMarker
public class CfnTypeActivationLoggingConfigPropertyDsl {
  private val cdkBuilder: CfnTypeActivation.LoggingConfigProperty.Builder =
      CfnTypeActivation.LoggingConfigProperty.builder()

  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  public fun logRoleArn(logRoleArn: String) {
    cdkBuilder.logRoleArn(logRoleArn)
  }

  public fun build(): CfnTypeActivation.LoggingConfigProperty = cdkBuilder.build()
}
