@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.robomaker.CfnRobotApplication
import software.constructs.Construct

@CdkDslMarker
public class CfnRobotApplicationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRobotApplication.Builder = CfnRobotApplication.Builder.create(scope,
      id)

  private val _sources: MutableList<Any> = mutableListOf()

  public fun currentRevisionId(currentRevisionId: String) {
    cdkBuilder.currentRevisionId(currentRevisionId)
  }

  public fun environment(environment: String) {
    cdkBuilder.environment(environment)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun robotSoftwareSuite(robotSoftwareSuite: IResolvable) {
    cdkBuilder.robotSoftwareSuite(robotSoftwareSuite)
  }

  public
      fun robotSoftwareSuite(robotSoftwareSuite: CfnRobotApplication.RobotSoftwareSuiteProperty) {
    cdkBuilder.robotSoftwareSuite(robotSoftwareSuite)
  }

  public fun sources(vararg sources: Any) {
    _sources.addAll(listOf(*sources))
  }

  public fun sources(sources: Collection<Any>) {
    _sources.addAll(sources)
  }

  public fun sources(sources: IResolvable) {
    cdkBuilder.sources(sources)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnRobotApplication {
    if(_sources.isNotEmpty()) cdkBuilder.sources(_sources)
    return cdkBuilder.build()
  }
}
