package io.cloudshiftdev.awscdk.services.route53

import kotlin.String
import kotlin.Unit

public interface HostedZoneAttributes {
  public fun hostedZoneId(): String

  public fun zoneName(): String

  public interface Builder {
    public fun hostedZoneId(hostedZoneId: String) {
    }

    public fun zoneName(zoneName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.HostedZoneAttributes.Builder =
        software.amazon.awscdk.services.route53.HostedZoneAttributes.builder()

    public override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public override fun zoneName(zoneName: String) {
      cdkBuilder.zoneName(zoneName)
    }

    public fun build(): software.amazon.awscdk.services.route53.HostedZoneAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.route53.HostedZoneAttributes,
  ) : HostedZoneAttributes {
    public override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()

    public override fun zoneName(): String = unwrap(this).getZoneName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HostedZoneAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.HostedZoneAttributes):
        HostedZoneAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostedZoneAttributes):
        software.amazon.awscdk.services.route53.HostedZoneAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
