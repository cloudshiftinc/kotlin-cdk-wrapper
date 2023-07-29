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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnCapabilities
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.ArtifactPath
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps
import software.amazon.awscdk.services.iam.IRole

/**
 * Properties for the CloudFormationCreateReplaceChangeSetAction.
 *
 * Example:
 * ```
 * // Source stage: read from repository
 * Repository repo = Repository.Builder.create(stack, "TemplateRepo")
 * .repositoryName("template-repo")
 * .build();
 * Artifact sourceOutput = new Artifact("SourceArtifact");
 * CodeCommitSourceAction source = CodeCommitSourceAction.Builder.create()
 * .actionName("Source")
 * .repository(repo)
 * .output(sourceOutput)
 * .trigger(CodeCommitTrigger.POLL)
 * .build();
 * Map&lt;String, Object&gt; sourceStage = Map.of(
 * "stageName", "Source",
 * "actions", List.of(source));
 * // Deployment stage: create and deploy changeset with manual approval
 * String stackName = "OurStack";
 * String changeSetName = "StagedChangeSet";
 * Map&lt;String, Object&gt; prodStage = Map.of(
 * "stageName", "Deploy",
 * "actions", List.of(
 * CloudFormationCreateReplaceChangeSetAction.Builder.create()
 * .actionName("PrepareChanges")
 * .stackName(stackName)
 * .changeSetName(changeSetName)
 * .adminPermissions(true)
 * .templatePath(sourceOutput.atPath("template.yaml"))
 * .runOrder(1)
 * .build(),
 * ManualApprovalAction.Builder.create()
 * .actionName("ApproveChanges")
 * .runOrder(2)
 * .build(),
 * CloudFormationExecuteChangeSetAction.Builder.create()
 * .actionName("ExecuteChanges")
 * .stackName(stackName)
 * .changeSetName(changeSetName)
 * .runOrder(3)
 * .build()));
 * Pipeline.Builder.create(stack, "Pipeline")
 * .stages(List.of(sourceStage, prodStage))
 * .build();
 * ```
 */
@CdkDslMarker
public class CloudFormationCreateReplaceChangeSetActionPropsDsl {
    private val cdkBuilder: CloudFormationCreateReplaceChangeSetActionProps.Builder =
        CloudFormationCreateReplaceChangeSetActionProps.builder()

    private val _cfnCapabilities: MutableList<CfnCapabilities> = mutableListOf()

    private val _extraInputs: MutableList<Artifact> = mutableListOf()

    /**
     * @param account The AWS account this Action is supposed to operate in. **Note**: if you
     *   specify the `role` property, this is ignored - the action will operate in the same region
     *   the passed role does.
     */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /**
     * @param actionName The physical, human-readable name of the Action. Note that Action names
     *   must be unique within a single Stage.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * @param adminPermissions Whether to grant full permissions to CloudFormation while deploying
     *   this template. Setting this to `true` affects the defaults for `role` and `capabilities`,
     *   if you don't specify any alternatives.
     *
     * The default role that will be created for you will have full (i.e., `*`) permissions on all
     * resources, and the deployment will have named IAM capabilities (i.e., able to create all IAM
     * resources).
     *
     * This is a shorthand that you can use if you fully trust the templates that are deployed in
     * this pipeline. If you want more fine-grained permissions, use `addToRolePolicy` and
     * `capabilities` to control what the CloudFormation deployment is allowed to do.
     */
    public fun adminPermissions(adminPermissions: Boolean) {
        cdkBuilder.adminPermissions(adminPermissions)
    }

    /**
     * @param cfnCapabilities Acknowledge certain changes made as part of deployment. For stacks
     *   that contain certain resources, explicit acknowledgement is required that AWS
     *   CloudFormation might create or update those resources. For example, you must specify
     *   `ANONYMOUS_IAM` or `NAMED_IAM` if your stack template contains AWS Identity and Access
     *   Management (IAM) resources. For more information, see the link below.
     */
    public fun cfnCapabilities(vararg cfnCapabilities: CfnCapabilities) {
        _cfnCapabilities.addAll(listOf(*cfnCapabilities))
    }

    /**
     * @param cfnCapabilities Acknowledge certain changes made as part of deployment. For stacks
     *   that contain certain resources, explicit acknowledgement is required that AWS
     *   CloudFormation might create or update those resources. For example, you must specify
     *   `ANONYMOUS_IAM` or `NAMED_IAM` if your stack template contains AWS Identity and Access
     *   Management (IAM) resources. For more information, see the link below.
     */
    public fun cfnCapabilities(cfnCapabilities: Collection<CfnCapabilities>) {
        _cfnCapabilities.addAll(cfnCapabilities)
    }

    /** @param changeSetName Name of the change set to create or update. */
    public fun changeSetName(changeSetName: String) {
        cdkBuilder.changeSetName(changeSetName)
    }

    /**
     * @param deploymentRole IAM role to assume when deploying changes. If not specified, a fresh
     *   role is created. The role is created with zero permissions unless `adminPermissions` is
     *   true, in which case the role will have full permissions.
     */
    public fun deploymentRole(deploymentRole: IRole) {
        cdkBuilder.deploymentRole(deploymentRole)
    }

    /**
     * @param extraInputs The list of additional input Artifacts for this Action. This is especially
     *   useful when used in conjunction with the `parameterOverrides` property. For example, if you
     *   have:
     *
     * parameterOverrides: { 'Param1': action1.outputArtifact.bucketName, 'Param2':
     * action2.outputArtifact.objectKey, }
     *
     * , if the output Artifacts of `action1` and `action2` were not used to set either the
     * `templateConfiguration` or the `templatePath` properties, you need to make sure to include
     * them in the `extraInputs` - otherwise, you'll get an "unrecognized Artifact" error during
     * your Pipeline's execution.
     */
    public fun extraInputs(vararg extraInputs: Artifact) {
        _extraInputs.addAll(listOf(*extraInputs))
    }

    /**
     * @param extraInputs The list of additional input Artifacts for this Action. This is especially
     *   useful when used in conjunction with the `parameterOverrides` property. For example, if you
     *   have:
     *
     * parameterOverrides: { 'Param1': action1.outputArtifact.bucketName, 'Param2':
     * action2.outputArtifact.objectKey, }
     *
     * , if the output Artifacts of `action1` and `action2` were not used to set either the
     * `templateConfiguration` or the `templatePath` properties, you need to make sure to include
     * them in the `extraInputs` - otherwise, you'll get an "unrecognized Artifact" error during
     * your Pipeline's execution.
     */
    public fun extraInputs(extraInputs: Collection<Artifact>) {
        _extraInputs.addAll(extraInputs)
    }

    /**
     * @param output The name of the output artifact to generate. Only applied if `outputFileName`
     *   is set as well.
     */
    public fun output(output: Artifact) {
        cdkBuilder.output(output)
    }

    /**
     * @param outputFileName A name for the filename in the output artifact to store the AWS
     *   CloudFormation call's result. The file will contain the result of the call to AWS
     *   CloudFormation (for example the call to UpdateStack or CreateChangeSet).
     *
     * AWS CodePipeline adds the file to the output artifact after performing the specified action.
     */
    public fun outputFileName(outputFileName: String) {
        cdkBuilder.outputFileName(outputFileName)
    }

    /**
     * @param parameterOverrides Additional template parameters. Template parameters specified here
     *   take precedence over template parameters found in the artifact specified by the
     *   `templateConfiguration` property.
     *
     * We recommend that you use the template configuration file to specify most of your parameter
     * values. Use parameter overrides to specify only dynamic parameter values (values that are
     * unknown until you run the pipeline).
     *
     * All parameter names must be present in the stack template.
     *
     * Note: the entire object cannot be more than 1kB.
     */
    public fun parameterOverrides(parameterOverrides: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameterOverrides)
        cdkBuilder.parameterOverrides(builder.map)
    }

    /**
     * @param parameterOverrides Additional template parameters. Template parameters specified here
     *   take precedence over template parameters found in the artifact specified by the
     *   `templateConfiguration` property.
     *
     * We recommend that you use the template configuration file to specify most of your parameter
     * values. Use parameter overrides to specify only dynamic parameter values (values that are
     * unknown until you run the pipeline).
     *
     * All parameter names must be present in the stack template.
     *
     * Note: the entire object cannot be more than 1kB.
     */
    public fun parameterOverrides(parameterOverrides: Map<String, Any>) {
        cdkBuilder.parameterOverrides(parameterOverrides)
    }

    /**
     * @param region The AWS region the given Action resides in. Note that a cross-region Pipeline
     *   requires replication buckets to function correctly. You can provide their names with the
     *   `PipelineProps#crossRegionReplicationBuckets` property. If you don't, the CodePipeline
     *   Construct will create new Stacks in your CDK app containing those buckets, that you will
     *   need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
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

    /** @param stackName The name of the stack to apply this action to. */
    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    /**
     * @param templateConfiguration Input artifact to use for template parameters values and stack
     *   policy. The template configuration file should contain a JSON object that should look like
     *   this: `{ "Parameters": {...}, "Tags": {...}, "StackPolicy": {... }}`. For more information,
     *   see
     *   [AWS CloudFormation Artifacts](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-cfn-artifacts.html).
     *
     * Note that if you include sensitive information, such as passwords, restrict access to this
     * file.
     */
    public fun templateConfiguration(templateConfiguration: ArtifactPath) {
        cdkBuilder.templateConfiguration(templateConfiguration)
    }

    /** @param templatePath Input artifact with the ChangeSet's CloudFormation template. */
    public fun templatePath(templatePath: ArtifactPath) {
        cdkBuilder.templatePath(templatePath)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     *   action.
     */
    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): CloudFormationCreateReplaceChangeSetActionProps {
        if (_cfnCapabilities.isNotEmpty()) cdkBuilder.cfnCapabilities(_cfnCapabilities)
        if (_extraInputs.isNotEmpty()) cdkBuilder.extraInputs(_extraInputs)
        return cdkBuilder.build()
    }
}
