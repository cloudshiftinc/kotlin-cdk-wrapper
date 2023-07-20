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
import software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables
import kotlin.String

@CdkDslMarker
public class EcrSourceVariablesDsl {
    private val cdkBuilder: EcrSourceVariables.Builder = EcrSourceVariables.builder()

    public fun imageDigest(imageDigest: String) {
        cdkBuilder.imageDigest(imageDigest)
    }

    public fun imageTag(imageTag: String) {
        cdkBuilder.imageTag(imageTag)
    }

    public fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
    }

    public fun registryId(registryId: String) {
        cdkBuilder.registryId(registryId)
    }

    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): EcrSourceVariables = cdkBuilder.build()
}
