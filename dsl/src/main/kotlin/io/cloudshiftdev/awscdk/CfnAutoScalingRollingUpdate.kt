package io.cloudshiftdev.awscdk

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

  public interface Builder {
    public fun maxBatchSize(maxBatchSize: Number) {
    }

    public fun minInstancesInService(minInstancesInService: Number) {
    }

    public fun minSuccessfulInstancesPercent(minSuccessfulInstancesPercent: Number) {
    }

    public fun pauseTime(pauseTime: String) {
    }

    public fun suspendProcesses(suspendProcesses: List<String>) {
    }

    public fun waitOnResourceSignals(waitOnResourceSignals: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnAutoScalingRollingUpdate.Builder =
        software.amazon.awscdk.CfnAutoScalingRollingUpdate.builder()

    public override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    public override fun minInstancesInService(minInstancesInService: Number) {
      cdkBuilder.minInstancesInService(minInstancesInService)
    }

    public override fun minSuccessfulInstancesPercent(minSuccessfulInstancesPercent: Number) {
      cdkBuilder.minSuccessfulInstancesPercent(minSuccessfulInstancesPercent)
    }

    public override fun pauseTime(pauseTime: String) {
      cdkBuilder.pauseTime(pauseTime)
    }

    public override fun suspendProcesses(suspendProcesses: List<String>) {
      cdkBuilder.suspendProcesses(suspendProcesses)
    }

    public override fun waitOnResourceSignals(waitOnResourceSignals: Boolean) {
      cdkBuilder.waitOnResourceSignals(waitOnResourceSignals)
    }

    public fun build(): software.amazon.awscdk.CfnAutoScalingRollingUpdate = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnAutoScalingRollingUpdate,
  ) : CfnAutoScalingRollingUpdate {
    public override fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

    public override fun minInstancesInService(): Number? = unwrap(this).getMinInstancesInService()

    public override fun minSuccessfulInstancesPercent(): Number? =
        unwrap(this).getMinSuccessfulInstancesPercent()

    public override fun pauseTime(): String? = unwrap(this).getPauseTime()

    public override fun suspendProcesses(): List<String> = unwrap(this).getSuspendProcesses() ?:
        emptyList()

    public override fun waitOnResourceSignals(): Boolean? = unwrap(this).getWaitOnResourceSignals()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAutoScalingRollingUpdate {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnAutoScalingRollingUpdate):
        CfnAutoScalingRollingUpdate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingRollingUpdate):
        software.amazon.awscdk.CfnAutoScalingRollingUpdate = (wrapped as Wrapper).cdkObject
  }
}
