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

@CdkDslMarker
public class CfnDomainNameDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDomainName.Builder = CfnDomainName.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun endpointConfiguration(endpointConfiguration: IResolvable) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  public
      fun endpointConfiguration(endpointConfiguration: CfnDomainName.EndpointConfigurationProperty) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
    cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
  }

  public
      fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty) {
    cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
  }

  public fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
    cdkBuilder.ownershipVerificationCertificateArn(ownershipVerificationCertificateArn)
  }

  public fun regionalCertificateArn(regionalCertificateArn: String) {
    cdkBuilder.regionalCertificateArn(regionalCertificateArn)
  }

  public fun securityPolicy(securityPolicy: String) {
    cdkBuilder.securityPolicy(securityPolicy)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDomainName {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
