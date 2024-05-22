@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediatailor

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
 * Specifies an IAM policy for the channel.
 *
 * IAM policies are used to control access to your channel.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediatailor.*;
 * Object policy;
 * CfnChannelPolicy cfnChannelPolicy = CfnChannelPolicy.Builder.create(this, "MyCfnChannelPolicy")
 * .channelName("channelName")
 * .policy(policy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html)
 */
public open class CfnChannelPolicy(
  cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannelPolicy,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelPolicyProps,
  ) :
      this(software.amazon.awscdk.services.mediatailor.CfnChannelPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnChannelPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnChannelPolicyProps(props)
  )

  /**
   * The name of the channel associated with this Channel Policy.
   */
  public open fun channelName(): String = unwrap(this).getChannelName()

  /**
   * The name of the channel associated with this Channel Policy.
   */
  public open fun channelName(`value`: String) {
    unwrap(this).setChannelName(`value`)
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
   * The IAM policy for the channel.
   */
  public open fun policy(): Any = unwrap(this).getPolicy()

  /**
   * The IAM policy for the channel.
   */
  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediatailor.CfnChannelPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the channel associated with this Channel Policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html#cfn-mediatailor-channelpolicy-channelname)
     * @param channelName The name of the channel associated with this Channel Policy. 
     */
    public fun channelName(channelName: String)

    /**
     * The IAM policy for the channel.
     *
     * IAM policies are used to control access to your channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html#cfn-mediatailor-channelpolicy-policy)
     * @param policy The IAM policy for the channel. 
     */
    public fun policy(policy: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediatailor.CfnChannelPolicy.Builder =
        software.amazon.awscdk.services.mediatailor.CfnChannelPolicy.Builder.create(scope, id)

    /**
     * The name of the channel associated with this Channel Policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html#cfn-mediatailor-channelpolicy-channelname)
     * @param channelName The name of the channel associated with this Channel Policy. 
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * The IAM policy for the channel.
     *
     * IAM policies are used to control access to your channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html#cfn-mediatailor-channelpolicy-policy)
     * @param policy The IAM policy for the channel. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnChannelPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediatailor.CfnChannelPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannelPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannelPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannelPolicy):
        CfnChannelPolicy = CfnChannelPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnChannelPolicy):
        software.amazon.awscdk.services.mediatailor.CfnChannelPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.mediatailor.CfnChannelPolicy
  }
}
