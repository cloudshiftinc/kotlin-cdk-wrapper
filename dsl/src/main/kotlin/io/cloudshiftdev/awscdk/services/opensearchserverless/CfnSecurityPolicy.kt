package io.cloudshiftdev.awscdk.services.opensearchserverless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecurityPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The description of the security policy.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the security policy.
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
   * The name of the policy.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the policy.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The JSON policy document without any whitespaces.
   */
  public open fun policy(): String = unwrap(this).getPolicy()

  /**
   * The JSON policy document without any whitespaces.
   */
  public open fun policy(`value`: String) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * The type of security policy.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of security policy.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.opensearchserverless.CfnSecurityPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the security policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-description)
     * @param description The description of the security policy. 
     */
    public fun description(description: String)

    /**
     * The name of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-name)
     * @param name The name of the policy. 
     */
    public fun name(name: String)

    /**
     * The JSON policy document without any whitespaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-policy)
     * @param policy The JSON policy document without any whitespaces. 
     */
    public fun policy(policy: String)

    /**
     * The type of security policy.
     *
     * Can be either `encryption` or `network` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-type)
     * @param type The type of security policy. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicy.Builder =
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicy.Builder.create(scope,
        id)

    /**
     * The description of the security policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-description)
     * @param description The description of the security policy. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-name)
     * @param name The name of the policy. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The JSON policy document without any whitespaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-policy)
     * @param policy The JSON policy document without any whitespaces. 
     */
    override fun policy(policy: String) {
      cdkBuilder.policy(policy)
    }

    /**
     * The type of security policy.
     *
     * Can be either `encryption` or `network` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-type)
     * @param type The type of security policy. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicy):
        CfnSecurityPolicy = CfnSecurityPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityPolicy):
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicy = wrapped.cdkObject
  }
}
