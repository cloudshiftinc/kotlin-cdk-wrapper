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

package io.cloudshiftdev.awscdkdsl.services.msk

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Indicates whether you want to enable or disable the Node Exporter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * NodeExporterProperty nodeExporterProperty = NodeExporterProperty.builder()
 * .enabledInBroker(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-nodeexporter.html)
 */
@CdkDslMarker
public class CfnClusterNodeExporterPropertyDsl {
    private val cdkBuilder: CfnCluster.NodeExporterProperty.Builder =
        CfnCluster.NodeExporterProperty.builder()

    /** @param enabledInBroker Indicates whether you want to enable or disable the Node Exporter. */
    public fun enabledInBroker(enabledInBroker: Boolean) {
        cdkBuilder.enabledInBroker(enabledInBroker)
    }

    /** @param enabledInBroker Indicates whether you want to enable or disable the Node Exporter. */
    public fun enabledInBroker(enabledInBroker: IResolvable) {
        cdkBuilder.enabledInBroker(enabledInBroker)
    }

    public fun build(): CfnCluster.NodeExporterProperty = cdkBuilder.build()
}
