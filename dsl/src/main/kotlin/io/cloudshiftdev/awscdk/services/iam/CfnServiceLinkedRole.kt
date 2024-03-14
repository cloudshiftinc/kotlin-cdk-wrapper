package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnServiceLinkedRole internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.CfnServiceLinkedRole,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Returns the friendly name that identifies the role.
   *
   * For example, `AWSServiceRoleForAutoScaling` or `AWSServiceRoleForAutoScaling_TestSuffix` if a
   * `CustomSuffix` is specified.
   */
  public open fun attrRoleName(): String = unwrap(this).getAttrRoleName()

  /**
   * The service principal for the AWS service to which this role is attached.
   */
  public open fun awsServiceName(): String? = unwrap(this).getAwsServiceName()

  /**
   * The service principal for the AWS service to which this role is attached.
   */
  public open fun awsServiceName(`value`: String) {
    unwrap(this).setAwsServiceName(`value`)
  }

  /**
   * A string that you provide, which is combined with the service-provided prefix to form the
   * complete role name.
   */
  public open fun customSuffix(): String? = unwrap(this).getCustomSuffix()

  /**
   * A string that you provide, which is combined with the service-provided prefix to form the
   * complete role name.
   */
  public open fun customSuffix(`value`: String) {
    unwrap(this).setCustomSuffix(`value`)
  }

  /**
   * The description of the role.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the role.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.CfnServiceLinkedRole].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The service principal for the AWS service to which this role is attached.
     *
     * You use a string similar to a URL but without the http:// in front. For example:
     * `elasticbeanstalk.amazonaws.com` .
     *
     * Service principals are unique and case-sensitive. To find the exact service principal for
     * your service-linked role, see [AWS services that work with
     * IAM](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html)
     * in the *IAM User Guide* . Look for the services that have *Yes* in the *Service-Linked Role*
     * column. Choose the *Yes* link to view the service-linked role documentation for that service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-awsservicename)
     * @param awsServiceName The service principal for the AWS service to which this role is
     * attached. 
     */
    public fun awsServiceName(awsServiceName: String)

    /**
     * A string that you provide, which is combined with the service-provided prefix to form the
     * complete role name.
     *
     * If you make multiple requests for the same service, then you must supply a different
     * `CustomSuffix` for each request. Otherwise the request fails with a duplicate role name error.
     * For example, you could add `-1` or `-debug` to the suffix.
     *
     * Some services do not support the `CustomSuffix` parameter. If you provide an optional suffix
     * and the operation fails, try the operation again without the suffix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-customsuffix)
     * @param customSuffix A string that you provide, which is combined with the service-provided
     * prefix to form the complete role name. 
     */
    public fun customSuffix(customSuffix: String)

    /**
     * The description of the role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-description)
     * @param description The description of the role. 
     */
    public fun description(description: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnServiceLinkedRole.Builder =
        software.amazon.awscdk.services.iam.CfnServiceLinkedRole.Builder.create(scope, id)

    /**
     * The service principal for the AWS service to which this role is attached.
     *
     * You use a string similar to a URL but without the http:// in front. For example:
     * `elasticbeanstalk.amazonaws.com` .
     *
     * Service principals are unique and case-sensitive. To find the exact service principal for
     * your service-linked role, see [AWS services that work with
     * IAM](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html)
     * in the *IAM User Guide* . Look for the services that have *Yes* in the *Service-Linked Role*
     * column. Choose the *Yes* link to view the service-linked role documentation for that service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-awsservicename)
     * @param awsServiceName The service principal for the AWS service to which this role is
     * attached. 
     */
    override fun awsServiceName(awsServiceName: String) {
      cdkBuilder.awsServiceName(awsServiceName)
    }

    /**
     * A string that you provide, which is combined with the service-provided prefix to form the
     * complete role name.
     *
     * If you make multiple requests for the same service, then you must supply a different
     * `CustomSuffix` for each request. Otherwise the request fails with a duplicate role name error.
     * For example, you could add `-1` or `-debug` to the suffix.
     *
     * Some services do not support the `CustomSuffix` parameter. If you provide an optional suffix
     * and the operation fails, try the operation again without the suffix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-customsuffix)
     * @param customSuffix A string that you provide, which is combined with the service-provided
     * prefix to form the complete role name. 
     */
    override fun customSuffix(customSuffix: String) {
      cdkBuilder.customSuffix(customSuffix)
    }

    /**
     * The description of the role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-description)
     * @param description The description of the role. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnServiceLinkedRole =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iam.CfnServiceLinkedRole.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceLinkedRole {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceLinkedRole(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnServiceLinkedRole):
        CfnServiceLinkedRole = CfnServiceLinkedRole(cdkObject)

    internal fun unwrap(wrapped: CfnServiceLinkedRole):
        software.amazon.awscdk.services.iam.CfnServiceLinkedRole = wrapped.cdkObject
  }
}
