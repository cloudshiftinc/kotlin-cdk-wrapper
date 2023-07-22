@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codecommit.CfnRepository

@CdkDslMarker
public class CfnRepositoryCodePropertyDsl {
  private val cdkBuilder: CfnRepository.CodeProperty.Builder = CfnRepository.CodeProperty.builder()

  /**
   * @param branchName Optional.
   * Specifies a branch name to be used as the default branch when importing code into a repository
   * on initial creation. If this property is not set, the name *main* will be used for the default
   * branch for the repository. Changes to this property are ignored after initial resource creation.
   * We recommend using this parameter to set the name to *main* to align with the default behavior of
   * CodeCommit unless another name is needed.
   */
  public fun branchName(branchName: String) {
    cdkBuilder.branchName(branchName)
  }

  /**
   * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
   * committed to the repository. 
   * Changes to this property are ignored after initial resource creation.
   */
  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  /**
   * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
   * committed to the repository. 
   * Changes to this property are ignored after initial resource creation.
   */
  public fun s3(s3: CfnRepository.S3Property) {
    cdkBuilder.s3(s3)
  }

  public fun build(): CfnRepository.CodeProperty = cdkBuilder.build()
}
