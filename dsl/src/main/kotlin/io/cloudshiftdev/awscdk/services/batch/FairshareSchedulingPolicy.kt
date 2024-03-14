package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class FairshareSchedulingPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.FairshareSchedulingPolicy,
) : Resource(cdkObject), IFairshareSchedulingPolicy, ISchedulingPolicy {
  public open fun addShare(share: Share) {
    unwrap(this).addShare(share.let(Share::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec6ceb5998640af21ae4c6014c8665baf5292eda659901b90444fcde927d46f6")
  public open fun addShare(share: Share.Builder.() -> Unit): Unit = addShare(Share(share))

  public override fun computeReservation(): Number? = unwrap(this).getComputeReservation()

  public override fun schedulingPolicyArn(): String = unwrap(this).getSchedulingPolicyArn()

  public override fun schedulingPolicyName(): String = unwrap(this).getSchedulingPolicyName()

  public override fun shareDecay(): Duration? = unwrap(this).getShareDecay()?.let(Duration::wrap)

  public override fun shares(): List<Share> = unwrap(this).getShares().map(Share::wrap)

  public interface Builder {
    public fun computeReservation(computeReservation: Number) {
    }

    public fun schedulingPolicyName(schedulingPolicyName: String) {
    }

    public fun shareDecay(shareDecay: Duration) {
    }

    public fun shares(shares: List<Share>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.FairshareSchedulingPolicy.Builder
        = software.amazon.awscdk.services.batch.FairshareSchedulingPolicy.Builder.create(scope, id)

    public override fun computeReservation(computeReservation: Number) {
      cdkBuilder.computeReservation(computeReservation)
    }

    public override fun schedulingPolicyName(schedulingPolicyName: String) {
      cdkBuilder.schedulingPolicyName(schedulingPolicyName)
    }

    public override fun shareDecay(shareDecay: Duration) {
      cdkBuilder.shareDecay(shareDecay.let(Duration::unwrap))
    }

    public override fun shares(shares: List<Share>) {
      cdkBuilder.shares(shares.map(Share::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.FairshareSchedulingPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromFairshareSchedulingPolicyArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      fairshareSchedulingPolicyArn: String,
    ): IFairshareSchedulingPolicy =
        software.amazon.awscdk.services.batch.FairshareSchedulingPolicy.fromFairshareSchedulingPolicyArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, fairshareSchedulingPolicyArn).let(IFairshareSchedulingPolicy::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FairshareSchedulingPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FairshareSchedulingPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.FairshareSchedulingPolicy):
        FairshareSchedulingPolicy = FairshareSchedulingPolicy(cdkObject)

    internal fun unwrap(wrapped: FairshareSchedulingPolicy):
        software.amazon.awscdk.services.batch.FairshareSchedulingPolicy = wrapped.cdkObject
  }
}
