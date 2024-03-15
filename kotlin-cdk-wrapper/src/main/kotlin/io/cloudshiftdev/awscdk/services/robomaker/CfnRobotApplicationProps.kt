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

public interface CfnRobotApplicationProps {
  public fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

  public fun environment(): String? = unwrap(this).getEnvironment()

  public fun name(): String? = unwrap(this).getName()

  public fun robotSoftwareSuite(): Any

  public fun sources(): Any? = unwrap(this).getSources()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun currentRevisionId(currentRevisionId: String)

    public fun environment(environment: String)

    public fun name(name: String)

    public fun robotSoftwareSuite(robotSoftwareSuite: IResolvable)

    public
        fun robotSoftwareSuite(robotSoftwareSuite: CfnRobotApplication.RobotSoftwareSuiteProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("465541b994d723af2f27ebd701fa8f4b49ef12abc4463d563186284a6c80763d")
    public
        fun robotSoftwareSuite(robotSoftwareSuite: CfnRobotApplication.RobotSoftwareSuiteProperty.Builder.() -> Unit)

    public fun sources(sources: IResolvable)

    public fun sources(sources: List<Any>)

    public fun sources(vararg sources: Any)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder =
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.builder()

    override fun currentRevisionId(currentRevisionId: String) {
      cdkBuilder.currentRevisionId(currentRevisionId)
    }

    override fun environment(environment: String) {
      cdkBuilder.environment(environment)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun robotSoftwareSuite(robotSoftwareSuite: IResolvable) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(IResolvable::unwrap))
    }

    override
        fun robotSoftwareSuite(robotSoftwareSuite: CfnRobotApplication.RobotSoftwareSuiteProperty) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(CfnRobotApplication.RobotSoftwareSuiteProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("465541b994d723af2f27ebd701fa8f4b49ef12abc4463d563186284a6c80763d")
    override
        fun robotSoftwareSuite(robotSoftwareSuite: CfnRobotApplication.RobotSoftwareSuiteProperty.Builder.() -> Unit):
        Unit =
        robotSoftwareSuite(CfnRobotApplication.RobotSoftwareSuiteProperty(robotSoftwareSuite))

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

    public fun build(): software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps,
  ) : CdkObject(cdkObject), CfnRobotApplicationProps {
    override fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

    override fun environment(): String? = unwrap(this).getEnvironment()

    override fun name(): String? = unwrap(this).getName()

    override fun robotSoftwareSuite(): Any = unwrap(this).getRobotSoftwareSuite()

    override fun sources(): Any? = unwrap(this).getSources()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRobotApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps):
        CfnRobotApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRobotApplicationProps):
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps
  }
}
