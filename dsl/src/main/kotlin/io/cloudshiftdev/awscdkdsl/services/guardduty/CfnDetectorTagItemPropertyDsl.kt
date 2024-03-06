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

package io.cloudshiftdev.awscdkdsl.services.guardduty

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.guardduty.CfnDetector

/**
 * Describes a tag.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * TagItemProperty tagItemProperty = TagItemProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-tagitem.html)
 */
@CdkDslMarker
public class CfnDetectorTagItemPropertyDsl {
    private val cdkBuilder: CfnDetector.TagItemProperty.Builder =
        CfnDetector.TagItemProperty.builder()

    /** @param key The tag value. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The tag key. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDetector.TagItemProperty = cdkBuilder.build()
}
