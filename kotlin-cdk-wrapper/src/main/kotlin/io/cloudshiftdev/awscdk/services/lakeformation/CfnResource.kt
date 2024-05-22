@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::LakeFormation::Resource` represents the data (  buckets and folders) that is being
 * registered with AWS Lake Formation .
 *
 * During a stack operation, AWS CloudFormation calls the AWS Lake Formation
 * [`RegisterResource`](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-credential-vending.html#aws-lake-formation-api-credential-vending-RegisterResource)
 * API operation to register the resource. To remove a `Resource` type, AWS CloudFormation calls the
 * AWS Lake Formation
 * [`DeregisterResource`](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-credential-vending.html#aws-lake-formation-api-credential-vending-DeregisterResource)
 * API operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lakeformation.*;
 * CfnResource cfnResource = CfnResource.Builder.create(this, "MyCfnResource")
 * .resourceArn("resourceArn")
 * .useServiceLinkedRole(false)
 * // the properties below are optional
 * .hybridAccessEnabled(false)
 * .roleArn("roleArn")
 * .withFederation(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html)
 */
public open class CfnResource(
  cdkObject: software.amazon.awscdk.services.lakeformation.CfnResource,
) : io.cloudshiftdev.awscdk.CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceProps,
  ) :
      this(software.amazon.awscdk.services.lakeformation.CfnResource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnResourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResourceProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Indicates whether the data access of tables pointing to the location can be managed by both
   * Lake Formation permissions as well as Amazon S3 bucket policies.
   */
  public open fun hybridAccessEnabled(): Any? = unwrap(this).getHybridAccessEnabled()

  /**
   * Indicates whether the data access of tables pointing to the location can be managed by both
   * Lake Formation permissions as well as Amazon S3 bucket policies.
   */
  public open fun hybridAccessEnabled(`value`: Boolean) {
    unwrap(this).setHybridAccessEnabled(`value`)
  }

  /**
   * Indicates whether the data access of tables pointing to the location can be managed by both
   * Lake Formation permissions as well as Amazon S3 bucket policies.
   */
  public open fun hybridAccessEnabled(`value`: IResolvable) {
    unwrap(this).setHybridAccessEnabled(`value`.let(IResolvable.Companion::unwrap))
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
   * The Amazon Resource Name (ARN) of the resource.
   */
  public open fun resourceArn(): String = unwrap(this).getResourceArn()

  /**
   * The Amazon Resource Name (ARN) of the resource.
   */
  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  /**
   * The IAM role that registered a resource.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The IAM role that registered a resource.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog
   * .
   */
  public open fun useServiceLinkedRole(): Any = unwrap(this).getUseServiceLinkedRole()

  /**
   * Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog
   * .
   */
  public open fun useServiceLinkedRole(`value`: Boolean) {
    unwrap(this).setUseServiceLinkedRole(`value`)
  }

  /**
   * Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog
   * .
   */
  public open fun useServiceLinkedRole(`value`: IResolvable) {
    unwrap(this).setUseServiceLinkedRole(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Allows Lake Formation to assume a role to access tables in a federated database.
   */
  public open fun withFederation(): Any? = unwrap(this).getWithFederation()

  /**
   * Allows Lake Formation to assume a role to access tables in a federated database.
   */
  public open fun withFederation(`value`: Boolean) {
    unwrap(this).setWithFederation(`value`)
  }

  /**
   * Allows Lake Formation to assume a role to access tables in a federated database.
   */
  public open fun withFederation(`value`: IResolvable) {
    unwrap(this).setWithFederation(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lakeformation.CfnResource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether the data access of tables pointing to the location can be managed by both
     * Lake Formation permissions as well as Amazon S3 bucket policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-hybridaccessenabled)
     * @param hybridAccessEnabled Indicates whether the data access of tables pointing to the
     * location can be managed by both Lake Formation permissions as well as Amazon S3 bucket policies.
     * 
     */
    public fun hybridAccessEnabled(hybridAccessEnabled: Boolean)

    /**
     * Indicates whether the data access of tables pointing to the location can be managed by both
     * Lake Formation permissions as well as Amazon S3 bucket policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-hybridaccessenabled)
     * @param hybridAccessEnabled Indicates whether the data access of tables pointing to the
     * location can be managed by both Lake Formation permissions as well as Amazon S3 bucket policies.
     * 
     */
    public fun hybridAccessEnabled(hybridAccessEnabled: IResolvable)

    /**
     * The Amazon Resource Name (ARN) of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) of the resource. 
     */
    public fun resourceArn(resourceArn: String)

    /**
     * The IAM role that registered a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-rolearn)
     * @param roleArn The IAM role that registered a resource. 
     */
    public fun roleArn(roleArn: String)

    /**
     * Designates a trusted caller, an IAM principal, by registering this caller with the Data
     * Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-useservicelinkedrole)
     * @param useServiceLinkedRole Designates a trusted caller, an IAM principal, by registering
     * this caller with the Data Catalog . 
     */
    public fun useServiceLinkedRole(useServiceLinkedRole: Boolean)

    /**
     * Designates a trusted caller, an IAM principal, by registering this caller with the Data
     * Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-useservicelinkedrole)
     * @param useServiceLinkedRole Designates a trusted caller, an IAM principal, by registering
     * this caller with the Data Catalog . 
     */
    public fun useServiceLinkedRole(useServiceLinkedRole: IResolvable)

    /**
     * Allows Lake Formation to assume a role to access tables in a federated database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-withfederation)
     * @param withFederation Allows Lake Formation to assume a role to access tables in a federated
     * database. 
     */
    public fun withFederation(withFederation: Boolean)

    /**
     * Allows Lake Formation to assume a role to access tables in a federated database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-withfederation)
     * @param withFederation Allows Lake Formation to assume a role to access tables in a federated
     * database. 
     */
    public fun withFederation(withFederation: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lakeformation.CfnResource.Builder =
        software.amazon.awscdk.services.lakeformation.CfnResource.Builder.create(scope, id)

    /**
     * Indicates whether the data access of tables pointing to the location can be managed by both
     * Lake Formation permissions as well as Amazon S3 bucket policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-hybridaccessenabled)
     * @param hybridAccessEnabled Indicates whether the data access of tables pointing to the
     * location can be managed by both Lake Formation permissions as well as Amazon S3 bucket policies.
     * 
     */
    override fun hybridAccessEnabled(hybridAccessEnabled: Boolean) {
      cdkBuilder.hybridAccessEnabled(hybridAccessEnabled)
    }

    /**
     * Indicates whether the data access of tables pointing to the location can be managed by both
     * Lake Formation permissions as well as Amazon S3 bucket policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-hybridaccessenabled)
     * @param hybridAccessEnabled Indicates whether the data access of tables pointing to the
     * location can be managed by both Lake Formation permissions as well as Amazon S3 bucket policies.
     * 
     */
    override fun hybridAccessEnabled(hybridAccessEnabled: IResolvable) {
      cdkBuilder.hybridAccessEnabled(hybridAccessEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Amazon Resource Name (ARN) of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) of the resource. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * The IAM role that registered a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-rolearn)
     * @param roleArn The IAM role that registered a resource. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * Designates a trusted caller, an IAM principal, by registering this caller with the Data
     * Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-useservicelinkedrole)
     * @param useServiceLinkedRole Designates a trusted caller, an IAM principal, by registering
     * this caller with the Data Catalog . 
     */
    override fun useServiceLinkedRole(useServiceLinkedRole: Boolean) {
      cdkBuilder.useServiceLinkedRole(useServiceLinkedRole)
    }

    /**
     * Designates a trusted caller, an IAM principal, by registering this caller with the Data
     * Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-useservicelinkedrole)
     * @param useServiceLinkedRole Designates a trusted caller, an IAM principal, by registering
     * this caller with the Data Catalog . 
     */
    override fun useServiceLinkedRole(useServiceLinkedRole: IResolvable) {
      cdkBuilder.useServiceLinkedRole(useServiceLinkedRole.let(IResolvable.Companion::unwrap))
    }

    /**
     * Allows Lake Formation to assume a role to access tables in a federated database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-withfederation)
     * @param withFederation Allows Lake Formation to assume a role to access tables in a federated
     * database. 
     */
    override fun withFederation(withFederation: Boolean) {
      cdkBuilder.withFederation(withFederation)
    }

    /**
     * Allows Lake Formation to assume a role to access tables in a federated database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-withfederation)
     * @param withFederation Allows Lake Formation to assume a role to access tables in a federated
     * database. 
     */
    override fun withFederation(withFederation: IResolvable) {
      cdkBuilder.withFederation(withFederation.let(IResolvable.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnResource =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lakeformation.CfnResource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnResource):
        CfnResource = CfnResource(cdkObject)

    internal fun unwrap(wrapped: CfnResource):
        software.amazon.awscdk.services.lakeformation.CfnResource = wrapped.cdkObject as
        software.amazon.awscdk.services.lakeformation.CfnResource
  }
}
