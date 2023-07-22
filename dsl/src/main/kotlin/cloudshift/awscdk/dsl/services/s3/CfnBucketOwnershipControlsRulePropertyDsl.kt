@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

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
