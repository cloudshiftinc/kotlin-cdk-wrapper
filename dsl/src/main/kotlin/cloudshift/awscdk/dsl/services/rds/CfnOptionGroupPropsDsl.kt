@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnOptionGroupProps

@CdkDslMarker
public class CfnOptionGroupPropsDsl {
  private val cdkBuilder: CfnOptionGroupProps.Builder = CfnOptionGroupProps.builder()

  private val _optionConfigurations: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun engineName(engineName: String) {
    cdkBuilder.engineName(engineName)
  }

  public fun majorEngineVersion(majorEngineVersion: String) {
    cdkBuilder.majorEngineVersion(majorEngineVersion)
  }

  public fun optionConfigurations(vararg optionConfigurations: Any) {
    _optionConfigurations.addAll(listOf(*optionConfigurations))
  }

  public fun optionConfigurations(optionConfigurations: Collection<Any>) {
    _optionConfigurations.addAll(optionConfigurations)
  }

  public fun optionConfigurations(optionConfigurations: IResolvable) {
    cdkBuilder.optionConfigurations(optionConfigurations)
  }

  public fun optionGroupDescription(optionGroupDescription: String) {
    cdkBuilder.optionGroupDescription(optionGroupDescription)
  }

  public fun optionGroupName(optionGroupName: String) {
    cdkBuilder.optionGroupName(optionGroupName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnOptionGroupProps {
    if(_optionConfigurations.isNotEmpty()) cdkBuilder.optionConfigurations(_optionConfigurations)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
