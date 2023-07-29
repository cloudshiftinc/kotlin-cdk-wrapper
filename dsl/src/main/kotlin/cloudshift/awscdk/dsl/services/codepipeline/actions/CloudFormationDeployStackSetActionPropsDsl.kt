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

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnCapabilities
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetActionProps
import software.amazon.awscdk.services.codepipeline.actions.StackInstances
import software.amazon.awscdk.services.codepipeline.actions.StackSetDeploymentModel
import software.amazon.awscdk.services.codepipeline.actions.StackSetParameters
import software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate
import software.amazon.awscdk.services.iam.IRole

/**
 * Properties for the CloudFormationDeployStackSetAction.
 *
 * Example:
 * ```
 * Pipeline pipeline;
 * Artifact sourceOutput;
 * pipeline.addStage(StageOptions.builder()
 * .stageName("DeployStackSets")
 * .actions(List.of(
 * // First, update the StackSet itself with the newest template
 * CloudFormationDeployStackSetAction.Builder.create()
 * .actionName("UpdateStackSet")
 * .runOrder(1)
 * .stackSetName("MyStackSet")
 * .template(StackSetTemplate.fromArtifactPath(sourceOutput.atPath("template.yaml")))
 * // Change this to 'StackSetDeploymentModel.organizations()' if you want to deploy to OUs
 * .deploymentModel(StackSetDeploymentModel.selfManaged())
 * // This deploys to a set of accounts
 * .stackInstances(StackInstances.inAccounts(List.of("111111111111"), List.of("us-east-1",
 * "eu-west-1")))
 * .build(),
 * // Afterwards, update/create additional instances in other accounts
 * CloudFormationDeployStackInstancesAction.Builder.create()
 * .actionName("AddMoreInstances")
 * .runOrder(2)
 * .stackSetName("MyStackSet")
 * .stackInstances(StackInstances.inAccounts(List.of("222222222222", "333333333333"),
 * List.of("us-east-1", "eu-west-1")))
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class CloudFormationDeployStackSetActionPropsDsl {
    private val cdkBuilder: CloudFormationDeployStackSetActionProps.Builder =
        CloudFormationDeployStackSetActionProps.builder()

    private val _cfnCapabilities: MutableList<CfnCapabilities> = mutableListOf()

    /**
     * @param actionName The physical, human-readable name of the Action. Note that Action names
     *   must be unique within a single Stage.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * @param cfnCapabilities Indicates that the template can create and update resources, depending
     *   on the types of resources in the template. You must use this property if you have IAM
     *   resources in your stack template or you create a stack directly from a template containing
     *   macros.
     */
    public fun cfnCapabilities(vararg cfnCapabilities: CfnCapabilities) {
        _cfnCapabilities.addAll(listOf(*cfnCapabilities))
    }

    /**
     * @param cfnCapabilities Indicates that the template can create and update resources, depending
     *   on the types of resources in the template. You must use this property if you have IAM
     *   resources in your stack template or you create a stack directly from a template containing
     *   macros.
     */
    public fun cfnCapabilities(cfnCapabilities: Collection<CfnCapabilities>) {
        _cfnCapabilities.addAll(cfnCapabilities)
    }

    /**
     * @param deploymentModel Determines how IAM roles are created and managed. The choices are:
     * * Self Managed: you create IAM roles with the required permissions in the administration
     *   account and all target accounts.
     * * Service Managed: only available if the account and target accounts are part of an AWS
     *   Organization. The necessary roles will be created for you.
     *
     * If you want to deploy to all accounts that are a member of AWS Organizations Organizational
     * Units (OUs), you must select Service Managed permissions.
     *
     * Note: This parameter can only be changed when no stack instances exist in the stack set.
     */
    public fun deploymentModel(deploymentModel: StackSetDeploymentModel) {
        cdkBuilder.deploymentModel(deploymentModel)
    }

    /**
     * @param description A description of the stack set. You can use this to describe the stack
     *   set’s purpose or other relevant information.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param failureTolerancePercentage The percentage of accounts per Region for which this stack
     *   operation can fail before AWS CloudFormation stops the operation in that Region. If the
     *   operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in
     *   subsequent Regions. When calculating the number of accounts based on the specified
     *   percentage, AWS CloudFormation rounds down to the next whole number.
     */
    public fun failureTolerancePercentage(failureTolerancePercentage: Number) {
        cdkBuilder.failureTolerancePercentage(failureTolerancePercentage)
    }

    /**
     * @param maxAccountConcurrencyPercentage The maximum percentage of accounts in which to perform
     *   this operation at one time. When calculating the number of accounts based on the specified
     *   percentage, AWS CloudFormation rounds down to the next whole number. If rounding down would
     *   result in zero, AWS CloudFormation sets the number as one instead. Although you use this
     *   setting to specify the maximum, for large deployments the actual number of accounts acted
     *   upon concurrently may be lower due to service throttling.
     */
    public fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number) {
        cdkBuilder.maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage)
    }

    /**
     * @param parameters The template parameters for your stack set. These parameters are shared
     *   between all instances of the stack set.
     */
    public fun parameters(parameters: StackSetParameters) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param role The Role in which context's this Action will be executing in. The Pipeline's Role
     *   will assume this Role (the required permissions for that will be granted automatically)
     *   right before executing this Action. This Action will be passed into your `IAction.bind`
     *   method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param runOrder The runOrder property for this Action. RunOrder determines the relative order
     *   in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param stackInstances Specify where to create or update Stack Instances. You can specify
     *   either AWS Accounts Ids or AWS Organizations Organizational Units.
     */
    public fun stackInstances(stackInstances: StackInstances) {
        cdkBuilder.stackInstances(stackInstances)
    }

    /**
     * @param stackSetName The name to associate with the stack set. This name must be unique in the
     *   Region where it is created.
     *
     * The name may only contain alphanumeric and hyphen characters. It must begin with an
     * alphabetic character and be 128 characters or fewer.
     */
    public fun stackSetName(stackSetName: String) {
        cdkBuilder.stackSetName(stackSetName)
    }

    /**
     * @param stackSetRegion The AWS Region the StackSet is in. Note that a cross-region Pipeline
     *   requires replication buckets to function correctly. You can provide their names with the
     *   `PipelineProps.crossRegionReplicationBuckets` property. If you don't, the CodePipeline
     *   Construct will create new Stacks in your CDK app containing those buckets, that you will
     *   need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
     */
    public fun stackSetRegion(stackSetRegion: String) {
        cdkBuilder.stackSetRegion(stackSetRegion)
    }

    /**
     * @param template The location of the template that defines the resources in the stack set.
     *   This must point to a template with a maximum size of 460,800 bytes.
     *
     * Enter the path to the source artifact name and template file.
     */
    public fun template(template: StackSetTemplate) {
        cdkBuilder.template(template)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     *   action.
     */
    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): CloudFormationDeployStackSetActionProps {
        if (_cfnCapabilities.isNotEmpty()) cdkBuilder.cfnCapabilities(_cfnCapabilities)
        return cdkBuilder.build()
    }
}
