@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface CfnResourceAutoScalingCreationPolicy {
  public fun minSuccessfulInstancesPercent(): Number? =
      unwrap(this).getMinSuccessfulInstancesPercent()

  @CdkDslMarker
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy,
  ) : CdkObject(cdkObject), CfnResourceAutoScalingCreationPolicy {
    override fun minSuccessfulInstancesPercent(): Number? =
        unwrap(this).getMinSuccessfulInstancesPercent()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnResourceAutoScalingCreationPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy):
        CfnResourceAutoScalingCreationPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceAutoScalingCreationPolicy):
        software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy
  }
}
