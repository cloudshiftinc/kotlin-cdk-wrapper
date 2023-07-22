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

  /**
   * @param conditionDocumentAttributeKey The identifier of the document attribute used for the
   * condition. 
   * For example, 'Source_URI' could be an identifier for the attribute or metadata field that
   * contains source URIs associated with the documents.
   *
   * Amazon Kendra currently does not support `_document_body` as an attribute key used for the
   * condition.
   */
  public fun conditionDocumentAttributeKey(conditionDocumentAttributeKey: String) {
    cdkBuilder.conditionDocumentAttributeKey(conditionDocumentAttributeKey)
  }

  /**
   * @param conditionOnValue The value used by the operator.
   * For example, you can specify the value 'financial' for strings in the 'Source_URI' field that
   * partially match or contain this value.
   */
  public fun conditionOnValue(conditionOnValue: IResolvable) {
    cdkBuilder.conditionOnValue(conditionOnValue)
  }

  /**
   * @param conditionOnValue The value used by the operator.
   * For example, you can specify the value 'financial' for strings in the 'Source_URI' field that
   * partially match or contain this value.
   */
  public fun conditionOnValue(conditionOnValue: CfnDataSource.DocumentAttributeValueProperty) {
    cdkBuilder.conditionOnValue(conditionOnValue)
  }

  /**
   * @param operator The condition operator. 
   * For example, you can use 'Contains' to partially match a string.
   */
  public fun `operator`(`operator`: String) {
    cdkBuilder.`operator`(`operator`)
  }

  public fun build(): CfnDataSource.DocumentAttributeConditionProperty = cdkBuilder.build()
}
