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

package cloudshift.awscdk.dsl.services.fis

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

/**
 * Specifies a filter used for the target resource input in an experiment template.
 *
 * For more information, see
 * [Resource filters](https://docs.aws.amazon.com/fis/latest/userguide/targets.html#target-filters)
 * in the *AWS Fault Injection Simulator User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fis.*;
 * ExperimentTemplateTargetFilterProperty experimentTemplateTargetFilterProperty =
 * ExperimentTemplateTargetFilterProperty.builder()
 * .path("path")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetargetfilter.html)
 */
@CdkDslMarker
public class CfnExperimentTemplateExperimentTemplateTargetFilterPropertyDsl {
    private val cdkBuilder: CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty.Builder =
        CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /** @param path The attribute path for the filter. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /** @param values The attribute values for the filter. */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /** @param values The attribute values for the filter. */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
