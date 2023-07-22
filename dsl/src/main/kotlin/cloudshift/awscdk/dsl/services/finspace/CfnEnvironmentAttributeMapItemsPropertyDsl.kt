@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.finspace

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.finspace.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentAttributeMapItemsPropertyDsl {
  private val cdkBuilder: CfnEnvironment.AttributeMapItemsProperty.Builder =
      CfnEnvironment.AttributeMapItemsProperty.builder()

  /**
   * @param key The key name of the tag.
   * You can specify a value that is 1 to 128 Unicode characters in length and cannot be prefixed
   * with aws:. You can use any of the following characters: the set of Unicode letters, digits,
   * whitespace, _, ., /, =, +, and -.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value for the tag.
   * You can specify a value that is 0 to 256 Unicode characters in length and cannot be prefixed
   * with aws:. You can use any of the following characters: the set of Unicode letters, digits,
   * whitespace, _, ., /, =, +, and -.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnEnvironment.AttributeMapItemsProperty = cdkBuilder.build()
}
