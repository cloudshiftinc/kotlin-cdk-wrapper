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
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps

@CdkDslMarker
public class GitHubEnterpriseSourceCredentialsPropsDsl {
    private val cdkBuilder: GitHubEnterpriseSourceCredentialsProps.Builder =
        GitHubEnterpriseSourceCredentialsProps.builder()

    public fun accessToken(accessToken: SecretValue) {
        cdkBuilder.accessToken(accessToken)
    }

    public fun build(): GitHubEnterpriseSourceCredentialsProps = cdkBuilder.build()
}
