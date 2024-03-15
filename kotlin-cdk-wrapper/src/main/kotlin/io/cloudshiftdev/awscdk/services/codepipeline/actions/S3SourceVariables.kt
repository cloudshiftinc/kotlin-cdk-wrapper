@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * The CodePipeline variables emitted by the S3 source Action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
 * S3SourceVariables s3SourceVariables = S3SourceVariables.builder()
 * .eTag("eTag")
 * .versionId("versionId")
 * .build();
 * ```
 */
public interface S3SourceVariables {
  /**
   * The e-tag of the S3 version of the object that triggered the build.
   */
  public fun eTag(): String

  /**
   * The identifier of the S3 version of the object that triggered the build.
   */
  public fun versionId(): String

  /**
   * A builder for [S3SourceVariables]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param eTag The e-tag of the S3 version of the object that triggered the build. 
     */
    public fun eTag(eTag: String)

    /**
     * @param versionId The identifier of the S3 version of the object that triggered the build. 
     */
    public fun versionId(versionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables.Builder =
        software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables.builder()

    /**
     * @param eTag The e-tag of the S3 version of the object that triggered the build. 
     */
    override fun eTag(eTag: String) {
      cdkBuilder.eTag(eTag)
    }

    /**
     * @param versionId The identifier of the S3 version of the object that triggered the build. 
     */
    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables,
  ) : CdkObject(cdkObject), S3SourceVariables {
    /**
     * The e-tag of the S3 version of the object that triggered the build.
     */
    override fun eTag(): String = unwrap(this).getETag()

    /**
     * The identifier of the S3 version of the object that triggered the build.
     */
    override fun versionId(): String = unwrap(this).getVersionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3SourceVariables {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables):
        S3SourceVariables = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3SourceVariables):
        software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables
  }
}
