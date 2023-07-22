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

/**
 * Contains information about an AWS Lambda function to import to create a component.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * LambdaFunctionRecipeSourceProperty lambdaFunctionRecipeSourceProperty =
 * LambdaFunctionRecipeSourceProperty.builder()
 * .componentDependencies(Map.of(
 * "componentDependenciesKey", ComponentDependencyRequirementProperty.builder()
 * .dependencyType("dependencyType")
 * .versionRequirement("versionRequirement")
 * .build()))
 * .componentLambdaParameters(LambdaExecutionParametersProperty.builder()
 * .environmentVariables(Map.of(
 * "environmentVariablesKey", "environmentVariables"))
 * .eventSources(List.of(LambdaEventSourceProperty.builder()
 * .topic("topic")
 * .type("type")
 * .build()))
 * .execArgs(List.of("execArgs"))
 * .inputPayloadEncodingType("inputPayloadEncodingType")
 * .linuxProcessParams(LambdaLinuxProcessParamsProperty.builder()
 * .containerParams(LambdaContainerParamsProperty.builder()
 * .devices(List.of(LambdaDeviceMountProperty.builder()
 * .addGroupOwner(false)
 * .path("path")
 * .permission("permission")
 * .build()))
 * .memorySizeInKb(123)
 * .mountRoSysfs(false)
 * .volumes(List.of(LambdaVolumeMountProperty.builder()
 * .addGroupOwner(false)
 * .destinationPath("destinationPath")
 * .permission("permission")
 * .sourcePath("sourcePath")
 * .build()))
 * .build())
 * .isolationMode("isolationMode")
 * .build())
 * .maxIdleTimeInSeconds(123)
 * .maxInstancesCount(123)
 * .maxQueueSize(123)
 * .pinned(false)
 * .statusTimeoutInSeconds(123)
 * .timeoutInSeconds(123)
 * .build())
 * .componentName("componentName")
 * .componentPlatforms(List.of(ComponentPlatformProperty.builder()
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .name("name")
 * .build()))
 * .componentVersion("componentVersion")
 * .lambdaArn("lambdaArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdafunctionrecipesource.html)
 */
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
