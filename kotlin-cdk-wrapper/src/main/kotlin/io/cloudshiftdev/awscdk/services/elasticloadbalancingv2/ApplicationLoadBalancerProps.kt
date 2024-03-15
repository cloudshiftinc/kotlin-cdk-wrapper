@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ApplicationLoadBalancerProps : BaseLoadBalancerProps {
  public fun desyncMitigationMode(): DesyncMitigationMode? =
      unwrap(this).getDesyncMitigationMode()?.let(DesyncMitigationMode::wrap)

  public fun dropInvalidHeaderFields(): Boolean? = unwrap(this).getDropInvalidHeaderFields()

  public fun http2Enabled(): Boolean? = unwrap(this).getHttp2Enabled()

  public fun idleTimeout(): Duration? = unwrap(this).getIdleTimeout()?.let(Duration::wrap)

  public fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deletionProtection(deletionProtection: Boolean)

    public fun desyncMitigationMode(desyncMitigationMode: DesyncMitigationMode)

    public fun dropInvalidHeaderFields(dropInvalidHeaderFields: Boolean)

    public fun http2Enabled(http2Enabled: Boolean)

    public fun idleTimeout(idleTimeout: Duration)

    public fun internetFacing(internetFacing: Boolean)

    public fun ipAddressType(ipAddressType: IpAddressType)

    public fun loadBalancerName(loadBalancerName: String)

    public fun securityGroup(securityGroup: ISecurityGroup)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f697656458aa2de18c67293ca49b91fb052853eaaa6860bf0c9997bcf6a3b0e9")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps.builder()

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun desyncMitigationMode(desyncMitigationMode: DesyncMitigationMode) {
      cdkBuilder.desyncMitigationMode(desyncMitigationMode.let(DesyncMitigationMode::unwrap))
    }

    override fun dropInvalidHeaderFields(dropInvalidHeaderFields: Boolean) {
      cdkBuilder.dropInvalidHeaderFields(dropInvalidHeaderFields)
    }

    override fun http2Enabled(http2Enabled: Boolean) {
      cdkBuilder.http2Enabled(http2Enabled)
    }

    override fun idleTimeout(idleTimeout: Duration) {
      cdkBuilder.idleTimeout(idleTimeout.let(Duration::unwrap))
    }

    override fun internetFacing(internetFacing: Boolean) {
      cdkBuilder.internetFacing(internetFacing)
    }

    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType::unwrap))
    }

    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f697656458aa2de18c67293ca49b91fb052853eaaa6860bf0c9997bcf6a3b0e9")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps,
  ) : CdkObject(cdkObject), ApplicationLoadBalancerProps {
    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    override fun desyncMitigationMode(): DesyncMitigationMode? =
        unwrap(this).getDesyncMitigationMode()?.let(DesyncMitigationMode::wrap)

    override fun dropInvalidHeaderFields(): Boolean? = unwrap(this).getDropInvalidHeaderFields()

    override fun http2Enabled(): Boolean? = unwrap(this).getHttp2Enabled()

    override fun idleTimeout(): Duration? = unwrap(this).getIdleTimeout()?.let(Duration::wrap)

    override fun internetFacing(): Boolean? = unwrap(this).getInternetFacing()

    override fun ipAddressType(): IpAddressType? =
        unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

    override fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationLoadBalancerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps):
        ApplicationLoadBalancerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancerProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps
  }
}
