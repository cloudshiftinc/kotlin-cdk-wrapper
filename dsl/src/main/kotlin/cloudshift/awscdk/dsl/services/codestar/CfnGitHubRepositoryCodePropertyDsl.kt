@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestar

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codestar.CfnGitHubRepository

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
