@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject
import software.amazon.awscdk.services.codebuild.SourceConfig

@CdkDslMarker
public class SourceConfigDsl {
  private val cdkBuilder: SourceConfig.Builder = SourceConfig.builder()

  public fun buildTriggers(block: CfnProjectProjectTriggersPropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectProjectTriggersPropertyDsl()
    builder.apply(block)
    cdkBuilder.buildTriggers(builder.build())
  }

  public fun buildTriggers(buildTriggers: CfnProject.ProjectTriggersProperty) {
    cdkBuilder.buildTriggers(buildTriggers)
  }

  public fun sourceProperty(block: CfnProjectSourcePropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectSourcePropertyDsl()
    builder.apply(block)
    cdkBuilder.sourceProperty(builder.build())
  }

  public fun sourceProperty(sourceProperty: CfnProject.SourceProperty) {
    cdkBuilder.sourceProperty(sourceProperty)
  }

  public fun sourceVersion(sourceVersion: String) {
    cdkBuilder.sourceVersion(sourceVersion)
  }

  public fun build(): SourceConfig = cdkBuilder.build()
}
