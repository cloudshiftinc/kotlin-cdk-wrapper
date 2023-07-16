@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableFieldCustomTextContentPropertyDsl {
  private val cdkBuilder: CfnDashboard.TableFieldCustomTextContentProperty.Builder =
      CfnDashboard.TableFieldCustomTextContentProperty.builder()

  public fun fontConfiguration(fontConfiguration: IResolvable) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  public fun fontConfiguration(fontConfiguration: CfnDashboard.FontConfigurationProperty) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDashboard.TableFieldCustomTextContentProperty = cdkBuilder.build()
}
