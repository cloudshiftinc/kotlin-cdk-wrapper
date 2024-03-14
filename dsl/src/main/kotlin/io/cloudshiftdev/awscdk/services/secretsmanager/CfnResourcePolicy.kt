package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CfnResource
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

public open class CfnResourcePolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Specifies whether to block resource-based policies that allow broad access to the secret.
   */
  public open fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

  /**
   * Specifies whether to block resource-based policies that allow broad access to the secret.
   */
  public open fun blockPublicPolicy(`value`: Boolean) {
    unwrap(this).setBlockPublicPolicy(`value`)
  }

  /**
   * Specifies whether to block resource-based policies that allow broad access to the secret.
   */
  public open fun blockPublicPolicy(`value`: IResolvable) {
    unwrap(this).setBlockPublicPolicy(`value`.let(IResolvable::unwrap))
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
   * The ARN or name of the secret to attach the resource-based policy.
   */
  public open fun secretId(): String = unwrap(this).getSecretId()

  /**
   * The ARN or name of the secret to attach the resource-based policy.
   */
  public open fun secretId(`value`: String) {
    unwrap(this).setSecretId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.secretsmanager.CfnResourcePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether to block resource-based policies that allow broad access to the secret.
     *
     * By default, Secrets Manager blocks policies that allow broad access, for example those that
     * use a wildcard for the principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-blockpublicpolicy)
     * @param blockPublicPolicy Specifies whether to block resource-based policies that allow broad
     * access to the secret. 
     */
    public fun blockPublicPolicy(blockPublicPolicy: Boolean)

    /**
     * Specifies whether to block resource-based policies that allow broad access to the secret.
     *
     * By default, Secrets Manager blocks policies that allow broad access, for example those that
     * use a wildcard for the principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-blockpublicpolicy)
     * @param blockPublicPolicy Specifies whether to block resource-based policies that allow broad
     * access to the secret. 
     */
    public fun blockPublicPolicy(blockPublicPolicy: IResolvable)

    /**
     * A JSON-formatted string for an AWS resource-based policy.
     *
     * For example policies, see [Permissions policy
     * examples](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-resourcepolicy)
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
     */
    public fun resourcePolicy(resourcePolicy: Any)

    /**
     * The ARN or name of the secret to attach the resource-based policy.
     *
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-secretid)
     * @param secretId The ARN or name of the secret to attach the resource-based policy. 
     */
    public fun secretId(secretId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy.Builder
        = software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy.Builder.create(scope, id)

    /**
     * Specifies whether to block resource-based policies that allow broad access to the secret.
     *
     * By default, Secrets Manager blocks policies that allow broad access, for example those that
     * use a wildcard for the principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-blockpublicpolicy)
     * @param blockPublicPolicy Specifies whether to block resource-based policies that allow broad
     * access to the secret. 
     */
    override fun blockPublicPolicy(blockPublicPolicy: Boolean) {
      cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    /**
     * Specifies whether to block resource-based policies that allow broad access to the secret.
     *
     * By default, Secrets Manager blocks policies that allow broad access, for example those that
     * use a wildcard for the principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-blockpublicpolicy)
     * @param blockPublicPolicy Specifies whether to block resource-based policies that allow broad
     * access to the secret. 
     */
    override fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
      cdkBuilder.blockPublicPolicy(blockPublicPolicy.let(IResolvable::unwrap))
    }

    /**
     * A JSON-formatted string for an AWS resource-based policy.
     *
     * For example policies, see [Permissions policy
     * examples](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-resourcepolicy)
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
     */
    override fun resourcePolicy(resourcePolicy: Any) {
      cdkBuilder.resourcePolicy(resourcePolicy)
    }

    /**
     * The ARN or name of the secret to attach the resource-based policy.
     *
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-secretid)
     * @param secretId The ARN or name of the secret to attach the resource-based policy. 
     */
    override fun secretId(secretId: String) {
      cdkBuilder.secretId(secretId)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourcePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourcePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy):
        CfnResourcePolicy = CfnResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicy):
        software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy = wrapped.cdkObject
  }
}
