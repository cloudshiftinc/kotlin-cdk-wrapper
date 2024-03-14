package io.cloudshiftdev.awscdk.services.ec2

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

public open class CfnDHCPOptions internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnDHCPOptions,
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

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun netbiosNameServers(): List<String> = unwrap(this).getNetbiosNameServers() ?:
      emptyList()

  public open fun netbiosNameServers(`value`: List<String>) {
    unwrap(this).setNetbiosNameServers(`value`)
  }

  public open fun netbiosNodeType(): Number? = unwrap(this).getNetbiosNodeType()

  public open fun netbiosNodeType(`value`: Number) {
    unwrap(this).setNetbiosNodeType(`value`)
  }

  public open fun ntpServers(): List<String> = unwrap(this).getNtpServers() ?: emptyList()

  public open fun ntpServers(`value`: List<String>) {
    unwrap(this).setNtpServers(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun domainName(domainName: String) {
    }

    public fun domainNameServers(domainNameServers: List<String>) {
    }

    public fun netbiosNameServers(netbiosNameServers: List<String>) {
    }

    public fun netbiosNodeType(netbiosNodeType: Number) {
    }

    public fun ntpServers(ntpServers: List<String>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnDHCPOptions.Builder =
        software.amazon.awscdk.services.ec2.CfnDHCPOptions.Builder.create(scope, id)

    public override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public override fun domainNameServers(domainNameServers: List<String>) {
      cdkBuilder.domainNameServers(domainNameServers)
    }

    public override fun netbiosNameServers(netbiosNameServers: List<String>) {
      cdkBuilder.netbiosNameServers(netbiosNameServers)
    }

    public override fun netbiosNodeType(netbiosNodeType: Number) {
      cdkBuilder.netbiosNodeType(netbiosNodeType)
    }

    public override fun ntpServers(ntpServers: List<String>) {
      cdkBuilder.ntpServers(ntpServers)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnDHCPOptions = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
