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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fis.CfnExperimentTemplate
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnExperimentTemplateExperimentTemplateActionPropertyDsl {
    private val cdkBuilder: CfnExperimentTemplate.ExperimentTemplateActionProperty.Builder =
        CfnExperimentTemplate.ExperimentTemplateActionProperty.builder()

    private val _startAfter: MutableList<String> = mutableListOf()

    public fun actionId(actionId: String) {
        cdkBuilder.actionId(actionId)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    public fun startAfter(vararg startAfter: String) {
        _startAfter.addAll(listOf(*startAfter))
    }

    public fun startAfter(startAfter: Collection<String>) {
        _startAfter.addAll(startAfter)
    }

    public fun targets(targets: Map<String, String>) {
        cdkBuilder.targets(targets)
    }

    public fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets)
    }

    public fun build(): CfnExperimentTemplate.ExperimentTemplateActionProperty {
        if (_startAfter.isNotEmpty()) cdkBuilder.startAfter(_startAfter)
        return cdkBuilder.build()
    }
}
