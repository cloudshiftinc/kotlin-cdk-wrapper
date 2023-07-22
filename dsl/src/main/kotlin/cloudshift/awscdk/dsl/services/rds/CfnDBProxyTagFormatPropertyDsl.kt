@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBProxy

/**
 * Metadata assigned to a DB proxy consisting of a key-value pair.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * TagFormatProperty tagFormatProperty = TagFormatProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-tagformat.html)
 */
@CdkDslMarker
public class CfnDBProxyTagFormatPropertyDsl {
  private val cdkBuilder: CfnDBProxy.TagFormatProperty.Builder =
      CfnDBProxy.TagFormatProperty.builder()

  /**
   * @param key A key is the required name of the tag.
   * The string value can be 1-128 Unicode characters in length and can't be prefixed with `aws:` .
   * The string can contain only the set of Unicode letters, digits, white-space, '*', '.', '/', '=',
   * '+', '-' (Java regex: "^([\p{L}\p{Z}\p{N}*.:/=+-]*)$").
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value A value is the optional value of the tag.
   * The string value can be 1-256 Unicode characters in length and can't be prefixed with `aws:` .
   * The string can contain only the set of Unicode letters, digits, white-space, '*', '.', '/', '=',
   * '+', '-' (Java regex: "^([\p{L}\p{Z}\p{N}*.:/=+-]*)$").
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDBProxy.TagFormatProperty = cdkBuilder.build()
}
