@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.DomainNameAttributes

/**
 * Example:
 *
 * ```
 * RestApi api;
 * IDomainName domainName = DomainName.fromDomainNameAttributes(this, "DomainName",
 * DomainNameAttributes.builder()
 * .domainName("domainName")
 * .domainNameAliasHostedZoneId("domainNameAliasHostedZoneId")
 * .domainNameAliasTarget("domainNameAliasTarget")
 * .build());
 * BasePathMapping.Builder.create(this, "BasePathMapping")
 * .domainName(domainName)
 * .restApi(api)
 * .build();
 * ```
 */
@CdkDslMarker
public class DomainNameAttributesDsl {
  private val cdkBuilder: DomainNameAttributes.Builder = DomainNameAttributes.builder()

  /**
   * @param domainName The domain name (e.g. `example.com`). 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param domainNameAliasHostedZoneId The Route53 hosted zone ID to use in order to connect a
   * record set to this domain through an alias. 
   */
  public fun domainNameAliasHostedZoneId(domainNameAliasHostedZoneId: String) {
    cdkBuilder.domainNameAliasHostedZoneId(domainNameAliasHostedZoneId)
  }

  /**
   * @param domainNameAliasTarget The Route53 alias target to use in order to connect a record set
   * to this domain through an alias. 
   */
  public fun domainNameAliasTarget(domainNameAliasTarget: String) {
    cdkBuilder.domainNameAliasTarget(domainNameAliasTarget)
  }

  public fun build(): DomainNameAttributes = cdkBuilder.build()
}
