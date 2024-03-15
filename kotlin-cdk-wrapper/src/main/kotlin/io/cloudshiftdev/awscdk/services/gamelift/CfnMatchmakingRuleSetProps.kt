@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnMatchmakingRuleSetProps {
  public fun name(): String

  public fun ruleSetBody(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun ruleSetBody(ruleSetBody: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun ruleSetBody(ruleSetBody: String) {
      cdkBuilder.ruleSetBody(ruleSetBody)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps,
  ) : CdkObject(cdkObject), CfnMatchmakingRuleSetProps {
    override fun name(): String = unwrap(this).getName()

    override fun ruleSetBody(): String = unwrap(this).getRuleSetBody()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMatchmakingRuleSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps):
        CfnMatchmakingRuleSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMatchmakingRuleSetProps):
        software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps
  }
}
