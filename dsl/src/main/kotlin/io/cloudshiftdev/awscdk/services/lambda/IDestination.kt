package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IDestination {
  /**
   * Binds this destination to the Lambda function.
   *
   * @param scope 
   * @param fn 
   * @param options
   */
  public fun bind(scope: Construct, fn: IFunction): DestinationConfig

  /**
   * Binds this destination to the Lambda function.
   *
   * @param scope 
   * @param fn 
   * @param options
   */
  public fun bind(
    scope: Construct,
    fn: IFunction,
    options: DestinationOptions,
  ): DestinationConfig

  /**
   * Binds this destination to the Lambda function.
   *
   * @param scope 
   * @param fn 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d6ad4acfbba31901bb8135560633af5578e09f84d84123fa0dbea6b67295dd3")
  public fun bind(
    scope: Construct,
    fn: IFunction,
    options: DestinationOptions.Builder.() -> Unit,
  ): DestinationConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.IDestination,
  ) : IDestination {
    /**
     * Binds this destination to the Lambda function.
     *
     * @param scope 
     * @param fn 
     * @param options
     */
    override fun bind(scope: Construct, fn: IFunction): DestinationConfig =
        unwrap(this).bind(scope.let(Construct::unwrap),
        fn.let(IFunction::unwrap)).let(DestinationConfig::wrap)

    /**
     * Binds this destination to the Lambda function.
     *
     * @param scope 
     * @param fn 
     * @param options
     */
    override fun bind(
      scope: Construct,
      fn: IFunction,
      options: DestinationOptions,
    ): DestinationConfig = unwrap(this).bind(scope.let(Construct::unwrap),
        fn.let(IFunction::unwrap),
        options.let(DestinationOptions::unwrap)).let(DestinationConfig::wrap)

    /**
     * Binds this destination to the Lambda function.
     *
     * @param scope 
     * @param fn 
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d6ad4acfbba31901bb8135560633af5578e09f84d84123fa0dbea6b67295dd3")
    override fun bind(
      scope: Construct,
      fn: IFunction,
      options: DestinationOptions.Builder.() -> Unit,
    ): DestinationConfig = bind(scope, fn, DestinationOptions(options))
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IDestination): IDestination
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDestination): software.amazon.awscdk.services.lambda.IDestination
        = (wrapped as Wrapper).cdkObject
  }
}
