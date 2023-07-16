@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup

@CdkDslMarker
public class CfnDBProxyTargetGroupConnectionPoolConfigurationInfoFormatPropertyDsl {
  private val cdkBuilder:
      CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty.Builder =
      CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty.builder()

  private val _sessionPinningFilters: MutableList<String> = mutableListOf()

  public fun connectionBorrowTimeout(connectionBorrowTimeout: Number) {
    cdkBuilder.connectionBorrowTimeout(connectionBorrowTimeout)
  }

  public fun initQuery(initQuery: String) {
    cdkBuilder.initQuery(initQuery)
  }

  public fun maxConnectionsPercent(maxConnectionsPercent: Number) {
    cdkBuilder.maxConnectionsPercent(maxConnectionsPercent)
  }

  public fun maxIdleConnectionsPercent(maxIdleConnectionsPercent: Number) {
    cdkBuilder.maxIdleConnectionsPercent(maxIdleConnectionsPercent)
  }

  public fun sessionPinningFilters(vararg sessionPinningFilters: String) {
    _sessionPinningFilters.addAll(listOf(*sessionPinningFilters))
  }

  public fun sessionPinningFilters(sessionPinningFilters: Collection<String>) {
    _sessionPinningFilters.addAll(sessionPinningFilters)
  }

  public fun build(): CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty {
    if(_sessionPinningFilters.isNotEmpty()) cdkBuilder.sessionPinningFilters(_sessionPinningFilters)
    return cdkBuilder.build()
  }
}
