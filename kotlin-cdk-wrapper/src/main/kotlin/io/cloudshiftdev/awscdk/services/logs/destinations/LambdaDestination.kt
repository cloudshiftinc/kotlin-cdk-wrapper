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

/**
 * Use a Lambda Function as the destination for a log subscription.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.logs.destinations.*;
 * Function fn;
 * LogGroup logGroup;
 * SubscriptionFilter.Builder.create(this, "Subscription")
 * .logGroup(logGroup)
 * .destination(new LambdaDestination(fn))
 * .filterPattern(FilterPattern.allTerms("ERROR", "MainThread"))
 * .filterName("ErrorInMainThread")
 * .build();
 * ```
 */
public open class LambdaDestination(
  cdkObject: software.amazon.awscdk.services.logs.destinations.LambdaDestination,
) : CdkObject(cdkObject),
    ILogSubscriptionDestination {
  public constructor(fn: CloudshiftdevAwscdkServicesLambdaIFunction) :
      this(software.amazon.awscdk.services.logs.destinations.LambdaDestination(fn.let(CloudshiftdevAwscdkServicesLambdaIFunction.Companion::unwrap))
  )

  public constructor(fn: CloudshiftdevAwscdkServicesLambdaIFunction,
      options: LambdaDestinationOptions) :
      this(software.amazon.awscdk.services.logs.destinations.LambdaDestination(fn.let(CloudshiftdevAwscdkServicesLambdaIFunction.Companion::unwrap),
      options.let(LambdaDestinationOptions.Companion::unwrap))
  )

  public constructor(fn: CloudshiftdevAwscdkServicesLambdaIFunction,
      options: LambdaDestinationOptions.Builder.() -> Unit) : this(fn,
      LambdaDestinationOptions(options)
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
   * @param logGroup 
   */
  public override fun bind(scope: Construct, logGroup: ILogGroup): LogSubscriptionDestinationConfig
      = unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      logGroup.let(ILogGroup.Companion::unwrap)).let(LogSubscriptionDestinationConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.destinations.LambdaDestination].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether or not to add Lambda Permissions.
     *
     * Default: true
     *
     * @param addPermissions Whether or not to add Lambda Permissions. 
     */
    public fun addPermissions(addPermissions: Boolean)
  }

  private class BuilderImpl(
    fn: AmazonAwscdkServicesLambdaIFunction,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.logs.destinations.LambdaDestination.Builder =
        software.amazon.awscdk.services.logs.destinations.LambdaDestination.Builder.create(fn)

    /**
     * Whether or not to add Lambda Permissions.
     *
     * Default: true
     *
     * @param addPermissions Whether or not to add Lambda Permissions. 
     */
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
        software.amazon.awscdk.services.logs.destinations.LambdaDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.destinations.LambdaDestination
  }
}
