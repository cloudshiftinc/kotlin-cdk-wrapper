@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CloudFormationStackDriftDetectionCheckProps : RuleProps {
  public fun ownStackOnly(): Boolean? = unwrap(this).getOwnStackOnly()

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun configRuleName(configRuleName: String)

    public fun description(description: String)

    public fun inputParameters(inputParameters: Map<String, Any>)

    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency)

    public fun ownStackOnly(ownStackOnly: Boolean)

    public fun role(role: IRole)

    public fun ruleScope(ruleScope: RuleScope)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps.Builder =
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps.builder()

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

    override fun ownStackOnly(ownStackOnly: Boolean) {
      cdkBuilder.ownStackOnly(ownStackOnly)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun ruleScope(ruleScope: RuleScope) {
      cdkBuilder.ruleScope(ruleScope.let(RuleScope::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps,
  ) : CdkObject(cdkObject), CloudFormationStackDriftDetectionCheckProps {
    override fun configRuleName(): String? = unwrap(this).getConfigRuleName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun inputParameters(): Map<String, Any> = unwrap(this).getInputParameters() ?:
        emptyMap()

    override fun maximumExecutionFrequency(): MaximumExecutionFrequency? =
        unwrap(this).getMaximumExecutionFrequency()?.let(MaximumExecutionFrequency::wrap)

    override fun ownStackOnly(): Boolean? = unwrap(this).getOwnStackOnly()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun ruleScope(): RuleScope? = unwrap(this).getRuleScope()?.let(RuleScope::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFormationStackDriftDetectionCheckProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps):
        CloudFormationStackDriftDetectionCheckProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationStackDriftDetectionCheckProps):
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps
  }
}
