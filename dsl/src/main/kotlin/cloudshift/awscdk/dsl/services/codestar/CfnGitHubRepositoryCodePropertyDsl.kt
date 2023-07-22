@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestar

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codestar.CfnGitHubRepository

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
@CdkDslMarker
public class CfnGitHubRepositoryCodePropertyDsl {
  private val cdkBuilder: CfnGitHubRepository.CodeProperty.Builder =
      CfnGitHubRepository.CodeProperty.builder()

  /**
   * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
   * committed to the repository. 
   */
  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  /**
   * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
   * committed to the repository. 
   */
  public fun s3(s3: CfnGitHubRepository.S3Property) {
    cdkBuilder.s3(s3)
  }

  public fun build(): CfnGitHubRepository.CodeProperty = cdkBuilder.build()
}
