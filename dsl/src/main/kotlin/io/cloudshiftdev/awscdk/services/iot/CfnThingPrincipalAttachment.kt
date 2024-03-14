package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnThingPrincipalAttachment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment,
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
   * The name of the AWS IoT thing.
   */
  public open fun thingName(): String = unwrap(this).getThingName()

  /**
   * The name of the AWS IoT thing.
   */
  public open fun thingName(`value`: String) {
    unwrap(this).setThingName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnThingPrincipalAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The principal, which can be a certificate ARN (as returned from the `CreateCertificate`
     * operation) or an Amazon Cognito ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-principal)
     * @param principal The principal, which can be a certificate ARN (as returned from the
     * `CreateCertificate` operation) or an Amazon Cognito ID. 
     */
    public fun principal(principal: String)

    /**
     * The name of the AWS IoT thing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname)
     * @param thingName The name of the AWS IoT thing. 
     */
    public fun thingName(thingName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment.Builder
        = software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment.Builder.create(scope, id)

    /**
     * The principal, which can be a certificate ARN (as returned from the `CreateCertificate`
     * operation) or an Amazon Cognito ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-principal)
     * @param principal The principal, which can be a certificate ARN (as returned from the
     * `CreateCertificate` operation) or an Amazon Cognito ID. 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * The name of the AWS IoT thing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname)
     * @param thingName The name of the AWS IoT thing. 
     */
    override fun thingName(thingName: String) {
      cdkBuilder.thingName(thingName)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnThingPrincipalAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnThingPrincipalAttachment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment):
        CfnThingPrincipalAttachment = CfnThingPrincipalAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnThingPrincipalAttachment):
        software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment = wrapped.cdkObject
  }
}
