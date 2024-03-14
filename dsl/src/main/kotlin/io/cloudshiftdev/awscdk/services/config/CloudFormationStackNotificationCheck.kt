package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CloudFormationStackNotificationCheck internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck,
) : ManagedRule(cdkObject) {
  public interface Builder {
    public fun configRuleName(configRuleName: String)

    public fun description(description: String)

    public fun inputParameters(inputParameters: Map<String, Any>)

    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency)

    public fun ruleScope(ruleScope: RuleScope)

    public fun topics(topics: List<ITopic>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck.Builder =
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck.Builder.create(scope,
        id)

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

    public fun build(): software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck
        = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CloudFormationStackNotificationCheck {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CloudFormationStackNotificationCheck(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck):
        CloudFormationStackNotificationCheck = CloudFormationStackNotificationCheck(cdkObject)

    internal fun unwrap(wrapped: CloudFormationStackNotificationCheck):
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck =
        wrapped.cdkObject
  }
}
