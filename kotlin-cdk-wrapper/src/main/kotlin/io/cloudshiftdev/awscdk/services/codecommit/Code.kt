@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.assets.Asset
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * Represents the contents to initialize the repository with.
 *
 * Example:
 *
 * ```
 * Repository repo = Repository.Builder.create(this, "Repository")
 * .repositoryName("MyRepositoryName")
 * .code(Code.fromDirectory(join(__dirname, "directory/"), "develop"))
 * .build();
 * ```
 */
public abstract class Code(
  cdkObject: software.amazon.awscdk.services.codecommit.Code,
) : CdkObject(cdkObject) {
  /**
   * This method is called after a repository is passed this instance of Code in its 'code'
   * property.
   *
   * @param scope the binding scope. 
   */
  public open fun bind(scope: Construct): CodeConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codecommit.Code,
  ) : Code(cdkObject)

  public companion object {
    public fun fromAsset(asset: Asset): Code =
        software.amazon.awscdk.services.codecommit.Code.fromAsset(asset.let(Asset::unwrap)).let(Code::wrap)

    public fun fromAsset(asset: Asset, branch: String): Code =
        software.amazon.awscdk.services.codecommit.Code.fromAsset(asset.let(Asset::unwrap),
        branch).let(Code::wrap)

    public fun fromDirectory(directoryPath: String): Code =
        software.amazon.awscdk.services.codecommit.Code.fromDirectory(directoryPath).let(Code::wrap)

    public fun fromDirectory(directoryPath: String, branch: String): Code =
        software.amazon.awscdk.services.codecommit.Code.fromDirectory(directoryPath,
        branch).let(Code::wrap)

    public fun fromZipFile(filePath: String): Code =
        software.amazon.awscdk.services.codecommit.Code.fromZipFile(filePath).let(Code::wrap)

    public fun fromZipFile(filePath: String, branch: String): Code =
        software.amazon.awscdk.services.codecommit.Code.fromZipFile(filePath,
        branch).let(Code::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.Code): Code =
        CdkObjectWrappers.wrap(cdkObject) as? Code ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Code): software.amazon.awscdk.services.codecommit.Code = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.codecommit.Code
  }
}
