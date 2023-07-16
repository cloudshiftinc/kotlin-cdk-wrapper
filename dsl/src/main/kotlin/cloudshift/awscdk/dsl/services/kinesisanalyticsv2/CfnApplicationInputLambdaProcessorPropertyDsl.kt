@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationInputLambdaProcessorPropertyDsl {
  private val cdkBuilder: CfnApplication.InputLambdaProcessorProperty.Builder =
      CfnApplication.InputLambdaProcessorProperty.builder()

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnApplication.InputLambdaProcessorProperty = cdkBuilder.build()
}
