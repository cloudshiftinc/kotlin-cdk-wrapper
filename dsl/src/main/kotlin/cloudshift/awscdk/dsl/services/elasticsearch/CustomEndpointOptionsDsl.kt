@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions
import software.amazon.awscdk.services.route53.IHostedZone

/**
 * (deprecated) Configures a custom domain endpoint for the ES domain.
 *
 * Example:
 *
 * ```
 * Domain.Builder.create(this, "Domain")
 * .version(ElasticsearchVersion.V7_7)
 * .customEndpoint(CustomEndpointOptions.builder()
 * .domainName("search.example.com")
 * .build())
 * .build();
 * ```
 *
 * @deprecated use opensearchservice module instead
 */
@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class CustomEndpointOptionsDsl {
  private val cdkBuilder: CustomEndpointOptions.Builder = CustomEndpointOptions.builder()

  /**
   * @param certificate The certificate to use.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun certificate(certificate: ICertificate) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param domainName The custom domain name to assign. 
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param hostedZone The hosted zone in Route53 to create the CNAME record in.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun hostedZone(hostedZone: IHostedZone) {
    cdkBuilder.hostedZone(hostedZone)
  }

  public fun build(): CustomEndpointOptions = cdkBuilder.build()
}
