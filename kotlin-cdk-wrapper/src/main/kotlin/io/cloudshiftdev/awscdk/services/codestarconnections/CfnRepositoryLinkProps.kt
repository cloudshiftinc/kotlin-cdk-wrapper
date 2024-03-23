@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarconnections

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRepositoryLink`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codestarconnections.*;
 * CfnRepositoryLinkProps cfnRepositoryLinkProps = CfnRepositoryLinkProps.builder()
 * .connectionArn("connectionArn")
 * .ownerId("ownerId")
 * .repositoryName("repositoryName")
 * // the properties below are optional
 * .encryptionKeyArn("encryptionKeyArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html)
 */
public interface CfnRepositoryLinkProps {
  /**
   * The Amazon Resource Name (ARN) of the connection associated with the repository link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-connectionarn)
   */
  public fun connectionArn(): String

  /**
   * The Amazon Resource Name (ARN) of the encryption key for the repository associated with the
   * repository link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-encryptionkeyarn)
   */
  public fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  /**
   * The owner ID for the repository associated with the repository link, such as the owner ID in
   * GitHub.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-ownerid)
   */
  public fun ownerId(): String

  /**
   * The name of the repository associated with the repository link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-repositoryname)
   */
  public fun repositoryName(): String

  /**
   * The tags for the repository to be associated with the repository link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRepositoryLinkProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionArn The Amazon Resource Name (ARN) of the connection associated with the
     * repository link. 
     */
    public fun connectionArn(connectionArn: String)

    /**
     * @param encryptionKeyArn The Amazon Resource Name (ARN) of the encryption key for the
     * repository associated with the repository link.
     */
    public fun encryptionKeyArn(encryptionKeyArn: String)

    /**
     * @param ownerId The owner ID for the repository associated with the repository link, such as
     * the owner ID in GitHub. 
     */
    public fun ownerId(ownerId: String)

    /**
     * @param repositoryName The name of the repository associated with the repository link. 
     */
    public fun repositoryName(repositoryName: String)

    /**
     * @param tags The tags for the repository to be associated with the repository link.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the repository to be associated with the repository link.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps.Builder =
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps.builder()

    /**
     * @param connectionArn The Amazon Resource Name (ARN) of the connection associated with the
     * repository link. 
     */
    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * @param encryptionKeyArn The Amazon Resource Name (ARN) of the encryption key for the
     * repository associated with the repository link.
     */
    override fun encryptionKeyArn(encryptionKeyArn: String) {
      cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    /**
     * @param ownerId The owner ID for the repository associated with the repository link, such as
     * the owner ID in GitHub. 
     */
    override fun ownerId(ownerId: String) {
      cdkBuilder.ownerId(ownerId)
    }

    /**
     * @param repositoryName The name of the repository associated with the repository link. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * @param tags The tags for the repository to be associated with the repository link.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the repository to be associated with the repository link.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps,
  ) : CdkObject(cdkObject), CfnRepositoryLinkProps {
    /**
     * The Amazon Resource Name (ARN) of the connection associated with the repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-connectionarn)
     */
    override fun connectionArn(): String = unwrap(this).getConnectionArn()

    /**
     * The Amazon Resource Name (ARN) of the encryption key for the repository associated with the
     * repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-encryptionkeyarn)
     */
    override fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

    /**
     * The owner ID for the repository associated with the repository link, such as the owner ID in
     * GitHub.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-ownerid)
     */
    override fun ownerId(): String = unwrap(this).getOwnerId()

    /**
     * The name of the repository associated with the repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-repositoryname)
     */
    override fun repositoryName(): String = unwrap(this).getRepositoryName()

    /**
     * The tags for the repository to be associated with the repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRepositoryLinkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps):
        CfnRepositoryLinkProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRepositoryLinkProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryLinkProps):
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps
  }
}
