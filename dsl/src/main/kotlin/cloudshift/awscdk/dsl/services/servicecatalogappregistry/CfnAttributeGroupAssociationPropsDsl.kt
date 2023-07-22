@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalogappregistry

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps

@CdkDslMarker
public class CfnAttributeGroupAssociationPropsDsl {
  private val cdkBuilder: CfnAttributeGroupAssociationProps.Builder =
      CfnAttributeGroupAssociationProps.builder()

  /**
   * @param application The name or ID of the application. 
   */
  public fun application(application: String) {
    cdkBuilder.application(application)
  }

  /**
   * @param attributeGroup The name or ID of the attribute group that holds the attributes to
   * describe the application. 
   */
  public fun attributeGroup(attributeGroup: String) {
    cdkBuilder.attributeGroup(attributeGroup)
  }

  public fun build(): CfnAttributeGroupAssociationProps = cdkBuilder.build()
}
