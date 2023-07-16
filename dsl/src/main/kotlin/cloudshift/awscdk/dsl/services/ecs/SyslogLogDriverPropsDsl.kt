@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.SyslogLogDriverProps

@CdkDslMarker
public class SyslogLogDriverPropsDsl {
  private val cdkBuilder: SyslogLogDriverProps.Builder = SyslogLogDriverProps.builder()

  private val _env: MutableList<String> = mutableListOf()

  private val _labels: MutableList<String> = mutableListOf()

  public fun address(address: String) {
    cdkBuilder.address(address)
  }

  public fun env(vararg env: String) {
    _env.addAll(listOf(*env))
  }

  public fun env(env: Collection<String>) {
    _env.addAll(env)
  }

  public fun envRegex(envRegex: String) {
    cdkBuilder.envRegex(envRegex)
  }

  public fun facility(facility: String) {
    cdkBuilder.facility(facility)
  }

  public fun format(format: String) {
    cdkBuilder.format(format)
  }

  public fun labels(vararg labels: String) {
    _labels.addAll(listOf(*labels))
  }

  public fun labels(labels: Collection<String>) {
    _labels.addAll(labels)
  }

  public fun tag(tag: String) {
    cdkBuilder.tag(tag)
  }

  public fun tlsCaCert(tlsCaCert: String) {
    cdkBuilder.tlsCaCert(tlsCaCert)
  }

  public fun tlsCert(tlsCert: String) {
    cdkBuilder.tlsCert(tlsCert)
  }

  public fun tlsKey(tlsKey: String) {
    cdkBuilder.tlsKey(tlsKey)
  }

  public fun tlsSkipVerify(tlsSkipVerify: Boolean) {
    cdkBuilder.tlsSkipVerify(tlsSkipVerify)
  }

  public fun build(): SyslogLogDriverProps {
    if(_env.isNotEmpty()) cdkBuilder.env(_env)
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    return cdkBuilder.build()
  }
}
