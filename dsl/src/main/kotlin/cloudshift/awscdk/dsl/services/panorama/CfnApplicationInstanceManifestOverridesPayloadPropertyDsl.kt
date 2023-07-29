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

package cloudshift.awscdk.dsl.services.panorama

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.panorama.CfnApplicationInstance

/**
 * Parameter overrides for an application instance.
 *
 * This is a JSON document that has a single key ( `PayloadData` ) where the value is an escaped
 * string representation of the overrides document.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.panorama.*;
 * ManifestOverridesPayloadProperty manifestOverridesPayloadProperty =
 * ManifestOverridesPayloadProperty.builder()
 * .payloadData("payloadData")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-applicationinstance-manifestoverridespayload.html)
 */
@CdkDslMarker
public class CfnApplicationInstanceManifestOverridesPayloadPropertyDsl {
    private val cdkBuilder: CfnApplicationInstance.ManifestOverridesPayloadProperty.Builder =
        CfnApplicationInstance.ManifestOverridesPayloadProperty.builder()

    /** @param payloadData The overrides document. */
    public fun payloadData(payloadData: String) {
        cdkBuilder.payloadData(payloadData)
    }

    public fun build(): CfnApplicationInstance.ManifestOverridesPayloadProperty = cdkBuilder.build()
}
