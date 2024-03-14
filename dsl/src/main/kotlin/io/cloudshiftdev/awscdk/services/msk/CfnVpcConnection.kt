package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVpcConnection internal constructor(
  private val cdkObject: software.amazon.awscdk.services.msk.CfnVpcConnection,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun authentication(): String = unwrap(this).getAuthentication()

  public open fun authentication(`value`: String) {
    unwrap(this).setAuthentication(`value`)
  }

  public open fun clientSubnets(): List<String> = unwrap(this).getClientSubnets()

  public open fun clientSubnets(`value`: List<String>) {
    unwrap(this).setClientSubnets(`value`)
  }

  public open fun clientSubnets(vararg `value`: String): Unit = clientSubnets(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups()

  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  public open fun securityGroups(vararg `value`: String): Unit = securityGroups(`value`.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun targetClusterArn(): String = unwrap(this).getTargetClusterArn()

  public open fun targetClusterArn(`value`: String) {
    unwrap(this).setTargetClusterArn(`value`)
  }

  public open fun vpcId(): String = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  public interface Builder {
    public fun authentication(authentication: String)

    public fun clientSubnets(clientSubnets: List<String>)

    public fun clientSubnets(vararg clientSubnets: String)

    public fun securityGroups(securityGroups: List<String>)

    public fun securityGroups(vararg securityGroups: String)

    public fun tags(tags: Map<String, String>)

    public fun targetClusterArn(targetClusterArn: String)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnVpcConnection.Builder =
        software.amazon.awscdk.services.msk.CfnVpcConnection.Builder.create(scope, id)

    override fun authentication(authentication: String) {
      cdkBuilder.authentication(authentication)
    }

    override fun clientSubnets(clientSubnets: List<String>) {
      cdkBuilder.clientSubnets(clientSubnets)
    }

    override fun clientSubnets(vararg clientSubnets: String): Unit =
        clientSubnets(clientSubnets.toList())

    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun targetClusterArn(targetClusterArn: String) {
      cdkBuilder.targetClusterArn(targetClusterArn)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnVpcConnection = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVpcConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVpcConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnVpcConnection):
        CfnVpcConnection = CfnVpcConnection(cdkObject)

    internal fun unwrap(wrapped: CfnVpcConnection):
        software.amazon.awscdk.services.msk.CfnVpcConnection = wrapped.cdkObject
  }
}
