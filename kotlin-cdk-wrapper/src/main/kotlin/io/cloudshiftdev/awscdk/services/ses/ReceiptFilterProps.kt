@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ReceiptFilterProps {
  public fun ip(): String? = unwrap(this).getIp()

  public fun policy(): ReceiptFilterPolicy? =
      unwrap(this).getPolicy()?.let(ReceiptFilterPolicy::wrap)

  public fun receiptFilterName(): String? = unwrap(this).getReceiptFilterName()

  @CdkDslMarker
  public interface Builder {
    public fun ip(ip: String)

    public fun policy(policy: ReceiptFilterPolicy)

    public fun receiptFilterName(receiptFilterName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ReceiptFilterProps.Builder =
        software.amazon.awscdk.services.ses.ReceiptFilterProps.builder()

    override fun ip(ip: String) {
      cdkBuilder.ip(ip)
    }

    override fun policy(policy: ReceiptFilterPolicy) {
      cdkBuilder.policy(policy.let(ReceiptFilterPolicy::unwrap))
    }

    override fun receiptFilterName(receiptFilterName: String) {
      cdkBuilder.receiptFilterName(receiptFilterName)
    }

    public fun build(): software.amazon.awscdk.services.ses.ReceiptFilterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.ReceiptFilterProps,
  ) : CdkObject(cdkObject), ReceiptFilterProps {
    override fun ip(): String? = unwrap(this).getIp()

    override fun policy(): ReceiptFilterPolicy? =
        unwrap(this).getPolicy()?.let(ReceiptFilterPolicy::wrap)

    override fun receiptFilterName(): String? = unwrap(this).getReceiptFilterName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ReceiptFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ReceiptFilterProps):
        ReceiptFilterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReceiptFilterProps):
        software.amazon.awscdk.services.ses.ReceiptFilterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.ReceiptFilterProps
  }
}
