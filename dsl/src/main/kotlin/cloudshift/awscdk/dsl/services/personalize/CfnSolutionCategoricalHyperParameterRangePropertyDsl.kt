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

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.personalize.CfnSolution

/**
 * Provides the name and values of a Categorical hyperparameter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.personalize.*;
 * CategoricalHyperParameterRangeProperty categoricalHyperParameterRangeProperty =
 * CategoricalHyperParameterRangeProperty.builder()
 * .name("name")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-categoricalhyperparameterrange.html)
 */
@CdkDslMarker
public class CfnSolutionCategoricalHyperParameterRangePropertyDsl {
    private val cdkBuilder: CfnSolution.CategoricalHyperParameterRangeProperty.Builder =
        CfnSolution.CategoricalHyperParameterRangeProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /** @param name The name of the hyperparameter. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param values A list of the categories for the hyperparameter. */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /** @param values A list of the categories for the hyperparameter. */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnSolution.CategoricalHyperParameterRangeProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
