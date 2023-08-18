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
import software.amazon.awscdk.ExportValueOptions

/**
 * Options for the `stack.exportValue()` method.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * ExportValueOptions exportValueOptions = ExportValueOptions.builder()
 * .name("name")
 * .build();
 * ```
 */
@CdkDslMarker
public class ExportValueOptionsDsl {
    private val cdkBuilder: ExportValueOptions.Builder = ExportValueOptions.builder()

    /** @param name The name of the export to create. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): ExportValueOptions = cdkBuilder.build()
}
