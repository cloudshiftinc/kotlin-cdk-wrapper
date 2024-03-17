@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codeartifact

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codeartifact.*;
 * Object permissionsPolicyDocument;
 * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
 * .domainName("domainName")
 * // the properties below are optional
 * .encryptionKey("encryptionKey")
 * .permissionsPolicyDocument(permissionsPolicyDocument)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html)
 */
public interface CfnDomainProps {
  /**
   * A string that specifies the name of the requested domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-domainname)
   */
  public fun domainName(): String

  /**
   * The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-encryptionkey)
   */
  public fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  /**
   * The document that defines the resource policy that is set on a domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-permissionspolicydocument)
   */
  public fun permissionsPolicyDocument(): Any? = unwrap(this).getPermissionsPolicyDocument()

  /**
   * A list of tags to be applied to the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDomainProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainName A string that specifies the name of the requested domain. 
     */
    public fun domainName(domainName: String)

    /**
     * @param encryptionKey The ARN of an AWS Key Management Service (AWS KMS) key associated with a
     * domain.
     */
    public fun encryptionKey(encryptionKey: String)

    /**
     * @param permissionsPolicyDocument The document that defines the resource policy that is set on
     * a domain.
     */
    public fun permissionsPolicyDocument(permissionsPolicyDocument: Any)

    /**
     * @param tags A list of tags to be applied to the domain.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags to be applied to the domain.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codeartifact.CfnDomainProps.Builder =
        software.amazon.awscdk.services.codeartifact.CfnDomainProps.builder()

    /**
     * @param domainName A string that specifies the name of the requested domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param encryptionKey The ARN of an AWS Key Management Service (AWS KMS) key associated with a
     * domain.
     */
    override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * @param permissionsPolicyDocument The document that defines the resource policy that is set on
     * a domain.
     */
    override fun permissionsPolicyDocument(permissionsPolicyDocument: Any) {
      cdkBuilder.permissionsPolicyDocument(permissionsPolicyDocument)
    }

    /**
     * @param tags A list of tags to be applied to the domain.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags to be applied to the domain.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codeartifact.CfnDomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codeartifact.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
    /**
     * A string that specifies the name of the requested domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-encryptionkey)
     */
    override fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

    /**
     * The document that defines the resource policy that is set on a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-permissionspolicydocument)
     */
    override fun permissionsPolicyDocument(): Any? = unwrap(this).getPermissionsPolicyDocument()

    /**
     * A list of tags to be applied to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html#cfn-codeartifact-domain-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codeartifact.CfnDomainProps):
        CfnDomainProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDomainProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainProps):
        software.amazon.awscdk.services.codeartifact.CfnDomainProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codeartifact.CfnDomainProps
  }
}
