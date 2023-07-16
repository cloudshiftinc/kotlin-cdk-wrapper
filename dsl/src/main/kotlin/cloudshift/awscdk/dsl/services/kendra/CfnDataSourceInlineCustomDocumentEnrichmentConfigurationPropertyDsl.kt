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

  public fun condition(condition: IResolvable) {
    cdkBuilder.condition(condition)
  }

  public fun condition(condition: CfnDataSource.DocumentAttributeConditionProperty) {
    cdkBuilder.condition(condition)
  }

  public fun documentContentDeletion(documentContentDeletion: Boolean) {
    cdkBuilder.documentContentDeletion(documentContentDeletion)
  }

  public fun documentContentDeletion(documentContentDeletion: IResolvable) {
    cdkBuilder.documentContentDeletion(documentContentDeletion)
  }

  public fun target(target: IResolvable) {
    cdkBuilder.target(target)
  }

  public fun target(target: CfnDataSource.DocumentAttributeTargetProperty) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty =
      cdkBuilder.build()
}
