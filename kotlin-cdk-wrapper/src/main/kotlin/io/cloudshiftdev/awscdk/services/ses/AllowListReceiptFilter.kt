@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An allow list receipt filter.
 *
 * Example:
 *
 * ```
 * AllowListReceiptFilter.Builder.create(this, "AllowList")
 * .ips(List.of("10.0.0.0/16", "1.2.3.4/16"))
 * .build();
 * ```
 */
public open class AllowListReceiptFilter(
  cdkObject: software.amazon.awscdk.services.ses.AllowListReceiptFilter,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AllowListReceiptFilterProps,
  ) :
      this(software.amazon.awscdk.services.ses.AllowListReceiptFilter(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AllowListReceiptFilterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AllowListReceiptFilterProps.Builder.() -> Unit,
  ) : this(scope, id, AllowListReceiptFilterProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.AllowListReceiptFilter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of ip addresses or ranges to allow list.
     *
     * @param ips A list of ip addresses or ranges to allow list. 
     */
    public fun ips(ips: List<String>)

    /**
     * A list of ip addresses or ranges to allow list.
     *
     * @param ips A list of ip addresses or ranges to allow list. 
     */
    public fun ips(vararg ips: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.AllowListReceiptFilter.Builder =
        software.amazon.awscdk.services.ses.AllowListReceiptFilter.Builder.create(scope, id)

    /**
     * A list of ip addresses or ranges to allow list.
     *
     * @param ips A list of ip addresses or ranges to allow list. 
     */
    override fun ips(ips: List<String>) {
      cdkBuilder.ips(ips)
    }

    /**
     * A list of ip addresses or ranges to allow list.
     *
     * @param ips A list of ip addresses or ranges to allow list. 
     */
    override fun ips(vararg ips: String): Unit = ips(ips.toList())

    public fun build(): software.amazon.awscdk.services.ses.AllowListReceiptFilter =
        cdkBuilder.build()
  }

  public companion object {
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
        software.amazon.awscdk.services.ses.AllowListReceiptFilter = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.AllowListReceiptFilter
  }
}
