@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnApp
import software.constructs.Construct

@CdkDslMarker
public class CfnAppDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApp.Builder = CfnApp.Builder.create(scope, id)

  private val _dataSources: MutableList<Any> = mutableListOf()

  private val _domains: MutableList<String> = mutableListOf()

  private val _environment: MutableList<Any> = mutableListOf()

  public fun appSource(appSource: IResolvable) {
    cdkBuilder.appSource(appSource)
  }

  public fun appSource(appSource: CfnApp.SourceProperty) {
    cdkBuilder.appSource(appSource)
  }

  public fun attributes(attributes: Map<String, String>) {
    cdkBuilder.attributes(attributes)
  }

  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  public fun dataSources(vararg dataSources: Any) {
    _dataSources.addAll(listOf(*dataSources))
  }

  public fun dataSources(dataSources: Collection<Any>) {
    _dataSources.addAll(dataSources)
  }

  public fun dataSources(dataSources: IResolvable) {
    cdkBuilder.dataSources(dataSources)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun domains(vararg domains: String) {
    _domains.addAll(listOf(*domains))
  }

  public fun domains(domains: Collection<String>) {
    _domains.addAll(domains)
  }

  public fun enableSsl(enableSsl: Boolean) {
    cdkBuilder.enableSsl(enableSsl)
  }

  public fun enableSsl(enableSsl: IResolvable) {
    cdkBuilder.enableSsl(enableSsl)
  }

  public fun environment(vararg environment: Any) {
    _environment.addAll(listOf(*environment))
  }

  public fun environment(environment: Collection<Any>) {
    _environment.addAll(environment)
  }

  public fun environment(environment: IResolvable) {
    cdkBuilder.environment(environment)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun shortname(shortname: String) {
    cdkBuilder.shortname(shortname)
  }

  public fun sslConfiguration(sslConfiguration: IResolvable) {
    cdkBuilder.sslConfiguration(sslConfiguration)
  }

  public fun sslConfiguration(sslConfiguration: CfnApp.SslConfigurationProperty) {
    cdkBuilder.sslConfiguration(sslConfiguration)
  }

  public fun stackId(stackId: String) {
    cdkBuilder.stackId(stackId)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnApp {
    if(_dataSources.isNotEmpty()) cdkBuilder.dataSources(_dataSources)
    if(_domains.isNotEmpty()) cdkBuilder.domains(_domains)
    if(_environment.isNotEmpty()) cdkBuilder.environment(_environment)
    return cdkBuilder.build()
  }
}
