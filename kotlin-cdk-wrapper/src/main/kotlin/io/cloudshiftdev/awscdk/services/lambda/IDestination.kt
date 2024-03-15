@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IDestination {
  public fun bind(arg0: Construct, arg1: IFunction): DestinationConfig

  public fun bind(
    arg0: Construct,
    arg1: IFunction,
    arg2: DestinationOptions,
  ): DestinationConfig

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d6ad4acfbba31901bb8135560633af5578e09f84d84123fa0dbea6b67295dd3")
  public fun bind(
    arg0: Construct,
    arg1: IFunction,
    arg2: DestinationOptions.Builder.() -> Unit,
  ): DestinationConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.IDestination,
  ) : CdkObject(cdkObject), IDestination {
    override fun bind(arg0: Construct, arg1: IFunction): DestinationConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(IFunction::unwrap)).let(DestinationConfig::wrap)

    override fun bind(
      arg0: Construct,
      arg1: IFunction,
      arg2: DestinationOptions,
    ): DestinationConfig = unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(IFunction::unwrap),
        arg2.let(DestinationOptions::unwrap)).let(DestinationConfig::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d6ad4acfbba31901bb8135560633af5578e09f84d84123fa0dbea6b67295dd3")
    override fun bind(
      arg0: Construct,
      arg1: IFunction,
      arg2: DestinationOptions.Builder.() -> Unit,
    ): DestinationConfig = bind(arg0, arg1, DestinationOptions(arg2))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IDestination): IDestination
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDestination): software.amazon.awscdk.services.lambda.IDestination
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.IDestination
  }
}
