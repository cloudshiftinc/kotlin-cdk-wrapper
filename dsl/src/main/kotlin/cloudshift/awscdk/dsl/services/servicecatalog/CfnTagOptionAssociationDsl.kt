@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnTagOptionAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTagOptionAssociation.Builder =
      CfnTagOptionAssociation.Builder.create(scope, id)

  /**
   * The resource identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-resourceid)
   * @param resourceId The resource identifier. 
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  /**
   * The TagOption identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-tagoptionid)
   * @param tagOptionId The TagOption identifier. 
   */
  public fun tagOptionId(tagOptionId: String) {
    cdkBuilder.tagOptionId(tagOptionId)
  }

  public fun build(): CfnTagOptionAssociation = cdkBuilder.build()
}
