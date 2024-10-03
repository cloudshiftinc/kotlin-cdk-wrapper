@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchserverless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a lifecyle policy to be applied to OpenSearch Serverless indexes.
 *
 * Lifecycle policies define the number of days or hours to retain the data on an OpenSearch
 * Serverless index. For more information, see [Creating data lifecycle
 * policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-lifecycle.html#serverless-lifecycle-create)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
 * CfnLifecyclePolicy cfnLifecyclePolicy = CfnLifecyclePolicy.Builder.create(this,
 * "MyCfnLifecyclePolicy")
 * .name("name")
 * .policy("policy")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-lifecyclepolicy.html)
 */
public open class CfnLifecyclePolicy(
  cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnLifecyclePolicy,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLifecyclePolicyProps,
  ) :
      this(software.amazon.awscdk.services.opensearchserverless.CfnLifecyclePolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnLifecyclePolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLifecyclePolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLifecyclePolicyProps(props)
  )

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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opensearchserverless.CfnLifecyclePolicy.CFN_RESOURCE_TYPE_NAME

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
        as software.amazon.awscdk.services.opensearchserverless.CfnLifecyclePolicy
  }
}
