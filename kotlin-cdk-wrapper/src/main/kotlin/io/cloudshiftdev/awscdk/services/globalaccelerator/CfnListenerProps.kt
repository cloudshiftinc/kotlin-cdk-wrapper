@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnListenerProps {
  public fun acceleratorArn(): String

  public fun clientAffinity(): String? = unwrap(this).getClientAffinity()

  public fun portRanges(): Any

  public fun protocol(): String

  @CdkDslMarker
  public interface Builder {
    public fun acceleratorArn(acceleratorArn: String)

    public fun clientAffinity(clientAffinity: String)

    public fun portRanges(portRanges: IResolvable)

    public fun portRanges(portRanges: List<Any>)

    public fun portRanges(vararg portRanges: Any)

    public fun protocol(protocol: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.CfnListenerProps.Builder =
        software.amazon.awscdk.services.globalaccelerator.CfnListenerProps.builder()

    override fun acceleratorArn(acceleratorArn: String) {
      cdkBuilder.acceleratorArn(acceleratorArn)
    }

    override fun clientAffinity(clientAffinity: String) {
      cdkBuilder.clientAffinity(clientAffinity)
    }

    override fun portRanges(portRanges: IResolvable) {
      cdkBuilder.portRanges(portRanges.let(IResolvable::unwrap))
    }

    override fun portRanges(portRanges: List<Any>) {
      cdkBuilder.portRanges(portRanges)
    }

    override fun portRanges(vararg portRanges: Any): Unit = portRanges(portRanges.toList())

    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.CfnListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnListenerProps,
  ) : CdkObject(cdkObject), CfnListenerProps {
    override fun acceleratorArn(): String = unwrap(this).getAcceleratorArn()

    override fun clientAffinity(): String? = unwrap(this).getClientAffinity()

    override fun portRanges(): Any = unwrap(this).getPortRanges()

    override fun protocol(): String = unwrap(this).getProtocol()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnListenerProps):
        CfnListenerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnListenerProps):
        software.amazon.awscdk.services.globalaccelerator.CfnListenerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.CfnListenerProps
  }
}
