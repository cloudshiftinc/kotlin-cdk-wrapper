@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Construction properties for am AllowListReceiptFilter.
 *
 * Example:
 *
 * ```
 * AllowListReceiptFilter.Builder.create(this, "AllowList")
 * .ips(List.of("10.0.0.0/16", "1.2.3.4/16"))
 * .build();
 * ```
 */
public interface AllowListReceiptFilterProps {
  /**
   * A list of ip addresses or ranges to allow list.
   */
  public fun ips(): List<String>

  /**
   * A builder for [AllowListReceiptFilterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ips A list of ip addresses or ranges to allow list. 
     */
    public fun ips(ips: List<String>)

    /**
     * @param ips A list of ip addresses or ranges to allow list. 
     */
    public fun ips(vararg ips: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.AllowListReceiptFilterProps.Builder
        = software.amazon.awscdk.services.ses.AllowListReceiptFilterProps.builder()

    /**
     * @param ips A list of ip addresses or ranges to allow list. 
     */
    override fun ips(ips: List<String>) {
      cdkBuilder.ips(ips)
    }

    /**
     * @param ips A list of ip addresses or ranges to allow list. 
     */
    override fun ips(vararg ips: String): Unit = ips(ips.toList())

    public fun build(): software.amazon.awscdk.services.ses.AllowListReceiptFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.AllowListReceiptFilterProps,
  ) : CdkObject(cdkObject), AllowListReceiptFilterProps {
    /**
     * A list of ip addresses or ranges to allow list.
     */
    override fun ips(): List<String> = unwrap(this).getIps()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AllowListReceiptFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.AllowListReceiptFilterProps):
        AllowListReceiptFilterProps = CdkObjectWrappers.wrap(cdkObject) as
        AllowListReceiptFilterProps

    internal fun unwrap(wrapped: AllowListReceiptFilterProps):
        software.amazon.awscdk.services.ses.AllowListReceiptFilterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.AllowListReceiptFilterProps
  }
}
