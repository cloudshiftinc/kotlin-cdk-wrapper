@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnClusterProps {
  public fun allowVersionUpgrade(): Any? = unwrap(this).getAllowVersionUpgrade()

  public fun aquaConfigurationStatus(): String? = unwrap(this).getAquaConfigurationStatus()

  public fun automatedSnapshotRetentionPeriod(): Number? =
      unwrap(this).getAutomatedSnapshotRetentionPeriod()

  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public fun availabilityZoneRelocation(): Any? = unwrap(this).getAvailabilityZoneRelocation()

  public fun availabilityZoneRelocationStatus(): String? =
      unwrap(this).getAvailabilityZoneRelocationStatus()

  public fun classic(): Any? = unwrap(this).getClassic()

  public fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

  public fun clusterParameterGroupName(): String? = unwrap(this).getClusterParameterGroupName()

  public fun clusterSecurityGroups(): List<String> = unwrap(this).getClusterSecurityGroups() ?:
      emptyList()

  public fun clusterSubnetGroupName(): String? = unwrap(this).getClusterSubnetGroupName()

  public fun clusterType(): String

  public fun clusterVersion(): String? = unwrap(this).getClusterVersion()

  public fun dbName(): String

  public fun deferMaintenance(): Any? = unwrap(this).getDeferMaintenance()

  public fun deferMaintenanceDuration(): Number? = unwrap(this).getDeferMaintenanceDuration()

  public fun deferMaintenanceEndTime(): String? = unwrap(this).getDeferMaintenanceEndTime()

  public fun deferMaintenanceStartTime(): String? = unwrap(this).getDeferMaintenanceStartTime()

  public fun destinationRegion(): String? = unwrap(this).getDestinationRegion()

  public fun elasticIp(): String? = unwrap(this).getElasticIp()

  public fun encrypted(): Any? = unwrap(this).getEncrypted()

  public fun endpoint(): Any? = unwrap(this).getEndpoint()

  public fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

  public fun hsmClientCertificateIdentifier(): String? =
      unwrap(this).getHsmClientCertificateIdentifier()

  public fun hsmConfigurationIdentifier(): String? = unwrap(this).getHsmConfigurationIdentifier()

  public fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun loggingProperties(): Any? = unwrap(this).getLoggingProperties()

  public fun maintenanceTrackName(): String? = unwrap(this).getMaintenanceTrackName()

  public fun manageMasterPassword(): Any? = unwrap(this).getManageMasterPassword()

  public fun manualSnapshotRetentionPeriod(): Number? =
      unwrap(this).getManualSnapshotRetentionPeriod()

  public fun masterPasswordSecretKmsKeyId(): String? =
      unwrap(this).getMasterPasswordSecretKmsKeyId()

  public fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  public fun masterUsername(): String

  public fun multiAz(): Any? = unwrap(this).getMultiAz()

  public fun namespaceResourcePolicy(): Any? = unwrap(this).getNamespaceResourcePolicy()

  public fun nodeType(): String

  public fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()

  public fun ownerAccount(): String? = unwrap(this).getOwnerAccount()

  public fun port(): Number? = unwrap(this).getPort()

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public fun resourceAction(): String? = unwrap(this).getResourceAction()

  public fun revisionTarget(): String? = unwrap(this).getRevisionTarget()

  public fun rotateEncryptionKey(): Any? = unwrap(this).getRotateEncryptionKey()

  public fun snapshotClusterIdentifier(): String? = unwrap(this).getSnapshotClusterIdentifier()

  public fun snapshotCopyGrantName(): String? = unwrap(this).getSnapshotCopyGrantName()

  public fun snapshotCopyManual(): Any? = unwrap(this).getSnapshotCopyManual()

  public fun snapshotCopyRetentionPeriod(): Number? = unwrap(this).getSnapshotCopyRetentionPeriod()

  public fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun allowVersionUpgrade(allowVersionUpgrade: Boolean)

    public fun allowVersionUpgrade(allowVersionUpgrade: IResolvable)

    public fun aquaConfigurationStatus(aquaConfigurationStatus: String)

    public fun automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod: Number)

    public fun availabilityZone(availabilityZone: String)

    public fun availabilityZoneRelocation(availabilityZoneRelocation: Boolean)

    public fun availabilityZoneRelocation(availabilityZoneRelocation: IResolvable)

    public fun availabilityZoneRelocationStatus(availabilityZoneRelocationStatus: String)

    public fun classic(classic: Boolean)

    public fun classic(classic: IResolvable)

    public fun clusterIdentifier(clusterIdentifier: String)

    public fun clusterParameterGroupName(clusterParameterGroupName: String)

    public fun clusterSecurityGroups(clusterSecurityGroups: List<String>)

    public fun clusterSecurityGroups(vararg clusterSecurityGroups: String)

    public fun clusterSubnetGroupName(clusterSubnetGroupName: String)

    public fun clusterType(clusterType: String)

    public fun clusterVersion(clusterVersion: String)

    public fun dbName(dbName: String)

    public fun deferMaintenance(deferMaintenance: Boolean)

    public fun deferMaintenance(deferMaintenance: IResolvable)

    public fun deferMaintenanceDuration(deferMaintenanceDuration: Number)

    public fun deferMaintenanceEndTime(deferMaintenanceEndTime: String)

    public fun deferMaintenanceStartTime(deferMaintenanceStartTime: String)

    public fun destinationRegion(destinationRegion: String)

    public fun elasticIp(elasticIp: String)

    public fun encrypted(encrypted: Boolean)

    public fun encrypted(encrypted: IResolvable)

    public fun endpoint(endpoint: IResolvable)

    public fun endpoint(endpoint: CfnCluster.EndpointProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfed4922e5f250405228a544bd84b136fdd0cd5b2812b681945a180f8812e01a")
    public fun endpoint(endpoint: CfnCluster.EndpointProperty.Builder.() -> Unit)

    public fun enhancedVpcRouting(enhancedVpcRouting: Boolean)

    public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable)

    public fun hsmClientCertificateIdentifier(hsmClientCertificateIdentifier: String)

    public fun hsmConfigurationIdentifier(hsmConfigurationIdentifier: String)

    public fun iamRoles(iamRoles: List<String>)

    public fun iamRoles(vararg iamRoles: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun loggingProperties(loggingProperties: IResolvable)

    public fun loggingProperties(loggingProperties: CfnCluster.LoggingPropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee943571b6accd866a1f7cc55dde370e4aabaeca6d883765b8dc66c1cceee903")
    public
        fun loggingProperties(loggingProperties: CfnCluster.LoggingPropertiesProperty.Builder.() -> Unit)

    public fun maintenanceTrackName(maintenanceTrackName: String)

    public fun manageMasterPassword(manageMasterPassword: Boolean)

    public fun manageMasterPassword(manageMasterPassword: IResolvable)

    public fun manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod: Number)

    public fun masterPasswordSecretKmsKeyId(masterPasswordSecretKmsKeyId: String)

    public fun masterUserPassword(masterUserPassword: String)

    public fun masterUsername(masterUsername: String)

    public fun multiAz(multiAz: Boolean)

    public fun multiAz(multiAz: IResolvable)

    public fun namespaceResourcePolicy(namespaceResourcePolicy: Any)

    public fun nodeType(nodeType: String)

    public fun numberOfNodes(numberOfNodes: Number)

    public fun ownerAccount(ownerAccount: String)

    public fun port(port: Number)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun publiclyAccessible(publiclyAccessible: Boolean)

    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    public fun resourceAction(resourceAction: String)

    public fun revisionTarget(revisionTarget: String)

    public fun rotateEncryptionKey(rotateEncryptionKey: Boolean)

    public fun rotateEncryptionKey(rotateEncryptionKey: IResolvable)

    public fun snapshotClusterIdentifier(snapshotClusterIdentifier: String)

    public fun snapshotCopyGrantName(snapshotCopyGrantName: String)

    public fun snapshotCopyManual(snapshotCopyManual: Boolean)

    public fun snapshotCopyManual(snapshotCopyManual: IResolvable)

    public fun snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod: Number)

    public fun snapshotIdentifier(snapshotIdentifier: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnClusterProps.Builder =
        software.amazon.awscdk.services.redshift.CfnClusterProps.builder()

    override fun allowVersionUpgrade(allowVersionUpgrade: Boolean) {
      cdkBuilder.allowVersionUpgrade(allowVersionUpgrade)
    }

    override fun allowVersionUpgrade(allowVersionUpgrade: IResolvable) {
      cdkBuilder.allowVersionUpgrade(allowVersionUpgrade.let(IResolvable::unwrap))
    }

    override fun aquaConfigurationStatus(aquaConfigurationStatus: String) {
      cdkBuilder.aquaConfigurationStatus(aquaConfigurationStatus)
    }

    override fun automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod: Number) {
      cdkBuilder.automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod)
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun availabilityZoneRelocation(availabilityZoneRelocation: Boolean) {
      cdkBuilder.availabilityZoneRelocation(availabilityZoneRelocation)
    }

    override fun availabilityZoneRelocation(availabilityZoneRelocation: IResolvable) {
      cdkBuilder.availabilityZoneRelocation(availabilityZoneRelocation.let(IResolvable::unwrap))
    }

    override fun availabilityZoneRelocationStatus(availabilityZoneRelocationStatus: String) {
      cdkBuilder.availabilityZoneRelocationStatus(availabilityZoneRelocationStatus)
    }

    override fun classic(classic: Boolean) {
      cdkBuilder.classic(classic)
    }

    override fun classic(classic: IResolvable) {
      cdkBuilder.classic(classic.let(IResolvable::unwrap))
    }

    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    override fun clusterParameterGroupName(clusterParameterGroupName: String) {
      cdkBuilder.clusterParameterGroupName(clusterParameterGroupName)
    }

    override fun clusterSecurityGroups(clusterSecurityGroups: List<String>) {
      cdkBuilder.clusterSecurityGroups(clusterSecurityGroups)
    }

    override fun clusterSecurityGroups(vararg clusterSecurityGroups: String): Unit =
        clusterSecurityGroups(clusterSecurityGroups.toList())

    override fun clusterSubnetGroupName(clusterSubnetGroupName: String) {
      cdkBuilder.clusterSubnetGroupName(clusterSubnetGroupName)
    }

    override fun clusterType(clusterType: String) {
      cdkBuilder.clusterType(clusterType)
    }

    override fun clusterVersion(clusterVersion: String) {
      cdkBuilder.clusterVersion(clusterVersion)
    }

    override fun dbName(dbName: String) {
      cdkBuilder.dbName(dbName)
    }

    override fun deferMaintenance(deferMaintenance: Boolean) {
      cdkBuilder.deferMaintenance(deferMaintenance)
    }

    override fun deferMaintenance(deferMaintenance: IResolvable) {
      cdkBuilder.deferMaintenance(deferMaintenance.let(IResolvable::unwrap))
    }

    override fun deferMaintenanceDuration(deferMaintenanceDuration: Number) {
      cdkBuilder.deferMaintenanceDuration(deferMaintenanceDuration)
    }

    override fun deferMaintenanceEndTime(deferMaintenanceEndTime: String) {
      cdkBuilder.deferMaintenanceEndTime(deferMaintenanceEndTime)
    }

    override fun deferMaintenanceStartTime(deferMaintenanceStartTime: String) {
      cdkBuilder.deferMaintenanceStartTime(deferMaintenanceStartTime)
    }

    override fun destinationRegion(destinationRegion: String) {
      cdkBuilder.destinationRegion(destinationRegion)
    }

    override fun elasticIp(elasticIp: String) {
      cdkBuilder.elasticIp(elasticIp)
    }

    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    override fun encrypted(encrypted: IResolvable) {
      cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
    }

    override fun endpoint(endpoint: IResolvable) {
      cdkBuilder.endpoint(endpoint.let(IResolvable::unwrap))
    }

    override fun endpoint(endpoint: CfnCluster.EndpointProperty) {
      cdkBuilder.endpoint(endpoint.let(CfnCluster.EndpointProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfed4922e5f250405228a544bd84b136fdd0cd5b2812b681945a180f8812e01a")
    override fun endpoint(endpoint: CfnCluster.EndpointProperty.Builder.() -> Unit): Unit =
        endpoint(CfnCluster.EndpointProperty(endpoint))

    override fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    override fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting.let(IResolvable::unwrap))
    }

    override fun hsmClientCertificateIdentifier(hsmClientCertificateIdentifier: String) {
      cdkBuilder.hsmClientCertificateIdentifier(hsmClientCertificateIdentifier)
    }

    override fun hsmConfigurationIdentifier(hsmConfigurationIdentifier: String) {
      cdkBuilder.hsmConfigurationIdentifier(hsmConfigurationIdentifier)
    }

    override fun iamRoles(iamRoles: List<String>) {
      cdkBuilder.iamRoles(iamRoles)
    }

    override fun iamRoles(vararg iamRoles: String): Unit = iamRoles(iamRoles.toList())

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun loggingProperties(loggingProperties: IResolvable) {
      cdkBuilder.loggingProperties(loggingProperties.let(IResolvable::unwrap))
    }

    override fun loggingProperties(loggingProperties: CfnCluster.LoggingPropertiesProperty) {
      cdkBuilder.loggingProperties(loggingProperties.let(CfnCluster.LoggingPropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee943571b6accd866a1f7cc55dde370e4aabaeca6d883765b8dc66c1cceee903")
    override
        fun loggingProperties(loggingProperties: CfnCluster.LoggingPropertiesProperty.Builder.() -> Unit):
        Unit = loggingProperties(CfnCluster.LoggingPropertiesProperty(loggingProperties))

    override fun maintenanceTrackName(maintenanceTrackName: String) {
      cdkBuilder.maintenanceTrackName(maintenanceTrackName)
    }

    override fun manageMasterPassword(manageMasterPassword: Boolean) {
      cdkBuilder.manageMasterPassword(manageMasterPassword)
    }

    override fun manageMasterPassword(manageMasterPassword: IResolvable) {
      cdkBuilder.manageMasterPassword(manageMasterPassword.let(IResolvable::unwrap))
    }

    override fun manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod: Number) {
      cdkBuilder.manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod)
    }

    override fun masterPasswordSecretKmsKeyId(masterPasswordSecretKmsKeyId: String) {
      cdkBuilder.masterPasswordSecretKmsKeyId(masterPasswordSecretKmsKeyId)
    }

    override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    override fun multiAz(multiAz: Boolean) {
      cdkBuilder.multiAz(multiAz)
    }

    override fun multiAz(multiAz: IResolvable) {
      cdkBuilder.multiAz(multiAz.let(IResolvable::unwrap))
    }

    override fun namespaceResourcePolicy(namespaceResourcePolicy: Any) {
      cdkBuilder.namespaceResourcePolicy(namespaceResourcePolicy)
    }

    override fun nodeType(nodeType: String) {
      cdkBuilder.nodeType(nodeType)
    }

    override fun numberOfNodes(numberOfNodes: Number) {
      cdkBuilder.numberOfNodes(numberOfNodes)
    }

    override fun ownerAccount(ownerAccount: String) {
      cdkBuilder.ownerAccount(ownerAccount)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    override fun resourceAction(resourceAction: String) {
      cdkBuilder.resourceAction(resourceAction)
    }

    override fun revisionTarget(revisionTarget: String) {
      cdkBuilder.revisionTarget(revisionTarget)
    }

    override fun rotateEncryptionKey(rotateEncryptionKey: Boolean) {
      cdkBuilder.rotateEncryptionKey(rotateEncryptionKey)
    }

    override fun rotateEncryptionKey(rotateEncryptionKey: IResolvable) {
      cdkBuilder.rotateEncryptionKey(rotateEncryptionKey.let(IResolvable::unwrap))
    }

    override fun snapshotClusterIdentifier(snapshotClusterIdentifier: String) {
      cdkBuilder.snapshotClusterIdentifier(snapshotClusterIdentifier)
    }

    override fun snapshotCopyGrantName(snapshotCopyGrantName: String) {
      cdkBuilder.snapshotCopyGrantName(snapshotCopyGrantName)
    }

    override fun snapshotCopyManual(snapshotCopyManual: Boolean) {
      cdkBuilder.snapshotCopyManual(snapshotCopyManual)
    }

    override fun snapshotCopyManual(snapshotCopyManual: IResolvable) {
      cdkBuilder.snapshotCopyManual(snapshotCopyManual.let(IResolvable::unwrap))
    }

    override fun snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod: Number) {
      cdkBuilder.snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod)
    }

    override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.redshift.CfnClusterProps,
  ) : CdkObject(cdkObject), CfnClusterProps {
    override fun allowVersionUpgrade(): Any? = unwrap(this).getAllowVersionUpgrade()

    override fun aquaConfigurationStatus(): String? = unwrap(this).getAquaConfigurationStatus()

    override fun automatedSnapshotRetentionPeriod(): Number? =
        unwrap(this).getAutomatedSnapshotRetentionPeriod()

    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun availabilityZoneRelocation(): Any? = unwrap(this).getAvailabilityZoneRelocation()

    override fun availabilityZoneRelocationStatus(): String? =
        unwrap(this).getAvailabilityZoneRelocationStatus()

    override fun classic(): Any? = unwrap(this).getClassic()

    override fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

    override fun clusterParameterGroupName(): String? = unwrap(this).getClusterParameterGroupName()

    override fun clusterSecurityGroups(): List<String> = unwrap(this).getClusterSecurityGroups() ?:
        emptyList()

    override fun clusterSubnetGroupName(): String? = unwrap(this).getClusterSubnetGroupName()

    override fun clusterType(): String = unwrap(this).getClusterType()

    override fun clusterVersion(): String? = unwrap(this).getClusterVersion()

    override fun dbName(): String = unwrap(this).getDbName()

    override fun deferMaintenance(): Any? = unwrap(this).getDeferMaintenance()

    override fun deferMaintenanceDuration(): Number? = unwrap(this).getDeferMaintenanceDuration()

    override fun deferMaintenanceEndTime(): String? = unwrap(this).getDeferMaintenanceEndTime()

    override fun deferMaintenanceStartTime(): String? = unwrap(this).getDeferMaintenanceStartTime()

    override fun destinationRegion(): String? = unwrap(this).getDestinationRegion()

    override fun elasticIp(): String? = unwrap(this).getElasticIp()

    override fun encrypted(): Any? = unwrap(this).getEncrypted()

    override fun endpoint(): Any? = unwrap(this).getEndpoint()

    override fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

    override fun hsmClientCertificateIdentifier(): String? =
        unwrap(this).getHsmClientCertificateIdentifier()

    override fun hsmConfigurationIdentifier(): String? =
        unwrap(this).getHsmConfigurationIdentifier()

    override fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun loggingProperties(): Any? = unwrap(this).getLoggingProperties()

    override fun maintenanceTrackName(): String? = unwrap(this).getMaintenanceTrackName()

    override fun manageMasterPassword(): Any? = unwrap(this).getManageMasterPassword()

    override fun manualSnapshotRetentionPeriod(): Number? =
        unwrap(this).getManualSnapshotRetentionPeriod()

    override fun masterPasswordSecretKmsKeyId(): String? =
        unwrap(this).getMasterPasswordSecretKmsKeyId()

    override fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

    override fun masterUsername(): String = unwrap(this).getMasterUsername()

    override fun multiAz(): Any? = unwrap(this).getMultiAz()

    override fun namespaceResourcePolicy(): Any? = unwrap(this).getNamespaceResourcePolicy()

    override fun nodeType(): String = unwrap(this).getNodeType()

    override fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()

    override fun ownerAccount(): String? = unwrap(this).getOwnerAccount()

    override fun port(): Number? = unwrap(this).getPort()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    override fun resourceAction(): String? = unwrap(this).getResourceAction()

    override fun revisionTarget(): String? = unwrap(this).getRevisionTarget()

    override fun rotateEncryptionKey(): Any? = unwrap(this).getRotateEncryptionKey()

    override fun snapshotClusterIdentifier(): String? = unwrap(this).getSnapshotClusterIdentifier()

    override fun snapshotCopyGrantName(): String? = unwrap(this).getSnapshotCopyGrantName()

    override fun snapshotCopyManual(): Any? = unwrap(this).getSnapshotCopyManual()

    override fun snapshotCopyRetentionPeriod(): Number? =
        unwrap(this).getSnapshotCopyRetentionPeriod()

    override fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnClusterProps):
        CfnClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.redshift.CfnClusterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.redshift.CfnClusterProps
  }
}
