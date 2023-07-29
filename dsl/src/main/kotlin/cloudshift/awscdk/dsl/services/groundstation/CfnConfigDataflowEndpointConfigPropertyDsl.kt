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

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnConfig

/**
 * Provides information to AWS Ground Station about which IP endpoints to use during a contact.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * DataflowEndpointConfigProperty dataflowEndpointConfigProperty =
 * DataflowEndpointConfigProperty.builder()
 * .dataflowEndpointName("dataflowEndpointName")
 * .dataflowEndpointRegion("dataflowEndpointRegion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-dataflowendpointconfig.html)
 */
@CdkDslMarker
public class CfnConfigDataflowEndpointConfigPropertyDsl {
    private val cdkBuilder: CfnConfig.DataflowEndpointConfigProperty.Builder =
        CfnConfig.DataflowEndpointConfigProperty.builder()

    /** @param dataflowEndpointName The name of the dataflow endpoint to use during contacts. */
    public fun dataflowEndpointName(dataflowEndpointName: String) {
        cdkBuilder.dataflowEndpointName(dataflowEndpointName)
    }

    /**
     * @param dataflowEndpointRegion The region of the dataflow endpoint to use during contacts.
     *   When omitted, Ground Station will use the region of the contact.
     */
    public fun dataflowEndpointRegion(dataflowEndpointRegion: String) {
        cdkBuilder.dataflowEndpointRegion(dataflowEndpointRegion)
    }

    public fun build(): CfnConfig.DataflowEndpointConfigProperty = cdkBuilder.build()
}
