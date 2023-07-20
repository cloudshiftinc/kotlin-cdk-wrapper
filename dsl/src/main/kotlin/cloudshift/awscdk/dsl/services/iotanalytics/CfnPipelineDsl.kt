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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnPipeline
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPipelineDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPipeline.Builder = CfnPipeline.Builder.create(scope, id)

    private val _pipelineActivities: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun pipelineActivities(vararg pipelineActivities: Any) {
        _pipelineActivities.addAll(listOf(*pipelineActivities))
    }

    public fun pipelineActivities(pipelineActivities: Collection<Any>) {
        _pipelineActivities.addAll(pipelineActivities)
    }

    public fun pipelineActivities(pipelineActivities: IResolvable) {
        cdkBuilder.pipelineActivities(pipelineActivities)
    }

    public fun pipelineName(pipelineName: String) {
        cdkBuilder.pipelineName(pipelineName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPipeline {
        if (_pipelineActivities.isNotEmpty()) cdkBuilder.pipelineActivities(_pipelineActivities)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
