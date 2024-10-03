@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Properties used to configure maximum throughput for an on-demand table.
 *
 * Example:
 *
 * ```
 * TableV2 table = TableV2.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .billing(Billing.onDemand(MaxThroughputProps.builder()
 * .maxReadRequestUnits(100)
 * .maxWriteRequestUnits(115)
 * .build()))
 * .build();
 * ```
 */
public interface MaxThroughputProps {
  /**
   * The max read request units.
   *
   * Default: - if table mode is on-demand and this property is undefined,
   * no maximum throughput limit will be put in place for read requests.
   * This property is only applicable for tables using on-demand mode.
   */
  public fun maxReadRequestUnits(): Number? = unwrap(this).getMaxReadRequestUnits()

  /**
   * The max write request units.
   *
   * Default: - if table mode is on-demand and this property is undefined,
   * no maximum throughput limit will be put in place for write requests.
   * This property is only applicable for tables using on-demand mode.
   */
  public fun maxWriteRequestUnits(): Number? = unwrap(this).getMaxWriteRequestUnits()

  /**
   * A builder for [MaxThroughputProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxReadRequestUnits The max read request units.
     */
    public fun maxReadRequestUnits(maxReadRequestUnits: Number)

    /**
     * @param maxWriteRequestUnits The max write request units.
     */
    public fun maxWriteRequestUnits(maxWriteRequestUnits: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.MaxThroughputProps.Builder =
        software.amazon.awscdk.services.dynamodb.MaxThroughputProps.builder()

    /**
     * @param maxReadRequestUnits The max read request units.
     */
    override fun maxReadRequestUnits(maxReadRequestUnits: Number) {
      cdkBuilder.maxReadRequestUnits(maxReadRequestUnits)
    }

    /**
     * @param maxWriteRequestUnits The max write request units.
     */
    override fun maxWriteRequestUnits(maxWriteRequestUnits: Number) {
      cdkBuilder.maxWriteRequestUnits(maxWriteRequestUnits)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.MaxThroughputProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dynamodb.MaxThroughputProps,
  ) : CdkObject(cdkObject),
      MaxThroughputProps {
    /**
     * The max read request units.
     *
     * Default: - if table mode is on-demand and this property is undefined,
     * no maximum throughput limit will be put in place for read requests.
     * This property is only applicable for tables using on-demand mode.
     */
    override fun maxReadRequestUnits(): Number? = unwrap(this).getMaxReadRequestUnits()

    /**
     * The max write request units.
     *
     * Default: - if table mode is on-demand and this property is undefined,
     * no maximum throughput limit will be put in place for write requests.
     * This property is only applicable for tables using on-demand mode.
     */
    override fun maxWriteRequestUnits(): Number? = unwrap(this).getMaxWriteRequestUnits()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MaxThroughputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.MaxThroughputProps):
        MaxThroughputProps = CdkObjectWrappers.wrap(cdkObject) as? MaxThroughputProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MaxThroughputProps):
        software.amazon.awscdk.services.dynamodb.MaxThroughputProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.MaxThroughputProps
  }
}
