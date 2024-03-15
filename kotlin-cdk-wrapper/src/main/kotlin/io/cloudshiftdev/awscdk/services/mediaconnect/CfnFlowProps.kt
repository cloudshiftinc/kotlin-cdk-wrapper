@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnFlowProps {
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public fun name(): String

  public fun source(): Any

  public fun sourceFailoverConfig(): Any? = unwrap(this).getSourceFailoverConfig()

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZone(availabilityZone: String)

    public fun name(name: String)

    public fun source(source: IResolvable)

    public fun source(source: CfnFlow.SourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ecb865427adcb4bed201c326a7d9a7da0305d5e811ab20fd4e6e93fc28e05a5")
    public fun source(source: CfnFlow.SourceProperty.Builder.() -> Unit)

    public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable)

    public fun sourceFailoverConfig(sourceFailoverConfig: CfnFlow.FailoverConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("605e84d7038f36749ef82bb5d123ad174c0f22bf4883a1719e210e853f3c3adf")
    public
        fun sourceFailoverConfig(sourceFailoverConfig: CfnFlow.FailoverConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlowProps.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnFlowProps.builder()

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    override fun source(source: CfnFlow.SourceProperty) {
      cdkBuilder.source(source.let(CfnFlow.SourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ecb865427adcb4bed201c326a7d9a7da0305d5e811ab20fd4e6e93fc28e05a5")
    override fun source(source: CfnFlow.SourceProperty.Builder.() -> Unit): Unit =
        source(CfnFlow.SourceProperty(source))

    override fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(IResolvable::unwrap))
    }

    override fun sourceFailoverConfig(sourceFailoverConfig: CfnFlow.FailoverConfigProperty) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(CfnFlow.FailoverConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("605e84d7038f36749ef82bb5d123ad174c0f22bf4883a1719e210e853f3c3adf")
    override
        fun sourceFailoverConfig(sourceFailoverConfig: CfnFlow.FailoverConfigProperty.Builder.() -> Unit):
        Unit = sourceFailoverConfig(CfnFlow.FailoverConfigProperty(sourceFailoverConfig))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowProps,
  ) : CdkObject(cdkObject), CfnFlowProps {
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun name(): String = unwrap(this).getName()

    override fun source(): Any = unwrap(this).getSource()

    override fun sourceFailoverConfig(): Any? = unwrap(this).getSourceFailoverConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowProps):
        CfnFlowProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowProps):
        software.amazon.awscdk.services.mediaconnect.CfnFlowProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.mediaconnect.CfnFlowProps
  }
}
