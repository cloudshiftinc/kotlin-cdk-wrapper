@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@CdkDslMarker
public class CfnDomainIdpPropertyDsl {
  private val cdkBuilder: CfnDomain.IdpProperty.Builder = CfnDomain.IdpProperty.builder()

  /**
   * @param entityId The unique entity ID of the application in the SAML identity provider. 
   */
  public fun entityId(entityId: String) {
    cdkBuilder.entityId(entityId)
  }

  /**
   * @param metadataContent The metadata of the SAML application, in XML format. 
   */
  public fun metadataContent(metadataContent: String) {
    cdkBuilder.metadataContent(metadataContent)
  }

  public fun build(): CfnDomain.IdpProperty = cdkBuilder.build()
}
