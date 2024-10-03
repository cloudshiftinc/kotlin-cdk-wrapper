@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSimulationApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.robomaker.*;
 * CfnSimulationApplicationProps cfnSimulationApplicationProps =
 * CfnSimulationApplicationProps.builder()
 * .robotSoftwareSuite(RobotSoftwareSuiteProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .version("version")
 * .build())
 * .simulationSoftwareSuite(SimulationSoftwareSuiteProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .version("version")
 * .build())
 * // the properties below are optional
 * .currentRevisionId("currentRevisionId")
 * .environment("environment")
 * .name("name")
 * .renderingEngine(RenderingEngineProperty.builder()
 * .name("name")
 * .version("version")
 * .build())
 * .sources(List.of(SourceConfigProperty.builder()
 * .architecture("architecture")
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .build()))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html)
 */
public interface CfnSimulationApplicationProps {
  /**
   * The current revision id.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-currentrevisionid)
   */
  public fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

  /**
   * The environment of the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-environment)
   */
  public fun environment(): String? = unwrap(this).getEnvironment()

  /**
   * The name of the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The rendering engine for the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-renderingengine)
   */
  public fun renderingEngine(): Any? = unwrap(this).getRenderingEngine()

  /**
   * The robot software suite used by the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-robotsoftwaresuite)
   */
  public fun robotSoftwareSuite(): Any

  /**
   * The simulation software suite used by the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-simulationsoftwaresuite)
   */
  public fun simulationSoftwareSuite(): Any

  /**
   * The sources of the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-sources)
   */
  public fun sources(): Any? = unwrap(this).getSources()

  /**
   * A map that contains tag keys and tag values that are attached to the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnSimulationApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param currentRevisionId The current revision id.
     */
    public fun currentRevisionId(currentRevisionId: String)

    /**
     * @param environment The environment of the simulation application.
     */
    public fun environment(environment: String)

    /**
     * @param name The name of the simulation application.
     */
    public fun name(name: String)

    /**
     * @param renderingEngine The rendering engine for the simulation application.
     */
    public fun renderingEngine(renderingEngine: IResolvable)

    /**
     * @param renderingEngine The rendering engine for the simulation application.
     */
    public fun renderingEngine(renderingEngine: CfnSimulationApplication.RenderingEngineProperty)

    /**
     * @param renderingEngine The rendering engine for the simulation application.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7582e2453911d1a5f27399303732ddb7f93e66e4ee638d44062b55424aa37be")
    public
        fun renderingEngine(renderingEngine: CfnSimulationApplication.RenderingEngineProperty.Builder.() -> Unit)

    /**
     * @param robotSoftwareSuite The robot software suite used by the simulation application. 
     */
    public fun robotSoftwareSuite(robotSoftwareSuite: IResolvable)

    /**
     * @param robotSoftwareSuite The robot software suite used by the simulation application. 
     */
    public
        fun robotSoftwareSuite(robotSoftwareSuite: CfnSimulationApplication.RobotSoftwareSuiteProperty)

    /**
     * @param robotSoftwareSuite The robot software suite used by the simulation application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25d30dde7f5cdafe1569830a8d42cf47beda3d87216376c6960ba0286aa84d1b")
    public
        fun robotSoftwareSuite(robotSoftwareSuite: CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder.() -> Unit)

    /**
     * @param simulationSoftwareSuite The simulation software suite used by the simulation
     * application. 
     */
    public fun simulationSoftwareSuite(simulationSoftwareSuite: IResolvable)

    /**
     * @param simulationSoftwareSuite The simulation software suite used by the simulation
     * application. 
     */
    public
        fun simulationSoftwareSuite(simulationSoftwareSuite: CfnSimulationApplication.SimulationSoftwareSuiteProperty)

    /**
     * @param simulationSoftwareSuite The simulation software suite used by the simulation
     * application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bce6aae1ed9a6ba056e883c837ae7c38b3b26192413d45bd4b6a99188a1ca96")
    public
        fun simulationSoftwareSuite(simulationSoftwareSuite: CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder.() -> Unit)

    /**
     * @param sources The sources of the simulation application.
     */
    public fun sources(sources: IResolvable)

    /**
     * @param sources The sources of the simulation application.
     */
    public fun sources(sources: List<Any>)

    /**
     * @param sources The sources of the simulation application.
     */
    public fun sources(vararg sources: Any)

    /**
     * @param tags A map that contains tag keys and tag values that are attached to the simulation
     * application.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder =
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.builder()

    /**
     * @param currentRevisionId The current revision id.
     */
    override fun currentRevisionId(currentRevisionId: String) {
      cdkBuilder.currentRevisionId(currentRevisionId)
    }

    /**
     * @param environment The environment of the simulation application.
     */
    override fun environment(environment: String) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param name The name of the simulation application.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param renderingEngine The rendering engine for the simulation application.
     */
    override fun renderingEngine(renderingEngine: IResolvable) {
      cdkBuilder.renderingEngine(renderingEngine.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param renderingEngine The rendering engine for the simulation application.
     */
    override
        fun renderingEngine(renderingEngine: CfnSimulationApplication.RenderingEngineProperty) {
      cdkBuilder.renderingEngine(renderingEngine.let(CfnSimulationApplication.RenderingEngineProperty.Companion::unwrap))
    }

    /**
     * @param renderingEngine The rendering engine for the simulation application.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7582e2453911d1a5f27399303732ddb7f93e66e4ee638d44062b55424aa37be")
    override
        fun renderingEngine(renderingEngine: CfnSimulationApplication.RenderingEngineProperty.Builder.() -> Unit):
        Unit = renderingEngine(CfnSimulationApplication.RenderingEngineProperty(renderingEngine))

    /**
     * @param robotSoftwareSuite The robot software suite used by the simulation application. 
     */
    override fun robotSoftwareSuite(robotSoftwareSuite: IResolvable) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param robotSoftwareSuite The robot software suite used by the simulation application. 
     */
    override
        fun robotSoftwareSuite(robotSoftwareSuite: CfnSimulationApplication.RobotSoftwareSuiteProperty) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(CfnSimulationApplication.RobotSoftwareSuiteProperty.Companion::unwrap))
    }

    /**
     * @param robotSoftwareSuite The robot software suite used by the simulation application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25d30dde7f5cdafe1569830a8d42cf47beda3d87216376c6960ba0286aa84d1b")
    override
        fun robotSoftwareSuite(robotSoftwareSuite: CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder.() -> Unit):
        Unit =
        robotSoftwareSuite(CfnSimulationApplication.RobotSoftwareSuiteProperty(robotSoftwareSuite))

    /**
     * @param simulationSoftwareSuite The simulation software suite used by the simulation
     * application. 
     */
    override fun simulationSoftwareSuite(simulationSoftwareSuite: IResolvable) {
      cdkBuilder.simulationSoftwareSuite(simulationSoftwareSuite.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param simulationSoftwareSuite The simulation software suite used by the simulation
     * application. 
     */
    override
        fun simulationSoftwareSuite(simulationSoftwareSuite: CfnSimulationApplication.SimulationSoftwareSuiteProperty) {
      cdkBuilder.simulationSoftwareSuite(simulationSoftwareSuite.let(CfnSimulationApplication.SimulationSoftwareSuiteProperty.Companion::unwrap))
    }

    /**
     * @param simulationSoftwareSuite The simulation software suite used by the simulation
     * application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bce6aae1ed9a6ba056e883c837ae7c38b3b26192413d45bd4b6a99188a1ca96")
    override
        fun simulationSoftwareSuite(simulationSoftwareSuite: CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder.() -> Unit):
        Unit =
        simulationSoftwareSuite(CfnSimulationApplication.SimulationSoftwareSuiteProperty(simulationSoftwareSuite))

    /**
     * @param sources The sources of the simulation application.
     */
    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sources The sources of the simulation application.
     */
    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param sources The sources of the simulation application.
     */
    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    /**
     * @param tags A map that contains tag keys and tag values that are attached to the simulation
     * application.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps,
  ) : CdkObject(cdkObject),
      CfnSimulationApplicationProps {
    /**
     * The current revision id.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-currentrevisionid)
     */
    override fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

    /**
     * The environment of the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-environment)
     */
    override fun environment(): String? = unwrap(this).getEnvironment()

    /**
     * The name of the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The rendering engine for the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-renderingengine)
     */
    override fun renderingEngine(): Any? = unwrap(this).getRenderingEngine()

    /**
     * The robot software suite used by the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-robotsoftwaresuite)
     */
    override fun robotSoftwareSuite(): Any = unwrap(this).getRobotSoftwareSuite()

    /**
     * The simulation software suite used by the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-simulationsoftwaresuite)
     */
    override fun simulationSoftwareSuite(): Any = unwrap(this).getSimulationSoftwareSuite()

    /**
     * The sources of the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-sources)
     */
    override fun sources(): Any? = unwrap(this).getSources()

    /**
     * A map that contains tag keys and tag values that are attached to the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSimulationApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps):
        CfnSimulationApplicationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSimulationApplicationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSimulationApplicationProps):
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps
  }
}
