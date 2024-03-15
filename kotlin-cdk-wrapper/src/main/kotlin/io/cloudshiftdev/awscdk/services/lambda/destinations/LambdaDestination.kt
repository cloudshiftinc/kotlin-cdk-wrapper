@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.destinations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.DestinationConfig
import io.cloudshiftdev.awscdk.services.lambda.DestinationOptions
import io.cloudshiftdev.awscdk.services.lambda.IDestination
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.lambda.IFunction as CloudshiftdevAwscdkServicesLambdaIFunction
import software.amazon.awscdk.services.lambda.IFunction as AmazonAwscdkServicesLambdaIFunction

public open class LambdaDestination internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.destinations.LambdaDestination,
) : CdkObject(cdkObject), IDestination {
  public override fun bind(scope: Construct, fn: CloudshiftdevAwscdkServicesLambdaIFunction):
      DestinationConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      fn.let(CloudshiftdevAwscdkServicesLambdaIFunction::unwrap)).let(DestinationConfig::wrap)

  public override fun bind(
    scope: Construct,
    fn: CloudshiftdevAwscdkServicesLambdaIFunction,
    options: DestinationOptions,
  ): DestinationConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      fn.let(CloudshiftdevAwscdkServicesLambdaIFunction::unwrap),
      options.let(DestinationOptions::unwrap)).let(DestinationConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d6ad4acfbba31901bb8135560633af5578e09f84d84123fa0dbea6b67295dd3")
  public override fun bind(
    scope: Construct,
    fn: CloudshiftdevAwscdkServicesLambdaIFunction,
    options: DestinationOptions.Builder.() -> Unit,
  ): DestinationConfig = bind(scope, fn, DestinationOptions(options))

  @CdkDslMarker
  public interface Builder {
    public fun responseOnly(responseOnly: Boolean)
  }

  private class BuilderImpl(
    fn: AmazonAwscdkServicesLambdaIFunction,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.destinations.LambdaDestination.Builder =
        software.amazon.awscdk.services.lambda.destinations.LambdaDestination.Builder.create(fn)

    override fun responseOnly(responseOnly: Boolean) {
      cdkBuilder.responseOnly(responseOnly)
    }

    public fun build(): software.amazon.awscdk.services.lambda.destinations.LambdaDestination =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(fn: CloudshiftdevAwscdkServicesLambdaIFunction,
        block: Builder.() -> Unit = {}): LambdaDestination {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesLambdaIFunction.unwrap(fn))
      return LambdaDestination(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.destinations.LambdaDestination):
        LambdaDestination = LambdaDestination(cdkObject)

    internal fun unwrap(wrapped: LambdaDestination):
        software.amazon.awscdk.services.lambda.destinations.LambdaDestination = wrapped.cdkObject
  }
}
