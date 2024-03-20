@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AppSync::DomainNameApiAssociation` resource represents the mapping of your custom
 * domain name to the assigned API URL.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * CfnDomainNameApiAssociation cfnDomainNameApiAssociation =
 * CfnDomainNameApiAssociation.Builder.create(this, "MyCfnDomainNameApiAssociation")
 * .apiId("apiId")
 * .domainName("domainName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html)
 */
public open class CfnDomainNameApiAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainNameApiAssociationProps,
  ) :
      this(software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDomainNameApiAssociationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainNameApiAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDomainNameApiAssociationProps(props)
  )

  /**
   * The API ID.
   */
  public open fun apiId(): String = unwrap(this).getApiId()

  /**
   * The API ID.
   */
  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  /**
   *
   */
  public open fun attrApiAssociationIdentifier(): String =
      unwrap(this).getAttrApiAssociationIdentifier()

  /**
   * The domain name.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The domain name.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.CfnDomainNameApiAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html#cfn-appsync-domainnameapiassociation-apiid)
     * @param apiId The API ID. 
     */
    public fun apiId(apiId: String)

    /**
     * The domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html#cfn-appsync-domainnameapiassociation-domainname)
     * @param domainName The domain name. 
     */
    public fun domainName(domainName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation.Builder =
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation.Builder.create(scope,
        id)

    /**
     * The API ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html#cfn-appsync-domainnameapiassociation-apiid)
     * @param apiId The API ID. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * The domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html#cfn-appsync-domainnameapiassociation-domainname)
     * @param domainName The domain name. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomainNameApiAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomainNameApiAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation):
        CfnDomainNameApiAssociation = CfnDomainNameApiAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnDomainNameApiAssociation):
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation = wrapped.cdkObject
  }
}
