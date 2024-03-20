@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eventschemas

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
 * Use the `AWS::EventSchemas::RegistryPolicy` resource to specify resource-based policies for an
 * EventBridge Schema Registry.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eventschemas.*;
 * Object policy;
 * CfnRegistryPolicy cfnRegistryPolicy = CfnRegistryPolicy.Builder.create(this,
 * "MyCfnRegistryPolicy")
 * .policy(policy)
 * .registryName("registryName")
 * // the properties below are optional
 * .revisionId("revisionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html)
 */
public open class CfnRegistryPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRegistryPolicyProps,
  ) :
      this(software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnRegistryPolicyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRegistryPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRegistryPolicyProps(props)
  )

  /**
   * The ID of the policy.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A resource-based policy.
   */
  public open fun policy(): Any = unwrap(this).getPolicy()

  /**
   * A resource-based policy.
   */
  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * The name of the registry.
   */
  public open fun registryName(): String = unwrap(this).getRegistryName()

  /**
   * The name of the registry.
   */
  public open fun registryName(`value`: String) {
    unwrap(this).setRegistryName(`value`)
  }

  /**
   * The revision ID of the policy.
   */
  public open fun revisionId(): String? = unwrap(this).getRevisionId()

  /**
   * The revision ID of the policy.
   */
  public open fun revisionId(`value`: String) {
    unwrap(this).setRevisionId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eventschemas.CfnRegistryPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A resource-based policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-policy)
     * @param policy A resource-based policy. 
     */
    public fun policy(policy: Any)

    /**
     * The name of the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-registryname)
     * @param registryName The name of the registry. 
     */
    public fun registryName(registryName: String)

    /**
     * The revision ID of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-revisionid)
     * @param revisionId The revision ID of the policy. 
     */
    public fun revisionId(revisionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy.Builder =
        software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy.Builder.create(scope, id)

    /**
     * A resource-based policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-policy)
     * @param policy A resource-based policy. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * The name of the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-registryname)
     * @param registryName The name of the registry. 
     */
    override fun registryName(registryName: String) {
      cdkBuilder.registryName(registryName)
    }

    /**
     * The revision ID of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-revisionid)
     * @param revisionId The revision ID of the policy. 
     */
    override fun revisionId(revisionId: String) {
      cdkBuilder.revisionId(revisionId)
    }

    public fun build(): software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRegistryPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRegistryPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy):
        CfnRegistryPolicy = CfnRegistryPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnRegistryPolicy):
        software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy = wrapped.cdkObject
  }
}
