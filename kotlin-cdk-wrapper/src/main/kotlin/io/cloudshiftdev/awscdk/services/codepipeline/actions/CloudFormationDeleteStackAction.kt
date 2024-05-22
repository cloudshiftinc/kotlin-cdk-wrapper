@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.CfnCapabilities
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * CodePipeline action to delete a stack.
 *
 * Deletes a stack. If you specify a stack that doesn't exist, the action completes successfully
 * without deleting a stack.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Artifact artifact;
 * ArtifactPath artifactPath;
 * Object parameterOverrides;
 * Role role;
 * CloudFormationDeleteStackAction cloudFormationDeleteStackAction =
 * CloudFormationDeleteStackAction.Builder.create()
 * .actionName("actionName")
 * .adminPermissions(false)
 * .stackName("stackName")
 * // the properties below are optional
 * .account("account")
 * .cfnCapabilities(List.of(CfnCapabilities.NONE))
 * .deploymentRole(role)
 * .extraInputs(List.of(artifact))
 * .output(artifact)
 * .outputFileName("outputFileName")
 * .parameterOverrides(Map.of(
 * "parameterOverridesKey", parameterOverrides))
 * .region("region")
 * .role(role)
 * .runOrder(123)
 * .templateConfiguration(artifactPath)
 * .variablesNamespace("variablesNamespace")
 * .build();
 * ```
 */
public open class CloudFormationDeleteStackAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction,
) : Action(cdkObject) {
  public constructor(props: CloudFormationDeleteStackActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction(props.let(CloudFormationDeleteStackActionProps.Companion::unwrap))
  )

  public constructor(props: CloudFormationDeleteStackActionProps.Builder.() -> Unit) :
      this(CloudFormationDeleteStackActionProps(props)
  )

  /**
   * Add statement to the service role assumed by CloudFormation while executing this action.
   *
   * @param statement 
   */
  public open fun addToDeploymentRolePolicy(statement: PolicyStatement): Boolean =
      unwrap(this).addToDeploymentRolePolicy(statement.let(PolicyStatement.Companion::unwrap))

  /**
   * Add statement to the service role assumed by CloudFormation while executing this action.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe44095aa4e81711afe0beff27bc1e4c16dcc5a3afedec001c0afae9d5844fde")
  public open fun addToDeploymentRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Boolean
      = addToDeploymentRolePolicy(PolicyStatement(statement))

  /**
   *
   */
  public open fun deploymentRole(): IRole = unwrap(this).getDeploymentRole().let(IRole::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account this Action is supposed to operate in.
     *
     * **Note**: if you specify the `role` property,
     * this is ignored - the action will operate in the same region the passed role does.
     *
     * Default: - action resides in the same account as the pipeline
     *
     * @param account The AWS account this Action is supposed to operate in. 
     */
    public fun account(account: String)

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    public fun actionName(actionName: String)

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
     *
     * @param adminPermissions Whether to grant full permissions to CloudFormation while deploying
     * this template. 
     */
    public fun adminPermissions(adminPermissions: Boolean)

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
     * @param cfnCapabilities Acknowledge certain changes made as part of deployment. 
     */
    public fun cfnCapabilities(cfnCapabilities: List<CfnCapabilities>)

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
     * @param cfnCapabilities Acknowledge certain changes made as part of deployment. 
     */
    public fun cfnCapabilities(vararg cfnCapabilities: CfnCapabilities)

    /**
     * IAM role to assume when deploying changes.
     *
     * If not specified, a fresh role is created. The role is created with zero
     * permissions unless `adminPermissions` is true, in which case the role will have
     * full permissions.
     *
     * Default: A fresh role with full or no permissions (depending on the value of
     * `adminPermissions`).
     *
     * @param deploymentRole IAM role to assume when deploying changes. 
     */
    public fun deploymentRole(deploymentRole: IRole)

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
     *
     * @param extraInputs The list of additional input Artifacts for this Action. 
     */
    public fun extraInputs(extraInputs: List<Artifact>)

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
     *
     * @param extraInputs The list of additional input Artifacts for this Action. 
     */
    public fun extraInputs(vararg extraInputs: Artifact)

    /**
     * The name of the output artifact to generate.
     *
     * Only applied if `outputFileName` is set as well.
     *
     * Default: Automatically generated artifact name.
     *
     * @param output The name of the output artifact to generate. 
     */
    public fun output(output: Artifact)

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
     *
     * @param outputFileName A name for the filename in the output artifact to store the AWS
     * CloudFormation call's result. 
     */
    public fun outputFileName(outputFileName: String)

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
     *
     * @param parameterOverrides Additional template parameters. 
     */
    public fun parameterOverrides(parameterOverrides: Map<String, Any>)

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
     *
     * @param region The AWS region the given Action resides in. 
     */
    public fun region(region: String)

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
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    public fun role(role: IRole)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    public fun runOrder(runOrder: Number)

    /**
     * The name of the stack to apply this action to.
     *
     * @param stackName The name of the stack to apply this action to. 
     */
    public fun stackName(stackName: String)

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
     *
     * @param templateConfiguration Input artifact to use for template parameters values and stack
     * policy. 
     */
    public fun templateConfiguration(templateConfiguration: ArtifactPath)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction.Builder.create()

    /**
     * The AWS account this Action is supposed to operate in.
     *
     * **Note**: if you specify the `role` property,
     * this is ignored - the action will operate in the same region the passed role does.
     *
     * Default: - action resides in the same account as the pipeline
     *
     * @param account The AWS account this Action is supposed to operate in. 
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

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
     *
     * @param adminPermissions Whether to grant full permissions to CloudFormation while deploying
     * this template. 
     */
    override fun adminPermissions(adminPermissions: Boolean) {
      cdkBuilder.adminPermissions(adminPermissions)
    }

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
     * @param cfnCapabilities Acknowledge certain changes made as part of deployment. 
     */
    override fun cfnCapabilities(cfnCapabilities: List<CfnCapabilities>) {
      cdkBuilder.cfnCapabilities(cfnCapabilities.map(CfnCapabilities.Companion::unwrap))
    }

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
     * @param cfnCapabilities Acknowledge certain changes made as part of deployment. 
     */
    override fun cfnCapabilities(vararg cfnCapabilities: CfnCapabilities): Unit =
        cfnCapabilities(cfnCapabilities.toList())

    /**
     * IAM role to assume when deploying changes.
     *
     * If not specified, a fresh role is created. The role is created with zero
     * permissions unless `adminPermissions` is true, in which case the role will have
     * full permissions.
     *
     * Default: A fresh role with full or no permissions (depending on the value of
     * `adminPermissions`).
     *
     * @param deploymentRole IAM role to assume when deploying changes. 
     */
    override fun deploymentRole(deploymentRole: IRole) {
      cdkBuilder.deploymentRole(deploymentRole.let(IRole.Companion::unwrap))
    }

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
     *
     * @param extraInputs The list of additional input Artifacts for this Action. 
     */
    override fun extraInputs(extraInputs: List<Artifact>) {
      cdkBuilder.extraInputs(extraInputs.map(Artifact.Companion::unwrap))
    }

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
     *
     * @param extraInputs The list of additional input Artifacts for this Action. 
     */
    override fun extraInputs(vararg extraInputs: Artifact): Unit = extraInputs(extraInputs.toList())

    /**
     * The name of the output artifact to generate.
     *
     * Only applied if `outputFileName` is set as well.
     *
     * Default: Automatically generated artifact name.
     *
     * @param output The name of the output artifact to generate. 
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact.Companion::unwrap))
    }

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
     *
     * @param outputFileName A name for the filename in the output artifact to store the AWS
     * CloudFormation call's result. 
     */
    override fun outputFileName(outputFileName: String) {
      cdkBuilder.outputFileName(outputFileName)
    }

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
     *
     * @param parameterOverrides Additional template parameters. 
     */
    override fun parameterOverrides(parameterOverrides: Map<String, Any>) {
      cdkBuilder.parameterOverrides(parameterOverrides.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

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
     *
     * @param region The AWS region the given Action resides in. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

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
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * The name of the stack to apply this action to.
     *
     * @param stackName The name of the stack to apply this action to. 
     */
    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

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
     *
     * @param templateConfiguration Input artifact to use for template parameters values and stack
     * policy. 
     */
    override fun templateConfiguration(templateConfiguration: ArtifactPath) {
      cdkBuilder.templateConfiguration(templateConfiguration.let(ArtifactPath.Companion::unwrap))
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudFormationDeleteStackAction {
      val builderImpl = BuilderImpl()
      return CloudFormationDeleteStackAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction):
        CloudFormationDeleteStackAction = CloudFormationDeleteStackAction(cdkObject)

    internal fun unwrap(wrapped: CloudFormationDeleteStackAction):
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction =
        wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction
  }
}
