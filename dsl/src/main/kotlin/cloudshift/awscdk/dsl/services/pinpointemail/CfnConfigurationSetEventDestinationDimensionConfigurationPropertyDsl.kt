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

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination

/**
 * An array of objects that define the dimensions to use when you send email events to Amazon
 * CloudWatch.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpointemail.*;
 * DimensionConfigurationProperty dimensionConfigurationProperty =
 * DimensionConfigurationProperty.builder()
 * .defaultDimensionValue("defaultDimensionValue")
 * .dimensionName("dimensionName")
 * .dimensionValueSource("dimensionValueSource")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-dimensionconfiguration.html)
 */
@CdkDslMarker
public class CfnConfigurationSetEventDestinationDimensionConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnConfigurationSetEventDestination.DimensionConfigurationProperty.Builder =
        CfnConfigurationSetEventDestination.DimensionConfigurationProperty.builder()

    /**
     * @param defaultDimensionValue The default value of the dimension that is published to Amazon
     *   CloudWatch if you don't provide the value of the dimension when you send an email. This
     *   value has to meet the following criteria:
     * * It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes
     *   (-).
     * * It can contain no more than 256 characters.
     */
    public fun defaultDimensionValue(defaultDimensionValue: String) {
        cdkBuilder.defaultDimensionValue(defaultDimensionValue)
    }

    /**
     * @param dimensionName The name of an Amazon CloudWatch dimension associated with an email
     *   sending metric. The name has to meet the following criteria:
     * * It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes
     *   (-).
     * * It can contain no more than 256 characters.
     */
    public fun dimensionName(dimensionName: String) {
        cdkBuilder.dimensionName(dimensionName)
    }

    /**
     * @param dimensionValueSource The location where Amazon Pinpoint finds the value of a dimension
     *   to publish to Amazon CloudWatch. Acceptable values: `MESSAGE_TAG` , `EMAIL_HEADER` , and
     *   `LINK_TAG` .
     *
     * If you want Amazon Pinpoint to use the message tags that you specify using an
     * `X-SES-MESSAGE-TAGS` header or a parameter to the `SendEmail` API, choose `MESSAGE_TAG` . If
     * you want Amazon Pinpoint to use your own email headers, choose `EMAIL_HEADER` . If you want
     * Amazon Pinpoint to use tags that are specified in your links, choose `LINK_TAG` .
     */
    public fun dimensionValueSource(dimensionValueSource: String) {
        cdkBuilder.dimensionValueSource(dimensionValueSource)
    }

    public fun build(): CfnConfigurationSetEventDestination.DimensionConfigurationProperty =
        cdkBuilder.build()
}
