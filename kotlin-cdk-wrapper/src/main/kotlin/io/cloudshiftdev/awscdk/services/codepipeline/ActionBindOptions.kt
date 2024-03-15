@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * Role role;
 * ActionBindOptions actionBindOptions = ActionBindOptions.builder()
 * .bucket(bucket)
 * .role(role)
 * .build();
 * ```
 */
public interface ActionBindOptions {
  /**
   *
   */
  public fun bucket(): IBucket

  /**
   *
   */
  public fun role(): IRole

  /**
   * A builder for [ActionBindOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket the value to be set. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param role the value to be set. 
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.ActionBindOptions.Builder =
        software.amazon.awscdk.services.codepipeline.ActionBindOptions.builder()

    /**
     * @param bucket the value to be set. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * @param role the value to be set. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.ActionBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.ActionBindOptions,
  ) : CdkObject(cdkObject), ActionBindOptions {
    /**
     *
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     *
     */
    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ActionBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.ActionBindOptions):
        ActionBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ActionBindOptions):
        software.amazon.awscdk.services.codepipeline.ActionBindOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.ActionBindOptions
  }
}
