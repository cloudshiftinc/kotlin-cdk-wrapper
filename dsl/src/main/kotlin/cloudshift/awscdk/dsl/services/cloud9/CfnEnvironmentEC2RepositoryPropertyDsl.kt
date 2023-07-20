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

package cloudshift.awscdk.dsl.services.cloud9

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2
import kotlin.String

@CdkDslMarker
public class CfnEnvironmentEC2RepositoryPropertyDsl {
    private val cdkBuilder: CfnEnvironmentEC2.RepositoryProperty.Builder =
        CfnEnvironmentEC2.RepositoryProperty.builder()

    public fun pathComponent(pathComponent: String) {
        cdkBuilder.pathComponent(pathComponent)
    }

    public fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
    }

    public fun build(): CfnEnvironmentEC2.RepositoryProperty = cdkBuilder.build()
}
