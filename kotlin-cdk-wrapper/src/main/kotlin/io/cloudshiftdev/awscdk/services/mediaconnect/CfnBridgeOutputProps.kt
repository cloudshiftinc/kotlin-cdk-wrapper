@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnBridgeOutputProps {
  public fun bridgeArn(): String

  public fun name(): String

  public fun networkOutput(): Any

  @CdkDslMarker
  public interface Builder {
    public fun bridgeArn(bridgeArn: String)

    public fun name(name: String)

    public fun networkOutput(networkOutput: IResolvable)

    public fun networkOutput(networkOutput: CfnBridgeOutput.BridgeNetworkOutputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3999916e1f03ba7a4a8fcccf4e14d4b51debc62ebec897d60514865280db5eda")
    public
        fun networkOutput(networkOutput: CfnBridgeOutput.BridgeNetworkOutputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps.builder()

    override fun bridgeArn(bridgeArn: String) {
      cdkBuilder.bridgeArn(bridgeArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun networkOutput(networkOutput: IResolvable) {
      cdkBuilder.networkOutput(networkOutput.let(IResolvable::unwrap))
    }

    override fun networkOutput(networkOutput: CfnBridgeOutput.BridgeNetworkOutputProperty) {
      cdkBuilder.networkOutput(networkOutput.let(CfnBridgeOutput.BridgeNetworkOutputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3999916e1f03ba7a4a8fcccf4e14d4b51debc62ebec897d60514865280db5eda")
    override
        fun networkOutput(networkOutput: CfnBridgeOutput.BridgeNetworkOutputProperty.Builder.() -> Unit):
        Unit = networkOutput(CfnBridgeOutput.BridgeNetworkOutputProperty(networkOutput))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps,
  ) : CdkObject(cdkObject), CfnBridgeOutputProps {
    override fun bridgeArn(): String = unwrap(this).getBridgeArn()

    override fun name(): String = unwrap(this).getName()

    override fun networkOutput(): Any = unwrap(this).getNetworkOutput()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBridgeOutputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps):
        CfnBridgeOutputProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBridgeOutputProps):
        software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps
  }
}
