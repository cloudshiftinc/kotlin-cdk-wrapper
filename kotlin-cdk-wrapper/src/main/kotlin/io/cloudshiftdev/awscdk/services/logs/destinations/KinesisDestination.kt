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
import io.cloudshiftdev.awscdk.services.kinesis.IStream as CloudshiftdevAwscdkServicesKinesisIStream
import software.amazon.awscdk.services.kinesis.IStream as AmazonAwscdkServicesKinesisIStream

/**
 * Use a Kinesis stream as the destination for a log subscription.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.kinesis.*;
 * import io.cloudshiftdev.awscdk.services.logs.destinations.*;
 * Role role;
 * Stream stream;
 * KinesisDestination kinesisDestination = KinesisDestination.Builder.create(stream)
 * .role(role)
 * .build();
 * ```
 */
public open class KinesisDestination(
  cdkObject: software.amazon.awscdk.services.logs.destinations.KinesisDestination,
) : CdkObject(cdkObject), ILogSubscriptionDestination {
  public constructor(stream: CloudshiftdevAwscdkServicesKinesisIStream) :
      this(software.amazon.awscdk.services.logs.destinations.KinesisDestination(stream.let(CloudshiftdevAwscdkServicesKinesisIStream.Companion::unwrap))
  )

  public constructor(stream: CloudshiftdevAwscdkServicesKinesisIStream,
      props: KinesisDestinationProps) :
      this(software.amazon.awscdk.services.logs.destinations.KinesisDestination(stream.let(CloudshiftdevAwscdkServicesKinesisIStream.Companion::unwrap),
      props.let(KinesisDestinationProps.Companion::unwrap))
  )

  public constructor(stream: CloudshiftdevAwscdkServicesKinesisIStream,
      props: KinesisDestinationProps.Builder.() -> Unit) : this(stream,
      KinesisDestinationProps(props)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.destinations.KinesisDestination].
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
    stream: AmazonAwscdkServicesKinesisIStream,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.logs.destinations.KinesisDestination.Builder =
        software.amazon.awscdk.services.logs.destinations.KinesisDestination.Builder.create(stream)

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

    public fun build(): software.amazon.awscdk.services.logs.destinations.KinesisDestination =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(stream: CloudshiftdevAwscdkServicesKinesisIStream,
        block: Builder.() -> Unit = {}): KinesisDestination {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesKinesisIStream.unwrap(stream))
      return KinesisDestination(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.logs.destinations.KinesisDestination):
        KinesisDestination = KinesisDestination(cdkObject)

    internal fun unwrap(wrapped: KinesisDestination):
        software.amazon.awscdk.services.logs.destinations.KinesisDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.destinations.KinesisDestination
  }
}
