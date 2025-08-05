@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents a distribution origin, that describes the Amazon S3 bucket, HTTP server (for example,
 * a web server), Amazon MediaStore, or other server from which CloudFront gets your files.
 */
public abstract class OriginBase(
  cdkObject: software.amazon.awscdk.services.cloudfront.OriginBase,
) : CdkObject(cdkObject),
    IOrigin {
  /**
   * Binds the origin to the associated Distribution.
   *
   * Can be used to grant permissions, create dependent resources, etc.
   *
   * @param scope 
   * @param options 
   */
  public override fun bind(scope: Construct, options: OriginBindOptions): OriginBindConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      options.let(OriginBindOptions.Companion::unwrap)).let(OriginBindConfig::wrap)

  /**
   * Binds the origin to the associated Distribution.
   *
   * Can be used to grant permissions, create dependent resources, etc.
   *
   * @param scope 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a4d8f445ceb4e4ebb177be4645de7fd3d72f0f5d66bcf420280cc1b7bc73b342")
  public override fun bind(scope: Construct, options: OriginBindOptions.Builder.() -> Unit):
      OriginBindConfig = bind(scope, OriginBindOptions(options))

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.OriginBase,
  ) : OriginBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginBase): OriginBase
        = CdkObjectWrappers.wrap(cdkObject) as? OriginBase ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginBase): software.amazon.awscdk.services.cloudfront.OriginBase
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.OriginBase
  }
}
