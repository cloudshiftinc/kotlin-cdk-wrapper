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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import kotlin.String

@CdkDslMarker
public class CfnTaskDefinitionRepositoryCredentialsPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.RepositoryCredentialsProperty.Builder =
        CfnTaskDefinition.RepositoryCredentialsProperty.builder()

    public fun credentialsParameter(credentialsParameter: String) {
        cdkBuilder.credentialsParameter(credentialsParameter)
    }

    public fun build(): CfnTaskDefinition.RepositoryCredentialsProperty = cdkBuilder.build()
}
