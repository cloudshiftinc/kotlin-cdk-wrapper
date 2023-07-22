@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnLoggingProps

@CdkDslMarker
public class CfnLoggingPropsDsl {
  private val cdkBuilder: CfnLoggingProps.Builder = CfnLoggingProps.builder()

  /**
   * @param accountId The account ID. 
   */
  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  /**
   * @param defaultLogLevel The default log level. 
   * Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`
   */
  public fun defaultLogLevel(defaultLogLevel: String) {
    cdkBuilder.defaultLogLevel(defaultLogLevel)
  }

  /**
   * @param roleArn The role ARN used for the log. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnLoggingProps = cdkBuilder.build()
}
