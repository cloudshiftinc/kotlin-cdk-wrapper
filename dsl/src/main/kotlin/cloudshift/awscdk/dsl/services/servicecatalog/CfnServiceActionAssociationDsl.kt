@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnServiceActionAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnServiceActionAssociation.Builder =
      CfnServiceActionAssociation.Builder.create(scope, id)

  /**
   * The product identifier.
   *
   * For example, `prod-abcdzk7xy33qa` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-productid)
   * @param productId The product identifier. 
   */
  public fun productId(productId: String) {
    cdkBuilder.productId(productId)
  }

  /**
   * The identifier of the provisioning artifact.
   *
   * For example, `pa-4abcdjnxjj6ne` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-provisioningartifactid)
   * @param provisioningArtifactId The identifier of the provisioning artifact. 
   */
  public fun provisioningArtifactId(provisioningArtifactId: String) {
    cdkBuilder.provisioningArtifactId(provisioningArtifactId)
  }

  /**
   * The self-service action identifier.
   *
   * For example, `act-fs7abcd89wxyz` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-serviceactionid)
   * @param serviceActionId The self-service action identifier. 
   */
  public fun serviceActionId(serviceActionId: String) {
    cdkBuilder.serviceActionId(serviceActionId)
  }

  public fun build(): CfnServiceActionAssociation = cdkBuilder.build()
}
