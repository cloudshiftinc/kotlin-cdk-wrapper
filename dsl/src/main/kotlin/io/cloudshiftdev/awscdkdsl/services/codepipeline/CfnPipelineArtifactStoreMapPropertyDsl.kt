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

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnPipeline

/**
 * A mapping of `artifactStore` objects and their corresponding AWS Regions.
 *
 * There must be an artifact store for the pipeline Region and for each cross-region action in the
 * pipeline.
 *
 * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot use
 * both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * ArtifactStoreMapProperty artifactStoreMapProperty = ArtifactStoreMapProperty.builder()
 * .artifactStore(ArtifactStoreProperty.builder()
 * .location("location")
 * .type("type")
 * // the properties below are optional
 * .encryptionKey(EncryptionKeyProperty.builder()
 * .id("id")
 * .type("type")
 * .build())
 * .build())
 * .region("region")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstoremap.html)
 */
@CdkDslMarker
public class CfnPipelineArtifactStoreMapPropertyDsl {
    private val cdkBuilder: CfnPipeline.ArtifactStoreMapProperty.Builder =
        CfnPipeline.ArtifactStoreMapProperty.builder()

    /**
     * @param artifactStore Represents information about the S3 bucket where artifacts are stored
     *   for the pipeline.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores`
     * .
     */
    public fun artifactStore(artifactStore: IResolvable) {
        cdkBuilder.artifactStore(artifactStore)
    }

    /**
     * @param artifactStore Represents information about the S3 bucket where artifacts are stored
     *   for the pipeline.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores`
     * .
     */
    public fun artifactStore(artifactStore: CfnPipeline.ArtifactStoreProperty) {
        cdkBuilder.artifactStore(artifactStore)
    }

    /** @param region The action declaration's AWS Region, such as us-east-1. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): CfnPipeline.ArtifactStoreMapProperty = cdkBuilder.build()
}
