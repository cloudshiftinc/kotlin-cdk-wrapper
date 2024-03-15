@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnProfileProps {
  public fun as2Id(): String

  public fun certificateIds(): List<String> = unwrap(this).getCertificateIds() ?: emptyList()

  public fun profileType(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun as2Id(as2Id: String)

    public fun certificateIds(certificateIds: List<String>)

    public fun certificateIds(vararg certificateIds: String)

    public fun profileType(profileType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnProfileProps.Builder =
        software.amazon.awscdk.services.transfer.CfnProfileProps.builder()

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

    public fun build(): software.amazon.awscdk.services.transfer.CfnProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.transfer.CfnProfileProps,
  ) : CdkObject(cdkObject), CfnProfileProps {
    override fun as2Id(): String = unwrap(this).getAs2Id()

    override fun certificateIds(): List<String> = unwrap(this).getCertificateIds() ?: emptyList()

    override fun profileType(): String = unwrap(this).getProfileType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnProfileProps):
        CfnProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProfileProps):
        software.amazon.awscdk.services.transfer.CfnProfileProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.transfer.CfnProfileProps
  }
}
