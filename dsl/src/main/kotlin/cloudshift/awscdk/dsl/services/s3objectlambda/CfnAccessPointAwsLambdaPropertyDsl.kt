@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

@CdkDslMarker
public class CfnAccessPointAwsLambdaPropertyDsl {
  private val cdkBuilder: CfnAccessPoint.AwsLambdaProperty.Builder =
      CfnAccessPoint.AwsLambdaProperty.builder()

  /**
   * @param functionArn the value to be set. 
   */
  public fun functionArn(functionArn: String) {
    cdkBuilder.functionArn(functionArn)
  }

  /**
   * @param functionPayload the value to be set.
   */
  public fun functionPayload(functionPayload: String) {
    cdkBuilder.functionPayload(functionPayload)
  }

  public fun build(): CfnAccessPoint.AwsLambdaProperty = cdkBuilder.build()
}
