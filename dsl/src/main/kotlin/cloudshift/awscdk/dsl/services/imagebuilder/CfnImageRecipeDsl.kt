@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe
import software.constructs.Construct

@CdkDslMarker
public class CfnImageRecipeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnImageRecipe.Builder = CfnImageRecipe.Builder.create(scope, id)

  private val _blockDeviceMappings: MutableList<Any> = mutableListOf()

  private val _components: MutableList<Any> = mutableListOf()

  public fun additionalInstanceConfiguration(additionalInstanceConfiguration: IResolvable) {
    cdkBuilder.additionalInstanceConfiguration(additionalInstanceConfiguration)
  }

  public
      fun additionalInstanceConfiguration(additionalInstanceConfiguration: CfnImageRecipe.AdditionalInstanceConfigurationProperty) {
    cdkBuilder.additionalInstanceConfiguration(additionalInstanceConfiguration)
  }

  public fun blockDeviceMappings(vararg blockDeviceMappings: Any) {
    _blockDeviceMappings.addAll(listOf(*blockDeviceMappings))
  }

  public fun blockDeviceMappings(blockDeviceMappings: Collection<Any>) {
    _blockDeviceMappings.addAll(blockDeviceMappings)
  }

  public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
    cdkBuilder.blockDeviceMappings(blockDeviceMappings)
  }

  public fun components(vararg components: Any) {
    _components.addAll(listOf(*components))
  }

  public fun components(components: Collection<Any>) {
    _components.addAll(components)
  }

  public fun components(components: IResolvable) {
    cdkBuilder.components(components)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun parentImage(parentImage: String) {
    cdkBuilder.parentImage(parentImage)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun workingDirectory(workingDirectory: String) {
    cdkBuilder.workingDirectory(workingDirectory)
  }

  public fun build(): CfnImageRecipe {
    if(_blockDeviceMappings.isNotEmpty()) cdkBuilder.blockDeviceMappings(_blockDeviceMappings)
    if(_components.isNotEmpty()) cdkBuilder.components(_components)
    return cdkBuilder.build()
  }
}
