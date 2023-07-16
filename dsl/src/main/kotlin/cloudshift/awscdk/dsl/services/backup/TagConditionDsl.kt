@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.backup.TagCondition
import software.amazon.awscdk.services.backup.TagOperation

@CdkDslMarker
public class TagConditionDsl {
  private val cdkBuilder: TagCondition.Builder = TagCondition.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun operation(operation: TagOperation) {
    cdkBuilder.operation(operation)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): TagCondition = cdkBuilder.build()
}
