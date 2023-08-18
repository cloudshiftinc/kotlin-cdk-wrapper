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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.LazyAnyValueOptions

/**
 * Options for creating lazy untyped tokens.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * LazyAnyValueOptions lazyAnyValueOptions = LazyAnyValueOptions.builder()
 * .displayHint("displayHint")
 * .omitEmptyArray(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class LazyAnyValueOptionsDsl {
    private val cdkBuilder: LazyAnyValueOptions.Builder = LazyAnyValueOptions.builder()

    /** @param displayHint Use the given name as a display hint. */
    public fun displayHint(displayHint: String) {
        cdkBuilder.displayHint(displayHint)
    }

    /**
     * @param omitEmptyArray If the produced value is an array and it is empty, return 'undefined'
     *   instead.
     */
    public fun omitEmptyArray(omitEmptyArray: Boolean) {
        cdkBuilder.omitEmptyArray(omitEmptyArray)
    }

    public fun build(): LazyAnyValueOptions = cdkBuilder.build()
}
