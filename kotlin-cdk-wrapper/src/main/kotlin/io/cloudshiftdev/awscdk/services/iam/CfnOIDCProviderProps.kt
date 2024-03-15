@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnOIDCProviderProps {
  public fun clientIdList(): List<String> = unwrap(this).getClientIdList() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun thumbprintList(): List<String>

  public fun url(): String? = unwrap(this).getUrl()

  @CdkDslMarker
  public interface Builder {
    public fun clientIdList(clientIdList: List<String>)

    public fun clientIdList(vararg clientIdList: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun thumbprintList(thumbprintList: List<String>)

    public fun thumbprintList(vararg thumbprintList: String)

    public fun url(url: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnOIDCProviderProps.Builder =
        software.amazon.awscdk.services.iam.CfnOIDCProviderProps.builder()

    override fun clientIdList(clientIdList: List<String>) {
      cdkBuilder.clientIdList(clientIdList)
    }

    override fun clientIdList(vararg clientIdList: String): Unit =
        clientIdList(clientIdList.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun thumbprintList(thumbprintList: List<String>) {
      cdkBuilder.thumbprintList(thumbprintList)
    }

    override fun thumbprintList(vararg thumbprintList: String): Unit =
        thumbprintList(thumbprintList.toList())

    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnOIDCProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnOIDCProviderProps,
  ) : CdkObject(cdkObject), CfnOIDCProviderProps {
    override fun clientIdList(): List<String> = unwrap(this).getClientIdList() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun thumbprintList(): List<String> = unwrap(this).getThumbprintList()

    override fun url(): String? = unwrap(this).getUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOIDCProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnOIDCProviderProps):
        CfnOIDCProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOIDCProviderProps):
        software.amazon.awscdk.services.iam.CfnOIDCProviderProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.CfnOIDCProviderProps
  }
}
