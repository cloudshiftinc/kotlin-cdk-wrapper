@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnPolicyPrincipalAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnPolicyPrincipalAttachmentProps cfnPolicyPrincipalAttachmentProps =
 * CfnPolicyPrincipalAttachmentProps.builder()
 * .policyName("policyName")
 * .principal("principal")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html)
 */
public interface CfnPolicyPrincipalAttachmentProps {
  /**
   * The name of the AWS IoT policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-policyname)
   */
  public fun policyName(): String

  /**
   * The principal, which can be a certificate ARN (as returned from the `CreateCertificate`
   * operation) or an Amazon Cognito ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-principal)
   */
  public fun principal(): String

  /**
   * A builder for [CfnPolicyPrincipalAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policyName The name of the AWS IoT policy. 
     */
    public fun policyName(policyName: String)

    /**
     * @param principal The principal, which can be a certificate ARN (as returned from the
     * `CreateCertificate` operation) or an Amazon Cognito ID. 
     */
    public fun principal(principal: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps.Builder =
        software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps.builder()

    /**
     * @param policyName The name of the AWS IoT policy. 
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * @param principal The principal, which can be a certificate ARN (as returned from the
     * `CreateCertificate` operation) or an Amazon Cognito ID. 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps,
  ) : CdkObject(cdkObject), CfnPolicyPrincipalAttachmentProps {
    /**
     * The name of the AWS IoT policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-policyname)
     */
    override fun policyName(): String = unwrap(this).getPolicyName()

    /**
     * The principal, which can be a certificate ARN (as returned from the `CreateCertificate`
     * operation) or an Amazon Cognito ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-principal)
     */
    override fun principal(): String = unwrap(this).getPrincipal()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyPrincipalAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps):
        CfnPolicyPrincipalAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnPolicyPrincipalAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyPrincipalAttachmentProps):
        software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps
  }
}
