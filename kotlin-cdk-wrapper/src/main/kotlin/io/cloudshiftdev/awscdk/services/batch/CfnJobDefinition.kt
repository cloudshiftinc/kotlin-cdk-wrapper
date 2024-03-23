@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Batch::JobDefinition` resource specifies the parameters for an AWS Batch job
 * definition.
 *
 * For more information, see [Job
 * Definitions](https://docs.aws.amazon.com/batch/latest/userguide/job_definitions.html) in the ** .
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html)
 */
public open class CfnJobDefinition(
  cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnJobDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.batch.CfnJobDefinition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnJobDefinitionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnJobDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnJobDefinitionProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * An object with properties specific to Amazon ECS-based jobs.
   */
  public open fun containerProperties(): Any? = unwrap(this).getContainerProperties()

  /**
   * An object with properties specific to Amazon ECS-based jobs.
   */
  public open fun containerProperties(`value`: IResolvable) {
    unwrap(this).setContainerProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object with properties specific to Amazon ECS-based jobs.
   */
  public open fun containerProperties(`value`: ContainerPropertiesProperty) {
    unwrap(this).setContainerProperties(`value`.let(ContainerPropertiesProperty::unwrap))
  }

  /**
   * An object with properties specific to Amazon ECS-based jobs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("40ac4a0e096005b6e2ca3b6883bc7caeb84df81f437cbbfba58086df9b5d21ec")
  public open fun containerProperties(`value`: ContainerPropertiesProperty.Builder.() -> Unit): Unit
      = containerProperties(ContainerPropertiesProperty(`value`))

  /**
   *
   */
  public open fun ecsProperties(): Any? = unwrap(this).getEcsProperties()

  /**
   *
   */
  public open fun ecsProperties(`value`: IResolvable) {
    unwrap(this).setEcsProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun ecsProperties(`value`: EcsPropertiesProperty) {
    unwrap(this).setEcsProperties(`value`.let(EcsPropertiesProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("09e3912d8371d4c53e08e94f5b2983eb4a125656a5323641df24890891d00ea9")
  public open fun ecsProperties(`value`: EcsPropertiesProperty.Builder.() -> Unit): Unit =
      ecsProperties(EcsPropertiesProperty(`value`))

  /**
   * An object with properties that are specific to Amazon EKS-based jobs.
   */
  public open fun eksProperties(): Any? = unwrap(this).getEksProperties()

  /**
   * An object with properties that are specific to Amazon EKS-based jobs.
   */
  public open fun eksProperties(`value`: IResolvable) {
    unwrap(this).setEksProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object with properties that are specific to Amazon EKS-based jobs.
   */
  public open fun eksProperties(`value`: EksPropertiesProperty) {
    unwrap(this).setEksProperties(`value`.let(EksPropertiesProperty::unwrap))
  }

  /**
   * An object with properties that are specific to Amazon EKS-based jobs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0febfb1968f1c75340f144a1ccc0e6eccac7956d6f6491b3115babc5c74b7fd5")
  public open fun eksProperties(`value`: EksPropertiesProperty.Builder.() -> Unit): Unit =
      eksProperties(EksPropertiesProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the job definition.
   */
  public open fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  /**
   * The name of the job definition.
   */
  public open fun jobDefinitionName(`value`: String) {
    unwrap(this).setJobDefinitionName(`value`)
  }

  /**
   * An object with properties that are specific to multi-node parallel jobs.
   */
  public open fun nodeProperties(): Any? = unwrap(this).getNodeProperties()

  /**
   * An object with properties that are specific to multi-node parallel jobs.
   */
  public open fun nodeProperties(`value`: IResolvable) {
    unwrap(this).setNodeProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object with properties that are specific to multi-node parallel jobs.
   */
  public open fun nodeProperties(`value`: NodePropertiesProperty) {
    unwrap(this).setNodeProperties(`value`.let(NodePropertiesProperty::unwrap))
  }

  /**
   * An object with properties that are specific to multi-node parallel jobs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a0e39f92a1952bd073f1435a340c98076398f561704e72d263cfc036eae7252")
  public open fun nodeProperties(`value`: NodePropertiesProperty.Builder.() -> Unit): Unit =
      nodeProperties(NodePropertiesProperty(`value`))

  /**
   * Default parameters or parameter substitution placeholders that are set in the job definition.
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * Default parameters or parameter substitution placeholders that are set in the job definition.
   */
  public open fun parameters(`value`: Any) {
    unwrap(this).setParameters(`value`)
  }

  /**
   * The platform capabilities required by the job definition.
   */
  public open fun platformCapabilities(): List<String> = unwrap(this).getPlatformCapabilities() ?:
      emptyList()

  /**
   * The platform capabilities required by the job definition.
   */
  public open fun platformCapabilities(`value`: List<String>) {
    unwrap(this).setPlatformCapabilities(`value`)
  }

  /**
   * The platform capabilities required by the job definition.
   */
  public open fun platformCapabilities(vararg `value`: String): Unit =
      platformCapabilities(`value`.toList())

  /**
   * Specifies whether to propagate the tags from the job or job definition to the corresponding
   * Amazon ECS task.
   */
  public open fun propagateTags(): Any? = unwrap(this).getPropagateTags()

  /**
   * Specifies whether to propagate the tags from the job or job definition to the corresponding
   * Amazon ECS task.
   */
  public open fun propagateTags(`value`: Boolean) {
    unwrap(this).setPropagateTags(`value`)
  }

  /**
   * Specifies whether to propagate the tags from the job or job definition to the corresponding
   * Amazon ECS task.
   */
  public open fun propagateTags(`value`: IResolvable) {
    unwrap(this).setPropagateTags(`value`.let(IResolvable::unwrap))
  }

  /**
   * The retry strategy to use for failed jobs that are submitted with this job definition.
   */
  public open fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()

  /**
   * The retry strategy to use for failed jobs that are submitted with this job definition.
   */
  public open fun retryStrategy(`value`: IResolvable) {
    unwrap(this).setRetryStrategy(`value`.let(IResolvable::unwrap))
  }

  /**
   * The retry strategy to use for failed jobs that are submitted with this job definition.
   */
  public open fun retryStrategy(`value`: RetryStrategyProperty) {
    unwrap(this).setRetryStrategy(`value`.let(RetryStrategyProperty::unwrap))
  }

  /**
   * The retry strategy to use for failed jobs that are submitted with this job definition.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("abc822b22f6ffd6ca47069f05ded9e9598abbfc223dc7504e9cddd50d7a68812")
  public open fun retryStrategy(`value`: RetryStrategyProperty.Builder.() -> Unit): Unit =
      retryStrategy(RetryStrategyProperty(`value`))

  /**
   * The scheduling priority of the job definition.
   */
  public open fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

  /**
   * The scheduling priority of the job definition.
   */
  public open fun schedulingPriority(`value`: Number) {
    unwrap(this).setSchedulingPriority(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags that are applied to the job definition.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * The tags that are applied to the job definition.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The timeout time for jobs that are submitted with this job definition.
   */
  public open fun timeout(): Any? = unwrap(this).getTimeout()

  /**
   * The timeout time for jobs that are submitted with this job definition.
   */
  public open fun timeout(`value`: IResolvable) {
    unwrap(this).setTimeout(`value`.let(IResolvable::unwrap))
  }

  /**
   * The timeout time for jobs that are submitted with this job definition.
   */
  public open fun timeout(`value`: TimeoutProperty) {
    unwrap(this).setTimeout(`value`.let(TimeoutProperty::unwrap))
  }

  /**
   * The timeout time for jobs that are submitted with this job definition.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d2f4dcec0c9c4e7fccbe630c4290daea7f8f2a7fe48b779c67ee673b1e242954")
  public open fun timeout(`value`: TimeoutProperty.Builder.() -> Unit): Unit =
      timeout(TimeoutProperty(`value`))

  /**
   * The type of job definition.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of job definition.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.CfnJobDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An object with properties specific to Amazon ECS-based jobs.
     *
     * When `containerProperties` is used in the job definition, it can't be used in addition to
     * `eksProperties` , `ecsProperties` , or `nodeProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-containerproperties)
     * @param containerProperties An object with properties specific to Amazon ECS-based jobs. 
     */
    public fun containerProperties(containerProperties: IResolvable)

    /**
     * An object with properties specific to Amazon ECS-based jobs.
     *
     * When `containerProperties` is used in the job definition, it can't be used in addition to
     * `eksProperties` , `ecsProperties` , or `nodeProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-containerproperties)
     * @param containerProperties An object with properties specific to Amazon ECS-based jobs. 
     */
    public fun containerProperties(containerProperties: ContainerPropertiesProperty)

    /**
     * An object with properties specific to Amazon ECS-based jobs.
     *
     * When `containerProperties` is used in the job definition, it can't be used in addition to
     * `eksProperties` , `ecsProperties` , or `nodeProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-containerproperties)
     * @param containerProperties An object with properties specific to Amazon ECS-based jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4cf19641d5566ae14a63dfceec2d34db0f790bc7d23f120f624afcdf4d912eb")
    public
        fun containerProperties(containerProperties: ContainerPropertiesProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-ecsproperties)
     * @param ecsProperties 
     */
    public fun ecsProperties(ecsProperties: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-ecsproperties)
     * @param ecsProperties 
     */
    public fun ecsProperties(ecsProperties: EcsPropertiesProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-ecsproperties)
     * @param ecsProperties 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13805dc0544dd39ef2261e3377eb2aa144bc22e99667bbaff6b834e53aab3461")
    public fun ecsProperties(ecsProperties: EcsPropertiesProperty.Builder.() -> Unit)

    /**
     * An object with properties that are specific to Amazon EKS-based jobs.
     *
     * When `eksProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `nodeProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-eksproperties)
     * @param eksProperties An object with properties that are specific to Amazon EKS-based jobs. 
     */
    public fun eksProperties(eksProperties: IResolvable)

    /**
     * An object with properties that are specific to Amazon EKS-based jobs.
     *
     * When `eksProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `nodeProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-eksproperties)
     * @param eksProperties An object with properties that are specific to Amazon EKS-based jobs. 
     */
    public fun eksProperties(eksProperties: EksPropertiesProperty)

    /**
     * An object with properties that are specific to Amazon EKS-based jobs.
     *
     * When `eksProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `nodeProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-eksproperties)
     * @param eksProperties An object with properties that are specific to Amazon EKS-based jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43c1980ac80b3ad25079e08d8a06b74092d3abe1ea8288a17f3daef7bb2c3071")
    public fun eksProperties(eksProperties: EksPropertiesProperty.Builder.() -> Unit)

    /**
     * The name of the job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname)
     * @param jobDefinitionName The name of the job definition. 
     */
    public fun jobDefinitionName(jobDefinitionName: String)

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
     * @param nodeProperties An object with properties that are specific to multi-node parallel
     * jobs. 
     */
    public fun nodeProperties(nodeProperties: IResolvable)

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
     * @param nodeProperties An object with properties that are specific to multi-node parallel
     * jobs. 
     */
    public fun nodeProperties(nodeProperties: NodePropertiesProperty)

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
     * @param nodeProperties An object with properties that are specific to multi-node parallel
     * jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bde92f0b9ddcf3791dc7f0235f8fd0f91ffb9d87442b55922414a7a4c0ec9cf")
    public fun nodeProperties(nodeProperties: NodePropertiesProperty.Builder.() -> Unit)

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
     * @param parameters Default parameters or parameter substitution placeholders that are set in
     * the job definition. 
     */
    public fun parameters(parameters: Any)

    /**
     * The platform capabilities required by the job definition.
     *
     * If no value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify
     * `FARGATE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-platformcapabilities)
     * @param platformCapabilities The platform capabilities required by the job definition. 
     */
    public fun platformCapabilities(platformCapabilities: List<String>)

    /**
     * The platform capabilities required by the job definition.
     *
     * If no value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify
     * `FARGATE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-platformcapabilities)
     * @param platformCapabilities The platform capabilities required by the job definition. 
     */
    public fun platformCapabilities(vararg platformCapabilities: String)

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
     * @param propagateTags Specifies whether to propagate the tags from the job or job definition
     * to the corresponding Amazon ECS task. 
     */
    public fun propagateTags(propagateTags: Boolean)

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
     * @param propagateTags Specifies whether to propagate the tags from the job or job definition
     * to the corresponding Amazon ECS task. 
     */
    public fun propagateTags(propagateTags: IResolvable)

    /**
     * The retry strategy to use for failed jobs that are submitted with this job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-retrystrategy)
     * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this
     * job definition. 
     */
    public fun retryStrategy(retryStrategy: IResolvable)

    /**
     * The retry strategy to use for failed jobs that are submitted with this job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-retrystrategy)
     * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this
     * job definition. 
     */
    public fun retryStrategy(retryStrategy: RetryStrategyProperty)

    /**
     * The retry strategy to use for failed jobs that are submitted with this job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-retrystrategy)
     * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this
     * job definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8da92ab106676a30c7021e50aec7579220a6dfb3f5ec608a37a8c69959c47409")
    public fun retryStrategy(retryStrategy: RetryStrategyProperty.Builder.() -> Unit)

    /**
     * The scheduling priority of the job definition.
     *
     * This only affects jobs in job queues with a fair share policy. Jobs with a higher scheduling
     * priority are scheduled before jobs with a lower scheduling priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-schedulingpriority)
     * @param schedulingPriority The scheduling priority of the job definition. 
     */
    public fun schedulingPriority(schedulingPriority: Number)

    /**
     * The tags that are applied to the job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-tags)
     * @param tags The tags that are applied to the job definition. 
     */
    public fun tags(tags: Any)

    /**
     * The timeout time for jobs that are submitted with this job definition.
     *
     * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
     * finished.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-timeout)
     * @param timeout The timeout time for jobs that are submitted with this job definition. 
     */
    public fun timeout(timeout: IResolvable)

    /**
     * The timeout time for jobs that are submitted with this job definition.
     *
     * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
     * finished.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-timeout)
     * @param timeout The timeout time for jobs that are submitted with this job definition. 
     */
    public fun timeout(timeout: TimeoutProperty)

    /**
     * The timeout time for jobs that are submitted with this job definition.
     *
     * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
     * finished.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-timeout)
     * @param timeout The timeout time for jobs that are submitted with this job definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7768b6ac80ab858102acc185f6a6f5c5f5387a7a9198410d26fcb8e328050932")
    public fun timeout(timeout: TimeoutProperty.Builder.() -> Unit)

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
     * @param type The type of job definition. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnJobDefinition.Builder =
        software.amazon.awscdk.services.batch.CfnJobDefinition.Builder.create(scope, id)

    /**
     * An object with properties specific to Amazon ECS-based jobs.
     *
     * When `containerProperties` is used in the job definition, it can't be used in addition to
     * `eksProperties` , `ecsProperties` , or `nodeProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-containerproperties)
     * @param containerProperties An object with properties specific to Amazon ECS-based jobs. 
     */
    override fun containerProperties(containerProperties: IResolvable) {
      cdkBuilder.containerProperties(containerProperties.let(IResolvable::unwrap))
    }

    /**
     * An object with properties specific to Amazon ECS-based jobs.
     *
     * When `containerProperties` is used in the job definition, it can't be used in addition to
     * `eksProperties` , `ecsProperties` , or `nodeProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-containerproperties)
     * @param containerProperties An object with properties specific to Amazon ECS-based jobs. 
     */
    override fun containerProperties(containerProperties: ContainerPropertiesProperty) {
      cdkBuilder.containerProperties(containerProperties.let(ContainerPropertiesProperty::unwrap))
    }

    /**
     * An object with properties specific to Amazon ECS-based jobs.
     *
     * When `containerProperties` is used in the job definition, it can't be used in addition to
     * `eksProperties` , `ecsProperties` , or `nodeProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-containerproperties)
     * @param containerProperties An object with properties specific to Amazon ECS-based jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4cf19641d5566ae14a63dfceec2d34db0f790bc7d23f120f624afcdf4d912eb")
    override
        fun containerProperties(containerProperties: ContainerPropertiesProperty.Builder.() -> Unit):
        Unit = containerProperties(ContainerPropertiesProperty(containerProperties))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-ecsproperties)
     * @param ecsProperties 
     */
    override fun ecsProperties(ecsProperties: IResolvable) {
      cdkBuilder.ecsProperties(ecsProperties.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-ecsproperties)
     * @param ecsProperties 
     */
    override fun ecsProperties(ecsProperties: EcsPropertiesProperty) {
      cdkBuilder.ecsProperties(ecsProperties.let(EcsPropertiesProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-ecsproperties)
     * @param ecsProperties 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13805dc0544dd39ef2261e3377eb2aa144bc22e99667bbaff6b834e53aab3461")
    override fun ecsProperties(ecsProperties: EcsPropertiesProperty.Builder.() -> Unit): Unit =
        ecsProperties(EcsPropertiesProperty(ecsProperties))

    /**
     * An object with properties that are specific to Amazon EKS-based jobs.
     *
     * When `eksProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `nodeProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-eksproperties)
     * @param eksProperties An object with properties that are specific to Amazon EKS-based jobs. 
     */
    override fun eksProperties(eksProperties: IResolvable) {
      cdkBuilder.eksProperties(eksProperties.let(IResolvable::unwrap))
    }

    /**
     * An object with properties that are specific to Amazon EKS-based jobs.
     *
     * When `eksProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `nodeProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-eksproperties)
     * @param eksProperties An object with properties that are specific to Amazon EKS-based jobs. 
     */
    override fun eksProperties(eksProperties: EksPropertiesProperty) {
      cdkBuilder.eksProperties(eksProperties.let(EksPropertiesProperty::unwrap))
    }

    /**
     * An object with properties that are specific to Amazon EKS-based jobs.
     *
     * When `eksProperties` is used in the job definition, it can't be used in addition to
     * `containerProperties` , `ecsProperties` , or `nodeProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-eksproperties)
     * @param eksProperties An object with properties that are specific to Amazon EKS-based jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43c1980ac80b3ad25079e08d8a06b74092d3abe1ea8288a17f3daef7bb2c3071")
    override fun eksProperties(eksProperties: EksPropertiesProperty.Builder.() -> Unit): Unit =
        eksProperties(EksPropertiesProperty(eksProperties))

    /**
     * The name of the job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname)
     * @param jobDefinitionName The name of the job definition. 
     */
    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

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
     * @param nodeProperties An object with properties that are specific to multi-node parallel
     * jobs. 
     */
    override fun nodeProperties(nodeProperties: IResolvable) {
      cdkBuilder.nodeProperties(nodeProperties.let(IResolvable::unwrap))
    }

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
     * @param nodeProperties An object with properties that are specific to multi-node parallel
     * jobs. 
     */
    override fun nodeProperties(nodeProperties: NodePropertiesProperty) {
      cdkBuilder.nodeProperties(nodeProperties.let(NodePropertiesProperty::unwrap))
    }

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
     * @param nodeProperties An object with properties that are specific to multi-node parallel
     * jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bde92f0b9ddcf3791dc7f0235f8fd0f91ffb9d87442b55922414a7a4c0ec9cf")
    override fun nodeProperties(nodeProperties: NodePropertiesProperty.Builder.() -> Unit): Unit =
        nodeProperties(NodePropertiesProperty(nodeProperties))

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
     * @param parameters Default parameters or parameter substitution placeholders that are set in
     * the job definition. 
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * The platform capabilities required by the job definition.
     *
     * If no value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify
     * `FARGATE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-platformcapabilities)
     * @param platformCapabilities The platform capabilities required by the job definition. 
     */
    override fun platformCapabilities(platformCapabilities: List<String>) {
      cdkBuilder.platformCapabilities(platformCapabilities)
    }

    /**
     * The platform capabilities required by the job definition.
     *
     * If no value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify
     * `FARGATE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-platformcapabilities)
     * @param platformCapabilities The platform capabilities required by the job definition. 
     */
    override fun platformCapabilities(vararg platformCapabilities: String): Unit =
        platformCapabilities(platformCapabilities.toList())

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
     * @param propagateTags Specifies whether to propagate the tags from the job or job definition
     * to the corresponding Amazon ECS task. 
     */
    override fun propagateTags(propagateTags: Boolean) {
      cdkBuilder.propagateTags(propagateTags)
    }

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
     * @param propagateTags Specifies whether to propagate the tags from the job or job definition
     * to the corresponding Amazon ECS task. 
     */
    override fun propagateTags(propagateTags: IResolvable) {
      cdkBuilder.propagateTags(propagateTags.let(IResolvable::unwrap))
    }

    /**
     * The retry strategy to use for failed jobs that are submitted with this job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-retrystrategy)
     * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this
     * job definition. 
     */
    override fun retryStrategy(retryStrategy: IResolvable) {
      cdkBuilder.retryStrategy(retryStrategy.let(IResolvable::unwrap))
    }

    /**
     * The retry strategy to use for failed jobs that are submitted with this job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-retrystrategy)
     * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this
     * job definition. 
     */
    override fun retryStrategy(retryStrategy: RetryStrategyProperty) {
      cdkBuilder.retryStrategy(retryStrategy.let(RetryStrategyProperty::unwrap))
    }

    /**
     * The retry strategy to use for failed jobs that are submitted with this job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-retrystrategy)
     * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this
     * job definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8da92ab106676a30c7021e50aec7579220a6dfb3f5ec608a37a8c69959c47409")
    override fun retryStrategy(retryStrategy: RetryStrategyProperty.Builder.() -> Unit): Unit =
        retryStrategy(RetryStrategyProperty(retryStrategy))

    /**
     * The scheduling priority of the job definition.
     *
     * This only affects jobs in job queues with a fair share policy. Jobs with a higher scheduling
     * priority are scheduled before jobs with a lower scheduling priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-schedulingpriority)
     * @param schedulingPriority The scheduling priority of the job definition. 
     */
    override fun schedulingPriority(schedulingPriority: Number) {
      cdkBuilder.schedulingPriority(schedulingPriority)
    }

    /**
     * The tags that are applied to the job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-tags)
     * @param tags The tags that are applied to the job definition. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * The timeout time for jobs that are submitted with this job definition.
     *
     * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
     * finished.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-timeout)
     * @param timeout The timeout time for jobs that are submitted with this job definition. 
     */
    override fun timeout(timeout: IResolvable) {
      cdkBuilder.timeout(timeout.let(IResolvable::unwrap))
    }

    /**
     * The timeout time for jobs that are submitted with this job definition.
     *
     * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
     * finished.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-timeout)
     * @param timeout The timeout time for jobs that are submitted with this job definition. 
     */
    override fun timeout(timeout: TimeoutProperty) {
      cdkBuilder.timeout(timeout.let(TimeoutProperty::unwrap))
    }

    /**
     * The timeout time for jobs that are submitted with this job definition.
     *
     * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
     * finished.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-timeout)
     * @param timeout The timeout time for jobs that are submitted with this job definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7768b6ac80ab858102acc185f6a6f5c5f5387a7a9198410d26fcb8e328050932")
    override fun timeout(timeout: TimeoutProperty.Builder.() -> Unit): Unit =
        timeout(TimeoutProperty(timeout))

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
     * @param type The type of job definition. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.batch.CfnJobDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnJobDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnJobDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition):
        CfnJobDefinition = CfnJobDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnJobDefinition):
        software.amazon.awscdk.services.batch.CfnJobDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.batch.CfnJobDefinition
  }

  /**
   * The authorization configuration details for the Amazon EFS file system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * AuthorizationConfigProperty authorizationConfigProperty = AuthorizationConfigProperty.builder()
   * .accessPointId("accessPointId")
   * .iam("iam")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-authorizationconfig.html)
   */
  public interface AuthorizationConfigProperty {
    /**
     * The Amazon EFS access point ID to use.
     *
     * If an access point is specified, the root directory value specified in the
     * `EFSVolumeConfiguration` must either be omitted or set to `/` which enforces the path set on the
     * EFS access point. If an access point is used, transit encryption must be enabled in the
     * `EFSVolumeConfiguration` . For more information, see [Working with Amazon EFS access
     * points](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html) in the *Amazon Elastic
     * File System User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-authorizationconfig.html#cfn-batch-jobdefinition-authorizationconfig-accesspointid)
     */
    public fun accessPointId(): String? = unwrap(this).getAccessPointId()

    /**
     * Whether or not to use the AWS Batch job IAM role defined in a job definition when mounting
     * the Amazon EFS file system.
     *
     * If enabled, transit encryption must be enabled in the `EFSVolumeConfiguration` . If this
     * parameter is omitted, the default value of `DISABLED` is used. For more information, see [Using
     * Amazon EFS access
     * points](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html#efs-volume-accesspoints)
     * in the *AWS Batch User Guide* . EFS IAM authorization requires that `TransitEncryption` be
     * `ENABLED` and that a `JobRoleArn` is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-authorizationconfig.html#cfn-batch-jobdefinition-authorizationconfig-iam)
     */
    public fun iam(): String? = unwrap(this).getIam()

    /**
     * A builder for [AuthorizationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessPointId The Amazon EFS access point ID to use.
       * If an access point is specified, the root directory value specified in the
       * `EFSVolumeConfiguration` must either be omitted or set to `/` which enforces the path set on
       * the EFS access point. If an access point is used, transit encryption must be enabled in the
       * `EFSVolumeConfiguration` . For more information, see [Working with Amazon EFS access
       * points](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html) in the *Amazon
       * Elastic File System User Guide* .
       */
      public fun accessPointId(accessPointId: String)

      /**
       * @param iam Whether or not to use the AWS Batch job IAM role defined in a job definition
       * when mounting the Amazon EFS file system.
       * If enabled, transit encryption must be enabled in the `EFSVolumeConfiguration` . If this
       * parameter is omitted, the default value of `DISABLED` is used. For more information, see
       * [Using Amazon EFS access
       * points](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html#efs-volume-accesspoints)
       * in the *AWS Batch User Guide* . EFS IAM authorization requires that `TransitEncryption` be
       * `ENABLED` and that a `JobRoleArn` is specified.
       */
      public fun iam(iam: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty.builder()

      /**
       * @param accessPointId The Amazon EFS access point ID to use.
       * If an access point is specified, the root directory value specified in the
       * `EFSVolumeConfiguration` must either be omitted or set to `/` which enforces the path set on
       * the EFS access point. If an access point is used, transit encryption must be enabled in the
       * `EFSVolumeConfiguration` . For more information, see [Working with Amazon EFS access
       * points](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html) in the *Amazon
       * Elastic File System User Guide* .
       */
      override fun accessPointId(accessPointId: String) {
        cdkBuilder.accessPointId(accessPointId)
      }

      /**
       * @param iam Whether or not to use the AWS Batch job IAM role defined in a job definition
       * when mounting the Amazon EFS file system.
       * If enabled, transit encryption must be enabled in the `EFSVolumeConfiguration` . If this
       * parameter is omitted, the default value of `DISABLED` is used. For more information, see
       * [Using Amazon EFS access
       * points](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html#efs-volume-accesspoints)
       * in the *AWS Batch User Guide* . EFS IAM authorization requires that `TransitEncryption` be
       * `ENABLED` and that a `JobRoleArn` is specified.
       */
      override fun iam(iam: String) {
        cdkBuilder.iam(iam)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty,
    ) : CdkObject(cdkObject), AuthorizationConfigProperty {
      /**
       * The Amazon EFS access point ID to use.
       *
       * If an access point is specified, the root directory value specified in the
       * `EFSVolumeConfiguration` must either be omitted or set to `/` which enforces the path set on
       * the EFS access point. If an access point is used, transit encryption must be enabled in the
       * `EFSVolumeConfiguration` . For more information, see [Working with Amazon EFS access
       * points](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html) in the *Amazon
       * Elastic File System User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-authorizationconfig.html#cfn-batch-jobdefinition-authorizationconfig-accesspointid)
       */
      override fun accessPointId(): String? = unwrap(this).getAccessPointId()

      /**
       * Whether or not to use the AWS Batch job IAM role defined in a job definition when mounting
       * the Amazon EFS file system.
       *
       * If enabled, transit encryption must be enabled in the `EFSVolumeConfiguration` . If this
       * parameter is omitted, the default value of `DISABLED` is used. For more information, see
       * [Using Amazon EFS access
       * points](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html#efs-volume-accesspoints)
       * in the *AWS Batch User Guide* . EFS IAM authorization requires that `TransitEncryption` be
       * `ENABLED` and that a `JobRoleArn` is specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-authorizationconfig.html#cfn-batch-jobdefinition-authorizationconfig-iam)
       */
      override fun iam(): String? = unwrap(this).getIam()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty):
          AuthorizationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuthorizationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthorizationConfigProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty
    }
  }

  /**
   * Container properties are used for Amazon ECS based job definitions.
   *
   * These properties to describe the container that's launched as part of a job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * Object options;
   * ContainerPropertiesProperty containerPropertiesProperty = ContainerPropertiesProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .command(List.of("command"))
   * .environment(List.of(EnvironmentProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .ephemeralStorage(EphemeralStorageProperty.builder()
   * .sizeInGiB(123)
   * .build())
   * .executionRoleArn("executionRoleArn")
   * .fargatePlatformConfiguration(FargatePlatformConfigurationProperty.builder()
   * .platformVersion("platformVersion")
   * .build())
   * .instanceType("instanceType")
   * .jobRoleArn("jobRoleArn")
   * .linuxParameters(LinuxParametersProperty.builder()
   * .devices(List.of(DeviceProperty.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * .permissions(List.of("permissions"))
   * .build()))
   * .initProcessEnabled(false)
   * .maxSwap(123)
   * .sharedMemorySize(123)
   * .swappiness(123)
   * .tmpfs(List.of(TmpfsProperty.builder()
   * .containerPath("containerPath")
   * .size(123)
   * // the properties below are optional
   * .mountOptions(List.of("mountOptions"))
   * .build()))
   * .build())
   * .logConfiguration(LogConfigurationProperty.builder()
   * .logDriver("logDriver")
   * // the properties below are optional
   * .options(options)
   * .secretOptions(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .build())
   * .memory(123)
   * .mountPoints(List.of(MountPointsProperty.builder()
   * .containerPath("containerPath")
   * .readOnly(false)
   * .sourceVolume("sourceVolume")
   * .build()))
   * .networkConfiguration(NetworkConfigurationProperty.builder()
   * .assignPublicIp("assignPublicIp")
   * .build())
   * .privileged(false)
   * .readonlyRootFilesystem(false)
   * .repositoryCredentials(RepositoryCredentialsProperty.builder()
   * .credentialsParameter("credentialsParameter")
   * .build())
   * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
   * .type("type")
   * .value("value")
   * .build()))
   * .runtimePlatform(RuntimePlatformProperty.builder()
   * .cpuArchitecture("cpuArchitecture")
   * .operatingSystemFamily("operatingSystemFamily")
   * .build())
   * .secrets(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .ulimits(List.of(UlimitProperty.builder()
   * .hardLimit(123)
   * .name("name")
   * .softLimit(123)
   * .build()))
   * .user("user")
   * .vcpus(123)
   * .volumes(List.of(VolumesProperty.builder()
   * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
   * .fileSystemId("fileSystemId")
   * // the properties below are optional
   * .authorizationConfig(AuthorizationConfigProperty.builder()
   * .accessPointId("accessPointId")
   * .iam("iam")
   * .build())
   * .rootDirectory("rootDirectory")
   * .transitEncryption("transitEncryption")
   * .transitEncryptionPort(123)
   * .build())
   * .host(VolumesHostProperty.builder()
   * .sourcePath("sourcePath")
   * .build())
   * .name("name")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html)
   */
  public interface ContainerPropertiesProperty {
    /**
     * The command that's passed to the container.
     *
     * This parameter maps to `Cmd` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `COMMAND`
     * parameter to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . For more
     * information, see
     * [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-command)
     */
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The environment variables to pass to a container.
     *
     * This parameter maps to `Env` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--env`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *
     *
     * We don't recommend using plaintext environment variables for sensitive information, such as
     * credential data. &gt; Environment variables cannot start with " `AWS_BATCH` ". This naming
     * convention is reserved for variables that AWS Batch sets.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * The amount of ephemeral storage to allocate for the task.
     *
     * This parameter is used to expand the total amount of ephemeral storage available, beyond the
     * default amount, for tasks hosted on AWS Fargate .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ephemeralstorage)
     */
    public fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

    /**
     * The Amazon Resource Name (ARN) of the execution role that AWS Batch can assume.
     *
     * For jobs that run on Fargate resources, you must provide an execution role. For more
     * information, see [AWS Batch execution IAM
     * role](https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html) in the *AWS
     * Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-executionrolearn)
     */
    public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    /**
     * The platform configuration for jobs that are running on Fargate resources.
     *
     * Jobs that are running on Amazon EC2 resources must not specify this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-fargateplatformconfiguration)
     */
    public fun fargatePlatformConfiguration(): Any? = unwrap(this).getFargatePlatformConfiguration()

    /**
     * Required.
     *
     * The image used to start a container. This string is passed directly to the Docker daemon.
     * Images in the Docker Hub registry are available by default. Other repositories are specified
     * with `*repository-url* / *image* : *tag*` . It can be 255 characters long. It can contain
     * uppercase and lowercase letters, numbers, hyphens (-), underscores (_), colons (:), periods (.),
     * forward slashes (/), and number signs (#). This parameter maps to `Image` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `IMAGE`
     * parameter of [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *
     *
     * Docker image architecture must match the processor architecture of the compute resources that
     * they're scheduled on. For example, ARM-based Docker images can only run on ARM-based compute
     * resources.
     *
     *
     * * Images in Amazon ECR Public repositories use the full `registry/repository[:tag]` or
     * `registry/repository[&#64;digest]` naming conventions. For example, `public.ecr.aws/
     * *registry_alias* / *my-web-app* : *latest*` .
     * * Images in Amazon ECR repositories use the full registry and repository URI (for example,
     * `123456789012.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;` ).
     * * Images in official repositories on Docker Hub use a single name (for example, `ubuntu` or
     * `mongo` ).
     * * Images in other repositories on Docker Hub are qualified with an organization name (for
     * example, `amazon/amazon-ecs-agent` ).
     * * Images in other online repositories are qualified further by a domain name (for example,
     * `quay.io/assemblyline/ubuntu` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-image)
     */
    public fun image(): String

    /**
     * The instance type to use for a multi-node parallel job.
     *
     * All node groups in a multi-node parallel job must use the same instance type.
     *
     *
     * This parameter isn't applicable to single-node container jobs or jobs that run on Fargate
     * resources, and shouldn't be provided.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that the container can assume for AWS
     * permissions.
     *
     * For more information, see [IAM roles for
     * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-jobrolearn)
     */
    public fun jobRoleArn(): String? = unwrap(this).getJobRoleArn()

    /**
     * Linux-specific modifications that are applied to the container, such as details for device
     * mappings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-linuxparameters)
     */
    public fun linuxParameters(): Any? = unwrap(this).getLinuxParameters()

    /**
     * The log configuration specification for the container.
     *
     * This parameter maps to `LogConfig` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
     * `--log-driver` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
     * containers use the same logging driver that the Docker daemon uses. However the container might
     * use a different logging driver than the Docker daemon by specifying a log driver with this
     * parameter in the container definition. To use a different logging driver for a container, the
     * log system must be configured properly on the container instance (or on a different log server
     * for remote logging options). For more information on the options for different supported log
     * drivers, see [Configure logging
     * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/) in
     * the Docker documentation.
     *
     *
     * AWS Batch currently supports a subset of the logging drivers available to the Docker daemon
     * (shown in the
     * [LogConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-logconfiguration.html)
     * data type).
     *
     *
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container instance, log in to your
     * container instance and run the following command: `sudo docker version | grep "Server API
     * version"`
     *
     *
     * The Amazon ECS container agent running on a container instance must register the logging
     * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment variable
     * before containers placed on that instance can use these log configuration options. For more
     * information, see [Amazon ECS container agent
     * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-logconfiguration)
     */
    public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    /**
     * This parameter is deprecated, use `resourceRequirements` to specify the memory requirements
     * for the job definition.
     *
     * It's not supported for jobs running on Fargate resources. For jobs that run on Amazon EC2
     * resources, it specifies the memory hard limit (in MiB) for a container. If your container
     * attempts to exceed the specified number, it's terminated. You must specify at least 4 MiB of
     * memory for a job using this parameter. The memory hard limit can be specified in several places.
     * It must be specified for each node at least once.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-memory)
     */
    public fun memory(): Number? = unwrap(this).getMemory()

    /**
     * The mount points for data volumes in your container.
     *
     * This parameter maps to `Volumes` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--volume`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-mountpoints)
     */
    public fun mountPoints(): Any? = unwrap(this).getMountPoints()

    /**
     * The network configuration for jobs that are running on Fargate resources.
     *
     * Jobs that are running on Amazon EC2 resources must not specify this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-networkconfiguration)
     */
    public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    /**
     * When this parameter is true, the container is given elevated permissions on the host
     * container instance (similar to the `root` user).
     *
     * This parameter maps to `Privileged` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
     * `--privileged` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . The default
     * value is false.
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
     * be provided, or specified as false.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-privileged)
     */
    public fun privileged(): Any? = unwrap(this).getPrivileged()

    /**
     * When this parameter is true, the container is given read-only access to its root file system.
     *
     * This parameter maps to `ReadonlyRootfs` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
     * `--read-only` option to `docker run` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-readonlyrootfilesystem)
     */
    public fun readonlyRootFilesystem(): Any? = unwrap(this).getReadonlyRootFilesystem()

    /**
     * The private repository authentication credentials to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-repositorycredentials)
     */
    public fun repositoryCredentials(): Any? = unwrap(this).getRepositoryCredentials()

    /**
     * The type and amount of resources to assign to a container.
     *
     * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-resourcerequirements)
     */
    public fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

    /**
     * An object that represents the compute environment architecture for AWS Batch jobs on Fargate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-runtimeplatform)
     */
    public fun runtimePlatform(): Any? = unwrap(this).getRuntimePlatform()

    /**
     * The secrets for the container.
     *
     * For more information, see [Specifying sensitive
     * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in the
     * *AWS Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-secrets)
     */
    public fun secrets(): Any? = unwrap(this).getSecrets()

    /**
     * A list of `ulimits` to set in the container.
     *
     * This parameter maps to `Ulimits` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--ulimit`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
     * be provided.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ulimits)
     */
    public fun ulimits(): Any? = unwrap(this).getUlimits()

    /**
     * The user name to use inside the container.
     *
     * This parameter maps to `User` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--user`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-user)
     */
    public fun user(): String? = unwrap(this).getUser()

    /**
     * This parameter is deprecated, use `resourceRequirements` to specify the vCPU requirements for
     * the job definition.
     *
     * It's not supported for jobs running on Fargate resources. For jobs running on Amazon EC2
     * resources, it specifies the number of vCPUs reserved for the job.
     *
     * Each vCPU is equivalent to 1,024 CPU shares. This parameter maps to `CpuShares` in the
     * [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
     * `--cpu-shares` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . The number of
     * vCPUs must be specified but can be specified in several places. You must specify it at least
     * once for each node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-vcpus)
     */
    public fun vcpus(): Number? = unwrap(this).getVcpus()

    /**
     * A list of data volumes used in a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-volumes)
     */
    public fun volumes(): Any? = unwrap(this).getVolumes()

    /**
     * A builder for [ContainerPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param command The command that's passed to the container.
       * This parameter maps to `Cmd` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `COMMAND`
       * parameter to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . For more
       * information, see
       * [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
       * .
       */
      public fun command(command: List<String>)

      /**
       * @param command The command that's passed to the container.
       * This parameter maps to `Cmd` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `COMMAND`
       * parameter to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . For more
       * information, see
       * [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
       * .
       */
      public fun command(vararg command: String)

      /**
       * @param environment The environment variables to pass to a container.
       * This parameter maps to `Env` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--env`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * We don't recommend using plaintext environment variables for sensitive information, such as
       * credential data. &gt; Environment variables cannot start with " `AWS_BATCH` ". This naming
       * convention is reserved for variables that AWS Batch sets.
       */
      public fun environment(environment: IResolvable)

      /**
       * @param environment The environment variables to pass to a container.
       * This parameter maps to `Env` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--env`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * We don't recommend using plaintext environment variables for sensitive information, such as
       * credential data. &gt; Environment variables cannot start with " `AWS_BATCH` ". This naming
       * convention is reserved for variables that AWS Batch sets.
       */
      public fun environment(environment: List<Any>)

      /**
       * @param environment The environment variables to pass to a container.
       * This parameter maps to `Env` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--env`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * We don't recommend using plaintext environment variables for sensitive information, such as
       * credential data. &gt; Environment variables cannot start with " `AWS_BATCH` ". This naming
       * convention is reserved for variables that AWS Batch sets.
       */
      public fun environment(vararg environment: Any)

      /**
       * @param ephemeralStorage The amount of ephemeral storage to allocate for the task.
       * This parameter is used to expand the total amount of ephemeral storage available, beyond
       * the default amount, for tasks hosted on AWS Fargate .
       */
      public fun ephemeralStorage(ephemeralStorage: IResolvable)

      /**
       * @param ephemeralStorage The amount of ephemeral storage to allocate for the task.
       * This parameter is used to expand the total amount of ephemeral storage available, beyond
       * the default amount, for tasks hosted on AWS Fargate .
       */
      public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty)

      /**
       * @param ephemeralStorage The amount of ephemeral storage to allocate for the task.
       * This parameter is used to expand the total amount of ephemeral storage available, beyond
       * the default amount, for tasks hosted on AWS Fargate .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98e73378b595cc6c4fca0e6da600a4089f07dd3af9b2f35cdfc34ec6ec42961c")
      public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit)

      /**
       * @param executionRoleArn The Amazon Resource Name (ARN) of the execution role that AWS Batch
       * can assume.
       * For jobs that run on Fargate resources, you must provide an execution role. For more
       * information, see [AWS Batch execution IAM
       * role](https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html) in the *AWS
       * Batch User Guide* .
       */
      public fun executionRoleArn(executionRoleArn: String)

      /**
       * @param fargatePlatformConfiguration The platform configuration for jobs that are running on
       * Fargate resources.
       * Jobs that are running on Amazon EC2 resources must not specify this parameter.
       */
      public fun fargatePlatformConfiguration(fargatePlatformConfiguration: IResolvable)

      /**
       * @param fargatePlatformConfiguration The platform configuration for jobs that are running on
       * Fargate resources.
       * Jobs that are running on Amazon EC2 resources must not specify this parameter.
       */
      public
          fun fargatePlatformConfiguration(fargatePlatformConfiguration: FargatePlatformConfigurationProperty)

      /**
       * @param fargatePlatformConfiguration The platform configuration for jobs that are running on
       * Fargate resources.
       * Jobs that are running on Amazon EC2 resources must not specify this parameter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9b52813c7c400f8615b05a91517e932b2efc31357ada779b753a705e1f3a3f4")
      public
          fun fargatePlatformConfiguration(fargatePlatformConfiguration: FargatePlatformConfigurationProperty.Builder.() -> Unit)

      /**
       * @param image Required. 
       * The image used to start a container. This string is passed directly to the Docker daemon.
       * Images in the Docker Hub registry are available by default. Other repositories are specified
       * with `*repository-url* / *image* : *tag*` . It can be 255 characters long. It can contain
       * uppercase and lowercase letters, numbers, hyphens (-), underscores (_), colons (:), periods
       * (.), forward slashes (/), and number signs (#). This parameter maps to `Image` in the [Create
       * a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `IMAGE`
       * parameter of [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * Docker image architecture must match the processor architecture of the compute resources
       * that they're scheduled on. For example, ARM-based Docker images can only run on ARM-based
       * compute resources.
       *
       *
       * * Images in Amazon ECR Public repositories use the full `registry/repository[:tag]` or
       * `registry/repository[&#64;digest]` naming conventions. For example, `public.ecr.aws/
       * *registry_alias* / *my-web-app* : *latest*` .
       * * Images in Amazon ECR repositories use the full registry and repository URI (for example,
       * `123456789012.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;` ).
       * * Images in official repositories on Docker Hub use a single name (for example, `ubuntu` or
       * `mongo` ).
       * * Images in other repositories on Docker Hub are qualified with an organization name (for
       * example, `amazon/amazon-ecs-agent` ).
       * * Images in other online repositories are qualified further by a domain name (for example,
       * `quay.io/assemblyline/ubuntu` ).
       */
      public fun image(image: String)

      /**
       * @param instanceType The instance type to use for a multi-node parallel job.
       * All node groups in a multi-node parallel job must use the same instance type.
       *
       *
       * This parameter isn't applicable to single-node container jobs or jobs that run on Fargate
       * resources, and shouldn't be provided.
       */
      public fun instanceType(instanceType: String)

      /**
       * @param jobRoleArn The Amazon Resource Name (ARN) of the IAM role that the container can
       * assume for AWS permissions.
       * For more information, see [IAM roles for
       * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       */
      public fun jobRoleArn(jobRoleArn: String)

      /**
       * @param linuxParameters Linux-specific modifications that are applied to the container, such
       * as details for device mappings.
       */
      public fun linuxParameters(linuxParameters: IResolvable)

      /**
       * @param linuxParameters Linux-specific modifications that are applied to the container, such
       * as details for device mappings.
       */
      public fun linuxParameters(linuxParameters: LinuxParametersProperty)

      /**
       * @param linuxParameters Linux-specific modifications that are applied to the container, such
       * as details for device mappings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("905b256d03d629094b0c74f3b07a1e527b0a9c3cae07b007bbf275f17b10489c")
      public fun linuxParameters(linuxParameters: LinuxParametersProperty.Builder.() -> Unit)

      /**
       * @param logConfiguration The log configuration specification for the container.
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--log-driver` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
       * containers use the same logging driver that the Docker daemon uses. However the container
       * might use a different logging driver than the Docker daemon by specifying a log driver with
       * this parameter in the container definition. To use a different logging driver for a container,
       * the log system must be configured properly on the container instance (or on a different log
       * server for remote logging options). For more information on the options for different
       * supported log drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
       *
       *
       * AWS Batch currently supports a subset of the logging drivers available to the Docker daemon
       * (shown in the
       * [LogConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-logconfiguration.html)
       * data type).
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       *
       *
       * The Amazon ECS container agent running on a container instance must register the logging
       * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS container agent
       * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun logConfiguration(logConfiguration: IResolvable)

      /**
       * @param logConfiguration The log configuration specification for the container.
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--log-driver` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
       * containers use the same logging driver that the Docker daemon uses. However the container
       * might use a different logging driver than the Docker daemon by specifying a log driver with
       * this parameter in the container definition. To use a different logging driver for a container,
       * the log system must be configured properly on the container instance (or on a different log
       * server for remote logging options). For more information on the options for different
       * supported log drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
       *
       *
       * AWS Batch currently supports a subset of the logging drivers available to the Docker daemon
       * (shown in the
       * [LogConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-logconfiguration.html)
       * data type).
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       *
       *
       * The Amazon ECS container agent running on a container instance must register the logging
       * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS container agent
       * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun logConfiguration(logConfiguration: LogConfigurationProperty)

      /**
       * @param logConfiguration The log configuration specification for the container.
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--log-driver` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
       * containers use the same logging driver that the Docker daemon uses. However the container
       * might use a different logging driver than the Docker daemon by specifying a log driver with
       * this parameter in the container definition. To use a different logging driver for a container,
       * the log system must be configured properly on the container instance (or on a different log
       * server for remote logging options). For more information on the options for different
       * supported log drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
       *
       *
       * AWS Batch currently supports a subset of the logging drivers available to the Docker daemon
       * (shown in the
       * [LogConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-logconfiguration.html)
       * data type).
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       *
       *
       * The Amazon ECS container agent running on a container instance must register the logging
       * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS container agent
       * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cfa04ac24a26fb769b04d9a76d721780cf2939be5672d1c633390d17d911abdc")
      public fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit)

      /**
       * @param memory This parameter is deprecated, use `resourceRequirements` to specify the
       * memory requirements for the job definition.
       * It's not supported for jobs running on Fargate resources. For jobs that run on Amazon EC2
       * resources, it specifies the memory hard limit (in MiB) for a container. If your container
       * attempts to exceed the specified number, it's terminated. You must specify at least 4 MiB of
       * memory for a job using this parameter. The memory hard limit can be specified in several
       * places. It must be specified for each node at least once.
       */
      public fun memory(memory: Number)

      /**
       * @param mountPoints The mount points for data volumes in your container.
       * This parameter maps to `Volumes` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--volume`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       */
      public fun mountPoints(mountPoints: IResolvable)

      /**
       * @param mountPoints The mount points for data volumes in your container.
       * This parameter maps to `Volumes` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--volume`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       */
      public fun mountPoints(mountPoints: List<Any>)

      /**
       * @param mountPoints The mount points for data volumes in your container.
       * This parameter maps to `Volumes` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--volume`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       */
      public fun mountPoints(vararg mountPoints: Any)

      /**
       * @param networkConfiguration The network configuration for jobs that are running on Fargate
       * resources.
       * Jobs that are running on Amazon EC2 resources must not specify this parameter.
       */
      public fun networkConfiguration(networkConfiguration: IResolvable)

      /**
       * @param networkConfiguration The network configuration for jobs that are running on Fargate
       * resources.
       * Jobs that are running on Amazon EC2 resources must not specify this parameter.
       */
      public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

      /**
       * @param networkConfiguration The network configuration for jobs that are running on Fargate
       * resources.
       * Jobs that are running on Amazon EC2 resources must not specify this parameter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84646023e3ec8692064dcfb9e9fad69fe2c3e7a874c2a70744d27f577b4c92e0")
      public
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

      /**
       * @param privileged When this parameter is true, the container is given elevated permissions
       * on the host container instance (similar to the `root` user).
       * This parameter maps to `Privileged` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--privileged` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . The default
       * value is false.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided, or specified as false.
       */
      public fun privileged(privileged: Boolean)

      /**
       * @param privileged When this parameter is true, the container is given elevated permissions
       * on the host container instance (similar to the `root` user).
       * This parameter maps to `Privileged` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--privileged` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . The default
       * value is false.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided, or specified as false.
       */
      public fun privileged(privileged: IResolvable)

      /**
       * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
       * access to its root file system.
       * This parameter maps to `ReadonlyRootfs` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--read-only` option to `docker run` .
       */
      public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

      /**
       * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
       * access to its root file system.
       * This parameter maps to `ReadonlyRootfs` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--read-only` option to `docker run` .
       */
      public fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable)

      /**
       * @param repositoryCredentials The private repository authentication credentials to use.
       */
      public fun repositoryCredentials(repositoryCredentials: IResolvable)

      /**
       * @param repositoryCredentials The private repository authentication credentials to use.
       */
      public fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty)

      /**
       * @param repositoryCredentials The private repository authentication credentials to use.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5a5f329b8daae4793f12cdc8e64a0f0ae7ea09fdfb022c71f7da4fb30cd56225")
      public
          fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty.Builder.() -> Unit)

      /**
       * @param resourceRequirements The type and amount of resources to assign to a container.
       * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
       */
      public fun resourceRequirements(resourceRequirements: IResolvable)

      /**
       * @param resourceRequirements The type and amount of resources to assign to a container.
       * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
       */
      public fun resourceRequirements(resourceRequirements: List<Any>)

      /**
       * @param resourceRequirements The type and amount of resources to assign to a container.
       * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
       */
      public fun resourceRequirements(vararg resourceRequirements: Any)

      /**
       * @param runtimePlatform An object that represents the compute environment architecture for
       * AWS Batch jobs on Fargate.
       */
      public fun runtimePlatform(runtimePlatform: IResolvable)

      /**
       * @param runtimePlatform An object that represents the compute environment architecture for
       * AWS Batch jobs on Fargate.
       */
      public fun runtimePlatform(runtimePlatform: RuntimePlatformProperty)

      /**
       * @param runtimePlatform An object that represents the compute environment architecture for
       * AWS Batch jobs on Fargate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0f72a76832d0064469b7780c971fbcac43944532b65a5d2c80f44a35167058d")
      public fun runtimePlatform(runtimePlatform: RuntimePlatformProperty.Builder.() -> Unit)

      /**
       * @param secrets The secrets for the container.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in
       * the *AWS Batch User Guide* .
       */
      public fun secrets(secrets: IResolvable)

      /**
       * @param secrets The secrets for the container.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in
       * the *AWS Batch User Guide* .
       */
      public fun secrets(secrets: List<Any>)

      /**
       * @param secrets The secrets for the container.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in
       * the *AWS Batch User Guide* .
       */
      public fun secrets(vararg secrets: Any)

      /**
       * @param ulimits A list of `ulimits` to set in the container.
       * This parameter maps to `Ulimits` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--ulimit`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided.
       */
      public fun ulimits(ulimits: IResolvable)

      /**
       * @param ulimits A list of `ulimits` to set in the container.
       * This parameter maps to `Ulimits` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--ulimit`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided.
       */
      public fun ulimits(ulimits: List<Any>)

      /**
       * @param ulimits A list of `ulimits` to set in the container.
       * This parameter maps to `Ulimits` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--ulimit`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided.
       */
      public fun ulimits(vararg ulimits: Any)

      /**
       * @param user The user name to use inside the container.
       * This parameter maps to `User` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--user`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       */
      public fun user(user: String)

      /**
       * @param vcpus This parameter is deprecated, use `resourceRequirements` to specify the vCPU
       * requirements for the job definition.
       * It's not supported for jobs running on Fargate resources. For jobs running on Amazon EC2
       * resources, it specifies the number of vCPUs reserved for the job.
       *
       * Each vCPU is equivalent to 1,024 CPU shares. This parameter maps to `CpuShares` in the
       * [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--cpu-shares` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . The number
       * of vCPUs must be specified but can be specified in several places. You must specify it at
       * least once for each node.
       */
      public fun vcpus(vcpus: Number)

      /**
       * @param volumes A list of data volumes used in a job.
       */
      public fun volumes(volumes: IResolvable)

      /**
       * @param volumes A list of data volumes used in a job.
       */
      public fun volumes(volumes: List<Any>)

      /**
       * @param volumes A list of data volumes used in a job.
       */
      public fun volumes(vararg volumes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.builder()

      /**
       * @param command The command that's passed to the container.
       * This parameter maps to `Cmd` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `COMMAND`
       * parameter to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . For more
       * information, see
       * [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
       * .
       */
      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      /**
       * @param command The command that's passed to the container.
       * This parameter maps to `Cmd` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `COMMAND`
       * parameter to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . For more
       * information, see
       * [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
       * .
       */
      override fun command(vararg command: String): Unit = command(command.toList())

      /**
       * @param environment The environment variables to pass to a container.
       * This parameter maps to `Env` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--env`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * We don't recommend using plaintext environment variables for sensitive information, such as
       * credential data. &gt; Environment variables cannot start with " `AWS_BATCH` ". This naming
       * convention is reserved for variables that AWS Batch sets.
       */
      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      /**
       * @param environment The environment variables to pass to a container.
       * This parameter maps to `Env` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--env`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * We don't recommend using plaintext environment variables for sensitive information, such as
       * credential data. &gt; Environment variables cannot start with " `AWS_BATCH` ". This naming
       * convention is reserved for variables that AWS Batch sets.
       */
      override fun environment(environment: List<Any>) {
        cdkBuilder.environment(environment)
      }

      /**
       * @param environment The environment variables to pass to a container.
       * This parameter maps to `Env` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--env`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * We don't recommend using plaintext environment variables for sensitive information, such as
       * credential data. &gt; Environment variables cannot start with " `AWS_BATCH` ". This naming
       * convention is reserved for variables that AWS Batch sets.
       */
      override fun environment(vararg environment: Any): Unit = environment(environment.toList())

      /**
       * @param ephemeralStorage The amount of ephemeral storage to allocate for the task.
       * This parameter is used to expand the total amount of ephemeral storage available, beyond
       * the default amount, for tasks hosted on AWS Fargate .
       */
      override fun ephemeralStorage(ephemeralStorage: IResolvable) {
        cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
      }

      /**
       * @param ephemeralStorage The amount of ephemeral storage to allocate for the task.
       * This parameter is used to expand the total amount of ephemeral storage available, beyond
       * the default amount, for tasks hosted on AWS Fargate .
       */
      override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty) {
        cdkBuilder.ephemeralStorage(ephemeralStorage.let(EphemeralStorageProperty::unwrap))
      }

      /**
       * @param ephemeralStorage The amount of ephemeral storage to allocate for the task.
       * This parameter is used to expand the total amount of ephemeral storage available, beyond
       * the default amount, for tasks hosted on AWS Fargate .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98e73378b595cc6c4fca0e6da600a4089f07dd3af9b2f35cdfc34ec6ec42961c")
      override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit):
          Unit = ephemeralStorage(EphemeralStorageProperty(ephemeralStorage))

      /**
       * @param executionRoleArn The Amazon Resource Name (ARN) of the execution role that AWS Batch
       * can assume.
       * For jobs that run on Fargate resources, you must provide an execution role. For more
       * information, see [AWS Batch execution IAM
       * role](https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html) in the *AWS
       * Batch User Guide* .
       */
      override fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
      }

      /**
       * @param fargatePlatformConfiguration The platform configuration for jobs that are running on
       * Fargate resources.
       * Jobs that are running on Amazon EC2 resources must not specify this parameter.
       */
      override fun fargatePlatformConfiguration(fargatePlatformConfiguration: IResolvable) {
        cdkBuilder.fargatePlatformConfiguration(fargatePlatformConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param fargatePlatformConfiguration The platform configuration for jobs that are running on
       * Fargate resources.
       * Jobs that are running on Amazon EC2 resources must not specify this parameter.
       */
      override
          fun fargatePlatformConfiguration(fargatePlatformConfiguration: FargatePlatformConfigurationProperty) {
        cdkBuilder.fargatePlatformConfiguration(fargatePlatformConfiguration.let(FargatePlatformConfigurationProperty::unwrap))
      }

      /**
       * @param fargatePlatformConfiguration The platform configuration for jobs that are running on
       * Fargate resources.
       * Jobs that are running on Amazon EC2 resources must not specify this parameter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9b52813c7c400f8615b05a91517e932b2efc31357ada779b753a705e1f3a3f4")
      override
          fun fargatePlatformConfiguration(fargatePlatformConfiguration: FargatePlatformConfigurationProperty.Builder.() -> Unit):
          Unit =
          fargatePlatformConfiguration(FargatePlatformConfigurationProperty(fargatePlatformConfiguration))

      /**
       * @param image Required. 
       * The image used to start a container. This string is passed directly to the Docker daemon.
       * Images in the Docker Hub registry are available by default. Other repositories are specified
       * with `*repository-url* / *image* : *tag*` . It can be 255 characters long. It can contain
       * uppercase and lowercase letters, numbers, hyphens (-), underscores (_), colons (:), periods
       * (.), forward slashes (/), and number signs (#). This parameter maps to `Image` in the [Create
       * a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `IMAGE`
       * parameter of [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * Docker image architecture must match the processor architecture of the compute resources
       * that they're scheduled on. For example, ARM-based Docker images can only run on ARM-based
       * compute resources.
       *
       *
       * * Images in Amazon ECR Public repositories use the full `registry/repository[:tag]` or
       * `registry/repository[&#64;digest]` naming conventions. For example, `public.ecr.aws/
       * *registry_alias* / *my-web-app* : *latest*` .
       * * Images in Amazon ECR repositories use the full registry and repository URI (for example,
       * `123456789012.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;` ).
       * * Images in official repositories on Docker Hub use a single name (for example, `ubuntu` or
       * `mongo` ).
       * * Images in other repositories on Docker Hub are qualified with an organization name (for
       * example, `amazon/amazon-ecs-agent` ).
       * * Images in other online repositories are qualified further by a domain name (for example,
       * `quay.io/assemblyline/ubuntu` ).
       */
      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      /**
       * @param instanceType The instance type to use for a multi-node parallel job.
       * All node groups in a multi-node parallel job must use the same instance type.
       *
       *
       * This parameter isn't applicable to single-node container jobs or jobs that run on Fargate
       * resources, and shouldn't be provided.
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param jobRoleArn The Amazon Resource Name (ARN) of the IAM role that the container can
       * assume for AWS permissions.
       * For more information, see [IAM roles for
       * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       */
      override fun jobRoleArn(jobRoleArn: String) {
        cdkBuilder.jobRoleArn(jobRoleArn)
      }

      /**
       * @param linuxParameters Linux-specific modifications that are applied to the container, such
       * as details for device mappings.
       */
      override fun linuxParameters(linuxParameters: IResolvable) {
        cdkBuilder.linuxParameters(linuxParameters.let(IResolvable::unwrap))
      }

      /**
       * @param linuxParameters Linux-specific modifications that are applied to the container, such
       * as details for device mappings.
       */
      override fun linuxParameters(linuxParameters: LinuxParametersProperty) {
        cdkBuilder.linuxParameters(linuxParameters.let(LinuxParametersProperty::unwrap))
      }

      /**
       * @param linuxParameters Linux-specific modifications that are applied to the container, such
       * as details for device mappings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("905b256d03d629094b0c74f3b07a1e527b0a9c3cae07b007bbf275f17b10489c")
      override fun linuxParameters(linuxParameters: LinuxParametersProperty.Builder.() -> Unit):
          Unit = linuxParameters(LinuxParametersProperty(linuxParameters))

      /**
       * @param logConfiguration The log configuration specification for the container.
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--log-driver` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
       * containers use the same logging driver that the Docker daemon uses. However the container
       * might use a different logging driver than the Docker daemon by specifying a log driver with
       * this parameter in the container definition. To use a different logging driver for a container,
       * the log system must be configured properly on the container instance (or on a different log
       * server for remote logging options). For more information on the options for different
       * supported log drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
       *
       *
       * AWS Batch currently supports a subset of the logging drivers available to the Docker daemon
       * (shown in the
       * [LogConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-logconfiguration.html)
       * data type).
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       *
       *
       * The Amazon ECS container agent running on a container instance must register the logging
       * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS container agent
       * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param logConfiguration The log configuration specification for the container.
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--log-driver` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
       * containers use the same logging driver that the Docker daemon uses. However the container
       * might use a different logging driver than the Docker daemon by specifying a log driver with
       * this parameter in the container definition. To use a different logging driver for a container,
       * the log system must be configured properly on the container instance (or on a different log
       * server for remote logging options). For more information on the options for different
       * supported log drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
       *
       *
       * AWS Batch currently supports a subset of the logging drivers available to the Docker daemon
       * (shown in the
       * [LogConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-logconfiguration.html)
       * data type).
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       *
       *
       * The Amazon ECS container agent running on a container instance must register the logging
       * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS container agent
       * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun logConfiguration(logConfiguration: LogConfigurationProperty) {
        cdkBuilder.logConfiguration(logConfiguration.let(LogConfigurationProperty::unwrap))
      }

      /**
       * @param logConfiguration The log configuration specification for the container.
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--log-driver` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
       * containers use the same logging driver that the Docker daemon uses. However the container
       * might use a different logging driver than the Docker daemon by specifying a log driver with
       * this parameter in the container definition. To use a different logging driver for a container,
       * the log system must be configured properly on the container instance (or on a different log
       * server for remote logging options). For more information on the options for different
       * supported log drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
       *
       *
       * AWS Batch currently supports a subset of the logging drivers available to the Docker daemon
       * (shown in the
       * [LogConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-logconfiguration.html)
       * data type).
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       *
       *
       * The Amazon ECS container agent running on a container instance must register the logging
       * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS container agent
       * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cfa04ac24a26fb769b04d9a76d721780cf2939be5672d1c633390d17d911abdc")
      override fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit):
          Unit = logConfiguration(LogConfigurationProperty(logConfiguration))

      /**
       * @param memory This parameter is deprecated, use `resourceRequirements` to specify the
       * memory requirements for the job definition.
       * It's not supported for jobs running on Fargate resources. For jobs that run on Amazon EC2
       * resources, it specifies the memory hard limit (in MiB) for a container. If your container
       * attempts to exceed the specified number, it's terminated. You must specify at least 4 MiB of
       * memory for a job using this parameter. The memory hard limit can be specified in several
       * places. It must be specified for each node at least once.
       */
      override fun memory(memory: Number) {
        cdkBuilder.memory(memory)
      }

      /**
       * @param mountPoints The mount points for data volumes in your container.
       * This parameter maps to `Volumes` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--volume`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       */
      override fun mountPoints(mountPoints: IResolvable) {
        cdkBuilder.mountPoints(mountPoints.let(IResolvable::unwrap))
      }

      /**
       * @param mountPoints The mount points for data volumes in your container.
       * This parameter maps to `Volumes` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--volume`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       */
      override fun mountPoints(mountPoints: List<Any>) {
        cdkBuilder.mountPoints(mountPoints)
      }

      /**
       * @param mountPoints The mount points for data volumes in your container.
       * This parameter maps to `Volumes` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--volume`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       */
      override fun mountPoints(vararg mountPoints: Any): Unit = mountPoints(mountPoints.toList())

      /**
       * @param networkConfiguration The network configuration for jobs that are running on Fargate
       * resources.
       * Jobs that are running on Amazon EC2 resources must not specify this parameter.
       */
      override fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param networkConfiguration The network configuration for jobs that are running on Fargate
       * resources.
       * Jobs that are running on Amazon EC2 resources must not specify this parameter.
       */
      override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
      }

      /**
       * @param networkConfiguration The network configuration for jobs that are running on Fargate
       * resources.
       * Jobs that are running on Amazon EC2 resources must not specify this parameter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84646023e3ec8692064dcfb9e9fad69fe2c3e7a874c2a70744d27f577b4c92e0")
      override
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
          Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

      /**
       * @param privileged When this parameter is true, the container is given elevated permissions
       * on the host container instance (similar to the `root` user).
       * This parameter maps to `Privileged` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--privileged` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . The default
       * value is false.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided, or specified as false.
       */
      override fun privileged(privileged: Boolean) {
        cdkBuilder.privileged(privileged)
      }

      /**
       * @param privileged When this parameter is true, the container is given elevated permissions
       * on the host container instance (similar to the `root` user).
       * This parameter maps to `Privileged` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--privileged` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . The default
       * value is false.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided, or specified as false.
       */
      override fun privileged(privileged: IResolvable) {
        cdkBuilder.privileged(privileged.let(IResolvable::unwrap))
      }

      /**
       * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
       * access to its root file system.
       * This parameter maps to `ReadonlyRootfs` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--read-only` option to `docker run` .
       */
      override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
      }

      /**
       * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
       * access to its root file system.
       * This parameter maps to `ReadonlyRootfs` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--read-only` option to `docker run` .
       */
      override fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem.let(IResolvable::unwrap))
      }

      /**
       * @param repositoryCredentials The private repository authentication credentials to use.
       */
      override fun repositoryCredentials(repositoryCredentials: IResolvable) {
        cdkBuilder.repositoryCredentials(repositoryCredentials.let(IResolvable::unwrap))
      }

      /**
       * @param repositoryCredentials The private repository authentication credentials to use.
       */
      override fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty) {
        cdkBuilder.repositoryCredentials(repositoryCredentials.let(RepositoryCredentialsProperty::unwrap))
      }

      /**
       * @param repositoryCredentials The private repository authentication credentials to use.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5a5f329b8daae4793f12cdc8e64a0f0ae7ea09fdfb022c71f7da4fb30cd56225")
      override
          fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty.Builder.() -> Unit):
          Unit = repositoryCredentials(RepositoryCredentialsProperty(repositoryCredentials))

      /**
       * @param resourceRequirements The type and amount of resources to assign to a container.
       * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
       */
      override fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements.let(IResolvable::unwrap))
      }

      /**
       * @param resourceRequirements The type and amount of resources to assign to a container.
       * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
       */
      override fun resourceRequirements(resourceRequirements: List<Any>) {
        cdkBuilder.resourceRequirements(resourceRequirements)
      }

      /**
       * @param resourceRequirements The type and amount of resources to assign to a container.
       * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
       */
      override fun resourceRequirements(vararg resourceRequirements: Any): Unit =
          resourceRequirements(resourceRequirements.toList())

      /**
       * @param runtimePlatform An object that represents the compute environment architecture for
       * AWS Batch jobs on Fargate.
       */
      override fun runtimePlatform(runtimePlatform: IResolvable) {
        cdkBuilder.runtimePlatform(runtimePlatform.let(IResolvable::unwrap))
      }

      /**
       * @param runtimePlatform An object that represents the compute environment architecture for
       * AWS Batch jobs on Fargate.
       */
      override fun runtimePlatform(runtimePlatform: RuntimePlatformProperty) {
        cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatformProperty::unwrap))
      }

      /**
       * @param runtimePlatform An object that represents the compute environment architecture for
       * AWS Batch jobs on Fargate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0f72a76832d0064469b7780c971fbcac43944532b65a5d2c80f44a35167058d")
      override fun runtimePlatform(runtimePlatform: RuntimePlatformProperty.Builder.() -> Unit):
          Unit = runtimePlatform(RuntimePlatformProperty(runtimePlatform))

      /**
       * @param secrets The secrets for the container.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in
       * the *AWS Batch User Guide* .
       */
      override fun secrets(secrets: IResolvable) {
        cdkBuilder.secrets(secrets.let(IResolvable::unwrap))
      }

      /**
       * @param secrets The secrets for the container.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in
       * the *AWS Batch User Guide* .
       */
      override fun secrets(secrets: List<Any>) {
        cdkBuilder.secrets(secrets)
      }

      /**
       * @param secrets The secrets for the container.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in
       * the *AWS Batch User Guide* .
       */
      override fun secrets(vararg secrets: Any): Unit = secrets(secrets.toList())

      /**
       * @param ulimits A list of `ulimits` to set in the container.
       * This parameter maps to `Ulimits` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--ulimit`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided.
       */
      override fun ulimits(ulimits: IResolvable) {
        cdkBuilder.ulimits(ulimits.let(IResolvable::unwrap))
      }

      /**
       * @param ulimits A list of `ulimits` to set in the container.
       * This parameter maps to `Ulimits` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--ulimit`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided.
       */
      override fun ulimits(ulimits: List<Any>) {
        cdkBuilder.ulimits(ulimits)
      }

      /**
       * @param ulimits A list of `ulimits` to set in the container.
       * This parameter maps to `Ulimits` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--ulimit`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided.
       */
      override fun ulimits(vararg ulimits: Any): Unit = ulimits(ulimits.toList())

      /**
       * @param user The user name to use inside the container.
       * This parameter maps to `User` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--user`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       */
      override fun user(user: String) {
        cdkBuilder.user(user)
      }

      /**
       * @param vcpus This parameter is deprecated, use `resourceRequirements` to specify the vCPU
       * requirements for the job definition.
       * It's not supported for jobs running on Fargate resources. For jobs running on Amazon EC2
       * resources, it specifies the number of vCPUs reserved for the job.
       *
       * Each vCPU is equivalent to 1,024 CPU shares. This parameter maps to `CpuShares` in the
       * [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--cpu-shares` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . The number
       * of vCPUs must be specified but can be specified in several places. You must specify it at
       * least once for each node.
       */
      override fun vcpus(vcpus: Number) {
        cdkBuilder.vcpus(vcpus)
      }

      /**
       * @param volumes A list of data volumes used in a job.
       */
      override fun volumes(volumes: IResolvable) {
        cdkBuilder.volumes(volumes.let(IResolvable::unwrap))
      }

      /**
       * @param volumes A list of data volumes used in a job.
       */
      override fun volumes(volumes: List<Any>) {
        cdkBuilder.volumes(volumes)
      }

      /**
       * @param volumes A list of data volumes used in a job.
       */
      override fun volumes(vararg volumes: Any): Unit = volumes(volumes.toList())

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty,
    ) : CdkObject(cdkObject), ContainerPropertiesProperty {
      /**
       * The command that's passed to the container.
       *
       * This parameter maps to `Cmd` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `COMMAND`
       * parameter to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . For more
       * information, see
       * [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-command)
       */
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      /**
       * The environment variables to pass to a container.
       *
       * This parameter maps to `Env` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--env`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * We don't recommend using plaintext environment variables for sensitive information, such as
       * credential data. &gt; Environment variables cannot start with " `AWS_BATCH` ". This naming
       * convention is reserved for variables that AWS Batch sets.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * The amount of ephemeral storage to allocate for the task.
       *
       * This parameter is used to expand the total amount of ephemeral storage available, beyond
       * the default amount, for tasks hosted on AWS Fargate .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ephemeralstorage)
       */
      override fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

      /**
       * The Amazon Resource Name (ARN) of the execution role that AWS Batch can assume.
       *
       * For jobs that run on Fargate resources, you must provide an execution role. For more
       * information, see [AWS Batch execution IAM
       * role](https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html) in the *AWS
       * Batch User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-executionrolearn)
       */
      override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

      /**
       * The platform configuration for jobs that are running on Fargate resources.
       *
       * Jobs that are running on Amazon EC2 resources must not specify this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-fargateplatformconfiguration)
       */
      override fun fargatePlatformConfiguration(): Any? =
          unwrap(this).getFargatePlatformConfiguration()

      /**
       * Required.
       *
       * The image used to start a container. This string is passed directly to the Docker daemon.
       * Images in the Docker Hub registry are available by default. Other repositories are specified
       * with `*repository-url* / *image* : *tag*` . It can be 255 characters long. It can contain
       * uppercase and lowercase letters, numbers, hyphens (-), underscores (_), colons (:), periods
       * (.), forward slashes (/), and number signs (#). This parameter maps to `Image` in the [Create
       * a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `IMAGE`
       * parameter of [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * Docker image architecture must match the processor architecture of the compute resources
       * that they're scheduled on. For example, ARM-based Docker images can only run on ARM-based
       * compute resources.
       *
       *
       * * Images in Amazon ECR Public repositories use the full `registry/repository[:tag]` or
       * `registry/repository[&#64;digest]` naming conventions. For example, `public.ecr.aws/
       * *registry_alias* / *my-web-app* : *latest*` .
       * * Images in Amazon ECR repositories use the full registry and repository URI (for example,
       * `123456789012.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;` ).
       * * Images in official repositories on Docker Hub use a single name (for example, `ubuntu` or
       * `mongo` ).
       * * Images in other repositories on Docker Hub are qualified with an organization name (for
       * example, `amazon/amazon-ecs-agent` ).
       * * Images in other online repositories are qualified further by a domain name (for example,
       * `quay.io/assemblyline/ubuntu` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-image)
       */
      override fun image(): String = unwrap(this).getImage()

      /**
       * The instance type to use for a multi-node parallel job.
       *
       * All node groups in a multi-node parallel job must use the same instance type.
       *
       *
       * This parameter isn't applicable to single-node container jobs or jobs that run on Fargate
       * resources, and shouldn't be provided.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      /**
       * The Amazon Resource Name (ARN) of the IAM role that the container can assume for AWS
       * permissions.
       *
       * For more information, see [IAM roles for
       * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-jobrolearn)
       */
      override fun jobRoleArn(): String? = unwrap(this).getJobRoleArn()

      /**
       * Linux-specific modifications that are applied to the container, such as details for device
       * mappings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-linuxparameters)
       */
      override fun linuxParameters(): Any? = unwrap(this).getLinuxParameters()

      /**
       * The log configuration specification for the container.
       *
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--log-driver` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
       * containers use the same logging driver that the Docker daemon uses. However the container
       * might use a different logging driver than the Docker daemon by specifying a log driver with
       * this parameter in the container definition. To use a different logging driver for a container,
       * the log system must be configured properly on the container instance (or on a different log
       * server for remote logging options). For more information on the options for different
       * supported log drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
       *
       *
       * AWS Batch currently supports a subset of the logging drivers available to the Docker daemon
       * (shown in the
       * [LogConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-logconfiguration.html)
       * data type).
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       *
       *
       * The Amazon ECS container agent running on a container instance must register the logging
       * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS container agent
       * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-logconfiguration)
       */
      override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

      /**
       * This parameter is deprecated, use `resourceRequirements` to specify the memory requirements
       * for the job definition.
       *
       * It's not supported for jobs running on Fargate resources. For jobs that run on Amazon EC2
       * resources, it specifies the memory hard limit (in MiB) for a container. If your container
       * attempts to exceed the specified number, it's terminated. You must specify at least 4 MiB of
       * memory for a job using this parameter. The memory hard limit can be specified in several
       * places. It must be specified for each node at least once.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-memory)
       */
      override fun memory(): Number? = unwrap(this).getMemory()

      /**
       * The mount points for data volumes in your container.
       *
       * This parameter maps to `Volumes` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--volume`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-mountpoints)
       */
      override fun mountPoints(): Any? = unwrap(this).getMountPoints()

      /**
       * The network configuration for jobs that are running on Fargate resources.
       *
       * Jobs that are running on Amazon EC2 resources must not specify this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-networkconfiguration)
       */
      override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

      /**
       * When this parameter is true, the container is given elevated permissions on the host
       * container instance (similar to the `root` user).
       *
       * This parameter maps to `Privileged` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--privileged` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . The default
       * value is false.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided, or specified as false.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-privileged)
       */
      override fun privileged(): Any? = unwrap(this).getPrivileged()

      /**
       * When this parameter is true, the container is given read-only access to its root file
       * system.
       *
       * This parameter maps to `ReadonlyRootfs` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--read-only` option to `docker run` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-readonlyrootfilesystem)
       */
      override fun readonlyRootFilesystem(): Any? = unwrap(this).getReadonlyRootFilesystem()

      /**
       * The private repository authentication credentials to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-repositorycredentials)
       */
      override fun repositoryCredentials(): Any? = unwrap(this).getRepositoryCredentials()

      /**
       * The type and amount of resources to assign to a container.
       *
       * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-resourcerequirements)
       */
      override fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

      /**
       * An object that represents the compute environment architecture for AWS Batch jobs on
       * Fargate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-runtimeplatform)
       */
      override fun runtimePlatform(): Any? = unwrap(this).getRuntimePlatform()

      /**
       * The secrets for the container.
       *
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in
       * the *AWS Batch User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-secrets)
       */
      override fun secrets(): Any? = unwrap(this).getSecrets()

      /**
       * A list of `ulimits` to set in the container.
       *
       * This parameter maps to `Ulimits` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--ulimit`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ulimits)
       */
      override fun ulimits(): Any? = unwrap(this).getUlimits()

      /**
       * The user name to use inside the container.
       *
       * This parameter maps to `User` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--user`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-user)
       */
      override fun user(): String? = unwrap(this).getUser()

      /**
       * This parameter is deprecated, use `resourceRequirements` to specify the vCPU requirements
       * for the job definition.
       *
       * It's not supported for jobs running on Fargate resources. For jobs running on Amazon EC2
       * resources, it specifies the number of vCPUs reserved for the job.
       *
       * Each vCPU is equivalent to 1,024 CPU shares. This parameter maps to `CpuShares` in the
       * [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--cpu-shares` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . The number
       * of vCPUs must be specified but can be specified in several places. You must specify it at
       * least once for each node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-vcpus)
       */
      override fun vcpus(): Number? = unwrap(this).getVcpus()

      /**
       * A list of data volumes used in a job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-volumes)
       */
      override fun volumes(): Any? = unwrap(this).getVolumes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty):
          ContainerPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContainerPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerPropertiesProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty
    }
  }

  /**
   * An object that represents a container instance host device.
   *
   *
   * This object isn't applicable to jobs that are running on Fargate resources and shouldn't be
   * provided.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * DeviceProperty deviceProperty = DeviceProperty.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * .permissions(List.of("permissions"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html)
   */
  public interface DeviceProperty {
    /**
     * The path inside the container that's used to expose the host device.
     *
     * By default, the `hostPath` value is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-containerpath)
     */
    public fun containerPath(): String? = unwrap(this).getContainerPath()

    /**
     * The path for the device on the host container instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-hostpath)
     */
    public fun hostPath(): String? = unwrap(this).getHostPath()

    /**
     * The explicit permissions to provide to the container for the device.
     *
     * By default, the container has permissions for `read` , `write` , and `mknod` for the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-permissions)
     */
    public fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

    /**
     * A builder for [DeviceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerPath The path inside the container that's used to expose the host device.
       * By default, the `hostPath` value is used.
       */
      public fun containerPath(containerPath: String)

      /**
       * @param hostPath The path for the device on the host container instance.
       */
      public fun hostPath(hostPath: String)

      /**
       * @param permissions The explicit permissions to provide to the container for the device.
       * By default, the container has permissions for `read` , `write` , and `mknod` for the
       * device.
       */
      public fun permissions(permissions: List<String>)

      /**
       * @param permissions The explicit permissions to provide to the container for the device.
       * By default, the container has permissions for `read` , `write` , and `mknod` for the
       * device.
       */
      public fun permissions(vararg permissions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty.builder()

      /**
       * @param containerPath The path inside the container that's used to expose the host device.
       * By default, the `hostPath` value is used.
       */
      override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      /**
       * @param hostPath The path for the device on the host container instance.
       */
      override fun hostPath(hostPath: String) {
        cdkBuilder.hostPath(hostPath)
      }

      /**
       * @param permissions The explicit permissions to provide to the container for the device.
       * By default, the container has permissions for `read` , `write` , and `mknod` for the
       * device.
       */
      override fun permissions(permissions: List<String>) {
        cdkBuilder.permissions(permissions)
      }

      /**
       * @param permissions The explicit permissions to provide to the container for the device.
       * By default, the container has permissions for `read` , `write` , and `mknod` for the
       * device.
       */
      override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty,
    ) : CdkObject(cdkObject), DeviceProperty {
      /**
       * The path inside the container that's used to expose the host device.
       *
       * By default, the `hostPath` value is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-containerpath)
       */
      override fun containerPath(): String? = unwrap(this).getContainerPath()

      /**
       * The path for the device on the host container instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-hostpath)
       */
      override fun hostPath(): String? = unwrap(this).getHostPath()

      /**
       * The explicit permissions to provide to the container for the device.
       *
       * By default, the container has permissions for `read` , `write` , and `mknod` for the
       * device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-permissions)
       */
      override fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty):
          DeviceProperty = CdkObjectWrappers.wrap(cdkObject) as? DeviceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * Object options;
   * EcsPropertiesProperty ecsPropertiesProperty = EcsPropertiesProperty.builder()
   * .taskProperties(List.of(EcsTaskPropertiesProperty.builder()
   * .containers(List.of(TaskContainerPropertiesProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .command(List.of("command"))
   * .dependsOn(List.of(TaskContainerDependencyProperty.builder()
   * .condition("condition")
   * .containerName("containerName")
   * .build()))
   * .environment(List.of(EnvironmentProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .essential(false)
   * .linuxParameters(LinuxParametersProperty.builder()
   * .devices(List.of(DeviceProperty.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * .permissions(List.of("permissions"))
   * .build()))
   * .initProcessEnabled(false)
   * .maxSwap(123)
   * .sharedMemorySize(123)
   * .swappiness(123)
   * .tmpfs(List.of(TmpfsProperty.builder()
   * .containerPath("containerPath")
   * .size(123)
   * // the properties below are optional
   * .mountOptions(List.of("mountOptions"))
   * .build()))
   * .build())
   * .logConfiguration(LogConfigurationProperty.builder()
   * .logDriver("logDriver")
   * // the properties below are optional
   * .options(options)
   * .secretOptions(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .build())
   * .mountPoints(List.of(MountPointsProperty.builder()
   * .containerPath("containerPath")
   * .readOnly(false)
   * .sourceVolume("sourceVolume")
   * .build()))
   * .name("name")
   * .privileged(false)
   * .readonlyRootFilesystem(false)
   * .repositoryCredentials(RepositoryCredentialsProperty.builder()
   * .credentialsParameter("credentialsParameter")
   * .build())
   * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
   * .type("type")
   * .value("value")
   * .build()))
   * .secrets(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .ulimits(List.of(UlimitProperty.builder()
   * .hardLimit(123)
   * .name("name")
   * .softLimit(123)
   * .build()))
   * .user("user")
   * .build()))
   * .ephemeralStorage(EphemeralStorageProperty.builder()
   * .sizeInGiB(123)
   * .build())
   * .executionRoleArn("executionRoleArn")
   * .ipcMode("ipcMode")
   * .networkConfiguration(NetworkConfigurationProperty.builder()
   * .assignPublicIp("assignPublicIp")
   * .build())
   * .pidMode("pidMode")
   * .platformVersion("platformVersion")
   * .runtimePlatform(RuntimePlatformProperty.builder()
   * .cpuArchitecture("cpuArchitecture")
   * .operatingSystemFamily("operatingSystemFamily")
   * .build())
   * .taskRoleArn("taskRoleArn")
   * .volumes(List.of(VolumesProperty.builder()
   * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
   * .fileSystemId("fileSystemId")
   * // the properties below are optional
   * .authorizationConfig(AuthorizationConfigProperty.builder()
   * .accessPointId("accessPointId")
   * .iam("iam")
   * .build())
   * .rootDirectory("rootDirectory")
   * .transitEncryption("transitEncryption")
   * .transitEncryptionPort(123)
   * .build())
   * .host(VolumesHostProperty.builder()
   * .sourcePath("sourcePath")
   * .build())
   * .name("name")
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecsproperties.html)
   */
  public interface EcsPropertiesProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecsproperties.html#cfn-batch-jobdefinition-ecsproperties-taskproperties)
     */
    public fun taskProperties(): Any

    /**
     * A builder for [EcsPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param taskProperties the value to be set. 
       */
      public fun taskProperties(taskProperties: IResolvable)

      /**
       * @param taskProperties the value to be set. 
       */
      public fun taskProperties(taskProperties: List<Any>)

      /**
       * @param taskProperties the value to be set. 
       */
      public fun taskProperties(vararg taskProperties: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EcsPropertiesProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EcsPropertiesProperty.builder()

      /**
       * @param taskProperties the value to be set. 
       */
      override fun taskProperties(taskProperties: IResolvable) {
        cdkBuilder.taskProperties(taskProperties.let(IResolvable::unwrap))
      }

      /**
       * @param taskProperties the value to be set. 
       */
      override fun taskProperties(taskProperties: List<Any>) {
        cdkBuilder.taskProperties(taskProperties)
      }

      /**
       * @param taskProperties the value to be set. 
       */
      override fun taskProperties(vararg taskProperties: Any): Unit =
          taskProperties(taskProperties.toList())

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EcsPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EcsPropertiesProperty,
    ) : CdkObject(cdkObject), EcsPropertiesProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecsproperties.html#cfn-batch-jobdefinition-ecsproperties-taskproperties)
       */
      override fun taskProperties(): Any = unwrap(this).getTaskProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EcsPropertiesProperty):
          EcsPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as? EcsPropertiesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsPropertiesProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EcsPropertiesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.EcsPropertiesProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * Object options;
   * EcsTaskPropertiesProperty ecsTaskPropertiesProperty = EcsTaskPropertiesProperty.builder()
   * .containers(List.of(TaskContainerPropertiesProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .command(List.of("command"))
   * .dependsOn(List.of(TaskContainerDependencyProperty.builder()
   * .condition("condition")
   * .containerName("containerName")
   * .build()))
   * .environment(List.of(EnvironmentProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .essential(false)
   * .linuxParameters(LinuxParametersProperty.builder()
   * .devices(List.of(DeviceProperty.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * .permissions(List.of("permissions"))
   * .build()))
   * .initProcessEnabled(false)
   * .maxSwap(123)
   * .sharedMemorySize(123)
   * .swappiness(123)
   * .tmpfs(List.of(TmpfsProperty.builder()
   * .containerPath("containerPath")
   * .size(123)
   * // the properties below are optional
   * .mountOptions(List.of("mountOptions"))
   * .build()))
   * .build())
   * .logConfiguration(LogConfigurationProperty.builder()
   * .logDriver("logDriver")
   * // the properties below are optional
   * .options(options)
   * .secretOptions(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .build())
   * .mountPoints(List.of(MountPointsProperty.builder()
   * .containerPath("containerPath")
   * .readOnly(false)
   * .sourceVolume("sourceVolume")
   * .build()))
   * .name("name")
   * .privileged(false)
   * .readonlyRootFilesystem(false)
   * .repositoryCredentials(RepositoryCredentialsProperty.builder()
   * .credentialsParameter("credentialsParameter")
   * .build())
   * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
   * .type("type")
   * .value("value")
   * .build()))
   * .secrets(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .ulimits(List.of(UlimitProperty.builder()
   * .hardLimit(123)
   * .name("name")
   * .softLimit(123)
   * .build()))
   * .user("user")
   * .build()))
   * .ephemeralStorage(EphemeralStorageProperty.builder()
   * .sizeInGiB(123)
   * .build())
   * .executionRoleArn("executionRoleArn")
   * .ipcMode("ipcMode")
   * .networkConfiguration(NetworkConfigurationProperty.builder()
   * .assignPublicIp("assignPublicIp")
   * .build())
   * .pidMode("pidMode")
   * .platformVersion("platformVersion")
   * .runtimePlatform(RuntimePlatformProperty.builder()
   * .cpuArchitecture("cpuArchitecture")
   * .operatingSystemFamily("operatingSystemFamily")
   * .build())
   * .taskRoleArn("taskRoleArn")
   * .volumes(List.of(VolumesProperty.builder()
   * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
   * .fileSystemId("fileSystemId")
   * // the properties below are optional
   * .authorizationConfig(AuthorizationConfigProperty.builder()
   * .accessPointId("accessPointId")
   * .iam("iam")
   * .build())
   * .rootDirectory("rootDirectory")
   * .transitEncryption("transitEncryption")
   * .transitEncryptionPort(123)
   * .build())
   * .host(VolumesHostProperty.builder()
   * .sourcePath("sourcePath")
   * .build())
   * .name("name")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html)
   */
  public interface EcsTaskPropertiesProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-containers)
     */
    public fun containers(): Any? = unwrap(this).getContainers()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-ephemeralstorage)
     */
    public fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-executionrolearn)
     */
    public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-ipcmode)
     */
    public fun ipcMode(): String? = unwrap(this).getIpcMode()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-networkconfiguration)
     */
    public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-pidmode)
     */
    public fun pidMode(): String? = unwrap(this).getPidMode()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-platformversion)
     */
    public fun platformVersion(): String? = unwrap(this).getPlatformVersion()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-runtimeplatform)
     */
    public fun runtimePlatform(): Any? = unwrap(this).getRuntimePlatform()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-taskrolearn)
     */
    public fun taskRoleArn(): String? = unwrap(this).getTaskRoleArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-volumes)
     */
    public fun volumes(): Any? = unwrap(this).getVolumes()

    /**
     * A builder for [EcsTaskPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containers the value to be set.
       */
      public fun containers(containers: IResolvable)

      /**
       * @param containers the value to be set.
       */
      public fun containers(containers: List<Any>)

      /**
       * @param containers the value to be set.
       */
      public fun containers(vararg containers: Any)

      /**
       * @param ephemeralStorage the value to be set.
       */
      public fun ephemeralStorage(ephemeralStorage: IResolvable)

      /**
       * @param ephemeralStorage the value to be set.
       */
      public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty)

      /**
       * @param ephemeralStorage the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8eefd7cb29595cfed78cd8ff38b8770d2eaef0a58e68ba2882a4ac4a0f9d5e93")
      public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit)

      /**
       * @param executionRoleArn the value to be set.
       */
      public fun executionRoleArn(executionRoleArn: String)

      /**
       * @param ipcMode the value to be set.
       */
      public fun ipcMode(ipcMode: String)

      /**
       * @param networkConfiguration the value to be set.
       */
      public fun networkConfiguration(networkConfiguration: IResolvable)

      /**
       * @param networkConfiguration the value to be set.
       */
      public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

      /**
       * @param networkConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bff70e0dc28c6c36432aff7111c3b9d9e30c7ca1e52a66163d58c1461ffe08df")
      public
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

      /**
       * @param pidMode the value to be set.
       */
      public fun pidMode(pidMode: String)

      /**
       * @param platformVersion the value to be set.
       */
      public fun platformVersion(platformVersion: String)

      /**
       * @param runtimePlatform the value to be set.
       */
      public fun runtimePlatform(runtimePlatform: IResolvable)

      /**
       * @param runtimePlatform the value to be set.
       */
      public fun runtimePlatform(runtimePlatform: RuntimePlatformProperty)

      /**
       * @param runtimePlatform the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed572a0ef01fcfabe74c077a255ddc880506d2f03176a9a8317fa977b05bb759")
      public fun runtimePlatform(runtimePlatform: RuntimePlatformProperty.Builder.() -> Unit)

      /**
       * @param taskRoleArn the value to be set.
       */
      public fun taskRoleArn(taskRoleArn: String)

      /**
       * @param volumes the value to be set.
       */
      public fun volumes(volumes: IResolvable)

      /**
       * @param volumes the value to be set.
       */
      public fun volumes(volumes: List<Any>)

      /**
       * @param volumes the value to be set.
       */
      public fun volumes(vararg volumes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EcsTaskPropertiesProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EcsTaskPropertiesProperty.builder()

      /**
       * @param containers the value to be set.
       */
      override fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers.let(IResolvable::unwrap))
      }

      /**
       * @param containers the value to be set.
       */
      override fun containers(containers: List<Any>) {
        cdkBuilder.containers(containers)
      }

      /**
       * @param containers the value to be set.
       */
      override fun containers(vararg containers: Any): Unit = containers(containers.toList())

      /**
       * @param ephemeralStorage the value to be set.
       */
      override fun ephemeralStorage(ephemeralStorage: IResolvable) {
        cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
      }

      /**
       * @param ephemeralStorage the value to be set.
       */
      override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty) {
        cdkBuilder.ephemeralStorage(ephemeralStorage.let(EphemeralStorageProperty::unwrap))
      }

      /**
       * @param ephemeralStorage the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8eefd7cb29595cfed78cd8ff38b8770d2eaef0a58e68ba2882a4ac4a0f9d5e93")
      override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit):
          Unit = ephemeralStorage(EphemeralStorageProperty(ephemeralStorage))

      /**
       * @param executionRoleArn the value to be set.
       */
      override fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
      }

      /**
       * @param ipcMode the value to be set.
       */
      override fun ipcMode(ipcMode: String) {
        cdkBuilder.ipcMode(ipcMode)
      }

      /**
       * @param networkConfiguration the value to be set.
       */
      override fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param networkConfiguration the value to be set.
       */
      override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
      }

      /**
       * @param networkConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bff70e0dc28c6c36432aff7111c3b9d9e30c7ca1e52a66163d58c1461ffe08df")
      override
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
          Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

      /**
       * @param pidMode the value to be set.
       */
      override fun pidMode(pidMode: String) {
        cdkBuilder.pidMode(pidMode)
      }

      /**
       * @param platformVersion the value to be set.
       */
      override fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
      }

      /**
       * @param runtimePlatform the value to be set.
       */
      override fun runtimePlatform(runtimePlatform: IResolvable) {
        cdkBuilder.runtimePlatform(runtimePlatform.let(IResolvable::unwrap))
      }

      /**
       * @param runtimePlatform the value to be set.
       */
      override fun runtimePlatform(runtimePlatform: RuntimePlatformProperty) {
        cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatformProperty::unwrap))
      }

      /**
       * @param runtimePlatform the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed572a0ef01fcfabe74c077a255ddc880506d2f03176a9a8317fa977b05bb759")
      override fun runtimePlatform(runtimePlatform: RuntimePlatformProperty.Builder.() -> Unit):
          Unit = runtimePlatform(RuntimePlatformProperty(runtimePlatform))

      /**
       * @param taskRoleArn the value to be set.
       */
      override fun taskRoleArn(taskRoleArn: String) {
        cdkBuilder.taskRoleArn(taskRoleArn)
      }

      /**
       * @param volumes the value to be set.
       */
      override fun volumes(volumes: IResolvable) {
        cdkBuilder.volumes(volumes.let(IResolvable::unwrap))
      }

      /**
       * @param volumes the value to be set.
       */
      override fun volumes(volumes: List<Any>) {
        cdkBuilder.volumes(volumes)
      }

      /**
       * @param volumes the value to be set.
       */
      override fun volumes(vararg volumes: Any): Unit = volumes(volumes.toList())

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EcsTaskPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EcsTaskPropertiesProperty,
    ) : CdkObject(cdkObject), EcsTaskPropertiesProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-containers)
       */
      override fun containers(): Any? = unwrap(this).getContainers()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-ephemeralstorage)
       */
      override fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-executionrolearn)
       */
      override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-ipcmode)
       */
      override fun ipcMode(): String? = unwrap(this).getIpcMode()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-networkconfiguration)
       */
      override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-pidmode)
       */
      override fun pidMode(): String? = unwrap(this).getPidMode()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-platformversion)
       */
      override fun platformVersion(): String? = unwrap(this).getPlatformVersion()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-runtimeplatform)
       */
      override fun runtimePlatform(): Any? = unwrap(this).getRuntimePlatform()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-taskrolearn)
       */
      override fun taskRoleArn(): String? = unwrap(this).getTaskRoleArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ecstaskproperties.html#cfn-batch-jobdefinition-ecstaskproperties-volumes)
       */
      override fun volumes(): Any? = unwrap(this).getVolumes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsTaskPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EcsTaskPropertiesProperty):
          EcsTaskPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EcsTaskPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsTaskPropertiesProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EcsTaskPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.EcsTaskPropertiesProperty
    }
  }

  /**
   * This is used when you're using an Amazon Elastic File System file system for job storage.
   *
   * For more information, see [Amazon EFS
   * Volumes](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html) in the *AWS Batch
   * User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * EfsVolumeConfigurationProperty efsVolumeConfigurationProperty =
   * EfsVolumeConfigurationProperty.builder()
   * .fileSystemId("fileSystemId")
   * // the properties below are optional
   * .authorizationConfig(AuthorizationConfigProperty.builder()
   * .accessPointId("accessPointId")
   * .iam("iam")
   * .build())
   * .rootDirectory("rootDirectory")
   * .transitEncryption("transitEncryption")
   * .transitEncryptionPort(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-efsvolumeconfiguration.html)
   */
  public interface EfsVolumeConfigurationProperty {
    /**
     * The authorization configuration details for the Amazon EFS file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-efsvolumeconfiguration.html#cfn-batch-jobdefinition-efsvolumeconfiguration-authorizationconfig)
     */
    public fun authorizationConfig(): Any? = unwrap(this).getAuthorizationConfig()

    /**
     * The Amazon EFS file system ID to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-efsvolumeconfiguration.html#cfn-batch-jobdefinition-efsvolumeconfiguration-filesystemid)
     */
    public fun fileSystemId(): String

    /**
     * The directory within the Amazon EFS file system to mount as the root directory inside the
     * host.
     *
     * If this parameter is omitted, the root of the Amazon EFS volume is used instead. Specifying
     * `/` has the same effect as omitting this parameter. The maximum length is 4,096 characters.
     *
     *
     * If an EFS access point is specified in the `authorizationConfig` , the root directory
     * parameter must either be omitted or set to `/` , which enforces the path set on the Amazon EFS
     * access point.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-efsvolumeconfiguration.html#cfn-batch-jobdefinition-efsvolumeconfiguration-rootdirectory)
     */
    public fun rootDirectory(): String? = unwrap(this).getRootDirectory()

    /**
     * Determines whether to enable encryption for Amazon EFS data in transit between the Amazon ECS
     * host and the Amazon EFS server.
     *
     * Transit encryption must be enabled if Amazon EFS IAM authorization is used. If this parameter
     * is omitted, the default value of `DISABLED` is used. For more information, see [Encrypting data
     * in transit](https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html) in the *Amazon
     * Elastic File System User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-efsvolumeconfiguration.html#cfn-batch-jobdefinition-efsvolumeconfiguration-transitencryption)
     */
    public fun transitEncryption(): String? = unwrap(this).getTransitEncryption()

    /**
     * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS
     * server.
     *
     * If you don't specify a transit encryption port, it uses the port selection strategy that the
     * Amazon EFS mount helper uses. The value must be between 0 and 65,535. For more information, see
     * [EFS mount helper](https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html) in the
     * *Amazon Elastic File System User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-efsvolumeconfiguration.html#cfn-batch-jobdefinition-efsvolumeconfiguration-transitencryptionport)
     */
    public fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()

    /**
     * A builder for [EfsVolumeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizationConfig The authorization configuration details for the Amazon EFS file
       * system.
       */
      public fun authorizationConfig(authorizationConfig: IResolvable)

      /**
       * @param authorizationConfig The authorization configuration details for the Amazon EFS file
       * system.
       */
      public fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty)

      /**
       * @param authorizationConfig The authorization configuration details for the Amazon EFS file
       * system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7470c3e9883cb1e0e2e062dc1bd64cd1081ea458e11357768aaf3f5322d39814")
      public
          fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty.Builder.() -> Unit)

      /**
       * @param fileSystemId The Amazon EFS file system ID to use. 
       */
      public fun fileSystemId(fileSystemId: String)

      /**
       * @param rootDirectory The directory within the Amazon EFS file system to mount as the root
       * directory inside the host.
       * If this parameter is omitted, the root of the Amazon EFS volume is used instead. Specifying
       * `/` has the same effect as omitting this parameter. The maximum length is 4,096 characters.
       *
       *
       * If an EFS access point is specified in the `authorizationConfig` , the root directory
       * parameter must either be omitted or set to `/` , which enforces the path set on the Amazon EFS
       * access point.
       */
      public fun rootDirectory(rootDirectory: String)

      /**
       * @param transitEncryption Determines whether to enable encryption for Amazon EFS data in
       * transit between the Amazon ECS host and the Amazon EFS server.
       * Transit encryption must be enabled if Amazon EFS IAM authorization is used. If this
       * parameter is omitted, the default value of `DISABLED` is used. For more information, see
       * [Encrypting data in
       * transit](https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html) in the *Amazon
       * Elastic File System User Guide* .
       */
      public fun transitEncryption(transitEncryption: String)

      /**
       * @param transitEncryptionPort The port to use when sending encrypted data between the Amazon
       * ECS host and the Amazon EFS server.
       * If you don't specify a transit encryption port, it uses the port selection strategy that
       * the Amazon EFS mount helper uses. The value must be between 0 and 65,535. For more
       * information, see [EFS mount
       * helper](https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html) in the *Amazon
       * Elastic File System User Guide* .
       */
      public fun transitEncryptionPort(transitEncryptionPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty.builder()

      /**
       * @param authorizationConfig The authorization configuration details for the Amazon EFS file
       * system.
       */
      override fun authorizationConfig(authorizationConfig: IResolvable) {
        cdkBuilder.authorizationConfig(authorizationConfig.let(IResolvable::unwrap))
      }

      /**
       * @param authorizationConfig The authorization configuration details for the Amazon EFS file
       * system.
       */
      override fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty) {
        cdkBuilder.authorizationConfig(authorizationConfig.let(AuthorizationConfigProperty::unwrap))
      }

      /**
       * @param authorizationConfig The authorization configuration details for the Amazon EFS file
       * system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7470c3e9883cb1e0e2e062dc1bd64cd1081ea458e11357768aaf3f5322d39814")
      override
          fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty.Builder.() -> Unit):
          Unit = authorizationConfig(AuthorizationConfigProperty(authorizationConfig))

      /**
       * @param fileSystemId The Amazon EFS file system ID to use. 
       */
      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      /**
       * @param rootDirectory The directory within the Amazon EFS file system to mount as the root
       * directory inside the host.
       * If this parameter is omitted, the root of the Amazon EFS volume is used instead. Specifying
       * `/` has the same effect as omitting this parameter. The maximum length is 4,096 characters.
       *
       *
       * If an EFS access point is specified in the `authorizationConfig` , the root directory
       * parameter must either be omitted or set to `/` , which enforces the path set on the Amazon EFS
       * access point.
       */
      override fun rootDirectory(rootDirectory: String) {
        cdkBuilder.rootDirectory(rootDirectory)
      }

      /**
       * @param transitEncryption Determines whether to enable encryption for Amazon EFS data in
       * transit between the Amazon ECS host and the Amazon EFS server.
       * Transit encryption must be enabled if Amazon EFS IAM authorization is used. If this
       * parameter is omitted, the default value of `DISABLED` is used. For more information, see
       * [Encrypting data in
       * transit](https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html) in the *Amazon
       * Elastic File System User Guide* .
       */
      override fun transitEncryption(transitEncryption: String) {
        cdkBuilder.transitEncryption(transitEncryption)
      }

      /**
       * @param transitEncryptionPort The port to use when sending encrypted data between the Amazon
       * ECS host and the Amazon EFS server.
       * If you don't specify a transit encryption port, it uses the port selection strategy that
       * the Amazon EFS mount helper uses. The value must be between 0 and 65,535. For more
       * information, see [EFS mount
       * helper](https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html) in the *Amazon
       * Elastic File System User Guide* .
       */
      override fun transitEncryptionPort(transitEncryptionPort: Number) {
        cdkBuilder.transitEncryptionPort(transitEncryptionPort)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty,
    ) : CdkObject(cdkObject), EfsVolumeConfigurationProperty {
      /**
       * The authorization configuration details for the Amazon EFS file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-efsvolumeconfiguration.html#cfn-batch-jobdefinition-efsvolumeconfiguration-authorizationconfig)
       */
      override fun authorizationConfig(): Any? = unwrap(this).getAuthorizationConfig()

      /**
       * The Amazon EFS file system ID to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-efsvolumeconfiguration.html#cfn-batch-jobdefinition-efsvolumeconfiguration-filesystemid)
       */
      override fun fileSystemId(): String = unwrap(this).getFileSystemId()

      /**
       * The directory within the Amazon EFS file system to mount as the root directory inside the
       * host.
       *
       * If this parameter is omitted, the root of the Amazon EFS volume is used instead. Specifying
       * `/` has the same effect as omitting this parameter. The maximum length is 4,096 characters.
       *
       *
       * If an EFS access point is specified in the `authorizationConfig` , the root directory
       * parameter must either be omitted or set to `/` , which enforces the path set on the Amazon EFS
       * access point.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-efsvolumeconfiguration.html#cfn-batch-jobdefinition-efsvolumeconfiguration-rootdirectory)
       */
      override fun rootDirectory(): String? = unwrap(this).getRootDirectory()

      /**
       * Determines whether to enable encryption for Amazon EFS data in transit between the Amazon
       * ECS host and the Amazon EFS server.
       *
       * Transit encryption must be enabled if Amazon EFS IAM authorization is used. If this
       * parameter is omitted, the default value of `DISABLED` is used. For more information, see
       * [Encrypting data in
       * transit](https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html) in the *Amazon
       * Elastic File System User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-efsvolumeconfiguration.html#cfn-batch-jobdefinition-efsvolumeconfiguration-transitencryption)
       */
      override fun transitEncryption(): String? = unwrap(this).getTransitEncryption()

      /**
       * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS
       * server.
       *
       * If you don't specify a transit encryption port, it uses the port selection strategy that
       * the Amazon EFS mount helper uses. The value must be between 0 and 65,535. For more
       * information, see [EFS mount
       * helper](https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html) in the *Amazon
       * Elastic File System User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-efsvolumeconfiguration.html#cfn-batch-jobdefinition-efsvolumeconfiguration-transitencryptionport)
       */
      override fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EfsVolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty):
          EfsVolumeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EfsVolumeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EfsVolumeConfigurationProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty
    }
  }

  /**
   * An environment variable.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * EksContainerEnvironmentVariableProperty eksContainerEnvironmentVariableProperty =
   * EksContainerEnvironmentVariableProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainerenvironmentvariable.html)
   */
  public interface EksContainerEnvironmentVariableProperty {
    /**
     * The name of the environment variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainerenvironmentvariable.html#cfn-batch-jobdefinition-ekscontainerenvironmentvariable-name)
     */
    public fun name(): String

    /**
     * The value of the environment variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainerenvironmentvariable.html#cfn-batch-jobdefinition-ekscontainerenvironmentvariable-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [EksContainerEnvironmentVariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the environment variable. 
       */
      public fun name(name: String)

      /**
       * @param value The value of the environment variable.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerEnvironmentVariableProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerEnvironmentVariableProperty.builder()

      /**
       * @param name The name of the environment variable. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the environment variable.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerEnvironmentVariableProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerEnvironmentVariableProperty,
    ) : CdkObject(cdkObject), EksContainerEnvironmentVariableProperty {
      /**
       * The name of the environment variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainerenvironmentvariable.html#cfn-batch-jobdefinition-ekscontainerenvironmentvariable-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The value of the environment variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainerenvironmentvariable.html#cfn-batch-jobdefinition-ekscontainerenvironmentvariable-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EksContainerEnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerEnvironmentVariableProperty):
          EksContainerEnvironmentVariableProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EksContainerEnvironmentVariableProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksContainerEnvironmentVariableProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerEnvironmentVariableProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerEnvironmentVariableProperty
    }
  }

  /**
   * EKS container properties are used in job definitions for Amazon EKS based job definitions to
   * describe the properties for a container node in the pod that's launched as part of a job.
   *
   * This can't be specified for Amazon ECS based job definitions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * Object limits;
   * Object requests;
   * EksContainerProperty eksContainerProperty = EksContainerProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .args(List.of("args"))
   * .command(List.of("command"))
   * .env(List.of(EksContainerEnvironmentVariableProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .value("value")
   * .build()))
   * .imagePullPolicy("imagePullPolicy")
   * .name("name")
   * .resources(ResourcesProperty.builder()
   * .limits(limits)
   * .requests(requests)
   * .build())
   * .securityContext(SecurityContextProperty.builder()
   * .privileged(false)
   * .readOnlyRootFilesystem(false)
   * .runAsGroup(123)
   * .runAsNonRoot(false)
   * .runAsUser(123)
   * .build())
   * .volumeMounts(List.of(EksContainerVolumeMountProperty.builder()
   * .mountPath("mountPath")
   * .name("name")
   * .readOnly(false)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html)
   */
  public interface EksContainerProperty {
    /**
     * An array of arguments to the entrypoint.
     *
     * If this isn't specified, the `CMD` of the container image is used. This corresponds to the
     * `args` member in the
     * [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
     * portion of the
     * [Pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/)
     * in Kubernetes. Environment variable references are expanded using the container's environment.
     *
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment variable
     * doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with `$` , and
     * the resulting string isn't expanded. For example, `$$(VAR_NAME)` is passed as `$(VAR_NAME)`
     * whether or not the `VAR_NAME` environment variable exists. For more information, see [Dockerfile
     * reference:
     * CMD](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd) and
     * [Define a command and arguments for a
     * pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
     * in the *Kubernetes documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-args)
     */
    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    /**
     * The entrypoint for the container.
     *
     * This isn't run within a shell. If this isn't specified, the `ENTRYPOINT` of the container
     * image is used. Environment variable references are expanded using the container's environment.
     *
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment variable
     * doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with `$` and the
     * resulting string isn't expanded. For example, `$$(VAR_NAME)` will be passed as `$(VAR_NAME)`
     * whether or not the `VAR_NAME` environment variable exists. The entrypoint can't be updated. For
     * more information, see
     * [ENTRYPOINT](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
     * in the *Dockerfile reference* and [Define a command and arguments for a
     * container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
     * and
     * [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
     * in the *Kubernetes documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-command)
     */
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The environment variables to pass to a container.
     *
     *
     * Environment variables cannot start with " `AWS_BATCH` ". This naming convention is reserved
     * for variables that AWS Batch sets.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-env)
     */
    public fun env(): Any? = unwrap(this).getEnv()

    /**
     * The Docker image used to start the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-image)
     */
    public fun image(): String

    /**
     * The image pull policy for the container.
     *
     * Supported values are `Always` , `IfNotPresent` , and `Never` . This parameter defaults to
     * `IfNotPresent` . However, if the `:latest` tag is specified, it defaults to `Always` . For more
     * information, see [Updating
     * images](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/containers/images/#updating-images)
     * in the *Kubernetes documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-imagepullpolicy)
     */
    public fun imagePullPolicy(): String? = unwrap(this).getImagePullPolicy()

    /**
     * The name of the container.
     *
     * If the name isn't specified, the default name " `Default` " is used. Each container in a pod
     * must have a unique name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The type and amount of resources to assign to a container.
     *
     * The supported resources include `memory` , `cpu` , and `nvidia.com/gpu` . For more
     * information, see [Resource management for pods and
     * containers](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
     * in the *Kubernetes documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-resources)
     */
    public fun resources(): Any? = unwrap(this).getResources()

    /**
     * The security context for a job.
     *
     * For more information, see [Configure a security context for a pod or
     * container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/configure-pod-container/security-context/)
     * in the *Kubernetes documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-securitycontext)
     */
    public fun securityContext(): Any? = unwrap(this).getSecurityContext()

    /**
     * The volume mounts for the container.
     *
     * AWS Batch supports `emptyDir` , `hostPath` , and `secret` volume types. For more information
     * about volumes and volume mounts in Kubernetes, see
     * [Volumes](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/) in
     * the *Kubernetes documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-volumemounts)
     */
    public fun volumeMounts(): Any? = unwrap(this).getVolumeMounts()

    /**
     * A builder for [EksContainerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param args An array of arguments to the entrypoint.
       * If this isn't specified, the `CMD` of the container image is used. This corresponds to the
       * `args` member in the
       * [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
       * portion of the
       * [Pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/)
       * in Kubernetes. Environment variable references are expanded using the container's environment.
       *
       * If the referenced environment variable doesn't exist, the reference in the command isn't
       * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment
       * variable doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with
       * `$` , and the resulting string isn't expanded. For example, `$$(VAR_NAME)` is passed as
       * `$(VAR_NAME)` whether or not the `VAR_NAME` environment variable exists. For more information,
       * see [Dockerfile reference:
       * CMD](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd) and
       * [Define a command and arguments for a
       * pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
       * in the *Kubernetes documentation* .
       */
      public fun args(args: List<String>)

      /**
       * @param args An array of arguments to the entrypoint.
       * If this isn't specified, the `CMD` of the container image is used. This corresponds to the
       * `args` member in the
       * [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
       * portion of the
       * [Pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/)
       * in Kubernetes. Environment variable references are expanded using the container's environment.
       *
       * If the referenced environment variable doesn't exist, the reference in the command isn't
       * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment
       * variable doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with
       * `$` , and the resulting string isn't expanded. For example, `$$(VAR_NAME)` is passed as
       * `$(VAR_NAME)` whether or not the `VAR_NAME` environment variable exists. For more information,
       * see [Dockerfile reference:
       * CMD](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd) and
       * [Define a command and arguments for a
       * pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
       * in the *Kubernetes documentation* .
       */
      public fun args(vararg args: String)

      /**
       * @param command The entrypoint for the container.
       * This isn't run within a shell. If this isn't specified, the `ENTRYPOINT` of the container
       * image is used. Environment variable references are expanded using the container's environment.
       *
       * If the referenced environment variable doesn't exist, the reference in the command isn't
       * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment
       * variable doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with
       * `$` and the resulting string isn't expanded. For example, `$$(VAR_NAME)` will be passed as
       * `$(VAR_NAME)` whether or not the `VAR_NAME` environment variable exists. The entrypoint can't
       * be updated. For more information, see
       * [ENTRYPOINT](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
       * in the *Dockerfile reference* and [Define a command and arguments for a
       * container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
       * and
       * [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
       * in the *Kubernetes documentation* .
       */
      public fun command(command: List<String>)

      /**
       * @param command The entrypoint for the container.
       * This isn't run within a shell. If this isn't specified, the `ENTRYPOINT` of the container
       * image is used. Environment variable references are expanded using the container's environment.
       *
       * If the referenced environment variable doesn't exist, the reference in the command isn't
       * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment
       * variable doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with
       * `$` and the resulting string isn't expanded. For example, `$$(VAR_NAME)` will be passed as
       * `$(VAR_NAME)` whether or not the `VAR_NAME` environment variable exists. The entrypoint can't
       * be updated. For more information, see
       * [ENTRYPOINT](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
       * in the *Dockerfile reference* and [Define a command and arguments for a
       * container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
       * and
       * [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
       * in the *Kubernetes documentation* .
       */
      public fun command(vararg command: String)

      /**
       * @param env The environment variables to pass to a container.
       *
       * Environment variables cannot start with " `AWS_BATCH` ". This naming convention is reserved
       * for variables that AWS Batch sets.
       */
      public fun env(env: IResolvable)

      /**
       * @param env The environment variables to pass to a container.
       *
       * Environment variables cannot start with " `AWS_BATCH` ". This naming convention is reserved
       * for variables that AWS Batch sets.
       */
      public fun env(env: List<Any>)

      /**
       * @param env The environment variables to pass to a container.
       *
       * Environment variables cannot start with " `AWS_BATCH` ". This naming convention is reserved
       * for variables that AWS Batch sets.
       */
      public fun env(vararg env: Any)

      /**
       * @param image The Docker image used to start the container. 
       */
      public fun image(image: String)

      /**
       * @param imagePullPolicy The image pull policy for the container.
       * Supported values are `Always` , `IfNotPresent` , and `Never` . This parameter defaults to
       * `IfNotPresent` . However, if the `:latest` tag is specified, it defaults to `Always` . For
       * more information, see [Updating
       * images](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/containers/images/#updating-images)
       * in the *Kubernetes documentation* .
       */
      public fun imagePullPolicy(imagePullPolicy: String)

      /**
       * @param name The name of the container.
       * If the name isn't specified, the default name " `Default` " is used. Each container in a
       * pod must have a unique name.
       */
      public fun name(name: String)

      /**
       * @param resources The type and amount of resources to assign to a container.
       * The supported resources include `memory` , `cpu` , and `nvidia.com/gpu` . For more
       * information, see [Resource management for pods and
       * containers](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
       * in the *Kubernetes documentation* .
       */
      public fun resources(resources: IResolvable)

      /**
       * @param resources The type and amount of resources to assign to a container.
       * The supported resources include `memory` , `cpu` , and `nvidia.com/gpu` . For more
       * information, see [Resource management for pods and
       * containers](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
       * in the *Kubernetes documentation* .
       */
      public fun resources(resources: ResourcesProperty)

      /**
       * @param resources The type and amount of resources to assign to a container.
       * The supported resources include `memory` , `cpu` , and `nvidia.com/gpu` . For more
       * information, see [Resource management for pods and
       * containers](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
       * in the *Kubernetes documentation* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b89941c1ac68cbe28dafe670b2382cb982458533ae9752c48e46ddfce3e62863")
      public fun resources(resources: ResourcesProperty.Builder.() -> Unit)

      /**
       * @param securityContext The security context for a job.
       * For more information, see [Configure a security context for a pod or
       * container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/configure-pod-container/security-context/)
       * in the *Kubernetes documentation* .
       */
      public fun securityContext(securityContext: IResolvable)

      /**
       * @param securityContext The security context for a job.
       * For more information, see [Configure a security context for a pod or
       * container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/configure-pod-container/security-context/)
       * in the *Kubernetes documentation* .
       */
      public fun securityContext(securityContext: SecurityContextProperty)

      /**
       * @param securityContext The security context for a job.
       * For more information, see [Configure a security context for a pod or
       * container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/configure-pod-container/security-context/)
       * in the *Kubernetes documentation* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("630ea6b519c7e542aaed3622e1835518d66bad7f20d399381064a7aa911e4af9")
      public fun securityContext(securityContext: SecurityContextProperty.Builder.() -> Unit)

      /**
       * @param volumeMounts The volume mounts for the container.
       * AWS Batch supports `emptyDir` , `hostPath` , and `secret` volume types. For more
       * information about volumes and volume mounts in Kubernetes, see
       * [Volumes](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/) in
       * the *Kubernetes documentation* .
       */
      public fun volumeMounts(volumeMounts: IResolvable)

      /**
       * @param volumeMounts The volume mounts for the container.
       * AWS Batch supports `emptyDir` , `hostPath` , and `secret` volume types. For more
       * information about volumes and volume mounts in Kubernetes, see
       * [Volumes](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/) in
       * the *Kubernetes documentation* .
       */
      public fun volumeMounts(volumeMounts: List<Any>)

      /**
       * @param volumeMounts The volume mounts for the container.
       * AWS Batch supports `emptyDir` , `hostPath` , and `secret` volume types. For more
       * information about volumes and volume mounts in Kubernetes, see
       * [Volumes](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/) in
       * the *Kubernetes documentation* .
       */
      public fun volumeMounts(vararg volumeMounts: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerProperty.builder()

      /**
       * @param args An array of arguments to the entrypoint.
       * If this isn't specified, the `CMD` of the container image is used. This corresponds to the
       * `args` member in the
       * [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
       * portion of the
       * [Pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/)
       * in Kubernetes. Environment variable references are expanded using the container's environment.
       *
       * If the referenced environment variable doesn't exist, the reference in the command isn't
       * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment
       * variable doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with
       * `$` , and the resulting string isn't expanded. For example, `$$(VAR_NAME)` is passed as
       * `$(VAR_NAME)` whether or not the `VAR_NAME` environment variable exists. For more information,
       * see [Dockerfile reference:
       * CMD](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd) and
       * [Define a command and arguments for a
       * pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
       * in the *Kubernetes documentation* .
       */
      override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      /**
       * @param args An array of arguments to the entrypoint.
       * If this isn't specified, the `CMD` of the container image is used. This corresponds to the
       * `args` member in the
       * [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
       * portion of the
       * [Pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/)
       * in Kubernetes. Environment variable references are expanded using the container's environment.
       *
       * If the referenced environment variable doesn't exist, the reference in the command isn't
       * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment
       * variable doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with
       * `$` , and the resulting string isn't expanded. For example, `$$(VAR_NAME)` is passed as
       * `$(VAR_NAME)` whether or not the `VAR_NAME` environment variable exists. For more information,
       * see [Dockerfile reference:
       * CMD](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd) and
       * [Define a command and arguments for a
       * pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
       * in the *Kubernetes documentation* .
       */
      override fun args(vararg args: String): Unit = args(args.toList())

      /**
       * @param command The entrypoint for the container.
       * This isn't run within a shell. If this isn't specified, the `ENTRYPOINT` of the container
       * image is used. Environment variable references are expanded using the container's environment.
       *
       * If the referenced environment variable doesn't exist, the reference in the command isn't
       * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment
       * variable doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with
       * `$` and the resulting string isn't expanded. For example, `$$(VAR_NAME)` will be passed as
       * `$(VAR_NAME)` whether or not the `VAR_NAME` environment variable exists. The entrypoint can't
       * be updated. For more information, see
       * [ENTRYPOINT](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
       * in the *Dockerfile reference* and [Define a command and arguments for a
       * container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
       * and
       * [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
       * in the *Kubernetes documentation* .
       */
      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      /**
       * @param command The entrypoint for the container.
       * This isn't run within a shell. If this isn't specified, the `ENTRYPOINT` of the container
       * image is used. Environment variable references are expanded using the container's environment.
       *
       * If the referenced environment variable doesn't exist, the reference in the command isn't
       * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment
       * variable doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with
       * `$` and the resulting string isn't expanded. For example, `$$(VAR_NAME)` will be passed as
       * `$(VAR_NAME)` whether or not the `VAR_NAME` environment variable exists. The entrypoint can't
       * be updated. For more information, see
       * [ENTRYPOINT](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
       * in the *Dockerfile reference* and [Define a command and arguments for a
       * container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
       * and
       * [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
       * in the *Kubernetes documentation* .
       */
      override fun command(vararg command: String): Unit = command(command.toList())

      /**
       * @param env The environment variables to pass to a container.
       *
       * Environment variables cannot start with " `AWS_BATCH` ". This naming convention is reserved
       * for variables that AWS Batch sets.
       */
      override fun env(env: IResolvable) {
        cdkBuilder.env(env.let(IResolvable::unwrap))
      }

      /**
       * @param env The environment variables to pass to a container.
       *
       * Environment variables cannot start with " `AWS_BATCH` ". This naming convention is reserved
       * for variables that AWS Batch sets.
       */
      override fun env(env: List<Any>) {
        cdkBuilder.env(env)
      }

      /**
       * @param env The environment variables to pass to a container.
       *
       * Environment variables cannot start with " `AWS_BATCH` ". This naming convention is reserved
       * for variables that AWS Batch sets.
       */
      override fun env(vararg env: Any): Unit = env(env.toList())

      /**
       * @param image The Docker image used to start the container. 
       */
      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      /**
       * @param imagePullPolicy The image pull policy for the container.
       * Supported values are `Always` , `IfNotPresent` , and `Never` . This parameter defaults to
       * `IfNotPresent` . However, if the `:latest` tag is specified, it defaults to `Always` . For
       * more information, see [Updating
       * images](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/containers/images/#updating-images)
       * in the *Kubernetes documentation* .
       */
      override fun imagePullPolicy(imagePullPolicy: String) {
        cdkBuilder.imagePullPolicy(imagePullPolicy)
      }

      /**
       * @param name The name of the container.
       * If the name isn't specified, the default name " `Default` " is used. Each container in a
       * pod must have a unique name.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param resources The type and amount of resources to assign to a container.
       * The supported resources include `memory` , `cpu` , and `nvidia.com/gpu` . For more
       * information, see [Resource management for pods and
       * containers](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
       * in the *Kubernetes documentation* .
       */
      override fun resources(resources: IResolvable) {
        cdkBuilder.resources(resources.let(IResolvable::unwrap))
      }

      /**
       * @param resources The type and amount of resources to assign to a container.
       * The supported resources include `memory` , `cpu` , and `nvidia.com/gpu` . For more
       * information, see [Resource management for pods and
       * containers](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
       * in the *Kubernetes documentation* .
       */
      override fun resources(resources: ResourcesProperty) {
        cdkBuilder.resources(resources.let(ResourcesProperty::unwrap))
      }

      /**
       * @param resources The type and amount of resources to assign to a container.
       * The supported resources include `memory` , `cpu` , and `nvidia.com/gpu` . For more
       * information, see [Resource management for pods and
       * containers](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
       * in the *Kubernetes documentation* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b89941c1ac68cbe28dafe670b2382cb982458533ae9752c48e46ddfce3e62863")
      override fun resources(resources: ResourcesProperty.Builder.() -> Unit): Unit =
          resources(ResourcesProperty(resources))

      /**
       * @param securityContext The security context for a job.
       * For more information, see [Configure a security context for a pod or
       * container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/configure-pod-container/security-context/)
       * in the *Kubernetes documentation* .
       */
      override fun securityContext(securityContext: IResolvable) {
        cdkBuilder.securityContext(securityContext.let(IResolvable::unwrap))
      }

      /**
       * @param securityContext The security context for a job.
       * For more information, see [Configure a security context for a pod or
       * container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/configure-pod-container/security-context/)
       * in the *Kubernetes documentation* .
       */
      override fun securityContext(securityContext: SecurityContextProperty) {
        cdkBuilder.securityContext(securityContext.let(SecurityContextProperty::unwrap))
      }

      /**
       * @param securityContext The security context for a job.
       * For more information, see [Configure a security context for a pod or
       * container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/configure-pod-container/security-context/)
       * in the *Kubernetes documentation* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("630ea6b519c7e542aaed3622e1835518d66bad7f20d399381064a7aa911e4af9")
      override fun securityContext(securityContext: SecurityContextProperty.Builder.() -> Unit):
          Unit = securityContext(SecurityContextProperty(securityContext))

      /**
       * @param volumeMounts The volume mounts for the container.
       * AWS Batch supports `emptyDir` , `hostPath` , and `secret` volume types. For more
       * information about volumes and volume mounts in Kubernetes, see
       * [Volumes](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/) in
       * the *Kubernetes documentation* .
       */
      override fun volumeMounts(volumeMounts: IResolvable) {
        cdkBuilder.volumeMounts(volumeMounts.let(IResolvable::unwrap))
      }

      /**
       * @param volumeMounts The volume mounts for the container.
       * AWS Batch supports `emptyDir` , `hostPath` , and `secret` volume types. For more
       * information about volumes and volume mounts in Kubernetes, see
       * [Volumes](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/) in
       * the *Kubernetes documentation* .
       */
      override fun volumeMounts(volumeMounts: List<Any>) {
        cdkBuilder.volumeMounts(volumeMounts)
      }

      /**
       * @param volumeMounts The volume mounts for the container.
       * AWS Batch supports `emptyDir` , `hostPath` , and `secret` volume types. For more
       * information about volumes and volume mounts in Kubernetes, see
       * [Volumes](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/) in
       * the *Kubernetes documentation* .
       */
      override fun volumeMounts(vararg volumeMounts: Any): Unit =
          volumeMounts(volumeMounts.toList())

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerProperty,
    ) : CdkObject(cdkObject), EksContainerProperty {
      /**
       * An array of arguments to the entrypoint.
       *
       * If this isn't specified, the `CMD` of the container image is used. This corresponds to the
       * `args` member in the
       * [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
       * portion of the
       * [Pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/)
       * in Kubernetes. Environment variable references are expanded using the container's environment.
       *
       * If the referenced environment variable doesn't exist, the reference in the command isn't
       * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment
       * variable doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with
       * `$` , and the resulting string isn't expanded. For example, `$$(VAR_NAME)` is passed as
       * `$(VAR_NAME)` whether or not the `VAR_NAME` environment variable exists. For more information,
       * see [Dockerfile reference:
       * CMD](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd) and
       * [Define a command and arguments for a
       * pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
       * in the *Kubernetes documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-args)
       */
      override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      /**
       * The entrypoint for the container.
       *
       * This isn't run within a shell. If this isn't specified, the `ENTRYPOINT` of the container
       * image is used. Environment variable references are expanded using the container's environment.
       *
       * If the referenced environment variable doesn't exist, the reference in the command isn't
       * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment
       * variable doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with
       * `$` and the resulting string isn't expanded. For example, `$$(VAR_NAME)` will be passed as
       * `$(VAR_NAME)` whether or not the `VAR_NAME` environment variable exists. The entrypoint can't
       * be updated. For more information, see
       * [ENTRYPOINT](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
       * in the *Dockerfile reference* and [Define a command and arguments for a
       * container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
       * and
       * [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
       * in the *Kubernetes documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-command)
       */
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      /**
       * The environment variables to pass to a container.
       *
       *
       * Environment variables cannot start with " `AWS_BATCH` ". This naming convention is reserved
       * for variables that AWS Batch sets.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-env)
       */
      override fun env(): Any? = unwrap(this).getEnv()

      /**
       * The Docker image used to start the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-image)
       */
      override fun image(): String = unwrap(this).getImage()

      /**
       * The image pull policy for the container.
       *
       * Supported values are `Always` , `IfNotPresent` , and `Never` . This parameter defaults to
       * `IfNotPresent` . However, if the `:latest` tag is specified, it defaults to `Always` . For
       * more information, see [Updating
       * images](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/containers/images/#updating-images)
       * in the *Kubernetes documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-imagepullpolicy)
       */
      override fun imagePullPolicy(): String? = unwrap(this).getImagePullPolicy()

      /**
       * The name of the container.
       *
       * If the name isn't specified, the default name " `Default` " is used. Each container in a
       * pod must have a unique name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The type and amount of resources to assign to a container.
       *
       * The supported resources include `memory` , `cpu` , and `nvidia.com/gpu` . For more
       * information, see [Resource management for pods and
       * containers](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
       * in the *Kubernetes documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-resources)
       */
      override fun resources(): Any? = unwrap(this).getResources()

      /**
       * The security context for a job.
       *
       * For more information, see [Configure a security context for a pod or
       * container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/configure-pod-container/security-context/)
       * in the *Kubernetes documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-securitycontext)
       */
      override fun securityContext(): Any? = unwrap(this).getSecurityContext()

      /**
       * The volume mounts for the container.
       *
       * AWS Batch supports `emptyDir` , `hostPath` , and `secret` volume types. For more
       * information about volumes and volume mounts in Kubernetes, see
       * [Volumes](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/) in
       * the *Kubernetes documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html#cfn-batch-jobdefinition-ekscontainer-volumemounts)
       */
      override fun volumeMounts(): Any? = unwrap(this).getVolumeMounts()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EksContainerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerProperty):
          EksContainerProperty = CdkObjectWrappers.wrap(cdkObject) as? EksContainerProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksContainerProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerProperty
    }
  }

  /**
   * The volume mounts for a container for an Amazon EKS job.
   *
   * For more information about volumes and volume mounts in Kubernetes, see
   * [Volumes](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/) in the
   * *Kubernetes documentation* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * EksContainerVolumeMountProperty eksContainerVolumeMountProperty =
   * EksContainerVolumeMountProperty.builder()
   * .mountPath("mountPath")
   * .name("name")
   * .readOnly(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainervolumemount.html)
   */
  public interface EksContainerVolumeMountProperty {
    /**
     * The path on the container where the volume is mounted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainervolumemount.html#cfn-batch-jobdefinition-ekscontainervolumemount-mountpath)
     */
    public fun mountPath(): String? = unwrap(this).getMountPath()

    /**
     * The name the volume mount.
     *
     * This must match the name of one of the volumes in the pod.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainervolumemount.html#cfn-batch-jobdefinition-ekscontainervolumemount-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * If this value is `true` , the container has read-only access to the volume.
     *
     * Otherwise, the container can write to the volume. The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainervolumemount.html#cfn-batch-jobdefinition-ekscontainervolumemount-readonly)
     */
    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    /**
     * A builder for [EksContainerVolumeMountProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mountPath The path on the container where the volume is mounted.
       */
      public fun mountPath(mountPath: String)

      /**
       * @param name The name the volume mount.
       * This must match the name of one of the volumes in the pod.
       */
      public fun name(name: String)

      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * Otherwise, the container can write to the volume. The default value is `false` .
       */
      public fun readOnly(readOnly: Boolean)

      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * Otherwise, the container can write to the volume. The default value is `false` .
       */
      public fun readOnly(readOnly: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerVolumeMountProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerVolumeMountProperty.builder()

      /**
       * @param mountPath The path on the container where the volume is mounted.
       */
      override fun mountPath(mountPath: String) {
        cdkBuilder.mountPath(mountPath)
      }

      /**
       * @param name The name the volume mount.
       * This must match the name of one of the volumes in the pod.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * Otherwise, the container can write to the volume. The default value is `false` .
       */
      override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * Otherwise, the container can write to the volume. The default value is `false` .
       */
      override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerVolumeMountProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerVolumeMountProperty,
    ) : CdkObject(cdkObject), EksContainerVolumeMountProperty {
      /**
       * The path on the container where the volume is mounted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainervolumemount.html#cfn-batch-jobdefinition-ekscontainervolumemount-mountpath)
       */
      override fun mountPath(): String? = unwrap(this).getMountPath()

      /**
       * The name the volume mount.
       *
       * This must match the name of one of the volumes in the pod.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainervolumemount.html#cfn-batch-jobdefinition-ekscontainervolumemount-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * If this value is `true` , the container has read-only access to the volume.
       *
       * Otherwise, the container can write to the volume. The default value is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainervolumemount.html#cfn-batch-jobdefinition-ekscontainervolumemount-readonly)
       */
      override fun readOnly(): Any? = unwrap(this).getReadOnly()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EksContainerVolumeMountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerVolumeMountProperty):
          EksContainerVolumeMountProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EksContainerVolumeMountProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksContainerVolumeMountProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerVolumeMountProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerVolumeMountProperty
    }
  }

  /**
   * An object that contains the properties for the Kubernetes resources of a job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * Object labels;
   * Object limits;
   * Object requests;
   * EksPropertiesProperty eksPropertiesProperty = EksPropertiesProperty.builder()
   * .podProperties(PodPropertiesProperty.builder()
   * .containers(List.of(EksContainerProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .args(List.of("args"))
   * .command(List.of("command"))
   * .env(List.of(EksContainerEnvironmentVariableProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .value("value")
   * .build()))
   * .imagePullPolicy("imagePullPolicy")
   * .name("name")
   * .resources(ResourcesProperty.builder()
   * .limits(limits)
   * .requests(requests)
   * .build())
   * .securityContext(SecurityContextProperty.builder()
   * .privileged(false)
   * .readOnlyRootFilesystem(false)
   * .runAsGroup(123)
   * .runAsNonRoot(false)
   * .runAsUser(123)
   * .build())
   * .volumeMounts(List.of(EksContainerVolumeMountProperty.builder()
   * .mountPath("mountPath")
   * .name("name")
   * .readOnly(false)
   * .build()))
   * .build()))
   * .dnsPolicy("dnsPolicy")
   * .hostNetwork(false)
   * .initContainers(List.of(EksContainerProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .args(List.of("args"))
   * .command(List.of("command"))
   * .env(List.of(EksContainerEnvironmentVariableProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .value("value")
   * .build()))
   * .imagePullPolicy("imagePullPolicy")
   * .name("name")
   * .resources(ResourcesProperty.builder()
   * .limits(limits)
   * .requests(requests)
   * .build())
   * .securityContext(SecurityContextProperty.builder()
   * .privileged(false)
   * .readOnlyRootFilesystem(false)
   * .runAsGroup(123)
   * .runAsNonRoot(false)
   * .runAsUser(123)
   * .build())
   * .volumeMounts(List.of(EksContainerVolumeMountProperty.builder()
   * .mountPath("mountPath")
   * .name("name")
   * .readOnly(false)
   * .build()))
   * .build()))
   * .metadata(MetadataProperty.builder()
   * .labels(labels)
   * .build())
   * .serviceAccountName("serviceAccountName")
   * .shareProcessNamespace(false)
   * .volumes(List.of(EksVolumeProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .emptyDir(EmptyDirProperty.builder()
   * .medium("medium")
   * .sizeLimit("sizeLimit")
   * .build())
   * .hostPath(HostPathProperty.builder()
   * .path("path")
   * .build())
   * .secret(EksSecretProperty.builder()
   * .secretName("secretName")
   * // the properties below are optional
   * .optional(false)
   * .build())
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-eksproperties.html)
   */
  public interface EksPropertiesProperty {
    /**
     * The properties for the Kubernetes pod resources of a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-eksproperties.html#cfn-batch-jobdefinition-eksproperties-podproperties)
     */
    public fun podProperties(): Any? = unwrap(this).getPodProperties()

    /**
     * A builder for [EksPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param podProperties The properties for the Kubernetes pod resources of a job.
       */
      public fun podProperties(podProperties: IResolvable)

      /**
       * @param podProperties The properties for the Kubernetes pod resources of a job.
       */
      public fun podProperties(podProperties: PodPropertiesProperty)

      /**
       * @param podProperties The properties for the Kubernetes pod resources of a job.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("736253c4cd1efc18e8b136980a99629cc7b68d3ead8e7f8bf14257b5e627ee7c")
      public fun podProperties(podProperties: PodPropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksPropertiesProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksPropertiesProperty.builder()

      /**
       * @param podProperties The properties for the Kubernetes pod resources of a job.
       */
      override fun podProperties(podProperties: IResolvable) {
        cdkBuilder.podProperties(podProperties.let(IResolvable::unwrap))
      }

      /**
       * @param podProperties The properties for the Kubernetes pod resources of a job.
       */
      override fun podProperties(podProperties: PodPropertiesProperty) {
        cdkBuilder.podProperties(podProperties.let(PodPropertiesProperty::unwrap))
      }

      /**
       * @param podProperties The properties for the Kubernetes pod resources of a job.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("736253c4cd1efc18e8b136980a99629cc7b68d3ead8e7f8bf14257b5e627ee7c")
      override fun podProperties(podProperties: PodPropertiesProperty.Builder.() -> Unit): Unit =
          podProperties(PodPropertiesProperty(podProperties))

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksPropertiesProperty,
    ) : CdkObject(cdkObject), EksPropertiesProperty {
      /**
       * The properties for the Kubernetes pod resources of a job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-eksproperties.html#cfn-batch-jobdefinition-eksproperties-podproperties)
       */
      override fun podProperties(): Any? = unwrap(this).getPodProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EksPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksPropertiesProperty):
          EksPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as? EksPropertiesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksPropertiesProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksPropertiesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksPropertiesProperty
    }
  }

  /**
   * Specifies the configuration of a Kubernetes `secret` volume.
   *
   * For more information, see
   * [secret](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#secret)
   * in the *Kubernetes documentation* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * EksSecretProperty eksSecretProperty = EksSecretProperty.builder()
   * .secretName("secretName")
   * // the properties below are optional
   * .optional(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekssecret.html)
   */
  public interface EksSecretProperty {
    /**
     * Specifies whether the secret or the secret's keys must be defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekssecret.html#cfn-batch-jobdefinition-ekssecret-optional)
     */
    public fun optional(): Any? = unwrap(this).getOptional()

    /**
     * The name of the secret.
     *
     * The name must be allowed as a DNS subdomain name. For more information, see [DNS subdomain
     * names](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
     * in the *Kubernetes documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekssecret.html#cfn-batch-jobdefinition-ekssecret-secretname)
     */
    public fun secretName(): String

    /**
     * A builder for [EksSecretProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param optional Specifies whether the secret or the secret's keys must be defined.
       */
      public fun optional(optional: Boolean)

      /**
       * @param optional Specifies whether the secret or the secret's keys must be defined.
       */
      public fun optional(optional: IResolvable)

      /**
       * @param secretName The name of the secret. 
       * The name must be allowed as a DNS subdomain name. For more information, see [DNS subdomain
       * names](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
       * in the *Kubernetes documentation* .
       */
      public fun secretName(secretName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksSecretProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksSecretProperty.builder()

      /**
       * @param optional Specifies whether the secret or the secret's keys must be defined.
       */
      override fun optional(optional: Boolean) {
        cdkBuilder.optional(optional)
      }

      /**
       * @param optional Specifies whether the secret or the secret's keys must be defined.
       */
      override fun optional(optional: IResolvable) {
        cdkBuilder.optional(optional.let(IResolvable::unwrap))
      }

      /**
       * @param secretName The name of the secret. 
       * The name must be allowed as a DNS subdomain name. For more information, see [DNS subdomain
       * names](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
       * in the *Kubernetes documentation* .
       */
      override fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.EksSecretProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksSecretProperty,
    ) : CdkObject(cdkObject), EksSecretProperty {
      /**
       * Specifies whether the secret or the secret's keys must be defined.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekssecret.html#cfn-batch-jobdefinition-ekssecret-optional)
       */
      override fun optional(): Any? = unwrap(this).getOptional()

      /**
       * The name of the secret.
       *
       * The name must be allowed as a DNS subdomain name. For more information, see [DNS subdomain
       * names](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
       * in the *Kubernetes documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekssecret.html#cfn-batch-jobdefinition-ekssecret-secretname)
       */
      override fun secretName(): String = unwrap(this).getSecretName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EksSecretProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksSecretProperty):
          EksSecretProperty = CdkObjectWrappers.wrap(cdkObject) as? EksSecretProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksSecretProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksSecretProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksSecretProperty
    }
  }

  /**
   * Specifies an Amazon EKS volume for a job definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * EksVolumeProperty eksVolumeProperty = EksVolumeProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .emptyDir(EmptyDirProperty.builder()
   * .medium("medium")
   * .sizeLimit("sizeLimit")
   * .build())
   * .hostPath(HostPathProperty.builder()
   * .path("path")
   * .build())
   * .secret(EksSecretProperty.builder()
   * .secretName("secretName")
   * // the properties below are optional
   * .optional(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-eksvolume.html)
   */
  public interface EksVolumeProperty {
    /**
     * Specifies the configuration of a Kubernetes `emptyDir` volume.
     *
     * For more information, see
     * [emptyDir](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#emptydir)
     * in the *Kubernetes documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-eksvolume.html#cfn-batch-jobdefinition-eksvolume-emptydir)
     */
    public fun emptyDir(): Any? = unwrap(this).getEmptyDir()

    /**
     * Specifies the configuration of a Kubernetes `hostPath` volume.
     *
     * For more information, see
     * [hostPath](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
     * in the *Kubernetes documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-eksvolume.html#cfn-batch-jobdefinition-eksvolume-hostpath)
     */
    public fun hostPath(): Any? = unwrap(this).getHostPath()

    /**
     * The name of the volume.
     *
     * The name must be allowed as a DNS subdomain name. For more information, see [DNS subdomain
     * names](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
     * in the *Kubernetes documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-eksvolume.html#cfn-batch-jobdefinition-eksvolume-name)
     */
    public fun name(): String

    /**
     * Specifies the configuration of a Kubernetes `secret` volume.
     *
     * For more information, see
     * [secret](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#secret)
     * in the *Kubernetes documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-eksvolume.html#cfn-batch-jobdefinition-eksvolume-secret)
     */
    public fun secret(): Any? = unwrap(this).getSecret()

    /**
     * A builder for [EksVolumeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param emptyDir Specifies the configuration of a Kubernetes `emptyDir` volume.
       * For more information, see
       * [emptyDir](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#emptydir)
       * in the *Kubernetes documentation* .
       */
      public fun emptyDir(emptyDir: IResolvable)

      /**
       * @param emptyDir Specifies the configuration of a Kubernetes `emptyDir` volume.
       * For more information, see
       * [emptyDir](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#emptydir)
       * in the *Kubernetes documentation* .
       */
      public fun emptyDir(emptyDir: EmptyDirProperty)

      /**
       * @param emptyDir Specifies the configuration of a Kubernetes `emptyDir` volume.
       * For more information, see
       * [emptyDir](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#emptydir)
       * in the *Kubernetes documentation* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64cab76735c658ec67ac65517c202eefb6137d8eee9951122cfebcdd48045f53")
      public fun emptyDir(emptyDir: EmptyDirProperty.Builder.() -> Unit)

      /**
       * @param hostPath Specifies the configuration of a Kubernetes `hostPath` volume.
       * For more information, see
       * [hostPath](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
       * in the *Kubernetes documentation* .
       */
      public fun hostPath(hostPath: IResolvable)

      /**
       * @param hostPath Specifies the configuration of a Kubernetes `hostPath` volume.
       * For more information, see
       * [hostPath](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
       * in the *Kubernetes documentation* .
       */
      public fun hostPath(hostPath: HostPathProperty)

      /**
       * @param hostPath Specifies the configuration of a Kubernetes `hostPath` volume.
       * For more information, see
       * [hostPath](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
       * in the *Kubernetes documentation* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d360658cd48b7781285f3855793f22f6f3abd4bf05b19c4e530bf084e5b94fe")
      public fun hostPath(hostPath: HostPathProperty.Builder.() -> Unit)

      /**
       * @param name The name of the volume. 
       * The name must be allowed as a DNS subdomain name. For more information, see [DNS subdomain
       * names](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
       * in the *Kubernetes documentation* .
       */
      public fun name(name: String)

      /**
       * @param secret Specifies the configuration of a Kubernetes `secret` volume.
       * For more information, see
       * [secret](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#secret)
       * in the *Kubernetes documentation* .
       */
      public fun secret(secret: IResolvable)

      /**
       * @param secret Specifies the configuration of a Kubernetes `secret` volume.
       * For more information, see
       * [secret](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#secret)
       * in the *Kubernetes documentation* .
       */
      public fun secret(secret: EksSecretProperty)

      /**
       * @param secret Specifies the configuration of a Kubernetes `secret` volume.
       * For more information, see
       * [secret](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#secret)
       * in the *Kubernetes documentation* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c77c654dd46a76748a6e3c3effa6bc364c3a500a99e98f1ee4495ba5a5ed8ec1")
      public fun secret(secret: EksSecretProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksVolumeProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksVolumeProperty.builder()

      /**
       * @param emptyDir Specifies the configuration of a Kubernetes `emptyDir` volume.
       * For more information, see
       * [emptyDir](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#emptydir)
       * in the *Kubernetes documentation* .
       */
      override fun emptyDir(emptyDir: IResolvable) {
        cdkBuilder.emptyDir(emptyDir.let(IResolvable::unwrap))
      }

      /**
       * @param emptyDir Specifies the configuration of a Kubernetes `emptyDir` volume.
       * For more information, see
       * [emptyDir](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#emptydir)
       * in the *Kubernetes documentation* .
       */
      override fun emptyDir(emptyDir: EmptyDirProperty) {
        cdkBuilder.emptyDir(emptyDir.let(EmptyDirProperty::unwrap))
      }

      /**
       * @param emptyDir Specifies the configuration of a Kubernetes `emptyDir` volume.
       * For more information, see
       * [emptyDir](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#emptydir)
       * in the *Kubernetes documentation* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64cab76735c658ec67ac65517c202eefb6137d8eee9951122cfebcdd48045f53")
      override fun emptyDir(emptyDir: EmptyDirProperty.Builder.() -> Unit): Unit =
          emptyDir(EmptyDirProperty(emptyDir))

      /**
       * @param hostPath Specifies the configuration of a Kubernetes `hostPath` volume.
       * For more information, see
       * [hostPath](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
       * in the *Kubernetes documentation* .
       */
      override fun hostPath(hostPath: IResolvable) {
        cdkBuilder.hostPath(hostPath.let(IResolvable::unwrap))
      }

      /**
       * @param hostPath Specifies the configuration of a Kubernetes `hostPath` volume.
       * For more information, see
       * [hostPath](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
       * in the *Kubernetes documentation* .
       */
      override fun hostPath(hostPath: HostPathProperty) {
        cdkBuilder.hostPath(hostPath.let(HostPathProperty::unwrap))
      }

      /**
       * @param hostPath Specifies the configuration of a Kubernetes `hostPath` volume.
       * For more information, see
       * [hostPath](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
       * in the *Kubernetes documentation* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d360658cd48b7781285f3855793f22f6f3abd4bf05b19c4e530bf084e5b94fe")
      override fun hostPath(hostPath: HostPathProperty.Builder.() -> Unit): Unit =
          hostPath(HostPathProperty(hostPath))

      /**
       * @param name The name of the volume. 
       * The name must be allowed as a DNS subdomain name. For more information, see [DNS subdomain
       * names](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
       * in the *Kubernetes documentation* .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param secret Specifies the configuration of a Kubernetes `secret` volume.
       * For more information, see
       * [secret](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#secret)
       * in the *Kubernetes documentation* .
       */
      override fun secret(secret: IResolvable) {
        cdkBuilder.secret(secret.let(IResolvable::unwrap))
      }

      /**
       * @param secret Specifies the configuration of a Kubernetes `secret` volume.
       * For more information, see
       * [secret](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#secret)
       * in the *Kubernetes documentation* .
       */
      override fun secret(secret: EksSecretProperty) {
        cdkBuilder.secret(secret.let(EksSecretProperty::unwrap))
      }

      /**
       * @param secret Specifies the configuration of a Kubernetes `secret` volume.
       * For more information, see
       * [secret](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#secret)
       * in the *Kubernetes documentation* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c77c654dd46a76748a6e3c3effa6bc364c3a500a99e98f1ee4495ba5a5ed8ec1")
      override fun secret(secret: EksSecretProperty.Builder.() -> Unit): Unit =
          secret(EksSecretProperty(secret))

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.EksVolumeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksVolumeProperty,
    ) : CdkObject(cdkObject), EksVolumeProperty {
      /**
       * Specifies the configuration of a Kubernetes `emptyDir` volume.
       *
       * For more information, see
       * [emptyDir](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#emptydir)
       * in the *Kubernetes documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-eksvolume.html#cfn-batch-jobdefinition-eksvolume-emptydir)
       */
      override fun emptyDir(): Any? = unwrap(this).getEmptyDir()

      /**
       * Specifies the configuration of a Kubernetes `hostPath` volume.
       *
       * For more information, see
       * [hostPath](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
       * in the *Kubernetes documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-eksvolume.html#cfn-batch-jobdefinition-eksvolume-hostpath)
       */
      override fun hostPath(): Any? = unwrap(this).getHostPath()

      /**
       * The name of the volume.
       *
       * The name must be allowed as a DNS subdomain name. For more information, see [DNS subdomain
       * names](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
       * in the *Kubernetes documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-eksvolume.html#cfn-batch-jobdefinition-eksvolume-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Specifies the configuration of a Kubernetes `secret` volume.
       *
       * For more information, see
       * [secret](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#secret)
       * in the *Kubernetes documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-eksvolume.html#cfn-batch-jobdefinition-eksvolume-secret)
       */
      override fun secret(): Any? = unwrap(this).getSecret()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EksVolumeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksVolumeProperty):
          EksVolumeProperty = CdkObjectWrappers.wrap(cdkObject) as? EksVolumeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksVolumeProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksVolumeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksVolumeProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * EmptyDirProperty emptyDirProperty = EmptyDirProperty.builder()
   * .medium("medium")
   * .sizeLimit("sizeLimit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-emptydir.html)
   */
  public interface EmptyDirProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-emptydir.html#cfn-batch-jobdefinition-emptydir-medium)
     */
    public fun medium(): String? = unwrap(this).getMedium()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-emptydir.html#cfn-batch-jobdefinition-emptydir-sizelimit)
     */
    public fun sizeLimit(): String? = unwrap(this).getSizeLimit()

    /**
     * A builder for [EmptyDirProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param medium the value to be set.
       */
      public fun medium(medium: String)

      /**
       * @param sizeLimit the value to be set.
       */
      public fun sizeLimit(sizeLimit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EmptyDirProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EmptyDirProperty.builder()

      /**
       * @param medium the value to be set.
       */
      override fun medium(medium: String) {
        cdkBuilder.medium(medium)
      }

      /**
       * @param sizeLimit the value to be set.
       */
      override fun sizeLimit(sizeLimit: String) {
        cdkBuilder.sizeLimit(sizeLimit)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.EmptyDirProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EmptyDirProperty,
    ) : CdkObject(cdkObject), EmptyDirProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-emptydir.html#cfn-batch-jobdefinition-emptydir-medium)
       */
      override fun medium(): String? = unwrap(this).getMedium()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-emptydir.html#cfn-batch-jobdefinition-emptydir-sizelimit)
       */
      override fun sizeLimit(): String? = unwrap(this).getSizeLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EmptyDirProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EmptyDirProperty):
          EmptyDirProperty = CdkObjectWrappers.wrap(cdkObject) as? EmptyDirProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmptyDirProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EmptyDirProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.EmptyDirProperty
    }
  }

  /**
   * The Environment property type specifies environment variables to use in a job definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * EnvironmentProperty environmentProperty = EnvironmentProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html)
   */
  public interface EnvironmentProperty {
    /**
     * The name of the environment variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html#cfn-batch-jobdefinition-environment-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value of the environment variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html#cfn-batch-jobdefinition-environment-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [EnvironmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the environment variable.
       */
      public fun name(name: String)

      /**
       * @param value The value of the environment variable.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty.builder()

      /**
       * @param name The name of the environment variable.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the environment variable.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty,
    ) : CdkObject(cdkObject), EnvironmentProperty {
      /**
       * The name of the environment variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html#cfn-batch-jobdefinition-environment-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value of the environment variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html#cfn-batch-jobdefinition-environment-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty):
          EnvironmentProperty = CdkObjectWrappers.wrap(cdkObject) as? EnvironmentProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty
    }
  }

  /**
   * The amount of ephemeral storage to allocate for the task.
   *
   * This parameter is used to expand the total amount of ephemeral storage available, beyond the
   * default amount, for tasks hosted on AWS Fargate .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * EphemeralStorageProperty ephemeralStorageProperty = EphemeralStorageProperty.builder()
   * .sizeInGiB(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ephemeralstorage.html)
   */
  public interface EphemeralStorageProperty {
    /**
     * The total amount, in GiB, of ephemeral storage to set for the task.
     *
     * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ephemeralstorage.html#cfn-batch-jobdefinition-ephemeralstorage-sizeingib)
     */
    public fun sizeInGiB(): Number

    /**
     * A builder for [EphemeralStorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sizeInGiB The total amount, in GiB, of ephemeral storage to set for the task. 
       * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
       */
      public fun sizeInGiB(sizeInGiB: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EphemeralStorageProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EphemeralStorageProperty.builder()

      /**
       * @param sizeInGiB The total amount, in GiB, of ephemeral storage to set for the task. 
       * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
       */
      override fun sizeInGiB(sizeInGiB: Number) {
        cdkBuilder.sizeInGiB(sizeInGiB)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EphemeralStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EphemeralStorageProperty,
    ) : CdkObject(cdkObject), EphemeralStorageProperty {
      /**
       * The total amount, in GiB, of ephemeral storage to set for the task.
       *
       * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ephemeralstorage.html#cfn-batch-jobdefinition-ephemeralstorage-sizeingib)
       */
      override fun sizeInGiB(): Number = unwrap(this).getSizeInGiB()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EphemeralStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EphemeralStorageProperty):
          EphemeralStorageProperty = CdkObjectWrappers.wrap(cdkObject) as? EphemeralStorageProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EphemeralStorageProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EphemeralStorageProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.EphemeralStorageProperty
    }
  }

  /**
   * Specifies an array of up to 5 conditions to be met, and an action to take ( `RETRY` or `EXIT` )
   * if all conditions are met.
   *
   * If none of the `EvaluateOnExit` conditions in a `RetryStrategy` match, then the job is retried.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * EvaluateOnExitProperty evaluateOnExitProperty = EvaluateOnExitProperty.builder()
   * .action("action")
   * // the properties below are optional
   * .onExitCode("onExitCode")
   * .onReason("onReason")
   * .onStatusReason("onStatusReason")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-evaluateonexit.html)
   */
  public interface EvaluateOnExitProperty {
    /**
     * Specifies the action to take if all of the specified conditions ( `onStatusReason` ,
     * `onReason` , and `onExitCode` ) are met.
     *
     * The values aren't case sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-evaluateonexit.html#cfn-batch-jobdefinition-evaluateonexit-action)
     */
    public fun action(): String

    /**
     * Contains a glob pattern to match against the decimal representation of the `ExitCode`
     * returned for a job.
     *
     * The pattern can be up to 512 characters long. It can contain only numbers, and can end with
     * an asterisk (*) so that only the start of the string needs to be an exact match.
     *
     * The string can contain up to 512 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-evaluateonexit.html#cfn-batch-jobdefinition-evaluateonexit-onexitcode)
     */
    public fun onExitCode(): String? = unwrap(this).getOnExitCode()

    /**
     * Contains a glob pattern to match against the `Reason` returned for a job.
     *
     * The pattern can contain up to 512 characters. It can contain letters, numbers, periods (.),
     * colons (:), and white space (including spaces and tabs). It can optionally end with an asterisk
     * (*) so that only the start of the string needs to be an exact match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-evaluateonexit.html#cfn-batch-jobdefinition-evaluateonexit-onreason)
     */
    public fun onReason(): String? = unwrap(this).getOnReason()

    /**
     * Contains a glob pattern to match against the `StatusReason` returned for a job.
     *
     * The pattern can contain up to 512 characters. It can contain letters, numbers, periods (.),
     * colons (:), and white spaces (including spaces or tabs). It can optionally end with an asterisk
     * (*) so that only the start of the string needs to be an exact match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-evaluateonexit.html#cfn-batch-jobdefinition-evaluateonexit-onstatusreason)
     */
    public fun onStatusReason(): String? = unwrap(this).getOnStatusReason()

    /**
     * A builder for [EvaluateOnExitProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action Specifies the action to take if all of the specified conditions (
       * `onStatusReason` , `onReason` , and `onExitCode` ) are met. 
       * The values aren't case sensitive.
       */
      public fun action(action: String)

      /**
       * @param onExitCode Contains a glob pattern to match against the decimal representation of
       * the `ExitCode` returned for a job.
       * The pattern can be up to 512 characters long. It can contain only numbers, and can end with
       * an asterisk (*) so that only the start of the string needs to be an exact match.
       *
       * The string can contain up to 512 characters.
       */
      public fun onExitCode(onExitCode: String)

      /**
       * @param onReason Contains a glob pattern to match against the `Reason` returned for a job.
       * The pattern can contain up to 512 characters. It can contain letters, numbers, periods (.),
       * colons (:), and white space (including spaces and tabs). It can optionally end with an
       * asterisk (*) so that only the start of the string needs to be an exact match.
       */
      public fun onReason(onReason: String)

      /**
       * @param onStatusReason Contains a glob pattern to match against the `StatusReason` returned
       * for a job.
       * The pattern can contain up to 512 characters. It can contain letters, numbers, periods (.),
       * colons (:), and white spaces (including spaces or tabs). It can optionally end with an
       * asterisk (*) so that only the start of the string needs to be an exact match.
       */
      public fun onStatusReason(onStatusReason: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty.builder()

      /**
       * @param action Specifies the action to take if all of the specified conditions (
       * `onStatusReason` , `onReason` , and `onExitCode` ) are met. 
       * The values aren't case sensitive.
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param onExitCode Contains a glob pattern to match against the decimal representation of
       * the `ExitCode` returned for a job.
       * The pattern can be up to 512 characters long. It can contain only numbers, and can end with
       * an asterisk (*) so that only the start of the string needs to be an exact match.
       *
       * The string can contain up to 512 characters.
       */
      override fun onExitCode(onExitCode: String) {
        cdkBuilder.onExitCode(onExitCode)
      }

      /**
       * @param onReason Contains a glob pattern to match against the `Reason` returned for a job.
       * The pattern can contain up to 512 characters. It can contain letters, numbers, periods (.),
       * colons (:), and white space (including spaces and tabs). It can optionally end with an
       * asterisk (*) so that only the start of the string needs to be an exact match.
       */
      override fun onReason(onReason: String) {
        cdkBuilder.onReason(onReason)
      }

      /**
       * @param onStatusReason Contains a glob pattern to match against the `StatusReason` returned
       * for a job.
       * The pattern can contain up to 512 characters. It can contain letters, numbers, periods (.),
       * colons (:), and white spaces (including spaces or tabs). It can optionally end with an
       * asterisk (*) so that only the start of the string needs to be an exact match.
       */
      override fun onStatusReason(onStatusReason: String) {
        cdkBuilder.onStatusReason(onStatusReason)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty,
    ) : CdkObject(cdkObject), EvaluateOnExitProperty {
      /**
       * Specifies the action to take if all of the specified conditions ( `onStatusReason` ,
       * `onReason` , and `onExitCode` ) are met.
       *
       * The values aren't case sensitive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-evaluateonexit.html#cfn-batch-jobdefinition-evaluateonexit-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * Contains a glob pattern to match against the decimal representation of the `ExitCode`
       * returned for a job.
       *
       * The pattern can be up to 512 characters long. It can contain only numbers, and can end with
       * an asterisk (*) so that only the start of the string needs to be an exact match.
       *
       * The string can contain up to 512 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-evaluateonexit.html#cfn-batch-jobdefinition-evaluateonexit-onexitcode)
       */
      override fun onExitCode(): String? = unwrap(this).getOnExitCode()

      /**
       * Contains a glob pattern to match against the `Reason` returned for a job.
       *
       * The pattern can contain up to 512 characters. It can contain letters, numbers, periods (.),
       * colons (:), and white space (including spaces and tabs). It can optionally end with an
       * asterisk (*) so that only the start of the string needs to be an exact match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-evaluateonexit.html#cfn-batch-jobdefinition-evaluateonexit-onreason)
       */
      override fun onReason(): String? = unwrap(this).getOnReason()

      /**
       * Contains a glob pattern to match against the `StatusReason` returned for a job.
       *
       * The pattern can contain up to 512 characters. It can contain letters, numbers, periods (.),
       * colons (:), and white spaces (including spaces or tabs). It can optionally end with an
       * asterisk (*) so that only the start of the string needs to be an exact match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-evaluateonexit.html#cfn-batch-jobdefinition-evaluateonexit-onstatusreason)
       */
      override fun onStatusReason(): String? = unwrap(this).getOnStatusReason()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EvaluateOnExitProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty):
          EvaluateOnExitProperty = CdkObjectWrappers.wrap(cdkObject) as? EvaluateOnExitProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluateOnExitProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty
    }
  }

  /**
   * The platform configuration for jobs that are running on Fargate resources.
   *
   * Jobs that run on Amazon EC2 resources must not specify this parameter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * FargatePlatformConfigurationProperty fargatePlatformConfigurationProperty =
   * FargatePlatformConfigurationProperty.builder()
   * .platformVersion("platformVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-fargateplatformconfiguration.html)
   */
  public interface FargatePlatformConfigurationProperty {
    /**
     * The AWS Fargate platform version where the jobs are running.
     *
     * A platform version is specified only for jobs that are running on Fargate resources. If one
     * isn't specified, the `LATEST` platform version is used by default. This uses a recent, approved
     * version of the AWS Fargate platform for compute resources. For more information, see [AWS
     * Fargate platform
     * versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-fargateplatformconfiguration.html#cfn-batch-jobdefinition-fargateplatformconfiguration-platformversion)
     */
    public fun platformVersion(): String? = unwrap(this).getPlatformVersion()

    /**
     * A builder for [FargatePlatformConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param platformVersion The AWS Fargate platform version where the jobs are running.
       * A platform version is specified only for jobs that are running on Fargate resources. If one
       * isn't specified, the `LATEST` platform version is used by default. This uses a recent,
       * approved version of the AWS Fargate platform for compute resources. For more information, see
       * [AWS Fargate platform
       * versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun platformVersion(platformVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty.builder()

      /**
       * @param platformVersion The AWS Fargate platform version where the jobs are running.
       * A platform version is specified only for jobs that are running on Fargate resources. If one
       * isn't specified, the `LATEST` platform version is used by default. This uses a recent,
       * approved version of the AWS Fargate platform for compute resources. For more information, see
       * [AWS Fargate platform
       * versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty,
    ) : CdkObject(cdkObject), FargatePlatformConfigurationProperty {
      /**
       * The AWS Fargate platform version where the jobs are running.
       *
       * A platform version is specified only for jobs that are running on Fargate resources. If one
       * isn't specified, the `LATEST` platform version is used by default. This uses a recent,
       * approved version of the AWS Fargate platform for compute resources. For more information, see
       * [AWS Fargate platform
       * versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-fargateplatformconfiguration.html#cfn-batch-jobdefinition-fargateplatformconfiguration-platformversion)
       */
      override fun platformVersion(): String? = unwrap(this).getPlatformVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FargatePlatformConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty):
          FargatePlatformConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FargatePlatformConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FargatePlatformConfigurationProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * HostPathProperty hostPathProperty = HostPathProperty.builder()
   * .path("path")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-hostpath.html)
   */
  public interface HostPathProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-hostpath.html#cfn-batch-jobdefinition-hostpath-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * A builder for [HostPathProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param path the value to be set.
       */
      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.HostPathProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.HostPathProperty.builder()

      /**
       * @param path the value to be set.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.HostPathProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.HostPathProperty,
    ) : CdkObject(cdkObject), HostPathProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-hostpath.html#cfn-batch-jobdefinition-hostpath-path)
       */
      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HostPathProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.HostPathProperty):
          HostPathProperty = CdkObjectWrappers.wrap(cdkObject) as? HostPathProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostPathProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.HostPathProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.HostPathProperty
    }
  }

  /**
   * Linux-specific modifications that are applied to the container, such as details for device
   * mappings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * LinuxParametersProperty linuxParametersProperty = LinuxParametersProperty.builder()
   * .devices(List.of(DeviceProperty.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * .permissions(List.of("permissions"))
   * .build()))
   * .initProcessEnabled(false)
   * .maxSwap(123)
   * .sharedMemorySize(123)
   * .swappiness(123)
   * .tmpfs(List.of(TmpfsProperty.builder()
   * .containerPath("containerPath")
   * .size(123)
   * // the properties below are optional
   * .mountOptions(List.of("mountOptions"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-linuxparameters.html)
   */
  public interface LinuxParametersProperty {
    /**
     * Any of the host devices to expose to the container.
     *
     * This parameter maps to `Devices` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--device`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't provide
     * it for these jobs.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-linuxparameters.html#cfn-batch-jobdefinition-linuxparameters-devices)
     */
    public fun devices(): Any? = unwrap(this).getDevices()

    /**
     * If true, run an `init` process inside the container that forwards signals and reaps
     * processes.
     *
     * This parameter maps to the `--init` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . This parameter
     * requires version 1.25 of the Docker Remote API or greater on your container instance. To check
     * the Docker Remote API version on your container instance, log in to your container instance and
     * run the following command: `sudo docker version | grep "Server API version"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-linuxparameters.html#cfn-batch-jobdefinition-linuxparameters-initprocessenabled)
     */
    public fun initProcessEnabled(): Any? = unwrap(this).getInitProcessEnabled()

    /**
     * The total amount of swap memory (in MiB) a container can use.
     *
     * This parameter is translated to the `--memory-swap` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) where the value
     * is the sum of the container memory plus the `maxSwap` value. For more information, see
     * [`--memory-swap`
     * details](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/resource_constraints/#--memory-swap-details)
     * in the Docker documentation.
     *
     * If a `maxSwap` value of `0` is specified, the container doesn't use swap. Accepted values are
     * `0` or any positive integer. If the `maxSwap` parameter is omitted, the container doesn't use
     * the swap configuration for the container instance that it's running on. A `maxSwap` value must
     * be set for the `swappiness` parameter to be used.
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't provide
     * it for these jobs.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-linuxparameters.html#cfn-batch-jobdefinition-linuxparameters-maxswap)
     */
    public fun maxSwap(): Number? = unwrap(this).getMaxSwap()

    /**
     * The value for the size (in MiB) of the `/dev/shm` volume.
     *
     * This parameter maps to the `--shm-size` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't provide
     * it for these jobs.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-linuxparameters.html#cfn-batch-jobdefinition-linuxparameters-sharedmemorysize)
     */
    public fun sharedMemorySize(): Number? = unwrap(this).getSharedMemorySize()

    /**
     * You can use this parameter to tune a container's memory swappiness behavior.
     *
     * A `swappiness` value of `0` causes swapping to not occur unless absolutely necessary. A
     * `swappiness` value of `100` causes pages to be swapped aggressively. Valid values are whole
     * numbers between `0` and `100` . If the `swappiness` parameter isn't specified, a default value
     * of `60` is used. If a value isn't specified for `maxSwap` , then this parameter is ignored. If
     * `maxSwap` is set to 0, the container doesn't use swap. This parameter maps to the
     * `--memory-swappiness` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *
     * Consider the following when you use a per-container swap configuration.
     *
     * * Swap space must be enabled and allocated on the container instance for the containers to
     * use.
     *
     *
     * By default, the Amazon ECS optimized AMIs don't have swap enabled. You must enable swap on
     * the instance to use this feature. For more information, see [Instance store swap
     * volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-store-swap-volumes.html)
     * in the *Amazon EC2 User Guide for Linux Instances* or [How do I allocate memory to work as swap
     * space in an Amazon EC2 instance by using a swap
     * file?](https://docs.aws.amazon.com/premiumsupport/knowledge-center/ec2-memory-swap-file/)
     *
     *
     * * The swap space parameters are only supported for job definitions using EC2 resources.
     * * If the `maxSwap` and `swappiness` parameters are omitted from a job definition, each
     * container has a default `swappiness` value of 60. Moreover, the total swap usage is limited to
     * two times the memory reservation of the container.
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't provide
     * it for these jobs.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-linuxparameters.html#cfn-batch-jobdefinition-linuxparameters-swappiness)
     */
    public fun swappiness(): Number? = unwrap(this).getSwappiness()

    /**
     * The container path, mount options, and size (in MiB) of the `tmpfs` mount.
     *
     * This parameter maps to the `--tmpfs` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't provide
     * this parameter for this resource type.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-linuxparameters.html#cfn-batch-jobdefinition-linuxparameters-tmpfs)
     */
    public fun tmpfs(): Any? = unwrap(this).getTmpfs()

    /**
     * A builder for [LinuxParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param devices Any of the host devices to expose to the container.
       * This parameter maps to `Devices` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--device`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       */
      public fun devices(devices: IResolvable)

      /**
       * @param devices Any of the host devices to expose to the container.
       * This parameter maps to `Devices` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--device`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       */
      public fun devices(devices: List<Any>)

      /**
       * @param devices Any of the host devices to expose to the container.
       * This parameter maps to `Devices` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--device`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       */
      public fun devices(vararg devices: Any)

      /**
       * @param initProcessEnabled If true, run an `init` process inside the container that forwards
       * signals and reaps processes.
       * This parameter maps to the `--init` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . This
       * parameter requires version 1.25 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       */
      public fun initProcessEnabled(initProcessEnabled: Boolean)

      /**
       * @param initProcessEnabled If true, run an `init` process inside the container that forwards
       * signals and reaps processes.
       * This parameter maps to the `--init` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . This
       * parameter requires version 1.25 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       */
      public fun initProcessEnabled(initProcessEnabled: IResolvable)

      /**
       * @param maxSwap The total amount of swap memory (in MiB) a container can use.
       * This parameter is translated to the `--memory-swap` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) where the
       * value is the sum of the container memory plus the `maxSwap` value. For more information, see
       * [`--memory-swap`
       * details](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/resource_constraints/#--memory-swap-details)
       * in the Docker documentation.
       *
       * If a `maxSwap` value of `0` is specified, the container doesn't use swap. Accepted values
       * are `0` or any positive integer. If the `maxSwap` parameter is omitted, the container doesn't
       * use the swap configuration for the container instance that it's running on. A `maxSwap` value
       * must be set for the `swappiness` parameter to be used.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       */
      public fun maxSwap(maxSwap: Number)

      /**
       * @param sharedMemorySize The value for the size (in MiB) of the `/dev/shm` volume.
       * This parameter maps to the `--shm-size` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       */
      public fun sharedMemorySize(sharedMemorySize: Number)

      /**
       * @param swappiness You can use this parameter to tune a container's memory swappiness
       * behavior.
       * A `swappiness` value of `0` causes swapping to not occur unless absolutely necessary. A
       * `swappiness` value of `100` causes pages to be swapped aggressively. Valid values are whole
       * numbers between `0` and `100` . If the `swappiness` parameter isn't specified, a default value
       * of `60` is used. If a value isn't specified for `maxSwap` , then this parameter is ignored. If
       * `maxSwap` is set to 0, the container doesn't use swap. This parameter maps to the
       * `--memory-swappiness` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       * Consider the following when you use a per-container swap configuration.
       *
       * * Swap space must be enabled and allocated on the container instance for the containers to
       * use.
       *
       *
       * By default, the Amazon ECS optimized AMIs don't have swap enabled. You must enable swap on
       * the instance to use this feature. For more information, see [Instance store swap
       * volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-store-swap-volumes.html)
       * in the *Amazon EC2 User Guide for Linux Instances* or [How do I allocate memory to work as
       * swap space in an Amazon EC2 instance by using a swap
       * file?](https://docs.aws.amazon.com/premiumsupport/knowledge-center/ec2-memory-swap-file/)
       *
       *
       * * The swap space parameters are only supported for job definitions using EC2 resources.
       * * If the `maxSwap` and `swappiness` parameters are omitted from a job definition, each
       * container has a default `swappiness` value of 60. Moreover, the total swap usage is limited to
       * two times the memory reservation of the container.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       */
      public fun swappiness(swappiness: Number)

      /**
       * @param tmpfs The container path, mount options, and size (in MiB) of the `tmpfs` mount.
       * This parameter maps to the `--tmpfs` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide this parameter for this resource type.
       */
      public fun tmpfs(tmpfs: IResolvable)

      /**
       * @param tmpfs The container path, mount options, and size (in MiB) of the `tmpfs` mount.
       * This parameter maps to the `--tmpfs` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide this parameter for this resource type.
       */
      public fun tmpfs(tmpfs: List<Any>)

      /**
       * @param tmpfs The container path, mount options, and size (in MiB) of the `tmpfs` mount.
       * This parameter maps to the `--tmpfs` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide this parameter for this resource type.
       */
      public fun tmpfs(vararg tmpfs: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty.builder()

      /**
       * @param devices Any of the host devices to expose to the container.
       * This parameter maps to `Devices` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--device`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       */
      override fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices.let(IResolvable::unwrap))
      }

      /**
       * @param devices Any of the host devices to expose to the container.
       * This parameter maps to `Devices` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--device`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       */
      override fun devices(devices: List<Any>) {
        cdkBuilder.devices(devices)
      }

      /**
       * @param devices Any of the host devices to expose to the container.
       * This parameter maps to `Devices` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--device`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       */
      override fun devices(vararg devices: Any): Unit = devices(devices.toList())

      /**
       * @param initProcessEnabled If true, run an `init` process inside the container that forwards
       * signals and reaps processes.
       * This parameter maps to the `--init` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . This
       * parameter requires version 1.25 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       */
      override fun initProcessEnabled(initProcessEnabled: Boolean) {
        cdkBuilder.initProcessEnabled(initProcessEnabled)
      }

      /**
       * @param initProcessEnabled If true, run an `init` process inside the container that forwards
       * signals and reaps processes.
       * This parameter maps to the `--init` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . This
       * parameter requires version 1.25 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       */
      override fun initProcessEnabled(initProcessEnabled: IResolvable) {
        cdkBuilder.initProcessEnabled(initProcessEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param maxSwap The total amount of swap memory (in MiB) a container can use.
       * This parameter is translated to the `--memory-swap` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) where the
       * value is the sum of the container memory plus the `maxSwap` value. For more information, see
       * [`--memory-swap`
       * details](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/resource_constraints/#--memory-swap-details)
       * in the Docker documentation.
       *
       * If a `maxSwap` value of `0` is specified, the container doesn't use swap. Accepted values
       * are `0` or any positive integer. If the `maxSwap` parameter is omitted, the container doesn't
       * use the swap configuration for the container instance that it's running on. A `maxSwap` value
       * must be set for the `swappiness` parameter to be used.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       */
      override fun maxSwap(maxSwap: Number) {
        cdkBuilder.maxSwap(maxSwap)
      }

      /**
       * @param sharedMemorySize The value for the size (in MiB) of the `/dev/shm` volume.
       * This parameter maps to the `--shm-size` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       */
      override fun sharedMemorySize(sharedMemorySize: Number) {
        cdkBuilder.sharedMemorySize(sharedMemorySize)
      }

      /**
       * @param swappiness You can use this parameter to tune a container's memory swappiness
       * behavior.
       * A `swappiness` value of `0` causes swapping to not occur unless absolutely necessary. A
       * `swappiness` value of `100` causes pages to be swapped aggressively. Valid values are whole
       * numbers between `0` and `100` . If the `swappiness` parameter isn't specified, a default value
       * of `60` is used. If a value isn't specified for `maxSwap` , then this parameter is ignored. If
       * `maxSwap` is set to 0, the container doesn't use swap. This parameter maps to the
       * `--memory-swappiness` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       * Consider the following when you use a per-container swap configuration.
       *
       * * Swap space must be enabled and allocated on the container instance for the containers to
       * use.
       *
       *
       * By default, the Amazon ECS optimized AMIs don't have swap enabled. You must enable swap on
       * the instance to use this feature. For more information, see [Instance store swap
       * volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-store-swap-volumes.html)
       * in the *Amazon EC2 User Guide for Linux Instances* or [How do I allocate memory to work as
       * swap space in an Amazon EC2 instance by using a swap
       * file?](https://docs.aws.amazon.com/premiumsupport/knowledge-center/ec2-memory-swap-file/)
       *
       *
       * * The swap space parameters are only supported for job definitions using EC2 resources.
       * * If the `maxSwap` and `swappiness` parameters are omitted from a job definition, each
       * container has a default `swappiness` value of 60. Moreover, the total swap usage is limited to
       * two times the memory reservation of the container.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       */
      override fun swappiness(swappiness: Number) {
        cdkBuilder.swappiness(swappiness)
      }

      /**
       * @param tmpfs The container path, mount options, and size (in MiB) of the `tmpfs` mount.
       * This parameter maps to the `--tmpfs` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide this parameter for this resource type.
       */
      override fun tmpfs(tmpfs: IResolvable) {
        cdkBuilder.tmpfs(tmpfs.let(IResolvable::unwrap))
      }

      /**
       * @param tmpfs The container path, mount options, and size (in MiB) of the `tmpfs` mount.
       * This parameter maps to the `--tmpfs` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide this parameter for this resource type.
       */
      override fun tmpfs(tmpfs: List<Any>) {
        cdkBuilder.tmpfs(tmpfs)
      }

      /**
       * @param tmpfs The container path, mount options, and size (in MiB) of the `tmpfs` mount.
       * This parameter maps to the `--tmpfs` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide this parameter for this resource type.
       */
      override fun tmpfs(vararg tmpfs: Any): Unit = tmpfs(tmpfs.toList())

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty,
    ) : CdkObject(cdkObject), LinuxParametersProperty {
      /**
       * Any of the host devices to expose to the container.
       *
       * This parameter maps to `Devices` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--device`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-linuxparameters.html#cfn-batch-jobdefinition-linuxparameters-devices)
       */
      override fun devices(): Any? = unwrap(this).getDevices()

      /**
       * If true, run an `init` process inside the container that forwards signals and reaps
       * processes.
       *
       * This parameter maps to the `--init` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . This
       * parameter requires version 1.25 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-linuxparameters.html#cfn-batch-jobdefinition-linuxparameters-initprocessenabled)
       */
      override fun initProcessEnabled(): Any? = unwrap(this).getInitProcessEnabled()

      /**
       * The total amount of swap memory (in MiB) a container can use.
       *
       * This parameter is translated to the `--memory-swap` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) where the
       * value is the sum of the container memory plus the `maxSwap` value. For more information, see
       * [`--memory-swap`
       * details](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/resource_constraints/#--memory-swap-details)
       * in the Docker documentation.
       *
       * If a `maxSwap` value of `0` is specified, the container doesn't use swap. Accepted values
       * are `0` or any positive integer. If the `maxSwap` parameter is omitted, the container doesn't
       * use the swap configuration for the container instance that it's running on. A `maxSwap` value
       * must be set for the `swappiness` parameter to be used.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-linuxparameters.html#cfn-batch-jobdefinition-linuxparameters-maxswap)
       */
      override fun maxSwap(): Number? = unwrap(this).getMaxSwap()

      /**
       * The value for the size (in MiB) of the `/dev/shm` volume.
       *
       * This parameter maps to the `--shm-size` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-linuxparameters.html#cfn-batch-jobdefinition-linuxparameters-sharedmemorysize)
       */
      override fun sharedMemorySize(): Number? = unwrap(this).getSharedMemorySize()

      /**
       * You can use this parameter to tune a container's memory swappiness behavior.
       *
       * A `swappiness` value of `0` causes swapping to not occur unless absolutely necessary. A
       * `swappiness` value of `100` causes pages to be swapped aggressively. Valid values are whole
       * numbers between `0` and `100` . If the `swappiness` parameter isn't specified, a default value
       * of `60` is used. If a value isn't specified for `maxSwap` , then this parameter is ignored. If
       * `maxSwap` is set to 0, the container doesn't use swap. This parameter maps to the
       * `--memory-swappiness` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       * Consider the following when you use a per-container swap configuration.
       *
       * * Swap space must be enabled and allocated on the container instance for the containers to
       * use.
       *
       *
       * By default, the Amazon ECS optimized AMIs don't have swap enabled. You must enable swap on
       * the instance to use this feature. For more information, see [Instance store swap
       * volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-store-swap-volumes.html)
       * in the *Amazon EC2 User Guide for Linux Instances* or [How do I allocate memory to work as
       * swap space in an Amazon EC2 instance by using a swap
       * file?](https://docs.aws.amazon.com/premiumsupport/knowledge-center/ec2-memory-swap-file/)
       *
       *
       * * The swap space parameters are only supported for job definitions using EC2 resources.
       * * If the `maxSwap` and `swappiness` parameters are omitted from a job definition, each
       * container has a default `swappiness` value of 60. Moreover, the total swap usage is limited to
       * two times the memory reservation of the container.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide it for these jobs.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-linuxparameters.html#cfn-batch-jobdefinition-linuxparameters-swappiness)
       */
      override fun swappiness(): Number? = unwrap(this).getSwappiness()

      /**
       * The container path, mount options, and size (in MiB) of the `tmpfs` mount.
       *
       * This parameter maps to the `--tmpfs` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * provide this parameter for this resource type.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-linuxparameters.html#cfn-batch-jobdefinition-linuxparameters-tmpfs)
       */
      override fun tmpfs(): Any? = unwrap(this).getTmpfs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LinuxParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty):
          LinuxParametersProperty = CdkObjectWrappers.wrap(cdkObject) as? LinuxParametersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LinuxParametersProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty
    }
  }

  /**
   * Log configuration options to send to a custom log driver for the container.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * Object options;
   * LogConfigurationProperty logConfigurationProperty = LogConfigurationProperty.builder()
   * .logDriver("logDriver")
   * // the properties below are optional
   * .options(options)
   * .secretOptions(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-logconfiguration.html)
   */
  public interface LogConfigurationProperty {
    /**
     * The log driver to use for the container.
     *
     * The valid values that are listed for this parameter are log drivers that the Amazon ECS
     * container agent can communicate with by default.
     *
     * The supported log drivers are `awslogs` , `fluentd` , `gelf` , `json-file` , `journald` ,
     * `logentries` , `syslog` , and `splunk` .
     *
     *
     * Jobs that are running on Fargate resources are restricted to the `awslogs` and `splunk` log
     * drivers.
     *
     *
     * * **awslogs** - Specifies the Amazon CloudWatch Logs logging driver. For more information,
     * see [Using the awslogs log
     * driver](https://docs.aws.amazon.com/batch/latest/userguide/using_awslogs.html) in the *AWS Batch
     * User Guide* and [Amazon CloudWatch Logs logging
     * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/)
     * in the Docker documentation.
     * * **fluentd** - Specifies the Fluentd logging driver. For more information including usage
     * and options, see [Fluentd logging
     * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/fluentd/)
     * in the *Docker documentation* .
     * * **gelf** - Specifies the Graylog Extended Format (GELF) logging driver. For more
     * information including usage and options, see [Graylog Extended Format logging
     * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/gelf/) in
     * the *Docker documentation* .
     * * **journald** - Specifies the journald logging driver. For more information including usage
     * and options, see [Journald logging
     * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/journald/)
     * in the *Docker documentation* .
     * * **json-file** - Specifies the JSON file logging driver. For more information including
     * usage and options, see [JSON File logging
     * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/json-file/)
     * in the *Docker documentation* .
     * * **splunk** - Specifies the Splunk logging driver. For more information including usage and
     * options, see [Splunk logging
     * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/splunk/)
     * in the *Docker documentation* .
     * * **syslog** - Specifies the syslog logging driver. For more information including usage and
     * options, see [Syslog logging
     * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/syslog/)
     * in the *Docker documentation* .
     *
     *
     * If you have a custom driver that's not listed earlier that you want to work with the Amazon
     * ECS container agent, you can fork the Amazon ECS container agent project that's [available on
     * GitHub](https://docs.aws.amazon.com/https://github.com/aws/amazon-ecs-agent) and customize it to
     * work with that driver. We encourage you to submit pull requests for changes that you want to
     * have included. However, Amazon Web Services doesn't currently support running modified copies of
     * this software.
     *
     *
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container instance, log in to your
     * container instance and run the following command: `sudo docker version | grep "Server API
     * version"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-logconfiguration.html#cfn-batch-jobdefinition-logconfiguration-logdriver)
     */
    public fun logDriver(): String

    /**
     * The configuration options to send to the log driver.
     *
     * This parameter requires version 1.19 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container instance, log in to your
     * container instance and run the following command: `sudo docker version | grep "Server API
     * version"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-logconfiguration.html#cfn-batch-jobdefinition-logconfiguration-options)
     */
    public fun options(): Any? = unwrap(this).getOptions()

    /**
     * The secrets to pass to the log configuration.
     *
     * For more information, see [Specifying sensitive
     * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in the
     * *AWS Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-logconfiguration.html#cfn-batch-jobdefinition-logconfiguration-secretoptions)
     */
    public fun secretOptions(): Any? = unwrap(this).getSecretOptions()

    /**
     * A builder for [LogConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logDriver The log driver to use for the container. 
       * The valid values that are listed for this parameter are log drivers that the Amazon ECS
       * container agent can communicate with by default.
       *
       * The supported log drivers are `awslogs` , `fluentd` , `gelf` , `json-file` , `journald` ,
       * `logentries` , `syslog` , and `splunk` .
       *
       *
       * Jobs that are running on Fargate resources are restricted to the `awslogs` and `splunk` log
       * drivers.
       *
       *
       * * **awslogs** - Specifies the Amazon CloudWatch Logs logging driver. For more information,
       * see [Using the awslogs log
       * driver](https://docs.aws.amazon.com/batch/latest/userguide/using_awslogs.html) in the *AWS
       * Batch User Guide* and [Amazon CloudWatch Logs logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/)
       * in the Docker documentation.
       * * **fluentd** - Specifies the Fluentd logging driver. For more information including usage
       * and options, see [Fluentd logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/fluentd/)
       * in the *Docker documentation* .
       * * **gelf** - Specifies the Graylog Extended Format (GELF) logging driver. For more
       * information including usage and options, see [Graylog Extended Format logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/gelf/)
       * in the *Docker documentation* .
       * * **journald** - Specifies the journald logging driver. For more information including
       * usage and options, see [Journald logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/journald/)
       * in the *Docker documentation* .
       * * **json-file** - Specifies the JSON file logging driver. For more information including
       * usage and options, see [JSON File logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/json-file/)
       * in the *Docker documentation* .
       * * **splunk** - Specifies the Splunk logging driver. For more information including usage
       * and options, see [Splunk logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/splunk/)
       * in the *Docker documentation* .
       * * **syslog** - Specifies the syslog logging driver. For more information including usage
       * and options, see [Syslog logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/syslog/)
       * in the *Docker documentation* .
       *
       *
       * If you have a custom driver that's not listed earlier that you want to work with the Amazon
       * ECS container agent, you can fork the Amazon ECS container agent project that's [available on
       * GitHub](https://docs.aws.amazon.com/https://github.com/aws/amazon-ecs-agent) and customize it
       * to work with that driver. We encourage you to submit pull requests for changes that you want
       * to have included. However, Amazon Web Services doesn't currently support running modified
       * copies of this software.
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       */
      public fun logDriver(logDriver: String)

      /**
       * @param options The configuration options to send to the log driver.
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       */
      public fun options(options: Any)

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in
       * the *AWS Batch User Guide* .
       */
      public fun secretOptions(secretOptions: IResolvable)

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in
       * the *AWS Batch User Guide* .
       */
      public fun secretOptions(secretOptions: List<Any>)

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in
       * the *AWS Batch User Guide* .
       */
      public fun secretOptions(vararg secretOptions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty.builder()

      /**
       * @param logDriver The log driver to use for the container. 
       * The valid values that are listed for this parameter are log drivers that the Amazon ECS
       * container agent can communicate with by default.
       *
       * The supported log drivers are `awslogs` , `fluentd` , `gelf` , `json-file` , `journald` ,
       * `logentries` , `syslog` , and `splunk` .
       *
       *
       * Jobs that are running on Fargate resources are restricted to the `awslogs` and `splunk` log
       * drivers.
       *
       *
       * * **awslogs** - Specifies the Amazon CloudWatch Logs logging driver. For more information,
       * see [Using the awslogs log
       * driver](https://docs.aws.amazon.com/batch/latest/userguide/using_awslogs.html) in the *AWS
       * Batch User Guide* and [Amazon CloudWatch Logs logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/)
       * in the Docker documentation.
       * * **fluentd** - Specifies the Fluentd logging driver. For more information including usage
       * and options, see [Fluentd logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/fluentd/)
       * in the *Docker documentation* .
       * * **gelf** - Specifies the Graylog Extended Format (GELF) logging driver. For more
       * information including usage and options, see [Graylog Extended Format logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/gelf/)
       * in the *Docker documentation* .
       * * **journald** - Specifies the journald logging driver. For more information including
       * usage and options, see [Journald logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/journald/)
       * in the *Docker documentation* .
       * * **json-file** - Specifies the JSON file logging driver. For more information including
       * usage and options, see [JSON File logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/json-file/)
       * in the *Docker documentation* .
       * * **splunk** - Specifies the Splunk logging driver. For more information including usage
       * and options, see [Splunk logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/splunk/)
       * in the *Docker documentation* .
       * * **syslog** - Specifies the syslog logging driver. For more information including usage
       * and options, see [Syslog logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/syslog/)
       * in the *Docker documentation* .
       *
       *
       * If you have a custom driver that's not listed earlier that you want to work with the Amazon
       * ECS container agent, you can fork the Amazon ECS container agent project that's [available on
       * GitHub](https://docs.aws.amazon.com/https://github.com/aws/amazon-ecs-agent) and customize it
       * to work with that driver. We encourage you to submit pull requests for changes that you want
       * to have included. However, Amazon Web Services doesn't currently support running modified
       * copies of this software.
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       */
      override fun logDriver(logDriver: String) {
        cdkBuilder.logDriver(logDriver)
      }

      /**
       * @param options The configuration options to send to the log driver.
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       */
      override fun options(options: Any) {
        cdkBuilder.options(options)
      }

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in
       * the *AWS Batch User Guide* .
       */
      override fun secretOptions(secretOptions: IResolvable) {
        cdkBuilder.secretOptions(secretOptions.let(IResolvable::unwrap))
      }

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in
       * the *AWS Batch User Guide* .
       */
      override fun secretOptions(secretOptions: List<Any>) {
        cdkBuilder.secretOptions(secretOptions)
      }

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in
       * the *AWS Batch User Guide* .
       */
      override fun secretOptions(vararg secretOptions: Any): Unit =
          secretOptions(secretOptions.toList())

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty,
    ) : CdkObject(cdkObject), LogConfigurationProperty {
      /**
       * The log driver to use for the container.
       *
       * The valid values that are listed for this parameter are log drivers that the Amazon ECS
       * container agent can communicate with by default.
       *
       * The supported log drivers are `awslogs` , `fluentd` , `gelf` , `json-file` , `journald` ,
       * `logentries` , `syslog` , and `splunk` .
       *
       *
       * Jobs that are running on Fargate resources are restricted to the `awslogs` and `splunk` log
       * drivers.
       *
       *
       * * **awslogs** - Specifies the Amazon CloudWatch Logs logging driver. For more information,
       * see [Using the awslogs log
       * driver](https://docs.aws.amazon.com/batch/latest/userguide/using_awslogs.html) in the *AWS
       * Batch User Guide* and [Amazon CloudWatch Logs logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/)
       * in the Docker documentation.
       * * **fluentd** - Specifies the Fluentd logging driver. For more information including usage
       * and options, see [Fluentd logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/fluentd/)
       * in the *Docker documentation* .
       * * **gelf** - Specifies the Graylog Extended Format (GELF) logging driver. For more
       * information including usage and options, see [Graylog Extended Format logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/gelf/)
       * in the *Docker documentation* .
       * * **journald** - Specifies the journald logging driver. For more information including
       * usage and options, see [Journald logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/journald/)
       * in the *Docker documentation* .
       * * **json-file** - Specifies the JSON file logging driver. For more information including
       * usage and options, see [JSON File logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/json-file/)
       * in the *Docker documentation* .
       * * **splunk** - Specifies the Splunk logging driver. For more information including usage
       * and options, see [Splunk logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/splunk/)
       * in the *Docker documentation* .
       * * **syslog** - Specifies the syslog logging driver. For more information including usage
       * and options, see [Syslog logging
       * driver](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/syslog/)
       * in the *Docker documentation* .
       *
       *
       * If you have a custom driver that's not listed earlier that you want to work with the Amazon
       * ECS container agent, you can fork the Amazon ECS container agent project that's [available on
       * GitHub](https://docs.aws.amazon.com/https://github.com/aws/amazon-ecs-agent) and customize it
       * to work with that driver. We encourage you to submit pull requests for changes that you want
       * to have included. However, Amazon Web Services doesn't currently support running modified
       * copies of this software.
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-logconfiguration.html#cfn-batch-jobdefinition-logconfiguration-logdriver)
       */
      override fun logDriver(): String = unwrap(this).getLogDriver()

      /**
       * The configuration options to send to the log driver.
       *
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version | grep "Server API
       * version"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-logconfiguration.html#cfn-batch-jobdefinition-logconfiguration-options)
       */
      override fun options(): Any? = unwrap(this).getOptions()

      /**
       * The secrets to pass to the log configuration.
       *
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in
       * the *AWS Batch User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-logconfiguration.html#cfn-batch-jobdefinition-logconfiguration-secretoptions)
       */
      override fun secretOptions(): Any? = unwrap(this).getSecretOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty):
          LogConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? LogConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty
    }
  }

  /**
   * Metadata about the Kubernetes pod.
   *
   * For more information, see [Understanding Kubernetes
   * Objects](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/kubernetes-objects/)
   * in the *Kubernetes documentation* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * Object labels;
   * MetadataProperty metadataProperty = MetadataProperty.builder()
   * .labels(labels)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-metadata.html)
   */
  public interface MetadataProperty {
    /**
     * Key-value pairs used to identify, sort, and organize cube resources.
     *
     * Can contain up to 63 uppercase letters, lowercase letters, numbers, hyphens (-), and
     * underscores (_). Labels can be added or modified at any time. Each resource can have multiple
     * labels, but each key must be unique for a given object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-metadata.html#cfn-batch-jobdefinition-metadata-labels)
     */
    public fun labels(): Any? = unwrap(this).getLabels()

    /**
     * A builder for [MetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param labels Key-value pairs used to identify, sort, and organize cube resources.
       * Can contain up to 63 uppercase letters, lowercase letters, numbers, hyphens (-), and
       * underscores (_). Labels can be added or modified at any time. Each resource can have multiple
       * labels, but each key must be unique for a given object.
       */
      public fun labels(labels: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.MetadataProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.MetadataProperty.builder()

      /**
       * @param labels Key-value pairs used to identify, sort, and organize cube resources.
       * Can contain up to 63 uppercase letters, lowercase letters, numbers, hyphens (-), and
       * underscores (_). Labels can be added or modified at any time. Each resource can have multiple
       * labels, but each key must be unique for a given object.
       */
      override fun labels(labels: Any) {
        cdkBuilder.labels(labels)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.MetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.MetadataProperty,
    ) : CdkObject(cdkObject), MetadataProperty {
      /**
       * Key-value pairs used to identify, sort, and organize cube resources.
       *
       * Can contain up to 63 uppercase letters, lowercase letters, numbers, hyphens (-), and
       * underscores (_). Labels can be added or modified at any time. Each resource can have multiple
       * labels, but each key must be unique for a given object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-metadata.html#cfn-batch-jobdefinition-metadata-labels)
       */
      override fun labels(): Any? = unwrap(this).getLabels()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.MetadataProperty):
          MetadataProperty = CdkObjectWrappers.wrap(cdkObject) as? MetadataProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetadataProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.MetadataProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.MetadataProperty
    }
  }

  /**
   * Details for a Docker volume mount point that's used in a job's container properties.
   *
   * This parameter maps to `Volumes` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.43/#tag/Container/operation/ContainerCreate)
   * section of the *Docker Remote API* and the `--volume` option to docker run.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * MountPointsProperty mountPointsProperty = MountPointsProperty.builder()
   * .containerPath("containerPath")
   * .readOnly(false)
   * .sourceVolume("sourceVolume")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html)
   */
  public interface MountPointsProperty {
    /**
     * The path on the container where the host volume is mounted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-containerpath)
     */
    public fun containerPath(): String? = unwrap(this).getContainerPath()

    /**
     * If this value is `true` , the container has read-only access to the volume.
     *
     * Otherwise, the container can write to the volume. The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-readonly)
     */
    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    /**
     * The name of the volume to mount.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-sourcevolume)
     */
    public fun sourceVolume(): String? = unwrap(this).getSourceVolume()

    /**
     * A builder for [MountPointsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerPath The path on the container where the host volume is mounted.
       */
      public fun containerPath(containerPath: String)

      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * Otherwise, the container can write to the volume. The default value is `false` .
       */
      public fun readOnly(readOnly: Boolean)

      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * Otherwise, the container can write to the volume. The default value is `false` .
       */
      public fun readOnly(readOnly: IResolvable)

      /**
       * @param sourceVolume The name of the volume to mount.
       */
      public fun sourceVolume(sourceVolume: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty.builder()

      /**
       * @param containerPath The path on the container where the host volume is mounted.
       */
      override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * Otherwise, the container can write to the volume. The default value is `false` .
       */
      override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * Otherwise, the container can write to the volume. The default value is `false` .
       */
      override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      /**
       * @param sourceVolume The name of the volume to mount.
       */
      override fun sourceVolume(sourceVolume: String) {
        cdkBuilder.sourceVolume(sourceVolume)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty,
    ) : CdkObject(cdkObject), MountPointsProperty {
      /**
       * The path on the container where the host volume is mounted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-containerpath)
       */
      override fun containerPath(): String? = unwrap(this).getContainerPath()

      /**
       * If this value is `true` , the container has read-only access to the volume.
       *
       * Otherwise, the container can write to the volume. The default value is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-readonly)
       */
      override fun readOnly(): Any? = unwrap(this).getReadOnly()

      /**
       * The name of the volume to mount.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-sourcevolume)
       */
      override fun sourceVolume(): String? = unwrap(this).getSourceVolume()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MountPointsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty):
          MountPointsProperty = CdkObjectWrappers.wrap(cdkObject) as? MountPointsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MountPointsProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty
    }
  }

  /**
   * The network configuration for jobs that are running on Fargate resources.
   *
   * Jobs that are running on Amazon EC2 resources must not specify this parameter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * NetworkConfigurationProperty networkConfigurationProperty =
   * NetworkConfigurationProperty.builder()
   * .assignPublicIp("assignPublicIp")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-networkconfiguration.html)
   */
  public interface NetworkConfigurationProperty {
    /**
     * Indicates whether the job has a public IP address.
     *
     * For a job that's running on Fargate resources in a private subnet to send outbound traffic to
     * the internet (for example, to pull container images), the private subnet requires a NAT gateway
     * be attached to route requests to the internet. For more information, see [Amazon ECS task
     * networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
     * the *Amazon Elastic Container Service Developer Guide* . The default value is " `DISABLED` ".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-networkconfiguration.html#cfn-batch-jobdefinition-networkconfiguration-assignpublicip)
     */
    public fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

    /**
     * A builder for [NetworkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param assignPublicIp Indicates whether the job has a public IP address.
       * For a job that's running on Fargate resources in a private subnet to send outbound traffic
       * to the internet (for example, to pull container images), the private subnet requires a NAT
       * gateway be attached to route requests to the internet. For more information, see [Amazon ECS
       * task
       * networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html)
       * in the *Amazon Elastic Container Service Developer Guide* . The default value is " `DISABLED`
       * ".
       */
      public fun assignPublicIp(assignPublicIp: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty.builder()

      /**
       * @param assignPublicIp Indicates whether the job has a public IP address.
       * For a job that's running on Fargate resources in a private subnet to send outbound traffic
       * to the internet (for example, to pull container images), the private subnet requires a NAT
       * gateway be attached to route requests to the internet. For more information, see [Amazon ECS
       * task
       * networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html)
       * in the *Amazon Elastic Container Service Developer Guide* . The default value is " `DISABLED`
       * ".
       */
      override fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty,
    ) : CdkObject(cdkObject), NetworkConfigurationProperty {
      /**
       * Indicates whether the job has a public IP address.
       *
       * For a job that's running on Fargate resources in a private subnet to send outbound traffic
       * to the internet (for example, to pull container images), the private subnet requires a NAT
       * gateway be attached to route requests to the internet. For more information, see [Amazon ECS
       * task
       * networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html)
       * in the *Amazon Elastic Container Service Developer Guide* . The default value is " `DISABLED`
       * ".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-networkconfiguration.html#cfn-batch-jobdefinition-networkconfiguration-assignpublicip)
       */
      override fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty):
          NetworkConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NetworkConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty
    }
  }

  /**
   * An object that represents the node properties of a multi-node parallel job.
   *
   *
   * Node properties can't be specified for Amazon EKS based job definitions.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * Object options;
   * NodePropertiesProperty nodePropertiesProperty = NodePropertiesProperty.builder()
   * .mainNode(123)
   * .nodeRangeProperties(List.of(NodeRangePropertyProperty.builder()
   * .targetNodes("targetNodes")
   * // the properties below are optional
   * .container(ContainerPropertiesProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .command(List.of("command"))
   * .environment(List.of(EnvironmentProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .ephemeralStorage(EphemeralStorageProperty.builder()
   * .sizeInGiB(123)
   * .build())
   * .executionRoleArn("executionRoleArn")
   * .fargatePlatformConfiguration(FargatePlatformConfigurationProperty.builder()
   * .platformVersion("platformVersion")
   * .build())
   * .instanceType("instanceType")
   * .jobRoleArn("jobRoleArn")
   * .linuxParameters(LinuxParametersProperty.builder()
   * .devices(List.of(DeviceProperty.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * .permissions(List.of("permissions"))
   * .build()))
   * .initProcessEnabled(false)
   * .maxSwap(123)
   * .sharedMemorySize(123)
   * .swappiness(123)
   * .tmpfs(List.of(TmpfsProperty.builder()
   * .containerPath("containerPath")
   * .size(123)
   * // the properties below are optional
   * .mountOptions(List.of("mountOptions"))
   * .build()))
   * .build())
   * .logConfiguration(LogConfigurationProperty.builder()
   * .logDriver("logDriver")
   * // the properties below are optional
   * .options(options)
   * .secretOptions(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .build())
   * .memory(123)
   * .mountPoints(List.of(MountPointsProperty.builder()
   * .containerPath("containerPath")
   * .readOnly(false)
   * .sourceVolume("sourceVolume")
   * .build()))
   * .networkConfiguration(NetworkConfigurationProperty.builder()
   * .assignPublicIp("assignPublicIp")
   * .build())
   * .privileged(false)
   * .readonlyRootFilesystem(false)
   * .repositoryCredentials(RepositoryCredentialsProperty.builder()
   * .credentialsParameter("credentialsParameter")
   * .build())
   * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
   * .type("type")
   * .value("value")
   * .build()))
   * .runtimePlatform(RuntimePlatformProperty.builder()
   * .cpuArchitecture("cpuArchitecture")
   * .operatingSystemFamily("operatingSystemFamily")
   * .build())
   * .secrets(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .ulimits(List.of(UlimitProperty.builder()
   * .hardLimit(123)
   * .name("name")
   * .softLimit(123)
   * .build()))
   * .user("user")
   * .vcpus(123)
   * .volumes(List.of(VolumesProperty.builder()
   * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
   * .fileSystemId("fileSystemId")
   * // the properties below are optional
   * .authorizationConfig(AuthorizationConfigProperty.builder()
   * .accessPointId("accessPointId")
   * .iam("iam")
   * .build())
   * .rootDirectory("rootDirectory")
   * .transitEncryption("transitEncryption")
   * .transitEncryptionPort(123)
   * .build())
   * .host(VolumesHostProperty.builder()
   * .sourcePath("sourcePath")
   * .build())
   * .name("name")
   * .build()))
   * .build())
   * .ecsProperties(EcsPropertiesProperty.builder()
   * .taskProperties(List.of(EcsTaskPropertiesProperty.builder()
   * .containers(List.of(TaskContainerPropertiesProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .command(List.of("command"))
   * .dependsOn(List.of(TaskContainerDependencyProperty.builder()
   * .condition("condition")
   * .containerName("containerName")
   * .build()))
   * .environment(List.of(EnvironmentProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .essential(false)
   * .linuxParameters(LinuxParametersProperty.builder()
   * .devices(List.of(DeviceProperty.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * .permissions(List.of("permissions"))
   * .build()))
   * .initProcessEnabled(false)
   * .maxSwap(123)
   * .sharedMemorySize(123)
   * .swappiness(123)
   * .tmpfs(List.of(TmpfsProperty.builder()
   * .containerPath("containerPath")
   * .size(123)
   * // the properties below are optional
   * .mountOptions(List.of("mountOptions"))
   * .build()))
   * .build())
   * .logConfiguration(LogConfigurationProperty.builder()
   * .logDriver("logDriver")
   * // the properties below are optional
   * .options(options)
   * .secretOptions(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .build())
   * .mountPoints(List.of(MountPointsProperty.builder()
   * .containerPath("containerPath")
   * .readOnly(false)
   * .sourceVolume("sourceVolume")
   * .build()))
   * .name("name")
   * .privileged(false)
   * .readonlyRootFilesystem(false)
   * .repositoryCredentials(RepositoryCredentialsProperty.builder()
   * .credentialsParameter("credentialsParameter")
   * .build())
   * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
   * .type("type")
   * .value("value")
   * .build()))
   * .secrets(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .ulimits(List.of(UlimitProperty.builder()
   * .hardLimit(123)
   * .name("name")
   * .softLimit(123)
   * .build()))
   * .user("user")
   * .build()))
   * .ephemeralStorage(EphemeralStorageProperty.builder()
   * .sizeInGiB(123)
   * .build())
   * .executionRoleArn("executionRoleArn")
   * .ipcMode("ipcMode")
   * .networkConfiguration(NetworkConfigurationProperty.builder()
   * .assignPublicIp("assignPublicIp")
   * .build())
   * .pidMode("pidMode")
   * .platformVersion("platformVersion")
   * .runtimePlatform(RuntimePlatformProperty.builder()
   * .cpuArchitecture("cpuArchitecture")
   * .operatingSystemFamily("operatingSystemFamily")
   * .build())
   * .taskRoleArn("taskRoleArn")
   * .volumes(List.of(VolumesProperty.builder()
   * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
   * .fileSystemId("fileSystemId")
   * // the properties below are optional
   * .authorizationConfig(AuthorizationConfigProperty.builder()
   * .accessPointId("accessPointId")
   * .iam("iam")
   * .build())
   * .rootDirectory("rootDirectory")
   * .transitEncryption("transitEncryption")
   * .transitEncryptionPort(123)
   * .build())
   * .host(VolumesHostProperty.builder()
   * .sourcePath("sourcePath")
   * .build())
   * .name("name")
   * .build()))
   * .build()))
   * .build())
   * .instanceTypes(List.of("instanceTypes"))
   * .build()))
   * .numNodes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html)
   */
  public interface NodePropertiesProperty {
    /**
     * Specifies the node index for the main node of a multi-node parallel job.
     *
     * This node index value must be fewer than the number of nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-mainnode)
     */
    public fun mainNode(): Number

    /**
     * A list of node ranges and their properties that are associated with a multi-node parallel
     * job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-noderangeproperties)
     */
    public fun nodeRangeProperties(): Any

    /**
     * The number of nodes that are associated with a multi-node parallel job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-numnodes)
     */
    public fun numNodes(): Number

    /**
     * A builder for [NodePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mainNode Specifies the node index for the main node of a multi-node parallel job. 
       * This node index value must be fewer than the number of nodes.
       */
      public fun mainNode(mainNode: Number)

      /**
       * @param nodeRangeProperties A list of node ranges and their properties that are associated
       * with a multi-node parallel job. 
       */
      public fun nodeRangeProperties(nodeRangeProperties: IResolvable)

      /**
       * @param nodeRangeProperties A list of node ranges and their properties that are associated
       * with a multi-node parallel job. 
       */
      public fun nodeRangeProperties(nodeRangeProperties: List<Any>)

      /**
       * @param nodeRangeProperties A list of node ranges and their properties that are associated
       * with a multi-node parallel job. 
       */
      public fun nodeRangeProperties(vararg nodeRangeProperties: Any)

      /**
       * @param numNodes The number of nodes that are associated with a multi-node parallel job. 
       */
      public fun numNodes(numNodes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty.builder()

      /**
       * @param mainNode Specifies the node index for the main node of a multi-node parallel job. 
       * This node index value must be fewer than the number of nodes.
       */
      override fun mainNode(mainNode: Number) {
        cdkBuilder.mainNode(mainNode)
      }

      /**
       * @param nodeRangeProperties A list of node ranges and their properties that are associated
       * with a multi-node parallel job. 
       */
      override fun nodeRangeProperties(nodeRangeProperties: IResolvable) {
        cdkBuilder.nodeRangeProperties(nodeRangeProperties.let(IResolvable::unwrap))
      }

      /**
       * @param nodeRangeProperties A list of node ranges and their properties that are associated
       * with a multi-node parallel job. 
       */
      override fun nodeRangeProperties(nodeRangeProperties: List<Any>) {
        cdkBuilder.nodeRangeProperties(nodeRangeProperties)
      }

      /**
       * @param nodeRangeProperties A list of node ranges and their properties that are associated
       * with a multi-node parallel job. 
       */
      override fun nodeRangeProperties(vararg nodeRangeProperties: Any): Unit =
          nodeRangeProperties(nodeRangeProperties.toList())

      /**
       * @param numNodes The number of nodes that are associated with a multi-node parallel job. 
       */
      override fun numNodes(numNodes: Number) {
        cdkBuilder.numNodes(numNodes)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty,
    ) : CdkObject(cdkObject), NodePropertiesProperty {
      /**
       * Specifies the node index for the main node of a multi-node parallel job.
       *
       * This node index value must be fewer than the number of nodes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-mainnode)
       */
      override fun mainNode(): Number = unwrap(this).getMainNode()

      /**
       * A list of node ranges and their properties that are associated with a multi-node parallel
       * job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-noderangeproperties)
       */
      override fun nodeRangeProperties(): Any = unwrap(this).getNodeRangeProperties()

      /**
       * The number of nodes that are associated with a multi-node parallel job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-numnodes)
       */
      override fun numNodes(): Number = unwrap(this).getNumNodes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NodePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty):
          NodePropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as? NodePropertiesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodePropertiesProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty
    }
  }

  /**
   * This is an object that represents the properties of the node range for a multi-node parallel
   * job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * Object options;
   * NodeRangePropertyProperty nodeRangePropertyProperty = NodeRangePropertyProperty.builder()
   * .targetNodes("targetNodes")
   * // the properties below are optional
   * .container(ContainerPropertiesProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .command(List.of("command"))
   * .environment(List.of(EnvironmentProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .ephemeralStorage(EphemeralStorageProperty.builder()
   * .sizeInGiB(123)
   * .build())
   * .executionRoleArn("executionRoleArn")
   * .fargatePlatformConfiguration(FargatePlatformConfigurationProperty.builder()
   * .platformVersion("platformVersion")
   * .build())
   * .instanceType("instanceType")
   * .jobRoleArn("jobRoleArn")
   * .linuxParameters(LinuxParametersProperty.builder()
   * .devices(List.of(DeviceProperty.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * .permissions(List.of("permissions"))
   * .build()))
   * .initProcessEnabled(false)
   * .maxSwap(123)
   * .sharedMemorySize(123)
   * .swappiness(123)
   * .tmpfs(List.of(TmpfsProperty.builder()
   * .containerPath("containerPath")
   * .size(123)
   * // the properties below are optional
   * .mountOptions(List.of("mountOptions"))
   * .build()))
   * .build())
   * .logConfiguration(LogConfigurationProperty.builder()
   * .logDriver("logDriver")
   * // the properties below are optional
   * .options(options)
   * .secretOptions(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .build())
   * .memory(123)
   * .mountPoints(List.of(MountPointsProperty.builder()
   * .containerPath("containerPath")
   * .readOnly(false)
   * .sourceVolume("sourceVolume")
   * .build()))
   * .networkConfiguration(NetworkConfigurationProperty.builder()
   * .assignPublicIp("assignPublicIp")
   * .build())
   * .privileged(false)
   * .readonlyRootFilesystem(false)
   * .repositoryCredentials(RepositoryCredentialsProperty.builder()
   * .credentialsParameter("credentialsParameter")
   * .build())
   * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
   * .type("type")
   * .value("value")
   * .build()))
   * .runtimePlatform(RuntimePlatformProperty.builder()
   * .cpuArchitecture("cpuArchitecture")
   * .operatingSystemFamily("operatingSystemFamily")
   * .build())
   * .secrets(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .ulimits(List.of(UlimitProperty.builder()
   * .hardLimit(123)
   * .name("name")
   * .softLimit(123)
   * .build()))
   * .user("user")
   * .vcpus(123)
   * .volumes(List.of(VolumesProperty.builder()
   * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
   * .fileSystemId("fileSystemId")
   * // the properties below are optional
   * .authorizationConfig(AuthorizationConfigProperty.builder()
   * .accessPointId("accessPointId")
   * .iam("iam")
   * .build())
   * .rootDirectory("rootDirectory")
   * .transitEncryption("transitEncryption")
   * .transitEncryptionPort(123)
   * .build())
   * .host(VolumesHostProperty.builder()
   * .sourcePath("sourcePath")
   * .build())
   * .name("name")
   * .build()))
   * .build())
   * .ecsProperties(EcsPropertiesProperty.builder()
   * .taskProperties(List.of(EcsTaskPropertiesProperty.builder()
   * .containers(List.of(TaskContainerPropertiesProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .command(List.of("command"))
   * .dependsOn(List.of(TaskContainerDependencyProperty.builder()
   * .condition("condition")
   * .containerName("containerName")
   * .build()))
   * .environment(List.of(EnvironmentProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .essential(false)
   * .linuxParameters(LinuxParametersProperty.builder()
   * .devices(List.of(DeviceProperty.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * .permissions(List.of("permissions"))
   * .build()))
   * .initProcessEnabled(false)
   * .maxSwap(123)
   * .sharedMemorySize(123)
   * .swappiness(123)
   * .tmpfs(List.of(TmpfsProperty.builder()
   * .containerPath("containerPath")
   * .size(123)
   * // the properties below are optional
   * .mountOptions(List.of("mountOptions"))
   * .build()))
   * .build())
   * .logConfiguration(LogConfigurationProperty.builder()
   * .logDriver("logDriver")
   * // the properties below are optional
   * .options(options)
   * .secretOptions(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .build())
   * .mountPoints(List.of(MountPointsProperty.builder()
   * .containerPath("containerPath")
   * .readOnly(false)
   * .sourceVolume("sourceVolume")
   * .build()))
   * .name("name")
   * .privileged(false)
   * .readonlyRootFilesystem(false)
   * .repositoryCredentials(RepositoryCredentialsProperty.builder()
   * .credentialsParameter("credentialsParameter")
   * .build())
   * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
   * .type("type")
   * .value("value")
   * .build()))
   * .secrets(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .ulimits(List.of(UlimitProperty.builder()
   * .hardLimit(123)
   * .name("name")
   * .softLimit(123)
   * .build()))
   * .user("user")
   * .build()))
   * .ephemeralStorage(EphemeralStorageProperty.builder()
   * .sizeInGiB(123)
   * .build())
   * .executionRoleArn("executionRoleArn")
   * .ipcMode("ipcMode")
   * .networkConfiguration(NetworkConfigurationProperty.builder()
   * .assignPublicIp("assignPublicIp")
   * .build())
   * .pidMode("pidMode")
   * .platformVersion("platformVersion")
   * .runtimePlatform(RuntimePlatformProperty.builder()
   * .cpuArchitecture("cpuArchitecture")
   * .operatingSystemFamily("operatingSystemFamily")
   * .build())
   * .taskRoleArn("taskRoleArn")
   * .volumes(List.of(VolumesProperty.builder()
   * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
   * .fileSystemId("fileSystemId")
   * // the properties below are optional
   * .authorizationConfig(AuthorizationConfigProperty.builder()
   * .accessPointId("accessPointId")
   * .iam("iam")
   * .build())
   * .rootDirectory("rootDirectory")
   * .transitEncryption("transitEncryption")
   * .transitEncryptionPort(123)
   * .build())
   * .host(VolumesHostProperty.builder()
   * .sourcePath("sourcePath")
   * .build())
   * .name("name")
   * .build()))
   * .build()))
   * .build())
   * .instanceTypes(List.of("instanceTypes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html)
   */
  public interface NodeRangePropertyProperty {
    /**
     * The container details for the node range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html#cfn-batch-jobdefinition-noderangeproperty-container)
     */
    public fun container(): Any? = unwrap(this).getContainer()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html#cfn-batch-jobdefinition-noderangeproperty-ecsproperties)
     */
    public fun ecsProperties(): Any? = unwrap(this).getEcsProperties()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html#cfn-batch-jobdefinition-noderangeproperty-instancetypes)
     */
    public fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

    /**
     * The range of nodes, using node index values.
     *
     * A range of `0:3` indicates nodes with index values of `0` through `3` . If the starting range
     * value is omitted ( `:n` ), then `0` is used to start the range. If the ending range value is
     * omitted ( `n:` ), then the highest possible node index is used to end the range. Your
     * accumulative node ranges must account for all nodes ( `0:n` ). You can nest node ranges (for
     * example, `0:10` and `4:5` ). In this case, the `4:5` range properties override the `0:10`
     * properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html#cfn-batch-jobdefinition-noderangeproperty-targetnodes)
     */
    public fun targetNodes(): String

    /**
     * A builder for [NodeRangePropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param container The container details for the node range.
       */
      public fun container(container: IResolvable)

      /**
       * @param container The container details for the node range.
       */
      public fun container(container: ContainerPropertiesProperty)

      /**
       * @param container The container details for the node range.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("beb00cb70cdb4bab988f0a25a32c1d8f94755a029fbe4437334920bf4c93357f")
      public fun container(container: ContainerPropertiesProperty.Builder.() -> Unit)

      /**
       * @param ecsProperties the value to be set.
       */
      public fun ecsProperties(ecsProperties: IResolvable)

      /**
       * @param ecsProperties the value to be set.
       */
      public fun ecsProperties(ecsProperties: EcsPropertiesProperty)

      /**
       * @param ecsProperties the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("66d8ff9e0f4f24b1d9c32aa5170dfcbcdf49c358ce50e8c393906952bbdddbcf")
      public fun ecsProperties(ecsProperties: EcsPropertiesProperty.Builder.() -> Unit)

      /**
       * @param instanceTypes the value to be set.
       */
      public fun instanceTypes(instanceTypes: List<String>)

      /**
       * @param instanceTypes the value to be set.
       */
      public fun instanceTypes(vararg instanceTypes: String)

      /**
       * @param targetNodes The range of nodes, using node index values. 
       * A range of `0:3` indicates nodes with index values of `0` through `3` . If the starting
       * range value is omitted ( `:n` ), then `0` is used to start the range. If the ending range
       * value is omitted ( `n:` ), then the highest possible node index is used to end the range. Your
       * accumulative node ranges must account for all nodes ( `0:n` ). You can nest node ranges (for
       * example, `0:10` and `4:5` ). In this case, the `4:5` range properties override the `0:10`
       * properties.
       */
      public fun targetNodes(targetNodes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty.builder()

      /**
       * @param container The container details for the node range.
       */
      override fun container(container: IResolvable) {
        cdkBuilder.container(container.let(IResolvable::unwrap))
      }

      /**
       * @param container The container details for the node range.
       */
      override fun container(container: ContainerPropertiesProperty) {
        cdkBuilder.container(container.let(ContainerPropertiesProperty::unwrap))
      }

      /**
       * @param container The container details for the node range.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("beb00cb70cdb4bab988f0a25a32c1d8f94755a029fbe4437334920bf4c93357f")
      override fun container(container: ContainerPropertiesProperty.Builder.() -> Unit): Unit =
          container(ContainerPropertiesProperty(container))

      /**
       * @param ecsProperties the value to be set.
       */
      override fun ecsProperties(ecsProperties: IResolvable) {
        cdkBuilder.ecsProperties(ecsProperties.let(IResolvable::unwrap))
      }

      /**
       * @param ecsProperties the value to be set.
       */
      override fun ecsProperties(ecsProperties: EcsPropertiesProperty) {
        cdkBuilder.ecsProperties(ecsProperties.let(EcsPropertiesProperty::unwrap))
      }

      /**
       * @param ecsProperties the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("66d8ff9e0f4f24b1d9c32aa5170dfcbcdf49c358ce50e8c393906952bbdddbcf")
      override fun ecsProperties(ecsProperties: EcsPropertiesProperty.Builder.() -> Unit): Unit =
          ecsProperties(EcsPropertiesProperty(ecsProperties))

      /**
       * @param instanceTypes the value to be set.
       */
      override fun instanceTypes(instanceTypes: List<String>) {
        cdkBuilder.instanceTypes(instanceTypes)
      }

      /**
       * @param instanceTypes the value to be set.
       */
      override fun instanceTypes(vararg instanceTypes: String): Unit =
          instanceTypes(instanceTypes.toList())

      /**
       * @param targetNodes The range of nodes, using node index values. 
       * A range of `0:3` indicates nodes with index values of `0` through `3` . If the starting
       * range value is omitted ( `:n` ), then `0` is used to start the range. If the ending range
       * value is omitted ( `n:` ), then the highest possible node index is used to end the range. Your
       * accumulative node ranges must account for all nodes ( `0:n` ). You can nest node ranges (for
       * example, `0:10` and `4:5` ). In this case, the `4:5` range properties override the `0:10`
       * properties.
       */
      override fun targetNodes(targetNodes: String) {
        cdkBuilder.targetNodes(targetNodes)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty,
    ) : CdkObject(cdkObject), NodeRangePropertyProperty {
      /**
       * The container details for the node range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html#cfn-batch-jobdefinition-noderangeproperty-container)
       */
      override fun container(): Any? = unwrap(this).getContainer()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html#cfn-batch-jobdefinition-noderangeproperty-ecsproperties)
       */
      override fun ecsProperties(): Any? = unwrap(this).getEcsProperties()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html#cfn-batch-jobdefinition-noderangeproperty-instancetypes)
       */
      override fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

      /**
       * The range of nodes, using node index values.
       *
       * A range of `0:3` indicates nodes with index values of `0` through `3` . If the starting
       * range value is omitted ( `:n` ), then `0` is used to start the range. If the ending range
       * value is omitted ( `n:` ), then the highest possible node index is used to end the range. Your
       * accumulative node ranges must account for all nodes ( `0:n` ). You can nest node ranges (for
       * example, `0:10` and `4:5` ). In this case, the `4:5` range properties override the `0:10`
       * properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html#cfn-batch-jobdefinition-noderangeproperty-targetnodes)
       */
      override fun targetNodes(): String = unwrap(this).getTargetNodes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NodeRangePropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty):
          NodeRangePropertyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NodeRangePropertyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeRangePropertyProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty
    }
  }

  /**
   * The properties for the pod.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * Object labels;
   * Object limits;
   * Object requests;
   * PodPropertiesProperty podPropertiesProperty = PodPropertiesProperty.builder()
   * .containers(List.of(EksContainerProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .args(List.of("args"))
   * .command(List.of("command"))
   * .env(List.of(EksContainerEnvironmentVariableProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .value("value")
   * .build()))
   * .imagePullPolicy("imagePullPolicy")
   * .name("name")
   * .resources(ResourcesProperty.builder()
   * .limits(limits)
   * .requests(requests)
   * .build())
   * .securityContext(SecurityContextProperty.builder()
   * .privileged(false)
   * .readOnlyRootFilesystem(false)
   * .runAsGroup(123)
   * .runAsNonRoot(false)
   * .runAsUser(123)
   * .build())
   * .volumeMounts(List.of(EksContainerVolumeMountProperty.builder()
   * .mountPath("mountPath")
   * .name("name")
   * .readOnly(false)
   * .build()))
   * .build()))
   * .dnsPolicy("dnsPolicy")
   * .hostNetwork(false)
   * .initContainers(List.of(EksContainerProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .args(List.of("args"))
   * .command(List.of("command"))
   * .env(List.of(EksContainerEnvironmentVariableProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .value("value")
   * .build()))
   * .imagePullPolicy("imagePullPolicy")
   * .name("name")
   * .resources(ResourcesProperty.builder()
   * .limits(limits)
   * .requests(requests)
   * .build())
   * .securityContext(SecurityContextProperty.builder()
   * .privileged(false)
   * .readOnlyRootFilesystem(false)
   * .runAsGroup(123)
   * .runAsNonRoot(false)
   * .runAsUser(123)
   * .build())
   * .volumeMounts(List.of(EksContainerVolumeMountProperty.builder()
   * .mountPath("mountPath")
   * .name("name")
   * .readOnly(false)
   * .build()))
   * .build()))
   * .metadata(MetadataProperty.builder()
   * .labels(labels)
   * .build())
   * .serviceAccountName("serviceAccountName")
   * .shareProcessNamespace(false)
   * .volumes(List.of(EksVolumeProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .emptyDir(EmptyDirProperty.builder()
   * .medium("medium")
   * .sizeLimit("sizeLimit")
   * .build())
   * .hostPath(HostPathProperty.builder()
   * .path("path")
   * .build())
   * .secret(EksSecretProperty.builder()
   * .secretName("secretName")
   * // the properties below are optional
   * .optional(false)
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html)
   */
  public interface PodPropertiesProperty {
    /**
     * The properties of the container that's used on the Amazon EKS pod.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-containers)
     */
    public fun containers(): Any? = unwrap(this).getContainers()

    /**
     * The DNS policy for the pod.
     *
     * The default value is `ClusterFirst` . If the `hostNetwork` parameter is not specified, the
     * default is `ClusterFirstWithHostNet` . `ClusterFirst` indicates that any DNS query that does not
     * match the configured cluster domain suffix is forwarded to the upstream nameserver inherited
     * from the node. For more information, see [Pod's DNS
     * policy](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy)
     * in the *Kubernetes documentation* .
     *
     * Valid values: `Default` | `ClusterFirst` | `ClusterFirstWithHostNet`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-dnspolicy)
     */
    public fun dnsPolicy(): String? = unwrap(this).getDnsPolicy()

    /**
     * Indicates if the pod uses the hosts' network IP address.
     *
     * The default value is `true` . Setting this to `false` enables the Kubernetes pod networking
     * model. Most AWS Batch workloads are egress-only and don't require the overhead of IP allocation
     * for each pod for incoming connections. For more information, see [Host
     * namespaces](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces)
     * and [Pod
     * networking](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking)
     * in the *Kubernetes documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-hostnetwork)
     */
    public fun hostNetwork(): Any? = unwrap(this).getHostNetwork()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-initcontainers)
     */
    public fun initContainers(): Any? = unwrap(this).getInitContainers()

    /**
     * Metadata about the Kubernetes pod.
     *
     * For more information, see [Understanding Kubernetes
     * Objects](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/kubernetes-objects/)
     * in the *Kubernetes documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-metadata)
     */
    public fun metadata(): Any? = unwrap(this).getMetadata()

    /**
     * The name of the service account that's used to run the pod.
     *
     * For more information, see [Kubernetes service
     * accounts](https://docs.aws.amazon.com/eks/latest/userguide/service-accounts.html) and [Configure
     * a Kubernetes service account to assume an IAM
     * role](https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html) in
     * the *Amazon EKS User Guide* and [Configure service accounts for
     * pods](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/)
     * in the *Kubernetes documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-serviceaccountname)
     */
    public fun serviceAccountName(): String? = unwrap(this).getServiceAccountName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-shareprocessnamespace)
     */
    public fun shareProcessNamespace(): Any? = unwrap(this).getShareProcessNamespace()

    /**
     * Specifies the volumes for a job definition that uses Amazon EKS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-volumes)
     */
    public fun volumes(): Any? = unwrap(this).getVolumes()

    /**
     * A builder for [PodPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containers The properties of the container that's used on the Amazon EKS pod.
       */
      public fun containers(containers: IResolvable)

      /**
       * @param containers The properties of the container that's used on the Amazon EKS pod.
       */
      public fun containers(containers: List<Any>)

      /**
       * @param containers The properties of the container that's used on the Amazon EKS pod.
       */
      public fun containers(vararg containers: Any)

      /**
       * @param dnsPolicy The DNS policy for the pod.
       * The default value is `ClusterFirst` . If the `hostNetwork` parameter is not specified, the
       * default is `ClusterFirstWithHostNet` . `ClusterFirst` indicates that any DNS query that does
       * not match the configured cluster domain suffix is forwarded to the upstream nameserver
       * inherited from the node. For more information, see [Pod's DNS
       * policy](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy)
       * in the *Kubernetes documentation* .
       *
       * Valid values: `Default` | `ClusterFirst` | `ClusterFirstWithHostNet`
       */
      public fun dnsPolicy(dnsPolicy: String)

      /**
       * @param hostNetwork Indicates if the pod uses the hosts' network IP address.
       * The default value is `true` . Setting this to `false` enables the Kubernetes pod networking
       * model. Most AWS Batch workloads are egress-only and don't require the overhead of IP
       * allocation for each pod for incoming connections. For more information, see [Host
       * namespaces](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces)
       * and [Pod
       * networking](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking)
       * in the *Kubernetes documentation* .
       */
      public fun hostNetwork(hostNetwork: Boolean)

      /**
       * @param hostNetwork Indicates if the pod uses the hosts' network IP address.
       * The default value is `true` . Setting this to `false` enables the Kubernetes pod networking
       * model. Most AWS Batch workloads are egress-only and don't require the overhead of IP
       * allocation for each pod for incoming connections. For more information, see [Host
       * namespaces](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces)
       * and [Pod
       * networking](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking)
       * in the *Kubernetes documentation* .
       */
      public fun hostNetwork(hostNetwork: IResolvable)

      /**
       * @param initContainers the value to be set.
       */
      public fun initContainers(initContainers: IResolvable)

      /**
       * @param initContainers the value to be set.
       */
      public fun initContainers(initContainers: List<Any>)

      /**
       * @param initContainers the value to be set.
       */
      public fun initContainers(vararg initContainers: Any)

      /**
       * @param metadata Metadata about the Kubernetes pod.
       * For more information, see [Understanding Kubernetes
       * Objects](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/kubernetes-objects/)
       * in the *Kubernetes documentation* .
       */
      public fun metadata(metadata: IResolvable)

      /**
       * @param metadata Metadata about the Kubernetes pod.
       * For more information, see [Understanding Kubernetes
       * Objects](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/kubernetes-objects/)
       * in the *Kubernetes documentation* .
       */
      public fun metadata(metadata: MetadataProperty)

      /**
       * @param metadata Metadata about the Kubernetes pod.
       * For more information, see [Understanding Kubernetes
       * Objects](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/kubernetes-objects/)
       * in the *Kubernetes documentation* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4b08aa845521711bde52771185c3919a7e074569382fc63bb622ded44148f2b")
      public fun metadata(metadata: MetadataProperty.Builder.() -> Unit)

      /**
       * @param serviceAccountName The name of the service account that's used to run the pod.
       * For more information, see [Kubernetes service
       * accounts](https://docs.aws.amazon.com/eks/latest/userguide/service-accounts.html) and
       * [Configure a Kubernetes service account to assume an IAM
       * role](https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html) in
       * the *Amazon EKS User Guide* and [Configure service accounts for
       * pods](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/)
       * in the *Kubernetes documentation* .
       */
      public fun serviceAccountName(serviceAccountName: String)

      /**
       * @param shareProcessNamespace the value to be set.
       */
      public fun shareProcessNamespace(shareProcessNamespace: Boolean)

      /**
       * @param shareProcessNamespace the value to be set.
       */
      public fun shareProcessNamespace(shareProcessNamespace: IResolvable)

      /**
       * @param volumes Specifies the volumes for a job definition that uses Amazon EKS resources.
       */
      public fun volumes(volumes: IResolvable)

      /**
       * @param volumes Specifies the volumes for a job definition that uses Amazon EKS resources.
       */
      public fun volumes(volumes: List<Any>)

      /**
       * @param volumes Specifies the volumes for a job definition that uses Amazon EKS resources.
       */
      public fun volumes(vararg volumes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.PodPropertiesProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.PodPropertiesProperty.builder()

      /**
       * @param containers The properties of the container that's used on the Amazon EKS pod.
       */
      override fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers.let(IResolvable::unwrap))
      }

      /**
       * @param containers The properties of the container that's used on the Amazon EKS pod.
       */
      override fun containers(containers: List<Any>) {
        cdkBuilder.containers(containers)
      }

      /**
       * @param containers The properties of the container that's used on the Amazon EKS pod.
       */
      override fun containers(vararg containers: Any): Unit = containers(containers.toList())

      /**
       * @param dnsPolicy The DNS policy for the pod.
       * The default value is `ClusterFirst` . If the `hostNetwork` parameter is not specified, the
       * default is `ClusterFirstWithHostNet` . `ClusterFirst` indicates that any DNS query that does
       * not match the configured cluster domain suffix is forwarded to the upstream nameserver
       * inherited from the node. For more information, see [Pod's DNS
       * policy](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy)
       * in the *Kubernetes documentation* .
       *
       * Valid values: `Default` | `ClusterFirst` | `ClusterFirstWithHostNet`
       */
      override fun dnsPolicy(dnsPolicy: String) {
        cdkBuilder.dnsPolicy(dnsPolicy)
      }

      /**
       * @param hostNetwork Indicates if the pod uses the hosts' network IP address.
       * The default value is `true` . Setting this to `false` enables the Kubernetes pod networking
       * model. Most AWS Batch workloads are egress-only and don't require the overhead of IP
       * allocation for each pod for incoming connections. For more information, see [Host
       * namespaces](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces)
       * and [Pod
       * networking](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking)
       * in the *Kubernetes documentation* .
       */
      override fun hostNetwork(hostNetwork: Boolean) {
        cdkBuilder.hostNetwork(hostNetwork)
      }

      /**
       * @param hostNetwork Indicates if the pod uses the hosts' network IP address.
       * The default value is `true` . Setting this to `false` enables the Kubernetes pod networking
       * model. Most AWS Batch workloads are egress-only and don't require the overhead of IP
       * allocation for each pod for incoming connections. For more information, see [Host
       * namespaces](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces)
       * and [Pod
       * networking](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking)
       * in the *Kubernetes documentation* .
       */
      override fun hostNetwork(hostNetwork: IResolvable) {
        cdkBuilder.hostNetwork(hostNetwork.let(IResolvable::unwrap))
      }

      /**
       * @param initContainers the value to be set.
       */
      override fun initContainers(initContainers: IResolvable) {
        cdkBuilder.initContainers(initContainers.let(IResolvable::unwrap))
      }

      /**
       * @param initContainers the value to be set.
       */
      override fun initContainers(initContainers: List<Any>) {
        cdkBuilder.initContainers(initContainers)
      }

      /**
       * @param initContainers the value to be set.
       */
      override fun initContainers(vararg initContainers: Any): Unit =
          initContainers(initContainers.toList())

      /**
       * @param metadata Metadata about the Kubernetes pod.
       * For more information, see [Understanding Kubernetes
       * Objects](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/kubernetes-objects/)
       * in the *Kubernetes documentation* .
       */
      override fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata.let(IResolvable::unwrap))
      }

      /**
       * @param metadata Metadata about the Kubernetes pod.
       * For more information, see [Understanding Kubernetes
       * Objects](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/kubernetes-objects/)
       * in the *Kubernetes documentation* .
       */
      override fun metadata(metadata: MetadataProperty) {
        cdkBuilder.metadata(metadata.let(MetadataProperty::unwrap))
      }

      /**
       * @param metadata Metadata about the Kubernetes pod.
       * For more information, see [Understanding Kubernetes
       * Objects](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/kubernetes-objects/)
       * in the *Kubernetes documentation* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4b08aa845521711bde52771185c3919a7e074569382fc63bb622ded44148f2b")
      override fun metadata(metadata: MetadataProperty.Builder.() -> Unit): Unit =
          metadata(MetadataProperty(metadata))

      /**
       * @param serviceAccountName The name of the service account that's used to run the pod.
       * For more information, see [Kubernetes service
       * accounts](https://docs.aws.amazon.com/eks/latest/userguide/service-accounts.html) and
       * [Configure a Kubernetes service account to assume an IAM
       * role](https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html) in
       * the *Amazon EKS User Guide* and [Configure service accounts for
       * pods](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/)
       * in the *Kubernetes documentation* .
       */
      override fun serviceAccountName(serviceAccountName: String) {
        cdkBuilder.serviceAccountName(serviceAccountName)
      }

      /**
       * @param shareProcessNamespace the value to be set.
       */
      override fun shareProcessNamespace(shareProcessNamespace: Boolean) {
        cdkBuilder.shareProcessNamespace(shareProcessNamespace)
      }

      /**
       * @param shareProcessNamespace the value to be set.
       */
      override fun shareProcessNamespace(shareProcessNamespace: IResolvable) {
        cdkBuilder.shareProcessNamespace(shareProcessNamespace.let(IResolvable::unwrap))
      }

      /**
       * @param volumes Specifies the volumes for a job definition that uses Amazon EKS resources.
       */
      override fun volumes(volumes: IResolvable) {
        cdkBuilder.volumes(volumes.let(IResolvable::unwrap))
      }

      /**
       * @param volumes Specifies the volumes for a job definition that uses Amazon EKS resources.
       */
      override fun volumes(volumes: List<Any>) {
        cdkBuilder.volumes(volumes)
      }

      /**
       * @param volumes Specifies the volumes for a job definition that uses Amazon EKS resources.
       */
      override fun volumes(vararg volumes: Any): Unit = volumes(volumes.toList())

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.PodPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.PodPropertiesProperty,
    ) : CdkObject(cdkObject), PodPropertiesProperty {
      /**
       * The properties of the container that's used on the Amazon EKS pod.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-containers)
       */
      override fun containers(): Any? = unwrap(this).getContainers()

      /**
       * The DNS policy for the pod.
       *
       * The default value is `ClusterFirst` . If the `hostNetwork` parameter is not specified, the
       * default is `ClusterFirstWithHostNet` . `ClusterFirst` indicates that any DNS query that does
       * not match the configured cluster domain suffix is forwarded to the upstream nameserver
       * inherited from the node. For more information, see [Pod's DNS
       * policy](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy)
       * in the *Kubernetes documentation* .
       *
       * Valid values: `Default` | `ClusterFirst` | `ClusterFirstWithHostNet`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-dnspolicy)
       */
      override fun dnsPolicy(): String? = unwrap(this).getDnsPolicy()

      /**
       * Indicates if the pod uses the hosts' network IP address.
       *
       * The default value is `true` . Setting this to `false` enables the Kubernetes pod networking
       * model. Most AWS Batch workloads are egress-only and don't require the overhead of IP
       * allocation for each pod for incoming connections. For more information, see [Host
       * namespaces](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces)
       * and [Pod
       * networking](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking)
       * in the *Kubernetes documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-hostnetwork)
       */
      override fun hostNetwork(): Any? = unwrap(this).getHostNetwork()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-initcontainers)
       */
      override fun initContainers(): Any? = unwrap(this).getInitContainers()

      /**
       * Metadata about the Kubernetes pod.
       *
       * For more information, see [Understanding Kubernetes
       * Objects](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/kubernetes-objects/)
       * in the *Kubernetes documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-metadata)
       */
      override fun metadata(): Any? = unwrap(this).getMetadata()

      /**
       * The name of the service account that's used to run the pod.
       *
       * For more information, see [Kubernetes service
       * accounts](https://docs.aws.amazon.com/eks/latest/userguide/service-accounts.html) and
       * [Configure a Kubernetes service account to assume an IAM
       * role](https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html) in
       * the *Amazon EKS User Guide* and [Configure service accounts for
       * pods](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/)
       * in the *Kubernetes documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-serviceaccountname)
       */
      override fun serviceAccountName(): String? = unwrap(this).getServiceAccountName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-shareprocessnamespace)
       */
      override fun shareProcessNamespace(): Any? = unwrap(this).getShareProcessNamespace()

      /**
       * Specifies the volumes for a job definition that uses Amazon EKS resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html#cfn-batch-jobdefinition-podproperties-volumes)
       */
      override fun volumes(): Any? = unwrap(this).getVolumes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PodPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.PodPropertiesProperty):
          PodPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as? PodPropertiesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PodPropertiesProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.PodPropertiesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.PodPropertiesProperty
    }
  }

  /**
   * The repository credentials for private registry authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * RepositoryCredentialsProperty repositoryCredentialsProperty =
   * RepositoryCredentialsProperty.builder()
   * .credentialsParameter("credentialsParameter")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-repositorycredentials.html)
   */
  public interface RepositoryCredentialsProperty {
    /**
     * The Amazon Resource Name (ARN) of the secret containing the private repository credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-repositorycredentials.html#cfn-batch-jobdefinition-repositorycredentials-credentialsparameter)
     */
    public fun credentialsParameter(): String

    /**
     * A builder for [RepositoryCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param credentialsParameter The Amazon Resource Name (ARN) of the secret containing the
       * private repository credentials. 
       */
      public fun credentialsParameter(credentialsParameter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.RepositoryCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.RepositoryCredentialsProperty.builder()

      /**
       * @param credentialsParameter The Amazon Resource Name (ARN) of the secret containing the
       * private repository credentials. 
       */
      override fun credentialsParameter(credentialsParameter: String) {
        cdkBuilder.credentialsParameter(credentialsParameter)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.RepositoryCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.RepositoryCredentialsProperty,
    ) : CdkObject(cdkObject), RepositoryCredentialsProperty {
      /**
       * The Amazon Resource Name (ARN) of the secret containing the private repository credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-repositorycredentials.html#cfn-batch-jobdefinition-repositorycredentials-credentialsparameter)
       */
      override fun credentialsParameter(): String = unwrap(this).getCredentialsParameter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.RepositoryCredentialsProperty):
          RepositoryCredentialsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RepositoryCredentialsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryCredentialsProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.RepositoryCredentialsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.RepositoryCredentialsProperty
    }
  }

  /**
   * The type and amount of a resource to assign to a container.
   *
   * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * ResourceRequirementProperty resourceRequirementProperty = ResourceRequirementProperty.builder()
   * .type("type")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-resourcerequirement.html)
   */
  public interface ResourceRequirementProperty {
    /**
     * The type of resource to assign to a container.
     *
     * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-resourcerequirement.html#cfn-batch-jobdefinition-resourcerequirement-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * The quantity of the specified resource to reserve for the container. The values vary based on
     * the `type` specified.
     *
     * * **type="GPU"** - The number of physical GPUs to reserve for the container. Make sure that
     * the number of GPUs reserved for all containers in a job doesn't exceed the number of available
     * GPUs on the compute resource that the job is launched on.
     *
     *
     * GPUs aren't available for jobs that are running on Fargate resources.
     *
     *
     * * **type="MEMORY"** - The memory hard limit (in MiB) present to the container. This parameter
     * is supported for jobs that are running on Amazon EC2 resources. If your container attempts to
     * exceed the memory specified, the container is terminated. This parameter maps to `Memory` in the
     * [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . You must
     * specify at least 4 MiB of memory for a job. This is required but can be specified in several
     * places for multi-node parallel (MNP) jobs. It must be specified for each node at least once.
     * This parameter maps to `Memory` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *
     *
     * If you're trying to maximize your resource utilization by providing your jobs as much memory
     * as possible for a particular instance type, see [Memory
     * management](https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html) in the
     * *AWS Batch User Guide* .
     *
     *
     * For jobs that are running on Fargate resources, then `value` is the hard limit (in MiB), and
     * must match one of the supported values and the `VCPU` values must be one of the values supported
     * for that memory value.
     *
     * * **value = 512** - `VCPU` = 0.25
     * * **value = 1024** - `VCPU` = 0.25 or 0.5
     * * **value = 2048** - `VCPU` = 0.25, 0.5, or 1
     * * **value = 3072** - `VCPU` = 0.5, or 1
     * * **value = 4096** - `VCPU` = 0.5, 1, or 2
     * * **value = 5120, 6144, or 7168** - `VCPU` = 1 or 2
     * * **value = 8192** - `VCPU` = 1, 2, or 4
     * * **value = 9216, 10240, 11264, 12288, 13312, 14336, or 15360** - `VCPU` = 2 or 4
     * * **value = 16384** - `VCPU` = 2, 4, or 8
     * * **value = 17408, 18432, 19456, 21504, 22528, 23552, 25600, 26624, 27648, 29696, or
     * 30720** - `VCPU` = 4
     * * **value = 20480, 24576, or 28672** - `VCPU` = 4 or 8
     * * **value = 36864, 45056, 53248, or 61440** - `VCPU` = 8
     * * **value = 32768, 40960, 49152, or 57344** - `VCPU` = 8 or 16
     * * **value = 65536, 73728, 81920, 90112, 98304, 106496, 114688, or 122880** - `VCPU` = 16
     * * **type="VCPU"** - The number of vCPUs reserved for the container. This parameter maps to
     * `CpuShares` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
     * `--cpu-shares` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Each vCPU is
     * equivalent to 1,024 CPU shares. For Amazon EC2 resources, you must specify at least one vCPU.
     * This is required but can be specified in several places; it must be specified for each node at
     * least once.
     *
     * The default for the Fargate On-Demand vCPU resource count quota is 6 vCPUs. For more
     * information about Fargate quotas, see [AWS Fargate
     * quotas](https://docs.aws.amazon.com/general/latest/gr/ecs-service.html#service-quotas-fargate)
     * in the *AWS General Reference* .
     *
     * For jobs that are running on Fargate resources, then `value` must match one of the supported
     * values and the `MEMORY` values must be one of the values supported for that `VCPU` value. The
     * supported values are 0.25, 0.5, 1, 2, 4, 8, and 16
     *
     * * **value = 0.25** - `MEMORY` = 512, 1024, or 2048
     * * **value = 0.5** - `MEMORY` = 1024, 2048, 3072, or 4096
     * * **value = 1** - `MEMORY` = 2048, 3072, 4096, 5120, 6144, 7168, or 8192
     * * **value = 2** - `MEMORY` = 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288, 13312,
     * 14336, 15360, or 16384
     * * **value = 4** - `MEMORY` = 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, 16384,
     * 17408, 18432, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or
     * 30720
     * * **value = 8** - `MEMORY` = 16384, 20480, 24576, 28672, 32768, 36864, 40960, 45056, 49152,
     * 53248, 57344, or 61440
     * * **value = 16** - `MEMORY` = 32768, 40960, 49152, 57344, 65536, 73728, 81920, 90112, 98304,
     * 106496, 114688, or 122880
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-resourcerequirement.html#cfn-batch-jobdefinition-resourcerequirement-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ResourceRequirementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of resource to assign to a container.
       * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
       */
      public fun type(type: String)

      /**
       * @param value The quantity of the specified resource to reserve for the container. The
       * values vary based on the `type` specified.
       * * **type="GPU"** - The number of physical GPUs to reserve for the container. Make sure that
       * the number of GPUs reserved for all containers in a job doesn't exceed the number of available
       * GPUs on the compute resource that the job is launched on.
       *
       *
       * GPUs aren't available for jobs that are running on Fargate resources.
       *
       *
       * * **type="MEMORY"** - The memory hard limit (in MiB) present to the container. This
       * parameter is supported for jobs that are running on Amazon EC2 resources. If your container
       * attempts to exceed the memory specified, the container is terminated. This parameter maps to
       * `Memory` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . You must
       * specify at least 4 MiB of memory for a job. This is required but can be specified in several
       * places for multi-node parallel (MNP) jobs. It must be specified for each node at least once.
       * This parameter maps to `Memory` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * If you're trying to maximize your resource utilization by providing your jobs as much
       * memory as possible for a particular instance type, see [Memory
       * management](https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html) in the
       * *AWS Batch User Guide* .
       *
       *
       * For jobs that are running on Fargate resources, then `value` is the hard limit (in MiB),
       * and must match one of the supported values and the `VCPU` values must be one of the values
       * supported for that memory value.
       *
       * * **value = 512** - `VCPU` = 0.25
       * * **value = 1024** - `VCPU` = 0.25 or 0.5
       * * **value = 2048** - `VCPU` = 0.25, 0.5, or 1
       * * **value = 3072** - `VCPU` = 0.5, or 1
       * * **value = 4096** - `VCPU` = 0.5, 1, or 2
       * * **value = 5120, 6144, or 7168** - `VCPU` = 1 or 2
       * * **value = 8192** - `VCPU` = 1, 2, or 4
       * * **value = 9216, 10240, 11264, 12288, 13312, 14336, or 15360** - `VCPU` = 2 or 4
       * * **value = 16384** - `VCPU` = 2, 4, or 8
       * * **value = 17408, 18432, 19456, 21504, 22528, 23552, 25600, 26624, 27648, 29696, or
       * 30720** - `VCPU` = 4
       * * **value = 20480, 24576, or 28672** - `VCPU` = 4 or 8
       * * **value = 36864, 45056, 53248, or 61440** - `VCPU` = 8
       * * **value = 32768, 40960, 49152, or 57344** - `VCPU` = 8 or 16
       * * **value = 65536, 73728, 81920, 90112, 98304, 106496, 114688, or 122880** - `VCPU` = 16
       * * **type="VCPU"** - The number of vCPUs reserved for the container. This parameter maps to
       * `CpuShares` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--cpu-shares` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Each vCPU is
       * equivalent to 1,024 CPU shares. For Amazon EC2 resources, you must specify at least one vCPU.
       * This is required but can be specified in several places; it must be specified for each node at
       * least once.
       *
       * The default for the Fargate On-Demand vCPU resource count quota is 6 vCPUs. For more
       * information about Fargate quotas, see [AWS Fargate
       * quotas](https://docs.aws.amazon.com/general/latest/gr/ecs-service.html#service-quotas-fargate)
       * in the *AWS General Reference* .
       *
       * For jobs that are running on Fargate resources, then `value` must match one of the
       * supported values and the `MEMORY` values must be one of the values supported for that `VCPU`
       * value. The supported values are 0.25, 0.5, 1, 2, 4, 8, and 16
       *
       * * **value = 0.25** - `MEMORY` = 512, 1024, or 2048
       * * **value = 0.5** - `MEMORY` = 1024, 2048, 3072, or 4096
       * * **value = 1** - `MEMORY` = 2048, 3072, 4096, 5120, 6144, 7168, or 8192
       * * **value = 2** - `MEMORY` = 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288,
       * 13312, 14336, 15360, or 16384
       * * **value = 4** - `MEMORY` = 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, 16384,
       * 17408, 18432, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or
       * 30720
       * * **value = 8** - `MEMORY` = 16384, 20480, 24576, 28672, 32768, 36864, 40960, 45056, 49152,
       * 53248, 57344, or 61440
       * * **value = 16** - `MEMORY` = 32768, 40960, 49152, 57344, 65536, 73728, 81920, 90112,
       * 98304, 106496, 114688, or 122880
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourceRequirementProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourceRequirementProperty.builder()

      /**
       * @param type The type of resource to assign to a container.
       * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The quantity of the specified resource to reserve for the container. The
       * values vary based on the `type` specified.
       * * **type="GPU"** - The number of physical GPUs to reserve for the container. Make sure that
       * the number of GPUs reserved for all containers in a job doesn't exceed the number of available
       * GPUs on the compute resource that the job is launched on.
       *
       *
       * GPUs aren't available for jobs that are running on Fargate resources.
       *
       *
       * * **type="MEMORY"** - The memory hard limit (in MiB) present to the container. This
       * parameter is supported for jobs that are running on Amazon EC2 resources. If your container
       * attempts to exceed the memory specified, the container is terminated. This parameter maps to
       * `Memory` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . You must
       * specify at least 4 MiB of memory for a job. This is required but can be specified in several
       * places for multi-node parallel (MNP) jobs. It must be specified for each node at least once.
       * This parameter maps to `Memory` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * If you're trying to maximize your resource utilization by providing your jobs as much
       * memory as possible for a particular instance type, see [Memory
       * management](https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html) in the
       * *AWS Batch User Guide* .
       *
       *
       * For jobs that are running on Fargate resources, then `value` is the hard limit (in MiB),
       * and must match one of the supported values and the `VCPU` values must be one of the values
       * supported for that memory value.
       *
       * * **value = 512** - `VCPU` = 0.25
       * * **value = 1024** - `VCPU` = 0.25 or 0.5
       * * **value = 2048** - `VCPU` = 0.25, 0.5, or 1
       * * **value = 3072** - `VCPU` = 0.5, or 1
       * * **value = 4096** - `VCPU` = 0.5, 1, or 2
       * * **value = 5120, 6144, or 7168** - `VCPU` = 1 or 2
       * * **value = 8192** - `VCPU` = 1, 2, or 4
       * * **value = 9216, 10240, 11264, 12288, 13312, 14336, or 15360** - `VCPU` = 2 or 4
       * * **value = 16384** - `VCPU` = 2, 4, or 8
       * * **value = 17408, 18432, 19456, 21504, 22528, 23552, 25600, 26624, 27648, 29696, or
       * 30720** - `VCPU` = 4
       * * **value = 20480, 24576, or 28672** - `VCPU` = 4 or 8
       * * **value = 36864, 45056, 53248, or 61440** - `VCPU` = 8
       * * **value = 32768, 40960, 49152, or 57344** - `VCPU` = 8 or 16
       * * **value = 65536, 73728, 81920, 90112, 98304, 106496, 114688, or 122880** - `VCPU` = 16
       * * **type="VCPU"** - The number of vCPUs reserved for the container. This parameter maps to
       * `CpuShares` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--cpu-shares` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Each vCPU is
       * equivalent to 1,024 CPU shares. For Amazon EC2 resources, you must specify at least one vCPU.
       * This is required but can be specified in several places; it must be specified for each node at
       * least once.
       *
       * The default for the Fargate On-Demand vCPU resource count quota is 6 vCPUs. For more
       * information about Fargate quotas, see [AWS Fargate
       * quotas](https://docs.aws.amazon.com/general/latest/gr/ecs-service.html#service-quotas-fargate)
       * in the *AWS General Reference* .
       *
       * For jobs that are running on Fargate resources, then `value` must match one of the
       * supported values and the `MEMORY` values must be one of the values supported for that `VCPU`
       * value. The supported values are 0.25, 0.5, 1, 2, 4, 8, and 16
       *
       * * **value = 0.25** - `MEMORY` = 512, 1024, or 2048
       * * **value = 0.5** - `MEMORY` = 1024, 2048, 3072, or 4096
       * * **value = 1** - `MEMORY` = 2048, 3072, 4096, 5120, 6144, 7168, or 8192
       * * **value = 2** - `MEMORY` = 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288,
       * 13312, 14336, 15360, or 16384
       * * **value = 4** - `MEMORY` = 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, 16384,
       * 17408, 18432, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or
       * 30720
       * * **value = 8** - `MEMORY` = 16384, 20480, 24576, 28672, 32768, 36864, 40960, 45056, 49152,
       * 53248, 57344, or 61440
       * * **value = 16** - `MEMORY` = 32768, 40960, 49152, 57344, 65536, 73728, 81920, 90112,
       * 98304, 106496, 114688, or 122880
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourceRequirementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.ResourceRequirementProperty,
    ) : CdkObject(cdkObject), ResourceRequirementProperty {
      /**
       * The type of resource to assign to a container.
       *
       * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-resourcerequirement.html#cfn-batch-jobdefinition-resourcerequirement-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * The quantity of the specified resource to reserve for the container. The values vary based
       * on the `type` specified.
       *
       * * **type="GPU"** - The number of physical GPUs to reserve for the container. Make sure that
       * the number of GPUs reserved for all containers in a job doesn't exceed the number of available
       * GPUs on the compute resource that the job is launched on.
       *
       *
       * GPUs aren't available for jobs that are running on Fargate resources.
       *
       *
       * * **type="MEMORY"** - The memory hard limit (in MiB) present to the container. This
       * parameter is supported for jobs that are running on Amazon EC2 resources. If your container
       * attempts to exceed the memory specified, the container is terminated. This parameter maps to
       * `Memory` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . You must
       * specify at least 4 MiB of memory for a job. This is required but can be specified in several
       * places for multi-node parallel (MNP) jobs. It must be specified for each node at least once.
       * This parameter maps to `Memory` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * If you're trying to maximize your resource utilization by providing your jobs as much
       * memory as possible for a particular instance type, see [Memory
       * management](https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html) in the
       * *AWS Batch User Guide* .
       *
       *
       * For jobs that are running on Fargate resources, then `value` is the hard limit (in MiB),
       * and must match one of the supported values and the `VCPU` values must be one of the values
       * supported for that memory value.
       *
       * * **value = 512** - `VCPU` = 0.25
       * * **value = 1024** - `VCPU` = 0.25 or 0.5
       * * **value = 2048** - `VCPU` = 0.25, 0.5, or 1
       * * **value = 3072** - `VCPU` = 0.5, or 1
       * * **value = 4096** - `VCPU` = 0.5, 1, or 2
       * * **value = 5120, 6144, or 7168** - `VCPU` = 1 or 2
       * * **value = 8192** - `VCPU` = 1, 2, or 4
       * * **value = 9216, 10240, 11264, 12288, 13312, 14336, or 15360** - `VCPU` = 2 or 4
       * * **value = 16384** - `VCPU` = 2, 4, or 8
       * * **value = 17408, 18432, 19456, 21504, 22528, 23552, 25600, 26624, 27648, 29696, or
       * 30720** - `VCPU` = 4
       * * **value = 20480, 24576, or 28672** - `VCPU` = 4 or 8
       * * **value = 36864, 45056, 53248, or 61440** - `VCPU` = 8
       * * **value = 32768, 40960, 49152, or 57344** - `VCPU` = 8 or 16
       * * **value = 65536, 73728, 81920, 90112, 98304, 106496, 114688, or 122880** - `VCPU` = 16
       * * **type="VCPU"** - The number of vCPUs reserved for the container. This parameter maps to
       * `CpuShares` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--cpu-shares` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Each vCPU is
       * equivalent to 1,024 CPU shares. For Amazon EC2 resources, you must specify at least one vCPU.
       * This is required but can be specified in several places; it must be specified for each node at
       * least once.
       *
       * The default for the Fargate On-Demand vCPU resource count quota is 6 vCPUs. For more
       * information about Fargate quotas, see [AWS Fargate
       * quotas](https://docs.aws.amazon.com/general/latest/gr/ecs-service.html#service-quotas-fargate)
       * in the *AWS General Reference* .
       *
       * For jobs that are running on Fargate resources, then `value` must match one of the
       * supported values and the `MEMORY` values must be one of the values supported for that `VCPU`
       * value. The supported values are 0.25, 0.5, 1, 2, 4, 8, and 16
       *
       * * **value = 0.25** - `MEMORY` = 512, 1024, or 2048
       * * **value = 0.5** - `MEMORY` = 1024, 2048, 3072, or 4096
       * * **value = 1** - `MEMORY` = 2048, 3072, 4096, 5120, 6144, 7168, or 8192
       * * **value = 2** - `MEMORY` = 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288,
       * 13312, 14336, 15360, or 16384
       * * **value = 4** - `MEMORY` = 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, 16384,
       * 17408, 18432, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or
       * 30720
       * * **value = 8** - `MEMORY` = 16384, 20480, 24576, 28672, 32768, 36864, 40960, 45056, 49152,
       * 53248, 57344, or 61440
       * * **value = 16** - `MEMORY` = 32768, 40960, 49152, 57344, 65536, 73728, 81920, 90112,
       * 98304, 106496, 114688, or 122880
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-resourcerequirement.html#cfn-batch-jobdefinition-resourcerequirement-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceRequirementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.ResourceRequirementProperty):
          ResourceRequirementProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResourceRequirementProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceRequirementProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourceRequirementProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourceRequirementProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * Object limits;
   * Object requests;
   * ResourcesProperty resourcesProperty = ResourcesProperty.builder()
   * .limits(limits)
   * .requests(requests)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-resources.html)
   */
  public interface ResourcesProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-resources.html#cfn-batch-jobdefinition-resources-limits)
     */
    public fun limits(): Any? = unwrap(this).getLimits()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-resources.html#cfn-batch-jobdefinition-resources-requests)
     */
    public fun requests(): Any? = unwrap(this).getRequests()

    /**
     * A builder for [ResourcesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param limits the value to be set.
       */
      public fun limits(limits: Any)

      /**
       * @param requests the value to be set.
       */
      public fun requests(requests: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourcesProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourcesProperty.builder()

      /**
       * @param limits the value to be set.
       */
      override fun limits(limits: Any) {
        cdkBuilder.limits(limits)
      }

      /**
       * @param requests the value to be set.
       */
      override fun requests(requests: Any) {
        cdkBuilder.requests(requests)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.ResourcesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.ResourcesProperty,
    ) : CdkObject(cdkObject), ResourcesProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-resources.html#cfn-batch-jobdefinition-resources-limits)
       */
      override fun limits(): Any? = unwrap(this).getLimits()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-resources.html#cfn-batch-jobdefinition-resources-requests)
       */
      override fun requests(): Any? = unwrap(this).getRequests()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.ResourcesProperty):
          ResourcesProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourcesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourcesProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourcesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourcesProperty
    }
  }

  /**
   * The retry strategy that's associated with a job.
   *
   * For more information, see [Automated job
   * retries](https://docs.aws.amazon.com/batch/latest/userguide/job_retries.html) in the *AWS Batch
   * User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * RetryStrategyProperty retryStrategyProperty = RetryStrategyProperty.builder()
   * .attempts(123)
   * .evaluateOnExit(List.of(EvaluateOnExitProperty.builder()
   * .action("action")
   * // the properties below are optional
   * .onExitCode("onExitCode")
   * .onReason("onReason")
   * .onStatusReason("onStatusReason")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html)
   */
  public interface RetryStrategyProperty {
    /**
     * The number of times to move a job to the `RUNNABLE` status.
     *
     * You can specify between 1 and 10 attempts. If the value of `attempts` is greater than one,
     * the job is retried on failure the same number of attempts as the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-attempts)
     */
    public fun attempts(): Number? = unwrap(this).getAttempts()

    /**
     * Array of up to 5 objects that specify the conditions where jobs are retried or failed.
     *
     * If this parameter is specified, then the `attempts` parameter must also be specified. If none
     * of the listed conditions match, then the job is retried.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-evaluateonexit)
     */
    public fun evaluateOnExit(): Any? = unwrap(this).getEvaluateOnExit()

    /**
     * A builder for [RetryStrategyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attempts The number of times to move a job to the `RUNNABLE` status.
       * You can specify between 1 and 10 attempts. If the value of `attempts` is greater than one,
       * the job is retried on failure the same number of attempts as the value.
       */
      public fun attempts(attempts: Number)

      /**
       * @param evaluateOnExit Array of up to 5 objects that specify the conditions where jobs are
       * retried or failed.
       * If this parameter is specified, then the `attempts` parameter must also be specified. If
       * none of the listed conditions match, then the job is retried.
       */
      public fun evaluateOnExit(evaluateOnExit: IResolvable)

      /**
       * @param evaluateOnExit Array of up to 5 objects that specify the conditions where jobs are
       * retried or failed.
       * If this parameter is specified, then the `attempts` parameter must also be specified. If
       * none of the listed conditions match, then the job is retried.
       */
      public fun evaluateOnExit(evaluateOnExit: List<Any>)

      /**
       * @param evaluateOnExit Array of up to 5 objects that specify the conditions where jobs are
       * retried or failed.
       * If this parameter is specified, then the `attempts` parameter must also be specified. If
       * none of the listed conditions match, then the job is retried.
       */
      public fun evaluateOnExit(vararg evaluateOnExit: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty.builder()

      /**
       * @param attempts The number of times to move a job to the `RUNNABLE` status.
       * You can specify between 1 and 10 attempts. If the value of `attempts` is greater than one,
       * the job is retried on failure the same number of attempts as the value.
       */
      override fun attempts(attempts: Number) {
        cdkBuilder.attempts(attempts)
      }

      /**
       * @param evaluateOnExit Array of up to 5 objects that specify the conditions where jobs are
       * retried or failed.
       * If this parameter is specified, then the `attempts` parameter must also be specified. If
       * none of the listed conditions match, then the job is retried.
       */
      override fun evaluateOnExit(evaluateOnExit: IResolvable) {
        cdkBuilder.evaluateOnExit(evaluateOnExit.let(IResolvable::unwrap))
      }

      /**
       * @param evaluateOnExit Array of up to 5 objects that specify the conditions where jobs are
       * retried or failed.
       * If this parameter is specified, then the `attempts` parameter must also be specified. If
       * none of the listed conditions match, then the job is retried.
       */
      override fun evaluateOnExit(evaluateOnExit: List<Any>) {
        cdkBuilder.evaluateOnExit(evaluateOnExit)
      }

      /**
       * @param evaluateOnExit Array of up to 5 objects that specify the conditions where jobs are
       * retried or failed.
       * If this parameter is specified, then the `attempts` parameter must also be specified. If
       * none of the listed conditions match, then the job is retried.
       */
      override fun evaluateOnExit(vararg evaluateOnExit: Any): Unit =
          evaluateOnExit(evaluateOnExit.toList())

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty,
    ) : CdkObject(cdkObject), RetryStrategyProperty {
      /**
       * The number of times to move a job to the `RUNNABLE` status.
       *
       * You can specify between 1 and 10 attempts. If the value of `attempts` is greater than one,
       * the job is retried on failure the same number of attempts as the value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-attempts)
       */
      override fun attempts(): Number? = unwrap(this).getAttempts()

      /**
       * Array of up to 5 objects that specify the conditions where jobs are retried or failed.
       *
       * If this parameter is specified, then the `attempts` parameter must also be specified. If
       * none of the listed conditions match, then the job is retried.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-evaluateonexit)
       */
      override fun evaluateOnExit(): Any? = unwrap(this).getEvaluateOnExit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetryStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty):
          RetryStrategyProperty = CdkObjectWrappers.wrap(cdkObject) as? RetryStrategyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetryStrategyProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty
    }
  }

  /**
   * An object that represents the compute environment architecture for AWS Batch jobs on Fargate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * RuntimePlatformProperty runtimePlatformProperty = RuntimePlatformProperty.builder()
   * .cpuArchitecture("cpuArchitecture")
   * .operatingSystemFamily("operatingSystemFamily")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-runtimeplatform.html)
   */
  public interface RuntimePlatformProperty {
    /**
     * The vCPU architecture. The default value is `X86_64` . Valid values are `X86_64` and `ARM64`
     * .
     *
     *
     * This parameter must be set to `X86_64` for Windows containers. &gt; Fargate Spot is not
     * supported for `ARM64` and Windows-based containers on Fargate. A job queue will be blocked if a
     * Fargate `ARM64` or Windows job is submitted to a job queue with only Fargate Spot compute
     * environments. However, you can attach both `FARGATE` and `FARGATE_SPOT` compute environments to
     * the same job queue.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-runtimeplatform.html#cfn-batch-jobdefinition-runtimeplatform-cpuarchitecture)
     */
    public fun cpuArchitecture(): String? = unwrap(this).getCpuArchitecture()

    /**
     * The operating system for the compute environment.
     *
     * Valid values are: `LINUX` (default), `WINDOWS_SERVER_2019_CORE` , `WINDOWS_SERVER_2019_FULL`
     * , `WINDOWS_SERVER_2022_CORE` , and `WINDOWS_SERVER_2022_FULL` .
     *
     *
     * The following parameters can’t be set for Windows containers: `linuxParameters` ,
     * `privileged` , `user` , `ulimits` , `readonlyRootFilesystem` , and `efsVolumeConfiguration` .
     * &gt; The AWS Batch Scheduler checks the compute environments that are attached to the job queue
     * before registering a task definition with Fargate. In this scenario, the job queue is where the
     * job is submitted. If the job requires a Windows container and the first compute environment is
     * `LINUX` , the compute environment is skipped and the next compute environment is checked until a
     * Windows-based compute environment is found. &gt; Fargate Spot is not supported for `ARM64` and
     * Windows-based containers on Fargate. A job queue will be blocked if a Fargate `ARM64` or Windows
     * job is submitted to a job queue with only Fargate Spot compute environments. However, you can
     * attach both `FARGATE` and `FARGATE_SPOT` compute environments to the same job queue.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-runtimeplatform.html#cfn-batch-jobdefinition-runtimeplatform-operatingsystemfamily)
     */
    public fun operatingSystemFamily(): String? = unwrap(this).getOperatingSystemFamily()

    /**
     * A builder for [RuntimePlatformProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cpuArchitecture The vCPU architecture. The default value is `X86_64` . Valid values
       * are `X86_64` and `ARM64` .
       *
       * This parameter must be set to `X86_64` for Windows containers. &gt; Fargate Spot is not
       * supported for `ARM64` and Windows-based containers on Fargate. A job queue will be blocked if
       * a Fargate `ARM64` or Windows job is submitted to a job queue with only Fargate Spot compute
       * environments. However, you can attach both `FARGATE` and `FARGATE_SPOT` compute environments
       * to the same job queue.
       */
      public fun cpuArchitecture(cpuArchitecture: String)

      /**
       * @param operatingSystemFamily The operating system for the compute environment.
       * Valid values are: `LINUX` (default), `WINDOWS_SERVER_2019_CORE` ,
       * `WINDOWS_SERVER_2019_FULL` , `WINDOWS_SERVER_2022_CORE` , and `WINDOWS_SERVER_2022_FULL` .
       *
       *
       * The following parameters can’t be set for Windows containers: `linuxParameters` ,
       * `privileged` , `user` , `ulimits` , `readonlyRootFilesystem` , and `efsVolumeConfiguration` .
       * &gt; The AWS Batch Scheduler checks the compute environments that are attached to the job
       * queue before registering a task definition with Fargate. In this scenario, the job queue is
       * where the job is submitted. If the job requires a Windows container and the first compute
       * environment is `LINUX` , the compute environment is skipped and the next compute environment
       * is checked until a Windows-based compute environment is found. &gt; Fargate Spot is not
       * supported for `ARM64` and Windows-based containers on Fargate. A job queue will be blocked if
       * a Fargate `ARM64` or Windows job is submitted to a job queue with only Fargate Spot compute
       * environments. However, you can attach both `FARGATE` and `FARGATE_SPOT` compute environments
       * to the same job queue.
       */
      public fun operatingSystemFamily(operatingSystemFamily: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.RuntimePlatformProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.RuntimePlatformProperty.builder()

      /**
       * @param cpuArchitecture The vCPU architecture. The default value is `X86_64` . Valid values
       * are `X86_64` and `ARM64` .
       *
       * This parameter must be set to `X86_64` for Windows containers. &gt; Fargate Spot is not
       * supported for `ARM64` and Windows-based containers on Fargate. A job queue will be blocked if
       * a Fargate `ARM64` or Windows job is submitted to a job queue with only Fargate Spot compute
       * environments. However, you can attach both `FARGATE` and `FARGATE_SPOT` compute environments
       * to the same job queue.
       */
      override fun cpuArchitecture(cpuArchitecture: String) {
        cdkBuilder.cpuArchitecture(cpuArchitecture)
      }

      /**
       * @param operatingSystemFamily The operating system for the compute environment.
       * Valid values are: `LINUX` (default), `WINDOWS_SERVER_2019_CORE` ,
       * `WINDOWS_SERVER_2019_FULL` , `WINDOWS_SERVER_2022_CORE` , and `WINDOWS_SERVER_2022_FULL` .
       *
       *
       * The following parameters can’t be set for Windows containers: `linuxParameters` ,
       * `privileged` , `user` , `ulimits` , `readonlyRootFilesystem` , and `efsVolumeConfiguration` .
       * &gt; The AWS Batch Scheduler checks the compute environments that are attached to the job
       * queue before registering a task definition with Fargate. In this scenario, the job queue is
       * where the job is submitted. If the job requires a Windows container and the first compute
       * environment is `LINUX` , the compute environment is skipped and the next compute environment
       * is checked until a Windows-based compute environment is found. &gt; Fargate Spot is not
       * supported for `ARM64` and Windows-based containers on Fargate. A job queue will be blocked if
       * a Fargate `ARM64` or Windows job is submitted to a job queue with only Fargate Spot compute
       * environments. However, you can attach both `FARGATE` and `FARGATE_SPOT` compute environments
       * to the same job queue.
       */
      override fun operatingSystemFamily(operatingSystemFamily: String) {
        cdkBuilder.operatingSystemFamily(operatingSystemFamily)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.RuntimePlatformProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.RuntimePlatformProperty,
    ) : CdkObject(cdkObject), RuntimePlatformProperty {
      /**
       * The vCPU architecture. The default value is `X86_64` . Valid values are `X86_64` and
       * `ARM64` .
       *
       *
       * This parameter must be set to `X86_64` for Windows containers. &gt; Fargate Spot is not
       * supported for `ARM64` and Windows-based containers on Fargate. A job queue will be blocked if
       * a Fargate `ARM64` or Windows job is submitted to a job queue with only Fargate Spot compute
       * environments. However, you can attach both `FARGATE` and `FARGATE_SPOT` compute environments
       * to the same job queue.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-runtimeplatform.html#cfn-batch-jobdefinition-runtimeplatform-cpuarchitecture)
       */
      override fun cpuArchitecture(): String? = unwrap(this).getCpuArchitecture()

      /**
       * The operating system for the compute environment.
       *
       * Valid values are: `LINUX` (default), `WINDOWS_SERVER_2019_CORE` ,
       * `WINDOWS_SERVER_2019_FULL` , `WINDOWS_SERVER_2022_CORE` , and `WINDOWS_SERVER_2022_FULL` .
       *
       *
       * The following parameters can’t be set for Windows containers: `linuxParameters` ,
       * `privileged` , `user` , `ulimits` , `readonlyRootFilesystem` , and `efsVolumeConfiguration` .
       * &gt; The AWS Batch Scheduler checks the compute environments that are attached to the job
       * queue before registering a task definition with Fargate. In this scenario, the job queue is
       * where the job is submitted. If the job requires a Windows container and the first compute
       * environment is `LINUX` , the compute environment is skipped and the next compute environment
       * is checked until a Windows-based compute environment is found. &gt; Fargate Spot is not
       * supported for `ARM64` and Windows-based containers on Fargate. A job queue will be blocked if
       * a Fargate `ARM64` or Windows job is submitted to a job queue with only Fargate Spot compute
       * environments. However, you can attach both `FARGATE` and `FARGATE_SPOT` compute environments
       * to the same job queue.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-runtimeplatform.html#cfn-batch-jobdefinition-runtimeplatform-operatingsystemfamily)
       */
      override fun operatingSystemFamily(): String? = unwrap(this).getOperatingSystemFamily()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuntimePlatformProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.RuntimePlatformProperty):
          RuntimePlatformProperty = CdkObjectWrappers.wrap(cdkObject) as? RuntimePlatformProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuntimePlatformProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.RuntimePlatformProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.RuntimePlatformProperty
    }
  }

  /**
   * An object that represents the secret to expose to your container.
   *
   * Secrets can be exposed to a container in the following ways:
   *
   * * To inject sensitive data into your containers as environment variables, use the `secrets`
   * container definition parameter.
   * * To reference sensitive information in the log configuration of a container, use the
   * `secretOptions` container definition parameter.
   *
   * For more information, see [Specifying sensitive
   * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in the
   * *AWS Batch User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * SecretProperty secretProperty = SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-secret.html)
   */
  public interface SecretProperty {
    /**
     * The name of the secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-secret.html#cfn-batch-jobdefinition-secret-name)
     */
    public fun name(): String

    /**
     * The secret to expose to the container.
     *
     * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
     * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
     *
     *
     * If the AWS Systems Manager Parameter Store parameter exists in the same Region as the job
     * you're launching, then you can use either the full Amazon Resource Name (ARN) or name of the
     * parameter. If the parameter exists in a different Region, then the full ARN must be specified.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-secret.html#cfn-batch-jobdefinition-secret-valuefrom)
     */
    public fun valueFrom(): String

    /**
     * A builder for [SecretProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the secret. 
       */
      public fun name(name: String)

      /**
       * @param valueFrom The secret to expose to the container. 
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * If the AWS Systems Manager Parameter Store parameter exists in the same Region as the job
       * you're launching, then you can use either the full Amazon Resource Name (ARN) or name of the
       * parameter. If the parameter exists in a different Region, then the full ARN must be specified.
       */
      public fun valueFrom(valueFrom: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty.builder()

      /**
       * @param name The name of the secret. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param valueFrom The secret to expose to the container. 
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * If the AWS Systems Manager Parameter Store parameter exists in the same Region as the job
       * you're launching, then you can use either the full Amazon Resource Name (ARN) or name of the
       * parameter. If the parameter exists in a different Region, then the full ARN must be specified.
       */
      override fun valueFrom(valueFrom: String) {
        cdkBuilder.valueFrom(valueFrom)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty,
    ) : CdkObject(cdkObject), SecretProperty {
      /**
       * The name of the secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-secret.html#cfn-batch-jobdefinition-secret-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The secret to expose to the container.
       *
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * If the AWS Systems Manager Parameter Store parameter exists in the same Region as the job
       * you're launching, then you can use either the full Amazon Resource Name (ARN) or name of the
       * parameter. If the parameter exists in a different Region, then the full ARN must be specified.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-secret.html#cfn-batch-jobdefinition-secret-valuefrom)
       */
      override fun valueFrom(): String = unwrap(this).getValueFrom()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SecretProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty):
          SecretProperty = CdkObjectWrappers.wrap(cdkObject) as? SecretProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * SecurityContextProperty securityContextProperty = SecurityContextProperty.builder()
   * .privileged(false)
   * .readOnlyRootFilesystem(false)
   * .runAsGroup(123)
   * .runAsNonRoot(false)
   * .runAsUser(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-securitycontext.html)
   */
  public interface SecurityContextProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-securitycontext.html#cfn-batch-jobdefinition-securitycontext-privileged)
     */
    public fun privileged(): Any? = unwrap(this).getPrivileged()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-securitycontext.html#cfn-batch-jobdefinition-securitycontext-readonlyrootfilesystem)
     */
    public fun readOnlyRootFilesystem(): Any? = unwrap(this).getReadOnlyRootFilesystem()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-securitycontext.html#cfn-batch-jobdefinition-securitycontext-runasgroup)
     */
    public fun runAsGroup(): Number? = unwrap(this).getRunAsGroup()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-securitycontext.html#cfn-batch-jobdefinition-securitycontext-runasnonroot)
     */
    public fun runAsNonRoot(): Any? = unwrap(this).getRunAsNonRoot()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-securitycontext.html#cfn-batch-jobdefinition-securitycontext-runasuser)
     */
    public fun runAsUser(): Number? = unwrap(this).getRunAsUser()

    /**
     * A builder for [SecurityContextProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param privileged the value to be set.
       */
      public fun privileged(privileged: Boolean)

      /**
       * @param privileged the value to be set.
       */
      public fun privileged(privileged: IResolvable)

      /**
       * @param readOnlyRootFilesystem the value to be set.
       */
      public fun readOnlyRootFilesystem(readOnlyRootFilesystem: Boolean)

      /**
       * @param readOnlyRootFilesystem the value to be set.
       */
      public fun readOnlyRootFilesystem(readOnlyRootFilesystem: IResolvable)

      /**
       * @param runAsGroup the value to be set.
       */
      public fun runAsGroup(runAsGroup: Number)

      /**
       * @param runAsNonRoot the value to be set.
       */
      public fun runAsNonRoot(runAsNonRoot: Boolean)

      /**
       * @param runAsNonRoot the value to be set.
       */
      public fun runAsNonRoot(runAsNonRoot: IResolvable)

      /**
       * @param runAsUser the value to be set.
       */
      public fun runAsUser(runAsUser: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecurityContextProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecurityContextProperty.builder()

      /**
       * @param privileged the value to be set.
       */
      override fun privileged(privileged: Boolean) {
        cdkBuilder.privileged(privileged)
      }

      /**
       * @param privileged the value to be set.
       */
      override fun privileged(privileged: IResolvable) {
        cdkBuilder.privileged(privileged.let(IResolvable::unwrap))
      }

      /**
       * @param readOnlyRootFilesystem the value to be set.
       */
      override fun readOnlyRootFilesystem(readOnlyRootFilesystem: Boolean) {
        cdkBuilder.readOnlyRootFilesystem(readOnlyRootFilesystem)
      }

      /**
       * @param readOnlyRootFilesystem the value to be set.
       */
      override fun readOnlyRootFilesystem(readOnlyRootFilesystem: IResolvable) {
        cdkBuilder.readOnlyRootFilesystem(readOnlyRootFilesystem.let(IResolvable::unwrap))
      }

      /**
       * @param runAsGroup the value to be set.
       */
      override fun runAsGroup(runAsGroup: Number) {
        cdkBuilder.runAsGroup(runAsGroup)
      }

      /**
       * @param runAsNonRoot the value to be set.
       */
      override fun runAsNonRoot(runAsNonRoot: Boolean) {
        cdkBuilder.runAsNonRoot(runAsNonRoot)
      }

      /**
       * @param runAsNonRoot the value to be set.
       */
      override fun runAsNonRoot(runAsNonRoot: IResolvable) {
        cdkBuilder.runAsNonRoot(runAsNonRoot.let(IResolvable::unwrap))
      }

      /**
       * @param runAsUser the value to be set.
       */
      override fun runAsUser(runAsUser: Number) {
        cdkBuilder.runAsUser(runAsUser)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecurityContextProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.SecurityContextProperty,
    ) : CdkObject(cdkObject), SecurityContextProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-securitycontext.html#cfn-batch-jobdefinition-securitycontext-privileged)
       */
      override fun privileged(): Any? = unwrap(this).getPrivileged()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-securitycontext.html#cfn-batch-jobdefinition-securitycontext-readonlyrootfilesystem)
       */
      override fun readOnlyRootFilesystem(): Any? = unwrap(this).getReadOnlyRootFilesystem()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-securitycontext.html#cfn-batch-jobdefinition-securitycontext-runasgroup)
       */
      override fun runAsGroup(): Number? = unwrap(this).getRunAsGroup()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-securitycontext.html#cfn-batch-jobdefinition-securitycontext-runasnonroot)
       */
      override fun runAsNonRoot(): Any? = unwrap(this).getRunAsNonRoot()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-securitycontext.html#cfn-batch-jobdefinition-securitycontext-runasuser)
       */
      override fun runAsUser(): Number? = unwrap(this).getRunAsUser()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SecurityContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.SecurityContextProperty):
          SecurityContextProperty = CdkObjectWrappers.wrap(cdkObject) as? SecurityContextProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecurityContextProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecurityContextProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecurityContextProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * TaskContainerDependencyProperty taskContainerDependencyProperty =
   * TaskContainerDependencyProperty.builder()
   * .condition("condition")
   * .containerName("containerName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerdependency.html)
   */
  public interface TaskContainerDependencyProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerdependency.html#cfn-batch-jobdefinition-taskcontainerdependency-condition)
     */
    public fun condition(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerdependency.html#cfn-batch-jobdefinition-taskcontainerdependency-containername)
     */
    public fun containerName(): String

    /**
     * A builder for [TaskContainerDependencyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param condition the value to be set. 
       */
      public fun condition(condition: String)

      /**
       * @param containerName the value to be set. 
       */
      public fun containerName(containerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.TaskContainerDependencyProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.TaskContainerDependencyProperty.builder()

      /**
       * @param condition the value to be set. 
       */
      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      /**
       * @param containerName the value to be set. 
       */
      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.TaskContainerDependencyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.TaskContainerDependencyProperty,
    ) : CdkObject(cdkObject), TaskContainerDependencyProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerdependency.html#cfn-batch-jobdefinition-taskcontainerdependency-condition)
       */
      override fun condition(): String = unwrap(this).getCondition()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerdependency.html#cfn-batch-jobdefinition-taskcontainerdependency-containername)
       */
      override fun containerName(): String = unwrap(this).getContainerName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TaskContainerDependencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.TaskContainerDependencyProperty):
          TaskContainerDependencyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TaskContainerDependencyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskContainerDependencyProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.TaskContainerDependencyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.TaskContainerDependencyProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * Object options;
   * TaskContainerPropertiesProperty taskContainerPropertiesProperty =
   * TaskContainerPropertiesProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .command(List.of("command"))
   * .dependsOn(List.of(TaskContainerDependencyProperty.builder()
   * .condition("condition")
   * .containerName("containerName")
   * .build()))
   * .environment(List.of(EnvironmentProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .essential(false)
   * .linuxParameters(LinuxParametersProperty.builder()
   * .devices(List.of(DeviceProperty.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * .permissions(List.of("permissions"))
   * .build()))
   * .initProcessEnabled(false)
   * .maxSwap(123)
   * .sharedMemorySize(123)
   * .swappiness(123)
   * .tmpfs(List.of(TmpfsProperty.builder()
   * .containerPath("containerPath")
   * .size(123)
   * // the properties below are optional
   * .mountOptions(List.of("mountOptions"))
   * .build()))
   * .build())
   * .logConfiguration(LogConfigurationProperty.builder()
   * .logDriver("logDriver")
   * // the properties below are optional
   * .options(options)
   * .secretOptions(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .build())
   * .mountPoints(List.of(MountPointsProperty.builder()
   * .containerPath("containerPath")
   * .readOnly(false)
   * .sourceVolume("sourceVolume")
   * .build()))
   * .name("name")
   * .privileged(false)
   * .readonlyRootFilesystem(false)
   * .repositoryCredentials(RepositoryCredentialsProperty.builder()
   * .credentialsParameter("credentialsParameter")
   * .build())
   * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
   * .type("type")
   * .value("value")
   * .build()))
   * .secrets(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .ulimits(List.of(UlimitProperty.builder()
   * .hardLimit(123)
   * .name("name")
   * .softLimit(123)
   * .build()))
   * .user("user")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html)
   */
  public interface TaskContainerPropertiesProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-command)
     */
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-dependson)
     */
    public fun dependsOn(): Any? = unwrap(this).getDependsOn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-essential)
     */
    public fun essential(): Any? = unwrap(this).getEssential()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-image)
     */
    public fun image(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-linuxparameters)
     */
    public fun linuxParameters(): Any? = unwrap(this).getLinuxParameters()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-logconfiguration)
     */
    public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-mountpoints)
     */
    public fun mountPoints(): Any? = unwrap(this).getMountPoints()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-privileged)
     */
    public fun privileged(): Any? = unwrap(this).getPrivileged()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-readonlyrootfilesystem)
     */
    public fun readonlyRootFilesystem(): Any? = unwrap(this).getReadonlyRootFilesystem()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-repositorycredentials)
     */
    public fun repositoryCredentials(): Any? = unwrap(this).getRepositoryCredentials()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-resourcerequirements)
     */
    public fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-secrets)
     */
    public fun secrets(): Any? = unwrap(this).getSecrets()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-ulimits)
     */
    public fun ulimits(): Any? = unwrap(this).getUlimits()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-user)
     */
    public fun user(): String? = unwrap(this).getUser()

    /**
     * A builder for [TaskContainerPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param command the value to be set.
       */
      public fun command(command: List<String>)

      /**
       * @param command the value to be set.
       */
      public fun command(vararg command: String)

      /**
       * @param dependsOn the value to be set.
       */
      public fun dependsOn(dependsOn: IResolvable)

      /**
       * @param dependsOn the value to be set.
       */
      public fun dependsOn(dependsOn: List<Any>)

      /**
       * @param dependsOn the value to be set.
       */
      public fun dependsOn(vararg dependsOn: Any)

      /**
       * @param environment the value to be set.
       */
      public fun environment(environment: IResolvable)

      /**
       * @param environment the value to be set.
       */
      public fun environment(environment: List<Any>)

      /**
       * @param environment the value to be set.
       */
      public fun environment(vararg environment: Any)

      /**
       * @param essential the value to be set.
       */
      public fun essential(essential: Boolean)

      /**
       * @param essential the value to be set.
       */
      public fun essential(essential: IResolvable)

      /**
       * @param image the value to be set. 
       */
      public fun image(image: String)

      /**
       * @param linuxParameters the value to be set.
       */
      public fun linuxParameters(linuxParameters: IResolvable)

      /**
       * @param linuxParameters the value to be set.
       */
      public fun linuxParameters(linuxParameters: LinuxParametersProperty)

      /**
       * @param linuxParameters the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19170a13fe587140f52b0d1dca6ae814149b4c2f39891024990e70a036011ce6")
      public fun linuxParameters(linuxParameters: LinuxParametersProperty.Builder.() -> Unit)

      /**
       * @param logConfiguration the value to be set.
       */
      public fun logConfiguration(logConfiguration: IResolvable)

      /**
       * @param logConfiguration the value to be set.
       */
      public fun logConfiguration(logConfiguration: LogConfigurationProperty)

      /**
       * @param logConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f07cb87f43f4bebadd01f6ebb5f9bd7dc010b0b3927192f24ce10039e10545ee")
      public fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit)

      /**
       * @param mountPoints the value to be set.
       */
      public fun mountPoints(mountPoints: IResolvable)

      /**
       * @param mountPoints the value to be set.
       */
      public fun mountPoints(mountPoints: List<Any>)

      /**
       * @param mountPoints the value to be set.
       */
      public fun mountPoints(vararg mountPoints: Any)

      /**
       * @param name the value to be set.
       */
      public fun name(name: String)

      /**
       * @param privileged the value to be set.
       */
      public fun privileged(privileged: Boolean)

      /**
       * @param privileged the value to be set.
       */
      public fun privileged(privileged: IResolvable)

      /**
       * @param readonlyRootFilesystem the value to be set.
       */
      public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

      /**
       * @param readonlyRootFilesystem the value to be set.
       */
      public fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable)

      /**
       * @param repositoryCredentials the value to be set.
       */
      public fun repositoryCredentials(repositoryCredentials: IResolvable)

      /**
       * @param repositoryCredentials the value to be set.
       */
      public fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty)

      /**
       * @param repositoryCredentials the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d9376f019bdc67670dd0f6b52daadd3aecc1e9d8846fddac7c2fe9d0ce3420e")
      public
          fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty.Builder.() -> Unit)

      /**
       * @param resourceRequirements the value to be set.
       */
      public fun resourceRequirements(resourceRequirements: IResolvable)

      /**
       * @param resourceRequirements the value to be set.
       */
      public fun resourceRequirements(resourceRequirements: List<Any>)

      /**
       * @param resourceRequirements the value to be set.
       */
      public fun resourceRequirements(vararg resourceRequirements: Any)

      /**
       * @param secrets the value to be set.
       */
      public fun secrets(secrets: IResolvable)

      /**
       * @param secrets the value to be set.
       */
      public fun secrets(secrets: List<Any>)

      /**
       * @param secrets the value to be set.
       */
      public fun secrets(vararg secrets: Any)

      /**
       * @param ulimits the value to be set.
       */
      public fun ulimits(ulimits: IResolvable)

      /**
       * @param ulimits the value to be set.
       */
      public fun ulimits(ulimits: List<Any>)

      /**
       * @param ulimits the value to be set.
       */
      public fun ulimits(vararg ulimits: Any)

      /**
       * @param user the value to be set.
       */
      public fun user(user: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.TaskContainerPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.TaskContainerPropertiesProperty.builder()

      /**
       * @param command the value to be set.
       */
      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      /**
       * @param command the value to be set.
       */
      override fun command(vararg command: String): Unit = command(command.toList())

      /**
       * @param dependsOn the value to be set.
       */
      override fun dependsOn(dependsOn: IResolvable) {
        cdkBuilder.dependsOn(dependsOn.let(IResolvable::unwrap))
      }

      /**
       * @param dependsOn the value to be set.
       */
      override fun dependsOn(dependsOn: List<Any>) {
        cdkBuilder.dependsOn(dependsOn)
      }

      /**
       * @param dependsOn the value to be set.
       */
      override fun dependsOn(vararg dependsOn: Any): Unit = dependsOn(dependsOn.toList())

      /**
       * @param environment the value to be set.
       */
      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      /**
       * @param environment the value to be set.
       */
      override fun environment(environment: List<Any>) {
        cdkBuilder.environment(environment)
      }

      /**
       * @param environment the value to be set.
       */
      override fun environment(vararg environment: Any): Unit = environment(environment.toList())

      /**
       * @param essential the value to be set.
       */
      override fun essential(essential: Boolean) {
        cdkBuilder.essential(essential)
      }

      /**
       * @param essential the value to be set.
       */
      override fun essential(essential: IResolvable) {
        cdkBuilder.essential(essential.let(IResolvable::unwrap))
      }

      /**
       * @param image the value to be set. 
       */
      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      /**
       * @param linuxParameters the value to be set.
       */
      override fun linuxParameters(linuxParameters: IResolvable) {
        cdkBuilder.linuxParameters(linuxParameters.let(IResolvable::unwrap))
      }

      /**
       * @param linuxParameters the value to be set.
       */
      override fun linuxParameters(linuxParameters: LinuxParametersProperty) {
        cdkBuilder.linuxParameters(linuxParameters.let(LinuxParametersProperty::unwrap))
      }

      /**
       * @param linuxParameters the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19170a13fe587140f52b0d1dca6ae814149b4c2f39891024990e70a036011ce6")
      override fun linuxParameters(linuxParameters: LinuxParametersProperty.Builder.() -> Unit):
          Unit = linuxParameters(LinuxParametersProperty(linuxParameters))

      /**
       * @param logConfiguration the value to be set.
       */
      override fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param logConfiguration the value to be set.
       */
      override fun logConfiguration(logConfiguration: LogConfigurationProperty) {
        cdkBuilder.logConfiguration(logConfiguration.let(LogConfigurationProperty::unwrap))
      }

      /**
       * @param logConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f07cb87f43f4bebadd01f6ebb5f9bd7dc010b0b3927192f24ce10039e10545ee")
      override fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit):
          Unit = logConfiguration(LogConfigurationProperty(logConfiguration))

      /**
       * @param mountPoints the value to be set.
       */
      override fun mountPoints(mountPoints: IResolvable) {
        cdkBuilder.mountPoints(mountPoints.let(IResolvable::unwrap))
      }

      /**
       * @param mountPoints the value to be set.
       */
      override fun mountPoints(mountPoints: List<Any>) {
        cdkBuilder.mountPoints(mountPoints)
      }

      /**
       * @param mountPoints the value to be set.
       */
      override fun mountPoints(vararg mountPoints: Any): Unit = mountPoints(mountPoints.toList())

      /**
       * @param name the value to be set.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param privileged the value to be set.
       */
      override fun privileged(privileged: Boolean) {
        cdkBuilder.privileged(privileged)
      }

      /**
       * @param privileged the value to be set.
       */
      override fun privileged(privileged: IResolvable) {
        cdkBuilder.privileged(privileged.let(IResolvable::unwrap))
      }

      /**
       * @param readonlyRootFilesystem the value to be set.
       */
      override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
      }

      /**
       * @param readonlyRootFilesystem the value to be set.
       */
      override fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem.let(IResolvable::unwrap))
      }

      /**
       * @param repositoryCredentials the value to be set.
       */
      override fun repositoryCredentials(repositoryCredentials: IResolvable) {
        cdkBuilder.repositoryCredentials(repositoryCredentials.let(IResolvable::unwrap))
      }

      /**
       * @param repositoryCredentials the value to be set.
       */
      override fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty) {
        cdkBuilder.repositoryCredentials(repositoryCredentials.let(RepositoryCredentialsProperty::unwrap))
      }

      /**
       * @param repositoryCredentials the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d9376f019bdc67670dd0f6b52daadd3aecc1e9d8846fddac7c2fe9d0ce3420e")
      override
          fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty.Builder.() -> Unit):
          Unit = repositoryCredentials(RepositoryCredentialsProperty(repositoryCredentials))

      /**
       * @param resourceRequirements the value to be set.
       */
      override fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements.let(IResolvable::unwrap))
      }

      /**
       * @param resourceRequirements the value to be set.
       */
      override fun resourceRequirements(resourceRequirements: List<Any>) {
        cdkBuilder.resourceRequirements(resourceRequirements)
      }

      /**
       * @param resourceRequirements the value to be set.
       */
      override fun resourceRequirements(vararg resourceRequirements: Any): Unit =
          resourceRequirements(resourceRequirements.toList())

      /**
       * @param secrets the value to be set.
       */
      override fun secrets(secrets: IResolvable) {
        cdkBuilder.secrets(secrets.let(IResolvable::unwrap))
      }

      /**
       * @param secrets the value to be set.
       */
      override fun secrets(secrets: List<Any>) {
        cdkBuilder.secrets(secrets)
      }

      /**
       * @param secrets the value to be set.
       */
      override fun secrets(vararg secrets: Any): Unit = secrets(secrets.toList())

      /**
       * @param ulimits the value to be set.
       */
      override fun ulimits(ulimits: IResolvable) {
        cdkBuilder.ulimits(ulimits.let(IResolvable::unwrap))
      }

      /**
       * @param ulimits the value to be set.
       */
      override fun ulimits(ulimits: List<Any>) {
        cdkBuilder.ulimits(ulimits)
      }

      /**
       * @param ulimits the value to be set.
       */
      override fun ulimits(vararg ulimits: Any): Unit = ulimits(ulimits.toList())

      /**
       * @param user the value to be set.
       */
      override fun user(user: String) {
        cdkBuilder.user(user)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.TaskContainerPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.TaskContainerPropertiesProperty,
    ) : CdkObject(cdkObject), TaskContainerPropertiesProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-command)
       */
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-dependson)
       */
      override fun dependsOn(): Any? = unwrap(this).getDependsOn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-essential)
       */
      override fun essential(): Any? = unwrap(this).getEssential()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-image)
       */
      override fun image(): String = unwrap(this).getImage()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-linuxparameters)
       */
      override fun linuxParameters(): Any? = unwrap(this).getLinuxParameters()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-logconfiguration)
       */
      override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-mountpoints)
       */
      override fun mountPoints(): Any? = unwrap(this).getMountPoints()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-privileged)
       */
      override fun privileged(): Any? = unwrap(this).getPrivileged()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-readonlyrootfilesystem)
       */
      override fun readonlyRootFilesystem(): Any? = unwrap(this).getReadonlyRootFilesystem()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-repositorycredentials)
       */
      override fun repositoryCredentials(): Any? = unwrap(this).getRepositoryCredentials()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-resourcerequirements)
       */
      override fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-secrets)
       */
      override fun secrets(): Any? = unwrap(this).getSecrets()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-ulimits)
       */
      override fun ulimits(): Any? = unwrap(this).getUlimits()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-taskcontainerproperties.html#cfn-batch-jobdefinition-taskcontainerproperties-user)
       */
      override fun user(): String? = unwrap(this).getUser()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TaskContainerPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.TaskContainerPropertiesProperty):
          TaskContainerPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TaskContainerPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskContainerPropertiesProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.TaskContainerPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.TaskContainerPropertiesProperty
    }
  }

  /**
   * An object that represents a job timeout configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * TimeoutProperty timeoutProperty = TimeoutProperty.builder()
   * .attemptDurationSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html)
   */
  public interface TimeoutProperty {
    /**
     * The job timeout time (in seconds) that's measured from the job attempt's `startedAt`
     * timestamp.
     *
     * After this time passes, AWS Batch terminates your jobs if they aren't finished. The minimum
     * value for the timeout is 60 seconds.
     *
     * For array jobs, the timeout applies to the child jobs, not to the parent array job.
     *
     * For multi-node parallel (MNP) jobs, the timeout applies to the whole job, not to the
     * individual nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html#cfn-batch-jobdefinition-timeout-attemptdurationseconds)
     */
    public fun attemptDurationSeconds(): Number? = unwrap(this).getAttemptDurationSeconds()

    /**
     * A builder for [TimeoutProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attemptDurationSeconds The job timeout time (in seconds) that's measured from the
       * job attempt's `startedAt` timestamp.
       * After this time passes, AWS Batch terminates your jobs if they aren't finished. The minimum
       * value for the timeout is 60 seconds.
       *
       * For array jobs, the timeout applies to the child jobs, not to the parent array job.
       *
       * For multi-node parallel (MNP) jobs, the timeout applies to the whole job, not to the
       * individual nodes.
       */
      public fun attemptDurationSeconds(attemptDurationSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty.builder()

      /**
       * @param attemptDurationSeconds The job timeout time (in seconds) that's measured from the
       * job attempt's `startedAt` timestamp.
       * After this time passes, AWS Batch terminates your jobs if they aren't finished. The minimum
       * value for the timeout is 60 seconds.
       *
       * For array jobs, the timeout applies to the child jobs, not to the parent array job.
       *
       * For multi-node parallel (MNP) jobs, the timeout applies to the whole job, not to the
       * individual nodes.
       */
      override fun attemptDurationSeconds(attemptDurationSeconds: Number) {
        cdkBuilder.attemptDurationSeconds(attemptDurationSeconds)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty,
    ) : CdkObject(cdkObject), TimeoutProperty {
      /**
       * The job timeout time (in seconds) that's measured from the job attempt's `startedAt`
       * timestamp.
       *
       * After this time passes, AWS Batch terminates your jobs if they aren't finished. The minimum
       * value for the timeout is 60 seconds.
       *
       * For array jobs, the timeout applies to the child jobs, not to the parent array job.
       *
       * For multi-node parallel (MNP) jobs, the timeout applies to the whole job, not to the
       * individual nodes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html#cfn-batch-jobdefinition-timeout-attemptdurationseconds)
       */
      override fun attemptDurationSeconds(): Number? = unwrap(this).getAttemptDurationSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty):
          TimeoutProperty = CdkObjectWrappers.wrap(cdkObject) as? TimeoutProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeoutProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty
    }
  }

  /**
   * The container path, mount options, and size of the `tmpfs` mount.
   *
   *
   * This object isn't applicable to jobs that are running on Fargate resources.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * TmpfsProperty tmpfsProperty = TmpfsProperty.builder()
   * .containerPath("containerPath")
   * .size(123)
   * // the properties below are optional
   * .mountOptions(List.of("mountOptions"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-tmpfs.html)
   */
  public interface TmpfsProperty {
    /**
     * The absolute file path in the container where the `tmpfs` volume is mounted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-tmpfs.html#cfn-batch-jobdefinition-tmpfs-containerpath)
     */
    public fun containerPath(): String

    /**
     * The list of `tmpfs` volume mount options.
     *
     * Valid values: " `defaults` " | " `ro` " | " `rw` " | " `suid` " | " `nosuid` " | " `dev` " |
     * " `nodev` " | " `exec` " | " `noexec` " | " `sync` " | " `async` " | " `dirsync` " | " `remount`
     * " | " `mand` " | " `nomand` " | " `atime` " | " `noatime` " | " `diratime` " | " `nodiratime` "
     * | " `bind` " | " `rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" |
     * "rshared" | "slave" | "rslave" | "relatime` " | " `norelatime` " | " `strictatime` " | "
     * `nostrictatime` " | " `mode` " | " `uid` " | " `gid` " | " `nr_inodes` " | " `nr_blocks` " | "
     * `mpol` "
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-tmpfs.html#cfn-batch-jobdefinition-tmpfs-mountoptions)
     */
    public fun mountOptions(): List<String> = unwrap(this).getMountOptions() ?: emptyList()

    /**
     * The size (in MiB) of the `tmpfs` volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-tmpfs.html#cfn-batch-jobdefinition-tmpfs-size)
     */
    public fun size(): Number

    /**
     * A builder for [TmpfsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerPath The absolute file path in the container where the `tmpfs` volume is
       * mounted. 
       */
      public fun containerPath(containerPath: String)

      /**
       * @param mountOptions The list of `tmpfs` volume mount options.
       * Valid values: " `defaults` " | " `ro` " | " `rw` " | " `suid` " | " `nosuid` " | " `dev` "
       * | " `nodev` " | " `exec` " | " `noexec` " | " `sync` " | " `async` " | " `dirsync` " | "
       * `remount` " | " `mand` " | " `nomand` " | " `atime` " | " `noatime` " | " `diratime` " | "
       * `nodiratime` " | " `bind` " | " `rbind" | "unbindable" | "runbindable" | "private" |
       * "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime` " | " `norelatime` " | "
       * `strictatime` " | " `nostrictatime` " | " `mode` " | " `uid` " | " `gid` " | " `nr_inodes` " |
       * " `nr_blocks` " | " `mpol` "
       */
      public fun mountOptions(mountOptions: List<String>)

      /**
       * @param mountOptions The list of `tmpfs` volume mount options.
       * Valid values: " `defaults` " | " `ro` " | " `rw` " | " `suid` " | " `nosuid` " | " `dev` "
       * | " `nodev` " | " `exec` " | " `noexec` " | " `sync` " | " `async` " | " `dirsync` " | "
       * `remount` " | " `mand` " | " `nomand` " | " `atime` " | " `noatime` " | " `diratime` " | "
       * `nodiratime` " | " `bind` " | " `rbind" | "unbindable" | "runbindable" | "private" |
       * "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime` " | " `norelatime` " | "
       * `strictatime` " | " `nostrictatime` " | " `mode` " | " `uid` " | " `gid` " | " `nr_inodes` " |
       * " `nr_blocks` " | " `mpol` "
       */
      public fun mountOptions(vararg mountOptions: String)

      /**
       * @param size The size (in MiB) of the `tmpfs` volume. 
       */
      public fun size(size: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty.builder()

      /**
       * @param containerPath The absolute file path in the container where the `tmpfs` volume is
       * mounted. 
       */
      override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      /**
       * @param mountOptions The list of `tmpfs` volume mount options.
       * Valid values: " `defaults` " | " `ro` " | " `rw` " | " `suid` " | " `nosuid` " | " `dev` "
       * | " `nodev` " | " `exec` " | " `noexec` " | " `sync` " | " `async` " | " `dirsync` " | "
       * `remount` " | " `mand` " | " `nomand` " | " `atime` " | " `noatime` " | " `diratime` " | "
       * `nodiratime` " | " `bind` " | " `rbind" | "unbindable" | "runbindable" | "private" |
       * "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime` " | " `norelatime` " | "
       * `strictatime` " | " `nostrictatime` " | " `mode` " | " `uid` " | " `gid` " | " `nr_inodes` " |
       * " `nr_blocks` " | " `mpol` "
       */
      override fun mountOptions(mountOptions: List<String>) {
        cdkBuilder.mountOptions(mountOptions)
      }

      /**
       * @param mountOptions The list of `tmpfs` volume mount options.
       * Valid values: " `defaults` " | " `ro` " | " `rw` " | " `suid` " | " `nosuid` " | " `dev` "
       * | " `nodev` " | " `exec` " | " `noexec` " | " `sync` " | " `async` " | " `dirsync` " | "
       * `remount` " | " `mand` " | " `nomand` " | " `atime` " | " `noatime` " | " `diratime` " | "
       * `nodiratime` " | " `bind` " | " `rbind" | "unbindable" | "runbindable" | "private" |
       * "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime` " | " `norelatime` " | "
       * `strictatime` " | " `nostrictatime` " | " `mode` " | " `uid` " | " `gid` " | " `nr_inodes` " |
       * " `nr_blocks` " | " `mpol` "
       */
      override fun mountOptions(vararg mountOptions: String): Unit =
          mountOptions(mountOptions.toList())

      /**
       * @param size The size (in MiB) of the `tmpfs` volume. 
       */
      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty,
    ) : CdkObject(cdkObject), TmpfsProperty {
      /**
       * The absolute file path in the container where the `tmpfs` volume is mounted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-tmpfs.html#cfn-batch-jobdefinition-tmpfs-containerpath)
       */
      override fun containerPath(): String = unwrap(this).getContainerPath()

      /**
       * The list of `tmpfs` volume mount options.
       *
       * Valid values: " `defaults` " | " `ro` " | " `rw` " | " `suid` " | " `nosuid` " | " `dev` "
       * | " `nodev` " | " `exec` " | " `noexec` " | " `sync` " | " `async` " | " `dirsync` " | "
       * `remount` " | " `mand` " | " `nomand` " | " `atime` " | " `noatime` " | " `diratime` " | "
       * `nodiratime` " | " `bind` " | " `rbind" | "unbindable" | "runbindable" | "private" |
       * "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime` " | " `norelatime` " | "
       * `strictatime` " | " `nostrictatime` " | " `mode` " | " `uid` " | " `gid` " | " `nr_inodes` " |
       * " `nr_blocks` " | " `mpol` "
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-tmpfs.html#cfn-batch-jobdefinition-tmpfs-mountoptions)
       */
      override fun mountOptions(): List<String> = unwrap(this).getMountOptions() ?: emptyList()

      /**
       * The size (in MiB) of the `tmpfs` volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-tmpfs.html#cfn-batch-jobdefinition-tmpfs-size)
       */
      override fun size(): Number = unwrap(this).getSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TmpfsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty):
          TmpfsProperty = CdkObjectWrappers.wrap(cdkObject) as? TmpfsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TmpfsProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty
    }
  }

  /**
   * The `ulimit` settings to pass to the container. For more information, see
   * [Ulimit](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Ulimit.html) .
   *
   *
   * This object isn't applicable to jobs that are running on Fargate resources.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * UlimitProperty ulimitProperty = UlimitProperty.builder()
   * .hardLimit(123)
   * .name("name")
   * .softLimit(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html)
   */
  public interface UlimitProperty {
    /**
     * The hard limit for the `ulimit` type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-hardlimit)
     */
    public fun hardLimit(): Number

    /**
     * The `type` of the `ulimit` .
     *
     * Valid values are: `core` | `cpu` | `data` | `fsize` | `locks` | `memlock` | `msgqueue` |
     * `nice` | `nofile` | `nproc` | `rss` | `rtprio` | `rttime` | `sigpending` | `stack` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-name)
     */
    public fun name(): String

    /**
     * The soft limit for the `ulimit` type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-softlimit)
     */
    public fun softLimit(): Number

    /**
     * A builder for [UlimitProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hardLimit The hard limit for the `ulimit` type. 
       */
      public fun hardLimit(hardLimit: Number)

      /**
       * @param name The `type` of the `ulimit` . 
       * Valid values are: `core` | `cpu` | `data` | `fsize` | `locks` | `memlock` | `msgqueue` |
       * `nice` | `nofile` | `nproc` | `rss` | `rtprio` | `rttime` | `sigpending` | `stack` .
       */
      public fun name(name: String)

      /**
       * @param softLimit The soft limit for the `ulimit` type. 
       */
      public fun softLimit(softLimit: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty.builder()

      /**
       * @param hardLimit The hard limit for the `ulimit` type. 
       */
      override fun hardLimit(hardLimit: Number) {
        cdkBuilder.hardLimit(hardLimit)
      }

      /**
       * @param name The `type` of the `ulimit` . 
       * Valid values are: `core` | `cpu` | `data` | `fsize` | `locks` | `memlock` | `msgqueue` |
       * `nice` | `nofile` | `nproc` | `rss` | `rtprio` | `rttime` | `sigpending` | `stack` .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param softLimit The soft limit for the `ulimit` type. 
       */
      override fun softLimit(softLimit: Number) {
        cdkBuilder.softLimit(softLimit)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty,
    ) : CdkObject(cdkObject), UlimitProperty {
      /**
       * The hard limit for the `ulimit` type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-hardlimit)
       */
      override fun hardLimit(): Number = unwrap(this).getHardLimit()

      /**
       * The `type` of the `ulimit` .
       *
       * Valid values are: `core` | `cpu` | `data` | `fsize` | `locks` | `memlock` | `msgqueue` |
       * `nice` | `nofile` | `nproc` | `rss` | `rtprio` | `rttime` | `sigpending` | `stack` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The soft limit for the `ulimit` type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-softlimit)
       */
      override fun softLimit(): Number = unwrap(this).getSoftLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UlimitProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty):
          UlimitProperty = CdkObjectWrappers.wrap(cdkObject) as? UlimitProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: UlimitProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty
    }
  }

  /**
   * Determine whether your data volume persists on the host container instance and where it's
   * stored.
   *
   * If this parameter is empty, then the Docker daemon assigns a host path for your data volume.
   * However, the data isn't guaranteed to persist after the containers that are associated with it
   * stop running.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * VolumesHostProperty volumesHostProperty = VolumesHostProperty.builder()
   * .sourcePath("sourcePath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html)
   */
  public interface VolumesHostProperty {
    /**
     * The path on the host container instance that's presented to the container.
     *
     * If this parameter is empty, then the Docker daemon has assigned a host path for you. If this
     * parameter contains a file location, then the data volume persists at the specified location on
     * the host container instance until you delete it manually. If the source path location doesn't
     * exist on the host container instance, the Docker daemon creates it. If the location does exist,
     * the contents of the source path folder are exported.
     *
     *
     * This parameter isn't applicable to jobs that run on Fargate resources. Don't provide this for
     * these jobs.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html#cfn-batch-jobdefinition-volumeshost-sourcepath)
     */
    public fun sourcePath(): String? = unwrap(this).getSourcePath()

    /**
     * A builder for [VolumesHostProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourcePath The path on the host container instance that's presented to the
       * container.
       * If this parameter is empty, then the Docker daemon has assigned a host path for you. If
       * this parameter contains a file location, then the data volume persists at the specified
       * location on the host container instance until you delete it manually. If the source path
       * location doesn't exist on the host container instance, the Docker daemon creates it. If the
       * location does exist, the contents of the source path folder are exported.
       *
       *
       * This parameter isn't applicable to jobs that run on Fargate resources. Don't provide this
       * for these jobs.
       */
      public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty.builder()

      /**
       * @param sourcePath The path on the host container instance that's presented to the
       * container.
       * If this parameter is empty, then the Docker daemon has assigned a host path for you. If
       * this parameter contains a file location, then the data volume persists at the specified
       * location on the host container instance until you delete it manually. If the source path
       * location doesn't exist on the host container instance, the Docker daemon creates it. If the
       * location does exist, the contents of the source path folder are exported.
       *
       *
       * This parameter isn't applicable to jobs that run on Fargate resources. Don't provide this
       * for these jobs.
       */
      override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty,
    ) : CdkObject(cdkObject), VolumesHostProperty {
      /**
       * The path on the host container instance that's presented to the container.
       *
       * If this parameter is empty, then the Docker daemon has assigned a host path for you. If
       * this parameter contains a file location, then the data volume persists at the specified
       * location on the host container instance until you delete it manually. If the source path
       * location doesn't exist on the host container instance, the Docker daemon creates it. If the
       * location does exist, the contents of the source path folder are exported.
       *
       *
       * This parameter isn't applicable to jobs that run on Fargate resources. Don't provide this
       * for these jobs.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html#cfn-batch-jobdefinition-volumeshost-sourcepath)
       */
      override fun sourcePath(): String? = unwrap(this).getSourcePath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumesHostProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty):
          VolumesHostProperty = CdkObjectWrappers.wrap(cdkObject) as? VolumesHostProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumesHostProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty
    }
  }

  /**
   * A list of volumes that are associated with the job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * VolumesProperty volumesProperty = VolumesProperty.builder()
   * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
   * .fileSystemId("fileSystemId")
   * // the properties below are optional
   * .authorizationConfig(AuthorizationConfigProperty.builder()
   * .accessPointId("accessPointId")
   * .iam("iam")
   * .build())
   * .rootDirectory("rootDirectory")
   * .transitEncryption("transitEncryption")
   * .transitEncryptionPort(123)
   * .build())
   * .host(VolumesHostProperty.builder()
   * .sourcePath("sourcePath")
   * .build())
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html)
   */
  public interface VolumesProperty {
    /**
     * This is used when you're using an Amazon Elastic File System file system for job storage.
     *
     * For more information, see [Amazon EFS
     * Volumes](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html) in the *AWS Batch
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-efsvolumeconfiguration)
     */
    public fun efsVolumeConfiguration(): Any? = unwrap(this).getEfsVolumeConfiguration()

    /**
     * The contents of the `host` parameter determine whether your data volume persists on the host
     * container instance and where it's stored.
     *
     * If the host parameter is empty, then the Docker daemon assigns a host path for your data
     * volume. However, the data isn't guaranteed to persist after the containers that are associated
     * with it stop running.
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
     * be provided.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-host)
     */
    public fun host(): Any? = unwrap(this).getHost()

    /**
     * The name of the volume.
     *
     * It can be up to 255 characters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_). This name is referenced in the `sourceVolume` parameter of
     * container definition `mountPoints` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [VolumesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param efsVolumeConfiguration This is used when you're using an Amazon Elastic File System
       * file system for job storage.
       * For more information, see [Amazon EFS
       * Volumes](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html) in the *AWS
       * Batch User Guide* .
       */
      public fun efsVolumeConfiguration(efsVolumeConfiguration: IResolvable)

      /**
       * @param efsVolumeConfiguration This is used when you're using an Amazon Elastic File System
       * file system for job storage.
       * For more information, see [Amazon EFS
       * Volumes](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html) in the *AWS
       * Batch User Guide* .
       */
      public fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfigurationProperty)

      /**
       * @param efsVolumeConfiguration This is used when you're using an Amazon Elastic File System
       * file system for job storage.
       * For more information, see [Amazon EFS
       * Volumes](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html) in the *AWS
       * Batch User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39e3c0c777d8054e49cf8a6374ec7913736c25549290310919297432a3e67e03")
      public
          fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param host The contents of the `host` parameter determine whether your data volume
       * persists on the host container instance and where it's stored.
       * If the host parameter is empty, then the Docker daemon assigns a host path for your data
       * volume. However, the data isn't guaranteed to persist after the containers that are associated
       * with it stop running.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided.
       */
      public fun host(host: IResolvable)

      /**
       * @param host The contents of the `host` parameter determine whether your data volume
       * persists on the host container instance and where it's stored.
       * If the host parameter is empty, then the Docker daemon assigns a host path for your data
       * volume. However, the data isn't guaranteed to persist after the containers that are associated
       * with it stop running.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided.
       */
      public fun host(host: VolumesHostProperty)

      /**
       * @param host The contents of the `host` parameter determine whether your data volume
       * persists on the host container instance and where it's stored.
       * If the host parameter is empty, then the Docker daemon assigns a host path for your data
       * volume. However, the data isn't guaranteed to persist after the containers that are associated
       * with it stop running.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9f307de4c2cf22a50de68540c5f0e5ecb133e07393df0da68a313d24480803f")
      public fun host(host: VolumesHostProperty.Builder.() -> Unit)

      /**
       * @param name The name of the volume.
       * It can be up to 255 characters long. It can contain uppercase and lowercase letters,
       * numbers, hyphens (-), and underscores (_). This name is referenced in the `sourceVolume`
       * parameter of container definition `mountPoints` .
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty.builder()

      /**
       * @param efsVolumeConfiguration This is used when you're using an Amazon Elastic File System
       * file system for job storage.
       * For more information, see [Amazon EFS
       * Volumes](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html) in the *AWS
       * Batch User Guide* .
       */
      override fun efsVolumeConfiguration(efsVolumeConfiguration: IResolvable) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param efsVolumeConfiguration This is used when you're using an Amazon Elastic File System
       * file system for job storage.
       * For more information, see [Amazon EFS
       * Volumes](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html) in the *AWS
       * Batch User Guide* .
       */
      override fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfigurationProperty) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration.let(EfsVolumeConfigurationProperty::unwrap))
      }

      /**
       * @param efsVolumeConfiguration This is used when you're using an Amazon Elastic File System
       * file system for job storage.
       * For more information, see [Amazon EFS
       * Volumes](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html) in the *AWS
       * Batch User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39e3c0c777d8054e49cf8a6374ec7913736c25549290310919297432a3e67e03")
      override
          fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfigurationProperty.Builder.() -> Unit):
          Unit = efsVolumeConfiguration(EfsVolumeConfigurationProperty(efsVolumeConfiguration))

      /**
       * @param host The contents of the `host` parameter determine whether your data volume
       * persists on the host container instance and where it's stored.
       * If the host parameter is empty, then the Docker daemon assigns a host path for your data
       * volume. However, the data isn't guaranteed to persist after the containers that are associated
       * with it stop running.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided.
       */
      override fun host(host: IResolvable) {
        cdkBuilder.host(host.let(IResolvable::unwrap))
      }

      /**
       * @param host The contents of the `host` parameter determine whether your data volume
       * persists on the host container instance and where it's stored.
       * If the host parameter is empty, then the Docker daemon assigns a host path for your data
       * volume. However, the data isn't guaranteed to persist after the containers that are associated
       * with it stop running.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided.
       */
      override fun host(host: VolumesHostProperty) {
        cdkBuilder.host(host.let(VolumesHostProperty::unwrap))
      }

      /**
       * @param host The contents of the `host` parameter determine whether your data volume
       * persists on the host container instance and where it's stored.
       * If the host parameter is empty, then the Docker daemon assigns a host path for your data
       * volume. However, the data isn't guaranteed to persist after the containers that are associated
       * with it stop running.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9f307de4c2cf22a50de68540c5f0e5ecb133e07393df0da68a313d24480803f")
      override fun host(host: VolumesHostProperty.Builder.() -> Unit): Unit =
          host(VolumesHostProperty(host))

      /**
       * @param name The name of the volume.
       * It can be up to 255 characters long. It can contain uppercase and lowercase letters,
       * numbers, hyphens (-), and underscores (_). This name is referenced in the `sourceVolume`
       * parameter of container definition `mountPoints` .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty,
    ) : CdkObject(cdkObject), VolumesProperty {
      /**
       * This is used when you're using an Amazon Elastic File System file system for job storage.
       *
       * For more information, see [Amazon EFS
       * Volumes](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html) in the *AWS
       * Batch User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-efsvolumeconfiguration)
       */
      override fun efsVolumeConfiguration(): Any? = unwrap(this).getEfsVolumeConfiguration()

      /**
       * The contents of the `host` parameter determine whether your data volume persists on the
       * host container instance and where it's stored.
       *
       * If the host parameter is empty, then the Docker daemon assigns a host path for your data
       * volume. However, the data isn't guaranteed to persist after the containers that are associated
       * with it stop running.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
       * be provided.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-host)
       */
      override fun host(): Any? = unwrap(this).getHost()

      /**
       * The name of the volume.
       *
       * It can be up to 255 characters long. It can contain uppercase and lowercase letters,
       * numbers, hyphens (-), and underscores (_). This name is referenced in the `sourceVolume`
       * parameter of container definition `mountPoints` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty):
          VolumesProperty = CdkObjectWrappers.wrap(cdkObject) as? VolumesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumesProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty
    }
  }
}
