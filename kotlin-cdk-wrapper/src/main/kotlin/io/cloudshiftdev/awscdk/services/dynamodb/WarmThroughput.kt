@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Reference to WarmThroughput for a DynamoDB table.
 *
 * Example:
 *
 * ```
 * TableV2 table = TableV2.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder().name("id").type(AttributeType.STRING).build())
 * .warmThroughput(WarmThroughput.builder()
 * .readUnitsPerSecond(15000)
 * .writeUnitsPerSecond(20000)
 * .build())
 * .build();
 * ```
 */
public interface WarmThroughput {
  /**
   * Configures the number of read units per second a table will be able to handle instantly.
   *
   * Default: - no readUnitsPerSecond configured
   */
  public fun readUnitsPerSecond(): Number? = unwrap(this).getReadUnitsPerSecond()

  /**
   * Configures the number of write units per second a table will be able to handle instantly.
   *
   * Default: - no writeUnitsPerSecond configured
   */
  public fun writeUnitsPerSecond(): Number? = unwrap(this).getWriteUnitsPerSecond()

  /**
   * A builder for [WarmThroughput]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param readUnitsPerSecond Configures the number of read units per second a table will be able
     * to handle instantly.
     */
    public fun readUnitsPerSecond(readUnitsPerSecond: Number)

    /**
     * @param writeUnitsPerSecond Configures the number of write units per second a table will be
     * able to handle instantly.
     */
    public fun writeUnitsPerSecond(writeUnitsPerSecond: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.WarmThroughput.Builder =
        software.amazon.awscdk.services.dynamodb.WarmThroughput.builder()

    /**
     * @param readUnitsPerSecond Configures the number of read units per second a table will be able
     * to handle instantly.
     */
    override fun readUnitsPerSecond(readUnitsPerSecond: Number) {
      cdkBuilder.readUnitsPerSecond(readUnitsPerSecond)
    }

    /**
     * @param writeUnitsPerSecond Configures the number of write units per second a table will be
     * able to handle instantly.
     */
    override fun writeUnitsPerSecond(writeUnitsPerSecond: Number) {
      cdkBuilder.writeUnitsPerSecond(writeUnitsPerSecond)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.WarmThroughput = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dynamodb.WarmThroughput,
  ) : CdkObject(cdkObject),
      WarmThroughput {
    /**
     * Configures the number of read units per second a table will be able to handle instantly.
     *
     * Default: - no readUnitsPerSecond configured
     */
    override fun readUnitsPerSecond(): Number? = unwrap(this).getReadUnitsPerSecond()

    /**
     * Configures the number of write units per second a table will be able to handle instantly.
     *
     * Default: - no writeUnitsPerSecond configured
     */
    override fun writeUnitsPerSecond(): Number? = unwrap(this).getWriteUnitsPerSecond()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WarmThroughput {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.WarmThroughput):
        WarmThroughput = CdkObjectWrappers.wrap(cdkObject) as? WarmThroughput ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: WarmThroughput):
        software.amazon.awscdk.services.dynamodb.WarmThroughput = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.dynamodb.WarmThroughput
  }
}
