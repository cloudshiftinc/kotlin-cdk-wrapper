@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnResourceVersion

@CdkDslMarker
public class CfnResourceVersionLoggingConfigPropertyDsl {
  private val cdkBuilder: CfnResourceVersion.LoggingConfigProperty.Builder =
      CfnResourceVersion.LoggingConfigProperty.builder()

  /**
   * @param logGroupName The Amazon CloudWatch logs group to which CloudFormation sends error
   * logging information when invoking the type's handlers.
   */
  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  /**
   * @param logRoleArn The ARN of the role that CloudFormation should assume when sending log
   * entries to CloudWatch logs.
   */
  public fun logRoleArn(logRoleArn: String) {
    cdkBuilder.logRoleArn(logRoleArn)
  }

  public fun build(): CfnResourceVersion.LoggingConfigProperty = cdkBuilder.build()
}
