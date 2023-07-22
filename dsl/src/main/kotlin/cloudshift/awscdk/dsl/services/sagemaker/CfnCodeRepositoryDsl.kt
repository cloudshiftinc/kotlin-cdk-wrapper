@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnCodeRepository
import software.constructs.Construct

/**
 * Creates a Git repository as a resource in your SageMaker account.
 *
 * You can associate the repository with notebook instances so that you can use Git source control
 * for the notebooks you create. The Git repository is a resource in your SageMaker account, so it can
 * be associated with more than one notebook instance, and it persists independently from the lifecycle
 * of any notebook instances it is associated with.
 *
 * The repository can be hosted either in [AWS
 * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other
 * Git repository.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnCodeRepository cfnCodeRepository = CfnCodeRepository.Builder.create(this,
 * "MyCfnCodeRepository")
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
public class CfnCodeRepositoryDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCodeRepository.Builder = CfnCodeRepository.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The name of the Git repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-coderepositoryname)
   * @param codeRepositoryName The name of the Git repository. 
   */
  public fun codeRepositoryName(codeRepositoryName: String) {
    cdkBuilder.codeRepositoryName(codeRepositoryName)
  }

  /**
   * Configuration details for the Git repository, including the URL where it is located and the ARN
   * of the AWS Secrets Manager secret that contains the credentials used to access the repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-gitconfig)
   * @param gitConfig Configuration details for the Git repository, including the URL where it is
   * located and the ARN of the AWS Secrets Manager secret that contains the credentials used to access
   * the repository. 
   */
  public fun gitConfig(gitConfig: IResolvable) {
    cdkBuilder.gitConfig(gitConfig)
  }

  /**
   * Configuration details for the Git repository, including the URL where it is located and the ARN
   * of the AWS Secrets Manager secret that contains the credentials used to access the repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-gitconfig)
   * @param gitConfig Configuration details for the Git repository, including the URL where it is
   * located and the ARN of the AWS Secrets Manager secret that contains the credentials used to access
   * the repository. 
   */
  public fun gitConfig(gitConfig: CfnCodeRepository.GitConfigProperty) {
    cdkBuilder.gitConfig(gitConfig)
  }

  /**
   * List of tags for Code Repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-tags)
   * @param tags List of tags for Code Repository. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * List of tags for Code Repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-tags)
   * @param tags List of tags for Code Repository. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCodeRepository {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
