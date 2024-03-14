package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnResourcePolicyProps {
  /**
   * Specifies whether to block resource-based policies that allow broad access to the secret.
   *
   * By default, Secrets Manager blocks policies that allow broad access, for example those that use
   * a wildcard for the principal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-blockpublicpolicy)
   */
  public fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

  /**
   * A JSON-formatted string for an AWS resource-based policy.
   *
   * For example policies, see [Permissions policy
   * examples](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-resourcepolicy)
   */
  public fun resourcePolicy(): Any

  /**
   * The ARN or name of the secret to attach the resource-based policy.
   *
   * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-secretid)
   */
  public fun secretId(): String

  /**
   * A builder for [CfnResourcePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param blockPublicPolicy Specifies whether to block resource-based policies that allow broad
     * access to the secret.
     * By default, Secrets Manager blocks policies that allow broad access, for example those that
     * use a wildcard for the principal.
     */
    public fun blockPublicPolicy(blockPublicPolicy: Boolean)

    /**
     * @param blockPublicPolicy Specifies whether to block resource-based policies that allow broad
     * access to the secret.
     * By default, Secrets Manager blocks policies that allow broad access, for example those that
     * use a wildcard for the principal.
     */
    public fun blockPublicPolicy(blockPublicPolicy: IResolvable)

    /**
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
     * For example policies, see [Permissions policy
     * examples](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html)
     * .
     */
    public fun resourcePolicy(resourcePolicy: Any)

    /**
     * @param secretId The ARN or name of the secret to attach the resource-based policy. 
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN.
     */
    public fun secretId(secretId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps.Builder =
        software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps.builder()

    /**
     * @param blockPublicPolicy Specifies whether to block resource-based policies that allow broad
     * access to the secret.
     * By default, Secrets Manager blocks policies that allow broad access, for example those that
     * use a wildcard for the principal.
     */
    override fun blockPublicPolicy(blockPublicPolicy: Boolean) {
      cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    /**
     * @param blockPublicPolicy Specifies whether to block resource-based policies that allow broad
     * access to the secret.
     * By default, Secrets Manager blocks policies that allow broad access, for example those that
     * use a wildcard for the principal.
     */
    override fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
      cdkBuilder.blockPublicPolicy(blockPublicPolicy.let(IResolvable::unwrap))
    }

    /**
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
     * For example policies, see [Permissions policy
     * examples](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html)
     * .
     */
    override fun resourcePolicy(resourcePolicy: Any) {
      cdkBuilder.resourcePolicy(resourcePolicy)
    }

    /**
     * @param secretId The ARN or name of the secret to attach the resource-based policy. 
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN.
     */
    override fun secretId(secretId: String) {
      cdkBuilder.secretId(secretId)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps,
  ) : CdkObject(cdkObject), CfnResourcePolicyProps {
    /**
     * Specifies whether to block resource-based policies that allow broad access to the secret.
     *
     * By default, Secrets Manager blocks policies that allow broad access, for example those that
     * use a wildcard for the principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-blockpublicpolicy)
     */
    override fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

    /**
     * A JSON-formatted string for an AWS resource-based policy.
     *
     * For example policies, see [Permissions policy
     * examples](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-resourcepolicy)
     */
    override fun resourcePolicy(): Any = unwrap(this).getResourcePolicy()

    /**
     * The ARN or name of the secret to attach the resource-based policy.
     *
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-secretid)
     */
    override fun secretId(): String = unwrap(this).getSecretId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps):
        CfnResourcePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicyProps):
        software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps
  }
}
