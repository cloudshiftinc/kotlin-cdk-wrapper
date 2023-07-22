@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestar

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestar.CfnGitHubRepository
import software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps
import software.constructs.Construct

public object codestar {
  /**
   * The `AWS::CodeStar::GitHubRepository` resource creates a GitHub repository where users can
   * store source code for use with AWS workflows.
   *
   * You must provide a location for the source code ZIP file in the AWS CloudFormation template, so
   * the code can be uploaded to the created repository. You must have created a personal access token
   * in GitHub to provide in the AWS CloudFormation template. AWS uses this token to connect to GitHub
   * on your behalf. For more information about using a GitHub source repository with AWS CodeStar
   * projects, see [AWS CodeStar Project Files and
   * Resources](https://docs.aws.amazon.com/codestar/latest/userguide/templates.html#templates-whatis)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codestar.*;
   * CfnGitHubRepository cfnGitHubRepository = CfnGitHubRepository.Builder.create(this,
   * "MyCfnGitHubRepository")
   * .repositoryName("repositoryName")
   * .repositoryOwner("repositoryOwner")
   * // the properties below are optional
   * .code(CodeProperty.builder()
   * .s3(S3Property.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * .build())
   * .connectionArn("connectionArn")
   * .enableIssues(false)
   * .isPrivate(false)
   * .repositoryAccessToken("repositoryAccessToken")
   * .repositoryDescription("repositoryDescription")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html)
   */
  public inline fun cfnGitHubRepository(
    scope: Construct,
    id: String,
    block: CfnGitHubRepositoryDsl.() -> Unit = {},
  ): CfnGitHubRepository {
    val builder = CfnGitHubRepositoryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `Code` property type specifies information about code to be committed.
   *
   * `Code` is a property of the `AWS::CodeStar::GitHubRepository` resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codestar.*;
   * CodeProperty codeProperty = CodeProperty.builder()
   * .s3(S3Property.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-code.html)
   */
  public inline
      fun cfnGitHubRepositoryCodeProperty(block: CfnGitHubRepositoryCodePropertyDsl.() -> Unit =
      {}): CfnGitHubRepository.CodeProperty {
    val builder = CfnGitHubRepositoryCodePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnGitHubRepository`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codestar.*;
   * CfnGitHubRepositoryProps cfnGitHubRepositoryProps = CfnGitHubRepositoryProps.builder()
   * .repositoryName("repositoryName")
   * .repositoryOwner("repositoryOwner")
   * // the properties below are optional
   * .code(CodeProperty.builder()
   * .s3(S3Property.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * .build())
   * .connectionArn("connectionArn")
   * .enableIssues(false)
   * .isPrivate(false)
   * .repositoryAccessToken("repositoryAccessToken")
   * .repositoryDescription("repositoryDescription")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html)
   */
  public inline fun cfnGitHubRepositoryProps(block: CfnGitHubRepositoryPropsDsl.() -> Unit = {}):
      CfnGitHubRepositoryProps {
    val builder = CfnGitHubRepositoryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `S3` property type specifies information about the Amazon S3 bucket that contains the code
   * to be committed to the new repository.
   *
   * `S3` is a property of the `AWS::CodeStar::GitHubRepository` resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codestar.*;
   * S3Property s3Property = S3Property.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html)
   */
  public inline fun cfnGitHubRepositoryS3Property(block: CfnGitHubRepositoryS3PropertyDsl.() -> Unit
      = {}): CfnGitHubRepository.S3Property {
    val builder = CfnGitHubRepositoryS3PropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
