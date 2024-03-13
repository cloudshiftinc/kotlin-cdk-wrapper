package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class InterfaceVpcEndpoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint,
) : VpcEndpoint(cdkObject), IInterfaceVpcEndpoint {
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public open fun vpcEndpointCreationTimestamp(): String =
      unwrap(this).getVpcEndpointCreationTimestamp()

  public open fun vpcEndpointDnsEntries(): List<String> = unwrap(this).getVpcEndpointDnsEntries() ?:
      emptyList()

  public override fun vpcEndpointId(): String = unwrap(this).getVpcEndpointId()

  public open fun vpcEndpointNetworkInterfaceIds(): List<String> =
      unwrap(this).getVpcEndpointNetworkInterfaceIds() ?: emptyList()

  public interface Builder {
    public fun lookupSupportedAzs(lookupSupportedAzs: Boolean) {
    }

    public fun `open`(`open`: Boolean) {
    }

    public fun privateDnsEnabled(privateDnsEnabled: Boolean) {
    }

    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }

    public fun service(service: IInterfaceVpcEndpointService) {
    }

    public fun subnets(subnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d78aef04157c83ec653390dbf7d09f4dc3276cd8641ce21de017f7e4c5b6029d")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint.Builder =
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint.Builder.create(scope, id)

    public override fun lookupSupportedAzs(lookupSupportedAzs: Boolean) {
      cdkBuilder.lookupSupportedAzs(lookupSupportedAzs)
    }

    public override fun `open`(`open`: Boolean) {
      cdkBuilder.`open`(`open`)
    }

    public override fun privateDnsEnabled(privateDnsEnabled: Boolean) {
      cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public override fun service(service: IInterfaceVpcEndpointService) {
      cdkBuilder.service(service.let(IInterfaceVpcEndpointService::unwrap))
    }

    public override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d78aef04157c83ec653390dbf7d09f4dc3276cd8641ce21de017f7e4c5b6029d")
    public override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromInterfaceVpcEndpointAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: InterfaceVpcEndpointAttributes,
    ): IInterfaceVpcEndpoint =
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint.fromInterfaceVpcEndpointAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(InterfaceVpcEndpointAttributes::unwrap)).let(IInterfaceVpcEndpoint::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("043f62487a2a59022231e31cd1d63b4fdc03fcd7d42e156db33883fa2f60c551")
    public open fun fromInterfaceVpcEndpointAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: InterfaceVpcEndpointAttributes.Builder.() -> Unit,
    ): IInterfaceVpcEndpoint = fromInterfaceVpcEndpointAttributes(scope, id,
        InterfaceVpcEndpointAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): InterfaceVpcEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return InterfaceVpcEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint):
        InterfaceVpcEndpoint = InterfaceVpcEndpoint(cdkObject)

    internal fun unwrap(wrapped: InterfaceVpcEndpoint):
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint = wrapped.cdkObject
  }
}
