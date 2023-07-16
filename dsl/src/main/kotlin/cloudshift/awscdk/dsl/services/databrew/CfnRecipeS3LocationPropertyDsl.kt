@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnRecipe

@CdkDslMarker
public class CfnRecipeS3LocationPropertyDsl {
  private val cdkBuilder: CfnRecipe.S3LocationProperty.Builder =
      CfnRecipe.S3LocationProperty.builder()

  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun build(): CfnRecipe.S3LocationProperty = cdkBuilder.build()
}
