@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Common options for creating a cluster instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CaCertificate caCertificate;
 * Key key;
 * ParameterGroup parameterGroup;
 * ClusterInstanceOptions clusterInstanceOptions = ClusterInstanceOptions.builder()
 * .allowMajorVersionUpgrade(false)
 * .applyImmediately(false)
 * .autoMinorVersionUpgrade(false)
 * .availabilityZone("availabilityZone")
 * .caCertificate(caCertificate)
 * .enablePerformanceInsights(false)
 * .instanceIdentifier("instanceIdentifier")
 * .isFromLegacyInstanceProps(false)
 * .parameterGroup(parameterGroup)
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .performanceInsightEncryptionKey(key)
 * .performanceInsightRetention(PerformanceInsightRetention.DEFAULT)
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .publiclyAccessible(false)
 * .build();
 * ```
 */
public interface ClusterInstanceOptions {
  /**
   * Whether to allow upgrade of major version for the DB instance.
   *
   * Default: - false
   */
  public fun allowMajorVersionUpgrade(): Boolean? = unwrap(this).getAllowMajorVersionUpgrade()

  /**
   * Specifies whether changes to the DB instance and any pending modifications are applied
   * immediately, regardless of the `preferredMaintenanceWindow` setting.
   *
   * If set to `false`, changes are applied during the next maintenance window.
   *
   * Until RDS applies the changes, the DB instance remains in a drift state.
   * As a result, the configuration doesn't fully reflect the requested modifications and
   * temporarily diverges from the intended state.
   *
   * This property also determines whether the DB instance reboots when a static parameter is
   * modified in the associated DB parameter group.
   *
   * Default: - Changes will be applied immediately
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Modifying.html)
   */
  public fun applyImmediately(): Boolean? = unwrap(this).getApplyImmediately()

  /**
   * Whether to enable automatic upgrade of minor version for the DB instance.
   *
   * Default: - true
   */
  public fun autoMinorVersionUpgrade(): Boolean? = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * The Availability Zone (AZ) where the database will be created.
   *
   * For Amazon Aurora, each Aurora DB cluster hosts copies of its storage in three separate
   * Availability Zones.
   * Specify one of these Availability Zones. Aurora automatically chooses an appropriate
   * Availability Zone if you don't specify one.
   *
   * Default: - A random, system-chosen Availability Zone in the endpointʼs AWS Region.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html)
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The identifier of the CA certificate for this DB cluster's instances.
   *
   * Specifying or updating this property triggers a reboot.
   *
   * For RDS DB engines:
   *
   * Default: - RDS will choose a certificate authority
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html)
   */
  public fun caCertificate(): CaCertificate? =
      unwrap(this).getCaCertificate()?.let(CaCertificate::wrap)

  /**
   * Whether to enable Performance Insights for the DB instance.
   *
   * Default: - false, unless ``performanceInsightRetention`` or ``performanceInsightEncryptionKey``
   * is set.
   */
  public fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

  /**
   * The identifier for the database instance.
   *
   * Default: - CloudFormation generated identifier
   */
  public fun instanceIdentifier(): String? = unwrap(this).getInstanceIdentifier()

  /**
   * Only used for migrating existing clusters from using `instanceProps` to `writer` and `readers`.
   *
   * Default: false
   *
   * Example:
   *
   * ```
   * // existing cluster
   * Vpc vpc;
   * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
   * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder()
   * .version(AuroraMysqlEngineVersion.VER_3_03_0)
   * .build()))
   * .instances(2)
   * .instanceProps(InstanceProps.builder()
   * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.SMALL))
   * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
   * .vpc(vpc)
   * .build())
   * .build();
   * // migration
   * Map&lt;String, Object&gt; instanceProps = Map.of(
   * "instanceType", InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.SMALL),
   * "isFromLegacyInstanceProps", true);
   * DatabaseCluster myCluster = DatabaseCluster.Builder.create(this, "Database")
   * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder()
   * .version(AuroraMysqlEngineVersion.VER_3_03_0)
   * .build()))
   * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
   * .vpc(vpc)
   * .writer(ClusterInstance.provisioned("Instance1", ProvisionedClusterInstanceProps.builder()
   * .instanceType(instanceProps.getInstanceType())
   * .isFromLegacyInstanceProps(instanceProps.getIsFromLegacyInstanceProps())
   * .build()))
   * .readers(List.of(ClusterInstance.provisioned("Instance2",
   * ProvisionedClusterInstanceProps.builder()
   * .instanceType(instanceProps.getInstanceType())
   * .isFromLegacyInstanceProps(instanceProps.getIsFromLegacyInstanceProps())
   * .build())))
   * .build();
   * ```
   */
  public fun isFromLegacyInstanceProps(): Boolean? = unwrap(this).getIsFromLegacyInstanceProps()

  /**
   * The DB parameter group to associate with the instance.
   *
   * This is only needed if you need to configure different parameter
   * groups for each individual instance, otherwise you should not
   * provide this and just use the cluster parameter group
   *
   * Default: the cluster parameter group is used
   */
  public fun parameterGroup(): IParameterGroup? =
      unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

  /**
   * The parameters in the DBParameterGroup to create automatically.
   *
   * You can only specify parameterGroup or parameters but not both.
   * You need to use a versioned engine to auto-generate a DBParameterGroup.
   *
   * Default: - None
   */
  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * The AWS KMS key for encryption of Performance Insights data.
   *
   * Default: - default master key
   */
  public fun performanceInsightEncryptionKey(): IKey? =
      unwrap(this).getPerformanceInsightEncryptionKey()?.let(IKey::wrap)

  /**
   * The amount of time, in days, to retain Performance Insights data.
   *
   * Default: 7
   */
  public fun performanceInsightRetention(): PerformanceInsightRetention? =
      unwrap(this).getPerformanceInsightRetention()?.let(PerformanceInsightRetention::wrap)

  /**
   * A preferred maintenance window day/time range. Should be specified as a range
   * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC).
   *
   * Example: 'Sun:23:45-Mon:00:15'
   *
   * Default: - 30-minute window selected at random from an 8-hour block of time for
   * each AWS Region, occurring on a random day of the week.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance)
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * Indicates whether the DB instance is an internet-facing instance.
   *
   * If not specified,
   * the cluster's vpcSubnets will be used to determine if the instance is internet-facing
   * or not.
   *
   * Default: - `true` if the cluster's `vpcSubnets` is `subnetType: SubnetType.PUBLIC`, `false`
   * otherwise
   */
  public fun publiclyAccessible(): Boolean? = unwrap(this).getPubliclyAccessible()

  /**
   * A builder for [ClusterInstanceOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowMajorVersionUpgrade Whether to allow upgrade of major version for the DB
     * instance.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean)

    /**
     * @param applyImmediately Specifies whether changes to the DB instance and any pending
     * modifications are applied immediately, regardless of the `preferredMaintenanceWindow` setting.
     * If set to `false`, changes are applied during the next maintenance window.
     *
     * Until RDS applies the changes, the DB instance remains in a drift state.
     * As a result, the configuration doesn't fully reflect the requested modifications and
     * temporarily diverges from the intended state.
     *
     * This property also determines whether the DB instance reboots when a static parameter is
     * modified in the associated DB parameter group.
     */
    public fun applyImmediately(applyImmediately: Boolean)

    /**
     * @param autoMinorVersionUpgrade Whether to enable automatic upgrade of minor version for the
     * DB instance.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * @param availabilityZone The Availability Zone (AZ) where the database will be created.
     * For Amazon Aurora, each Aurora DB cluster hosts copies of its storage in three separate
     * Availability Zones.
     * Specify one of these Availability Zones. Aurora automatically chooses an appropriate
     * Availability Zone if you don't specify one.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param caCertificate The identifier of the CA certificate for this DB cluster's instances.
     * Specifying or updating this property triggers a reboot.
     *
     * For RDS DB engines:
     */
    public fun caCertificate(caCertificate: CaCertificate)

    /**
     * @param enablePerformanceInsights Whether to enable Performance Insights for the DB instance.
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    /**
     * @param instanceIdentifier The identifier for the database instance.
     */
    public fun instanceIdentifier(instanceIdentifier: String)

    /**
     * @param isFromLegacyInstanceProps Only used for migrating existing clusters from using
     * `instanceProps` to `writer` and `readers`.
     */
    public fun isFromLegacyInstanceProps(isFromLegacyInstanceProps: Boolean)

    /**
     * @param parameterGroup The DB parameter group to associate with the instance.
     * This is only needed if you need to configure different parameter
     * groups for each individual instance, otherwise you should not
     * provide this and just use the cluster parameter group
     */
    public fun parameterGroup(parameterGroup: IParameterGroup)

    /**
     * @param parameters The parameters in the DBParameterGroup to create automatically.
     * You can only specify parameterGroup or parameters but not both.
     * You need to use a versioned engine to auto-generate a DBParameterGroup.
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance Insights
     * data.
     */
    public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey)

    /**
     * @param performanceInsightRetention The amount of time, in days, to retain Performance
     * Insights data.
     */
    public fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention)

    /**
     * @param preferredMaintenanceWindow A preferred maintenance window day/time range. Should be
     * specified as a range ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC).
     * Example: 'Sun:23:45-Mon:00:15'
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
     * If not specified,
     * the cluster's vpcSubnets will be used to determine if the instance is internet-facing
     * or not.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ClusterInstanceOptions.Builder =
        software.amazon.awscdk.services.rds.ClusterInstanceOptions.builder()

    /**
     * @param allowMajorVersionUpgrade Whether to allow upgrade of major version for the DB
     * instance.
     */
    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * @param applyImmediately Specifies whether changes to the DB instance and any pending
     * modifications are applied immediately, regardless of the `preferredMaintenanceWindow` setting.
     * If set to `false`, changes are applied during the next maintenance window.
     *
     * Until RDS applies the changes, the DB instance remains in a drift state.
     * As a result, the configuration doesn't fully reflect the requested modifications and
     * temporarily diverges from the intended state.
     *
     * This property also determines whether the DB instance reboots when a static parameter is
     * modified in the associated DB parameter group.
     */
    override fun applyImmediately(applyImmediately: Boolean) {
      cdkBuilder.applyImmediately(applyImmediately)
    }

    /**
     * @param autoMinorVersionUpgrade Whether to enable automatic upgrade of minor version for the
     * DB instance.
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param availabilityZone The Availability Zone (AZ) where the database will be created.
     * For Amazon Aurora, each Aurora DB cluster hosts copies of its storage in three separate
     * Availability Zones.
     * Specify one of these Availability Zones. Aurora automatically chooses an appropriate
     * Availability Zone if you don't specify one.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param caCertificate The identifier of the CA certificate for this DB cluster's instances.
     * Specifying or updating this property triggers a reboot.
     *
     * For RDS DB engines:
     */
    override fun caCertificate(caCertificate: CaCertificate) {
      cdkBuilder.caCertificate(caCertificate.let(CaCertificate.Companion::unwrap))
    }

    /**
     * @param enablePerformanceInsights Whether to enable Performance Insights for the DB instance.
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /**
     * @param instanceIdentifier The identifier for the database instance.
     */
    override fun instanceIdentifier(instanceIdentifier: String) {
      cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    /**
     * @param isFromLegacyInstanceProps Only used for migrating existing clusters from using
     * `instanceProps` to `writer` and `readers`.
     */
    override fun isFromLegacyInstanceProps(isFromLegacyInstanceProps: Boolean) {
      cdkBuilder.isFromLegacyInstanceProps(isFromLegacyInstanceProps)
    }

    /**
     * @param parameterGroup The DB parameter group to associate with the instance.
     * This is only needed if you need to configure different parameter
     * groups for each individual instance, otherwise you should not
     * provide this and just use the cluster parameter group
     */
    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup.Companion::unwrap))
    }

    /**
     * @param parameters The parameters in the DBParameterGroup to create automatically.
     * You can only specify parameterGroup or parameters but not both.
     * You need to use a versioned engine to auto-generate a DBParameterGroup.
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance Insights
     * data.
     */
    override fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
      cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param performanceInsightRetention The amount of time, in days, to retain Performance
     * Insights data.
     */
    override
        fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention) {
      cdkBuilder.performanceInsightRetention(performanceInsightRetention.let(PerformanceInsightRetention.Companion::unwrap))
    }

    /**
     * @param preferredMaintenanceWindow A preferred maintenance window day/time range. Should be
     * specified as a range ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC).
     * Example: 'Sun:23:45-Mon:00:15'
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
     * If not specified,
     * the cluster's vpcSubnets will be used to determine if the instance is internet-facing
     * or not.
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public fun build(): software.amazon.awscdk.services.rds.ClusterInstanceOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.ClusterInstanceOptions,
  ) : CdkObject(cdkObject),
      ClusterInstanceOptions {
    /**
     * Whether to allow upgrade of major version for the DB instance.
     *
     * Default: - false
     */
    override fun allowMajorVersionUpgrade(): Boolean? = unwrap(this).getAllowMajorVersionUpgrade()

    /**
     * Specifies whether changes to the DB instance and any pending modifications are applied
     * immediately, regardless of the `preferredMaintenanceWindow` setting.
     *
     * If set to `false`, changes are applied during the next maintenance window.
     *
     * Until RDS applies the changes, the DB instance remains in a drift state.
     * As a result, the configuration doesn't fully reflect the requested modifications and
     * temporarily diverges from the intended state.
     *
     * This property also determines whether the DB instance reboots when a static parameter is
     * modified in the associated DB parameter group.
     *
     * Default: - Changes will be applied immediately
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Modifying.html)
     */
    override fun applyImmediately(): Boolean? = unwrap(this).getApplyImmediately()

    /**
     * Whether to enable automatic upgrade of minor version for the DB instance.
     *
     * Default: - true
     */
    override fun autoMinorVersionUpgrade(): Boolean? = unwrap(this).getAutoMinorVersionUpgrade()

    /**
     * The Availability Zone (AZ) where the database will be created.
     *
     * For Amazon Aurora, each Aurora DB cluster hosts copies of its storage in three separate
     * Availability Zones.
     * Specify one of these Availability Zones. Aurora automatically chooses an appropriate
     * Availability Zone if you don't specify one.
     *
     * Default: - A random, system-chosen Availability Zone in the endpointʼs AWS Region.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The identifier of the CA certificate for this DB cluster's instances.
     *
     * Specifying or updating this property triggers a reboot.
     *
     * For RDS DB engines:
     *
     * Default: - RDS will choose a certificate authority
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html)
     */
    override fun caCertificate(): CaCertificate? =
        unwrap(this).getCaCertificate()?.let(CaCertificate::wrap)

    /**
     * Whether to enable Performance Insights for the DB instance.
     *
     * Default: - false, unless ``performanceInsightRetention`` or
     * ``performanceInsightEncryptionKey`` is set.
     */
    override fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

    /**
     * The identifier for the database instance.
     *
     * Default: - CloudFormation generated identifier
     */
    override fun instanceIdentifier(): String? = unwrap(this).getInstanceIdentifier()

    /**
     * Only used for migrating existing clusters from using `instanceProps` to `writer` and
     * `readers`.
     *
     * Default: false
     *
     * Example:
     *
     * ```
     * // existing cluster
     * Vpc vpc;
     * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder()
     * .version(AuroraMysqlEngineVersion.VER_3_03_0)
     * .build()))
     * .instances(2)
     * .instanceProps(InstanceProps.builder()
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.SMALL))
     * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
     * .vpc(vpc)
     * .build())
     * .build();
     * // migration
     * Map&lt;String, Object&gt; instanceProps = Map.of(
     * "instanceType", InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.SMALL),
     * "isFromLegacyInstanceProps", true);
     * DatabaseCluster myCluster = DatabaseCluster.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder()
     * .version(AuroraMysqlEngineVersion.VER_3_03_0)
     * .build()))
     * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
     * .vpc(vpc)
     * .writer(ClusterInstance.provisioned("Instance1", ProvisionedClusterInstanceProps.builder()
     * .instanceType(instanceProps.getInstanceType())
     * .isFromLegacyInstanceProps(instanceProps.getIsFromLegacyInstanceProps())
     * .build()))
     * .readers(List.of(ClusterInstance.provisioned("Instance2",
     * ProvisionedClusterInstanceProps.builder()
     * .instanceType(instanceProps.getInstanceType())
     * .isFromLegacyInstanceProps(instanceProps.getIsFromLegacyInstanceProps())
     * .build())))
     * .build();
     * ```
     */
    override fun isFromLegacyInstanceProps(): Boolean? = unwrap(this).getIsFromLegacyInstanceProps()

    /**
     * The DB parameter group to associate with the instance.
     *
     * This is only needed if you need to configure different parameter
     * groups for each individual instance, otherwise you should not
     * provide this and just use the cluster parameter group
     *
     * Default: the cluster parameter group is used
     */
    override fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    /**
     * The parameters in the DBParameterGroup to create automatically.
     *
     * You can only specify parameterGroup or parameters but not both.
     * You need to use a versioned engine to auto-generate a DBParameterGroup.
     *
     * Default: - None
     */
    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    /**
     * The AWS KMS key for encryption of Performance Insights data.
     *
     * Default: - default master key
     */
    override fun performanceInsightEncryptionKey(): IKey? =
        unwrap(this).getPerformanceInsightEncryptionKey()?.let(IKey::wrap)

    /**
     * The amount of time, in days, to retain Performance Insights data.
     *
     * Default: 7
     */
    override fun performanceInsightRetention(): PerformanceInsightRetention? =
        unwrap(this).getPerformanceInsightRetention()?.let(PerformanceInsightRetention::wrap)

    /**
     * A preferred maintenance window day/time range. Should be specified as a range
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC).
     *
     * Example: 'Sun:23:45-Mon:00:15'
     *
     * Default: - 30-minute window selected at random from an 8-hour block of time for
     * each AWS Region, occurring on a random day of the week.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance)
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * Indicates whether the DB instance is an internet-facing instance.
     *
     * If not specified,
     * the cluster's vpcSubnets will be used to determine if the instance is internet-facing
     * or not.
     *
     * Default: - `true` if the cluster's `vpcSubnets` is `subnetType: SubnetType.PUBLIC`, `false`
     * otherwise
     */
    override fun publiclyAccessible(): Boolean? = unwrap(this).getPubliclyAccessible()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterInstanceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ClusterInstanceOptions):
        ClusterInstanceOptions = CdkObjectWrappers.wrap(cdkObject) as? ClusterInstanceOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterInstanceOptions):
        software.amazon.awscdk.services.rds.ClusterInstanceOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.ClusterInstanceOptions
  }
}
