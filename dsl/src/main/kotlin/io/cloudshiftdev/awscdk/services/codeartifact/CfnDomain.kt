package io.cloudshiftdev.awscdk.services.codeartifact

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDomain internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codeartifact.CfnDomain,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * When you pass the logical ID of this resource, the function returns the Amazon Resource Name
   * (ARN) of the domain.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * When you pass the logical ID of this resource, the function returns the key used to encrypt the
   * domain.
   */
  public open fun attrEncryptionKey(): String = unwrap(this).getAttrEncryptionKey()

  /**
   * When you pass the logical ID of this resource, the function returns the name of the domain.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * When you pass the logical ID of this resource, the function returns the 12-digit account number
   * of the AWS account that owns the domain.
   */
  public open fun attrOwner(): String = unwrap(this).getAttrOwner()

  /**
   * A string that specifies the name of the requested domain.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * A string that specifies the name of the requested domain.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
   */
  public open fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  /**
   * The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
   */
  public open fun encryptionKey(`value`: String) {
    unwrap(this).setEncryptionKey(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The document that defines the resource policy that is set on a domain.
   */
  public open fun permissionsPolicyDocument(): Any? = unwrap(this).getPermissionsPolicyDocument()

  /**
   * The document that defines the resource policy that is set on a domain.
   */
  public open fun permissionsPolicyDocument(`value`: Any) {
    unwrap(this).setPermissionsPolicyDocument(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags to be applied to the domain.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags to be applied to the domain.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags to be applied to the domain.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codeartifact.CfnDomain].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A string that specifies the name of the requested domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-domainname)
     * @param domainName A string that specifies the name of the requested domain. 
     */
    public fun domainName(domainName: String)

    /**
     * The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-encryptionkey)
     * @param encryptionKey The ARN of an AWS Key Management Service (AWS KMS) key associated with a
     * domain. 
     */
    public fun encryptionKey(encryptionKey: String)

    /**
     * The document that defines the resource policy that is set on a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-permissionspolicydocument)
     * @param permissionsPolicyDocument The document that defines the resource policy that is set on
     * a domain. 
     */
    public fun permissionsPolicyDocument(permissionsPolicyDocument: Any)

    /**
     * A list of tags to be applied to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-tags)
     * @param tags A list of tags to be applied to the domain. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags to be applied to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-tags)
     * @param tags A list of tags to be applied to the domain. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codeartifact.CfnDomain.Builder =
        software.amazon.awscdk.services.codeartifact.CfnDomain.Builder.create(scope, id)

    /**
     * A string that specifies the name of the requested domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-domainname)
     * @param domainName A string that specifies the name of the requested domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-encryptionkey)
     * @param encryptionKey The ARN of an AWS Key Management Service (AWS KMS) key associated with a
     * domain. 
     */
    override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * The document that defines the resource policy that is set on a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-permissionspolicydocument)
     * @param permissionsPolicyDocument The document that defines the resource policy that is set on
     * a domain. 
     */
    override fun permissionsPolicyDocument(permissionsPolicyDocument: Any) {
      cdkBuilder.permissionsPolicyDocument(permissionsPolicyDocument)
    }

    /**
     * A list of tags to be applied to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-tags)
     * @param tags A list of tags to be applied to the domain. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tags to be applied to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-tags)
     * @param tags A list of tags to be applied to the domain. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codeartifact.CfnDomain = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codeartifact.CfnDomain): CfnDomain
        = CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain): software.amazon.awscdk.services.codeartifact.CfnDomain
        = wrapped.cdkObject
  }
}