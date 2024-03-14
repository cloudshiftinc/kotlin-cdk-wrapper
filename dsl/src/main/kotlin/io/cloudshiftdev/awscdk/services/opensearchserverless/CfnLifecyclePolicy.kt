package io.cloudshiftdev.awscdk.services.opensearchserverless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLifecyclePolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnLifecyclePolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The description of the lifecycle policy.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the lifecycle policy.
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
   * The name of the lifecycle policy.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the lifecycle policy.
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
   * The type of lifecycle policy.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of lifecycle policy.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.opensearchserverless.CfnLifecyclePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-lifecyclepolicy.html#cfn-opensearchserverless-lifecyclepolicy-description)
     * @param description The description of the lifecycle policy. 
     */
    public fun description(description: String)

    /**
     * The name of the lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-lifecyclepolicy.html#cfn-opensearchserverless-lifecyclepolicy-name)
     * @param name The name of the lifecycle policy. 
     */
    public fun name(name: String)

    /**
     * The JSON policy document without any whitespaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-lifecyclepolicy.html#cfn-opensearchserverless-lifecyclepolicy-policy)
     * @param policy The JSON policy document without any whitespaces. 
     */
    public fun policy(policy: String)

    /**
     * The type of lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-lifecyclepolicy.html#cfn-opensearchserverless-lifecyclepolicy-type)
     * @param type The type of lifecycle policy. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchserverless.CfnLifecyclePolicy.Builder =
        software.amazon.awscdk.services.opensearchserverless.CfnLifecyclePolicy.Builder.create(scope,
        id)

    /**
     * The description of the lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-lifecyclepolicy.html#cfn-opensearchserverless-lifecyclepolicy-description)
     * @param description The description of the lifecycle policy. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-lifecyclepolicy.html#cfn-opensearchserverless-lifecyclepolicy-name)
     * @param name The name of the lifecycle policy. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The JSON policy document without any whitespaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-lifecyclepolicy.html#cfn-opensearchserverless-lifecyclepolicy-policy)
     * @param policy The JSON policy document without any whitespaces. 
     */
    override fun policy(policy: String) {
      cdkBuilder.policy(policy)
    }

    /**
     * The type of lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-lifecyclepolicy.html#cfn-opensearchserverless-lifecyclepolicy-type)
     * @param type The type of lifecycle policy. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opensearchserverless.CfnLifecyclePolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLifecyclePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLifecyclePolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnLifecyclePolicy):
        CfnLifecyclePolicy = CfnLifecyclePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnLifecyclePolicy):
        software.amazon.awscdk.services.opensearchserverless.CfnLifecyclePolicy = wrapped.cdkObject
  }
}
