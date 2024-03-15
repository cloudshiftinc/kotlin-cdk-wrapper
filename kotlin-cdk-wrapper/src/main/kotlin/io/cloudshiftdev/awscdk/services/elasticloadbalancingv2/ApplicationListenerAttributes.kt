@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ApplicationListenerAttributes {
  public fun defaultPort(): Number? = unwrap(this).getDefaultPort()

  public fun listenerArn(): String

  public fun securityGroup(): ISecurityGroup

  @CdkDslMarker
  public interface Builder {
    public fun defaultPort(defaultPort: Number)

    public fun listenerArn(listenerArn: String)

    public fun securityGroup(securityGroup: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes.builder()

    override fun defaultPort(defaultPort: Number) {
      cdkBuilder.defaultPort(defaultPort)
    }

    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes,
  ) : CdkObject(cdkObject), ApplicationListenerAttributes {
    override fun defaultPort(): Number? = unwrap(this).getDefaultPort()

    override fun listenerArn(): String = unwrap(this).getListenerArn()

    override fun securityGroup(): ISecurityGroup =
        unwrap(this).getSecurityGroup().let(ISecurityGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationListenerAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes):
        ApplicationListenerAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationListenerAttributes):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes
  }
}
