@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codecommit

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.CfnRepository
import software.amazon.awscdk.services.codecommit.CfnRepositoryProps
import software.amazon.awscdk.services.codecommit.CodeConfig
import software.amazon.awscdk.services.codecommit.OnCommitOptions
import software.amazon.awscdk.services.codecommit.Repository
import software.amazon.awscdk.services.codecommit.RepositoryNotifyOnOptions
import software.amazon.awscdk.services.codecommit.RepositoryProps
import software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions
import software.constructs.Construct

public object codecommit {
  /**
   * Creates a new, empty repository.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codecommit.*;
   * CfnRepository cfnRepository = CfnRepository.Builder.create(this, "MyCfnRepository")
   * .repositoryName("repositoryName")
   * // the properties below are optional
   * .code(CodeProperty.builder()
   * .s3(S3Property.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * // the properties below are optional
   * .branchName("branchName")
   * .build())
   * .repositoryDescription("repositoryDescription")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .triggers(List.of(RepositoryTriggerProperty.builder()
   * .destinationArn("destinationArn")
   * .events(List.of("events"))
   * .name("name")
   * // the properties below are optional
   * .branches(List.of("branches"))
   * .customData("customData")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html)
   */
  public inline fun cfnRepository(
    scope: Construct,
    id: String,
    block: CfnRepositoryDsl.() -> Unit = {},
  ): CfnRepository {
    val builder = CfnRepositoryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about code to be committed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codecommit.*;
   * CodeProperty codeProperty = CodeProperty.builder()
   * .s3(S3Property.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * // the properties below are optional
   * .branchName("branchName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-code.html)
   */
  public inline fun cfnRepositoryCodeProperty(block: CfnRepositoryCodePropertyDsl.() -> Unit = {}):
      CfnRepository.CodeProperty {
    val builder = CfnRepositoryCodePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnRepository`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codecommit.*;
   * CfnRepositoryProps cfnRepositoryProps = CfnRepositoryProps.builder()
   * .repositoryName("repositoryName")
   * // the properties below are optional
   * .code(CodeProperty.builder()
   * .s3(S3Property.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * // the properties below are optional
   * .branchName("branchName")
   * .build())
   * .repositoryDescription("repositoryDescription")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .triggers(List.of(RepositoryTriggerProperty.builder()
   * .destinationArn("destinationArn")
   * .events(List.of("events"))
   * .name("name")
   * // the properties below are optional
   * .branches(List.of("branches"))
   * .customData("customData")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html)
   */
  public inline fun cfnRepositoryProps(block: CfnRepositoryPropsDsl.() -> Unit = {}):
      CfnRepositoryProps {
    val builder = CfnRepositoryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about a trigger for a repository.
   *
   *
   * If you want to receive notifications about repository events, consider using notifications
   * instead of triggers. For more information, see [Configuring notifications for repository
   * events](https://docs.aws.amazon.com/codecommit/latest/userguide/how-to-repository-email.html) .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codecommit.*;
   * RepositoryTriggerProperty repositoryTriggerProperty = RepositoryTriggerProperty.builder()
   * .destinationArn("destinationArn")
   * .events(List.of("events"))
   * .name("name")
   * // the properties below are optional
   * .branches(List.of("branches"))
   * .customData("customData")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html)
   */
  public inline
      fun cfnRepositoryRepositoryTriggerProperty(block: CfnRepositoryRepositoryTriggerPropertyDsl.() -> Unit
      = {}): CfnRepository.RepositoryTriggerProperty {
    val builder = CfnRepositoryRepositoryTriggerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the Amazon S3 bucket that contains the code that will be committed to the new
   * repository.
   *
   * Changes to this property are ignored after initial resource creation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codecommit.*;
   * S3Property s3Property = S3Property.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-s3.html)
   */
  public inline fun cfnRepositoryS3Property(block: CfnRepositoryS3PropertyDsl.() -> Unit = {}):
      CfnRepository.S3Property {
    val builder = CfnRepositoryS3PropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the structure to pass into the underlying CfnRepository class.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codecommit.*;
   * CodeConfig codeConfig = CodeConfig.builder()
   * .code(CodeProperty.builder()
   * .s3(S3Property.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * // the properties below are optional
   * .branchName("branchName")
   * .build())
   * .build();
   * ```
   */
  public inline fun codeConfig(block: CodeConfigDsl.() -> Unit = {}): CodeConfig {
    val builder = CodeConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for the onCommit() method.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.codecommit.*;
   * import software.amazon.awscdk.services.events.targets.*;
   * Repository repo;
   * Topic myTopic = new Topic(this, "Topic");
   * repo.onCommit("OnCommit", OnCommitOptions.builder()
   * .target(new SnsTopic(myTopic))
   * .build());
   * ```
   */
  public inline fun onCommitOptions(block: OnCommitOptionsDsl.() -> Unit = {}): OnCommitOptions {
    val builder = OnCommitOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Provides a CodeCommit Repository.
   *
   * Example:
   *
   * ```
   * PipelineProject project;
   * Repository repository = Repository.Builder.create(this, "MyRepository")
   * .repositoryName("MyRepository")
   * .build();
   * PipelineProject project = new PipelineProject(this, "MyProject");
   * Artifact sourceOutput = new Artifact();
   * CodeCommitSourceAction sourceAction = CodeCommitSourceAction.Builder.create()
   * .actionName("CodeCommit")
   * .repository(repository)
   * .output(sourceOutput)
   * .build();
   * CodeBuildAction buildAction = CodeBuildAction.Builder.create()
   * .actionName("CodeBuild")
   * .project(project)
   * .input(sourceOutput)
   * .outputs(List.of(new Artifact())) // optional
   * .executeBatchBuild(true) // optional, defaults to false
   * .combineBatchBuildArtifacts(true)
   * .build();
   * Pipeline.Builder.create(this, "MyPipeline")
   * .stages(List.of(StageProps.builder()
   * .stageName("Source")
   * .actions(List.of(sourceAction))
   * .build(), StageProps.builder()
   * .stageName("Build")
   * .actions(List.of(buildAction))
   * .build()))
   * .build();
   * ```
   */
  public inline fun repository(
    scope: Construct,
    id: String,
    block: RepositoryDsl.() -> Unit = {},
  ): Repository {
    val builder = RepositoryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Additional options to pass to the notification rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codecommit.*;
   * import software.amazon.awscdk.services.codestarnotifications.*;
   * RepositoryNotifyOnOptions repositoryNotifyOnOptions = RepositoryNotifyOnOptions.builder()
   * .events(List.of(RepositoryNotificationEvents.COMMIT_COMMENT))
   * // the properties below are optional
   * .detailType(DetailType.BASIC)
   * .enabled(false)
   * .notificationRuleName("notificationRuleName")
   * .build();
   * ```
   */
  public inline fun repositoryNotifyOnOptions(block: RepositoryNotifyOnOptionsDsl.() -> Unit = {}):
      RepositoryNotifyOnOptions {
    val builder = RepositoryNotifyOnOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
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
   * .stages(List.of(sourceStage, prodStage))
   * .build();
   * ```
   */
  public inline fun repositoryProps(block: RepositoryPropsDsl.() -> Unit = {}): RepositoryProps {
    val builder = RepositoryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates for a repository trigger to an SNS topic or Lambda function.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codecommit.*;
   * RepositoryTriggerOptions repositoryTriggerOptions = RepositoryTriggerOptions.builder()
   * .branches(List.of("branches"))
   * .customData("customData")
   * .events(List.of(RepositoryEventTrigger.ALL))
   * .name("name")
   * .build();
   * ```
   */
  public inline fun repositoryTriggerOptions(block: RepositoryTriggerOptionsDsl.() -> Unit = {}):
      RepositoryTriggerOptions {
    val builder = RepositoryTriggerOptionsDsl()
    builder.apply(block)
    return builder.build()
  }
}
