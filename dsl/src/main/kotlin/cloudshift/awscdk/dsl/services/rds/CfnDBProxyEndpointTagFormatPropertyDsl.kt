@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBProxyEndpoint

@CdkDslMarker
public class CfnDBProxyEndpointTagFormatPropertyDsl {
  private val cdkBuilder: CfnDBProxyEndpoint.TagFormatProperty.Builder =
      CfnDBProxyEndpoint.TagFormatProperty.builder()

  /**
   * @param key A value is the optional value of the tag.
   * The string value can be 1-256 Unicode characters in length and can't be prefixed with `aws:` .
   * The string can contain only the set of Unicode letters, digits, white-space, '*', '.', '/', '=',
   * '+', '-' (Java regex: "^([\p{L}\p{Z}\p{N}*.:/=+-]*)$").
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value Metadata assigned to a DB instance consisting of a key-value pair.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDBProxyEndpoint.TagFormatProperty = cdkBuilder.build()
}
