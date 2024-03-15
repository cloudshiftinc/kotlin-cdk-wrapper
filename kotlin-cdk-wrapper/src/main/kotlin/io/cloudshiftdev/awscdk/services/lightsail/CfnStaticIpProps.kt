@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnStaticIpProps {
  public fun attachedTo(): String? = unwrap(this).getAttachedTo()

  public fun staticIpName(): String

  @CdkDslMarker
  public interface Builder {
    public fun attachedTo(attachedTo: String)

    public fun staticIpName(staticIpName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnStaticIpProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnStaticIpProps.builder()

    override fun attachedTo(attachedTo: String) {
      cdkBuilder.attachedTo(attachedTo)
    }

    override fun staticIpName(staticIpName: String) {
      cdkBuilder.staticIpName(staticIpName)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnStaticIpProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnStaticIpProps,
  ) : CdkObject(cdkObject), CfnStaticIpProps {
    override fun attachedTo(): String? = unwrap(this).getAttachedTo()

    override fun staticIpName(): String = unwrap(this).getStaticIpName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStaticIpProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnStaticIpProps):
        CfnStaticIpProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStaticIpProps):
        software.amazon.awscdk.services.lightsail.CfnStaticIpProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lightsail.CfnStaticIpProps
  }
}
