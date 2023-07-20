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
import software.amazon.awscdk.services.codebuild.CfnProject
import kotlin.String

@CdkDslMarker
public class CfnProjectRegistryCredentialPropertyDsl {
    private val cdkBuilder: CfnProject.RegistryCredentialProperty.Builder =
        CfnProject.RegistryCredentialProperty.builder()

    public fun credential(credential: String) {
        cdkBuilder.credential(credential)
    }

    public fun credentialProvider(credentialProvider: String) {
        cdkBuilder.credentialProvider(credentialProvider)
    }

    public fun build(): CfnProject.RegistryCredentialProperty = cdkBuilder.build()
}
