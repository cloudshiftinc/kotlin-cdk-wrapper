@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier

/**
 * The location of the training documents.
 *
 * This parameter is required in a request to create a native document model.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.comprehend.*;
 * DocumentClassifierDocumentsProperty documentClassifierDocumentsProperty =
 * DocumentClassifierDocumentsProperty.builder()
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .testS3Uri("testS3Uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierdocuments.html)
 */
@CdkDslMarker
public class CfnDocumentClassifierDocumentClassifierDocumentsPropertyDsl {
  private val cdkBuilder: CfnDocumentClassifier.DocumentClassifierDocumentsProperty.Builder =
      CfnDocumentClassifier.DocumentClassifierDocumentsProperty.builder()

  /**
   * @param s3Uri The S3 URI location of the training documents specified in the S3Uri CSV file. 
   */
  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  /**
   * @param testS3Uri The S3 URI location of the test documents included in the TestS3Uri CSV file.
   * This field is not required if you do not specify a test CSV file.
   */
  public fun testS3Uri(testS3Uri: String) {
    cdkBuilder.testS3Uri(testS3Uri)
  }

  public fun build(): CfnDocumentClassifier.DocumentClassifierDocumentsProperty = cdkBuilder.build()
}
