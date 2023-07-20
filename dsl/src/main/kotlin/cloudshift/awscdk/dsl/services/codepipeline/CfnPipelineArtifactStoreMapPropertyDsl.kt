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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnPipeline
import kotlin.String

@CdkDslMarker
public class CfnPipelineArtifactStoreMapPropertyDsl {
    private val cdkBuilder: CfnPipeline.ArtifactStoreMapProperty.Builder =
        CfnPipeline.ArtifactStoreMapProperty.builder()

    public fun artifactStore(artifactStore: IResolvable) {
        cdkBuilder.artifactStore(artifactStore)
    }

    public fun artifactStore(artifactStore: CfnPipeline.ArtifactStoreProperty) {
        cdkBuilder.artifactStore(artifactStore)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): CfnPipeline.ArtifactStoreMapProperty = cdkBuilder.build()
}
