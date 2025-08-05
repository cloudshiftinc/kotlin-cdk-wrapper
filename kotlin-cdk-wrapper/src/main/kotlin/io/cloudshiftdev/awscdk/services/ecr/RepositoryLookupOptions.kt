@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for looking up an existing Repository.
 *
 * Example:
 *
 * ```
 * // import using repository name
 * IRepository repositoryFromName = Repository.fromRepositoryName(this, "ImportedRepoByName",
 * "my-repo-name");
 * // import using repository ARN
 * IRepository repositoryFromArn = Repository.fromRepositoryArn(this, "ImportedRepoByArn",
 * "arn:aws:ecr:us-east-1:123456789012:repository/my-repo-name");
 * // import using repository lookup
 * // You have to provide either `repositoryArn` or `repositoryName` to lookup the repository
 * IRepository repositoryFromLookup = Repository.fromLookup(this, "ImportedRepoByLookup",
 * RepositoryLookupOptions.builder()
 * .repositoryArn("arn:aws:ecr:us-east-1:123456789012:repository/my-repo-name")
 * .repositoryName("my-repo-name")
 * .build());
 * ```
 */
public interface RepositoryLookupOptions {
  /**
   * The ARN of the repository.
   *
   * Default: - Do not filter on repository ARN
   */
  public fun repositoryArn(): String? = unwrap(this).getRepositoryArn()

  /**
   * The name of the repository.
   *
   * Default: - Do not filter on repository name
   */
  public fun repositoryName(): String? = unwrap(this).getRepositoryName()

  /**
   * A builder for [RepositoryLookupOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param repositoryArn The ARN of the repository.
     */
    public fun repositoryArn(repositoryArn: String)

    /**
     * @param repositoryName The name of the repository.
     */
    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.RepositoryLookupOptions.Builder =
        software.amazon.awscdk.services.ecr.RepositoryLookupOptions.builder()

    /**
     * @param repositoryArn The ARN of the repository.
     */
    override fun repositoryArn(repositoryArn: String) {
      cdkBuilder.repositoryArn(repositoryArn)
    }

    /**
     * @param repositoryName The name of the repository.
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): software.amazon.awscdk.services.ecr.RepositoryLookupOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecr.RepositoryLookupOptions,
  ) : CdkObject(cdkObject),
      RepositoryLookupOptions {
    /**
     * The ARN of the repository.
     *
     * Default: - Do not filter on repository ARN
     */
    override fun repositoryArn(): String? = unwrap(this).getRepositoryArn()

    /**
     * The name of the repository.
     *
     * Default: - Do not filter on repository name
     */
    override fun repositoryName(): String? = unwrap(this).getRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.RepositoryLookupOptions):
        RepositoryLookupOptions = CdkObjectWrappers.wrap(cdkObject) as? RepositoryLookupOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RepositoryLookupOptions):
        software.amazon.awscdk.services.ecr.RepositoryLookupOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.RepositoryLookupOptions
  }
}
