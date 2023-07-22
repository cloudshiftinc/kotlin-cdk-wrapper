@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies the container element for Object Ownership rules.
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
 * OwnershipControlsProperty ownershipControlsProperty = OwnershipControlsProperty.builder()
 * .rules(List.of(OwnershipControlsRuleProperty.builder()
 * .objectOwnership("objectOwnership")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ownershipcontrols.html)
 */
@CdkDslMarker
public class CfnBucketOwnershipControlsPropertyDsl {
  private val cdkBuilder: CfnBucket.OwnershipControlsProperty.Builder =
      CfnBucket.OwnershipControlsProperty.builder()

  private val _rules: MutableList<Any> = mutableListOf()

  /**
   * @param rules Specifies the container element for Object Ownership rules. 
   */
  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  /**
   * @param rules Specifies the container element for Object Ownership rules. 
   */
  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  /**
   * @param rules Specifies the container element for Object Ownership rules. 
   */
  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun build(): CfnBucket.OwnershipControlsProperty {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    return cdkBuilder.build()
  }
}
