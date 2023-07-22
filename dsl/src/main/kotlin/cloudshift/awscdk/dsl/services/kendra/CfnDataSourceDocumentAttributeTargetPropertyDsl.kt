@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceDocumentAttributeTargetPropertyDsl {
  private val cdkBuilder: CfnDataSource.DocumentAttributeTargetProperty.Builder =
      CfnDataSource.DocumentAttributeTargetProperty.builder()

  /**
   * @param targetDocumentAttributeKey The identifier of the target document attribute or metadata
   * field. 
   * For example, 'Department' could be an identifier for the target attribute or metadata field
   * that includes the department names associated with the documents.
   */
  public fun targetDocumentAttributeKey(targetDocumentAttributeKey: String) {
    cdkBuilder.targetDocumentAttributeKey(targetDocumentAttributeKey)
  }

  /**
   * @param targetDocumentAttributeValue The target value you want to create for the target
   * attribute.
   * For example, 'Finance' could be the target value for the target attribute key 'Department'.
   */
  public fun targetDocumentAttributeValue(targetDocumentAttributeValue: IResolvable) {
    cdkBuilder.targetDocumentAttributeValue(targetDocumentAttributeValue)
  }

  /**
   * @param targetDocumentAttributeValue The target value you want to create for the target
   * attribute.
   * For example, 'Finance' could be the target value for the target attribute key 'Department'.
   */
  public
      fun targetDocumentAttributeValue(targetDocumentAttributeValue: CfnDataSource.DocumentAttributeValueProperty) {
    cdkBuilder.targetDocumentAttributeValue(targetDocumentAttributeValue)
  }

  /**
   * @param targetDocumentAttributeValueDeletion `TRUE` to delete the existing target value for your
   * specified target attribute key.
   * You cannot create a target value and set this to `TRUE` . To create a target value (
   * `TargetDocumentAttributeValue` ), set this to `FALSE` .
   */
  public fun targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion: Boolean) {
    cdkBuilder.targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion)
  }

  /**
   * @param targetDocumentAttributeValueDeletion `TRUE` to delete the existing target value for your
   * specified target attribute key.
   * You cannot create a target value and set this to `TRUE` . To create a target value (
   * `TargetDocumentAttributeValue` ), set this to `FALSE` .
   */
  public
      fun targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion: IResolvable) {
    cdkBuilder.targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion)
  }

  public fun build(): CfnDataSource.DocumentAttributeTargetProperty = cdkBuilder.build()
}
