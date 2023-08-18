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

package io.cloudshiftdev.awscdkdsl.services.mediatailor

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediatailor.CfnSourceLocation

/**
 * The segment delivery configuration settings.</p>.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * SegmentDeliveryConfigurationProperty segmentDeliveryConfigurationProperty =
 * SegmentDeliveryConfigurationProperty.builder()
 * .baseUrl("baseUrl")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-segmentdeliveryconfiguration.html)
 */
@CdkDslMarker
public class CfnSourceLocationSegmentDeliveryConfigurationPropertyDsl {
    private val cdkBuilder: CfnSourceLocation.SegmentDeliveryConfigurationProperty.Builder =
        CfnSourceLocation.SegmentDeliveryConfigurationProperty.builder()

    /**
     * @param baseUrl The base URL of the host or path of the segment delivery server that you're
     *   using to serve segments. This is typically a content delivery network (CDN). The URL can be
     *   absolute or relative. To use an absolute URL include the protocol, such as
     *   `https://example.com/some/path`. To use a relative URL specify the relative path, such as
     *   `/some/path*`.</p>
     */
    public fun baseUrl(baseUrl: String) {
        cdkBuilder.baseUrl(baseUrl)
    }

    /**
     * @param name A unique identifier used to distinguish between multiple segment delivery
     *   configurations in a source location.</p>.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnSourceLocation.SegmentDeliveryConfigurationProperty = cdkBuilder.build()
}
