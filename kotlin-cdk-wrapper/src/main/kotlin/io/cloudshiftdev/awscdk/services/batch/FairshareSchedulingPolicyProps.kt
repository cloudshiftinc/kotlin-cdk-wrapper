@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface FairshareSchedulingPolicyProps {
  public fun computeReservation(): Number? = unwrap(this).getComputeReservation()

  public fun schedulingPolicyName(): String? = unwrap(this).getSchedulingPolicyName()

  public fun shareDecay(): Duration? = unwrap(this).getShareDecay()?.let(Duration::wrap)

  public fun shares(): List<Share> = unwrap(this).getShares()?.map(Share::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun computeReservation(computeReservation: Number)

    public fun schedulingPolicyName(schedulingPolicyName: String)

    public fun shareDecay(shareDecay: Duration)

    public fun shares(shares: List<Share>)

    public fun shares(vararg shares: Share)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.FairshareSchedulingPolicyProps.Builder =
        software.amazon.awscdk.services.batch.FairshareSchedulingPolicyProps.builder()

    override fun computeReservation(computeReservation: Number) {
      cdkBuilder.computeReservation(computeReservation)
    }

    override fun schedulingPolicyName(schedulingPolicyName: String) {
      cdkBuilder.schedulingPolicyName(schedulingPolicyName)
    }

    override fun shareDecay(shareDecay: Duration) {
      cdkBuilder.shareDecay(shareDecay.let(Duration::unwrap))
    }

    override fun shares(shares: List<Share>) {
      cdkBuilder.shares(shares.map(Share::unwrap))
    }

    override fun shares(vararg shares: Share): Unit = shares(shares.toList())

    public fun build(): software.amazon.awscdk.services.batch.FairshareSchedulingPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.FairshareSchedulingPolicyProps,
  ) : CdkObject(cdkObject), FairshareSchedulingPolicyProps {
    override fun computeReservation(): Number? = unwrap(this).getComputeReservation()

    override fun schedulingPolicyName(): String? = unwrap(this).getSchedulingPolicyName()

    override fun shareDecay(): Duration? = unwrap(this).getShareDecay()?.let(Duration::wrap)

    override fun shares(): List<Share> = unwrap(this).getShares()?.map(Share::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FairshareSchedulingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.FairshareSchedulingPolicyProps):
        FairshareSchedulingPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FairshareSchedulingPolicyProps):
        software.amazon.awscdk.services.batch.FairshareSchedulingPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.FairshareSchedulingPolicyProps
  }
}
