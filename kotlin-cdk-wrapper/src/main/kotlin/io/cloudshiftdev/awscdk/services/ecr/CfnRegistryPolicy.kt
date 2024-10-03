@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ECR::RegistryPolicy` resource creates or updates the permissions policy for a private
 * registry.
 *
 * A private registry policy is used to specify permissions for another AWS account and is used when
 * configuring cross-account replication. For more information, see [Registry
 * permissions](https://docs.aws.amazon.com/AmazonECR/latest/userguide/registry-permissions.html) in
 * the *Amazon Elastic Container Registry User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.*;
 * Object policyText;
 * CfnRegistryPolicy cfnRegistryPolicy = CfnRegistryPolicy.Builder.create(this,
 * "MyCfnRegistryPolicy")
 * .policyText(policyText)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registrypolicy.html)
 */
public open class CfnRegistryPolicy(
  cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryPolicy,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRegistryPolicyProps,
  ) :
      this(software.amazon.awscdk.services.ecr.CfnRegistryPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRegistryPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRegistryPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRegistryPolicyProps(props)
  )

  /**
   * The account ID of the private registry the policy is associated with.
   */
  public open fun attrRegistryId(): String = unwrap(this).getAttrRegistryId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The JSON policy text for your registry.
   */
  public open fun policyText(): Any = unwrap(this).getPolicyText()

  /**
   * The JSON policy text for your registry.
   */
  public open fun policyText(`value`: Any) {
    unwrap(this).setPolicyText(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecr.CfnRegistryPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The JSON policy text for your registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registrypolicy.html#cfn-ecr-registrypolicy-policytext)
     * @param policyText The JSON policy text for your registry. 
     */
    public fun policyText(policyText: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnRegistryPolicy.Builder =
        software.amazon.awscdk.services.ecr.CfnRegistryPolicy.Builder.create(scope, id)

    /**
     * The JSON policy text for your registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registrypolicy.html#cfn-ecr-registrypolicy-policytext)
     * @param policyText The JSON policy text for your registry. 
     */
    override fun policyText(policyText: Any) {
      cdkBuilder.policyText(policyText)
    }

    public fun build(): software.amazon.awscdk.services.ecr.CfnRegistryPolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecr.CfnRegistryPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRegistryPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRegistryPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryPolicy):
        CfnRegistryPolicy = CfnRegistryPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnRegistryPolicy):
        software.amazon.awscdk.services.ecr.CfnRegistryPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.ecr.CfnRegistryPolicy
  }
}
