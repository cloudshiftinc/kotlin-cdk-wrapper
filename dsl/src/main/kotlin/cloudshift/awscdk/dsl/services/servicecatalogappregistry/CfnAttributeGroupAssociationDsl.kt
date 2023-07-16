@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalogappregistry

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnAttributeGroupAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAttributeGroupAssociation.Builder =
      CfnAttributeGroupAssociation.Builder.create(scope, id)

  public fun application(application: String) {
    cdkBuilder.application(application)
  }

  public fun attributeGroup(attributeGroup: String) {
    cdkBuilder.attributeGroup(attributeGroup)
  }

  public fun build(): CfnAttributeGroupAssociation = cdkBuilder.build()
}
