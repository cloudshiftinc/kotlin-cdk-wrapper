@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.backup.CfnBackupSelection

@CdkDslMarker
public class CfnBackupSelectionConditionParameterPropertyDsl {
  private val cdkBuilder: CfnBackupSelection.ConditionParameterProperty.Builder =
      CfnBackupSelection.ConditionParameterProperty.builder()

  /**
   * @param conditionKey The key in a key-value pair.
   * For example, in the tag `Department: Accounting` , `Department` is the key.
   */
  public fun conditionKey(conditionKey: String) {
    cdkBuilder.conditionKey(conditionKey)
  }

  /**
   * @param conditionValue The value in a key-value pair.
   * For example, in the tag `Department: Accounting` , `Accounting` is the value.
   */
  public fun conditionValue(conditionValue: String) {
    cdkBuilder.conditionValue(conditionValue)
  }

  public fun build(): CfnBackupSelection.ConditionParameterProperty = cdkBuilder.build()
}
