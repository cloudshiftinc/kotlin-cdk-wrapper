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

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediatailor.CfnSourceLocation

/**
 * The optional configuration for a server that serves segments.
 *
 * Use this if you want the segment delivery server to be different from the source location server.
 * For example, you can configure your source location server to be an origination server, such as
 * MediaPackage, and the segment delivery server to be a content delivery network (CDN), such as
 * CloudFront. If you don't specify a segment delivery server, then the source location server is
 * used.</p>
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * DefaultSegmentDeliveryConfigurationProperty defaultSegmentDeliveryConfigurationProperty =
 * DefaultSegmentDeliveryConfigurationProperty.builder()
 * .baseUrl("baseUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration.html)
 */
@CdkDslMarker
public class CfnSourceLocationDefaultSegmentDeliveryConfigurationPropertyDsl {
    private val cdkBuilder: CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty.Builder =
        CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty.builder()

    /**
     * @param baseUrl The hostname of the server that will be used to serve segments. This string
     *   must include the protocol, such as <b>https://</b>.</p>
     */
    public fun baseUrl(baseUrl: String) {
        cdkBuilder.baseUrl(baseUrl)
    }

    public fun build(): CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty =
        cdkBuilder.build()
}
