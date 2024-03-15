@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codeguruprofiler

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnProfilingGroupProps {
  public fun agentPermissions(): Any? = unwrap(this).getAgentPermissions()

  public fun anomalyDetectionNotificationConfiguration(): Any? =
      unwrap(this).getAnomalyDetectionNotificationConfiguration()

  public fun computePlatform(): String? = unwrap(this).getComputePlatform()

  public fun profilingGroupName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun agentPermissions(agentPermissions: Any)

    public
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: IResolvable)

    public
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: List<Any>)

    public fun anomalyDetectionNotificationConfiguration(vararg
        anomalyDetectionNotificationConfiguration: Any)

    public fun computePlatform(computePlatform: String)

    public fun profilingGroupName(profilingGroupName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps.Builder =
        software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps.builder()

    override fun agentPermissions(agentPermissions: Any) {
      cdkBuilder.agentPermissions(agentPermissions)
    }

    override
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: IResolvable) {
      cdkBuilder.anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: List<Any>) {
      cdkBuilder.anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration)
    }

    override fun anomalyDetectionNotificationConfiguration(vararg
        anomalyDetectionNotificationConfiguration: Any): Unit =
        anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration.toList())

    override fun computePlatform(computePlatform: String) {
      cdkBuilder.computePlatform(computePlatform)
    }

    override fun profilingGroupName(profilingGroupName: String) {
      cdkBuilder.profilingGroupName(profilingGroupName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps,
  ) : CdkObject(cdkObject), CfnProfilingGroupProps {
    override fun agentPermissions(): Any? = unwrap(this).getAgentPermissions()

    override fun anomalyDetectionNotificationConfiguration(): Any? =
        unwrap(this).getAnomalyDetectionNotificationConfiguration()

    override fun computePlatform(): String? = unwrap(this).getComputePlatform()

    override fun profilingGroupName(): String = unwrap(this).getProfilingGroupName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProfilingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps):
        CfnProfilingGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProfilingGroupProps):
        software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps
  }
}
