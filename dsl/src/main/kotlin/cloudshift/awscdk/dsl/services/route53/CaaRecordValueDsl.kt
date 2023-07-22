@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.route53.CaaRecordValue
import software.amazon.awscdk.services.route53.CaaTag

@CdkDslMarker
public class CaaRecordValueDsl {
  private val cdkBuilder: CaaRecordValue.Builder = CaaRecordValue.builder()

  /**
   * @param flag The flag. 
   */
  public fun flag(flag: Number) {
    cdkBuilder.flag(flag)
  }

  /**
   * @param tag The tag. 
   */
  public fun tag(tag: CaaTag) {
    cdkBuilder.tag(tag)
  }

  /**
   * @param value The value associated with the tag. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CaaRecordValue = cdkBuilder.build()
}
