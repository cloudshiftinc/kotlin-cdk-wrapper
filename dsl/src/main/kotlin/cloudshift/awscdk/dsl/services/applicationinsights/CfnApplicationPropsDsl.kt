@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

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
import software.amazon.awscdk.services.applicationinsights.CfnApplicationProps

@CdkDslMarker
public class CfnApplicationPropsDsl {
  private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

  private val _componentMonitoringSettings: MutableList<Any> = mutableListOf()

  private val _customComponents: MutableList<Any> = mutableListOf()

  private val _logPatternSets: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun autoConfigurationEnabled(autoConfigurationEnabled: Boolean) {
    cdkBuilder.autoConfigurationEnabled(autoConfigurationEnabled)
  }

  public fun autoConfigurationEnabled(autoConfigurationEnabled: IResolvable) {
    cdkBuilder.autoConfigurationEnabled(autoConfigurationEnabled)
  }

  public fun componentMonitoringSettings(vararg componentMonitoringSettings: Any) {
    _componentMonitoringSettings.addAll(listOf(*componentMonitoringSettings))
  }

  public fun componentMonitoringSettings(componentMonitoringSettings: Collection<Any>) {
    _componentMonitoringSettings.addAll(componentMonitoringSettings)
  }

  public fun componentMonitoringSettings(componentMonitoringSettings: IResolvable) {
    cdkBuilder.componentMonitoringSettings(componentMonitoringSettings)
  }

  public fun customComponents(vararg customComponents: Any) {
    _customComponents.addAll(listOf(*customComponents))
  }

  public fun customComponents(customComponents: Collection<Any>) {
    _customComponents.addAll(customComponents)
  }

  public fun customComponents(customComponents: IResolvable) {
    cdkBuilder.customComponents(customComponents)
  }

  public fun cweMonitorEnabled(cweMonitorEnabled: Boolean) {
    cdkBuilder.cweMonitorEnabled(cweMonitorEnabled)
  }

  public fun cweMonitorEnabled(cweMonitorEnabled: IResolvable) {
    cdkBuilder.cweMonitorEnabled(cweMonitorEnabled)
  }

  public fun groupingType(groupingType: String) {
    cdkBuilder.groupingType(groupingType)
  }

  public fun logPatternSets(vararg logPatternSets: Any) {
    _logPatternSets.addAll(listOf(*logPatternSets))
  }

  public fun logPatternSets(logPatternSets: Collection<Any>) {
    _logPatternSets.addAll(logPatternSets)
  }

  public fun logPatternSets(logPatternSets: IResolvable) {
    cdkBuilder.logPatternSets(logPatternSets)
  }

  public fun opsCenterEnabled(opsCenterEnabled: Boolean) {
    cdkBuilder.opsCenterEnabled(opsCenterEnabled)
  }

  public fun opsCenterEnabled(opsCenterEnabled: IResolvable) {
    cdkBuilder.opsCenterEnabled(opsCenterEnabled)
  }

  public fun opsItemSnsTopicArn(opsItemSnsTopicArn: String) {
    cdkBuilder.opsItemSnsTopicArn(opsItemSnsTopicArn)
  }

  public fun resourceGroupName(resourceGroupName: String) {
    cdkBuilder.resourceGroupName(resourceGroupName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnApplicationProps {
    if(_componentMonitoringSettings.isNotEmpty())
        cdkBuilder.componentMonitoringSettings(_componentMonitoringSettings)
    if(_customComponents.isNotEmpty()) cdkBuilder.customComponents(_customComponents)
    if(_logPatternSets.isNotEmpty()) cdkBuilder.logPatternSets(_logPatternSets)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
