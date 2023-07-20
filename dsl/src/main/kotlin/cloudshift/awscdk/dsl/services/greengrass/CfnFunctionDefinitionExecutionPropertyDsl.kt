@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition

@CdkDslMarker
public class CfnFunctionDefinitionExecutionPropertyDsl {
  private val cdkBuilder: CfnFunctionDefinition.ExecutionProperty.Builder =
      CfnFunctionDefinition.ExecutionProperty.builder()

  public fun isolationMode(isolationMode: String) {
    cdkBuilder.isolationMode(isolationMode)
  }

  public fun runAs(runAs: IResolvable) {
    cdkBuilder.runAs(runAs)
  }

  public fun runAs(runAs: CfnFunctionDefinition.RunAsProperty) {
    cdkBuilder.runAs(runAs)
  }

  public fun build(): CfnFunctionDefinition.ExecutionProperty = cdkBuilder.build()
}
