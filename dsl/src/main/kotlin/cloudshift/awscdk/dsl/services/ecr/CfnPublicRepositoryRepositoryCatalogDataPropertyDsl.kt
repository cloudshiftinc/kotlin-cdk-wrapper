@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecr.CfnPublicRepository

@CdkDslMarker
public class CfnPublicRepositoryRepositoryCatalogDataPropertyDsl {
  private val cdkBuilder: CfnPublicRepository.RepositoryCatalogDataProperty.Builder =
      CfnPublicRepository.RepositoryCatalogDataProperty.builder()

  private val _architectures: MutableList<String> = mutableListOf()

  private val _operatingSystems: MutableList<String> = mutableListOf()

  public fun aboutText(aboutText: String) {
    cdkBuilder.aboutText(aboutText)
  }

  public fun architectures(vararg architectures: String) {
    _architectures.addAll(listOf(*architectures))
  }

  public fun architectures(architectures: Collection<String>) {
    _architectures.addAll(architectures)
  }

  public fun operatingSystems(vararg operatingSystems: String) {
    _operatingSystems.addAll(listOf(*operatingSystems))
  }

  public fun operatingSystems(operatingSystems: Collection<String>) {
    _operatingSystems.addAll(operatingSystems)
  }

  public fun repositoryDescription(repositoryDescription: String) {
    cdkBuilder.repositoryDescription(repositoryDescription)
  }

  public fun usageText(usageText: String) {
    cdkBuilder.usageText(usageText)
  }

  public fun build(): CfnPublicRepository.RepositoryCatalogDataProperty {
    if(_architectures.isNotEmpty()) cdkBuilder.architectures(_architectures)
    if(_operatingSystems.isNotEmpty()) cdkBuilder.operatingSystems(_operatingSystems)
    return cdkBuilder.build()
  }
}
