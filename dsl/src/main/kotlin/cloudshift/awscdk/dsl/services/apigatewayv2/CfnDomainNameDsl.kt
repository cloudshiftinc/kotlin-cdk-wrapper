@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName
import software.constructs.Construct

/**
 * The `AWS::ApiGatewayV2::DomainName` resource specifies a custom domain name for your API in
 * Amazon API Gateway (API Gateway).
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
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * Object tags;
 * CfnDomainName cfnDomainName = CfnDomainName.Builder.create(this, "MyCfnDomainName")
 * .domainName("domainName")
 * // the properties below are optional
 * .domainNameConfigurations(List.of(DomainNameConfigurationProperty.builder()
 * .certificateArn("certificateArn")
 * .certificateName("certificateName")
 * .endpointType("endpointType")
 * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
 * .securityPolicy("securityPolicy")
 * .build()))
 * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
 * .truststoreUri("truststoreUri")
 * .truststoreVersion("truststoreVersion")
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html)
 */
@CdkDslMarker
public class CfnDomainNameDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDomainName.Builder = CfnDomainName.Builder.create(scope, id)

  private val _domainNameConfigurations: MutableList<Any> = mutableListOf()

  /**
   * The custom domain name for your API in Amazon API Gateway.
   *
   * Uppercase letters are not supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainname)
   * @param domainName The custom domain name for your API in Amazon API Gateway. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * The domain name configurations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainnameconfigurations)
   * @param domainNameConfigurations The domain name configurations. 
   */
  public fun domainNameConfigurations(vararg domainNameConfigurations: Any) {
    _domainNameConfigurations.addAll(listOf(*domainNameConfigurations))
  }

  /**
   * The domain name configurations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainnameconfigurations)
   * @param domainNameConfigurations The domain name configurations. 
   */
  public fun domainNameConfigurations(domainNameConfigurations: Collection<Any>) {
    _domainNameConfigurations.addAll(domainNameConfigurations)
  }

  /**
   * The domain name configurations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainnameconfigurations)
   * @param domainNameConfigurations The domain name configurations. 
   */
  public fun domainNameConfigurations(domainNameConfigurations: IResolvable) {
    cdkBuilder.domainNameConfigurations(domainNameConfigurations)
  }

  /**
   * The mutual TLS authentication configuration for a custom domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-mutualtlsauthentication)
   * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom domain
   * name. 
   */
  public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
    cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
  }

  /**
   * The mutual TLS authentication configuration for a custom domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-mutualtlsauthentication)
   * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom domain
   * name. 
   */
  public
      fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty) {
    cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
  }

  /**
   * The collection of tags associated with a domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-tags)
   * @param tags The collection of tags associated with a domain name. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * The collection of tags associated with a domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-tags)
   * @param tags The collection of tags associated with a domain name. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnDomainName {
    if(_domainNameConfigurations.isNotEmpty())
        cdkBuilder.domainNameConfigurations(_domainNameConfigurations)
    return cdkBuilder.build()
  }
}
