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

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecr.RepositoryAttributes
import kotlin.String

@CdkDslMarker
public class RepositoryAttributesDsl {
    private val cdkBuilder: RepositoryAttributes.Builder = RepositoryAttributes.builder()

    public fun repositoryArn(repositoryArn: String) {
        cdkBuilder.repositoryArn(repositoryArn)
    }

    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): RepositoryAttributes = cdkBuilder.build()
}
