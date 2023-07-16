@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolCustomSMSSenderPropertyDsl {
  private val cdkBuilder: CfnUserPool.CustomSMSSenderProperty.Builder =
      CfnUserPool.CustomSMSSenderProperty.builder()

  public fun lambdaArn(lambdaArn: String) {
    cdkBuilder.lambdaArn(lambdaArn)
  }

  public fun lambdaVersion(lambdaVersion: String) {
    cdkBuilder.lambdaVersion(lambdaVersion)
  }

  public fun build(): CfnUserPool.CustomSMSSenderProperty = cdkBuilder.build()
}
