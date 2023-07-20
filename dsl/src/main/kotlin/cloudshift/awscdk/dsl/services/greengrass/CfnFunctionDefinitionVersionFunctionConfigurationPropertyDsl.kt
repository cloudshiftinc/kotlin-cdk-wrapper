@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

@CdkDslMarker
public class CfnFunctionDefinitionVersionFunctionConfigurationPropertyDsl {
  private val cdkBuilder: CfnFunctionDefinitionVersion.FunctionConfigurationProperty.Builder =
      CfnFunctionDefinitionVersion.FunctionConfigurationProperty.builder()

  public fun encodingType(encodingType: String) {
    cdkBuilder.encodingType(encodingType)
  }

  public fun environment(environment: IResolvable) {
    cdkBuilder.environment(environment)
  }

  public fun environment(environment: CfnFunctionDefinitionVersion.EnvironmentProperty) {
    cdkBuilder.environment(environment)
  }

  public fun execArgs(execArgs: String) {
    cdkBuilder.execArgs(execArgs)
  }

  public fun executable(executable: String) {
    cdkBuilder.executable(executable)
  }

  public fun memorySize(memorySize: Number) {
    cdkBuilder.memorySize(memorySize)
  }

  public fun pinned(pinned: Boolean) {
    cdkBuilder.pinned(pinned)
  }

  public fun pinned(pinned: IResolvable) {
    cdkBuilder.pinned(pinned)
  }

  public fun timeout(timeout: Number) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): CfnFunctionDefinitionVersion.FunctionConfigurationProperty =
      cdkBuilder.build()
}
