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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnCluster

/**
 * The execute command configuration for the cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * ClusterConfigurationProperty clusterConfigurationProperty =
 * ClusterConfigurationProperty.builder()
 * .executeCommandConfiguration(ExecuteCommandConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .logConfiguration(ExecuteCommandLogConfigurationProperty.builder()
 * .cloudWatchEncryptionEnabled(false)
 * .cloudWatchLogGroupName("cloudWatchLogGroupName")
 * .s3BucketName("s3BucketName")
 * .s3EncryptionEnabled(false)
 * .s3KeyPrefix("s3KeyPrefix")
 * .build())
 * .logging("logging")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-clusterconfiguration.html)
 */
@CdkDslMarker
public class CfnClusterClusterConfigurationPropertyDsl {
    private val cdkBuilder: CfnCluster.ClusterConfigurationProperty.Builder =
        CfnCluster.ClusterConfigurationProperty.builder()

    /** @param executeCommandConfiguration The details of the execute command configuration. */
    public fun executeCommandConfiguration(executeCommandConfiguration: IResolvable) {
        cdkBuilder.executeCommandConfiguration(executeCommandConfiguration)
    }

    /** @param executeCommandConfiguration The details of the execute command configuration. */
    public fun executeCommandConfiguration(
        executeCommandConfiguration: CfnCluster.ExecuteCommandConfigurationProperty
    ) {
        cdkBuilder.executeCommandConfiguration(executeCommandConfiguration)
    }

    public fun build(): CfnCluster.ClusterConfigurationProperty = cdkBuilder.build()
}
