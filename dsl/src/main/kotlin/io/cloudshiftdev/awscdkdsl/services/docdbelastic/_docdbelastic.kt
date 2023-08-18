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

package io.cloudshiftdev.awscdkdsl.services.docdbelastic

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdbelastic.CfnCluster
import software.amazon.awscdk.services.docdbelastic.CfnClusterProps
import software.constructs.Construct

public object docdbelastic {
    /**
     * Creates a new Amazon DocumentDB elastic cluster and returns its cluster structure.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.docdbelastic.*;
     * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
     * .adminUserName("adminUserName")
     * .authType("authType")
     * .clusterName("clusterName")
     * .shardCapacity(123)
     * .shardCount(123)
     * // the properties below are optional
     * .adminUserPassword("adminUserPassword")
     * .kmsKeyId("kmsKeyId")
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .subnetIds(List.of("subnetIds"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html)
     */
    public inline fun cfnCluster(
        scope: Construct,
        id: String,
        block: CfnClusterDsl.() -> Unit = {},
    ): CfnCluster {
        val builder = CfnClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCluster`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.docdbelastic.*;
     * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
     * .adminUserName("adminUserName")
     * .authType("authType")
     * .clusterName("clusterName")
     * .shardCapacity(123)
     * .shardCount(123)
     * // the properties below are optional
     * .adminUserPassword("adminUserPassword")
     * .kmsKeyId("kmsKeyId")
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .subnetIds(List.of("subnetIds"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html)
     */
    public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
        val builder = CfnClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
