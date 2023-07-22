@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnAccountProps

@CdkDslMarker
public class CfnAccountPropsDsl {
  private val cdkBuilder: CfnAccountProps.Builder = CfnAccountProps.builder()

  /**
   * @param cloudWatchRoleArn The ARN of an Amazon CloudWatch role for the current Account.
   */
  public fun cloudWatchRoleArn(cloudWatchRoleArn: String) {
    cdkBuilder.cloudWatchRoleArn(cloudWatchRoleArn)
  }

  public fun build(): CfnAccountProps = cdkBuilder.build()
}
