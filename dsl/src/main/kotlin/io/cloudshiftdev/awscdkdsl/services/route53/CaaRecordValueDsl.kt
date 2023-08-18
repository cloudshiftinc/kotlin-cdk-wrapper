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

package io.cloudshiftdev.awscdkdsl.services.route53

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.route53.CaaRecordValue
import software.amazon.awscdk.services.route53.CaaTag

/**
 * Properties for a CAA record value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * CaaRecordValue caaRecordValue = CaaRecordValue.builder()
 * .flag(123)
 * .tag(CaaTag.ISSUE)
 * .value("value")
 * .build();
 * ```
 */
@CdkDslMarker
public class CaaRecordValueDsl {
    private val cdkBuilder: CaaRecordValue.Builder = CaaRecordValue.builder()

    /** @param flag The flag. */
    public fun flag(flag: Number) {
        cdkBuilder.flag(flag)
    }

    /** @param tag The tag. */
    public fun tag(tag: CaaTag) {
        cdkBuilder.tag(tag)
    }

    /** @param value The value associated with the tag. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CaaRecordValue = cdkBuilder.build()
}
