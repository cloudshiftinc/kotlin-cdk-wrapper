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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup

/**
 * Specifies the settings that control the size and behavior of the connection pool associated with
 * a `DBProxyTargetGroup` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * ConnectionPoolConfigurationInfoFormatProperty connectionPoolConfigurationInfoFormatProperty =
 * ConnectionPoolConfigurationInfoFormatProperty.builder()
 * .connectionBorrowTimeout(123)
 * .initQuery("initQuery")
 * .maxConnectionsPercent(123)
 * .maxIdleConnectionsPercent(123)
 * .sessionPinningFilters(List.of("sessionPinningFilters"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html)
 */
@CdkDslMarker
public class CfnDBProxyTargetGroupConnectionPoolConfigurationInfoFormatPropertyDsl {
    private val cdkBuilder:
        CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty.Builder =
        CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty.builder()

    private val _sessionPinningFilters: MutableList<String> = mutableListOf()

    /**
     * @param connectionBorrowTimeout The number of seconds for a proxy to wait for a connection to
     *   become available in the connection pool. Only applies when the proxy has opened its maximum
     *   number of connections and all connections are busy with client sessions.
     *
     * Default: 120
     *
     * Constraints: between 1 and 3600, or 0 representing unlimited
     */
    public fun connectionBorrowTimeout(connectionBorrowTimeout: Number) {
        cdkBuilder.connectionBorrowTimeout(connectionBorrowTimeout)
    }

    /**
     * @param initQuery One or more SQL statements for the proxy to run when opening each new
     *   database connection. Typically used with `SET` statements to make sure that each connection
     *   has identical settings such as time zone and character set. For multiple statements, use
     *   semicolons as the separator. You can also include multiple variables in a single `SET`
     *   statement, such as `SET x=1, y=2` .
     *
     * Default: no initialization query
     */
    public fun initQuery(initQuery: String) {
        cdkBuilder.initQuery(initQuery)
    }

    /**
     * @param maxConnectionsPercent The maximum size of the connection pool for each target in a
     *   target group. The value is expressed as a percentage of the `max_connections` setting for
     *   the RDS DB instance or Aurora DB cluster used by the target group.
     *
     * If you specify `MaxIdleConnectionsPercent` , then you must also include a value for this
     * parameter.
     *
     * Default: 10 for RDS for Microsoft SQL Server, and 100 for all other engines
     *
     * Constraints: Must be between 1 and 100.
     */
    public fun maxConnectionsPercent(maxConnectionsPercent: Number) {
        cdkBuilder.maxConnectionsPercent(maxConnectionsPercent)
    }

    /**
     * @param maxIdleConnectionsPercent Controls how actively the proxy closes idle database
     *   connections in the connection pool. The value is expressed as a percentage of the
     *   `max_connections` setting for the RDS DB instance or Aurora DB cluster used by the target
     *   group. With a high value, the proxy leaves a high percentage of idle database connections
     *   open. A low value causes the proxy to close more idle connections and return them to the
     *   database.
     *
     * If you specify this parameter, then you must also include a value for `MaxConnectionsPercent`
     * .
     *
     * Default: The default value is half of the value of `MaxConnectionsPercent` . For example, if
     * `MaxConnectionsPercent` is 80, then the default value of `MaxIdleConnectionsPercent` is 40.
     * If the value of `MaxConnectionsPercent` isn't specified, then for SQL Server,
     * `MaxIdleConnectionsPercent` is 5, and for all other engines, the default is 50.
     *
     * Constraints: Must be between 0 and the value of `MaxConnectionsPercent` .
     */
    public fun maxIdleConnectionsPercent(maxIdleConnectionsPercent: Number) {
        cdkBuilder.maxIdleConnectionsPercent(maxIdleConnectionsPercent)
    }

    /**
     * @param sessionPinningFilters Each item in the list represents a class of SQL operations that
     *   normally cause all later statements in a session using a proxy to be pinned to the same
     *   underlying database connection. Including an item in the list exempts that class of SQL
     *   operations from the pinning behavior.
     *
     * Default: no session pinning filters
     */
    public fun sessionPinningFilters(vararg sessionPinningFilters: String) {
        _sessionPinningFilters.addAll(listOf(*sessionPinningFilters))
    }

    /**
     * @param sessionPinningFilters Each item in the list represents a class of SQL operations that
     *   normally cause all later statements in a session using a proxy to be pinned to the same
     *   underlying database connection. Including an item in the list exempts that class of SQL
     *   operations from the pinning behavior.
     *
     * Default: no session pinning filters
     */
    public fun sessionPinningFilters(sessionPinningFilters: Collection<String>) {
        _sessionPinningFilters.addAll(sessionPinningFilters)
    }

    public fun build(): CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty {
        if (_sessionPinningFilters.isNotEmpty())
            cdkBuilder.sessionPinningFilters(_sessionPinningFilters)
        return cdkBuilder.build()
    }
}
