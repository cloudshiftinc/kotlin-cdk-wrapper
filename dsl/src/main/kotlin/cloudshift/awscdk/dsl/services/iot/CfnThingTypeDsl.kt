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
import software.amazon.awscdk.services.iot.CfnThingType
import software.constructs.Construct

@CdkDslMarker
public class CfnThingTypeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnThingType.Builder = CfnThingType.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun deprecateThingType(deprecateThingType: Boolean) {
    cdkBuilder.deprecateThingType(deprecateThingType)
  }

  public fun deprecateThingType(deprecateThingType: IResolvable) {
    cdkBuilder.deprecateThingType(deprecateThingType)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun thingTypeName(thingTypeName: String) {
    cdkBuilder.thingTypeName(thingTypeName)
  }

  public fun thingTypeProperties(thingTypeProperties: IResolvable) {
    cdkBuilder.thingTypeProperties(thingTypeProperties)
  }

  public fun thingTypeProperties(thingTypeProperties: CfnThingType.ThingTypePropertiesProperty) {
    cdkBuilder.thingTypeProperties(thingTypeProperties)
  }

  public fun build(): CfnThingType {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
