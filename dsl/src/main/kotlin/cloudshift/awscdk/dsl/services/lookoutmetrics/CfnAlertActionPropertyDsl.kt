@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert

@CdkDslMarker
public class CfnAlertActionPropertyDsl {
  private val cdkBuilder: CfnAlert.ActionProperty.Builder = CfnAlert.ActionProperty.builder()

  public fun lambdaConfiguration(lambdaConfiguration: IResolvable) {
    cdkBuilder.lambdaConfiguration(lambdaConfiguration)
  }

  public fun lambdaConfiguration(lambdaConfiguration: CfnAlert.LambdaConfigurationProperty) {
    cdkBuilder.lambdaConfiguration(lambdaConfiguration)
  }

  public fun snsConfiguration(snsConfiguration: IResolvable) {
    cdkBuilder.snsConfiguration(snsConfiguration)
  }

  public fun snsConfiguration(snsConfiguration: CfnAlert.SNSConfigurationProperty) {
    cdkBuilder.snsConfiguration(snsConfiguration)
  }

  public fun build(): CfnAlert.ActionProperty = cdkBuilder.build()
}
