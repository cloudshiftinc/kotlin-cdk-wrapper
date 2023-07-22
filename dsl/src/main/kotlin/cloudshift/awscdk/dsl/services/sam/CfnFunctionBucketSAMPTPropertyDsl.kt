@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * BucketSAMPTProperty bucketSAMPTProperty = BucketSAMPTProperty.builder()
 * .bucketName("bucketName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-bucketsampt.html)
 */
@CdkDslMarker
public class CfnFunctionBucketSAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.BucketSAMPTProperty.Builder =
      CfnFunction.BucketSAMPTProperty.builder()

  /**
   * @param bucketName the value to be set. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  public fun build(): CfnFunction.BucketSAMPTProperty = cdkBuilder.build()
}
