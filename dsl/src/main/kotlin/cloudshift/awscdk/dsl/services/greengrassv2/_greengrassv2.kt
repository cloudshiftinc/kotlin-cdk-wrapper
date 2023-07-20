@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.greengrassv2

import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps
import software.amazon.awscdk.services.greengrassv2.CfnDeployment
import software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object greengrassv2 {
    public inline fun cfnComponentVersion(
        scope: Construct,
        id: String,
        block: CfnComponentVersionDsl.() -> Unit = {},
    ): CfnComponentVersion {
        val builder = CfnComponentVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnComponentVersionComponentDependencyRequirementProperty(
        block: CfnComponentVersionComponentDependencyRequirementPropertyDsl.() -> Unit =
            {},
    ): CfnComponentVersion.ComponentDependencyRequirementProperty {
        val builder = CfnComponentVersionComponentDependencyRequirementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnComponentVersionComponentPlatformProperty(
        block: CfnComponentVersionComponentPlatformPropertyDsl.() -> Unit =
            {},
    ): CfnComponentVersion.ComponentPlatformProperty {
        val builder = CfnComponentVersionComponentPlatformPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnComponentVersionLambdaContainerParamsProperty(
        block: CfnComponentVersionLambdaContainerParamsPropertyDsl.() -> Unit =
            {},
    ): CfnComponentVersion.LambdaContainerParamsProperty {
        val builder = CfnComponentVersionLambdaContainerParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnComponentVersionLambdaDeviceMountProperty(
        block: CfnComponentVersionLambdaDeviceMountPropertyDsl.() -> Unit =
            {},
    ): CfnComponentVersion.LambdaDeviceMountProperty {
        val builder = CfnComponentVersionLambdaDeviceMountPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnComponentVersionLambdaEventSourceProperty(
        block: CfnComponentVersionLambdaEventSourcePropertyDsl.() -> Unit =
            {},
    ): CfnComponentVersion.LambdaEventSourceProperty {
        val builder = CfnComponentVersionLambdaEventSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnComponentVersionLambdaExecutionParametersProperty(
        block: CfnComponentVersionLambdaExecutionParametersPropertyDsl.() -> Unit =
            {},
    ): CfnComponentVersion.LambdaExecutionParametersProperty {
        val builder = CfnComponentVersionLambdaExecutionParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnComponentVersionLambdaFunctionRecipeSourceProperty(
        block: CfnComponentVersionLambdaFunctionRecipeSourcePropertyDsl.() -> Unit =
            {},
    ): CfnComponentVersion.LambdaFunctionRecipeSourceProperty {
        val builder = CfnComponentVersionLambdaFunctionRecipeSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnComponentVersionLambdaLinuxProcessParamsProperty(
        block: CfnComponentVersionLambdaLinuxProcessParamsPropertyDsl.() -> Unit =
            {},
    ): CfnComponentVersion.LambdaLinuxProcessParamsProperty {
        val builder = CfnComponentVersionLambdaLinuxProcessParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnComponentVersionLambdaVolumeMountProperty(
        block: CfnComponentVersionLambdaVolumeMountPropertyDsl.() -> Unit =
            {},
    ): CfnComponentVersion.LambdaVolumeMountProperty {
        val builder = CfnComponentVersionLambdaVolumeMountPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnComponentVersionProps(block: CfnComponentVersionPropsDsl.() -> Unit = {}): CfnComponentVersionProps {
        val builder = CfnComponentVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeployment(
        scope: Construct,
        id: String,
        block: CfnDeploymentDsl.() -> Unit = {},
    ): CfnDeployment {
        val builder = CfnDeploymentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentComponentConfigurationUpdateProperty(
        block: CfnDeploymentComponentConfigurationUpdatePropertyDsl.() -> Unit =
            {},
    ): CfnDeployment.ComponentConfigurationUpdateProperty {
        val builder = CfnDeploymentComponentConfigurationUpdatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentComponentDeploymentSpecificationProperty(
        block: CfnDeploymentComponentDeploymentSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnDeployment.ComponentDeploymentSpecificationProperty {
        val builder = CfnDeploymentComponentDeploymentSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentComponentRunWithProperty(
        block: CfnDeploymentComponentRunWithPropertyDsl.() -> Unit =
            {},
    ): CfnDeployment.ComponentRunWithProperty {
        val builder = CfnDeploymentComponentRunWithPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentDeploymentComponentUpdatePolicyProperty(
        block: CfnDeploymentDeploymentComponentUpdatePolicyPropertyDsl.() -> Unit =
            {},
    ): CfnDeployment.DeploymentComponentUpdatePolicyProperty {
        val builder = CfnDeploymentDeploymentComponentUpdatePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentDeploymentConfigurationValidationPolicyProperty(
        block: CfnDeploymentDeploymentConfigurationValidationPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnDeployment.DeploymentConfigurationValidationPolicyProperty {
        val builder = CfnDeploymentDeploymentConfigurationValidationPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentDeploymentIoTJobConfigurationProperty(
        block: CfnDeploymentDeploymentIoTJobConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDeployment.DeploymentIoTJobConfigurationProperty {
        val builder = CfnDeploymentDeploymentIoTJobConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentDeploymentPoliciesProperty(
        block: CfnDeploymentDeploymentPoliciesPropertyDsl.() -> Unit =
            {},
    ): CfnDeployment.DeploymentPoliciesProperty {
        val builder = CfnDeploymentDeploymentPoliciesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentIoTJobAbortConfigProperty(
        block: CfnDeploymentIoTJobAbortConfigPropertyDsl.() -> Unit =
            {},
    ): CfnDeployment.IoTJobAbortConfigProperty {
        val builder = CfnDeploymentIoTJobAbortConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentIoTJobAbortCriteriaProperty(
        block: CfnDeploymentIoTJobAbortCriteriaPropertyDsl.() -> Unit =
            {},
    ): CfnDeployment.IoTJobAbortCriteriaProperty {
        val builder = CfnDeploymentIoTJobAbortCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentIoTJobExecutionsRolloutConfigProperty(
        block: CfnDeploymentIoTJobExecutionsRolloutConfigPropertyDsl.() -> Unit =
            {},
    ): CfnDeployment.IoTJobExecutionsRolloutConfigProperty {
        val builder = CfnDeploymentIoTJobExecutionsRolloutConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentIoTJobExponentialRolloutRateProperty(
        block: CfnDeploymentIoTJobExponentialRolloutRatePropertyDsl.() -> Unit =
            {},
    ): CfnDeployment.IoTJobExponentialRolloutRateProperty {
        val builder = CfnDeploymentIoTJobExponentialRolloutRatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentIoTJobTimeoutConfigProperty(
        block: CfnDeploymentIoTJobTimeoutConfigPropertyDsl.() -> Unit =
            {},
    ): CfnDeployment.IoTJobTimeoutConfigProperty {
        val builder = CfnDeploymentIoTJobTimeoutConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentProps(block: CfnDeploymentPropsDsl.() -> Unit = {}): CfnDeploymentProps {
        val builder = CfnDeploymentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentSystemResourceLimitsProperty(
        block: CfnDeploymentSystemResourceLimitsPropertyDsl.() -> Unit =
            {},
    ): CfnDeployment.SystemResourceLimitsProperty {
        val builder = CfnDeploymentSystemResourceLimitsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
