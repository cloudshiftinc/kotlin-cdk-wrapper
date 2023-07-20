@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codecommit.CfnRepository

@CdkDslMarker
public class CfnRepositoryCodePropertyDsl {
  private val cdkBuilder: CfnRepository.CodeProperty.Builder = CfnRepository.CodeProperty.builder()

  public fun branchName(branchName: String) {
    cdkBuilder.branchName(branchName)
  }

  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  public fun s3(s3: CfnRepository.S3Property) {
    cdkBuilder.s3(s3)
  }

  public fun build(): CfnRepository.CodeProperty = cdkBuilder.build()
}
