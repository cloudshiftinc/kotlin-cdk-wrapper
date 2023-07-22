@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

@CdkDslMarker
public class CfnFunctionDefinitionVersionDefaultConfigPropertyDsl {
  private val cdkBuilder: CfnFunctionDefinitionVersion.DefaultConfigProperty.Builder =
      CfnFunctionDefinitionVersion.DefaultConfigProperty.builder()

  /**
   * @param execution Configuration settings for the Lambda execution environment on the AWS IoT
   * Greengrass core. 
   */
  public fun execution(execution: IResolvable) {
    cdkBuilder.execution(execution)
  }

  /**
   * @param execution Configuration settings for the Lambda execution environment on the AWS IoT
   * Greengrass core. 
   */
  public fun execution(execution: CfnFunctionDefinitionVersion.ExecutionProperty) {
    cdkBuilder.execution(execution)
  }

  public fun build(): CfnFunctionDefinitionVersion.DefaultConfigProperty = cdkBuilder.build()
}
