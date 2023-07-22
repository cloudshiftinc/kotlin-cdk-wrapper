@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

/**
 * The `MaintenanceWindowLambdaParameters` property type specifies the parameters for a `LAMBDA`
 * task type for a maintenance window task in AWS Systems Manager .
 *
 * `MaintenanceWindowLambdaParameters` is a property of the
 * [TaskInvocationParameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * MaintenanceWindowLambdaParametersProperty maintenanceWindowLambdaParametersProperty =
 * MaintenanceWindowLambdaParametersProperty.builder()
 * .clientContext("clientContext")
 * .payload("payload")
 * .qualifier("qualifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html)
 */
@CdkDslMarker
public class CfnMaintenanceWindowTaskMaintenanceWindowLambdaParametersPropertyDsl {
  private val cdkBuilder: CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty.Builder
      = CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty.builder()

  /**
   * @param clientContext Client-specific information to pass to the AWS Lambda function that you're
   * invoking.
   * You can then use the `context` variable to process the client information in your AWS Lambda
   * function.
   */
  public fun clientContext(clientContext: String) {
    cdkBuilder.clientContext(clientContext)
  }

  /**
   * @param payload JSON to provide to your AWS Lambda function as input.
   *
   * Although `Type` is listed as "String" for this property, the payload content must be formatted
   * as a Base64-encoded binary data object.
   *
   *
   * *Length Constraint:* 4096
   */
  public fun payload(payload: String) {
    cdkBuilder.payload(payload)
  }

  /**
   * @param qualifier An AWS Lambda function version or alias name.
   * If you specify a function version, the action uses the qualified function Amazon Resource Name
   * (ARN) to invoke a specific Lambda function. If you specify an alias name, the action uses the
   * alias ARN to invoke the Lambda function version that the alias points to.
   */
  public fun qualifier(qualifier: String) {
    cdkBuilder.qualifier(qualifier)
  }

  public fun build(): CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty =
      cdkBuilder.build()
}
