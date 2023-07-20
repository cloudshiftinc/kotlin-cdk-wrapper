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

package cloudshift.awscdk.dsl.services.s3.deployment

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class DeployTimeSubstitutedFilePropsDsl {
    private val cdkBuilder: DeployTimeSubstitutedFileProps.Builder =
        DeployTimeSubstitutedFileProps.builder()

    public fun destinationBucket(destinationBucket: IBucket) {
        cdkBuilder.destinationBucket(destinationBucket)
    }

    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    public fun substitutions(substitutions: Map<String, String>) {
        cdkBuilder.substitutions(substitutions)
    }

    public fun build(): DeployTimeSubstitutedFileProps = cdkBuilder.build()
}
