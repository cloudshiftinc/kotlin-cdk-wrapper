@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnDomain

@CdkDslMarker
public class CfnDomainSharingSettingsPropertyDsl {
  private val cdkBuilder: CfnDomain.SharingSettingsProperty.Builder =
      CfnDomain.SharingSettingsProperty.builder()

  public fun notebookOutputOption(notebookOutputOption: String) {
    cdkBuilder.notebookOutputOption(notebookOutputOption)
  }

  public fun s3KmsKeyId(s3KmsKeyId: String) {
    cdkBuilder.s3KmsKeyId(s3KmsKeyId)
  }

  public fun s3OutputPath(s3OutputPath: String) {
    cdkBuilder.s3OutputPath(s3OutputPath)
  }

  public fun build(): CfnDomain.SharingSettingsProperty = cdkBuilder.build()
}
