@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface DatabaseInstanceProps {
  public fun autoMinorVersionUpgrade(): Boolean? = unwrap(this).getAutoMinorVersionUpgrade()

  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public fun cluster(): IDatabaseCluster

  public fun dbInstanceName(): String? = unwrap(this).getDbInstanceName()

  public fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

  public fun instanceType(): InstanceType

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun availabilityZone(availabilityZone: String)

    public fun cluster(cluster: IDatabaseCluster)

    public fun dbInstanceName(dbInstanceName: String)

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    public fun instanceType(instanceType: InstanceType)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseInstanceProps.Builder =
        software.amazon.awscdk.services.docdb.DatabaseInstanceProps.builder()

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun cluster(cluster: IDatabaseCluster) {
      cdkBuilder.cluster(cluster.let(IDatabaseCluster::unwrap))
    }

    override fun dbInstanceName(dbInstanceName: String) {
      cdkBuilder.dbInstanceName(dbInstanceName)
    }

    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.docdb.DatabaseInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.docdb.DatabaseInstanceProps,
  ) : CdkObject(cdkObject), DatabaseInstanceProps {
    override fun autoMinorVersionUpgrade(): Boolean? = unwrap(this).getAutoMinorVersionUpgrade()

    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun cluster(): IDatabaseCluster = unwrap(this).getCluster().let(IDatabaseCluster::wrap)

    override fun dbInstanceName(): String? = unwrap(this).getDbInstanceName()

    override fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

    override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.DatabaseInstanceProps):
        DatabaseInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseInstanceProps):
        software.amazon.awscdk.services.docdb.DatabaseInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.docdb.DatabaseInstanceProps
  }
}
