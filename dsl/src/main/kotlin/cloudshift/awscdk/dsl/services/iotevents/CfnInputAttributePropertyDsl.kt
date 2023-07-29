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

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnInput

/**
 * The attributes from the JSON payload that are made available by the input.
 *
 * Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage` . Each
 * such message contains a JSON payload. Those attributes (and their paired values) specified here
 * are available for use in the `condition` expressions used by detectors.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * AttributeProperty attributeProperty = AttributeProperty.builder()
 * .jsonPath("jsonPath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-input-attribute.html)
 */
@CdkDslMarker
public class CfnInputAttributePropertyDsl {
    private val cdkBuilder: CfnInput.AttributeProperty.Builder =
        CfnInput.AttributeProperty.builder()

    /**
     * @param jsonPath An expression that specifies an attribute-value pair in a JSON structure. Use
     *   this to specify an attribute from the JSON payload that is made available by the input.
     *   Inputs are derived from messages sent to AWS IoT Events ( `BatchPutMessage` ). Each such
     *   message contains a JSON payload. The attribute (and its paired value) specified here are
     *   available for use in the `condition` expressions used by detectors.
     *
     * Syntax: `&lt;field-name&gt;.&lt;field-name&gt;...`
     */
    public fun jsonPath(jsonPath: String) {
        cdkBuilder.jsonPath(jsonPath)
    }

    public fun build(): CfnInput.AttributeProperty = cdkBuilder.build()
}
