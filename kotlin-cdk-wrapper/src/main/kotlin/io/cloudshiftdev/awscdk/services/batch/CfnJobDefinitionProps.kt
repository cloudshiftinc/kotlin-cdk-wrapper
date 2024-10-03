@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnJobDefinition`.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html)
 */
public interface CfnJobDefinitionProps {
  /**
   * An object with properties specific to Amazon ECS-based jobs.
   *
   * When `containerProperties` is used in the job definition, it can't be used in addition to
   * `eksProperties` , `ecsProperties` , or `nodeProperties` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-containerproperties)
   */
  public fun containerProperties(): Any? = unwrap(this).getContainerProperties()

  /**
   * An object that contains the properties for the Amazon ECS resources of a job.When
   * `ecsProperties` is used in the job definition, it can't be used in addition to
   * `containerProperties` , `eksProperties` , or `nodeProperties` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-ecsproperties)
   */
  public fun ecsProperties(): Any? = unwrap(this).getEcsProperties()

  /**
   * An object with properties that are specific to Amazon EKS-based jobs.
   *
   * When `eksProperties` is used in the job definition, it can't be used in addition to
   * `containerProperties` , `ecsProperties` , or `nodeProperties` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-eksproperties)
   */
  public fun eksProperties(): Any? = unwrap(this).getEksProperties()

  /**
   * The name of the job definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname)
   */
  public fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  /**
   * An object with properties that are specific to multi-node parallel jobs.
   *
   * When `nodeProperties` is used in the job definition, it can't be used in addition to
   * `containerProperties` , `ecsProperties` , or `eksProperties` .
   *
   *
   * If the job runs on Fargate resources, don't specify `nodeProperties` . Use
   * `containerProperties` instead.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-nodeproperties)
   */
  public fun nodeProperties(): Any? = unwrap(this).getNodeProperties()

  /**
   * Default parameters or parameter substitution placeholders that are set in the job definition.
   *
   * Parameters are specified as a key-value pair mapping. Parameters in a `SubmitJob` request
   * override any corresponding parameter defaults from the job definition. For more information about
   * specifying parameters, see [Job definition
   * parameters](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html) in
   * the *AWS Batch User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * The platform capabilities required by the job definition.
   *
   * If no value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify
   * `FARGATE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-platformcapabilities)
   */
  public fun platformCapabilities(): List<String> = unwrap(this).getPlatformCapabilities() ?:
      emptyList()

  /**
   * Specifies whether to propagate the tags from the job or job definition to the corresponding
   * Amazon ECS task.
   *
   * If no value is specified, the tags aren't propagated. Tags can only be propagated to the tasks
   * when the tasks are created. For tags with the same name, job tags are given priority over job
   * definitions tags. If the total number of combined tags from the job and job definition is over 50,
   * the job is moved to the `FAILED` state.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-propagatetags)
   */
  public fun propagateTags(): Any? = unwrap(this).getPropagateTags()

  /**
   * The retry strategy to use for failed jobs that are submitted with this job definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-retrystrategy)
   */
  public fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()

  /**
   * The scheduling priority of the job definition.
   *
   * This only affects jobs in job queues with a fair share policy. Jobs with a higher scheduling
   * priority are scheduled before jobs with a lower scheduling priority.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-schedulingpriority)
   */
  public fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

  /**
   * The tags that are applied to the job definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * The timeout time for jobs that are submitted with this job definition.
   *
   * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
   * finished.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-timeout)
   */
  public fun timeout(): Any? = unwrap(this).getTimeout()

  /**
   * The type of job definition.
   *
   * For more information about multi-node parallel jobs, see [Creating a multi-node parallel job
   * definition](https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html) in the
   * *AWS Batch User Guide* .
   *
   * * If the value is `container` , then one of the following is required: `containerProperties` ,
   * `ecsProperties` , or `eksProperties` .
   * * If the value is `multinode` , then `nodeProperties` is required.
   *
   *
   * If the job is run on Fargate resources, then `multinode` isn't supported.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnJobDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerProperties An object with properties specific to Amazon ECS-based jobs.
     * When `containerProperties` is used in the job definition, it can't be used in addition to
     * `eksProperties` , `ecsProperties` , or `nodeProperties` .
     */
    public fun containerProperties(containerProperties: IResolvable)

    /**
     * @param containerProperties An object with properties specific to Amazon ECS-based jobs.
     * When `containerProperties` is used in the job definition, it can't be used in addition to
     * `eksProperties` , `ecsProperties` , or `nodeProperties` .
     */
    public
        fun containerProperties(containerProperties: CfnJobDefinition.ContainerPropertiesProperty)

    /**
     * @param containerProperties An object with properties specific to Amazon ECS-based jobs.
     * When `containerProperties` is used in the job definition, it can't be used in addition to
     * `eksProperties` , `ecsProperties` , or `nodeProperties` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("053386f06704f2f46eb669e0aacea0f9c806d04bf5eceb27797cbf2ded5df3fe")
    public
        fun containerProperties(containerProperties: CfnJobDefinition.ContainerPropertiesProperty.Builder.() -> Unit)

    /**
     * @param ecsProperties An object that contains the properties for the Amazon ECS resources of a
     * job.When `ecsProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `eksProperties` , or `nodeProperties` .
     */
    public fun ecsProperties(ecsProperties: IResolvable)

    /**
     * @param ecsProperties An object that contains the properties for the Amazon ECS resources of a
     * job.When `ecsProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `eksProperties` , or `nodeProperties` .
     */
    public fun ecsProperties(ecsProperties: CfnJobDefinition.EcsPropertiesProperty)

    /**
     * @param ecsProperties An object that contains the properties for the Amazon ECS resources of a
     * job.When `ecsProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `eksProperties` , or `nodeProperties` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d0f7241d0572f1ae89ed491015194934b521dc18be2e856aff197c63c11b9de")
    public
        fun ecsProperties(ecsProperties: CfnJobDefinition.EcsPropertiesProperty.Builder.() -> Unit)

    /**
     * @param eksProperties An object with properties that are specific to Amazon EKS-based jobs.
     * When `eksProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `nodeProperties` .
     */
    public fun eksProperties(eksProperties: IResolvable)

    /**
     * @param eksProperties An object with properties that are specific to Amazon EKS-based jobs.
     * When `eksProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `nodeProperties` .
     */
    public fun eksProperties(eksProperties: CfnJobDefinition.EksPropertiesProperty)

    /**
     * @param eksProperties An object with properties that are specific to Amazon EKS-based jobs.
     * When `eksProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `nodeProperties` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d5504f1b6c302985814b54fb3bf51be7430fcbcd0c5140672e8f5dfa6c867c0")
    public
        fun eksProperties(eksProperties: CfnJobDefinition.EksPropertiesProperty.Builder.() -> Unit)

    /**
     * @param jobDefinitionName The name of the job definition.
     */
    public fun jobDefinitionName(jobDefinitionName: String)

    /**
     * @param nodeProperties An object with properties that are specific to multi-node parallel
     * jobs.
     * When `nodeProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `eksProperties` .
     *
     *
     * If the job runs on Fargate resources, don't specify `nodeProperties` . Use
     * `containerProperties` instead.
     */
    public fun nodeProperties(nodeProperties: IResolvable)

    /**
     * @param nodeProperties An object with properties that are specific to multi-node parallel
     * jobs.
     * When `nodeProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `eksProperties` .
     *
     *
     * If the job runs on Fargate resources, don't specify `nodeProperties` . Use
     * `containerProperties` instead.
     */
    public fun nodeProperties(nodeProperties: CfnJobDefinition.NodePropertiesProperty)

    /**
     * @param nodeProperties An object with properties that are specific to multi-node parallel
     * jobs.
     * When `nodeProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `eksProperties` .
     *
     *
     * If the job runs on Fargate resources, don't specify `nodeProperties` . Use
     * `containerProperties` instead.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45483dfc3eb6d7ded183c158eff360fa9a8f583569d9fec74d0c1dffaca06120")
    public
        fun nodeProperties(nodeProperties: CfnJobDefinition.NodePropertiesProperty.Builder.() -> Unit)

    /**
     * @param parameters Default parameters or parameter substitution placeholders that are set in
     * the job definition.
     * Parameters are specified as a key-value pair mapping. Parameters in a `SubmitJob` request
     * override any corresponding parameter defaults from the job definition. For more information
     * about specifying parameters, see [Job definition
     * parameters](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html)
     * in the *AWS Batch User Guide* .
     */
    public fun parameters(parameters: Any)

    /**
     * @param platformCapabilities The platform capabilities required by the job definition.
     * If no value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify
     * `FARGATE` .
     */
    public fun platformCapabilities(platformCapabilities: List<String>)

    /**
     * @param platformCapabilities The platform capabilities required by the job definition.
     * If no value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify
     * `FARGATE` .
     */
    public fun platformCapabilities(vararg platformCapabilities: String)

    /**
     * @param propagateTags Specifies whether to propagate the tags from the job or job definition
     * to the corresponding Amazon ECS task.
     * If no value is specified, the tags aren't propagated. Tags can only be propagated to the
     * tasks when the tasks are created. For tags with the same name, job tags are given priority over
     * job definitions tags. If the total number of combined tags from the job and job definition is
     * over 50, the job is moved to the `FAILED` state.
     */
    public fun propagateTags(propagateTags: Boolean)

    /**
     * @param propagateTags Specifies whether to propagate the tags from the job or job definition
     * to the corresponding Amazon ECS task.
     * If no value is specified, the tags aren't propagated. Tags can only be propagated to the
     * tasks when the tasks are created. For tags with the same name, job tags are given priority over
     * job definitions tags. If the total number of combined tags from the job and job definition is
     * over 50, the job is moved to the `FAILED` state.
     */
    public fun propagateTags(propagateTags: IResolvable)

    /**
     * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this
     * job definition.
     */
    public fun retryStrategy(retryStrategy: IResolvable)

    /**
     * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this
     * job definition.
     */
    public fun retryStrategy(retryStrategy: CfnJobDefinition.RetryStrategyProperty)

    /**
     * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this
     * job definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c959b37bd00124009c37511a4cc3819aa64e818c3d341547f85161f16885fd2")
    public
        fun retryStrategy(retryStrategy: CfnJobDefinition.RetryStrategyProperty.Builder.() -> Unit)

    /**
     * @param schedulingPriority The scheduling priority of the job definition.
     * This only affects jobs in job queues with a fair share policy. Jobs with a higher scheduling
     * priority are scheduled before jobs with a lower scheduling priority.
     */
    public fun schedulingPriority(schedulingPriority: Number)

    /**
     * @param tags The tags that are applied to the job definition.
     */
    public fun tags(tags: Any)

    /**
     * @param timeout The timeout time for jobs that are submitted with this job definition.
     * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
     * finished.
     */
    public fun timeout(timeout: IResolvable)

    /**
     * @param timeout The timeout time for jobs that are submitted with this job definition.
     * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
     * finished.
     */
    public fun timeout(timeout: CfnJobDefinition.TimeoutProperty)

    /**
     * @param timeout The timeout time for jobs that are submitted with this job definition.
     * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
     * finished.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41dff2b2074ae01458c7ae2c5c53cbd279dc53338b5bd4c02dc1ec4a8e6416a1")
    public fun timeout(timeout: CfnJobDefinition.TimeoutProperty.Builder.() -> Unit)

    /**
     * @param type The type of job definition. 
     * For more information about multi-node parallel jobs, see [Creating a multi-node parallel job
     * definition](https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html) in the
     * *AWS Batch User Guide* .
     *
     * * If the value is `container` , then one of the following is required: `containerProperties`
     * , `ecsProperties` , or `eksProperties` .
     * * If the value is `multinode` , then `nodeProperties` is required.
     *
     *
     * If the job is run on Fargate resources, then `multinode` isn't supported.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder =
        software.amazon.awscdk.services.batch.CfnJobDefinitionProps.builder()

    /**
     * @param containerProperties An object with properties specific to Amazon ECS-based jobs.
     * When `containerProperties` is used in the job definition, it can't be used in addition to
     * `eksProperties` , `ecsProperties` , or `nodeProperties` .
     */
    override fun containerProperties(containerProperties: IResolvable) {
      cdkBuilder.containerProperties(containerProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param containerProperties An object with properties specific to Amazon ECS-based jobs.
     * When `containerProperties` is used in the job definition, it can't be used in addition to
     * `eksProperties` , `ecsProperties` , or `nodeProperties` .
     */
    override
        fun containerProperties(containerProperties: CfnJobDefinition.ContainerPropertiesProperty) {
      cdkBuilder.containerProperties(containerProperties.let(CfnJobDefinition.ContainerPropertiesProperty.Companion::unwrap))
    }

    /**
     * @param containerProperties An object with properties specific to Amazon ECS-based jobs.
     * When `containerProperties` is used in the job definition, it can't be used in addition to
     * `eksProperties` , `ecsProperties` , or `nodeProperties` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("053386f06704f2f46eb669e0aacea0f9c806d04bf5eceb27797cbf2ded5df3fe")
    override
        fun containerProperties(containerProperties: CfnJobDefinition.ContainerPropertiesProperty.Builder.() -> Unit):
        Unit =
        containerProperties(CfnJobDefinition.ContainerPropertiesProperty(containerProperties))

    /**
     * @param ecsProperties An object that contains the properties for the Amazon ECS resources of a
     * job.When `ecsProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `eksProperties` , or `nodeProperties` .
     */
    override fun ecsProperties(ecsProperties: IResolvable) {
      cdkBuilder.ecsProperties(ecsProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ecsProperties An object that contains the properties for the Amazon ECS resources of a
     * job.When `ecsProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `eksProperties` , or `nodeProperties` .
     */
    override fun ecsProperties(ecsProperties: CfnJobDefinition.EcsPropertiesProperty) {
      cdkBuilder.ecsProperties(ecsProperties.let(CfnJobDefinition.EcsPropertiesProperty.Companion::unwrap))
    }

    /**
     * @param ecsProperties An object that contains the properties for the Amazon ECS resources of a
     * job.When `ecsProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `eksProperties` , or `nodeProperties` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d0f7241d0572f1ae89ed491015194934b521dc18be2e856aff197c63c11b9de")
    override
        fun ecsProperties(ecsProperties: CfnJobDefinition.EcsPropertiesProperty.Builder.() -> Unit):
        Unit = ecsProperties(CfnJobDefinition.EcsPropertiesProperty(ecsProperties))

    /**
     * @param eksProperties An object with properties that are specific to Amazon EKS-based jobs.
     * When `eksProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `nodeProperties` .
     */
    override fun eksProperties(eksProperties: IResolvable) {
      cdkBuilder.eksProperties(eksProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param eksProperties An object with properties that are specific to Amazon EKS-based jobs.
     * When `eksProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `nodeProperties` .
     */
    override fun eksProperties(eksProperties: CfnJobDefinition.EksPropertiesProperty) {
      cdkBuilder.eksProperties(eksProperties.let(CfnJobDefinition.EksPropertiesProperty.Companion::unwrap))
    }

    /**
     * @param eksProperties An object with properties that are specific to Amazon EKS-based jobs.
     * When `eksProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `nodeProperties` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d5504f1b6c302985814b54fb3bf51be7430fcbcd0c5140672e8f5dfa6c867c0")
    override
        fun eksProperties(eksProperties: CfnJobDefinition.EksPropertiesProperty.Builder.() -> Unit):
        Unit = eksProperties(CfnJobDefinition.EksPropertiesProperty(eksProperties))

    /**
     * @param jobDefinitionName The name of the job definition.
     */
    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /**
     * @param nodeProperties An object with properties that are specific to multi-node parallel
     * jobs.
     * When `nodeProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `eksProperties` .
     *
     *
     * If the job runs on Fargate resources, don't specify `nodeProperties` . Use
     * `containerProperties` instead.
     */
    override fun nodeProperties(nodeProperties: IResolvable) {
      cdkBuilder.nodeProperties(nodeProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param nodeProperties An object with properties that are specific to multi-node parallel
     * jobs.
     * When `nodeProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `eksProperties` .
     *
     *
     * If the job runs on Fargate resources, don't specify `nodeProperties` . Use
     * `containerProperties` instead.
     */
    override fun nodeProperties(nodeProperties: CfnJobDefinition.NodePropertiesProperty) {
      cdkBuilder.nodeProperties(nodeProperties.let(CfnJobDefinition.NodePropertiesProperty.Companion::unwrap))
    }

    /**
     * @param nodeProperties An object with properties that are specific to multi-node parallel
     * jobs.
     * When `nodeProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `eksProperties` .
     *
     *
     * If the job runs on Fargate resources, don't specify `nodeProperties` . Use
     * `containerProperties` instead.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45483dfc3eb6d7ded183c158eff360fa9a8f583569d9fec74d0c1dffaca06120")
    override
        fun nodeProperties(nodeProperties: CfnJobDefinition.NodePropertiesProperty.Builder.() -> Unit):
        Unit = nodeProperties(CfnJobDefinition.NodePropertiesProperty(nodeProperties))

    /**
     * @param parameters Default parameters or parameter substitution placeholders that are set in
     * the job definition.
     * Parameters are specified as a key-value pair mapping. Parameters in a `SubmitJob` request
     * override any corresponding parameter defaults from the job definition. For more information
     * about specifying parameters, see [Job definition
     * parameters](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html)
     * in the *AWS Batch User Guide* .
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param platformCapabilities The platform capabilities required by the job definition.
     * If no value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify
     * `FARGATE` .
     */
    override fun platformCapabilities(platformCapabilities: List<String>) {
      cdkBuilder.platformCapabilities(platformCapabilities)
    }

    /**
     * @param platformCapabilities The platform capabilities required by the job definition.
     * If no value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify
     * `FARGATE` .
     */
    override fun platformCapabilities(vararg platformCapabilities: String): Unit =
        platformCapabilities(platformCapabilities.toList())

    /**
     * @param propagateTags Specifies whether to propagate the tags from the job or job definition
     * to the corresponding Amazon ECS task.
     * If no value is specified, the tags aren't propagated. Tags can only be propagated to the
     * tasks when the tasks are created. For tags with the same name, job tags are given priority over
     * job definitions tags. If the total number of combined tags from the job and job definition is
     * over 50, the job is moved to the `FAILED` state.
     */
    override fun propagateTags(propagateTags: Boolean) {
      cdkBuilder.propagateTags(propagateTags)
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the job or job definition
     * to the corresponding Amazon ECS task.
     * If no value is specified, the tags aren't propagated. Tags can only be propagated to the
     * tasks when the tasks are created. For tags with the same name, job tags are given priority over
     * job definitions tags. If the total number of combined tags from the job and job definition is
     * over 50, the job is moved to the `FAILED` state.
     */
    override fun propagateTags(propagateTags: IResolvable) {
      cdkBuilder.propagateTags(propagateTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this
     * job definition.
     */
    override fun retryStrategy(retryStrategy: IResolvable) {
      cdkBuilder.retryStrategy(retryStrategy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this
     * job definition.
     */
    override fun retryStrategy(retryStrategy: CfnJobDefinition.RetryStrategyProperty) {
      cdkBuilder.retryStrategy(retryStrategy.let(CfnJobDefinition.RetryStrategyProperty.Companion::unwrap))
    }

    /**
     * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this
     * job definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c959b37bd00124009c37511a4cc3819aa64e818c3d341547f85161f16885fd2")
    override
        fun retryStrategy(retryStrategy: CfnJobDefinition.RetryStrategyProperty.Builder.() -> Unit):
        Unit = retryStrategy(CfnJobDefinition.RetryStrategyProperty(retryStrategy))

    /**
     * @param schedulingPriority The scheduling priority of the job definition.
     * This only affects jobs in job queues with a fair share policy. Jobs with a higher scheduling
     * priority are scheduled before jobs with a lower scheduling priority.
     */
    override fun schedulingPriority(schedulingPriority: Number) {
      cdkBuilder.schedulingPriority(schedulingPriority)
    }

    /**
     * @param tags The tags that are applied to the job definition.
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param timeout The timeout time for jobs that are submitted with this job definition.
     * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
     * finished.
     */
    override fun timeout(timeout: IResolvable) {
      cdkBuilder.timeout(timeout.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param timeout The timeout time for jobs that are submitted with this job definition.
     * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
     * finished.
     */
    override fun timeout(timeout: CfnJobDefinition.TimeoutProperty) {
      cdkBuilder.timeout(timeout.let(CfnJobDefinition.TimeoutProperty.Companion::unwrap))
    }

    /**
     * @param timeout The timeout time for jobs that are submitted with this job definition.
     * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
     * finished.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41dff2b2074ae01458c7ae2c5c53cbd279dc53338b5bd4c02dc1ec4a8e6416a1")
    override fun timeout(timeout: CfnJobDefinition.TimeoutProperty.Builder.() -> Unit): Unit =
        timeout(CfnJobDefinition.TimeoutProperty(timeout))

    /**
     * @param type The type of job definition. 
     * For more information about multi-node parallel jobs, see [Creating a multi-node parallel job
     * definition](https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html) in the
     * *AWS Batch User Guide* .
     *
     * * If the value is `container` , then one of the following is required: `containerProperties`
     * , `ecsProperties` , or `eksProperties` .
     * * If the value is `multinode` , then `nodeProperties` is required.
     *
     *
     * If the job is run on Fargate resources, then `multinode` isn't supported.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinitionProps,
  ) : CdkObject(cdkObject),
      CfnJobDefinitionProps {
    /**
     * An object with properties specific to Amazon ECS-based jobs.
     *
     * When `containerProperties` is used in the job definition, it can't be used in addition to
     * `eksProperties` , `ecsProperties` , or `nodeProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-containerproperties)
     */
    override fun containerProperties(): Any? = unwrap(this).getContainerProperties()

    /**
     * An object that contains the properties for the Amazon ECS resources of a job.When
     * `ecsProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `eksProperties` , or `nodeProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-ecsproperties)
     */
    override fun ecsProperties(): Any? = unwrap(this).getEcsProperties()

    /**
     * An object with properties that are specific to Amazon EKS-based jobs.
     *
     * When `eksProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `nodeProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-eksproperties)
     */
    override fun eksProperties(): Any? = unwrap(this).getEksProperties()

    /**
     * The name of the job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname)
     */
    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    /**
     * An object with properties that are specific to multi-node parallel jobs.
     *
     * When `nodeProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `eksProperties` .
     *
     *
     * If the job runs on Fargate resources, don't specify `nodeProperties` . Use
     * `containerProperties` instead.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-nodeproperties)
     */
    override fun nodeProperties(): Any? = unwrap(this).getNodeProperties()

    /**
     * Default parameters or parameter substitution placeholders that are set in the job definition.
     *
     * Parameters are specified as a key-value pair mapping. Parameters in a `SubmitJob` request
     * override any corresponding parameter defaults from the job definition. For more information
     * about specifying parameters, see [Job definition
     * parameters](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html)
     * in the *AWS Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The platform capabilities required by the job definition.
     *
     * If no value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify
     * `FARGATE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-platformcapabilities)
     */
    override fun platformCapabilities(): List<String> = unwrap(this).getPlatformCapabilities() ?:
        emptyList()

    /**
     * Specifies whether to propagate the tags from the job or job definition to the corresponding
     * Amazon ECS task.
     *
     * If no value is specified, the tags aren't propagated. Tags can only be propagated to the
     * tasks when the tasks are created. For tags with the same name, job tags are given priority over
     * job definitions tags. If the total number of combined tags from the job and job definition is
     * over 50, the job is moved to the `FAILED` state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-propagatetags)
     */
    override fun propagateTags(): Any? = unwrap(this).getPropagateTags()

    /**
     * The retry strategy to use for failed jobs that are submitted with this job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-retrystrategy)
     */
    override fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()

    /**
     * The scheduling priority of the job definition.
     *
     * This only affects jobs in job queues with a fair share policy. Jobs with a higher scheduling
     * priority are scheduled before jobs with a lower scheduling priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-schedulingpriority)
     */
    override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

    /**
     * The tags that are applied to the job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * The timeout time for jobs that are submitted with this job definition.
     *
     * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
     * finished.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-timeout)
     */
    override fun timeout(): Any? = unwrap(this).getTimeout()

    /**
     * The type of job definition.
     *
     * For more information about multi-node parallel jobs, see [Creating a multi-node parallel job
     * definition](https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html) in the
     * *AWS Batch User Guide* .
     *
     * * If the value is `container` , then one of the following is required: `containerProperties`
     * , `ecsProperties` , or `eksProperties` .
     * * If the value is `multinode` , then `nodeProperties` is required.
     *
     *
     * If the job is run on Fargate resources, then `multinode` isn't supported.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnJobDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinitionProps):
        CfnJobDefinitionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnJobDefinitionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnJobDefinitionProps):
        software.amazon.awscdk.services.batch.CfnJobDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.CfnJobDefinitionProps
  }
}
