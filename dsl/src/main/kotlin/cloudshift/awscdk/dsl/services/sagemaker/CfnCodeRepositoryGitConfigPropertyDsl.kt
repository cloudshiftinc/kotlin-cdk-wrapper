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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnCodeRepository
import kotlin.String

@CdkDslMarker
public class CfnCodeRepositoryGitConfigPropertyDsl {
    private val cdkBuilder: CfnCodeRepository.GitConfigProperty.Builder =
        CfnCodeRepository.GitConfigProperty.builder()

    public fun branch(branch: String) {
        cdkBuilder.branch(branch)
    }

    public fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
    }

    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    public fun build(): CfnCodeRepository.GitConfigProperty = cdkBuilder.build()
}
