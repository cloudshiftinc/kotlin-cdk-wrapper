package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIPSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.wafv2.CfnIPSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun addresses(): List<String> = unwrap(this).getAddresses() ?: emptyList()

  public open fun addresses(`value`: List<String>) {
    unwrap(this).setAddresses(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipAddressVersion(): String = unwrap(this).getIpAddressVersion()

  public open fun ipAddressVersion(`value`: String) {
    unwrap(this).setIpAddressVersion(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun scope(): String = unwrap(this).getScope()

  public open fun scope(`value`: String) {
    unwrap(this).setScope(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun addresses(addresses: List<String>)

    public fun description(description: String)

    public fun ipAddressVersion(ipAddressVersion: String)

    public fun name(name: String)

    public fun scope(scope: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnIPSet.Builder =
        software.amazon.awscdk.services.wafv2.CfnIPSet.Builder.create(scope, id)

    override fun addresses(addresses: List<String>) {
      cdkBuilder.addresses(addresses)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ipAddressVersion(ipAddressVersion: String) {
      cdkBuilder.ipAddressVersion(ipAddressVersion)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.wafv2.CfnIPSet = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnIPSet): CfnIPSet =
        CfnIPSet(cdkObject)

    internal fun unwrap(wrapped: CfnIPSet): software.amazon.awscdk.services.wafv2.CfnIPSet =
        wrapped.cdkObject
  }
}
