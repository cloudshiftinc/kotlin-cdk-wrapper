@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnDomainName
import software.amazon.awscdk.services.apigateway.CfnDomainNameProps

@CdkDslMarker
public class CfnDomainNamePropsDsl {
  private val cdkBuilder: CfnDomainNameProps.Builder = CfnDomainNameProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param certificateArn The reference to an AWS -managed certificate that will be used by
   * edge-optimized endpoint for this domain name.
   * AWS Certificate Manager is the only supported source.
   */
  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  /**
   * @param domainName The custom domain name as an API host name, for example, `my-api.example.com`
   * .
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param endpointConfiguration The endpoint configuration of this DomainName showing the endpoint
   * types of the domain name.
   */
  public fun endpointConfiguration(endpointConfiguration: IResolvable) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  /**
   * @param endpointConfiguration The endpoint configuration of this DomainName showing the endpoint
   * types of the domain name.
   */
  public
      fun endpointConfiguration(endpointConfiguration: CfnDomainName.EndpointConfigurationProperty) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  /**
   * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom domain
   * name.
   * If specified, API Gateway performs two-way authentication between the client and the server.
   * Clients must present a trusted certificate to access your API.
   */
  public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
    cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
  }

  /**
   * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom domain
   * name.
   * If specified, API Gateway performs two-way authentication between the client and the server.
   * Clients must present a trusted certificate to access your API.
   */
  public
      fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty) {
    cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
  }

  /**
   * @param ownershipVerificationCertificateArn The ARN of the public certificate issued by ACM to
   * validate ownership of your custom domain.
   * Only required when configuring mutual TLS and using an ACM imported or private CA certificate
   * ARN as the RegionalCertificateArn.
   */
  public fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
    cdkBuilder.ownershipVerificationCertificateArn(ownershipVerificationCertificateArn)
  }

  /**
   * @param regionalCertificateArn The reference to an AWS -managed certificate that will be used
   * for validating the regional domain name.
   * AWS Certificate Manager is the only supported source.
   */
  public fun regionalCertificateArn(regionalCertificateArn: String) {
    cdkBuilder.regionalCertificateArn(regionalCertificateArn)
  }

  /**
   * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
   * DomainName.
   * The valid values are `TLS_1_0` and `TLS_1_2` .
   */
  public fun securityPolicy(securityPolicy: String) {
    cdkBuilder.securityPolicy(securityPolicy)
  }

  /**
   * @param tags The collection of tags.
   * Each tag element is associated with a given resource.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The collection of tags.
   * Each tag element is associated with a given resource.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDomainNameProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
