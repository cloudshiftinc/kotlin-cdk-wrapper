package io.cloudshiftdev.awscdk.services.route53

import kotlin.String
import kotlin.collections.List

public open class RecordTarget internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53.RecordTarget,
) {
  public open fun aliasTarget(): IAliasRecordTarget? =
      unwrap(this).getAliasTarget()?.let(IAliasRecordTarget::wrap)

  public open fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

  public companion object {
    public open fun fromAlias(aliasTarget: IAliasRecordTarget): RecordTarget =
        software.amazon.awscdk.services.route53.RecordTarget.fromAlias(aliasTarget.let(IAliasRecordTarget::unwrap)).let(RecordTarget::wrap)

    public open fun fromIpAddresses(ipAddresses: String): RecordTarget =
        software.amazon.awscdk.services.route53.RecordTarget.fromIpAddresses(ipAddresses).let(RecordTarget::wrap)

    public open fun fromValues(values: String): RecordTarget =
        software.amazon.awscdk.services.route53.RecordTarget.fromValues(values).let(RecordTarget::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.RecordTarget): RecordTarget
        = RecordTarget(cdkObject)

    internal fun unwrap(wrapped: RecordTarget): software.amazon.awscdk.services.route53.RecordTarget
        = wrapped.cdkObject
  }
}
