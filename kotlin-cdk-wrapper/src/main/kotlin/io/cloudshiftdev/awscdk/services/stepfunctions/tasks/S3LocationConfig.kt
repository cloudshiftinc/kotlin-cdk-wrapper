@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Stores information about the location of an object in Amazon S3.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * S3LocationConfig s3LocationConfig = S3LocationConfig.builder()
 * .uri("uri")
 * .build();
 * ```
 */
public interface S3LocationConfig {
  /**
   * Uniquely identifies the resource in Amazon S3.
   */
  public fun uri(): String

  /**
   * A builder for [S3LocationConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param uri Uniquely identifies the resource in Amazon S3. 
     */
    public fun uri(uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig.builder()

    /**
     * @param uri Uniquely identifies the resource in Amazon S3. 
     */
    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig,
  ) : CdkObject(cdkObject), S3LocationConfig {
    /**
     * Uniquely identifies the resource in Amazon S3.
     */
    override fun uri(): String = unwrap(this).getUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig):
        S3LocationConfig = CdkObjectWrappers.wrap(cdkObject) as? S3LocationConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3LocationConfig):
        software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig
  }
}
