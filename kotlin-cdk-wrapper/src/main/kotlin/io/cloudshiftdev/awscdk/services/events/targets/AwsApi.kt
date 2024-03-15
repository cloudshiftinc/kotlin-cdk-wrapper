@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class AwsApi internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.AwsApi,
) : CdkObject(cdkObject), IRuleTarget {
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap), id).let(RuleTargetConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun action(action: String)

    @Deprecated(message = "deprecated in CDK")
    public fun apiVersion(apiVersion: String)

    public fun catchErrorPattern(catchErrorPattern: String)

    public fun parameters(parameters: Any)

    public fun policyStatement(policyStatement: PolicyStatement)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("733bc452c30317d418eb575f2d2c1be3c964cc1b9e882877e3ebcaa3ee762508")
    public fun policyStatement(policyStatement: PolicyStatement.Builder.() -> Unit)

    public fun service(service: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.AwsApi.Builder =
        software.amazon.awscdk.services.events.targets.AwsApi.Builder.create()

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun apiVersion(apiVersion: String) {
      cdkBuilder.apiVersion(apiVersion)
    }

    override fun catchErrorPattern(catchErrorPattern: String) {
      cdkBuilder.catchErrorPattern(catchErrorPattern)
    }

    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    override fun policyStatement(policyStatement: PolicyStatement) {
      cdkBuilder.policyStatement(policyStatement.let(PolicyStatement::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("733bc452c30317d418eb575f2d2c1be3c964cc1b9e882877e3ebcaa3ee762508")
    override fun policyStatement(policyStatement: PolicyStatement.Builder.() -> Unit): Unit =
        policyStatement(PolicyStatement(policyStatement))

    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.AwsApi = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsApi {
      val builderImpl = BuilderImpl()
      return AwsApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.AwsApi): AwsApi =
        AwsApi(cdkObject)

    internal fun unwrap(wrapped: AwsApi): software.amazon.awscdk.services.events.targets.AwsApi =
        wrapped.cdkObject
  }
}
