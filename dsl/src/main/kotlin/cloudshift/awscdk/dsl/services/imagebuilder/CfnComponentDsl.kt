@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.imagebuilder.CfnComponent
import software.constructs.Construct

@CdkDslMarker
public class CfnComponentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnComponent.Builder = CfnComponent.Builder.create(scope, id)

  private val _supportedOsVersions: MutableList<String> = mutableListOf()

  public fun changeDescription(changeDescription: String) {
    cdkBuilder.changeDescription(changeDescription)
  }

  public fun `data`(`data`: String) {
    cdkBuilder.`data`(`data`)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun platform(platform: String) {
    cdkBuilder.platform(platform)
  }

  public fun supportedOsVersions(vararg supportedOsVersions: String) {
    _supportedOsVersions.addAll(listOf(*supportedOsVersions))
  }

  public fun supportedOsVersions(supportedOsVersions: Collection<String>) {
    _supportedOsVersions.addAll(supportedOsVersions)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnComponent {
    if(_supportedOsVersions.isNotEmpty()) cdkBuilder.supportedOsVersions(_supportedOsVersions)
    return cdkBuilder.build()
  }
}
