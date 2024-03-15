@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnServiceLinkedRole`.
 *
 * Example:
 *
 * ```
 * CfnServiceLinkedRole slr = CfnServiceLinkedRole.Builder.create(this, "ElasticSLR")
 * .awsServiceName("es.amazonaws.com")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html)
 */
public interface CfnServiceLinkedRoleProps {
  /**
   * The service principal for the AWS service to which this role is attached.
   *
   * You use a string similar to a URL but without the http:// in front. For example:
   * `elasticbeanstalk.amazonaws.com` .
   *
   * Service principals are unique and case-sensitive. To find the exact service principal for your
   * service-linked role, see [AWS services that work with
   * IAM](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html)
   * in the *IAM User Guide* . Look for the services that have *Yes* in the *Service-Linked Role*
   * column. Choose the *Yes* link to view the service-linked role documentation for that service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-awsservicename)
   */
  public fun awsServiceName(): String? = unwrap(this).getAwsServiceName()

  /**
   * A string that you provide, which is combined with the service-provided prefix to form the
   * complete role name.
   *
   * If you make multiple requests for the same service, then you must supply a different
   * `CustomSuffix` for each request. Otherwise the request fails with a duplicate role name error. For
   * example, you could add `-1` or `-debug` to the suffix.
   *
   * Some services do not support the `CustomSuffix` parameter. If you provide an optional suffix
   * and the operation fails, try the operation again without the suffix.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-customsuffix)
   */
  public fun customSuffix(): String? = unwrap(this).getCustomSuffix()

  /**
   * The description of the role.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A builder for [CfnServiceLinkedRoleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param awsServiceName The service principal for the AWS service to which this role is
     * attached.
     * You use a string similar to a URL but without the http:// in front. For example:
     * `elasticbeanstalk.amazonaws.com` .
     *
     * Service principals are unique and case-sensitive. To find the exact service principal for
     * your service-linked role, see [AWS services that work with
     * IAM](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html)
     * in the *IAM User Guide* . Look for the services that have *Yes* in the *Service-Linked Role*
     * column. Choose the *Yes* link to view the service-linked role documentation for that service.
     */
    public fun awsServiceName(awsServiceName: String)

    /**
     * @param customSuffix A string that you provide, which is combined with the service-provided
     * prefix to form the complete role name.
     * If you make multiple requests for the same service, then you must supply a different
     * `CustomSuffix` for each request. Otherwise the request fails with a duplicate role name error.
     * For example, you could add `-1` or `-debug` to the suffix.
     *
     * Some services do not support the `CustomSuffix` parameter. If you provide an optional suffix
     * and the operation fails, try the operation again without the suffix.
     */
    public fun customSuffix(customSuffix: String)

    /**
     * @param description The description of the role.
     */
    public fun description(description: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps.Builder =
        software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps.builder()

    /**
     * @param awsServiceName The service principal for the AWS service to which this role is
     * attached.
     * You use a string similar to a URL but without the http:// in front. For example:
     * `elasticbeanstalk.amazonaws.com` .
     *
     * Service principals are unique and case-sensitive. To find the exact service principal for
     * your service-linked role, see [AWS services that work with
     * IAM](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html)
     * in the *IAM User Guide* . Look for the services that have *Yes* in the *Service-Linked Role*
     * column. Choose the *Yes* link to view the service-linked role documentation for that service.
     */
    override fun awsServiceName(awsServiceName: String) {
      cdkBuilder.awsServiceName(awsServiceName)
    }

    /**
     * @param customSuffix A string that you provide, which is combined with the service-provided
     * prefix to form the complete role name.
     * If you make multiple requests for the same service, then you must supply a different
     * `CustomSuffix` for each request. Otherwise the request fails with a duplicate role name error.
     * For example, you could add `-1` or `-debug` to the suffix.
     *
     * Some services do not support the `CustomSuffix` parameter. If you provide an optional suffix
     * and the operation fails, try the operation again without the suffix.
     */
    override fun customSuffix(customSuffix: String) {
      cdkBuilder.customSuffix(customSuffix)
    }

    /**
     * @param description The description of the role.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps,
  ) : CdkObject(cdkObject), CfnServiceLinkedRoleProps {
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
     */
    override fun awsServiceName(): String? = unwrap(this).getAwsServiceName()

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
     */
    override fun customSuffix(): String? = unwrap(this).getCustomSuffix()

    /**
     * The description of the role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-description)
     */
    override fun description(): String? = unwrap(this).getDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceLinkedRoleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps):
        CfnServiceLinkedRoleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceLinkedRoleProps):
        software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps
  }
}
