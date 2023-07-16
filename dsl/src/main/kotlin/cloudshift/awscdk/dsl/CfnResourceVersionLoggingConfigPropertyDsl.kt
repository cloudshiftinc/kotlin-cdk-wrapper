@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnResourceVersion

@CdkDslMarker
public class CfnResourceVersionLoggingConfigPropertyDsl {
  private val cdkBuilder: CfnResourceVersion.LoggingConfigProperty.Builder =
      CfnResourceVersion.LoggingConfigProperty.builder()

  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  public fun logRoleArn(logRoleArn: String) {
    cdkBuilder.logRoleArn(logRoleArn)
  }

  public fun build(): CfnResourceVersion.LoggingConfigProperty = cdkBuilder.build()
}
