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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.S3ArtifactsProps
import software.amazon.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class S3ArtifactsPropsDsl {
    private val cdkBuilder: S3ArtifactsProps.Builder = S3ArtifactsProps.builder()

    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    public fun encryption(encryption: Boolean) {
        cdkBuilder.encryption(encryption)
    }

    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    public fun includeBuildId(includeBuildId: Boolean) {
        cdkBuilder.includeBuildId(includeBuildId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun packageZip(packageZip: Boolean) {
        cdkBuilder.packageZip(packageZip)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): S3ArtifactsProps = cdkBuilder.build()
}
