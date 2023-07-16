@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.backup.CfnBackupSelection

@CdkDslMarker
public class CfnBackupSelectionConditionResourceTypePropertyDsl {
  private val cdkBuilder: CfnBackupSelection.ConditionResourceTypeProperty.Builder =
      CfnBackupSelection.ConditionResourceTypeProperty.builder()

  public fun conditionKey(conditionKey: String) {
    cdkBuilder.conditionKey(conditionKey)
  }

  public fun conditionType(conditionType: String) {
    cdkBuilder.conditionType(conditionType)
  }

  public fun conditionValue(conditionValue: String) {
    cdkBuilder.conditionValue(conditionValue)
  }

  public fun build(): CfnBackupSelection.ConditionResourceTypeProperty = cdkBuilder.build()
}
