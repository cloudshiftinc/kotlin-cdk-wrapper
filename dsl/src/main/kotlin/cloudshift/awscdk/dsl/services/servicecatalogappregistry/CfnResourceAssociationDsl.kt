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

  /**
   * The name or ID of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html#cfn-servicecatalogappregistry-resourceassociation-application)
   * @param application The name or ID of the application. 
   */
  public fun application(application: String) {
    cdkBuilder.application(application)
  }

  /**
   * The name or ID of the resource of which the application will be associated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html#cfn-servicecatalogappregistry-resourceassociation-resource)
   * @param resource The name or ID of the resource of which the application will be associated. 
   */
  public fun resource(resource: String) {
    cdkBuilder.resource(resource)
  }

  /**
   * The type of resource of which the application will be associated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html#cfn-servicecatalogappregistry-resourceassociation-resourcetype)
   * @param resourceType The type of resource of which the application will be associated. 
   */
  public fun resourceType(resourceType: String) {
    cdkBuilder.resourceType(resourceType)
  }

  public fun build(): CfnResourceAssociation = cdkBuilder.build()
}
