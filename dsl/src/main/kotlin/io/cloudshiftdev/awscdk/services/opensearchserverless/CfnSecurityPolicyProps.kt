package io.cloudshiftdev.awscdk.services.opensearchserverless

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnSecurityPolicyProps {
  /**
   * The description of the security policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-name)
   */
  public fun name(): String

  /**
   * The JSON policy document without any whitespaces.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-policy)
   */
  public fun policy(): String

  /**
   * The type of security policy.
   *
   * Can be either `encryption` or `network` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnSecurityPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the security policy.
     */
    public fun description(description: String)

    /**
     * @param name The name of the policy. 
     */
    public fun name(name: String)

    /**
     * @param policy The JSON policy document without any whitespaces. 
     */
    public fun policy(policy: String)

    /**
     * @param type The type of security policy. 
     * Can be either `encryption` or `network` .
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicyProps.Builder =
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicyProps.builder()

    /**
     * @param description The description of the security policy.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the policy. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param policy The JSON policy document without any whitespaces. 
     */
    override fun policy(policy: String) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param type The type of security policy. 
     * Can be either `encryption` or `network` .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicyProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicyProps,
  ) : CdkObject(cdkObject), CfnSecurityPolicyProps {
    /**
     * The description of the security policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The JSON policy document without any whitespaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-policy)
     */
    override fun policy(): String = unwrap(this).getPolicy()

    /**
     * The type of security policy.
     *
     * Can be either `encryption` or `network` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicyProps):
        CfnSecurityPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityPolicyProps):
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicyProps
  }
}
