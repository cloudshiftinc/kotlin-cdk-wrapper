@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnTrackerConsumer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.location.*;
 * CfnTrackerConsumerProps cfnTrackerConsumerProps = CfnTrackerConsumerProps.builder()
 * .consumerArn("consumerArn")
 * .trackerName("trackerName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-trackerconsumer.html)
 */
public interface CfnTrackerConsumerProps {
  /**
   * The Amazon Resource Name (ARN) for the geofence collection to be associated to tracker
   * resource.
   *
   * Used when you need to specify a resource across all AWS .
   *
   * * Format example:
   * `arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-trackerconsumer.html#cfn-location-trackerconsumer-consumerarn)
   */
  public fun consumerArn(): String

  /**
   * The name for the tracker resource.
   *
   * Requirements:
   *
   * * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and
   * underscores (_).
   * * Must be a unique tracker resource name.
   * * No spaces allowed. For example, `ExampleTracker` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-trackerconsumer.html#cfn-location-trackerconsumer-trackername)
   */
  public fun trackerName(): String

  /**
   * A builder for [CfnTrackerConsumerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param consumerArn The Amazon Resource Name (ARN) for the geofence collection to be
     * associated to tracker resource. 
     * Used when you need to specify a resource across all AWS .
     *
     * * Format example:
     * `arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer`
     */
    public fun consumerArn(consumerArn: String)

    /**
     * @param trackerName The name for the tracker resource. 
     * Requirements:
     *
     * * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique tracker resource name.
     * * No spaces allowed. For example, `ExampleTracker` .
     */
    public fun trackerName(trackerName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnTrackerConsumerProps.Builder
        = software.amazon.awscdk.services.location.CfnTrackerConsumerProps.builder()

    /**
     * @param consumerArn The Amazon Resource Name (ARN) for the geofence collection to be
     * associated to tracker resource. 
     * Used when you need to specify a resource across all AWS .
     *
     * * Format example:
     * `arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer`
     */
    override fun consumerArn(consumerArn: String) {
      cdkBuilder.consumerArn(consumerArn)
    }

    /**
     * @param trackerName The name for the tracker resource. 
     * Requirements:
     *
     * * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique tracker resource name.
     * * No spaces allowed. For example, `ExampleTracker` .
     */
    override fun trackerName(trackerName: String) {
      cdkBuilder.trackerName(trackerName)
    }

    public fun build(): software.amazon.awscdk.services.location.CfnTrackerConsumerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.location.CfnTrackerConsumerProps,
  ) : CdkObject(cdkObject), CfnTrackerConsumerProps {
    /**
     * The Amazon Resource Name (ARN) for the geofence collection to be associated to tracker
     * resource.
     *
     * Used when you need to specify a resource across all AWS .
     *
     * * Format example:
     * `arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-trackerconsumer.html#cfn-location-trackerconsumer-consumerarn)
     */
    override fun consumerArn(): String = unwrap(this).getConsumerArn()

    /**
     * The name for the tracker resource.
     *
     * Requirements:
     *
     * * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique tracker resource name.
     * * No spaces allowed. For example, `ExampleTracker` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-trackerconsumer.html#cfn-location-trackerconsumer-trackername)
     */
    override fun trackerName(): String = unwrap(this).getTrackerName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrackerConsumerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnTrackerConsumerProps):
        CfnTrackerConsumerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrackerConsumerProps):
        software.amazon.awscdk.services.location.CfnTrackerConsumerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.location.CfnTrackerConsumerProps
  }
}
