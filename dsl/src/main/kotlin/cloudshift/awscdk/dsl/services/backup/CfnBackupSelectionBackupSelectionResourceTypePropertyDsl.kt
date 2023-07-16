@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupSelection

@CdkDslMarker
public class CfnBackupSelectionBackupSelectionResourceTypePropertyDsl {
  private val cdkBuilder: CfnBackupSelection.BackupSelectionResourceTypeProperty.Builder =
      CfnBackupSelection.BackupSelectionResourceTypeProperty.builder()

  private val _listOfTags: MutableList<Any> = mutableListOf()

  private val _notResources: MutableList<String> = mutableListOf()

  private val _resources: MutableList<String> = mutableListOf()

  public fun conditions(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.conditions(builder.map)
  }

  public fun conditions(conditions: Any) {
    cdkBuilder.conditions(conditions)
  }

  public fun iamRoleArn(iamRoleArn: String) {
    cdkBuilder.iamRoleArn(iamRoleArn)
  }

  public fun listOfTags(vararg listOfTags: Any) {
    _listOfTags.addAll(listOf(*listOfTags))
  }

  public fun listOfTags(listOfTags: Collection<Any>) {
    _listOfTags.addAll(listOfTags)
  }

  public fun listOfTags(listOfTags: IResolvable) {
    cdkBuilder.listOfTags(listOfTags)
  }

  public fun notResources(vararg notResources: String) {
    _notResources.addAll(listOf(*notResources))
  }

  public fun notResources(notResources: Collection<String>) {
    _notResources.addAll(notResources)
  }

  public fun resources(vararg resources: String) {
    _resources.addAll(listOf(*resources))
  }

  public fun resources(resources: Collection<String>) {
    _resources.addAll(resources)
  }

  public fun selectionName(selectionName: String) {
    cdkBuilder.selectionName(selectionName)
  }

  public fun build(): CfnBackupSelection.BackupSelectionResourceTypeProperty {
    if(_listOfTags.isNotEmpty()) cdkBuilder.listOfTags(_listOfTags)
    if(_notResources.isNotEmpty()) cdkBuilder.notResources(_notResources)
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    return cdkBuilder.build()
  }
}
