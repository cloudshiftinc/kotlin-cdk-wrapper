@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalogappregistry

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps

@CdkDslMarker
public class CfnResourceAssociationPropsDsl {
  private val cdkBuilder: CfnResourceAssociationProps.Builder =
      CfnResourceAssociationProps.builder()

  public fun application(application: String) {
    cdkBuilder.application(application)
  }

  public fun resource(resource: String) {
    cdkBuilder.resource(resource)
  }

  public fun resourceType(resourceType: String) {
    cdkBuilder.resourceType(resourceType)
  }

  public fun build(): CfnResourceAssociationProps = cdkBuilder.build()
}
