@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition

@CdkDslMarker
public class CfnFunctionDefinitionFunctionPropertyDsl {
  private val cdkBuilder: CfnFunctionDefinition.FunctionProperty.Builder =
      CfnFunctionDefinition.FunctionProperty.builder()

  /**
   * @param functionArn The Amazon Resource Name (ARN) of the alias (recommended) or version of the
   * referenced Lambda function. 
   */
  public fun functionArn(functionArn: String) {
    cdkBuilder.functionArn(functionArn)
  }

  /**
   * @param functionConfiguration The group-specific settings of the Lambda function. 
   * These settings configure the function's behavior in the Greengrass group.
   */
  public fun functionConfiguration(functionConfiguration: IResolvable) {
    cdkBuilder.functionConfiguration(functionConfiguration)
  }

  /**
   * @param functionConfiguration The group-specific settings of the Lambda function. 
   * These settings configure the function's behavior in the Greengrass group.
   */
  public
      fun functionConfiguration(functionConfiguration: CfnFunctionDefinition.FunctionConfigurationProperty) {
    cdkBuilder.functionConfiguration(functionConfiguration)
  }

  /**
   * @param id A descriptive or arbitrary ID for the function. 
   * This value must be unique within the function definition version. Maximum length is 128
   * characters with pattern `[a-zA-Z0-9:_-]+` .
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun build(): CfnFunctionDefinition.FunctionProperty = cdkBuilder.build()
}
