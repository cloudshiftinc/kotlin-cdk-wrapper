@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketFilterRulePropertyDsl {
  private val cdkBuilder: CfnBucket.FilterRuleProperty.Builder =
      CfnBucket.FilterRuleProperty.builder()

  /**
   * @param name The object key name prefix or suffix identifying one or more objects to which the
   * filtering rule applies. 
   * The maximum length is 1,024 characters. Overlapping prefixes and suffixes are not supported.
   * For more information, see [Configuring Event
   * Notifications](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the
   * *Amazon S3 User Guide* .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value that the filter searches for in object key names. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnBucket.FilterRuleProperty = cdkBuilder.build()
}
