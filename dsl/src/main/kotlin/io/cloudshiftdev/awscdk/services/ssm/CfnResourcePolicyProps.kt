package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnResourcePolicyProps {
  /**
   * A policy you want to associate with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html#cfn-ssm-resourcepolicy-policy)
   */
  public fun policy(): Any

  /**
   * The Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html#cfn-ssm-resourcepolicy-resourcearn)
   */
  public fun resourceArn(): String

  /**
   * A builder for [CfnResourcePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policy A policy you want to associate with a resource. 
     */
    public fun policy(policy: Any)

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the resource to which you want to attach
     * a policy. 
     */
    public fun resourceArn(resourceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnResourcePolicyProps.Builder =
        software.amazon.awscdk.services.ssm.CfnResourcePolicyProps.builder()

    /**
     * @param policy A policy you want to associate with a resource. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the resource to which you want to attach
     * a policy. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.CfnResourcePolicyProps,
  ) : CdkObject(cdkObject), CfnResourcePolicyProps {
    /**
     * A policy you want to associate with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html#cfn-ssm-resourcepolicy-policy)
     */
    override fun policy(): Any = unwrap(this).getPolicy()

    /**
     * The Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html#cfn-ssm-resourcepolicy-resourcearn)
     */
    override fun resourceArn(): String = unwrap(this).getResourceArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnResourcePolicyProps):
        CfnResourcePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicyProps):
        software.amazon.awscdk.services.ssm.CfnResourcePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssm.CfnResourcePolicyProps
  }
}
