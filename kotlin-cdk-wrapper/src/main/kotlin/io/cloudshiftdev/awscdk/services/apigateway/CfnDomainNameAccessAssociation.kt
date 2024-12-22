@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

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
 * The `AWS::ApiGateway::DomainNameAccessAssociation` resource creates a domain name access
 * association between an access association source and a private custom domain name.
 *
 * Use a domain name access association to invoke a private custom domain name while isolated from
 * the public internet.
 *
 * You can only create or delete a DomainNameAccessAssociation using CloudFormation. To reject a
 * domain name access association, use the AWS CLI.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnDomainNameAccessAssociation cfnDomainNameAccessAssociation =
 * CfnDomainNameAccessAssociation.Builder.create(this, "MyCfnDomainNameAccessAssociation")
 * .accessAssociationSource("accessAssociationSource")
 * .accessAssociationSourceType("accessAssociationSourceType")
 * .domainNameArn("domainNameArn")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html)
 */
public open class CfnDomainNameAccessAssociation(
  cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociation,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainNameAccessAssociationProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDomainNameAccessAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainNameAccessAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDomainNameAccessAssociationProps(props)
  )

  /**
   * The identifier of the domain name access association source.
   */
  public open fun accessAssociationSource(): String = unwrap(this).getAccessAssociationSource()

  /**
   * The identifier of the domain name access association source.
   */
  public open fun accessAssociationSource(`value`: String) {
    unwrap(this).setAccessAssociationSource(`value`)
  }

  /**
   * The type of the domain name access association source.
   */
  public open fun accessAssociationSourceType(): String =
      unwrap(this).getAccessAssociationSourceType()

  /**
   * The type of the domain name access association source.
   */
  public open fun accessAssociationSourceType(`value`: String) {
    unwrap(this).setAccessAssociationSourceType(`value`)
  }

  /**
   * The access association ARN.
   *
   * For example:
   * `arn:aws:apigateway:us-west-2:111122223333:/accessassociations/domainname/private.example.com+abcd1234/vpcesource/vpce-abcd1234efg`
   * .
   */
  public open fun attrDomainNameAccessAssociationArn(): String =
      unwrap(this).getAttrDomainNameAccessAssociationArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The ARN of the domain name.
   */
  public open fun domainNameArn(): String = unwrap(this).getDomainNameArn()

  /**
   * The ARN of the domain name.
   */
  public open fun domainNameArn(`value`: String) {
    unwrap(this).setDomainNameArn(`value`)
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
   * The collection of tags.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The collection of tags.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The collection of tags.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.apigateway.CfnDomainNameAccessAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the domain name access association source.
     *
     * For a `VPCE` , the value is the VPC endpoint ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-accessassociationsource)
     * @param accessAssociationSource The identifier of the domain name access association source. 
     */
    public fun accessAssociationSource(accessAssociationSource: String)

    /**
     * The type of the domain name access association source.
     *
     * Only `VPCE` is currently supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-accessassociationsourcetype)
     * @param accessAssociationSourceType The type of the domain name access association source. 
     */
    public fun accessAssociationSourceType(accessAssociationSourceType: String)

    /**
     * The ARN of the domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-domainnamearn)
     * @param domainNameArn The ARN of the domain name. 
     */
    public fun domainNameArn(domainNameArn: String)

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-tags)
     * @param tags The collection of tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-tags)
     * @param tags The collection of tags. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociation.Builder =
        software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociation.Builder.create(scope,
        id)

    /**
     * The identifier of the domain name access association source.
     *
     * For a `VPCE` , the value is the VPC endpoint ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-accessassociationsource)
     * @param accessAssociationSource The identifier of the domain name access association source. 
     */
    override fun accessAssociationSource(accessAssociationSource: String) {
      cdkBuilder.accessAssociationSource(accessAssociationSource)
    }

    /**
     * The type of the domain name access association source.
     *
     * Only `VPCE` is currently supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-accessassociationsourcetype)
     * @param accessAssociationSourceType The type of the domain name access association source. 
     */
    override fun accessAssociationSourceType(accessAssociationSourceType: String) {
      cdkBuilder.accessAssociationSourceType(accessAssociationSourceType)
    }

    /**
     * The ARN of the domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-domainnamearn)
     * @param domainNameArn The ARN of the domain name. 
     */
    override fun domainNameArn(domainNameArn: String) {
      cdkBuilder.domainNameArn(domainNameArn)
    }

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-tags)
     * @param tags The collection of tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-tags)
     * @param tags The collection of tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomainNameAccessAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomainNameAccessAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociation):
        CfnDomainNameAccessAssociation = CfnDomainNameAccessAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnDomainNameAccessAssociation):
        software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociation =
        wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociation
  }
}
