@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet

/**
 * An object that defines the tags (keys and values) that you want to associate with the
 * configuration set.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpointemail.*;
 * TagsProperty tagsProperty = TagsProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-tags.html)
 */
@CdkDslMarker
public class CfnConfigurationSetTagsPropertyDsl {
  private val cdkBuilder: CfnConfigurationSet.TagsProperty.Builder =
      CfnConfigurationSet.TagsProperty.builder()

  /**
   * @param key One part of a key-value pair that defines a tag.
   * The maximum length of a tag key is 128 characters. The minimum length is 1 character.
   *
   * If you specify tags for the configuration set, then this value is required.
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

  public fun build(): CfnConfigurationSet.TagsProperty = cdkBuilder.build()
}
