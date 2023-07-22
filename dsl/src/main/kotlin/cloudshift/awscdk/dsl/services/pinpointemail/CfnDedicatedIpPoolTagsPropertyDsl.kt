@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool

@CdkDslMarker
public class CfnDedicatedIpPoolTagsPropertyDsl {
  private val cdkBuilder: CfnDedicatedIpPool.TagsProperty.Builder =
      CfnDedicatedIpPool.TagsProperty.builder()

  /**
   * @param key One part of a key-value pair that defines a tag.
   * The maximum length of a tag key is 128 characters. The minimum length is 1 character.
   *
   * If you specify tags for the dedicated IP pool, then this value is required.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The optional part of a key-value pair that defines a tag.
   * The maximum length of a tag value is 256 characters. The minimum length is 0 characters. If you
   * don’t want a resource to have a specific tag value, don’t specify a value for this parameter.
   * Amazon Pinpoint will set the value to an empty string.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDedicatedIpPool.TagsProperty = cdkBuilder.build()
}
