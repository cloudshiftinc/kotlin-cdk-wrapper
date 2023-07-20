@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnProject
import software.constructs.Construct

@CdkDslMarker
public class CfnProjectDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnProject.Builder = CfnProject.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun projectDescription(projectDescription: String) {
    cdkBuilder.projectDescription(projectDescription)
  }

  public fun projectName(projectName: String) {
    cdkBuilder.projectName(projectName)
  }

  public
      fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: IResolvable) {
    cdkBuilder.serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails)
  }

  public
      fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: CfnProject.ServiceCatalogProvisionedProductDetailsProperty) {
    cdkBuilder.serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails)
  }

  public fun serviceCatalogProvisioningDetails(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.serviceCatalogProvisioningDetails(builder.map)
  }

  public fun serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails: Any) {
    cdkBuilder.serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnProject {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
