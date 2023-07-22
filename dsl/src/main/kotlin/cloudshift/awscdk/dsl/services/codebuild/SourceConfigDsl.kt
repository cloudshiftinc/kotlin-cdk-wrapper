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

  /**
   * @param buildTriggers the value to be set.
   */
  public fun buildTriggers(buildTriggers: CfnProjectProjectTriggersPropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectProjectTriggersPropertyDsl()
    builder.apply(buildTriggers)
    cdkBuilder.buildTriggers(builder.build())
  }

  /**
   * @param buildTriggers the value to be set.
   */
  public fun buildTriggers(buildTriggers: CfnProject.ProjectTriggersProperty) {
    cdkBuilder.buildTriggers(buildTriggers)
  }

  /**
   * @param sourceProperty the value to be set. 
   */
  public fun sourceProperty(sourceProperty: CfnProjectSourcePropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectSourcePropertyDsl()
    builder.apply(sourceProperty)
    cdkBuilder.sourceProperty(builder.build())
  }

  /**
   * @param sourceProperty the value to be set. 
   */
  public fun sourceProperty(sourceProperty: CfnProject.SourceProperty) {
    cdkBuilder.sourceProperty(sourceProperty)
  }

  /**
   * @param sourceVersion `AWS::CodeBuild::Project.SourceVersion`.
   */
  public fun sourceVersion(sourceVersion: String) {
    cdkBuilder.sourceVersion(sourceVersion)
  }

  public fun build(): SourceConfig = cdkBuilder.build()
}
