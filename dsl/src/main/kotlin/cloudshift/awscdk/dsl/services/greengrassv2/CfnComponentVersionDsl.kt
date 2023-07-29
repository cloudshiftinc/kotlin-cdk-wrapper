@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
import software.constructs.Construct

/**
 * Creates a component.
 *
 * Components are software that run on AWS IoT Greengrass core devices. After you develop and test a
 * component on your core device, you can use this operation to upload your component to AWS IoT
 * Greengrass . Then, you can deploy the component to other core devices.
 *
 * You can use this operation to do the following:
 * * *Create components from recipes*
 *
 * Create a component from a recipe, which is a file that defines the component's metadata,
 * parameters, dependencies, lifecycle, artifacts, and platform capability. For more information,
 * see
 * [AWS IoT Greengrass component recipe reference](https://docs.aws.amazon.com/greengrass/v2/developerguide/component-recipe-reference.html)
 * in the *AWS IoT Greengrass V2 Developer Guide* .
 *
 * To create a component from a recipe, specify `inlineRecipe` when you call this operation.
 * * *Create components from Lambda functions*
 *
 * Create a component from an AWS Lambda function that runs on AWS IoT Greengrass . This creates a
 * recipe and artifacts from the Lambda function's deployment package. You can use this operation to
 * migrate Lambda functions from AWS IoT Greengrass V1 to AWS IoT Greengrass V2 .
 *
 * This function only accepts Lambda functions that use the following runtimes:
 * * Python 2.7 – `python2.7`
 * * Python 3.7 – `python3.7`
 * * Python 3.8 – `python3.8`
 * * Java 8 – `java8`
 * * Node.js 10 – `nodejs10.x`
 * * Node.js 12 – `nodejs12.x`
 *
 * To create a component from a Lambda function, specify `lambdaFunction` when you call this
 * operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * CfnComponentVersion cfnComponentVersion = CfnComponentVersion.Builder.create(this,
 * "MyCfnComponentVersion")
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
public class CfnComponentVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnComponentVersion.Builder =
        CfnComponentVersion.Builder.create(scope, id)

    /**
     * The recipe to use to create the component.
     *
     * The recipe defines the component's metadata, parameters, dependencies, lifecycle, artifacts,
     * and platform compatibility.
     *
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-inlinerecipe)
     *
     * @param inlineRecipe The recipe to use to create the component.
     */
    public fun inlineRecipe(inlineRecipe: String) {
        cdkBuilder.inlineRecipe(inlineRecipe)
    }

    /**
     * The parameters to create a component from a Lambda function.
     *
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-lambdafunction)
     *
     * @param lambdaFunction The parameters to create a component from a Lambda function.
     */
    public fun lambdaFunction(lambdaFunction: IResolvable) {
        cdkBuilder.lambdaFunction(lambdaFunction)
    }

    /**
     * The parameters to create a component from a Lambda function.
     *
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-lambdafunction)
     *
     * @param lambdaFunction The parameters to create a component from a Lambda function.
     */
    public fun lambdaFunction(
        lambdaFunction: CfnComponentVersion.LambdaFunctionRecipeSourceProperty
    ) {
        cdkBuilder.lambdaFunction(lambdaFunction)
    }

    /**
     * Application-specific metadata to attach to the component version.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see
     * [Tag your AWS IoT Greengrass Version 2 resources](https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html)
     * in the *AWS IoT Greengrass V2 Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-tags)
     *
     * @param tags Application-specific metadata to attach to the component version.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnComponentVersion = cdkBuilder.build()
}
