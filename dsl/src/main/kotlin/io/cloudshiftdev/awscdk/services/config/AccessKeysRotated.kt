package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.Duration
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AccessKeysRotated internal constructor(
  private val cdkObject: software.amazon.awscdk.services.config.AccessKeysRotated,
) : ManagedRule(cdkObject) {
  public interface Builder {
    public fun configRuleName(configRuleName: String)

    public fun description(description: String)

    public fun inputParameters(inputParameters: Map<String, Any>)

    public fun maxAge(maxAge: Duration)

    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency)

    public fun ruleScope(ruleScope: RuleScope)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.AccessKeysRotated.Builder =
        software.amazon.awscdk.services.config.AccessKeysRotated.Builder.create(scope, id)

    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun inputParameters(inputParameters: Map<String, Any>) {
      cdkBuilder.inputParameters(inputParameters)
    }

    override fun maxAge(maxAge: Duration) {
      cdkBuilder.maxAge(maxAge.let(Duration::unwrap))
    }

    override fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency.let(MaximumExecutionFrequency::unwrap))
    }

    override fun ruleScope(ruleScope: RuleScope) {
      cdkBuilder.ruleScope(ruleScope.let(RuleScope::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.config.AccessKeysRotated =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AccessKeysRotated {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AccessKeysRotated(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.AccessKeysRotated):
        AccessKeysRotated = AccessKeysRotated(cdkObject)

    internal fun unwrap(wrapped: AccessKeysRotated):
        software.amazon.awscdk.services.config.AccessKeysRotated = wrapped.cdkObject
  }
}
