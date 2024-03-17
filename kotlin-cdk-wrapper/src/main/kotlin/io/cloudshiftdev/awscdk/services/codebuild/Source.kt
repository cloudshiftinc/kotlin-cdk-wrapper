@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Source provider definition for a CodeBuild Project.
 *
 * Example:
 *
 * ```
 * Project project = Project.Builder.create(this, "MyProject")
 * .buildSpec(BuildSpec.fromSourceFilename("my-buildspec.yml"))
 * .source(Source.gitHub(GitHubSourceProps.builder()
 * .owner("awslabs")
 * .repo("aws-cdk")
 * .build()))
 * .build();
 * ```
 */
public abstract class Source internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.Source,
) : CdkObject(cdkObject), ISource {
  /**
   *
   */
  public override fun badgeSupported(): Boolean = unwrap(this).getBadgeSupported()

  /**
   * Called by the project when the source is added so that the source can perform binding
   * operations on the source.
   *
   * For example, it can grant permissions to the
   * code build project to read from the S3 bucket.
   *
   * @param _scope 
   * @param _project 
   */
  public override fun bind(scope: Construct, project: IProject): SourceConfig =
      unwrap(this).bind(scope.let(Construct::unwrap),
      project.let(IProject::unwrap)).let(SourceConfig::wrap)

  /**
   *
   */
  public override fun identifier(): String? = unwrap(this).getIdentifier()

  /**
   *
   */
  public override fun type(): String = unwrap(this).getType()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.Source,
  ) : Source(cdkObject)

  public companion object {
    public fun bitBucket(props: BitBucketSourceProps): ISource =
        software.amazon.awscdk.services.codebuild.Source.bitBucket(props.let(BitBucketSourceProps::unwrap)).let(ISource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5116059bbc47451de2e01d2a6f724939523526f59e93532d1a003d15006a8e66")
    public fun bitBucket(props: BitBucketSourceProps.Builder.() -> Unit): ISource =
        bitBucket(BitBucketSourceProps(props))

    public fun codeCommit(props: CodeCommitSourceProps): ISource =
        software.amazon.awscdk.services.codebuild.Source.codeCommit(props.let(CodeCommitSourceProps::unwrap)).let(ISource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80bf3256d8f763da0320b10525db36ac41235f6309467712063051ce296f1ffc")
    public fun codeCommit(props: CodeCommitSourceProps.Builder.() -> Unit): ISource =
        codeCommit(CodeCommitSourceProps(props))

    public fun gitHub(props: GitHubSourceProps): ISource =
        software.amazon.awscdk.services.codebuild.Source.gitHub(props.let(GitHubSourceProps::unwrap)).let(ISource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e161e3dee71d59d02f86500f2c6a824e1e15b9105d2f6ad4f2668ef62823c967")
    public fun gitHub(props: GitHubSourceProps.Builder.() -> Unit): ISource =
        gitHub(GitHubSourceProps(props))

    public fun gitHubEnterprise(props: GitHubEnterpriseSourceProps): ISource =
        software.amazon.awscdk.services.codebuild.Source.gitHubEnterprise(props.let(GitHubEnterpriseSourceProps::unwrap)).let(ISource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("decd211da0ec7146a3ae049ea4922ea246b9b85761fa5af69590c7cb69eeb38f")
    public fun gitHubEnterprise(props: GitHubEnterpriseSourceProps.Builder.() -> Unit): ISource =
        gitHubEnterprise(GitHubEnterpriseSourceProps(props))

    public fun s3(props: S3SourceProps): ISource =
        software.amazon.awscdk.services.codebuild.Source.s3(props.let(S3SourceProps::unwrap)).let(ISource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03362722aac8e057f9ef808655fbd859113ee7cfc1a10ebe0b08b1eb43675c62")
    public fun s3(props: S3SourceProps.Builder.() -> Unit): ISource = s3(S3SourceProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.Source): Source =
        CdkObjectWrappers.wrap(cdkObject) as? Source ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Source): software.amazon.awscdk.services.codebuild.Source =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.Source
  }
}
