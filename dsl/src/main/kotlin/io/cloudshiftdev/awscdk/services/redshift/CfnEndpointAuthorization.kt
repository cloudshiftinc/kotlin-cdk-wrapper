package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEndpointAuthorization internal constructor(
  private val cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAuthorization,
) : CfnResource(cdkObject), IInspectable {
  public open fun account(): String = unwrap(this).getAccount()

  public open fun account(`value`: String) {
    unwrap(this).setAccount(`value`)
  }

  public open fun attrAllowedAllVpCs(): IResolvable =
      unwrap(this).getAttrAllowedAllVpCs().let(IResolvable::wrap)

  public open fun attrAllowedVpCs(): List<String> = unwrap(this).getAttrAllowedVpCs() ?: emptyList()

  public open fun attrAuthorizeTime(): String = unwrap(this).getAttrAuthorizeTime()

  public open fun attrClusterStatus(): String = unwrap(this).getAttrClusterStatus()

  public open fun attrEndpointCount(): Number = unwrap(this).getAttrEndpointCount()

  public open fun attrGrantee(): String = unwrap(this).getAttrGrantee()

  public open fun attrGrantor(): String = unwrap(this).getAttrGrantor()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

  public open fun clusterIdentifier(`value`: String) {
    unwrap(this).setClusterIdentifier(`value`)
  }

  public open fun force(): Any? = unwrap(this).getForce()

  public open fun force(`value`: Boolean) {
    unwrap(this).setForce(`value`)
  }

  public open fun force(`value`: IResolvable) {
    unwrap(this).setForce(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun vpcIds(): List<String> = unwrap(this).getVpcIds() ?: emptyList()

  public open fun vpcIds(`value`: List<String>) {
    unwrap(this).setVpcIds(`value`)
  }

  public interface Builder {
    public fun account(account: String)

    public fun clusterIdentifier(clusterIdentifier: String)

    public fun force(force: Boolean)

    public fun force(force: IResolvable)

    public fun vpcIds(vpcIds: List<String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshift.CfnEndpointAuthorization.Builder =
        software.amazon.awscdk.services.redshift.CfnEndpointAuthorization.Builder.create(scope, id)

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    override fun force(force: Boolean) {
      cdkBuilder.force(force)
    }

    override fun force(force: IResolvable) {
      cdkBuilder.force(force.let(IResolvable::unwrap))
    }

    override fun vpcIds(vpcIds: List<String>) {
      cdkBuilder.vpcIds(vpcIds)
    }

    public fun build(): software.amazon.awscdk.services.redshift.CfnEndpointAuthorization =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEndpointAuthorization {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEndpointAuthorization(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAuthorization):
        CfnEndpointAuthorization = CfnEndpointAuthorization(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointAuthorization):
        software.amazon.awscdk.services.redshift.CfnEndpointAuthorization = wrapped.cdkObject
  }
}
