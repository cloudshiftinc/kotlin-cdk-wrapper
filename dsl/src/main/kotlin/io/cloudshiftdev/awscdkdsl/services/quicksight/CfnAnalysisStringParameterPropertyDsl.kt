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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * A string parameter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * StringParameterProperty stringParameterProperty = StringParameterProperty.builder()
 * .name("name")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-stringparameter.html)
 */
@CdkDslMarker
public class CfnAnalysisStringParameterPropertyDsl {
    private val cdkBuilder: CfnAnalysis.StringParameterProperty.Builder =
        CfnAnalysis.StringParameterProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /** @param name A display name for a string parameter. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param values The values of a string parameter. */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /** @param values The values of a string parameter. */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnAnalysis.StringParameterProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
