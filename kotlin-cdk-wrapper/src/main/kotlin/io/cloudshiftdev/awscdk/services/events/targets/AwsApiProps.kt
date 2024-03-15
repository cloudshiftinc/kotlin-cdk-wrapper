@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AwsApiProps : AwsApiInput {
  public fun policyStatement(): PolicyStatement? =
      unwrap(this).getPolicyStatement()?.let(PolicyStatement::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun action(action: String)

    @Deprecated(message = "deprecated in CDK")
    public fun apiVersion(apiVersion: String)

    public fun catchErrorPattern(catchErrorPattern: String)

    public fun parameters(parameters: Any)

    public fun policyStatement(policyStatement: PolicyStatement)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41800499d68410d75462e294a5ead6c940017de3b283b864f1f2c8624523131f")
    public fun policyStatement(policyStatement: PolicyStatement.Builder.() -> Unit)

    public fun service(service: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.AwsApiProps.Builder =
        software.amazon.awscdk.services.events.targets.AwsApiProps.builder()

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
    @JvmName("41800499d68410d75462e294a5ead6c940017de3b283b864f1f2c8624523131f")
    override fun policyStatement(policyStatement: PolicyStatement.Builder.() -> Unit): Unit =
        policyStatement(PolicyStatement(policyStatement))

    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.AwsApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.AwsApiProps,
  ) : CdkObject(cdkObject), AwsApiProps {
    override fun action(): String = unwrap(this).getAction()

    @Deprecated(message = "deprecated in CDK")
    override fun apiVersion(): String? = unwrap(this).getApiVersion()

    override fun catchErrorPattern(): String? = unwrap(this).getCatchErrorPattern()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun policyStatement(): PolicyStatement? =
        unwrap(this).getPolicyStatement()?.let(PolicyStatement::wrap)

    override fun service(): String = unwrap(this).getService()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.AwsApiProps):
        AwsApiProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsApiProps):
        software.amazon.awscdk.services.events.targets.AwsApiProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.AwsApiProps
  }
}
