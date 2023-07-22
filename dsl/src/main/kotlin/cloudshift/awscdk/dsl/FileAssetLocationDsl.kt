@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.FileAssetLocation

/**
 * The location of the published file asset.
 *
 * This is where the asset
 * can be consumed at runtime.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * FileAssetLocation fileAssetLocation = FileAssetLocation.builder()
 * .bucketName("bucketName")
 * .httpUrl("httpUrl")
 * .objectKey("objectKey")
 * .s3ObjectUrl("s3ObjectUrl")
 * // the properties below are optional
 * .kmsKeyArn("kmsKeyArn")
 * .s3ObjectUrlWithPlaceholders("s3ObjectUrlWithPlaceholders")
 * .build();
 * ```
 */
@CdkDslMarker
public class FileAssetLocationDsl {
  private val cdkBuilder: FileAssetLocation.Builder = FileAssetLocation.builder()

  /**
   * @param bucketName The name of the Amazon S3 bucket. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param httpUrl The HTTP URL of this asset on Amazon S3. 
   * This value suitable for inclusion in a CloudFormation template, and
   * may be an encoded token.
   *
   * Example value: `https://s3-us-east-1.amazonaws.com/mybucket/myobject`
   */
  public fun httpUrl(httpUrl: String) {
    cdkBuilder.httpUrl(httpUrl)
  }

  /**
   * @param kmsKeyArn The ARN of the KMS key used to encrypt the file asset bucket, if any.
   * The CDK bootstrap stack comes with a key policy that does not require
   * setting this property, so you only need to set this property if you
   * have customized the bootstrap stack to require it.
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  /**
   * @param objectKey The Amazon S3 object key. 
   */
  public fun objectKey(objectKey: String) {
    cdkBuilder.objectKey(objectKey)
  }

  /**
   * @param s3ObjectUrl The S3 URL of this asset on Amazon S3. 
   * This value suitable for inclusion in a CloudFormation template, and
   * may be an encoded token.
   *
   * Example value: `s3://mybucket/myobject`
   */
  public fun s3ObjectUrl(s3ObjectUrl: String) {
    cdkBuilder.s3ObjectUrl(s3ObjectUrl)
  }

  /**
   * @param s3ObjectUrlWithPlaceholders Like `s3ObjectUrl`, but not suitable for CloudFormation
   * consumption.
   * If there are placeholders in the S3 URL, they will be returned un-replaced
   * and un-evaluated.
   */
  public fun s3ObjectUrlWithPlaceholders(s3ObjectUrlWithPlaceholders: String) {
    cdkBuilder.s3ObjectUrlWithPlaceholders(s3ObjectUrlWithPlaceholders)
  }

  public fun build(): FileAssetLocation = cdkBuilder.build()
}
