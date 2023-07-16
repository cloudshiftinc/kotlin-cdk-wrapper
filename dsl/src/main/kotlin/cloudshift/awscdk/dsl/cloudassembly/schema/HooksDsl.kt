@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.Hooks

@CdkDslMarker
public class HooksDsl {
  private val cdkBuilder: Hooks.Builder = Hooks.builder()

  private val _postDeploy: MutableList<String> = mutableListOf()

  private val _postDestroy: MutableList<String> = mutableListOf()

  private val _preDeploy: MutableList<String> = mutableListOf()

  private val _preDestroy: MutableList<String> = mutableListOf()

  public fun postDeploy(vararg postDeploy: String) {
    _postDeploy.addAll(listOf(*postDeploy))
  }

  public fun postDeploy(postDeploy: Collection<String>) {
    _postDeploy.addAll(postDeploy)
  }

  public fun postDestroy(vararg postDestroy: String) {
    _postDestroy.addAll(listOf(*postDestroy))
  }

  public fun postDestroy(postDestroy: Collection<String>) {
    _postDestroy.addAll(postDestroy)
  }

  public fun preDeploy(vararg preDeploy: String) {
    _preDeploy.addAll(listOf(*preDeploy))
  }

  public fun preDeploy(preDeploy: Collection<String>) {
    _preDeploy.addAll(preDeploy)
  }

  public fun preDestroy(vararg preDestroy: String) {
    _preDestroy.addAll(listOf(*preDestroy))
  }

  public fun preDestroy(preDestroy: Collection<String>) {
    _preDestroy.addAll(preDestroy)
  }

  public fun build(): Hooks {
    if(_postDeploy.isNotEmpty()) cdkBuilder.postDeploy(_postDeploy)
    if(_postDestroy.isNotEmpty()) cdkBuilder.postDestroy(_postDestroy)
    if(_preDeploy.isNotEmpty()) cdkBuilder.preDeploy(_preDeploy)
    if(_preDestroy.isNotEmpty()) cdkBuilder.preDestroy(_preDestroy)
    return cdkBuilder.build()
  }
}
