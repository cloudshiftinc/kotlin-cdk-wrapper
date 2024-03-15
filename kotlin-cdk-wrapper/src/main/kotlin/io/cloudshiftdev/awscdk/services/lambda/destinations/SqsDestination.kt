@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.destinations

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.DestinationConfig
import io.cloudshiftdev.awscdk.services.lambda.DestinationOptions
import io.cloudshiftdev.awscdk.services.lambda.IDestination
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

public open class SqsDestination internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.destinations.SqsDestination,
) : CdkObject(cdkObject), IDestination {
  public override fun bind(_scope: Construct, fn: IFunction): DestinationConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap),
      fn.let(IFunction::unwrap)).let(DestinationConfig::wrap)

  public override fun bind(
    _scope: Construct,
    fn: IFunction,
    _options: DestinationOptions,
  ): DestinationConfig = unwrap(this).bind(_scope.let(Construct::unwrap), fn.let(IFunction::unwrap),
      _options.let(DestinationOptions::unwrap)).let(DestinationConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d6ad4acfbba31901bb8135560633af5578e09f84d84123fa0dbea6b67295dd3")
  public override fun bind(
    _scope: Construct,
    fn: IFunction,
    _options: DestinationOptions.Builder.() -> Unit,
  ): DestinationConfig = bind(_scope, fn, DestinationOptions(_options))

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.destinations.SqsDestination):
        SqsDestination = SqsDestination(cdkObject)

    internal fun unwrap(wrapped: SqsDestination):
        software.amazon.awscdk.services.lambda.destinations.SqsDestination = wrapped.cdkObject
  }
}
