@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert

@CdkDslMarker
public class CfnAlertLambdaConfigurationPropertyDsl {
  private val cdkBuilder: CfnAlert.LambdaConfigurationProperty.Builder =
      CfnAlert.LambdaConfigurationProperty.builder()

  public fun lambdaArn(lambdaArn: String) {
    cdkBuilder.lambdaArn(lambdaArn)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnAlert.LambdaConfigurationProperty = cdkBuilder.build()
}
