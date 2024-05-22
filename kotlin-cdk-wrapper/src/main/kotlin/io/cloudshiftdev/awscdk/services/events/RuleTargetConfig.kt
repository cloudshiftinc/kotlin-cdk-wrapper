@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for an event rule target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import software.constructs.*;
 * Construct construct;
 * Role role;
 * RuleTargetInput ruleTargetInput;
 * RuleTargetConfig ruleTargetConfig = RuleTargetConfig.builder()
 * .arn("arn")
 * // the properties below are optional
 * .appSyncParameters(AppSyncParametersProperty.builder()
 * .graphQlOperation("graphQlOperation")
 * .build())
 * .batchParameters(BatchParametersProperty.builder()
 * .jobDefinition("jobDefinition")
 * .jobName("jobName")
 * // the properties below are optional
 * .arrayProperties(BatchArrayPropertiesProperty.builder()
 * .size(123)
 * .build())
 * .retryStrategy(BatchRetryStrategyProperty.builder()
 * .attempts(123)
 * .build())
 * .build())
 * .deadLetterConfig(DeadLetterConfigProperty.builder()
 * .arn("arn")
 * .build())
 * .ecsParameters(EcsParametersProperty.builder()
 * .taskDefinitionArn("taskDefinitionArn")
 * // the properties below are optional
 * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
 * .capacityProvider("capacityProvider")
 * // the properties below are optional
 * .base(123)
 * .weight(123)
 * .build()))
 * .enableEcsManagedTags(false)
 * .enableExecuteCommand(false)
 * .group("group")
 * .launchType("launchType")
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
 * .subnets(List.of("subnets"))
 * // the properties below are optional
 * .assignPublicIp("assignPublicIp")
 * .securityGroups(List.of("securityGroups"))
 * .build())
 * .build())
 * .placementConstraints(List.of(PlacementConstraintProperty.builder()
 * .expression("expression")
 * .type("type")
 * .build()))
 * .placementStrategies(List.of(PlacementStrategyProperty.builder()
 * .field("field")
 * .type("type")
 * .build()))
 * .platformVersion("platformVersion")
 * .propagateTags("propagateTags")
 * .referenceId("referenceId")
 * .tagList(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .taskCount(123)
 * .build())
 * .httpParameters(HttpParametersProperty.builder()
 * .headerParameters(Map.of(
 * "headerParametersKey", "headerParameters"))
 * .pathParameterValues(List.of("pathParameterValues"))
 * .queryStringParameters(Map.of(
 * "queryStringParametersKey", "queryStringParameters"))
 * .build())
 * .input(ruleTargetInput)
 * .kinesisParameters(KinesisParametersProperty.builder()
 * .partitionKeyPath("partitionKeyPath")
 * .build())
 * .retryPolicy(RetryPolicyProperty.builder()
 * .maximumEventAgeInSeconds(123)
 * .maximumRetryAttempts(123)
 * .build())
 * .role(role)
 * .runCommandParameters(RunCommandParametersProperty.builder()
 * .runCommandTargets(List.of(RunCommandTargetProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .build())
 * .sqsParameters(SqsParametersProperty.builder()
 * .messageGroupId("messageGroupId")
 * .build())
 * .targetResource(construct)
 * .build();
 * ```
 */
public interface RuleTargetConfig {
  /**
   * Contains the GraphQL operation to be parsed and executed, if the event target is an AWS AppSync
   * API.
   *
   * Default: - None
   */
  public fun appSyncParameters(): CfnRule.AppSyncParametersProperty? =
      unwrap(this).getAppSyncParameters()?.let(CfnRule.AppSyncParametersProperty::wrap)

  /**
   * The Amazon Resource Name (ARN) of the target.
   */
  public fun arn(): String

  /**
   * Parameters used when the rule invokes Amazon AWS Batch Job/Queue.
   *
   * Default: no parameters set
   */
  public fun batchParameters(): CfnRule.BatchParametersProperty? =
      unwrap(this).getBatchParameters()?.let(CfnRule.BatchParametersProperty::wrap)

  /**
   * Contains information about a dead-letter queue configuration.
   *
   * Default: no dead-letter queue set
   */
  public fun deadLetterConfig(): CfnRule.DeadLetterConfigProperty? =
      unwrap(this).getDeadLetterConfig()?.let(CfnRule.DeadLetterConfigProperty::wrap)

  /**
   * The Amazon ECS task definition and task count to use, if the event target is an Amazon ECS
   * task.
   */
  public fun ecsParameters(): CfnRule.EcsParametersProperty? =
      unwrap(this).getEcsParameters()?.let(CfnRule.EcsParametersProperty::wrap)

  /**
   * Contains the HTTP parameters to use when the target is a API Gateway REST endpoint or
   * EventBridge API destination.
   *
   * Default: - None
   */
  public fun httpParameters(): CfnRule.HttpParametersProperty? =
      unwrap(this).getHttpParameters()?.let(CfnRule.HttpParametersProperty::wrap)

  /**
   * What input to send to the event target.
   *
   * Default: the entire event
   */
  public fun input(): RuleTargetInput? = unwrap(this).getInput()?.let(RuleTargetInput::wrap)

  /**
   * Settings that control shard assignment, when the target is a Kinesis stream.
   *
   * If you don't include this parameter, eventId is used as the
   * partition key.
   */
  public fun kinesisParameters(): CfnRule.KinesisParametersProperty? =
      unwrap(this).getKinesisParameters()?.let(CfnRule.KinesisParametersProperty::wrap)

  /**
   * A RetryPolicy object that includes information about the retry policy settings.
   *
   * Default: EventBridge default retry policy
   */
  public fun retryPolicy(): CfnRule.RetryPolicyProperty? =
      unwrap(this).getRetryPolicy()?.let(CfnRule.RetryPolicyProperty::wrap)

  /**
   * Role to use to invoke this event target.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * Parameters used when the rule invokes Amazon EC2 Systems Manager Run Command.
   */
  public fun runCommandParameters(): CfnRule.RunCommandParametersProperty? =
      unwrap(this).getRunCommandParameters()?.let(CfnRule.RunCommandParametersProperty::wrap)

  /**
   * Parameters used when the FIFO sqs queue is used an event target by the rule.
   */
  public fun sqsParameters(): CfnRule.SqsParametersProperty? =
      unwrap(this).getSqsParameters()?.let(CfnRule.SqsParametersProperty::wrap)

  /**
   * The resource that is backing this target.
   *
   * This is the resource that will actually have some action performed on it when used as a target
   * (for example, start a build for a CodeBuild project).
   * We need it to determine whether the rule belongs to a different account than the target -
   * if so, we generate a more complex setup,
   * including an additional stack containing the EventBusPolicy.
   *
   * Default: the target is not backed by any resource
   *
   * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html)
   */
  public fun targetResource(): IConstruct? = unwrap(this).getTargetResource()?.let(IConstruct::wrap)

  /**
   * A builder for [RuleTargetConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appSyncParameters Contains the GraphQL operation to be parsed and executed, if the
     * event target is an AWS AppSync API.
     */
    public fun appSyncParameters(appSyncParameters: CfnRule.AppSyncParametersProperty)

    /**
     * @param appSyncParameters Contains the GraphQL operation to be parsed and executed, if the
     * event target is an AWS AppSync API.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("405145ce8423ba08c08806c69aea275931cbafb9a97ae6a826c4a3a0a93e7d70")
    public
        fun appSyncParameters(appSyncParameters: CfnRule.AppSyncParametersProperty.Builder.() -> Unit)

    /**
     * @param arn The Amazon Resource Name (ARN) of the target. 
     */
    public fun arn(arn: String)

    /**
     * @param batchParameters Parameters used when the rule invokes Amazon AWS Batch Job/Queue.
     */
    public fun batchParameters(batchParameters: CfnRule.BatchParametersProperty)

    /**
     * @param batchParameters Parameters used when the rule invokes Amazon AWS Batch Job/Queue.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f63ec4b492a7ecc4ffc75ff86a19ed85df2f7928dff75bfb7e04d982245b1b6d")
    public fun batchParameters(batchParameters: CfnRule.BatchParametersProperty.Builder.() -> Unit)

    /**
     * @param deadLetterConfig Contains information about a dead-letter queue configuration.
     */
    public fun deadLetterConfig(deadLetterConfig: CfnRule.DeadLetterConfigProperty)

    /**
     * @param deadLetterConfig Contains information about a dead-letter queue configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e85270536d14505fffe54178fc689971246bb6af00e0bf77a81426c326ea2f53")
    public
        fun deadLetterConfig(deadLetterConfig: CfnRule.DeadLetterConfigProperty.Builder.() -> Unit)

    /**
     * @param ecsParameters The Amazon ECS task definition and task count to use, if the event
     * target is an Amazon ECS task.
     */
    public fun ecsParameters(ecsParameters: CfnRule.EcsParametersProperty)

    /**
     * @param ecsParameters The Amazon ECS task definition and task count to use, if the event
     * target is an Amazon ECS task.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e382588b69af319bc8e83624e4b365cd953acb2ecdcab7643a26876e2a9505a8")
    public fun ecsParameters(ecsParameters: CfnRule.EcsParametersProperty.Builder.() -> Unit)

    /**
     * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
     * REST endpoint or EventBridge API destination.
     */
    public fun httpParameters(httpParameters: CfnRule.HttpParametersProperty)

    /**
     * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
     * REST endpoint or EventBridge API destination.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ab52d3b2b121f8e9656cbc4a686a0ed0fe3de9a6fc1f225654bdba6e4b28a5b")
    public fun httpParameters(httpParameters: CfnRule.HttpParametersProperty.Builder.() -> Unit)

    /**
     * @param input What input to send to the event target.
     */
    public fun input(input: RuleTargetInput)

    /**
     * @param kinesisParameters Settings that control shard assignment, when the target is a Kinesis
     * stream.
     * If you don't include this parameter, eventId is used as the
     * partition key.
     */
    public fun kinesisParameters(kinesisParameters: CfnRule.KinesisParametersProperty)

    /**
     * @param kinesisParameters Settings that control shard assignment, when the target is a Kinesis
     * stream.
     * If you don't include this parameter, eventId is used as the
     * partition key.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d24b7ccb7ef0d1fda33628839d220084ce7edb8bc579e0255a35223090460ca")
    public
        fun kinesisParameters(kinesisParameters: CfnRule.KinesisParametersProperty.Builder.() -> Unit)

    /**
     * @param retryPolicy A RetryPolicy object that includes information about the retry policy
     * settings.
     */
    public fun retryPolicy(retryPolicy: CfnRule.RetryPolicyProperty)

    /**
     * @param retryPolicy A RetryPolicy object that includes information about the retry policy
     * settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea96da985dcfdae3bbd951b9d559960c1d091aebcbdd7f43f257e4d8561e7fc1")
    public fun retryPolicy(retryPolicy: CfnRule.RetryPolicyProperty.Builder.() -> Unit)

    /**
     * @param role Role to use to invoke this event target.
     */
    public fun role(role: IRole)

    /**
     * @param runCommandParameters Parameters used when the rule invokes Amazon EC2 Systems Manager
     * Run Command.
     */
    public fun runCommandParameters(runCommandParameters: CfnRule.RunCommandParametersProperty)

    /**
     * @param runCommandParameters Parameters used when the rule invokes Amazon EC2 Systems Manager
     * Run Command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd68e36e648c69e036435592fe1bbacfdcdb423fec12e5f023408f1dcead1261")
    public
        fun runCommandParameters(runCommandParameters: CfnRule.RunCommandParametersProperty.Builder.() -> Unit)

    /**
     * @param sqsParameters Parameters used when the FIFO sqs queue is used an event target by the
     * rule.
     */
    public fun sqsParameters(sqsParameters: CfnRule.SqsParametersProperty)

    /**
     * @param sqsParameters Parameters used when the FIFO sqs queue is used an event target by the
     * rule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5fd422ee2361c2f24a7267a88879f53fe0943b76d7e4c15360aff71c078ae02")
    public fun sqsParameters(sqsParameters: CfnRule.SqsParametersProperty.Builder.() -> Unit)

    /**
     * @param targetResource The resource that is backing this target.
     * This is the resource that will actually have some action performed on it when used as a
     * target
     * (for example, start a build for a CodeBuild project).
     * We need it to determine whether the rule belongs to a different account than the target -
     * if so, we generate a more complex setup,
     * including an additional stack containing the EventBusPolicy.
     */
    public fun targetResource(targetResource: IConstruct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.RuleTargetConfig.Builder =
        software.amazon.awscdk.services.events.RuleTargetConfig.builder()

    /**
     * @param appSyncParameters Contains the GraphQL operation to be parsed and executed, if the
     * event target is an AWS AppSync API.
     */
    override fun appSyncParameters(appSyncParameters: CfnRule.AppSyncParametersProperty) {
      cdkBuilder.appSyncParameters(appSyncParameters.let(CfnRule.AppSyncParametersProperty.Companion::unwrap))
    }

    /**
     * @param appSyncParameters Contains the GraphQL operation to be parsed and executed, if the
     * event target is an AWS AppSync API.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("405145ce8423ba08c08806c69aea275931cbafb9a97ae6a826c4a3a0a93e7d70")
    override
        fun appSyncParameters(appSyncParameters: CfnRule.AppSyncParametersProperty.Builder.() -> Unit):
        Unit = appSyncParameters(CfnRule.AppSyncParametersProperty(appSyncParameters))

    /**
     * @param arn The Amazon Resource Name (ARN) of the target. 
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * @param batchParameters Parameters used when the rule invokes Amazon AWS Batch Job/Queue.
     */
    override fun batchParameters(batchParameters: CfnRule.BatchParametersProperty) {
      cdkBuilder.batchParameters(batchParameters.let(CfnRule.BatchParametersProperty.Companion::unwrap))
    }

    /**
     * @param batchParameters Parameters used when the rule invokes Amazon AWS Batch Job/Queue.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f63ec4b492a7ecc4ffc75ff86a19ed85df2f7928dff75bfb7e04d982245b1b6d")
    override
        fun batchParameters(batchParameters: CfnRule.BatchParametersProperty.Builder.() -> Unit):
        Unit = batchParameters(CfnRule.BatchParametersProperty(batchParameters))

    /**
     * @param deadLetterConfig Contains information about a dead-letter queue configuration.
     */
    override fun deadLetterConfig(deadLetterConfig: CfnRule.DeadLetterConfigProperty) {
      cdkBuilder.deadLetterConfig(deadLetterConfig.let(CfnRule.DeadLetterConfigProperty.Companion::unwrap))
    }

    /**
     * @param deadLetterConfig Contains information about a dead-letter queue configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e85270536d14505fffe54178fc689971246bb6af00e0bf77a81426c326ea2f53")
    override
        fun deadLetterConfig(deadLetterConfig: CfnRule.DeadLetterConfigProperty.Builder.() -> Unit):
        Unit = deadLetterConfig(CfnRule.DeadLetterConfigProperty(deadLetterConfig))

    /**
     * @param ecsParameters The Amazon ECS task definition and task count to use, if the event
     * target is an Amazon ECS task.
     */
    override fun ecsParameters(ecsParameters: CfnRule.EcsParametersProperty) {
      cdkBuilder.ecsParameters(ecsParameters.let(CfnRule.EcsParametersProperty.Companion::unwrap))
    }

    /**
     * @param ecsParameters The Amazon ECS task definition and task count to use, if the event
     * target is an Amazon ECS task.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e382588b69af319bc8e83624e4b365cd953acb2ecdcab7643a26876e2a9505a8")
    override fun ecsParameters(ecsParameters: CfnRule.EcsParametersProperty.Builder.() -> Unit):
        Unit = ecsParameters(CfnRule.EcsParametersProperty(ecsParameters))

    /**
     * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
     * REST endpoint or EventBridge API destination.
     */
    override fun httpParameters(httpParameters: CfnRule.HttpParametersProperty) {
      cdkBuilder.httpParameters(httpParameters.let(CfnRule.HttpParametersProperty.Companion::unwrap))
    }

    /**
     * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
     * REST endpoint or EventBridge API destination.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ab52d3b2b121f8e9656cbc4a686a0ed0fe3de9a6fc1f225654bdba6e4b28a5b")
    override fun httpParameters(httpParameters: CfnRule.HttpParametersProperty.Builder.() -> Unit):
        Unit = httpParameters(CfnRule.HttpParametersProperty(httpParameters))

    /**
     * @param input What input to send to the event target.
     */
    override fun input(input: RuleTargetInput) {
      cdkBuilder.input(input.let(RuleTargetInput.Companion::unwrap))
    }

    /**
     * @param kinesisParameters Settings that control shard assignment, when the target is a Kinesis
     * stream.
     * If you don't include this parameter, eventId is used as the
     * partition key.
     */
    override fun kinesisParameters(kinesisParameters: CfnRule.KinesisParametersProperty) {
      cdkBuilder.kinesisParameters(kinesisParameters.let(CfnRule.KinesisParametersProperty.Companion::unwrap))
    }

    /**
     * @param kinesisParameters Settings that control shard assignment, when the target is a Kinesis
     * stream.
     * If you don't include this parameter, eventId is used as the
     * partition key.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d24b7ccb7ef0d1fda33628839d220084ce7edb8bc579e0255a35223090460ca")
    override
        fun kinesisParameters(kinesisParameters: CfnRule.KinesisParametersProperty.Builder.() -> Unit):
        Unit = kinesisParameters(CfnRule.KinesisParametersProperty(kinesisParameters))

    /**
     * @param retryPolicy A RetryPolicy object that includes information about the retry policy
     * settings.
     */
    override fun retryPolicy(retryPolicy: CfnRule.RetryPolicyProperty) {
      cdkBuilder.retryPolicy(retryPolicy.let(CfnRule.RetryPolicyProperty.Companion::unwrap))
    }

    /**
     * @param retryPolicy A RetryPolicy object that includes information about the retry policy
     * settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea96da985dcfdae3bbd951b9d559960c1d091aebcbdd7f43f257e4d8561e7fc1")
    override fun retryPolicy(retryPolicy: CfnRule.RetryPolicyProperty.Builder.() -> Unit): Unit =
        retryPolicy(CfnRule.RetryPolicyProperty(retryPolicy))

    /**
     * @param role Role to use to invoke this event target.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param runCommandParameters Parameters used when the rule invokes Amazon EC2 Systems Manager
     * Run Command.
     */
    override fun runCommandParameters(runCommandParameters: CfnRule.RunCommandParametersProperty) {
      cdkBuilder.runCommandParameters(runCommandParameters.let(CfnRule.RunCommandParametersProperty.Companion::unwrap))
    }

    /**
     * @param runCommandParameters Parameters used when the rule invokes Amazon EC2 Systems Manager
     * Run Command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd68e36e648c69e036435592fe1bbacfdcdb423fec12e5f023408f1dcead1261")
    override
        fun runCommandParameters(runCommandParameters: CfnRule.RunCommandParametersProperty.Builder.() -> Unit):
        Unit = runCommandParameters(CfnRule.RunCommandParametersProperty(runCommandParameters))

    /**
     * @param sqsParameters Parameters used when the FIFO sqs queue is used an event target by the
     * rule.
     */
    override fun sqsParameters(sqsParameters: CfnRule.SqsParametersProperty) {
      cdkBuilder.sqsParameters(sqsParameters.let(CfnRule.SqsParametersProperty.Companion::unwrap))
    }

    /**
     * @param sqsParameters Parameters used when the FIFO sqs queue is used an event target by the
     * rule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5fd422ee2361c2f24a7267a88879f53fe0943b76d7e4c15360aff71c078ae02")
    override fun sqsParameters(sqsParameters: CfnRule.SqsParametersProperty.Builder.() -> Unit):
        Unit = sqsParameters(CfnRule.SqsParametersProperty(sqsParameters))

    /**
     * @param targetResource The resource that is backing this target.
     * This is the resource that will actually have some action performed on it when used as a
     * target
     * (for example, start a build for a CodeBuild project).
     * We need it to determine whether the rule belongs to a different account than the target -
     * if so, we generate a more complex setup,
     * including an additional stack containing the EventBusPolicy.
     */
    override fun targetResource(targetResource: IConstruct) {
      cdkBuilder.targetResource(targetResource.let(IConstruct.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.RuleTargetConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.RuleTargetConfig,
  ) : CdkObject(cdkObject), RuleTargetConfig {
    /**
     * Contains the GraphQL operation to be parsed and executed, if the event target is an AWS
     * AppSync API.
     *
     * Default: - None
     */
    override fun appSyncParameters(): CfnRule.AppSyncParametersProperty? =
        unwrap(this).getAppSyncParameters()?.let(CfnRule.AppSyncParametersProperty::wrap)

    /**
     * The Amazon Resource Name (ARN) of the target.
     */
    override fun arn(): String = unwrap(this).getArn()

    /**
     * Parameters used when the rule invokes Amazon AWS Batch Job/Queue.
     *
     * Default: no parameters set
     */
    override fun batchParameters(): CfnRule.BatchParametersProperty? =
        unwrap(this).getBatchParameters()?.let(CfnRule.BatchParametersProperty::wrap)

    /**
     * Contains information about a dead-letter queue configuration.
     *
     * Default: no dead-letter queue set
     */
    override fun deadLetterConfig(): CfnRule.DeadLetterConfigProperty? =
        unwrap(this).getDeadLetterConfig()?.let(CfnRule.DeadLetterConfigProperty::wrap)

    /**
     * The Amazon ECS task definition and task count to use, if the event target is an Amazon ECS
     * task.
     */
    override fun ecsParameters(): CfnRule.EcsParametersProperty? =
        unwrap(this).getEcsParameters()?.let(CfnRule.EcsParametersProperty::wrap)

    /**
     * Contains the HTTP parameters to use when the target is a API Gateway REST endpoint or
     * EventBridge API destination.
     *
     * Default: - None
     */
    override fun httpParameters(): CfnRule.HttpParametersProperty? =
        unwrap(this).getHttpParameters()?.let(CfnRule.HttpParametersProperty::wrap)

    /**
     * What input to send to the event target.
     *
     * Default: the entire event
     */
    override fun input(): RuleTargetInput? = unwrap(this).getInput()?.let(RuleTargetInput::wrap)

    /**
     * Settings that control shard assignment, when the target is a Kinesis stream.
     *
     * If you don't include this parameter, eventId is used as the
     * partition key.
     */
    override fun kinesisParameters(): CfnRule.KinesisParametersProperty? =
        unwrap(this).getKinesisParameters()?.let(CfnRule.KinesisParametersProperty::wrap)

    /**
     * A RetryPolicy object that includes information about the retry policy settings.
     *
     * Default: EventBridge default retry policy
     */
    override fun retryPolicy(): CfnRule.RetryPolicyProperty? =
        unwrap(this).getRetryPolicy()?.let(CfnRule.RetryPolicyProperty::wrap)

    /**
     * Role to use to invoke this event target.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Parameters used when the rule invokes Amazon EC2 Systems Manager Run Command.
     */
    override fun runCommandParameters(): CfnRule.RunCommandParametersProperty? =
        unwrap(this).getRunCommandParameters()?.let(CfnRule.RunCommandParametersProperty::wrap)

    /**
     * Parameters used when the FIFO sqs queue is used an event target by the rule.
     */
    override fun sqsParameters(): CfnRule.SqsParametersProperty? =
        unwrap(this).getSqsParameters()?.let(CfnRule.SqsParametersProperty::wrap)

    /**
     * The resource that is backing this target.
     *
     * This is the resource that will actually have some action performed on it when used as a
     * target
     * (for example, start a build for a CodeBuild project).
     * We need it to determine whether the rule belongs to a different account than the target -
     * if so, we generate a more complex setup,
     * including an additional stack containing the EventBusPolicy.
     *
     * Default: the target is not backed by any resource
     *
     * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html)
     */
    override fun targetResource(): IConstruct? =
        unwrap(this).getTargetResource()?.let(IConstruct::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RuleTargetConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.RuleTargetConfig):
        RuleTargetConfig = CdkObjectWrappers.wrap(cdkObject) as? RuleTargetConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuleTargetConfig):
        software.amazon.awscdk.services.events.RuleTargetConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.events.RuleTargetConfig
  }
}
