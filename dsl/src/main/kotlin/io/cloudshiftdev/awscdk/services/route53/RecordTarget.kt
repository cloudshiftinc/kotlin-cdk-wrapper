package io.cloudshiftdev.awscdk.services.route53

import kotlin.String
import kotlin.collections.List

public open class RecordTarget internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53.RecordTarget,
) {
  /**
   * alias for targets such as CloudFront distribution to route traffic to.
   */
  public open fun aliasTarget(): IAliasRecordTarget? =
      unwrap(this).getAliasTarget()?.let(IAliasRecordTarget::wrap)

  /**
   * correspond with the chosen record type (e.g. for 'A' Type, specify one or more IP addresses).
   */
  public open fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

  public companion object {
    public fun fromAlias(aliasTarget: IAliasRecordTarget): RecordTarget =
        software.amazon.awscdk.services.route53.RecordTarget.fromAlias(aliasTarget.let(IAliasRecordTarget::unwrap)).let(RecordTarget::wrap)

    public fun fromIpAddresses(ipAddresses: String): RecordTarget =
        software.amazon.awscdk.services.route53.RecordTarget.fromIpAddresses(ipAddresses).let(RecordTarget::wrap)

    public fun fromValues(values: String): RecordTarget =
        software.amazon.awscdk.services.route53.RecordTarget.fromValues(values).let(RecordTarget::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.RecordTarget): RecordTarget
        = RecordTarget(cdkObject)

    internal fun unwrap(wrapped: RecordTarget): software.amazon.awscdk.services.route53.RecordTarget
        = wrapped.cdkObject
  }
}
