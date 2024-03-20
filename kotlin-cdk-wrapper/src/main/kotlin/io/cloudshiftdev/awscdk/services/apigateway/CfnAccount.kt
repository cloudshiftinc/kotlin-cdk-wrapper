@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGateway::Account` resource specifies the IAM role that Amazon API Gateway uses to
 * write API logs to Amazon CloudWatch Logs.
 *
 * To avoid overwriting other roles, you should only have one `AWS::ApiGateway::Account` resource
 * per region per account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnAccount cfnAccount = CfnAccount.Builder.create(this, "MyCfnAccount")
 * .cloudWatchRoleArn("cloudWatchRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html)
 */
public open class CfnAccount internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.CfnAccount,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.apigateway.CfnAccount(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccountProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.CfnAccount(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnAccountProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccountProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAccountProps(props)
  )

  /**
   * The ID for the account.
   *
   * For example: `abc123` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ARN of an Amazon CloudWatch role for the current Account.
   */
  public open fun cloudWatchRoleArn(): String? = unwrap(this).getCloudWatchRoleArn()

  /**
   * The ARN of an Amazon CloudWatch role for the current Account.
   */
  public open fun cloudWatchRoleArn(`value`: String) {
    unwrap(this).setCloudWatchRoleArn(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnAccount].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of an Amazon CloudWatch role for the current Account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html#cfn-apigateway-account-cloudwatchrolearn)
     * @param cloudWatchRoleArn The ARN of an Amazon CloudWatch role for the current Account. 
     */
    public fun cloudWatchRoleArn(cloudWatchRoleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnAccount.Builder =
        software.amazon.awscdk.services.apigateway.CfnAccount.Builder.create(scope, id)

    /**
     * The ARN of an Amazon CloudWatch role for the current Account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html#cfn-apigateway-account-cloudwatchrolearn)
     * @param cloudWatchRoleArn The ARN of an Amazon CloudWatch role for the current Account. 
     */
    override fun cloudWatchRoleArn(cloudWatchRoleArn: String) {
      cdkBuilder.cloudWatchRoleArn(cloudWatchRoleArn)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnAccount = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnAccount.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccount {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccount(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnAccount): CfnAccount
        = CfnAccount(cdkObject)

    internal fun unwrap(wrapped: CfnAccount): software.amazon.awscdk.services.apigateway.CfnAccount
        = wrapped.cdkObject
  }
}
