@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier

@CdkDslMarker
public class CfnDocumentClassifierDocumentClassifierOutputDataConfigPropertyDsl {
  private val cdkBuilder: CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty.Builder =
      CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty.builder()

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty =
      cdkBuilder.build()
}
