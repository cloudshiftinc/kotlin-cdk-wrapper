package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IOrigin {
  /**
   * The method called when a given Origin is added (for the first time) to a Distribution.
   *
   * @param scope 
   * @param options 
   */
  public fun bind(scope: Construct, options: OriginBindOptions): OriginBindConfig

  /**
   * The method called when a given Origin is added (for the first time) to a Distribution.
   *
   * @param scope 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a4d8f445ceb4e4ebb177be4645de7fd3d72f0f5d66bcf420280cc1b7bc73b342")
  public fun bind(scope: Construct, options: OriginBindOptions.Builder.() -> Unit): OriginBindConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.IOrigin,
  ) : CdkObject(cdkObject), IOrigin {
    /**
     * The method called when a given Origin is added (for the first time) to a Distribution.
     *
     * @param scope 
     * @param options 
     */
    override fun bind(scope: Construct, options: OriginBindOptions): OriginBindConfig =
        unwrap(this).bind(scope.let(Construct::unwrap),
        options.let(OriginBindOptions::unwrap)).let(OriginBindConfig::wrap)

    /**
     * The method called when a given Origin is added (for the first time) to a Distribution.
     *
     * @param scope 
     * @param options 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4d8f445ceb4e4ebb177be4645de7fd3d72f0f5d66bcf420280cc1b7bc73b342")
    override fun bind(scope: Construct, options: OriginBindOptions.Builder.() -> Unit):
        OriginBindConfig = bind(scope, OriginBindOptions(options))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IOrigin): IOrigin =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IOrigin): software.amazon.awscdk.services.cloudfront.IOrigin =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.IOrigin
  }
}
