@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An Amazon Data Firehose delivery stream destination.
 */
public interface IDestination {
  /**
   * Binds this destination to the Amazon Data Firehose delivery stream.
   *
   * Implementers should use this method to bind resources to the stack and initialize values using
   * the provided stream.
   *
   * @param scope 
   * @param options 
   */
  public fun bind(scope: Construct, options: DestinationBindOptions): DestinationConfig

  /**
   * Binds this destination to the Amazon Data Firehose delivery stream.
   *
   * Implementers should use this method to bind resources to the stack and initialize values using
   * the provided stream.
   *
   * @param scope 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5dca4bf968b267ecaeaeefaa40b64a5dce716ac1e5339251727f13f209597a70")
  public fun bind(scope: Construct, options: DestinationBindOptions.Builder.() -> Unit):
      DestinationConfig

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.IDestination,
  ) : CdkObject(cdkObject),
      IDestination {
    /**
     * Binds this destination to the Amazon Data Firehose delivery stream.
     *
     * Implementers should use this method to bind resources to the stack and initialize values
     * using the provided stream.
     *
     * @param scope 
     * @param options 
     */
    override fun bind(scope: Construct, options: DestinationBindOptions): DestinationConfig =
        unwrap(this).bind(scope.let(Construct.Companion::unwrap),
        options.let(DestinationBindOptions.Companion::unwrap)).let(DestinationConfig::wrap)

    /**
     * Binds this destination to the Amazon Data Firehose delivery stream.
     *
     * Implementers should use this method to bind resources to the stack and initialize values
     * using the provided stream.
     *
     * @param scope 
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5dca4bf968b267ecaeaeefaa40b64a5dce716ac1e5339251727f13f209597a70")
    override fun bind(scope: Construct, options: DestinationBindOptions.Builder.() -> Unit):
        DestinationConfig = bind(scope, DestinationBindOptions(options))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.IDestination):
        IDestination = CdkObjectWrappers.wrap(cdkObject) as? IDestination ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDestination):
        software.amazon.awscdk.services.kinesisfirehose.IDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesisfirehose.IDestination
  }
}
