@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDomainNameAccessAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnDomainNameAccessAssociationProps cfnDomainNameAccessAssociationProps =
 * CfnDomainNameAccessAssociationProps.builder()
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
public interface CfnDomainNameAccessAssociationProps {
  /**
   * The identifier of the domain name access association source.
   *
   * For a `VPCE` , the value is the VPC endpoint ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-accessassociationsource)
   */
  public fun accessAssociationSource(): String

  /**
   * The type of the domain name access association source.
   *
   * Only `VPCE` is currently supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-accessassociationsourcetype)
   */
  public fun accessAssociationSourceType(): String

  /**
   * The ARN of the domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-domainnamearn)
   */
  public fun domainNameArn(): String

  /**
   * The collection of tags.
   *
   * Each tag element is associated with a given resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDomainNameAccessAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessAssociationSource The identifier of the domain name access association source. 
     * For a `VPCE` , the value is the VPC endpoint ID.
     */
    public fun accessAssociationSource(accessAssociationSource: String)

    /**
     * @param accessAssociationSourceType The type of the domain name access association source. 
     * Only `VPCE` is currently supported.
     */
    public fun accessAssociationSourceType(accessAssociationSourceType: String)

    /**
     * @param domainNameArn The ARN of the domain name. 
     */
    public fun domainNameArn(domainNameArn: String)

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociationProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociationProps.builder()

    /**
     * @param accessAssociationSource The identifier of the domain name access association source. 
     * For a `VPCE` , the value is the VPC endpoint ID.
     */
    override fun accessAssociationSource(accessAssociationSource: String) {
      cdkBuilder.accessAssociationSource(accessAssociationSource)
    }

    /**
     * @param accessAssociationSourceType The type of the domain name access association source. 
     * Only `VPCE` is currently supported.
     */
    override fun accessAssociationSourceType(accessAssociationSourceType: String) {
      cdkBuilder.accessAssociationSourceType(accessAssociationSourceType)
    }

    /**
     * @param domainNameArn The ARN of the domain name. 
     */
    override fun domainNameArn(domainNameArn: String) {
      cdkBuilder.domainNameArn(domainNameArn)
    }

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociationProps,
  ) : CdkObject(cdkObject),
      CfnDomainNameAccessAssociationProps {
    /**
     * The identifier of the domain name access association source.
     *
     * For a `VPCE` , the value is the VPC endpoint ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-accessassociationsource)
     */
    override fun accessAssociationSource(): String = unwrap(this).getAccessAssociationSource()

    /**
     * The type of the domain name access association source.
     *
     * Only `VPCE` is currently supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-accessassociationsourcetype)
     */
    override fun accessAssociationSourceType(): String =
        unwrap(this).getAccessAssociationSourceType()

    /**
     * The ARN of the domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-domainnamearn)
     */
    override fun domainNameArn(): String = unwrap(this).getDomainNameArn()

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnameaccessassociation.html#cfn-apigateway-domainnameaccessassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnDomainNameAccessAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociationProps):
        CfnDomainNameAccessAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnDomainNameAccessAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainNameAccessAssociationProps):
        software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociationProps
  }
}
