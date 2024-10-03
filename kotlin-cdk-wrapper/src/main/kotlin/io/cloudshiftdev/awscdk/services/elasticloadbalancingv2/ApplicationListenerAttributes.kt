@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties to reference an existing listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * SecurityGroup securityGroup;
 * ApplicationListenerAttributes applicationListenerAttributes =
 * ApplicationListenerAttributes.builder()
 * .listenerArn("listenerArn")
 * .securityGroup(securityGroup)
 * // the properties below are optional
 * .defaultPort(123)
 * .build();
 * ```
 */
public interface ApplicationListenerAttributes {
  /**
   * The default port on which this listener is listening.
   */
  public fun defaultPort(): Number? = unwrap(this).getDefaultPort()

  /**
   * ARN of the listener.
   */
  public fun listenerArn(): String

  /**
   * Security group of the load balancer this listener is associated with.
   */
  public fun securityGroup(): ISecurityGroup

  /**
   * A builder for [ApplicationListenerAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultPort The default port on which this listener is listening.
     */
    public fun defaultPort(defaultPort: Number)

    /**
     * @param listenerArn ARN of the listener. 
     */
    public fun listenerArn(listenerArn: String)

    /**
     * @param securityGroup Security group of the load balancer this listener is associated with. 
     */
    public fun securityGroup(securityGroup: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes.builder()

    /**
     * @param defaultPort The default port on which this listener is listening.
     */
    override fun defaultPort(defaultPort: Number) {
      cdkBuilder.defaultPort(defaultPort)
    }

    /**
     * @param listenerArn ARN of the listener. 
     */
    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    /**
     * @param securityGroup Security group of the load balancer this listener is associated with. 
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes,
  ) : CdkObject(cdkObject),
      ApplicationListenerAttributes {
    /**
     * The default port on which this listener is listening.
     */
    override fun defaultPort(): Number? = unwrap(this).getDefaultPort()

    /**
     * ARN of the listener.
     */
    override fun listenerArn(): String = unwrap(this).getListenerArn()

    /**
     * Security group of the load balancer this listener is associated with.
     */
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
        ApplicationListenerAttributes = CdkObjectWrappers.wrap(cdkObject) as?
        ApplicationListenerAttributes ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationListenerAttributes):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes
  }
}
