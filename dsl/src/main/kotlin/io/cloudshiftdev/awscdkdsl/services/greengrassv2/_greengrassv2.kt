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

package io.cloudshiftdev.awscdkdsl.services.greengrassv2

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps
import software.amazon.awscdk.services.greengrassv2.CfnDeployment
import software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps
import software.constructs.Construct

public object greengrassv2 {
    /**
     * Creates a component.
     *
     * Components are software that run on AWS IoT Greengrass core devices. After you develop and
     * test a component on your core device, you can use this operation to upload your component to
     * AWS IoT Greengrass . Then, you can deploy the component to other core devices.
     *
     * You can use this operation to do the following:
     * * *Create components from recipes*
     *
     * Create a component from a recipe, which is a file that defines the component's metadata,
     * parameters, dependencies, lifecycle, artifacts, and platform capability. For more
     * information, see
     * [AWS IoT Greengrass component recipe reference](https://docs.aws.amazon.com/greengrass/v2/developerguide/component-recipe-reference.html)
     * in the *AWS IoT Greengrass V2 Developer Guide* .
     *
     * To create a component from a recipe, specify `inlineRecipe` when you call this operation.
     * * *Create components from Lambda functions*
     *
     * Create a component from an AWS Lambda function that runs on AWS IoT Greengrass . This creates
     * a recipe and artifacts from the Lambda function's deployment package. You can use this
     * operation to migrate Lambda functions from AWS IoT Greengrass V1 to AWS IoT Greengrass V2 .
     *
     * This function accepts Lambda functions in all supported versions of Python, Node.js, and Java
     * runtimes. AWS IoT Greengrass doesn't apply any additional restrictions on deprecated Lambda
     * runtime versions.
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
    public inline fun cfnComponentVersion(
        scope: Construct,
        id: String,
        block: CfnComponentVersionDsl.() -> Unit = {},
    ): CfnComponentVersion {
        val builder = CfnComponentVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about a component dependency for a Lambda function component.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * ComponentDependencyRequirementProperty componentDependencyRequirementProperty =
     * ComponentDependencyRequirementProperty.builder()
     * .dependencyType("dependencyType")
     * .versionRequirement("versionRequirement")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-componentdependencyrequirement.html)
     */
    public inline fun cfnComponentVersionComponentDependencyRequirementProperty(
        block: CfnComponentVersionComponentDependencyRequirementPropertyDsl.() -> Unit = {}
    ): CfnComponentVersion.ComponentDependencyRequirementProperty {
        val builder = CfnComponentVersionComponentDependencyRequirementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about a platform that a component supports.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * ComponentPlatformProperty componentPlatformProperty = ComponentPlatformProperty.builder()
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-componentplatform.html)
     */
    public inline fun cfnComponentVersionComponentPlatformProperty(
        block: CfnComponentVersionComponentPlatformPropertyDsl.() -> Unit = {}
    ): CfnComponentVersion.ComponentPlatformProperty {
        val builder = CfnComponentVersionComponentPlatformPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about a container in which AWS Lambda functions run on AWS IoT
     * Greengrass core devices.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * LambdaContainerParamsProperty lambdaContainerParamsProperty =
     * LambdaContainerParamsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdacontainerparams.html)
     */
    public inline fun cfnComponentVersionLambdaContainerParamsProperty(
        block: CfnComponentVersionLambdaContainerParamsPropertyDsl.() -> Unit = {}
    ): CfnComponentVersion.LambdaContainerParamsProperty {
        val builder = CfnComponentVersionLambdaContainerParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about a device that Linux processes in a container can access.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * LambdaDeviceMountProperty lambdaDeviceMountProperty = LambdaDeviceMountProperty.builder()
     * .addGroupOwner(false)
     * .path("path")
     * .permission("permission")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdadevicemount.html)
     */
    public inline fun cfnComponentVersionLambdaDeviceMountProperty(
        block: CfnComponentVersionLambdaDeviceMountPropertyDsl.() -> Unit = {}
    ): CfnComponentVersion.LambdaDeviceMountProperty {
        val builder = CfnComponentVersionLambdaDeviceMountPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about an event source for an AWS Lambda function.
     *
     * The event source defines the topics on which this Lambda function subscribes to receive
     * messages that run the function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * LambdaEventSourceProperty lambdaEventSourceProperty = LambdaEventSourceProperty.builder()
     * .topic("topic")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaeventsource.html)
     */
    public inline fun cfnComponentVersionLambdaEventSourceProperty(
        block: CfnComponentVersionLambdaEventSourcePropertyDsl.() -> Unit = {}
    ): CfnComponentVersion.LambdaEventSourceProperty {
        val builder = CfnComponentVersionLambdaEventSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains parameters for a Lambda function that runs on AWS IoT Greengrass .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * LambdaExecutionParametersProperty lambdaExecutionParametersProperty =
     * LambdaExecutionParametersProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html)
     */
    public inline fun cfnComponentVersionLambdaExecutionParametersProperty(
        block: CfnComponentVersionLambdaExecutionParametersPropertyDsl.() -> Unit = {}
    ): CfnComponentVersion.LambdaExecutionParametersProperty {
        val builder = CfnComponentVersionLambdaExecutionParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about an AWS Lambda function to import to create a component.
     *
     * Example:
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
    public inline fun cfnComponentVersionLambdaFunctionRecipeSourceProperty(
        block: CfnComponentVersionLambdaFunctionRecipeSourcePropertyDsl.() -> Unit = {}
    ): CfnComponentVersion.LambdaFunctionRecipeSourceProperty {
        val builder = CfnComponentVersionLambdaFunctionRecipeSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains parameters for a Linux process that contains an AWS Lambda function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * LambdaLinuxProcessParamsProperty lambdaLinuxProcessParamsProperty =
     * LambdaLinuxProcessParamsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdalinuxprocessparams.html)
     */
    public inline fun cfnComponentVersionLambdaLinuxProcessParamsProperty(
        block: CfnComponentVersionLambdaLinuxProcessParamsPropertyDsl.() -> Unit = {}
    ): CfnComponentVersion.LambdaLinuxProcessParamsProperty {
        val builder = CfnComponentVersionLambdaLinuxProcessParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about a volume that Linux processes in a container can access.
     *
     * When you define a volume, the AWS IoT Greengrass Core software mounts the source files to the
     * destination inside the container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * LambdaVolumeMountProperty lambdaVolumeMountProperty = LambdaVolumeMountProperty.builder()
     * .addGroupOwner(false)
     * .destinationPath("destinationPath")
     * .permission("permission")
     * .sourcePath("sourcePath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdavolumemount.html)
     */
    public inline fun cfnComponentVersionLambdaVolumeMountProperty(
        block: CfnComponentVersionLambdaVolumeMountPropertyDsl.() -> Unit = {}
    ): CfnComponentVersion.LambdaVolumeMountProperty {
        val builder = CfnComponentVersionLambdaVolumeMountPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnComponentVersion`.
     *
     * Example:
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
    public inline fun cfnComponentVersionProps(
        block: CfnComponentVersionPropsDsl.() -> Unit = {}
    ): CfnComponentVersionProps {
        val builder = CfnComponentVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a continuous deployment for a target, which is a AWS IoT Greengrass core device or
     * group of core devices.
     *
     * When you add a new core device to a group of core devices that has a deployment, AWS IoT
     * Greengrass deploys that group's deployment to the new device.
     *
     * You can define one deployment for each target. When you create a new deployment for a target
     * that has an existing deployment, you replace the previous deployment. AWS IoT Greengrass
     * applies the new deployment to the target devices.
     *
     * You can only add, update, or delete up to 10 deployments at a time to a single target.
     *
     * Every deployment has a revision number that indicates how many deployment revisions you
     * define for a target. Use this operation to create a new revision of an existing deployment.
     * This operation returns the revision number of the new deployment when you create it.
     *
     * For more information, see the
     * [Create deployments](https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html)
     * in the *AWS IoT Greengrass V2 Developer Guide* .
     *
     * Deployment resources are deleted when you delete stacks. To keep the deployments in a stack,
     * you must specify `"DeletionPolicy": "Retain"` on each deployment resource in the stack
     * template that you want to keep. For more information, see
     * [DeletionPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
     * .
     *
     * You can only delete up to 10 deployment resources at a time. If you delete more than 10
     * resources, you receive an error.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * Object rateIncreaseCriteria;
     * CfnDeployment cfnDeployment = CfnDeployment.Builder.create(this, "MyCfnDeployment")
     * .targetArn("targetArn")
     * // the properties below are optional
     * .components(Map.of(
     * "componentsKey", ComponentDeploymentSpecificationProperty.builder()
     * .componentVersion("componentVersion")
     * .configurationUpdate(ComponentConfigurationUpdateProperty.builder()
     * .merge("merge")
     * .reset(List.of("reset"))
     * .build())
     * .runWith(ComponentRunWithProperty.builder()
     * .posixUser("posixUser")
     * .systemResourceLimits(SystemResourceLimitsProperty.builder()
     * .cpus(123)
     * .memory(123)
     * .build())
     * .windowsUser("windowsUser")
     * .build())
     * .build()))
     * .deploymentName("deploymentName")
     * .deploymentPolicies(DeploymentPoliciesProperty.builder()
     * .componentUpdatePolicy(DeploymentComponentUpdatePolicyProperty.builder()
     * .action("action")
     * .timeoutInSeconds(123)
     * .build())
     * .configurationValidationPolicy(DeploymentConfigurationValidationPolicyProperty.builder()
     * .timeoutInSeconds(123)
     * .build())
     * .failureHandlingPolicy("failureHandlingPolicy")
     * .build())
     * .iotJobConfiguration(DeploymentIoTJobConfigurationProperty.builder()
     * .abortConfig(IoTJobAbortConfigProperty.builder()
     * .criteriaList(List.of(IoTJobAbortCriteriaProperty.builder()
     * .action("action")
     * .failureType("failureType")
     * .minNumberOfExecutedThings(123)
     * .thresholdPercentage(123)
     * .build()))
     * .build())
     * .jobExecutionsRolloutConfig(IoTJobExecutionsRolloutConfigProperty.builder()
     * .exponentialRate(IoTJobExponentialRolloutRateProperty.builder()
     * .baseRatePerMinute(123)
     * .incrementFactor(123)
     * .rateIncreaseCriteria(rateIncreaseCriteria)
     * .build())
     * .maximumPerMinute(123)
     * .build())
     * .timeoutConfig(IoTJobTimeoutConfigProperty.builder()
     * .inProgressTimeoutInMinutes(123)
     * .build())
     * .build())
     * .parentTargetArn("parentTargetArn")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html)
     */
    public inline fun cfnDeployment(
        scope: Construct,
        id: String,
        block: CfnDeploymentDsl.() -> Unit = {},
    ): CfnDeployment {
        val builder = CfnDeploymentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about a deployment's update to a component's configuration on AWS IoT
     * Greengrass core devices.
     *
     * For more information, see
     * [Update component configurations](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html)
     * in the *AWS IoT Greengrass V2 Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * ComponentConfigurationUpdateProperty componentConfigurationUpdateProperty =
     * ComponentConfigurationUpdateProperty.builder()
     * .merge("merge")
     * .reset(List.of("reset"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentconfigurationupdate.html)
     */
    public inline fun cfnDeploymentComponentConfigurationUpdateProperty(
        block: CfnDeploymentComponentConfigurationUpdatePropertyDsl.() -> Unit = {}
    ): CfnDeployment.ComponentConfigurationUpdateProperty {
        val builder = CfnDeploymentComponentConfigurationUpdatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about a component to deploy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * ComponentDeploymentSpecificationProperty componentDeploymentSpecificationProperty =
     * ComponentDeploymentSpecificationProperty.builder()
     * .componentVersion("componentVersion")
     * .configurationUpdate(ComponentConfigurationUpdateProperty.builder()
     * .merge("merge")
     * .reset(List.of("reset"))
     * .build())
     * .runWith(ComponentRunWithProperty.builder()
     * .posixUser("posixUser")
     * .systemResourceLimits(SystemResourceLimitsProperty.builder()
     * .cpus(123)
     * .memory(123)
     * .build())
     * .windowsUser("windowsUser")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentdeploymentspecification.html)
     */
    public inline fun cfnDeploymentComponentDeploymentSpecificationProperty(
        block: CfnDeploymentComponentDeploymentSpecificationPropertyDsl.() -> Unit = {}
    ): CfnDeployment.ComponentDeploymentSpecificationProperty {
        val builder = CfnDeploymentComponentDeploymentSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information system user and group that the AWS IoT Greengrass Core software uses to
     * run component processes on the core device.
     *
     * For more information, see
     * [Configure the user and group that run components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
     * in the *AWS IoT Greengrass V2 Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * ComponentRunWithProperty componentRunWithProperty = ComponentRunWithProperty.builder()
     * .posixUser("posixUser")
     * .systemResourceLimits(SystemResourceLimitsProperty.builder()
     * .cpus(123)
     * .memory(123)
     * .build())
     * .windowsUser("windowsUser")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentrunwith.html)
     */
    public inline fun cfnDeploymentComponentRunWithProperty(
        block: CfnDeploymentComponentRunWithPropertyDsl.() -> Unit = {}
    ): CfnDeployment.ComponentRunWithProperty {
        val builder = CfnDeploymentComponentRunWithPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about a deployment's policy that defines when components are safe to
     * update.
     *
     * Each component on a device can report whether or not it's ready to update. After a component
     * and its dependencies are ready, they can apply the update in the deployment. You can
     * configure whether or not the deployment notifies components of an update and waits for a
     * response. You specify the amount of time each component has to respond to the update
     * notification.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * DeploymentComponentUpdatePolicyProperty deploymentComponentUpdatePolicyProperty =
     * DeploymentComponentUpdatePolicyProperty.builder()
     * .action("action")
     * .timeoutInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentcomponentupdatepolicy.html)
     */
    public inline fun cfnDeploymentDeploymentComponentUpdatePolicyProperty(
        block: CfnDeploymentDeploymentComponentUpdatePolicyPropertyDsl.() -> Unit = {}
    ): CfnDeployment.DeploymentComponentUpdatePolicyProperty {
        val builder = CfnDeploymentDeploymentComponentUpdatePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about how long a component on a core device can validate its
     * configuration updates before it times out.
     *
     * Components can use the
     * [SubscribeToValidateConfigurationUpdates](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetovalidateconfigurationupdates)
     * IPC operation to receive notifications when a deployment specifies a configuration update.
     * Then, components can respond with the
     * [SendConfigurationValidityReport](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-sendconfigurationvalidityreport)
     * IPC operation. For more information, see the
     * [Create deployments](https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html)
     * in the *AWS IoT Greengrass V2 Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * DeploymentConfigurationValidationPolicyProperty deploymentConfigurationValidationPolicyProperty
     * = DeploymentConfigurationValidationPolicyProperty.builder()
     * .timeoutInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentconfigurationvalidationpolicy.html)
     */
    public inline fun cfnDeploymentDeploymentConfigurationValidationPolicyProperty(
        block: CfnDeploymentDeploymentConfigurationValidationPolicyPropertyDsl.() -> Unit = {}
    ): CfnDeployment.DeploymentConfigurationValidationPolicyProperty {
        val builder = CfnDeploymentDeploymentConfigurationValidationPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about an AWS IoT job configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * Object rateIncreaseCriteria;
     * DeploymentIoTJobConfigurationProperty deploymentIoTJobConfigurationProperty =
     * DeploymentIoTJobConfigurationProperty.builder()
     * .abortConfig(IoTJobAbortConfigProperty.builder()
     * .criteriaList(List.of(IoTJobAbortCriteriaProperty.builder()
     * .action("action")
     * .failureType("failureType")
     * .minNumberOfExecutedThings(123)
     * .thresholdPercentage(123)
     * .build()))
     * .build())
     * .jobExecutionsRolloutConfig(IoTJobExecutionsRolloutConfigProperty.builder()
     * .exponentialRate(IoTJobExponentialRolloutRateProperty.builder()
     * .baseRatePerMinute(123)
     * .incrementFactor(123)
     * .rateIncreaseCriteria(rateIncreaseCriteria)
     * .build())
     * .maximumPerMinute(123)
     * .build())
     * .timeoutConfig(IoTJobTimeoutConfigProperty.builder()
     * .inProgressTimeoutInMinutes(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentiotjobconfiguration.html)
     */
    public inline fun cfnDeploymentDeploymentIoTJobConfigurationProperty(
        block: CfnDeploymentDeploymentIoTJobConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeployment.DeploymentIoTJobConfigurationProperty {
        val builder = CfnDeploymentDeploymentIoTJobConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about policies that define how a deployment updates components and
     * handles failure.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * DeploymentPoliciesProperty deploymentPoliciesProperty = DeploymentPoliciesProperty.builder()
     * .componentUpdatePolicy(DeploymentComponentUpdatePolicyProperty.builder()
     * .action("action")
     * .timeoutInSeconds(123)
     * .build())
     * .configurationValidationPolicy(DeploymentConfigurationValidationPolicyProperty.builder()
     * .timeoutInSeconds(123)
     * .build())
     * .failureHandlingPolicy("failureHandlingPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentpolicies.html)
     */
    public inline fun cfnDeploymentDeploymentPoliciesProperty(
        block: CfnDeploymentDeploymentPoliciesPropertyDsl.() -> Unit = {}
    ): CfnDeployment.DeploymentPoliciesProperty {
        val builder = CfnDeploymentDeploymentPoliciesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains a list of criteria that define when and how to cancel a configuration deployment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * IoTJobAbortConfigProperty ioTJobAbortConfigProperty = IoTJobAbortConfigProperty.builder()
     * .criteriaList(List.of(IoTJobAbortCriteriaProperty.builder()
     * .action("action")
     * .failureType("failureType")
     * .minNumberOfExecutedThings(123)
     * .thresholdPercentage(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortconfig.html)
     */
    public inline fun cfnDeploymentIoTJobAbortConfigProperty(
        block: CfnDeploymentIoTJobAbortConfigPropertyDsl.() -> Unit = {}
    ): CfnDeployment.IoTJobAbortConfigProperty {
        val builder = CfnDeploymentIoTJobAbortConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains criteria that define when and how to cancel a job.
     *
     * The deployment stops if the following conditions are true:
     * * The number of things that receive the deployment exceeds the `minNumberOfExecutedThings` .
     * * The percentage of failures with type `failureType` exceeds the `thresholdPercentage` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * IoTJobAbortCriteriaProperty ioTJobAbortCriteriaProperty = IoTJobAbortCriteriaProperty.builder()
     * .action("action")
     * .failureType("failureType")
     * .minNumberOfExecutedThings(123)
     * .thresholdPercentage(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortcriteria.html)
     */
    public inline fun cfnDeploymentIoTJobAbortCriteriaProperty(
        block: CfnDeploymentIoTJobAbortCriteriaPropertyDsl.() -> Unit = {}
    ): CfnDeployment.IoTJobAbortCriteriaProperty {
        val builder = CfnDeploymentIoTJobAbortCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about the rollout configuration for a job.
     *
     * This configuration defines the rate at which the job deploys a configuration to a fleet of
     * target devices.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * Object rateIncreaseCriteria;
     * IoTJobExecutionsRolloutConfigProperty ioTJobExecutionsRolloutConfigProperty =
     * IoTJobExecutionsRolloutConfigProperty.builder()
     * .exponentialRate(IoTJobExponentialRolloutRateProperty.builder()
     * .baseRatePerMinute(123)
     * .incrementFactor(123)
     * .rateIncreaseCriteria(rateIncreaseCriteria)
     * .build())
     * .maximumPerMinute(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobexecutionsrolloutconfig.html)
     */
    public inline fun cfnDeploymentIoTJobExecutionsRolloutConfigProperty(
        block: CfnDeploymentIoTJobExecutionsRolloutConfigPropertyDsl.() -> Unit = {}
    ): CfnDeployment.IoTJobExecutionsRolloutConfigProperty {
        val builder = CfnDeploymentIoTJobExecutionsRolloutConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about an exponential rollout rate for a configuration deployment job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * Object rateIncreaseCriteria;
     * IoTJobExponentialRolloutRateProperty ioTJobExponentialRolloutRateProperty =
     * IoTJobExponentialRolloutRateProperty.builder()
     * .baseRatePerMinute(123)
     * .incrementFactor(123)
     * .rateIncreaseCriteria(rateIncreaseCriteria)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobexponentialrolloutrate.html)
     */
    public inline fun cfnDeploymentIoTJobExponentialRolloutRateProperty(
        block: CfnDeploymentIoTJobExponentialRolloutRatePropertyDsl.() -> Unit = {}
    ): CfnDeployment.IoTJobExponentialRolloutRateProperty {
        val builder = CfnDeploymentIoTJobExponentialRolloutRatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about the timeout configuration for a job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * IoTJobTimeoutConfigProperty ioTJobTimeoutConfigProperty = IoTJobTimeoutConfigProperty.builder()
     * .inProgressTimeoutInMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobtimeoutconfig.html)
     */
    public inline fun cfnDeploymentIoTJobTimeoutConfigProperty(
        block: CfnDeploymentIoTJobTimeoutConfigPropertyDsl.() -> Unit = {}
    ): CfnDeployment.IoTJobTimeoutConfigProperty {
        val builder = CfnDeploymentIoTJobTimeoutConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDeployment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * Object rateIncreaseCriteria;
     * CfnDeploymentProps cfnDeploymentProps = CfnDeploymentProps.builder()
     * .targetArn("targetArn")
     * // the properties below are optional
     * .components(Map.of(
     * "componentsKey", ComponentDeploymentSpecificationProperty.builder()
     * .componentVersion("componentVersion")
     * .configurationUpdate(ComponentConfigurationUpdateProperty.builder()
     * .merge("merge")
     * .reset(List.of("reset"))
     * .build())
     * .runWith(ComponentRunWithProperty.builder()
     * .posixUser("posixUser")
     * .systemResourceLimits(SystemResourceLimitsProperty.builder()
     * .cpus(123)
     * .memory(123)
     * .build())
     * .windowsUser("windowsUser")
     * .build())
     * .build()))
     * .deploymentName("deploymentName")
     * .deploymentPolicies(DeploymentPoliciesProperty.builder()
     * .componentUpdatePolicy(DeploymentComponentUpdatePolicyProperty.builder()
     * .action("action")
     * .timeoutInSeconds(123)
     * .build())
     * .configurationValidationPolicy(DeploymentConfigurationValidationPolicyProperty.builder()
     * .timeoutInSeconds(123)
     * .build())
     * .failureHandlingPolicy("failureHandlingPolicy")
     * .build())
     * .iotJobConfiguration(DeploymentIoTJobConfigurationProperty.builder()
     * .abortConfig(IoTJobAbortConfigProperty.builder()
     * .criteriaList(List.of(IoTJobAbortCriteriaProperty.builder()
     * .action("action")
     * .failureType("failureType")
     * .minNumberOfExecutedThings(123)
     * .thresholdPercentage(123)
     * .build()))
     * .build())
     * .jobExecutionsRolloutConfig(IoTJobExecutionsRolloutConfigProperty.builder()
     * .exponentialRate(IoTJobExponentialRolloutRateProperty.builder()
     * .baseRatePerMinute(123)
     * .incrementFactor(123)
     * .rateIncreaseCriteria(rateIncreaseCriteria)
     * .build())
     * .maximumPerMinute(123)
     * .build())
     * .timeoutConfig(IoTJobTimeoutConfigProperty.builder()
     * .inProgressTimeoutInMinutes(123)
     * .build())
     * .build())
     * .parentTargetArn("parentTargetArn")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html)
     */
    public inline fun cfnDeploymentProps(
        block: CfnDeploymentPropsDsl.() -> Unit = {}
    ): CfnDeploymentProps {
        val builder = CfnDeploymentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about system resource limits that the software applies to a component's
     * processes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrassv2.*;
     * SystemResourceLimitsProperty systemResourceLimitsProperty =
     * SystemResourceLimitsProperty.builder()
     * .cpus(123)
     * .memory(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-systemresourcelimits.html)
     */
    public inline fun cfnDeploymentSystemResourceLimitsProperty(
        block: CfnDeploymentSystemResourceLimitsPropertyDsl.() -> Unit = {}
    ): CfnDeployment.SystemResourceLimitsProperty {
        val builder = CfnDeploymentSystemResourceLimitsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
