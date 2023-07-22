@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps

/**
 * Properties for defining a `CfnComponentVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * CfnComponentVersionProps cfnComponentVersionProps = CfnComponentVersionProps.builder()
 * .inlineRecipe("inlineRecipe")
 * .lambdaFunction(LambdaFunctionRecipeSourceProperty.builder()
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
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html)
 */
@CdkDslMarker
public class CfnComponentVersionPropsDsl {
  private val cdkBuilder: CfnComponentVersionProps.Builder = CfnComponentVersionProps.builder()

  /**
   * @param inlineRecipe The recipe to use to create the component.
   * The recipe defines the component's metadata, parameters, dependencies, lifecycle, artifacts,
   * and platform compatibility.
   *
   * You must specify either `InlineRecipe` or `LambdaFunction` .
   */
  public fun inlineRecipe(inlineRecipe: String) {
    cdkBuilder.inlineRecipe(inlineRecipe)
  }

  /**
   * @param lambdaFunction The parameters to create a component from a Lambda function.
   * You must specify either `InlineRecipe` or `LambdaFunction` .
   */
  public fun lambdaFunction(lambdaFunction: IResolvable) {
    cdkBuilder.lambdaFunction(lambdaFunction)
  }

  /**
   * @param lambdaFunction The parameters to create a component from a Lambda function.
   * You must specify either `InlineRecipe` or `LambdaFunction` .
   */
  public
      fun lambdaFunction(lambdaFunction: CfnComponentVersion.LambdaFunctionRecipeSourceProperty) {
    cdkBuilder.lambdaFunction(lambdaFunction)
  }

  /**
   * @param tags Application-specific metadata to attach to the component version.
   * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
   * also use tags to categorize your resources. For more information, see [Tag your AWS IoT Greengrass
   * Version 2 resources](https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html)
   * in the *AWS IoT Greengrass V2 Developer Guide* .
   *
   * This `Json` property type is processed as a map of key-value pairs. It uses the following
   * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
   *
   * ```
   * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
   * }
   * ```
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnComponentVersionProps = cdkBuilder.build()
}
