@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection
import software.constructs.Construct

@CdkDslMarker
public class CfnResourceCollectionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResourceCollection.Builder =
      CfnResourceCollection.Builder.create(scope, id)

  public fun resourceCollectionFilter(resourceCollectionFilter: IResolvable) {
    cdkBuilder.resourceCollectionFilter(resourceCollectionFilter)
  }

  public
      fun resourceCollectionFilter(resourceCollectionFilter: CfnResourceCollection.ResourceCollectionFilterProperty) {
    cdkBuilder.resourceCollectionFilter(resourceCollectionFilter)
  }

  public fun build(): CfnResourceCollection = cdkBuilder.build()
}
