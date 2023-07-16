@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.servicecatalog.CloudFormationProduct
import software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion
import software.amazon.awscdk.services.servicecatalog.MessageLanguage
import software.amazon.awscdk.services.servicecatalog.TagOptions
import software.constructs.Construct

@CdkDslMarker
public class CloudFormationProductDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CloudFormationProduct.Builder =
      CloudFormationProduct.Builder.create(scope, id)

  private val _productVersions: MutableList<CloudFormationProductVersion> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun distributor(distributor: String) {
    cdkBuilder.distributor(distributor)
  }

  public fun messageLanguage(messageLanguage: MessageLanguage) {
    cdkBuilder.messageLanguage(messageLanguage)
  }

  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

  public fun productName(productName: String) {
    cdkBuilder.productName(productName)
  }

  public fun productVersions(productVersions: CloudFormationProductVersionDsl.() -> Unit) {
    _productVersions.add(CloudFormationProductVersionDsl().apply(productVersions).build())
  }

  public fun productVersions(productVersions: Collection<CloudFormationProductVersion>) {
    _productVersions.addAll(productVersions)
  }

  public fun replaceProductVersionIds(replaceProductVersionIds: Boolean) {
    cdkBuilder.replaceProductVersionIds(replaceProductVersionIds)
  }

  public fun supportDescription(supportDescription: String) {
    cdkBuilder.supportDescription(supportDescription)
  }

  public fun supportEmail(supportEmail: String) {
    cdkBuilder.supportEmail(supportEmail)
  }

  public fun supportUrl(supportUrl: String) {
    cdkBuilder.supportUrl(supportUrl)
  }

  public fun tagOptions(tagOptions: TagOptions) {
    cdkBuilder.tagOptions(tagOptions)
  }

  public fun build(): CloudFormationProduct {
    if(_productVersions.isNotEmpty()) cdkBuilder.productVersions(_productVersions)
    return cdkBuilder.build()
  }
}
