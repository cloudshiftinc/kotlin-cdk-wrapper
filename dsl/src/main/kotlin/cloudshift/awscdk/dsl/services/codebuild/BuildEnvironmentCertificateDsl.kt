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
import software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate
import software.amazon.awscdk.services.s3.IBucket
import kotlin.String

@CdkDslMarker
public class BuildEnvironmentCertificateDsl {
    private val cdkBuilder: BuildEnvironmentCertificate.Builder =
        BuildEnvironmentCertificate.builder()

    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    public fun objectKey(objectKey: String) {
        cdkBuilder.objectKey(objectKey)
    }

    public fun build(): BuildEnvironmentCertificate = cdkBuilder.build()
}
