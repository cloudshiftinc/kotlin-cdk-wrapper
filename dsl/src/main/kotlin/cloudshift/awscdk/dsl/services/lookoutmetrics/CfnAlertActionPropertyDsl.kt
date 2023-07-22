@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert

@CdkDslMarker
public class CfnAlertActionPropertyDsl {
  private val cdkBuilder: CfnAlert.ActionProperty.Builder = CfnAlert.ActionProperty.builder()

  /**
   * @param lambdaConfiguration A configuration for an AWS Lambda channel.
   */
  public fun lambdaConfiguration(lambdaConfiguration: IResolvable) {
    cdkBuilder.lambdaConfiguration(lambdaConfiguration)
  }

  /**
   * @param lambdaConfiguration A configuration for an AWS Lambda channel.
   */
  public fun lambdaConfiguration(lambdaConfiguration: CfnAlert.LambdaConfigurationProperty) {
    cdkBuilder.lambdaConfiguration(lambdaConfiguration)
  }

  /**
   * @param snsConfiguration A configuration for an Amazon SNS channel.
   */
  public fun snsConfiguration(snsConfiguration: IResolvable) {
    cdkBuilder.snsConfiguration(snsConfiguration)
  }

  /**
   * @param snsConfiguration A configuration for an Amazon SNS channel.
   */
  public fun snsConfiguration(snsConfiguration: CfnAlert.SNSConfigurationProperty) {
    cdkBuilder.snsConfiguration(snsConfiguration)
  }

  public fun build(): CfnAlert.ActionProperty = cdkBuilder.build()
}
