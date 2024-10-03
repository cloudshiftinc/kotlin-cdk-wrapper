@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarconnections

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Information about the repository link resource, such as the repository link ARN, the associated
 * connection ARN, encryption key ARN, and owner ID.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codestarconnections.*;
 * CfnRepositoryLink cfnRepositoryLink = CfnRepositoryLink.Builder.create(this,
 * "MyCfnRepositoryLink")
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
public open class CfnRepositoryLink(
  cdkObject: software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRepositoryLinkProps,
  ) :
      this(software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRepositoryLinkProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRepositoryLinkProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRepositoryLinkProps(props)
  )

  /**
   * The name of the external provider where your third-party code repository is configured.
   */
  public open fun attrProviderType(): String = unwrap(this).getAttrProviderType()

  /**
   * A unique Amazon Resource Name (ARN) to designate the repository link.
   */
  public open fun attrRepositoryLinkArn(): String = unwrap(this).getAttrRepositoryLinkArn()

  /**
   * A UUID that uniquely identifies the RepositoryLink.
   */
  public open fun attrRepositoryLinkId(): String = unwrap(this).getAttrRepositoryLinkId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The Amazon Resource Name (ARN) of the connection associated with the repository link.
   */
  public open fun connectionArn(): String = unwrap(this).getConnectionArn()

  /**
   * The Amazon Resource Name (ARN) of the connection associated with the repository link.
   */
  public open fun connectionArn(`value`: String) {
    unwrap(this).setConnectionArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the encryption key for the repository associated with the
   * repository link.
   */
  public open fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  /**
   * The Amazon Resource Name (ARN) of the encryption key for the repository associated with the
   * repository link.
   */
  public open fun encryptionKeyArn(`value`: String) {
    unwrap(this).setEncryptionKeyArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The owner ID for the repository associated with the repository link, such as the owner ID in
   * GitHub.
   */
  public open fun ownerId(): String = unwrap(this).getOwnerId()

  /**
   * The owner ID for the repository associated with the repository link, such as the owner ID in
   * GitHub.
   */
  public open fun ownerId(`value`: String) {
    unwrap(this).setOwnerId(`value`)
  }

  /**
   * The name of the repository associated with the repository link.
   */
  public open fun repositoryName(): String = unwrap(this).getRepositoryName()

  /**
   * The name of the repository associated with the repository link.
   */
  public open fun repositoryName(`value`: String) {
    unwrap(this).setRepositoryName(`value`)
  }

  /**
   * The tags for the repository to be associated with the repository link.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags for the repository to be associated with the repository link.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags for the repository to be associated with the repository link.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codestarconnections.CfnRepositoryLink].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the connection associated with the repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-connectionarn)
     * @param connectionArn The Amazon Resource Name (ARN) of the connection associated with the
     * repository link. 
     */
    public fun connectionArn(connectionArn: String)

    /**
     * The Amazon Resource Name (ARN) of the encryption key for the repository associated with the
     * repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-encryptionkeyarn)
     * @param encryptionKeyArn The Amazon Resource Name (ARN) of the encryption key for the
     * repository associated with the repository link. 
     */
    public fun encryptionKeyArn(encryptionKeyArn: String)

    /**
     * The owner ID for the repository associated with the repository link, such as the owner ID in
     * GitHub.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-ownerid)
     * @param ownerId The owner ID for the repository associated with the repository link, such as
     * the owner ID in GitHub. 
     */
    public fun ownerId(ownerId: String)

    /**
     * The name of the repository associated with the repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-repositoryname)
     * @param repositoryName The name of the repository associated with the repository link. 
     */
    public fun repositoryName(repositoryName: String)

    /**
     * The tags for the repository to be associated with the repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-tags)
     * @param tags The tags for the repository to be associated with the repository link. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the repository to be associated with the repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-tags)
     * @param tags The tags for the repository to be associated with the repository link. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink.Builder =
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink.Builder.create(scope,
        id)

    /**
     * The Amazon Resource Name (ARN) of the connection associated with the repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-connectionarn)
     * @param connectionArn The Amazon Resource Name (ARN) of the connection associated with the
     * repository link. 
     */
    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the encryption key for the repository associated with the
     * repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-encryptionkeyarn)
     * @param encryptionKeyArn The Amazon Resource Name (ARN) of the encryption key for the
     * repository associated with the repository link. 
     */
    override fun encryptionKeyArn(encryptionKeyArn: String) {
      cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    /**
     * The owner ID for the repository associated with the repository link, such as the owner ID in
     * GitHub.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-ownerid)
     * @param ownerId The owner ID for the repository associated with the repository link, such as
     * the owner ID in GitHub. 
     */
    override fun ownerId(ownerId: String) {
      cdkBuilder.ownerId(ownerId)
    }

    /**
     * The name of the repository associated with the repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-repositoryname)
     * @param repositoryName The name of the repository associated with the repository link. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * The tags for the repository to be associated with the repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-tags)
     * @param tags The tags for the repository to be associated with the repository link. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags for the repository to be associated with the repository link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html#cfn-codestarconnections-repositorylink-tags)
     * @param tags The tags for the repository to be associated with the repository link. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRepositoryLink {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRepositoryLink(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink):
        CfnRepositoryLink = CfnRepositoryLink(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryLink):
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink = wrapped.cdkObject as
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink
  }
}
