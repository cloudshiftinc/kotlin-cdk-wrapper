@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Return the appropriate values for the environment placeholders.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * EnvironmentPlaceholderValues environmentPlaceholderValues =
 * EnvironmentPlaceholderValues.builder()
 * .accountId("accountId")
 * .partition("partition")
 * .region("region")
 * .build();
 * ```
 */
public interface EnvironmentPlaceholderValues {
  /**
   * Return the account.
   */
  public fun accountId(): String

  /**
   * Return the partition.
   */
  public fun partition(): String

  /**
   * Return the region.
   */
  public fun region(): String

  /**
   * A builder for [EnvironmentPlaceholderValues]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountId Return the account. 
     */
    public fun accountId(accountId: String)

    /**
     * @param partition Return the partition. 
     */
    public fun partition(partition: String)

    /**
     * @param region Return the region. 
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues.Builder =
        software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues.builder()

    /**
     * @param accountId Return the account. 
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * @param partition Return the partition. 
     */
    override fun partition(partition: String) {
      cdkBuilder.partition(partition)
    }

    /**
     * @param region Return the region. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues,
  ) : CdkObject(cdkObject), EnvironmentPlaceholderValues {
    /**
     * Return the account.
     */
    override fun accountId(): String = unwrap(this).getAccountId()

    /**
     * Return the partition.
     */
    override fun partition(): String = unwrap(this).getPartition()

    /**
     * Return the region.
     */
    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentPlaceholderValues {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues):
        EnvironmentPlaceholderValues = CdkObjectWrappers.wrap(cdkObject) as?
        EnvironmentPlaceholderValues ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentPlaceholderValues):
        software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues
  }
}
