package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
  internal override val cdkObject: software.amazon.awscdk.services.redshift.CfnCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * If `true` , major version upgrades can be applied during the maintenance window to the Amazon
   * Redshift engine that is running on the cluster.
   */
  public open fun allowVersionUpgrade(): Any? = unwrap(this).getAllowVersionUpgrade()

  /**
   * If `true` , major version upgrades can be applied during the maintenance window to the Amazon
   * Redshift engine that is running on the cluster.
   */
  public open fun allowVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAllowVersionUpgrade(`value`)
  }

  /**
   * If `true` , major version upgrades can be applied during the maintenance window to the Amazon
   * Redshift engine that is running on the cluster.
   */
  public open fun allowVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAllowVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  /**
   * This parameter is retired.
   */
  public open fun aquaConfigurationStatus(): String? = unwrap(this).getAquaConfigurationStatus()

  /**
   * This parameter is retired.
   */
  public open fun aquaConfigurationStatus(`value`: String) {
    unwrap(this).setAquaConfigurationStatus(`value`)
  }

  /**
   * The namespace Amazon Resource Name (ARN) of the cluster.
   */
  public open fun attrClusterNamespaceArn(): String = unwrap(this).getAttrClusterNamespaceArn()

  /**
   * A unique identifier for the maintenance window.
   */
  public open fun attrDeferMaintenanceIdentifier(): String =
      unwrap(this).getAttrDeferMaintenanceIdentifier()

  /**
   * The connection endpoint for the Amazon Redshift cluster.
   *
   * For example: `examplecluster.cg034hpkmmjt.us-east-1.redshift.amazonaws.com` .
   */
  public open fun attrEndpointAddress(): String = unwrap(this).getAttrEndpointAddress()

  /**
   * The port number on which the Amazon Redshift cluster accepts connections.
   *
   * For example: `5439` .
   */
  public open fun attrEndpointPort(): String = unwrap(this).getAttrEndpointPort()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Amazon Resource Name (ARN) for the cluster's admin user credentials secret.
   */
  public open fun attrMasterPasswordSecretArn(): String =
      unwrap(this).getAttrMasterPasswordSecretArn()

  /**
   * The number of days that automated snapshots are retained.
   */
  public open fun automatedSnapshotRetentionPeriod(): Number? =
      unwrap(this).getAutomatedSnapshotRetentionPeriod()

  /**
   * The number of days that automated snapshots are retained.
   */
  public open fun automatedSnapshotRetentionPeriod(`value`: Number) {
    unwrap(this).setAutomatedSnapshotRetentionPeriod(`value`)
  }

  /**
   * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster.
   */
  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster.
   */
  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  /**
   * The option to enable relocation for an Amazon Redshift cluster between Availability Zones after
   * the cluster is created.
   */
  public open fun availabilityZoneRelocation(): Any? = unwrap(this).getAvailabilityZoneRelocation()

  /**
   * The option to enable relocation for an Amazon Redshift cluster between Availability Zones after
   * the cluster is created.
   */
  public open fun availabilityZoneRelocation(`value`: Boolean) {
    unwrap(this).setAvailabilityZoneRelocation(`value`)
  }

  /**
   * The option to enable relocation for an Amazon Redshift cluster between Availability Zones after
   * the cluster is created.
   */
  public open fun availabilityZoneRelocation(`value`: IResolvable) {
    unwrap(this).setAvailabilityZoneRelocation(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes the status of the Availability Zone relocation operation.
   */
  public open fun availabilityZoneRelocationStatus(): String? =
      unwrap(this).getAvailabilityZoneRelocationStatus()

  /**
   * Describes the status of the Availability Zone relocation operation.
   */
  public open fun availabilityZoneRelocationStatus(`value`: String) {
    unwrap(this).setAvailabilityZoneRelocationStatus(`value`)
  }

  /**
   * A boolean value indicating whether the resize operation is using the classic resize process.
   */
  public open fun classic(): Any? = unwrap(this).getClassic()

  /**
   * A boolean value indicating whether the resize operation is using the classic resize process.
   */
  public open fun classic(`value`: Boolean) {
    unwrap(this).setClassic(`value`)
  }

  /**
   * A boolean value indicating whether the resize operation is using the classic resize process.
   */
  public open fun classic(`value`: IResolvable) {
    unwrap(this).setClassic(`value`.let(IResolvable::unwrap))
  }

  /**
   * A unique identifier for the cluster.
   */
  public open fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

  /**
   * A unique identifier for the cluster.
   */
  public open fun clusterIdentifier(`value`: String) {
    unwrap(this).setClusterIdentifier(`value`)
  }

  /**
   * The name of the parameter group to be associated with this cluster.
   */
  public open fun clusterParameterGroupName(): String? = unwrap(this).getClusterParameterGroupName()

  /**
   * The name of the parameter group to be associated with this cluster.
   */
  public open fun clusterParameterGroupName(`value`: String) {
    unwrap(this).setClusterParameterGroupName(`value`)
  }

  /**
   * A list of security groups to be associated with this cluster.
   */
  public open fun clusterSecurityGroups(): List<String> = unwrap(this).getClusterSecurityGroups() ?:
      emptyList()

  /**
   * A list of security groups to be associated with this cluster.
   */
  public open fun clusterSecurityGroups(`value`: List<String>) {
    unwrap(this).setClusterSecurityGroups(`value`)
  }

  /**
   * A list of security groups to be associated with this cluster.
   */
  public open fun clusterSecurityGroups(vararg `value`: String): Unit =
      clusterSecurityGroups(`value`.toList())

  /**
   * The name of a cluster subnet group to be associated with this cluster.
   */
  public open fun clusterSubnetGroupName(): String? = unwrap(this).getClusterSubnetGroupName()

  /**
   * The name of a cluster subnet group to be associated with this cluster.
   */
  public open fun clusterSubnetGroupName(`value`: String) {
    unwrap(this).setClusterSubnetGroupName(`value`)
  }

  /**
   * The type of the cluster.
   *
   * When cluster type is specified as.
   */
  public open fun clusterType(): String = unwrap(this).getClusterType()

  /**
   * The type of the cluster.
   *
   * When cluster type is specified as.
   */
  public open fun clusterType(`value`: String) {
    unwrap(this).setClusterType(`value`)
  }

  /**
   * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
   */
  public open fun clusterVersion(): String? = unwrap(this).getClusterVersion()

  /**
   * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
   */
  public open fun clusterVersion(`value`: String) {
    unwrap(this).setClusterVersion(`value`)
  }

  /**
   * The name of the first database to be created when the cluster is created.
   */
  public open fun dbName(): String = unwrap(this).getDbName()

  /**
   * The name of the first database to be created when the cluster is created.
   */
  public open fun dbName(`value`: String) {
    unwrap(this).setDbName(`value`)
  }

  /**
   * A Boolean indicating whether to enable the deferred maintenance window.
   */
  public open fun deferMaintenance(): Any? = unwrap(this).getDeferMaintenance()

  /**
   * A Boolean indicating whether to enable the deferred maintenance window.
   */
  public open fun deferMaintenance(`value`: Boolean) {
    unwrap(this).setDeferMaintenance(`value`)
  }

  /**
   * A Boolean indicating whether to enable the deferred maintenance window.
   */
  public open fun deferMaintenance(`value`: IResolvable) {
    unwrap(this).setDeferMaintenance(`value`.let(IResolvable::unwrap))
  }

  /**
   * An integer indicating the duration of the maintenance window in days.
   */
  public open fun deferMaintenanceDuration(): Number? = unwrap(this).getDeferMaintenanceDuration()

  /**
   * An integer indicating the duration of the maintenance window in days.
   */
  public open fun deferMaintenanceDuration(`value`: Number) {
    unwrap(this).setDeferMaintenanceDuration(`value`)
  }

  /**
   * A timestamp for the end of the time period when we defer maintenance.
   */
  public open fun deferMaintenanceEndTime(): String? = unwrap(this).getDeferMaintenanceEndTime()

  /**
   * A timestamp for the end of the time period when we defer maintenance.
   */
  public open fun deferMaintenanceEndTime(`value`: String) {
    unwrap(this).setDeferMaintenanceEndTime(`value`)
  }

  /**
   * A timestamp indicating the start time for the deferred maintenance window.
   */
  public open fun deferMaintenanceStartTime(): String? = unwrap(this).getDeferMaintenanceStartTime()

  /**
   * A timestamp indicating the start time for the deferred maintenance window.
   */
  public open fun deferMaintenanceStartTime(`value`: String) {
    unwrap(this).setDeferMaintenanceStartTime(`value`)
  }

  /**
   * The destination region that snapshots are automatically copied to when cross-region snapshot
   * copy is enabled.
   */
  public open fun destinationRegion(): String? = unwrap(this).getDestinationRegion()

  /**
   * The destination region that snapshots are automatically copied to when cross-region snapshot
   * copy is enabled.
   */
  public open fun destinationRegion(`value`: String) {
    unwrap(this).setDestinationRegion(`value`)
  }

  /**
   * The Elastic IP (EIP) address for the cluster.
   */
  public open fun elasticIp(): String? = unwrap(this).getElasticIp()

  /**
   * The Elastic IP (EIP) address for the cluster.
   */
  public open fun elasticIp(`value`: String) {
    unwrap(this).setElasticIp(`value`)
  }

  /**
   * If `true` , the data in the cluster is encrypted at rest.
   */
  public open fun encrypted(): Any? = unwrap(this).getEncrypted()

  /**
   * If `true` , the data in the cluster is encrypted at rest.
   */
  public open fun encrypted(`value`: Boolean) {
    unwrap(this).setEncrypted(`value`)
  }

  /**
   * If `true` , the data in the cluster is encrypted at rest.
   */
  public open fun encrypted(`value`: IResolvable) {
    unwrap(this).setEncrypted(`value`.let(IResolvable::unwrap))
  }

  /**
   * The connection endpoint.
   */
  public open fun endpoint(): Any? = unwrap(this).getEndpoint()

  /**
   * The connection endpoint.
   */
  public open fun endpoint(`value`: IResolvable) {
    unwrap(this).setEndpoint(`value`.let(IResolvable::unwrap))
  }

  /**
   * The connection endpoint.
   */
  public open fun endpoint(`value`: EndpointProperty) {
    unwrap(this).setEndpoint(`value`.let(EndpointProperty::unwrap))
  }

  /**
   * The connection endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c5f61f5fdc2adb3f352b24b2a99a7ff06f3db5a42946e978ec310f1167f61ec")
  public open fun endpoint(`value`: EndpointProperty.Builder.() -> Unit): Unit =
      endpoint(EndpointProperty(`value`))

  /**
   * An option that specifies whether to create the cluster with enhanced VPC routing enabled.
   */
  public open fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

  /**
   * An option that specifies whether to create the cluster with enhanced VPC routing enabled.
   */
  public open fun enhancedVpcRouting(`value`: Boolean) {
    unwrap(this).setEnhancedVpcRouting(`value`)
  }

  /**
   * An option that specifies whether to create the cluster with enhanced VPC routing enabled.
   */
  public open fun enhancedVpcRouting(`value`: IResolvable) {
    unwrap(this).setEnhancedVpcRouting(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve
   * the data encryption keys stored in an HSM.
   */
  public open fun hsmClientCertificateIdentifier(): String? =
      unwrap(this).getHsmClientCertificateIdentifier()

  /**
   * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve
   * the data encryption keys stored in an HSM.
   */
  public open fun hsmClientCertificateIdentifier(`value`: String) {
    unwrap(this).setHsmClientCertificateIdentifier(`value`)
  }

  /**
   * Specifies the name of the HSM configuration that contains the information the Amazon Redshift
   * cluster can use to retrieve and store keys in an HSM.
   */
  public open fun hsmConfigurationIdentifier(): String? =
      unwrap(this).getHsmConfigurationIdentifier()

  /**
   * Specifies the name of the HSM configuration that contains the information the Amazon Redshift
   * cluster can use to retrieve and store keys in an HSM.
   */
  public open fun hsmConfigurationIdentifier(`value`: String) {
    unwrap(this).setHsmConfigurationIdentifier(`value`)
  }

  /**
   * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to
   * access other AWS services.
   */
  public open fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

  /**
   * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to
   * access other AWS services.
   */
  public open fun iamRoles(`value`: List<String>) {
    unwrap(this).setIamRoles(`value`)
  }

  /**
   * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to
   * access other AWS services.
   */
  public open fun iamRoles(vararg `value`: String): Unit = iamRoles(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to
   * encrypt data in the cluster.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to
   * encrypt data in the cluster.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * Specifies logging information, such as queries and connection attempts, for the specified
   * Amazon Redshift cluster.
   */
  public open fun loggingProperties(): Any? = unwrap(this).getLoggingProperties()

  /**
   * Specifies logging information, such as queries and connection attempts, for the specified
   * Amazon Redshift cluster.
   */
  public open fun loggingProperties(`value`: IResolvable) {
    unwrap(this).setLoggingProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies logging information, such as queries and connection attempts, for the specified
   * Amazon Redshift cluster.
   */
  public open fun loggingProperties(`value`: LoggingPropertiesProperty) {
    unwrap(this).setLoggingProperties(`value`.let(LoggingPropertiesProperty::unwrap))
  }

  /**
   * Specifies logging information, such as queries and connection attempts, for the specified
   * Amazon Redshift cluster.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3849588bf80fc01af63a50c5d9e3a7756951ad80890c33babe265a0d786d2ec")
  public open fun loggingProperties(`value`: LoggingPropertiesProperty.Builder.() -> Unit): Unit =
      loggingProperties(LoggingPropertiesProperty(`value`))

  /**
   * An optional parameter for the name of the maintenance track for the cluster.
   */
  public open fun maintenanceTrackName(): String? = unwrap(this).getMaintenanceTrackName()

  /**
   * An optional parameter for the name of the maintenance track for the cluster.
   */
  public open fun maintenanceTrackName(`value`: String) {
    unwrap(this).setMaintenanceTrackName(`value`)
  }

  /**
   * If `true` , Amazon Redshift uses AWS Secrets Manager to manage this cluster's admin
   * credentials.
   */
  public open fun manageMasterPassword(): Any? = unwrap(this).getManageMasterPassword()

  /**
   * If `true` , Amazon Redshift uses AWS Secrets Manager to manage this cluster's admin
   * credentials.
   */
  public open fun manageMasterPassword(`value`: Boolean) {
    unwrap(this).setManageMasterPassword(`value`)
  }

  /**
   * If `true` , Amazon Redshift uses AWS Secrets Manager to manage this cluster's admin
   * credentials.
   */
  public open fun manageMasterPassword(`value`: IResolvable) {
    unwrap(this).setManageMasterPassword(`value`.let(IResolvable::unwrap))
  }

  /**
   * The default number of days to retain a manual snapshot.
   */
  public open fun manualSnapshotRetentionPeriod(): Number? =
      unwrap(this).getManualSnapshotRetentionPeriod()

  /**
   * The default number of days to retain a manual snapshot.
   */
  public open fun manualSnapshotRetentionPeriod(`value`: Number) {
    unwrap(this).setManualSnapshotRetentionPeriod(`value`)
  }

  /**
   * The ID of the AWS Key Management Service (KMS) key used to encrypt and store the cluster's
   * admin credentials secret.
   */
  public open fun masterPasswordSecretKmsKeyId(): String? =
      unwrap(this).getMasterPasswordSecretKmsKeyId()

  /**
   * The ID of the AWS Key Management Service (KMS) key used to encrypt and store the cluster's
   * admin credentials secret.
   */
  public open fun masterPasswordSecretKmsKeyId(`value`: String) {
    unwrap(this).setMasterPasswordSecretKmsKeyId(`value`)
  }

  /**
   * The password associated with the admin user account for the cluster that is being created.
   */
  public open fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  /**
   * The password associated with the admin user account for the cluster that is being created.
   */
  public open fun masterUserPassword(`value`: String) {
    unwrap(this).setMasterUserPassword(`value`)
  }

  /**
   * The user name associated with the admin user account for the cluster that is being created.
   */
  public open fun masterUsername(): String = unwrap(this).getMasterUsername()

  /**
   * The user name associated with the admin user account for the cluster that is being created.
   */
  public open fun masterUsername(`value`: String) {
    unwrap(this).setMasterUsername(`value`)
  }

  /**
   * A boolean indicating whether Amazon Redshift should deploy the cluster in two Availability
   * Zones.
   */
  public open fun multiAz(): Any? = unwrap(this).getMultiAz()

  /**
   * A boolean indicating whether Amazon Redshift should deploy the cluster in two Availability
   * Zones.
   */
  public open fun multiAz(`value`: Boolean) {
    unwrap(this).setMultiAz(`value`)
  }

  /**
   * A boolean indicating whether Amazon Redshift should deploy the cluster in two Availability
   * Zones.
   */
  public open fun multiAz(`value`: IResolvable) {
    unwrap(this).setMultiAz(`value`.let(IResolvable::unwrap))
  }

  /**
   * The policy that is attached to a resource.
   */
  public open fun namespaceResourcePolicy(): Any? = unwrap(this).getNamespaceResourcePolicy()

  /**
   * The policy that is attached to a resource.
   */
  public open fun namespaceResourcePolicy(`value`: Any) {
    unwrap(this).setNamespaceResourcePolicy(`value`)
  }

  /**
   * The node type to be provisioned for the cluster.
   */
  public open fun nodeType(): String = unwrap(this).getNodeType()

  /**
   * The node type to be provisioned for the cluster.
   */
  public open fun nodeType(`value`: String) {
    unwrap(this).setNodeType(`value`)
  }

  /**
   * The number of compute nodes in the cluster.
   */
  public open fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()

  /**
   * The number of compute nodes in the cluster.
   */
  public open fun numberOfNodes(`value`: Number) {
    unwrap(this).setNumberOfNodes(`value`)
  }

  /**
   * The AWS account used to create or copy the snapshot.
   */
  public open fun ownerAccount(): String? = unwrap(this).getOwnerAccount()

  /**
   * The AWS account used to create or copy the snapshot.
   */
  public open fun ownerAccount(`value`: String) {
    unwrap(this).setOwnerAccount(`value`)
  }

  /**
   * The port number on which the cluster accepts incoming connections.
   */
  public open fun port(): Number? = unwrap(this).getPort()

  /**
   * The port number on which the cluster accepts incoming connections.
   */
  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  /**
   * The weekly time range (in UTC) during which automated cluster maintenance can occur.
   */
  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  /**
   * The weekly time range (in UTC) during which automated cluster maintenance can occur.
   */
  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  /**
   * If `true` , the cluster can be accessed from a public network.
   */
  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * If `true` , the cluster can be accessed from a public network.
   */
  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  /**
   * If `true` , the cluster can be accessed from a public network.
   */
  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon Redshift operation to be performed.
   */
  public open fun resourceAction(): String? = unwrap(this).getResourceAction()

  /**
   * The Amazon Redshift operation to be performed.
   */
  public open fun resourceAction(`value`: String) {
    unwrap(this).setResourceAction(`value`)
  }

  /**
   * Describes a `RevisionTarget` object.
   */
  public open fun revisionTarget(): String? = unwrap(this).getRevisionTarget()

  /**
   * Describes a `RevisionTarget` object.
   */
  public open fun revisionTarget(`value`: String) {
    unwrap(this).setRevisionTarget(`value`)
  }

  /**
   * Rotates the encryption keys for a cluster.
   */
  public open fun rotateEncryptionKey(): Any? = unwrap(this).getRotateEncryptionKey()

  /**
   * Rotates the encryption keys for a cluster.
   */
  public open fun rotateEncryptionKey(`value`: Boolean) {
    unwrap(this).setRotateEncryptionKey(`value`)
  }

  /**
   * Rotates the encryption keys for a cluster.
   */
  public open fun rotateEncryptionKey(`value`: IResolvable) {
    unwrap(this).setRotateEncryptionKey(`value`.let(IResolvable::unwrap))
  }

  /**
   * The name of the cluster the source snapshot was created from.
   */
  public open fun snapshotClusterIdentifier(): String? = unwrap(this).getSnapshotClusterIdentifier()

  /**
   * The name of the cluster the source snapshot was created from.
   */
  public open fun snapshotClusterIdentifier(`value`: String) {
    unwrap(this).setSnapshotClusterIdentifier(`value`)
  }

  /**
   * The name of the snapshot copy grant.
   */
  public open fun snapshotCopyGrantName(): String? = unwrap(this).getSnapshotCopyGrantName()

  /**
   * The name of the snapshot copy grant.
   */
  public open fun snapshotCopyGrantName(`value`: String) {
    unwrap(this).setSnapshotCopyGrantName(`value`)
  }

  /**
   * Indicates whether to apply the snapshot retention period to newly copied manual snapshots
   * instead of automated snapshots.
   */
  public open fun snapshotCopyManual(): Any? = unwrap(this).getSnapshotCopyManual()

  /**
   * Indicates whether to apply the snapshot retention period to newly copied manual snapshots
   * instead of automated snapshots.
   */
  public open fun snapshotCopyManual(`value`: Boolean) {
    unwrap(this).setSnapshotCopyManual(`value`)
  }

  /**
   * Indicates whether to apply the snapshot retention period to newly copied manual snapshots
   * instead of automated snapshots.
   */
  public open fun snapshotCopyManual(`value`: IResolvable) {
    unwrap(this).setSnapshotCopyManual(`value`.let(IResolvable::unwrap))
  }

  /**
   * The number of days to retain automated snapshots in the destination AWS Region after they are
   * copied from the source AWS Region .
   */
  public open fun snapshotCopyRetentionPeriod(): Number? =
      unwrap(this).getSnapshotCopyRetentionPeriod()

  /**
   * The number of days to retain automated snapshots in the destination AWS Region after they are
   * copied from the source AWS Region .
   */
  public open fun snapshotCopyRetentionPeriod(`value`: Number) {
    unwrap(this).setSnapshotCopyRetentionPeriod(`value`)
  }

  /**
   * The name of the snapshot from which to create the new cluster.
   */
  public open fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

  /**
   * The name of the snapshot from which to create the new cluster.
   */
  public open fun snapshotIdentifier(`value`: String) {
    unwrap(this).setSnapshotIdentifier(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tag instances.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tag instances.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tag instances.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
   */
  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
   */
  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  /**
   * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
   */
  public open fun vpcSecurityGroupIds(vararg `value`: String): Unit =
      vpcSecurityGroupIds(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.redshift.CfnCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * If `true` , major version upgrades can be applied during the maintenance window to the Amazon
     * Redshift engine that is running on the cluster.
     *
     * When a new major version of the Amazon Redshift engine is released, you can request that the
     * service automatically apply upgrades during the maintenance window to the Amazon Redshift engine
     * that is running on your cluster.
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-allowversionupgrade)
     * @param allowVersionUpgrade If `true` , major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on the cluster. 
     */
    public fun allowVersionUpgrade(allowVersionUpgrade: Boolean)

    /**
     * If `true` , major version upgrades can be applied during the maintenance window to the Amazon
     * Redshift engine that is running on the cluster.
     *
     * When a new major version of the Amazon Redshift engine is released, you can request that the
     * service automatically apply upgrades during the maintenance window to the Amazon Redshift engine
     * that is running on your cluster.
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-allowversionupgrade)
     * @param allowVersionUpgrade If `true` , major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on the cluster. 
     */
    public fun allowVersionUpgrade(allowVersionUpgrade: IResolvable)

    /**
     * This parameter is retired.
     *
     * It does not set the AQUA configuration status. Amazon Redshift automatically determines
     * whether to use AQUA (Advanced Query Accelerator).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-aquaconfigurationstatus)
     * @param aquaConfigurationStatus This parameter is retired. 
     */
    public fun aquaConfigurationStatus(aquaConfigurationStatus: String)

    /**
     * The number of days that automated snapshots are retained.
     *
     * If the value is 0, automated snapshots are disabled. Even if automated snapshots are
     * disabled, you can still create manual snapshots when you want with
     * [CreateClusterSnapshot](https://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateClusterSnapshot.html)
     * in the *Amazon Redshift API Reference* .
     *
     * Default: `1`
     *
     * Constraints: Must be a value from 0 to 35.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-automatedsnapshotretentionperiod)
     * @param automatedSnapshotRetentionPeriod The number of days that automated snapshots are
     * retained. 
     */
    public fun automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod: Number)

    /**
     * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster.
     *
     * For example, if you have several EC2 instances running in a specific Availability Zone, then
     * you might want the cluster to be provisioned in the same zone in order to decrease network
     * latency.
     *
     * Default: A random, system-chosen Availability Zone in the region that is specified by the
     * endpoint.
     *
     * Example: `us-east-2d`
     *
     * Constraint: The specified Availability Zone must be in the same region as the current
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzone)
     * @param availabilityZone The EC2 Availability Zone (AZ) in which you want Amazon Redshift to
     * provision the cluster. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * The option to enable relocation for an Amazon Redshift cluster between Availability Zones
     * after the cluster is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzonerelocation)
     * @param availabilityZoneRelocation The option to enable relocation for an Amazon Redshift
     * cluster between Availability Zones after the cluster is created. 
     */
    public fun availabilityZoneRelocation(availabilityZoneRelocation: Boolean)

    /**
     * The option to enable relocation for an Amazon Redshift cluster between Availability Zones
     * after the cluster is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzonerelocation)
     * @param availabilityZoneRelocation The option to enable relocation for an Amazon Redshift
     * cluster between Availability Zones after the cluster is created. 
     */
    public fun availabilityZoneRelocation(availabilityZoneRelocation: IResolvable)

    /**
     * Describes the status of the Availability Zone relocation operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzonerelocationstatus)
     * @param availabilityZoneRelocationStatus Describes the status of the Availability Zone
     * relocation operation. 
     */
    public fun availabilityZoneRelocationStatus(availabilityZoneRelocationStatus: String)

    /**
     * A boolean value indicating whether the resize operation is using the classic resize process.
     *
     * If you don't provide this parameter or set the value to `false` , the resize type is elastic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-classic)
     * @param classic A boolean value indicating whether the resize operation is using the classic
     * resize process. 
     */
    public fun classic(classic: Boolean)

    /**
     * A boolean value indicating whether the resize operation is using the classic resize process.
     *
     * If you don't provide this parameter or set the value to `false` , the resize type is elastic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-classic)
     * @param classic A boolean value indicating whether the resize operation is using the classic
     * resize process. 
     */
    public fun classic(classic: IResolvable)

    /**
     * A unique identifier for the cluster.
     *
     * You use this identifier to refer to the cluster for any subsequent cluster operations such as
     * deleting or modifying. The identifier also appears in the Amazon Redshift console.
     *
     * Constraints:
     *
     * * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * * Alphabetic characters must be lowercase.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     * * Must be unique for all clusters within an AWS account .
     *
     * Example: `myexamplecluster`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusteridentifier)
     * @param clusterIdentifier A unique identifier for the cluster. 
     */
    public fun clusterIdentifier(clusterIdentifier: String)

    /**
     * The name of the parameter group to be associated with this cluster.
     *
     * Default: The default Amazon Redshift cluster parameter group. For information about the
     * default parameter group, go to [Working with Amazon Redshift Parameter
     * Groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html)
     *
     * Constraints:
     *
     * * Must be 1 to 255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterparametergroupname)
     * @param clusterParameterGroupName The name of the parameter group to be associated with this
     * cluster. 
     */
    public fun clusterParameterGroupName(clusterParameterGroupName: String)

    /**
     * A list of security groups to be associated with this cluster.
     *
     * Default: The default cluster security group for Amazon Redshift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups)
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster. 
     */
    public fun clusterSecurityGroups(clusterSecurityGroups: List<String>)

    /**
     * A list of security groups to be associated with this cluster.
     *
     * Default: The default cluster security group for Amazon Redshift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups)
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster. 
     */
    public fun clusterSecurityGroups(vararg clusterSecurityGroups: String)

    /**
     * The name of a cluster subnet group to be associated with this cluster.
     *
     * If this parameter is not provided the resulting cluster will be deployed outside virtual
     * private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersubnetgroupname)
     * @param clusterSubnetGroupName The name of a cluster subnet group to be associated with this
     * cluster. 
     */
    public fun clusterSubnetGroupName(clusterSubnetGroupName: String)

    /**
     * The type of the cluster. When cluster type is specified as.
     *
     * * `single-node` , the *NumberOfNodes* parameter is not required.
     * * `multi-node` , the *NumberOfNodes* parameter is required.
     *
     * Valid Values: `multi-node` | `single-node`
     *
     * Default: `multi-node`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustertype)
     * @param clusterType The type of the cluster. When cluster type is specified as. 
     */
    public fun clusterType(clusterType: String)

    /**
     * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
     *
     * The version selected runs on all the nodes in the cluster.
     *
     * Constraints: Only version 1.0 is currently available.
     *
     * Example: `1.0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterversion)
     * @param clusterVersion The version of the Amazon Redshift engine software that you want to
     * deploy on the cluster. 
     */
    public fun clusterVersion(clusterVersion: String)

    /**
     * The name of the first database to be created when the cluster is created.
     *
     * To create additional databases after the cluster is created, connect to the cluster with a
     * SQL client and use SQL commands to create a database. For more information, go to [Create a
     * Database](https://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html) in the Amazon
     * Redshift Database Developer Guide.
     *
     * Default: `dev`
     *
     * Constraints:
     *
     * * Must contain 1 to 64 alphanumeric characters.
     * * Must contain only lowercase letters.
     * * Cannot be a word that is reserved by the service. A list of reserved words can be found in
     * [Reserved Words](https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html) in the
     * Amazon Redshift Database Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-dbname)
     * @param dbName The name of the first database to be created when the cluster is created. 
     */
    public fun dbName(dbName: String)

    /**
     * A Boolean indicating whether to enable the deferred maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenance)
     * @param deferMaintenance A Boolean indicating whether to enable the deferred maintenance
     * window. 
     */
    public fun deferMaintenance(deferMaintenance: Boolean)

    /**
     * A Boolean indicating whether to enable the deferred maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenance)
     * @param deferMaintenance A Boolean indicating whether to enable the deferred maintenance
     * window. 
     */
    public fun deferMaintenance(deferMaintenance: IResolvable)

    /**
     * An integer indicating the duration of the maintenance window in days.
     *
     * If you specify a duration, you can't specify an end time. The duration must be 45 days or
     * less.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenanceduration)
     * @param deferMaintenanceDuration An integer indicating the duration of the maintenance window
     * in days. 
     */
    public fun deferMaintenanceDuration(deferMaintenanceDuration: Number)

    /**
     * A timestamp for the end of the time period when we defer maintenance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenanceendtime)
     * @param deferMaintenanceEndTime A timestamp for the end of the time period when we defer
     * maintenance. 
     */
    public fun deferMaintenanceEndTime(deferMaintenanceEndTime: String)

    /**
     * A timestamp indicating the start time for the deferred maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenancestarttime)
     * @param deferMaintenanceStartTime A timestamp indicating the start time for the deferred
     * maintenance window. 
     */
    public fun deferMaintenanceStartTime(deferMaintenanceStartTime: String)

    /**
     * The destination region that snapshots are automatically copied to when cross-region snapshot
     * copy is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-destinationregion)
     * @param destinationRegion The destination region that snapshots are automatically copied to
     * when cross-region snapshot copy is enabled. 
     */
    public fun destinationRegion(destinationRegion: String)

    /**
     * The Elastic IP (EIP) address for the cluster.
     *
     * Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an
     * Internet gateway. Don't specify the Elastic IP address for a publicly accessible cluster with
     * availability zone relocation turned on. For more information about provisioning clusters in
     * EC2-VPC, go to [Supported Platforms to Launch Your
     * Cluster](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms)
     * in the Amazon Redshift Cluster Management Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-elasticip)
     * @param elasticIp The Elastic IP (EIP) address for the cluster. 
     */
    public fun elasticIp(elasticIp: String)

    /**
     * If `true` , the data in the cluster is encrypted at rest.
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-encrypted)
     * @param encrypted If `true` , the data in the cluster is encrypted at rest. 
     */
    public fun encrypted(encrypted: Boolean)

    /**
     * If `true` , the data in the cluster is encrypted at rest.
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-encrypted)
     * @param encrypted If `true` , the data in the cluster is encrypted at rest. 
     */
    public fun encrypted(encrypted: IResolvable)

    /**
     * The connection endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-endpoint)
     * @param endpoint The connection endpoint. 
     */
    public fun endpoint(endpoint: IResolvable)

    /**
     * The connection endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-endpoint)
     * @param endpoint The connection endpoint. 
     */
    public fun endpoint(endpoint: EndpointProperty)

    /**
     * The connection endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-endpoint)
     * @param endpoint The connection endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7789a04b5aae310aec4594353b8d42976087f3c4678b92de2ae629052e7bc25a")
    public fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit)

    /**
     * An option that specifies whether to create the cluster with enhanced VPC routing enabled.
     *
     * To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more
     * information, see [Enhanced VPC
     * Routing](https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html) in the
     * Amazon Redshift Cluster Management Guide.
     *
     * If this option is `true` , enhanced VPC routing is enabled.
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-enhancedvpcrouting)
     * @param enhancedVpcRouting An option that specifies whether to create the cluster with
     * enhanced VPC routing enabled. 
     */
    public fun enhancedVpcRouting(enhancedVpcRouting: Boolean)

    /**
     * An option that specifies whether to create the cluster with enhanced VPC routing enabled.
     *
     * To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more
     * information, see [Enhanced VPC
     * Routing](https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html) in the
     * Amazon Redshift Cluster Management Guide.
     *
     * If this option is `true` , enhanced VPC routing is enabled.
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-enhancedvpcrouting)
     * @param enhancedVpcRouting An option that specifies whether to create the cluster with
     * enhanced VPC routing enabled. 
     */
    public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable)

    /**
     * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve
     * the data encryption keys stored in an HSM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmclientcertificateidentifier)
     * @param hsmClientCertificateIdentifier Specifies the name of the HSM client certificate the
     * Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM. 
     */
    public fun hsmClientCertificateIdentifier(hsmClientCertificateIdentifier: String)

    /**
     * Specifies the name of the HSM configuration that contains the information the Amazon Redshift
     * cluster can use to retrieve and store keys in an HSM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmconfigurationidentifier)
     * @param hsmConfigurationIdentifier Specifies the name of the HSM configuration that contains
     * the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM. 
     */
    public fun hsmConfigurationIdentifier(hsmConfigurationIdentifier: String)

    /**
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to
     * access other AWS services.
     *
     * You must supply the IAM roles in their Amazon Resource Name (ARN) format.
     *
     * The maximum number of IAM roles that you can associate is subject to a quota. For more
     * information, go to [Quotas and
     * limits](https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html) in the
     * *Amazon Redshift Cluster Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles)
     * @param iamRoles A list of AWS Identity and Access Management (IAM) roles that can be used by
     * the cluster to access other AWS services. 
     */
    public fun iamRoles(iamRoles: List<String>)

    /**
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to
     * access other AWS services.
     *
     * You must supply the IAM roles in their Amazon Resource Name (ARN) format.
     *
     * The maximum number of IAM roles that you can associate is subject to a quota. For more
     * information, go to [Quotas and
     * limits](https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html) in the
     * *Amazon Redshift Cluster Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles)
     * @param iamRoles A list of AWS Identity and Access Management (IAM) roles that can be used by
     * the cluster to access other AWS services. 
     */
    public fun iamRoles(vararg iamRoles: String)

    /**
     * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to
     * encrypt data in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-kmskeyid)
     * @param kmsKeyId The AWS Key Management Service (KMS) key ID of the encryption key that you
     * want to use to encrypt data in the cluster. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * Specifies logging information, such as queries and connection attempts, for the specified
     * Amazon Redshift cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-loggingproperties)
     * @param loggingProperties Specifies logging information, such as queries and connection
     * attempts, for the specified Amazon Redshift cluster. 
     */
    public fun loggingProperties(loggingProperties: IResolvable)

    /**
     * Specifies logging information, such as queries and connection attempts, for the specified
     * Amazon Redshift cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-loggingproperties)
     * @param loggingProperties Specifies logging information, such as queries and connection
     * attempts, for the specified Amazon Redshift cluster. 
     */
    public fun loggingProperties(loggingProperties: LoggingPropertiesProperty)

    /**
     * Specifies logging information, such as queries and connection attempts, for the specified
     * Amazon Redshift cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-loggingproperties)
     * @param loggingProperties Specifies logging information, such as queries and connection
     * attempts, for the specified Amazon Redshift cluster. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d493307f8744f66c8390c4cadb67055577fc3782950415e9c1772f9a33538a14")
    public fun loggingProperties(loggingProperties: LoggingPropertiesProperty.Builder.() -> Unit)

    /**
     * An optional parameter for the name of the maintenance track for the cluster.
     *
     * If you don't provide a maintenance track name, the cluster is assigned to the `current`
     * track.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-maintenancetrackname)
     * @param maintenanceTrackName An optional parameter for the name of the maintenance track for
     * the cluster. 
     */
    public fun maintenanceTrackName(maintenanceTrackName: String)

    /**
     * If `true` , Amazon Redshift uses AWS Secrets Manager to manage this cluster's admin
     * credentials.
     *
     * You can't use `MasterUserPassword` if `ManageMasterPassword` is true. If
     * `ManageMasterPassword` is false or not set, Amazon Redshift uses `MasterUserPassword` for the
     * admin user account's password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-managemasterpassword)
     * @param manageMasterPassword If `true` , Amazon Redshift uses AWS Secrets Manager to manage
     * this cluster's admin credentials. 
     */
    public fun manageMasterPassword(manageMasterPassword: Boolean)

    /**
     * If `true` , Amazon Redshift uses AWS Secrets Manager to manage this cluster's admin
     * credentials.
     *
     * You can't use `MasterUserPassword` if `ManageMasterPassword` is true. If
     * `ManageMasterPassword` is false or not set, Amazon Redshift uses `MasterUserPassword` for the
     * admin user account's password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-managemasterpassword)
     * @param manageMasterPassword If `true` , Amazon Redshift uses AWS Secrets Manager to manage
     * this cluster's admin credentials. 
     */
    public fun manageMasterPassword(manageMasterPassword: IResolvable)

    /**
     * The default number of days to retain a manual snapshot.
     *
     * If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the
     * retention period of existing snapshots.
     *
     * The value must be either -1 or an integer between 1 and 3,653.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-manualsnapshotretentionperiod)
     * @param manualSnapshotRetentionPeriod The default number of days to retain a manual snapshot. 
     */
    public fun manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod: Number)

    /**
     * The ID of the AWS Key Management Service (KMS) key used to encrypt and store the cluster's
     * admin credentials secret.
     *
     * You can only use this parameter if `ManageMasterPassword` is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterpasswordsecretkmskeyid)
     * @param masterPasswordSecretKmsKeyId The ID of the AWS Key Management Service (KMS) key used
     * to encrypt and store the cluster's admin credentials secret. 
     */
    public fun masterPasswordSecretKmsKeyId(masterPasswordSecretKmsKeyId: String)

    /**
     * The password associated with the admin user account for the cluster that is being created.
     *
     * You can't use `MasterUserPassword` if `ManageMasterPassword` is `true` .
     *
     * Constraints:
     *
     * * Must be between 8 and 64 characters in length.
     * * Must contain at least one uppercase letter.
     * * Must contain at least one lowercase letter.
     * * Must contain one number.
     * * Can be any printable ASCII character (ASCII code 33-126) except `'` (single quote), `"`
     * (double quote), `\` , `/` , or `&#64;` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masteruserpassword)
     * @param masterUserPassword The password associated with the admin user account for the cluster
     * that is being created. 
     */
    public fun masterUserPassword(masterUserPassword: String)

    /**
     * The user name associated with the admin user account for the cluster that is being created.
     *
     * Constraints:
     *
     * * Must be 1 - 128 alphanumeric characters or hyphens. The user name can't be `PUBLIC` .
     * * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at
     * symbol (&#64;), or hyphen.
     * * The first character must be a letter.
     * * Must not contain a colon (:) or a slash (/).
     * * Cannot be a reserved word. A list of reserved words can be found in [Reserved
     * Words](https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html) in the Amazon Redshift
     * Database Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterusername)
     * @param masterUsername The user name associated with the admin user account for the cluster
     * that is being created. 
     */
    public fun masterUsername(masterUsername: String)

    /**
     * A boolean indicating whether Amazon Redshift should deploy the cluster in two Availability
     * Zones.
     *
     * The default is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-multiaz)
     * @param multiAz A boolean indicating whether Amazon Redshift should deploy the cluster in two
     * Availability Zones. 
     */
    public fun multiAz(multiAz: Boolean)

    /**
     * A boolean indicating whether Amazon Redshift should deploy the cluster in two Availability
     * Zones.
     *
     * The default is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-multiaz)
     * @param multiAz A boolean indicating whether Amazon Redshift should deploy the cluster in two
     * Availability Zones. 
     */
    public fun multiAz(multiAz: IResolvable)

    /**
     * The policy that is attached to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-namespaceresourcepolicy)
     * @param namespaceResourcePolicy The policy that is attached to a resource. 
     */
    public fun namespaceResourcePolicy(namespaceResourcePolicy: Any)

    /**
     * The node type to be provisioned for the cluster.
     *
     * For information about node types, go to [Working with
     * Clusters](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes)
     * in the *Amazon Redshift Cluster Management Guide* .
     *
     * Valid Values: `ds2.xlarge` | `ds2.8xlarge` | `dc1.large` | `dc1.8xlarge` | `dc2.large` |
     * `dc2.8xlarge` | `ra3.xlplus` | `ra3.4xlarge` | `ra3.16xlarge`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype)
     * @param nodeType The node type to be provisioned for the cluster. 
     */
    public fun nodeType(nodeType: String)

    /**
     * The number of compute nodes in the cluster.
     *
     * This parameter is required when the *ClusterType* parameter is specified as `multi-node` .
     *
     * For information about determining how many nodes you need, go to [Working with
     * Clusters](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes)
     * in the *Amazon Redshift Cluster Management Guide* .
     *
     * If you don't specify this parameter, you get a single-node cluster. When requesting a
     * multi-node cluster, you must specify the number of nodes that you want in the cluster.
     *
     * Default: `1`
     *
     * Constraints: Value must be at least 1 and no more than 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-numberofnodes)
     * @param numberOfNodes The number of compute nodes in the cluster. 
     */
    public fun numberOfNodes(numberOfNodes: Number)

    /**
     * The AWS account used to create or copy the snapshot.
     *
     * Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-owneraccount)
     * @param ownerAccount The AWS account used to create or copy the snapshot. 
     */
    public fun ownerAccount(ownerAccount: String)

    /**
     * The port number on which the cluster accepts incoming connections.
     *
     * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the
     * connection string requires the port on which the cluster will listen for incoming connections.
     *
     * Default: `5439`
     *
     * Valid Values: `1150-65535`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-port)
     * @param port The port number on which the cluster accepts incoming connections. 
     */
    public fun port(port: Number)

    /**
     * The weekly time range (in UTC) during which automated cluster maintenance can occur.
     *
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * Default: A 30-minute window selected at random from an 8-hour block of time per region,
     * occurring on a random day of the week. For more information about the time blocks for each
     * region, see [Maintenance
     * Windows](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows)
     * in Amazon Redshift Cluster Management Guide.
     *
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *
     * Constraints: Minimum 30-minute window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which automated
     * cluster maintenance can occur. 
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * If `true` , the cluster can be accessed from a public network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-publiclyaccessible)
     * @param publiclyAccessible If `true` , the cluster can be accessed from a public network. 
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * If `true` , the cluster can be accessed from a public network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-publiclyaccessible)
     * @param publiclyAccessible If `true` , the cluster can be accessed from a public network. 
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * The Amazon Redshift operation to be performed.
     *
     * Supported operations are `pause-cluster` , `resume-cluster` , and `failover-primary-compute`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-resourceaction)
     * @param resourceAction The Amazon Redshift operation to be performed. 
     */
    public fun resourceAction(resourceAction: String)

    /**
     * Describes a `RevisionTarget` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-revisiontarget)
     * @param revisionTarget Describes a `RevisionTarget` object. 
     */
    public fun revisionTarget(revisionTarget: String)

    /**
     * Rotates the encryption keys for a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-rotateencryptionkey)
     * @param rotateEncryptionKey Rotates the encryption keys for a cluster. 
     */
    public fun rotateEncryptionKey(rotateEncryptionKey: Boolean)

    /**
     * Rotates the encryption keys for a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-rotateencryptionkey)
     * @param rotateEncryptionKey Rotates the encryption keys for a cluster. 
     */
    public fun rotateEncryptionKey(rotateEncryptionKey: IResolvable)

    /**
     * The name of the cluster the source snapshot was created from.
     *
     * This parameter is required if your user or role has a policy containing a snapshot resource
     * element that specifies anything other than * for the cluster name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotclusteridentifier)
     * @param snapshotClusterIdentifier The name of the cluster the source snapshot was created
     * from. 
     */
    public fun snapshotClusterIdentifier(snapshotClusterIdentifier: String)

    /**
     * The name of the snapshot copy grant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotcopygrantname)
     * @param snapshotCopyGrantName The name of the snapshot copy grant. 
     */
    public fun snapshotCopyGrantName(snapshotCopyGrantName: String)

    /**
     * Indicates whether to apply the snapshot retention period to newly copied manual snapshots
     * instead of automated snapshots.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotcopymanual)
     * @param snapshotCopyManual Indicates whether to apply the snapshot retention period to newly
     * copied manual snapshots instead of automated snapshots. 
     */
    public fun snapshotCopyManual(snapshotCopyManual: Boolean)

    /**
     * Indicates whether to apply the snapshot retention period to newly copied manual snapshots
     * instead of automated snapshots.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotcopymanual)
     * @param snapshotCopyManual Indicates whether to apply the snapshot retention period to newly
     * copied manual snapshots instead of automated snapshots. 
     */
    public fun snapshotCopyManual(snapshotCopyManual: IResolvable)

    /**
     * The number of days to retain automated snapshots in the destination AWS Region after they are
     * copied from the source AWS Region .
     *
     * By default, this only changes the retention period of copied automated snapshots.
     *
     * If you decrease the retention period for automated snapshots that are copied to a destination
     * AWS Region , Amazon Redshift deletes any existing automated snapshots that were copied to the
     * destination AWS Region and that fall outside of the new retention period.
     *
     * Constraints: Must be at least 1 and no more than 35 for automated snapshots.
     *
     * If you specify the `manual` option, only newly copied manual snapshots will have the new
     * retention period.
     *
     * If you specify the value of -1 newly copied manual snapshots are retained indefinitely.
     *
     * Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for
     * manual snapshots.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotcopyretentionperiod)
     * @param snapshotCopyRetentionPeriod The number of days to retain automated snapshots in the
     * destination AWS Region after they are copied from the source AWS Region . 
     */
    public fun snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod: Number)

    /**
     * The name of the snapshot from which to create the new cluster.
     *
     * This parameter isn't case sensitive. You must specify this parameter or `snapshotArn` , but
     * not both.
     *
     * Example: `my-snapshot-id`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotidentifier)
     * @param snapshotIdentifier The name of the snapshot from which to create the new cluster. 
     */
    public fun snapshotIdentifier(snapshotIdentifier: String)

    /**
     * A list of tag instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-tags)
     * @param tags A list of tag instances. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tag instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-tags)
     * @param tags A list of tag instances. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
     *
     * Default: The default VPC security group is associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be
     * associated with the cluster. 
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
     *
     * Default: The default VPC security group is associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be
     * associated with the cluster. 
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnCluster.Builder =
        software.amazon.awscdk.services.redshift.CfnCluster.Builder.create(scope, id)

    /**
     * If `true` , major version upgrades can be applied during the maintenance window to the Amazon
     * Redshift engine that is running on the cluster.
     *
     * When a new major version of the Amazon Redshift engine is released, you can request that the
     * service automatically apply upgrades during the maintenance window to the Amazon Redshift engine
     * that is running on your cluster.
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-allowversionupgrade)
     * @param allowVersionUpgrade If `true` , major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on the cluster. 
     */
    override fun allowVersionUpgrade(allowVersionUpgrade: Boolean) {
      cdkBuilder.allowVersionUpgrade(allowVersionUpgrade)
    }

    /**
     * If `true` , major version upgrades can be applied during the maintenance window to the Amazon
     * Redshift engine that is running on the cluster.
     *
     * When a new major version of the Amazon Redshift engine is released, you can request that the
     * service automatically apply upgrades during the maintenance window to the Amazon Redshift engine
     * that is running on your cluster.
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-allowversionupgrade)
     * @param allowVersionUpgrade If `true` , major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on the cluster. 
     */
    override fun allowVersionUpgrade(allowVersionUpgrade: IResolvable) {
      cdkBuilder.allowVersionUpgrade(allowVersionUpgrade.let(IResolvable::unwrap))
    }

    /**
     * This parameter is retired.
     *
     * It does not set the AQUA configuration status. Amazon Redshift automatically determines
     * whether to use AQUA (Advanced Query Accelerator).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-aquaconfigurationstatus)
     * @param aquaConfigurationStatus This parameter is retired. 
     */
    override fun aquaConfigurationStatus(aquaConfigurationStatus: String) {
      cdkBuilder.aquaConfigurationStatus(aquaConfigurationStatus)
    }

    /**
     * The number of days that automated snapshots are retained.
     *
     * If the value is 0, automated snapshots are disabled. Even if automated snapshots are
     * disabled, you can still create manual snapshots when you want with
     * [CreateClusterSnapshot](https://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateClusterSnapshot.html)
     * in the *Amazon Redshift API Reference* .
     *
     * Default: `1`
     *
     * Constraints: Must be a value from 0 to 35.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-automatedsnapshotretentionperiod)
     * @param automatedSnapshotRetentionPeriod The number of days that automated snapshots are
     * retained. 
     */
    override fun automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod: Number) {
      cdkBuilder.automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod)
    }

    /**
     * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster.
     *
     * For example, if you have several EC2 instances running in a specific Availability Zone, then
     * you might want the cluster to be provisioned in the same zone in order to decrease network
     * latency.
     *
     * Default: A random, system-chosen Availability Zone in the region that is specified by the
     * endpoint.
     *
     * Example: `us-east-2d`
     *
     * Constraint: The specified Availability Zone must be in the same region as the current
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzone)
     * @param availabilityZone The EC2 Availability Zone (AZ) in which you want Amazon Redshift to
     * provision the cluster. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * The option to enable relocation for an Amazon Redshift cluster between Availability Zones
     * after the cluster is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzonerelocation)
     * @param availabilityZoneRelocation The option to enable relocation for an Amazon Redshift
     * cluster between Availability Zones after the cluster is created. 
     */
    override fun availabilityZoneRelocation(availabilityZoneRelocation: Boolean) {
      cdkBuilder.availabilityZoneRelocation(availabilityZoneRelocation)
    }

    /**
     * The option to enable relocation for an Amazon Redshift cluster between Availability Zones
     * after the cluster is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzonerelocation)
     * @param availabilityZoneRelocation The option to enable relocation for an Amazon Redshift
     * cluster between Availability Zones after the cluster is created. 
     */
    override fun availabilityZoneRelocation(availabilityZoneRelocation: IResolvable) {
      cdkBuilder.availabilityZoneRelocation(availabilityZoneRelocation.let(IResolvable::unwrap))
    }

    /**
     * Describes the status of the Availability Zone relocation operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzonerelocationstatus)
     * @param availabilityZoneRelocationStatus Describes the status of the Availability Zone
     * relocation operation. 
     */
    override fun availabilityZoneRelocationStatus(availabilityZoneRelocationStatus: String) {
      cdkBuilder.availabilityZoneRelocationStatus(availabilityZoneRelocationStatus)
    }

    /**
     * A boolean value indicating whether the resize operation is using the classic resize process.
     *
     * If you don't provide this parameter or set the value to `false` , the resize type is elastic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-classic)
     * @param classic A boolean value indicating whether the resize operation is using the classic
     * resize process. 
     */
    override fun classic(classic: Boolean) {
      cdkBuilder.classic(classic)
    }

    /**
     * A boolean value indicating whether the resize operation is using the classic resize process.
     *
     * If you don't provide this parameter or set the value to `false` , the resize type is elastic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-classic)
     * @param classic A boolean value indicating whether the resize operation is using the classic
     * resize process. 
     */
    override fun classic(classic: IResolvable) {
      cdkBuilder.classic(classic.let(IResolvable::unwrap))
    }

    /**
     * A unique identifier for the cluster.
     *
     * You use this identifier to refer to the cluster for any subsequent cluster operations such as
     * deleting or modifying. The identifier also appears in the Amazon Redshift console.
     *
     * Constraints:
     *
     * * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * * Alphabetic characters must be lowercase.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     * * Must be unique for all clusters within an AWS account .
     *
     * Example: `myexamplecluster`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusteridentifier)
     * @param clusterIdentifier A unique identifier for the cluster. 
     */
    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * The name of the parameter group to be associated with this cluster.
     *
     * Default: The default Amazon Redshift cluster parameter group. For information about the
     * default parameter group, go to [Working with Amazon Redshift Parameter
     * Groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html)
     *
     * Constraints:
     *
     * * Must be 1 to 255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterparametergroupname)
     * @param clusterParameterGroupName The name of the parameter group to be associated with this
     * cluster. 
     */
    override fun clusterParameterGroupName(clusterParameterGroupName: String) {
      cdkBuilder.clusterParameterGroupName(clusterParameterGroupName)
    }

    /**
     * A list of security groups to be associated with this cluster.
     *
     * Default: The default cluster security group for Amazon Redshift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups)
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster. 
     */
    override fun clusterSecurityGroups(clusterSecurityGroups: List<String>) {
      cdkBuilder.clusterSecurityGroups(clusterSecurityGroups)
    }

    /**
     * A list of security groups to be associated with this cluster.
     *
     * Default: The default cluster security group for Amazon Redshift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups)
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster. 
     */
    override fun clusterSecurityGroups(vararg clusterSecurityGroups: String): Unit =
        clusterSecurityGroups(clusterSecurityGroups.toList())

    /**
     * The name of a cluster subnet group to be associated with this cluster.
     *
     * If this parameter is not provided the resulting cluster will be deployed outside virtual
     * private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersubnetgroupname)
     * @param clusterSubnetGroupName The name of a cluster subnet group to be associated with this
     * cluster. 
     */
    override fun clusterSubnetGroupName(clusterSubnetGroupName: String) {
      cdkBuilder.clusterSubnetGroupName(clusterSubnetGroupName)
    }

    /**
     * The type of the cluster. When cluster type is specified as.
     *
     * * `single-node` , the *NumberOfNodes* parameter is not required.
     * * `multi-node` , the *NumberOfNodes* parameter is required.
     *
     * Valid Values: `multi-node` | `single-node`
     *
     * Default: `multi-node`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustertype)
     * @param clusterType The type of the cluster. When cluster type is specified as. 
     */
    override fun clusterType(clusterType: String) {
      cdkBuilder.clusterType(clusterType)
    }

    /**
     * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
     *
     * The version selected runs on all the nodes in the cluster.
     *
     * Constraints: Only version 1.0 is currently available.
     *
     * Example: `1.0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterversion)
     * @param clusterVersion The version of the Amazon Redshift engine software that you want to
     * deploy on the cluster. 
     */
    override fun clusterVersion(clusterVersion: String) {
      cdkBuilder.clusterVersion(clusterVersion)
    }

    /**
     * The name of the first database to be created when the cluster is created.
     *
     * To create additional databases after the cluster is created, connect to the cluster with a
     * SQL client and use SQL commands to create a database. For more information, go to [Create a
     * Database](https://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html) in the Amazon
     * Redshift Database Developer Guide.
     *
     * Default: `dev`
     *
     * Constraints:
     *
     * * Must contain 1 to 64 alphanumeric characters.
     * * Must contain only lowercase letters.
     * * Cannot be a word that is reserved by the service. A list of reserved words can be found in
     * [Reserved Words](https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html) in the
     * Amazon Redshift Database Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-dbname)
     * @param dbName The name of the first database to be created when the cluster is created. 
     */
    override fun dbName(dbName: String) {
      cdkBuilder.dbName(dbName)
    }

    /**
     * A Boolean indicating whether to enable the deferred maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenance)
     * @param deferMaintenance A Boolean indicating whether to enable the deferred maintenance
     * window. 
     */
    override fun deferMaintenance(deferMaintenance: Boolean) {
      cdkBuilder.deferMaintenance(deferMaintenance)
    }

    /**
     * A Boolean indicating whether to enable the deferred maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenance)
     * @param deferMaintenance A Boolean indicating whether to enable the deferred maintenance
     * window. 
     */
    override fun deferMaintenance(deferMaintenance: IResolvable) {
      cdkBuilder.deferMaintenance(deferMaintenance.let(IResolvable::unwrap))
    }

    /**
     * An integer indicating the duration of the maintenance window in days.
     *
     * If you specify a duration, you can't specify an end time. The duration must be 45 days or
     * less.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenanceduration)
     * @param deferMaintenanceDuration An integer indicating the duration of the maintenance window
     * in days. 
     */
    override fun deferMaintenanceDuration(deferMaintenanceDuration: Number) {
      cdkBuilder.deferMaintenanceDuration(deferMaintenanceDuration)
    }

    /**
     * A timestamp for the end of the time period when we defer maintenance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenanceendtime)
     * @param deferMaintenanceEndTime A timestamp for the end of the time period when we defer
     * maintenance. 
     */
    override fun deferMaintenanceEndTime(deferMaintenanceEndTime: String) {
      cdkBuilder.deferMaintenanceEndTime(deferMaintenanceEndTime)
    }

    /**
     * A timestamp indicating the start time for the deferred maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenancestarttime)
     * @param deferMaintenanceStartTime A timestamp indicating the start time for the deferred
     * maintenance window. 
     */
    override fun deferMaintenanceStartTime(deferMaintenanceStartTime: String) {
      cdkBuilder.deferMaintenanceStartTime(deferMaintenanceStartTime)
    }

    /**
     * The destination region that snapshots are automatically copied to when cross-region snapshot
     * copy is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-destinationregion)
     * @param destinationRegion The destination region that snapshots are automatically copied to
     * when cross-region snapshot copy is enabled. 
     */
    override fun destinationRegion(destinationRegion: String) {
      cdkBuilder.destinationRegion(destinationRegion)
    }

    /**
     * The Elastic IP (EIP) address for the cluster.
     *
     * Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an
     * Internet gateway. Don't specify the Elastic IP address for a publicly accessible cluster with
     * availability zone relocation turned on. For more information about provisioning clusters in
     * EC2-VPC, go to [Supported Platforms to Launch Your
     * Cluster](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms)
     * in the Amazon Redshift Cluster Management Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-elasticip)
     * @param elasticIp The Elastic IP (EIP) address for the cluster. 
     */
    override fun elasticIp(elasticIp: String) {
      cdkBuilder.elasticIp(elasticIp)
    }

    /**
     * If `true` , the data in the cluster is encrypted at rest.
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-encrypted)
     * @param encrypted If `true` , the data in the cluster is encrypted at rest. 
     */
    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    /**
     * If `true` , the data in the cluster is encrypted at rest.
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-encrypted)
     * @param encrypted If `true` , the data in the cluster is encrypted at rest. 
     */
    override fun encrypted(encrypted: IResolvable) {
      cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
    }

    /**
     * The connection endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-endpoint)
     * @param endpoint The connection endpoint. 
     */
    override fun endpoint(endpoint: IResolvable) {
      cdkBuilder.endpoint(endpoint.let(IResolvable::unwrap))
    }

    /**
     * The connection endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-endpoint)
     * @param endpoint The connection endpoint. 
     */
    override fun endpoint(endpoint: EndpointProperty) {
      cdkBuilder.endpoint(endpoint.let(EndpointProperty::unwrap))
    }

    /**
     * The connection endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-endpoint)
     * @param endpoint The connection endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7789a04b5aae310aec4594353b8d42976087f3c4678b92de2ae629052e7bc25a")
    override fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit): Unit =
        endpoint(EndpointProperty(endpoint))

    /**
     * An option that specifies whether to create the cluster with enhanced VPC routing enabled.
     *
     * To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more
     * information, see [Enhanced VPC
     * Routing](https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html) in the
     * Amazon Redshift Cluster Management Guide.
     *
     * If this option is `true` , enhanced VPC routing is enabled.
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-enhancedvpcrouting)
     * @param enhancedVpcRouting An option that specifies whether to create the cluster with
     * enhanced VPC routing enabled. 
     */
    override fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    /**
     * An option that specifies whether to create the cluster with enhanced VPC routing enabled.
     *
     * To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more
     * information, see [Enhanced VPC
     * Routing](https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html) in the
     * Amazon Redshift Cluster Management Guide.
     *
     * If this option is `true` , enhanced VPC routing is enabled.
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-enhancedvpcrouting)
     * @param enhancedVpcRouting An option that specifies whether to create the cluster with
     * enhanced VPC routing enabled. 
     */
    override fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting.let(IResolvable::unwrap))
    }

    /**
     * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve
     * the data encryption keys stored in an HSM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmclientcertificateidentifier)
     * @param hsmClientCertificateIdentifier Specifies the name of the HSM client certificate the
     * Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM. 
     */
    override fun hsmClientCertificateIdentifier(hsmClientCertificateIdentifier: String) {
      cdkBuilder.hsmClientCertificateIdentifier(hsmClientCertificateIdentifier)
    }

    /**
     * Specifies the name of the HSM configuration that contains the information the Amazon Redshift
     * cluster can use to retrieve and store keys in an HSM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmconfigurationidentifier)
     * @param hsmConfigurationIdentifier Specifies the name of the HSM configuration that contains
     * the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM. 
     */
    override fun hsmConfigurationIdentifier(hsmConfigurationIdentifier: String) {
      cdkBuilder.hsmConfigurationIdentifier(hsmConfigurationIdentifier)
    }

    /**
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to
     * access other AWS services.
     *
     * You must supply the IAM roles in their Amazon Resource Name (ARN) format.
     *
     * The maximum number of IAM roles that you can associate is subject to a quota. For more
     * information, go to [Quotas and
     * limits](https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html) in the
     * *Amazon Redshift Cluster Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles)
     * @param iamRoles A list of AWS Identity and Access Management (IAM) roles that can be used by
     * the cluster to access other AWS services. 
     */
    override fun iamRoles(iamRoles: List<String>) {
      cdkBuilder.iamRoles(iamRoles)
    }

    /**
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to
     * access other AWS services.
     *
     * You must supply the IAM roles in their Amazon Resource Name (ARN) format.
     *
     * The maximum number of IAM roles that you can associate is subject to a quota. For more
     * information, go to [Quotas and
     * limits](https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html) in the
     * *Amazon Redshift Cluster Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles)
     * @param iamRoles A list of AWS Identity and Access Management (IAM) roles that can be used by
     * the cluster to access other AWS services. 
     */
    override fun iamRoles(vararg iamRoles: String): Unit = iamRoles(iamRoles.toList())

    /**
     * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to
     * encrypt data in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-kmskeyid)
     * @param kmsKeyId The AWS Key Management Service (KMS) key ID of the encryption key that you
     * want to use to encrypt data in the cluster. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * Specifies logging information, such as queries and connection attempts, for the specified
     * Amazon Redshift cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-loggingproperties)
     * @param loggingProperties Specifies logging information, such as queries and connection
     * attempts, for the specified Amazon Redshift cluster. 
     */
    override fun loggingProperties(loggingProperties: IResolvable) {
      cdkBuilder.loggingProperties(loggingProperties.let(IResolvable::unwrap))
    }

    /**
     * Specifies logging information, such as queries and connection attempts, for the specified
     * Amazon Redshift cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-loggingproperties)
     * @param loggingProperties Specifies logging information, such as queries and connection
     * attempts, for the specified Amazon Redshift cluster. 
     */
    override fun loggingProperties(loggingProperties: LoggingPropertiesProperty) {
      cdkBuilder.loggingProperties(loggingProperties.let(LoggingPropertiesProperty::unwrap))
    }

    /**
     * Specifies logging information, such as queries and connection attempts, for the specified
     * Amazon Redshift cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-loggingproperties)
     * @param loggingProperties Specifies logging information, such as queries and connection
     * attempts, for the specified Amazon Redshift cluster. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d493307f8744f66c8390c4cadb67055577fc3782950415e9c1772f9a33538a14")
    override fun loggingProperties(loggingProperties: LoggingPropertiesProperty.Builder.() -> Unit):
        Unit = loggingProperties(LoggingPropertiesProperty(loggingProperties))

    /**
     * An optional parameter for the name of the maintenance track for the cluster.
     *
     * If you don't provide a maintenance track name, the cluster is assigned to the `current`
     * track.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-maintenancetrackname)
     * @param maintenanceTrackName An optional parameter for the name of the maintenance track for
     * the cluster. 
     */
    override fun maintenanceTrackName(maintenanceTrackName: String) {
      cdkBuilder.maintenanceTrackName(maintenanceTrackName)
    }

    /**
     * If `true` , Amazon Redshift uses AWS Secrets Manager to manage this cluster's admin
     * credentials.
     *
     * You can't use `MasterUserPassword` if `ManageMasterPassword` is true. If
     * `ManageMasterPassword` is false or not set, Amazon Redshift uses `MasterUserPassword` for the
     * admin user account's password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-managemasterpassword)
     * @param manageMasterPassword If `true` , Amazon Redshift uses AWS Secrets Manager to manage
     * this cluster's admin credentials. 
     */
    override fun manageMasterPassword(manageMasterPassword: Boolean) {
      cdkBuilder.manageMasterPassword(manageMasterPassword)
    }

    /**
     * If `true` , Amazon Redshift uses AWS Secrets Manager to manage this cluster's admin
     * credentials.
     *
     * You can't use `MasterUserPassword` if `ManageMasterPassword` is true. If
     * `ManageMasterPassword` is false or not set, Amazon Redshift uses `MasterUserPassword` for the
     * admin user account's password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-managemasterpassword)
     * @param manageMasterPassword If `true` , Amazon Redshift uses AWS Secrets Manager to manage
     * this cluster's admin credentials. 
     */
    override fun manageMasterPassword(manageMasterPassword: IResolvable) {
      cdkBuilder.manageMasterPassword(manageMasterPassword.let(IResolvable::unwrap))
    }

    /**
     * The default number of days to retain a manual snapshot.
     *
     * If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the
     * retention period of existing snapshots.
     *
     * The value must be either -1 or an integer between 1 and 3,653.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-manualsnapshotretentionperiod)
     * @param manualSnapshotRetentionPeriod The default number of days to retain a manual snapshot. 
     */
    override fun manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod: Number) {
      cdkBuilder.manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod)
    }

    /**
     * The ID of the AWS Key Management Service (KMS) key used to encrypt and store the cluster's
     * admin credentials secret.
     *
     * You can only use this parameter if `ManageMasterPassword` is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterpasswordsecretkmskeyid)
     * @param masterPasswordSecretKmsKeyId The ID of the AWS Key Management Service (KMS) key used
     * to encrypt and store the cluster's admin credentials secret. 
     */
    override fun masterPasswordSecretKmsKeyId(masterPasswordSecretKmsKeyId: String) {
      cdkBuilder.masterPasswordSecretKmsKeyId(masterPasswordSecretKmsKeyId)
    }

    /**
     * The password associated with the admin user account for the cluster that is being created.
     *
     * You can't use `MasterUserPassword` if `ManageMasterPassword` is `true` .
     *
     * Constraints:
     *
     * * Must be between 8 and 64 characters in length.
     * * Must contain at least one uppercase letter.
     * * Must contain at least one lowercase letter.
     * * Must contain one number.
     * * Can be any printable ASCII character (ASCII code 33-126) except `'` (single quote), `"`
     * (double quote), `\` , `/` , or `&#64;` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masteruserpassword)
     * @param masterUserPassword The password associated with the admin user account for the cluster
     * that is being created. 
     */
    override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

    /**
     * The user name associated with the admin user account for the cluster that is being created.
     *
     * Constraints:
     *
     * * Must be 1 - 128 alphanumeric characters or hyphens. The user name can't be `PUBLIC` .
     * * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at
     * symbol (&#64;), or hyphen.
     * * The first character must be a letter.
     * * Must not contain a colon (:) or a slash (/).
     * * Cannot be a reserved word. A list of reserved words can be found in [Reserved
     * Words](https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html) in the Amazon Redshift
     * Database Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterusername)
     * @param masterUsername The user name associated with the admin user account for the cluster
     * that is being created. 
     */
    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    /**
     * A boolean indicating whether Amazon Redshift should deploy the cluster in two Availability
     * Zones.
     *
     * The default is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-multiaz)
     * @param multiAz A boolean indicating whether Amazon Redshift should deploy the cluster in two
     * Availability Zones. 
     */
    override fun multiAz(multiAz: Boolean) {
      cdkBuilder.multiAz(multiAz)
    }

    /**
     * A boolean indicating whether Amazon Redshift should deploy the cluster in two Availability
     * Zones.
     *
     * The default is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-multiaz)
     * @param multiAz A boolean indicating whether Amazon Redshift should deploy the cluster in two
     * Availability Zones. 
     */
    override fun multiAz(multiAz: IResolvable) {
      cdkBuilder.multiAz(multiAz.let(IResolvable::unwrap))
    }

    /**
     * The policy that is attached to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-namespaceresourcepolicy)
     * @param namespaceResourcePolicy The policy that is attached to a resource. 
     */
    override fun namespaceResourcePolicy(namespaceResourcePolicy: Any) {
      cdkBuilder.namespaceResourcePolicy(namespaceResourcePolicy)
    }

    /**
     * The node type to be provisioned for the cluster.
     *
     * For information about node types, go to [Working with
     * Clusters](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes)
     * in the *Amazon Redshift Cluster Management Guide* .
     *
     * Valid Values: `ds2.xlarge` | `ds2.8xlarge` | `dc1.large` | `dc1.8xlarge` | `dc2.large` |
     * `dc2.8xlarge` | `ra3.xlplus` | `ra3.4xlarge` | `ra3.16xlarge`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype)
     * @param nodeType The node type to be provisioned for the cluster. 
     */
    override fun nodeType(nodeType: String) {
      cdkBuilder.nodeType(nodeType)
    }

    /**
     * The number of compute nodes in the cluster.
     *
     * This parameter is required when the *ClusterType* parameter is specified as `multi-node` .
     *
     * For information about determining how many nodes you need, go to [Working with
     * Clusters](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes)
     * in the *Amazon Redshift Cluster Management Guide* .
     *
     * If you don't specify this parameter, you get a single-node cluster. When requesting a
     * multi-node cluster, you must specify the number of nodes that you want in the cluster.
     *
     * Default: `1`
     *
     * Constraints: Value must be at least 1 and no more than 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-numberofnodes)
     * @param numberOfNodes The number of compute nodes in the cluster. 
     */
    override fun numberOfNodes(numberOfNodes: Number) {
      cdkBuilder.numberOfNodes(numberOfNodes)
    }

    /**
     * The AWS account used to create or copy the snapshot.
     *
     * Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-owneraccount)
     * @param ownerAccount The AWS account used to create or copy the snapshot. 
     */
    override fun ownerAccount(ownerAccount: String) {
      cdkBuilder.ownerAccount(ownerAccount)
    }

    /**
     * The port number on which the cluster accepts incoming connections.
     *
     * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the
     * connection string requires the port on which the cluster will listen for incoming connections.
     *
     * Default: `5439`
     *
     * Valid Values: `1150-65535`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-port)
     * @param port The port number on which the cluster accepts incoming connections. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * The weekly time range (in UTC) during which automated cluster maintenance can occur.
     *
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * Default: A 30-minute window selected at random from an 8-hour block of time per region,
     * occurring on a random day of the week. For more information about the time blocks for each
     * region, see [Maintenance
     * Windows](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows)
     * in Amazon Redshift Cluster Management Guide.
     *
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *
     * Constraints: Minimum 30-minute window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which automated
     * cluster maintenance can occur. 
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * If `true` , the cluster can be accessed from a public network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-publiclyaccessible)
     * @param publiclyAccessible If `true` , the cluster can be accessed from a public network. 
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * If `true` , the cluster can be accessed from a public network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-publiclyaccessible)
     * @param publiclyAccessible If `true` , the cluster can be accessed from a public network. 
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    /**
     * The Amazon Redshift operation to be performed.
     *
     * Supported operations are `pause-cluster` , `resume-cluster` , and `failover-primary-compute`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-resourceaction)
     * @param resourceAction The Amazon Redshift operation to be performed. 
     */
    override fun resourceAction(resourceAction: String) {
      cdkBuilder.resourceAction(resourceAction)
    }

    /**
     * Describes a `RevisionTarget` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-revisiontarget)
     * @param revisionTarget Describes a `RevisionTarget` object. 
     */
    override fun revisionTarget(revisionTarget: String) {
      cdkBuilder.revisionTarget(revisionTarget)
    }

    /**
     * Rotates the encryption keys for a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-rotateencryptionkey)
     * @param rotateEncryptionKey Rotates the encryption keys for a cluster. 
     */
    override fun rotateEncryptionKey(rotateEncryptionKey: Boolean) {
      cdkBuilder.rotateEncryptionKey(rotateEncryptionKey)
    }

    /**
     * Rotates the encryption keys for a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-rotateencryptionkey)
     * @param rotateEncryptionKey Rotates the encryption keys for a cluster. 
     */
    override fun rotateEncryptionKey(rotateEncryptionKey: IResolvable) {
      cdkBuilder.rotateEncryptionKey(rotateEncryptionKey.let(IResolvable::unwrap))
    }

    /**
     * The name of the cluster the source snapshot was created from.
     *
     * This parameter is required if your user or role has a policy containing a snapshot resource
     * element that specifies anything other than * for the cluster name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotclusteridentifier)
     * @param snapshotClusterIdentifier The name of the cluster the source snapshot was created
     * from. 
     */
    override fun snapshotClusterIdentifier(snapshotClusterIdentifier: String) {
      cdkBuilder.snapshotClusterIdentifier(snapshotClusterIdentifier)
    }

    /**
     * The name of the snapshot copy grant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotcopygrantname)
     * @param snapshotCopyGrantName The name of the snapshot copy grant. 
     */
    override fun snapshotCopyGrantName(snapshotCopyGrantName: String) {
      cdkBuilder.snapshotCopyGrantName(snapshotCopyGrantName)
    }

    /**
     * Indicates whether to apply the snapshot retention period to newly copied manual snapshots
     * instead of automated snapshots.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotcopymanual)
     * @param snapshotCopyManual Indicates whether to apply the snapshot retention period to newly
     * copied manual snapshots instead of automated snapshots. 
     */
    override fun snapshotCopyManual(snapshotCopyManual: Boolean) {
      cdkBuilder.snapshotCopyManual(snapshotCopyManual)
    }

    /**
     * Indicates whether to apply the snapshot retention period to newly copied manual snapshots
     * instead of automated snapshots.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotcopymanual)
     * @param snapshotCopyManual Indicates whether to apply the snapshot retention period to newly
     * copied manual snapshots instead of automated snapshots. 
     */
    override fun snapshotCopyManual(snapshotCopyManual: IResolvable) {
      cdkBuilder.snapshotCopyManual(snapshotCopyManual.let(IResolvable::unwrap))
    }

    /**
     * The number of days to retain automated snapshots in the destination AWS Region after they are
     * copied from the source AWS Region .
     *
     * By default, this only changes the retention period of copied automated snapshots.
     *
     * If you decrease the retention period for automated snapshots that are copied to a destination
     * AWS Region , Amazon Redshift deletes any existing automated snapshots that were copied to the
     * destination AWS Region and that fall outside of the new retention period.
     *
     * Constraints: Must be at least 1 and no more than 35 for automated snapshots.
     *
     * If you specify the `manual` option, only newly copied manual snapshots will have the new
     * retention period.
     *
     * If you specify the value of -1 newly copied manual snapshots are retained indefinitely.
     *
     * Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for
     * manual snapshots.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotcopyretentionperiod)
     * @param snapshotCopyRetentionPeriod The number of days to retain automated snapshots in the
     * destination AWS Region after they are copied from the source AWS Region . 
     */
    override fun snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod: Number) {
      cdkBuilder.snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod)
    }

    /**
     * The name of the snapshot from which to create the new cluster.
     *
     * This parameter isn't case sensitive. You must specify this parameter or `snapshotArn` , but
     * not both.
     *
     * Example: `my-snapshot-id`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotidentifier)
     * @param snapshotIdentifier The name of the snapshot from which to create the new cluster. 
     */
    override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    /**
     * A list of tag instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-tags)
     * @param tags A list of tag instances. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tag instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-tags)
     * @param tags A list of tag instances. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
     *
     * Default: The default VPC security group is associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be
     * associated with the cluster. 
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
     *
     * Default: The default VPC security group is associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be
     * associated with the cluster. 
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnCluster = cdkBuilder.build()
  }

  public companion object {
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
    /**
     * The DNS address of the cluster.
     *
     * This property is read only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-endpoint.html#cfn-redshift-cluster-endpoint-address)
     */
    public fun address(): String? = unwrap(this).getAddress()

    /**
     * The port that the database engine is listening on.
     *
     * This property is read only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-endpoint.html#cfn-redshift-cluster-endpoint-port)
     */
    public fun port(): String? = unwrap(this).getPort()

    /**
     * A builder for [EndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The DNS address of the cluster.
       * This property is read only.
       */
      public fun address(address: String)

      /**
       * @param port The port that the database engine is listening on.
       * This property is read only.
       */
      public fun port(port: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnCluster.EndpointProperty.Builder =
          software.amazon.awscdk.services.redshift.CfnCluster.EndpointProperty.builder()

      /**
       * @param address The DNS address of the cluster.
       * This property is read only.
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      /**
       * @param port The port that the database engine is listening on.
       * This property is read only.
       */
      override fun port(port: String) {
        cdkBuilder.port(port)
      }

      public fun build(): software.amazon.awscdk.services.redshift.CfnCluster.EndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.redshift.CfnCluster.EndpointProperty,
    ) : CdkObject(cdkObject), EndpointProperty {
      /**
       * The DNS address of the cluster.
       *
       * This property is read only.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-endpoint.html#cfn-redshift-cluster-endpoint-address)
       */
      override fun address(): String? = unwrap(this).getAddress()

      /**
       * The port that the database engine is listening on.
       *
       * This property is read only.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-endpoint.html#cfn-redshift-cluster-endpoint-port)
       */
      override fun port(): String? = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnCluster.EndpointProperty):
          EndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointProperty):
          software.amazon.awscdk.services.redshift.CfnCluster.EndpointProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.redshift.CfnCluster.EndpointProperty
    }
  }

  public interface LoggingPropertiesProperty {
    /**
     * The name of an existing S3 bucket where the log files are to be stored.
     *
     * Constraints:
     *
     * * Must be in the same region as the cluster
     * * The cluster must have read bucket and put object permissions
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html#cfn-redshift-cluster-loggingproperties-bucketname)
     */
    public fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * The prefix applied to the log file names.
     *
     * Constraints:
     *
     * * Cannot exceed 512 characters
     * * Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (), or control
     * characters. The hexadecimal codes for invalid characters are:
     * * x00 to x20
     * * x22
     * * x27
     * * x5c
     * * x7f or larger
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html#cfn-redshift-cluster-loggingproperties-s3keyprefix)
     */
    public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    /**
     * A builder for [LoggingPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The name of an existing S3 bucket where the log files are to be stored.
       * Constraints:
       *
       * * Must be in the same region as the cluster
       * * The cluster must have read bucket and put object permissions
       */
      public fun bucketName(bucketName: String)

      /**
       * @param s3KeyPrefix The prefix applied to the log file names.
       * Constraints:
       *
       * * Cannot exceed 512 characters
       * * Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (), or
       * control characters. The hexadecimal codes for invalid characters are:
       * * x00 to x20
       * * x22
       * * x27
       * * x5c
       * * x7f or larger
       */
      public fun s3KeyPrefix(s3KeyPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty.Builder =
          software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty.builder()

      /**
       * @param bucketName The name of an existing S3 bucket where the log files are to be stored.
       * Constraints:
       *
       * * Must be in the same region as the cluster
       * * The cluster must have read bucket and put object permissions
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param s3KeyPrefix The prefix applied to the log file names.
       * Constraints:
       *
       * * Cannot exceed 512 characters
       * * Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (), or
       * control characters. The hexadecimal codes for invalid characters are:
       * * x00 to x20
       * * x22
       * * x27
       * * x5c
       * * x7f or larger
       */
      override fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty,
    ) : CdkObject(cdkObject), LoggingPropertiesProperty {
      /**
       * The name of an existing S3 bucket where the log files are to be stored.
       *
       * Constraints:
       *
       * * Must be in the same region as the cluster
       * * The cluster must have read bucket and put object permissions
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html#cfn-redshift-cluster-loggingproperties-bucketname)
       */
      override fun bucketName(): String? = unwrap(this).getBucketName()

      /**
       * The prefix applied to the log file names.
       *
       * Constraints:
       *
       * * Cannot exceed 512 characters
       * * Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (), or
       * control characters. The hexadecimal codes for invalid characters are:
       * * x00 to x20
       * * x22
       * * x27
       * * x5c
       * * x7f or larger
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html#cfn-redshift-cluster-loggingproperties-s3keyprefix)
       */
      override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty):
          LoggingPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingPropertiesProperty):
          software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty
    }
  }
}
