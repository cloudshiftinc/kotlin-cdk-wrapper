@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.macie.CfnAllowList

/**
 * Specifies the location and name of an Amazon Simple Storage Service ( Amazon S3 ) object that
 * lists specific, predefined text to ignore when inspecting data sources for sensitive data.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.macie.*;
 * S3WordsListProperty s3WordsListProperty = S3WordsListProperty.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-allowlist-s3wordslist.html)
 */
@CdkDslMarker
public class CfnAllowListS3WordsListPropertyDsl {
  private val cdkBuilder: CfnAllowList.S3WordsListProperty.Builder =
      CfnAllowList.S3WordsListProperty.builder()

  /**
   * @param bucketName The full name of the S3 bucket that contains the object. 
   * This value correlates to the `Name` field of a bucket's properties in Amazon S3 .
   *
   * This value is case sensitive. In addition, don't use wildcard characters or specify partial
   * values for the name.
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param objectKey The full name of the S3 object. 
   * This value correlates to the `Key` field of an object's properties in Amazon S3 . If the name
   * includes a path, include the complete path. For example, `AllowLists/Macie/MyList.txt` .
   *
   * This value is case sensitive. In addition, don't use wildcard characters or specify partial
   * values for the name.
   */
  public fun objectKey(objectKey: String) {
    cdkBuilder.objectKey(objectKey)
  }

  public fun build(): CfnAllowList.S3WordsListProperty = cdkBuilder.build()
}
