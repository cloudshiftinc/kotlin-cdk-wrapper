@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appconfig.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentTagsPropertyDsl {
  private val cdkBuilder: CfnEnvironment.TagsProperty.Builder =
      CfnEnvironment.TagsProperty.builder()

  /**
   * @param key The key-value string map.
   * The valid character set is `[a-zA-Z+-=._:/]` . The tag key can be up to 128 characters and must
   * not start with `aws:` .
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The tag value can be up to 256 characters.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnEnvironment.TagsProperty = cdkBuilder.build()
}
