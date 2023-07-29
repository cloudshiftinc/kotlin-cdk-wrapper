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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate

/**
 * Specifies the configuration and content of the header or title text of the in-app message.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * HeaderConfigProperty headerConfigProperty = HeaderConfigProperty.builder()
 * .alignment("alignment")
 * .header("header")
 * .textColor("textColor")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-headerconfig.html)
 */
@CdkDslMarker
public class CfnInAppTemplateHeaderConfigPropertyDsl {
    private val cdkBuilder: CfnInAppTemplate.HeaderConfigProperty.Builder =
        CfnInAppTemplate.HeaderConfigProperty.builder()

    /**
     * @param alignment The text alignment of the title of the message. Acceptable values: `LEFT` ,
     *   `CENTER` , `RIGHT` .
     */
    public fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
    }

    /** @param header The title text of the in-app message. */
    public fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
    }

    /**
     * @param textColor The color of the title text, expressed as a hex color code (such as #000000
     *   for black).
     */
    public fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
    }

    public fun build(): CfnInAppTemplate.HeaderConfigProperty = cdkBuilder.build()
}
