package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface DatabaseInstanceProps {
  /**
   * Indicates that minor engine upgrades are applied automatically to the DB instance during the
   * maintenance window.
   *
   * Default: true
   */
  public fun autoMinorVersionUpgrade(): Boolean? = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * The name of the Availability Zone where the DB instance will be located.
   *
   * Default: - no preference
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The DocumentDB database cluster the instance should launch into.
   */
  public fun cluster(): IDatabaseCluster

  /**
   * A name for the DB instance.
   *
   * If you specify a name, AWS CloudFormation
   * converts it to lowercase.
   *
   * Default: - a CloudFormation generated name
   */
  public fun dbInstanceName(): String? = unwrap(this).getDbInstanceName()

  /**
   * A value that indicates whether to enable Performance Insights for the DB Instance.
   *
   * Default: - false
   */
  public fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

  /**
   * The name of the compute and memory capacity classes.
   */
  public fun instanceType(): InstanceType

  /**
   * The weekly time range (in UTC) during which system maintenance can occur.
   *
   * Format: `ddd:hh24:mi-ddd:hh24:mi`
   * Constraint: Minimum 30-minute window
   *
   * Default: - a 30-minute window selected at random from an 8-hour block of
   * time for each AWS Region, occurring on a random day of the week. To see
   * the time blocks available, see
   * https://docs.aws.amazon.com/documentdb/latest/developerguide/db-instance-maintain.html#maintenance-window
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * The CloudFormation policy to apply when the instance is removed from the stack or replaced
   * during an update.
   *
   * Default: RemovalPolicy.Retain
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * A builder for [DatabaseInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades are applied automatically
     * to the DB instance during the maintenance window.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * @param availabilityZone The name of the Availability Zone where the DB instance will be
     * located.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param cluster The DocumentDB database cluster the instance should launch into. 
     */
    public fun cluster(cluster: IDatabaseCluster)

    /**
     * @param dbInstanceName A name for the DB instance.
     * If you specify a name, AWS CloudFormation
     * converts it to lowercase.
     */
    public fun dbInstanceName(dbInstanceName: String)

    /**
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     * Insights for the DB Instance.
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    /**
     * @param instanceType The name of the compute and memory capacity classes. 
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system
     * maintenance can occur.
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     * Constraint: Minimum 30-minute window
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param removalPolicy The CloudFormation policy to apply when the instance is removed from the
     * stack or replaced during an update.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseInstanceProps.Builder =
        software.amazon.awscdk.services.docdb.DatabaseInstanceProps.builder()

    /**
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades are applied automatically
     * to the DB instance during the maintenance window.
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param availabilityZone The name of the Availability Zone where the DB instance will be
     * located.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param cluster The DocumentDB database cluster the instance should launch into. 
     */
    override fun cluster(cluster: IDatabaseCluster) {
      cdkBuilder.cluster(cluster.let(IDatabaseCluster::unwrap))
    }

    /**
     * @param dbInstanceName A name for the DB instance.
     * If you specify a name, AWS CloudFormation
     * converts it to lowercase.
     */
    override fun dbInstanceName(dbInstanceName: String) {
      cdkBuilder.dbInstanceName(dbInstanceName)
    }

    /**
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     * Insights for the DB Instance.
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /**
     * @param instanceType The name of the compute and memory capacity classes. 
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    /**
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system
     * maintenance can occur.
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     * Constraint: Minimum 30-minute window
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param removalPolicy The CloudFormation policy to apply when the instance is removed from the
     * stack or replaced during an update.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.docdb.DatabaseInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.docdb.DatabaseInstanceProps,
  ) : CdkObject(cdkObject), DatabaseInstanceProps {
    /**
     * Indicates that minor engine upgrades are applied automatically to the DB instance during the
     * maintenance window.
     *
     * Default: true
     */
    override fun autoMinorVersionUpgrade(): Boolean? = unwrap(this).getAutoMinorVersionUpgrade()

    /**
     * The name of the Availability Zone where the DB instance will be located.
     *
     * Default: - no preference
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The DocumentDB database cluster the instance should launch into.
     */
    override fun cluster(): IDatabaseCluster = unwrap(this).getCluster().let(IDatabaseCluster::wrap)

    /**
     * A name for the DB instance.
     *
     * If you specify a name, AWS CloudFormation
     * converts it to lowercase.
     *
     * Default: - a CloudFormation generated name
     */
    override fun dbInstanceName(): String? = unwrap(this).getDbInstanceName()

    /**
     * A value that indicates whether to enable Performance Insights for the DB Instance.
     *
     * Default: - false
     */
    override fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

    /**
     * The name of the compute and memory capacity classes.
     */
    override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

    /**
     * The weekly time range (in UTC) during which system maintenance can occur.
     *
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     * Constraint: Minimum 30-minute window
     *
     * Default: - a 30-minute window selected at random from an 8-hour block of
     * time for each AWS Region, occurring on a random day of the week. To see
     * the time blocks available, see
     * https://docs.aws.amazon.com/documentdb/latest/developerguide/db-instance-maintain.html#maintenance-window
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * The CloudFormation policy to apply when the instance is removed from the stack or replaced
     * during an update.
     *
     * Default: RemovalPolicy.Retain
     */
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
