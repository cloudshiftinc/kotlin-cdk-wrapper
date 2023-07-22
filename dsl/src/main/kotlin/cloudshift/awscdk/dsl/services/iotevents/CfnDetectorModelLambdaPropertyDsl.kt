@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelLambdaPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.LambdaProperty.Builder =
      CfnDetectorModel.LambdaProperty.builder()

  /**
   * @param functionArn The ARN of the Lambda function that is executed. 
   */
  public fun functionArn(functionArn: String) {
    cdkBuilder.functionArn(functionArn)
  }

  /**
   * @param payload You can configure the action payload when you send a message to a Lambda
   * function.
   */
  public fun payload(payload: IResolvable) {
    cdkBuilder.payload(payload)
  }

  /**
   * @param payload You can configure the action payload when you send a message to a Lambda
   * function.
   */
  public fun payload(payload: CfnDetectorModel.PayloadProperty) {
    cdkBuilder.payload(payload)
  }

  public fun build(): CfnDetectorModel.LambdaProperty = cdkBuilder.build()
}
