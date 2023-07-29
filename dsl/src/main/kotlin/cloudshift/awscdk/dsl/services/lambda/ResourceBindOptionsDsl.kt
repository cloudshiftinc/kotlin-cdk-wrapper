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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.ResourceBindOptions

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * ResourceBindOptions resourceBindOptions = ResourceBindOptions.builder()
 * .resourceProperty("resourceProperty")
 * .build();
 * ```
 */
@CdkDslMarker
public class ResourceBindOptionsDsl {
    private val cdkBuilder: ResourceBindOptions.Builder = ResourceBindOptions.builder()

    /**
     * @param resourceProperty The name of the CloudFormation property to annotate with asset
     *   metadata.
     */
    public fun resourceProperty(resourceProperty: String) {
        cdkBuilder.resourceProperty(resourceProperty)
    }

    public fun build(): ResourceBindOptions = cdkBuilder.build()
}
