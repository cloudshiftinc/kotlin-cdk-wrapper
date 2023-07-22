@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opensearchservice.DomainAttributes

/**
 * Reference to an Amazon OpenSearch Service domain.
 *
 * Example:
 *
 * ```
 * String domainArn = Fn.importValue("another-cf-stack-export-domain-arn");
 * String domainEndpoint = Fn.importValue("another-cf-stack-export-domain-endpoint");
 * IDomain domain = Domain.fromDomainAttributes(this, "ImportedDomain", DomainAttributes.builder()
 * .domainArn(domainArn)
 * .domainEndpoint(domainEndpoint)
 * .build());
 * ```
 */
@CdkDslMarker
public class DomainAttributesDsl {
  private val cdkBuilder: DomainAttributes.Builder = DomainAttributes.builder()

  /**
   * @param domainArn The ARN of the Amazon OpenSearch Service domain. 
   */
  public fun domainArn(domainArn: String) {
    cdkBuilder.domainArn(domainArn)
  }

  /**
   * @param domainEndpoint The domain endpoint of the Amazon OpenSearch Service domain. 
   */
  public fun domainEndpoint(domainEndpoint: String) {
    cdkBuilder.domainEndpoint(domainEndpoint)
  }

  public fun build(): DomainAttributes = cdkBuilder.build()
}
