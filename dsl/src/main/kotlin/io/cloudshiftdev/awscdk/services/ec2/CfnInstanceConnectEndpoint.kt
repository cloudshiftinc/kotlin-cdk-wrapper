package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstanceConnectEndpoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun clientToken(): String? = unwrap(this).getClientToken()

  public open fun clientToken(`value`: String) {
    unwrap(this).setClientToken(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun preserveClientIp(): Any? = unwrap(this).getPreserveClientIp()

  public open fun preserveClientIp(`value`: Boolean) {
    unwrap(this).setPreserveClientIp(`value`)
  }

  public open fun preserveClientIp(`value`: IResolvable) {
    unwrap(this).setPreserveClientIp(`value`.let(IResolvable::unwrap))
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun subnetId(): String = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun clientToken(clientToken: String)

    public fun preserveClientIp(preserveClientIp: Boolean)

    public fun preserveClientIp(preserveClientIp: IResolvable)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun subnetId(subnetId: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint.Builder =
        software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint.Builder.create(scope, id)

    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

    override fun preserveClientIp(preserveClientIp: IResolvable) {
      cdkBuilder.preserveClientIp(preserveClientIp.let(IResolvable::unwrap))
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceConnectEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceConnectEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint):
        CfnInstanceConnectEndpoint = CfnInstanceConnectEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceConnectEndpoint):
        software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint = wrapped.cdkObject
  }
}
