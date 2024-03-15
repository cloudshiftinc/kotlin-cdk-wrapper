@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAgreementProps {
  public fun accessRole(): String

  public fun baseDirectory(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun localProfileId(): String

  public fun partnerProfileId(): String

  public fun serverId(): String

  public fun status(): String? = unwrap(this).getStatus()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accessRole(accessRole: String)

    public fun baseDirectory(baseDirectory: String)

    public fun description(description: String)

    public fun localProfileId(localProfileId: String)

    public fun partnerProfileId(partnerProfileId: String)

    public fun serverId(serverId: String)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnAgreementProps.Builder =
        software.amazon.awscdk.services.transfer.CfnAgreementProps.builder()

    override fun accessRole(accessRole: String) {
      cdkBuilder.accessRole(accessRole)
    }

    override fun baseDirectory(baseDirectory: String) {
      cdkBuilder.baseDirectory(baseDirectory)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun localProfileId(localProfileId: String) {
      cdkBuilder.localProfileId(localProfileId)
    }

    override fun partnerProfileId(partnerProfileId: String) {
      cdkBuilder.partnerProfileId(partnerProfileId)
    }

    override fun serverId(serverId: String) {
      cdkBuilder.serverId(serverId)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.transfer.CfnAgreementProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.transfer.CfnAgreementProps,
  ) : CdkObject(cdkObject), CfnAgreementProps {
    override fun accessRole(): String = unwrap(this).getAccessRole()

    override fun baseDirectory(): String = unwrap(this).getBaseDirectory()

    override fun description(): String? = unwrap(this).getDescription()

    override fun localProfileId(): String = unwrap(this).getLocalProfileId()

    override fun partnerProfileId(): String = unwrap(this).getPartnerProfileId()

    override fun serverId(): String = unwrap(this).getServerId()

    override fun status(): String? = unwrap(this).getStatus()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAgreementProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnAgreementProps):
        CfnAgreementProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAgreementProps):
        software.amazon.awscdk.services.transfer.CfnAgreementProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.transfer.CfnAgreementProps
  }
}
