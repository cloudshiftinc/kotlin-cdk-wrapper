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

  public fun functionArn(functionArn: String) {
    cdkBuilder.functionArn(functionArn)
  }

  public fun functionConfiguration(functionConfiguration: IResolvable) {
    cdkBuilder.functionConfiguration(functionConfiguration)
  }

  public
      fun functionConfiguration(functionConfiguration: CfnFunctionDefinition.FunctionConfigurationProperty) {
    cdkBuilder.functionConfiguration(functionConfiguration)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun build(): CfnFunctionDefinition.FunctionProperty = cdkBuilder.build()
}
