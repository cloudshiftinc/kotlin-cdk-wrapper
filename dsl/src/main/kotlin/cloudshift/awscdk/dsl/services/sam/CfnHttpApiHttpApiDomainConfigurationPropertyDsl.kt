@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnHttpApi

@CdkDslMarker
public class CfnHttpApiHttpApiDomainConfigurationPropertyDsl {
  private val cdkBuilder: CfnHttpApi.HttpApiDomainConfigurationProperty.Builder =
      CfnHttpApi.HttpApiDomainConfigurationProperty.builder()

  /**
   * @param basePath the value to be set.
   */
  public fun basePath(basePath: String) {
    cdkBuilder.basePath(basePath)
  }

  /**
   * @param certificateArn the value to be set. 
   */
  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  /**
   * @param domainName the value to be set. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param endpointConfiguration the value to be set.
   */
  public fun endpointConfiguration(endpointConfiguration: String) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  /**
   * @param mutualTlsAuthentication the value to be set.
   */
  public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
    cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
  }

  /**
   * @param mutualTlsAuthentication the value to be set.
   */
  public
      fun mutualTlsAuthentication(mutualTlsAuthentication: CfnHttpApi.MutualTlsAuthenticationProperty) {
    cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
  }

  /**
   * @param route53 the value to be set.
   */
  public fun route53(route53: IResolvable) {
    cdkBuilder.route53(route53)
  }

  /**
   * @param route53 the value to be set.
   */
  public fun route53(route53: CfnHttpApi.Route53ConfigurationProperty) {
    cdkBuilder.route53(route53)
  }

  /**
   * @param securityPolicy the value to be set.
   */
  public fun securityPolicy(securityPolicy: String) {
    cdkBuilder.securityPolicy(securityPolicy)
  }

  public fun build(): CfnHttpApi.HttpApiDomainConfigurationProperty = cdkBuilder.build()
}
