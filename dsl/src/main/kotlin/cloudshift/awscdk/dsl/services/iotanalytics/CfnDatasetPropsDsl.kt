@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset
import software.amazon.awscdk.services.iotanalytics.CfnDatasetProps

@CdkDslMarker
public class CfnDatasetPropsDsl {
  private val cdkBuilder: CfnDatasetProps.Builder = CfnDatasetProps.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  private val _contentDeliveryRules: MutableList<Any> = mutableListOf()

  private val _lateDataRules: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _triggers: MutableList<Any> = mutableListOf()

  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  public fun contentDeliveryRules(vararg contentDeliveryRules: Any) {
    _contentDeliveryRules.addAll(listOf(*contentDeliveryRules))
  }

  public fun contentDeliveryRules(contentDeliveryRules: Collection<Any>) {
    _contentDeliveryRules.addAll(contentDeliveryRules)
  }

  public fun contentDeliveryRules(contentDeliveryRules: IResolvable) {
    cdkBuilder.contentDeliveryRules(contentDeliveryRules)
  }

  public fun datasetName(datasetName: String) {
    cdkBuilder.datasetName(datasetName)
  }

  public fun lateDataRules(vararg lateDataRules: Any) {
    _lateDataRules.addAll(listOf(*lateDataRules))
  }

  public fun lateDataRules(lateDataRules: Collection<Any>) {
    _lateDataRules.addAll(lateDataRules)
  }

  public fun lateDataRules(lateDataRules: IResolvable) {
    cdkBuilder.lateDataRules(lateDataRules)
  }

  public fun retentionPeriod(retentionPeriod: IResolvable) {
    cdkBuilder.retentionPeriod(retentionPeriod)
  }

  public fun retentionPeriod(retentionPeriod: CfnDataset.RetentionPeriodProperty) {
    cdkBuilder.retentionPeriod(retentionPeriod)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun triggers(vararg triggers: Any) {
    _triggers.addAll(listOf(*triggers))
  }

  public fun triggers(triggers: Collection<Any>) {
    _triggers.addAll(triggers)
  }

  public fun triggers(triggers: IResolvable) {
    cdkBuilder.triggers(triggers)
  }

  public fun versioningConfiguration(versioningConfiguration: IResolvable) {
    cdkBuilder.versioningConfiguration(versioningConfiguration)
  }

  public
      fun versioningConfiguration(versioningConfiguration: CfnDataset.VersioningConfigurationProperty) {
    cdkBuilder.versioningConfiguration(versioningConfiguration)
  }

  public fun build(): CfnDatasetProps {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_contentDeliveryRules.isNotEmpty()) cdkBuilder.contentDeliveryRules(_contentDeliveryRules)
    if(_lateDataRules.isNotEmpty()) cdkBuilder.lateDataRules(_lateDataRules)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_triggers.isNotEmpty()) cdkBuilder.triggers(_triggers)
    return cdkBuilder.build()
  }
}
