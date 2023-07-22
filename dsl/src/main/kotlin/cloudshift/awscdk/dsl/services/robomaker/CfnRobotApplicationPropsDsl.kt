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
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps

@CdkDslMarker
public class CfnRobotApplicationPropsDsl {
  private val cdkBuilder: CfnRobotApplicationProps.Builder = CfnRobotApplicationProps.builder()

  private val _sources: MutableList<Any> = mutableListOf()

  /**
   * @param currentRevisionId The current revision id.
   */
  public fun currentRevisionId(currentRevisionId: String) {
    cdkBuilder.currentRevisionId(currentRevisionId)
  }

  /**
   * @param environment The environment of the robot application.
   */
  public fun environment(environment: String) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param name The name of the robot application.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param robotSoftwareSuite The robot software suite used by the robot application. 
   */
  public fun robotSoftwareSuite(robotSoftwareSuite: IResolvable) {
    cdkBuilder.robotSoftwareSuite(robotSoftwareSuite)
  }

  /**
   * @param robotSoftwareSuite The robot software suite used by the robot application. 
   */
  public
      fun robotSoftwareSuite(robotSoftwareSuite: CfnRobotApplication.RobotSoftwareSuiteProperty) {
    cdkBuilder.robotSoftwareSuite(robotSoftwareSuite)
  }

  /**
   * @param sources The sources of the robot application.
   */
  public fun sources(vararg sources: Any) {
    _sources.addAll(listOf(*sources))
  }

  /**
   * @param sources The sources of the robot application.
   */
  public fun sources(sources: Collection<Any>) {
    _sources.addAll(sources)
  }

  /**
   * @param sources The sources of the robot application.
   */
  public fun sources(sources: IResolvable) {
    cdkBuilder.sources(sources)
  }

  /**
   * @param tags A map that contains tag keys and tag values that are attached to the robot
   * application.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnRobotApplicationProps {
    if(_sources.isNotEmpty()) cdkBuilder.sources(_sources)
    return cdkBuilder.build()
  }
}
