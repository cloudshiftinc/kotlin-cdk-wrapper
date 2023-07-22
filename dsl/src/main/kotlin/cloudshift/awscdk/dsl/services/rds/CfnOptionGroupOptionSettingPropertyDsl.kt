@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnOptionGroup

@CdkDslMarker
public class CfnOptionGroupOptionSettingPropertyDsl {
  private val cdkBuilder: CfnOptionGroup.OptionSettingProperty.Builder =
      CfnOptionGroup.OptionSettingProperty.builder()

  /**
   * @param name The name of the option that has settings that you can set.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The current value of the option setting.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnOptionGroup.OptionSettingProperty = cdkBuilder.build()
}
