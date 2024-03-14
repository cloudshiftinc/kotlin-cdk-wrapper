package io.cloudshiftdev.awscdk.services.neptunegraph

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPrivateGraphEndpoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpoint,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrPrivateGraphEndpointIdentifier(): String =
      unwrap(this).getAttrPrivateGraphEndpointIdentifier()

  public open fun attrVpcEndpointId(): String = unwrap(this).getAttrVpcEndpointId()

  public open fun graphIdentifier(): String = unwrap(this).getGraphIdentifier()

  public open fun graphIdentifier(`value`: String) {
    unwrap(this).setGraphIdentifier(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  public open fun vpcId(): String = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  public interface Builder {
    public fun graphIdentifier(graphIdentifier: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpoint.Builder =
        software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpoint.Builder.create(scope,
        id)

    override fun graphIdentifier(graphIdentifier: String) {
      cdkBuilder.graphIdentifier(graphIdentifier)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPrivateGraphEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPrivateGraphEndpoint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpoint):
        CfnPrivateGraphEndpoint = CfnPrivateGraphEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnPrivateGraphEndpoint):
        software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpoint = wrapped.cdkObject
  }
}
