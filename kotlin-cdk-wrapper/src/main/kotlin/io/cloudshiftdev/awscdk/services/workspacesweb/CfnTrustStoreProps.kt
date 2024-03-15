@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTrustStoreProps {
  public fun certificateList(): List<String>

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun certificateList(certificateList: List<String>)

    public fun certificateList(vararg certificateList: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps.Builder
        = software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps.builder()

    override fun certificateList(certificateList: List<String>) {
      cdkBuilder.certificateList(certificateList)
    }

    override fun certificateList(vararg certificateList: String): Unit =
        certificateList(certificateList.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps,
  ) : CdkObject(cdkObject), CfnTrustStoreProps {
    override fun certificateList(): List<String> = unwrap(this).getCertificateList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrustStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps):
        CfnTrustStoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrustStoreProps):
        software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps
  }
}
