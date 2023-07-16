@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.servicecatalog.ProductStackProps

@CdkDslMarker
public class ProductStackPropsDsl {
  private val cdkBuilder: ProductStackProps.Builder = ProductStackProps.builder()

  public fun assetBucket(assetBucket: IBucket) {
    cdkBuilder.assetBucket(assetBucket)
  }

  public fun build(): ProductStackProps = cdkBuilder.build()
}
