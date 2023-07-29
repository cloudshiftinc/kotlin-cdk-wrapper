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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction
import software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateUpdateStackAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateUpdateStackActionProps
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackActionProps
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetActionProps
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction
import software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction
import software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeStarSourceVariables
import software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions
import software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction
import software.amazon.awscdk.services.codepipeline.actions.EcrSourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables
import software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction
import software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps
import software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction
import software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceVariables
import software.amazon.awscdk.services.codepipeline.actions.JenkinsAction
import software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps
import software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction
import software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps
import software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction
import software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps
import software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps
import software.amazon.awscdk.services.codepipeline.actions.S3DeployAction
import software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps
import software.amazon.awscdk.services.codepipeline.actions.S3SourceAction
import software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables
import software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps
import software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1
import software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props
import software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction
import software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps
import software.constructs.Construct

public object actions {
    /**
     * Deploys the skill to Alexa.
     *
     * Example:
     * ```
     * // Read the secrets from ParameterStore
     * SecretValue clientId = SecretValue.secretsManager("AlexaClientId");
     * SecretValue clientSecret = SecretValue.secretsManager("AlexaClientSecret");
     * SecretValue refreshToken = SecretValue.secretsManager("AlexaRefreshToken");
     * // Add deploy action
     * Artifact sourceOutput = new Artifact();
     * AlexaSkillDeployAction.Builder.create()
     * .actionName("DeploySkill")
     * .runOrder(1)
     * .input(sourceOutput)
     * .clientId(clientId.toString())
     * .clientSecret(clientSecret)
     * .refreshToken(refreshToken)
     * .skillId("amzn1.ask.skill.12345678-1234-1234-1234-123456789012")
     * .build();
     * ```
     */
    public inline fun alexaSkillDeployAction(
        block: AlexaSkillDeployActionDsl.() -> Unit = {}
    ): AlexaSkillDeployAction {
        val builder = AlexaSkillDeployActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of the `AlexaSkillDeployAction Alexa deploy Action`.
     *
     * Example:
     * ```
     * // Read the secrets from ParameterStore
     * SecretValue clientId = SecretValue.secretsManager("AlexaClientId");
     * SecretValue clientSecret = SecretValue.secretsManager("AlexaClientSecret");
     * SecretValue refreshToken = SecretValue.secretsManager("AlexaRefreshToken");
     * // Add deploy action
     * Artifact sourceOutput = new Artifact();
     * AlexaSkillDeployAction.Builder.create()
     * .actionName("DeploySkill")
     * .runOrder(1)
     * .input(sourceOutput)
     * .clientId(clientId.toString())
     * .clientSecret(clientSecret)
     * .refreshToken(refreshToken)
     * .skillId("amzn1.ask.skill.12345678-1234-1234-1234-123456789012")
     * .build();
     * ```
     */
    public inline fun alexaSkillDeployActionProps(
        block: AlexaSkillDeployActionPropsDsl.() -> Unit = {}
    ): AlexaSkillDeployActionProps {
        val builder = AlexaSkillDeployActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * CodePipeline action to prepare a change set.
     *
     * Creates the change set if it doesn't exist based on the stack name and template that you
     * submit. If the change set exists, AWS CloudFormation deletes it, and then creates a new one.
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
    public inline fun cloudFormationCreateReplaceChangeSetAction(
        block: CloudFormationCreateReplaceChangeSetActionDsl.() -> Unit = {}
    ): CloudFormationCreateReplaceChangeSetAction {
        val builder = CloudFormationCreateReplaceChangeSetActionDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cloudFormationCreateReplaceChangeSetActionProps(
        block: CloudFormationCreateReplaceChangeSetActionPropsDsl.() -> Unit = {}
    ): CloudFormationCreateReplaceChangeSetActionProps {
        val builder = CloudFormationCreateReplaceChangeSetActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * CodePipeline action to deploy a stack.
     *
     * Creates the stack if the specified stack doesn't exist. If the stack exists, AWS
     * CloudFormation updates the stack. Use this action to update existing stacks.
     *
     * AWS CodePipeline won't replace the stack, and will fail deployment if the stack is in a
     * failed state. Use `ReplaceOnFailure` for an action that will delete and recreate the stack to
     * try and recover from failed states.
     *
     * Use this action to automatically replace failed stacks without recovering or troubleshooting
     * them. You would typically choose this mode for testing.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.PhysicalName;
     * // in stack for account 123456789012...
     * Stack otherAccountStack;
     * Role actionRole = Role.Builder.create(otherAccountStack, "ActionRole")
     * .assumedBy(new AccountPrincipal("123456789012"))
     * // the role has to have a physical name set
     * .roleName(PhysicalName.GENERATE_IF_NEEDED)
     * .build();
     * // in the pipeline stack...
     * Artifact sourceOutput = new Artifact();
     * CloudFormationCreateUpdateStackAction.Builder.create()
     * .actionName("CloudFormationCreateUpdate")
     * .stackName("MyStackName")
     * .adminPermissions(true)
     * .templatePath(sourceOutput.atPath("template.yaml"))
     * .role(actionRole)
     * .build();
     * ```
     */
    public inline fun cloudFormationCreateUpdateStackAction(
        block: CloudFormationCreateUpdateStackActionDsl.() -> Unit = {}
    ): CloudFormationCreateUpdateStackAction {
        val builder = CloudFormationCreateUpdateStackActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the CloudFormationCreateUpdateStackAction.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.PhysicalName;
     * // in stack for account 123456789012...
     * Stack otherAccountStack;
     * Role actionRole = Role.Builder.create(otherAccountStack, "ActionRole")
     * .assumedBy(new AccountPrincipal("123456789012"))
     * // the role has to have a physical name set
     * .roleName(PhysicalName.GENERATE_IF_NEEDED)
     * .build();
     * // in the pipeline stack...
     * Artifact sourceOutput = new Artifact();
     * CloudFormationCreateUpdateStackAction.Builder.create()
     * .actionName("CloudFormationCreateUpdate")
     * .stackName("MyStackName")
     * .adminPermissions(true)
     * .templatePath(sourceOutput.atPath("template.yaml"))
     * .role(actionRole)
     * .build();
     * ```
     */
    public inline fun cloudFormationCreateUpdateStackActionProps(
        block: CloudFormationCreateUpdateStackActionPropsDsl.() -> Unit = {}
    ): CloudFormationCreateUpdateStackActionProps {
        val builder = CloudFormationCreateUpdateStackActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * CodePipeline action to delete a stack.
     *
     * Deletes a stack. If you specify a stack that doesn't exist, the action completes successfully
     * without deleting a stack.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.codepipeline.*;
     * import software.amazon.awscdk.services.codepipeline.actions.*;
     * import software.amazon.awscdk.services.iam.*;
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
    public inline fun cloudFormationDeleteStackAction(
        block: CloudFormationDeleteStackActionDsl.() -> Unit = {}
    ): CloudFormationDeleteStackAction {
        val builder = CloudFormationDeleteStackActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the CloudFormationDeleteStackAction.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.codepipeline.*;
     * import software.amazon.awscdk.services.codepipeline.actions.*;
     * import software.amazon.awscdk.services.iam.*;
     * Artifact artifact;
     * ArtifactPath artifactPath;
     * Object parameterOverrides;
     * Role role;
     * CloudFormationDeleteStackActionProps cloudFormationDeleteStackActionProps =
     * CloudFormationDeleteStackActionProps.builder()
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
    public inline fun cloudFormationDeleteStackActionProps(
        block: CloudFormationDeleteStackActionPropsDsl.() -> Unit = {}
    ): CloudFormationDeleteStackActionProps {
        val builder = CloudFormationDeleteStackActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * CodePipeline action to create/update Stack Instances of a StackSet.
     *
     * After the initial creation of a stack set, you can add new stack instances by using
     * CloudFormationStackInstances. Template parameter values can be overridden at the stack
     * instance level during create or update stack set instance operations.
     *
     * Each stack set has one template and set of template parameters. When you update the template
     * or template parameters, you update them for the entire set. Then all instance statuses are
     * set to OUTDATED until the changes are deployed to that instance.
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
    public inline fun cloudFormationDeployStackInstancesAction(
        block: CloudFormationDeployStackInstancesActionDsl.() -> Unit = {}
    ): CloudFormationDeployStackInstancesAction {
        val builder = CloudFormationDeployStackInstancesActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the CloudFormationDeployStackInstancesAction.
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
    public inline fun cloudFormationDeployStackInstancesActionProps(
        block: CloudFormationDeployStackInstancesActionPropsDsl.() -> Unit = {}
    ): CloudFormationDeployStackInstancesActionProps {
        val builder = CloudFormationDeployStackInstancesActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * CodePipeline action to deploy a stackset.
     *
     * CodePipeline offers the ability to perform AWS CloudFormation StackSets operations as part of
     * your CI/CD process. You use a stack set to create stacks in AWS accounts across AWS Regions
     * by using a single AWS CloudFormation template. All the resources included in each stack are
     * defined by the stack set’s AWS CloudFormation template. When you create the stack set, you
     * specify the template to use, as well as any parameters and capabilities that the template
     * requires.
     *
     * For more information about concepts for AWS CloudFormation StackSets, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html">StackSets
     * concepts</a> in the AWS CloudFormation User Guide.
     *
     * If you use this action to make an update that includes adding stack instances, the new
     * instances are deployed first and the update is completed last. The new instances first
     * receive the old version, and then the update is applied to all instances.
     *
     * As a best practice, you should construct your pipeline so that the stack set is created and
     * initially deploys to a subset or a single instance. After you test your deployment and view
     * the generated stack set, then add the CloudFormationStackInstances action so that the
     * remaining instances are created and updated.
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
    public inline fun cloudFormationDeployStackSetAction(
        block: CloudFormationDeployStackSetActionDsl.() -> Unit = {}
    ): CloudFormationDeployStackSetAction {
        val builder = CloudFormationDeployStackSetActionDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cloudFormationDeployStackSetActionProps(
        block: CloudFormationDeployStackSetActionPropsDsl.() -> Unit = {}
    ): CloudFormationDeployStackSetActionProps {
        val builder = CloudFormationDeployStackSetActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * CodePipeline action to execute a prepared change set.
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
    public inline fun cloudFormationExecuteChangeSetAction(
        block: CloudFormationExecuteChangeSetActionDsl.() -> Unit = {}
    ): CloudFormationExecuteChangeSetAction {
        val builder = CloudFormationExecuteChangeSetActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the CloudFormationExecuteChangeSetAction.
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
    public inline fun cloudFormationExecuteChangeSetActionProps(
        block: CloudFormationExecuteChangeSetActionPropsDsl.() -> Unit = {}
    ): CloudFormationExecuteChangeSetActionProps {
        val builder = CloudFormationExecuteChangeSetActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * CodePipeline build action that uses AWS CodeBuild.
     *
     * Example:
     * ```
     * // Create a Cloudfront Web Distribution
     * import software.amazon.awscdk.services.cloudfront.*;
     * Distribution distribution;
     * // Create the build project that will invalidate the cache
     * PipelineProject invalidateBuildProject = PipelineProject.Builder.create(this,
     * "InvalidateProject")
     * .buildSpec(BuildSpec.fromObject(Map.of(
     * "version", "0.2",
     * "phases", Map.of(
     * "build", Map.of(
     * "commands", List.of("aws cloudfront create-invalidation --distribution-id
     * ${CLOUDFRONT_ID} --paths \"/ *\""))))))
     * .environmentVariables(Map.of(
     * "CLOUDFRONT_ID",
     * BuildEnvironmentVariable.builder().value(distribution.getDistributionId()).build()))
     * .build();
     * // Add Cloudfront invalidation permissions to the project
     * String distributionArn = String.format("arn:aws:cloudfront::%s:distribution/%s", this.account,
     * distribution.getDistributionId());
     * invalidateBuildProject.addToRolePolicy(PolicyStatement.Builder.create()
     * .resources(List.of(distributionArn))
     * .actions(List.of("cloudfront:CreateInvalidation"))
     * .build());
     * // Create the pipeline (here only the S3 deploy and Invalidate cache build)
     * Bucket deployBucket = new Bucket(this, "DeployBucket");
     * Artifact deployInput = new Artifact();
     * Pipeline.Builder.create(this, "Pipeline")
     * .stages(List.of(StageProps.builder()
     * .stageName("Deploy")
     * .actions(List.of(
     * S3DeployAction.Builder.create()
     * .actionName("S3Deploy")
     * .bucket(deployBucket)
     * .input(deployInput)
     * .runOrder(1)
     * .build(),
     * CodeBuildAction.Builder.create()
     * .actionName("InvalidateCache")
     * .project(invalidateBuildProject)
     * .input(deployInput)
     * .runOrder(2)
     * .build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun codeBuildAction(block: CodeBuildActionDsl.() -> Unit = {}): CodeBuildAction {
        val builder = CodeBuildActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of the `CodeBuildAction CodeBuild build CodePipeline action`.
     *
     * Example:
     * ```
     * // Create a Cloudfront Web Distribution
     * import software.amazon.awscdk.services.cloudfront.*;
     * Distribution distribution;
     * // Create the build project that will invalidate the cache
     * PipelineProject invalidateBuildProject = PipelineProject.Builder.create(this,
     * "InvalidateProject")
     * .buildSpec(BuildSpec.fromObject(Map.of(
     * "version", "0.2",
     * "phases", Map.of(
     * "build", Map.of(
     * "commands", List.of("aws cloudfront create-invalidation --distribution-id
     * ${CLOUDFRONT_ID} --paths \"/ *\""))))))
     * .environmentVariables(Map.of(
     * "CLOUDFRONT_ID",
     * BuildEnvironmentVariable.builder().value(distribution.getDistributionId()).build()))
     * .build();
     * // Add Cloudfront invalidation permissions to the project
     * String distributionArn = String.format("arn:aws:cloudfront::%s:distribution/%s", this.account,
     * distribution.getDistributionId());
     * invalidateBuildProject.addToRolePolicy(PolicyStatement.Builder.create()
     * .resources(List.of(distributionArn))
     * .actions(List.of("cloudfront:CreateInvalidation"))
     * .build());
     * // Create the pipeline (here only the S3 deploy and Invalidate cache build)
     * Bucket deployBucket = new Bucket(this, "DeployBucket");
     * Artifact deployInput = new Artifact();
     * Pipeline.Builder.create(this, "Pipeline")
     * .stages(List.of(StageProps.builder()
     * .stageName("Deploy")
     * .actions(List.of(
     * S3DeployAction.Builder.create()
     * .actionName("S3Deploy")
     * .bucket(deployBucket)
     * .input(deployInput)
     * .runOrder(1)
     * .build(),
     * CodeBuildAction.Builder.create()
     * .actionName("InvalidateCache")
     * .project(invalidateBuildProject)
     * .input(deployInput)
     * .runOrder(2)
     * .build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun codeBuildActionProps(
        block: CodeBuildActionPropsDsl.() -> Unit = {}
    ): CodeBuildActionProps {
        val builder = CodeBuildActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * CodePipeline Source that is provided by an AWS CodeCommit repository.
     *
     * If the CodeCommit repository is in a different account, you must use
     * `CodeCommitTrigger.EVENTS` to trigger the pipeline.
     *
     * (That is because the Pipeline structure normally only has a `RepositoryName` field, and that
     * is not enough for the pipeline to locate the repository's source account. However, if the
     * pipeline is triggered via an EventBridge event, the event itself has the full repository ARN
     * in there, allowing the pipeline to locate the repository).
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
    public inline fun codeCommitSourceAction(
        block: CodeCommitSourceActionDsl.() -> Unit = {}
    ): CodeCommitSourceAction {
        val builder = CodeCommitSourceActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of the `CodeCommitSourceAction CodeCommit source CodePipeline
     * Action`.
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
    public inline fun codeCommitSourceActionProps(
        block: CodeCommitSourceActionPropsDsl.() -> Unit = {}
    ): CodeCommitSourceActionProps {
        val builder = CodeCommitSourceActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The CodePipeline variables emitted by the CodeCommit source Action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.actions.*;
     * CodeCommitSourceVariables codeCommitSourceVariables = CodeCommitSourceVariables.builder()
     * .authorDate("authorDate")
     * .branchName("branchName")
     * .commitId("commitId")
     * .commitMessage("commitMessage")
     * .committerDate("committerDate")
     * .repositoryName("repositoryName")
     * .build();
     * ```
     */
    public inline fun codeCommitSourceVariables(
        block: CodeCommitSourceVariablesDsl.() -> Unit = {}
    ): CodeCommitSourceVariables {
        val builder = CodeCommitSourceVariablesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for replacing a placeholder string in the ECS task definition template file
     * with an image URI.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * import software.amazon.awscdk.services.codepipeline.actions.*;
     * Artifact artifact;
     * CodeDeployEcsContainerImageInput codeDeployEcsContainerImageInput =
     * CodeDeployEcsContainerImageInput.builder()
     * .input(artifact)
     * // the properties below are optional
     * .taskDefinitionPlaceholder("taskDefinitionPlaceholder")
     * .build();
     * ```
     */
    public inline fun codeDeployEcsContainerImageInput(
        block: CodeDeployEcsContainerImageInputDsl.() -> Unit = {}
    ): CodeDeployEcsContainerImageInput {
        val builder = CodeDeployEcsContainerImageInputDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codedeploy.*;
     * import software.amazon.awscdk.services.codepipeline.*;
     * import software.amazon.awscdk.services.codepipeline.actions.*;
     * import software.amazon.awscdk.services.iam.*;
     * Artifact artifact;
     * ArtifactPath artifactPath;
     * EcsDeploymentGroup ecsDeploymentGroup;
     * Role role;
     * CodeDeployEcsDeployAction codeDeployEcsDeployAction =
     * CodeDeployEcsDeployAction.Builder.create()
     * .actionName("actionName")
     * .deploymentGroup(ecsDeploymentGroup)
     * // the properties below are optional
     * .appSpecTemplateFile(artifactPath)
     * .appSpecTemplateInput(artifact)
     * .containerImageInputs(List.of(CodeDeployEcsContainerImageInput.builder()
     * .input(artifact)
     * // the properties below are optional
     * .taskDefinitionPlaceholder("taskDefinitionPlaceholder")
     * .build()))
     * .role(role)
     * .runOrder(123)
     * .taskDefinitionTemplateFile(artifactPath)
     * .taskDefinitionTemplateInput(artifact)
     * .variablesNamespace("variablesNamespace")
     * .build();
     * ```
     */
    public inline fun codeDeployEcsDeployAction(
        block: CodeDeployEcsDeployActionDsl.() -> Unit = {}
    ): CodeDeployEcsDeployAction {
        val builder = CodeDeployEcsDeployActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of the `CodeDeployEcsDeployAction CodeDeploy ECS deploy CodePipeline
     * Action`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codedeploy.*;
     * import software.amazon.awscdk.services.codepipeline.*;
     * import software.amazon.awscdk.services.codepipeline.actions.*;
     * import software.amazon.awscdk.services.iam.*;
     * Artifact artifact;
     * ArtifactPath artifactPath;
     * EcsDeploymentGroup ecsDeploymentGroup;
     * Role role;
     * CodeDeployEcsDeployActionProps codeDeployEcsDeployActionProps =
     * CodeDeployEcsDeployActionProps.builder()
     * .actionName("actionName")
     * .deploymentGroup(ecsDeploymentGroup)
     * // the properties below are optional
     * .appSpecTemplateFile(artifactPath)
     * .appSpecTemplateInput(artifact)
     * .containerImageInputs(List.of(CodeDeployEcsContainerImageInput.builder()
     * .input(artifact)
     * // the properties below are optional
     * .taskDefinitionPlaceholder("taskDefinitionPlaceholder")
     * .build()))
     * .role(role)
     * .runOrder(123)
     * .taskDefinitionTemplateFile(artifactPath)
     * .taskDefinitionTemplateInput(artifact)
     * .variablesNamespace("variablesNamespace")
     * .build();
     * ```
     */
    public inline fun codeDeployEcsDeployActionProps(
        block: CodeDeployEcsDeployActionPropsDsl.() -> Unit = {}
    ): CodeDeployEcsDeployActionProps {
        val builder = CodeDeployEcsDeployActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * ServerDeploymentGroup deploymentGroup;
     * Pipeline pipeline = Pipeline.Builder.create(this, "MyPipeline")
     * .pipelineName("MyPipeline")
     * .build();
     * // add the source and build Stages to the Pipeline...
     * Artifact buildOutput = new Artifact();
     * CodeDeployServerDeployAction deployAction = CodeDeployServerDeployAction.Builder.create()
     * .actionName("CodeDeploy")
     * .input(buildOutput)
     * .deploymentGroup(deploymentGroup)
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("Deploy")
     * .actions(List.of(deployAction))
     * .build());
     * ```
     */
    public inline fun codeDeployServerDeployAction(
        block: CodeDeployServerDeployActionDsl.() -> Unit = {}
    ): CodeDeployServerDeployAction {
        val builder = CodeDeployServerDeployActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of the `CodeDeployServerDeployAction CodeDeploy server deploy
     * CodePipeline Action`.
     *
     * Example:
     * ```
     * ServerDeploymentGroup deploymentGroup;
     * Pipeline pipeline = Pipeline.Builder.create(this, "MyPipeline")
     * .pipelineName("MyPipeline")
     * .build();
     * // add the source and build Stages to the Pipeline...
     * Artifact buildOutput = new Artifact();
     * CodeDeployServerDeployAction deployAction = CodeDeployServerDeployAction.Builder.create()
     * .actionName("CodeDeploy")
     * .input(buildOutput)
     * .deploymentGroup(deploymentGroup)
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("Deploy")
     * .actions(List.of(deployAction))
     * .build());
     * ```
     */
    public inline fun codeDeployServerDeployActionProps(
        block: CodeDeployServerDeployActionPropsDsl.() -> Unit = {}
    ): CodeDeployServerDeployActionProps {
        val builder = CodeDeployServerDeployActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A CodePipeline source action for the CodeStar Connections source, which allows connecting to
     * GitHub and BitBucket.
     *
     * Example:
     * ```
     * Artifact sourceOutput = new Artifact();
     * CodeStarConnectionsSourceAction sourceAction = CodeStarConnectionsSourceAction.Builder.create()
     * .actionName("BitBucket_Source")
     * .owner("aws")
     * .repo("aws-cdk")
     * .output(sourceOutput)
     * .connectionArn("arn:aws:codestar-connections:us-east-1:123456789012:connection/12345678-abcd-12ab-34cdef5678gh")
     * .build();
     * ```
     */
    public inline fun codeStarConnectionsSourceAction(
        block: CodeStarConnectionsSourceActionDsl.() -> Unit = {}
    ): CodeStarConnectionsSourceAction {
        val builder = CodeStarConnectionsSourceActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for `CodeStarConnectionsSourceAction`.
     *
     * Example:
     * ```
     * Artifact sourceOutput = new Artifact();
     * CodeStarConnectionsSourceAction sourceAction = CodeStarConnectionsSourceAction.Builder.create()
     * .actionName("BitBucket_Source")
     * .owner("aws")
     * .repo("aws-cdk")
     * .output(sourceOutput)
     * .connectionArn("arn:aws:codestar-connections:us-east-1:123456789012:connection/12345678-abcd-12ab-34cdef5678gh")
     * .build();
     * ```
     */
    public inline fun codeStarConnectionsSourceActionProps(
        block: CodeStarConnectionsSourceActionPropsDsl.() -> Unit = {}
    ): CodeStarConnectionsSourceActionProps {
        val builder = CodeStarConnectionsSourceActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The CodePipeline variables emitted by CodeStar source Action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.actions.*;
     * CodeStarSourceVariables codeStarSourceVariables = CodeStarSourceVariables.builder()
     * .authorDate("authorDate")
     * .branchName("branchName")
     * .commitId("commitId")
     * .commitMessage("commitMessage")
     * .connectionArn("connectionArn")
     * .fullRepositoryName("fullRepositoryName")
     * .build();
     * ```
     */
    public inline fun codeStarSourceVariables(
        block: CodeStarSourceVariablesDsl.() -> Unit = {}
    ): CodeStarSourceVariables {
        val builder = CodeStarSourceVariablesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options in common between both StackSet actions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.actions.*;
     * CommonCloudFormationStackSetOptions commonCloudFormationStackSetOptions =
     * CommonCloudFormationStackSetOptions.builder()
     * .failureTolerancePercentage(123)
     * .maxAccountConcurrencyPercentage(123)
     * .stackSetRegion("stackSetRegion")
     * .build();
     * ```
     */
    public inline fun commonCloudFormationStackSetOptions(
        block: CommonCloudFormationStackSetOptionsDsl.() -> Unit = {}
    ): CommonCloudFormationStackSetOptions {
        val builder = CommonCloudFormationStackSetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The ECR Repository source CodePipeline Action.
     *
     * Will trigger the pipeline as soon as the target tag in the repository changes, but only if
     * there is a CloudTrail Trail in the account that captures the ECR event.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ecr.*;
     * Repository ecrRepository;
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * Artifact sourceOutput = new Artifact();
     * EcrSourceAction sourceAction = EcrSourceAction.Builder.create()
     * .actionName("ECR")
     * .repository(ecrRepository)
     * .imageTag("some-tag") // optional, default: 'latest'
     * .output(sourceOutput)
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("Source")
     * .actions(List.of(sourceAction))
     * .build());
     * ```
     */
    public inline fun ecrSourceAction(block: EcrSourceActionDsl.() -> Unit = {}): EcrSourceAction {
        val builder = EcrSourceActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of `EcrSourceAction`.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ecr.*;
     * Repository ecrRepository;
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * Artifact sourceOutput = new Artifact();
     * EcrSourceAction sourceAction = EcrSourceAction.Builder.create()
     * .actionName("ECR")
     * .repository(ecrRepository)
     * .imageTag("some-tag") // optional, default: 'latest'
     * .output(sourceOutput)
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("Source")
     * .actions(List.of(sourceAction))
     * .build());
     * ```
     */
    public inline fun ecrSourceActionProps(
        block: EcrSourceActionPropsDsl.() -> Unit = {}
    ): EcrSourceActionProps {
        val builder = EcrSourceActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The CodePipeline variables emitted by the ECR source Action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.actions.*;
     * EcrSourceVariables ecrSourceVariables = EcrSourceVariables.builder()
     * .imageDigest("imageDigest")
     * .imageTag("imageTag")
     * .imageUri("imageUri")
     * .registryId("registryId")
     * .repositoryName("repositoryName")
     * .build();
     * ```
     */
    public inline fun ecrSourceVariables(
        block: EcrSourceVariablesDsl.() -> Unit = {}
    ): EcrSourceVariables {
        val builder = EcrSourceVariablesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * CodePipeline Action to deploy an ECS Service.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ecs.*;
     * FargateService service;
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * Artifact buildOutput = new Artifact();
     * IStage deployStage = pipeline.addStage(StageOptions.builder()
     * .stageName("Deploy")
     * .actions(List.of(
     * EcsDeployAction.Builder.create()
     * .actionName("DeployAction")
     * .service(service)
     * // if your file is called imagedefinitions.json,
     * // use the `input` property,
     * // and leave out the `imageFile` property
     * .input(buildOutput)
     * // if your file name is _not_ imagedefinitions.json,
     * // use the `imageFile` property,
     * // and leave out the `input` property
     * .imageFile(buildOutput.atPath("imageDef.json"))
     * .deploymentTimeout(Duration.minutes(60))
     * .build()))
     * .build());
     * ```
     */
    public inline fun ecsDeployAction(block: EcsDeployActionDsl.() -> Unit = {}): EcsDeployAction {
        val builder = EcsDeployActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of `EcsDeployAction`.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ecs.*;
     * FargateService service;
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * Artifact buildOutput = new Artifact();
     * IStage deployStage = pipeline.addStage(StageOptions.builder()
     * .stageName("Deploy")
     * .actions(List.of(
     * EcsDeployAction.Builder.create()
     * .actionName("DeployAction")
     * .service(service)
     * // if your file is called imagedefinitions.json,
     * // use the `input` property,
     * // and leave out the `imageFile` property
     * .input(buildOutput)
     * // if your file name is _not_ imagedefinitions.json,
     * // use the `imageFile` property,
     * // and leave out the `input` property
     * .imageFile(buildOutput.atPath("imageDef.json"))
     * .deploymentTimeout(Duration.minutes(60))
     * .build()))
     * .build());
     * ```
     */
    public inline fun ecsDeployActionProps(
        block: EcsDeployActionPropsDsl.() -> Unit = {}
    ): EcsDeployActionProps {
        val builder = EcsDeployActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * CodePipeline action to deploy an AWS ElasticBeanstalk Application.
     *
     * Example:
     * ```
     * Artifact sourceOutput = new Artifact();
     * Bucket targetBucket = new Bucket(this, "MyBucket");
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * ElasticBeanstalkDeployAction deployAction = ElasticBeanstalkDeployAction.Builder.create()
     * .actionName("ElasticBeanstalkDeploy")
     * .input(sourceOutput)
     * .environmentName("envName")
     * .applicationName("appName")
     * .build();
     * IStage deployStage = pipeline.addStage(StageOptions.builder()
     * .stageName("Deploy")
     * .actions(List.of(deployAction))
     * .build());
     * ```
     */
    public inline fun elasticBeanstalkDeployAction(
        block: ElasticBeanstalkDeployActionDsl.() -> Unit = {}
    ): ElasticBeanstalkDeployAction {
        val builder = ElasticBeanstalkDeployActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of the `ElasticBeanstalkDeployAction Elastic Beanstalk deploy
     * CodePipeline Action`.
     *
     * Example:
     * ```
     * Artifact sourceOutput = new Artifact();
     * Bucket targetBucket = new Bucket(this, "MyBucket");
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * ElasticBeanstalkDeployAction deployAction = ElasticBeanstalkDeployAction.Builder.create()
     * .actionName("ElasticBeanstalkDeploy")
     * .input(sourceOutput)
     * .environmentName("envName")
     * .applicationName("appName")
     * .build();
     * IStage deployStage = pipeline.addStage(StageOptions.builder()
     * .stageName("Deploy")
     * .actions(List.of(deployAction))
     * .build());
     * ```
     */
    public inline fun elasticBeanstalkDeployActionProps(
        block: ElasticBeanstalkDeployActionPropsDsl.() -> Unit = {}
    ): ElasticBeanstalkDeployActionProps {
        val builder = ElasticBeanstalkDeployActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Source that is provided by a GitHub repository.
     *
     * Example:
     * ```
     * // Read the secret from Secrets Manager
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * Artifact sourceOutput = new Artifact();
     * GitHubSourceAction sourceAction = GitHubSourceAction.Builder.create()
     * .actionName("GitHub_Source")
     * .owner("awslabs")
     * .repo("aws-cdk")
     * .oauthToken(SecretValue.secretsManager("my-github-token"))
     * .output(sourceOutput)
     * .branch("develop")
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("Source")
     * .actions(List.of(sourceAction))
     * .build());
     * ```
     */
    public inline fun gitHubSourceAction(
        block: GitHubSourceActionDsl.() -> Unit = {}
    ): GitHubSourceAction {
        val builder = GitHubSourceActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of the `GitHubSourceAction GitHub source action`.
     *
     * Example:
     * ```
     * // Read the secret from Secrets Manager
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * Artifact sourceOutput = new Artifact();
     * GitHubSourceAction sourceAction = GitHubSourceAction.Builder.create()
     * .actionName("GitHub_Source")
     * .owner("awslabs")
     * .repo("aws-cdk")
     * .oauthToken(SecretValue.secretsManager("my-github-token"))
     * .output(sourceOutput)
     * .branch("develop")
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("Source")
     * .actions(List.of(sourceAction))
     * .build());
     * ```
     */
    public inline fun gitHubSourceActionProps(
        block: GitHubSourceActionPropsDsl.() -> Unit = {}
    ): GitHubSourceActionProps {
        val builder = GitHubSourceActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The CodePipeline variables emitted by GitHub source Action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.actions.*;
     * GitHubSourceVariables gitHubSourceVariables = GitHubSourceVariables.builder()
     * .authorDate("authorDate")
     * .branchName("branchName")
     * .commitId("commitId")
     * .commitMessage("commitMessage")
     * .committerDate("committerDate")
     * .commitUrl("commitUrl")
     * .repositoryName("repositoryName")
     * .build();
     * ```
     */
    public inline fun gitHubSourceVariables(
        block: GitHubSourceVariablesDsl.() -> Unit = {}
    ): GitHubSourceVariables {
        val builder = GitHubSourceVariablesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Jenkins build CodePipeline Action.
     *
     * Example:
     * ```
     * JenkinsProvider jenkinsProvider;
     * JenkinsAction buildAction = JenkinsAction.Builder.create()
     * .actionName("JenkinsBuild")
     * .jenkinsProvider(jenkinsProvider)
     * .projectName("MyProject")
     * .type(JenkinsActionType.BUILD)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/tutorials-four-stage-pipeline.html)
     */
    public inline fun jenkinsAction(block: JenkinsActionDsl.() -> Unit = {}): JenkinsAction {
        val builder = JenkinsActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of `JenkinsAction`.
     *
     * Example:
     * ```
     * JenkinsProvider jenkinsProvider;
     * JenkinsAction buildAction = JenkinsAction.Builder.create()
     * .actionName("JenkinsBuild")
     * .jenkinsProvider(jenkinsProvider)
     * .projectName("MyProject")
     * .type(JenkinsActionType.BUILD)
     * .build();
     * ```
     */
    public inline fun jenkinsActionProps(
        block: JenkinsActionPropsDsl.() -> Unit = {}
    ): JenkinsActionProps {
        val builder = JenkinsActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A class representing Jenkins providers.
     *
     * Example:
     * ```
     * JenkinsProvider jenkinsProvider = JenkinsProvider.Builder.create(this, "JenkinsProvider")
     * .providerName("MyJenkinsProvider")
     * .serverUrl("http://my-jenkins.com:8080")
     * .version("2")
     * .build();
     * ```
     *
     * [Documentation]( #import)
     */
    public inline fun jenkinsProvider(
        scope: Construct,
        id: String,
        block: JenkinsProviderDsl.() -> Unit = {},
    ): JenkinsProvider {
        val builder = JenkinsProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for importing an existing Jenkins provider.
     *
     * Example:
     * ```
     * IJenkinsProvider jenkinsProvider = JenkinsProvider.fromJenkinsProviderAttributes(this,
     * "JenkinsProvider", JenkinsProviderAttributes.builder()
     * .providerName("MyJenkinsProvider")
     * .serverUrl("http://my-jenkins.com:8080")
     * .version("2")
     * .build());
     * ```
     */
    public inline fun jenkinsProviderAttributes(
        block: JenkinsProviderAttributesDsl.() -> Unit = {}
    ): JenkinsProviderAttributes {
        val builder = JenkinsProviderAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * JenkinsProvider jenkinsProvider = JenkinsProvider.Builder.create(this, "JenkinsProvider")
     * .providerName("MyJenkinsProvider")
     * .serverUrl("http://my-jenkins.com:8080")
     * .version("2")
     * .build();
     * ```
     */
    public inline fun jenkinsProviderProps(
        block: JenkinsProviderPropsDsl.() -> Unit = {}
    ): JenkinsProviderProps {
        val builder = JenkinsProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * CodePipeline invoke Action that is provided by an AWS Lambda function.
     *
     * Example:
     * ```
     * Function fn;
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * LambdaInvokeAction lambdaAction = LambdaInvokeAction.Builder.create()
     * .actionName("Lambda")
     * .lambda(fn)
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("Lambda")
     * .actions(List.of(lambdaAction))
     * .build());
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-invoke-lambda-function.html)
     */
    public inline fun lambdaInvokeAction(
        block: LambdaInvokeActionDsl.() -> Unit = {}
    ): LambdaInvokeAction {
        val builder = LambdaInvokeActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of the `LambdaInvokeAction Lambda invoke CodePipeline Action`.
     *
     * Example:
     * ```
     * Function fn;
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * LambdaInvokeAction lambdaAction = LambdaInvokeAction.Builder.create()
     * .actionName("Lambda")
     * .lambda(fn)
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("Lambda")
     * .actions(List.of(lambdaAction))
     * .build());
     * ```
     */
    public inline fun lambdaInvokeActionProps(
        block: LambdaInvokeActionPropsDsl.() -> Unit = {}
    ): LambdaInvokeActionProps {
        val builder = LambdaInvokeActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Manual approval action.
     *
     * Example:
     * ```
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * IStage approveStage = pipeline.addStage(StageOptions.builder().stageName("Approve").build());
     * ManualApprovalAction manualApprovalAction = ManualApprovalAction.Builder.create()
     * .actionName("Approve")
     * .build();
     * approveStage.addAction(manualApprovalAction);
     * IRole role = Role.fromRoleArn(this, "Admin",
     * Arn.format(ArnComponents.builder().service("iam").resource("role").resourceName("Admin").build(),
     * this));
     * manualApprovalAction.grantManualApproval(role);
     * ```
     */
    public inline fun manualApprovalAction(
        block: ManualApprovalActionDsl.() -> Unit = {}
    ): ManualApprovalAction {
        val builder = ManualApprovalActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of the `ManualApprovalAction`.
     *
     * Example:
     * ```
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * IStage approveStage = pipeline.addStage(StageOptions.builder().stageName("Approve").build());
     * ManualApprovalAction manualApprovalAction = ManualApprovalAction.Builder.create()
     * .actionName("Approve")
     * .build();
     * approveStage.addAction(manualApprovalAction);
     * IRole role = Role.fromRoleArn(this, "Admin",
     * Arn.format(ArnComponents.builder().service("iam").resource("role").resourceName("Admin").build(),
     * this));
     * manualApprovalAction.grantManualApproval(role);
     * ```
     */
    public inline fun manualApprovalActionProps(
        block: ManualApprovalActionPropsDsl.() -> Unit = {}
    ): ManualApprovalActionProps {
        val builder = ManualApprovalActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for configuring service-managed (Organizations) permissions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.actions.*;
     * OrganizationsDeploymentProps organizationsDeploymentProps =
     * OrganizationsDeploymentProps.builder()
     * .autoDeployment(StackSetOrganizationsAutoDeployment.ENABLED)
     * .build();
     * ```
     */
    public inline fun organizationsDeploymentProps(
        block: OrganizationsDeploymentPropsDsl.() -> Unit = {}
    ): OrganizationsDeploymentProps {
        val builder = OrganizationsDeploymentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Deploys the sourceArtifact to Amazon S3.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.kms.*;
     * Artifact sourceOutput = new Artifact();
     * Bucket targetBucket = new Bucket(this, "MyBucket");
     * IKey key = Key.Builder.create(this, "EnvVarEncryptKey")
     * .description("sample key")
     * .build();
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * S3DeployAction deployAction = S3DeployAction.Builder.create()
     * .actionName("S3Deploy")
     * .bucket(targetBucket)
     * .input(sourceOutput)
     * .encryptionKey(key)
     * .build();
     * IStage deployStage = pipeline.addStage(StageOptions.builder()
     * .stageName("Deploy")
     * .actions(List.of(deployAction))
     * .build());
     * ```
     */
    public inline fun s3DeployAction(block: S3DeployActionDsl.() -> Unit = {}): S3DeployAction {
        val builder = S3DeployActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of the `S3DeployAction S3 deploy Action`.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.kms.*;
     * Artifact sourceOutput = new Artifact();
     * Bucket targetBucket = new Bucket(this, "MyBucket");
     * IKey key = Key.Builder.create(this, "EnvVarEncryptKey")
     * .description("sample key")
     * .build();
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * S3DeployAction deployAction = S3DeployAction.Builder.create()
     * .actionName("S3Deploy")
     * .bucket(targetBucket)
     * .input(sourceOutput)
     * .encryptionKey(key)
     * .build();
     * IStage deployStage = pipeline.addStage(StageOptions.builder()
     * .stageName("Deploy")
     * .actions(List.of(deployAction))
     * .build());
     * ```
     */
    public inline fun s3DeployActionProps(
        block: S3DeployActionPropsDsl.() -> Unit = {}
    ): S3DeployActionProps {
        val builder = S3DeployActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Source that is provided by a specific Amazon S3 object.
     *
     * Will trigger the pipeline as soon as the S3 object changes, but only if there is a CloudTrail
     * Trail in the account that captures the S3 event.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudtrail.*;
     * Bucket sourceBucket;
     * Artifact sourceOutput = new Artifact();
     * String key = "some/key.zip";
     * Trail trail = new Trail(this, "CloudTrail");
     * trail.addS3EventSelector(List.of(S3EventSelector.builder()
     * .bucket(sourceBucket)
     * .objectPrefix(key)
     * .build()), AddEventSelectorOptions.builder()
     * .readWriteType(ReadWriteType.WRITE_ONLY)
     * .build());
     * S3SourceAction sourceAction = S3SourceAction.Builder.create()
     * .actionName("S3Source")
     * .bucketKey(key)
     * .bucket(sourceBucket)
     * .output(sourceOutput)
     * .trigger(S3Trigger.EVENTS)
     * .build();
     * ```
     */
    public inline fun s3SourceAction(block: S3SourceActionDsl.() -> Unit = {}): S3SourceAction {
        val builder = S3SourceActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of the `S3SourceAction S3 source Action`.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudtrail.*;
     * Bucket sourceBucket;
     * Artifact sourceOutput = new Artifact();
     * String key = "some/key.zip";
     * Trail trail = new Trail(this, "CloudTrail");
     * trail.addS3EventSelector(List.of(S3EventSelector.builder()
     * .bucket(sourceBucket)
     * .objectPrefix(key)
     * .build()), AddEventSelectorOptions.builder()
     * .readWriteType(ReadWriteType.WRITE_ONLY)
     * .build());
     * S3SourceAction sourceAction = S3SourceAction.Builder.create()
     * .actionName("S3Source")
     * .bucketKey(key)
     * .bucket(sourceBucket)
     * .output(sourceOutput)
     * .trigger(S3Trigger.EVENTS)
     * .build();
     * ```
     */
    public inline fun s3SourceActionProps(
        block: S3SourceActionPropsDsl.() -> Unit = {}
    ): S3SourceActionProps {
        val builder = S3SourceActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The CodePipeline variables emitted by the S3 source Action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.actions.*;
     * S3SourceVariables s3SourceVariables = S3SourceVariables.builder()
     * .eTag("eTag")
     * .versionId("versionId")
     * .build();
     * ```
     */
    public inline fun s3SourceVariables(
        block: S3SourceVariablesDsl.() -> Unit = {}
    ): S3SourceVariables {
        val builder = S3SourceVariablesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for configuring self-managed permissions.
     *
     * Example:
     * ```
     * IRole existingAdminRole = Role.fromRoleName(this, "AdminRole",
     * "AWSCloudFormationStackSetAdministrationRole");
     * StackSetDeploymentModel deploymentModel =
     * StackSetDeploymentModel.selfManaged(SelfManagedDeploymentProps.builder()
     * // Use an existing Role. Leave this out to create a new Role.
     * .administrationRole(existingAdminRole)
     * .build());
     * ```
     */
    public inline fun selfManagedDeploymentProps(
        block: SelfManagedDeploymentPropsDsl.() -> Unit = {}
    ): SelfManagedDeploymentProps {
        val builder = SelfManagedDeploymentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * CodePipeline action to connect to an existing ServiceCatalog product.
     *
     * **Note**: this class is still experimental, and may have breaking changes in the future!
     *
     * Example:
     * ```
     * Artifact cdkBuildOutput = new Artifact();
     * ServiceCatalogDeployActionBeta1 serviceCatalogDeployAction =
     * ServiceCatalogDeployActionBeta1.Builder.create()
     * .actionName("ServiceCatalogDeploy")
     * .templatePath(cdkBuildOutput.atPath("Sample.template.json"))
     * .productVersionName("Version - " + Date.getNow().getToString())
     * .productVersionDescription("This is a version from the pipeline with a new description.")
     * .productId("prod-XXXXXXXX")
     * .build();
     * ```
     */
    public inline fun serviceCatalogDeployActionBeta1(
        block: ServiceCatalogDeployActionBeta1Dsl.() -> Unit = {}
    ): ServiceCatalogDeployActionBeta1 {
        val builder = ServiceCatalogDeployActionBeta1Dsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of the `ServiceCatalogDeployActionBeta1 ServiceCatalog deploy
     * CodePipeline Action`.
     *
     * Example:
     * ```
     * Artifact cdkBuildOutput = new Artifact();
     * ServiceCatalogDeployActionBeta1 serviceCatalogDeployAction =
     * ServiceCatalogDeployActionBeta1.Builder.create()
     * .actionName("ServiceCatalogDeploy")
     * .templatePath(cdkBuildOutput.atPath("Sample.template.json"))
     * .productVersionName("Version - " + Date.getNow().getToString())
     * .productVersionDescription("This is a version from the pipeline with a new description.")
     * .productId("prod-XXXXXXXX")
     * .build();
     * ```
     */
    public inline fun serviceCatalogDeployActionBeta1Props(
        block: ServiceCatalogDeployActionBeta1PropsDsl.() -> Unit = {}
    ): ServiceCatalogDeployActionBeta1Props {
        val builder = ServiceCatalogDeployActionBeta1PropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * StepFunctionInvokeAction that is provided by an AWS CodePipeline.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * Pass startState = new Pass(this, "StartState");
     * StateMachine simpleStateMachine = StateMachine.Builder.create(this, "SimpleStateMachine")
     * .definition(startState)
     * .build();
     * StepFunctionInvokeAction stepFunctionAction = StepFunctionInvokeAction.Builder.create()
     * .actionName("Invoke")
     * .stateMachine(simpleStateMachine)
     * .stateMachineInput(StateMachineInput.literal(Map.of("IsHelloWorldExample", true)))
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("StepFunctions")
     * .actions(List.of(stepFunctionAction))
     * .build());
     * ```
     */
    public inline fun stepFunctionInvokeAction(
        block: StepFunctionInvokeActionDsl.() -> Unit = {}
    ): StepFunctionInvokeAction {
        val builder = StepFunctionInvokeActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of the `StepFunctionsInvokeAction StepFunction Invoke Action`.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * Pass startState = new Pass(this, "StartState");
     * StateMachine simpleStateMachine = StateMachine.Builder.create(this, "SimpleStateMachine")
     * .definition(startState)
     * .build();
     * StepFunctionInvokeAction stepFunctionAction = StepFunctionInvokeAction.Builder.create()
     * .actionName("Invoke")
     * .stateMachine(simpleStateMachine)
     * .stateMachineInput(StateMachineInput.literal(Map.of("IsHelloWorldExample", true)))
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("StepFunctions")
     * .actions(List.of(stepFunctionAction))
     * .build());
     * ```
     */
    public inline fun stepFunctionsInvokeActionProps(
        block: StepFunctionsInvokeActionPropsDsl.() -> Unit = {}
    ): StepFunctionsInvokeActionProps {
        val builder = StepFunctionsInvokeActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
