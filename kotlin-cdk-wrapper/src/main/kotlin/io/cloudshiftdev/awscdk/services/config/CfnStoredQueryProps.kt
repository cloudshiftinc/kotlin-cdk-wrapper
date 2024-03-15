@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnStoredQueryProps {
  public fun queryDescription(): String? = unwrap(this).getQueryDescription()

  public fun queryExpression(): String

  public fun queryName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun queryDescription(queryDescription: String)

    public fun queryExpression(queryExpression: String)

    public fun queryName(queryName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnStoredQueryProps.Builder =
        software.amazon.awscdk.services.config.CfnStoredQueryProps.builder()

    override fun queryDescription(queryDescription: String) {
      cdkBuilder.queryDescription(queryDescription)
    }

    override fun queryExpression(queryExpression: String) {
      cdkBuilder.queryExpression(queryExpression)
    }

    override fun queryName(queryName: String) {
      cdkBuilder.queryName(queryName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.config.CfnStoredQueryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CfnStoredQueryProps,
  ) : CdkObject(cdkObject), CfnStoredQueryProps {
    override fun queryDescription(): String? = unwrap(this).getQueryDescription()

    override fun queryExpression(): String = unwrap(this).getQueryExpression()

    override fun queryName(): String = unwrap(this).getQueryName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStoredQueryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnStoredQueryProps):
        CfnStoredQueryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStoredQueryProps):
        software.amazon.awscdk.services.config.CfnStoredQueryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.config.CfnStoredQueryProps
  }
}
