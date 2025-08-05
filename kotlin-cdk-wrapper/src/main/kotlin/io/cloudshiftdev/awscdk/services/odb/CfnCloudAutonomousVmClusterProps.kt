@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.odb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCloudAutonomousVmCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.odb.*;
 * CfnCloudAutonomousVmClusterProps cfnCloudAutonomousVmClusterProps =
 * CfnCloudAutonomousVmClusterProps.builder()
 * .autonomousDataStorageSizeInTBs(123)
 * .cloudExadataInfrastructureId("cloudExadataInfrastructureId")
 * .cpuCoreCountPerNode(123)
 * .dbServers(List.of("dbServers"))
 * .description("description")
 * .displayName("displayName")
 * .isMtlsEnabledVmCluster(false)
 * .licenseModel("licenseModel")
 * .maintenanceWindow(MaintenanceWindowProperty.builder()
 * .daysOfWeek(List.of("daysOfWeek"))
 * .hoursOfDay(List.of(123))
 * .leadTimeInWeeks(123)
 * .months(List.of("months"))
 * .preference("preference")
 * .weeksOfMonth(List.of(123))
 * .build())
 * .memoryPerOracleComputeUnitInGBs(123)
 * .odbNetworkId("odbNetworkId")
 * .scanListenerPortNonTls(123)
 * .scanListenerPortTls(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .timeZone("timeZone")
 * .totalContainerDatabases(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html)
 */
public interface CfnCloudAutonomousVmClusterProps {
  /**
   * The data storage size allocated for Autonomous Databases in the Autonomous VM cluster, in TB.
   *
   * Required when creating an Autonomous VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-autonomousdatastoragesizeintbs)
   */
  public fun autonomousDataStorageSizeInTBs(): Number? =
      unwrap(this).getAutonomousDataStorageSizeInTBs()

  /**
   * The unique identifier of the Cloud Exadata Infrastructure containing this Autonomous VM
   * cluster.
   *
   * Required when creating an Autonomous VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-cloudexadatainfrastructureid)
   */
  public fun cloudExadataInfrastructureId(): String? =
      unwrap(this).getCloudExadataInfrastructureId()

  /**
   * The number of CPU cores enabled per node in the Autonomous VM cluster.
   *
   * Required when creating an Autonomous VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-cpucorecountpernode)
   */
  public fun cpuCoreCountPerNode(): Number? = unwrap(this).getCpuCoreCountPerNode()

  /**
   * The list of database servers associated with the Autonomous VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-dbservers)
   */
  public fun dbServers(): List<String> = unwrap(this).getDbServers() ?: emptyList()

  /**
   * The user-provided description of the Autonomous VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The display name of the Autonomous VM cluster.
   *
   * Required when creating an Autonomous VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * Specifies whether mutual TLS (mTLS) authentication is enabled for the Autonomous VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-ismtlsenabledvmcluster)
   */
  public fun isMtlsEnabledVmCluster(): Any? = unwrap(this).getIsMtlsEnabledVmCluster()

  /**
   * The Oracle license model that applies to the Autonomous VM cluster.
   *
   * Valid values are `LICENSE_INCLUDED` or `BRING_YOUR_OWN_LICENSE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-licensemodel)
   */
  public fun licenseModel(): String? = unwrap(this).getLicenseModel()

  /**
   * The scheduling details for the maintenance window.
   *
   * Patching and system updates take place during the maintenance window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow)
   */
  public fun maintenanceWindow(): Any? = unwrap(this).getMaintenanceWindow()

  /**
   * The amount of memory allocated per Oracle Compute Unit, in GB.
   *
   * Required when creating an Autonomous VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-memoryperoraclecomputeunitingbs)
   */
  public fun memoryPerOracleComputeUnitInGBs(): Number? =
      unwrap(this).getMemoryPerOracleComputeUnitInGBs()

  /**
   * The unique identifier of the ODB network associated with this Autonomous VM cluster.
   *
   * Required when creating an Autonomous VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-odbnetworkid)
   */
  public fun odbNetworkId(): String? = unwrap(this).getOdbNetworkId()

  /**
   * The SCAN listener port for non-TLS (TCP) protocol.
   *
   * The default is 1521.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-scanlistenerportnontls)
   */
  public fun scanListenerPortNonTls(): Number? = unwrap(this).getScanListenerPortNonTls()

  /**
   * The SCAN listener port for TLS (TCP) protocol.
   *
   * The default is 2484.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-scanlistenerporttls)
   */
  public fun scanListenerPortTls(): Number? = unwrap(this).getScanListenerPortTls()

  /**
   * Tags to assign to the Autonomous Vm Cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The time zone of the Autonomous VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-timezone)
   */
  public fun timeZone(): String? = unwrap(this).getTimeZone()

  /**
   * The total number of Autonomous Container Databases that can be created with the allocated local
   * storage.
   *
   * Required when creating an Autonomous VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-totalcontainerdatabases)
   */
  public fun totalContainerDatabases(): Number? = unwrap(this).getTotalContainerDatabases()

  /**
   * A builder for [CfnCloudAutonomousVmClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autonomousDataStorageSizeInTBs The data storage size allocated for Autonomous
     * Databases in the Autonomous VM cluster, in TB.
     * Required when creating an Autonomous VM cluster.
     */
    public fun autonomousDataStorageSizeInTBs(autonomousDataStorageSizeInTBs: Number)

    /**
     * @param cloudExadataInfrastructureId The unique identifier of the Cloud Exadata Infrastructure
     * containing this Autonomous VM cluster.
     * Required when creating an Autonomous VM cluster.
     */
    public fun cloudExadataInfrastructureId(cloudExadataInfrastructureId: String)

    /**
     * @param cpuCoreCountPerNode The number of CPU cores enabled per node in the Autonomous VM
     * cluster.
     * Required when creating an Autonomous VM cluster.
     */
    public fun cpuCoreCountPerNode(cpuCoreCountPerNode: Number)

    /**
     * @param dbServers The list of database servers associated with the Autonomous VM cluster.
     */
    public fun dbServers(dbServers: List<String>)

    /**
     * @param dbServers The list of database servers associated with the Autonomous VM cluster.
     */
    public fun dbServers(vararg dbServers: String)

    /**
     * @param description The user-provided description of the Autonomous VM cluster.
     */
    public fun description(description: String)

    /**
     * @param displayName The display name of the Autonomous VM cluster.
     * Required when creating an Autonomous VM cluster.
     */
    public fun displayName(displayName: String)

    /**
     * @param isMtlsEnabledVmCluster Specifies whether mutual TLS (mTLS) authentication is enabled
     * for the Autonomous VM cluster.
     */
    public fun isMtlsEnabledVmCluster(isMtlsEnabledVmCluster: Boolean)

    /**
     * @param isMtlsEnabledVmCluster Specifies whether mutual TLS (mTLS) authentication is enabled
     * for the Autonomous VM cluster.
     */
    public fun isMtlsEnabledVmCluster(isMtlsEnabledVmCluster: IResolvable)

    /**
     * @param licenseModel The Oracle license model that applies to the Autonomous VM cluster.
     * Valid values are `LICENSE_INCLUDED` or `BRING_YOUR_OWN_LICENSE` .
     */
    public fun licenseModel(licenseModel: String)

    /**
     * @param maintenanceWindow The scheduling details for the maintenance window.
     * Patching and system updates take place during the maintenance window.
     */
    public fun maintenanceWindow(maintenanceWindow: IResolvable)

    /**
     * @param maintenanceWindow The scheduling details for the maintenance window.
     * Patching and system updates take place during the maintenance window.
     */
    public
        fun maintenanceWindow(maintenanceWindow: CfnCloudAutonomousVmCluster.MaintenanceWindowProperty)

    /**
     * @param maintenanceWindow The scheduling details for the maintenance window.
     * Patching and system updates take place during the maintenance window.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4e25abb88e45fe7fcd403bcbedade7f102cc1db3f3666022a3e6147d8f8dc27")
    public
        fun maintenanceWindow(maintenanceWindow: CfnCloudAutonomousVmCluster.MaintenanceWindowProperty.Builder.() -> Unit)

    /**
     * @param memoryPerOracleComputeUnitInGBs The amount of memory allocated per Oracle Compute
     * Unit, in GB.
     * Required when creating an Autonomous VM cluster.
     */
    public fun memoryPerOracleComputeUnitInGBs(memoryPerOracleComputeUnitInGBs: Number)

    /**
     * @param odbNetworkId The unique identifier of the ODB network associated with this Autonomous
     * VM cluster.
     * Required when creating an Autonomous VM cluster.
     */
    public fun odbNetworkId(odbNetworkId: String)

    /**
     * @param scanListenerPortNonTls The SCAN listener port for non-TLS (TCP) protocol.
     * The default is 1521.
     */
    public fun scanListenerPortNonTls(scanListenerPortNonTls: Number)

    /**
     * @param scanListenerPortTls The SCAN listener port for TLS (TCP) protocol.
     * The default is 2484.
     */
    public fun scanListenerPortTls(scanListenerPortTls: Number)

    /**
     * @param tags Tags to assign to the Autonomous Vm Cluster.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags to assign to the Autonomous Vm Cluster.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param timeZone The time zone of the Autonomous VM cluster.
     */
    public fun timeZone(timeZone: String)

    /**
     * @param totalContainerDatabases The total number of Autonomous Container Databases that can be
     * created with the allocated local storage.
     * Required when creating an Autonomous VM cluster.
     */
    public fun totalContainerDatabases(totalContainerDatabases: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.odb.CfnCloudAutonomousVmClusterProps.Builder =
        software.amazon.awscdk.services.odb.CfnCloudAutonomousVmClusterProps.builder()

    /**
     * @param autonomousDataStorageSizeInTBs The data storage size allocated for Autonomous
     * Databases in the Autonomous VM cluster, in TB.
     * Required when creating an Autonomous VM cluster.
     */
    override fun autonomousDataStorageSizeInTBs(autonomousDataStorageSizeInTBs: Number) {
      cdkBuilder.autonomousDataStorageSizeInTBs(autonomousDataStorageSizeInTBs)
    }

    /**
     * @param cloudExadataInfrastructureId The unique identifier of the Cloud Exadata Infrastructure
     * containing this Autonomous VM cluster.
     * Required when creating an Autonomous VM cluster.
     */
    override fun cloudExadataInfrastructureId(cloudExadataInfrastructureId: String) {
      cdkBuilder.cloudExadataInfrastructureId(cloudExadataInfrastructureId)
    }

    /**
     * @param cpuCoreCountPerNode The number of CPU cores enabled per node in the Autonomous VM
     * cluster.
     * Required when creating an Autonomous VM cluster.
     */
    override fun cpuCoreCountPerNode(cpuCoreCountPerNode: Number) {
      cdkBuilder.cpuCoreCountPerNode(cpuCoreCountPerNode)
    }

    /**
     * @param dbServers The list of database servers associated with the Autonomous VM cluster.
     */
    override fun dbServers(dbServers: List<String>) {
      cdkBuilder.dbServers(dbServers)
    }

    /**
     * @param dbServers The list of database servers associated with the Autonomous VM cluster.
     */
    override fun dbServers(vararg dbServers: String): Unit = dbServers(dbServers.toList())

    /**
     * @param description The user-provided description of the Autonomous VM cluster.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The display name of the Autonomous VM cluster.
     * Required when creating an Autonomous VM cluster.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param isMtlsEnabledVmCluster Specifies whether mutual TLS (mTLS) authentication is enabled
     * for the Autonomous VM cluster.
     */
    override fun isMtlsEnabledVmCluster(isMtlsEnabledVmCluster: Boolean) {
      cdkBuilder.isMtlsEnabledVmCluster(isMtlsEnabledVmCluster)
    }

    /**
     * @param isMtlsEnabledVmCluster Specifies whether mutual TLS (mTLS) authentication is enabled
     * for the Autonomous VM cluster.
     */
    override fun isMtlsEnabledVmCluster(isMtlsEnabledVmCluster: IResolvable) {
      cdkBuilder.isMtlsEnabledVmCluster(isMtlsEnabledVmCluster.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param licenseModel The Oracle license model that applies to the Autonomous VM cluster.
     * Valid values are `LICENSE_INCLUDED` or `BRING_YOUR_OWN_LICENSE` .
     */
    override fun licenseModel(licenseModel: String) {
      cdkBuilder.licenseModel(licenseModel)
    }

    /**
     * @param maintenanceWindow The scheduling details for the maintenance window.
     * Patching and system updates take place during the maintenance window.
     */
    override fun maintenanceWindow(maintenanceWindow: IResolvable) {
      cdkBuilder.maintenanceWindow(maintenanceWindow.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param maintenanceWindow The scheduling details for the maintenance window.
     * Patching and system updates take place during the maintenance window.
     */
    override
        fun maintenanceWindow(maintenanceWindow: CfnCloudAutonomousVmCluster.MaintenanceWindowProperty) {
      cdkBuilder.maintenanceWindow(maintenanceWindow.let(CfnCloudAutonomousVmCluster.MaintenanceWindowProperty.Companion::unwrap))
    }

    /**
     * @param maintenanceWindow The scheduling details for the maintenance window.
     * Patching and system updates take place during the maintenance window.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4e25abb88e45fe7fcd403bcbedade7f102cc1db3f3666022a3e6147d8f8dc27")
    override
        fun maintenanceWindow(maintenanceWindow: CfnCloudAutonomousVmCluster.MaintenanceWindowProperty.Builder.() -> Unit):
        Unit =
        maintenanceWindow(CfnCloudAutonomousVmCluster.MaintenanceWindowProperty(maintenanceWindow))

    /**
     * @param memoryPerOracleComputeUnitInGBs The amount of memory allocated per Oracle Compute
     * Unit, in GB.
     * Required when creating an Autonomous VM cluster.
     */
    override fun memoryPerOracleComputeUnitInGBs(memoryPerOracleComputeUnitInGBs: Number) {
      cdkBuilder.memoryPerOracleComputeUnitInGBs(memoryPerOracleComputeUnitInGBs)
    }

    /**
     * @param odbNetworkId The unique identifier of the ODB network associated with this Autonomous
     * VM cluster.
     * Required when creating an Autonomous VM cluster.
     */
    override fun odbNetworkId(odbNetworkId: String) {
      cdkBuilder.odbNetworkId(odbNetworkId)
    }

    /**
     * @param scanListenerPortNonTls The SCAN listener port for non-TLS (TCP) protocol.
     * The default is 1521.
     */
    override fun scanListenerPortNonTls(scanListenerPortNonTls: Number) {
      cdkBuilder.scanListenerPortNonTls(scanListenerPortNonTls)
    }

    /**
     * @param scanListenerPortTls The SCAN listener port for TLS (TCP) protocol.
     * The default is 2484.
     */
    override fun scanListenerPortTls(scanListenerPortTls: Number) {
      cdkBuilder.scanListenerPortTls(scanListenerPortTls)
    }

    /**
     * @param tags Tags to assign to the Autonomous Vm Cluster.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags to assign to the Autonomous Vm Cluster.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param timeZone The time zone of the Autonomous VM cluster.
     */
    override fun timeZone(timeZone: String) {
      cdkBuilder.timeZone(timeZone)
    }

    /**
     * @param totalContainerDatabases The total number of Autonomous Container Databases that can be
     * created with the allocated local storage.
     * Required when creating an Autonomous VM cluster.
     */
    override fun totalContainerDatabases(totalContainerDatabases: Number) {
      cdkBuilder.totalContainerDatabases(totalContainerDatabases)
    }

    public fun build(): software.amazon.awscdk.services.odb.CfnCloudAutonomousVmClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.odb.CfnCloudAutonomousVmClusterProps,
  ) : CdkObject(cdkObject),
      CfnCloudAutonomousVmClusterProps {
    /**
     * The data storage size allocated for Autonomous Databases in the Autonomous VM cluster, in TB.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-autonomousdatastoragesizeintbs)
     */
    override fun autonomousDataStorageSizeInTBs(): Number? =
        unwrap(this).getAutonomousDataStorageSizeInTBs()

    /**
     * The unique identifier of the Cloud Exadata Infrastructure containing this Autonomous VM
     * cluster.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-cloudexadatainfrastructureid)
     */
    override fun cloudExadataInfrastructureId(): String? =
        unwrap(this).getCloudExadataInfrastructureId()

    /**
     * The number of CPU cores enabled per node in the Autonomous VM cluster.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-cpucorecountpernode)
     */
    override fun cpuCoreCountPerNode(): Number? = unwrap(this).getCpuCoreCountPerNode()

    /**
     * The list of database servers associated with the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-dbservers)
     */
    override fun dbServers(): List<String> = unwrap(this).getDbServers() ?: emptyList()

    /**
     * The user-provided description of the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The display name of the Autonomous VM cluster.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * Specifies whether mutual TLS (mTLS) authentication is enabled for the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-ismtlsenabledvmcluster)
     */
    override fun isMtlsEnabledVmCluster(): Any? = unwrap(this).getIsMtlsEnabledVmCluster()

    /**
     * The Oracle license model that applies to the Autonomous VM cluster.
     *
     * Valid values are `LICENSE_INCLUDED` or `BRING_YOUR_OWN_LICENSE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-licensemodel)
     */
    override fun licenseModel(): String? = unwrap(this).getLicenseModel()

    /**
     * The scheduling details for the maintenance window.
     *
     * Patching and system updates take place during the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow)
     */
    override fun maintenanceWindow(): Any? = unwrap(this).getMaintenanceWindow()

    /**
     * The amount of memory allocated per Oracle Compute Unit, in GB.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-memoryperoraclecomputeunitingbs)
     */
    override fun memoryPerOracleComputeUnitInGBs(): Number? =
        unwrap(this).getMemoryPerOracleComputeUnitInGBs()

    /**
     * The unique identifier of the ODB network associated with this Autonomous VM cluster.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-odbnetworkid)
     */
    override fun odbNetworkId(): String? = unwrap(this).getOdbNetworkId()

    /**
     * The SCAN listener port for non-TLS (TCP) protocol.
     *
     * The default is 1521.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-scanlistenerportnontls)
     */
    override fun scanListenerPortNonTls(): Number? = unwrap(this).getScanListenerPortNonTls()

    /**
     * The SCAN listener port for TLS (TCP) protocol.
     *
     * The default is 2484.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-scanlistenerporttls)
     */
    override fun scanListenerPortTls(): Number? = unwrap(this).getScanListenerPortTls()

    /**
     * Tags to assign to the Autonomous Vm Cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The time zone of the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-timezone)
     */
    override fun timeZone(): String? = unwrap(this).getTimeZone()

    /**
     * The total number of Autonomous Container Databases that can be created with the allocated
     * local storage.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-totalcontainerdatabases)
     */
    override fun totalContainerDatabases(): Number? = unwrap(this).getTotalContainerDatabases()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCloudAutonomousVmClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.odb.CfnCloudAutonomousVmClusterProps):
        CfnCloudAutonomousVmClusterProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCloudAutonomousVmClusterProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCloudAutonomousVmClusterProps):
        software.amazon.awscdk.services.odb.CfnCloudAutonomousVmClusterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.odb.CfnCloudAutonomousVmClusterProps
  }
}
