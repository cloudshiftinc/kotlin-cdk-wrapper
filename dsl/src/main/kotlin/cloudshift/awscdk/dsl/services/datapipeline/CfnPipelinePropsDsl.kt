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

package cloudshift.awscdk.dsl.services.datapipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datapipeline.CfnPipelineProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPipelinePropsDsl {
    private val cdkBuilder: CfnPipelineProps.Builder = CfnPipelineProps.builder()

    private val _parameterObjects: MutableList<Any> = mutableListOf()

    private val _parameterValues: MutableList<Any> = mutableListOf()

    private val _pipelineObjects: MutableList<Any> = mutableListOf()

    private val _pipelineTags: MutableList<Any> = mutableListOf()

    public fun activate(activate: Boolean) {
        cdkBuilder.activate(activate)
    }

    public fun activate(activate: IResolvable) {
        cdkBuilder.activate(activate)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun parameterObjects(vararg parameterObjects: Any) {
        _parameterObjects.addAll(listOf(*parameterObjects))
    }

    public fun parameterObjects(parameterObjects: Collection<Any>) {
        _parameterObjects.addAll(parameterObjects)
    }

    public fun parameterObjects(parameterObjects: IResolvable) {
        cdkBuilder.parameterObjects(parameterObjects)
    }

    public fun parameterValues(vararg parameterValues: Any) {
        _parameterValues.addAll(listOf(*parameterValues))
    }

    public fun parameterValues(parameterValues: Collection<Any>) {
        _parameterValues.addAll(parameterValues)
    }

    public fun parameterValues(parameterValues: IResolvable) {
        cdkBuilder.parameterValues(parameterValues)
    }

    public fun pipelineObjects(vararg pipelineObjects: Any) {
        _pipelineObjects.addAll(listOf(*pipelineObjects))
    }

    public fun pipelineObjects(pipelineObjects: Collection<Any>) {
        _pipelineObjects.addAll(pipelineObjects)
    }

    public fun pipelineObjects(pipelineObjects: IResolvable) {
        cdkBuilder.pipelineObjects(pipelineObjects)
    }

    public fun pipelineTags(vararg pipelineTags: Any) {
        _pipelineTags.addAll(listOf(*pipelineTags))
    }

    public fun pipelineTags(pipelineTags: Collection<Any>) {
        _pipelineTags.addAll(pipelineTags)
    }

    public fun pipelineTags(pipelineTags: IResolvable) {
        cdkBuilder.pipelineTags(pipelineTags)
    }

    public fun build(): CfnPipelineProps {
        if (_parameterObjects.isNotEmpty()) cdkBuilder.parameterObjects(_parameterObjects)
        if (_parameterValues.isNotEmpty()) cdkBuilder.parameterValues(_parameterValues)
        if (_pipelineObjects.isNotEmpty()) cdkBuilder.pipelineObjects(_pipelineObjects)
        if (_pipelineTags.isNotEmpty()) cdkBuilder.pipelineTags(_pipelineTags)
        return cdkBuilder.build()
    }
}
