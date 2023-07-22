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

  /**
   * @param abortIncompleteMultipartUpload The container for the abort incomplete multipart upload
   * rule.
   */
  public fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable) {
    cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload)
  }

  /**
   * @param abortIncompleteMultipartUpload The container for the abort incomplete multipart upload
   * rule.
   */
  public
      fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: CfnBucket.AbortIncompleteMultipartUploadProperty) {
    cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload)
  }

  /**
   * @param expirationDate Specifies the expiration for the lifecycle of the object by specifying an
   * expiry date.
   */
  public fun expirationDate(expirationDate: String) {
    cdkBuilder.expirationDate(expirationDate)
  }

  /**
   * @param expirationInDays Specifies the expiration for the lifecycle of the object in the form of
   * days that the object has been in the S3 on Outposts bucket.
   */
  public fun expirationInDays(expirationInDays: Number) {
    cdkBuilder.expirationInDays(expirationInDays)
  }

  /**
   * @param filter The container for the filter of the lifecycle rule.
   */
  public fun filter(filter: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(filter)
    cdkBuilder.filter(builder.map)
  }

  /**
   * @param filter The container for the filter of the lifecycle rule.
   */
  public fun filter(filter: Any) {
    cdkBuilder.filter(filter)
  }

  /**
   * @param id The unique identifier for the lifecycle rule.
   * The value can't be longer than 255 characters.
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param status If `Enabled` , the rule is currently being applied. 
   * If `Disabled` , the rule is not currently being applied.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnBucket.RuleProperty = cdkBuilder.build()
}
