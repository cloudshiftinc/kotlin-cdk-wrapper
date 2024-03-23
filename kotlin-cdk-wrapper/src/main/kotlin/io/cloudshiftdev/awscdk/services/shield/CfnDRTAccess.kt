@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.shield

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Provides permissions for the AWS Shield Advanced Shield response team (SRT) to access your
 * account and your resource protections, to help you mitigate potential distributed denial of service
 * (DDoS) attacks.
 *
 * *Configure `AWS::Shield::DRTAccess` for one account*
 *
 * To configure this resource through AWS CloudFormation , you must be subscribed to AWS Shield
 * Advanced . You can subscribe through the [Shield Advanced
 * console](https://docs.aws.amazon.com/wafv2/shieldv2#/) and through the APIs. For more information,
 * see [Subscribe to AWS Shield
 * Advanced](https://docs.aws.amazon.com/waf/latest/developerguide/enable-ddos-prem.html) .
 *
 * See example templates for Shield Advanced in AWS CloudFormation at
 * [aws-samples/aws-shield-advanced-examples](https://docs.aws.amazon.com/https://github.com/aws-samples/aws-shield-advanced-examples)
 * .
 *
 * *Configure Shield Advanced using AWS CloudFormation and AWS Firewall Manager*
 *
 * You might be able to use Firewall Manager with AWS CloudFormation to configure Shield Advanced
 * across multiple accounts and protected resources. To do this, your accounts must be part of an
 * organization in AWS Organizations . You can use Firewall Manager to configure Shield Advanced
 * protections for any resource types except for Amazon Route 53 or AWS Global Accelerator .
 *
 * For an example of this, see the one-click configuration guidance published by the AWS technical
 * community at [One-click deployment of Shield
 * Advanced](https://docs.aws.amazon.com/https://youtu.be/LCA3FwMk_QE) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.shield.*;
 * CfnDRTAccess cfnDRTAccess = CfnDRTAccess.Builder.create(this, "MyCfnDRTAccess")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .logBucketList(List.of("logBucketList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-drtaccess.html)
 */
public open class CfnDRTAccess(
  cdkObject: software.amazon.awscdk.services.shield.CfnDRTAccess,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDRTAccessProps,
  ) :
      this(software.amazon.awscdk.services.shield.CfnDRTAccess(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDRTAccessProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDRTAccessProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDRTAccessProps(props)
  )

  /**
   * The ID of the account that submitted the template.
   */
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Authorizes the Shield Response Team (SRT) to access the specified Amazon S3 bucket containing
   * log data such as Application Load Balancer access logs, CloudFront logs, or logs from third party
   * sources.
   */
  public open fun logBucketList(): List<String> = unwrap(this).getLogBucketList() ?: emptyList()

  /**
   * Authorizes the Shield Response Team (SRT) to access the specified Amazon S3 bucket containing
   * log data such as Application Load Balancer access logs, CloudFront logs, or logs from third party
   * sources.
   */
  public open fun logBucketList(`value`: List<String>) {
    unwrap(this).setLogBucketList(`value`)
  }

  /**
   * Authorizes the Shield Response Team (SRT) to access the specified Amazon S3 bucket containing
   * log data such as Application Load Balancer access logs, CloudFront logs, or logs from third party
   * sources.
   */
  public open fun logBucketList(vararg `value`: String): Unit = logBucketList(`value`.toList())

  /**
   * Authorizes the Shield Response Team (SRT) using the specified role, to access your AWS account
   * to assist with DDoS attack mitigation during potential attacks.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * Authorizes the Shield Response Team (SRT) using the specified role, to access your AWS account
   * to assist with DDoS attack mitigation during potential attacks.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.shield.CfnDRTAccess].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Authorizes the Shield Response Team (SRT) to access the specified Amazon S3 bucket containing
     * log data such as Application Load Balancer access logs, CloudFront logs, or logs from third
     * party sources.
     *
     * You can associate up to 10 Amazon S3 buckets with your subscription.
     *
     * Use this to share information with the SRT that's not available in AWS WAF logs.
     *
     * To use the services of the SRT, you must be subscribed to the [Business Support
     * plan](https://docs.aws.amazon.com/premiumsupport/business-support/) or the [Enterprise Support
     * plan](https://docs.aws.amazon.com/premiumsupport/enterprise-support/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-drtaccess.html#cfn-shield-drtaccess-logbucketlist)
     * @param logBucketList Authorizes the Shield Response Team (SRT) to access the specified Amazon
     * S3 bucket containing log data such as Application Load Balancer access logs, CloudFront logs, or
     * logs from third party sources. 
     */
    public fun logBucketList(logBucketList: List<String>)

    /**
     * Authorizes the Shield Response Team (SRT) to access the specified Amazon S3 bucket containing
     * log data such as Application Load Balancer access logs, CloudFront logs, or logs from third
     * party sources.
     *
     * You can associate up to 10 Amazon S3 buckets with your subscription.
     *
     * Use this to share information with the SRT that's not available in AWS WAF logs.
     *
     * To use the services of the SRT, you must be subscribed to the [Business Support
     * plan](https://docs.aws.amazon.com/premiumsupport/business-support/) or the [Enterprise Support
     * plan](https://docs.aws.amazon.com/premiumsupport/enterprise-support/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-drtaccess.html#cfn-shield-drtaccess-logbucketlist)
     * @param logBucketList Authorizes the Shield Response Team (SRT) to access the specified Amazon
     * S3 bucket containing log data such as Application Load Balancer access logs, CloudFront logs, or
     * logs from third party sources. 
     */
    public fun logBucketList(vararg logBucketList: String)

    /**
     * Authorizes the Shield Response Team (SRT) using the specified role, to access your AWS
     * account to assist with DDoS attack mitigation during potential attacks.
     *
     * This enables the SRT to inspect your AWS WAF configuration and logs and to create or update
     * AWS WAF rules and web ACLs.
     *
     * You can associate only one `RoleArn` with your subscription. If you submit this update for an
     * account that already has an associated role, the new `RoleArn` will replace the existing
     * `RoleArn` .
     *
     * This change requires the following:
     *
     * * You must be subscribed to the [Business Support
     * plan](https://docs.aws.amazon.com/premiumsupport/business-support/) or the [Enterprise Support
     * plan](https://docs.aws.amazon.com/premiumsupport/enterprise-support/) .
     * * The `AWSShieldDRTAccessPolicy` managed policy must be attached to the role that you specify
     * in the request. You can access this policy in the IAM console at
     * [AWSShieldDRTAccessPolicy](https://docs.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy)
     * . For information, see [Adding and removing IAM identity
     * permissions](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html)
     * .
     * * The role must trust the service principal `drt.shield.amazonaws.com` . For information, see
     * [IAM JSON policy elements:
     * Principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html)
     * .
     *
     * The SRT will have access only to your AWS WAF and Shield resources. By submitting this
     * request, you provide permissions to the SRT to inspect your AWS WAF and Shield configuration and
     * logs, and to create and update AWS WAF rules and web ACLs on your behalf. The SRT takes these
     * actions only if explicitly authorized by you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-drtaccess.html#cfn-shield-drtaccess-rolearn)
     * @param roleArn Authorizes the Shield Response Team (SRT) using the specified role, to access
     * your AWS account to assist with DDoS attack mitigation during potential attacks. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.shield.CfnDRTAccess.Builder =
        software.amazon.awscdk.services.shield.CfnDRTAccess.Builder.create(scope, id)

    /**
     * Authorizes the Shield Response Team (SRT) to access the specified Amazon S3 bucket containing
     * log data such as Application Load Balancer access logs, CloudFront logs, or logs from third
     * party sources.
     *
     * You can associate up to 10 Amazon S3 buckets with your subscription.
     *
     * Use this to share information with the SRT that's not available in AWS WAF logs.
     *
     * To use the services of the SRT, you must be subscribed to the [Business Support
     * plan](https://docs.aws.amazon.com/premiumsupport/business-support/) or the [Enterprise Support
     * plan](https://docs.aws.amazon.com/premiumsupport/enterprise-support/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-drtaccess.html#cfn-shield-drtaccess-logbucketlist)
     * @param logBucketList Authorizes the Shield Response Team (SRT) to access the specified Amazon
     * S3 bucket containing log data such as Application Load Balancer access logs, CloudFront logs, or
     * logs from third party sources. 
     */
    override fun logBucketList(logBucketList: List<String>) {
      cdkBuilder.logBucketList(logBucketList)
    }

    /**
     * Authorizes the Shield Response Team (SRT) to access the specified Amazon S3 bucket containing
     * log data such as Application Load Balancer access logs, CloudFront logs, or logs from third
     * party sources.
     *
     * You can associate up to 10 Amazon S3 buckets with your subscription.
     *
     * Use this to share information with the SRT that's not available in AWS WAF logs.
     *
     * To use the services of the SRT, you must be subscribed to the [Business Support
     * plan](https://docs.aws.amazon.com/premiumsupport/business-support/) or the [Enterprise Support
     * plan](https://docs.aws.amazon.com/premiumsupport/enterprise-support/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-drtaccess.html#cfn-shield-drtaccess-logbucketlist)
     * @param logBucketList Authorizes the Shield Response Team (SRT) to access the specified Amazon
     * S3 bucket containing log data such as Application Load Balancer access logs, CloudFront logs, or
     * logs from third party sources. 
     */
    override fun logBucketList(vararg logBucketList: String): Unit =
        logBucketList(logBucketList.toList())

    /**
     * Authorizes the Shield Response Team (SRT) using the specified role, to access your AWS
     * account to assist with DDoS attack mitigation during potential attacks.
     *
     * This enables the SRT to inspect your AWS WAF configuration and logs and to create or update
     * AWS WAF rules and web ACLs.
     *
     * You can associate only one `RoleArn` with your subscription. If you submit this update for an
     * account that already has an associated role, the new `RoleArn` will replace the existing
     * `RoleArn` .
     *
     * This change requires the following:
     *
     * * You must be subscribed to the [Business Support
     * plan](https://docs.aws.amazon.com/premiumsupport/business-support/) or the [Enterprise Support
     * plan](https://docs.aws.amazon.com/premiumsupport/enterprise-support/) .
     * * The `AWSShieldDRTAccessPolicy` managed policy must be attached to the role that you specify
     * in the request. You can access this policy in the IAM console at
     * [AWSShieldDRTAccessPolicy](https://docs.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy)
     * . For information, see [Adding and removing IAM identity
     * permissions](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html)
     * .
     * * The role must trust the service principal `drt.shield.amazonaws.com` . For information, see
     * [IAM JSON policy elements:
     * Principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html)
     * .
     *
     * The SRT will have access only to your AWS WAF and Shield resources. By submitting this
     * request, you provide permissions to the SRT to inspect your AWS WAF and Shield configuration and
     * logs, and to create and update AWS WAF rules and web ACLs on your behalf. The SRT takes these
     * actions only if explicitly authorized by you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-drtaccess.html#cfn-shield-drtaccess-rolearn)
     * @param roleArn Authorizes the Shield Response Team (SRT) using the specified role, to access
     * your AWS account to assist with DDoS attack mitigation during potential attacks. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.shield.CfnDRTAccess = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.shield.CfnDRTAccess.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDRTAccess {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDRTAccess(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnDRTAccess): CfnDRTAccess
        = CfnDRTAccess(cdkObject)

    internal fun unwrap(wrapped: CfnDRTAccess): software.amazon.awscdk.services.shield.CfnDRTAccess
        = wrapped.cdkObject as software.amazon.awscdk.services.shield.CfnDRTAccess
  }
}
