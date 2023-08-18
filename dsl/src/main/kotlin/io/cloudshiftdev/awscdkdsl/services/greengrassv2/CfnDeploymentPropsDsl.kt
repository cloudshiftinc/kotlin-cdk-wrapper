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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment
import software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps

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
@CdkDslMarker
public class CfnDeploymentPropsDsl {
    private val cdkBuilder: CfnDeploymentProps.Builder = CfnDeploymentProps.builder()

    /**
     * @param components The components to deploy. This is a dictionary, where each key is the name
     *   of a component, and each key's value is the version and configuration to deploy for that
     *   component.
     */
    public fun components(components: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(components)
        cdkBuilder.components(builder.map)
    }

    /**
     * @param components The components to deploy. This is a dictionary, where each key is the name
     *   of a component, and each key's value is the version and configuration to deploy for that
     *   component.
     */
    public fun components(components: Map<String, Any>) {
        cdkBuilder.components(components)
    }

    /**
     * @param components The components to deploy. This is a dictionary, where each key is the name
     *   of a component, and each key's value is the version and configuration to deploy for that
     *   component.
     */
    public fun components(components: IResolvable) {
        cdkBuilder.components(components)
    }

    /** @param deploymentName The name of the deployment. */
    public fun deploymentName(deploymentName: String) {
        cdkBuilder.deploymentName(deploymentName)
    }

    /**
     * @param deploymentPolicies The deployment policies for the deployment. These policies define
     *   how the deployment updates components and handles failure.
     */
    public fun deploymentPolicies(deploymentPolicies: IResolvable) {
        cdkBuilder.deploymentPolicies(deploymentPolicies)
    }

    /**
     * @param deploymentPolicies The deployment policies for the deployment. These policies define
     *   how the deployment updates components and handles failure.
     */
    public fun deploymentPolicies(deploymentPolicies: CfnDeployment.DeploymentPoliciesProperty) {
        cdkBuilder.deploymentPolicies(deploymentPolicies)
    }

    /**
     * @param iotJobConfiguration The job configuration for the deployment configuration. The job
     *   configuration specifies the rollout, timeout, and stop configurations for the deployment
     *   configuration.
     */
    public fun iotJobConfiguration(iotJobConfiguration: IResolvable) {
        cdkBuilder.iotJobConfiguration(iotJobConfiguration)
    }

    /**
     * @param iotJobConfiguration The job configuration for the deployment configuration. The job
     *   configuration specifies the rollout, timeout, and stop configurations for the deployment
     *   configuration.
     */
    public fun iotJobConfiguration(
        iotJobConfiguration: CfnDeployment.DeploymentIoTJobConfigurationProperty
    ) {
        cdkBuilder.iotJobConfiguration(iotJobConfiguration)
    }

    /**
     * @param parentTargetArn The parent deployment's
     *   [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) for a
     *   subdeployment.
     */
    public fun parentTargetArn(parentTargetArn: String) {
        cdkBuilder.parentTargetArn(parentTargetArn)
    }

    /**
     * @param tags Application-specific metadata to attach to the deployment. You can use tags in
     *   IAM policies to control access to AWS IoT Greengrass resources. You can also use tags to
     *   categorize your resources. For more information, see
     *   [Tag your AWS IoT Greengrass Version 2 resources](https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html)
     *   in the *AWS IoT Greengrass V2 Developer Guide* .
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

    /** @param targetArn The ARN of the target AWS IoT thing or thing group. */
    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CfnDeploymentProps = cdkBuilder.build()
}
