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
 * The `AWS::ODB::CloudVmCluster` resource creates a VM cluster on the specified Exadata
 * infrastructure in the Oracle Database.
 *
 * A VM cluster provides the compute resources for Oracle Database workloads.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.odb.*;
 * CfnCloudVmCluster cfnCloudVmCluster = CfnCloudVmCluster.Builder.create(this,
 * "MyCfnCloudVmCluster")
 * .cloudExadataInfrastructureId("cloudExadataInfrastructureId")
 * .clusterName("clusterName")
 * .cpuCoreCount(123)
 * .dataCollectionOptions(DataCollectionOptionsProperty.builder()
 * .isDiagnosticsEventsEnabled(false)
 * .isHealthMonitoringEnabled(false)
 * .isIncidentLogsEnabled(false)
 * .build())
 * .dataStorageSizeInTBs(123)
 * .dbNodeStorageSizeInGBs(123)
 * .dbServers(List.of("dbServers"))
 * .displayName("displayName")
 * .giVersion("giVersion")
 * .hostname("hostname")
 * .isLocalBackupEnabled(false)
 * .isSparseDiskgroupEnabled(false)
 * .licenseModel("licenseModel")
 * .memorySizeInGBs(123)
 * .odbNetworkId("odbNetworkId")
 * .scanListenerPortTcp(123)
 * .sshPublicKeys(List.of("sshPublicKeys"))
 * .systemVersion("systemVersion")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .timeZone("timeZone")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html)
 */
public open class CfnCloudVmCluster(
  cdkObject: software.amazon.awscdk.services.odb.CfnCloudVmCluster,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.odb.CfnCloudVmCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCloudVmClusterProps,
  ) :
      this(software.amazon.awscdk.services.odb.CfnCloudVmCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCloudVmClusterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCloudVmClusterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCloudVmClusterProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the VM cluster.
   */
  public open fun attrCloudVmClusterArn(): String = unwrap(this).getAttrCloudVmClusterArn()

  /**
   * The unique identifier of the VM cluster.
   */
  public open fun attrCloudVmClusterId(): String = unwrap(this).getAttrCloudVmClusterId()

  /**
   * The OCI model compute model used when you create or clone an instance: ECPU or OCPU.
   *
   * An ECPU is an abstracted measure of compute resources. ECPUs are based on the number of cores
   * elastically allocated from a pool of compute and storage servers. An OCPU is a legacy physical
   * measure of compute resources. OCPUs are based on the physical core of a processor with
   * hyper-threading enabled.
   */
  public open fun attrComputeModel(): String = unwrap(this).getAttrComputeModel()

  /**
   * The type of redundancy configured for the VM cluster.
   *
   * `NORMAL` is 2-way redundancy. `HIGH` is 3-way redundancy.
   */
  public open fun attrDiskRedundancy(): String = unwrap(this).getAttrDiskRedundancy()

  /**
   * The domain of the VM cluster.
   */
  public open fun attrDomain(): String = unwrap(this).getAttrDomain()

  /**
   * The port number configured for the listener on the VM cluster.
   */
  public open fun attrListenerPort(): Number = unwrap(this).getAttrListenerPort()

  /**
   * The number of nodes in the VM cluster.
   */
  public open fun attrNodeCount(): Number = unwrap(this).getAttrNodeCount()

  /**
   * The name of the OCI resource anchor for the VM cluster.
   */
  public open fun attrOciResourceAnchorName(): String = unwrap(this).getAttrOciResourceAnchorName()

  /**
   * The HTTPS link to the VM cluster in OCI.
   */
  public open fun attrOciUrl(): String = unwrap(this).getAttrOciUrl()

  /**
   * The OCID of the VM cluster.
   */
  public open fun attrOcid(): String = unwrap(this).getAttrOcid()

  /**
   * The FQDN of the DNS record for the Single Client Access Name (SCAN) IP addresses that are
   * associated with the VM cluster.
   */
  public open fun attrScanDnsName(): String = unwrap(this).getAttrScanDnsName()

  /**
   * The OCID of the SCAN IP addresses that are associated with the VM cluster.
   */
  public open fun attrScanIpIds(): List<String> = unwrap(this).getAttrScanIpIds()

  /**
   * The hardware model name of the Exadata infrastructure that's running the VM cluster.
   */
  public open fun attrShape(): String = unwrap(this).getAttrShape()

  /**
   * The amount of local node storage, in gigabytes (GB), that's allocated to the VM cluster.
   */
  public open fun attrStorageSizeInGBs(): Number = unwrap(this).getAttrStorageSizeInGBs()

  /**
   * The virtual IP (VIP) addresses that are associated with the VM cluster.
   *
   * Oracle's Cluster Ready Services (CRS) creates and maintains one VIP address for each node in
   * the VM cluster to enable failover. If one node fails, the VIP is reassigned to another active node
   * in the cluster.
   */
  public open fun attrVipIds(): List<String> = unwrap(this).getAttrVipIds()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The unique identifier of the Exadata infrastructure that this VM cluster belongs to.
   */
  public open fun cloudExadataInfrastructureId(): String? =
      unwrap(this).getCloudExadataInfrastructureId()

  /**
   * The unique identifier of the Exadata infrastructure that this VM cluster belongs to.
   */
  public open fun cloudExadataInfrastructureId(`value`: String) {
    unwrap(this).setCloudExadataInfrastructureId(`value`)
  }

  /**
   * The name of the Grid Infrastructure (GI) cluster.
   */
  public open fun clusterName(): String? = unwrap(this).getClusterName()

  /**
   * The name of the Grid Infrastructure (GI) cluster.
   */
  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  /**
   * The number of CPU cores enabled on the VM cluster.
   */
  public open fun cpuCoreCount(): Number? = unwrap(this).getCpuCoreCount()

  /**
   * The number of CPU cores enabled on the VM cluster.
   */
  public open fun cpuCoreCount(`value`: Number) {
    unwrap(this).setCpuCoreCount(`value`)
  }

  /**
   * The set of diagnostic collection options enabled for the VM cluster.
   */
  public open fun dataCollectionOptions(): Any? = unwrap(this).getDataCollectionOptions()

  /**
   * The set of diagnostic collection options enabled for the VM cluster.
   */
  public open fun dataCollectionOptions(`value`: IResolvable) {
    unwrap(this).setDataCollectionOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The set of diagnostic collection options enabled for the VM cluster.
   */
  public open fun dataCollectionOptions(`value`: DataCollectionOptionsProperty) {
    unwrap(this).setDataCollectionOptions(`value`.let(DataCollectionOptionsProperty.Companion::unwrap))
  }

  /**
   * The set of diagnostic collection options enabled for the VM cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("327536faa37cea37e5bc75c479a46040e78f1b6264e5b6d8ccb891baace14aa0")
  public open fun dataCollectionOptions(`value`: DataCollectionOptionsProperty.Builder.() -> Unit):
      Unit = dataCollectionOptions(DataCollectionOptionsProperty(`value`))

  /**
   * The size of the data disk group, in terabytes (TB), that's allocated for the VM cluster.
   */
  public open fun dataStorageSizeInTBs(): Number? = unwrap(this).getDataStorageSizeInTBs()

  /**
   * The size of the data disk group, in terabytes (TB), that's allocated for the VM cluster.
   */
  public open fun dataStorageSizeInTBs(`value`: Number) {
    unwrap(this).setDataStorageSizeInTBs(`value`)
  }

  /**
   * The amount of local node storage, in gigabytes (GB), that's allocated for the VM cluster.
   */
  public open fun dbNodeStorageSizeInGBs(): Number? = unwrap(this).getDbNodeStorageSizeInGBs()

  /**
   * The amount of local node storage, in gigabytes (GB), that's allocated for the VM cluster.
   */
  public open fun dbNodeStorageSizeInGBs(`value`: Number) {
    unwrap(this).setDbNodeStorageSizeInGBs(`value`)
  }

  /**
   * The list of database servers for the VM cluster.
   */
  public open fun dbServers(): List<String> = unwrap(this).getDbServers() ?: emptyList()

  /**
   * The list of database servers for the VM cluster.
   */
  public open fun dbServers(`value`: List<String>) {
    unwrap(this).setDbServers(`value`)
  }

  /**
   * The list of database servers for the VM cluster.
   */
  public open fun dbServers(vararg `value`: String): Unit = dbServers(`value`.toList())

  /**
   * The user-friendly name for the VM cluster.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The user-friendly name for the VM cluster.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The software version of the Oracle Grid Infrastructure (GI) for the VM cluster.
   */
  public open fun giVersion(): String? = unwrap(this).getGiVersion()

  /**
   * The software version of the Oracle Grid Infrastructure (GI) for the VM cluster.
   */
  public open fun giVersion(`value`: String) {
    unwrap(this).setGiVersion(`value`)
  }

  /**
   * The host name for the VM cluster.
   */
  public open fun hostname(): String? = unwrap(this).getHostname()

  /**
   * The host name for the VM cluster.
   */
  public open fun hostname(`value`: String) {
    unwrap(this).setHostname(`value`)
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
   * Specifies whether database backups to local Exadata storage are enabled for the VM cluster.
   */
  public open fun isLocalBackupEnabled(): Any? = unwrap(this).getIsLocalBackupEnabled()

  /**
   * Specifies whether database backups to local Exadata storage are enabled for the VM cluster.
   */
  public open fun isLocalBackupEnabled(`value`: Boolean) {
    unwrap(this).setIsLocalBackupEnabled(`value`)
  }

  /**
   * Specifies whether database backups to local Exadata storage are enabled for the VM cluster.
   */
  public open fun isLocalBackupEnabled(`value`: IResolvable) {
    unwrap(this).setIsLocalBackupEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies whether the VM cluster is configured with a sparse disk group.
   */
  public open fun isSparseDiskgroupEnabled(): Any? = unwrap(this).getIsSparseDiskgroupEnabled()

  /**
   * Specifies whether the VM cluster is configured with a sparse disk group.
   */
  public open fun isSparseDiskgroupEnabled(`value`: Boolean) {
    unwrap(this).setIsSparseDiskgroupEnabled(`value`)
  }

  /**
   * Specifies whether the VM cluster is configured with a sparse disk group.
   */
  public open fun isSparseDiskgroupEnabled(`value`: IResolvable) {
    unwrap(this).setIsSparseDiskgroupEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Oracle license model applied to the VM cluster.
   */
  public open fun licenseModel(): String? = unwrap(this).getLicenseModel()

  /**
   * The Oracle license model applied to the VM cluster.
   */
  public open fun licenseModel(`value`: String) {
    unwrap(this).setLicenseModel(`value`)
  }

  /**
   * The amount of memory, in gigabytes (GB), that's allocated for the VM cluster.
   */
  public open fun memorySizeInGBs(): Number? = unwrap(this).getMemorySizeInGBs()

  /**
   * The amount of memory, in gigabytes (GB), that's allocated for the VM cluster.
   */
  public open fun memorySizeInGBs(`value`: Number) {
    unwrap(this).setMemorySizeInGBs(`value`)
  }

  /**
   * The unique identifier of the ODB network for the VM cluster.
   */
  public open fun odbNetworkId(): String? = unwrap(this).getOdbNetworkId()

  /**
   * The unique identifier of the ODB network for the VM cluster.
   */
  public open fun odbNetworkId(`value`: String) {
    unwrap(this).setOdbNetworkId(`value`)
  }

  /**
   * The port number for TCP connections to the single client access name (SCAN) listener.
   */
  public open fun scanListenerPortTcp(): Number? = unwrap(this).getScanListenerPortTcp()

  /**
   * The port number for TCP connections to the single client access name (SCAN) listener.
   */
  public open fun scanListenerPortTcp(`value`: Number) {
    unwrap(this).setScanListenerPortTcp(`value`)
  }

  /**
   * The public key portion of one or more key pairs used for SSH access to the VM cluster.
   */
  public open fun sshPublicKeys(): List<String> = unwrap(this).getSshPublicKeys() ?: emptyList()

  /**
   * The public key portion of one or more key pairs used for SSH access to the VM cluster.
   */
  public open fun sshPublicKeys(`value`: List<String>) {
    unwrap(this).setSshPublicKeys(`value`)
  }

  /**
   * The public key portion of one or more key pairs used for SSH access to the VM cluster.
   */
  public open fun sshPublicKeys(vararg `value`: String): Unit = sshPublicKeys(`value`.toList())

  /**
   * The operating system version of the image chosen for the VM cluster.
   */
  public open fun systemVersion(): String? = unwrap(this).getSystemVersion()

  /**
   * The operating system version of the image chosen for the VM cluster.
   */
  public open fun systemVersion(`value`: String) {
    unwrap(this).setSystemVersion(`value`)
  }

  /**
   * Tags to assign to the Vm Cluster.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Tags to assign to the Vm Cluster.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Tags to assign to the Vm Cluster.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The time zone of the VM cluster.
   */
  public open fun timeZone(): String? = unwrap(this).getTimeZone()

  /**
   * The time zone of the VM cluster.
   */
  public open fun timeZone(`value`: String) {
    unwrap(this).setTimeZone(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.odb.CfnCloudVmCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier of the Exadata infrastructure that this VM cluster belongs to.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-cloudexadatainfrastructureid)
     * @param cloudExadataInfrastructureId The unique identifier of the Exadata infrastructure that
     * this VM cluster belongs to. 
     */
    public fun cloudExadataInfrastructureId(cloudExadataInfrastructureId: String)

    /**
     * The name of the Grid Infrastructure (GI) cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-clustername)
     * @param clusterName The name of the Grid Infrastructure (GI) cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * The number of CPU cores enabled on the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-cpucorecount)
     * @param cpuCoreCount The number of CPU cores enabled on the VM cluster. 
     */
    public fun cpuCoreCount(cpuCoreCount: Number)

    /**
     * The set of diagnostic collection options enabled for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-datacollectionoptions)
     * @param dataCollectionOptions The set of diagnostic collection options enabled for the VM
     * cluster. 
     */
    public fun dataCollectionOptions(dataCollectionOptions: IResolvable)

    /**
     * The set of diagnostic collection options enabled for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-datacollectionoptions)
     * @param dataCollectionOptions The set of diagnostic collection options enabled for the VM
     * cluster. 
     */
    public fun dataCollectionOptions(dataCollectionOptions: DataCollectionOptionsProperty)

    /**
     * The set of diagnostic collection options enabled for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-datacollectionoptions)
     * @param dataCollectionOptions The set of diagnostic collection options enabled for the VM
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bdd402669b7b1fe9e8fc36bbfdf4664415ae5bf5df52a3db30916a6a3ddd756f")
    public
        fun dataCollectionOptions(dataCollectionOptions: DataCollectionOptionsProperty.Builder.() -> Unit)

    /**
     * The size of the data disk group, in terabytes (TB), that's allocated for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-datastoragesizeintbs)
     * @param dataStorageSizeInTBs The size of the data disk group, in terabytes (TB), that's
     * allocated for the VM cluster. 
     */
    public fun dataStorageSizeInTBs(dataStorageSizeInTBs: Number)

    /**
     * The amount of local node storage, in gigabytes (GB), that's allocated for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-dbnodestoragesizeingbs)
     * @param dbNodeStorageSizeInGBs The amount of local node storage, in gigabytes (GB), that's
     * allocated for the VM cluster. 
     */
    public fun dbNodeStorageSizeInGBs(dbNodeStorageSizeInGBs: Number)

    /**
     * The list of database servers for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-dbservers)
     * @param dbServers The list of database servers for the VM cluster. 
     */
    public fun dbServers(dbServers: List<String>)

    /**
     * The list of database servers for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-dbservers)
     * @param dbServers The list of database servers for the VM cluster. 
     */
    public fun dbServers(vararg dbServers: String)

    /**
     * The user-friendly name for the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-displayname)
     * @param displayName The user-friendly name for the VM cluster. 
     */
    public fun displayName(displayName: String)

    /**
     * The software version of the Oracle Grid Infrastructure (GI) for the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-giversion)
     * @param giVersion The software version of the Oracle Grid Infrastructure (GI) for the VM
     * cluster. 
     */
    public fun giVersion(giVersion: String)

    /**
     * The host name for the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-hostname)
     * @param hostname The host name for the VM cluster. 
     */
    public fun hostname(hostname: String)

    /**
     * Specifies whether database backups to local Exadata storage are enabled for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-islocalbackupenabled)
     * @param isLocalBackupEnabled Specifies whether database backups to local Exadata storage are
     * enabled for the VM cluster. 
     */
    public fun isLocalBackupEnabled(isLocalBackupEnabled: Boolean)

    /**
     * Specifies whether database backups to local Exadata storage are enabled for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-islocalbackupenabled)
     * @param isLocalBackupEnabled Specifies whether database backups to local Exadata storage are
     * enabled for the VM cluster. 
     */
    public fun isLocalBackupEnabled(isLocalBackupEnabled: IResolvable)

    /**
     * Specifies whether the VM cluster is configured with a sparse disk group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-issparsediskgroupenabled)
     * @param isSparseDiskgroupEnabled Specifies whether the VM cluster is configured with a sparse
     * disk group. 
     */
    public fun isSparseDiskgroupEnabled(isSparseDiskgroupEnabled: Boolean)

    /**
     * Specifies whether the VM cluster is configured with a sparse disk group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-issparsediskgroupenabled)
     * @param isSparseDiskgroupEnabled Specifies whether the VM cluster is configured with a sparse
     * disk group. 
     */
    public fun isSparseDiskgroupEnabled(isSparseDiskgroupEnabled: IResolvable)

    /**
     * The Oracle license model applied to the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-licensemodel)
     * @param licenseModel The Oracle license model applied to the VM cluster. 
     */
    public fun licenseModel(licenseModel: String)

    /**
     * The amount of memory, in gigabytes (GB), that's allocated for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-memorysizeingbs)
     * @param memorySizeInGBs The amount of memory, in gigabytes (GB), that's allocated for the VM
     * cluster. 
     */
    public fun memorySizeInGBs(memorySizeInGBs: Number)

    /**
     * The unique identifier of the ODB network for the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-odbnetworkid)
     * @param odbNetworkId The unique identifier of the ODB network for the VM cluster. 
     */
    public fun odbNetworkId(odbNetworkId: String)

    /**
     * The port number for TCP connections to the single client access name (SCAN) listener.
     *
     * Valid values: `1024–8999` with the following exceptions: `2484` , `6100` , `6200` , `7060` ,
     * `7070` , `7085` , and `7879`
     *
     * Default: `1521`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-scanlistenerporttcp)
     * @param scanListenerPortTcp The port number for TCP connections to the single client access
     * name (SCAN) listener. 
     */
    public fun scanListenerPortTcp(scanListenerPortTcp: Number)

    /**
     * The public key portion of one or more key pairs used for SSH access to the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-sshpublickeys)
     * @param sshPublicKeys The public key portion of one or more key pairs used for SSH access to
     * the VM cluster. 
     */
    public fun sshPublicKeys(sshPublicKeys: List<String>)

    /**
     * The public key portion of one or more key pairs used for SSH access to the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-sshpublickeys)
     * @param sshPublicKeys The public key portion of one or more key pairs used for SSH access to
     * the VM cluster. 
     */
    public fun sshPublicKeys(vararg sshPublicKeys: String)

    /**
     * The operating system version of the image chosen for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-systemversion)
     * @param systemVersion The operating system version of the image chosen for the VM cluster. 
     */
    public fun systemVersion(systemVersion: String)

    /**
     * Tags to assign to the Vm Cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-tags)
     * @param tags Tags to assign to the Vm Cluster. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags to assign to the Vm Cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-tags)
     * @param tags Tags to assign to the Vm Cluster. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The time zone of the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-timezone)
     * @param timeZone The time zone of the VM cluster. 
     */
    public fun timeZone(timeZone: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.odb.CfnCloudVmCluster.Builder =
        software.amazon.awscdk.services.odb.CfnCloudVmCluster.Builder.create(scope, id)

    /**
     * The unique identifier of the Exadata infrastructure that this VM cluster belongs to.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-cloudexadatainfrastructureid)
     * @param cloudExadataInfrastructureId The unique identifier of the Exadata infrastructure that
     * this VM cluster belongs to. 
     */
    override fun cloudExadataInfrastructureId(cloudExadataInfrastructureId: String) {
      cdkBuilder.cloudExadataInfrastructureId(cloudExadataInfrastructureId)
    }

    /**
     * The name of the Grid Infrastructure (GI) cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-clustername)
     * @param clusterName The name of the Grid Infrastructure (GI) cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * The number of CPU cores enabled on the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-cpucorecount)
     * @param cpuCoreCount The number of CPU cores enabled on the VM cluster. 
     */
    override fun cpuCoreCount(cpuCoreCount: Number) {
      cdkBuilder.cpuCoreCount(cpuCoreCount)
    }

    /**
     * The set of diagnostic collection options enabled for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-datacollectionoptions)
     * @param dataCollectionOptions The set of diagnostic collection options enabled for the VM
     * cluster. 
     */
    override fun dataCollectionOptions(dataCollectionOptions: IResolvable) {
      cdkBuilder.dataCollectionOptions(dataCollectionOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The set of diagnostic collection options enabled for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-datacollectionoptions)
     * @param dataCollectionOptions The set of diagnostic collection options enabled for the VM
     * cluster. 
     */
    override fun dataCollectionOptions(dataCollectionOptions: DataCollectionOptionsProperty) {
      cdkBuilder.dataCollectionOptions(dataCollectionOptions.let(DataCollectionOptionsProperty.Companion::unwrap))
    }

    /**
     * The set of diagnostic collection options enabled for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-datacollectionoptions)
     * @param dataCollectionOptions The set of diagnostic collection options enabled for the VM
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bdd402669b7b1fe9e8fc36bbfdf4664415ae5bf5df52a3db30916a6a3ddd756f")
    override
        fun dataCollectionOptions(dataCollectionOptions: DataCollectionOptionsProperty.Builder.() -> Unit):
        Unit = dataCollectionOptions(DataCollectionOptionsProperty(dataCollectionOptions))

    /**
     * The size of the data disk group, in terabytes (TB), that's allocated for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-datastoragesizeintbs)
     * @param dataStorageSizeInTBs The size of the data disk group, in terabytes (TB), that's
     * allocated for the VM cluster. 
     */
    override fun dataStorageSizeInTBs(dataStorageSizeInTBs: Number) {
      cdkBuilder.dataStorageSizeInTBs(dataStorageSizeInTBs)
    }

    /**
     * The amount of local node storage, in gigabytes (GB), that's allocated for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-dbnodestoragesizeingbs)
     * @param dbNodeStorageSizeInGBs The amount of local node storage, in gigabytes (GB), that's
     * allocated for the VM cluster. 
     */
    override fun dbNodeStorageSizeInGBs(dbNodeStorageSizeInGBs: Number) {
      cdkBuilder.dbNodeStorageSizeInGBs(dbNodeStorageSizeInGBs)
    }

    /**
     * The list of database servers for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-dbservers)
     * @param dbServers The list of database servers for the VM cluster. 
     */
    override fun dbServers(dbServers: List<String>) {
      cdkBuilder.dbServers(dbServers)
    }

    /**
     * The list of database servers for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-dbservers)
     * @param dbServers The list of database servers for the VM cluster. 
     */
    override fun dbServers(vararg dbServers: String): Unit = dbServers(dbServers.toList())

    /**
     * The user-friendly name for the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-displayname)
     * @param displayName The user-friendly name for the VM cluster. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The software version of the Oracle Grid Infrastructure (GI) for the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-giversion)
     * @param giVersion The software version of the Oracle Grid Infrastructure (GI) for the VM
     * cluster. 
     */
    override fun giVersion(giVersion: String) {
      cdkBuilder.giVersion(giVersion)
    }

    /**
     * The host name for the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-hostname)
     * @param hostname The host name for the VM cluster. 
     */
    override fun hostname(hostname: String) {
      cdkBuilder.hostname(hostname)
    }

    /**
     * Specifies whether database backups to local Exadata storage are enabled for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-islocalbackupenabled)
     * @param isLocalBackupEnabled Specifies whether database backups to local Exadata storage are
     * enabled for the VM cluster. 
     */
    override fun isLocalBackupEnabled(isLocalBackupEnabled: Boolean) {
      cdkBuilder.isLocalBackupEnabled(isLocalBackupEnabled)
    }

    /**
     * Specifies whether database backups to local Exadata storage are enabled for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-islocalbackupenabled)
     * @param isLocalBackupEnabled Specifies whether database backups to local Exadata storage are
     * enabled for the VM cluster. 
     */
    override fun isLocalBackupEnabled(isLocalBackupEnabled: IResolvable) {
      cdkBuilder.isLocalBackupEnabled(isLocalBackupEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies whether the VM cluster is configured with a sparse disk group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-issparsediskgroupenabled)
     * @param isSparseDiskgroupEnabled Specifies whether the VM cluster is configured with a sparse
     * disk group. 
     */
    override fun isSparseDiskgroupEnabled(isSparseDiskgroupEnabled: Boolean) {
      cdkBuilder.isSparseDiskgroupEnabled(isSparseDiskgroupEnabled)
    }

    /**
     * Specifies whether the VM cluster is configured with a sparse disk group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-issparsediskgroupenabled)
     * @param isSparseDiskgroupEnabled Specifies whether the VM cluster is configured with a sparse
     * disk group. 
     */
    override fun isSparseDiskgroupEnabled(isSparseDiskgroupEnabled: IResolvable) {
      cdkBuilder.isSparseDiskgroupEnabled(isSparseDiskgroupEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Oracle license model applied to the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-licensemodel)
     * @param licenseModel The Oracle license model applied to the VM cluster. 
     */
    override fun licenseModel(licenseModel: String) {
      cdkBuilder.licenseModel(licenseModel)
    }

    /**
     * The amount of memory, in gigabytes (GB), that's allocated for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-memorysizeingbs)
     * @param memorySizeInGBs The amount of memory, in gigabytes (GB), that's allocated for the VM
     * cluster. 
     */
    override fun memorySizeInGBs(memorySizeInGBs: Number) {
      cdkBuilder.memorySizeInGBs(memorySizeInGBs)
    }

    /**
     * The unique identifier of the ODB network for the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-odbnetworkid)
     * @param odbNetworkId The unique identifier of the ODB network for the VM cluster. 
     */
    override fun odbNetworkId(odbNetworkId: String) {
      cdkBuilder.odbNetworkId(odbNetworkId)
    }

    /**
     * The port number for TCP connections to the single client access name (SCAN) listener.
     *
     * Valid values: `1024–8999` with the following exceptions: `2484` , `6100` , `6200` , `7060` ,
     * `7070` , `7085` , and `7879`
     *
     * Default: `1521`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-scanlistenerporttcp)
     * @param scanListenerPortTcp The port number for TCP connections to the single client access
     * name (SCAN) listener. 
     */
    override fun scanListenerPortTcp(scanListenerPortTcp: Number) {
      cdkBuilder.scanListenerPortTcp(scanListenerPortTcp)
    }

    /**
     * The public key portion of one or more key pairs used for SSH access to the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-sshpublickeys)
     * @param sshPublicKeys The public key portion of one or more key pairs used for SSH access to
     * the VM cluster. 
     */
    override fun sshPublicKeys(sshPublicKeys: List<String>) {
      cdkBuilder.sshPublicKeys(sshPublicKeys)
    }

    /**
     * The public key portion of one or more key pairs used for SSH access to the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-sshpublickeys)
     * @param sshPublicKeys The public key portion of one or more key pairs used for SSH access to
     * the VM cluster. 
     */
    override fun sshPublicKeys(vararg sshPublicKeys: String): Unit =
        sshPublicKeys(sshPublicKeys.toList())

    /**
     * The operating system version of the image chosen for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-systemversion)
     * @param systemVersion The operating system version of the image chosen for the VM cluster. 
     */
    override fun systemVersion(systemVersion: String) {
      cdkBuilder.systemVersion(systemVersion)
    }

    /**
     * Tags to assign to the Vm Cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-tags)
     * @param tags Tags to assign to the Vm Cluster. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Tags to assign to the Vm Cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-tags)
     * @param tags Tags to assign to the Vm Cluster. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The time zone of the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-timezone)
     * @param timeZone The time zone of the VM cluster. 
     */
    override fun timeZone(timeZone: String) {
      cdkBuilder.timeZone(timeZone)
    }

    public fun build(): software.amazon.awscdk.services.odb.CfnCloudVmCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.odb.CfnCloudVmCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCloudVmCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCloudVmCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.odb.CfnCloudVmCluster):
        CfnCloudVmCluster = CfnCloudVmCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCloudVmCluster):
        software.amazon.awscdk.services.odb.CfnCloudVmCluster = wrapped.cdkObject as
        software.amazon.awscdk.services.odb.CfnCloudVmCluster
  }

  /**
   * Information about the data collection options enabled for a VM cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.odb.*;
   * DataCollectionOptionsProperty dataCollectionOptionsProperty =
   * DataCollectionOptionsProperty.builder()
   * .isDiagnosticsEventsEnabled(false)
   * .isHealthMonitoringEnabled(false)
   * .isIncidentLogsEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudvmcluster-datacollectionoptions.html)
   */
  public interface DataCollectionOptionsProperty {
    /**
     * Specifies whether diagnostic collection is enabled for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudvmcluster-datacollectionoptions.html#cfn-odb-cloudvmcluster-datacollectionoptions-isdiagnosticseventsenabled)
     */
    public fun isDiagnosticsEventsEnabled(): Any? = unwrap(this).getIsDiagnosticsEventsEnabled()

    /**
     * Specifies whether health monitoring is enabled for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudvmcluster-datacollectionoptions.html#cfn-odb-cloudvmcluster-datacollectionoptions-ishealthmonitoringenabled)
     */
    public fun isHealthMonitoringEnabled(): Any? = unwrap(this).getIsHealthMonitoringEnabled()

    /**
     * Specifies whether incident logs are enabled for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudvmcluster-datacollectionoptions.html#cfn-odb-cloudvmcluster-datacollectionoptions-isincidentlogsenabled)
     */
    public fun isIncidentLogsEnabled(): Any? = unwrap(this).getIsIncidentLogsEnabled()

    /**
     * A builder for [DataCollectionOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isDiagnosticsEventsEnabled Specifies whether diagnostic collection is enabled for
       * the VM cluster.
       */
      public fun isDiagnosticsEventsEnabled(isDiagnosticsEventsEnabled: Boolean)

      /**
       * @param isDiagnosticsEventsEnabled Specifies whether diagnostic collection is enabled for
       * the VM cluster.
       */
      public fun isDiagnosticsEventsEnabled(isDiagnosticsEventsEnabled: IResolvable)

      /**
       * @param isHealthMonitoringEnabled Specifies whether health monitoring is enabled for the VM
       * cluster.
       */
      public fun isHealthMonitoringEnabled(isHealthMonitoringEnabled: Boolean)

      /**
       * @param isHealthMonitoringEnabled Specifies whether health monitoring is enabled for the VM
       * cluster.
       */
      public fun isHealthMonitoringEnabled(isHealthMonitoringEnabled: IResolvable)

      /**
       * @param isIncidentLogsEnabled Specifies whether incident logs are enabled for the VM
       * cluster.
       */
      public fun isIncidentLogsEnabled(isIncidentLogsEnabled: Boolean)

      /**
       * @param isIncidentLogsEnabled Specifies whether incident logs are enabled for the VM
       * cluster.
       */
      public fun isIncidentLogsEnabled(isIncidentLogsEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.odb.CfnCloudVmCluster.DataCollectionOptionsProperty.Builder
          =
          software.amazon.awscdk.services.odb.CfnCloudVmCluster.DataCollectionOptionsProperty.builder()

      /**
       * @param isDiagnosticsEventsEnabled Specifies whether diagnostic collection is enabled for
       * the VM cluster.
       */
      override fun isDiagnosticsEventsEnabled(isDiagnosticsEventsEnabled: Boolean) {
        cdkBuilder.isDiagnosticsEventsEnabled(isDiagnosticsEventsEnabled)
      }

      /**
       * @param isDiagnosticsEventsEnabled Specifies whether diagnostic collection is enabled for
       * the VM cluster.
       */
      override fun isDiagnosticsEventsEnabled(isDiagnosticsEventsEnabled: IResolvable) {
        cdkBuilder.isDiagnosticsEventsEnabled(isDiagnosticsEventsEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param isHealthMonitoringEnabled Specifies whether health monitoring is enabled for the VM
       * cluster.
       */
      override fun isHealthMonitoringEnabled(isHealthMonitoringEnabled: Boolean) {
        cdkBuilder.isHealthMonitoringEnabled(isHealthMonitoringEnabled)
      }

      /**
       * @param isHealthMonitoringEnabled Specifies whether health monitoring is enabled for the VM
       * cluster.
       */
      override fun isHealthMonitoringEnabled(isHealthMonitoringEnabled: IResolvable) {
        cdkBuilder.isHealthMonitoringEnabled(isHealthMonitoringEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param isIncidentLogsEnabled Specifies whether incident logs are enabled for the VM
       * cluster.
       */
      override fun isIncidentLogsEnabled(isIncidentLogsEnabled: Boolean) {
        cdkBuilder.isIncidentLogsEnabled(isIncidentLogsEnabled)
      }

      /**
       * @param isIncidentLogsEnabled Specifies whether incident logs are enabled for the VM
       * cluster.
       */
      override fun isIncidentLogsEnabled(isIncidentLogsEnabled: IResolvable) {
        cdkBuilder.isIncidentLogsEnabled(isIncidentLogsEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.odb.CfnCloudVmCluster.DataCollectionOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.odb.CfnCloudVmCluster.DataCollectionOptionsProperty,
    ) : CdkObject(cdkObject),
        DataCollectionOptionsProperty {
      /**
       * Specifies whether diagnostic collection is enabled for the VM cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudvmcluster-datacollectionoptions.html#cfn-odb-cloudvmcluster-datacollectionoptions-isdiagnosticseventsenabled)
       */
      override fun isDiagnosticsEventsEnabled(): Any? = unwrap(this).getIsDiagnosticsEventsEnabled()

      /**
       * Specifies whether health monitoring is enabled for the VM cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudvmcluster-datacollectionoptions.html#cfn-odb-cloudvmcluster-datacollectionoptions-ishealthmonitoringenabled)
       */
      override fun isHealthMonitoringEnabled(): Any? = unwrap(this).getIsHealthMonitoringEnabled()

      /**
       * Specifies whether incident logs are enabled for the VM cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudvmcluster-datacollectionoptions.html#cfn-odb-cloudvmcluster-datacollectionoptions-isincidentlogsenabled)
       */
      override fun isIncidentLogsEnabled(): Any? = unwrap(this).getIsIncidentLogsEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataCollectionOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.odb.CfnCloudVmCluster.DataCollectionOptionsProperty):
          DataCollectionOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataCollectionOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataCollectionOptionsProperty):
          software.amazon.awscdk.services.odb.CfnCloudVmCluster.DataCollectionOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.odb.CfnCloudVmCluster.DataCollectionOptionsProperty
    }
  }
}
