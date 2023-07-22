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
import software.constructs.Construct

/**
 * The `AWS::ApiGateway::DomainName` resource specifies a custom domain name for your API in API
 * Gateway.
 *
 * You can use a custom domain name to provide a URL that's more intuitive and easier to recall. For
 * more information about using custom domain names, see [Set up Custom Domain Name for an API in API
 * Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html) in
 * the *API Gateway Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnDomainName cfnDomainName = CfnDomainName.Builder.create(this, "MyCfnDomainName")
 * .certificateArn("certificateArn")
 * .domainName("domainName")
 * .endpointConfiguration(EndpointConfigurationProperty.builder()
 * .types(List.of("types"))
 * .build())
 * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
 * .truststoreUri("truststoreUri")
 * .truststoreVersion("truststoreVersion")
 * .build())
 * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
 * .regionalCertificateArn("regionalCertificateArn")
 * .securityPolicy("securityPolicy")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
 */
@CdkDslMarker
public class CfnDomainNameDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDomainName.Builder = CfnDomainName.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The reference to an AWS -managed certificate that will be used by edge-optimized endpoint for
   * this domain name.
   *
   * AWS Certificate Manager is the only supported source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn)
   * @param certificateArn The reference to an AWS -managed certificate that will be used by
   * edge-optimized endpoint for this domain name. 
   */
  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  /**
   * The custom domain name as an API host name, for example, `my-api.example.com` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname)
   * @param domainName The custom domain name as an API host name, for example, `my-api.example.com`
   * . 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-endpointconfiguration)
   * @param endpointConfiguration The endpoint configuration of this DomainName showing the endpoint
   * types of the domain name. 
   */
  public fun endpointConfiguration(endpointConfiguration: IResolvable) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  /**
   * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-endpointconfiguration)
   * @param endpointConfiguration The endpoint configuration of this DomainName showing the endpoint
   * types of the domain name. 
   */
  public
      fun endpointConfiguration(endpointConfiguration: CfnDomainName.EndpointConfigurationProperty) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  /**
   * The mutual TLS authentication configuration for a custom domain name.
   *
   * If specified, API Gateway performs two-way authentication between the client and the server.
   * Clients must present a trusted certificate to access your API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-mutualtlsauthentication)
   * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom domain
   * name. 
   */
  public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
    cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
  }

  /**
   * The mutual TLS authentication configuration for a custom domain name.
   *
   * If specified, API Gateway performs two-way authentication between the client and the server.
   * Clients must present a trusted certificate to access your API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-mutualtlsauthentication)
   * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom domain
   * name. 
   */
  public
      fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty) {
    cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
  }

  /**
   * The ARN of the public certificate issued by ACM to validate ownership of your custom domain.
   *
   * Only required when configuring mutual TLS and using an ACM imported or private CA certificate
   * ARN as the RegionalCertificateArn.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-ownershipverificationcertificatearn)
   * @param ownershipVerificationCertificateArn The ARN of the public certificate issued by ACM to
   * validate ownership of your custom domain. 
   */
  public fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
    cdkBuilder.ownershipVerificationCertificateArn(ownershipVerificationCertificateArn)
  }

  /**
   * The reference to an AWS -managed certificate that will be used for validating the regional
   * domain name.
   *
   * AWS Certificate Manager is the only supported source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn)
   * @param regionalCertificateArn The reference to an AWS -managed certificate that will be used
   * for validating the regional domain name. 
   */
  public fun regionalCertificateArn(regionalCertificateArn: String) {
    cdkBuilder.regionalCertificateArn(regionalCertificateArn)
  }

  /**
   * The Transport Layer Security (TLS) version + cipher suite for this DomainName.
   *
   * The valid values are `TLS_1_0` and `TLS_1_2` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-securitypolicy)
   * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
   * DomainName. 
   */
  public fun securityPolicy(securityPolicy: String) {
    cdkBuilder.securityPolicy(securityPolicy)
  }

  /**
   * The collection of tags.
   *
   * Each tag element is associated with a given resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-tags)
   * @param tags The collection of tags. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The collection of tags.
   *
   * Each tag element is associated with a given resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-tags)
   * @param tags The collection of tags. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDomainName {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
