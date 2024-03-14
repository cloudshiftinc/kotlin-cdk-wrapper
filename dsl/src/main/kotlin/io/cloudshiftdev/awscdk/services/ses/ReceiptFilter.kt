package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ReceiptFilter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.ReceiptFilter,
) : Resource(cdkObject) {
  public interface Builder {
    public fun ip(ip: String)

    public fun policy(policy: ReceiptFilterPolicy)

    public fun receiptFilterName(receiptFilterName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ReceiptFilter.Builder =
        software.amazon.awscdk.services.ses.ReceiptFilter.Builder.create(scope, id)

    override fun ip(ip: String) {
      cdkBuilder.ip(ip)
    }

    override fun policy(policy: ReceiptFilterPolicy) {
      cdkBuilder.policy(policy.let(ReceiptFilterPolicy::unwrap))
    }

    override fun receiptFilterName(receiptFilterName: String) {
      cdkBuilder.receiptFilterName(receiptFilterName)
    }

    public fun build(): software.amazon.awscdk.services.ses.ReceiptFilter = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ReceiptFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ReceiptFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ReceiptFilter): ReceiptFilter =
        ReceiptFilter(cdkObject)

    internal fun unwrap(wrapped: ReceiptFilter): software.amazon.awscdk.services.ses.ReceiptFilter =
        wrapped.cdkObject
  }
}
