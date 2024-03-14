package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMonitoringSchedule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The time when the monitoring schedule was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The last time that the monitoring schedule was modified.
   */
  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  /**
   * The Amazon Resource Name (ARN) of the monitoring schedule.
   */
  public open fun attrMonitoringScheduleArn(): String = unwrap(this).getAttrMonitoringScheduleArn()

  /**
   * The name of the endpoint using the monitoring schedule.
   */
  public open fun endpointName(): String? = unwrap(this).getEndpointName()

  /**
   * The name of the endpoint using the monitoring schedule.
   */
  public open fun endpointName(`value`: String) {
    unwrap(this).setEndpointName(`value`)
  }

  /**
   * Contains the reason a monitoring job failed, if it failed.
   */
  public open fun failureReason(): String? = unwrap(this).getFailureReason()

  /**
   * Contains the reason a monitoring job failed, if it failed.
   */
  public open fun failureReason(`value`: String) {
    unwrap(this).setFailureReason(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Describes metadata on the last execution to run, if there was one.
   */
  public open fun lastMonitoringExecutionSummary(): Any? =
      unwrap(this).getLastMonitoringExecutionSummary()

  /**
   * Describes metadata on the last execution to run, if there was one.
   */
  public open fun lastMonitoringExecutionSummary(`value`: IResolvable) {
    unwrap(this).setLastMonitoringExecutionSummary(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes metadata on the last execution to run, if there was one.
   */
  public open fun lastMonitoringExecutionSummary(`value`: MonitoringExecutionSummaryProperty) {
    unwrap(this).setLastMonitoringExecutionSummary(`value`.let(MonitoringExecutionSummaryProperty::unwrap))
  }

  /**
   * Describes metadata on the last execution to run, if there was one.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8f331edee71995e70c48184c99522a8118f0a39125d86992b268d5bf14ea3af5")
  public open
      fun lastMonitoringExecutionSummary(`value`: MonitoringExecutionSummaryProperty.Builder.() -> Unit):
      Unit = lastMonitoringExecutionSummary(MonitoringExecutionSummaryProperty(`value`))

  /**
   * The configuration object that specifies the monitoring schedule and defines the monitoring job.
   */
  public open fun monitoringScheduleConfig(): Any = unwrap(this).getMonitoringScheduleConfig()

  /**
   * The configuration object that specifies the monitoring schedule and defines the monitoring job.
   */
  public open fun monitoringScheduleConfig(`value`: IResolvable) {
    unwrap(this).setMonitoringScheduleConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration object that specifies the monitoring schedule and defines the monitoring job.
   */
  public open fun monitoringScheduleConfig(`value`: MonitoringScheduleConfigProperty) {
    unwrap(this).setMonitoringScheduleConfig(`value`.let(MonitoringScheduleConfigProperty::unwrap))
  }

  /**
   * The configuration object that specifies the monitoring schedule and defines the monitoring job.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec6011c5b8c3b1c446213e74e2dd81419db0edb9721cbeababeacd49b0c50deb")
  public open
      fun monitoringScheduleConfig(`value`: MonitoringScheduleConfigProperty.Builder.() -> Unit):
      Unit = monitoringScheduleConfig(MonitoringScheduleConfigProperty(`value`))

  /**
   * The name of the monitoring schedule.
   */
  public open fun monitoringScheduleName(): String = unwrap(this).getMonitoringScheduleName()

  /**
   * The name of the monitoring schedule.
   */
  public open fun monitoringScheduleName(`value`: String) {
    unwrap(this).setMonitoringScheduleName(`value`)
  }

  /**
   * The status of the monitoring schedule.
   */
  public open fun monitoringScheduleStatus(): String? = unwrap(this).getMonitoringScheduleStatus()

  /**
   * The status of the monitoring schedule.
   */
  public open fun monitoringScheduleStatus(`value`: String) {
    unwrap(this).setMonitoringScheduleStatus(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnMonitoringSchedule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the endpoint using the monitoring schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-endpointname)
     * @param endpointName The name of the endpoint using the monitoring schedule. 
     */
    public fun endpointName(endpointName: String)

    /**
     * Contains the reason a monitoring job failed, if it failed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-failurereason)
     * @param failureReason Contains the reason a monitoring job failed, if it failed. 
     */
    public fun failureReason(failureReason: String)

    /**
     * Describes metadata on the last execution to run, if there was one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-lastmonitoringexecutionsummary)
     * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if
     * there was one. 
     */
    public fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: IResolvable)

    /**
     * Describes metadata on the last execution to run, if there was one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-lastmonitoringexecutionsummary)
     * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if
     * there was one. 
     */
    public
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: MonitoringExecutionSummaryProperty)

    /**
     * Describes metadata on the last execution to run, if there was one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-lastmonitoringexecutionsummary)
     * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if
     * there was one. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf990fcb08c70c985710d65a5930fd050b864215a4d6dc4fc7a97395e34f7cca")
    public
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: MonitoringExecutionSummaryProperty.Builder.() -> Unit)

    /**
     * The configuration object that specifies the monitoring schedule and defines the monitoring
     * job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig)
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring
     * schedule and defines the monitoring job. 
     */
    public fun monitoringScheduleConfig(monitoringScheduleConfig: IResolvable)

    /**
     * The configuration object that specifies the monitoring schedule and defines the monitoring
     * job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig)
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring
     * schedule and defines the monitoring job. 
     */
    public fun monitoringScheduleConfig(monitoringScheduleConfig: MonitoringScheduleConfigProperty)

    /**
     * The configuration object that specifies the monitoring schedule and defines the monitoring
     * job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig)
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring
     * schedule and defines the monitoring job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf1ab6f70010fef6f64cbb242a1c0947658ee2bf09f5fc6940a6b15c5fcd0ea1")
    public
        fun monitoringScheduleConfig(monitoringScheduleConfig: MonitoringScheduleConfigProperty.Builder.() -> Unit)

    /**
     * The name of the monitoring schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringschedulename)
     * @param monitoringScheduleName The name of the monitoring schedule. 
     */
    public fun monitoringScheduleName(monitoringScheduleName: String)

    /**
     * The status of the monitoring schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringschedulestatus)
     * @param monitoringScheduleStatus The status of the monitoring schedule. 
     */
    public fun monitoringScheduleStatus(monitoringScheduleStatus: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.Builder
        = software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.Builder.create(scope, id)

    /**
     * The name of the endpoint using the monitoring schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-endpointname)
     * @param endpointName The name of the endpoint using the monitoring schedule. 
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * Contains the reason a monitoring job failed, if it failed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-failurereason)
     * @param failureReason Contains the reason a monitoring job failed, if it failed. 
     */
    override fun failureReason(failureReason: String) {
      cdkBuilder.failureReason(failureReason)
    }

    /**
     * Describes metadata on the last execution to run, if there was one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-lastmonitoringexecutionsummary)
     * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if
     * there was one. 
     */
    override fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: IResolvable) {
      cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary.let(IResolvable::unwrap))
    }

    /**
     * Describes metadata on the last execution to run, if there was one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-lastmonitoringexecutionsummary)
     * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if
     * there was one. 
     */
    override
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: MonitoringExecutionSummaryProperty) {
      cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary.let(MonitoringExecutionSummaryProperty::unwrap))
    }

    /**
     * Describes metadata on the last execution to run, if there was one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-lastmonitoringexecutionsummary)
     * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if
     * there was one. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf990fcb08c70c985710d65a5930fd050b864215a4d6dc4fc7a97395e34f7cca")
    override
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: MonitoringExecutionSummaryProperty.Builder.() -> Unit):
        Unit =
        lastMonitoringExecutionSummary(MonitoringExecutionSummaryProperty(lastMonitoringExecutionSummary))

    /**
     * The configuration object that specifies the monitoring schedule and defines the monitoring
     * job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig)
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring
     * schedule and defines the monitoring job. 
     */
    override fun monitoringScheduleConfig(monitoringScheduleConfig: IResolvable) {
      cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig.let(IResolvable::unwrap))
    }

    /**
     * The configuration object that specifies the monitoring schedule and defines the monitoring
     * job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig)
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring
     * schedule and defines the monitoring job. 
     */
    override
        fun monitoringScheduleConfig(monitoringScheduleConfig: MonitoringScheduleConfigProperty) {
      cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig.let(MonitoringScheduleConfigProperty::unwrap))
    }

    /**
     * The configuration object that specifies the monitoring schedule and defines the monitoring
     * job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig)
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring
     * schedule and defines the monitoring job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf1ab6f70010fef6f64cbb242a1c0947658ee2bf09f5fc6940a6b15c5fcd0ea1")
    override
        fun monitoringScheduleConfig(monitoringScheduleConfig: MonitoringScheduleConfigProperty.Builder.() -> Unit):
        Unit = monitoringScheduleConfig(MonitoringScheduleConfigProperty(monitoringScheduleConfig))

    /**
     * The name of the monitoring schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringschedulename)
     * @param monitoringScheduleName The name of the monitoring schedule. 
     */
    override fun monitoringScheduleName(monitoringScheduleName: String) {
      cdkBuilder.monitoringScheduleName(monitoringScheduleName)
    }

    /**
     * The status of the monitoring schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringschedulestatus)
     * @param monitoringScheduleStatus The status of the monitoring schedule. 
     */
    override fun monitoringScheduleStatus(monitoringScheduleStatus: String) {
      cdkBuilder.monitoringScheduleStatus(monitoringScheduleStatus)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMonitoringSchedule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMonitoringSchedule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule):
        CfnMonitoringSchedule = CfnMonitoringSchedule(cdkObject)

    internal fun unwrap(wrapped: CfnMonitoringSchedule):
        software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule = wrapped.cdkObject
  }

  public interface StoppingConditionProperty {
    /**
     * The maximum length of time, in seconds, that a training or compilation job can run before it
     * is stopped.
     *
     * For compilation jobs, if the job does not complete during this time, a `TimeOut` error is
     * generated. We recommend starting with 900 seconds and increasing as necessary based on your
     * model.
     *
     * For all other jobs, if the job does not complete during this time, SageMaker ends the job.
     * When `RetryStrategy` is specified in the job request, `MaxRuntimeInSeconds` specifies the
     * maximum time for all of the attempts in total, not each individual attempt. The default value is
     * 1 day. The maximum value is 28 days.
     *
     * The maximum time that a `TrainingJob` can run in total, including any time spent publishing
     * metrics or archiving and uploading models after it has been stopped, is 30 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-stoppingcondition.html#cfn-sagemaker-monitoringschedule-stoppingcondition-maxruntimeinseconds)
     */
    public fun maxRuntimeInSeconds(): Number

    /**
     * A builder for [StoppingConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxRuntimeInSeconds The maximum length of time, in seconds, that a training or
       * compilation job can run before it is stopped. 
       * For compilation jobs, if the job does not complete during this time, a `TimeOut` error is
       * generated. We recommend starting with 900 seconds and increasing as necessary based on your
       * model.
       *
       * For all other jobs, if the job does not complete during this time, SageMaker ends the job.
       * When `RetryStrategy` is specified in the job request, `MaxRuntimeInSeconds` specifies the
       * maximum time for all of the attempts in total, not each individual attempt. The default value
       * is 1 day. The maximum value is 28 days.
       *
       * The maximum time that a `TrainingJob` can run in total, including any time spent publishing
       * metrics or archiving and uploading models after it has been stopped, is 30 days.
       */
      public fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty.builder()

      /**
       * @param maxRuntimeInSeconds The maximum length of time, in seconds, that a training or
       * compilation job can run before it is stopped. 
       * For compilation jobs, if the job does not complete during this time, a `TimeOut` error is
       * generated. We recommend starting with 900 seconds and increasing as necessary based on your
       * model.
       *
       * For all other jobs, if the job does not complete during this time, SageMaker ends the job.
       * When `RetryStrategy` is specified in the job request, `MaxRuntimeInSeconds` specifies the
       * maximum time for all of the attempts in total, not each individual attempt. The default value
       * is 1 day. The maximum value is 28 days.
       *
       * The maximum time that a `TrainingJob` can run in total, including any time spent publishing
       * metrics or archiving and uploading models after it has been stopped, is 30 days.
       */
      override fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number) {
        cdkBuilder.maxRuntimeInSeconds(maxRuntimeInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty,
    ) : CdkObject(cdkObject), StoppingConditionProperty {
      /**
       * The maximum length of time, in seconds, that a training or compilation job can run before
       * it is stopped.
       *
       * For compilation jobs, if the job does not complete during this time, a `TimeOut` error is
       * generated. We recommend starting with 900 seconds and increasing as necessary based on your
       * model.
       *
       * For all other jobs, if the job does not complete during this time, SageMaker ends the job.
       * When `RetryStrategy` is specified in the job request, `MaxRuntimeInSeconds` specifies the
       * maximum time for all of the attempts in total, not each individual attempt. The default value
       * is 1 day. The maximum value is 28 days.
       *
       * The maximum time that a `TrainingJob` can run in total, including any time spent publishing
       * metrics or archiving and uploading models after it has been stopped, is 30 days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-stoppingcondition.html#cfn-sagemaker-monitoringschedule-stoppingcondition-maxruntimeinseconds)
       */
      override fun maxRuntimeInSeconds(): Number = unwrap(this).getMaxRuntimeInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StoppingConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty):
          StoppingConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StoppingConditionProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty
    }
  }

  public interface BatchTransformInputProperty {
    /**
     * The Amazon S3 location being used to capture the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-batchtransforminput.html#cfn-sagemaker-monitoringschedule-batchtransforminput-datacaptureddestinations3uri)
     */
    public fun dataCapturedDestinationS3Uri(): String

    /**
     * The dataset format for your batch transform job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-batchtransforminput.html#cfn-sagemaker-monitoringschedule-batchtransforminput-datasetformat)
     */
    public fun datasetFormat(): Any

    /**
     * The attributes of the input data to exclude from the analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-batchtransforminput.html#cfn-sagemaker-monitoringschedule-batchtransforminput-excludefeaturesattribute)
     */
    public fun excludeFeaturesAttribute(): String? = unwrap(this).getExcludeFeaturesAttribute()

    /**
     * Path to the filesystem where the batch transform data is available to the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-batchtransforminput.html#cfn-sagemaker-monitoringschedule-batchtransforminput-localpath)
     */
    public fun localPath(): String

    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key.
     *
     * Defaults to `FullyReplicated`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-batchtransforminput.html#cfn-sagemaker-monitoringschedule-batchtransforminput-s3datadistributiontype)
     */
    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    /**
     * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
     * monitoring job.
     *
     * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that fit
     * in memory. Defaults to `File` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-batchtransforminput.html#cfn-sagemaker-monitoringschedule-batchtransforminput-s3inputmode)
     */
    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

    /**
     * A builder for [BatchTransformInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataCapturedDestinationS3Uri The Amazon S3 location being used to capture the data. 
       */
      public fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String)

      /**
       * @param datasetFormat The dataset format for your batch transform job. 
       */
      public fun datasetFormat(datasetFormat: IResolvable)

      /**
       * @param datasetFormat The dataset format for your batch transform job. 
       */
      public fun datasetFormat(datasetFormat: DatasetFormatProperty)

      /**
       * @param datasetFormat The dataset format for your batch transform job. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e1de90d889696aab90fdc83d5b3ac4a95499185210d1ae296f177b70867162e")
      public fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit)

      /**
       * @param excludeFeaturesAttribute The attributes of the input data to exclude from the
       * analysis.
       */
      public fun excludeFeaturesAttribute(excludeFeaturesAttribute: String)

      /**
       * @param localPath Path to the filesystem where the batch transform data is available to the
       * container. 
       */
      public fun localPath(localPath: String)

      /**
       * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully
       * replicated or sharded by an S3 key.
       * Defaults to `FullyReplicated`
       */
      public fun s3DataDistributionType(s3DataDistributionType: String)

      /**
       * @param s3InputMode Whether the `Pipe` or `File` is used as the input mode for transferring
       * data for the monitoring job.
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       */
      public fun s3InputMode(s3InputMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BatchTransformInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BatchTransformInputProperty.builder()

      /**
       * @param dataCapturedDestinationS3Uri The Amazon S3 location being used to capture the data. 
       */
      override fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String) {
        cdkBuilder.dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri)
      }

      /**
       * @param datasetFormat The dataset format for your batch transform job. 
       */
      override fun datasetFormat(datasetFormat: IResolvable) {
        cdkBuilder.datasetFormat(datasetFormat.let(IResolvable::unwrap))
      }

      /**
       * @param datasetFormat The dataset format for your batch transform job. 
       */
      override fun datasetFormat(datasetFormat: DatasetFormatProperty) {
        cdkBuilder.datasetFormat(datasetFormat.let(DatasetFormatProperty::unwrap))
      }

      /**
       * @param datasetFormat The dataset format for your batch transform job. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e1de90d889696aab90fdc83d5b3ac4a95499185210d1ae296f177b70867162e")
      override fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit): Unit =
          datasetFormat(DatasetFormatProperty(datasetFormat))

      /**
       * @param excludeFeaturesAttribute The attributes of the input data to exclude from the
       * analysis.
       */
      override fun excludeFeaturesAttribute(excludeFeaturesAttribute: String) {
        cdkBuilder.excludeFeaturesAttribute(excludeFeaturesAttribute)
      }

      /**
       * @param localPath Path to the filesystem where the batch transform data is available to the
       * container. 
       */
      override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      /**
       * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully
       * replicated or sharded by an S3 key.
       * Defaults to `FullyReplicated`
       */
      override fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
      }

      /**
       * @param s3InputMode Whether the `Pipe` or `File` is used as the input mode for transferring
       * data for the monitoring job.
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       */
      override fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BatchTransformInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BatchTransformInputProperty,
    ) : CdkObject(cdkObject), BatchTransformInputProperty {
      /**
       * The Amazon S3 location being used to capture the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-batchtransforminput.html#cfn-sagemaker-monitoringschedule-batchtransforminput-datacaptureddestinations3uri)
       */
      override fun dataCapturedDestinationS3Uri(): String =
          unwrap(this).getDataCapturedDestinationS3Uri()

      /**
       * The dataset format for your batch transform job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-batchtransforminput.html#cfn-sagemaker-monitoringschedule-batchtransforminput-datasetformat)
       */
      override fun datasetFormat(): Any = unwrap(this).getDatasetFormat()

      /**
       * The attributes of the input data to exclude from the analysis.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-batchtransforminput.html#cfn-sagemaker-monitoringschedule-batchtransforminput-excludefeaturesattribute)
       */
      override fun excludeFeaturesAttribute(): String? = unwrap(this).getExcludeFeaturesAttribute()

      /**
       * Path to the filesystem where the batch transform data is available to the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-batchtransforminput.html#cfn-sagemaker-monitoringschedule-batchtransforminput-localpath)
       */
      override fun localPath(): String = unwrap(this).getLocalPath()

      /**
       * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key.
       *
       * Defaults to `FullyReplicated`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-batchtransforminput.html#cfn-sagemaker-monitoringschedule-batchtransforminput-s3datadistributiontype)
       */
      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      /**
       * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
       * monitoring job.
       *
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-batchtransforminput.html#cfn-sagemaker-monitoringschedule-batchtransforminput-s3inputmode)
       */
      override fun s3InputMode(): String? = unwrap(this).getS3InputMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchTransformInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BatchTransformInputProperty):
          BatchTransformInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchTransformInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BatchTransformInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BatchTransformInputProperty
    }
  }

  public interface JsonProperty {
    /**
     * A boolean flag indicating if it is JSON line format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-json.html#cfn-sagemaker-monitoringschedule-json-line)
     */
    public fun line(): Any? = unwrap(this).getLine()

    /**
     * A builder for [JsonProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param line A boolean flag indicating if it is JSON line format.
       */
      public fun line(line: Boolean)

      /**
       * @param line A boolean flag indicating if it is JSON line format.
       */
      public fun line(line: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.JsonProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.JsonProperty.builder()

      /**
       * @param line A boolean flag indicating if it is JSON line format.
       */
      override fun line(line: Boolean) {
        cdkBuilder.line(line)
      }

      /**
       * @param line A boolean flag indicating if it is JSON line format.
       */
      override fun line(line: IResolvable) {
        cdkBuilder.line(line.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.JsonProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.JsonProperty,
    ) : CdkObject(cdkObject), JsonProperty {
      /**
       * A boolean flag indicating if it is JSON line format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-json.html#cfn-sagemaker-monitoringschedule-json-line)
       */
      override fun line(): Any? = unwrap(this).getLine()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JsonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.JsonProperty):
          JsonProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.JsonProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.JsonProperty
    }
  }

  public interface EndpointInputProperty {
    /**
     * An endpoint in customer's account which has enabled `DataCaptureConfig` enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-endpointinput.html#cfn-sagemaker-monitoringschedule-endpointinput-endpointname)
     */
    public fun endpointName(): String

    /**
     * The attributes of the input data to exclude from the analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-endpointinput.html#cfn-sagemaker-monitoringschedule-endpointinput-excludefeaturesattribute)
     */
    public fun excludeFeaturesAttribute(): String? = unwrap(this).getExcludeFeaturesAttribute()

    /**
     * Path to the filesystem where the endpoint data is available to the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-endpointinput.html#cfn-sagemaker-monitoringschedule-endpointinput-localpath)
     */
    public fun localPath(): String

    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an Amazon S3
     * key.
     *
     * Defaults to `FullyReplicated`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-endpointinput.html#cfn-sagemaker-monitoringschedule-endpointinput-s3datadistributiontype)
     */
    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    /**
     * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
     * monitoring job.
     *
     * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that fit
     * in memory. Defaults to `File` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-endpointinput.html#cfn-sagemaker-monitoringschedule-endpointinput-s3inputmode)
     */
    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

    /**
     * A builder for [EndpointInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpointName An endpoint in customer's account which has enabled `DataCaptureConfig`
       * enabled. 
       */
      public fun endpointName(endpointName: String)

      /**
       * @param excludeFeaturesAttribute The attributes of the input data to exclude from the
       * analysis.
       */
      public fun excludeFeaturesAttribute(excludeFeaturesAttribute: String)

      /**
       * @param localPath Path to the filesystem where the endpoint data is available to the
       * container. 
       */
      public fun localPath(localPath: String)

      /**
       * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully
       * replicated or sharded by an Amazon S3 key.
       * Defaults to `FullyReplicated`
       */
      public fun s3DataDistributionType(s3DataDistributionType: String)

      /**
       * @param s3InputMode Whether the `Pipe` or `File` is used as the input mode for transferring
       * data for the monitoring job.
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       */
      public fun s3InputMode(s3InputMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.EndpointInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.EndpointInputProperty.builder()

      /**
       * @param endpointName An endpoint in customer's account which has enabled `DataCaptureConfig`
       * enabled. 
       */
      override fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
      }

      /**
       * @param excludeFeaturesAttribute The attributes of the input data to exclude from the
       * analysis.
       */
      override fun excludeFeaturesAttribute(excludeFeaturesAttribute: String) {
        cdkBuilder.excludeFeaturesAttribute(excludeFeaturesAttribute)
      }

      /**
       * @param localPath Path to the filesystem where the endpoint data is available to the
       * container. 
       */
      override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      /**
       * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully
       * replicated or sharded by an Amazon S3 key.
       * Defaults to `FullyReplicated`
       */
      override fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
      }

      /**
       * @param s3InputMode Whether the `Pipe` or `File` is used as the input mode for transferring
       * data for the monitoring job.
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       */
      override fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.EndpointInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.EndpointInputProperty,
    ) : CdkObject(cdkObject), EndpointInputProperty {
      /**
       * An endpoint in customer's account which has enabled `DataCaptureConfig` enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-endpointinput.html#cfn-sagemaker-monitoringschedule-endpointinput-endpointname)
       */
      override fun endpointName(): String = unwrap(this).getEndpointName()

      /**
       * The attributes of the input data to exclude from the analysis.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-endpointinput.html#cfn-sagemaker-monitoringschedule-endpointinput-excludefeaturesattribute)
       */
      override fun excludeFeaturesAttribute(): String? = unwrap(this).getExcludeFeaturesAttribute()

      /**
       * Path to the filesystem where the endpoint data is available to the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-endpointinput.html#cfn-sagemaker-monitoringschedule-endpointinput-localpath)
       */
      override fun localPath(): String = unwrap(this).getLocalPath()

      /**
       * Whether input data distributed in Amazon S3 is fully replicated or sharded by an Amazon S3
       * key.
       *
       * Defaults to `FullyReplicated`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-endpointinput.html#cfn-sagemaker-monitoringschedule-endpointinput-s3datadistributiontype)
       */
      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      /**
       * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
       * monitoring job.
       *
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-endpointinput.html#cfn-sagemaker-monitoringschedule-endpointinput-s3inputmode)
       */
      override fun s3InputMode(): String? = unwrap(this).getS3InputMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.EndpointInputProperty):
          EndpointInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.EndpointInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.EndpointInputProperty
    }
  }

  public interface MonitoringAppSpecificationProperty {
    /**
     * An array of arguments for the container used to run the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringappspecification.html#cfn-sagemaker-monitoringschedule-monitoringappspecification-containerarguments)
     */
    public fun containerArguments(): List<String> = unwrap(this).getContainerArguments() ?:
        emptyList()

    /**
     * Specifies the entrypoint for a container used to run the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringappspecification.html#cfn-sagemaker-monitoringschedule-monitoringappspecification-containerentrypoint)
     */
    public fun containerEntrypoint(): List<String> = unwrap(this).getContainerEntrypoint() ?:
        emptyList()

    /**
     * The container image to be run by the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringappspecification.html#cfn-sagemaker-monitoringschedule-monitoringappspecification-imageuri)
     */
    public fun imageUri(): String

    /**
     * An Amazon S3 URI to a script that is called after analysis has been performed.
     *
     * Applicable only for the built-in (first party) containers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringappspecification.html#cfn-sagemaker-monitoringschedule-monitoringappspecification-postanalyticsprocessorsourceuri)
     */
    public fun postAnalyticsProcessorSourceUri(): String? =
        unwrap(this).getPostAnalyticsProcessorSourceUri()

    /**
     * An Amazon S3 URI to a script that is called per row prior to running analysis.
     *
     * It can base64 decode the payload and convert it into a flattened JSON so that the built-in
     * container can use the converted data. Applicable only for the built-in (first party) containers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringappspecification.html#cfn-sagemaker-monitoringschedule-monitoringappspecification-recordpreprocessorsourceuri)
     */
    public fun recordPreprocessorSourceUri(): String? =
        unwrap(this).getRecordPreprocessorSourceUri()

    /**
     * A builder for [MonitoringAppSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerArguments An array of arguments for the container used to run the
       * monitoring job.
       */
      public fun containerArguments(containerArguments: List<String>)

      /**
       * @param containerArguments An array of arguments for the container used to run the
       * monitoring job.
       */
      public fun containerArguments(vararg containerArguments: String)

      /**
       * @param containerEntrypoint Specifies the entrypoint for a container used to run the
       * monitoring job.
       */
      public fun containerEntrypoint(containerEntrypoint: List<String>)

      /**
       * @param containerEntrypoint Specifies the entrypoint for a container used to run the
       * monitoring job.
       */
      public fun containerEntrypoint(vararg containerEntrypoint: String)

      /**
       * @param imageUri The container image to be run by the monitoring job. 
       */
      public fun imageUri(imageUri: String)

      /**
       * @param postAnalyticsProcessorSourceUri An Amazon S3 URI to a script that is called after
       * analysis has been performed.
       * Applicable only for the built-in (first party) containers.
       */
      public fun postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri: String)

      /**
       * @param recordPreprocessorSourceUri An Amazon S3 URI to a script that is called per row
       * prior to running analysis.
       * It can base64 decode the payload and convert it into a flattened JSON so that the built-in
       * container can use the converted data. Applicable only for the built-in (first party)
       * containers.
       */
      public fun recordPreprocessorSourceUri(recordPreprocessorSourceUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty.builder()

      /**
       * @param containerArguments An array of arguments for the container used to run the
       * monitoring job.
       */
      override fun containerArguments(containerArguments: List<String>) {
        cdkBuilder.containerArguments(containerArguments)
      }

      /**
       * @param containerArguments An array of arguments for the container used to run the
       * monitoring job.
       */
      override fun containerArguments(vararg containerArguments: String): Unit =
          containerArguments(containerArguments.toList())

      /**
       * @param containerEntrypoint Specifies the entrypoint for a container used to run the
       * monitoring job.
       */
      override fun containerEntrypoint(containerEntrypoint: List<String>) {
        cdkBuilder.containerEntrypoint(containerEntrypoint)
      }

      /**
       * @param containerEntrypoint Specifies the entrypoint for a container used to run the
       * monitoring job.
       */
      override fun containerEntrypoint(vararg containerEntrypoint: String): Unit =
          containerEntrypoint(containerEntrypoint.toList())

      /**
       * @param imageUri The container image to be run by the monitoring job. 
       */
      override fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
      }

      /**
       * @param postAnalyticsProcessorSourceUri An Amazon S3 URI to a script that is called after
       * analysis has been performed.
       * Applicable only for the built-in (first party) containers.
       */
      override fun postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri: String) {
        cdkBuilder.postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri)
      }

      /**
       * @param recordPreprocessorSourceUri An Amazon S3 URI to a script that is called per row
       * prior to running analysis.
       * It can base64 decode the payload and convert it into a flattened JSON so that the built-in
       * container can use the converted data. Applicable only for the built-in (first party)
       * containers.
       */
      override fun recordPreprocessorSourceUri(recordPreprocessorSourceUri: String) {
        cdkBuilder.recordPreprocessorSourceUri(recordPreprocessorSourceUri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty,
    ) : CdkObject(cdkObject), MonitoringAppSpecificationProperty {
      /**
       * An array of arguments for the container used to run the monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringappspecification.html#cfn-sagemaker-monitoringschedule-monitoringappspecification-containerarguments)
       */
      override fun containerArguments(): List<String> = unwrap(this).getContainerArguments() ?:
          emptyList()

      /**
       * Specifies the entrypoint for a container used to run the monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringappspecification.html#cfn-sagemaker-monitoringschedule-monitoringappspecification-containerentrypoint)
       */
      override fun containerEntrypoint(): List<String> = unwrap(this).getContainerEntrypoint() ?:
          emptyList()

      /**
       * The container image to be run by the monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringappspecification.html#cfn-sagemaker-monitoringschedule-monitoringappspecification-imageuri)
       */
      override fun imageUri(): String = unwrap(this).getImageUri()

      /**
       * An Amazon S3 URI to a script that is called after analysis has been performed.
       *
       * Applicable only for the built-in (first party) containers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringappspecification.html#cfn-sagemaker-monitoringschedule-monitoringappspecification-postanalyticsprocessorsourceuri)
       */
      override fun postAnalyticsProcessorSourceUri(): String? =
          unwrap(this).getPostAnalyticsProcessorSourceUri()

      /**
       * An Amazon S3 URI to a script that is called per row prior to running analysis.
       *
       * It can base64 decode the payload and convert it into a flattened JSON so that the built-in
       * container can use the converted data. Applicable only for the built-in (first party)
       * containers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringappspecification.html#cfn-sagemaker-monitoringschedule-monitoringappspecification-recordpreprocessorsourceuri)
       */
      override fun recordPreprocessorSourceUri(): String? =
          unwrap(this).getRecordPreprocessorSourceUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MonitoringAppSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty):
          MonitoringAppSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringAppSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty
    }
  }

  public interface MonitoringOutputConfigProperty {
    /**
     * The AWS Key Management Service ( AWS KMS ) key that Amazon SageMaker uses to encrypt the
     * model artifacts at rest using Amazon S3 server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringoutputconfig.html#cfn-sagemaker-monitoringschedule-monitoringoutputconfig-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Monitoring outputs for monitoring jobs.
     *
     * This is where the output of the periodic monitoring jobs is uploaded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringoutputconfig.html#cfn-sagemaker-monitoringschedule-monitoringoutputconfig-monitoringoutputs)
     */
    public fun monitoringOutputs(): Any

    /**
     * A builder for [MonitoringOutputConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The AWS Key Management Service ( AWS KMS ) key that Amazon SageMaker uses
       * to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
       * This is where the output of the periodic monitoring jobs is uploaded.
       */
      public fun monitoringOutputs(monitoringOutputs: IResolvable)

      /**
       * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
       * This is where the output of the periodic monitoring jobs is uploaded.
       */
      public fun monitoringOutputs(monitoringOutputs: List<Any>)

      /**
       * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
       * This is where the output of the periodic monitoring jobs is uploaded.
       */
      public fun monitoringOutputs(vararg monitoringOutputs: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty.builder()

      /**
       * @param kmsKeyId The AWS Key Management Service ( AWS KMS ) key that Amazon SageMaker uses
       * to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
       * This is where the output of the periodic monitoring jobs is uploaded.
       */
      override fun monitoringOutputs(monitoringOutputs: IResolvable) {
        cdkBuilder.monitoringOutputs(monitoringOutputs.let(IResolvable::unwrap))
      }

      /**
       * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
       * This is where the output of the periodic monitoring jobs is uploaded.
       */
      override fun monitoringOutputs(monitoringOutputs: List<Any>) {
        cdkBuilder.monitoringOutputs(monitoringOutputs)
      }

      /**
       * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
       * This is where the output of the periodic monitoring jobs is uploaded.
       */
      override fun monitoringOutputs(vararg monitoringOutputs: Any): Unit =
          monitoringOutputs(monitoringOutputs.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty,
    ) : CdkObject(cdkObject), MonitoringOutputConfigProperty {
      /**
       * The AWS Key Management Service ( AWS KMS ) key that Amazon SageMaker uses to encrypt the
       * model artifacts at rest using Amazon S3 server-side encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringoutputconfig.html#cfn-sagemaker-monitoringschedule-monitoringoutputconfig-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * Monitoring outputs for monitoring jobs.
       *
       * This is where the output of the periodic monitoring jobs is uploaded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringoutputconfig.html#cfn-sagemaker-monitoringschedule-monitoringoutputconfig-monitoringoutputs)
       */
      override fun monitoringOutputs(): Any = unwrap(this).getMonitoringOutputs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringOutputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty):
          MonitoringOutputConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty
    }
  }

  public interface MonitoringInputProperty {
    /**
     * Input object for the batch transform job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringinput.html#cfn-sagemaker-monitoringschedule-monitoringinput-batchtransforminput)
     */
    public fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

    /**
     * The endpoint for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringinput.html#cfn-sagemaker-monitoringschedule-monitoringinput-endpointinput)
     */
    public fun endpointInput(): Any? = unwrap(this).getEndpointInput()

    /**
     * A builder for [MonitoringInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchTransformInput Input object for the batch transform job.
       */
      public fun batchTransformInput(batchTransformInput: IResolvable)

      /**
       * @param batchTransformInput Input object for the batch transform job.
       */
      public fun batchTransformInput(batchTransformInput: BatchTransformInputProperty)

      /**
       * @param batchTransformInput Input object for the batch transform job.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db41791840963983b97700ef7ac73e98d09b85c6db56bd096e155140e7f40940")
      public
          fun batchTransformInput(batchTransformInput: BatchTransformInputProperty.Builder.() -> Unit)

      /**
       * @param endpointInput The endpoint for a monitoring job.
       */
      public fun endpointInput(endpointInput: IResolvable)

      /**
       * @param endpointInput The endpoint for a monitoring job.
       */
      public fun endpointInput(endpointInput: EndpointInputProperty)

      /**
       * @param endpointInput The endpoint for a monitoring job.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c253a1262d85ceceb38075f6ddcf0a394d94ac975e8b3c6196b29e44dccf0b73")
      public fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringInputProperty.builder()

      /**
       * @param batchTransformInput Input object for the batch transform job.
       */
      override fun batchTransformInput(batchTransformInput: IResolvable) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(IResolvable::unwrap))
      }

      /**
       * @param batchTransformInput Input object for the batch transform job.
       */
      override fun batchTransformInput(batchTransformInput: BatchTransformInputProperty) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(BatchTransformInputProperty::unwrap))
      }

      /**
       * @param batchTransformInput Input object for the batch transform job.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db41791840963983b97700ef7ac73e98d09b85c6db56bd096e155140e7f40940")
      override
          fun batchTransformInput(batchTransformInput: BatchTransformInputProperty.Builder.() -> Unit):
          Unit = batchTransformInput(BatchTransformInputProperty(batchTransformInput))

      /**
       * @param endpointInput The endpoint for a monitoring job.
       */
      override fun endpointInput(endpointInput: IResolvable) {
        cdkBuilder.endpointInput(endpointInput.let(IResolvable::unwrap))
      }

      /**
       * @param endpointInput The endpoint for a monitoring job.
       */
      override fun endpointInput(endpointInput: EndpointInputProperty) {
        cdkBuilder.endpointInput(endpointInput.let(EndpointInputProperty::unwrap))
      }

      /**
       * @param endpointInput The endpoint for a monitoring job.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c253a1262d85ceceb38075f6ddcf0a394d94ac975e8b3c6196b29e44dccf0b73")
      override fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit): Unit =
          endpointInput(EndpointInputProperty(endpointInput))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringInputProperty,
    ) : CdkObject(cdkObject), MonitoringInputProperty {
      /**
       * Input object for the batch transform job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringinput.html#cfn-sagemaker-monitoringschedule-monitoringinput-batchtransforminput)
       */
      override fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

      /**
       * The endpoint for a monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringinput.html#cfn-sagemaker-monitoringschedule-monitoringinput-endpointinput)
       */
      override fun endpointInput(): Any? = unwrap(this).getEndpointInput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringInputProperty):
          MonitoringInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringInputProperty
    }
  }

  public interface VpcConfigProperty {
    /**
     * The VPC security group IDs, in the form `sg-xxxxxxxx` .
     *
     * Specify the security groups for the VPC that is specified in the `Subnets` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-vpcconfig.html#cfn-sagemaker-monitoringschedule-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * The ID of the subnets in the VPC to which you want to connect your training job or model.
     *
     * For information about the availability of specific instance types, see [Supported Instance
     * Types and Availability
     * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-vpcconfig.html#cfn-sagemaker-monitoringschedule-vpcconfig-subnets)
     */
    public fun subnets(): List<String>

    /**
     * A builder for [VpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.VpcConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.VpcConfigProperty.builder()

      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      /**
       * The VPC security group IDs, in the form `sg-xxxxxxxx` .
       *
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-vpcconfig.html#cfn-sagemaker-monitoringschedule-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * The ID of the subnets in the VPC to which you want to connect your training job or model.
       *
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-vpcconfig.html#cfn-sagemaker-monitoringschedule-vpcconfig-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.VpcConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.VpcConfigProperty
    }
  }

  public interface MonitoringExecutionSummaryProperty {
    /**
     * The time at which the monitoring job was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-creationtime)
     */
    public fun creationTime(): String

    /**
     * The name of the endpoint used to run the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-endpointname)
     */
    public fun endpointName(): String? = unwrap(this).getEndpointName()

    /**
     * Contains the reason a monitoring job failed, if it failed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-failurereason)
     */
    public fun failureReason(): String? = unwrap(this).getFailureReason()

    /**
     * A timestamp that indicates the last time the monitoring job was modified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-lastmodifiedtime)
     */
    public fun lastModifiedTime(): String

    /**
     * The status of the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-monitoringexecutionstatus)
     */
    public fun monitoringExecutionStatus(): String

    /**
     * The name of the monitoring schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-monitoringschedulename)
     */
    public fun monitoringScheduleName(): String

    /**
     * The Amazon Resource Name (ARN) of the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-processingjobarn)
     */
    public fun processingJobArn(): String? = unwrap(this).getProcessingJobArn()

    /**
     * The time the monitoring job was scheduled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-scheduledtime)
     */
    public fun scheduledTime(): String

    /**
     * A builder for [MonitoringExecutionSummaryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param creationTime The time at which the monitoring job was created. 
       */
      public fun creationTime(creationTime: String)

      /**
       * @param endpointName The name of the endpoint used to run the monitoring job.
       */
      public fun endpointName(endpointName: String)

      /**
       * @param failureReason Contains the reason a monitoring job failed, if it failed.
       */
      public fun failureReason(failureReason: String)

      /**
       * @param lastModifiedTime A timestamp that indicates the last time the monitoring job was
       * modified. 
       */
      public fun lastModifiedTime(lastModifiedTime: String)

      /**
       * @param monitoringExecutionStatus The status of the monitoring job. 
       */
      public fun monitoringExecutionStatus(monitoringExecutionStatus: String)

      /**
       * @param monitoringScheduleName The name of the monitoring schedule. 
       */
      public fun monitoringScheduleName(monitoringScheduleName: String)

      /**
       * @param processingJobArn The Amazon Resource Name (ARN) of the monitoring job.
       */
      public fun processingJobArn(processingJobArn: String)

      /**
       * @param scheduledTime The time the monitoring job was scheduled. 
       */
      public fun scheduledTime(scheduledTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty.builder()

      /**
       * @param creationTime The time at which the monitoring job was created. 
       */
      override fun creationTime(creationTime: String) {
        cdkBuilder.creationTime(creationTime)
      }

      /**
       * @param endpointName The name of the endpoint used to run the monitoring job.
       */
      override fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
      }

      /**
       * @param failureReason Contains the reason a monitoring job failed, if it failed.
       */
      override fun failureReason(failureReason: String) {
        cdkBuilder.failureReason(failureReason)
      }

      /**
       * @param lastModifiedTime A timestamp that indicates the last time the monitoring job was
       * modified. 
       */
      override fun lastModifiedTime(lastModifiedTime: String) {
        cdkBuilder.lastModifiedTime(lastModifiedTime)
      }

      /**
       * @param monitoringExecutionStatus The status of the monitoring job. 
       */
      override fun monitoringExecutionStatus(monitoringExecutionStatus: String) {
        cdkBuilder.monitoringExecutionStatus(monitoringExecutionStatus)
      }

      /**
       * @param monitoringScheduleName The name of the monitoring schedule. 
       */
      override fun monitoringScheduleName(monitoringScheduleName: String) {
        cdkBuilder.monitoringScheduleName(monitoringScheduleName)
      }

      /**
       * @param processingJobArn The Amazon Resource Name (ARN) of the monitoring job.
       */
      override fun processingJobArn(processingJobArn: String) {
        cdkBuilder.processingJobArn(processingJobArn)
      }

      /**
       * @param scheduledTime The time the monitoring job was scheduled. 
       */
      override fun scheduledTime(scheduledTime: String) {
        cdkBuilder.scheduledTime(scheduledTime)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty,
    ) : CdkObject(cdkObject), MonitoringExecutionSummaryProperty {
      /**
       * The time at which the monitoring job was created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-creationtime)
       */
      override fun creationTime(): String = unwrap(this).getCreationTime()

      /**
       * The name of the endpoint used to run the monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-endpointname)
       */
      override fun endpointName(): String? = unwrap(this).getEndpointName()

      /**
       * Contains the reason a monitoring job failed, if it failed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-failurereason)
       */
      override fun failureReason(): String? = unwrap(this).getFailureReason()

      /**
       * A timestamp that indicates the last time the monitoring job was modified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-lastmodifiedtime)
       */
      override fun lastModifiedTime(): String = unwrap(this).getLastModifiedTime()

      /**
       * The status of the monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-monitoringexecutionstatus)
       */
      override fun monitoringExecutionStatus(): String = unwrap(this).getMonitoringExecutionStatus()

      /**
       * The name of the monitoring schedule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-monitoringschedulename)
       */
      override fun monitoringScheduleName(): String = unwrap(this).getMonitoringScheduleName()

      /**
       * The Amazon Resource Name (ARN) of the monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-processingjobarn)
       */
      override fun processingJobArn(): String? = unwrap(this).getProcessingJobArn()

      /**
       * The time the monitoring job was scheduled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html#cfn-sagemaker-monitoringschedule-monitoringexecutionsummary-scheduledtime)
       */
      override fun scheduledTime(): String = unwrap(this).getScheduledTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MonitoringExecutionSummaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty):
          MonitoringExecutionSummaryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringExecutionSummaryProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty
    }
  }

  public interface MonitoringOutputProperty {
    /**
     * The Amazon S3 storage location where the results of a monitoring job are saved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringoutput.html#cfn-sagemaker-monitoringschedule-monitoringoutput-s3output)
     */
    public fun s3Output(): Any

    /**
     * A builder for [MonitoringOutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
       * saved. 
       */
      public fun s3Output(s3Output: IResolvable)

      /**
       * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
       * saved. 
       */
      public fun s3Output(s3Output: S3OutputProperty)

      /**
       * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
       * saved. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48d428be201223df59ac91d45718e8b034447a634441c6ba2054abda24cf6a6a")
      public fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputProperty.builder()

      /**
       * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
       * saved. 
       */
      override fun s3Output(s3Output: IResolvable) {
        cdkBuilder.s3Output(s3Output.let(IResolvable::unwrap))
      }

      /**
       * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
       * saved. 
       */
      override fun s3Output(s3Output: S3OutputProperty) {
        cdkBuilder.s3Output(s3Output.let(S3OutputProperty::unwrap))
      }

      /**
       * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
       * saved. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48d428be201223df59ac91d45718e8b034447a634441c6ba2054abda24cf6a6a")
      override fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit): Unit =
          s3Output(S3OutputProperty(s3Output))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputProperty,
    ) : CdkObject(cdkObject), MonitoringOutputProperty {
      /**
       * The Amazon S3 storage location where the results of a monitoring job are saved.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringoutput.html#cfn-sagemaker-monitoringschedule-monitoringoutput-s3output)
       */
      override fun s3Output(): Any = unwrap(this).getS3Output()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputProperty):
          MonitoringOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputProperty
    }
  }

  public interface ConstraintsResourceProperty {
    /**
     * The Amazon S3 URI for the constraints resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-constraintsresource.html#cfn-sagemaker-monitoringschedule-constraintsresource-s3uri)
     */
    public fun s3Uri(): String? = unwrap(this).getS3Uri()

    /**
     * A builder for [ConstraintsResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Uri The Amazon S3 URI for the constraints resource.
       */
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty.builder()

      /**
       * @param s3Uri The Amazon S3 URI for the constraints resource.
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty,
    ) : CdkObject(cdkObject), ConstraintsResourceProperty {
      /**
       * The Amazon S3 URI for the constraints resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-constraintsresource.html#cfn-sagemaker-monitoringschedule-constraintsresource-s3uri)
       */
      override fun s3Uri(): String? = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConstraintsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty):
          ConstraintsResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConstraintsResourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty
    }
  }

  public interface CsvProperty {
    /**
     * A boolean flag indicating if given CSV has header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-csv.html#cfn-sagemaker-monitoringschedule-csv-header)
     */
    public fun `header`(): Any? = unwrap(this).getHeader()

    /**
     * A builder for [CsvProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param header A boolean flag indicating if given CSV has header.
       */
      public fun `header`(`header`: Boolean)

      /**
       * @param header A boolean flag indicating if given CSV has header.
       */
      public fun `header`(`header`: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.CsvProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.CsvProperty.builder()

      /**
       * @param header A boolean flag indicating if given CSV has header.
       */
      override fun `header`(`header`: Boolean) {
        cdkBuilder.`header`(`header`)
      }

      /**
       * @param header A boolean flag indicating if given CSV has header.
       */
      override fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.CsvProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.CsvProperty,
    ) : CdkObject(cdkObject), CsvProperty {
      /**
       * A boolean flag indicating if given CSV has header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-csv.html#cfn-sagemaker-monitoringschedule-csv-header)
       */
      override fun `header`(): Any? = unwrap(this).getHeader()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CsvProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.CsvProperty):
          CsvProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.CsvProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.CsvProperty
    }
  }

  public interface MonitoringJobDefinitionProperty {
    /**
     * Baseline configuration used to validate that the data conforms to the specified constraints
     * and statistics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-baselineconfig)
     */
    public fun baselineConfig(): Any? = unwrap(this).getBaselineConfig()

    /**
     * Sets the environment variables in the Docker container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * Configures the monitoring job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-monitoringappspecification)
     */
    public fun monitoringAppSpecification(): Any

    /**
     * The array of inputs for the monitoring job.
     *
     * Currently we support monitoring an Amazon SageMaker Endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-monitoringinputs)
     */
    public fun monitoringInputs(): Any

    /**
     * The array of outputs from the monitoring job to be uploaded to Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-monitoringoutputconfig)
     */
    public fun monitoringOutputConfig(): Any

    /**
     * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a
     * monitoring job.
     *
     * In distributed processing, you specify more than one instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-monitoringresources)
     */
    public fun monitoringResources(): Any

    /**
     * Specifies networking options for an monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-networkconfig)
     */
    public fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform
     * tasks on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-rolearn)
     */
    public fun roleArn(): String

    /**
     * Specifies a time limit for how long the monitoring job is allowed to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-stoppingcondition)
     */
    public fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

    /**
     * A builder for [MonitoringJobDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param baselineConfig Baseline configuration used to validate that the data conforms to the
       * specified constraints and statistics.
       */
      public fun baselineConfig(baselineConfig: IResolvable)

      /**
       * @param baselineConfig Baseline configuration used to validate that the data conforms to the
       * specified constraints and statistics.
       */
      public fun baselineConfig(baselineConfig: BaselineConfigProperty)

      /**
       * @param baselineConfig Baseline configuration used to validate that the data conforms to the
       * specified constraints and statistics.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b25d852cd5d3c2a37f56c5a52e7ca9a2a71206ade16624d6cc4a9b0beff29c31")
      public fun baselineConfig(baselineConfig: BaselineConfigProperty.Builder.() -> Unit)

      /**
       * @param environment Sets the environment variables in the Docker container.
       */
      public fun environment(environment: IResolvable)

      /**
       * @param environment Sets the environment variables in the Docker container.
       */
      public fun environment(environment: Map<String, String>)

      /**
       * @param monitoringAppSpecification Configures the monitoring job to run a specified Docker
       * container image. 
       */
      public fun monitoringAppSpecification(monitoringAppSpecification: IResolvable)

      /**
       * @param monitoringAppSpecification Configures the monitoring job to run a specified Docker
       * container image. 
       */
      public
          fun monitoringAppSpecification(monitoringAppSpecification: MonitoringAppSpecificationProperty)

      /**
       * @param monitoringAppSpecification Configures the monitoring job to run a specified Docker
       * container image. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1936482f308087d02f3cface6907e34a93dd1d32475dfba96e4eb0a6effe545")
      public
          fun monitoringAppSpecification(monitoringAppSpecification: MonitoringAppSpecificationProperty.Builder.() -> Unit)

      /**
       * @param monitoringInputs The array of inputs for the monitoring job. 
       * Currently we support monitoring an Amazon SageMaker Endpoint.
       */
      public fun monitoringInputs(monitoringInputs: IResolvable)

      /**
       * @param monitoringInputs The array of inputs for the monitoring job. 
       * Currently we support monitoring an Amazon SageMaker Endpoint.
       */
      public fun monitoringInputs(monitoringInputs: List<Any>)

      /**
       * @param monitoringInputs The array of inputs for the monitoring job. 
       * Currently we support monitoring an Amazon SageMaker Endpoint.
       */
      public fun monitoringInputs(vararg monitoringInputs: Any)

      /**
       * @param monitoringOutputConfig The array of outputs from the monitoring job to be uploaded
       * to Amazon S3. 
       */
      public fun monitoringOutputConfig(monitoringOutputConfig: IResolvable)

      /**
       * @param monitoringOutputConfig The array of outputs from the monitoring job to be uploaded
       * to Amazon S3. 
       */
      public fun monitoringOutputConfig(monitoringOutputConfig: MonitoringOutputConfigProperty)

      /**
       * @param monitoringOutputConfig The array of outputs from the monitoring job to be uploaded
       * to Amazon S3. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5cfd4507a90781185c4942290f164ac1a2cb7d1f81c715151b4bfa5df11f00c")
      public
          fun monitoringOutputConfig(monitoringOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit)

      /**
       * @param monitoringResources Identifies the resources, ML compute instances, and ML storage
       * volumes to deploy for a monitoring job. 
       * In distributed processing, you specify more than one instance.
       */
      public fun monitoringResources(monitoringResources: IResolvable)

      /**
       * @param monitoringResources Identifies the resources, ML compute instances, and ML storage
       * volumes to deploy for a monitoring job. 
       * In distributed processing, you specify more than one instance.
       */
      public fun monitoringResources(monitoringResources: MonitoringResourcesProperty)

      /**
       * @param monitoringResources Identifies the resources, ML compute instances, and ML storage
       * volumes to deploy for a monitoring job. 
       * In distributed processing, you specify more than one instance.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8022d69c22dc6522ee8bdf8ab2a559c644a65bc1751c6bef76f1b088999f08ea")
      public
          fun monitoringResources(monitoringResources: MonitoringResourcesProperty.Builder.() -> Unit)

      /**
       * @param networkConfig Specifies networking options for an monitoring job.
       */
      public fun networkConfig(networkConfig: IResolvable)

      /**
       * @param networkConfig Specifies networking options for an monitoring job.
       */
      public fun networkConfig(networkConfig: NetworkConfigProperty)

      /**
       * @param networkConfig Specifies networking options for an monitoring job.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca1e58e1787bc2974f9606bd97a8f34e0a4a7e268cc75127d72db1c607ff1e5c")
      public fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can
       * assume to perform tasks on your behalf. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param stoppingCondition Specifies a time limit for how long the monitoring job is allowed
       * to run.
       */
      public fun stoppingCondition(stoppingCondition: IResolvable)

      /**
       * @param stoppingCondition Specifies a time limit for how long the monitoring job is allowed
       * to run.
       */
      public fun stoppingCondition(stoppingCondition: StoppingConditionProperty)

      /**
       * @param stoppingCondition Specifies a time limit for how long the monitoring job is allowed
       * to run.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb17ece77e3617d634427f12d51a676b359b03f74b1d2134d41d8f7f1c00f89d")
      public fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty.builder()

      /**
       * @param baselineConfig Baseline configuration used to validate that the data conforms to the
       * specified constraints and statistics.
       */
      override fun baselineConfig(baselineConfig: IResolvable) {
        cdkBuilder.baselineConfig(baselineConfig.let(IResolvable::unwrap))
      }

      /**
       * @param baselineConfig Baseline configuration used to validate that the data conforms to the
       * specified constraints and statistics.
       */
      override fun baselineConfig(baselineConfig: BaselineConfigProperty) {
        cdkBuilder.baselineConfig(baselineConfig.let(BaselineConfigProperty::unwrap))
      }

      /**
       * @param baselineConfig Baseline configuration used to validate that the data conforms to the
       * specified constraints and statistics.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b25d852cd5d3c2a37f56c5a52e7ca9a2a71206ade16624d6cc4a9b0beff29c31")
      override fun baselineConfig(baselineConfig: BaselineConfigProperty.Builder.() -> Unit): Unit =
          baselineConfig(BaselineConfigProperty(baselineConfig))

      /**
       * @param environment Sets the environment variables in the Docker container.
       */
      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      /**
       * @param environment Sets the environment variables in the Docker container.
       */
      override fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
      }

      /**
       * @param monitoringAppSpecification Configures the monitoring job to run a specified Docker
       * container image. 
       */
      override fun monitoringAppSpecification(monitoringAppSpecification: IResolvable) {
        cdkBuilder.monitoringAppSpecification(monitoringAppSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param monitoringAppSpecification Configures the monitoring job to run a specified Docker
       * container image. 
       */
      override
          fun monitoringAppSpecification(monitoringAppSpecification: MonitoringAppSpecificationProperty) {
        cdkBuilder.monitoringAppSpecification(monitoringAppSpecification.let(MonitoringAppSpecificationProperty::unwrap))
      }

      /**
       * @param monitoringAppSpecification Configures the monitoring job to run a specified Docker
       * container image. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1936482f308087d02f3cface6907e34a93dd1d32475dfba96e4eb0a6effe545")
      override
          fun monitoringAppSpecification(monitoringAppSpecification: MonitoringAppSpecificationProperty.Builder.() -> Unit):
          Unit =
          monitoringAppSpecification(MonitoringAppSpecificationProperty(monitoringAppSpecification))

      /**
       * @param monitoringInputs The array of inputs for the monitoring job. 
       * Currently we support monitoring an Amazon SageMaker Endpoint.
       */
      override fun monitoringInputs(monitoringInputs: IResolvable) {
        cdkBuilder.monitoringInputs(monitoringInputs.let(IResolvable::unwrap))
      }

      /**
       * @param monitoringInputs The array of inputs for the monitoring job. 
       * Currently we support monitoring an Amazon SageMaker Endpoint.
       */
      override fun monitoringInputs(monitoringInputs: List<Any>) {
        cdkBuilder.monitoringInputs(monitoringInputs)
      }

      /**
       * @param monitoringInputs The array of inputs for the monitoring job. 
       * Currently we support monitoring an Amazon SageMaker Endpoint.
       */
      override fun monitoringInputs(vararg monitoringInputs: Any): Unit =
          monitoringInputs(monitoringInputs.toList())

      /**
       * @param monitoringOutputConfig The array of outputs from the monitoring job to be uploaded
       * to Amazon S3. 
       */
      override fun monitoringOutputConfig(monitoringOutputConfig: IResolvable) {
        cdkBuilder.monitoringOutputConfig(monitoringOutputConfig.let(IResolvable::unwrap))
      }

      /**
       * @param monitoringOutputConfig The array of outputs from the monitoring job to be uploaded
       * to Amazon S3. 
       */
      override fun monitoringOutputConfig(monitoringOutputConfig: MonitoringOutputConfigProperty) {
        cdkBuilder.monitoringOutputConfig(monitoringOutputConfig.let(MonitoringOutputConfigProperty::unwrap))
      }

      /**
       * @param monitoringOutputConfig The array of outputs from the monitoring job to be uploaded
       * to Amazon S3. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5cfd4507a90781185c4942290f164ac1a2cb7d1f81c715151b4bfa5df11f00c")
      override
          fun monitoringOutputConfig(monitoringOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit):
          Unit = monitoringOutputConfig(MonitoringOutputConfigProperty(monitoringOutputConfig))

      /**
       * @param monitoringResources Identifies the resources, ML compute instances, and ML storage
       * volumes to deploy for a monitoring job. 
       * In distributed processing, you specify more than one instance.
       */
      override fun monitoringResources(monitoringResources: IResolvable) {
        cdkBuilder.monitoringResources(monitoringResources.let(IResolvable::unwrap))
      }

      /**
       * @param monitoringResources Identifies the resources, ML compute instances, and ML storage
       * volumes to deploy for a monitoring job. 
       * In distributed processing, you specify more than one instance.
       */
      override fun monitoringResources(monitoringResources: MonitoringResourcesProperty) {
        cdkBuilder.monitoringResources(monitoringResources.let(MonitoringResourcesProperty::unwrap))
      }

      /**
       * @param monitoringResources Identifies the resources, ML compute instances, and ML storage
       * volumes to deploy for a monitoring job. 
       * In distributed processing, you specify more than one instance.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8022d69c22dc6522ee8bdf8ab2a559c644a65bc1751c6bef76f1b088999f08ea")
      override
          fun monitoringResources(monitoringResources: MonitoringResourcesProperty.Builder.() -> Unit):
          Unit = monitoringResources(MonitoringResourcesProperty(monitoringResources))

      /**
       * @param networkConfig Specifies networking options for an monitoring job.
       */
      override fun networkConfig(networkConfig: IResolvable) {
        cdkBuilder.networkConfig(networkConfig.let(IResolvable::unwrap))
      }

      /**
       * @param networkConfig Specifies networking options for an monitoring job.
       */
      override fun networkConfig(networkConfig: NetworkConfigProperty) {
        cdkBuilder.networkConfig(networkConfig.let(NetworkConfigProperty::unwrap))
      }

      /**
       * @param networkConfig Specifies networking options for an monitoring job.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca1e58e1787bc2974f9606bd97a8f34e0a4a7e268cc75127d72db1c607ff1e5c")
      override fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit): Unit =
          networkConfig(NetworkConfigProperty(networkConfig))

      /**
       * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can
       * assume to perform tasks on your behalf. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param stoppingCondition Specifies a time limit for how long the monitoring job is allowed
       * to run.
       */
      override fun stoppingCondition(stoppingCondition: IResolvable) {
        cdkBuilder.stoppingCondition(stoppingCondition.let(IResolvable::unwrap))
      }

      /**
       * @param stoppingCondition Specifies a time limit for how long the monitoring job is allowed
       * to run.
       */
      override fun stoppingCondition(stoppingCondition: StoppingConditionProperty) {
        cdkBuilder.stoppingCondition(stoppingCondition.let(StoppingConditionProperty::unwrap))
      }

      /**
       * @param stoppingCondition Specifies a time limit for how long the monitoring job is allowed
       * to run.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb17ece77e3617d634427f12d51a676b359b03f74b1d2134d41d8f7f1c00f89d")
      override
          fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit):
          Unit = stoppingCondition(StoppingConditionProperty(stoppingCondition))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty,
    ) : CdkObject(cdkObject), MonitoringJobDefinitionProperty {
      /**
       * Baseline configuration used to validate that the data conforms to the specified constraints
       * and statistics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-baselineconfig)
       */
      override fun baselineConfig(): Any? = unwrap(this).getBaselineConfig()

      /**
       * Sets the environment variables in the Docker container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * Configures the monitoring job to run a specified Docker container image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-monitoringappspecification)
       */
      override fun monitoringAppSpecification(): Any = unwrap(this).getMonitoringAppSpecification()

      /**
       * The array of inputs for the monitoring job.
       *
       * Currently we support monitoring an Amazon SageMaker Endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-monitoringinputs)
       */
      override fun monitoringInputs(): Any = unwrap(this).getMonitoringInputs()

      /**
       * The array of outputs from the monitoring job to be uploaded to Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-monitoringoutputconfig)
       */
      override fun monitoringOutputConfig(): Any = unwrap(this).getMonitoringOutputConfig()

      /**
       * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a
       * monitoring job.
       *
       * In distributed processing, you specify more than one instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-monitoringresources)
       */
      override fun monitoringResources(): Any = unwrap(this).getMonitoringResources()

      /**
       * Specifies networking options for an monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-networkconfig)
       */
      override fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

      /**
       * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform
       * tasks on your behalf.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * Specifies a time limit for how long the monitoring job is allowed to run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html#cfn-sagemaker-monitoringschedule-monitoringjobdefinition-stoppingcondition)
       */
      override fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringJobDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty):
          MonitoringJobDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringJobDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty
    }
  }

  public interface MonitoringResourcesProperty {
    /**
     * The configuration for the cluster resources used to run the processing job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringresources.html#cfn-sagemaker-monitoringschedule-monitoringresources-clusterconfig)
     */
    public fun clusterConfig(): Any

    /**
     * A builder for [MonitoringResourcesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clusterConfig The configuration for the cluster resources used to run the processing
       * job. 
       */
      public fun clusterConfig(clusterConfig: IResolvable)

      /**
       * @param clusterConfig The configuration for the cluster resources used to run the processing
       * job. 
       */
      public fun clusterConfig(clusterConfig: ClusterConfigProperty)

      /**
       * @param clusterConfig The configuration for the cluster resources used to run the processing
       * job. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d2b692d1210ed45b37baed02724a97982292097ce28b4a791ca0767901a580d")
      public fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringResourcesProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringResourcesProperty.builder()

      /**
       * @param clusterConfig The configuration for the cluster resources used to run the processing
       * job. 
       */
      override fun clusterConfig(clusterConfig: IResolvable) {
        cdkBuilder.clusterConfig(clusterConfig.let(IResolvable::unwrap))
      }

      /**
       * @param clusterConfig The configuration for the cluster resources used to run the processing
       * job. 
       */
      override fun clusterConfig(clusterConfig: ClusterConfigProperty) {
        cdkBuilder.clusterConfig(clusterConfig.let(ClusterConfigProperty::unwrap))
      }

      /**
       * @param clusterConfig The configuration for the cluster resources used to run the processing
       * job. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d2b692d1210ed45b37baed02724a97982292097ce28b4a791ca0767901a580d")
      override fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit): Unit =
          clusterConfig(ClusterConfigProperty(clusterConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringResourcesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringResourcesProperty,
    ) : CdkObject(cdkObject), MonitoringResourcesProperty {
      /**
       * The configuration for the cluster resources used to run the processing job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringresources.html#cfn-sagemaker-monitoringschedule-monitoringresources-clusterconfig)
       */
      override fun clusterConfig(): Any = unwrap(this).getClusterConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringResourcesProperty):
          MonitoringResourcesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringResourcesProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringResourcesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringResourcesProperty
    }
  }

  public interface DatasetFormatProperty {
    /**
     * The CSV format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-datasetformat.html#cfn-sagemaker-monitoringschedule-datasetformat-csv)
     */
    public fun csv(): Any? = unwrap(this).getCsv()

    /**
     * The Json format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-datasetformat.html#cfn-sagemaker-monitoringschedule-datasetformat-json)
     */
    public fun json(): Any? = unwrap(this).getJson()

    /**
     * A flag indicating if the dataset format is Parquet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-datasetformat.html#cfn-sagemaker-monitoringschedule-datasetformat-parquet)
     */
    public fun parquet(): Any? = unwrap(this).getParquet()

    /**
     * A builder for [DatasetFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param csv The CSV format.
       */
      public fun csv(csv: IResolvable)

      /**
       * @param csv The CSV format.
       */
      public fun csv(csv: CsvProperty)

      /**
       * @param csv The CSV format.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("584118a065f1e778d9fc5d7875fbad8a47859971d25053a99db55e7f4427151f")
      public fun csv(csv: CsvProperty.Builder.() -> Unit)

      /**
       * @param json The Json format.
       */
      public fun json(json: IResolvable)

      /**
       * @param json The Json format.
       */
      public fun json(json: JsonProperty)

      /**
       * @param json The Json format.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27cbe0d83c6f9d282dc965ffde94c2e6a7426393149c5c419f22f80d47c0cbda")
      public fun json(json: JsonProperty.Builder.() -> Unit)

      /**
       * @param parquet A flag indicating if the dataset format is Parquet.
       */
      public fun parquet(parquet: Boolean)

      /**
       * @param parquet A flag indicating if the dataset format is Parquet.
       */
      public fun parquet(parquet: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.DatasetFormatProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.DatasetFormatProperty.builder()

      /**
       * @param csv The CSV format.
       */
      override fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv.let(IResolvable::unwrap))
      }

      /**
       * @param csv The CSV format.
       */
      override fun csv(csv: CsvProperty) {
        cdkBuilder.csv(csv.let(CsvProperty::unwrap))
      }

      /**
       * @param csv The CSV format.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("584118a065f1e778d9fc5d7875fbad8a47859971d25053a99db55e7f4427151f")
      override fun csv(csv: CsvProperty.Builder.() -> Unit): Unit = csv(CsvProperty(csv))

      /**
       * @param json The Json format.
       */
      override fun json(json: IResolvable) {
        cdkBuilder.json(json.let(IResolvable::unwrap))
      }

      /**
       * @param json The Json format.
       */
      override fun json(json: JsonProperty) {
        cdkBuilder.json(json.let(JsonProperty::unwrap))
      }

      /**
       * @param json The Json format.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27cbe0d83c6f9d282dc965ffde94c2e6a7426393149c5c419f22f80d47c0cbda")
      override fun json(json: JsonProperty.Builder.() -> Unit): Unit = json(JsonProperty(json))

      /**
       * @param parquet A flag indicating if the dataset format is Parquet.
       */
      override fun parquet(parquet: Boolean) {
        cdkBuilder.parquet(parquet)
      }

      /**
       * @param parquet A flag indicating if the dataset format is Parquet.
       */
      override fun parquet(parquet: IResolvable) {
        cdkBuilder.parquet(parquet.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.DatasetFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.DatasetFormatProperty,
    ) : CdkObject(cdkObject), DatasetFormatProperty {
      /**
       * The CSV format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-datasetformat.html#cfn-sagemaker-monitoringschedule-datasetformat-csv)
       */
      override fun csv(): Any? = unwrap(this).getCsv()

      /**
       * The Json format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-datasetformat.html#cfn-sagemaker-monitoringschedule-datasetformat-json)
       */
      override fun json(): Any? = unwrap(this).getJson()

      /**
       * A flag indicating if the dataset format is Parquet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-datasetformat.html#cfn-sagemaker-monitoringschedule-datasetformat-parquet)
       */
      override fun parquet(): Any? = unwrap(this).getParquet()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.DatasetFormatProperty):
          DatasetFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetFormatProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.DatasetFormatProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.DatasetFormatProperty
    }
  }

  public interface ClusterConfigProperty {
    /**
     * The number of ML compute instances to use in the model monitoring job.
     *
     * For distributed processing jobs, specify a value greater than 1. The default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-clusterconfig.html#cfn-sagemaker-monitoringschedule-clusterconfig-instancecount)
     */
    public fun instanceCount(): Number

    /**
     * The ML compute instance type for the processing job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-clusterconfig.html#cfn-sagemaker-monitoringschedule-clusterconfig-instancetype)
     */
    public fun instanceType(): String

    /**
     * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt data on
     * the storage volume attached to the ML compute instance(s) that run the model monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-clusterconfig.html#cfn-sagemaker-monitoringschedule-clusterconfig-volumekmskeyid)
     */
    public fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

    /**
     * The size of the ML storage volume, in gigabytes, that you want to provision.
     *
     * You must specify sufficient ML storage for your scenario.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-clusterconfig.html#cfn-sagemaker-monitoringschedule-clusterconfig-volumesizeingb)
     */
    public fun volumeSizeInGb(): Number

    /**
     * A builder for [ClusterConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceCount The number of ML compute instances to use in the model monitoring job.
       * 
       * For distributed processing jobs, specify a value greater than 1. The default value is 1.
       */
      public fun instanceCount(instanceCount: Number)

      /**
       * @param instanceType The ML compute instance type for the processing job. 
       */
      public fun instanceType(instanceType: String)

      /**
       * @param volumeKmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker
       * uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the
       * model monitoring job.
       */
      public fun volumeKmsKeyId(volumeKmsKeyId: String)

      /**
       * @param volumeSizeInGb The size of the ML storage volume, in gigabytes, that you want to
       * provision. 
       * You must specify sufficient ML storage for your scenario.
       */
      public fun volumeSizeInGb(volumeSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ClusterConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ClusterConfigProperty.builder()

      /**
       * @param instanceCount The number of ML compute instances to use in the model monitoring job.
       * 
       * For distributed processing jobs, specify a value greater than 1. The default value is 1.
       */
      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      /**
       * @param instanceType The ML compute instance type for the processing job. 
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param volumeKmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker
       * uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the
       * model monitoring job.
       */
      override fun volumeKmsKeyId(volumeKmsKeyId: String) {
        cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
      }

      /**
       * @param volumeSizeInGb The size of the ML storage volume, in gigabytes, that you want to
       * provision. 
       * You must specify sufficient ML storage for your scenario.
       */
      override fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ClusterConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ClusterConfigProperty,
    ) : CdkObject(cdkObject), ClusterConfigProperty {
      /**
       * The number of ML compute instances to use in the model monitoring job.
       *
       * For distributed processing jobs, specify a value greater than 1. The default value is 1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-clusterconfig.html#cfn-sagemaker-monitoringschedule-clusterconfig-instancecount)
       */
      override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      /**
       * The ML compute instance type for the processing job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-clusterconfig.html#cfn-sagemaker-monitoringschedule-clusterconfig-instancetype)
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()

      /**
       * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt data on
       * the storage volume attached to the ML compute instance(s) that run the model monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-clusterconfig.html#cfn-sagemaker-monitoringschedule-clusterconfig-volumekmskeyid)
       */
      override fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

      /**
       * The size of the ML storage volume, in gigabytes, that you want to provision.
       *
       * You must specify sufficient ML storage for your scenario.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-clusterconfig.html#cfn-sagemaker-monitoringschedule-clusterconfig-volumesizeingb)
       */
      override fun volumeSizeInGb(): Number = unwrap(this).getVolumeSizeInGb()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ClusterConfigProperty):
          ClusterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ClusterConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ClusterConfigProperty
    }
  }

  public interface StatisticsResourceProperty {
    /**
     * The S3 URI for the statistics resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-statisticsresource.html#cfn-sagemaker-monitoringschedule-statisticsresource-s3uri)
     */
    public fun s3Uri(): String? = unwrap(this).getS3Uri()

    /**
     * A builder for [StatisticsResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Uri The S3 URI for the statistics resource.
       */
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StatisticsResourceProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StatisticsResourceProperty.builder()

      /**
       * @param s3Uri The S3 URI for the statistics resource.
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StatisticsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StatisticsResourceProperty,
    ) : CdkObject(cdkObject), StatisticsResourceProperty {
      /**
       * The S3 URI for the statistics resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-statisticsresource.html#cfn-sagemaker-monitoringschedule-statisticsresource-s3uri)
       */
      override fun s3Uri(): String? = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StatisticsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StatisticsResourceProperty):
          StatisticsResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatisticsResourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StatisticsResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StatisticsResourceProperty
    }
  }

  public interface ScheduleConfigProperty {
    /**
     * Sets the end time for a monitoring job window.
     *
     * Express this time as an offset to the times that you schedule your monitoring jobs to run.
     * You schedule monitoring jobs with the `ScheduleExpression` parameter. Specify this offset in ISO
     * 8601 duration format. For example, if you want to end the window one hour before the start of
     * each monitoring job, you would specify: `"-PT1H"` .
     *
     * The end time that you specify must not follow the start time that you specify by more than 24
     * hours. You specify the start time with the `DataAnalysisStartTime` parameter.
     *
     * If you set `ScheduleExpression` to `NOW` , this parameter is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-scheduleconfig.html#cfn-sagemaker-monitoringschedule-scheduleconfig-dataanalysisendtime)
     */
    public fun dataAnalysisEndTime(): String? = unwrap(this).getDataAnalysisEndTime()

    /**
     * Sets the start time for a monitoring job window.
     *
     * Express this time as an offset to the times that you schedule your monitoring jobs to run.
     * You schedule monitoring jobs with the `ScheduleExpression` parameter. Specify this offset in ISO
     * 8601 duration format. For example, if you want to monitor the five hours of data in your dataset
     * that precede the start of each monitoring job, you would specify: `"-PT5H"` .
     *
     * The start time that you specify must not precede the end time that you specify by more than
     * 24 hours. You specify the end time with the `DataAnalysisEndTime` parameter.
     *
     * If you set `ScheduleExpression` to `NOW` , this parameter is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-scheduleconfig.html#cfn-sagemaker-monitoringschedule-scheduleconfig-dataanalysisstarttime)
     */
    public fun dataAnalysisStartTime(): String? = unwrap(this).getDataAnalysisStartTime()

    /**
     * A cron expression that describes details about the monitoring schedule.
     *
     * The supported cron expressions are:
     *
     * * If you want to set the job to start every hour, use the following:
     *
     * `Hourly: cron(0 * ? * * *)`
     *
     * * If you want to start the job daily:
     *
     * `cron(0 [00-23] ? * * *)`
     *
     * * If you want to run the job one time, immediately, use the following keyword:
     *
     * `NOW`
     *
     * For example, the following are valid cron expressions:
     *
     * * Daily at noon UTC: `cron(0 12 ? * * *)`
     * * Daily at midnight UTC: `cron(0 0 ? * * *)`
     *
     * To support running every 6, 12 hours, the following are also supported:
     *
     * `cron(0 [00-23]/[01-24] ? * * *)`
     *
     * For example, the following are valid cron expressions:
     *
     * * Every 12 hours, starting at 5pm UTC: `cron(0 17/12 ? * * *)`
     * * Every two hours starting at midnight: `cron(0 0/2 ? * * *)`
     *
     *
     * * Even though the cron expression is set to start at 5PM UTC, note that there could be a
     * delay of 0-20 minutes from the actual requested time to run the execution.
     * * We recommend that if you would like a daily schedule, you do not provide this parameter.
     * Amazon SageMaker will pick a time for running every day.
     *
     *
     * You can also specify the keyword `NOW` to run the monitoring job immediately, one time,
     * without recurring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-scheduleconfig.html#cfn-sagemaker-monitoringschedule-scheduleconfig-scheduleexpression)
     */
    public fun scheduleExpression(): String

    /**
     * A builder for [ScheduleConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataAnalysisEndTime Sets the end time for a monitoring job window.
       * Express this time as an offset to the times that you schedule your monitoring jobs to run.
       * You schedule monitoring jobs with the `ScheduleExpression` parameter. Specify this offset in
       * ISO 8601 duration format. For example, if you want to end the window one hour before the start
       * of each monitoring job, you would specify: `"-PT1H"` .
       *
       * The end time that you specify must not follow the start time that you specify by more than
       * 24 hours. You specify the start time with the `DataAnalysisStartTime` parameter.
       *
       * If you set `ScheduleExpression` to `NOW` , this parameter is required.
       */
      public fun dataAnalysisEndTime(dataAnalysisEndTime: String)

      /**
       * @param dataAnalysisStartTime Sets the start time for a monitoring job window.
       * Express this time as an offset to the times that you schedule your monitoring jobs to run.
       * You schedule monitoring jobs with the `ScheduleExpression` parameter. Specify this offset in
       * ISO 8601 duration format. For example, if you want to monitor the five hours of data in your
       * dataset that precede the start of each monitoring job, you would specify: `"-PT5H"` .
       *
       * The start time that you specify must not precede the end time that you specify by more than
       * 24 hours. You specify the end time with the `DataAnalysisEndTime` parameter.
       *
       * If you set `ScheduleExpression` to `NOW` , this parameter is required.
       */
      public fun dataAnalysisStartTime(dataAnalysisStartTime: String)

      /**
       * @param scheduleExpression A cron expression that describes details about the monitoring
       * schedule. 
       * The supported cron expressions are:
       *
       * * If you want to set the job to start every hour, use the following:
       *
       * `Hourly: cron(0 * ? * * *)`
       *
       * * If you want to start the job daily:
       *
       * `cron(0 [00-23] ? * * *)`
       *
       * * If you want to run the job one time, immediately, use the following keyword:
       *
       * `NOW`
       *
       * For example, the following are valid cron expressions:
       *
       * * Daily at noon UTC: `cron(0 12 ? * * *)`
       * * Daily at midnight UTC: `cron(0 0 ? * * *)`
       *
       * To support running every 6, 12 hours, the following are also supported:
       *
       * `cron(0 [00-23]/[01-24] ? * * *)`
       *
       * For example, the following are valid cron expressions:
       *
       * * Every 12 hours, starting at 5pm UTC: `cron(0 17/12 ? * * *)`
       * * Every two hours starting at midnight: `cron(0 0/2 ? * * *)`
       *
       *
       * * Even though the cron expression is set to start at 5PM UTC, note that there could be a
       * delay of 0-20 minutes from the actual requested time to run the execution.
       * * We recommend that if you would like a daily schedule, you do not provide this parameter.
       * Amazon SageMaker will pick a time for running every day.
       *
       *
       * You can also specify the keyword `NOW` to run the monitoring job immediately, one time,
       * without recurring.
       */
      public fun scheduleExpression(scheduleExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty.builder()

      /**
       * @param dataAnalysisEndTime Sets the end time for a monitoring job window.
       * Express this time as an offset to the times that you schedule your monitoring jobs to run.
       * You schedule monitoring jobs with the `ScheduleExpression` parameter. Specify this offset in
       * ISO 8601 duration format. For example, if you want to end the window one hour before the start
       * of each monitoring job, you would specify: `"-PT1H"` .
       *
       * The end time that you specify must not follow the start time that you specify by more than
       * 24 hours. You specify the start time with the `DataAnalysisStartTime` parameter.
       *
       * If you set `ScheduleExpression` to `NOW` , this parameter is required.
       */
      override fun dataAnalysisEndTime(dataAnalysisEndTime: String) {
        cdkBuilder.dataAnalysisEndTime(dataAnalysisEndTime)
      }

      /**
       * @param dataAnalysisStartTime Sets the start time for a monitoring job window.
       * Express this time as an offset to the times that you schedule your monitoring jobs to run.
       * You schedule monitoring jobs with the `ScheduleExpression` parameter. Specify this offset in
       * ISO 8601 duration format. For example, if you want to monitor the five hours of data in your
       * dataset that precede the start of each monitoring job, you would specify: `"-PT5H"` .
       *
       * The start time that you specify must not precede the end time that you specify by more than
       * 24 hours. You specify the end time with the `DataAnalysisEndTime` parameter.
       *
       * If you set `ScheduleExpression` to `NOW` , this parameter is required.
       */
      override fun dataAnalysisStartTime(dataAnalysisStartTime: String) {
        cdkBuilder.dataAnalysisStartTime(dataAnalysisStartTime)
      }

      /**
       * @param scheduleExpression A cron expression that describes details about the monitoring
       * schedule. 
       * The supported cron expressions are:
       *
       * * If you want to set the job to start every hour, use the following:
       *
       * `Hourly: cron(0 * ? * * *)`
       *
       * * If you want to start the job daily:
       *
       * `cron(0 [00-23] ? * * *)`
       *
       * * If you want to run the job one time, immediately, use the following keyword:
       *
       * `NOW`
       *
       * For example, the following are valid cron expressions:
       *
       * * Daily at noon UTC: `cron(0 12 ? * * *)`
       * * Daily at midnight UTC: `cron(0 0 ? * * *)`
       *
       * To support running every 6, 12 hours, the following are also supported:
       *
       * `cron(0 [00-23]/[01-24] ? * * *)`
       *
       * For example, the following are valid cron expressions:
       *
       * * Every 12 hours, starting at 5pm UTC: `cron(0 17/12 ? * * *)`
       * * Every two hours starting at midnight: `cron(0 0/2 ? * * *)`
       *
       *
       * * Even though the cron expression is set to start at 5PM UTC, note that there could be a
       * delay of 0-20 minutes from the actual requested time to run the execution.
       * * We recommend that if you would like a daily schedule, you do not provide this parameter.
       * Amazon SageMaker will pick a time for running every day.
       *
       *
       * You can also specify the keyword `NOW` to run the monitoring job immediately, one time,
       * without recurring.
       */
      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty,
    ) : CdkObject(cdkObject), ScheduleConfigProperty {
      /**
       * Sets the end time for a monitoring job window.
       *
       * Express this time as an offset to the times that you schedule your monitoring jobs to run.
       * You schedule monitoring jobs with the `ScheduleExpression` parameter. Specify this offset in
       * ISO 8601 duration format. For example, if you want to end the window one hour before the start
       * of each monitoring job, you would specify: `"-PT1H"` .
       *
       * The end time that you specify must not follow the start time that you specify by more than
       * 24 hours. You specify the start time with the `DataAnalysisStartTime` parameter.
       *
       * If you set `ScheduleExpression` to `NOW` , this parameter is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-scheduleconfig.html#cfn-sagemaker-monitoringschedule-scheduleconfig-dataanalysisendtime)
       */
      override fun dataAnalysisEndTime(): String? = unwrap(this).getDataAnalysisEndTime()

      /**
       * Sets the start time for a monitoring job window.
       *
       * Express this time as an offset to the times that you schedule your monitoring jobs to run.
       * You schedule monitoring jobs with the `ScheduleExpression` parameter. Specify this offset in
       * ISO 8601 duration format. For example, if you want to monitor the five hours of data in your
       * dataset that precede the start of each monitoring job, you would specify: `"-PT5H"` .
       *
       * The start time that you specify must not precede the end time that you specify by more than
       * 24 hours. You specify the end time with the `DataAnalysisEndTime` parameter.
       *
       * If you set `ScheduleExpression` to `NOW` , this parameter is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-scheduleconfig.html#cfn-sagemaker-monitoringschedule-scheduleconfig-dataanalysisstarttime)
       */
      override fun dataAnalysisStartTime(): String? = unwrap(this).getDataAnalysisStartTime()

      /**
       * A cron expression that describes details about the monitoring schedule.
       *
       * The supported cron expressions are:
       *
       * * If you want to set the job to start every hour, use the following:
       *
       * `Hourly: cron(0 * ? * * *)`
       *
       * * If you want to start the job daily:
       *
       * `cron(0 [00-23] ? * * *)`
       *
       * * If you want to run the job one time, immediately, use the following keyword:
       *
       * `NOW`
       *
       * For example, the following are valid cron expressions:
       *
       * * Daily at noon UTC: `cron(0 12 ? * * *)`
       * * Daily at midnight UTC: `cron(0 0 ? * * *)`
       *
       * To support running every 6, 12 hours, the following are also supported:
       *
       * `cron(0 [00-23]/[01-24] ? * * *)`
       *
       * For example, the following are valid cron expressions:
       *
       * * Every 12 hours, starting at 5pm UTC: `cron(0 17/12 ? * * *)`
       * * Every two hours starting at midnight: `cron(0 0/2 ? * * *)`
       *
       *
       * * Even though the cron expression is set to start at 5PM UTC, note that there could be a
       * delay of 0-20 minutes from the actual requested time to run the execution.
       * * We recommend that if you would like a daily schedule, you do not provide this parameter.
       * Amazon SageMaker will pick a time for running every day.
       *
       *
       * You can also specify the keyword `NOW` to run the monitoring job immediately, one time,
       * without recurring.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-scheduleconfig.html#cfn-sagemaker-monitoringschedule-scheduleconfig-scheduleexpression)
       */
      override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty):
          ScheduleConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty
    }
  }

  public interface S3OutputProperty {
    /**
     * The local path to the S3 storage location where SageMaker saves the results of a monitoring
     * job.
     *
     * LocalPath is an absolute path for the output data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-s3output.html#cfn-sagemaker-monitoringschedule-s3output-localpath)
     */
    public fun localPath(): String

    /**
     * Whether to upload the results of the monitoring job continuously or after the job completes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-s3output.html#cfn-sagemaker-monitoringschedule-s3output-s3uploadmode)
     */
    public fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

    /**
     * A URI that identifies the S3 storage location where SageMaker saves the results of a
     * monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-s3output.html#cfn-sagemaker-monitoringschedule-s3output-s3uri)
     */
    public fun s3Uri(): String

    /**
     * A builder for [S3OutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param localPath The local path to the S3 storage location where SageMaker saves the
       * results of a monitoring job. 
       * LocalPath is an absolute path for the output data.
       */
      public fun localPath(localPath: String)

      /**
       * @param s3UploadMode Whether to upload the results of the monitoring job continuously or
       * after the job completes.
       */
      public fun s3UploadMode(s3UploadMode: String)

      /**
       * @param s3Uri A URI that identifies the S3 storage location where SageMaker saves the
       * results of a monitoring job. 
       */
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.S3OutputProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.S3OutputProperty.builder()

      /**
       * @param localPath The local path to the S3 storage location where SageMaker saves the
       * results of a monitoring job. 
       * LocalPath is an absolute path for the output data.
       */
      override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      /**
       * @param s3UploadMode Whether to upload the results of the monitoring job continuously or
       * after the job completes.
       */
      override fun s3UploadMode(s3UploadMode: String) {
        cdkBuilder.s3UploadMode(s3UploadMode)
      }

      /**
       * @param s3Uri A URI that identifies the S3 storage location where SageMaker saves the
       * results of a monitoring job. 
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.S3OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.S3OutputProperty,
    ) : CdkObject(cdkObject), S3OutputProperty {
      /**
       * The local path to the S3 storage location where SageMaker saves the results of a monitoring
       * job.
       *
       * LocalPath is an absolute path for the output data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-s3output.html#cfn-sagemaker-monitoringschedule-s3output-localpath)
       */
      override fun localPath(): String = unwrap(this).getLocalPath()

      /**
       * Whether to upload the results of the monitoring job continuously or after the job
       * completes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-s3output.html#cfn-sagemaker-monitoringschedule-s3output-s3uploadmode)
       */
      override fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

      /**
       * A URI that identifies the S3 storage location where SageMaker saves the results of a
       * monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-s3output.html#cfn-sagemaker-monitoringschedule-s3output-s3uri)
       */
      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.S3OutputProperty):
          S3OutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.S3OutputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.S3OutputProperty
    }
  }

  public interface BaselineConfigProperty {
    /**
     * The Amazon S3 URI for the constraints resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-baselineconfig.html#cfn-sagemaker-monitoringschedule-baselineconfig-constraintsresource)
     */
    public fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()

    /**
     * The baseline statistics file in Amazon S3 that the current monitoring job should be validated
     * against.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-baselineconfig.html#cfn-sagemaker-monitoringschedule-baselineconfig-statisticsresource)
     */
    public fun statisticsResource(): Any? = unwrap(this).getStatisticsResource()

    /**
     * A builder for [BaselineConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constraintsResource The Amazon S3 URI for the constraints resource.
       */
      public fun constraintsResource(constraintsResource: IResolvable)

      /**
       * @param constraintsResource The Amazon S3 URI for the constraints resource.
       */
      public fun constraintsResource(constraintsResource: ConstraintsResourceProperty)

      /**
       * @param constraintsResource The Amazon S3 URI for the constraints resource.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60a9519e03630673bb7da9627f7020656378dfcca99f79101f445540f36e8101")
      public
          fun constraintsResource(constraintsResource: ConstraintsResourceProperty.Builder.() -> Unit)

      /**
       * @param statisticsResource The baseline statistics file in Amazon S3 that the current
       * monitoring job should be validated against.
       */
      public fun statisticsResource(statisticsResource: IResolvable)

      /**
       * @param statisticsResource The baseline statistics file in Amazon S3 that the current
       * monitoring job should be validated against.
       */
      public fun statisticsResource(statisticsResource: StatisticsResourceProperty)

      /**
       * @param statisticsResource The baseline statistics file in Amazon S3 that the current
       * monitoring job should be validated against.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92d3382c0ab7be9dec1b304b69e9f65d03676c7c3db097baeb527474f5116586")
      public
          fun statisticsResource(statisticsResource: StatisticsResourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty.builder()

      /**
       * @param constraintsResource The Amazon S3 URI for the constraints resource.
       */
      override fun constraintsResource(constraintsResource: IResolvable) {
        cdkBuilder.constraintsResource(constraintsResource.let(IResolvable::unwrap))
      }

      /**
       * @param constraintsResource The Amazon S3 URI for the constraints resource.
       */
      override fun constraintsResource(constraintsResource: ConstraintsResourceProperty) {
        cdkBuilder.constraintsResource(constraintsResource.let(ConstraintsResourceProperty::unwrap))
      }

      /**
       * @param constraintsResource The Amazon S3 URI for the constraints resource.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60a9519e03630673bb7da9627f7020656378dfcca99f79101f445540f36e8101")
      override
          fun constraintsResource(constraintsResource: ConstraintsResourceProperty.Builder.() -> Unit):
          Unit = constraintsResource(ConstraintsResourceProperty(constraintsResource))

      /**
       * @param statisticsResource The baseline statistics file in Amazon S3 that the current
       * monitoring job should be validated against.
       */
      override fun statisticsResource(statisticsResource: IResolvable) {
        cdkBuilder.statisticsResource(statisticsResource.let(IResolvable::unwrap))
      }

      /**
       * @param statisticsResource The baseline statistics file in Amazon S3 that the current
       * monitoring job should be validated against.
       */
      override fun statisticsResource(statisticsResource: StatisticsResourceProperty) {
        cdkBuilder.statisticsResource(statisticsResource.let(StatisticsResourceProperty::unwrap))
      }

      /**
       * @param statisticsResource The baseline statistics file in Amazon S3 that the current
       * monitoring job should be validated against.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92d3382c0ab7be9dec1b304b69e9f65d03676c7c3db097baeb527474f5116586")
      override
          fun statisticsResource(statisticsResource: StatisticsResourceProperty.Builder.() -> Unit):
          Unit = statisticsResource(StatisticsResourceProperty(statisticsResource))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty,
    ) : CdkObject(cdkObject), BaselineConfigProperty {
      /**
       * The Amazon S3 URI for the constraints resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-baselineconfig.html#cfn-sagemaker-monitoringschedule-baselineconfig-constraintsresource)
       */
      override fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()

      /**
       * The baseline statistics file in Amazon S3 that the current monitoring job should be
       * validated against.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-baselineconfig.html#cfn-sagemaker-monitoringschedule-baselineconfig-statisticsresource)
       */
      override fun statisticsResource(): Any? = unwrap(this).getStatisticsResource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BaselineConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty):
          BaselineConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BaselineConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty
    }
  }

  public interface MonitoringScheduleConfigProperty {
    /**
     * Defines the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringscheduleconfig.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig-monitoringjobdefinition)
     */
    public fun monitoringJobDefinition(): Any? = unwrap(this).getMonitoringJobDefinition()

    /**
     * The name of the monitoring job definition to schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringscheduleconfig.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig-monitoringjobdefinitionname)
     */
    public fun monitoringJobDefinitionName(): String? =
        unwrap(this).getMonitoringJobDefinitionName()

    /**
     * The type of the monitoring job definition to schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringscheduleconfig.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig-monitoringtype)
     */
    public fun monitoringType(): String? = unwrap(this).getMonitoringType()

    /**
     * Configures the monitoring schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringscheduleconfig.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig-scheduleconfig)
     */
    public fun scheduleConfig(): Any? = unwrap(this).getScheduleConfig()

    /**
     * A builder for [MonitoringScheduleConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param monitoringJobDefinition Defines the monitoring job.
       */
      public fun monitoringJobDefinition(monitoringJobDefinition: IResolvable)

      /**
       * @param monitoringJobDefinition Defines the monitoring job.
       */
      public fun monitoringJobDefinition(monitoringJobDefinition: MonitoringJobDefinitionProperty)

      /**
       * @param monitoringJobDefinition Defines the monitoring job.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fda202f7b69d1cb776bb4b7cf269807da2d45327687f5e6ed6c4d3ac077147e")
      public
          fun monitoringJobDefinition(monitoringJobDefinition: MonitoringJobDefinitionProperty.Builder.() -> Unit)

      /**
       * @param monitoringJobDefinitionName The name of the monitoring job definition to schedule.
       */
      public fun monitoringJobDefinitionName(monitoringJobDefinitionName: String)

      /**
       * @param monitoringType The type of the monitoring job definition to schedule.
       */
      public fun monitoringType(monitoringType: String)

      /**
       * @param scheduleConfig Configures the monitoring schedule.
       */
      public fun scheduleConfig(scheduleConfig: IResolvable)

      /**
       * @param scheduleConfig Configures the monitoring schedule.
       */
      public fun scheduleConfig(scheduleConfig: ScheduleConfigProperty)

      /**
       * @param scheduleConfig Configures the monitoring schedule.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4171e772520d95691b15ef908333ba913df631dbe57a741ae90235c7af47092")
      public fun scheduleConfig(scheduleConfig: ScheduleConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty.builder()

      /**
       * @param monitoringJobDefinition Defines the monitoring job.
       */
      override fun monitoringJobDefinition(monitoringJobDefinition: IResolvable) {
        cdkBuilder.monitoringJobDefinition(monitoringJobDefinition.let(IResolvable::unwrap))
      }

      /**
       * @param monitoringJobDefinition Defines the monitoring job.
       */
      override
          fun monitoringJobDefinition(monitoringJobDefinition: MonitoringJobDefinitionProperty) {
        cdkBuilder.monitoringJobDefinition(monitoringJobDefinition.let(MonitoringJobDefinitionProperty::unwrap))
      }

      /**
       * @param monitoringJobDefinition Defines the monitoring job.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fda202f7b69d1cb776bb4b7cf269807da2d45327687f5e6ed6c4d3ac077147e")
      override
          fun monitoringJobDefinition(monitoringJobDefinition: MonitoringJobDefinitionProperty.Builder.() -> Unit):
          Unit = monitoringJobDefinition(MonitoringJobDefinitionProperty(monitoringJobDefinition))

      /**
       * @param monitoringJobDefinitionName The name of the monitoring job definition to schedule.
       */
      override fun monitoringJobDefinitionName(monitoringJobDefinitionName: String) {
        cdkBuilder.monitoringJobDefinitionName(monitoringJobDefinitionName)
      }

      /**
       * @param monitoringType The type of the monitoring job definition to schedule.
       */
      override fun monitoringType(monitoringType: String) {
        cdkBuilder.monitoringType(monitoringType)
      }

      /**
       * @param scheduleConfig Configures the monitoring schedule.
       */
      override fun scheduleConfig(scheduleConfig: IResolvable) {
        cdkBuilder.scheduleConfig(scheduleConfig.let(IResolvable::unwrap))
      }

      /**
       * @param scheduleConfig Configures the monitoring schedule.
       */
      override fun scheduleConfig(scheduleConfig: ScheduleConfigProperty) {
        cdkBuilder.scheduleConfig(scheduleConfig.let(ScheduleConfigProperty::unwrap))
      }

      /**
       * @param scheduleConfig Configures the monitoring schedule.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4171e772520d95691b15ef908333ba913df631dbe57a741ae90235c7af47092")
      override fun scheduleConfig(scheduleConfig: ScheduleConfigProperty.Builder.() -> Unit): Unit =
          scheduleConfig(ScheduleConfigProperty(scheduleConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty,
    ) : CdkObject(cdkObject), MonitoringScheduleConfigProperty {
      /**
       * Defines the monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringscheduleconfig.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig-monitoringjobdefinition)
       */
      override fun monitoringJobDefinition(): Any? = unwrap(this).getMonitoringJobDefinition()

      /**
       * The name of the monitoring job definition to schedule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringscheduleconfig.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig-monitoringjobdefinitionname)
       */
      override fun monitoringJobDefinitionName(): String? =
          unwrap(this).getMonitoringJobDefinitionName()

      /**
       * The type of the monitoring job definition to schedule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringscheduleconfig.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig-monitoringtype)
       */
      override fun monitoringType(): String? = unwrap(this).getMonitoringType()

      /**
       * Configures the monitoring schedule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringscheduleconfig.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig-scheduleconfig)
       */
      override fun scheduleConfig(): Any? = unwrap(this).getScheduleConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringScheduleConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty):
          MonitoringScheduleConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringScheduleConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty
    }
  }

  public interface NetworkConfigProperty {
    /**
     * Whether to encrypt all communications between distributed processing jobs.
     *
     * Choose `True` to encrypt communications. Encryption provides greater security for distributed
     * processing jobs, but the processing might take longer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-networkconfig.html#cfn-sagemaker-monitoringschedule-networkconfig-enableintercontainertrafficencryption)
     */
    public fun enableInterContainerTrafficEncryption(): Any? =
        unwrap(this).getEnableInterContainerTrafficEncryption()

    /**
     * Whether to allow inbound and outbound network calls to and from the containers used for the
     * processing job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-networkconfig.html#cfn-sagemaker-monitoringschedule-networkconfig-enablenetworkisolation)
     */
    public fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

    /**
     * Specifies a VPC that your training jobs and hosted models have access to.
     *
     * Control access to and from your training and model containers by configuring the VPC. For
     * more information, see [Protect Endpoints by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Training Jobs
     * by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-networkconfig.html#cfn-sagemaker-monitoringschedule-networkconfig-vpcconfig)
     */
    public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

    /**
     * A builder for [NetworkConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableInterContainerTrafficEncryption Whether to encrypt all communications between
       * distributed processing jobs.
       * Choose `True` to encrypt communications. Encryption provides greater security for
       * distributed processing jobs, but the processing might take longer.
       */
      public
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean)

      /**
       * @param enableInterContainerTrafficEncryption Whether to encrypt all communications between
       * distributed processing jobs.
       * Choose `True` to encrypt communications. Encryption provides greater security for
       * distributed processing jobs, but the processing might take longer.
       */
      public
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable)

      /**
       * @param enableNetworkIsolation Whether to allow inbound and outbound network calls to and
       * from the containers used for the processing job.
       */
      public fun enableNetworkIsolation(enableNetworkIsolation: Boolean)

      /**
       * @param enableNetworkIsolation Whether to allow inbound and outbound network calls to and
       * from the containers used for the processing job.
       */
      public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable)

      /**
       * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
       * Control access to and from your training and model containers by configuring the VPC. For
       * more information, see [Protect Endpoints by Using an Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Training
       * Jobs by Using an Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html) .
       */
      public fun vpcConfig(vpcConfig: IResolvable)

      /**
       * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
       * Control access to and from your training and model containers by configuring the VPC. For
       * more information, see [Protect Endpoints by Using an Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Training
       * Jobs by Using an Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html) .
       */
      public fun vpcConfig(vpcConfig: VpcConfigProperty)

      /**
       * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
       * Control access to and from your training and model containers by configuring the VPC. For
       * more information, see [Protect Endpoints by Using an Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Training
       * Jobs by Using an Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html) .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2e7276d2564e95ade14267cdcbe03b97ea04d75d2704e5547106562dd53be4f")
      public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty.builder()

      /**
       * @param enableInterContainerTrafficEncryption Whether to encrypt all communications between
       * distributed processing jobs.
       * Choose `True` to encrypt communications. Encryption provides greater security for
       * distributed processing jobs, but the processing might take longer.
       */
      override
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean) {
        cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption)
      }

      /**
       * @param enableInterContainerTrafficEncryption Whether to encrypt all communications between
       * distributed processing jobs.
       * Choose `True` to encrypt communications. Encryption provides greater security for
       * distributed processing jobs, but the processing might take longer.
       */
      override
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable) {
        cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption.let(IResolvable::unwrap))
      }

      /**
       * @param enableNetworkIsolation Whether to allow inbound and outbound network calls to and
       * from the containers used for the processing job.
       */
      override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
      }

      /**
       * @param enableNetworkIsolation Whether to allow inbound and outbound network calls to and
       * from the containers used for the processing job.
       */
      override fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
       * Control access to and from your training and model containers by configuring the VPC. For
       * more information, see [Protect Endpoints by Using an Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Training
       * Jobs by Using an Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html) .
       */
      override fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
       * Control access to and from your training and model containers by configuring the VPC. For
       * more information, see [Protect Endpoints by Using an Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Training
       * Jobs by Using an Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html) .
       */
      override fun vpcConfig(vpcConfig: VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
      }

      /**
       * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
       * Control access to and from your training and model containers by configuring the VPC. For
       * more information, see [Protect Endpoints by Using an Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Training
       * Jobs by Using an Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html) .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2e7276d2564e95ade14267cdcbe03b97ea04d75d2704e5547106562dd53be4f")
      override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
          vpcConfig(VpcConfigProperty(vpcConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty,
    ) : CdkObject(cdkObject), NetworkConfigProperty {
      /**
       * Whether to encrypt all communications between distributed processing jobs.
       *
       * Choose `True` to encrypt communications. Encryption provides greater security for
       * distributed processing jobs, but the processing might take longer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-networkconfig.html#cfn-sagemaker-monitoringschedule-networkconfig-enableintercontainertrafficencryption)
       */
      override fun enableInterContainerTrafficEncryption(): Any? =
          unwrap(this).getEnableInterContainerTrafficEncryption()

      /**
       * Whether to allow inbound and outbound network calls to and from the containers used for the
       * processing job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-networkconfig.html#cfn-sagemaker-monitoringschedule-networkconfig-enablenetworkisolation)
       */
      override fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

      /**
       * Specifies a VPC that your training jobs and hosted models have access to.
       *
       * Control access to and from your training and model containers by configuring the VPC. For
       * more information, see [Protect Endpoints by Using an Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Training
       * Jobs by Using an Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-networkconfig.html#cfn-sagemaker-monitoringschedule-networkconfig-vpcconfig)
       */
      override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty):
          NetworkConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty
    }
  }
}
