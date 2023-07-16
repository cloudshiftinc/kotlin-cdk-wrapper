@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetRowLevelPermissionTagConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSet.RowLevelPermissionTagConfigurationProperty.Builder =
      CfnDataSet.RowLevelPermissionTagConfigurationProperty.builder()

  private val _tagRules: MutableList<Any> = mutableListOf()

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun tagRuleConfigurations(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tagRuleConfigurations(builder.map)
  }

  public fun tagRuleConfigurations(tagRuleConfigurations: Any) {
    cdkBuilder.tagRuleConfigurations(tagRuleConfigurations)
  }

  public fun tagRules(vararg tagRules: Any) {
    _tagRules.addAll(listOf(*tagRules))
  }

  public fun tagRules(tagRules: Collection<Any>) {
    _tagRules.addAll(tagRules)
  }

  public fun tagRules(tagRules: IResolvable) {
    cdkBuilder.tagRules(tagRules)
  }

  public fun build(): CfnDataSet.RowLevelPermissionTagConfigurationProperty {
    if(_tagRules.isNotEmpty()) cdkBuilder.tagRules(_tagRules)
    return cdkBuilder.build()
  }
}
