@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.dms

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnReplicationInstanceProps

/**
 * Properties for defining a `CfnReplicationInstance`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
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
@CdkDslMarker
public class CfnReplicationInstancePropsDsl {
    private val cdkBuilder: CfnReplicationInstanceProps.Builder =
        CfnReplicationInstanceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

    /**
     * @param allocatedStorage The amount of storage (in gigabytes) to be initially allocated for
     *   the replication instance.
     */
    public fun allocatedStorage(allocatedStorage: Number) {
        cdkBuilder.allocatedStorage(allocatedStorage)
    }

    /**
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed. Changing
     *   this parameter does not result in an outage, and the change is asynchronously applied as
     *   soon as possible.
     *
     * This parameter must be set to `true` when specifying a value for the `EngineVersion`
     * parameter that is a different major version than the replication instance's current version.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
        cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed. Changing
     *   this parameter does not result in an outage, and the change is asynchronously applied as
     *   soon as possible.
     *
     * This parameter must be set to `true` when specifying a value for the `EngineVersion`
     * parameter that is a different major version than the replication instance's current version.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable) {
        cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     *   applied automatically to the replication instance during the maintenance window. This
     *   parameter defaults to `true` .
     *
     * Default: `true`
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     *   applied automatically to the replication instance during the maintenance window. This
     *   parameter defaults to `true` .
     *
     * Default: `true`
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param availabilityZone The Availability Zone that the replication instance will be created
     *   in. The default value is a random, system-chosen Availability Zone in the endpoint's AWS
     *   Region , for example `us-east-1d` .
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param engineVersion The engine version number of the replication instance. If an engine
     *   version number is not specified when a replication instance is created, the default is the
     *   latest engine version available.
     */
    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param kmsKeyId An AWS KMS key identifier that is used to encrypt the data on the replication
     *   instance. If you don't specify a value for the `KmsKeyId` parameter, AWS DMS uses your
     *   default encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Region .
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param multiAz Specifies whether the replication instance is a Multi-AZ deployment. You can't
     *   set the `AvailabilityZone` parameter if the Multi-AZ parameter is set to `true` .
     */
    public fun multiAz(multiAz: Boolean) {
        cdkBuilder.multiAz(multiAz)
    }

    /**
     * @param multiAz Specifies whether the replication instance is a Multi-AZ deployment. You can't
     *   set the `AvailabilityZone` parameter if the Multi-AZ parameter is set to `true` .
     */
    public fun multiAz(multiAz: IResolvable) {
        cdkBuilder.multiAz(multiAz)
    }

    /**
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     *   occur, in UTC. *Format* : `ddd:hh24:mi-ddd:hh24:mi`
     *
     * *Default* : A 30-minute window selected at random from an 8-hour block of time per AWS Region
     * , occurring on a random day of the week.
     *
     * *Valid days* ( `ddd` ): `Mon` | `Tue` | `Wed` | `Thu` | `Fri` | `Sat` | `Sun`
     *
     * *Constraints* : Minimum 30-minute window.
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param publiclyAccessible Specifies the accessibility options for the replication instance. A
     *   value of `true` represents an instance with a public IP address. A value of `false`
     *   represents an instance with a private IP address. The default value is `true` .
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param publiclyAccessible Specifies the accessibility options for the replication instance. A
     *   value of `true` represents an instance with a public IP address. A value of `false`
     *   represents an instance with a private IP address. The default value is `true` .
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param replicationInstanceClass The compute and memory capacity of the replication instance
     *   as defined for the specified replication instance class. For example, to specify the
     *   instance class dms.c4.large, set this parameter to `"dms.c4.large"` . For more information
     *   on the settings and capacities for the available replication instance classes, see
     *   [Selecting the right AWS DMS replication instance for your migration](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth)
     *   in the *AWS Database Migration Service User Guide* .
     */
    public fun replicationInstanceClass(replicationInstanceClass: String) {
        cdkBuilder.replicationInstanceClass(replicationInstanceClass)
    }

    /**
     * @param replicationInstanceIdentifier The replication instance identifier. This parameter is
     *   stored as a lowercase string. Constraints:
     * * Must contain 1-63 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Can't end with a hyphen or contain two consecutive hyphens.
     *
     * Example: `myrepinstance`
     */
    public fun replicationInstanceIdentifier(replicationInstanceIdentifier: String) {
        cdkBuilder.replicationInstanceIdentifier(replicationInstanceIdentifier)
    }

    /**
     * @param replicationSubnetGroupIdentifier A subnet group to associate with the replication
     *   instance.
     */
    public fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String) {
        cdkBuilder.replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier)
    }

    /**
     * @param resourceIdentifier A display name for the resource identifier at the end of the
     *   `EndpointArn` response parameter that is returned in the created `Endpoint` object. The
     *   value for this parameter can have up to 31 characters. It can contain only ASCII letters,
     *   digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive
     *   hyphens, and can only begin with a letter, such as `Example-App-ARN1` . For example, this
     *   value might result in the `EndpointArn` value
     *   `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If you don't specify a
     *   `ResourceIdentifier` value, AWS DMS generates a default identifier value for the end of
     *   `EndpointArn` .
     */
    public fun resourceIdentifier(resourceIdentifier: String) {
        cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /** @param tags One or more tags to be assigned to the replication instance. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags One or more tags to be assigned to the replication instance. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to be
     *   used with the replication instance. The VPC security group must work with the VPC
     *   containing the replication instance.
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
        _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
    }

    /**
     * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to be
     *   used with the replication instance. The VPC security group must work with the VPC
     *   containing the replication instance.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
        _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
    }

    public fun build(): CfnReplicationInstanceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
        return cdkBuilder.build()
    }
}
