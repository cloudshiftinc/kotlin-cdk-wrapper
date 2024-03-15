@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.List

/**
 * Base interface for Item Reader configurations.
 */
public interface IItemReader {
  /**
   * S3 Bucket containing objects to iterate over or a file with a list to iterate over.
   */
  public fun bucket(): IBucket

  /**
   * Limits the number of items passed to the Distributed Map state.
   *
   * Default: - Distributed Map state will iterate over all items provided by the ItemReader
   */
  public fun maxItems(): Number? = unwrap(this).getMaxItems()

  /**
   * Compile policy statements to provide relevent permissions to the state machine.
   */
  public fun providePolicyStatements(): List<PolicyStatement>

  /**
   * Render the ItemReader as JSON object.
   */
  public fun render(): Any

  /**
   * The Amazon S3 API action that Step Functions must invoke depending on the specified dataset.
   */
  public fun resource(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.IItemReader,
  ) : CdkObject(cdkObject), IItemReader {
    /**
     * S3 Bucket containing objects to iterate over or a file with a list to iterate over.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * Limits the number of items passed to the Distributed Map state.
     *
     * Default: - Distributed Map state will iterate over all items provided by the ItemReader
     */
    override fun maxItems(): Number? = unwrap(this).getMaxItems()

    /**
     * Compile policy statements to provide relevent permissions to the state machine.
     */
    override fun providePolicyStatements(): List<PolicyStatement> =
        unwrap(this).providePolicyStatements().map(PolicyStatement::wrap)

    /**
     * Render the ItemReader as JSON object.
     */
    override fun render(): Any = unwrap(this).render()

    /**
     * The Amazon S3 API action that Step Functions must invoke depending on the specified dataset.
     */
    override fun resource(): String = unwrap(this).getResource()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.IItemReader):
        IItemReader = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IItemReader):
        software.amazon.awscdk.services.stepfunctions.IItemReader = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.stepfunctions.IItemReader
  }
}
