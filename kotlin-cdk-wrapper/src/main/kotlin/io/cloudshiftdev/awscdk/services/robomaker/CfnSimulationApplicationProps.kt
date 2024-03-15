@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnSimulationApplicationProps {
  public fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

  public fun environment(): String? = unwrap(this).getEnvironment()

  public fun name(): String? = unwrap(this).getName()

  public fun renderingEngine(): Any? = unwrap(this).getRenderingEngine()

  public fun robotSoftwareSuite(): Any

  public fun simulationSoftwareSuite(): Any

  public fun sources(): Any? = unwrap(this).getSources()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun currentRevisionId(currentRevisionId: String)

    public fun environment(environment: String)

    public fun name(name: String)

    public fun renderingEngine(renderingEngine: IResolvable)

    public fun renderingEngine(renderingEngine: CfnSimulationApplication.RenderingEngineProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7582e2453911d1a5f27399303732ddb7f93e66e4ee638d44062b55424aa37be")
    public
        fun renderingEngine(renderingEngine: CfnSimulationApplication.RenderingEngineProperty.Builder.() -> Unit)

    public fun robotSoftwareSuite(robotSoftwareSuite: IResolvable)

    public
        fun robotSoftwareSuite(robotSoftwareSuite: CfnSimulationApplication.RobotSoftwareSuiteProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25d30dde7f5cdafe1569830a8d42cf47beda3d87216376c6960ba0286aa84d1b")
    public
        fun robotSoftwareSuite(robotSoftwareSuite: CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder.() -> Unit)

    public fun simulationSoftwareSuite(simulationSoftwareSuite: IResolvable)

    public
        fun simulationSoftwareSuite(simulationSoftwareSuite: CfnSimulationApplication.SimulationSoftwareSuiteProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bce6aae1ed9a6ba056e883c837ae7c38b3b26192413d45bd4b6a99188a1ca96")
    public
        fun simulationSoftwareSuite(simulationSoftwareSuite: CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder.() -> Unit)

    public fun sources(sources: IResolvable)

    public fun sources(sources: List<Any>)

    public fun sources(vararg sources: Any)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder =
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.builder()

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

    override
        fun renderingEngine(renderingEngine: CfnSimulationApplication.RenderingEngineProperty) {
      cdkBuilder.renderingEngine(renderingEngine.let(CfnSimulationApplication.RenderingEngineProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7582e2453911d1a5f27399303732ddb7f93e66e4ee638d44062b55424aa37be")
    override
        fun renderingEngine(renderingEngine: CfnSimulationApplication.RenderingEngineProperty.Builder.() -> Unit):
        Unit = renderingEngine(CfnSimulationApplication.RenderingEngineProperty(renderingEngine))

    override fun robotSoftwareSuite(robotSoftwareSuite: IResolvable) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(IResolvable::unwrap))
    }

    override
        fun robotSoftwareSuite(robotSoftwareSuite: CfnSimulationApplication.RobotSoftwareSuiteProperty) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(CfnSimulationApplication.RobotSoftwareSuiteProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25d30dde7f5cdafe1569830a8d42cf47beda3d87216376c6960ba0286aa84d1b")
    override
        fun robotSoftwareSuite(robotSoftwareSuite: CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder.() -> Unit):
        Unit =
        robotSoftwareSuite(CfnSimulationApplication.RobotSoftwareSuiteProperty(robotSoftwareSuite))

    override fun simulationSoftwareSuite(simulationSoftwareSuite: IResolvable) {
      cdkBuilder.simulationSoftwareSuite(simulationSoftwareSuite.let(IResolvable::unwrap))
    }

    override
        fun simulationSoftwareSuite(simulationSoftwareSuite: CfnSimulationApplication.SimulationSoftwareSuiteProperty) {
      cdkBuilder.simulationSoftwareSuite(simulationSoftwareSuite.let(CfnSimulationApplication.SimulationSoftwareSuiteProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bce6aae1ed9a6ba056e883c837ae7c38b3b26192413d45bd4b6a99188a1ca96")
    override
        fun simulationSoftwareSuite(simulationSoftwareSuite: CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder.() -> Unit):
        Unit =
        simulationSoftwareSuite(CfnSimulationApplication.SimulationSoftwareSuiteProperty(simulationSoftwareSuite))

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

    public fun build(): software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps,
  ) : CdkObject(cdkObject), CfnSimulationApplicationProps {
    override fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

    override fun environment(): String? = unwrap(this).getEnvironment()

    override fun name(): String? = unwrap(this).getName()

    override fun renderingEngine(): Any? = unwrap(this).getRenderingEngine()

    override fun robotSoftwareSuite(): Any = unwrap(this).getRobotSoftwareSuite()

    override fun simulationSoftwareSuite(): Any = unwrap(this).getSimulationSoftwareSuite()

    override fun sources(): Any? = unwrap(this).getSources()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSimulationApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps):
        CfnSimulationApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSimulationApplicationProps):
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps
  }
}
