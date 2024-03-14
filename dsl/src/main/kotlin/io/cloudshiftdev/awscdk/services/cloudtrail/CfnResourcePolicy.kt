package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourcePolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based policy.
   */
  public open fun resourceArn(): String = unwrap(this).getResourceArn()

  /**
   * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based policy.
   */
  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  /**
   * A JSON-formatted string for an AWS resource-based policy.
   */
  public open fun resourcePolicy(): Any = unwrap(this).getResourcePolicy()

  /**
   * A JSON-formatted string for an AWS resource-based policy.
   */
  public open fun resourcePolicy(`value`: Any) {
    unwrap(this).setResourcePolicy(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudtrail.CfnResourcePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based
     * policy.
     *
     * The following is the format of a resource ARN:
     * `arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) of the CloudTrail channel attached to the
     * resource-based policy. 
     */
    public fun resourceArn(resourceArn: String)

    /**
     * A JSON-formatted string for an AWS resource-based policy.
     *
     * The following are requirements for the resource policy:
     *
     * * Contains only one action: cloudtrail-data:PutAuditEvents
     * * Contains at least one statement. The policy can have a maximum of 20 statements.
     * * Each statement contains at least one principal. A statement can have a maximum of 50
     * principals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcepolicy)
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
     */
    public fun resourcePolicy(resourcePolicy: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based
     * policy.
     *
     * The following is the format of a resource ARN:
     * `arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) of the CloudTrail channel attached to the
     * resource-based policy. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * A JSON-formatted string for an AWS resource-based policy.
     *
     * The following are requirements for the resource policy:
     *
     * * Contains only one action: cloudtrail-data:PutAuditEvents
     * * Contains at least one statement. The policy can have a maximum of 20 statements.
     * * Each statement contains at least one principal. A statement can have a maximum of 50
     * principals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcepolicy)
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
     */
    override fun resourcePolicy(resourcePolicy: Any) {
      cdkBuilder.resourcePolicy(resourcePolicy)
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourcePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourcePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy):
        CfnResourcePolicy = CfnResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicy):
        software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy = wrapped.cdkObject
  }
}
