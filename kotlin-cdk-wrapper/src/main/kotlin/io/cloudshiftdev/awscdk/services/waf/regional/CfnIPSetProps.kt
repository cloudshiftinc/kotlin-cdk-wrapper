@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnIPSetProps {
  public fun ipSetDescriptors(): Any? = unwrap(this).getIpSetDescriptors()

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun ipSetDescriptors(ipSetDescriptors: IResolvable)

    public fun ipSetDescriptors(ipSetDescriptors: List<Any>)

    public fun ipSetDescriptors(vararg ipSetDescriptors: Any)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnIPSetProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnIPSetProps.builder()

    override fun ipSetDescriptors(ipSetDescriptors: IResolvable) {
      cdkBuilder.ipSetDescriptors(ipSetDescriptors.let(IResolvable::unwrap))
    }

    override fun ipSetDescriptors(ipSetDescriptors: List<Any>) {
      cdkBuilder.ipSetDescriptors(ipSetDescriptors)
    }

    override fun ipSetDescriptors(vararg ipSetDescriptors: Any): Unit =
        ipSetDescriptors(ipSetDescriptors.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnIPSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnIPSetProps,
  ) : CdkObject(cdkObject), CfnIPSetProps {
    override fun ipSetDescriptors(): Any? = unwrap(this).getIpSetDescriptors()

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnIPSetProps):
        CfnIPSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPSetProps):
        software.amazon.awscdk.services.waf.regional.CfnIPSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.waf.regional.CfnIPSetProps
  }
}
