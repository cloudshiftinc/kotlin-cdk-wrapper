@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps

/**
 * Properties for defining a `CfnDBProxyTargetGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * CfnDBProxyTargetGroupProps cfnDBProxyTargetGroupProps = CfnDBProxyTargetGroupProps.builder()
 * .dbProxyName("dbProxyName")
 * .targetGroupName("targetGroupName")
 * // the properties below are optional
 * .connectionPoolConfigurationInfo(ConnectionPoolConfigurationInfoFormatProperty.builder()
 * .connectionBorrowTimeout(123)
 * .initQuery("initQuery")
 * .maxConnectionsPercent(123)
 * .maxIdleConnectionsPercent(123)
 * .sessionPinningFilters(List.of("sessionPinningFilters"))
 * .build())
 * .dbClusterIdentifiers(List.of("dbClusterIdentifiers"))
 * .dbInstanceIdentifiers(List.of("dbInstanceIdentifiers"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html)
 */
@CdkDslMarker
public class CfnDBProxyTargetGroupPropsDsl {
  private val cdkBuilder: CfnDBProxyTargetGroupProps.Builder = CfnDBProxyTargetGroupProps.builder()

  private val _dbClusterIdentifiers: MutableList<String> = mutableListOf()

  private val _dbInstanceIdentifiers: MutableList<String> = mutableListOf()

  /**
   * @param connectionPoolConfigurationInfo Settings that control the size and behavior of the
   * connection pool associated with a `DBProxyTargetGroup` .
   */
  public fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: IResolvable) {
    cdkBuilder.connectionPoolConfigurationInfo(connectionPoolConfigurationInfo)
  }

  /**
   * @param connectionPoolConfigurationInfo Settings that control the size and behavior of the
   * connection pool associated with a `DBProxyTargetGroup` .
   */
  public
      fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty) {
    cdkBuilder.connectionPoolConfigurationInfo(connectionPoolConfigurationInfo)
  }

  /**
   * @param dbClusterIdentifiers One or more DB cluster identifiers.
   */
  public fun dbClusterIdentifiers(vararg dbClusterIdentifiers: String) {
    _dbClusterIdentifiers.addAll(listOf(*dbClusterIdentifiers))
  }

  /**
   * @param dbClusterIdentifiers One or more DB cluster identifiers.
   */
  public fun dbClusterIdentifiers(dbClusterIdentifiers: Collection<String>) {
    _dbClusterIdentifiers.addAll(dbClusterIdentifiers)
  }

  /**
   * @param dbInstanceIdentifiers One or more DB instance identifiers.
   */
  public fun dbInstanceIdentifiers(vararg dbInstanceIdentifiers: String) {
    _dbInstanceIdentifiers.addAll(listOf(*dbInstanceIdentifiers))
  }

  /**
   * @param dbInstanceIdentifiers One or more DB instance identifiers.
   */
  public fun dbInstanceIdentifiers(dbInstanceIdentifiers: Collection<String>) {
    _dbInstanceIdentifiers.addAll(dbInstanceIdentifiers)
  }

  /**
   * @param dbProxyName The identifier of the `DBProxy` that is associated with the
   * `DBProxyTargetGroup` . 
   */
  public fun dbProxyName(dbProxyName: String) {
    cdkBuilder.dbProxyName(dbProxyName)
  }

  /**
   * @param targetGroupName The identifier for the target group. 
   *
   * Currently, this property must be set to `default` .
   */
  public fun targetGroupName(targetGroupName: String) {
    cdkBuilder.targetGroupName(targetGroupName)
  }

  public fun build(): CfnDBProxyTargetGroupProps {
    if(_dbClusterIdentifiers.isNotEmpty()) cdkBuilder.dbClusterIdentifiers(_dbClusterIdentifiers)
    if(_dbInstanceIdentifiers.isNotEmpty()) cdkBuilder.dbInstanceIdentifiers(_dbInstanceIdentifiers)
    return cdkBuilder.build()
  }
}
