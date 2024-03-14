package io.cloudshiftdev.awscdk.services.route53

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface MxRecordValue {
  public fun hostName(): String

  public fun priority(): Number

  public interface Builder {
    public fun hostName(hostName: String) {
    }

    public fun priority(priority: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.MxRecordValue.Builder =
        software.amazon.awscdk.services.route53.MxRecordValue.builder()

    public override fun hostName(hostName: String) {
      cdkBuilder.hostName(hostName)
    }

    public override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.route53.MxRecordValue = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.route53.MxRecordValue,
  ) : MxRecordValue {
    public override fun hostName(): String = unwrap(this).getHostName()

    public override fun priority(): Number = unwrap(this).getPriority()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MxRecordValue {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.MxRecordValue):
        MxRecordValue = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MxRecordValue):
        software.amazon.awscdk.services.route53.MxRecordValue = (wrapped as Wrapper).cdkObject
  }
}
