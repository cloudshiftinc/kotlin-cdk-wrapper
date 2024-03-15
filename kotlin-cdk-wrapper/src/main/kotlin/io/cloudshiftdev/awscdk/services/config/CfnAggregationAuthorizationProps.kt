@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAggregationAuthorizationProps {
  public fun authorizedAccountId(): String

  public fun authorizedAwsRegion(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun authorizedAccountId(authorizedAccountId: String)

    public fun authorizedAwsRegion(authorizedAwsRegion: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps.Builder =
        software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps.builder()

    override fun authorizedAccountId(authorizedAccountId: String) {
      cdkBuilder.authorizedAccountId(authorizedAccountId)
    }

    override fun authorizedAwsRegion(authorizedAwsRegion: String) {
      cdkBuilder.authorizedAwsRegion(authorizedAwsRegion)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps,
  ) : CdkObject(cdkObject), CfnAggregationAuthorizationProps {
    override fun authorizedAccountId(): String = unwrap(this).getAuthorizedAccountId()

    override fun authorizedAwsRegion(): String = unwrap(this).getAuthorizedAwsRegion()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAggregationAuthorizationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps):
        CfnAggregationAuthorizationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAggregationAuthorizationProps):
        software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps
  }
}
