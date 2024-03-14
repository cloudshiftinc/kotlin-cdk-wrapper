package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSimulationApplication internal constructor(
  private val cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCurrentRevisionId(): String = unwrap(this).getAttrCurrentRevisionId()

  public open fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

  public open fun currentRevisionId(`value`: String) {
    unwrap(this).setCurrentRevisionId(`value`)
  }

  public open fun environment(): String? = unwrap(this).getEnvironment()

  public open fun environment(`value`: String) {
    unwrap(this).setEnvironment(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun renderingEngine(): Any? = unwrap(this).getRenderingEngine()

  public open fun renderingEngine(`value`: IResolvable) {
    unwrap(this).setRenderingEngine(`value`.let(IResolvable::unwrap))
  }

  public open fun renderingEngine(`value`: RenderingEngineProperty) {
    unwrap(this).setRenderingEngine(`value`.let(RenderingEngineProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3831c7b7b954d477242a39c6a78591b3605f02ac9f8066f5450cf9fa02d15a34")
  public open fun renderingEngine(`value`: RenderingEngineProperty.Builder.() -> Unit): Unit =
      renderingEngine(RenderingEngineProperty(`value`))

  public open fun robotSoftwareSuite(): Any = unwrap(this).getRobotSoftwareSuite()

  public open fun robotSoftwareSuite(`value`: IResolvable) {
    unwrap(this).setRobotSoftwareSuite(`value`.let(IResolvable::unwrap))
  }

  public open fun robotSoftwareSuite(`value`: RobotSoftwareSuiteProperty) {
    unwrap(this).setRobotSoftwareSuite(`value`.let(RobotSoftwareSuiteProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3fbda70060208e1d6da454d1684546719b682a8fdad6075f48813c02b3a0ebfd")
  public open fun robotSoftwareSuite(`value`: RobotSoftwareSuiteProperty.Builder.() -> Unit): Unit =
      robotSoftwareSuite(RobotSoftwareSuiteProperty(`value`))

  public open fun simulationSoftwareSuite(): Any = unwrap(this).getSimulationSoftwareSuite()

  public open fun simulationSoftwareSuite(`value`: IResolvable) {
    unwrap(this).setSimulationSoftwareSuite(`value`.let(IResolvable::unwrap))
  }

  public open fun simulationSoftwareSuite(`value`: SimulationSoftwareSuiteProperty) {
    unwrap(this).setSimulationSoftwareSuite(`value`.let(SimulationSoftwareSuiteProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d8d46860273ab2f5c665dbba798528062984c0e56e3f7635c50240c753074770")
  public open
      fun simulationSoftwareSuite(`value`: SimulationSoftwareSuiteProperty.Builder.() -> Unit): Unit
      = simulationSoftwareSuite(SimulationSoftwareSuiteProperty(`value`))

  public open fun sources(): Any? = unwrap(this).getSources()

  public open fun sources(`value`: IResolvable) {
    unwrap(this).setSources(`value`.let(IResolvable::unwrap))
  }

  public open fun sources(__idx_ac66f0: List<Any>) {
    unwrap(this).setSources(__idx_ac66f0)
  }

  public open fun sources(vararg __idx_ac66f0: Any): Unit = sources(__idx_ac66f0.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun currentRevisionId(currentRevisionId: String)

    public fun environment(environment: String)

    public fun name(name: String)

    public fun renderingEngine(renderingEngine: IResolvable)

    public fun renderingEngine(renderingEngine: RenderingEngineProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5cf0c427601194a1cf47914b769b5337a7b8505c0a0d7d203f1e0daa16beabe")
    public fun renderingEngine(renderingEngine: RenderingEngineProperty.Builder.() -> Unit)

    public fun robotSoftwareSuite(robotSoftwareSuite: IResolvable)

    public fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0174d698c624015b15a267fb705bee6eed258cda097efe8d9742789a5ed91a4a")
    public fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty.Builder.() -> Unit)

    public fun simulationSoftwareSuite(simulationSoftwareSuite: IResolvable)

    public fun simulationSoftwareSuite(simulationSoftwareSuite: SimulationSoftwareSuiteProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96b5d089d3ea0c69a258645056fa3668552a75f0eea04b27f426832ffca68fcd")
    public
        fun simulationSoftwareSuite(simulationSoftwareSuite: SimulationSoftwareSuiteProperty.Builder.() -> Unit)

    public fun sources(sources: IResolvable)

    public fun sources(sources: List<Any>)

    public fun sources(vararg sources: Any)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.robomaker.CfnSimulationApplication.Builder =
        software.amazon.awscdk.services.robomaker.CfnSimulationApplication.Builder.create(scope, id)

    override fun currentRevisionId(currentRevisionId: String) {
      cdkBuilder.currentRevisionId(currentRevisionId)
    }

    override fun environment(environment: String) {
      cdkBuilder.environment(environment)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun renderingEngine(renderingEngine: IResolvable) {
      cdkBuilder.renderingEngine(renderingEngine.let(IResolvable::unwrap))
    }

    override fun renderingEngine(renderingEngine: RenderingEngineProperty) {
      cdkBuilder.renderingEngine(renderingEngine.let(RenderingEngineProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5cf0c427601194a1cf47914b769b5337a7b8505c0a0d7d203f1e0daa16beabe")
    override fun renderingEngine(renderingEngine: RenderingEngineProperty.Builder.() -> Unit): Unit
        = renderingEngine(RenderingEngineProperty(renderingEngine))

    override fun robotSoftwareSuite(robotSoftwareSuite: IResolvable) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(IResolvable::unwrap))
    }

    override fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(RobotSoftwareSuiteProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0174d698c624015b15a267fb705bee6eed258cda097efe8d9742789a5ed91a4a")
    override
        fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty.Builder.() -> Unit):
        Unit = robotSoftwareSuite(RobotSoftwareSuiteProperty(robotSoftwareSuite))

    override fun simulationSoftwareSuite(simulationSoftwareSuite: IResolvable) {
      cdkBuilder.simulationSoftwareSuite(simulationSoftwareSuite.let(IResolvable::unwrap))
    }

    override fun simulationSoftwareSuite(simulationSoftwareSuite: SimulationSoftwareSuiteProperty) {
      cdkBuilder.simulationSoftwareSuite(simulationSoftwareSuite.let(SimulationSoftwareSuiteProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96b5d089d3ea0c69a258645056fa3668552a75f0eea04b27f426832ffca68fcd")
    override
        fun simulationSoftwareSuite(simulationSoftwareSuite: SimulationSoftwareSuiteProperty.Builder.() -> Unit):
        Unit = simulationSoftwareSuite(SimulationSoftwareSuiteProperty(simulationSoftwareSuite))

    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable::unwrap))
    }

    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources)
    }

    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.robomaker.CfnSimulationApplication =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

  public interface SimulationSoftwareSuiteProperty {
    public fun name(): String

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun name(name: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder
          =
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty,
    ) : SimulationSoftwareSuiteProperty {
      override fun name(): String = unwrap(this).getName()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SimulationSoftwareSuiteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty):
          SimulationSoftwareSuiteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SimulationSoftwareSuiteProperty):
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RenderingEngineProperty {
    public fun name(): String

    public fun version(): String

    public interface Builder {
      public fun name(name: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty.Builder
          =
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty,
    ) : RenderingEngineProperty {
      override fun name(): String = unwrap(this).getName()

      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RenderingEngineProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty):
          RenderingEngineProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RenderingEngineProperty):
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SourceConfigProperty {
    public fun architecture(): String

    public fun s3Bucket(): String

    public fun s3Key(): String

    public interface Builder {
      public fun architecture(architecture: String)

      public fun s3Bucket(s3Bucket: String)

      public fun s3Key(s3Key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty.builder()

      override fun architecture(architecture: String) {
        cdkBuilder.architecture(architecture)
      }

      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      public fun build():
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty,
    ) : SourceConfigProperty {
      override fun architecture(): String = unwrap(this).getArchitecture()

      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      override fun s3Key(): String = unwrap(this).getS3Key()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty):
          SourceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceConfigProperty):
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RobotSoftwareSuiteProperty {
    public fun name(): String

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun name(name: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder
          =
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty,
    ) : RobotSoftwareSuiteProperty {
      override fun name(): String = unwrap(this).getName()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RobotSoftwareSuiteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty):
          RobotSoftwareSuiteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RobotSoftwareSuiteProperty):
          software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
