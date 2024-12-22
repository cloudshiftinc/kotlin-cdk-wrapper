@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

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
 * Attaches a resource-based policy to a data stream or registered consumer.
 *
 * If you are using an identity other than the root user of the AWS account that owns the resource,
 * the calling identity must have the `PutResourcePolicy` permissions on the specified Kinesis Data
 * Streams resource and belong to the owner's account in order to use this operation. If you don't have
 * `PutResourcePolicy` permissions, Amazon Kinesis Data Streams returns a `403 Access Denied error` .
 * If you receive a `ResourceNotFoundException` , check to see if you passed a valid stream or consumer
 * resource.
 *
 * Request patterns can be one of the following:
 *
 * * Data stream pattern: `arn:aws.*:kinesis:.*:\d{12}:.*stream/\S+`
 * * Consumer pattern:
 * `^(arn):aws.*:kinesis:.*:\d{12}:.*stream\/[a-zA-Z0-9_.-]+\/consumer\/[a-zA-Z0-9_.-]+:[0-9]+`
 *
 * For more information, see [Controlling Access to Amazon Kinesis Data Streams Resources Using
 * IAM](https://docs.aws.amazon.com/streams/latest/dev/controlling-access.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesis.*;
 * Object resourcePolicy;
 * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
 * "MyCfnResourcePolicy")
 * .resourceArn("resourceArn")
 * .resourcePolicy(resourcePolicy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-resourcepolicy.html)
 */
public open class CfnResourcePolicy(
  cdkObject: software.amazon.awscdk.services.kinesis.CfnResourcePolicy,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourcePolicyProps,
  ) :
      this(software.amazon.awscdk.services.kinesis.CfnResourcePolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnResourcePolicyProps.Companion::unwrap))
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * This is the name for the resource policy.
   */
  public open fun resourceArn(): String = unwrap(this).getResourceArn()

  /**
   * This is the name for the resource policy.
   */
  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  /**
   * This is the description for the resource policy.
   */
  public open fun resourcePolicy(): Any = unwrap(this).getResourcePolicy()

  /**
   * This is the description for the resource policy.
   */
  public open fun resourcePolicy(`value`: Any) {
    unwrap(this).setResourcePolicy(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kinesis.CfnResourcePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * This is the name for the resource policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-resourcepolicy.html#cfn-kinesis-resourcepolicy-resourcearn)
     * @param resourceArn This is the name for the resource policy. 
     */
    public fun resourceArn(resourceArn: String)

    /**
     * This is the description for the resource policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-resourcepolicy.html#cfn-kinesis-resourcepolicy-resourcepolicy)
     * @param resourcePolicy This is the description for the resource policy. 
     */
    public fun resourcePolicy(resourcePolicy: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.CfnResourcePolicy.Builder =
        software.amazon.awscdk.services.kinesis.CfnResourcePolicy.Builder.create(scope, id)

    /**
     * This is the name for the resource policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-resourcepolicy.html#cfn-kinesis-resourcepolicy-resourcearn)
     * @param resourceArn This is the name for the resource policy. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * This is the description for the resource policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-resourcepolicy.html#cfn-kinesis-resourcepolicy-resourcepolicy)
     * @param resourcePolicy This is the description for the resource policy. 
     */
    override fun resourcePolicy(resourcePolicy: Any) {
      cdkBuilder.resourcePolicy(resourcePolicy)
    }

    public fun build(): software.amazon.awscdk.services.kinesis.CfnResourcePolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kinesis.CfnResourcePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourcePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourcePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.CfnResourcePolicy):
        CfnResourcePolicy = CfnResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicy):
        software.amazon.awscdk.services.kinesis.CfnResourcePolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.kinesis.CfnResourcePolicy
  }
}
