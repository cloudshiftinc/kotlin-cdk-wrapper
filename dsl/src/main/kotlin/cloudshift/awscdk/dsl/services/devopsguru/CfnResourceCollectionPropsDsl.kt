@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection
import software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps

@CdkDslMarker
public class CfnResourceCollectionPropsDsl {
  private val cdkBuilder: CfnResourceCollectionProps.Builder = CfnResourceCollectionProps.builder()

  /**
   * @param resourceCollectionFilter Information about a filter used to specify which AWS resources
   * are analyzed for anomalous behavior by DevOps Guru. 
   */
  public fun resourceCollectionFilter(resourceCollectionFilter: IResolvable) {
    cdkBuilder.resourceCollectionFilter(resourceCollectionFilter)
  }

  /**
   * @param resourceCollectionFilter Information about a filter used to specify which AWS resources
   * are analyzed for anomalous behavior by DevOps Guru. 
   */
  public
      fun resourceCollectionFilter(resourceCollectionFilter: CfnResourceCollection.ResourceCollectionFilterProperty) {
    cdkBuilder.resourceCollectionFilter(resourceCollectionFilter)
  }

  public fun build(): CfnResourceCollectionProps = cdkBuilder.build()
}
