@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnDBProxyTargetGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDBProxyTargetGroup.Builder =
      CfnDBProxyTargetGroup.Builder.create(scope, id)

  private val _dbClusterIdentifiers: MutableList<String> = mutableListOf()

  private val _dbInstanceIdentifiers: MutableList<String> = mutableListOf()

  public fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: IResolvable) {
    cdkBuilder.connectionPoolConfigurationInfo(connectionPoolConfigurationInfo)
  }

  public
      fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty) {
    cdkBuilder.connectionPoolConfigurationInfo(connectionPoolConfigurationInfo)
  }

  public fun dbClusterIdentifiers(vararg dbClusterIdentifiers: String) {
    _dbClusterIdentifiers.addAll(listOf(*dbClusterIdentifiers))
  }

  public fun dbClusterIdentifiers(dbClusterIdentifiers: Collection<String>) {
    _dbClusterIdentifiers.addAll(dbClusterIdentifiers)
  }

  public fun dbInstanceIdentifiers(vararg dbInstanceIdentifiers: String) {
    _dbInstanceIdentifiers.addAll(listOf(*dbInstanceIdentifiers))
  }

  public fun dbInstanceIdentifiers(dbInstanceIdentifiers: Collection<String>) {
    _dbInstanceIdentifiers.addAll(dbInstanceIdentifiers)
  }

  public fun dbProxyName(dbProxyName: String) {
    cdkBuilder.dbProxyName(dbProxyName)
  }

  public fun targetGroupName(targetGroupName: String) {
    cdkBuilder.targetGroupName(targetGroupName)
  }

  public fun build(): CfnDBProxyTargetGroup {
    if(_dbClusterIdentifiers.isNotEmpty()) cdkBuilder.dbClusterIdentifiers(_dbClusterIdentifiers)
    if(_dbInstanceIdentifiers.isNotEmpty()) cdkBuilder.dbInstanceIdentifiers(_dbInstanceIdentifiers)
    return cdkBuilder.build()
  }
}
