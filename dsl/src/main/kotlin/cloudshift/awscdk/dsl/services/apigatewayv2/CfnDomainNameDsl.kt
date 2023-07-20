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

@CdkDslMarker
public class CfnDomainNameDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDomainName.Builder = CfnDomainName.Builder.create(scope, id)

  private val _domainNameConfigurations: MutableList<Any> = mutableListOf()

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun domainNameConfigurations(vararg domainNameConfigurations: Any) {
    _domainNameConfigurations.addAll(listOf(*domainNameConfigurations))
  }

  public fun domainNameConfigurations(domainNameConfigurations: Collection<Any>) {
    _domainNameConfigurations.addAll(domainNameConfigurations)
  }

  public fun domainNameConfigurations(domainNameConfigurations: IResolvable) {
    cdkBuilder.domainNameConfigurations(domainNameConfigurations)
  }

  public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
    cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
  }

  public
      fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty) {
    cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnDomainName {
    if(_domainNameConfigurations.isNotEmpty())
        cdkBuilder.domainNameConfigurations(_domainNameConfigurations)
    return cdkBuilder.build()
  }
}
