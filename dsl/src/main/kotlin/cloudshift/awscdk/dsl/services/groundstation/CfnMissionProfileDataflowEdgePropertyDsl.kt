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
import software.amazon.awscdk.services.groundstation.CfnMissionProfile

/**
 * A dataflow edge defines from where and to where data will flow during a contact.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * DataflowEdgeProperty dataflowEdgeProperty = DataflowEdgeProperty.builder()
 * .destination("destination")
 * .source("source")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-missionprofile-dataflowedge.html)
 */
@CdkDslMarker
public class CfnMissionProfileDataflowEdgePropertyDsl {
    private val cdkBuilder: CfnMissionProfile.DataflowEdgeProperty.Builder =
        CfnMissionProfile.DataflowEdgeProperty.builder()

    /**
     * @param destination The ARN of the destination for this dataflow edge. For example, specify
     *   the ARN of a dataflow endpoint config for a downlink edge or an antenna uplink config for
     *   an uplink edge.
     */
    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    /**
     * @param source The ARN of the source for this dataflow edge. For example, specify the ARN of
     *   an antenna downlink config for a downlink edge or a dataflow endpoint config for an uplink
     *   edge.
     */
    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    public fun build(): CfnMissionProfile.DataflowEdgeProperty = cdkBuilder.build()
}
