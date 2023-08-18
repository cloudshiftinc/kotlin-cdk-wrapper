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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.GetContextValueResult

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * Object value;
 * GetContextValueResult getContextValueResult = GetContextValueResult.builder()
 * .value(value)
 * .build();
 * ```
 */
@CdkDslMarker
public class GetContextValueResultDsl {
    private val cdkBuilder: GetContextValueResult.Builder = GetContextValueResult.builder()

    /** @param value the value to be set. */
    public fun `value`(`value`: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(`value`)
        cdkBuilder.`value`(builder.map)
    }

    /** @param value the value to be set. */
    public fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): GetContextValueResult = cdkBuilder.build()
}
