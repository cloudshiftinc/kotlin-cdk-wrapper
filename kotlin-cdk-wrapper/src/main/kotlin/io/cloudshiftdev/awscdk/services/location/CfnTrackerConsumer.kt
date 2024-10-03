@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Location::TrackerConsumer` resource specifies an association between a geofence
 * collection and a tracker resource.
 *
 * The geofence collection is referred to as the *consumer* of the tracker. This allows the tracker
 * resource to communicate location data to the linked geofence collection.
 *
 *
 * Currently not supported — Cross-account configurations, such as creating associations between a
 * tracker resource in one account and a geofence collection in another account.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.location.*;
 * CfnTrackerConsumer cfnTrackerConsumer = CfnTrackerConsumer.Builder.create(this,
 * "MyCfnTrackerConsumer")
 * .consumerArn("consumerArn")
 * .trackerName("trackerName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-trackerconsumer.html)
 */
public open class CfnTrackerConsumer(
  cdkObject: software.amazon.awscdk.services.location.CfnTrackerConsumer,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTrackerConsumerProps,
  ) :
      this(software.amazon.awscdk.services.location.CfnTrackerConsumer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTrackerConsumerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTrackerConsumerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTrackerConsumerProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) for the geofence collection to be associated to tracker
   * resource.
   */
  public open fun consumerArn(): String = unwrap(this).getConsumerArn()

  /**
   * The Amazon Resource Name (ARN) for the geofence collection to be associated to tracker
   * resource.
   */
  public open fun consumerArn(`value`: String) {
    unwrap(this).setConsumerArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name for the tracker resource.
   */
  public open fun trackerName(): String = unwrap(this).getTrackerName()

  /**
   * The name for the tracker resource.
   */
  public open fun trackerName(`value`: String) {
    unwrap(this).setTrackerName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.location.CfnTrackerConsumer].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param consumerArn The Amazon Resource Name (ARN) for the geofence collection to be
     * associated to tracker resource. 
     */
    public fun consumerArn(consumerArn: String)

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
     * @param trackerName The name for the tracker resource. 
     */
    public fun trackerName(trackerName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnTrackerConsumer.Builder =
        software.amazon.awscdk.services.location.CfnTrackerConsumer.Builder.create(scope, id)

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
     * @param consumerArn The Amazon Resource Name (ARN) for the geofence collection to be
     * associated to tracker resource. 
     */
    override fun consumerArn(consumerArn: String) {
      cdkBuilder.consumerArn(consumerArn)
    }

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
     * @param trackerName The name for the tracker resource. 
     */
    override fun trackerName(trackerName: String) {
      cdkBuilder.trackerName(trackerName)
    }

    public fun build(): software.amazon.awscdk.services.location.CfnTrackerConsumer =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.location.CfnTrackerConsumer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrackerConsumer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrackerConsumer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnTrackerConsumer):
        CfnTrackerConsumer = CfnTrackerConsumer(cdkObject)

    internal fun unwrap(wrapped: CfnTrackerConsumer):
        software.amazon.awscdk.services.location.CfnTrackerConsumer = wrapped.cdkObject as
        software.amazon.awscdk.services.location.CfnTrackerConsumer
  }
}
