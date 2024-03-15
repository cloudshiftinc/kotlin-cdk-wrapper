@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface SecurityGroupImportOptions {
  public fun allowAllIpv6Outbound(): Boolean? = unwrap(this).getAllowAllIpv6Outbound()

  public fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

  public fun mutable(): Boolean? = unwrap(this).getMutable()

  @CdkDslMarker
  public interface Builder {
    public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean)

    public fun allowAllOutbound(allowAllOutbound: Boolean)

    public fun mutable(mutable: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SecurityGroupImportOptions.Builder =
        software.amazon.awscdk.services.ec2.SecurityGroupImportOptions.builder()

    override fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
      cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
    }

    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    public fun build(): software.amazon.awscdk.services.ec2.SecurityGroupImportOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.SecurityGroupImportOptions,
  ) : CdkObject(cdkObject), SecurityGroupImportOptions {
    override fun allowAllIpv6Outbound(): Boolean? = unwrap(this).getAllowAllIpv6Outbound()

    override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

    override fun mutable(): Boolean? = unwrap(this).getMutable()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecurityGroupImportOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SecurityGroupImportOptions):
        SecurityGroupImportOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecurityGroupImportOptions):
        software.amazon.awscdk.services.ec2.SecurityGroupImportOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.SecurityGroupImportOptions
  }
}
