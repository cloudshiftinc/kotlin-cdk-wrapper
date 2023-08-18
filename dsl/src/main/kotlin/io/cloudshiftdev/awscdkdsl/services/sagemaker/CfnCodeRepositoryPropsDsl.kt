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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnCodeRepository
import software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps

/**
 * Properties for defining a `CfnCodeRepository`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnCodeRepositoryProps cfnCodeRepositoryProps = CfnCodeRepositoryProps.builder()
 * .gitConfig(GitConfigProperty.builder()
 * .repositoryUrl("repositoryUrl")
 * // the properties below are optional
 * .branch("branch")
 * .secretArn("secretArn")
 * .build())
 * // the properties below are optional
 * .codeRepositoryName("codeRepositoryName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html)
 */
@CdkDslMarker
public class CfnCodeRepositoryPropsDsl {
    private val cdkBuilder: CfnCodeRepositoryProps.Builder = CfnCodeRepositoryProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param codeRepositoryName The name of the Git repository. */
    public fun codeRepositoryName(codeRepositoryName: String) {
        cdkBuilder.codeRepositoryName(codeRepositoryName)
    }

    /**
     * @param gitConfig Configuration details for the Git repository, including the URL where it is
     *   located and the ARN of the AWS Secrets Manager secret that contains the credentials used to
     *   access the repository.
     */
    public fun gitConfig(gitConfig: IResolvable) {
        cdkBuilder.gitConfig(gitConfig)
    }

    /**
     * @param gitConfig Configuration details for the Git repository, including the URL where it is
     *   located and the ARN of the AWS Secrets Manager secret that contains the credentials used to
     *   access the repository.
     */
    public fun gitConfig(gitConfig: CfnCodeRepository.GitConfigProperty) {
        cdkBuilder.gitConfig(gitConfig)
    }

    /** @param tags List of tags for Code Repository. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags List of tags for Code Repository. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCodeRepositoryProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
