package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class AwsCustomResourcePolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.customresources.AwsCustomResourcePolicy,
) {
  /**
   * resources for auto-generated from SDK calls.
   */
  public open fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

  /**
   * statements for explicit policy.
   */
  public open fun statements(): List<PolicyStatement> =
      unwrap(this).getStatements().map(PolicyStatement::wrap)

  public companion object {
    public fun fromSdkCalls(options: SdkCallsPolicyOptions): AwsCustomResourcePolicy =
        software.amazon.awscdk.customresources.AwsCustomResourcePolicy.fromSdkCalls(options.let(SdkCallsPolicyOptions::unwrap)).let(AwsCustomResourcePolicy::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0941a10126c1569cb9626dfcc4e5dff6b1db29239307e7105ea475cbb57b3db3")
    public fun fromSdkCalls(options: SdkCallsPolicyOptions.Builder.() -> Unit):
        AwsCustomResourcePolicy = fromSdkCalls(SdkCallsPolicyOptions(options))

    public fun fromStatements(statements: List<PolicyStatement>): AwsCustomResourcePolicy =
        software.amazon.awscdk.customresources.AwsCustomResourcePolicy.fromStatements(statements.map(PolicyStatement::unwrap)).let(AwsCustomResourcePolicy::wrap)

    public fun fromStatements(vararg statements: PolicyStatement): AwsCustomResourcePolicy =
        fromStatements(statements.toList())

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.AwsCustomResourcePolicy):
        AwsCustomResourcePolicy = AwsCustomResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: AwsCustomResourcePolicy):
        software.amazon.awscdk.customresources.AwsCustomResourcePolicy = wrapped.cdkObject
  }
}
