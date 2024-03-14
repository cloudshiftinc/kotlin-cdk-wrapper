package io.cloudshiftdev.awscdk.services.iam

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

public open class CfnVirtualMFADevice internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.CfnVirtualMFADevice,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrSerialNumber(): String = unwrap(this).getAttrSerialNumber()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun path(): String? = unwrap(this).getPath()

  public open fun path(`value`: String) {
    unwrap(this).setPath(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()

  public open fun users(`value`: List<String>) {
    unwrap(this).setUsers(`value`)
  }

  public open fun virtualMfaDeviceName(): String? = unwrap(this).getVirtualMfaDeviceName()

  public open fun virtualMfaDeviceName(`value`: String) {
    unwrap(this).setVirtualMfaDeviceName(`value`)
  }

  public interface Builder {
    public fun path(path: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun users(users: List<String>) {
    }

    public fun virtualMfaDeviceName(virtualMfaDeviceName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnVirtualMFADevice.Builder =
        software.amazon.awscdk.services.iam.CfnVirtualMFADevice.Builder.create(scope, id)

    public override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    public override fun virtualMfaDeviceName(virtualMfaDeviceName: String) {
      cdkBuilder.virtualMfaDeviceName(virtualMfaDeviceName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnVirtualMFADevice = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVirtualMFADevice {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVirtualMFADevice(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnVirtualMFADevice):
        CfnVirtualMFADevice = CfnVirtualMFADevice(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualMFADevice):
        software.amazon.awscdk.services.iam.CfnVirtualMFADevice = wrapped.cdkObject
  }
}
