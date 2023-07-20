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
import software.amazon.awscdk.services.codebuild.DockerImageOptions
import software.amazon.awscdk.services.secretsmanager.ISecret

@CdkDslMarker
public class DockerImageOptionsDsl {
    private val cdkBuilder: DockerImageOptions.Builder = DockerImageOptions.builder()

    public fun secretsManagerCredentials(secretsManagerCredentials: ISecret) {
        cdkBuilder.secretsManagerCredentials(secretsManagerCredentials)
    }

    public fun build(): DockerImageOptions = cdkBuilder.build()
}
