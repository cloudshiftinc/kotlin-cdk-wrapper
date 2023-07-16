@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceDocumentAttributeConditionPropertyDsl {
  private val cdkBuilder: CfnDataSource.DocumentAttributeConditionProperty.Builder =
      CfnDataSource.DocumentAttributeConditionProperty.builder()

  public fun conditionDocumentAttributeKey(conditionDocumentAttributeKey: String) {
    cdkBuilder.conditionDocumentAttributeKey(conditionDocumentAttributeKey)
  }

  public fun conditionOnValue(conditionOnValue: IResolvable) {
    cdkBuilder.conditionOnValue(conditionOnValue)
  }

  public fun conditionOnValue(conditionOnValue: CfnDataSource.DocumentAttributeValueProperty) {
    cdkBuilder.conditionOnValue(conditionOnValue)
  }

  public fun `operator`(`operator`: String) {
    cdkBuilder.`operator`(`operator`)
  }

  public fun build(): CfnDataSource.DocumentAttributeConditionProperty = cdkBuilder.build()
}
