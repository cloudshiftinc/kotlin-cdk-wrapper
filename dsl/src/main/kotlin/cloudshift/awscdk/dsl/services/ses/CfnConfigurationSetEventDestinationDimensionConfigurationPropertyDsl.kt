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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination

/**
 * Contains the dimension configuration to use when you publish email sending events to Amazon
 * CloudWatch.
 *
 * For information about publishing email sending events to Amazon CloudWatch, see the
 * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * DimensionConfigurationProperty dimensionConfigurationProperty =
 * DimensionConfigurationProperty.builder()
 * .defaultDimensionValue("defaultDimensionValue")
 * .dimensionName("dimensionName")
 * .dimensionValueSource("dimensionValueSource")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html)
 */
@CdkDslMarker
public class CfnConfigurationSetEventDestinationDimensionConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnConfigurationSetEventDestination.DimensionConfigurationProperty.Builder =
        CfnConfigurationSetEventDestination.DimensionConfigurationProperty.builder()

    /**
     * @param defaultDimensionValue The default value of the dimension that is published to Amazon
     *   CloudWatch if you do not provide the value of the dimension when you send an email. The
     *   default value must meet the following requirements:
     * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), dashes (-), at signs
     *   (&#64;), or periods (.).
     * * Contain 256 characters or fewer.
     */
    public fun defaultDimensionValue(defaultDimensionValue: String) {
        cdkBuilder.defaultDimensionValue(defaultDimensionValue)
    }

    /**
     * @param dimensionName The name of an Amazon CloudWatch dimension associated with an email
     *   sending metric. The name must meet the following requirements:
     * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), dashes (-), or
     *   colons (:).
     * * Contain 256 characters or fewer.
     */
    public fun dimensionName(dimensionName: String) {
        cdkBuilder.dimensionName(dimensionName)
    }

    /**
     * @param dimensionValueSource The place where Amazon SES finds the value of a dimension to
     *   publish to Amazon CloudWatch. To use the message tags that you specify using an
     *   `X-SES-MESSAGE-TAGS` header or a parameter to the `SendEmail` / `SendRawEmail` API, specify
     *   `messageTag` . To use your own email headers, specify `emailHeader` . To put a custom tag
     *   on any link included in your email, specify `linkTag` .
     */
    public fun dimensionValueSource(dimensionValueSource: String) {
        cdkBuilder.dimensionValueSource(dimensionValueSource)
    }

    public fun build(): CfnConfigurationSetEventDestination.DimensionConfigurationProperty =
        cdkBuilder.build()
}
