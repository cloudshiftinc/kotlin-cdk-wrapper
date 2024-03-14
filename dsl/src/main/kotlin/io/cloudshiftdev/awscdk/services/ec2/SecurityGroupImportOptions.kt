package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Boolean
import kotlin.Unit

public interface SecurityGroupImportOptions {
  public fun allowAllIpv6Outbound(): Boolean? = unwrap(this).getAllowAllIpv6Outbound()

  public fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

  public fun mutable(): Boolean? = unwrap(this).getMutable()

  public interface Builder {
    public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
    }

    public fun allowAllOutbound(allowAllOutbound: Boolean) {
    }

    public fun mutable(mutable: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SecurityGroupImportOptions.Builder =
        software.amazon.awscdk.services.ec2.SecurityGroupImportOptions.builder()

    public override fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
      cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
    }

    public override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    public override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    public fun build(): software.amazon.awscdk.services.ec2.SecurityGroupImportOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.SecurityGroupImportOptions,
  ) : SecurityGroupImportOptions {
    public override fun allowAllIpv6Outbound(): Boolean? = unwrap(this).getAllowAllIpv6Outbound()

    public override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

    public override fun mutable(): Boolean? = unwrap(this).getMutable()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SecurityGroupImportOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SecurityGroupImportOptions):
        SecurityGroupImportOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecurityGroupImportOptions):
        software.amazon.awscdk.services.ec2.SecurityGroupImportOptions = (wrapped as
        Wrapper).cdkObject
  }
}
