@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.CfnCapabilities
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for the CloudFormationCreateReplaceChangeSetAction.
 *
 * Example:
 *
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
 * .crossAccountKeys(true)
 * .stages(List.of(sourceStage, prodStage))
 * .build();
 * ```
 */
public interface CloudFormationCreateReplaceChangeSetActionProps : CommonAwsActionProps {
  /**
   * The AWS account this Action is supposed to operate in.
   *
   * **Note**: if you specify the `role` property,
   * this is ignored - the action will operate in the same region the passed role does.
   *
   * Default: - action resides in the same account as the pipeline
   */
  public fun account(): String? = unwrap(this).getAccount()

  /**
   * Whether to grant full permissions to CloudFormation while deploying this template.
   *
   * Setting this to `true` affects the defaults for `role` and `capabilities`, if you
   * don't specify any alternatives.
   *
   * The default role that will be created for you will have full (i.e., `*`)
   * permissions on all resources, and the deployment will have named IAM
   * capabilities (i.e., able to create all IAM resources).
   *
   * This is a shorthand that you can use if you fully trust the templates that
   * are deployed in this pipeline. If you want more fine-grained permissions,
   * use `addToRolePolicy` and `capabilities` to control what the CloudFormation
   * deployment is allowed to do.
   */
  public fun adminPermissions(): Boolean

  /**
   * Acknowledge certain changes made as part of deployment.
   *
   * For stacks that contain certain resources,
   * explicit acknowledgement is required that AWS CloudFormation might create or update those
   * resources.
   * For example, you must specify `ANONYMOUS_IAM` or `NAMED_IAM` if your stack template contains
   * AWS
   * Identity and Access Management (IAM) resources.
   * For more information, see the link below.
   *
   * Default: None, unless `adminPermissions` is true
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
   */
  public fun cfnCapabilities(): List<CfnCapabilities> =
      unwrap(this).getCfnCapabilities()?.map(CfnCapabilities::wrap) ?: emptyList()

  /**
   * Name of the change set to create or update.
   */
  public fun changeSetName(): String

  /**
   * IAM role to assume when deploying changes.
   *
   * If not specified, a fresh role is created. The role is created with zero
   * permissions unless `adminPermissions` is true, in which case the role will have
   * full permissions.
   *
   * Default: A fresh role with full or no permissions (depending on the value of
   * `adminPermissions`).
   */
  public fun deploymentRole(): IRole? = unwrap(this).getDeploymentRole()?.let(IRole::wrap)

  /**
   * The list of additional input Artifacts for this Action.
   *
   * This is especially useful when used in conjunction with the `parameterOverrides` property.
   * For example, if you have:
   *
   * parameterOverrides: {
   * 'Param1': action1.outputArtifact.bucketName,
   * 'Param2': action2.outputArtifact.objectKey,
   * }
   *
   * , if the output Artifacts of `action1` and `action2` were not used to
   * set either the `templateConfiguration` or the `templatePath` properties,
   * you need to make sure to include them in the `extraInputs` -
   * otherwise, you'll get an "unrecognized Artifact" error during your Pipeline's execution.
   */
  public fun extraInputs(): List<Artifact> = unwrap(this).getExtraInputs()?.map(Artifact::wrap) ?:
      emptyList()

  /**
   * The name of the output artifact to generate.
   *
   * Only applied if `outputFileName` is set as well.
   *
   * Default: Automatically generated artifact name.
   */
  public fun output(): Artifact? = unwrap(this).getOutput()?.let(Artifact::wrap)

  /**
   * A name for the filename in the output artifact to store the AWS CloudFormation call's result.
   *
   * The file will contain the result of the call to AWS CloudFormation (for example
   * the call to UpdateStack or CreateChangeSet).
   *
   * AWS CodePipeline adds the file to the output artifact after performing
   * the specified action.
   *
   * Default: No output artifact generated
   */
  public fun outputFileName(): String? = unwrap(this).getOutputFileName()

  /**
   * Additional template parameters.
   *
   * Template parameters specified here take precedence over template parameters
   * found in the artifact specified by the `templateConfiguration` property.
   *
   * We recommend that you use the template configuration file to specify
   * most of your parameter values. Use parameter overrides to specify only
   * dynamic parameter values (values that are unknown until you run the
   * pipeline).
   *
   * All parameter names must be present in the stack template.
   *
   * Note: the entire object cannot be more than 1kB.
   *
   * Default: No overrides
   */
  public fun parameterOverrides(): Map<String, Any> = unwrap(this).getParameterOverrides() ?:
      emptyMap()

  /**
   * The AWS region the given Action resides in.
   *
   * Note that a cross-region Pipeline requires replication buckets to function correctly.
   * You can provide their names with the `PipelineProps#crossRegionReplicationBuckets` property.
   * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
   * those buckets,
   * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
   *
   * Default: the Action resides in the same region as the Pipeline
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * The name of the stack to apply this action to.
   */
  public fun stackName(): String

  /**
   * Input artifact to use for template parameters values and stack policy.
   *
   * The template configuration file should contain a JSON object that should look like this:
   * `{ "Parameters": {...}, "Tags": {...}, "StackPolicy": {... }}`. For more information,
   * see [AWS CloudFormation
   * Artifacts](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-cfn-artifacts.html).
   *
   * Note that if you include sensitive information, such as passwords, restrict access to this
   * file.
   *
   * Default: No template configuration based on input artifacts
   */
  public fun templateConfiguration(): ArtifactPath? =
      unwrap(this).getTemplateConfiguration()?.let(ArtifactPath::wrap)

  /**
   * Input artifact with the ChangeSet's CloudFormation template.
   */
  public fun templatePath(): ArtifactPath

  /**
   * A builder for [CloudFormationCreateReplaceChangeSetActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account The AWS account this Action is supposed to operate in.
     * **Note**: if you specify the `role` property,
     * this is ignored - the action will operate in the same region the passed role does.
     */
    public fun account(account: String)

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param adminPermissions Whether to grant full permissions to CloudFormation while deploying
     * this template. 
     * Setting this to `true` affects the defaults for `role` and `capabilities`, if you
     * don't specify any alternatives.
     *
     * The default role that will be created for you will have full (i.e., `*`)
     * permissions on all resources, and the deployment will have named IAM
     * capabilities (i.e., able to create all IAM resources).
     *
     * This is a shorthand that you can use if you fully trust the templates that
     * are deployed in this pipeline. If you want more fine-grained permissions,
     * use `addToRolePolicy` and `capabilities` to control what the CloudFormation
     * deployment is allowed to do.
     */
    public fun adminPermissions(adminPermissions: Boolean)

    /**
     * @param cfnCapabilities Acknowledge certain changes made as part of deployment.
     * For stacks that contain certain resources,
     * explicit acknowledgement is required that AWS CloudFormation might create or update those
     * resources.
     * For example, you must specify `ANONYMOUS_IAM` or `NAMED_IAM` if your stack template contains
     * AWS
     * Identity and Access Management (IAM) resources.
     * For more information, see the link below.
     */
    public fun cfnCapabilities(cfnCapabilities: List<CfnCapabilities>)

    /**
     * @param cfnCapabilities Acknowledge certain changes made as part of deployment.
     * For stacks that contain certain resources,
     * explicit acknowledgement is required that AWS CloudFormation might create or update those
     * resources.
     * For example, you must specify `ANONYMOUS_IAM` or `NAMED_IAM` if your stack template contains
     * AWS
     * Identity and Access Management (IAM) resources.
     * For more information, see the link below.
     */
    public fun cfnCapabilities(vararg cfnCapabilities: CfnCapabilities)

    /**
     * @param changeSetName Name of the change set to create or update. 
     */
    public fun changeSetName(changeSetName: String)

    /**
     * @param deploymentRole IAM role to assume when deploying changes.
     * If not specified, a fresh role is created. The role is created with zero
     * permissions unless `adminPermissions` is true, in which case the role will have
     * full permissions.
     */
    public fun deploymentRole(deploymentRole: IRole)

    /**
     * @param extraInputs The list of additional input Artifacts for this Action.
     * This is especially useful when used in conjunction with the `parameterOverrides` property.
     * For example, if you have:
     *
     * parameterOverrides: {
     * 'Param1': action1.outputArtifact.bucketName,
     * 'Param2': action2.outputArtifact.objectKey,
     * }
     *
     * , if the output Artifacts of `action1` and `action2` were not used to
     * set either the `templateConfiguration` or the `templatePath` properties,
     * you need to make sure to include them in the `extraInputs` -
     * otherwise, you'll get an "unrecognized Artifact" error during your Pipeline's execution.
     */
    public fun extraInputs(extraInputs: List<Artifact>)

    /**
     * @param extraInputs The list of additional input Artifacts for this Action.
     * This is especially useful when used in conjunction with the `parameterOverrides` property.
     * For example, if you have:
     *
     * parameterOverrides: {
     * 'Param1': action1.outputArtifact.bucketName,
     * 'Param2': action2.outputArtifact.objectKey,
     * }
     *
     * , if the output Artifacts of `action1` and `action2` were not used to
     * set either the `templateConfiguration` or the `templatePath` properties,
     * you need to make sure to include them in the `extraInputs` -
     * otherwise, you'll get an "unrecognized Artifact" error during your Pipeline's execution.
     */
    public fun extraInputs(vararg extraInputs: Artifact)

    /**
     * @param output The name of the output artifact to generate.
     * Only applied if `outputFileName` is set as well.
     */
    public fun output(output: Artifact)

    /**
     * @param outputFileName A name for the filename in the output artifact to store the AWS
     * CloudFormation call's result.
     * The file will contain the result of the call to AWS CloudFormation (for example
     * the call to UpdateStack or CreateChangeSet).
     *
     * AWS CodePipeline adds the file to the output artifact after performing
     * the specified action.
     */
    public fun outputFileName(outputFileName: String)

    /**
     * @param parameterOverrides Additional template parameters.
     * Template parameters specified here take precedence over template parameters
     * found in the artifact specified by the `templateConfiguration` property.
     *
     * We recommend that you use the template configuration file to specify
     * most of your parameter values. Use parameter overrides to specify only
     * dynamic parameter values (values that are unknown until you run the
     * pipeline).
     *
     * All parameter names must be present in the stack template.
     *
     * Note: the entire object cannot be more than 1kB.
     */
    public fun parameterOverrides(parameterOverrides: Map<String, Any>)

    /**
     * @param region The AWS region the given Action resides in.
     * Note that a cross-region Pipeline requires replication buckets to function correctly.
     * You can provide their names with the `PipelineProps#crossRegionReplicationBuckets` property.
     * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
     * those buckets,
     * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
     */
    public fun region(region: String)

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole)

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number)

    /**
     * @param stackName The name of the stack to apply this action to. 
     */
    public fun stackName(stackName: String)

    /**
     * @param templateConfiguration Input artifact to use for template parameters values and stack
     * policy.
     * The template configuration file should contain a JSON object that should look like this:
     * `{ "Parameters": {...}, "Tags": {...}, "StackPolicy": {... }}`. For more information,
     * see [AWS CloudFormation
     * Artifacts](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-cfn-artifacts.html).
     *
     * Note that if you include sensitive information, such as passwords, restrict access to this
     * file.
     */
    public fun templateConfiguration(templateConfiguration: ArtifactPath)

    /**
     * @param templatePath Input artifact with the ChangeSet's CloudFormation template. 
     */
    public fun templatePath(templatePath: ArtifactPath)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps.builder()

    /**
     * @param account The AWS account this Action is supposed to operate in.
     * **Note**: if you specify the `role` property,
     * this is ignored - the action will operate in the same region the passed role does.
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param adminPermissions Whether to grant full permissions to CloudFormation while deploying
     * this template. 
     * Setting this to `true` affects the defaults for `role` and `capabilities`, if you
     * don't specify any alternatives.
     *
     * The default role that will be created for you will have full (i.e., `*`)
     * permissions on all resources, and the deployment will have named IAM
     * capabilities (i.e., able to create all IAM resources).
     *
     * This is a shorthand that you can use if you fully trust the templates that
     * are deployed in this pipeline. If you want more fine-grained permissions,
     * use `addToRolePolicy` and `capabilities` to control what the CloudFormation
     * deployment is allowed to do.
     */
    override fun adminPermissions(adminPermissions: Boolean) {
      cdkBuilder.adminPermissions(adminPermissions)
    }

    /**
     * @param cfnCapabilities Acknowledge certain changes made as part of deployment.
     * For stacks that contain certain resources,
     * explicit acknowledgement is required that AWS CloudFormation might create or update those
     * resources.
     * For example, you must specify `ANONYMOUS_IAM` or `NAMED_IAM` if your stack template contains
     * AWS
     * Identity and Access Management (IAM) resources.
     * For more information, see the link below.
     */
    override fun cfnCapabilities(cfnCapabilities: List<CfnCapabilities>) {
      cdkBuilder.cfnCapabilities(cfnCapabilities.map(CfnCapabilities::unwrap))
    }

    /**
     * @param cfnCapabilities Acknowledge certain changes made as part of deployment.
     * For stacks that contain certain resources,
     * explicit acknowledgement is required that AWS CloudFormation might create or update those
     * resources.
     * For example, you must specify `ANONYMOUS_IAM` or `NAMED_IAM` if your stack template contains
     * AWS
     * Identity and Access Management (IAM) resources.
     * For more information, see the link below.
     */
    override fun cfnCapabilities(vararg cfnCapabilities: CfnCapabilities): Unit =
        cfnCapabilities(cfnCapabilities.toList())

    /**
     * @param changeSetName Name of the change set to create or update. 
     */
    override fun changeSetName(changeSetName: String) {
      cdkBuilder.changeSetName(changeSetName)
    }

    /**
     * @param deploymentRole IAM role to assume when deploying changes.
     * If not specified, a fresh role is created. The role is created with zero
     * permissions unless `adminPermissions` is true, in which case the role will have
     * full permissions.
     */
    override fun deploymentRole(deploymentRole: IRole) {
      cdkBuilder.deploymentRole(deploymentRole.let(IRole::unwrap))
    }

    /**
     * @param extraInputs The list of additional input Artifacts for this Action.
     * This is especially useful when used in conjunction with the `parameterOverrides` property.
     * For example, if you have:
     *
     * parameterOverrides: {
     * 'Param1': action1.outputArtifact.bucketName,
     * 'Param2': action2.outputArtifact.objectKey,
     * }
     *
     * , if the output Artifacts of `action1` and `action2` were not used to
     * set either the `templateConfiguration` or the `templatePath` properties,
     * you need to make sure to include them in the `extraInputs` -
     * otherwise, you'll get an "unrecognized Artifact" error during your Pipeline's execution.
     */
    override fun extraInputs(extraInputs: List<Artifact>) {
      cdkBuilder.extraInputs(extraInputs.map(Artifact::unwrap))
    }

    /**
     * @param extraInputs The list of additional input Artifacts for this Action.
     * This is especially useful when used in conjunction with the `parameterOverrides` property.
     * For example, if you have:
     *
     * parameterOverrides: {
     * 'Param1': action1.outputArtifact.bucketName,
     * 'Param2': action2.outputArtifact.objectKey,
     * }
     *
     * , if the output Artifacts of `action1` and `action2` were not used to
     * set either the `templateConfiguration` or the `templatePath` properties,
     * you need to make sure to include them in the `extraInputs` -
     * otherwise, you'll get an "unrecognized Artifact" error during your Pipeline's execution.
     */
    override fun extraInputs(vararg extraInputs: Artifact): Unit = extraInputs(extraInputs.toList())

    /**
     * @param output The name of the output artifact to generate.
     * Only applied if `outputFileName` is set as well.
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
    }

    /**
     * @param outputFileName A name for the filename in the output artifact to store the AWS
     * CloudFormation call's result.
     * The file will contain the result of the call to AWS CloudFormation (for example
     * the call to UpdateStack or CreateChangeSet).
     *
     * AWS CodePipeline adds the file to the output artifact after performing
     * the specified action.
     */
    override fun outputFileName(outputFileName: String) {
      cdkBuilder.outputFileName(outputFileName)
    }

    /**
     * @param parameterOverrides Additional template parameters.
     * Template parameters specified here take precedence over template parameters
     * found in the artifact specified by the `templateConfiguration` property.
     *
     * We recommend that you use the template configuration file to specify
     * most of your parameter values. Use parameter overrides to specify only
     * dynamic parameter values (values that are unknown until you run the
     * pipeline).
     *
     * All parameter names must be present in the stack template.
     *
     * Note: the entire object cannot be more than 1kB.
     */
    override fun parameterOverrides(parameterOverrides: Map<String, Any>) {
      cdkBuilder.parameterOverrides(parameterOverrides)
    }

    /**
     * @param region The AWS region the given Action resides in.
     * Note that a cross-region Pipeline requires replication buckets to function correctly.
     * You can provide their names with the `PipelineProps#crossRegionReplicationBuckets` property.
     * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
     * those buckets,
     * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param stackName The name of the stack to apply this action to. 
     */
    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    /**
     * @param templateConfiguration Input artifact to use for template parameters values and stack
     * policy.
     * The template configuration file should contain a JSON object that should look like this:
     * `{ "Parameters": {...}, "Tags": {...}, "StackPolicy": {... }}`. For more information,
     * see [AWS CloudFormation
     * Artifacts](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-cfn-artifacts.html).
     *
     * Note that if you include sensitive information, such as passwords, restrict access to this
     * file.
     */
    override fun templateConfiguration(templateConfiguration: ArtifactPath) {
      cdkBuilder.templateConfiguration(templateConfiguration.let(ArtifactPath::unwrap))
    }

    /**
     * @param templatePath Input artifact with the ChangeSet's CloudFormation template. 
     */
    override fun templatePath(templatePath: ArtifactPath) {
      cdkBuilder.templatePath(templatePath.let(ArtifactPath::unwrap))
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps,
  ) : CdkObject(cdkObject), CloudFormationCreateReplaceChangeSetActionProps {
    /**
     * The AWS account this Action is supposed to operate in.
     *
     * **Note**: if you specify the `role` property,
     * this is ignored - the action will operate in the same region the passed role does.
     *
     * Default: - action resides in the same account as the pipeline
     */
    override fun account(): String? = unwrap(this).getAccount()

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * Whether to grant full permissions to CloudFormation while deploying this template.
     *
     * Setting this to `true` affects the defaults for `role` and `capabilities`, if you
     * don't specify any alternatives.
     *
     * The default role that will be created for you will have full (i.e., `*`)
     * permissions on all resources, and the deployment will have named IAM
     * capabilities (i.e., able to create all IAM resources).
     *
     * This is a shorthand that you can use if you fully trust the templates that
     * are deployed in this pipeline. If you want more fine-grained permissions,
     * use `addToRolePolicy` and `capabilities` to control what the CloudFormation
     * deployment is allowed to do.
     */
    override fun adminPermissions(): Boolean = unwrap(this).getAdminPermissions()

    /**
     * Acknowledge certain changes made as part of deployment.
     *
     * For stacks that contain certain resources,
     * explicit acknowledgement is required that AWS CloudFormation might create or update those
     * resources.
     * For example, you must specify `ANONYMOUS_IAM` or `NAMED_IAM` if your stack template contains
     * AWS
     * Identity and Access Management (IAM) resources.
     * For more information, see the link below.
     *
     * Default: None, unless `adminPermissions` is true
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
     */
    override fun cfnCapabilities(): List<CfnCapabilities> =
        unwrap(this).getCfnCapabilities()?.map(CfnCapabilities::wrap) ?: emptyList()

    /**
     * Name of the change set to create or update.
     */
    override fun changeSetName(): String = unwrap(this).getChangeSetName()

    /**
     * IAM role to assume when deploying changes.
     *
     * If not specified, a fresh role is created. The role is created with zero
     * permissions unless `adminPermissions` is true, in which case the role will have
     * full permissions.
     *
     * Default: A fresh role with full or no permissions (depending on the value of
     * `adminPermissions`).
     */
    override fun deploymentRole(): IRole? = unwrap(this).getDeploymentRole()?.let(IRole::wrap)

    /**
     * The list of additional input Artifacts for this Action.
     *
     * This is especially useful when used in conjunction with the `parameterOverrides` property.
     * For example, if you have:
     *
     * parameterOverrides: {
     * 'Param1': action1.outputArtifact.bucketName,
     * 'Param2': action2.outputArtifact.objectKey,
     * }
     *
     * , if the output Artifacts of `action1` and `action2` were not used to
     * set either the `templateConfiguration` or the `templatePath` properties,
     * you need to make sure to include them in the `extraInputs` -
     * otherwise, you'll get an "unrecognized Artifact" error during your Pipeline's execution.
     */
    override fun extraInputs(): List<Artifact> = unwrap(this).getExtraInputs()?.map(Artifact::wrap)
        ?: emptyList()

    /**
     * The name of the output artifact to generate.
     *
     * Only applied if `outputFileName` is set as well.
     *
     * Default: Automatically generated artifact name.
     */
    override fun output(): Artifact? = unwrap(this).getOutput()?.let(Artifact::wrap)

    /**
     * A name for the filename in the output artifact to store the AWS CloudFormation call's result.
     *
     * The file will contain the result of the call to AWS CloudFormation (for example
     * the call to UpdateStack or CreateChangeSet).
     *
     * AWS CodePipeline adds the file to the output artifact after performing
     * the specified action.
     *
     * Default: No output artifact generated
     */
    override fun outputFileName(): String? = unwrap(this).getOutputFileName()

    /**
     * Additional template parameters.
     *
     * Template parameters specified here take precedence over template parameters
     * found in the artifact specified by the `templateConfiguration` property.
     *
     * We recommend that you use the template configuration file to specify
     * most of your parameter values. Use parameter overrides to specify only
     * dynamic parameter values (values that are unknown until you run the
     * pipeline).
     *
     * All parameter names must be present in the stack template.
     *
     * Note: the entire object cannot be more than 1kB.
     *
     * Default: No overrides
     */
    override fun parameterOverrides(): Map<String, Any> = unwrap(this).getParameterOverrides() ?:
        emptyMap()

    /**
     * The AWS region the given Action resides in.
     *
     * Note that a cross-region Pipeline requires replication buckets to function correctly.
     * You can provide their names with the `PipelineProps#crossRegionReplicationBuckets` property.
     * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
     * those buckets,
     * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
     *
     * Default: the Action resides in the same region as the Pipeline
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     */
    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    /**
     * The name of the stack to apply this action to.
     */
    override fun stackName(): String = unwrap(this).getStackName()

    /**
     * Input artifact to use for template parameters values and stack policy.
     *
     * The template configuration file should contain a JSON object that should look like this:
     * `{ "Parameters": {...}, "Tags": {...}, "StackPolicy": {... }}`. For more information,
     * see [AWS CloudFormation
     * Artifacts](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-cfn-artifacts.html).
     *
     * Note that if you include sensitive information, such as passwords, restrict access to this
     * file.
     *
     * Default: No template configuration based on input artifacts
     */
    override fun templateConfiguration(): ArtifactPath? =
        unwrap(this).getTemplateConfiguration()?.let(ArtifactPath::wrap)

    /**
     * Input artifact with the ChangeSet's CloudFormation template.
     */
    override fun templatePath(): ArtifactPath =
        unwrap(this).getTemplatePath().let(ArtifactPath::wrap)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     */
    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFormationCreateReplaceChangeSetActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps):
        CloudFormationCreateReplaceChangeSetActionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CloudFormationCreateReplaceChangeSetActionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationCreateReplaceChangeSetActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps
  }
}
