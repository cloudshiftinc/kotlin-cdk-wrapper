@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceInlineCustomDocumentEnrichmentConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty.Builder
      = CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty.builder()

  /**
   * @param condition Configuration of the condition used for the target document attribute or
   * metadata field when ingesting documents into Amazon Kendra.
   */
  public fun condition(condition: IResolvable) {
    cdkBuilder.condition(condition)
  }

  /**
   * @param condition Configuration of the condition used for the target document attribute or
   * metadata field when ingesting documents into Amazon Kendra.
   */
  public fun condition(condition: CfnDataSource.DocumentAttributeConditionProperty) {
    cdkBuilder.condition(condition)
  }

  /**
   * @param documentContentDeletion `TRUE` to delete content if the condition used for the target
   * attribute is met.
   */
  public fun documentContentDeletion(documentContentDeletion: Boolean) {
    cdkBuilder.documentContentDeletion(documentContentDeletion)
  }

  /**
   * @param documentContentDeletion `TRUE` to delete content if the condition used for the target
   * attribute is met.
   */
  public fun documentContentDeletion(documentContentDeletion: IResolvable) {
    cdkBuilder.documentContentDeletion(documentContentDeletion)
  }

  /**
   * @param target Configuration of the target document attribute or metadata field when ingesting
   * documents into Amazon Kendra.
   * You can also include a value.
   */
  public fun target(target: IResolvable) {
    cdkBuilder.target(target)
  }

  /**
   * @param target Configuration of the target document attribute or metadata field when ingesting
   * documents into Amazon Kendra.
   * You can also include a value.
   */
  public fun target(target: CfnDataSource.DocumentAttributeTargetProperty) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty =
      cdkBuilder.build()
}
