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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Indicates whether you want to enable or disable the JMX Exporter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * JmxExporterProperty jmxExporterProperty = JmxExporterProperty.builder()
 * .enabledInBroker(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-jmxexporter.html)
 */
@CdkDslMarker
public class CfnClusterJmxExporterPropertyDsl {
    private val cdkBuilder: CfnCluster.JmxExporterProperty.Builder =
        CfnCluster.JmxExporterProperty.builder()

    /** @param enabledInBroker Indicates whether you want to enable or disable the JMX Exporter. */
    public fun enabledInBroker(enabledInBroker: Boolean) {
        cdkBuilder.enabledInBroker(enabledInBroker)
    }

    /** @param enabledInBroker Indicates whether you want to enable or disable the JMX Exporter. */
    public fun enabledInBroker(enabledInBroker: IResolvable) {
        cdkBuilder.enabledInBroker(enabledInBroker)
    }

    public fun build(): CfnCluster.JmxExporterProperty = cdkBuilder.build()
}
