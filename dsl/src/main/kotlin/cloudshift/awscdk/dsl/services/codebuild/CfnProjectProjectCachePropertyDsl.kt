@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codebuild.CfnProject

@CdkDslMarker
public class CfnProjectProjectCachePropertyDsl {
  private val cdkBuilder: CfnProject.ProjectCacheProperty.Builder =
      CfnProject.ProjectCacheProperty.builder()

  private val _modes: MutableList<String> = mutableListOf()

  public fun location(location: String) {
    cdkBuilder.location(location)
  }

  public fun modes(vararg modes: String) {
    _modes.addAll(listOf(*modes))
  }

  public fun modes(modes: Collection<String>) {
    _modes.addAll(modes)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnProject.ProjectCacheProperty {
    if(_modes.isNotEmpty()) cdkBuilder.modes(_modes)
    return cdkBuilder.build()
  }
}
