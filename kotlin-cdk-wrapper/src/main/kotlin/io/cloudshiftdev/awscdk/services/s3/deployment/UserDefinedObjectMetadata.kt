@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Deprecated
import kotlin.Unit

/**
 * (deprecated) Custom user defined metadata.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.deployment.*;
 * UserDefinedObjectMetadata userDefinedObjectMetadata =
 * UserDefinedObjectMetadata.builder().build();
 * ```
 *
 * @deprecated Use raw property bags instead (object literals, `Map&lt;String,Object&gt;`, etc... )
 */
public interface UserDefinedObjectMetadata {
  /**
   * A builder for [UserDefinedObjectMetadata]
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata.Builder =
        software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata.builder()

    public fun build(): software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata,
  ) : CdkObject(cdkObject), UserDefinedObjectMetadata

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserDefinedObjectMetadata {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata):
        UserDefinedObjectMetadata = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserDefinedObjectMetadata):
        software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata
  }
}
