@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.transfer.CfnProfile,
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

  public open fun certificateIds(vararg `value`: String): Unit = certificateIds(`value`.toList())

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

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun as2Id(as2Id: String)

    public fun certificateIds(certificateIds: List<String>)

    public fun certificateIds(vararg certificateIds: String)

    public fun profileType(profileType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnProfile.Builder =
        software.amazon.awscdk.services.transfer.CfnProfile.Builder.create(scope, id)

    override fun as2Id(as2Id: String) {
      cdkBuilder.as2Id(as2Id)
    }

    override fun certificateIds(certificateIds: List<String>) {
      cdkBuilder.certificateIds(certificateIds)
    }

    override fun certificateIds(vararg certificateIds: String): Unit =
        certificateIds(certificateIds.toList())

    override fun profileType(profileType: String) {
      cdkBuilder.profileType(profileType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.transfer.CfnProfile = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.transfer.CfnProfile.CFN_RESOURCE_TYPE_NAME

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
