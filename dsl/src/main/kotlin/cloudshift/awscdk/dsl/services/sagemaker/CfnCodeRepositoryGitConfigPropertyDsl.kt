@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnCodeRepository

/**
 * Specifies configuration details for a Git repository in your AWS account.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * GitConfigProperty gitConfigProperty = GitConfigProperty.builder()
 * .repositoryUrl("repositoryUrl")
 * // the properties below are optional
 * .branch("branch")
 * .secretArn("secretArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html)
 */
@CdkDslMarker
public class CfnCodeRepositoryGitConfigPropertyDsl {
    private val cdkBuilder: CfnCodeRepository.GitConfigProperty.Builder =
        CfnCodeRepository.GitConfigProperty.builder()

    /** @param branch The default branch for the Git repository. */
    public fun branch(branch: String) {
        cdkBuilder.branch(branch)
    }

    /** @param repositoryUrl The URL where the Git repository is located. */
    public fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
    }

    /**
     * @param secretArn The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that
     *   contains the credentials used to access the git repository. The secret must have a staging
     *   label of `AWSCURRENT` and must be in the following format:
     *
     * `{"username": *UserName* , "password": *Password* }`
     */
    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    public fun build(): CfnCodeRepository.GitConfigProperty = cdkBuilder.build()
}
