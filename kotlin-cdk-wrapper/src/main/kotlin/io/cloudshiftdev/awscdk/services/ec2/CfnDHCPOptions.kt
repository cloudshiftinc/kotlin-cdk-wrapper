@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDHCPOptions internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnDHCPOptions,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrDhcpOptionsId(): String = unwrap(this).getAttrDhcpOptionsId()

  public open fun domainName(): String? = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public open fun domainNameServers(): List<String> = unwrap(this).getDomainNameServers() ?:
      emptyList()

  public open fun domainNameServers(`value`: List<String>) {
    unwrap(this).setDomainNameServers(`value`)
  }

  public open fun domainNameServers(vararg `value`: String): Unit =
      domainNameServers(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun netbiosNameServers(): List<String> = unwrap(this).getNetbiosNameServers() ?:
      emptyList()

  public open fun netbiosNameServers(`value`: List<String>) {
    unwrap(this).setNetbiosNameServers(`value`)
  }

  public open fun netbiosNameServers(vararg `value`: String): Unit =
      netbiosNameServers(`value`.toList())

  public open fun netbiosNodeType(): Number? = unwrap(this).getNetbiosNodeType()

  public open fun netbiosNodeType(`value`: Number) {
    unwrap(this).setNetbiosNodeType(`value`)
  }

  public open fun ntpServers(): List<String> = unwrap(this).getNtpServers() ?: emptyList()

  public open fun ntpServers(`value`: List<String>) {
    unwrap(this).setNtpServers(`value`)
  }

  public open fun ntpServers(vararg `value`: String): Unit = ntpServers(`value`.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun domainName(domainName: String)

    public fun domainNameServers(domainNameServers: List<String>)

    public fun domainNameServers(vararg domainNameServers: String)

    public fun netbiosNameServers(netbiosNameServers: List<String>)

    public fun netbiosNameServers(vararg netbiosNameServers: String)

    public fun netbiosNodeType(netbiosNodeType: Number)

    public fun ntpServers(ntpServers: List<String>)

    public fun ntpServers(vararg ntpServers: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnDHCPOptions.Builder =
        software.amazon.awscdk.services.ec2.CfnDHCPOptions.Builder.create(scope, id)

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun domainNameServers(domainNameServers: List<String>) {
      cdkBuilder.domainNameServers(domainNameServers)
    }

    override fun domainNameServers(vararg domainNameServers: String): Unit =
        domainNameServers(domainNameServers.toList())

    override fun netbiosNameServers(netbiosNameServers: List<String>) {
      cdkBuilder.netbiosNameServers(netbiosNameServers)
    }

    override fun netbiosNameServers(vararg netbiosNameServers: String): Unit =
        netbiosNameServers(netbiosNameServers.toList())

    override fun netbiosNodeType(netbiosNodeType: Number) {
      cdkBuilder.netbiosNodeType(netbiosNodeType)
    }

    override fun ntpServers(ntpServers: List<String>) {
      cdkBuilder.ntpServers(ntpServers)
    }

    override fun ntpServers(vararg ntpServers: String): Unit = ntpServers(ntpServers.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnDHCPOptions = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnDHCPOptions.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDHCPOptions {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDHCPOptions(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnDHCPOptions): CfnDHCPOptions
        = CfnDHCPOptions(cdkObject)

    internal fun unwrap(wrapped: CfnDHCPOptions): software.amazon.awscdk.services.ec2.CfnDHCPOptions
        = wrapped.cdkObject
  }
}
