@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties common to all Artifacts classes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * ArtifactsProps artifactsProps = ArtifactsProps.builder()
 * .identifier("identifier")
 * .build();
 * ```
 */
public interface ArtifactsProps {
  /**
   * The artifact identifier.
   *
   * This property is required on secondary artifacts.
   */
  public fun identifier(): String? = unwrap(this).getIdentifier()

  /**
   * A builder for [ArtifactsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param identifier The artifact identifier.
     * This property is required on secondary artifacts.
     */
    public fun identifier(identifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.ArtifactsProps.Builder =
        software.amazon.awscdk.services.codebuild.ArtifactsProps.builder()

    /**
     * @param identifier The artifact identifier.
     * This property is required on secondary artifacts.
     */
    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.ArtifactsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.ArtifactsProps,
  ) : CdkObject(cdkObject), ArtifactsProps {
    /**
     * The artifact identifier.
     *
     * This property is required on secondary artifacts.
     */
    override fun identifier(): String? = unwrap(this).getIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ArtifactsProps):
        ArtifactsProps = CdkObjectWrappers.wrap(cdkObject) as? ArtifactsProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ArtifactsProps):
        software.amazon.awscdk.services.codebuild.ArtifactsProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codebuild.ArtifactsProps
  }
}
