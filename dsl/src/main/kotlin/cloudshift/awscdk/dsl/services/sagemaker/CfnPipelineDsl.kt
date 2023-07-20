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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.sagemaker.CfnPipeline
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

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun parallelismConfiguration(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parallelismConfiguration(builder.map)
    }

    public fun parallelismConfiguration(parallelismConfiguration: Any) {
        cdkBuilder.parallelismConfiguration(parallelismConfiguration)
    }

    public fun pipelineDefinition(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.pipelineDefinition(builder.map)
    }

    public fun pipelineDefinition(pipelineDefinition: Any) {
        cdkBuilder.pipelineDefinition(pipelineDefinition)
    }

    public fun pipelineDescription(pipelineDescription: String) {
        cdkBuilder.pipelineDescription(pipelineDescription)
    }

    public fun pipelineDisplayName(pipelineDisplayName: String) {
        cdkBuilder.pipelineDisplayName(pipelineDisplayName)
    }

    public fun pipelineName(pipelineName: String) {
        cdkBuilder.pipelineName(pipelineName)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPipeline {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
