package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.redshift.CfnCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun allowVersionUpgrade(): Any? = unwrap(this).getAllowVersionUpgrade()

  public open fun allowVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAllowVersionUpgrade(`value`)
  }

  public open fun allowVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAllowVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  public open fun aquaConfigurationStatus(): String? = unwrap(this).getAquaConfigurationStatus()

  public open fun aquaConfigurationStatus(`value`: String) {
    unwrap(this).setAquaConfigurationStatus(`value`)
  }

  public open fun attrClusterNamespaceArn(): String = unwrap(this).getAttrClusterNamespaceArn()

  public open fun attrDeferMaintenanceIdentifier(): String =
      unwrap(this).getAttrDeferMaintenanceIdentifier()

  public open fun attrEndpointAddress(): String = unwrap(this).getAttrEndpointAddress()

  public open fun attrEndpointPort(): String = unwrap(this).getAttrEndpointPort()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrMasterPasswordSecretArn(): String =
      unwrap(this).getAttrMasterPasswordSecretArn()

  public open fun automatedSnapshotRetentionPeriod(): Number? =
      unwrap(this).getAutomatedSnapshotRetentionPeriod()

  public open fun automatedSnapshotRetentionPeriod(`value`: Number) {
    unwrap(this).setAutomatedSnapshotRetentionPeriod(`value`)
  }

  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public open fun availabilityZoneRelocation(): Any? = unwrap(this).getAvailabilityZoneRelocation()

  public open fun availabilityZoneRelocation(`value`: Boolean) {
    unwrap(this).setAvailabilityZoneRelocation(`value`)
  }

  public open fun availabilityZoneRelocation(`value`: IResolvable) {
    unwrap(this).setAvailabilityZoneRelocation(`value`.let(IResolvable::unwrap))
  }

  public open fun availabilityZoneRelocationStatus(): String? =
      unwrap(this).getAvailabilityZoneRelocationStatus()

  public open fun availabilityZoneRelocationStatus(`value`: String) {
    unwrap(this).setAvailabilityZoneRelocationStatus(`value`)
  }

  public open fun classic(): Any? = unwrap(this).getClassic()

  public open fun classic(`value`: Boolean) {
    unwrap(this).setClassic(`value`)
  }

  public open fun classic(`value`: IResolvable) {
    unwrap(this).setClassic(`value`.let(IResolvable::unwrap))
  }

  public open fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

  public open fun clusterIdentifier(`value`: String) {
    unwrap(this).setClusterIdentifier(`value`)
  }

  public open fun clusterParameterGroupName(): String? = unwrap(this).getClusterParameterGroupName()

  public open fun clusterParameterGroupName(`value`: String) {
    unwrap(this).setClusterParameterGroupName(`value`)
  }

  public open fun clusterSecurityGroups(): List<String> = unwrap(this).getClusterSecurityGroups() ?:
      emptyList()

  public open fun clusterSecurityGroups(`value`: List<String>) {
    unwrap(this).setClusterSecurityGroups(`value`)
  }

  public open fun clusterSubnetGroupName(): String? = unwrap(this).getClusterSubnetGroupName()

  public open fun clusterSubnetGroupName(`value`: String) {
    unwrap(this).setClusterSubnetGroupName(`value`)
  }

  public open fun clusterType(): String = unwrap(this).getClusterType()

  public open fun clusterType(`value`: String) {
    unwrap(this).setClusterType(`value`)
  }

  public open fun clusterVersion(): String? = unwrap(this).getClusterVersion()

  public open fun clusterVersion(`value`: String) {
    unwrap(this).setClusterVersion(`value`)
  }

  public open fun dbName(): String = unwrap(this).getDbName()

  public open fun dbName(`value`: String) {
    unwrap(this).setDbName(`value`)
  }

  public open fun deferMaintenance(): Any? = unwrap(this).getDeferMaintenance()

  public open fun deferMaintenance(`value`: Boolean) {
    unwrap(this).setDeferMaintenance(`value`)
  }

  public open fun deferMaintenance(`value`: IResolvable) {
    unwrap(this).setDeferMaintenance(`value`.let(IResolvable::unwrap))
  }

  public open fun deferMaintenanceDuration(): Number? = unwrap(this).getDeferMaintenanceDuration()

  public open fun deferMaintenanceDuration(`value`: Number) {
    unwrap(this).setDeferMaintenanceDuration(`value`)
  }

  public open fun deferMaintenanceEndTime(): String? = unwrap(this).getDeferMaintenanceEndTime()

  public open fun deferMaintenanceEndTime(`value`: String) {
    unwrap(this).setDeferMaintenanceEndTime(`value`)
  }

  public open fun deferMaintenanceStartTime(): String? = unwrap(this).getDeferMaintenanceStartTime()

  public open fun deferMaintenanceStartTime(`value`: String) {
    unwrap(this).setDeferMaintenanceStartTime(`value`)
  }

  public open fun destinationRegion(): String? = unwrap(this).getDestinationRegion()

  public open fun destinationRegion(`value`: String) {
    unwrap(this).setDestinationRegion(`value`)
  }

  public open fun elasticIp(): String? = unwrap(this).getElasticIp()

  public open fun elasticIp(`value`: String) {
    unwrap(this).setElasticIp(`value`)
  }

  public open fun encrypted(): Any? = unwrap(this).getEncrypted()

  public open fun encrypted(`value`: Boolean) {
    unwrap(this).setEncrypted(`value`)
  }

  public open fun encrypted(`value`: IResolvable) {
    unwrap(this).setEncrypted(`value`.let(IResolvable::unwrap))
  }

  public open fun endpoint(): Any? = unwrap(this).getEndpoint()

  public open fun endpoint(`value`: IResolvable) {
    unwrap(this).setEndpoint(`value`.let(IResolvable::unwrap))
  }

  public open fun endpoint(`value`: EndpointProperty) {
    unwrap(this).setEndpoint(`value`.let(EndpointProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c5f61f5fdc2adb3f352b24b2a99a7ff06f3db5a42946e978ec310f1167f61ec")
  public open fun endpoint(`value`: EndpointProperty.Builder.() -> Unit): Unit =
      endpoint(EndpointProperty(`value`))

  public open fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

  public open fun enhancedVpcRouting(`value`: Boolean) {
    unwrap(this).setEnhancedVpcRouting(`value`)
  }

  public open fun enhancedVpcRouting(`value`: IResolvable) {
    unwrap(this).setEnhancedVpcRouting(`value`.let(IResolvable::unwrap))
  }

  public open fun hsmClientCertificateIdentifier(): String? =
      unwrap(this).getHsmClientCertificateIdentifier()

  public open fun hsmClientCertificateIdentifier(`value`: String) {
    unwrap(this).setHsmClientCertificateIdentifier(`value`)
  }

  public open fun hsmConfigurationIdentifier(): String? =
      unwrap(this).getHsmConfigurationIdentifier()

  public open fun hsmConfigurationIdentifier(`value`: String) {
    unwrap(this).setHsmConfigurationIdentifier(`value`)
  }

  public open fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

  public open fun iamRoles(`value`: List<String>) {
    unwrap(this).setIamRoles(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun loggingProperties(): Any? = unwrap(this).getLoggingProperties()

  public open fun loggingProperties(`value`: IResolvable) {
    unwrap(this).setLoggingProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun loggingProperties(`value`: LoggingPropertiesProperty) {
    unwrap(this).setLoggingProperties(`value`.let(LoggingPropertiesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3849588bf80fc01af63a50c5d9e3a7756951ad80890c33babe265a0d786d2ec")
  public open fun loggingProperties(`value`: LoggingPropertiesProperty.Builder.() -> Unit): Unit =
      loggingProperties(LoggingPropertiesProperty(`value`))

  public open fun maintenanceTrackName(): String? = unwrap(this).getMaintenanceTrackName()

  public open fun maintenanceTrackName(`value`: String) {
    unwrap(this).setMaintenanceTrackName(`value`)
  }

  public open fun manageMasterPassword(): Any? = unwrap(this).getManageMasterPassword()

  public open fun manageMasterPassword(`value`: Boolean) {
    unwrap(this).setManageMasterPassword(`value`)
  }

  public open fun manageMasterPassword(`value`: IResolvable) {
    unwrap(this).setManageMasterPassword(`value`.let(IResolvable::unwrap))
  }

  public open fun manualSnapshotRetentionPeriod(): Number? =
      unwrap(this).getManualSnapshotRetentionPeriod()

  public open fun manualSnapshotRetentionPeriod(`value`: Number) {
    unwrap(this).setManualSnapshotRetentionPeriod(`value`)
  }

  public open fun masterPasswordSecretKmsKeyId(): String? =
      unwrap(this).getMasterPasswordSecretKmsKeyId()

  public open fun masterPasswordSecretKmsKeyId(`value`: String) {
    unwrap(this).setMasterPasswordSecretKmsKeyId(`value`)
  }

  public open fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  public open fun masterUserPassword(`value`: String) {
    unwrap(this).setMasterUserPassword(`value`)
  }

  public open fun masterUsername(): String = unwrap(this).getMasterUsername()

  public open fun masterUsername(`value`: String) {
    unwrap(this).setMasterUsername(`value`)
  }

  public open fun multiAz(): Any? = unwrap(this).getMultiAz()

  public open fun multiAz(`value`: Boolean) {
    unwrap(this).setMultiAz(`value`)
  }

  public open fun multiAz(`value`: IResolvable) {
    unwrap(this).setMultiAz(`value`.let(IResolvable::unwrap))
  }

  public open fun namespaceResourcePolicy(): Any? = unwrap(this).getNamespaceResourcePolicy()

  public open fun namespaceResourcePolicy(`value`: Any) {
    unwrap(this).setNamespaceResourcePolicy(`value`)
  }

  public open fun nodeType(): String = unwrap(this).getNodeType()

  public open fun nodeType(`value`: String) {
    unwrap(this).setNodeType(`value`)
  }

  public open fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()

  public open fun numberOfNodes(`value`: Number) {
    unwrap(this).setNumberOfNodes(`value`)
  }

  public open fun ownerAccount(): String? = unwrap(this).getOwnerAccount()

  public open fun ownerAccount(`value`: String) {
    unwrap(this).setOwnerAccount(`value`)
  }

  public open fun port(): Number? = unwrap(this).getPort()

  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  public open fun resourceAction(): String? = unwrap(this).getResourceAction()

  public open fun resourceAction(`value`: String) {
    unwrap(this).setResourceAction(`value`)
  }

  public open fun revisionTarget(): String? = unwrap(this).getRevisionTarget()

  public open fun revisionTarget(`value`: String) {
    unwrap(this).setRevisionTarget(`value`)
  }

  public open fun rotateEncryptionKey(): Any? = unwrap(this).getRotateEncryptionKey()

  public open fun rotateEncryptionKey(`value`: Boolean) {
    unwrap(this).setRotateEncryptionKey(`value`)
  }

  public open fun rotateEncryptionKey(`value`: IResolvable) {
    unwrap(this).setRotateEncryptionKey(`value`.let(IResolvable::unwrap))
  }

  public open fun snapshotClusterIdentifier(): String? = unwrap(this).getSnapshotClusterIdentifier()

  public open fun snapshotClusterIdentifier(`value`: String) {
    unwrap(this).setSnapshotClusterIdentifier(`value`)
  }

  public open fun snapshotCopyGrantName(): String? = unwrap(this).getSnapshotCopyGrantName()

  public open fun snapshotCopyGrantName(`value`: String) {
    unwrap(this).setSnapshotCopyGrantName(`value`)
  }

  public open fun snapshotCopyManual(): Any? = unwrap(this).getSnapshotCopyManual()

  public open fun snapshotCopyManual(`value`: Boolean) {
    unwrap(this).setSnapshotCopyManual(`value`)
  }

  public open fun snapshotCopyManual(`value`: IResolvable) {
    unwrap(this).setSnapshotCopyManual(`value`.let(IResolvable::unwrap))
  }

  public open fun snapshotCopyRetentionPeriod(): Number? =
      unwrap(this).getSnapshotCopyRetentionPeriod()

  public open fun snapshotCopyRetentionPeriod(`value`: Number) {
    unwrap(this).setSnapshotCopyRetentionPeriod(`value`)
  }

  public open fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

  public open fun snapshotIdentifier(`value`: String) {
    unwrap(this).setSnapshotIdentifier(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  public interface Builder {
    public fun allowVersionUpgrade(allowVersionUpgrade: Boolean) {
    }

    public fun allowVersionUpgrade(allowVersionUpgrade: IResolvable) {
    }

    public fun aquaConfigurationStatus(aquaConfigurationStatus: String) {
    }

    public fun automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod: Number) {
    }

    public fun availabilityZone(availabilityZone: String) {
    }

    public fun availabilityZoneRelocation(availabilityZoneRelocation: Boolean) {
    }

    public fun availabilityZoneRelocation(availabilityZoneRelocation: IResolvable) {
    }

    public fun availabilityZoneRelocationStatus(availabilityZoneRelocationStatus: String) {
    }

    public fun classic(classic: Boolean) {
    }

    public fun classic(classic: IResolvable) {
    }

    public fun clusterIdentifier(clusterIdentifier: String) {
    }

    public fun clusterParameterGroupName(clusterParameterGroupName: String) {
    }

    public fun clusterSecurityGroups(clusterSecurityGroups: List<String>) {
    }

    public fun clusterSubnetGroupName(clusterSubnetGroupName: String) {
    }

    public fun clusterType(clusterType: String) {
    }

    public fun clusterVersion(clusterVersion: String) {
    }

    public fun dbName(dbName: String) {
    }

    public fun deferMaintenance(deferMaintenance: Boolean) {
    }

    public fun deferMaintenance(deferMaintenance: IResolvable) {
    }

    public fun deferMaintenanceDuration(deferMaintenanceDuration: Number) {
    }

    public fun deferMaintenanceEndTime(deferMaintenanceEndTime: String) {
    }

    public fun deferMaintenanceStartTime(deferMaintenanceStartTime: String) {
    }

    public fun destinationRegion(destinationRegion: String) {
    }

    public fun elasticIp(elasticIp: String) {
    }

    public fun encrypted(encrypted: Boolean) {
    }

    public fun encrypted(encrypted: IResolvable) {
    }

    public fun endpoint(endpoint: IResolvable) {
    }

    public fun endpoint(endpoint: EndpointProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7789a04b5aae310aec4594353b8d42976087f3c4678b92de2ae629052e7bc25a")
    public fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit) {
    }

    public fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
    }

    public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
    }

    public fun hsmClientCertificateIdentifier(hsmClientCertificateIdentifier: String) {
    }

    public fun hsmConfigurationIdentifier(hsmConfigurationIdentifier: String) {
    }

    public fun iamRoles(iamRoles: List<String>) {
    }

    public fun kmsKeyId(kmsKeyId: String) {
    }

    public fun loggingProperties(loggingProperties: IResolvable) {
    }

    public fun loggingProperties(loggingProperties: LoggingPropertiesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d493307f8744f66c8390c4cadb67055577fc3782950415e9c1772f9a33538a14")
    public fun loggingProperties(loggingProperties: LoggingPropertiesProperty.Builder.() -> Unit) {
    }

    public fun maintenanceTrackName(maintenanceTrackName: String) {
    }

    public fun manageMasterPassword(manageMasterPassword: Boolean) {
    }

    public fun manageMasterPassword(manageMasterPassword: IResolvable) {
    }

    public fun manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod: Number) {
    }

    public fun masterPasswordSecretKmsKeyId(masterPasswordSecretKmsKeyId: String) {
    }

    public fun masterUserPassword(masterUserPassword: String) {
    }

    public fun masterUsername(masterUsername: String) {
    }

    public fun multiAz(multiAz: Boolean) {
    }

    public fun multiAz(multiAz: IResolvable) {
    }

    public fun namespaceResourcePolicy(namespaceResourcePolicy: Any) {
    }

    public fun nodeType(nodeType: String) {
    }

    public fun numberOfNodes(numberOfNodes: Number) {
    }

    public fun ownerAccount(ownerAccount: String) {
    }

    public fun port(port: Number) {
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    }

    public fun publiclyAccessible(publiclyAccessible: Boolean) {
    }

    public fun publiclyAccessible(publiclyAccessible: IResolvable) {
    }

    public fun resourceAction(resourceAction: String) {
    }

    public fun revisionTarget(revisionTarget: String) {
    }

    public fun rotateEncryptionKey(rotateEncryptionKey: Boolean) {
    }

    public fun rotateEncryptionKey(rotateEncryptionKey: IResolvable) {
    }

    public fun snapshotClusterIdentifier(snapshotClusterIdentifier: String) {
    }

    public fun snapshotCopyGrantName(snapshotCopyGrantName: String) {
    }

    public fun snapshotCopyManual(snapshotCopyManual: Boolean) {
    }

    public fun snapshotCopyManual(snapshotCopyManual: IResolvable) {
    }

    public fun snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod: Number) {
    }

    public fun snapshotIdentifier(snapshotIdentifier: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnCluster.Builder =
        software.amazon.awscdk.services.redshift.CfnCluster.Builder.create(scope, id)

    public override fun allowVersionUpgrade(allowVersionUpgrade: Boolean) {
      cdkBuilder.allowVersionUpgrade(allowVersionUpgrade)
    }

    public override fun allowVersionUpgrade(allowVersionUpgrade: IResolvable) {
      cdkBuilder.allowVersionUpgrade(allowVersionUpgrade.let(IResolvable::unwrap))
    }

    public override fun aquaConfigurationStatus(aquaConfigurationStatus: String) {
      cdkBuilder.aquaConfigurationStatus(aquaConfigurationStatus)
    }

    public override fun automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod: Number) {
      cdkBuilder.automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod)
    }

    public override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    public override fun availabilityZoneRelocation(availabilityZoneRelocation: Boolean) {
      cdkBuilder.availabilityZoneRelocation(availabilityZoneRelocation)
    }

    public override fun availabilityZoneRelocation(availabilityZoneRelocation: IResolvable) {
      cdkBuilder.availabilityZoneRelocation(availabilityZoneRelocation.let(IResolvable::unwrap))
    }

    public override fun availabilityZoneRelocationStatus(availabilityZoneRelocationStatus: String) {
      cdkBuilder.availabilityZoneRelocationStatus(availabilityZoneRelocationStatus)
    }

    public override fun classic(classic: Boolean) {
      cdkBuilder.classic(classic)
    }

    public override fun classic(classic: IResolvable) {
      cdkBuilder.classic(classic.let(IResolvable::unwrap))
    }

    public override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    public override fun clusterParameterGroupName(clusterParameterGroupName: String) {
      cdkBuilder.clusterParameterGroupName(clusterParameterGroupName)
    }

    public override fun clusterSecurityGroups(clusterSecurityGroups: List<String>) {
      cdkBuilder.clusterSecurityGroups(clusterSecurityGroups)
    }

    public override fun clusterSubnetGroupName(clusterSubnetGroupName: String) {
      cdkBuilder.clusterSubnetGroupName(clusterSubnetGroupName)
    }

    public override fun clusterType(clusterType: String) {
      cdkBuilder.clusterType(clusterType)
    }

    public override fun clusterVersion(clusterVersion: String) {
      cdkBuilder.clusterVersion(clusterVersion)
    }

    public override fun dbName(dbName: String) {
      cdkBuilder.dbName(dbName)
    }

    public override fun deferMaintenance(deferMaintenance: Boolean) {
      cdkBuilder.deferMaintenance(deferMaintenance)
    }

    public override fun deferMaintenance(deferMaintenance: IResolvable) {
      cdkBuilder.deferMaintenance(deferMaintenance.let(IResolvable::unwrap))
    }

    public override fun deferMaintenanceDuration(deferMaintenanceDuration: Number) {
      cdkBuilder.deferMaintenanceDuration(deferMaintenanceDuration)
    }

    public override fun deferMaintenanceEndTime(deferMaintenanceEndTime: String) {
      cdkBuilder.deferMaintenanceEndTime(deferMaintenanceEndTime)
    }

    public override fun deferMaintenanceStartTime(deferMaintenanceStartTime: String) {
      cdkBuilder.deferMaintenanceStartTime(deferMaintenanceStartTime)
    }

    public override fun destinationRegion(destinationRegion: String) {
      cdkBuilder.destinationRegion(destinationRegion)
    }

    public override fun elasticIp(elasticIp: String) {
      cdkBuilder.elasticIp(elasticIp)
    }

    public override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    public override fun encrypted(encrypted: IResolvable) {
      cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
    }

    public override fun endpoint(endpoint: IResolvable) {
      cdkBuilder.endpoint(endpoint.let(IResolvable::unwrap))
    }

    public override fun endpoint(endpoint: EndpointProperty) {
      cdkBuilder.endpoint(endpoint.let(EndpointProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7789a04b5aae310aec4594353b8d42976087f3c4678b92de2ae629052e7bc25a")
    public override fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit): Unit =
        endpoint(EndpointProperty(endpoint))

    public override fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    public override fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting.let(IResolvable::unwrap))
    }

    public override fun hsmClientCertificateIdentifier(hsmClientCertificateIdentifier: String) {
      cdkBuilder.hsmClientCertificateIdentifier(hsmClientCertificateIdentifier)
    }

    public override fun hsmConfigurationIdentifier(hsmConfigurationIdentifier: String) {
      cdkBuilder.hsmConfigurationIdentifier(hsmConfigurationIdentifier)
    }

    public override fun iamRoles(iamRoles: List<String>) {
      cdkBuilder.iamRoles(iamRoles)
    }

    public override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public override fun loggingProperties(loggingProperties: IResolvable) {
      cdkBuilder.loggingProperties(loggingProperties.let(IResolvable::unwrap))
    }

    public override fun loggingProperties(loggingProperties: LoggingPropertiesProperty) {
      cdkBuilder.loggingProperties(loggingProperties.let(LoggingPropertiesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d493307f8744f66c8390c4cadb67055577fc3782950415e9c1772f9a33538a14")
    public override
        fun loggingProperties(loggingProperties: LoggingPropertiesProperty.Builder.() -> Unit): Unit
        = loggingProperties(LoggingPropertiesProperty(loggingProperties))

    public override fun maintenanceTrackName(maintenanceTrackName: String) {
      cdkBuilder.maintenanceTrackName(maintenanceTrackName)
    }

    public override fun manageMasterPassword(manageMasterPassword: Boolean) {
      cdkBuilder.manageMasterPassword(manageMasterPassword)
    }

    public override fun manageMasterPassword(manageMasterPassword: IResolvable) {
      cdkBuilder.manageMasterPassword(manageMasterPassword.let(IResolvable::unwrap))
    }

    public override fun manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod: Number) {
      cdkBuilder.manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod)
    }

    public override fun masterPasswordSecretKmsKeyId(masterPasswordSecretKmsKeyId: String) {
      cdkBuilder.masterPasswordSecretKmsKeyId(masterPasswordSecretKmsKeyId)
    }

    public override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

    public override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    public override fun multiAz(multiAz: Boolean) {
      cdkBuilder.multiAz(multiAz)
    }

    public override fun multiAz(multiAz: IResolvable) {
      cdkBuilder.multiAz(multiAz.let(IResolvable::unwrap))
    }

    public override fun namespaceResourcePolicy(namespaceResourcePolicy: Any) {
      cdkBuilder.namespaceResourcePolicy(namespaceResourcePolicy)
    }

    public override fun nodeType(nodeType: String) {
      cdkBuilder.nodeType(nodeType)
    }

    public override fun numberOfNodes(numberOfNodes: Number) {
      cdkBuilder.numberOfNodes(numberOfNodes)
    }

    public override fun ownerAccount(ownerAccount: String) {
      cdkBuilder.ownerAccount(ownerAccount)
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    public override fun resourceAction(resourceAction: String) {
      cdkBuilder.resourceAction(resourceAction)
    }

    public override fun revisionTarget(revisionTarget: String) {
      cdkBuilder.revisionTarget(revisionTarget)
    }

    public override fun rotateEncryptionKey(rotateEncryptionKey: Boolean) {
      cdkBuilder.rotateEncryptionKey(rotateEncryptionKey)
    }

    public override fun rotateEncryptionKey(rotateEncryptionKey: IResolvable) {
      cdkBuilder.rotateEncryptionKey(rotateEncryptionKey.let(IResolvable::unwrap))
    }

    public override fun snapshotClusterIdentifier(snapshotClusterIdentifier: String) {
      cdkBuilder.snapshotClusterIdentifier(snapshotClusterIdentifier)
    }

    public override fun snapshotCopyGrantName(snapshotCopyGrantName: String) {
      cdkBuilder.snapshotCopyGrantName(snapshotCopyGrantName)
    }

    public override fun snapshotCopyManual(snapshotCopyManual: Boolean) {
      cdkBuilder.snapshotCopyManual(snapshotCopyManual)
    }

    public override fun snapshotCopyManual(snapshotCopyManual: IResolvable) {
      cdkBuilder.snapshotCopyManual(snapshotCopyManual.let(IResolvable::unwrap))
    }

    public override fun snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod: Number) {
      cdkBuilder.snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod)
    }

    public override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    public fun build(): software.amazon.awscdk.services.redshift.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnCluster): CfnCluster =
        CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster): software.amazon.awscdk.services.redshift.CfnCluster =
        wrapped.cdkObject
  }

  public interface EndpointProperty {
    public fun address(): String? = unwrap(this).getAddress()

    public fun port(): String? = unwrap(this).getPort()

    public interface Builder {
      public fun address(address: String) {
      }

      public fun port(port: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnCluster.EndpointProperty.Builder =
          software.amazon.awscdk.services.redshift.CfnCluster.EndpointProperty.builder()

      public override fun address(address: String) {
        cdkBuilder.address(address)
      }

      public override fun port(port: String) {
        cdkBuilder.port(port)
      }

      public fun build(): software.amazon.awscdk.services.redshift.CfnCluster.EndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.redshift.CfnCluster.EndpointProperty,
    ) : EndpointProperty {
      public override fun address(): String? = unwrap(this).getAddress()

      public override fun port(): String? = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnCluster.EndpointProperty):
          EndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointProperty):
          software.amazon.awscdk.services.redshift.CfnCluster.EndpointProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LoggingPropertiesProperty {
    public fun bucketName(): String? = unwrap(this).getBucketName()

    public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    public interface Builder {
      public fun bucketName(bucketName: String) {
      }

      public fun s3KeyPrefix(s3KeyPrefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty.Builder =
          software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty.builder()

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty,
    ) : LoggingPropertiesProperty {
      public override fun bucketName(): String? = unwrap(this).getBucketName()

      public override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty):
          LoggingPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingPropertiesProperty):
          software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
