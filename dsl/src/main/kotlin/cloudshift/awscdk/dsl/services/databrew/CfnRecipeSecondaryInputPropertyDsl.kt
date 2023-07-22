@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRecipe

@CdkDslMarker
public class CfnRecipeSecondaryInputPropertyDsl {
  private val cdkBuilder: CfnRecipe.SecondaryInputProperty.Builder =
      CfnRecipe.SecondaryInputProperty.builder()

  /**
   * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
   */
  public fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable) {
    cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition)
  }

  /**
   * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
   */
  public
      fun dataCatalogInputDefinition(dataCatalogInputDefinition: CfnRecipe.DataCatalogInputDefinitionProperty) {
    cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition)
  }

  /**
   * @param s3InputDefinition The Amazon S3 location where the data is stored.
   */
  public fun s3InputDefinition(s3InputDefinition: IResolvable) {
    cdkBuilder.s3InputDefinition(s3InputDefinition)
  }

  /**
   * @param s3InputDefinition The Amazon S3 location where the data is stored.
   */
  public fun s3InputDefinition(s3InputDefinition: CfnRecipe.S3LocationProperty) {
    cdkBuilder.s3InputDefinition(s3InputDefinition)
  }

  public fun build(): CfnRecipe.SecondaryInputProperty = cdkBuilder.build()
}
