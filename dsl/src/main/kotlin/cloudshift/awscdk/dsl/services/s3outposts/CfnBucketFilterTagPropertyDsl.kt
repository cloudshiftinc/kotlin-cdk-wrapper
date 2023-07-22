@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3outposts.CfnBucket

@CdkDslMarker
public class CfnBucketFilterTagPropertyDsl {
  private val cdkBuilder: CfnBucket.FilterTagProperty.Builder =
      CfnBucket.FilterTagProperty.builder()

  /**
   * @param key the value to be set. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value the value to be set. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnBucket.FilterTagProperty = cdkBuilder.build()
}
