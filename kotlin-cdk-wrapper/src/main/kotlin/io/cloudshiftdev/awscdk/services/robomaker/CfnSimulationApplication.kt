@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::RoboMaker::SimulationApplication` resource creates an AWS RoboMaker simulation
 * application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.robomaker.*;
 * CfnSimulationApplication cfnSimulationApplication = CfnSimulationApplication.Builder.create(this,
 * "MyCfnSimulationApplication")
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
public open class CfnSimulationApplication internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.robomaker.CfnSimulationApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the simulation application.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The current revision id.
   */
  public open fun attrCurrentRevisionId(): String = unwrap(this).getAttrCurrentRevisionId()

  /**
   * The current revision id.
   */
  public open fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

  /**
   * The current revision id.
   */
  public open fun currentRevisionId(`value`: String) {
    unwrap(this).setCurrentRevisionId(`value`)
  }

  /**
   * The environment of the simulation application.
   */
  public open fun environment(): String? = unwrap(this).getEnvironment()

  /**
   * The environment of the simulation application.
   */
  public open fun environment(`value`: String) {
    unwrap(this).setEnvironment(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the simulation application.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the simulation application.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The rendering engine for the simulation application.
   */
  public open fun renderingEngine(): Any? = unwrap(this).getRenderingEngine()

  /**
   * The rendering engine for the simulation application.
   */
  public open fun renderingEngine(`value`: IResolvable) {
    unwrap(this).setRenderingEngine(`value`.let(IResolvable::unwrap))
  }

  /**
   * The rendering engine for the simulation application.
   */
  public open fun renderingEngine(`value`: RenderingEngineProperty) {
    unwrap(this).setRenderingEngine(`value`.let(RenderingEngineProperty::unwrap))
  }

  /**
   * The rendering engine for the simulation application.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3831c7b7b954d477242a39c6a78591b3605f02ac9f8066f5450cf9fa02d15a34")
  public open fun renderingEngine(`value`: RenderingEngineProperty.Builder.() -> Unit): Unit =
      renderingEngine(RenderingEngineProperty(`value`))

  /**
   * The robot software suite used by the simulation application.
   */
  public open fun robotSoftwareSuite(): Any = unwrap(this).getRobotSoftwareSuite()

  /**
   * The robot software suite used by the simulation application.
   */
  public open fun robotSoftwareSuite(`value`: IResolvable) {
    unwrap(this).setRobotSoftwareSuite(`value`.let(IResolvable::unwrap))
  }

  /**
   * The robot software suite used by the simulation application.
   */
  public open fun robotSoftwareSuite(`value`: RobotSoftwareSuiteProperty) {
    unwrap(this).setRobotSoftwareSuite(`value`.let(RobotSoftwareSuiteProperty::unwrap))
  }

  /**
   * The robot software suite used by the simulation application.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3fbda70060208e1d6da454d1684546719b682a8fdad6075f48813c02b3a0ebfd")
  public open fun robotSoftwareSuite(`value`: RobotSoftwareSuiteProperty.Builder.() -> Unit): Unit =
      robotSoftwareSuite(RobotSoftwareSuiteProperty(`value`))

  /**
   * The simulation software suite used by the simulation application.
   */
  public open fun simulationSoftwareSuite(): Any = unwrap(this).getSimulationSoftwareSuite()

  /**
   * The simulation software suite used by the simulation application.
   */
  public open fun simulationSoftwareSuite(`value`: IResolvable) {
    unwrap(this).setSimulationSoftwareSuite(`value`.let(IResolvable::unwrap))
  }

  /**
   * The simulation software suite used by the simulation application.
   */
  public open fun simulationSoftwareSuite(`value`: SimulationSoftwareSuiteProperty) {
    unwrap(this).setSimulationSoftwareSuite(`value`.let(SimulationSoftwareSuiteProperty::unwrap))
  }

  /**
   * The simulation software suite used by the simulation application.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d8d46860273ab2f5c665dbba798528062984c0e56e3f7635c50240c753074770")
  public open
      fun simulationSoftwareSuite(`value`: SimulationSoftwareSuiteProperty.Builder.() -> Unit): Unit
      = simulationSoftwareSuite(SimulationSoftwareSuiteProperty(`value`))

  /**
   * The sources of the simulation application.
   */
  public open fun sources(): Any? = unwrap(this).getSources()

  /**
   * The sources of the simulation application.
   */
  public open fun sources(`value`: IResolvable) {
    unwrap(this).setSources(`value`.let(IResolvable::unwrap))
  }

  /**
   * The sources of the simulation application.
   */
  public open fun sources(`value`: List<Any>) {
    unwrap(this).setSources(`value`)
  }

  /**
   * The sources of the simulation application.
   */
  public open fun sources(vararg `value`: Any): Unit = sources(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A map that contains tag keys and tag values that are attached to the simulation application.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * A map that contains tag keys and tag values that are attached to the simulation application.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.robomaker.CfnSimulationApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The current revision id.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-currentrevisionid)
     * @param currentRevisionId The current revision id. 
     */
    public fun currentRevisionId(currentRevisionId: String)

    /**
     * The environment of the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-environment)
     * @param environment The environment of the simulation application. 
     */
    public fun environment(environment: String)

    /**
     * The name of the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-name)
     * @param name The name of the simulation application. 
     */
    public fun name(name: String)

    /**
     * The rendering engine for the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-renderingengine)
     * @param renderingEngine The rendering engine for the simulation application. 
     */
    public fun renderingEngine(renderingEngine: IResolvable)

    /**
     * The rendering engine for the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-renderingengine)
     * @param renderingEngine The rendering engine for the simulation application. 
     */
    public fun renderingEngine(renderingEngine: RenderingEngineProperty)

    /**
     * The rendering engine for the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-renderingengine)
     * @param renderingEngine The rendering engine for the simulation application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5cf0c427601194a1cf47914b769b5337a7b8505c0a0d7d203f1e0daa16beabe")
    public fun renderingEngine(renderingEngine: RenderingEngineProperty.Builder.() -> Unit)

    /**
     * The robot software suite used by the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-robotsoftwaresuite)
     * @param robotSoftwareSuite The robot software suite used by the simulation application. 
     */
    public fun robotSoftwareSuite(robotSoftwareSuite: IResolvable)

    /**
     * The robot software suite used by the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-robotsoftwaresuite)
     * @param robotSoftwareSuite The robot software suite used by the simulation application. 
     */
    public fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty)

    /**
     * The robot software suite used by the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-robotsoftwaresuite)
     * @param robotSoftwareSuite The robot software suite used by the simulation application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0174d698c624015b15a267fb705bee6eed258cda097efe8d9742789a5ed91a4a")
    public fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty.Builder.() -> Unit)

    /**
     * The simulation software suite used by the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-simulationsoftwaresuite)
     * @param simulationSoftwareSuite The simulation software suite used by the simulation
     * application. 
     */
    public fun simulationSoftwareSuite(simulationSoftwareSuite: IResolvable)

    /**
     * The simulation software suite used by the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-simulationsoftwaresuite)
     * @param simulationSoftwareSuite The simulation software suite used by the simulation
     * application. 
     */
    public fun simulationSoftwareSuite(simulationSoftwareSuite: SimulationSoftwareSuiteProperty)

    /**
     * The simulation software suite used by the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-simulationsoftwaresuite)
     * @param simulationSoftwareSuite The simulation software suite used by the simulation
     * application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96b5d089d3ea0c69a258645056fa3668552a75f0eea04b27f426832ffca68fcd")
    public
        fun simulationSoftwareSuite(simulationSoftwareSuite: SimulationSoftwareSuiteProperty.Builder.() -> Unit)

    /**
     * The sources of the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-sources)
     * @param sources The sources of the simulation application. 
     */
    public fun sources(sources: IResolvable)

    /**
     * The sources of the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-sources)
     * @param sources The sources of the simulation application. 
     */
    public fun sources(sources: List<Any>)

    /**
     * The sources of the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-sources)
     * @param sources The sources of the simulation application. 
     */
    public fun sources(vararg sources: Any)

    /**
     * A map that contains tag keys and tag values that are attached to the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-tags)
     * @param tags A map that contains tag keys and tag values that are attached to the simulation
     * application. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.robomaker.CfnSimulationApplication.Builder =
        software.amazon.awscdk.services.robomaker.CfnSimulationApplication.Builder.create(scope, id)

    /**
     * The current revision id.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-currentrevisionid)
     * @param currentRevisionId The current revision id. 
     */
    override fun currentRevisionId(currentRevisionId: String) {
      cdkBuilder.currentRevisionId(currentRevisionId)
    }

    /**
     * The environment of the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-environment)
     * @param environment The environment of the simulation application. 
     */
    override fun environment(environment: String) {
      cdkBuilder.environment(environment)
    }

    /**
     * The name of the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-name)
     * @param name The name of the simulation application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The rendering engine for the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-renderingengine)
     * @param renderingEngine The rendering engine for the simulation application. 
     */
    override fun renderingEngine(renderingEngine: IResolvable) {
      cdkBuilder.renderingEngine(renderingEngine.let(IResolvable::unwrap))
    }

    /**
     * The rendering engine for the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-renderingengine)
     * @param renderingEngine The rendering engine for the simulation application. 
     */
    override fun renderingEngine(renderingEngine: RenderingEngineProperty) {
      cdkBuilder.renderingEngine(renderingEngine.let(RenderingEngineProperty::unwrap))
    }

    /**
     * The rendering engine for the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-renderingengine)
     * @param renderingEngine The rendering engine for the simulation application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5cf0c427601194a1cf47914b769b5337a7b8505c0a0d7d203f1e0daa16beabe")
    override fun renderingEngine(renderingEngine: RenderingEngineProperty.Builder.() -> Unit): Unit
        = renderingEngine(RenderingEngineProperty(renderingEngine))

    /**
     * The robot software suite used by the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-robotsoftwaresuite)
     * @param robotSoftwareSuite The robot software suite used by the simulation application. 
     */
    override fun robotSoftwareSuite(robotSoftwareSuite: IResolvable) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(IResolvable::unwrap))
    }

    /**
     * The robot software suite used by the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-robotsoftwaresuite)
     * @param robotSoftwareSuite The robot software suite used by the simulation application. 
     */
    override fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(RobotSoftwareSuiteProperty::unwrap))
    }

    /**
     * The robot software suite used by the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-robotsoftwaresuite)
     * @param robotSoftwareSuite The robot software suite used by the simulation application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0174d698c624015b15a267fb705bee6eed258cda097efe8d9742789a5ed91a4a")
    override
        fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty.Builder.() -> Unit):
        Unit = robotSoftwareSuite(RobotSoftwareSuiteProperty(robotSoftwareSuite))

    /**
     * The simulation software suite used by the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-simulationsoftwaresuite)
     * @param simulationSoftwareSuite The simulation software suite used by the simulation
     * application. 
     */
    override fun simulationSoftwareSuite(simulationSoftwareSuite: IResolvable) {
      cdkBuilder.simulationSoftwareSuite(simulationSoftwareSuite.let(IResolvable::unwrap))
    }

    /**
     * The simulation software suite used by the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-simulationsoftwaresuite)
     * @param simulationSoftwareSuite The simulation software suite used by the simulation
     * application. 
     */
    override fun simulationSoftwareSuite(simulationSoftwareSuite: SimulationSoftwareSuiteProperty) {
      cdkBuilder.simulationSoftwareSuite(simulationSoftwareSuite.let(SimulationSoftwareSuiteProperty::unwrap))
    }

    /**
     * The simulation software suite used by the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-simulationsoftwaresuite)
     * @param simulationSoftwareSuite The simulation software suite used by the simulation
     * application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96b5d089d3ea0c69a258645056fa3668552a75f0eea04b27f426832ffca68fcd")
    override
        fun simulationSoftwareSuite(simulationSoftwareSuite: SimulationSoftwareSuiteProperty.Builder.() -> Unit):
        Unit = simulationSoftwareSuite(SimulationSoftwareSuiteProperty(simulationSoftwareSuite))

    /**
     * The sources of the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-sources)
     * @param sources The sources of the simulation application. 
     */
    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable::unwrap))
    }

    /**
     * The sources of the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-sources)
     * @param sources The sources of the simulation application. 
     */
    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources)
    }

    /**
     * The sources of the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-sources)
     * @param sources The sources of the simulation application. 
     */
    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    /**
     * A map that contains tag keys and tag values that are attached to the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-tags)
     * @param tags A map that contains tag keys and tag values that are attached to the simulation
     * application. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.robomaker.CfnSimulationApplication =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.robomaker.CfnSimulationApplication.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSimulationApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSimulationApplication(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplication):
        CfnSimulationApplication = CfnSimulationApplication(cdkObject)

    internal fun unwrap(wrapped: CfnSimulationApplication):
        software.amazon.awscdk.services.robomaker.CfnSimulationApplication = wrapped.cdkObject
  }

  /**
   * Information about a simulation software suite.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.robomaker.*;
   * SimulationSoftwareSuiteProperty simulationSoftwareSuiteProperty =
   * SimulationSoftwareSuiteProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-simulationsoftwaresuite.html)
   */
  public interface SimulationSoftwareSuiteProperty {
    /**
     * The name of the simulation software suite.
     *
     * `SimulationRuntime` is the only supported value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-simulationsoftwaresuite.html#cfn-robomaker-simulationapplication-simulationsoftwaresuite-name)
     */
    public fun name(): String

    /**
     * The version of the simulation software suite.
     *
     * Not applicable for `SimulationRuntime` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-simulationsoftwaresuite.html#cfn-robomaker-simulationapplication-simulationsoftwaresuite-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [SimulationSoftwareSuiteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the simulation software suite. 
       * `SimulationRuntime` is the only supported value.
       */
      public fun name(name: String)

      /**
       * @param version The version of the simulation software suite.
       * Not applicable for `SimulationRuntime` .
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder
          =
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty.builder()

      /**
       * @param name The name of the simulation software suite. 
       * `SimulationRuntime` is the only supported value.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param version The version of the simulation software suite.
       * Not applicable for `SimulationRuntime` .
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty,
    ) : CdkObject(cdkObject), SimulationSoftwareSuiteProperty {
      /**
       * The name of the simulation software suite.
       *
       * `SimulationRuntime` is the only supported value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-simulationsoftwaresuite.html#cfn-robomaker-simulationapplication-simulationsoftwaresuite-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The version of the simulation software suite.
       *
       * Not applicable for `SimulationRuntime` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-simulationsoftwaresuite.html#cfn-robomaker-simulationapplication-simulationsoftwaresuite-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SimulationSoftwareSuiteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty):
          SimulationSoftwareSuiteProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SimulationSoftwareSuiteProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SimulationSoftwareSuiteProperty):
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty
    }
  }

  /**
   * Information about a rendering engine.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.robomaker.*;
   * RenderingEngineProperty renderingEngineProperty = RenderingEngineProperty.builder()
   * .name("name")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-renderingengine.html)
   */
  public interface RenderingEngineProperty {
    /**
     * The name of the rendering engine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-renderingengine.html#cfn-robomaker-simulationapplication-renderingengine-name)
     */
    public fun name(): String

    /**
     * The version of the rendering engine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-renderingengine.html#cfn-robomaker-simulationapplication-renderingengine-version)
     */
    public fun version(): String

    /**
     * A builder for [RenderingEngineProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the rendering engine. 
       */
      public fun name(name: String)

      /**
       * @param version The version of the rendering engine. 
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty.Builder
          =
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty.builder()

      /**
       * @param name The name of the rendering engine. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param version The version of the rendering engine. 
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty,
    ) : CdkObject(cdkObject), RenderingEngineProperty {
      /**
       * The name of the rendering engine.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-renderingengine.html#cfn-robomaker-simulationapplication-renderingengine-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The version of the rendering engine.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-renderingengine.html#cfn-robomaker-simulationapplication-renderingengine-version)
       */
      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RenderingEngineProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty):
          RenderingEngineProperty = CdkObjectWrappers.wrap(cdkObject) as? RenderingEngineProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RenderingEngineProperty):
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty
    }
  }

  /**
   * Information about a source configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.robomaker.*;
   * SourceConfigProperty sourceConfigProperty = SourceConfigProperty.builder()
   * .architecture("architecture")
   * .s3Bucket("s3Bucket")
   * .s3Key("s3Key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-sourceconfig.html)
   */
  public interface SourceConfigProperty {
    /**
     * The target processor architecture for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-sourceconfig.html#cfn-robomaker-simulationapplication-sourceconfig-architecture)
     */
    public fun architecture(): String

    /**
     * The Amazon S3 bucket name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-sourceconfig.html#cfn-robomaker-simulationapplication-sourceconfig-s3bucket)
     */
    public fun s3Bucket(): String

    /**
     * The s3 object key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-sourceconfig.html#cfn-robomaker-simulationapplication-sourceconfig-s3key)
     */
    public fun s3Key(): String

    /**
     * A builder for [SourceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param architecture The target processor architecture for the application. 
       */
      public fun architecture(architecture: String)

      /**
       * @param s3Bucket The Amazon S3 bucket name. 
       */
      public fun s3Bucket(s3Bucket: String)

      /**
       * @param s3Key The s3 object key. 
       */
      public fun s3Key(s3Key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty.builder()

      /**
       * @param architecture The target processor architecture for the application. 
       */
      override fun architecture(architecture: String) {
        cdkBuilder.architecture(architecture)
      }

      /**
       * @param s3Bucket The Amazon S3 bucket name. 
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      /**
       * @param s3Key The s3 object key. 
       */
      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      public fun build():
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty,
    ) : CdkObject(cdkObject), SourceConfigProperty {
      /**
       * The target processor architecture for the application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-sourceconfig.html#cfn-robomaker-simulationapplication-sourceconfig-architecture)
       */
      override fun architecture(): String = unwrap(this).getArchitecture()

      /**
       * The Amazon S3 bucket name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-sourceconfig.html#cfn-robomaker-simulationapplication-sourceconfig-s3bucket)
       */
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      /**
       * The s3 object key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-sourceconfig.html#cfn-robomaker-simulationapplication-sourceconfig-s3key)
       */
      override fun s3Key(): String = unwrap(this).getS3Key()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty):
          SourceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? SourceConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceConfigProperty):
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty
    }
  }

  /**
   * Information about a robot software suite.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.robomaker.*;
   * RobotSoftwareSuiteProperty robotSoftwareSuiteProperty = RobotSoftwareSuiteProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-robotsoftwaresuite.html)
   */
  public interface RobotSoftwareSuiteProperty {
    /**
     * The name of the robot software suite.
     *
     * `General` is the only supported value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-robotsoftwaresuite.html#cfn-robomaker-simulationapplication-robotsoftwaresuite-name)
     */
    public fun name(): String

    /**
     * The version of the robot software suite.
     *
     * Not applicable for General software suite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-robotsoftwaresuite.html#cfn-robomaker-simulationapplication-robotsoftwaresuite-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [RobotSoftwareSuiteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the robot software suite. 
       * `General` is the only supported value.
       */
      public fun name(name: String)

      /**
       * @param version The version of the robot software suite.
       * Not applicable for General software suite.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder
          =
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty.builder()

      /**
       * @param name The name of the robot software suite. 
       * `General` is the only supported value.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param version The version of the robot software suite.
       * Not applicable for General software suite.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty,
    ) : CdkObject(cdkObject), RobotSoftwareSuiteProperty {
      /**
       * The name of the robot software suite.
       *
       * `General` is the only supported value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-robotsoftwaresuite.html#cfn-robomaker-simulationapplication-robotsoftwaresuite-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The version of the robot software suite.
       *
       * Not applicable for General software suite.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-robotsoftwaresuite.html#cfn-robomaker-simulationapplication-robotsoftwaresuite-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RobotSoftwareSuiteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty):
          RobotSoftwareSuiteProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RobotSoftwareSuiteProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RobotSoftwareSuiteProperty):
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty
    }
  }
}
