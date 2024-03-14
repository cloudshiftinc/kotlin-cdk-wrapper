package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnClusterPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.msk.CfnClusterPolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The current version of the policy attached to the specified cluster.
   */
  public open fun attrCurrentVersion(): String = unwrap(this).getAttrCurrentVersion()

  /**
   * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
   */
  public open fun clusterArn(): String = unwrap(this).getClusterArn()

  /**
   * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
   */
  public open fun clusterArn(`value`: String) {
    unwrap(this).setClusterArn(`value`)
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
   * Resource policy for the cluster.
   */
  public open fun policy(): Any = unwrap(this).getPolicy()

  /**
   * Resource policy for the cluster.
   */
  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.msk.CfnClusterPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html#cfn-msk-clusterpolicy-clusterarn)
     * @param clusterArn The Amazon Resource Name (ARN) that uniquely identifies the cluster. 
     */
    public fun clusterArn(clusterArn: String)

    /**
     * Resource policy for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html#cfn-msk-clusterpolicy-policy)
     * @param policy Resource policy for the cluster. 
     */
    public fun policy(policy: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnClusterPolicy.Builder =
        software.amazon.awscdk.services.msk.CfnClusterPolicy.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html#cfn-msk-clusterpolicy-clusterarn)
     * @param clusterArn The Amazon Resource Name (ARN) that uniquely identifies the cluster. 
     */
    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    /**
     * Resource policy for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html#cfn-msk-clusterpolicy-policy)
     * @param policy Resource policy for the cluster. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnClusterPolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.msk.CfnClusterPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClusterPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClusterPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnClusterPolicy):
        CfnClusterPolicy = CfnClusterPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnClusterPolicy):
        software.amazon.awscdk.services.msk.CfnClusterPolicy = wrapped.cdkObject
  }
}
