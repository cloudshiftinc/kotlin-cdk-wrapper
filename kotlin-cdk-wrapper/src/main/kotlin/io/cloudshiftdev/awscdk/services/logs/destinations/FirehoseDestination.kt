@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs.destinations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.ILogSubscriptionDestination
import io.cloudshiftdev.awscdk.services.logs.LogSubscriptionDestinationConfig
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.kinesisfirehose.IDeliveryStream as CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream
import software.amazon.awscdk.services.kinesisfirehose.IDeliveryStream as AmazonAwscdkServicesKinesisfirehoseIDeliveryStream

/**
 * Use a Data Firehose delivery stream as the destination for a log subscription.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.logs.destinations.*;
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * IDeliveryStream deliveryStream;
 * LogGroup logGroup;
 * SubscriptionFilter.Builder.create(this, "Subscription")
 * .logGroup(logGroup)
 * .destination(new FirehoseDestination(deliveryStream))
 * .filterPattern(FilterPattern.allEvents())
 * .build();
 * ```
 */
public open class FirehoseDestination(
  cdkObject: software.amazon.awscdk.services.logs.destinations.FirehoseDestination,
) : CdkObject(cdkObject),
    ILogSubscriptionDestination {
  public constructor(stream: CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream) :
      this(software.amazon.awscdk.services.logs.destinations.FirehoseDestination(stream.let(CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream.Companion::unwrap))
  )

  public constructor(stream: CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream,
      props: FirehoseDestinationProps) :
      this(software.amazon.awscdk.services.logs.destinations.FirehoseDestination(stream.let(CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream.Companion::unwrap),
      props.let(FirehoseDestinationProps.Companion::unwrap))
  )

  public constructor(stream: CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream,
      props: FirehoseDestinationProps.Builder.() -> Unit) : this(stream,
      FirehoseDestinationProps(props)
  )

  /**
   * Return the properties required to send subscription events to this destination.
   *
   * If necessary, the destination can use the properties of the SubscriptionFilter
   * object itself to configure its permissions to allow the subscription to write
   * to it.
   *
   * The destination may reconfigure its own permissions in response to this
   * function call.
   *
   * @param scope 
   * @param _sourceLogGroup 
   */
  public override fun bind(scope: Construct, sourceLogGroup: ILogGroup):
      LogSubscriptionDestinationConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      sourceLogGroup.let(ILogGroup.Companion::unwrap)).let(LogSubscriptionDestinationConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.destinations.FirehoseDestination].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The role to assume to write log events to the destination.
     *
     * Default: - A new Role is created
     *
     * @param role The role to assume to write log events to the destination. 
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl(
    stream: AmazonAwscdkServicesKinesisfirehoseIDeliveryStream,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.logs.destinations.FirehoseDestination.Builder =
        software.amazon.awscdk.services.logs.destinations.FirehoseDestination.Builder.create(stream)

    /**
     * The role to assume to write log events to the destination.
     *
     * Default: - A new Role is created
     *
     * @param role The role to assume to write log events to the destination. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.destinations.FirehoseDestination =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(stream: CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream,
        block: Builder.() -> Unit = {}): FirehoseDestination {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream.unwrap(stream))
      return FirehoseDestination(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.logs.destinations.FirehoseDestination):
        FirehoseDestination = FirehoseDestination(cdkObject)

    internal fun unwrap(wrapped: FirehoseDestination):
        software.amazon.awscdk.services.logs.destinations.FirehoseDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.destinations.FirehoseDestination
  }
}
