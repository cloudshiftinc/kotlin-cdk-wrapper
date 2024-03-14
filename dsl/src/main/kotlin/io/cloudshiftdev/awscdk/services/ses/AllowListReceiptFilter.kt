package io.cloudshiftdev.awscdk.services.ses

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AllowListReceiptFilter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.AllowListReceiptFilter,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public interface Builder {
    public fun ips(ips: List<String>)

    public fun ips(vararg ips: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.AllowListReceiptFilter.Builder =
        software.amazon.awscdk.services.ses.AllowListReceiptFilter.Builder.create(scope, id)

    override fun ips(ips: List<String>) {
      cdkBuilder.ips(ips)
    }

    override fun ips(vararg ips: String): Unit = ips(ips.toList())

    public fun build(): software.amazon.awscdk.services.ses.AllowListReceiptFilter =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AllowListReceiptFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AllowListReceiptFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.AllowListReceiptFilter):
        AllowListReceiptFilter = AllowListReceiptFilter(cdkObject)

    internal fun unwrap(wrapped: AllowListReceiptFilter):
        software.amazon.awscdk.services.ses.AllowListReceiptFilter = wrapped.cdkObject
  }
}
