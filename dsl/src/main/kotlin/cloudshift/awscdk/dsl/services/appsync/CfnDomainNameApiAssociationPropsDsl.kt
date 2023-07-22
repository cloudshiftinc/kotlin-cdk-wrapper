@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps

@CdkDslMarker
public class CfnDomainNameApiAssociationPropsDsl {
  private val cdkBuilder: CfnDomainNameApiAssociationProps.Builder =
      CfnDomainNameApiAssociationProps.builder()

  /**
   * @param apiId The API ID. 
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * @param domainName The domain name. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun build(): CfnDomainNameApiAssociationProps = cdkBuilder.build()
}
