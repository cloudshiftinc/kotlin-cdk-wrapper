package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVpcConnector internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcConnector,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrVpcConnectorArn(): String = unwrap(this).getAttrVpcConnectorArn()

  public open fun attrVpcConnectorRevision(): Number = unwrap(this).getAttrVpcConnectorRevision()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  public open fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

  public open fun subnets(`value`: List<String>) {
    unwrap(this).setSubnets(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun vpcConnectorName(): String? = unwrap(this).getVpcConnectorName()

  public open fun vpcConnectorName(`value`: String) {
    unwrap(this).setVpcConnectorName(`value`)
  }

  public interface Builder {
    public fun securityGroups(securityGroups: List<String>)

    public fun subnets(subnets: List<String>)

    public fun tags(tags: List<CfnTag>)

    public fun vpcConnectorName(vpcConnectorName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apprunner.CfnVpcConnector.Builder =
        software.amazon.awscdk.services.apprunner.CfnVpcConnector.Builder.create(scope, id)

    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun vpcConnectorName(vpcConnectorName: String) {
      cdkBuilder.vpcConnectorName(vpcConnectorName)
    }

    public fun build(): software.amazon.awscdk.services.apprunner.CfnVpcConnector =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVpcConnector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVpcConnector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcConnector):
        CfnVpcConnector = CfnVpcConnector(cdkObject)

    internal fun unwrap(wrapped: CfnVpcConnector):
        software.amazon.awscdk.services.apprunner.CfnVpcConnector = wrapped.cdkObject
  }
}
