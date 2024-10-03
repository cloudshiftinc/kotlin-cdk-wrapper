@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnDomainNameApiAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * CfnDomainNameApiAssociationProps cfnDomainNameApiAssociationProps =
 * CfnDomainNameApiAssociationProps.builder()
 * .apiId("apiId")
 * .domainName("domainName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html)
 */
public interface CfnDomainNameApiAssociationProps {
  /**
   * The API ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html#cfn-appsync-domainnameapiassociation-apiid)
   */
  public fun apiId(): String

  /**
   * The domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html#cfn-appsync-domainnameapiassociation-domainname)
   */
  public fun domainName(): String

  /**
   * A builder for [CfnDomainNameApiAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId The API ID. 
     */
    public fun apiId(apiId: String)

    /**
     * @param domainName The domain name. 
     */
    public fun domainName(domainName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps.Builder =
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps.builder()

    /**
     * @param apiId The API ID. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param domainName The domain name. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps,
  ) : CdkObject(cdkObject),
      CfnDomainNameApiAssociationProps {
    /**
     * The API ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html#cfn-appsync-domainnameapiassociation-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * The domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html#cfn-appsync-domainnameapiassociation-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainNameApiAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps):
        CfnDomainNameApiAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnDomainNameApiAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainNameApiAssociationProps):
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps
  }
}
