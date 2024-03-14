package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccelerator internal constructor(
  private val cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnAccelerator,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAcceleratorArn(): String = unwrap(this).getAttrAcceleratorArn()

  public open fun attrDnsName(): String = unwrap(this).getAttrDnsName()

  public open fun attrDualStackDnsName(): String = unwrap(this).getAttrDualStackDnsName()

  public open fun attrIpv4Addresses(): List<String> = unwrap(this).getAttrIpv4Addresses() ?:
      emptyList()

  public open fun attrIpv6Addresses(): List<String> = unwrap(this).getAttrIpv6Addresses() ?:
      emptyList()

  public open fun enabled(): Any? = unwrap(this).getEnabled()

  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  public open fun ipAddresses(): List<String> = unwrap(this).getIpAddresses() ?: emptyList()

  public open fun ipAddresses(`value`: List<String>) {
    unwrap(this).setIpAddresses(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun enabled(enabled: Boolean) {
    }

    public fun enabled(enabled: IResolvable) {
    }

    public fun ipAddressType(ipAddressType: String) {
    }

    public fun ipAddresses(ipAddresses: List<String>) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.CfnAccelerator.Builder
        = software.amazon.awscdk.services.globalaccelerator.CfnAccelerator.Builder.create(scope, id)

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    public override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    public override fun ipAddresses(ipAddresses: List<String>) {
      cdkBuilder.ipAddresses(ipAddresses)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.CfnAccelerator =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccelerator {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccelerator(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnAccelerator):
        CfnAccelerator = CfnAccelerator(cdkObject)

    internal fun unwrap(wrapped: CfnAccelerator):
        software.amazon.awscdk.services.globalaccelerator.CfnAccelerator = wrapped.cdkObject
  }
}
