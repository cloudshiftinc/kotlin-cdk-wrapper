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
public class CfnPipelineArtifactStorePropertyDsl {
    private val cdkBuilder: CfnPipeline.ArtifactStoreProperty.Builder =
        CfnPipeline.ArtifactStoreProperty.builder()

    public fun encryptionKey(encryptionKey: IResolvable) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun encryptionKey(encryptionKey: CfnPipeline.EncryptionKeyProperty) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnPipeline.ArtifactStoreProperty = cdkBuilder.build()
}
