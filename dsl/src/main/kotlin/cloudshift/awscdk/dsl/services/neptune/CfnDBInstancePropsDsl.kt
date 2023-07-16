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
import software.amazon.awscdk.services.neptune.CfnDBInstanceProps

@CdkDslMarker
public class CfnDBInstancePropsDsl {
  private val cdkBuilder: CfnDBInstanceProps.Builder = CfnDBInstanceProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
    cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
  }

  public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable) {
    cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
  }

  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  public fun dbClusterIdentifier(dbClusterIdentifier: String) {
    cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
  }

  public fun dbInstanceClass(dbInstanceClass: String) {
    cdkBuilder.dbInstanceClass(dbInstanceClass)
  }

  public fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
    cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
  }

  public fun dbParameterGroupName(dbParameterGroupName: String) {
    cdkBuilder.dbParameterGroupName(dbParameterGroupName)
  }

  public fun dbSnapshotIdentifier(dbSnapshotIdentifier: String) {
    cdkBuilder.dbSnapshotIdentifier(dbSnapshotIdentifier)
  }

  public fun dbSubnetGroupName(dbSubnetGroupName: String) {
    cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
  }

  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDBInstanceProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
