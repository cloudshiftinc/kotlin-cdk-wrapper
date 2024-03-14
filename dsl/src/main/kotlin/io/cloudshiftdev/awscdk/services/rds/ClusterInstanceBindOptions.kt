package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.Unit

public interface ClusterInstanceBindOptions {
  public fun monitoringInterval(): Duration? =
      unwrap(this).getMonitoringInterval()?.let(Duration::wrap)

  public fun monitoringRole(): IRole? = unwrap(this).getMonitoringRole()?.let(IRole::wrap)

  public fun promotionTier(): Number? = unwrap(this).getPromotionTier()

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun subnetGroup(): ISubnetGroup? = unwrap(this).getSubnetGroup()?.let(ISubnetGroup::wrap)

  public interface Builder {
    public fun monitoringInterval(monitoringInterval: Duration) {
    }

    public fun monitoringRole(monitoringRole: IRole) {
    }

    public fun promotionTier(promotionTier: Number) {
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
    }

    public fun subnetGroup(subnetGroup: ISubnetGroup) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ClusterInstanceBindOptions.Builder =
        software.amazon.awscdk.services.rds.ClusterInstanceBindOptions.builder()

    public override fun monitoringInterval(monitoringInterval: Duration) {
      cdkBuilder.monitoringInterval(monitoringInterval.let(Duration::unwrap))
    }

    public override fun monitoringRole(monitoringRole: IRole) {
      cdkBuilder.monitoringRole(monitoringRole.let(IRole::unwrap))
    }

    public override fun promotionTier(promotionTier: Number) {
      cdkBuilder.promotionTier(promotionTier)
    }

    public override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public override fun subnetGroup(subnetGroup: ISubnetGroup) {
      cdkBuilder.subnetGroup(subnetGroup.let(ISubnetGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.ClusterInstanceBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.ClusterInstanceBindOptions,
  ) : ClusterInstanceBindOptions {
    public override fun monitoringInterval(): Duration? =
        unwrap(this).getMonitoringInterval()?.let(Duration::wrap)

    public override fun monitoringRole(): IRole? =
        unwrap(this).getMonitoringRole()?.let(IRole::wrap)

    public override fun promotionTier(): Number? = unwrap(this).getPromotionTier()

    public override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    public override fun subnetGroup(): ISubnetGroup? =
        unwrap(this).getSubnetGroup()?.let(ISubnetGroup::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterInstanceBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ClusterInstanceBindOptions):
        ClusterInstanceBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterInstanceBindOptions):
        software.amazon.awscdk.services.rds.ClusterInstanceBindOptions = (wrapped as
        Wrapper).cdkObject
  }
}
