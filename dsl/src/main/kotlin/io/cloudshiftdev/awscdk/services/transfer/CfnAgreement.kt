package io.cloudshiftdev.awscdk.services.transfer

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

public open class CfnAgreement internal constructor(
  private val cdkObject: software.amazon.awscdk.services.transfer.CfnAgreement,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessRole(): String = unwrap(this).getAccessRole()

  public open fun accessRole(`value`: String) {
    unwrap(this).setAccessRole(`value`)
  }

  public open fun attrAgreementId(): String = unwrap(this).getAttrAgreementId()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun baseDirectory(): String = unwrap(this).getBaseDirectory()

  public open fun baseDirectory(`value`: String) {
    unwrap(this).setBaseDirectory(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun localProfileId(): String = unwrap(this).getLocalProfileId()

  public open fun localProfileId(`value`: String) {
    unwrap(this).setLocalProfileId(`value`)
  }

  public open fun partnerProfileId(): String = unwrap(this).getPartnerProfileId()

  public open fun partnerProfileId(`value`: String) {
    unwrap(this).setPartnerProfileId(`value`)
  }

  public open fun serverId(): String = unwrap(this).getServerId()

  public open fun serverId(`value`: String) {
    unwrap(this).setServerId(`value`)
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun accessRole(accessRole: String) {
    }

    public fun baseDirectory(baseDirectory: String) {
    }

    public fun description(description: String) {
    }

    public fun localProfileId(localProfileId: String) {
    }

    public fun partnerProfileId(partnerProfileId: String) {
    }

    public fun serverId(serverId: String) {
    }

    public fun status(status: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnAgreement.Builder =
        software.amazon.awscdk.services.transfer.CfnAgreement.Builder.create(scope, id)

    public override fun accessRole(accessRole: String) {
      cdkBuilder.accessRole(accessRole)
    }

    public override fun baseDirectory(baseDirectory: String) {
      cdkBuilder.baseDirectory(baseDirectory)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun localProfileId(localProfileId: String) {
      cdkBuilder.localProfileId(localProfileId)
    }

    public override fun partnerProfileId(partnerProfileId: String) {
      cdkBuilder.partnerProfileId(partnerProfileId)
    }

    public override fun serverId(serverId: String) {
      cdkBuilder.serverId(serverId)
    }

    public override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.transfer.CfnAgreement = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAgreement {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAgreement(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnAgreement):
        CfnAgreement = CfnAgreement(cdkObject)

    internal fun unwrap(wrapped: CfnAgreement):
        software.amazon.awscdk.services.transfer.CfnAgreement = wrapped.cdkObject
  }
}
