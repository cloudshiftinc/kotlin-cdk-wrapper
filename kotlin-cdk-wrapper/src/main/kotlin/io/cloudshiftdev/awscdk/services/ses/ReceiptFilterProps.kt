@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for a ReceiptFilter.
 *
 * Example:
 *
 * ```
 * ReceiptFilter.Builder.create(this, "Filter")
 * .ip("1.2.3.4/16")
 * .build();
 * ```
 */
public interface ReceiptFilterProps {
  /**
   * The ip address or range to filter.
   *
   * Default: 0.0.0.0/0
   */
  public fun ip(): String? = unwrap(this).getIp()

  /**
   * The policy for the filter.
   *
   * Default: Block
   */
  public fun policy(): ReceiptFilterPolicy? =
      unwrap(this).getPolicy()?.let(ReceiptFilterPolicy::wrap)

  /**
   * The name for the receipt filter.
   *
   * Default: a CloudFormation generated name
   */
  public fun receiptFilterName(): String? = unwrap(this).getReceiptFilterName()

  /**
   * A builder for [ReceiptFilterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ip The ip address or range to filter.
     */
    public fun ip(ip: String)

    /**
     * @param policy The policy for the filter.
     */
    public fun policy(policy: ReceiptFilterPolicy)

    /**
     * @param receiptFilterName The name for the receipt filter.
     */
    public fun receiptFilterName(receiptFilterName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ReceiptFilterProps.Builder =
        software.amazon.awscdk.services.ses.ReceiptFilterProps.builder()

    /**
     * @param ip The ip address or range to filter.
     */
    override fun ip(ip: String) {
      cdkBuilder.ip(ip)
    }

    /**
     * @param policy The policy for the filter.
     */
    override fun policy(policy: ReceiptFilterPolicy) {
      cdkBuilder.policy(policy.let(ReceiptFilterPolicy.Companion::unwrap))
    }

    /**
     * @param receiptFilterName The name for the receipt filter.
     */
    override fun receiptFilterName(receiptFilterName: String) {
      cdkBuilder.receiptFilterName(receiptFilterName)
    }

    public fun build(): software.amazon.awscdk.services.ses.ReceiptFilterProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.ReceiptFilterProps,
  ) : CdkObject(cdkObject), ReceiptFilterProps {
    /**
     * The ip address or range to filter.
     *
     * Default: 0.0.0.0/0
     */
    override fun ip(): String? = unwrap(this).getIp()

    /**
     * The policy for the filter.
     *
     * Default: Block
     */
    override fun policy(): ReceiptFilterPolicy? =
        unwrap(this).getPolicy()?.let(ReceiptFilterPolicy::wrap)

    /**
     * The name for the receipt filter.
     *
     * Default: a CloudFormation generated name
     */
    override fun receiptFilterName(): String? = unwrap(this).getReceiptFilterName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ReceiptFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ReceiptFilterProps):
        ReceiptFilterProps = CdkObjectWrappers.wrap(cdkObject) as? ReceiptFilterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReceiptFilterProps):
        software.amazon.awscdk.services.ses.ReceiptFilterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.ReceiptFilterProps
  }
}
