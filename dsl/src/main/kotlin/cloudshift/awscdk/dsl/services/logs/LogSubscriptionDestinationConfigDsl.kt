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

  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): LogSubscriptionDestinationConfig = cdkBuilder.build()
}
