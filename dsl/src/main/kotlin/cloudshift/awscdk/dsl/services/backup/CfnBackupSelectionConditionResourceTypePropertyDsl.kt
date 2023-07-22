@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.backup.CfnBackupSelection

@CdkDslMarker
public class CfnBackupSelectionConditionResourceTypePropertyDsl {
  private val cdkBuilder: CfnBackupSelection.ConditionResourceTypeProperty.Builder =
      CfnBackupSelection.ConditionResourceTypeProperty.builder()

  /**
   * @param conditionKey The key in a key-value pair. 
   * For example, in `"Department": "accounting"` , `"Department"` is the key.
   */
  public fun conditionKey(conditionKey: String) {
    cdkBuilder.conditionKey(conditionKey)
  }

  /**
   * @param conditionType An operation, such as `STRINGEQUALS` , that is applied to a key-value pair
   * used to filter resources in a selection. 
   */
  public fun conditionType(conditionType: String) {
    cdkBuilder.conditionType(conditionType)
  }

  /**
   * @param conditionValue The value in a key-value pair. 
   * For example, in `"Department": "accounting"` , `"accounting"` is the value.
   */
  public fun conditionValue(conditionValue: String) {
    cdkBuilder.conditionValue(conditionValue)
  }

  public fun build(): CfnBackupSelection.ConditionResourceTypeProperty = cdkBuilder.build()
}
