@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties

@CdkDslMarker
public class AwsCloudFormationStackPropertiesDsl {
  private val cdkBuilder: AwsCloudFormationStackProperties.Builder =
      AwsCloudFormationStackProperties.builder()

  /**
   * @param parameters Values for CloudFormation stack parameters that should be passed when the
   * stack is deployed.
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param stackName The name to use for the CloudFormation stack.
   */
  public fun stackName(stackName: String) {
    cdkBuilder.stackName(stackName)
  }

  /**
   * @param templateFile A file relative to the assembly root which contains the CloudFormation
   * template for this stack. 
   */
  public fun templateFile(templateFile: String) {
    cdkBuilder.templateFile(templateFile)
  }

  /**
   * @param terminationProtection Whether to enable termination protection for this stack.
   */
  public fun terminationProtection(terminationProtection: Boolean) {
    cdkBuilder.terminationProtection(terminationProtection)
  }

  public fun build(): AwsCloudFormationStackProperties = cdkBuilder.build()
}
