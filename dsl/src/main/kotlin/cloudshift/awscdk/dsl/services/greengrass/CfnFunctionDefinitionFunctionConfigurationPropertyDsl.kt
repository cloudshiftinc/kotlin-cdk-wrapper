@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition

@CdkDslMarker
public class CfnFunctionDefinitionFunctionConfigurationPropertyDsl {
  private val cdkBuilder: CfnFunctionDefinition.FunctionConfigurationProperty.Builder =
      CfnFunctionDefinition.FunctionConfigurationProperty.builder()

  /**
   * @param encodingType The expected encoding type of the input payload for the function.
   * Valid values are `json` (default) and `binary` .
   */
  public fun encodingType(encodingType: String) {
    cdkBuilder.encodingType(encodingType)
  }

  /**
   * @param environment The environment configuration of the function.
   */
  public fun environment(environment: IResolvable) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param environment The environment configuration of the function.
   */
  public fun environment(environment: CfnFunctionDefinition.EnvironmentProperty) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param execArgs The execution arguments.
   */
  public fun execArgs(execArgs: String) {
    cdkBuilder.execArgs(execArgs)
  }

  /**
   * @param executable The name of the function executable.
   */
  public fun executable(executable: String) {
    cdkBuilder.executable(executable)
  }

  /**
   * @param memorySize The memory size (in KB) required by the function.
   *
   * This property applies only to Lambda functions that run in a Greengrass container.
   */
  public fun memorySize(memorySize: Number) {
    cdkBuilder.memorySize(memorySize)
  }

  /**
   * @param pinned Indicates whether the function is pinned (or *long-lived* ).
   * Pinned functions start when the core starts and process all requests in the same container. The
   * default value is false.
   */
  public fun pinned(pinned: Boolean) {
    cdkBuilder.pinned(pinned)
  }

  /**
   * @param pinned Indicates whether the function is pinned (or *long-lived* ).
   * Pinned functions start when the core starts and process all requests in the same container. The
   * default value is false.
   */
  public fun pinned(pinned: IResolvable) {
    cdkBuilder.pinned(pinned)
  }

  /**
   * @param timeout The allowed execution time (in seconds) after which the function should
   * terminate.
   * For pinned functions, this timeout applies for each request.
   */
  public fun timeout(timeout: Number) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): CfnFunctionDefinition.FunctionConfigurationProperty = cdkBuilder.build()
}
