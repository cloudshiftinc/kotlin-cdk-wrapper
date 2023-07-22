@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowMetadataCatalogConfigPropertyDsl {
  private val cdkBuilder: CfnFlow.MetadataCatalogConfigProperty.Builder =
      CfnFlow.MetadataCatalogConfigProperty.builder()

  /**
   * @param glueDataCatalog Trigger settings of the flow.
   */
  public fun glueDataCatalog(glueDataCatalog: IResolvable) {
    cdkBuilder.glueDataCatalog(glueDataCatalog)
  }

  /**
   * @param glueDataCatalog Trigger settings of the flow.
   */
  public fun glueDataCatalog(glueDataCatalog: CfnFlow.GlueDataCatalogProperty) {
    cdkBuilder.glueDataCatalog(glueDataCatalog)
  }

  public fun build(): CfnFlow.MetadataCatalogConfigProperty = cdkBuilder.build()
}
