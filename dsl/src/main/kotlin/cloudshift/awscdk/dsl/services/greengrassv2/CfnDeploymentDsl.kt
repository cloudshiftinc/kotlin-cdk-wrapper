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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment
import software.constructs.Construct

/**
 * Creates a continuous deployment for a target, which is a AWS IoT Greengrass core device or group
 * of core devices.
 *
 * When you add a new core device to a group of core devices that has a deployment, AWS IoT
 * Greengrass deploys that group's deployment to the new device.
 *
 * You can define one deployment for each target. When you create a new deployment for a target that
 * has an existing deployment, you replace the previous deployment. AWS IoT Greengrass applies the
 * new deployment to the target devices.
 *
 * You can only add, update, or delete up to 10 deployments at a time to a single target.
 *
 * Every deployment has a revision number that indicates how many deployment revisions you define
 * for a target. Use this operation to create a new revision of an existing deployment. This
 * operation returns the revision number of the new deployment when you create it.
 *
 * For more information, see the
 * [Create deployments](https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html)
 * in the *AWS IoT Greengrass V2 Developer Guide* .
 *
 * Deployment resources are deleted when you delete stacks. To keep the deployments in a stack, you
 * must specify `"DeletionPolicy": "Retain"` on each deployment resource in the stack template that
 * you want to keep. For more information, see
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
@CdkDslMarker
public class CfnDeploymentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDeployment.Builder = CfnDeployment.Builder.create(scope, id)

    /**
     * The components to deploy.
     *
     * This is a dictionary, where each key is the name of a component, and each key's value is the
     * version and configuration to deploy for that component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-components)
     *
     * @param components The components to deploy.
     */
    public fun components(components: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(components)
        cdkBuilder.components(builder.map)
    }

    /**
     * The components to deploy.
     *
     * This is a dictionary, where each key is the name of a component, and each key's value is the
     * version and configuration to deploy for that component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-components)
     *
     * @param components The components to deploy.
     */
    public fun components(components: Map<String, Any>) {
        cdkBuilder.components(components)
    }

    /**
     * The components to deploy.
     *
     * This is a dictionary, where each key is the name of a component, and each key's value is the
     * version and configuration to deploy for that component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-components)
     *
     * @param components The components to deploy.
     */
    public fun components(components: IResolvable) {
        cdkBuilder.components(components)
    }

    /**
     * The name of the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-deploymentname)
     *
     * @param deploymentName The name of the deployment.
     */
    public fun deploymentName(deploymentName: String) {
        cdkBuilder.deploymentName(deploymentName)
    }

    /**
     * The deployment policies for the deployment.
     *
     * These policies define how the deployment updates components and handles failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-deploymentpolicies)
     *
     * @param deploymentPolicies The deployment policies for the deployment.
     */
    public fun deploymentPolicies(deploymentPolicies: IResolvable) {
        cdkBuilder.deploymentPolicies(deploymentPolicies)
    }

    /**
     * The deployment policies for the deployment.
     *
     * These policies define how the deployment updates components and handles failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-deploymentpolicies)
     *
     * @param deploymentPolicies The deployment policies for the deployment.
     */
    public fun deploymentPolicies(deploymentPolicies: CfnDeployment.DeploymentPoliciesProperty) {
        cdkBuilder.deploymentPolicies(deploymentPolicies)
    }

    /**
     * The job configuration for the deployment configuration.
     *
     * The job configuration specifies the rollout, timeout, and stop configurations for the
     * deployment configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-iotjobconfiguration)
     *
     * @param iotJobConfiguration The job configuration for the deployment configuration.
     */
    public fun iotJobConfiguration(iotJobConfiguration: IResolvable) {
        cdkBuilder.iotJobConfiguration(iotJobConfiguration)
    }

    /**
     * The job configuration for the deployment configuration.
     *
     * The job configuration specifies the rollout, timeout, and stop configurations for the
     * deployment configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-iotjobconfiguration)
     *
     * @param iotJobConfiguration The job configuration for the deployment configuration.
     */
    public fun iotJobConfiguration(
        iotJobConfiguration: CfnDeployment.DeploymentIoTJobConfigurationProperty
    ) {
        cdkBuilder.iotJobConfiguration(iotJobConfiguration)
    }

    /**
     * The parent deployment's
     * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) for a
     * subdeployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-parenttargetarn)
     *
     * @param parentTargetArn The parent deployment's
     *   [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) for a
     *   subdeployment.
     */
    public fun parentTargetArn(parentTargetArn: String) {
        cdkBuilder.parentTargetArn(parentTargetArn)
    }

    /**
     * Application-specific metadata to attach to the deployment.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-tags)
     *
     * @param tags Application-specific metadata to attach to the deployment.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * The ARN of the target AWS IoT thing or thing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-targetarn)
     *
     * @param targetArn The ARN of the target AWS IoT thing or thing group.
     */
    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CfnDeployment = cdkBuilder.build()
}
