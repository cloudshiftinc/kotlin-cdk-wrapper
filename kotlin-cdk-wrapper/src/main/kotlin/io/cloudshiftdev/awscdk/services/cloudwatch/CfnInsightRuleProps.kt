@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnInsightRuleProps {
  public fun ruleBody(): String

  public fun ruleName(): String

  public fun ruleState(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun ruleBody(ruleBody: String)

    public fun ruleName(ruleName: String)

    public fun ruleState(ruleState: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps.builder()

    override fun ruleBody(ruleBody: String) {
      cdkBuilder.ruleBody(ruleBody)
    }

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun ruleState(ruleState: String) {
      cdkBuilder.ruleState(ruleState)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps,
  ) : CdkObject(cdkObject), CfnInsightRuleProps {
    override fun ruleBody(): String = unwrap(this).getRuleBody()

    override fun ruleName(): String = unwrap(this).getRuleName()

    override fun ruleState(): String = unwrap(this).getRuleState()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInsightRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps):
        CfnInsightRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInsightRuleProps):
        software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps
  }
}
