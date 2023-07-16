@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3outposts.CfnBucket

@CdkDslMarker
public class CfnBucketFilterPropertyDsl {
  private val cdkBuilder: CfnBucket.FilterProperty.Builder = CfnBucket.FilterProperty.builder()

  public fun andOperator(andOperator: IResolvable) {
    cdkBuilder.andOperator(andOperator)
  }

  public fun andOperator(andOperator: CfnBucket.FilterAndOperatorProperty) {
    cdkBuilder.andOperator(andOperator)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun tag(tag: IResolvable) {
    cdkBuilder.tag(tag)
  }

  public fun tag(tag: CfnBucket.FilterTagProperty) {
    cdkBuilder.tag(tag)
  }

  public fun build(): CfnBucket.FilterProperty = cdkBuilder.build()
}
