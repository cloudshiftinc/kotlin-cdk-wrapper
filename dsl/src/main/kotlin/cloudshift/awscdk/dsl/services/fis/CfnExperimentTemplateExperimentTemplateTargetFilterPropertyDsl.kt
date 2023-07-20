@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.fis

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.fis.CfnExperimentTemplate
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnExperimentTemplateExperimentTemplateTargetFilterPropertyDsl {
    private val cdkBuilder: CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty.Builder =
        CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
