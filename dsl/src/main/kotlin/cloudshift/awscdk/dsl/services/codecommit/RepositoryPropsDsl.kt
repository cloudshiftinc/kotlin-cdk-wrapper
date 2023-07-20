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

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codecommit.Code
import software.amazon.awscdk.services.codecommit.RepositoryProps
import kotlin.String

@CdkDslMarker
public class RepositoryPropsDsl {
    private val cdkBuilder: RepositoryProps.Builder = RepositoryProps.builder()

    public fun code(code: Code) {
        cdkBuilder.code(code)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): RepositoryProps = cdkBuilder.build()
}
