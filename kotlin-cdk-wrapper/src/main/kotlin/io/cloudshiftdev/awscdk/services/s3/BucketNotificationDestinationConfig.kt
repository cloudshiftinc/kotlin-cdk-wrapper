@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IDependable
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Represents the properties of a notification destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import software.constructs.*;
 * IDependable dependable;
 * BucketNotificationDestinationConfig bucketNotificationDestinationConfig =
 * BucketNotificationDestinationConfig.builder()
 * .arn("arn")
 * .type(BucketNotificationDestinationType.LAMBDA)
 * // the properties below are optional
 * .dependencies(List.of(dependable))
 * .build();
 * ```
 */
public interface BucketNotificationDestinationConfig {
  /**
   * The ARN of the destination (i.e. Lambda, SNS, SQS).
   */
  public fun arn(): String

  /**
   * Any additional dependencies that should be resolved before the bucket notification can be
   * configured (for example, the SNS Topic Policy resource).
   */
  public fun dependencies(): List<IDependable> =
      unwrap(this).getDependencies()?.map(IDependable::wrap) ?: emptyList()

  /**
   * The notification type.
   */
  public fun type(): BucketNotificationDestinationType

  /**
   * A builder for [BucketNotificationDestinationConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param arn The ARN of the destination (i.e. Lambda, SNS, SQS). 
     */
    public fun arn(arn: String)

    /**
     * @param dependencies Any additional dependencies that should be resolved before the bucket
     * notification can be configured (for example, the SNS Topic Policy resource).
     */
    public fun dependencies(dependencies: List<IDependable>)

    /**
     * @param dependencies Any additional dependencies that should be resolved before the bucket
     * notification can be configured (for example, the SNS Topic Policy resource).
     */
    public fun dependencies(vararg dependencies: IDependable)

    /**
     * @param type The notification type. 
     */
    public fun type(type: BucketNotificationDestinationType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig.Builder =
        software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig.builder()

    /**
     * @param arn The ARN of the destination (i.e. Lambda, SNS, SQS). 
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * @param dependencies Any additional dependencies that should be resolved before the bucket
     * notification can be configured (for example, the SNS Topic Policy resource).
     */
    override fun dependencies(dependencies: List<IDependable>) {
      cdkBuilder.dependencies(dependencies.map(IDependable.Companion::unwrap))
    }

    /**
     * @param dependencies Any additional dependencies that should be resolved before the bucket
     * notification can be configured (for example, the SNS Topic Policy resource).
     */
    override fun dependencies(vararg dependencies: IDependable): Unit =
        dependencies(dependencies.toList())

    /**
     * @param type The notification type. 
     */
    override fun type(type: BucketNotificationDestinationType) {
      cdkBuilder.type(type.let(BucketNotificationDestinationType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig,
  ) : CdkObject(cdkObject),
      BucketNotificationDestinationConfig {
    /**
     * The ARN of the destination (i.e. Lambda, SNS, SQS).
     */
    override fun arn(): String = unwrap(this).getArn()

    /**
     * Any additional dependencies that should be resolved before the bucket notification can be
     * configured (for example, the SNS Topic Policy resource).
     */
    override fun dependencies(): List<IDependable> =
        unwrap(this).getDependencies()?.map(IDependable::wrap) ?: emptyList()

    /**
     * The notification type.
     */
    override fun type(): BucketNotificationDestinationType =
        unwrap(this).getType().let(BucketNotificationDestinationType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        BucketNotificationDestinationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig):
        BucketNotificationDestinationConfig = CdkObjectWrappers.wrap(cdkObject) as?
        BucketNotificationDestinationConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BucketNotificationDestinationConfig):
        software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig
  }
}
