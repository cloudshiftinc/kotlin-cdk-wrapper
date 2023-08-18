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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * The HTTP action header.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * HttpActionHeaderProperty httpActionHeaderProperty = HttpActionHeaderProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpactionheader.html)
 */
@CdkDslMarker
public class CfnTopicRuleHttpActionHeaderPropertyDsl {
    private val cdkBuilder: CfnTopicRule.HttpActionHeaderProperty.Builder =
        CfnTopicRule.HttpActionHeaderProperty.builder()

    /** @param key The HTTP header key. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The HTTP header value. Substitution templates are supported. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTopicRule.HttpActionHeaderProperty = cdkBuilder.build()
}
