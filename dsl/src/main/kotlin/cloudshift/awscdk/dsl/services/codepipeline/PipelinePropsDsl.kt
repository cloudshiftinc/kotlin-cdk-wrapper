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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.PipelineProps
import software.amazon.awscdk.services.codepipeline.StageProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class PipelinePropsDsl {
    private val cdkBuilder: PipelineProps.Builder = PipelineProps.builder()

    private val _stages: MutableList<StageProps> = mutableListOf()

    public fun artifactBucket(artifactBucket: IBucket) {
        cdkBuilder.artifactBucket(artifactBucket)
    }

    public fun crossAccountKeys(crossAccountKeys: Boolean) {
        cdkBuilder.crossAccountKeys(crossAccountKeys)
    }

    public fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>) {
        cdkBuilder.crossRegionReplicationBuckets(crossRegionReplicationBuckets)
    }

    public fun enableKeyRotation(enableKeyRotation: Boolean) {
        cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    public fun pipelineName(pipelineName: String) {
        cdkBuilder.pipelineName(pipelineName)
    }

    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean) {
        cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
    }

    public fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean) {
        cdkBuilder.reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun stages(stages: StagePropsDsl.() -> Unit) {
        _stages.add(StagePropsDsl().apply(stages).build())
    }

    public fun stages(stages: Collection<StageProps>) {
        _stages.addAll(stages)
    }

    public fun build(): PipelineProps {
        if (_stages.isNotEmpty()) cdkBuilder.stages(_stages)
        return cdkBuilder.build()
    }
}
