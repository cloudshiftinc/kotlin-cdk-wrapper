@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A receipt filter.
 *
 * When instantiated without props, it creates a
 * block all receipt filter.
 *
 * Example:
 *
 * ```
 * ReceiptFilter.Builder.create(this, "Filter")
 * .ip("1.2.3.4/16")
 * .build();
 * ```
 */
public open class ReceiptFilter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.ReceiptFilter,
) : Resource(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.ReceiptFilter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ip address or range to filter.
     *
     * Default: 0.0.0.0/0
     *
     * @param ip The ip address or range to filter. 
     */
    public fun ip(ip: String)

    /**
     * The policy for the filter.
     *
     * Default: Block
     *
     * @param policy The policy for the filter. 
     */
    public fun policy(policy: ReceiptFilterPolicy)

    /**
     * The name for the receipt filter.
     *
     * Default: a CloudFormation generated name
     *
     * @param receiptFilterName The name for the receipt filter. 
     */
    public fun receiptFilterName(receiptFilterName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ReceiptFilter.Builder =
        software.amazon.awscdk.services.ses.ReceiptFilter.Builder.create(scope, id)

    /**
     * The ip address or range to filter.
     *
     * Default: 0.0.0.0/0
     *
     * @param ip The ip address or range to filter. 
     */
    override fun ip(ip: String) {
      cdkBuilder.ip(ip)
    }

    /**
     * The policy for the filter.
     *
     * Default: Block
     *
     * @param policy The policy for the filter. 
     */
    override fun policy(policy: ReceiptFilterPolicy) {
      cdkBuilder.policy(policy.let(ReceiptFilterPolicy::unwrap))
    }

    /**
     * The name for the receipt filter.
     *
     * Default: a CloudFormation generated name
     *
     * @param receiptFilterName The name for the receipt filter. 
     */
    override fun receiptFilterName(receiptFilterName: String) {
      cdkBuilder.receiptFilterName(receiptFilterName)
    }

    public fun build(): software.amazon.awscdk.services.ses.ReceiptFilter = cdkBuilder.build()
  }

  public companion object {
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
