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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup
import software.constructs.Construct

/**
 * The `AWS::RDS::DBProxyTargetGroup` resource represents a set of RDS DB instances, Aurora DB
 * clusters, or both that a proxy can connect to.
 *
 * Currently, each target group is associated with exactly one RDS DB instance or Aurora DB cluster.
 *
 * This data type is used as a response element in the `DescribeDBProxyTargetGroups` action.
 *
 * For information about RDS Proxy for Amazon RDS, see
 * [Managing Connections with Amazon RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy.html)
 * in the *Amazon RDS User Guide* .
 *
 * For information about RDS Proxy for Amazon Aurora, see
 * [Managing Connections with Amazon RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-proxy.html)
 * in the *Amazon Aurora User Guide* .
 *
 * For a sample template that creates a DB proxy and registers a DB instance, see
 * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#aws-resource-rds-dbproxy--examples)
 * in AWS::RDS::DBProxy.
 *
 * Limitations apply to RDS Proxy, including DB engine version limitations and AWS Region
 * limitations.
 *
 * For information about limitations that apply to RDS Proxy for Amazon RDS, see
 * [Limitations for RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy.html#rds-proxy.limitations)
 * in the *Amazon RDS User Guide* .
 *
 * For information about that apply to RDS Proxy for Amazon Aurora, see
 * [Limitations for RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-proxy.html#rds-proxy.limitations)
 * in the *Amazon Aurora User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * CfnDBProxyTargetGroup cfnDBProxyTargetGroup = CfnDBProxyTargetGroup.Builder.create(this,
 * "MyCfnDBProxyTargetGroup")
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
public class CfnDBProxyTargetGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDBProxyTargetGroup.Builder =
        CfnDBProxyTargetGroup.Builder.create(scope, id)

    private val _dbClusterIdentifiers: MutableList<String> = mutableListOf()

    private val _dbInstanceIdentifiers: MutableList<String> = mutableListOf()

    /**
     * Settings that control the size and behavior of the connection pool associated with a
     * `DBProxyTargetGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfo)
     *
     * @param connectionPoolConfigurationInfo Settings that control the size and behavior of the
     *   connection pool associated with a `DBProxyTargetGroup` .
     */
    public fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: IResolvable) {
        cdkBuilder.connectionPoolConfigurationInfo(connectionPoolConfigurationInfo)
    }

    /**
     * Settings that control the size and behavior of the connection pool associated with a
     * `DBProxyTargetGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfo)
     *
     * @param connectionPoolConfigurationInfo Settings that control the size and behavior of the
     *   connection pool associated with a `DBProxyTargetGroup` .
     */
    public fun connectionPoolConfigurationInfo(
        connectionPoolConfigurationInfo:
            CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty
    ) {
        cdkBuilder.connectionPoolConfigurationInfo(connectionPoolConfigurationInfo)
    }

    /**
     * One or more DB cluster identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbclusteridentifiers)
     *
     * @param dbClusterIdentifiers One or more DB cluster identifiers.
     */
    public fun dbClusterIdentifiers(vararg dbClusterIdentifiers: String) {
        _dbClusterIdentifiers.addAll(listOf(*dbClusterIdentifiers))
    }

    /**
     * One or more DB cluster identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbclusteridentifiers)
     *
     * @param dbClusterIdentifiers One or more DB cluster identifiers.
     */
    public fun dbClusterIdentifiers(dbClusterIdentifiers: Collection<String>) {
        _dbClusterIdentifiers.addAll(dbClusterIdentifiers)
    }

    /**
     * One or more DB instance identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbinstanceidentifiers)
     *
     * @param dbInstanceIdentifiers One or more DB instance identifiers.
     */
    public fun dbInstanceIdentifiers(vararg dbInstanceIdentifiers: String) {
        _dbInstanceIdentifiers.addAll(listOf(*dbInstanceIdentifiers))
    }

    /**
     * One or more DB instance identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbinstanceidentifiers)
     *
     * @param dbInstanceIdentifiers One or more DB instance identifiers.
     */
    public fun dbInstanceIdentifiers(dbInstanceIdentifiers: Collection<String>) {
        _dbInstanceIdentifiers.addAll(dbInstanceIdentifiers)
    }

    /**
     * The identifier of the `DBProxy` that is associated with the `DBProxyTargetGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbproxyname)
     *
     * @param dbProxyName The identifier of the `DBProxy` that is associated with the
     *   `DBProxyTargetGroup` .
     */
    public fun dbProxyName(dbProxyName: String) {
        cdkBuilder.dbProxyName(dbProxyName)
    }

    /**
     * The identifier for the target group.
     *
     * Currently, this property must be set to `default` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-targetgroupname)
     *
     * @param targetGroupName The identifier for the target group.
     */
    public fun targetGroupName(targetGroupName: String) {
        cdkBuilder.targetGroupName(targetGroupName)
    }

    public fun build(): CfnDBProxyTargetGroup {
        if (_dbClusterIdentifiers.isNotEmpty())
            cdkBuilder.dbClusterIdentifiers(_dbClusterIdentifiers)
        if (_dbInstanceIdentifiers.isNotEmpty())
            cdkBuilder.dbInstanceIdentifiers(_dbInstanceIdentifiers)
        return cdkBuilder.build()
    }
}
