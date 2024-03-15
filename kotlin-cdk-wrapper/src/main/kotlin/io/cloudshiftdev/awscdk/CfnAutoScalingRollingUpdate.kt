@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAutoScalingRollingUpdate {
  public fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

  public fun minInstancesInService(): Number? = unwrap(this).getMinInstancesInService()

  public fun minSuccessfulInstancesPercent(): Number? =
      unwrap(this).getMinSuccessfulInstancesPercent()

  public fun pauseTime(): String? = unwrap(this).getPauseTime()

  public fun suspendProcesses(): List<String> = unwrap(this).getSuspendProcesses() ?: emptyList()

  public fun waitOnResourceSignals(): Boolean? = unwrap(this).getWaitOnResourceSignals()

  @CdkDslMarker
  public interface Builder {
    public fun maxBatchSize(maxBatchSize: Number)

    public fun minInstancesInService(minInstancesInService: Number)

    public fun minSuccessfulInstancesPercent(minSuccessfulInstancesPercent: Number)

    public fun pauseTime(pauseTime: String)

    public fun suspendProcesses(suspendProcesses: List<String>)

    public fun suspendProcesses(vararg suspendProcesses: String)

    public fun waitOnResourceSignals(waitOnResourceSignals: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnAutoScalingRollingUpdate.Builder =
        software.amazon.awscdk.CfnAutoScalingRollingUpdate.builder()

    override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    override fun minInstancesInService(minInstancesInService: Number) {
      cdkBuilder.minInstancesInService(minInstancesInService)
    }

    override fun minSuccessfulInstancesPercent(minSuccessfulInstancesPercent: Number) {
      cdkBuilder.minSuccessfulInstancesPercent(minSuccessfulInstancesPercent)
    }

    override fun pauseTime(pauseTime: String) {
      cdkBuilder.pauseTime(pauseTime)
    }

    override fun suspendProcesses(suspendProcesses: List<String>) {
      cdkBuilder.suspendProcesses(suspendProcesses)
    }

    override fun suspendProcesses(vararg suspendProcesses: String): Unit =
        suspendProcesses(suspendProcesses.toList())

    override fun waitOnResourceSignals(waitOnResourceSignals: Boolean) {
      cdkBuilder.waitOnResourceSignals(waitOnResourceSignals)
    }

    public fun build(): software.amazon.awscdk.CfnAutoScalingRollingUpdate = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnAutoScalingRollingUpdate,
  ) : CdkObject(cdkObject), CfnAutoScalingRollingUpdate {
    override fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

    override fun minInstancesInService(): Number? = unwrap(this).getMinInstancesInService()

    override fun minSuccessfulInstancesPercent(): Number? =
        unwrap(this).getMinSuccessfulInstancesPercent()

    override fun pauseTime(): String? = unwrap(this).getPauseTime()

    override fun suspendProcesses(): List<String> = unwrap(this).getSuspendProcesses() ?:
        emptyList()

    override fun waitOnResourceSignals(): Boolean? = unwrap(this).getWaitOnResourceSignals()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAutoScalingRollingUpdate {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnAutoScalingRollingUpdate):
        CfnAutoScalingRollingUpdate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingRollingUpdate):
        software.amazon.awscdk.CfnAutoScalingRollingUpdate = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnAutoScalingRollingUpdate
  }
}
