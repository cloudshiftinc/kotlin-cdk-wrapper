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

package io.cloudshiftdev.awscdkdsl.services.personalize

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.personalize.CfnSolution

/**
 * Specifies the hyperparameters and their ranges.
 *
 * Hyperparameters can be categorical, continuous, or integer-valued.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.personalize.*;
 * AlgorithmHyperParameterRangesProperty algorithmHyperParameterRangesProperty =
 * AlgorithmHyperParameterRangesProperty.builder()
 * .categoricalHyperParameterRanges(List.of(CategoricalHyperParameterRangeProperty.builder()
 * .name("name")
 * .values(List.of("values"))
 * .build()))
 * .continuousHyperParameterRanges(List.of(ContinuousHyperParameterRangeProperty.builder()
 * .maxValue(123)
 * .minValue(123)
 * .name("name")
 * .build()))
 * .integerHyperParameterRanges(List.of(IntegerHyperParameterRangeProperty.builder()
 * .maxValue(123)
 * .minValue(123)
 * .name("name")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-algorithmhyperparameterranges.html)
 */
@CdkDslMarker
public class CfnSolutionAlgorithmHyperParameterRangesPropertyDsl {
    private val cdkBuilder: CfnSolution.AlgorithmHyperParameterRangesProperty.Builder =
        CfnSolution.AlgorithmHyperParameterRangesProperty.builder()

    private val _categoricalHyperParameterRanges: MutableList<Any> = mutableListOf()

    private val _continuousHyperParameterRanges: MutableList<Any> = mutableListOf()

    private val _integerHyperParameterRanges: MutableList<Any> = mutableListOf()

    /**
     * @param categoricalHyperParameterRanges Provides the name and range of a categorical
     *   hyperparameter.
     */
    public fun categoricalHyperParameterRanges(vararg categoricalHyperParameterRanges: Any) {
        _categoricalHyperParameterRanges.addAll(listOf(*categoricalHyperParameterRanges))
    }

    /**
     * @param categoricalHyperParameterRanges Provides the name and range of a categorical
     *   hyperparameter.
     */
    public fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: Collection<Any>) {
        _categoricalHyperParameterRanges.addAll(categoricalHyperParameterRanges)
    }

    /**
     * @param categoricalHyperParameterRanges Provides the name and range of a categorical
     *   hyperparameter.
     */
    public fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: IResolvable) {
        cdkBuilder.categoricalHyperParameterRanges(categoricalHyperParameterRanges)
    }

    /**
     * @param continuousHyperParameterRanges Provides the name and range of a continuous
     *   hyperparameter.
     */
    public fun continuousHyperParameterRanges(vararg continuousHyperParameterRanges: Any) {
        _continuousHyperParameterRanges.addAll(listOf(*continuousHyperParameterRanges))
    }

    /**
     * @param continuousHyperParameterRanges Provides the name and range of a continuous
     *   hyperparameter.
     */
    public fun continuousHyperParameterRanges(continuousHyperParameterRanges: Collection<Any>) {
        _continuousHyperParameterRanges.addAll(continuousHyperParameterRanges)
    }

    /**
     * @param continuousHyperParameterRanges Provides the name and range of a continuous
     *   hyperparameter.
     */
    public fun continuousHyperParameterRanges(continuousHyperParameterRanges: IResolvable) {
        cdkBuilder.continuousHyperParameterRanges(continuousHyperParameterRanges)
    }

    /**
     * @param integerHyperParameterRanges Provides the name and range of an integer-valued
     *   hyperparameter.
     */
    public fun integerHyperParameterRanges(vararg integerHyperParameterRanges: Any) {
        _integerHyperParameterRanges.addAll(listOf(*integerHyperParameterRanges))
    }

    /**
     * @param integerHyperParameterRanges Provides the name and range of an integer-valued
     *   hyperparameter.
     */
    public fun integerHyperParameterRanges(integerHyperParameterRanges: Collection<Any>) {
        _integerHyperParameterRanges.addAll(integerHyperParameterRanges)
    }

    /**
     * @param integerHyperParameterRanges Provides the name and range of an integer-valued
     *   hyperparameter.
     */
    public fun integerHyperParameterRanges(integerHyperParameterRanges: IResolvable) {
        cdkBuilder.integerHyperParameterRanges(integerHyperParameterRanges)
    }

    public fun build(): CfnSolution.AlgorithmHyperParameterRangesProperty {
        if (_categoricalHyperParameterRanges.isNotEmpty())
            cdkBuilder.categoricalHyperParameterRanges(_categoricalHyperParameterRanges)
        if (_continuousHyperParameterRanges.isNotEmpty())
            cdkBuilder.continuousHyperParameterRanges(_continuousHyperParameterRanges)
        if (_integerHyperParameterRanges.isNotEmpty())
            cdkBuilder.integerHyperParameterRanges(_integerHyperParameterRanges)
        return cdkBuilder.build()
    }
}
