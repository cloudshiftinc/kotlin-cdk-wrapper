@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3outposts.CfnBucket

@CdkDslMarker
public class CfnBucketFilterPropertyDsl {
  private val cdkBuilder: CfnBucket.FilterProperty.Builder = CfnBucket.FilterProperty.builder()

  /**
   * @param andOperator the value to be set.
   */
  public fun andOperator(andOperator: IResolvable) {
    cdkBuilder.andOperator(andOperator)
  }

  /**
   * @param andOperator the value to be set.
   */
  public fun andOperator(andOperator: CfnBucket.FilterAndOperatorProperty) {
    cdkBuilder.andOperator(andOperator)
  }

  /**
   * @param prefix the value to be set.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param tag the value to be set.
   */
  public fun tag(tag: IResolvable) {
    cdkBuilder.tag(tag)
  }

  /**
   * @param tag the value to be set.
   */
  public fun tag(tag: CfnBucket.FilterTagProperty) {
    cdkBuilder.tag(tag)
  }

  public fun build(): CfnBucket.FilterProperty = cdkBuilder.build()
}
