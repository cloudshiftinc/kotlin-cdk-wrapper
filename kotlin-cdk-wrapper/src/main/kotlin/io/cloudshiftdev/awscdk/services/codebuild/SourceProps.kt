@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties common to all Source classes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * SourceProps sourceProps = SourceProps.builder()
 * .identifier("identifier")
 * .build();
 * ```
 */
public interface SourceProps {
  /**
   * The source identifier.
   *
   * This property is required on secondary sources.
   */
  public fun identifier(): String? = unwrap(this).getIdentifier()

  /**
   * A builder for [SourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param identifier The source identifier.
     * This property is required on secondary sources.
     */
    public fun identifier(identifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.SourceProps.Builder =
        software.amazon.awscdk.services.codebuild.SourceProps.builder()

    /**
     * @param identifier The source identifier.
     * This property is required on secondary sources.
     */
    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.SourceProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.SourceProps,
  ) : CdkObject(cdkObject),
      SourceProps {
    /**
     * The source identifier.
     *
     * This property is required on secondary sources.
     */
    override fun identifier(): String? = unwrap(this).getIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.SourceProps): SourceProps
        = CdkObjectWrappers.wrap(cdkObject) as? SourceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceProps): software.amazon.awscdk.services.codebuild.SourceProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.SourceProps
  }
}
