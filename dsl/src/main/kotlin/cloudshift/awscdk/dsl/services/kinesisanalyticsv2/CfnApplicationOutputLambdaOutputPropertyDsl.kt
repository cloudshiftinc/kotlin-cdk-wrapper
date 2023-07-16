@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput

@CdkDslMarker
public class CfnApplicationOutputLambdaOutputPropertyDsl {
  private val cdkBuilder: CfnApplicationOutput.LambdaOutputProperty.Builder =
      CfnApplicationOutput.LambdaOutputProperty.builder()

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnApplicationOutput.LambdaOutputProperty = cdkBuilder.build()
}
