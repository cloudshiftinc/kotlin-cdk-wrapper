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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * A list of selectable values that are used in a control.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilterSelectableValuesProperty filterSelectableValuesProperty =
 * FilterSelectableValuesProperty.builder()
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-filterselectablevalues.html)
 */
@CdkDslMarker
public class CfnTemplateFilterSelectableValuesPropertyDsl {
    private val cdkBuilder: CfnTemplate.FilterSelectableValuesProperty.Builder =
        CfnTemplate.FilterSelectableValuesProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /** @param values The values that are used in the `FilterSelectableValues` . */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /** @param values The values that are used in the `FilterSelectableValues` . */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnTemplate.FilterSelectableValuesProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
