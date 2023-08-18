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

package io.cloudshiftdev.awscdkdsl.services.neptune

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.neptune.CfnDBInstance
import software.constructs.Construct

/**
 * The `AWS::Neptune::DBInstance` type creates an Amazon Neptune DB instance.
 *
 * *Updating DB Instances*
 *
 * You can set a deletion policy for your DB instance to control how AWS CloudFormation handles the
 * instance when the stack is deleted. For Neptune DB instances, you can choose to *retain* the
 * instance, to *delete* the instance, or to *create a snapshot* of the instance. The default AWS
 * CloudFormation behavior depends on the `DBClusterIdentifier` property:
 * * For `AWS::Neptune::DBInstance` resources that don't specify the `DBClusterIdentifier` property,
 *   AWS CloudFormation saves a snapshot of the DB instance.
 * * For `AWS::Neptune::DBInstance` resources that do specify the `DBClusterIdentifier` property,
 *   AWS CloudFormation deletes the DB instance.
 *
 * *Deleting DB Instances*
 *
 * If a DB instance is deleted or replaced during an update, AWS CloudFormation deletes all
 * automated snapshots. However, it retains manual DB snapshots. During an update that requires
 * replacement, you can apply a stack policy to prevent DB instances from being replaced.
 *
 * When properties labeled *Update requires: Replacement* are updated, AWS CloudFormation first
 * creates a replacement DB instance, changes references from other dependent resources to point to
 * the replacement DB instance, and finally deletes the old DB instance.
 *
 * We highly recommend that you take a snapshot of the database before updating the stack. If you
 * don't, you lose the data when AWS CloudFormation replaces your DB instance. To preserve your
 * data, perform the following procedure:
 * * Deactivate any applications that are using the DB instance so that there's no activity on the
 *   DB instance.
 * * Create a snapshot of the DB instance.
 * * If you want to restore your instance using a DB snapshot, modify the updated template with your
 *   DB instance changes and add the `DBSnapshotIdentifier` property with the ID of the DB snapshot
 *   that you want to use.
 * * Update the stack.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.neptune.*;
 * CfnDBInstance cfnDBInstance = CfnDBInstance.Builder.create(this, "MyCfnDBInstance")
 * .dbInstanceClass("dbInstanceClass")
 * // the properties below are optional
 * .allowMajorVersionUpgrade(false)
 * .autoMinorVersionUpgrade(false)
 * .availabilityZone("availabilityZone")
 * .dbClusterIdentifier("dbClusterIdentifier")
 * .dbInstanceIdentifier("dbInstanceIdentifier")
 * .dbParameterGroupName("dbParameterGroupName")
 * .dbSnapshotIdentifier("dbSnapshotIdentifier")
 * .dbSubnetGroupName("dbSubnetGroupName")
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html)
 */
@CdkDslMarker
public class CfnDBInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDBInstance.Builder = CfnDBInstance.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Indicates that major version upgrades are allowed.
     *
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied
     * as soon as possible. This parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB instance's current
     * version.
     *
     * When you change this parameter for an existing DB cluster, CloudFormation will replace your
     * existing DB cluster with a new, empty one that uses the engine version you specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-allowmajorversionupgrade)
     *
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
        cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * Indicates that major version upgrades are allowed.
     *
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied
     * as soon as possible. This parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB instance's current
     * version.
     *
     * When you change this parameter for an existing DB cluster, CloudFormation will replace your
     * existing DB cluster with a new, empty one that uses the engine version you specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-allowmajorversionupgrade)
     *
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable) {
        cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * Indicates that minor version patches are applied automatically.
     *
     * When updating this property, some interruptions may occur.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-autominorversionupgrade)
     *
     * @param autoMinorVersionUpgrade Indicates that minor version patches are applied
     *   automatically.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * Indicates that minor version patches are applied automatically.
     *
     * When updating this property, some interruptions may occur.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-autominorversionupgrade)
     *
     * @param autoMinorVersionUpgrade Indicates that minor version patches are applied
     *   automatically.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * Specifies the name of the Availability Zone the DB instance is located in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-availabilityzone)
     *
     * @param availabilityZone Specifies the name of the Availability Zone the DB instance is
     *   located in.
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the
     * DB instance is a member of.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbclusteridentifier)
     *
     * @param dbClusterIdentifier If the DB instance is a member of a DB cluster, contains the name
     *   of the DB cluster that the DB instance is a member of.
     */
    public fun dbClusterIdentifier(dbClusterIdentifier: String) {
        cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    /**
     * Contains the name of the compute and memory capacity class of the DB instance.
     *
     * If you update this property, some interruptions may occur.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceclass)
     *
     * @param dbInstanceClass Contains the name of the compute and memory capacity class of the DB
     *   instance.
     */
    public fun dbInstanceClass(dbInstanceClass: String) {
        cdkBuilder.dbInstanceClass(dbInstanceClass)
    }

    /**
     * Contains a user-supplied database identifier.
     *
     * This identifier is the unique key that identifies a DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceidentifier)
     *
     * @param dbInstanceIdentifier Contains a user-supplied database identifier.
     */
    public fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
        cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
    }

    /**
     * The name of an existing DB parameter group or a reference to an
     * AWS::Neptune::DBParameterGroup resource created in the template.
     *
     * If any of the data members of the referenced parameter group are changed during an update,
     * the DB instance might need to be restarted, which causes some interruption. If the parameter
     * group contains static parameters, whether they were changed or not, an update triggers a
     * reboot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbparametergroupname)
     *
     * @param dbParameterGroupName The name of an existing DB parameter group or a reference to an
     *   AWS::Neptune::DBParameterGroup resource created in the template.
     */
    public fun dbParameterGroupName(dbParameterGroupName: String) {
        cdkBuilder.dbParameterGroupName(dbParameterGroupName)
    }

    /**
     * This parameter is not supported.
     *
     * `AWS::Neptune::DBInstance` does not support restoring from snapshots.
     *
     * `AWS::Neptune::DBCluster` does support restoring from snapshots.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsnapshotidentifier)
     *
     * @param dbSnapshotIdentifier This parameter is not supported.
     */
    public fun dbSnapshotIdentifier(dbSnapshotIdentifier: String) {
        cdkBuilder.dbSnapshotIdentifier(dbSnapshotIdentifier)
    }

    /**
     * A DB subnet group to associate with the DB instance.
     *
     * If you update this value, the new subnet group must be a subnet group in a new virtual
     * private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsubnetgroupname)
     *
     * @param dbSubnetGroupName A DB subnet group to associate with the DB instance.
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String) {
        cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /**
     * Specifies the weekly time range during which system maintenance can occur, in Universal
     * Coordinated Time (UTC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-preferredmaintenancewindow)
     *
     * @param preferredMaintenanceWindow Specifies the weekly time range during which system
     *   maintenance can occur, in Universal Coordinated Time (UTC).
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-tags)
     *
     * @param tags An arbitrary set of tags (key-value pairs) for this DB instance.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-tags)
     *
     * @param tags An arbitrary set of tags (key-value pairs) for this DB instance.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDBInstance {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
