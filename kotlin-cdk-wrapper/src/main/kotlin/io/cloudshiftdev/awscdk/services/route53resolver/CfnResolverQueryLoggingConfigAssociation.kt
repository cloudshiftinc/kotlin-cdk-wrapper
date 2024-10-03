@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::Route53Resolver::ResolverQueryLoggingConfigAssociation resource is a configuration for
 * DNS query logging.
 *
 * After you create a query logging configuration, Amazon Route 53 begins to publish log data to an
 * Amazon CloudWatch Logs log group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53resolver.*;
 * CfnResolverQueryLoggingConfigAssociation cfnResolverQueryLoggingConfigAssociation =
 * CfnResolverQueryLoggingConfigAssociation.Builder.create(this,
 * "MyCfnResolverQueryLoggingConfigAssociation")
 * .resolverQueryLogConfigId("resolverQueryLogConfigId")
 * .resourceId("resourceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfigassociation.html)
 */
public open class CfnResolverQueryLoggingConfigAssociation(
  cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResolverQueryLoggingConfigAssociationProps,
  ) :
      this(software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnResolverQueryLoggingConfigAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResolverQueryLoggingConfigAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResolverQueryLoggingConfigAssociationProps(props)
  )

  /**
   * The date and time that the VPC was associated with the query logging configuration, in Unix
   * time format and Coordinated Universal Time (UTC).
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * If the value of `Status` is `FAILED` , the value of `Error` indicates the cause:.
   *
   * * `DESTINATION_NOT_FOUND` : The specified destination (for example, an Amazon S3 bucket) was
   * deleted.
   * * `ACCESS_DENIED` : Permissions don't allow sending logs to the destination.
   *
   * If the value of `Status` is a value other than `FAILED` , `Error` is null.
   */
  public open fun attrError(): String = unwrap(this).getAttrError()

  /**
   * Contains additional information about the error.
   *
   * If the value or `Error` is null, the value of `ErrorMessage` is also null.
   */
  public open fun attrErrorMessage(): String = unwrap(this).getAttrErrorMessage()

  /**
   * The ID of the query logging association.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The status of the specified query logging association. Valid values include the following:.
   *
   * * `CREATING` : Resolver is creating an association between an Amazon Virtual Private Cloud
   * (Amazon VPC) and a query logging configuration.
   * * `CREATED` : The association between an Amazon VPC and a query logging configuration was
   * successfully created. Resolver is logging queries that originate in the specified VPC.
   * * `DELETING` : Resolver is deleting this query logging association.
   * * `FAILED` : Resolver either couldn't create or couldn't delete the query logging association.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ID of the query logging configuration that a VPC is associated with.
   */
  public open fun resolverQueryLogConfigId(): String? = unwrap(this).getResolverQueryLogConfigId()

  /**
   * The ID of the query logging configuration that a VPC is associated with.
   */
  public open fun resolverQueryLogConfigId(`value`: String) {
    unwrap(this).setResolverQueryLogConfigId(`value`)
  }

  /**
   * The ID of the Amazon VPC that is associated with the query logging configuration.
   */
  public open fun resourceId(): String? = unwrap(this).getResourceId()

  /**
   * The ID of the Amazon VPC that is associated with the query logging configuration.
   */
  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the query logging configuration that a VPC is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfigassociation.html#cfn-route53resolver-resolverqueryloggingconfigassociation-resolverquerylogconfigid)
     * @param resolverQueryLogConfigId The ID of the query logging configuration that a VPC is
     * associated with. 
     */
    public fun resolverQueryLogConfigId(resolverQueryLogConfigId: String)

    /**
     * The ID of the Amazon VPC that is associated with the query logging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfigassociation.html#cfn-route53resolver-resolverqueryloggingconfigassociation-resourceid)
     * @param resourceId The ID of the Amazon VPC that is associated with the query logging
     * configuration. 
     */
    public fun resourceId(resourceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation.Builder
        =
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation.Builder.create(scope,
        id)

    /**
     * The ID of the query logging configuration that a VPC is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfigassociation.html#cfn-route53resolver-resolverqueryloggingconfigassociation-resolverquerylogconfigid)
     * @param resolverQueryLogConfigId The ID of the query logging configuration that a VPC is
     * associated with. 
     */
    override fun resolverQueryLogConfigId(resolverQueryLogConfigId: String) {
      cdkBuilder.resolverQueryLogConfigId(resolverQueryLogConfigId)
    }

    /**
     * The ID of the Amazon VPC that is associated with the query logging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfigassociation.html#cfn-route53resolver-resolverqueryloggingconfigassociation-resourceid)
     * @param resourceId The ID of the Amazon VPC that is associated with the query logging
     * configuration. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    public fun build():
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResolverQueryLoggingConfigAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResolverQueryLoggingConfigAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation):
        CfnResolverQueryLoggingConfigAssociation =
        CfnResolverQueryLoggingConfigAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnResolverQueryLoggingConfigAssociation):
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation =
        wrapped.cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation
  }
}
