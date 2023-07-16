@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.FireLensLogDriver
import software.amazon.awscdk.services.ecs.Secret

@CdkDslMarker
public class FireLensLogDriverDsl {
  private val cdkBuilder: FireLensLogDriver.Builder = FireLensLogDriver.Builder.create()

  private val _env: MutableList<String> = mutableListOf()

  private val _labels: MutableList<String> = mutableListOf()

  public fun env(vararg env: String) {
    _env.addAll(listOf(*env))
  }

  public fun env(env: Collection<String>) {
    _env.addAll(env)
  }

  public fun envRegex(envRegex: String) {
    cdkBuilder.envRegex(envRegex)
  }

  public fun labels(vararg labels: String) {
    _labels.addAll(listOf(*labels))
  }

  public fun labels(labels: Collection<String>) {
    _labels.addAll(labels)
  }

  public fun options(options: Map<String, String>) {
    cdkBuilder.options(options)
  }

  public fun secretOptions(secretOptions: Map<String, out Secret>) {
    cdkBuilder.secretOptions(secretOptions)
  }

  public fun tag(tag: String) {
    cdkBuilder.tag(tag)
  }

  public fun build(): FireLensLogDriver {
    if(_env.isNotEmpty()) cdkBuilder.env(_env)
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    return cdkBuilder.build()
  }
}
