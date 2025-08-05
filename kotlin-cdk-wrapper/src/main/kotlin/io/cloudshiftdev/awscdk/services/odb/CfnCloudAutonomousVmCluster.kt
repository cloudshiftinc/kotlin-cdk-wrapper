@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.odb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ODB::CloudAutonomousVmCluster` resource creates an Autonomous VM cluster.
 *
 * An Autonomous VM cluster provides the infrastructure for running Autonomous Databases.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.odb.*;
 * CfnCloudAutonomousVmCluster cfnCloudAutonomousVmCluster =
 * CfnCloudAutonomousVmCluster.Builder.create(this, "MyCfnCloudAutonomousVmCluster")
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
public open class CfnCloudAutonomousVmCluster(
  cdkObject: software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCloudAutonomousVmClusterProps,
  ) :
      this(software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCloudAutonomousVmClusterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCloudAutonomousVmClusterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCloudAutonomousVmClusterProps(props)
  )

  /**
   * The percentage of data storage currently in use for Autonomous Databases in the Autonomous VM
   * cluster.
   */
  public open fun attrAutonomousDataStoragePercentage(): IResolvable =
      unwrap(this).getAttrAutonomousDataStoragePercentage().let(IResolvable::wrap)

  /**
   * The available data storage space for Autonomous Databases in the Autonomous VM cluster, in TB.
   */
  public open fun attrAvailableAutonomousDataStorageSizeInTBs(): IResolvable =
      unwrap(this).getAttrAvailableAutonomousDataStorageSizeInTBs().let(IResolvable::wrap)

  /**
   * The number of Autonomous CDBs that you can create with the currently available storage.
   */
  public open fun attrAvailableContainerDatabases(): Number =
      unwrap(this).getAttrAvailableContainerDatabases()

  /**
   * The number of CPU cores available for allocation to Autonomous Databases.
   */
  public open fun attrAvailableCpus(): IResolvable =
      unwrap(this).getAttrAvailableCpus().let(IResolvable::wrap)

  /**
   * The Amazon Resource Name (ARN) for the Autonomous VM cluster.
   */
  public open fun attrCloudAutonomousVmClusterArn(): String =
      unwrap(this).getAttrCloudAutonomousVmClusterArn()

  /**
   * The unique identifier of the Autonomous VM cluster.
   */
  public open fun attrCloudAutonomousVmClusterId(): String =
      unwrap(this).getAttrCloudAutonomousVmClusterId()

  /**
   * The compute model of the Autonomous VM cluster: ECPU or OCPU.
   */
  public open fun attrComputeModel(): String = unwrap(this).getAttrComputeModel()

  /**
   * The total number of CPU cores in the Autonomous VM cluster.
   */
  public open fun attrCpuCoreCount(): Number = unwrap(this).getAttrCpuCoreCount()

  /**
   * The percentage of total CPU cores currently in use in the Autonomous VM cluster.
   */
  public open fun attrCpuPercentage(): IResolvable =
      unwrap(this).getAttrCpuPercentage().let(IResolvable::wrap)

  /**
   * The total data storage allocated to the Autonomous VM cluster, in GB.
   */
  public open fun attrDataStorageSizeInGBs(): IResolvable =
      unwrap(this).getAttrDataStorageSizeInGBs().let(IResolvable::wrap)

  /**
   * The total data storage allocated to the Autonomous VM cluster, in TB.
   */
  public open fun attrDataStorageSizeInTBs(): IResolvable =
      unwrap(this).getAttrDataStorageSizeInTBs().let(IResolvable::wrap)

  /**
   * The local node storage allocated to the Autonomous VM cluster, in gigabytes (GB).
   */
  public open fun attrDbNodeStorageSizeInGBs(): Number =
      unwrap(this).getAttrDbNodeStorageSizeInGBs()

  /**
   * The domain name for the Autonomous VM cluster.
   */
  public open fun attrDomain(): String = unwrap(this).getAttrDomain()

  /**
   * The minimum value to which you can scale down the Exadata storage, in TB.
   */
  public open fun attrExadataStorageInTBsLowestScaledValue(): IResolvable =
      unwrap(this).getAttrExadataStorageInTBsLowestScaledValue().let(IResolvable::wrap)

  /**
   * The hostname for the Autonomous VM cluster.
   */
  public open fun attrHostname(): String = unwrap(this).getAttrHostname()

  /**
   * The minimum value to which you can scale down the maximum number of Autonomous CDBs.
   */
  public open fun attrMaxAcdsLowestScaledValue(): Number =
      unwrap(this).getAttrMaxAcdsLowestScaledValue()

  /**
   * The total amount of memory allocated to the Autonomous VM cluster, in gigabytes (GB).
   */
  public open fun attrMemorySizeInGBs(): Number = unwrap(this).getAttrMemorySizeInGBs()

  /**
   * The number of database server nodes in the Autonomous VM cluster.
   */
  public open fun attrNodeCount(): Number = unwrap(this).getAttrNodeCount()

  /**
   * The number of Autonomous CDBs that can't be provisioned because of resource constraints.
   */
  public open fun attrNonProvisionableAutonomousContainerDatabases(): Number =
      unwrap(this).getAttrNonProvisionableAutonomousContainerDatabases()

  /**
   * The name of the OCI resource anchor associated with this Autonomous VM cluster.
   */
  public open fun attrOciResourceAnchorName(): String = unwrap(this).getAttrOciResourceAnchorName()

  /**
   * The URL for accessing the OCI console page for this Autonomous VM cluster.
   */
  public open fun attrOciUrl(): String = unwrap(this).getAttrOciUrl()

  /**
   * The Oracle Cloud Identifier (OCID) of the Autonomous VM cluster.
   */
  public open fun attrOcid(): String = unwrap(this).getAttrOcid()

  /**
   * The number of Autonomous CDBs that can be provisioned in the Autonomous VM cluster.
   */
  public open fun attrProvisionableAutonomousContainerDatabases(): Number =
      unwrap(this).getAttrProvisionableAutonomousContainerDatabases()

  /**
   * The number of Autonomous CDBs currently provisioned in the Autonomous VM cluster.
   */
  public open fun attrProvisionedAutonomousContainerDatabases(): Number =
      unwrap(this).getAttrProvisionedAutonomousContainerDatabases()

  /**
   * The number of CPU cores currently provisioned in the Autonomous VM cluster.
   */
  public open fun attrProvisionedCpus(): IResolvable =
      unwrap(this).getAttrProvisionedCpus().let(IResolvable::wrap)

  /**
   * The number of CPU cores that can be reclaimed from terminated or scaled-down Autonomous
   * Databases.
   */
  public open fun attrReclaimableCpus(): IResolvable =
      unwrap(this).getAttrReclaimableCpus().let(IResolvable::wrap)

  /**
   * The number of CPU cores reserved for system operations and redundancy.
   */
  public open fun attrReservedCpus(): IResolvable =
      unwrap(this).getAttrReservedCpus().let(IResolvable::wrap)

  /**
   * The shape of the Exadata infrastructure for the Autonomous VM cluster.
   */
  public open fun attrShape(): String = unwrap(this).getAttrShape()

  /**
   * The data storage size allocated for Autonomous Databases in the Autonomous VM cluster, in TB.
   */
  public open fun autonomousDataStorageSizeInTBs(): Number? =
      unwrap(this).getAutonomousDataStorageSizeInTBs()

  /**
   * The data storage size allocated for Autonomous Databases in the Autonomous VM cluster, in TB.
   */
  public open fun autonomousDataStorageSizeInTBs(`value`: Number) {
    unwrap(this).setAutonomousDataStorageSizeInTBs(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The unique identifier of the Cloud Exadata Infrastructure containing this Autonomous VM
   * cluster.
   */
  public open fun cloudExadataInfrastructureId(): String? =
      unwrap(this).getCloudExadataInfrastructureId()

  /**
   * The unique identifier of the Cloud Exadata Infrastructure containing this Autonomous VM
   * cluster.
   */
  public open fun cloudExadataInfrastructureId(`value`: String) {
    unwrap(this).setCloudExadataInfrastructureId(`value`)
  }

  /**
   * The number of CPU cores enabled per node in the Autonomous VM cluster.
   */
  public open fun cpuCoreCountPerNode(): Number? = unwrap(this).getCpuCoreCountPerNode()

  /**
   * The number of CPU cores enabled per node in the Autonomous VM cluster.
   */
  public open fun cpuCoreCountPerNode(`value`: Number) {
    unwrap(this).setCpuCoreCountPerNode(`value`)
  }

  /**
   * The list of database servers associated with the Autonomous VM cluster.
   */
  public open fun dbServers(): List<String> = unwrap(this).getDbServers() ?: emptyList()

  /**
   * The list of database servers associated with the Autonomous VM cluster.
   */
  public open fun dbServers(`value`: List<String>) {
    unwrap(this).setDbServers(`value`)
  }

  /**
   * The list of database servers associated with the Autonomous VM cluster.
   */
  public open fun dbServers(vararg `value`: String): Unit = dbServers(`value`.toList())

  /**
   * The user-provided description of the Autonomous VM cluster.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The user-provided description of the Autonomous VM cluster.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The display name of the Autonomous VM cluster.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The display name of the Autonomous VM cluster.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Specifies whether mutual TLS (mTLS) authentication is enabled for the Autonomous VM cluster.
   */
  public open fun isMtlsEnabledVmCluster(): Any? = unwrap(this).getIsMtlsEnabledVmCluster()

  /**
   * Specifies whether mutual TLS (mTLS) authentication is enabled for the Autonomous VM cluster.
   */
  public open fun isMtlsEnabledVmCluster(`value`: Boolean) {
    unwrap(this).setIsMtlsEnabledVmCluster(`value`)
  }

  /**
   * Specifies whether mutual TLS (mTLS) authentication is enabled for the Autonomous VM cluster.
   */
  public open fun isMtlsEnabledVmCluster(`value`: IResolvable) {
    unwrap(this).setIsMtlsEnabledVmCluster(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Oracle license model that applies to the Autonomous VM cluster.
   */
  public open fun licenseModel(): String? = unwrap(this).getLicenseModel()

  /**
   * The Oracle license model that applies to the Autonomous VM cluster.
   */
  public open fun licenseModel(`value`: String) {
    unwrap(this).setLicenseModel(`value`)
  }

  /**
   * The scheduling details for the maintenance window.
   */
  public open fun maintenanceWindow(): Any? = unwrap(this).getMaintenanceWindow()

  /**
   * The scheduling details for the maintenance window.
   */
  public open fun maintenanceWindow(`value`: IResolvable) {
    unwrap(this).setMaintenanceWindow(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The scheduling details for the maintenance window.
   */
  public open fun maintenanceWindow(`value`: MaintenanceWindowProperty) {
    unwrap(this).setMaintenanceWindow(`value`.let(MaintenanceWindowProperty.Companion::unwrap))
  }

  /**
   * The scheduling details for the maintenance window.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("237764f455022b5e8b7c54af045b55f3c0f55dca8630d2e74095db3bf0232aa1")
  public open fun maintenanceWindow(`value`: MaintenanceWindowProperty.Builder.() -> Unit): Unit =
      maintenanceWindow(MaintenanceWindowProperty(`value`))

  /**
   * The amount of memory allocated per Oracle Compute Unit, in GB.
   */
  public open fun memoryPerOracleComputeUnitInGBs(): Number? =
      unwrap(this).getMemoryPerOracleComputeUnitInGBs()

  /**
   * The amount of memory allocated per Oracle Compute Unit, in GB.
   */
  public open fun memoryPerOracleComputeUnitInGBs(`value`: Number) {
    unwrap(this).setMemoryPerOracleComputeUnitInGBs(`value`)
  }

  /**
   * The unique identifier of the ODB network associated with this Autonomous VM cluster.
   */
  public open fun odbNetworkId(): String? = unwrap(this).getOdbNetworkId()

  /**
   * The unique identifier of the ODB network associated with this Autonomous VM cluster.
   */
  public open fun odbNetworkId(`value`: String) {
    unwrap(this).setOdbNetworkId(`value`)
  }

  /**
   * The SCAN listener port for non-TLS (TCP) protocol.
   */
  public open fun scanListenerPortNonTls(): Number? = unwrap(this).getScanListenerPortNonTls()

  /**
   * The SCAN listener port for non-TLS (TCP) protocol.
   */
  public open fun scanListenerPortNonTls(`value`: Number) {
    unwrap(this).setScanListenerPortNonTls(`value`)
  }

  /**
   * The SCAN listener port for TLS (TCP) protocol.
   */
  public open fun scanListenerPortTls(): Number? = unwrap(this).getScanListenerPortTls()

  /**
   * The SCAN listener port for TLS (TCP) protocol.
   */
  public open fun scanListenerPortTls(`value`: Number) {
    unwrap(this).setScanListenerPortTls(`value`)
  }

  /**
   * Tags to assign to the Autonomous Vm Cluster.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Tags to assign to the Autonomous Vm Cluster.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Tags to assign to the Autonomous Vm Cluster.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The time zone of the Autonomous VM cluster.
   */
  public open fun timeZone(): String? = unwrap(this).getTimeZone()

  /**
   * The time zone of the Autonomous VM cluster.
   */
  public open fun timeZone(`value`: String) {
    unwrap(this).setTimeZone(`value`)
  }

  /**
   * The total number of Autonomous Container Databases that can be created with the allocated local
   * storage.
   */
  public open fun totalContainerDatabases(): Number? = unwrap(this).getTotalContainerDatabases()

  /**
   * The total number of Autonomous Container Databases that can be created with the allocated local
   * storage.
   */
  public open fun totalContainerDatabases(`value`: Number) {
    unwrap(this).setTotalContainerDatabases(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.odb.CfnCloudAutonomousVmCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The data storage size allocated for Autonomous Databases in the Autonomous VM cluster, in TB.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-autonomousdatastoragesizeintbs)
     * @param autonomousDataStorageSizeInTBs The data storage size allocated for Autonomous
     * Databases in the Autonomous VM cluster, in TB. 
     */
    public fun autonomousDataStorageSizeInTBs(autonomousDataStorageSizeInTBs: Number)

    /**
     * The unique identifier of the Cloud Exadata Infrastructure containing this Autonomous VM
     * cluster.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-cloudexadatainfrastructureid)
     * @param cloudExadataInfrastructureId The unique identifier of the Cloud Exadata Infrastructure
     * containing this Autonomous VM cluster. 
     */
    public fun cloudExadataInfrastructureId(cloudExadataInfrastructureId: String)

    /**
     * The number of CPU cores enabled per node in the Autonomous VM cluster.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-cpucorecountpernode)
     * @param cpuCoreCountPerNode The number of CPU cores enabled per node in the Autonomous VM
     * cluster. 
     */
    public fun cpuCoreCountPerNode(cpuCoreCountPerNode: Number)

    /**
     * The list of database servers associated with the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-dbservers)
     * @param dbServers The list of database servers associated with the Autonomous VM cluster. 
     */
    public fun dbServers(dbServers: List<String>)

    /**
     * The list of database servers associated with the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-dbservers)
     * @param dbServers The list of database servers associated with the Autonomous VM cluster. 
     */
    public fun dbServers(vararg dbServers: String)

    /**
     * The user-provided description of the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-description)
     * @param description The user-provided description of the Autonomous VM cluster. 
     */
    public fun description(description: String)

    /**
     * The display name of the Autonomous VM cluster.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-displayname)
     * @param displayName The display name of the Autonomous VM cluster. 
     */
    public fun displayName(displayName: String)

    /**
     * Specifies whether mutual TLS (mTLS) authentication is enabled for the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-ismtlsenabledvmcluster)
     * @param isMtlsEnabledVmCluster Specifies whether mutual TLS (mTLS) authentication is enabled
     * for the Autonomous VM cluster. 
     */
    public fun isMtlsEnabledVmCluster(isMtlsEnabledVmCluster: Boolean)

    /**
     * Specifies whether mutual TLS (mTLS) authentication is enabled for the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-ismtlsenabledvmcluster)
     * @param isMtlsEnabledVmCluster Specifies whether mutual TLS (mTLS) authentication is enabled
     * for the Autonomous VM cluster. 
     */
    public fun isMtlsEnabledVmCluster(isMtlsEnabledVmCluster: IResolvable)

    /**
     * The Oracle license model that applies to the Autonomous VM cluster.
     *
     * Valid values are `LICENSE_INCLUDED` or `BRING_YOUR_OWN_LICENSE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-licensemodel)
     * @param licenseModel The Oracle license model that applies to the Autonomous VM cluster. 
     */
    public fun licenseModel(licenseModel: String)

    /**
     * The scheduling details for the maintenance window.
     *
     * Patching and system updates take place during the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow)
     * @param maintenanceWindow The scheduling details for the maintenance window. 
     */
    public fun maintenanceWindow(maintenanceWindow: IResolvable)

    /**
     * The scheduling details for the maintenance window.
     *
     * Patching and system updates take place during the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow)
     * @param maintenanceWindow The scheduling details for the maintenance window. 
     */
    public fun maintenanceWindow(maintenanceWindow: MaintenanceWindowProperty)

    /**
     * The scheduling details for the maintenance window.
     *
     * Patching and system updates take place during the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow)
     * @param maintenanceWindow The scheduling details for the maintenance window. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a263f5c2815c6c3596de14441e070b433c16a017f54eef5592a5421f583528ed")
    public fun maintenanceWindow(maintenanceWindow: MaintenanceWindowProperty.Builder.() -> Unit)

    /**
     * The amount of memory allocated per Oracle Compute Unit, in GB.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-memoryperoraclecomputeunitingbs)
     * @param memoryPerOracleComputeUnitInGBs The amount of memory allocated per Oracle Compute
     * Unit, in GB. 
     */
    public fun memoryPerOracleComputeUnitInGBs(memoryPerOracleComputeUnitInGBs: Number)

    /**
     * The unique identifier of the ODB network associated with this Autonomous VM cluster.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-odbnetworkid)
     * @param odbNetworkId The unique identifier of the ODB network associated with this Autonomous
     * VM cluster. 
     */
    public fun odbNetworkId(odbNetworkId: String)

    /**
     * The SCAN listener port for non-TLS (TCP) protocol.
     *
     * The default is 1521.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-scanlistenerportnontls)
     * @param scanListenerPortNonTls The SCAN listener port for non-TLS (TCP) protocol. 
     */
    public fun scanListenerPortNonTls(scanListenerPortNonTls: Number)

    /**
     * The SCAN listener port for TLS (TCP) protocol.
     *
     * The default is 2484.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-scanlistenerporttls)
     * @param scanListenerPortTls The SCAN listener port for TLS (TCP) protocol. 
     */
    public fun scanListenerPortTls(scanListenerPortTls: Number)

    /**
     * Tags to assign to the Autonomous Vm Cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-tags)
     * @param tags Tags to assign to the Autonomous Vm Cluster. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags to assign to the Autonomous Vm Cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-tags)
     * @param tags Tags to assign to the Autonomous Vm Cluster. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The time zone of the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-timezone)
     * @param timeZone The time zone of the Autonomous VM cluster. 
     */
    public fun timeZone(timeZone: String)

    /**
     * The total number of Autonomous Container Databases that can be created with the allocated
     * local storage.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-totalcontainerdatabases)
     * @param totalContainerDatabases The total number of Autonomous Container Databases that can be
     * created with the allocated local storage. 
     */
    public fun totalContainerDatabases(totalContainerDatabases: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster.Builder
        = software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster.Builder.create(scope, id)

    /**
     * The data storage size allocated for Autonomous Databases in the Autonomous VM cluster, in TB.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-autonomousdatastoragesizeintbs)
     * @param autonomousDataStorageSizeInTBs The data storage size allocated for Autonomous
     * Databases in the Autonomous VM cluster, in TB. 
     */
    override fun autonomousDataStorageSizeInTBs(autonomousDataStorageSizeInTBs: Number) {
      cdkBuilder.autonomousDataStorageSizeInTBs(autonomousDataStorageSizeInTBs)
    }

    /**
     * The unique identifier of the Cloud Exadata Infrastructure containing this Autonomous VM
     * cluster.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-cloudexadatainfrastructureid)
     * @param cloudExadataInfrastructureId The unique identifier of the Cloud Exadata Infrastructure
     * containing this Autonomous VM cluster. 
     */
    override fun cloudExadataInfrastructureId(cloudExadataInfrastructureId: String) {
      cdkBuilder.cloudExadataInfrastructureId(cloudExadataInfrastructureId)
    }

    /**
     * The number of CPU cores enabled per node in the Autonomous VM cluster.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-cpucorecountpernode)
     * @param cpuCoreCountPerNode The number of CPU cores enabled per node in the Autonomous VM
     * cluster. 
     */
    override fun cpuCoreCountPerNode(cpuCoreCountPerNode: Number) {
      cdkBuilder.cpuCoreCountPerNode(cpuCoreCountPerNode)
    }

    /**
     * The list of database servers associated with the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-dbservers)
     * @param dbServers The list of database servers associated with the Autonomous VM cluster. 
     */
    override fun dbServers(dbServers: List<String>) {
      cdkBuilder.dbServers(dbServers)
    }

    /**
     * The list of database servers associated with the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-dbservers)
     * @param dbServers The list of database servers associated with the Autonomous VM cluster. 
     */
    override fun dbServers(vararg dbServers: String): Unit = dbServers(dbServers.toList())

    /**
     * The user-provided description of the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-description)
     * @param description The user-provided description of the Autonomous VM cluster. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The display name of the Autonomous VM cluster.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-displayname)
     * @param displayName The display name of the Autonomous VM cluster. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * Specifies whether mutual TLS (mTLS) authentication is enabled for the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-ismtlsenabledvmcluster)
     * @param isMtlsEnabledVmCluster Specifies whether mutual TLS (mTLS) authentication is enabled
     * for the Autonomous VM cluster. 
     */
    override fun isMtlsEnabledVmCluster(isMtlsEnabledVmCluster: Boolean) {
      cdkBuilder.isMtlsEnabledVmCluster(isMtlsEnabledVmCluster)
    }

    /**
     * Specifies whether mutual TLS (mTLS) authentication is enabled for the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-ismtlsenabledvmcluster)
     * @param isMtlsEnabledVmCluster Specifies whether mutual TLS (mTLS) authentication is enabled
     * for the Autonomous VM cluster. 
     */
    override fun isMtlsEnabledVmCluster(isMtlsEnabledVmCluster: IResolvable) {
      cdkBuilder.isMtlsEnabledVmCluster(isMtlsEnabledVmCluster.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Oracle license model that applies to the Autonomous VM cluster.
     *
     * Valid values are `LICENSE_INCLUDED` or `BRING_YOUR_OWN_LICENSE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-licensemodel)
     * @param licenseModel The Oracle license model that applies to the Autonomous VM cluster. 
     */
    override fun licenseModel(licenseModel: String) {
      cdkBuilder.licenseModel(licenseModel)
    }

    /**
     * The scheduling details for the maintenance window.
     *
     * Patching and system updates take place during the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow)
     * @param maintenanceWindow The scheduling details for the maintenance window. 
     */
    override fun maintenanceWindow(maintenanceWindow: IResolvable) {
      cdkBuilder.maintenanceWindow(maintenanceWindow.let(IResolvable.Companion::unwrap))
    }

    /**
     * The scheduling details for the maintenance window.
     *
     * Patching and system updates take place during the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow)
     * @param maintenanceWindow The scheduling details for the maintenance window. 
     */
    override fun maintenanceWindow(maintenanceWindow: MaintenanceWindowProperty) {
      cdkBuilder.maintenanceWindow(maintenanceWindow.let(MaintenanceWindowProperty.Companion::unwrap))
    }

    /**
     * The scheduling details for the maintenance window.
     *
     * Patching and system updates take place during the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow)
     * @param maintenanceWindow The scheduling details for the maintenance window. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a263f5c2815c6c3596de14441e070b433c16a017f54eef5592a5421f583528ed")
    override fun maintenanceWindow(maintenanceWindow: MaintenanceWindowProperty.Builder.() -> Unit):
        Unit = maintenanceWindow(MaintenanceWindowProperty(maintenanceWindow))

    /**
     * The amount of memory allocated per Oracle Compute Unit, in GB.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-memoryperoraclecomputeunitingbs)
     * @param memoryPerOracleComputeUnitInGBs The amount of memory allocated per Oracle Compute
     * Unit, in GB. 
     */
    override fun memoryPerOracleComputeUnitInGBs(memoryPerOracleComputeUnitInGBs: Number) {
      cdkBuilder.memoryPerOracleComputeUnitInGBs(memoryPerOracleComputeUnitInGBs)
    }

    /**
     * The unique identifier of the ODB network associated with this Autonomous VM cluster.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-odbnetworkid)
     * @param odbNetworkId The unique identifier of the ODB network associated with this Autonomous
     * VM cluster. 
     */
    override fun odbNetworkId(odbNetworkId: String) {
      cdkBuilder.odbNetworkId(odbNetworkId)
    }

    /**
     * The SCAN listener port for non-TLS (TCP) protocol.
     *
     * The default is 1521.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-scanlistenerportnontls)
     * @param scanListenerPortNonTls The SCAN listener port for non-TLS (TCP) protocol. 
     */
    override fun scanListenerPortNonTls(scanListenerPortNonTls: Number) {
      cdkBuilder.scanListenerPortNonTls(scanListenerPortNonTls)
    }

    /**
     * The SCAN listener port for TLS (TCP) protocol.
     *
     * The default is 2484.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-scanlistenerporttls)
     * @param scanListenerPortTls The SCAN listener port for TLS (TCP) protocol. 
     */
    override fun scanListenerPortTls(scanListenerPortTls: Number) {
      cdkBuilder.scanListenerPortTls(scanListenerPortTls)
    }

    /**
     * Tags to assign to the Autonomous Vm Cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-tags)
     * @param tags Tags to assign to the Autonomous Vm Cluster. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Tags to assign to the Autonomous Vm Cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-tags)
     * @param tags Tags to assign to the Autonomous Vm Cluster. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The time zone of the Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-timezone)
     * @param timeZone The time zone of the Autonomous VM cluster. 
     */
    override fun timeZone(timeZone: String) {
      cdkBuilder.timeZone(timeZone)
    }

    /**
     * The total number of Autonomous Container Databases that can be created with the allocated
     * local storage.
     *
     * Required when creating an Autonomous VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudautonomousvmcluster.html#cfn-odb-cloudautonomousvmcluster-totalcontainerdatabases)
     * @param totalContainerDatabases The total number of Autonomous Container Databases that can be
     * created with the allocated local storage. 
     */
    override fun totalContainerDatabases(totalContainerDatabases: Number) {
      cdkBuilder.totalContainerDatabases(totalContainerDatabases)
    }

    public fun build(): software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCloudAutonomousVmCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCloudAutonomousVmCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster):
        CfnCloudAutonomousVmCluster = CfnCloudAutonomousVmCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCloudAutonomousVmCluster):
        software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster = wrapped.cdkObject as
        software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster
  }

  /**
   * The scheduling details for the maintenance window.
   *
   * Patching and system updates take place during the maintenance window.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.odb.*;
   * MaintenanceWindowProperty maintenanceWindowProperty = MaintenanceWindowProperty.builder()
   * .daysOfWeek(List.of("daysOfWeek"))
   * .hoursOfDay(List.of(123))
   * .leadTimeInWeeks(123)
   * .months(List.of("months"))
   * .preference("preference")
   * .weeksOfMonth(List.of(123))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudautonomousvmcluster-maintenancewindow.html)
   */
  public interface MaintenanceWindowProperty {
    /**
     * The days of the week when maintenance can be performed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudautonomousvmcluster-maintenancewindow.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow-daysofweek)
     */
    public fun daysOfWeek(): List<String> = unwrap(this).getDaysOfWeek() ?: emptyList()

    /**
     * The hours of the day when maintenance can be performed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudautonomousvmcluster-maintenancewindow.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow-hoursofday)
     */
    public fun hoursOfDay(): Any? = unwrap(this).getHoursOfDay()

    /**
     * The lead time in weeks before the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudautonomousvmcluster-maintenancewindow.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow-leadtimeinweeks)
     */
    public fun leadTimeInWeeks(): Number? = unwrap(this).getLeadTimeInWeeks()

    /**
     * The months when maintenance can be performed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudautonomousvmcluster-maintenancewindow.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow-months)
     */
    public fun months(): List<String> = unwrap(this).getMonths() ?: emptyList()

    /**
     * The preference for the maintenance window scheduling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudautonomousvmcluster-maintenancewindow.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow-preference)
     */
    public fun preference(): String? = unwrap(this).getPreference()

    /**
     * The weeks of the month when maintenance can be performed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudautonomousvmcluster-maintenancewindow.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow-weeksofmonth)
     */
    public fun weeksOfMonth(): Any? = unwrap(this).getWeeksOfMonth()

    /**
     * A builder for [MaintenanceWindowProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param daysOfWeek The days of the week when maintenance can be performed.
       */
      public fun daysOfWeek(daysOfWeek: List<String>)

      /**
       * @param daysOfWeek The days of the week when maintenance can be performed.
       */
      public fun daysOfWeek(vararg daysOfWeek: String)

      /**
       * @param hoursOfDay The hours of the day when maintenance can be performed.
       */
      public fun hoursOfDay(hoursOfDay: List<Number>)

      /**
       * @param hoursOfDay The hours of the day when maintenance can be performed.
       */
      public fun hoursOfDay(vararg hoursOfDay: Number)

      /**
       * @param hoursOfDay The hours of the day when maintenance can be performed.
       */
      public fun hoursOfDay(hoursOfDay: IResolvable)

      /**
       * @param leadTimeInWeeks The lead time in weeks before the maintenance window.
       */
      public fun leadTimeInWeeks(leadTimeInWeeks: Number)

      /**
       * @param months The months when maintenance can be performed.
       */
      public fun months(months: List<String>)

      /**
       * @param months The months when maintenance can be performed.
       */
      public fun months(vararg months: String)

      /**
       * @param preference The preference for the maintenance window scheduling.
       */
      public fun preference(preference: String)

      /**
       * @param weeksOfMonth The weeks of the month when maintenance can be performed.
       */
      public fun weeksOfMonth(weeksOfMonth: List<Number>)

      /**
       * @param weeksOfMonth The weeks of the month when maintenance can be performed.
       */
      public fun weeksOfMonth(vararg weeksOfMonth: Number)

      /**
       * @param weeksOfMonth The weeks of the month when maintenance can be performed.
       */
      public fun weeksOfMonth(weeksOfMonth: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster.MaintenanceWindowProperty.Builder
          =
          software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster.MaintenanceWindowProperty.builder()

      /**
       * @param daysOfWeek The days of the week when maintenance can be performed.
       */
      override fun daysOfWeek(daysOfWeek: List<String>) {
        cdkBuilder.daysOfWeek(daysOfWeek)
      }

      /**
       * @param daysOfWeek The days of the week when maintenance can be performed.
       */
      override fun daysOfWeek(vararg daysOfWeek: String): Unit = daysOfWeek(daysOfWeek.toList())

      /**
       * @param hoursOfDay The hours of the day when maintenance can be performed.
       */
      override fun hoursOfDay(hoursOfDay: List<Number>) {
        cdkBuilder.hoursOfDay(hoursOfDay)
      }

      /**
       * @param hoursOfDay The hours of the day when maintenance can be performed.
       */
      override fun hoursOfDay(vararg hoursOfDay: Number): Unit = hoursOfDay(hoursOfDay.toList())

      /**
       * @param hoursOfDay The hours of the day when maintenance can be performed.
       */
      override fun hoursOfDay(hoursOfDay: IResolvable) {
        cdkBuilder.hoursOfDay(hoursOfDay.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param leadTimeInWeeks The lead time in weeks before the maintenance window.
       */
      override fun leadTimeInWeeks(leadTimeInWeeks: Number) {
        cdkBuilder.leadTimeInWeeks(leadTimeInWeeks)
      }

      /**
       * @param months The months when maintenance can be performed.
       */
      override fun months(months: List<String>) {
        cdkBuilder.months(months)
      }

      /**
       * @param months The months when maintenance can be performed.
       */
      override fun months(vararg months: String): Unit = months(months.toList())

      /**
       * @param preference The preference for the maintenance window scheduling.
       */
      override fun preference(preference: String) {
        cdkBuilder.preference(preference)
      }

      /**
       * @param weeksOfMonth The weeks of the month when maintenance can be performed.
       */
      override fun weeksOfMonth(weeksOfMonth: List<Number>) {
        cdkBuilder.weeksOfMonth(weeksOfMonth)
      }

      /**
       * @param weeksOfMonth The weeks of the month when maintenance can be performed.
       */
      override fun weeksOfMonth(vararg weeksOfMonth: Number): Unit =
          weeksOfMonth(weeksOfMonth.toList())

      /**
       * @param weeksOfMonth The weeks of the month when maintenance can be performed.
       */
      override fun weeksOfMonth(weeksOfMonth: IResolvable) {
        cdkBuilder.weeksOfMonth(weeksOfMonth.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster.MaintenanceWindowProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster.MaintenanceWindowProperty,
    ) : CdkObject(cdkObject),
        MaintenanceWindowProperty {
      /**
       * The days of the week when maintenance can be performed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudautonomousvmcluster-maintenancewindow.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow-daysofweek)
       */
      override fun daysOfWeek(): List<String> = unwrap(this).getDaysOfWeek() ?: emptyList()

      /**
       * The hours of the day when maintenance can be performed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudautonomousvmcluster-maintenancewindow.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow-hoursofday)
       */
      override fun hoursOfDay(): Any? = unwrap(this).getHoursOfDay()

      /**
       * The lead time in weeks before the maintenance window.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudautonomousvmcluster-maintenancewindow.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow-leadtimeinweeks)
       */
      override fun leadTimeInWeeks(): Number? = unwrap(this).getLeadTimeInWeeks()

      /**
       * The months when maintenance can be performed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudautonomousvmcluster-maintenancewindow.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow-months)
       */
      override fun months(): List<String> = unwrap(this).getMonths() ?: emptyList()

      /**
       * The preference for the maintenance window scheduling.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudautonomousvmcluster-maintenancewindow.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow-preference)
       */
      override fun preference(): String? = unwrap(this).getPreference()

      /**
       * The weeks of the month when maintenance can be performed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudautonomousvmcluster-maintenancewindow.html#cfn-odb-cloudautonomousvmcluster-maintenancewindow-weeksofmonth)
       */
      override fun weeksOfMonth(): Any? = unwrap(this).getWeeksOfMonth()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MaintenanceWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster.MaintenanceWindowProperty):
          MaintenanceWindowProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MaintenanceWindowProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceWindowProperty):
          software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster.MaintenanceWindowProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster.MaintenanceWindowProperty
    }
  }
}
