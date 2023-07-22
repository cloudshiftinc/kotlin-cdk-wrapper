@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication
import software.constructs.Construct

@CdkDslMarker
public class CfnSimulationApplicationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSimulationApplication.Builder =
      CfnSimulationApplication.Builder.create(scope, id)

  private val _sources: MutableList<Any> = mutableListOf()

  /**
   * The current revision id.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-currentrevisionid)
   * @param currentRevisionId The current revision id. 
   */
  public fun currentRevisionId(currentRevisionId: String) {
    cdkBuilder.currentRevisionId(currentRevisionId)
  }

  /**
   * The environment of the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-environment)
   * @param environment The environment of the simulation application. 
   */
  public fun environment(environment: String) {
    cdkBuilder.environment(environment)
  }

  /**
   * The name of the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-name)
   * @param name The name of the simulation application. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The rendering engine for the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-renderingengine)
   * @param renderingEngine The rendering engine for the simulation application. 
   */
  public fun renderingEngine(renderingEngine: IResolvable) {
    cdkBuilder.renderingEngine(renderingEngine)
  }

  /**
   * The rendering engine for the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-renderingengine)
   * @param renderingEngine The rendering engine for the simulation application. 
   */
  public fun renderingEngine(renderingEngine: CfnSimulationApplication.RenderingEngineProperty) {
    cdkBuilder.renderingEngine(renderingEngine)
  }

  /**
   * The robot software suite used by the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-robotsoftwaresuite)
   * @param robotSoftwareSuite The robot software suite used by the simulation application. 
   */
  public fun robotSoftwareSuite(robotSoftwareSuite: IResolvable) {
    cdkBuilder.robotSoftwareSuite(robotSoftwareSuite)
  }

  /**
   * The robot software suite used by the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-robotsoftwaresuite)
   * @param robotSoftwareSuite The robot software suite used by the simulation application. 
   */
  public
      fun robotSoftwareSuite(robotSoftwareSuite: CfnSimulationApplication.RobotSoftwareSuiteProperty) {
    cdkBuilder.robotSoftwareSuite(robotSoftwareSuite)
  }

  /**
   * The simulation software suite used by the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-simulationsoftwaresuite)
   * @param simulationSoftwareSuite The simulation software suite used by the simulation
   * application. 
   */
  public fun simulationSoftwareSuite(simulationSoftwareSuite: IResolvable) {
    cdkBuilder.simulationSoftwareSuite(simulationSoftwareSuite)
  }

  /**
   * The simulation software suite used by the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-simulationsoftwaresuite)
   * @param simulationSoftwareSuite The simulation software suite used by the simulation
   * application. 
   */
  public
      fun simulationSoftwareSuite(simulationSoftwareSuite: CfnSimulationApplication.SimulationSoftwareSuiteProperty) {
    cdkBuilder.simulationSoftwareSuite(simulationSoftwareSuite)
  }

  /**
   * The sources of the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-sources)
   * @param sources The sources of the simulation application. 
   */
  public fun sources(vararg sources: Any) {
    _sources.addAll(listOf(*sources))
  }

  /**
   * The sources of the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-sources)
   * @param sources The sources of the simulation application. 
   */
  public fun sources(sources: Collection<Any>) {
    _sources.addAll(sources)
  }

  /**
   * The sources of the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-sources)
   * @param sources The sources of the simulation application. 
   */
  public fun sources(sources: IResolvable) {
    cdkBuilder.sources(sources)
  }

  /**
   * A map that contains tag keys and tag values that are attached to the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-tags)
   * @param tags A map that contains tag keys and tag values that are attached to the simulation
   * application. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnSimulationApplication {
    if(_sources.isNotEmpty()) cdkBuilder.sources(_sources)
    return cdkBuilder.build()
  }
}
