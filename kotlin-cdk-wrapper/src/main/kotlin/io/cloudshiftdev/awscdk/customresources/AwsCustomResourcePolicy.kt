@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * The IAM Policy that will be applied to the different calls.
 *
 * Example:
 *
 * ```
 * AwsCustomResource getParameter = AwsCustomResource.Builder.create(this, "GetParameter")
 * .onUpdate(AwsSdkCall.builder() // will also be called for a CREATE event
 * .service("SSM")
 * .action("GetParameter")
 * .parameters(Map.of(
 * "Name", "my-parameter",
 * "WithDecryption", true))
 * .physicalResourceId(PhysicalResourceId.of(Date.now().toString())).build())
 * .policy(AwsCustomResourcePolicy.fromSdkCalls(SdkCallsPolicyOptions.builder()
 * .resources(AwsCustomResourcePolicy.ANY_RESOURCE)
 * .build()))
 * .build();
 * // Use the value in another construct with
 * getParameter.getResponseField("Parameter.Value");
 * ```
 */
public open class AwsCustomResourcePolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.customresources.AwsCustomResourcePolicy,
) : CdkObject(cdkObject) {
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
    public val ANY_RESOURCE: List<String> =
        software.amazon.awscdk.customresources.AwsCustomResourcePolicy.ANY_RESOURCE

    public fun fromSdkCalls(options: SdkCallsPolicyOptions): AwsCustomResourcePolicy =
        software.amazon.awscdk.customresources.AwsCustomResourcePolicy.fromSdkCalls(options.let(SdkCallsPolicyOptions::unwrap)).let(AwsCustomResourcePolicy::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
