@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Step Functions Task to to modify an InstanceGroup on an EMR Cluster.
 *
 * Example:
 *
 * ```
 * EmrModifyInstanceGroupByName.Builder.create(this, "Task")
 * .clusterId("ClusterId")
 * .instanceGroupName(JsonPath.stringAt("$.InstanceGroupName"))
 * .instanceGroup(InstanceGroupModifyConfigProperty.builder()
 * .instanceCount(1)
 * .build())
 * .build();
 * ```
 */
public open class EmrModifyInstanceGroupByName(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName,
) : TaskStateBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EmrModifyInstanceGroupByNameProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(EmrModifyInstanceGroupByNameProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EmrModifyInstanceGroupByNameProps.Builder.() -> Unit,
  ) : this(scope, id, EmrModifyInstanceGroupByNameProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     * @param assign Workflow variables to store in this step. 
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * The ClusterId to update.
     *
     * @param clusterId The ClusterId to update. 
     */
    public fun clusterId(clusterId: String)

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
     */
    public fun comment(comment: String)

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    public fun credentials(credentials: Credentials)

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfbee46ace2525224ff6b87b3375e67519b270da22f21efdc9dd942cd5da366b")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     * @param heartbeat Timeout for the heartbeat. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param heartbeatTimeout Timeout for the heartbeat. 
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    public fun inputPath(inputPath: String)

    /**
     * The JSON that you want to provide to your ModifyInstanceGroup call as input.
     *
     * This uses the same syntax as the ModifyInstanceGroups API.
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ModifyInstanceGroups.html)
     * @param instanceGroup The JSON that you want to provide to your ModifyInstanceGroup call as
     * input. 
     */
    public fun instanceGroup(instanceGroup: InstanceGroupModifyConfigProperty)

    /**
     * The JSON that you want to provide to your ModifyInstanceGroup call as input.
     *
     * This uses the same syntax as the ModifyInstanceGroups API.
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ModifyInstanceGroups.html)
     * @param instanceGroup The JSON that you want to provide to your ModifyInstanceGroup call as
     * input. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fceae4fc76c5e4ed9b22504e0ba1b604ff9cb480409b45cf2ab8a161d5853bc")
    public fun instanceGroup(instanceGroup: InstanceGroupModifyConfigProperty.Builder.() -> Unit)

    /**
     * The InstanceGroupName to update.
     *
     * @param instanceGroupName The InstanceGroupName to update. 
     */
    public fun instanceGroupName(instanceGroupName: String)

    /**
     * AWS Step Functions integrates with services directly in the Amazon States Language.
     *
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     *
     * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
     * `IntegrationPattern.RUN_JOB` for the following exceptions:
     * `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
     * `EmrContainersStartJobRun`.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-supported-services.html)
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language. 
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern)

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    public fun outputPath(outputPath: String)

    /**
     * Used to specify and transform output from the state.
     *
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     *
     * Default: - $states.result or $states.errorOutput
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-input-output-filtering.html)
     * @param outputs Used to specify and transform output from the state. 
     */
    public fun outputs(outputs: Any)

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     *
     * @param queryLanguage The name of the query language used by the state. 
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    public fun resultPath(resultPath: String)

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    public fun resultSelector(resultSelector: Map<String, Any>)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param taskTimeout Timeout for the task. 
     */
    public fun taskTimeout(taskTimeout: Timeout)

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     * @param timeout Timeout for the task. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.Builder.create(scope,
        id)

    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     * @param assign Workflow variables to store in this step. 
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * The ClusterId to update.
     *
     * @param clusterId The ClusterId to update. 
     */
    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials.Companion::unwrap))
    }

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfbee46ace2525224ff6b87b3375e67519b270da22f21efdc9dd942cd5da366b")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     * @param heartbeat Timeout for the heartbeat. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration.Companion::unwrap))
    }

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param heartbeatTimeout Timeout for the heartbeat. 
     */
    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    /**
     * The JSON that you want to provide to your ModifyInstanceGroup call as input.
     *
     * This uses the same syntax as the ModifyInstanceGroups API.
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ModifyInstanceGroups.html)
     * @param instanceGroup The JSON that you want to provide to your ModifyInstanceGroup call as
     * input. 
     */
    override fun instanceGroup(instanceGroup: InstanceGroupModifyConfigProperty) {
      cdkBuilder.instanceGroup(instanceGroup.let(InstanceGroupModifyConfigProperty.Companion::unwrap))
    }

    /**
     * The JSON that you want to provide to your ModifyInstanceGroup call as input.
     *
     * This uses the same syntax as the ModifyInstanceGroups API.
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ModifyInstanceGroups.html)
     * @param instanceGroup The JSON that you want to provide to your ModifyInstanceGroup call as
     * input. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fceae4fc76c5e4ed9b22504e0ba1b604ff9cb480409b45cf2ab8a161d5853bc")
    override fun instanceGroup(instanceGroup: InstanceGroupModifyConfigProperty.Builder.() -> Unit):
        Unit = instanceGroup(InstanceGroupModifyConfigProperty(instanceGroup))

    /**
     * The InstanceGroupName to update.
     *
     * @param instanceGroupName The InstanceGroupName to update. 
     */
    override fun instanceGroupName(instanceGroupName: String) {
      cdkBuilder.instanceGroupName(instanceGroupName)
    }

    /**
     * AWS Step Functions integrates with services directly in the Amazon States Language.
     *
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     *
     * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
     * `IntegrationPattern.RUN_JOB` for the following exceptions:
     * `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
     * `EmrContainersStartJobRun`.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-supported-services.html)
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language. 
     */
    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern.Companion::unwrap))
    }

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * Used to specify and transform output from the state.
     *
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     *
     * Default: - $states.result or $states.errorOutput
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-input-output-filtering.html)
     * @param outputs Used to specify and transform output from the state. 
     */
    override fun outputs(outputs: Any) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     *
     * @param queryLanguage The name of the query language used by the state. 
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param taskTimeout Timeout for the task. 
     */
    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     * @param timeout Timeout for the task. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName =
        cdkBuilder.build()
  }

  public companion object {
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: EmrModifyInstanceGroupByNameJsonPathProps,
    ): EmrModifyInstanceGroupByName =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        props.let(EmrModifyInstanceGroupByNameJsonPathProps.Companion::unwrap)).let(EmrModifyInstanceGroupByName::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb78544290f7ad2958345b40707d6d05b5fc4e537fcd28c74dc80a17f969a106")
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: EmrModifyInstanceGroupByNameJsonPathProps.Builder.() -> Unit,
    ): EmrModifyInstanceGroupByName = jsonPath(scope, id,
        EmrModifyInstanceGroupByNameJsonPathProps(props))

    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: EmrModifyInstanceGroupByNameJsonataProps,
    ): EmrModifyInstanceGroupByName =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        props.let(EmrModifyInstanceGroupByNameJsonataProps.Companion::unwrap)).let(EmrModifyInstanceGroupByName::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7756ac50a9589a9d300724014d8a68d9705e7e77e12ac6fc4e0171eb5efcdc4a")
    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: EmrModifyInstanceGroupByNameJsonataProps.Builder.() -> Unit,
    ): EmrModifyInstanceGroupByName = jsonata(scope, id,
        EmrModifyInstanceGroupByNameJsonataProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EmrModifyInstanceGroupByName {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EmrModifyInstanceGroupByName(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName):
        EmrModifyInstanceGroupByName = EmrModifyInstanceGroupByName(cdkObject)

    internal fun unwrap(wrapped: EmrModifyInstanceGroupByName):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName =
        wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName
  }

  /**
   * Modify the size or configurations of an instance group.
   *
   * Example:
   *
   * ```
   * EmrModifyInstanceGroupByName.Builder.create(this, "Task")
   * .clusterId("ClusterId")
   * .instanceGroupName(JsonPath.stringAt("$.InstanceGroupName"))
   * .instanceGroup(InstanceGroupModifyConfigProperty.builder()
   * .instanceCount(1)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceGroupModifyConfig.html)
   */
  public interface InstanceGroupModifyConfigProperty {
    /**
     * A list of new or modified configurations to apply for an instance group.
     *
     * Default: - None
     */
    public fun configurations(): List<EmrCreateCluster.ConfigurationProperty> =
        unwrap(this).getConfigurations()?.map(EmrCreateCluster.ConfigurationProperty::wrap) ?:
        emptyList()

    /**
     * The EC2 InstanceIds to terminate.
     *
     * After you terminate the instances, the instance group will not return to its original
     * requested size.
     *
     * Default: - None
     */
    public fun eC2InstanceIdsToTerminate(): List<String> =
        unwrap(this).getEC2InstanceIdsToTerminate() ?: emptyList()

    /**
     * Target size for the instance group.
     *
     * Default: - None
     */
    public fun instanceCount(): Number? = unwrap(this).getInstanceCount()

    /**
     * Policy for customizing shrink operations.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ShrinkPolicy.html)
     */
    public fun shrinkPolicy(): ShrinkPolicyProperty? =
        unwrap(this).getShrinkPolicy()?.let(ShrinkPolicyProperty::wrap)

    /**
     * A builder for [InstanceGroupModifyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configurations A list of new or modified configurations to apply for an instance
       * group.
       */
      public fun configurations(configurations: List<EmrCreateCluster.ConfigurationProperty>)

      /**
       * @param configurations A list of new or modified configurations to apply for an instance
       * group.
       */
      public fun configurations(vararg configurations: EmrCreateCluster.ConfigurationProperty)

      /**
       * @param eC2InstanceIdsToTerminate The EC2 InstanceIds to terminate.
       * After you terminate the instances, the instance group will not return to its original
       * requested size.
       */
      public fun eC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate: List<String>)

      /**
       * @param eC2InstanceIdsToTerminate The EC2 InstanceIds to terminate.
       * After you terminate the instances, the instance group will not return to its original
       * requested size.
       */
      public fun eC2InstanceIdsToTerminate(vararg eC2InstanceIdsToTerminate: String)

      /**
       * @param instanceCount Target size for the instance group.
       */
      public fun instanceCount(instanceCount: Number)

      /**
       * @param shrinkPolicy Policy for customizing shrink operations.
       */
      public fun shrinkPolicy(shrinkPolicy: ShrinkPolicyProperty)

      /**
       * @param shrinkPolicy Policy for customizing shrink operations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("780915b8831837b2846bf69d48cc0a5e6f8bfaa375d231e50add83eedad1c123")
      public fun shrinkPolicy(shrinkPolicy: ShrinkPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty.builder()

      /**
       * @param configurations A list of new or modified configurations to apply for an instance
       * group.
       */
      override fun configurations(configurations: List<EmrCreateCluster.ConfigurationProperty>) {
        cdkBuilder.configurations(configurations.map(EmrCreateCluster.ConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param configurations A list of new or modified configurations to apply for an instance
       * group.
       */
      override fun configurations(vararg configurations: EmrCreateCluster.ConfigurationProperty):
          Unit = configurations(configurations.toList())

      /**
       * @param eC2InstanceIdsToTerminate The EC2 InstanceIds to terminate.
       * After you terminate the instances, the instance group will not return to its original
       * requested size.
       */
      override fun eC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate: List<String>) {
        cdkBuilder.eC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate)
      }

      /**
       * @param eC2InstanceIdsToTerminate The EC2 InstanceIds to terminate.
       * After you terminate the instances, the instance group will not return to its original
       * requested size.
       */
      override fun eC2InstanceIdsToTerminate(vararg eC2InstanceIdsToTerminate: String): Unit =
          eC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate.toList())

      /**
       * @param instanceCount Target size for the instance group.
       */
      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      /**
       * @param shrinkPolicy Policy for customizing shrink operations.
       */
      override fun shrinkPolicy(shrinkPolicy: ShrinkPolicyProperty) {
        cdkBuilder.shrinkPolicy(shrinkPolicy.let(ShrinkPolicyProperty.Companion::unwrap))
      }

      /**
       * @param shrinkPolicy Policy for customizing shrink operations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("780915b8831837b2846bf69d48cc0a5e6f8bfaa375d231e50add83eedad1c123")
      override fun shrinkPolicy(shrinkPolicy: ShrinkPolicyProperty.Builder.() -> Unit): Unit =
          shrinkPolicy(ShrinkPolicyProperty(shrinkPolicy))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty,
    ) : CdkObject(cdkObject),
        InstanceGroupModifyConfigProperty {
      /**
       * A list of new or modified configurations to apply for an instance group.
       *
       * Default: - None
       */
      override fun configurations(): List<EmrCreateCluster.ConfigurationProperty> =
          unwrap(this).getConfigurations()?.map(EmrCreateCluster.ConfigurationProperty::wrap) ?:
          emptyList()

      /**
       * The EC2 InstanceIds to terminate.
       *
       * After you terminate the instances, the instance group will not return to its original
       * requested size.
       *
       * Default: - None
       */
      override fun eC2InstanceIdsToTerminate(): List<String> =
          unwrap(this).getEC2InstanceIdsToTerminate() ?: emptyList()

      /**
       * Target size for the instance group.
       *
       * Default: - None
       */
      override fun instanceCount(): Number? = unwrap(this).getInstanceCount()

      /**
       * Policy for customizing shrink operations.
       *
       * Default: - None
       *
       * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ShrinkPolicy.html)
       */
      override fun shrinkPolicy(): ShrinkPolicyProperty? =
          unwrap(this).getShrinkPolicy()?.let(ShrinkPolicyProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceGroupModifyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty):
          InstanceGroupModifyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceGroupModifyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceGroupModifyConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty
    }
  }

  /**
   * Custom policy for requesting termination protection or termination of specific instances when
   * shrinking an instance group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * InstanceResizePolicyProperty instanceResizePolicyProperty =
   * InstanceResizePolicyProperty.builder()
   * .instancesToProtect(List.of("instancesToProtect"))
   * .instancesToTerminate(List.of("instancesToTerminate"))
   * .instanceTerminationTimeout(Duration.minutes(30))
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceResizePolicy.html)
   */
  public interface InstanceResizePolicyProperty {
    /**
     * Decommissioning timeout override for the specific list of instances to be terminated.
     *
     * Default: cdk.Duration.seconds
     */
    public fun instanceTerminationTimeout(): Duration? =
        unwrap(this).getInstanceTerminationTimeout()?.let(Duration::wrap)

    /**
     * Specific list of instances to be protected when shrinking an instance group.
     *
     * Default: - No instances will be protected when shrinking an instance group
     */
    public fun instancesToProtect(): List<String> = unwrap(this).getInstancesToProtect() ?:
        emptyList()

    /**
     * Specific list of instances to be terminated when shrinking an instance group.
     *
     * Default: - No instances will be terminated when shrinking an instance group.
     */
    public fun instancesToTerminate(): List<String> = unwrap(this).getInstancesToTerminate() ?:
        emptyList()

    /**
     * A builder for [InstanceResizePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceTerminationTimeout Decommissioning timeout override for the specific list of
       * instances to be terminated.
       */
      public fun instanceTerminationTimeout(instanceTerminationTimeout: Duration)

      /**
       * @param instancesToProtect Specific list of instances to be protected when shrinking an
       * instance group.
       */
      public fun instancesToProtect(instancesToProtect: List<String>)

      /**
       * @param instancesToProtect Specific list of instances to be protected when shrinking an
       * instance group.
       */
      public fun instancesToProtect(vararg instancesToProtect: String)

      /**
       * @param instancesToTerminate Specific list of instances to be terminated when shrinking an
       * instance group.
       */
      public fun instancesToTerminate(instancesToTerminate: List<String>)

      /**
       * @param instancesToTerminate Specific list of instances to be terminated when shrinking an
       * instance group.
       */
      public fun instancesToTerminate(vararg instancesToTerminate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty.builder()

      /**
       * @param instanceTerminationTimeout Decommissioning timeout override for the specific list of
       * instances to be terminated.
       */
      override fun instanceTerminationTimeout(instanceTerminationTimeout: Duration) {
        cdkBuilder.instanceTerminationTimeout(instanceTerminationTimeout.let(Duration.Companion::unwrap))
      }

      /**
       * @param instancesToProtect Specific list of instances to be protected when shrinking an
       * instance group.
       */
      override fun instancesToProtect(instancesToProtect: List<String>) {
        cdkBuilder.instancesToProtect(instancesToProtect)
      }

      /**
       * @param instancesToProtect Specific list of instances to be protected when shrinking an
       * instance group.
       */
      override fun instancesToProtect(vararg instancesToProtect: String): Unit =
          instancesToProtect(instancesToProtect.toList())

      /**
       * @param instancesToTerminate Specific list of instances to be terminated when shrinking an
       * instance group.
       */
      override fun instancesToTerminate(instancesToTerminate: List<String>) {
        cdkBuilder.instancesToTerminate(instancesToTerminate)
      }

      /**
       * @param instancesToTerminate Specific list of instances to be terminated when shrinking an
       * instance group.
       */
      override fun instancesToTerminate(vararg instancesToTerminate: String): Unit =
          instancesToTerminate(instancesToTerminate.toList())

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty,
    ) : CdkObject(cdkObject),
        InstanceResizePolicyProperty {
      /**
       * Decommissioning timeout override for the specific list of instances to be terminated.
       *
       * Default: cdk.Duration.seconds
       */
      override fun instanceTerminationTimeout(): Duration? =
          unwrap(this).getInstanceTerminationTimeout()?.let(Duration::wrap)

      /**
       * Specific list of instances to be protected when shrinking an instance group.
       *
       * Default: - No instances will be protected when shrinking an instance group
       */
      override fun instancesToProtect(): List<String> = unwrap(this).getInstancesToProtect() ?:
          emptyList()

      /**
       * Specific list of instances to be terminated when shrinking an instance group.
       *
       * Default: - No instances will be terminated when shrinking an instance group.
       */
      override fun instancesToTerminate(): List<String> = unwrap(this).getInstancesToTerminate() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceResizePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty):
          InstanceResizePolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceResizePolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceResizePolicyProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty
    }
  }

  /**
   * Policy for customizing shrink operations.
   *
   * Allows configuration of decommissioning timeout and targeted instance shrinking.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * ShrinkPolicyProperty shrinkPolicyProperty = ShrinkPolicyProperty.builder()
   * .decommissionTimeout(Duration.minutes(30))
   * .instanceResizePolicy(InstanceResizePolicyProperty.builder()
   * .instancesToProtect(List.of("instancesToProtect"))
   * .instancesToTerminate(List.of("instancesToTerminate"))
   * .instanceTerminationTimeout(Duration.minutes(30))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ShrinkPolicy.html)
   */
  public interface ShrinkPolicyProperty {
    /**
     * The desired timeout for decommissioning an instance.
     *
     * Overrides the default YARN decommissioning timeout.
     *
     * Default: - EMR selected default
     */
    public fun decommissionTimeout(): Duration? =
        unwrap(this).getDecommissionTimeout()?.let(Duration::wrap)

    /**
     * Custom policy for requesting termination protection or termination of specific instances when
     * shrinking an instance group.
     *
     * Default: - None
     */
    public fun instanceResizePolicy(): InstanceResizePolicyProperty? =
        unwrap(this).getInstanceResizePolicy()?.let(InstanceResizePolicyProperty::wrap)

    /**
     * A builder for [ShrinkPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param decommissionTimeout The desired timeout for decommissioning an instance.
       * Overrides the default YARN decommissioning timeout.
       */
      public fun decommissionTimeout(decommissionTimeout: Duration)

      /**
       * @param instanceResizePolicy Custom policy for requesting termination protection or
       * termination of specific instances when shrinking an instance group.
       */
      public fun instanceResizePolicy(instanceResizePolicy: InstanceResizePolicyProperty)

      /**
       * @param instanceResizePolicy Custom policy for requesting termination protection or
       * termination of specific instances when shrinking an instance group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56d4576baf2f9bf78146137f7d858182ed08b35c01a56f19d4d822f3f246353b")
      public
          fun instanceResizePolicy(instanceResizePolicy: InstanceResizePolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty.builder()

      /**
       * @param decommissionTimeout The desired timeout for decommissioning an instance.
       * Overrides the default YARN decommissioning timeout.
       */
      override fun decommissionTimeout(decommissionTimeout: Duration) {
        cdkBuilder.decommissionTimeout(decommissionTimeout.let(Duration.Companion::unwrap))
      }

      /**
       * @param instanceResizePolicy Custom policy for requesting termination protection or
       * termination of specific instances when shrinking an instance group.
       */
      override fun instanceResizePolicy(instanceResizePolicy: InstanceResizePolicyProperty) {
        cdkBuilder.instanceResizePolicy(instanceResizePolicy.let(InstanceResizePolicyProperty.Companion::unwrap))
      }

      /**
       * @param instanceResizePolicy Custom policy for requesting termination protection or
       * termination of specific instances when shrinking an instance group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56d4576baf2f9bf78146137f7d858182ed08b35c01a56f19d4d822f3f246353b")
      override
          fun instanceResizePolicy(instanceResizePolicy: InstanceResizePolicyProperty.Builder.() -> Unit):
          Unit = instanceResizePolicy(InstanceResizePolicyProperty(instanceResizePolicy))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty,
    ) : CdkObject(cdkObject),
        ShrinkPolicyProperty {
      /**
       * The desired timeout for decommissioning an instance.
       *
       * Overrides the default YARN decommissioning timeout.
       *
       * Default: - EMR selected default
       */
      override fun decommissionTimeout(): Duration? =
          unwrap(this).getDecommissionTimeout()?.let(Duration::wrap)

      /**
       * Custom policy for requesting termination protection or termination of specific instances
       * when shrinking an instance group.
       *
       * Default: - None
       */
      override fun instanceResizePolicy(): InstanceResizePolicyProperty? =
          unwrap(this).getInstanceResizePolicy()?.let(InstanceResizePolicyProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ShrinkPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty):
          ShrinkPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? ShrinkPolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShrinkPolicyProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty
    }
  }
}
