@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates or updates a resource policy that allows other AWS services to put log events to this
 * account.
 *
 * An account can have up to 10 resource policies per AWS Region.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
 * "MyCfnResourcePolicy")
 * .policyDocument("policyDocument")
 * .policyName("policyName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html)
 */
public open class CfnResourcePolicy(
  cdkObject: software.amazon.awscdk.services.logs.CfnResourcePolicy,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourcePolicyProps,
  ) :
      this(software.amazon.awscdk.services.logs.CfnResourcePolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnResourcePolicyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourcePolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResourcePolicyProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The details of the policy.
   */
  public open fun policyDocument(): String = unwrap(this).getPolicyDocument()

  /**
   * The details of the policy.
   */
  public open fun policyDocument(`value`: String) {
    unwrap(this).setPolicyDocument(`value`)
  }

  /**
   * The name of the resource policy.
   */
  public open fun policyName(): String = unwrap(this).getPolicyName()

  /**
   * The name of the resource policy.
   */
  public open fun policyName(`value`: String) {
    unwrap(this).setPolicyName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CfnResourcePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The details of the policy.
     *
     * It must be formatted in JSON, and you must use backslashes to escape characters that need to
     * be escaped in JSON strings, such as double quote marks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html#cfn-logs-resourcepolicy-policydocument)
     * @param policyDocument The details of the policy. 
     */
    public fun policyDocument(policyDocument: String)

    /**
     * The name of the resource policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html#cfn-logs-resourcepolicy-policyname)
     * @param policyName The name of the resource policy. 
     */
    public fun policyName(policyName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnResourcePolicy.Builder =
        software.amazon.awscdk.services.logs.CfnResourcePolicy.Builder.create(scope, id)

    /**
     * The details of the policy.
     *
     * It must be formatted in JSON, and you must use backslashes to escape characters that need to
     * be escaped in JSON strings, such as double quote marks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html#cfn-logs-resourcepolicy-policydocument)
     * @param policyDocument The details of the policy. 
     */
    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The name of the resource policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html#cfn-logs-resourcepolicy-policyname)
     * @param policyName The name of the resource policy. 
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnResourcePolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.logs.CfnResourcePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourcePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourcePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnResourcePolicy):
        CfnResourcePolicy = CfnResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicy):
        software.amazon.awscdk.services.logs.CfnResourcePolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.CfnResourcePolicy
  }
}
