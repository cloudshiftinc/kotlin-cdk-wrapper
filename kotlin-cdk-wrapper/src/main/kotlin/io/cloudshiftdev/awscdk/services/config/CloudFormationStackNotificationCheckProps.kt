@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CloudFormationStackNotificationCheckProps : RuleProps {
  public fun topics(): List<ITopic> = unwrap(this).getTopics()?.map(ITopic::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun configRuleName(configRuleName: String)

    public fun description(description: String)

    public fun inputParameters(inputParameters: Map<String, Any>)

    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency)

    public fun ruleScope(ruleScope: RuleScope)

    public fun topics(topics: List<ITopic>)

    public fun topics(vararg topics: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps.Builder =
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps.builder()

    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun inputParameters(inputParameters: Map<String, Any>) {
      cdkBuilder.inputParameters(inputParameters)
    }

    override fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency.let(MaximumExecutionFrequency::unwrap))
    }

    override fun ruleScope(ruleScope: RuleScope) {
      cdkBuilder.ruleScope(ruleScope.let(RuleScope::unwrap))
    }

    override fun topics(topics: List<ITopic>) {
      cdkBuilder.topics(topics.map(ITopic::unwrap))
    }

    override fun topics(vararg topics: ITopic): Unit = topics(topics.toList())

    public fun build():
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps,
  ) : CdkObject(cdkObject), CloudFormationStackNotificationCheckProps {
    override fun configRuleName(): String? = unwrap(this).getConfigRuleName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun inputParameters(): Map<String, Any> = unwrap(this).getInputParameters() ?:
        emptyMap()

    override fun maximumExecutionFrequency(): MaximumExecutionFrequency? =
        unwrap(this).getMaximumExecutionFrequency()?.let(MaximumExecutionFrequency::wrap)

    override fun ruleScope(): RuleScope? = unwrap(this).getRuleScope()?.let(RuleScope::wrap)

    override fun topics(): List<ITopic> = unwrap(this).getTopics()?.map(ITopic::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFormationStackNotificationCheckProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps):
        CloudFormationStackNotificationCheckProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationStackNotificationCheckProps):
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps
  }
}
