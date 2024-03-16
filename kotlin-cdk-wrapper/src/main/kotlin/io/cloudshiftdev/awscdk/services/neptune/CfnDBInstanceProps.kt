@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.neptune

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDBInstance`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.neptune.*;
 * CfnDBInstanceProps cfnDBInstanceProps = CfnDBInstanceProps.builder()
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
public interface CfnDBInstanceProps {
  /**
   * Indicates that major version upgrades are allowed.
   *
   * Changing this parameter doesn't result in an outage and the change is asynchronously applied as
   * soon as possible. This parameter must be set to true when specifying a value for the EngineVersion
   * parameter that is a different major version than the DB instance's current version.
   *
   * When you change this parameter for an existing DB cluster, CloudFormation will replace your
   * existing DB cluster with a new, empty one that uses the engine version you specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-allowmajorversionupgrade)
   */
  public fun allowMajorVersionUpgrade(): Any? = unwrap(this).getAllowMajorVersionUpgrade()

  /**
   * Indicates that minor version patches are applied automatically.
   *
   * When updating this property, some interruptions may occur.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-autominorversionupgrade)
   */
  public fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * Specifies the name of the Availability Zone the DB instance is located in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-availabilityzone)
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB
   * instance is a member of.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbclusteridentifier)
   */
  public fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  /**
   * Contains the name of the compute and memory capacity class of the DB instance.
   *
   * If you update this property, some interruptions may occur.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceclass)
   */
  public fun dbInstanceClass(): String

  /**
   * Contains a user-supplied database identifier.
   *
   * This identifier is the unique key that identifies a DB instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceidentifier)
   */
  public fun dbInstanceIdentifier(): String? = unwrap(this).getDbInstanceIdentifier()

  /**
   * The name of an existing DB parameter group or a reference to an AWS::Neptune::DBParameterGroup
   * resource created in the template.
   *
   * If any of the data members of the referenced parameter group are changed during an update, the
   * DB instance might need to be restarted, which causes some interruption. If the parameter group
   * contains static parameters, whether they were changed or not, an update triggers a reboot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbparametergroupname)
   */
  public fun dbParameterGroupName(): String? = unwrap(this).getDbParameterGroupName()

  /**
   * This parameter is not supported.
   *
   * `AWS::Neptune::DBInstance` does not support restoring from snapshots.
   *
   * `AWS::Neptune::DBCluster` does support restoring from snapshots.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsnapshotidentifier)
   */
  public fun dbSnapshotIdentifier(): String? = unwrap(this).getDbSnapshotIdentifier()

  /**
   * A DB subnet group to associate with the DB instance.
   *
   * If you update this value, the new subnet group must be a subnet group in a new virtual private
   * cloud (VPC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsubnetgroupname)
   */
  public fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  /**
   * Specifies the weekly time range during which system maintenance can occur, in Universal
   * Coordinated Time (UTC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-preferredmaintenancewindow)
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * An arbitrary set of tags (key-value pairs) for this DB instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDBInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed.
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied
     * as soon as possible. This parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB instance's current
     * version.
     *
     * When you change this parameter for an existing DB cluster, CloudFormation will replace your
     * existing DB cluster with a new, empty one that uses the engine version you specified.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean)

    /**
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed.
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied
     * as soon as possible. This parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB instance's current
     * version.
     *
     * When you change this parameter for an existing DB cluster, CloudFormation will replace your
     * existing DB cluster with a new, empty one that uses the engine version you specified.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable)

    /**
     * @param autoMinorVersionUpgrade Indicates that minor version patches are applied
     * automatically.
     * When updating this property, some interruptions may occur.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * @param autoMinorVersionUpgrade Indicates that minor version patches are applied
     * automatically.
     * When updating this property, some interruptions may occur.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * @param availabilityZone Specifies the name of the Availability Zone the DB instance is
     * located in.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param dbClusterIdentifier If the DB instance is a member of a DB cluster, contains the name
     * of the DB cluster that the DB instance is a member of.
     */
    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    /**
     * @param dbInstanceClass Contains the name of the compute and memory capacity class of the DB
     * instance. 
     * If you update this property, some interruptions may occur.
     */
    public fun dbInstanceClass(dbInstanceClass: String)

    /**
     * @param dbInstanceIdentifier Contains a user-supplied database identifier.
     * This identifier is the unique key that identifies a DB instance.
     */
    public fun dbInstanceIdentifier(dbInstanceIdentifier: String)

    /**
     * @param dbParameterGroupName The name of an existing DB parameter group or a reference to an
     * AWS::Neptune::DBParameterGroup resource created in the template.
     * If any of the data members of the referenced parameter group are changed during an update,
     * the DB instance might need to be restarted, which causes some interruption. If the parameter
     * group contains static parameters, whether they were changed or not, an update triggers a reboot.
     */
    public fun dbParameterGroupName(dbParameterGroupName: String)

    /**
     * @param dbSnapshotIdentifier This parameter is not supported.
     * `AWS::Neptune::DBInstance` does not support restoring from snapshots.
     *
     * `AWS::Neptune::DBCluster` does support restoring from snapshots.
     */
    public fun dbSnapshotIdentifier(dbSnapshotIdentifier: String)

    /**
     * @param dbSubnetGroupName A DB subnet group to associate with the DB instance.
     * If you update this value, the new subnet group must be a subnet group in a new virtual
     * private cloud (VPC).
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    /**
     * @param preferredMaintenanceWindow Specifies the weekly time range during which system
     * maintenance can occur, in Universal Coordinated Time (UTC).
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this DB instance.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this DB instance.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder =
        software.amazon.awscdk.services.neptune.CfnDBInstanceProps.builder()

    /**
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed.
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied
     * as soon as possible. This parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB instance's current
     * version.
     *
     * When you change this parameter for an existing DB cluster, CloudFormation will replace your
     * existing DB cluster with a new, empty one that uses the engine version you specified.
     */
    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed.
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied
     * as soon as possible. This parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB instance's current
     * version.
     *
     * When you change this parameter for an existing DB cluster, CloudFormation will replace your
     * existing DB cluster with a new, empty one that uses the engine version you specified.
     */
    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade.let(IResolvable::unwrap))
    }

    /**
     * @param autoMinorVersionUpgrade Indicates that minor version patches are applied
     * automatically.
     * When updating this property, some interruptions may occur.
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade Indicates that minor version patches are applied
     * automatically.
     * When updating this property, some interruptions may occur.
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    /**
     * @param availabilityZone Specifies the name of the Availability Zone the DB instance is
     * located in.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param dbClusterIdentifier If the DB instance is a member of a DB cluster, contains the name
     * of the DB cluster that the DB instance is a member of.
     */
    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    /**
     * @param dbInstanceClass Contains the name of the compute and memory capacity class of the DB
     * instance. 
     * If you update this property, some interruptions may occur.
     */
    override fun dbInstanceClass(dbInstanceClass: String) {
      cdkBuilder.dbInstanceClass(dbInstanceClass)
    }

    /**
     * @param dbInstanceIdentifier Contains a user-supplied database identifier.
     * This identifier is the unique key that identifies a DB instance.
     */
    override fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
      cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
    }

    /**
     * @param dbParameterGroupName The name of an existing DB parameter group or a reference to an
     * AWS::Neptune::DBParameterGroup resource created in the template.
     * If any of the data members of the referenced parameter group are changed during an update,
     * the DB instance might need to be restarted, which causes some interruption. If the parameter
     * group contains static parameters, whether they were changed or not, an update triggers a reboot.
     */
    override fun dbParameterGroupName(dbParameterGroupName: String) {
      cdkBuilder.dbParameterGroupName(dbParameterGroupName)
    }

    /**
     * @param dbSnapshotIdentifier This parameter is not supported.
     * `AWS::Neptune::DBInstance` does not support restoring from snapshots.
     *
     * `AWS::Neptune::DBCluster` does support restoring from snapshots.
     */
    override fun dbSnapshotIdentifier(dbSnapshotIdentifier: String) {
      cdkBuilder.dbSnapshotIdentifier(dbSnapshotIdentifier)
    }

    /**
     * @param dbSubnetGroupName A DB subnet group to associate with the DB instance.
     * If you update this value, the new subnet group must be a subnet group in a new virtual
     * private cloud (VPC).
     */
    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /**
     * @param preferredMaintenanceWindow Specifies the weekly time range during which system
     * maintenance can occur, in Universal Coordinated Time (UTC).
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this DB instance.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this DB instance.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.neptune.CfnDBInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.neptune.CfnDBInstanceProps,
  ) : CdkObject(cdkObject), CfnDBInstanceProps {
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
     */
    override fun allowMajorVersionUpgrade(): Any? = unwrap(this).getAllowMajorVersionUpgrade()

    /**
     * Indicates that minor version patches are applied automatically.
     *
     * When updating this property, some interruptions may occur.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-autominorversionupgrade)
     */
    override fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

    /**
     * Specifies the name of the Availability Zone the DB instance is located in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the
     * DB instance is a member of.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbclusteridentifier)
     */
    override fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

    /**
     * Contains the name of the compute and memory capacity class of the DB instance.
     *
     * If you update this property, some interruptions may occur.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceclass)
     */
    override fun dbInstanceClass(): String = unwrap(this).getDbInstanceClass()

    /**
     * Contains a user-supplied database identifier.
     *
     * This identifier is the unique key that identifies a DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceidentifier)
     */
    override fun dbInstanceIdentifier(): String? = unwrap(this).getDbInstanceIdentifier()

    /**
     * The name of an existing DB parameter group or a reference to an
     * AWS::Neptune::DBParameterGroup resource created in the template.
     *
     * If any of the data members of the referenced parameter group are changed during an update,
     * the DB instance might need to be restarted, which causes some interruption. If the parameter
     * group contains static parameters, whether they were changed or not, an update triggers a reboot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbparametergroupname)
     */
    override fun dbParameterGroupName(): String? = unwrap(this).getDbParameterGroupName()

    /**
     * This parameter is not supported.
     *
     * `AWS::Neptune::DBInstance` does not support restoring from snapshots.
     *
     * `AWS::Neptune::DBCluster` does support restoring from snapshots.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsnapshotidentifier)
     */
    override fun dbSnapshotIdentifier(): String? = unwrap(this).getDbSnapshotIdentifier()

    /**
     * A DB subnet group to associate with the DB instance.
     *
     * If you update this value, the new subnet group must be a subnet group in a new virtual
     * private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsubnetgroupname)
     */
    override fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

    /**
     * Specifies the weekly time range during which system maintenance can occur, in Universal
     * Coordinated Time (UTC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-preferredmaintenancewindow)
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * An arbitrary set of tags (key-value pairs) for this DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnDBInstanceProps):
        CfnDBInstanceProps = CdkObjectWrappers.wrap(cdkObject) as CfnDBInstanceProps

    internal fun unwrap(wrapped: CfnDBInstanceProps):
        software.amazon.awscdk.services.neptune.CfnDBInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.neptune.CfnDBInstanceProps
  }
}
