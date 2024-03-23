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
 * Creates a data access policy for OpenSearch Serverless.
 *
 * Access policies limit access to collections and the resources within them, and allow a user to
 * access that data irrespective of the access mechanism or network source. For more information, see
 * [Data access control for Amazon OpenSearch
 * Serverless](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
 * CfnAccessPolicy cfnAccessPolicy = CfnAccessPolicy.Builder.create(this, "MyCfnAccessPolicy")
 * .name("name")
 * .policy("policy")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html)
 */
public open class CfnAccessPolicy(
  cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicy,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessPolicyProps,
  ) :
      this(software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnAccessPolicyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAccessPolicyProps(props)
  )

  /**
   * The description of the policy.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the policy.
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
   * The type of access policy.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of access policy.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.opensearchserverless.CfnAccessPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-description)
     * @param description The description of the policy. 
     */
    public fun description(description: String)

    /**
     * The name of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-name)
     * @param name The name of the policy. 
     */
    public fun name(name: String)

    /**
     * The JSON policy document without any whitespaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-policy)
     * @param policy The JSON policy document without any whitespaces. 
     */
    public fun policy(policy: String)

    /**
     * The type of access policy.
     *
     * Currently the only option is `data` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-type)
     * @param type The type of access policy. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicy.Builder =
        software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicy.Builder.create(scope,
        id)

    /**
     * The description of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-description)
     * @param description The description of the policy. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-name)
     * @param name The name of the policy. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The JSON policy document without any whitespaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-policy)
     * @param policy The JSON policy document without any whitespaces. 
     */
    override fun policy(policy: String) {
      cdkBuilder.policy(policy)
    }

    /**
     * The type of access policy.
     *
     * Currently the only option is `data` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-type)
     * @param type The type of access policy. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicy):
        CfnAccessPolicy = CfnAccessPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPolicy):
        software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicy
  }
}
