package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPolicyPrincipalAttachment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
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
   * The name of the AWS IoT policy.
   */
  public open fun policyName(): String = unwrap(this).getPolicyName()

  /**
   * The name of the AWS IoT policy.
   */
  public open fun policyName(`value`: String) {
    unwrap(this).setPolicyName(`value`)
  }

  /**
   * The principal, which can be a certificate ARN (as returned from the `CreateCertificate`
   * operation) or an Amazon Cognito ID.
   */
  public open fun principal(): String = unwrap(this).getPrincipal()

  /**
   * The principal, which can be a certificate ARN (as returned from the `CreateCertificate`
   * operation) or an Amazon Cognito ID.
   */
  public open fun principal(`value`: String) {
    unwrap(this).setPrincipal(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnPolicyPrincipalAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the AWS IoT policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-policyname)
     * @param policyName The name of the AWS IoT policy. 
     */
    public fun policyName(policyName: String)

    /**
     * The principal, which can be a certificate ARN (as returned from the `CreateCertificate`
     * operation) or an Amazon Cognito ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-principal)
     * @param principal The principal, which can be a certificate ARN (as returned from the
     * `CreateCertificate` operation) or an Amazon Cognito ID. 
     */
    public fun principal(principal: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment.Builder
        = software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment.Builder.create(scope, id)

    /**
     * The name of the AWS IoT policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-policyname)
     * @param policyName The name of the AWS IoT policy. 
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * The principal, which can be a certificate ARN (as returned from the `CreateCertificate`
     * operation) or an Amazon Cognito ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-principal)
     * @param principal The principal, which can be a certificate ARN (as returned from the
     * `CreateCertificate` operation) or an Amazon Cognito ID. 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPolicyPrincipalAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPolicyPrincipalAttachment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment):
        CfnPolicyPrincipalAttachment = CfnPolicyPrincipalAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyPrincipalAttachment):
        software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment = wrapped.cdkObject
  }
}
