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

  public fun productId(productId: String) {
    cdkBuilder.productId(productId)
  }

  public fun provisioningArtifactId(provisioningArtifactId: String) {
    cdkBuilder.provisioningArtifactId(provisioningArtifactId)
  }

  public fun serviceActionId(serviceActionId: String) {
    cdkBuilder.serviceActionId(serviceActionId)
  }

  public fun build(): CfnServiceActionAssociation = cdkBuilder.build()
}
