@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3outposts.CfnBucket

@CdkDslMarker
public class CfnBucketRulePropertyDsl {
  private val cdkBuilder: CfnBucket.RuleProperty.Builder = CfnBucket.RuleProperty.builder()

  public fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable) {
    cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload)
  }

  public
      fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: CfnBucket.AbortIncompleteMultipartUploadProperty) {
    cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload)
  }

  public fun expirationDate(expirationDate: String) {
    cdkBuilder.expirationDate(expirationDate)
  }

  public fun expirationInDays(expirationInDays: Number) {
    cdkBuilder.expirationInDays(expirationInDays)
  }

  public fun filter(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.filter(builder.map)
  }

  public fun filter(filter: Any) {
    cdkBuilder.filter(filter)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnBucket.RuleProperty = cdkBuilder.build()
}
