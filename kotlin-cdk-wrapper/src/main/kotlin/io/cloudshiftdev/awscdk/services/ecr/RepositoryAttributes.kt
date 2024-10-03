@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.*;
 * RepositoryAttributes repositoryAttributes = RepositoryAttributes.builder()
 * .repositoryArn("repositoryArn")
 * .repositoryName("repositoryName")
 * .build();
 * ```
 */
public interface RepositoryAttributes {
  /**
   *
   */
  public fun repositoryArn(): String

  /**
   *
   */
  public fun repositoryName(): String

  /**
   * A builder for [RepositoryAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param repositoryArn the value to be set. 
     */
    public fun repositoryArn(repositoryArn: String)

    /**
     * @param repositoryName the value to be set. 
     */
    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.RepositoryAttributes.Builder =
        software.amazon.awscdk.services.ecr.RepositoryAttributes.builder()

    /**
     * @param repositoryArn the value to be set. 
     */
    override fun repositoryArn(repositoryArn: String) {
      cdkBuilder.repositoryArn(repositoryArn)
    }

    /**
     * @param repositoryName the value to be set. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): software.amazon.awscdk.services.ecr.RepositoryAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecr.RepositoryAttributes,
  ) : CdkObject(cdkObject),
      RepositoryAttributes {
    /**
     *
     */
    override fun repositoryArn(): String = unwrap(this).getRepositoryArn()

    /**
     *
     */
    override fun repositoryName(): String = unwrap(this).getRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.RepositoryAttributes):
        RepositoryAttributes = CdkObjectWrappers.wrap(cdkObject) as? RepositoryAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RepositoryAttributes):
        software.amazon.awscdk.services.ecr.RepositoryAttributes = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecr.RepositoryAttributes
  }
}
