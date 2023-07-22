@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

@CdkDslMarker
public class CfnComponentVersionLambdaFunctionRecipeSourcePropertyDsl {
  private val cdkBuilder: CfnComponentVersion.LambdaFunctionRecipeSourceProperty.Builder =
      CfnComponentVersion.LambdaFunctionRecipeSourceProperty.builder()

  private val _componentPlatforms: MutableList<Any> = mutableListOf()

  /**
   * @param componentDependencies The component versions on which this Lambda function component
   * depends.
   */
  public fun componentDependencies(componentDependencies: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(componentDependencies)
    cdkBuilder.componentDependencies(builder.map)
  }

  /**
   * @param componentDependencies The component versions on which this Lambda function component
   * depends.
   */
  public fun componentDependencies(componentDependencies: Map<String, Any>) {
    cdkBuilder.componentDependencies(componentDependencies)
  }

  /**
   * @param componentDependencies The component versions on which this Lambda function component
   * depends.
   */
  public fun componentDependencies(componentDependencies: IResolvable) {
    cdkBuilder.componentDependencies(componentDependencies)
  }

  /**
   * @param componentLambdaParameters The system and runtime parameters for the Lambda function as
   * it runs on the AWS IoT Greengrass core device.
   */
  public fun componentLambdaParameters(componentLambdaParameters: IResolvable) {
    cdkBuilder.componentLambdaParameters(componentLambdaParameters)
  }

  /**
   * @param componentLambdaParameters The system and runtime parameters for the Lambda function as
   * it runs on the AWS IoT Greengrass core device.
   */
  public
      fun componentLambdaParameters(componentLambdaParameters: CfnComponentVersion.LambdaExecutionParametersProperty) {
    cdkBuilder.componentLambdaParameters(componentLambdaParameters)
  }

  /**
   * @param componentName The name of the component.
   * Defaults to the name of the Lambda function.
   */
  public fun componentName(componentName: String) {
    cdkBuilder.componentName(componentName)
  }

  /**
   * @param componentPlatforms The platforms that the component version supports.
   */
  public fun componentPlatforms(vararg componentPlatforms: Any) {
    _componentPlatforms.addAll(listOf(*componentPlatforms))
  }

  /**
   * @param componentPlatforms The platforms that the component version supports.
   */
  public fun componentPlatforms(componentPlatforms: Collection<Any>) {
    _componentPlatforms.addAll(componentPlatforms)
  }

  /**
   * @param componentPlatforms The platforms that the component version supports.
   */
  public fun componentPlatforms(componentPlatforms: IResolvable) {
    cdkBuilder.componentPlatforms(componentPlatforms)
  }

  /**
   * @param componentVersion The version of the component.
   * Defaults to the version of the Lambda function as a semantic version. For example, if your
   * function version is `3` , the component version becomes `3.0.0` .
   */
  public fun componentVersion(componentVersion: String) {
    cdkBuilder.componentVersion(componentVersion)
  }

  /**
   * @param lambdaArn The ARN of the Lambda function.
   * The ARN must include the version of the function to import. You can't use version aliases like
   * `$LATEST` .
   */
  public fun lambdaArn(lambdaArn: String) {
    cdkBuilder.lambdaArn(lambdaArn)
  }

  public fun build(): CfnComponentVersion.LambdaFunctionRecipeSourceProperty {
    if(_componentPlatforms.isNotEmpty()) cdkBuilder.componentPlatforms(_componentPlatforms)
    return cdkBuilder.build()
  }
}
