@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AllowListReceiptFilterProps {
  public fun ips(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun ips(ips: List<String>)

    public fun ips(vararg ips: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.AllowListReceiptFilterProps.Builder
        = software.amazon.awscdk.services.ses.AllowListReceiptFilterProps.builder()

    override fun ips(ips: List<String>) {
      cdkBuilder.ips(ips)
    }

    override fun ips(vararg ips: String): Unit = ips(ips.toList())

    public fun build(): software.amazon.awscdk.services.ses.AllowListReceiptFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.AllowListReceiptFilterProps,
  ) : CdkObject(cdkObject), AllowListReceiptFilterProps {
    override fun ips(): List<String> = unwrap(this).getIps()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AllowListReceiptFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.AllowListReceiptFilterProps):
        AllowListReceiptFilterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AllowListReceiptFilterProps):
        software.amazon.awscdk.services.ses.AllowListReceiptFilterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.AllowListReceiptFilterProps
  }
}
