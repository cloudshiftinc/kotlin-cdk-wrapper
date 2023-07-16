@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePaginationConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.PaginationConfigurationProperty.Builder =
      CfnTemplate.PaginationConfigurationProperty.builder()

  public fun pageNumber(pageNumber: Number) {
    cdkBuilder.pageNumber(pageNumber)
  }

  public fun pageSize(pageSize: Number) {
    cdkBuilder.pageSize(pageSize)
  }

  public fun build(): CfnTemplate.PaginationConfigurationProperty = cdkBuilder.build()
}
