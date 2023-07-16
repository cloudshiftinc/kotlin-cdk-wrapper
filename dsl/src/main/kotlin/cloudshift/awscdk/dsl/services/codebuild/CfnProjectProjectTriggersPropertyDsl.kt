@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject

@CdkDslMarker
public class CfnProjectProjectTriggersPropertyDsl {
  private val cdkBuilder: CfnProject.ProjectTriggersProperty.Builder =
      CfnProject.ProjectTriggersProperty.builder()

  private val _filterGroups: MutableList<Any> = mutableListOf()

  public fun buildType(buildType: String) {
    cdkBuilder.buildType(buildType)
  }

  public fun filterGroups(vararg filterGroups: Any) {
    _filterGroups.addAll(listOf(*filterGroups))
  }

  public fun filterGroups(filterGroups: Collection<Any>) {
    _filterGroups.addAll(filterGroups)
  }

  public fun filterGroups(filterGroups: IResolvable) {
    cdkBuilder.filterGroups(filterGroups)
  }

  public fun webhook(webhook: Boolean) {
    cdkBuilder.webhook(webhook)
  }

  public fun webhook(webhook: IResolvable) {
    cdkBuilder.webhook(webhook)
  }

  public fun build(): CfnProject.ProjectTriggersProperty {
    if(_filterGroups.isNotEmpty()) cdkBuilder.filterGroups(_filterGroups)
    return cdkBuilder.build()
  }
}
