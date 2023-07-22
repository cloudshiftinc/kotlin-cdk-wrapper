@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig

@CdkDslMarker
public class LogSubscriptionDestinationConfigDsl {
  private val cdkBuilder: LogSubscriptionDestinationConfig.Builder =
      LogSubscriptionDestinationConfig.builder()

  /**
   * @param arn The ARN of the subscription's destination. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param role The role to assume to write log events to the destination.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): LogSubscriptionDestinationConfig = cdkBuilder.build()
}
