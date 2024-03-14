package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class OriginBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.OriginBase,
) : CdkObject(cdkObject), IOrigin {
  /**
   * Binds the origin to the associated Distribution.
   *
   * Can be used to grant permissions, create dependent resources, etc.
   *
   * @param _scope 
   * @param options 
   */
  public override fun bind(_scope: Construct, options: OriginBindOptions): OriginBindConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap),
      options.let(OriginBindOptions::unwrap)).let(OriginBindConfig::wrap)

  /**
   * Binds the origin to the associated Distribution.
   *
   * Can be used to grant permissions, create dependent resources, etc.
   *
   * @param _scope 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a4d8f445ceb4e4ebb177be4645de7fd3d72f0f5d66bcf420280cc1b7bc73b342")
  public override fun bind(_scope: Construct, options: OriginBindOptions.Builder.() -> Unit):
      OriginBindConfig = bind(_scope, OriginBindOptions(options))

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.OriginBase,
  ) : OriginBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginBase): OriginBase
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginBase): software.amazon.awscdk.services.cloudfront.OriginBase
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.OriginBase
  }
}
