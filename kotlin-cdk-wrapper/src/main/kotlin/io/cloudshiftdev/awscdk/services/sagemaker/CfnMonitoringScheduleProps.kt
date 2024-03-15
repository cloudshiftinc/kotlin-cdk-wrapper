@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnMonitoringScheduleProps {
  public fun endpointName(): String? = unwrap(this).getEndpointName()

  public fun failureReason(): String? = unwrap(this).getFailureReason()

  public fun lastMonitoringExecutionSummary(): Any? =
      unwrap(this).getLastMonitoringExecutionSummary()

  public fun monitoringScheduleConfig(): Any

  public fun monitoringScheduleName(): String

  public fun monitoringScheduleStatus(): String? = unwrap(this).getMonitoringScheduleStatus()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun endpointName(endpointName: String)

    public fun failureReason(failureReason: String)

    public fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: IResolvable)

    public
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: CfnMonitoringSchedule.MonitoringExecutionSummaryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2d08bb4c8aa064d223e516318fba4d25788aa648ec443915bbe4229e9e5cd83")
    public
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: CfnMonitoringSchedule.MonitoringExecutionSummaryProperty.Builder.() -> Unit)

    public fun monitoringScheduleConfig(monitoringScheduleConfig: IResolvable)

    public
        fun monitoringScheduleConfig(monitoringScheduleConfig: CfnMonitoringSchedule.MonitoringScheduleConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("165b14835ca4d684e02d832ac339b397888bb75b493586caa3a70ac6ce8e399a")
    public
        fun monitoringScheduleConfig(monitoringScheduleConfig: CfnMonitoringSchedule.MonitoringScheduleConfigProperty.Builder.() -> Unit)

    public fun monitoringScheduleName(monitoringScheduleName: String)

    public fun monitoringScheduleStatus(monitoringScheduleStatus: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps.builder()

    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    override fun failureReason(failureReason: String) {
      cdkBuilder.failureReason(failureReason)
    }

    override fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: IResolvable) {
      cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary.let(IResolvable::unwrap))
    }

    override
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: CfnMonitoringSchedule.MonitoringExecutionSummaryProperty) {
      cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary.let(CfnMonitoringSchedule.MonitoringExecutionSummaryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2d08bb4c8aa064d223e516318fba4d25788aa648ec443915bbe4229e9e5cd83")
    override
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: CfnMonitoringSchedule.MonitoringExecutionSummaryProperty.Builder.() -> Unit):
        Unit =
        lastMonitoringExecutionSummary(CfnMonitoringSchedule.MonitoringExecutionSummaryProperty(lastMonitoringExecutionSummary))

    override fun monitoringScheduleConfig(monitoringScheduleConfig: IResolvable) {
      cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig.let(IResolvable::unwrap))
    }

    override
        fun monitoringScheduleConfig(monitoringScheduleConfig: CfnMonitoringSchedule.MonitoringScheduleConfigProperty) {
      cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig.let(CfnMonitoringSchedule.MonitoringScheduleConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("165b14835ca4d684e02d832ac339b397888bb75b493586caa3a70ac6ce8e399a")
    override
        fun monitoringScheduleConfig(monitoringScheduleConfig: CfnMonitoringSchedule.MonitoringScheduleConfigProperty.Builder.() -> Unit):
        Unit =
        monitoringScheduleConfig(CfnMonitoringSchedule.MonitoringScheduleConfigProperty(monitoringScheduleConfig))

    override fun monitoringScheduleName(monitoringScheduleName: String) {
      cdkBuilder.monitoringScheduleName(monitoringScheduleName)
    }

    override fun monitoringScheduleStatus(monitoringScheduleStatus: String) {
      cdkBuilder.monitoringScheduleStatus(monitoringScheduleStatus)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps,
  ) : CdkObject(cdkObject), CfnMonitoringScheduleProps {
    override fun endpointName(): String? = unwrap(this).getEndpointName()

    override fun failureReason(): String? = unwrap(this).getFailureReason()

    override fun lastMonitoringExecutionSummary(): Any? =
        unwrap(this).getLastMonitoringExecutionSummary()

    override fun monitoringScheduleConfig(): Any = unwrap(this).getMonitoringScheduleConfig()

    override fun monitoringScheduleName(): String = unwrap(this).getMonitoringScheduleName()

    override fun monitoringScheduleStatus(): String? = unwrap(this).getMonitoringScheduleStatus()

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
