@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRegexPatternSetProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun regularExpressionList(): List<String>

  public fun scope(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun regularExpressionList(regularExpressionList: List<String>)

    public fun regularExpressionList(vararg regularExpressionList: String)

    public fun scope(scope: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps.Builder =
        software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun regularExpressionList(regularExpressionList: List<String>) {
      cdkBuilder.regularExpressionList(regularExpressionList)
    }

    override fun regularExpressionList(vararg regularExpressionList: String): Unit =
        regularExpressionList(regularExpressionList.toList())

    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps,
  ) : CdkObject(cdkObject), CfnRegexPatternSetProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun regularExpressionList(): List<String> = unwrap(this).getRegularExpressionList()

    override fun scope(): String = unwrap(this).getScope()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRegexPatternSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps):
        CfnRegexPatternSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRegexPatternSetProps):
        software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps
  }
}
