@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnProvisioningTemplate
import software.constructs.Construct

@CdkDslMarker
public class CfnProvisioningTemplateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnProvisioningTemplate.Builder =
      CfnProvisioningTemplate.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun preProvisioningHook(preProvisioningHook: IResolvable) {
    cdkBuilder.preProvisioningHook(preProvisioningHook)
  }

  public
      fun preProvisioningHook(preProvisioningHook: CfnProvisioningTemplate.ProvisioningHookProperty) {
    cdkBuilder.preProvisioningHook(preProvisioningHook)
  }

  public fun provisioningRoleArn(provisioningRoleArn: String) {
    cdkBuilder.provisioningRoleArn(provisioningRoleArn)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun templateBody(templateBody: String) {
    cdkBuilder.templateBody(templateBody)
  }

  public fun templateName(templateName: String) {
    cdkBuilder.templateName(templateName)
  }

  public fun templateType(templateType: String) {
    cdkBuilder.templateType(templateType)
  }

  public fun build(): CfnProvisioningTemplate {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
