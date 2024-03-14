package io.cloudshiftdev.awscdk.services.codestarconnections

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

public open class CfnConnection internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codestarconnections.CfnConnection,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrConnectionArn(): String = unwrap(this).getAttrConnectionArn()

  public open fun attrConnectionStatus(): String = unwrap(this).getAttrConnectionStatus()

  public open fun attrOwnerAccountId(): String = unwrap(this).getAttrOwnerAccountId()

  public open fun connectionName(): String = unwrap(this).getConnectionName()

  public open fun connectionName(`value`: String) {
    unwrap(this).setConnectionName(`value`)
  }

  public open fun hostArn(): String? = unwrap(this).getHostArn()

  public open fun hostArn(`value`: String) {
    unwrap(this).setHostArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun providerType(): String? = unwrap(this).getProviderType()

  public open fun providerType(`value`: String) {
    unwrap(this).setProviderType(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun connectionName(connectionName: String) {
    }

    public fun hostArn(hostArn: String) {
    }

    public fun providerType(providerType: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarconnections.CfnConnection.Builder =
        software.amazon.awscdk.services.codestarconnections.CfnConnection.Builder.create(scope, id)

    public override fun connectionName(connectionName: String) {
      cdkBuilder.connectionName(connectionName)
    }

    public override fun hostArn(hostArn: String) {
      cdkBuilder.hostArn(hostArn)
    }

    public override fun providerType(providerType: String) {
      cdkBuilder.providerType(providerType)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codestarconnections.CfnConnection =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codestarconnections.CfnConnection):
        CfnConnection = CfnConnection(cdkObject)

    internal fun unwrap(wrapped: CfnConnection):
        software.amazon.awscdk.services.codestarconnections.CfnConnection = wrapped.cdkObject
  }
}
