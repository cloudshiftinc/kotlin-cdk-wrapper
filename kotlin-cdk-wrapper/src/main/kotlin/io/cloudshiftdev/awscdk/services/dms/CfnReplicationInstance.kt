@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

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
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::DMS::ReplicationInstance` resource creates an AWS DMS replication instance.
 *
 * To create a ReplicationInstance, you need permissions to create instances. You'll need similar
 * permissions to terminate instances when you delete stacks with instances.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dms.*;
 * CfnReplicationInstance cfnReplicationInstance = CfnReplicationInstance.Builder.create(this,
 * "MyCfnReplicationInstance")
 * .replicationInstanceClass("replicationInstanceClass")
 * // the properties below are optional
 * .allocatedStorage(123)
 * .allowMajorVersionUpgrade(false)
 * .autoMinorVersionUpgrade(false)
 * .availabilityZone("availabilityZone")
 * .engineVersion("engineVersion")
 * .kmsKeyId("kmsKeyId")
 * .multiAz(false)
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .publiclyAccessible(false)
 * .replicationInstanceIdentifier("replicationInstanceIdentifier")
 * .replicationSubnetGroupIdentifier("replicationSubnetGroupIdentifier")
 * .resourceIdentifier("resourceIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html)
 */
public open class CfnReplicationInstance internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dms.CfnReplicationInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
   */
  public open fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

  /**
   * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
   */
  public open fun allocatedStorage(`value`: Number) {
    unwrap(this).setAllocatedStorage(`value`)
  }

  /**
   * Indicates that major version upgrades are allowed.
   */
  public open fun allowMajorVersionUpgrade(): Any? = unwrap(this).getAllowMajorVersionUpgrade()

  /**
   * Indicates that major version upgrades are allowed.
   */
  public open fun allowMajorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAllowMajorVersionUpgrade(`value`)
  }

  /**
   * Indicates that major version upgrades are allowed.
   */
  public open fun allowMajorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAllowMajorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * One or more private IP addresses for the replication instance.
   */
  public open fun attrReplicationInstancePrivateIpAddresses(): String =
      unwrap(this).getAttrReplicationInstancePrivateIpAddresses()

  /**
   * One or more public IP addresses for the replication instance.
   */
  public open fun attrReplicationInstancePublicIpAddresses(): String =
      unwrap(this).getAttrReplicationInstancePublicIpAddresses()

  /**
   * A value that indicates whether minor engine upgrades are applied automatically to the
   * replication instance during the maintenance window.
   */
  public open fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * A value that indicates whether minor engine upgrades are applied automatically to the
   * replication instance during the maintenance window.
   */
  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  /**
   * A value that indicates whether minor engine upgrades are applied automatically to the
   * replication instance during the maintenance window.
   */
  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Availability Zone that the replication instance will be created in.
   */
  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The Availability Zone that the replication instance will be created in.
   */
  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  /**
   * The engine version number of the replication instance.
   */
  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The engine version number of the replication instance.
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * An AWS KMS key identifier that is used to encrypt the data on the replication instance.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * An AWS KMS key identifier that is used to encrypt the data on the replication instance.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * Specifies whether the replication instance is a Multi-AZ deployment.
   */
  public open fun multiAz(): Any? = unwrap(this).getMultiAz()

  /**
   * Specifies whether the replication instance is a Multi-AZ deployment.
   */
  public open fun multiAz(`value`: Boolean) {
    unwrap(this).setMultiAz(`value`)
  }

  /**
   * Specifies whether the replication instance is a Multi-AZ deployment.
   */
  public open fun multiAz(`value`: IResolvable) {
    unwrap(this).setMultiAz(`value`.let(IResolvable::unwrap))
  }

  /**
   * The weekly time range during which system maintenance can occur, in UTC.
   */
  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  /**
   * The weekly time range during which system maintenance can occur, in UTC.
   */
  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  /**
   * Specifies the accessibility options for the replication instance.
   */
  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * Specifies the accessibility options for the replication instance.
   */
  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  /**
   * Specifies the accessibility options for the replication instance.
   */
  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  /**
   * The compute and memory capacity of the replication instance as defined for the specified
   * replication instance class.
   */
  public open fun replicationInstanceClass(): String = unwrap(this).getReplicationInstanceClass()

  /**
   * The compute and memory capacity of the replication instance as defined for the specified
   * replication instance class.
   */
  public open fun replicationInstanceClass(`value`: String) {
    unwrap(this).setReplicationInstanceClass(`value`)
  }

  /**
   * The replication instance identifier.
   *
   * This parameter is stored as a lowercase string.
   */
  public open fun replicationInstanceIdentifier(): String? =
      unwrap(this).getReplicationInstanceIdentifier()

  /**
   * The replication instance identifier.
   *
   * This parameter is stored as a lowercase string.
   */
  public open fun replicationInstanceIdentifier(`value`: String) {
    unwrap(this).setReplicationInstanceIdentifier(`value`)
  }

  /**
   * A subnet group to associate with the replication instance.
   */
  public open fun replicationSubnetGroupIdentifier(): String? =
      unwrap(this).getReplicationSubnetGroupIdentifier()

  /**
   * A subnet group to associate with the replication instance.
   */
  public open fun replicationSubnetGroupIdentifier(`value`: String) {
    unwrap(this).setReplicationSubnetGroupIdentifier(`value`)
  }

  /**
   * A display name for the resource identifier at the end of the `EndpointArn` response parameter
   * that is returned in the created `Endpoint` object.
   */
  public open fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  /**
   * A display name for the resource identifier at the end of the `EndpointArn` response parameter
   * that is returned in the created `Endpoint` object.
   */
  public open fun resourceIdentifier(`value`: String) {
    unwrap(this).setResourceIdentifier(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * One or more tags to be assigned to the replication instance.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * One or more tags to be assigned to the replication instance.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * One or more tags to be assigned to the replication instance.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Specifies the virtual private cloud (VPC) security group to be used with the replication
   * instance.
   */
  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * Specifies the virtual private cloud (VPC) security group to be used with the replication
   * instance.
   */
  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  /**
   * Specifies the virtual private cloud (VPC) security group to be used with the replication
   * instance.
   */
  public open fun vpcSecurityGroupIds(vararg `value`: String): Unit =
      vpcSecurityGroupIds(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dms.CfnReplicationInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allocatedstorage)
     * @param allocatedStorage The amount of storage (in gigabytes) to be initially allocated for
     * the replication instance. 
     */
    public fun allocatedStorage(allocatedStorage: Number)

    /**
     * Indicates that major version upgrades are allowed.
     *
     * Changing this parameter does not result in an outage, and the change is asynchronously
     * applied as soon as possible.
     *
     * This parameter must be set to `true` when specifying a value for the `EngineVersion`
     * parameter that is a different major version than the replication instance's current version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allowmajorversionupgrade)
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed. 
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean)

    /**
     * Indicates that major version upgrades are allowed.
     *
     * Changing this parameter does not result in an outage, and the change is asynchronously
     * applied as soon as possible.
     *
     * This parameter must be set to `true` when specifying a value for the `EngineVersion`
     * parameter that is a different major version than the replication instance's current version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allowmajorversionupgrade)
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed. 
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable)

    /**
     * A value that indicates whether minor engine upgrades are applied automatically to the
     * replication instance during the maintenance window.
     *
     * This parameter defaults to `true` .
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-autominorversionupgrade)
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the replication instance during the maintenance window. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * A value that indicates whether minor engine upgrades are applied automatically to the
     * replication instance during the maintenance window.
     *
     * This parameter defaults to `true` .
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-autominorversionupgrade)
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the replication instance during the maintenance window. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * The Availability Zone that the replication instance will be created in.
     *
     * The default value is a random, system-chosen Availability Zone in the endpoint's AWS Region ,
     * for example `us-east-1d` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-availabilityzone)
     * @param availabilityZone The Availability Zone that the replication instance will be created
     * in. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * The engine version number of the replication instance.
     *
     * If an engine version number is not specified when a replication instance is created, the
     * default is the latest engine version available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-engineversion)
     * @param engineVersion The engine version number of the replication instance. 
     */
    public fun engineVersion(engineVersion: String)

    /**
     * An AWS KMS key identifier that is used to encrypt the data on the replication instance.
     *
     * If you don't specify a value for the `KmsKeyId` parameter, AWS DMS uses your default
     * encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-kmskeyid)
     * @param kmsKeyId An AWS KMS key identifier that is used to encrypt the data on the replication
     * instance. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * Specifies whether the replication instance is a Multi-AZ deployment.
     *
     * You can't set the `AvailabilityZone` parameter if the Multi-AZ parameter is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-multiaz)
     * @param multiAz Specifies whether the replication instance is a Multi-AZ deployment. 
     */
    public fun multiAz(multiAz: Boolean)

    /**
     * Specifies whether the replication instance is a Multi-AZ deployment.
     *
     * You can't set the `AvailabilityZone` parameter if the Multi-AZ parameter is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-multiaz)
     * @param multiAz Specifies whether the replication instance is a Multi-AZ deployment. 
     */
    public fun multiAz(multiAz: IResolvable)

    /**
     * The weekly time range during which system maintenance can occur, in UTC.
     *
     * *Format* : `ddd:hh24:mi-ddd:hh24:mi`
     *
     * *Default* : A 30-minute window selected at random from an 8-hour block of time per AWS Region
     * , occurring on a random day of the week.
     *
     * *Valid days* ( `ddd` ): `Mon` | `Tue` | `Wed` | `Thu` | `Fri` | `Sat` | `Sun`
     *
     * *Constraints* : Minimum 30-minute window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in UTC. 
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * Specifies the accessibility options for the replication instance.
     *
     * A value of `true` represents an instance with a public IP address. A value of `false`
     * represents an instance with a private IP address. The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-publiclyaccessible)
     * @param publiclyAccessible Specifies the accessibility options for the replication instance. 
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * Specifies the accessibility options for the replication instance.
     *
     * A value of `true` represents an instance with a public IP address. A value of `false`
     * represents an instance with a private IP address. The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-publiclyaccessible)
     * @param publiclyAccessible Specifies the accessibility options for the replication instance. 
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * The compute and memory capacity of the replication instance as defined for the specified
     * replication instance class.
     *
     * For example, to specify the instance class dms.c4.large, set this parameter to
     * `"dms.c4.large"` . For more information on the settings and capacities for the available
     * replication instance classes, see [Selecting the right AWS DMS replication instance for your
     * migration](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceclass)
     * @param replicationInstanceClass The compute and memory capacity of the replication instance
     * as defined for the specified replication instance class. 
     */
    public fun replicationInstanceClass(replicationInstanceClass: String)

    /**
     * The replication instance identifier. This parameter is stored as a lowercase string.
     *
     * Constraints:
     *
     * * Must contain 1-63 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Can't end with a hyphen or contain two consecutive hyphens.
     *
     * Example: `myrepinstance`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceidentifier)
     * @param replicationInstanceIdentifier The replication instance identifier. This parameter is
     * stored as a lowercase string. 
     */
    public fun replicationInstanceIdentifier(replicationInstanceIdentifier: String)

    /**
     * A subnet group to associate with the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationsubnetgroupidentifier)
     * @param replicationSubnetGroupIdentifier A subnet group to associate with the replication
     * instance. 
     */
    public fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String)

    /**
     * A display name for the resource identifier at the end of the `EndpointArn` response parameter
     * that is returned in the created `Endpoint` object.
     *
     * The value for this parameter can have up to 31 characters. It can contain only ASCII letters,
     * digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter, such as `Example-App-ARN1` . For example, this value might
     * result in the `EndpointArn` value `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If
     * you don't specify a `ResourceIdentifier` value, AWS DMS generates a default identifier value for
     * the end of `EndpointArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-resourceidentifier)
     * @param resourceIdentifier A display name for the resource identifier at the end of the
     * `EndpointArn` response parameter that is returned in the created `Endpoint` object. 
     */
    public fun resourceIdentifier(resourceIdentifier: String)

    /**
     * One or more tags to be assigned to the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-tags)
     * @param tags One or more tags to be assigned to the replication instance. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * One or more tags to be assigned to the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-tags)
     * @param tags One or more tags to be assigned to the replication instance. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Specifies the virtual private cloud (VPC) security group to be used with the replication
     * instance.
     *
     * The VPC security group must work with the VPC containing the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to be
     * used with the replication instance. 
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * Specifies the virtual private cloud (VPC) security group to be used with the replication
     * instance.
     *
     * The VPC security group must work with the VPC containing the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to be
     * used with the replication instance. 
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnReplicationInstance.Builder =
        software.amazon.awscdk.services.dms.CfnReplicationInstance.Builder.create(scope, id)

    /**
     * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allocatedstorage)
     * @param allocatedStorage The amount of storage (in gigabytes) to be initially allocated for
     * the replication instance. 
     */
    override fun allocatedStorage(allocatedStorage: Number) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    /**
     * Indicates that major version upgrades are allowed.
     *
     * Changing this parameter does not result in an outage, and the change is asynchronously
     * applied as soon as possible.
     *
     * This parameter must be set to `true` when specifying a value for the `EngineVersion`
     * parameter that is a different major version than the replication instance's current version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allowmajorversionupgrade)
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed. 
     */
    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * Indicates that major version upgrades are allowed.
     *
     * Changing this parameter does not result in an outage, and the change is asynchronously
     * applied as soon as possible.
     *
     * This parameter must be set to `true` when specifying a value for the `EngineVersion`
     * parameter that is a different major version than the replication instance's current version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allowmajorversionupgrade)
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed. 
     */
    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade.let(IResolvable::unwrap))
    }

    /**
     * A value that indicates whether minor engine upgrades are applied automatically to the
     * replication instance during the maintenance window.
     *
     * This parameter defaults to `true` .
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-autominorversionupgrade)
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the replication instance during the maintenance window. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * A value that indicates whether minor engine upgrades are applied automatically to the
     * replication instance during the maintenance window.
     *
     * This parameter defaults to `true` .
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-autominorversionupgrade)
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the replication instance during the maintenance window. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    /**
     * The Availability Zone that the replication instance will be created in.
     *
     * The default value is a random, system-chosen Availability Zone in the endpoint's AWS Region ,
     * for example `us-east-1d` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-availabilityzone)
     * @param availabilityZone The Availability Zone that the replication instance will be created
     * in. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * The engine version number of the replication instance.
     *
     * If an engine version number is not specified when a replication instance is created, the
     * default is the latest engine version available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-engineversion)
     * @param engineVersion The engine version number of the replication instance. 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * An AWS KMS key identifier that is used to encrypt the data on the replication instance.
     *
     * If you don't specify a value for the `KmsKeyId` parameter, AWS DMS uses your default
     * encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-kmskeyid)
     * @param kmsKeyId An AWS KMS key identifier that is used to encrypt the data on the replication
     * instance. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * Specifies whether the replication instance is a Multi-AZ deployment.
     *
     * You can't set the `AvailabilityZone` parameter if the Multi-AZ parameter is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-multiaz)
     * @param multiAz Specifies whether the replication instance is a Multi-AZ deployment. 
     */
    override fun multiAz(multiAz: Boolean) {
      cdkBuilder.multiAz(multiAz)
    }

    /**
     * Specifies whether the replication instance is a Multi-AZ deployment.
     *
     * You can't set the `AvailabilityZone` parameter if the Multi-AZ parameter is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-multiaz)
     * @param multiAz Specifies whether the replication instance is a Multi-AZ deployment. 
     */
    override fun multiAz(multiAz: IResolvable) {
      cdkBuilder.multiAz(multiAz.let(IResolvable::unwrap))
    }

    /**
     * The weekly time range during which system maintenance can occur, in UTC.
     *
     * *Format* : `ddd:hh24:mi-ddd:hh24:mi`
     *
     * *Default* : A 30-minute window selected at random from an 8-hour block of time per AWS Region
     * , occurring on a random day of the week.
     *
     * *Valid days* ( `ddd` ): `Mon` | `Tue` | `Wed` | `Thu` | `Fri` | `Sat` | `Sun`
     *
     * *Constraints* : Minimum 30-minute window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in UTC. 
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * Specifies the accessibility options for the replication instance.
     *
     * A value of `true` represents an instance with a public IP address. A value of `false`
     * represents an instance with a private IP address. The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-publiclyaccessible)
     * @param publiclyAccessible Specifies the accessibility options for the replication instance. 
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * Specifies the accessibility options for the replication instance.
     *
     * A value of `true` represents an instance with a public IP address. A value of `false`
     * represents an instance with a private IP address. The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-publiclyaccessible)
     * @param publiclyAccessible Specifies the accessibility options for the replication instance. 
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    /**
     * The compute and memory capacity of the replication instance as defined for the specified
     * replication instance class.
     *
     * For example, to specify the instance class dms.c4.large, set this parameter to
     * `"dms.c4.large"` . For more information on the settings and capacities for the available
     * replication instance classes, see [Selecting the right AWS DMS replication instance for your
     * migration](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceclass)
     * @param replicationInstanceClass The compute and memory capacity of the replication instance
     * as defined for the specified replication instance class. 
     */
    override fun replicationInstanceClass(replicationInstanceClass: String) {
      cdkBuilder.replicationInstanceClass(replicationInstanceClass)
    }

    /**
     * The replication instance identifier. This parameter is stored as a lowercase string.
     *
     * Constraints:
     *
     * * Must contain 1-63 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Can't end with a hyphen or contain two consecutive hyphens.
     *
     * Example: `myrepinstance`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceidentifier)
     * @param replicationInstanceIdentifier The replication instance identifier. This parameter is
     * stored as a lowercase string. 
     */
    override fun replicationInstanceIdentifier(replicationInstanceIdentifier: String) {
      cdkBuilder.replicationInstanceIdentifier(replicationInstanceIdentifier)
    }

    /**
     * A subnet group to associate with the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationsubnetgroupidentifier)
     * @param replicationSubnetGroupIdentifier A subnet group to associate with the replication
     * instance. 
     */
    override fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String) {
      cdkBuilder.replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier)
    }

    /**
     * A display name for the resource identifier at the end of the `EndpointArn` response parameter
     * that is returned in the created `Endpoint` object.
     *
     * The value for this parameter can have up to 31 characters. It can contain only ASCII letters,
     * digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter, such as `Example-App-ARN1` . For example, this value might
     * result in the `EndpointArn` value `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If
     * you don't specify a `ResourceIdentifier` value, AWS DMS generates a default identifier value for
     * the end of `EndpointArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-resourceidentifier)
     * @param resourceIdentifier A display name for the resource identifier at the end of the
     * `EndpointArn` response parameter that is returned in the created `Endpoint` object. 
     */
    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * One or more tags to be assigned to the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-tags)
     * @param tags One or more tags to be assigned to the replication instance. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * One or more tags to be assigned to the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-tags)
     * @param tags One or more tags to be assigned to the replication instance. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Specifies the virtual private cloud (VPC) security group to be used with the replication
     * instance.
     *
     * The VPC security group must work with the VPC containing the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to be
     * used with the replication instance. 
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * Specifies the virtual private cloud (VPC) security group to be used with the replication
     * instance.
     *
     * The VPC security group must work with the VPC containing the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to be
     * used with the replication instance. 
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationInstance =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dms.CfnReplicationInstance.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReplicationInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReplicationInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationInstance):
        CfnReplicationInstance = CfnReplicationInstance(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationInstance):
        software.amazon.awscdk.services.dms.CfnReplicationInstance = wrapped.cdkObject
  }
}
