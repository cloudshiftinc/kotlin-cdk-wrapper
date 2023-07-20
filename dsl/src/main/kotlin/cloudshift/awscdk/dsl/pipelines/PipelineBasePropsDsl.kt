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

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.pipelines.IFileSetProducer
import software.amazon.awscdk.pipelines.PipelineBaseProps

@CdkDslMarker
public class PipelineBasePropsDsl {
    private val cdkBuilder: PipelineBaseProps.Builder = PipelineBaseProps.builder()

    public fun synth(synth: IFileSetProducer) {
        cdkBuilder.synth(synth)
    }

    public fun build(): PipelineBaseProps = cdkBuilder.build()
}
