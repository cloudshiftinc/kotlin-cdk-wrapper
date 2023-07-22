@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@CdkDslMarker
public class CfnDomainDomainEndpointOptionsPropertyDsl {
  private val cdkBuilder: CfnDomain.DomainEndpointOptionsProperty.Builder =
      CfnDomain.DomainEndpointOptionsProperty.builder()

  /**
   * @param customEndpoint The fully qualified URL for your custom endpoint.
   * Required if you enabled a custom endpoint for the domain.
   */
  public fun customEndpoint(customEndpoint: String) {
    cdkBuilder.customEndpoint(customEndpoint)
  }

  /**
   * @param customEndpointCertificateArn The AWS Certificate Manager ARN for your domain's SSL/TLS
   * certificate.
   * Required if you enabled a custom endpoint for the domain.
   */
  public fun customEndpointCertificateArn(customEndpointCertificateArn: String) {
    cdkBuilder.customEndpointCertificateArn(customEndpointCertificateArn)
  }

  /**
   * @param customEndpointEnabled True to enable a custom endpoint for the domain.
   * If enabled, you must also provide values for `CustomEndpoint` and
   * `CustomEndpointCertificateArn` .
   */
  public fun customEndpointEnabled(customEndpointEnabled: Boolean) {
    cdkBuilder.customEndpointEnabled(customEndpointEnabled)
  }

  /**
   * @param customEndpointEnabled True to enable a custom endpoint for the domain.
   * If enabled, you must also provide values for `CustomEndpoint` and
   * `CustomEndpointCertificateArn` .
   */
  public fun customEndpointEnabled(customEndpointEnabled: IResolvable) {
    cdkBuilder.customEndpointEnabled(customEndpointEnabled)
  }

  /**
   * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
   * Required if you enable fine-grained access control in
   * [AdvancedSecurityOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
   * .
   */
  public fun enforceHttps(enforceHttps: Boolean) {
    cdkBuilder.enforceHttps(enforceHttps)
  }

  /**
   * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
   * Required if you enable fine-grained access control in
   * [AdvancedSecurityOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
   * .
   */
  public fun enforceHttps(enforceHttps: IResolvable) {
    cdkBuilder.enforceHttps(enforceHttps)
  }

  /**
   * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain. Valid
   * values are TLS 1.3 (recommended) or 1.2:.
   * * `Policy-Min-TLS-1-0-2019-07`
   * * `Policy-Min-TLS-1-2-2019-07`
   */
  public fun tlsSecurityPolicy(tlsSecurityPolicy: String) {
    cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy)
  }

  public fun build(): CfnDomain.DomainEndpointOptionsProperty = cdkBuilder.build()
}
