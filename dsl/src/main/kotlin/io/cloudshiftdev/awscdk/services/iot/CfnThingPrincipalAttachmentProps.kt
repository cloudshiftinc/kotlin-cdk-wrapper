package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnThingPrincipalAttachmentProps {
  /**
   * The principal, which can be a certificate ARN (as returned from the `CreateCertificate`
   * operation) or an Amazon Cognito ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-principal)
   */
  public fun principal(): String

  /**
   * The name of the AWS IoT thing.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname)
   */
  public fun thingName(): String

  /**
   * A builder for [CfnThingPrincipalAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param principal The principal, which can be a certificate ARN (as returned from the
     * `CreateCertificate` operation) or an Amazon Cognito ID. 
     */
    public fun principal(principal: String)

    /**
     * @param thingName The name of the AWS IoT thing. 
     */
    public fun thingName(thingName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps.Builder =
        software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps.builder()

    /**
     * @param principal The principal, which can be a certificate ARN (as returned from the
     * `CreateCertificate` operation) or an Amazon Cognito ID. 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * @param thingName The name of the AWS IoT thing. 
     */
    override fun thingName(thingName: String) {
      cdkBuilder.thingName(thingName)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps,
  ) : CdkObject(cdkObject), CfnThingPrincipalAttachmentProps {
    /**
     * The principal, which can be a certificate ARN (as returned from the `CreateCertificate`
     * operation) or an Amazon Cognito ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-principal)
     */
    override fun principal(): String = unwrap(this).getPrincipal()

    /**
     * The name of the AWS IoT thing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname)
     */
    override fun thingName(): String = unwrap(this).getThingName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnThingPrincipalAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps):
        CfnThingPrincipalAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnThingPrincipalAttachmentProps):
        software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps
  }
}
