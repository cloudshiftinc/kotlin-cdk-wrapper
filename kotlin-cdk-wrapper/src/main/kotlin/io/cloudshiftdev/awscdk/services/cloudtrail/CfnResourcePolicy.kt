@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Attaches a resource-based permission policy to a CloudTrail channel that is used for an
 * integration with an event source outside of AWS .
 *
 * For more information about resource-based policies, see [CloudTrail resource-based policy
 * examples](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/security_iam_resource-based-policy-examples.html)
 * in the *CloudTrail User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
 * Object resourcePolicy;
 * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
 * "MyCfnResourcePolicy")
 * .resourceArn("resourceArn")
 * .resourcePolicy(resourcePolicy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html)
 */
public open class CfnResourcePolicy(
  cdkObject: software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourcePolicyProps,
  ) :
      this(software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnResourcePolicyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourcePolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResourcePolicyProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based policy.
   */
  public open fun resourceArn(): String = unwrap(this).getResourceArn()

  /**
   * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based policy.
   */
  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  /**
   * A JSON-formatted string for an AWS resource-based policy.
   */
  public open fun resourcePolicy(): Any = unwrap(this).getResourcePolicy()

  /**
   * A JSON-formatted string for an AWS resource-based policy.
   */
  public open fun resourcePolicy(`value`: Any) {
    unwrap(this).setResourcePolicy(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudtrail.CfnResourcePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based
     * policy.
     *
     * The following is the format of a resource ARN:
     * `arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) of the CloudTrail channel attached to the
     * resource-based policy. 
     */
    public fun resourceArn(resourceArn: String)

    /**
     * A JSON-formatted string for an AWS resource-based policy.
     *
     * The following are requirements for the resource policy:
     *
     * * Contains only one action: cloudtrail-data:PutAuditEvents
     * * Contains at least one statement. The policy can have a maximum of 20 statements.
     * * Each statement contains at least one principal. A statement can have a maximum of 50
     * principals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcepolicy)
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
     */
    public fun resourcePolicy(resourcePolicy: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based
     * policy.
     *
     * The following is the format of a resource ARN:
     * `arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) of the CloudTrail channel attached to the
     * resource-based policy. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * A JSON-formatted string for an AWS resource-based policy.
     *
     * The following are requirements for the resource policy:
     *
     * * Contains only one action: cloudtrail-data:PutAuditEvents
     * * Contains at least one statement. The policy can have a maximum of 20 statements.
     * * Each statement contains at least one principal. A statement can have a maximum of 50
     * principals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcepolicy)
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
     */
    override fun resourcePolicy(resourcePolicy: Any) {
      cdkBuilder.resourcePolicy(resourcePolicy)
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourcePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourcePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy):
        CfnResourcePolicy = CfnResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicy):
        software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy
  }
}
