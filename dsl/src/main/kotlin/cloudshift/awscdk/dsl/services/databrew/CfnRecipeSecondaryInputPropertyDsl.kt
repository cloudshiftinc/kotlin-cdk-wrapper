@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRecipe

@CdkDslMarker
public class CfnRecipeSecondaryInputPropertyDsl {
  private val cdkBuilder: CfnRecipe.SecondaryInputProperty.Builder =
      CfnRecipe.SecondaryInputProperty.builder()

  public fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable) {
    cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition)
  }

  public
      fun dataCatalogInputDefinition(dataCatalogInputDefinition: CfnRecipe.DataCatalogInputDefinitionProperty) {
    cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition)
  }

  public fun s3InputDefinition(s3InputDefinition: IResolvable) {
    cdkBuilder.s3InputDefinition(s3InputDefinition)
  }

  public fun s3InputDefinition(s3InputDefinition: CfnRecipe.S3LocationProperty) {
    cdkBuilder.s3InputDefinition(s3InputDefinition)
  }

  public fun build(): CfnRecipe.SecondaryInputProperty = cdkBuilder.build()
}
