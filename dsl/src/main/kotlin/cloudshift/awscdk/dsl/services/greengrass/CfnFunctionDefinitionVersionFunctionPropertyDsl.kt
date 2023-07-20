@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

@CdkDslMarker
public class CfnFunctionDefinitionVersionFunctionPropertyDsl {
  private val cdkBuilder: CfnFunctionDefinitionVersion.FunctionProperty.Builder =
      CfnFunctionDefinitionVersion.FunctionProperty.builder()

  public fun functionArn(functionArn: String) {
    cdkBuilder.functionArn(functionArn)
  }

  public fun functionConfiguration(functionConfiguration: IResolvable) {
    cdkBuilder.functionConfiguration(functionConfiguration)
  }

  public
      fun functionConfiguration(functionConfiguration: CfnFunctionDefinitionVersion.FunctionConfigurationProperty) {
    cdkBuilder.functionConfiguration(functionConfiguration)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun build(): CfnFunctionDefinitionVersion.FunctionProperty = cdkBuilder.build()
}
