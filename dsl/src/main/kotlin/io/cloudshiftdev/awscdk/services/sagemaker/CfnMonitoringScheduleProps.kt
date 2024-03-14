package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnMonitoringScheduleProps {
  /**
   * The name of the endpoint using the monitoring schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-endpointname)
   */
  public fun endpointName(): String? = unwrap(this).getEndpointName()

  /**
   * Contains the reason a monitoring job failed, if it failed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-failurereason)
   */
  public fun failureReason(): String? = unwrap(this).getFailureReason()

  /**
   * Describes metadata on the last execution to run, if there was one.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-lastmonitoringexecutionsummary)
   */
  public fun lastMonitoringExecutionSummary(): Any? =
      unwrap(this).getLastMonitoringExecutionSummary()

  /**
   * The configuration object that specifies the monitoring schedule and defines the monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig)
   */
  public fun monitoringScheduleConfig(): Any

  /**
   * The name of the monitoring schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringschedulename)
   */
  public fun monitoringScheduleName(): String

  /**
   * The status of the monitoring schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringschedulestatus)
   */
  public fun monitoringScheduleStatus(): String? = unwrap(this).getMonitoringScheduleStatus()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMonitoringScheduleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param endpointName The name of the endpoint using the monitoring schedule.
     */
    public fun endpointName(endpointName: String)

    /**
     * @param failureReason Contains the reason a monitoring job failed, if it failed.
     */
    public fun failureReason(failureReason: String)

    /**
     * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if
     * there was one.
     */
    public fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: IResolvable)

    /**
     * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if
     * there was one.
     */
    public
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: CfnMonitoringSchedule.MonitoringExecutionSummaryProperty)

    /**
     * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if
     * there was one.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2d08bb4c8aa064d223e516318fba4d25788aa648ec443915bbe4229e9e5cd83")
    public
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: CfnMonitoringSchedule.MonitoringExecutionSummaryProperty.Builder.() -> Unit)

    /**
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring
     * schedule and defines the monitoring job. 
     */
    public fun monitoringScheduleConfig(monitoringScheduleConfig: IResolvable)

    /**
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring
     * schedule and defines the monitoring job. 
     */
    public
        fun monitoringScheduleConfig(monitoringScheduleConfig: CfnMonitoringSchedule.MonitoringScheduleConfigProperty)

    /**
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring
     * schedule and defines the monitoring job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("165b14835ca4d684e02d832ac339b397888bb75b493586caa3a70ac6ce8e399a")
    public
        fun monitoringScheduleConfig(monitoringScheduleConfig: CfnMonitoringSchedule.MonitoringScheduleConfigProperty.Builder.() -> Unit)

    /**
     * @param monitoringScheduleName The name of the monitoring schedule. 
     */
    public fun monitoringScheduleName(monitoringScheduleName: String)

    /**
     * @param monitoringScheduleStatus The status of the monitoring schedule.
     */
    public fun monitoringScheduleStatus(monitoringScheduleStatus: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps.builder()

    /**
     * @param endpointName The name of the endpoint using the monitoring schedule.
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
     * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if
     * there was one.
     */
    override fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: IResolvable) {
      cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary.let(IResolvable::unwrap))
    }

    /**
     * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if
     * there was one.
     */
    override
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: CfnMonitoringSchedule.MonitoringExecutionSummaryProperty) {
      cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary.let(CfnMonitoringSchedule.MonitoringExecutionSummaryProperty::unwrap))
    }

    /**
     * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if
     * there was one.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2d08bb4c8aa064d223e516318fba4d25788aa648ec443915bbe4229e9e5cd83")
    override
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: CfnMonitoringSchedule.MonitoringExecutionSummaryProperty.Builder.() -> Unit):
        Unit =
        lastMonitoringExecutionSummary(CfnMonitoringSchedule.MonitoringExecutionSummaryProperty(lastMonitoringExecutionSummary))

    /**
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring
     * schedule and defines the monitoring job. 
     */
    override fun monitoringScheduleConfig(monitoringScheduleConfig: IResolvable) {
      cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig.let(IResolvable::unwrap))
    }

    /**
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring
     * schedule and defines the monitoring job. 
     */
    override
        fun monitoringScheduleConfig(monitoringScheduleConfig: CfnMonitoringSchedule.MonitoringScheduleConfigProperty) {
      cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig.let(CfnMonitoringSchedule.MonitoringScheduleConfigProperty::unwrap))
    }

    /**
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring
     * schedule and defines the monitoring job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("165b14835ca4d684e02d832ac339b397888bb75b493586caa3a70ac6ce8e399a")
    override
        fun monitoringScheduleConfig(monitoringScheduleConfig: CfnMonitoringSchedule.MonitoringScheduleConfigProperty.Builder.() -> Unit):
        Unit =
        monitoringScheduleConfig(CfnMonitoringSchedule.MonitoringScheduleConfigProperty(monitoringScheduleConfig))

    /**
     * @param monitoringScheduleName The name of the monitoring schedule. 
     */
    override fun monitoringScheduleName(monitoringScheduleName: String) {
      cdkBuilder.monitoringScheduleName(monitoringScheduleName)
    }

    /**
     * @param monitoringScheduleStatus The status of the monitoring schedule.
     */
    override fun monitoringScheduleStatus(monitoringScheduleStatus: String) {
      cdkBuilder.monitoringScheduleStatus(monitoringScheduleStatus)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps,
  ) : CdkObject(cdkObject), CfnMonitoringScheduleProps {
    /**
     * The name of the endpoint using the monitoring schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-endpointname)
     */
    override fun endpointName(): String? = unwrap(this).getEndpointName()

    /**
     * Contains the reason a monitoring job failed, if it failed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-failurereason)
     */
    override fun failureReason(): String? = unwrap(this).getFailureReason()

    /**
     * Describes metadata on the last execution to run, if there was one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-lastmonitoringexecutionsummary)
     */
    override fun lastMonitoringExecutionSummary(): Any? =
        unwrap(this).getLastMonitoringExecutionSummary()

    /**
     * The configuration object that specifies the monitoring schedule and defines the monitoring
     * job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig)
     */
    override fun monitoringScheduleConfig(): Any = unwrap(this).getMonitoringScheduleConfig()

    /**
     * The name of the monitoring schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringschedulename)
     */
    override fun monitoringScheduleName(): String = unwrap(this).getMonitoringScheduleName()

    /**
     * The status of the monitoring schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringschedulestatus)
     */
    override fun monitoringScheduleStatus(): String? = unwrap(this).getMonitoringScheduleStatus()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMonitoringScheduleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps):
        CfnMonitoringScheduleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMonitoringScheduleProps):
        software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps
  }
}
