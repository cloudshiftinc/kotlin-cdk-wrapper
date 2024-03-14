package io.cloudshiftdev.awscdk

import kotlin.Number
import kotlin.Unit

public interface CfnResourceAutoScalingCreationPolicy {
  public fun minSuccessfulInstancesPercent(): Number? =
      unwrap(this).getMinSuccessfulInstancesPercent()

  public interface Builder {
    public fun minSuccessfulInstancesPercent(minSuccessfulInstancesPercent: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy.Builder =
        software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy.builder()

    override fun minSuccessfulInstancesPercent(minSuccessfulInstancesPercent: Number) {
      cdkBuilder.minSuccessfulInstancesPercent(minSuccessfulInstancesPercent)
    }

    public fun build(): software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy,
  ) : CfnResourceAutoScalingCreationPolicy {
    override fun minSuccessfulInstancesPercent(): Number? =
        unwrap(this).getMinSuccessfulInstancesPercent()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnResourceAutoScalingCreationPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy):
        CfnResourceAutoScalingCreationPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceAutoScalingCreationPolicy):
        software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy = (wrapped as Wrapper).cdkObject
  }
}
