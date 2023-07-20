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

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables
import kotlin.String

@CdkDslMarker
public class S3SourceVariablesDsl {
    private val cdkBuilder: S3SourceVariables.Builder = S3SourceVariables.builder()

    public fun eTag(eTag: String) {
        cdkBuilder.eTag(eTag)
    }

    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    public fun build(): S3SourceVariables = cdkBuilder.build()
}
