package io.cloudshiftdev.awscdk.services.route53

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface SrvRecordValue {
  public fun hostName(): String

  public fun port(): Number

  public fun priority(): Number

  public fun weight(): Number

  public interface Builder {
    public fun hostName(hostName: String) {
    }

    public fun port(port: Number) {
    }

    public fun priority(priority: Number) {
    }

    public fun weight(weight: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.SrvRecordValue.Builder =
        software.amazon.awscdk.services.route53.SrvRecordValue.builder()

    public override fun hostName(hostName: String) {
      cdkBuilder.hostName(hostName)
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.route53.SrvRecordValue = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.route53.SrvRecordValue,
  ) : SrvRecordValue {
    public override fun hostName(): String = unwrap(this).getHostName()

    public override fun port(): Number = unwrap(this).getPort()

    public override fun priority(): Number = unwrap(this).getPriority()

    public override fun weight(): Number = unwrap(this).getWeight()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SrvRecordValue {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.SrvRecordValue):
        SrvRecordValue = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SrvRecordValue):
        software.amazon.awscdk.services.route53.SrvRecordValue = (wrapped as Wrapper).cdkObject
  }
}
