@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface LoadBalancerProps {
  public fun accessLoggingPolicy(): CfnLoadBalancer.AccessLoggingPolicyProperty? =
      unwrap(this).getAccessLoggingPolicy()?.let(CfnLoadBalancer.AccessLoggingPolicyProperty::wrap)

  public fun crossZone(): Boolean? = unwrap(this).getCrossZone()

  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  public fun internetFacing(): Boolean? = unwrap(this).getInternetFacing()

  public fun listeners(): List<LoadBalancerListener> =
      unwrap(this).getListeners()?.map(LoadBalancerListener::wrap) ?: emptyList()

  public fun subnetSelection(): SubnetSelection? =
      unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

  public fun targets(): List<ILoadBalancerTarget> =
      unwrap(this).getTargets()?.map(ILoadBalancerTarget::wrap) ?: emptyList()

  public fun vpc(): IVpc

  @CdkDslMarker
  public interface Builder {
    public fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8a3190865c19df1b84c51211b0acb133e87169d0dbe7bb832088cb1ee967dd2")
    public
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit)

    public fun crossZone(crossZone: Boolean)

    public fun healthCheck(healthCheck: HealthCheck)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5fc2af6950327ca269256b8e706f124dd82a1db30f51cbac36100b7fbd92fa6")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    public fun internetFacing(internetFacing: Boolean)

    public fun listeners(listeners: List<LoadBalancerListener>)

    public fun listeners(vararg listeners: LoadBalancerListener)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d645e12edc9392d4e52337f7d228d9ec87e3c639bc45187f9e4fc32e5ba0ed7c")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun targets(targets: List<ILoadBalancerTarget>)

    public fun targets(vararg targets: ILoadBalancerTarget)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps.builder()

    override
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty) {
      cdkBuilder.accessLoggingPolicy(accessLoggingPolicy.let(CfnLoadBalancer.AccessLoggingPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8a3190865c19df1b84c51211b0acb133e87169d0dbe7bb832088cb1ee967dd2")
    override
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit):
        Unit = accessLoggingPolicy(CfnLoadBalancer.AccessLoggingPolicyProperty(accessLoggingPolicy))

    override fun crossZone(crossZone: Boolean) {
      cdkBuilder.crossZone(crossZone)
    }

    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5fc2af6950327ca269256b8e706f124dd82a1db30f51cbac36100b7fbd92fa6")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    override fun internetFacing(internetFacing: Boolean) {
      cdkBuilder.internetFacing(internetFacing)
    }

    override fun listeners(listeners: List<LoadBalancerListener>) {
      cdkBuilder.listeners(listeners.map(LoadBalancerListener::unwrap))
    }

    override fun listeners(vararg listeners: LoadBalancerListener): Unit =
        listeners(listeners.toList())

    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d645e12edc9392d4e52337f7d228d9ec87e3c639bc45187f9e4fc32e5ba0ed7c")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun targets(targets: List<ILoadBalancerTarget>) {
      cdkBuilder.targets(targets.map(ILoadBalancerTarget::unwrap))
    }

    override fun targets(vararg targets: ILoadBalancerTarget): Unit = targets(targets.toList())

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps,
  ) : CdkObject(cdkObject), LoadBalancerProps {
    override fun accessLoggingPolicy(): CfnLoadBalancer.AccessLoggingPolicyProperty? =
        unwrap(this).getAccessLoggingPolicy()?.let(CfnLoadBalancer.AccessLoggingPolicyProperty::wrap)

    override fun crossZone(): Boolean? = unwrap(this).getCrossZone()

    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    override fun internetFacing(): Boolean? = unwrap(this).getInternetFacing()

    override fun listeners(): List<LoadBalancerListener> =
        unwrap(this).getListeners()?.map(LoadBalancerListener::wrap) ?: emptyList()

    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    override fun targets(): List<ILoadBalancerTarget> =
        unwrap(this).getTargets()?.map(ILoadBalancerTarget::wrap) ?: emptyList()

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps):
        LoadBalancerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerProps):
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps
  }
}
