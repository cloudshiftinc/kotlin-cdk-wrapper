@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies an Object Ownership rule.
 *
 * S3 Object Ownership is an Amazon S3 bucket-level setting that you can use to disable access
 * control lists (ACLs) and take ownership of every object in your bucket, simplifying access
 * management for data stored in Amazon S3. For more information, see [Controlling ownership of objects
 * and disabling
 * ACLs](https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html) in the
 * *Amazon S3 User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * OwnershipControlsRuleProperty ownershipControlsRuleProperty =
 * OwnershipControlsRuleProperty.builder()
 * .objectOwnership("objectOwnership")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ownershipcontrolsrule.html)
 */
@CdkDslMarker
public class CfnBucketOwnershipControlsRulePropertyDsl {
  private val cdkBuilder: CfnBucket.OwnershipControlsRuleProperty.Builder =
      CfnBucket.OwnershipControlsRuleProperty.builder()

  /**
   * @param objectOwnership Specifies an Object Ownership rule.
   * *Allowed values* : `BucketOwnerEnforced` | `ObjectWriter` | `BucketOwnerPreferred`
   */
  public fun objectOwnership(objectOwnership: String) {
    cdkBuilder.objectOwnership(objectOwnership)
  }

  public fun build(): CfnBucket.OwnershipControlsRuleProperty = cdkBuilder.build()
}
