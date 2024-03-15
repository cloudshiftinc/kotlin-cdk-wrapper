@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnParameterGroupProps {
  public fun cacheParameterGroupFamily(): String

  public fun description(): String

  public fun properties(): Any? = unwrap(this).getProperties()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun cacheParameterGroupFamily(cacheParameterGroupFamily: String)

    public fun description(description: String)

    public fun properties(properties: IResolvable)

    public fun properties(properties: Map<String, String>)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticache.CfnParameterGroupProps.Builder =
        software.amazon.awscdk.services.elasticache.CfnParameterGroupProps.builder()

    override fun cacheParameterGroupFamily(cacheParameterGroupFamily: String) {
      cdkBuilder.cacheParameterGroupFamily(cacheParameterGroupFamily)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun properties(properties: IResolvable) {
      cdkBuilder.properties(properties.let(IResolvable::unwrap))
    }

    override fun properties(properties: Map<String, String>) {
      cdkBuilder.properties(properties)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticache.CfnParameterGroupProps,
  ) : CdkObject(cdkObject), CfnParameterGroupProps {
    override fun cacheParameterGroupFamily(): String = unwrap(this).getCacheParameterGroupFamily()

    override fun description(): String = unwrap(this).getDescription()

    override fun properties(): Any? = unwrap(this).getProperties()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnParameterGroupProps):
        CfnParameterGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnParameterGroupProps):
        software.amazon.awscdk.services.elasticache.CfnParameterGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticache.CfnParameterGroupProps
  }
}
