@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct
import software.constructs.Construct

@CdkDslMarker
public class CfnCloudFormationProductDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCloudFormationProduct.Builder =
      CfnCloudFormationProduct.Builder.create(scope, id)

  private val _provisioningArtifactParameters: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun distributor(distributor: String) {
    cdkBuilder.distributor(distributor)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

  public fun productType(productType: String) {
    cdkBuilder.productType(productType)
  }

  public fun provisioningArtifactParameters(vararg provisioningArtifactParameters: Any) {
    _provisioningArtifactParameters.addAll(listOf(*provisioningArtifactParameters))
  }

  public fun provisioningArtifactParameters(provisioningArtifactParameters: Collection<Any>) {
    _provisioningArtifactParameters.addAll(provisioningArtifactParameters)
  }

  public fun provisioningArtifactParameters(provisioningArtifactParameters: IResolvable) {
    cdkBuilder.provisioningArtifactParameters(provisioningArtifactParameters)
  }

  public fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: Boolean) {
    cdkBuilder.replaceProvisioningArtifacts(replaceProvisioningArtifacts)
  }

  public fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: IResolvable) {
    cdkBuilder.replaceProvisioningArtifacts(replaceProvisioningArtifacts)
  }

  public fun sourceConnection(sourceConnection: IResolvable) {
    cdkBuilder.sourceConnection(sourceConnection)
  }

  public fun sourceConnection(sourceConnection: CfnCloudFormationProduct.SourceConnectionProperty) {
    cdkBuilder.sourceConnection(sourceConnection)
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

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCloudFormationProduct {
    if(_provisioningArtifactParameters.isNotEmpty())
        cdkBuilder.provisioningArtifactParameters(_provisioningArtifactParameters)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
