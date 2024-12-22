@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

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

/**
 * Properties for defining a `CfnReplicationInstance`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dms.*;
 * CfnReplicationInstanceProps cfnReplicationInstanceProps = CfnReplicationInstanceProps.builder()
 * .replicationInstanceClass("replicationInstanceClass")
 * // the properties below are optional
 * .allocatedStorage(123)
 * .allowMajorVersionUpgrade(false)
 * .autoMinorVersionUpgrade(false)
 * .availabilityZone("availabilityZone")
 * .engineVersion("engineVersion")
 * .kmsKeyId("kmsKeyId")
 * .multiAz(false)
 * .networkType("networkType")
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
public interface CfnReplicationInstanceProps {
  /**
   * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allocatedstorage)
   */
  public fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

  /**
   * Indicates that major version upgrades are allowed.
   *
   * Changing this parameter does not result in an outage, and the change is asynchronously applied
   * as soon as possible.
   *
   * This parameter must be set to `true` when specifying a value for the `EngineVersion` parameter
   * that is a different major version than the replication instance's current version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allowmajorversionupgrade)
   */
  public fun allowMajorVersionUpgrade(): Any? = unwrap(this).getAllowMajorVersionUpgrade()

  /**
   * A value that indicates whether minor engine upgrades are applied automatically to the
   * replication instance during the maintenance window.
   *
   * This parameter defaults to `true` .
   *
   * Default: `true`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-autominorversionupgrade)
   */
  public fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * The Availability Zone that the replication instance will be created in.
   *
   * The default value is a random, system-chosen Availability Zone in the endpoint's AWS Region ,
   * for example `us-east-1d` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-availabilityzone)
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The engine version number of the replication instance.
   *
   * If an engine version number is not specified when a replication instance is created, the
   * default is the latest engine version available.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-engineversion)
   */
  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * An AWS KMS key identifier that is used to encrypt the data on the replication instance.
   *
   * If you don't specify a value for the `KmsKeyId` parameter, AWS DMS uses your default encryption
   * key.
   *
   * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
   * different default encryption key for each AWS Region .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * Specifies whether the replication instance is a Multi-AZ deployment.
   *
   * You can't set the `AvailabilityZone` parameter if the Multi-AZ parameter is set to `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-multiaz)
   */
  public fun multiAz(): Any? = unwrap(this).getMultiAz()

  /**
   * The type of IP address protocol used by a replication instance, such as IPv4 only or Dual-stack
   * that supports both IPv4 and IPv6 addressing.
   *
   * IPv6 only is not yet supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-networktype)
   */
  public fun networkType(): String? = unwrap(this).getNetworkType()

  /**
   * The weekly time range during which system maintenance can occur, in UTC.
   *
   * *Format* : `ddd:hh24:mi-ddd:hh24:mi`
   *
   * *Default* : A 30-minute window selected at random from an 8-hour block of time per AWS Region ,
   * occurring on a random day of the week.
   *
   * *Valid days* ( `ddd` ): `Mon` | `Tue` | `Wed` | `Thu` | `Fri` | `Sat` | `Sun`
   *
   * *Constraints* : Minimum 30-minute window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-preferredmaintenancewindow)
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * Specifies the accessibility options for the replication instance.
   *
   * A value of `true` represents an instance with a public IP address. A value of `false`
   * represents an instance with a private IP address. The default value is `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-publiclyaccessible)
   */
  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * The compute and memory capacity of the replication instance as defined for the specified
   * replication instance class.
   *
   * For example, to specify the instance class dms.c4.large, set this parameter to `"dms.c4.large"`
   * . For more information on the settings and capacities for the available replication instance
   * classes, see [Selecting the right AWS DMS replication instance for your
   * migration](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceclass)
   */
  public fun replicationInstanceClass(): String

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
   */
  public fun replicationInstanceIdentifier(): String? =
      unwrap(this).getReplicationInstanceIdentifier()

  /**
   * A subnet group to associate with the replication instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationsubnetgroupidentifier)
   */
  public fun replicationSubnetGroupIdentifier(): String? =
      unwrap(this).getReplicationSubnetGroupIdentifier()

  /**
   * A display name for the resource identifier at the end of the `EndpointArn` response parameter
   * that is returned in the created `Endpoint` object.
   *
   * The value for this parameter can have up to 31 characters. It can contain only ASCII letters,
   * digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens, and
   * can only begin with a letter, such as `Example-App-ARN1` . For example, this value might result in
   * the `EndpointArn` value `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If you don't
   * specify a `ResourceIdentifier` value, AWS DMS generates a default identifier value for the end of
   * `EndpointArn` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-resourceidentifier)
   */
  public fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  /**
   * One or more tags to be assigned to the replication instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies the virtual private cloud (VPC) security group to be used with the replication
   * instance.
   *
   * The VPC security group must work with the VPC containing the replication instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-vpcsecuritygroupids)
   */
  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * A builder for [CfnReplicationInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allocatedStorage The amount of storage (in gigabytes) to be initially allocated for
     * the replication instance.
     */
    public fun allocatedStorage(allocatedStorage: Number)

    /**
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed.
     * Changing this parameter does not result in an outage, and the change is asynchronously
     * applied as soon as possible.
     *
     * This parameter must be set to `true` when specifying a value for the `EngineVersion`
     * parameter that is a different major version than the replication instance's current version.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean)

    /**
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed.
     * Changing this parameter does not result in an outage, and the change is asynchronously
     * applied as soon as possible.
     *
     * This parameter must be set to `true` when specifying a value for the `EngineVersion`
     * parameter that is a different major version than the replication instance's current version.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable)

    /**
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the replication instance during the maintenance window.
     * This parameter defaults to `true` .
     *
     * Default: `true`
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the replication instance during the maintenance window.
     * This parameter defaults to `true` .
     *
     * Default: `true`
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * @param availabilityZone The Availability Zone that the replication instance will be created
     * in.
     * The default value is a random, system-chosen Availability Zone in the endpoint's AWS Region ,
     * for example `us-east-1d` .
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param engineVersion The engine version number of the replication instance.
     * If an engine version number is not specified when a replication instance is created, the
     * default is the latest engine version available.
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param kmsKeyId An AWS KMS key identifier that is used to encrypt the data on the replication
     * instance.
     * If you don't specify a value for the `KmsKeyId` parameter, AWS DMS uses your default
     * encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Region .
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param multiAz Specifies whether the replication instance is a Multi-AZ deployment.
     * You can't set the `AvailabilityZone` parameter if the Multi-AZ parameter is set to `true` .
     */
    public fun multiAz(multiAz: Boolean)

    /**
     * @param multiAz Specifies whether the replication instance is a Multi-AZ deployment.
     * You can't set the `AvailabilityZone` parameter if the Multi-AZ parameter is set to `true` .
     */
    public fun multiAz(multiAz: IResolvable)

    /**
     * @param networkType The type of IP address protocol used by a replication instance, such as
     * IPv4 only or Dual-stack that supports both IPv4 and IPv6 addressing.
     * IPv6 only is not yet supported.
     */
    public fun networkType(networkType: String)

    /**
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in UTC.
     * *Format* : `ddd:hh24:mi-ddd:hh24:mi`
     *
     * *Default* : A 30-minute window selected at random from an 8-hour block of time per AWS Region
     * , occurring on a random day of the week.
     *
     * *Valid days* ( `ddd` ): `Mon` | `Tue` | `Wed` | `Thu` | `Fri` | `Sat` | `Sun`
     *
     * *Constraints* : Minimum 30-minute window.
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param publiclyAccessible Specifies the accessibility options for the replication instance.
     * A value of `true` represents an instance with a public IP address. A value of `false`
     * represents an instance with a private IP address. The default value is `true` .
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * @param publiclyAccessible Specifies the accessibility options for the replication instance.
     * A value of `true` represents an instance with a public IP address. A value of `false`
     * represents an instance with a private IP address. The default value is `true` .
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * @param replicationInstanceClass The compute and memory capacity of the replication instance
     * as defined for the specified replication instance class. 
     * For example, to specify the instance class dms.c4.large, set this parameter to
     * `"dms.c4.large"` . For more information on the settings and capacities for the available
     * replication instance classes, see [Selecting the right AWS DMS replication instance for your
     * migration](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun replicationInstanceClass(replicationInstanceClass: String)

    /**
     * @param replicationInstanceIdentifier The replication instance identifier. This parameter is
     * stored as a lowercase string.
     * Constraints:
     *
     * * Must contain 1-63 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Can't end with a hyphen or contain two consecutive hyphens.
     *
     * Example: `myrepinstance`
     */
    public fun replicationInstanceIdentifier(replicationInstanceIdentifier: String)

    /**
     * @param replicationSubnetGroupIdentifier A subnet group to associate with the replication
     * instance.
     */
    public fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String)

    /**
     * @param resourceIdentifier A display name for the resource identifier at the end of the
     * `EndpointArn` response parameter that is returned in the created `Endpoint` object.
     * The value for this parameter can have up to 31 characters. It can contain only ASCII letters,
     * digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter, such as `Example-App-ARN1` . For example, this value might
     * result in the `EndpointArn` value `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If
     * you don't specify a `ResourceIdentifier` value, AWS DMS generates a default identifier value for
     * the end of `EndpointArn` .
     */
    public fun resourceIdentifier(resourceIdentifier: String)

    /**
     * @param tags One or more tags to be assigned to the replication instance.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags One or more tags to be assigned to the replication instance.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to be
     * used with the replication instance.
     * The VPC security group must work with the VPC containing the replication instance.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to be
     * used with the replication instance.
     * The VPC security group must work with the VPC containing the replication instance.
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder
        = software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.builder()

    /**
     * @param allocatedStorage The amount of storage (in gigabytes) to be initially allocated for
     * the replication instance.
     */
    override fun allocatedStorage(allocatedStorage: Number) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    /**
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed.
     * Changing this parameter does not result in an outage, and the change is asynchronously
     * applied as soon as possible.
     *
     * This parameter must be set to `true` when specifying a value for the `EngineVersion`
     * parameter that is a different major version than the replication instance's current version.
     */
    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed.
     * Changing this parameter does not result in an outage, and the change is asynchronously
     * applied as soon as possible.
     *
     * This parameter must be set to `true` when specifying a value for the `EngineVersion`
     * parameter that is a different major version than the replication instance's current version.
     */
    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the replication instance during the maintenance window.
     * This parameter defaults to `true` .
     *
     * Default: `true`
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the replication instance during the maintenance window.
     * This parameter defaults to `true` .
     *
     * Default: `true`
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param availabilityZone The Availability Zone that the replication instance will be created
     * in.
     * The default value is a random, system-chosen Availability Zone in the endpoint's AWS Region ,
     * for example `us-east-1d` .
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param engineVersion The engine version number of the replication instance.
     * If an engine version number is not specified when a replication instance is created, the
     * default is the latest engine version available.
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param kmsKeyId An AWS KMS key identifier that is used to encrypt the data on the replication
     * instance.
     * If you don't specify a value for the `KmsKeyId` parameter, AWS DMS uses your default
     * encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Region .
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param multiAz Specifies whether the replication instance is a Multi-AZ deployment.
     * You can't set the `AvailabilityZone` parameter if the Multi-AZ parameter is set to `true` .
     */
    override fun multiAz(multiAz: Boolean) {
      cdkBuilder.multiAz(multiAz)
    }

    /**
     * @param multiAz Specifies whether the replication instance is a Multi-AZ deployment.
     * You can't set the `AvailabilityZone` parameter if the Multi-AZ parameter is set to `true` .
     */
    override fun multiAz(multiAz: IResolvable) {
      cdkBuilder.multiAz(multiAz.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param networkType The type of IP address protocol used by a replication instance, such as
     * IPv4 only or Dual-stack that supports both IPv4 and IPv6 addressing.
     * IPv6 only is not yet supported.
     */
    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    /**
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in UTC.
     * *Format* : `ddd:hh24:mi-ddd:hh24:mi`
     *
     * *Default* : A 30-minute window selected at random from an 8-hour block of time per AWS Region
     * , occurring on a random day of the week.
     *
     * *Valid days* ( `ddd` ): `Mon` | `Tue` | `Wed` | `Thu` | `Fri` | `Sat` | `Sun`
     *
     * *Constraints* : Minimum 30-minute window.
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param publiclyAccessible Specifies the accessibility options for the replication instance.
     * A value of `true` represents an instance with a public IP address. A value of `false`
     * represents an instance with a private IP address. The default value is `true` .
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param publiclyAccessible Specifies the accessibility options for the replication instance.
     * A value of `true` represents an instance with a public IP address. A value of `false`
     * represents an instance with a private IP address. The default value is `true` .
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param replicationInstanceClass The compute and memory capacity of the replication instance
     * as defined for the specified replication instance class. 
     * For example, to specify the instance class dms.c4.large, set this parameter to
     * `"dms.c4.large"` . For more information on the settings and capacities for the available
     * replication instance classes, see [Selecting the right AWS DMS replication instance for your
     * migration](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun replicationInstanceClass(replicationInstanceClass: String) {
      cdkBuilder.replicationInstanceClass(replicationInstanceClass)
    }

    /**
     * @param replicationInstanceIdentifier The replication instance identifier. This parameter is
     * stored as a lowercase string.
     * Constraints:
     *
     * * Must contain 1-63 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Can't end with a hyphen or contain two consecutive hyphens.
     *
     * Example: `myrepinstance`
     */
    override fun replicationInstanceIdentifier(replicationInstanceIdentifier: String) {
      cdkBuilder.replicationInstanceIdentifier(replicationInstanceIdentifier)
    }

    /**
     * @param replicationSubnetGroupIdentifier A subnet group to associate with the replication
     * instance.
     */
    override fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String) {
      cdkBuilder.replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier)
    }

    /**
     * @param resourceIdentifier A display name for the resource identifier at the end of the
     * `EndpointArn` response parameter that is returned in the created `Endpoint` object.
     * The value for this parameter can have up to 31 characters. It can contain only ASCII letters,
     * digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter, such as `Example-App-ARN1` . For example, this value might
     * result in the `EndpointArn` value `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If
     * you don't specify a `ResourceIdentifier` value, AWS DMS generates a default identifier value for
     * the end of `EndpointArn` .
     */
    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * @param tags One or more tags to be assigned to the replication instance.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags One or more tags to be assigned to the replication instance.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to be
     * used with the replication instance.
     * The VPC security group must work with the VPC containing the replication instance.
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to be
     * used with the replication instance.
     * The VPC security group must work with the VPC containing the replication instance.
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dms.CfnReplicationInstanceProps,
  ) : CdkObject(cdkObject),
      CfnReplicationInstanceProps {
    /**
     * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allocatedstorage)
     */
    override fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

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
     */
    override fun allowMajorVersionUpgrade(): Any? = unwrap(this).getAllowMajorVersionUpgrade()

    /**
     * A value that indicates whether minor engine upgrades are applied automatically to the
     * replication instance during the maintenance window.
     *
     * This parameter defaults to `true` .
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-autominorversionupgrade)
     */
    override fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

    /**
     * The Availability Zone that the replication instance will be created in.
     *
     * The default value is a random, system-chosen Availability Zone in the endpoint's AWS Region ,
     * for example `us-east-1d` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The engine version number of the replication instance.
     *
     * If an engine version number is not specified when a replication instance is created, the
     * default is the latest engine version available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-engineversion)
     */
    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

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
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Specifies whether the replication instance is a Multi-AZ deployment.
     *
     * You can't set the `AvailabilityZone` parameter if the Multi-AZ parameter is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-multiaz)
     */
    override fun multiAz(): Any? = unwrap(this).getMultiAz()

    /**
     * The type of IP address protocol used by a replication instance, such as IPv4 only or
     * Dual-stack that supports both IPv4 and IPv6 addressing.
     *
     * IPv6 only is not yet supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-networktype)
     */
    override fun networkType(): String? = unwrap(this).getNetworkType()

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
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * Specifies the accessibility options for the replication instance.
     *
     * A value of `true` represents an instance with a public IP address. A value of `false`
     * represents an instance with a private IP address. The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-publiclyaccessible)
     */
    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

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
     */
    override fun replicationInstanceClass(): String = unwrap(this).getReplicationInstanceClass()

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
     */
    override fun replicationInstanceIdentifier(): String? =
        unwrap(this).getReplicationInstanceIdentifier()

    /**
     * A subnet group to associate with the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationsubnetgroupidentifier)
     */
    override fun replicationSubnetGroupIdentifier(): String? =
        unwrap(this).getReplicationSubnetGroupIdentifier()

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
     */
    override fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    /**
     * One or more tags to be assigned to the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies the virtual private cloud (VPC) security group to be used with the replication
     * instance.
     *
     * The VPC security group must work with the VPC containing the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-vpcsecuritygroupids)
     */
    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicationInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationInstanceProps):
        CfnReplicationInstanceProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnReplicationInstanceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationInstanceProps):
        software.amazon.awscdk.services.dms.CfnReplicationInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dms.CfnReplicationInstanceProps
  }
}
