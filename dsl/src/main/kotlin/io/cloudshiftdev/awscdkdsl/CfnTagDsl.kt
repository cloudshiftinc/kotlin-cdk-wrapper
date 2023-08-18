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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnTag

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnTag cfnTag = CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnTagDsl {
    private val cdkBuilder: CfnTag.Builder = CfnTag.builder()

    /** @param key the value to be set. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value the value to be set. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTag = cdkBuilder.build()
}
