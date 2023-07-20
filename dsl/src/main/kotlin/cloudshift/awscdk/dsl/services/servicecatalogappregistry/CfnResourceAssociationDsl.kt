@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalogappregistry

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnResourceAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResourceAssociation.Builder =
      CfnResourceAssociation.Builder.create(scope, id)

  public fun application(application: String) {
    cdkBuilder.application(application)
  }

  public fun resource(resource: String) {
    cdkBuilder.resource(resource)
  }

  public fun resourceType(resourceType: String) {
    cdkBuilder.resourceType(resourceType)
  }

  public fun build(): CfnResourceAssociation = cdkBuilder.build()
}
