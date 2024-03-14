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

public open class CfnProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.transfer.CfnProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun as2Id(): String = unwrap(this).getAs2Id()

  public open fun as2Id(`value`: String) {
    unwrap(this).setAs2Id(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrProfileId(): String = unwrap(this).getAttrProfileId()

  public open fun certificateIds(): List<String> = unwrap(this).getCertificateIds() ?: emptyList()

  public open fun certificateIds(`value`: List<String>) {
    unwrap(this).setCertificateIds(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun profileType(): String = unwrap(this).getProfileType()

  public open fun profileType(`value`: String) {
    unwrap(this).setProfileType(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun as2Id(as2Id: String) {
    }

    public fun certificateIds(certificateIds: List<String>) {
    }

    public fun profileType(profileType: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnProfile.Builder =
        software.amazon.awscdk.services.transfer.CfnProfile.Builder.create(scope, id)

    public override fun as2Id(as2Id: String) {
      cdkBuilder.as2Id(as2Id)
    }

    public override fun certificateIds(certificateIds: List<String>) {
      cdkBuilder.certificateIds(certificateIds)
    }

    public override fun profileType(profileType: String) {
      cdkBuilder.profileType(profileType)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.transfer.CfnProfile = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnProfile): CfnProfile =
        CfnProfile(cdkObject)

    internal fun unwrap(wrapped: CfnProfile): software.amazon.awscdk.services.transfer.CfnProfile =
        wrapped.cdkObject
  }
}
