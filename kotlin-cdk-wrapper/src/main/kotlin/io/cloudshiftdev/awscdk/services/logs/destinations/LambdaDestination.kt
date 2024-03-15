@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs.destinations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.ILogSubscriptionDestination
import io.cloudshiftdev.awscdk.services.logs.LogSubscriptionDestinationConfig
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.lambda.IFunction as CloudshiftdevAwscdkServicesLambdaIFunction
import software.amazon.awscdk.services.lambda.IFunction as AmazonAwscdkServicesLambdaIFunction

public open class LambdaDestination internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.logs.destinations.LambdaDestination,
) : CdkObject(cdkObject), ILogSubscriptionDestination {
  public override fun bind(scope: Construct, logGroup: ILogGroup): LogSubscriptionDestinationConfig
      = unwrap(this).bind(scope.let(Construct::unwrap),
      logGroup.let(ILogGroup::unwrap)).let(LogSubscriptionDestinationConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun addPermissions(addPermissions: Boolean)
  }

  private class BuilderImpl(
    fn: AmazonAwscdkServicesLambdaIFunction,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.logs.destinations.LambdaDestination.Builder =
        software.amazon.awscdk.services.logs.destinations.LambdaDestination.Builder.create(fn)

    override fun addPermissions(addPermissions: Boolean) {
      cdkBuilder.addPermissions(addPermissions)
    }

    public fun build(): software.amazon.awscdk.services.logs.destinations.LambdaDestination =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(fn: CloudshiftdevAwscdkServicesLambdaIFunction,
        block: Builder.() -> Unit = {}): LambdaDestination {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesLambdaIFunction.unwrap(fn))
      return LambdaDestination(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.logs.destinations.LambdaDestination):
        LambdaDestination = LambdaDestination(cdkObject)

    internal fun unwrap(wrapped: LambdaDestination):
        software.amazon.awscdk.services.logs.destinations.LambdaDestination = wrapped.cdkObject
  }
}
