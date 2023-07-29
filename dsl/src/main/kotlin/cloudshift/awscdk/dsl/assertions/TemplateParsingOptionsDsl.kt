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

package cloudshift.awscdk.dsl.assertions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.assertions.TemplateParsingOptions

/**
 * Options to configure template parsing behavior, such as disregarding circular dependencies.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.assertions.*;
 * TemplateParsingOptions templateParsingOptions = TemplateParsingOptions.builder()
 * .skipCyclicalDependenciesCheck(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class TemplateParsingOptionsDsl {
    private val cdkBuilder: TemplateParsingOptions.Builder = TemplateParsingOptions.builder()

    /**
     * @param skipCyclicalDependenciesCheck If set to true, will skip checking for cyclical /
     *   circular dependencies. Should be set to false other than for templates that are valid
     *   despite containing cycles, such as unprocessed transform stacks.
     */
    public fun skipCyclicalDependenciesCheck(skipCyclicalDependenciesCheck: Boolean) {
        cdkBuilder.skipCyclicalDependenciesCheck(skipCyclicalDependenciesCheck)
    }

    public fun build(): TemplateParsingOptions = cdkBuilder.build()
}
