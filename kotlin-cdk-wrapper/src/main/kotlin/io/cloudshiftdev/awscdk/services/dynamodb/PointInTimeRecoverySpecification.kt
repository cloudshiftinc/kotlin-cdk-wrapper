@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

/**
 * Reference to PointInTimeRecovey Specification for continuous backups.
 *
 * Example:
 *
 * ```
 * TableV2 table = TableV2.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .contributorInsights(true)
 * .tableClass(TableClass.STANDARD_INFREQUENT_ACCESS)
 * .pointInTimeRecoverySpecification(PointInTimeRecoverySpecification.builder()
 * .pointInTimeRecoveryEnabled(true)
 * .build())
 * .build();
 * ```
 */
public interface PointInTimeRecoverySpecification {
  /**
   * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
   *
   * Default: false
   */
  public fun pointInTimeRecoveryEnabled(): Boolean

  /**
   * The number of preceding days for which continuous backups are taken and maintained.
   *
   * Your table data is only recoverable to any point-in-time from within the configured recovery
   * period.
   * If no value is provided, the value will default to 35.
   *
   * Default: 35
   */
  public fun recoveryPeriodInDays(): Number? = unwrap(this).getRecoveryPeriodInDays()

  /**
   * A builder for [PointInTimeRecoverySpecification]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param pointInTimeRecoveryEnabled Indicates whether point in time recovery is enabled (true)
     * or disabled (false) on the table. 
     */
    public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean)

    /**
     * @param recoveryPeriodInDays The number of preceding days for which continuous backups are
     * taken and maintained.
     * Your table data is only recoverable to any point-in-time from within the configured recovery
     * period.
     * If no value is provided, the value will default to 35.
     */
    public fun recoveryPeriodInDays(recoveryPeriodInDays: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.PointInTimeRecoverySpecification.Builder =
        software.amazon.awscdk.services.dynamodb.PointInTimeRecoverySpecification.builder()

    /**
     * @param pointInTimeRecoveryEnabled Indicates whether point in time recovery is enabled (true)
     * or disabled (false) on the table. 
     */
    override fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean) {
      cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
    }

    /**
     * @param recoveryPeriodInDays The number of preceding days for which continuous backups are
     * taken and maintained.
     * Your table data is only recoverable to any point-in-time from within the configured recovery
     * period.
     * If no value is provided, the value will default to 35.
     */
    override fun recoveryPeriodInDays(recoveryPeriodInDays: Number) {
      cdkBuilder.recoveryPeriodInDays(recoveryPeriodInDays)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.PointInTimeRecoverySpecification =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dynamodb.PointInTimeRecoverySpecification,
  ) : CdkObject(cdkObject),
      PointInTimeRecoverySpecification {
    /**
     * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
     *
     * Default: false
     */
    override fun pointInTimeRecoveryEnabled(): Boolean =
        unwrap(this).getPointInTimeRecoveryEnabled()

    /**
     * The number of preceding days for which continuous backups are taken and maintained.
     *
     * Your table data is only recoverable to any point-in-time from within the configured recovery
     * period.
     * If no value is provided, the value will default to 35.
     *
     * Default: 35
     */
    override fun recoveryPeriodInDays(): Number? = unwrap(this).getRecoveryPeriodInDays()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PointInTimeRecoverySpecification {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.PointInTimeRecoverySpecification):
        PointInTimeRecoverySpecification = CdkObjectWrappers.wrap(cdkObject) as?
        PointInTimeRecoverySpecification ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: PointInTimeRecoverySpecification):
        software.amazon.awscdk.services.dynamodb.PointInTimeRecoverySpecification = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.dynamodb.PointInTimeRecoverySpecification
  }
}
