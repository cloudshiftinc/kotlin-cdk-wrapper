package io.cloudshiftdev.awscdk.services.opensearchserverless

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnAccessPolicyProps {
  /**
   * The description of the policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-name)
   */
  public fun name(): String

  /**
   * The JSON policy document without any whitespaces.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-policy)
   */
  public fun policy(): String

  /**
   * The type of access policy.
   *
   * Currently the only option is `data` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnAccessPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the policy.
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
     * @param type The type of access policy. 
     * Currently the only option is `data` .
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicyProps.Builder =
        software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicyProps.builder()

    /**
     * @param description The description of the policy.
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
     * @param type The type of access policy. 
     * Currently the only option is `data` .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicyProps,
  ) : CdkObject(cdkObject), CfnAccessPolicyProps {
    /**
     * The description of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The JSON policy document without any whitespaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-policy)
     */
    override fun policy(): String = unwrap(this).getPolicy()

    /**
     * The type of access policy.
     *
     * Currently the only option is `data` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicyProps):
        CfnAccessPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPolicyProps):
        software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicyProps
  }
}
