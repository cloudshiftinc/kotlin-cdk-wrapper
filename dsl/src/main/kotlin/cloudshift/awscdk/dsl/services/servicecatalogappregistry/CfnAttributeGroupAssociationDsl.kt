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

  /**
   * The name or ID of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroupassociation.html#cfn-servicecatalogappregistry-attributegroupassociation-application)
   * @param application The name or ID of the application. 
   */
  public fun application(application: String) {
    cdkBuilder.application(application)
  }

  /**
   * The name or ID of the attribute group that holds the attributes to describe the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroupassociation.html#cfn-servicecatalogappregistry-attributegroupassociation-attributegroup)
   * @param attributeGroup The name or ID of the attribute group that holds the attributes to
   * describe the application. 
   */
  public fun attributeGroup(attributeGroup: String) {
    cdkBuilder.attributeGroup(attributeGroup)
  }

  public fun build(): CfnAttributeGroupAssociation = cdkBuilder.build()
}
