@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface MxRecordValue {
  public fun hostName(): String

  public fun priority(): Number

  @CdkDslMarker
  public interface Builder {
    public fun hostName(hostName: String)

    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.MxRecordValue.Builder =
        software.amazon.awscdk.services.route53.MxRecordValue.builder()

    override fun hostName(hostName: String) {
      cdkBuilder.hostName(hostName)
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.route53.MxRecordValue = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.MxRecordValue,
  ) : CdkObject(cdkObject), MxRecordValue {
    override fun hostName(): String = unwrap(this).getHostName()

    override fun priority(): Number = unwrap(this).getPriority()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MxRecordValue {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.MxRecordValue):
        MxRecordValue = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MxRecordValue):
        software.amazon.awscdk.services.route53.MxRecordValue = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53.MxRecordValue
  }
}
