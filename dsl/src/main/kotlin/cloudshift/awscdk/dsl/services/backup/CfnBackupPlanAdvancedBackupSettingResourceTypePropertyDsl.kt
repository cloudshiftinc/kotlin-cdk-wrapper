@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupPlan

@CdkDslMarker
public class CfnBackupPlanAdvancedBackupSettingResourceTypePropertyDsl {
  private val cdkBuilder: CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty.Builder =
      CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty.builder()

  public fun backupOptions(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.backupOptions(builder.map)
  }

  public fun backupOptions(backupOptions: Any) {
    cdkBuilder.backupOptions(backupOptions)
  }

  public fun resourceType(resourceType: String) {
    cdkBuilder.resourceType(resourceType)
  }

  public fun build(): CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty = cdkBuilder.build()
}
