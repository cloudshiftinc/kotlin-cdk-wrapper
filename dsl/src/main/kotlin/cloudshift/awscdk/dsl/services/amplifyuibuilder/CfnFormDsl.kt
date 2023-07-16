@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm
import software.constructs.Construct

@CdkDslMarker
public class CfnFormDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnForm.Builder = CfnForm.Builder.create(scope, id)

  public fun appId(appId: String) {
    cdkBuilder.appId(appId)
  }

  public fun cta(cta: IResolvable) {
    cdkBuilder.cta(cta)
  }

  public fun cta(cta: CfnForm.FormCTAProperty) {
    cdkBuilder.cta(cta)
  }

  public fun dataType(dataType: IResolvable) {
    cdkBuilder.dataType(dataType)
  }

  public fun dataType(dataType: CfnForm.FormDataTypeConfigProperty) {
    cdkBuilder.dataType(dataType)
  }

  public fun environmentName(environmentName: String) {
    cdkBuilder.environmentName(environmentName)
  }

  public fun fields(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.fields(builder.map)
  }

  public fun fields(fields: Map<String, *>) {
    cdkBuilder.fields(fields)
  }

  public fun fields(fields: IResolvable) {
    cdkBuilder.fields(fields)
  }

  public fun formActionType(formActionType: String) {
    cdkBuilder.formActionType(formActionType)
  }

  public fun labelDecorator(labelDecorator: String) {
    cdkBuilder.labelDecorator(labelDecorator)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun schemaVersion(schemaVersion: String) {
    cdkBuilder.schemaVersion(schemaVersion)
  }

  public fun sectionalElements(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.sectionalElements(builder.map)
  }

  public fun sectionalElements(sectionalElements: Map<String, *>) {
    cdkBuilder.sectionalElements(sectionalElements)
  }

  public fun sectionalElements(sectionalElements: IResolvable) {
    cdkBuilder.sectionalElements(sectionalElements)
  }

  public fun style(style: IResolvable) {
    cdkBuilder.style(style)
  }

  public fun style(style: CfnForm.FormStyleProperty) {
    cdkBuilder.style(style)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnForm = cdkBuilder.build()
}
