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
 * Properties for defining a `CfnCloudVmCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.odb.*;
 * CfnCloudVmClusterProps cfnCloudVmClusterProps = CfnCloudVmClusterProps.builder()
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
public interface CfnCloudVmClusterProps {
  /**
   * The unique identifier of the Exadata infrastructure that this VM cluster belongs to.
   *
   * Required when creating a VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-cloudexadatainfrastructureid)
   */
  public fun cloudExadataInfrastructureId(): String? =
      unwrap(this).getCloudExadataInfrastructureId()

  /**
   * The name of the Grid Infrastructure (GI) cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-clustername)
   */
  public fun clusterName(): String? = unwrap(this).getClusterName()

  /**
   * The number of CPU cores enabled on the VM cluster.
   *
   * Required when creating a VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-cpucorecount)
   */
  public fun cpuCoreCount(): Number? = unwrap(this).getCpuCoreCount()

  /**
   * The set of diagnostic collection options enabled for the VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-datacollectionoptions)
   */
  public fun dataCollectionOptions(): Any? = unwrap(this).getDataCollectionOptions()

  /**
   * The size of the data disk group, in terabytes (TB), that's allocated for the VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-datastoragesizeintbs)
   */
  public fun dataStorageSizeInTBs(): Number? = unwrap(this).getDataStorageSizeInTBs()

  /**
   * The amount of local node storage, in gigabytes (GB), that's allocated for the VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-dbnodestoragesizeingbs)
   */
  public fun dbNodeStorageSizeInGBs(): Number? = unwrap(this).getDbNodeStorageSizeInGBs()

  /**
   * The list of database servers for the VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-dbservers)
   */
  public fun dbServers(): List<String> = unwrap(this).getDbServers() ?: emptyList()

  /**
   * The user-friendly name for the VM cluster.
   *
   * Required when creating a VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The software version of the Oracle Grid Infrastructure (GI) for the VM cluster.
   *
   * Required when creating a VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-giversion)
   */
  public fun giVersion(): String? = unwrap(this).getGiVersion()

  /**
   * The host name for the VM cluster.
   *
   * Required when creating a VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-hostname)
   */
  public fun hostname(): String? = unwrap(this).getHostname()

  /**
   * Specifies whether database backups to local Exadata storage are enabled for the VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-islocalbackupenabled)
   */
  public fun isLocalBackupEnabled(): Any? = unwrap(this).getIsLocalBackupEnabled()

  /**
   * Specifies whether the VM cluster is configured with a sparse disk group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-issparsediskgroupenabled)
   */
  public fun isSparseDiskgroupEnabled(): Any? = unwrap(this).getIsSparseDiskgroupEnabled()

  /**
   * The Oracle license model applied to the VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-licensemodel)
   */
  public fun licenseModel(): String? = unwrap(this).getLicenseModel()

  /**
   * The amount of memory, in gigabytes (GB), that's allocated for the VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-memorysizeingbs)
   */
  public fun memorySizeInGBs(): Number? = unwrap(this).getMemorySizeInGBs()

  /**
   * The unique identifier of the ODB network for the VM cluster.
   *
   * Required when creating a VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-odbnetworkid)
   */
  public fun odbNetworkId(): String? = unwrap(this).getOdbNetworkId()

  /**
   * The port number for TCP connections to the single client access name (SCAN) listener.
   *
   * Valid values: `1024–8999` with the following exceptions: `2484` , `6100` , `6200` , `7060` ,
   * `7070` , `7085` , and `7879`
   *
   * Default: `1521`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-scanlistenerporttcp)
   */
  public fun scanListenerPortTcp(): Number? = unwrap(this).getScanListenerPortTcp()

  /**
   * The public key portion of one or more key pairs used for SSH access to the VM cluster.
   *
   * Required when creating a VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-sshpublickeys)
   */
  public fun sshPublicKeys(): List<String> = unwrap(this).getSshPublicKeys() ?: emptyList()

  /**
   * The operating system version of the image chosen for the VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-systemversion)
   */
  public fun systemVersion(): String? = unwrap(this).getSystemVersion()

  /**
   * Tags to assign to the Vm Cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The time zone of the VM cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-timezone)
   */
  public fun timeZone(): String? = unwrap(this).getTimeZone()

  /**
   * A builder for [CfnCloudVmClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cloudExadataInfrastructureId The unique identifier of the Exadata infrastructure that
     * this VM cluster belongs to.
     * Required when creating a VM cluster.
     */
    public fun cloudExadataInfrastructureId(cloudExadataInfrastructureId: String)

    /**
     * @param clusterName The name of the Grid Infrastructure (GI) cluster.
     */
    public fun clusterName(clusterName: String)

    /**
     * @param cpuCoreCount The number of CPU cores enabled on the VM cluster.
     * Required when creating a VM cluster.
     */
    public fun cpuCoreCount(cpuCoreCount: Number)

    /**
     * @param dataCollectionOptions The set of diagnostic collection options enabled for the VM
     * cluster.
     */
    public fun dataCollectionOptions(dataCollectionOptions: IResolvable)

    /**
     * @param dataCollectionOptions The set of diagnostic collection options enabled for the VM
     * cluster.
     */
    public
        fun dataCollectionOptions(dataCollectionOptions: CfnCloudVmCluster.DataCollectionOptionsProperty)

    /**
     * @param dataCollectionOptions The set of diagnostic collection options enabled for the VM
     * cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9aeeccc12854b6d233c04477dfc2099d932fcdb52fa57cc0e38b398c4c8d516b")
    public
        fun dataCollectionOptions(dataCollectionOptions: CfnCloudVmCluster.DataCollectionOptionsProperty.Builder.() -> Unit)

    /**
     * @param dataStorageSizeInTBs The size of the data disk group, in terabytes (TB), that's
     * allocated for the VM cluster.
     */
    public fun dataStorageSizeInTBs(dataStorageSizeInTBs: Number)

    /**
     * @param dbNodeStorageSizeInGBs The amount of local node storage, in gigabytes (GB), that's
     * allocated for the VM cluster.
     */
    public fun dbNodeStorageSizeInGBs(dbNodeStorageSizeInGBs: Number)

    /**
     * @param dbServers The list of database servers for the VM cluster.
     */
    public fun dbServers(dbServers: List<String>)

    /**
     * @param dbServers The list of database servers for the VM cluster.
     */
    public fun dbServers(vararg dbServers: String)

    /**
     * @param displayName The user-friendly name for the VM cluster.
     * Required when creating a VM cluster.
     */
    public fun displayName(displayName: String)

    /**
     * @param giVersion The software version of the Oracle Grid Infrastructure (GI) for the VM
     * cluster.
     * Required when creating a VM cluster.
     */
    public fun giVersion(giVersion: String)

    /**
     * @param hostname The host name for the VM cluster.
     * Required when creating a VM cluster.
     */
    public fun hostname(hostname: String)

    /**
     * @param isLocalBackupEnabled Specifies whether database backups to local Exadata storage are
     * enabled for the VM cluster.
     */
    public fun isLocalBackupEnabled(isLocalBackupEnabled: Boolean)

    /**
     * @param isLocalBackupEnabled Specifies whether database backups to local Exadata storage are
     * enabled for the VM cluster.
     */
    public fun isLocalBackupEnabled(isLocalBackupEnabled: IResolvable)

    /**
     * @param isSparseDiskgroupEnabled Specifies whether the VM cluster is configured with a sparse
     * disk group.
     */
    public fun isSparseDiskgroupEnabled(isSparseDiskgroupEnabled: Boolean)

    /**
     * @param isSparseDiskgroupEnabled Specifies whether the VM cluster is configured with a sparse
     * disk group.
     */
    public fun isSparseDiskgroupEnabled(isSparseDiskgroupEnabled: IResolvable)

    /**
     * @param licenseModel The Oracle license model applied to the VM cluster.
     */
    public fun licenseModel(licenseModel: String)

    /**
     * @param memorySizeInGBs The amount of memory, in gigabytes (GB), that's allocated for the VM
     * cluster.
     */
    public fun memorySizeInGBs(memorySizeInGBs: Number)

    /**
     * @param odbNetworkId The unique identifier of the ODB network for the VM cluster.
     * Required when creating a VM cluster.
     */
    public fun odbNetworkId(odbNetworkId: String)

    /**
     * @param scanListenerPortTcp The port number for TCP connections to the single client access
     * name (SCAN) listener.
     * Valid values: `1024–8999` with the following exceptions: `2484` , `6100` , `6200` , `7060` ,
     * `7070` , `7085` , and `7879`
     *
     * Default: `1521`
     */
    public fun scanListenerPortTcp(scanListenerPortTcp: Number)

    /**
     * @param sshPublicKeys The public key portion of one or more key pairs used for SSH access to
     * the VM cluster.
     * Required when creating a VM cluster.
     */
    public fun sshPublicKeys(sshPublicKeys: List<String>)

    /**
     * @param sshPublicKeys The public key portion of one or more key pairs used for SSH access to
     * the VM cluster.
     * Required when creating a VM cluster.
     */
    public fun sshPublicKeys(vararg sshPublicKeys: String)

    /**
     * @param systemVersion The operating system version of the image chosen for the VM cluster.
     */
    public fun systemVersion(systemVersion: String)

    /**
     * @param tags Tags to assign to the Vm Cluster.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags to assign to the Vm Cluster.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param timeZone The time zone of the VM cluster.
     */
    public fun timeZone(timeZone: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.odb.CfnCloudVmClusterProps.Builder =
        software.amazon.awscdk.services.odb.CfnCloudVmClusterProps.builder()

    /**
     * @param cloudExadataInfrastructureId The unique identifier of the Exadata infrastructure that
     * this VM cluster belongs to.
     * Required when creating a VM cluster.
     */
    override fun cloudExadataInfrastructureId(cloudExadataInfrastructureId: String) {
      cdkBuilder.cloudExadataInfrastructureId(cloudExadataInfrastructureId)
    }

    /**
     * @param clusterName The name of the Grid Infrastructure (GI) cluster.
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param cpuCoreCount The number of CPU cores enabled on the VM cluster.
     * Required when creating a VM cluster.
     */
    override fun cpuCoreCount(cpuCoreCount: Number) {
      cdkBuilder.cpuCoreCount(cpuCoreCount)
    }

    /**
     * @param dataCollectionOptions The set of diagnostic collection options enabled for the VM
     * cluster.
     */
    override fun dataCollectionOptions(dataCollectionOptions: IResolvable) {
      cdkBuilder.dataCollectionOptions(dataCollectionOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataCollectionOptions The set of diagnostic collection options enabled for the VM
     * cluster.
     */
    override
        fun dataCollectionOptions(dataCollectionOptions: CfnCloudVmCluster.DataCollectionOptionsProperty) {
      cdkBuilder.dataCollectionOptions(dataCollectionOptions.let(CfnCloudVmCluster.DataCollectionOptionsProperty.Companion::unwrap))
    }

    /**
     * @param dataCollectionOptions The set of diagnostic collection options enabled for the VM
     * cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9aeeccc12854b6d233c04477dfc2099d932fcdb52fa57cc0e38b398c4c8d516b")
    override
        fun dataCollectionOptions(dataCollectionOptions: CfnCloudVmCluster.DataCollectionOptionsProperty.Builder.() -> Unit):
        Unit =
        dataCollectionOptions(CfnCloudVmCluster.DataCollectionOptionsProperty(dataCollectionOptions))

    /**
     * @param dataStorageSizeInTBs The size of the data disk group, in terabytes (TB), that's
     * allocated for the VM cluster.
     */
    override fun dataStorageSizeInTBs(dataStorageSizeInTBs: Number) {
      cdkBuilder.dataStorageSizeInTBs(dataStorageSizeInTBs)
    }

    /**
     * @param dbNodeStorageSizeInGBs The amount of local node storage, in gigabytes (GB), that's
     * allocated for the VM cluster.
     */
    override fun dbNodeStorageSizeInGBs(dbNodeStorageSizeInGBs: Number) {
      cdkBuilder.dbNodeStorageSizeInGBs(dbNodeStorageSizeInGBs)
    }

    /**
     * @param dbServers The list of database servers for the VM cluster.
     */
    override fun dbServers(dbServers: List<String>) {
      cdkBuilder.dbServers(dbServers)
    }

    /**
     * @param dbServers The list of database servers for the VM cluster.
     */
    override fun dbServers(vararg dbServers: String): Unit = dbServers(dbServers.toList())

    /**
     * @param displayName The user-friendly name for the VM cluster.
     * Required when creating a VM cluster.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param giVersion The software version of the Oracle Grid Infrastructure (GI) for the VM
     * cluster.
     * Required when creating a VM cluster.
     */
    override fun giVersion(giVersion: String) {
      cdkBuilder.giVersion(giVersion)
    }

    /**
     * @param hostname The host name for the VM cluster.
     * Required when creating a VM cluster.
     */
    override fun hostname(hostname: String) {
      cdkBuilder.hostname(hostname)
    }

    /**
     * @param isLocalBackupEnabled Specifies whether database backups to local Exadata storage are
     * enabled for the VM cluster.
     */
    override fun isLocalBackupEnabled(isLocalBackupEnabled: Boolean) {
      cdkBuilder.isLocalBackupEnabled(isLocalBackupEnabled)
    }

    /**
     * @param isLocalBackupEnabled Specifies whether database backups to local Exadata storage are
     * enabled for the VM cluster.
     */
    override fun isLocalBackupEnabled(isLocalBackupEnabled: IResolvable) {
      cdkBuilder.isLocalBackupEnabled(isLocalBackupEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param isSparseDiskgroupEnabled Specifies whether the VM cluster is configured with a sparse
     * disk group.
     */
    override fun isSparseDiskgroupEnabled(isSparseDiskgroupEnabled: Boolean) {
      cdkBuilder.isSparseDiskgroupEnabled(isSparseDiskgroupEnabled)
    }

    /**
     * @param isSparseDiskgroupEnabled Specifies whether the VM cluster is configured with a sparse
     * disk group.
     */
    override fun isSparseDiskgroupEnabled(isSparseDiskgroupEnabled: IResolvable) {
      cdkBuilder.isSparseDiskgroupEnabled(isSparseDiskgroupEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param licenseModel The Oracle license model applied to the VM cluster.
     */
    override fun licenseModel(licenseModel: String) {
      cdkBuilder.licenseModel(licenseModel)
    }

    /**
     * @param memorySizeInGBs The amount of memory, in gigabytes (GB), that's allocated for the VM
     * cluster.
     */
    override fun memorySizeInGBs(memorySizeInGBs: Number) {
      cdkBuilder.memorySizeInGBs(memorySizeInGBs)
    }

    /**
     * @param odbNetworkId The unique identifier of the ODB network for the VM cluster.
     * Required when creating a VM cluster.
     */
    override fun odbNetworkId(odbNetworkId: String) {
      cdkBuilder.odbNetworkId(odbNetworkId)
    }

    /**
     * @param scanListenerPortTcp The port number for TCP connections to the single client access
     * name (SCAN) listener.
     * Valid values: `1024–8999` with the following exceptions: `2484` , `6100` , `6200` , `7060` ,
     * `7070` , `7085` , and `7879`
     *
     * Default: `1521`
     */
    override fun scanListenerPortTcp(scanListenerPortTcp: Number) {
      cdkBuilder.scanListenerPortTcp(scanListenerPortTcp)
    }

    /**
     * @param sshPublicKeys The public key portion of one or more key pairs used for SSH access to
     * the VM cluster.
     * Required when creating a VM cluster.
     */
    override fun sshPublicKeys(sshPublicKeys: List<String>) {
      cdkBuilder.sshPublicKeys(sshPublicKeys)
    }

    /**
     * @param sshPublicKeys The public key portion of one or more key pairs used for SSH access to
     * the VM cluster.
     * Required when creating a VM cluster.
     */
    override fun sshPublicKeys(vararg sshPublicKeys: String): Unit =
        sshPublicKeys(sshPublicKeys.toList())

    /**
     * @param systemVersion The operating system version of the image chosen for the VM cluster.
     */
    override fun systemVersion(systemVersion: String) {
      cdkBuilder.systemVersion(systemVersion)
    }

    /**
     * @param tags Tags to assign to the Vm Cluster.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags to assign to the Vm Cluster.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param timeZone The time zone of the VM cluster.
     */
    override fun timeZone(timeZone: String) {
      cdkBuilder.timeZone(timeZone)
    }

    public fun build(): software.amazon.awscdk.services.odb.CfnCloudVmClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.odb.CfnCloudVmClusterProps,
  ) : CdkObject(cdkObject),
      CfnCloudVmClusterProps {
    /**
     * The unique identifier of the Exadata infrastructure that this VM cluster belongs to.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-cloudexadatainfrastructureid)
     */
    override fun cloudExadataInfrastructureId(): String? =
        unwrap(this).getCloudExadataInfrastructureId()

    /**
     * The name of the Grid Infrastructure (GI) cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-clustername)
     */
    override fun clusterName(): String? = unwrap(this).getClusterName()

    /**
     * The number of CPU cores enabled on the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-cpucorecount)
     */
    override fun cpuCoreCount(): Number? = unwrap(this).getCpuCoreCount()

    /**
     * The set of diagnostic collection options enabled for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-datacollectionoptions)
     */
    override fun dataCollectionOptions(): Any? = unwrap(this).getDataCollectionOptions()

    /**
     * The size of the data disk group, in terabytes (TB), that's allocated for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-datastoragesizeintbs)
     */
    override fun dataStorageSizeInTBs(): Number? = unwrap(this).getDataStorageSizeInTBs()

    /**
     * The amount of local node storage, in gigabytes (GB), that's allocated for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-dbnodestoragesizeingbs)
     */
    override fun dbNodeStorageSizeInGBs(): Number? = unwrap(this).getDbNodeStorageSizeInGBs()

    /**
     * The list of database servers for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-dbservers)
     */
    override fun dbServers(): List<String> = unwrap(this).getDbServers() ?: emptyList()

    /**
     * The user-friendly name for the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The software version of the Oracle Grid Infrastructure (GI) for the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-giversion)
     */
    override fun giVersion(): String? = unwrap(this).getGiVersion()

    /**
     * The host name for the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-hostname)
     */
    override fun hostname(): String? = unwrap(this).getHostname()

    /**
     * Specifies whether database backups to local Exadata storage are enabled for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-islocalbackupenabled)
     */
    override fun isLocalBackupEnabled(): Any? = unwrap(this).getIsLocalBackupEnabled()

    /**
     * Specifies whether the VM cluster is configured with a sparse disk group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-issparsediskgroupenabled)
     */
    override fun isSparseDiskgroupEnabled(): Any? = unwrap(this).getIsSparseDiskgroupEnabled()

    /**
     * The Oracle license model applied to the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-licensemodel)
     */
    override fun licenseModel(): String? = unwrap(this).getLicenseModel()

    /**
     * The amount of memory, in gigabytes (GB), that's allocated for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-memorysizeingbs)
     */
    override fun memorySizeInGBs(): Number? = unwrap(this).getMemorySizeInGBs()

    /**
     * The unique identifier of the ODB network for the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-odbnetworkid)
     */
    override fun odbNetworkId(): String? = unwrap(this).getOdbNetworkId()

    /**
     * The port number for TCP connections to the single client access name (SCAN) listener.
     *
     * Valid values: `1024–8999` with the following exceptions: `2484` , `6100` , `6200` , `7060` ,
     * `7070` , `7085` , and `7879`
     *
     * Default: `1521`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-scanlistenerporttcp)
     */
    override fun scanListenerPortTcp(): Number? = unwrap(this).getScanListenerPortTcp()

    /**
     * The public key portion of one or more key pairs used for SSH access to the VM cluster.
     *
     * Required when creating a VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-sshpublickeys)
     */
    override fun sshPublicKeys(): List<String> = unwrap(this).getSshPublicKeys() ?: emptyList()

    /**
     * The operating system version of the image chosen for the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-systemversion)
     */
    override fun systemVersion(): String? = unwrap(this).getSystemVersion()

    /**
     * Tags to assign to the Vm Cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The time zone of the VM cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudvmcluster.html#cfn-odb-cloudvmcluster-timezone)
     */
    override fun timeZone(): String? = unwrap(this).getTimeZone()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCloudVmClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.odb.CfnCloudVmClusterProps):
        CfnCloudVmClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCloudVmClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCloudVmClusterProps):
        software.amazon.awscdk.services.odb.CfnCloudVmClusterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.odb.CfnCloudVmClusterProps
  }
}
