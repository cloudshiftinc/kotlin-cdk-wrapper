@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.Unit

/**
 * Options for binding the instance to the cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * Role role;
 * SubnetGroup subnetGroup;
 * ClusterInstanceBindOptions clusterInstanceBindOptions = ClusterInstanceBindOptions.builder()
 * .monitoringInterval(Duration.minutes(30))
 * .monitoringRole(role)
 * .promotionTier(123)
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .subnetGroup(subnetGroup)
 * .build();
 * ```
 */
public interface ClusterInstanceBindOptions {
  /**
   * The interval, in seconds, between points when Amazon RDS collects enhanced monitoring metrics
   * for the DB instances.
   *
   * Default: no enhanced monitoring
   */
  public fun monitoringInterval(): Duration? =
      unwrap(this).getMonitoringInterval()?.let(Duration::wrap)

  /**
   * Role that will be used to manage DB instances monitoring.
   *
   * Default: - A role is automatically created for you
   */
  public fun monitoringRole(): IRole? = unwrap(this).getMonitoringRole()?.let(IRole::wrap)

  /**
   * The promotion tier of the cluster instance.
   *
   * This matters more for serverlessV2 instances. If a serverless
   * instance is in tier 0-1 then it will scale with the writer.
   *
   * For provisioned instances this just determines the failover priority.
   * If multiple instances have the same priority then one will be picked at random
   *
   * Default: 2
   */
  public fun promotionTier(): Number? = unwrap(this).getPromotionTier()

  /**
   * The removal policy on the cluster.
   *
   * Default: - RemovalPolicy.DESTROY (cluster snapshot can restore)
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * Existing subnet group for the cluster.
   *
   * This is only needed when using the isFromLegacyInstanceProps
   *
   * Default: - cluster subnet group is used
   */
  public fun subnetGroup(): ISubnetGroup? = unwrap(this).getSubnetGroup()?.let(ISubnetGroup::wrap)

  /**
   * A builder for [ClusterInstanceBindOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param monitoringInterval The interval, in seconds, between points when Amazon RDS collects
     * enhanced monitoring metrics for the DB instances.
     */
    public fun monitoringInterval(monitoringInterval: Duration)

    /**
     * @param monitoringRole Role that will be used to manage DB instances monitoring.
     */
    public fun monitoringRole(monitoringRole: IRole)

    /**
     * @param promotionTier The promotion tier of the cluster instance.
     * This matters more for serverlessV2 instances. If a serverless
     * instance is in tier 0-1 then it will scale with the writer.
     *
     * For provisioned instances this just determines the failover priority.
     * If multiple instances have the same priority then one will be picked at random
     */
    public fun promotionTier(promotionTier: Number)

    /**
     * @param removalPolicy The removal policy on the cluster.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param subnetGroup Existing subnet group for the cluster.
     * This is only needed when using the isFromLegacyInstanceProps
     */
    public fun subnetGroup(subnetGroup: ISubnetGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ClusterInstanceBindOptions.Builder =
        software.amazon.awscdk.services.rds.ClusterInstanceBindOptions.builder()

    /**
     * @param monitoringInterval The interval, in seconds, between points when Amazon RDS collects
     * enhanced monitoring metrics for the DB instances.
     */
    override fun monitoringInterval(monitoringInterval: Duration) {
      cdkBuilder.monitoringInterval(monitoringInterval.let(Duration::unwrap))
    }

    /**
     * @param monitoringRole Role that will be used to manage DB instances monitoring.
     */
    override fun monitoringRole(monitoringRole: IRole) {
      cdkBuilder.monitoringRole(monitoringRole.let(IRole::unwrap))
    }

    /**
     * @param promotionTier The promotion tier of the cluster instance.
     * This matters more for serverlessV2 instances. If a serverless
     * instance is in tier 0-1 then it will scale with the writer.
     *
     * For provisioned instances this just determines the failover priority.
     * If multiple instances have the same priority then one will be picked at random
     */
    override fun promotionTier(promotionTier: Number) {
      cdkBuilder.promotionTier(promotionTier)
    }

    /**
     * @param removalPolicy The removal policy on the cluster.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param subnetGroup Existing subnet group for the cluster.
     * This is only needed when using the isFromLegacyInstanceProps
     */
    override fun subnetGroup(subnetGroup: ISubnetGroup) {
      cdkBuilder.subnetGroup(subnetGroup.let(ISubnetGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.ClusterInstanceBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.ClusterInstanceBindOptions,
  ) : CdkObject(cdkObject), ClusterInstanceBindOptions {
    /**
     * The interval, in seconds, between points when Amazon RDS collects enhanced monitoring metrics
     * for the DB instances.
     *
     * Default: no enhanced monitoring
     */
    override fun monitoringInterval(): Duration? =
        unwrap(this).getMonitoringInterval()?.let(Duration::wrap)

    /**
     * Role that will be used to manage DB instances monitoring.
     *
     * Default: - A role is automatically created for you
     */
    override fun monitoringRole(): IRole? = unwrap(this).getMonitoringRole()?.let(IRole::wrap)

    /**
     * The promotion tier of the cluster instance.
     *
     * This matters more for serverlessV2 instances. If a serverless
     * instance is in tier 0-1 then it will scale with the writer.
     *
     * For provisioned instances this just determines the failover priority.
     * If multiple instances have the same priority then one will be picked at random
     *
     * Default: 2
     */
    override fun promotionTier(): Number? = unwrap(this).getPromotionTier()

    /**
     * The removal policy on the cluster.
     *
     * Default: - RemovalPolicy.DESTROY (cluster snapshot can restore)
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * Existing subnet group for the cluster.
     *
     * This is only needed when using the isFromLegacyInstanceProps
     *
     * Default: - cluster subnet group is used
     */
    override fun subnetGroup(): ISubnetGroup? =
        unwrap(this).getSubnetGroup()?.let(ISubnetGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterInstanceBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ClusterInstanceBindOptions):
        ClusterInstanceBindOptions = CdkObjectWrappers.wrap(cdkObject) as?
        ClusterInstanceBindOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterInstanceBindOptions):
        software.amazon.awscdk.services.rds.ClusterInstanceBindOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.ClusterInstanceBindOptions
  }
}
