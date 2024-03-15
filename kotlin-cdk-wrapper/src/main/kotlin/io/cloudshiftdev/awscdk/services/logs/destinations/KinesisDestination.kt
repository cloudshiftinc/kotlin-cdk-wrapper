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

public open class KinesisDestination internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.logs.destinations.KinesisDestination,
) : CdkObject(cdkObject), ILogSubscriptionDestination {
  public override fun bind(scope: Construct, _sourceLogGroup: ILogGroup):
      LogSubscriptionDestinationConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      _sourceLogGroup.let(ILogGroup::unwrap)).let(LogSubscriptionDestinationConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun role(role: IRole)
  }

  private class BuilderImpl(
    stream: AmazonAwscdkServicesKinesisIStream,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.logs.destinations.KinesisDestination.Builder =
        software.amazon.awscdk.services.logs.destinations.KinesisDestination.Builder.create(stream)

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
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
        software.amazon.awscdk.services.logs.destinations.KinesisDestination = wrapped.cdkObject
  }
}
