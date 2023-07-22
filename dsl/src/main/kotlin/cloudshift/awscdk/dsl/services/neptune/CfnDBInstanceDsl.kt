@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.neptune

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.neptune.CfnDBInstance
import software.constructs.Construct

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
   * Changing this parameter doesn't result in an outage and the change is asynchronously applied as
   * soon as possible. This parameter must be set to true when specifying a value for the EngineVersion
   * parameter that is a different major version than the DB instance's current version.
   *
   * When you change this parameter for an existing DB cluster, CloudFormation will replace your
   * existing DB cluster with a new, empty one that uses the engine version you specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-allowmajorversionupgrade)
   * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed. 
   */
  public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
    cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
  }

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
   * @param autoMinorVersionUpgrade Indicates that minor version patches are applied automatically. 
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
   * @param autoMinorVersionUpgrade Indicates that minor version patches are applied automatically. 
   */
  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  /**
   * Specifies the name of the Availability Zone the DB instance is located in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-availabilityzone)
   * @param availabilityZone Specifies the name of the Availability Zone the DB instance is located
   * in. 
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB
   * instance is a member of.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbclusteridentifier)
   * @param dbClusterIdentifier If the DB instance is a member of a DB cluster, contains the name of
   * the DB cluster that the DB instance is a member of. 
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
   * @param dbInstanceClass Contains the name of the compute and memory capacity class of the DB
   * instance. 
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
   * @param dbInstanceIdentifier Contains a user-supplied database identifier. 
   */
  public fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
    cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
  }

  /**
   * The name of an existing DB parameter group or a reference to an AWS::Neptune::DBParameterGroup
   * resource created in the template.
   *
   * If any of the data members of the referenced parameter group are changed during an update, the
   * DB instance might need to be restarted, which causes some interruption. If the parameter group
   * contains static parameters, whether they were changed or not, an update triggers a reboot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbparametergroupname)
   * @param dbParameterGroupName The name of an existing DB parameter group or a reference to an
   * AWS::Neptune::DBParameterGroup resource created in the template. 
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
   * @param dbSnapshotIdentifier This parameter is not supported. 
   */
  public fun dbSnapshotIdentifier(dbSnapshotIdentifier: String) {
    cdkBuilder.dbSnapshotIdentifier(dbSnapshotIdentifier)
  }

  /**
   * A DB subnet group to associate with the DB instance.
   *
   * If you update this value, the new subnet group must be a subnet group in a new virtual private
   * cloud (VPC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsubnetgroupname)
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
   * @param preferredMaintenanceWindow Specifies the weekly time range during which system
   * maintenance can occur, in Universal Coordinated Time (UTC). 
   */
  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  /**
   * An arbitrary set of tags (key-value pairs) for this DB instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-tags)
   * @param tags An arbitrary set of tags (key-value pairs) for this DB instance. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An arbitrary set of tags (key-value pairs) for this DB instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-tags)
   * @param tags An arbitrary set of tags (key-value pairs) for this DB instance. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDBInstance {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
