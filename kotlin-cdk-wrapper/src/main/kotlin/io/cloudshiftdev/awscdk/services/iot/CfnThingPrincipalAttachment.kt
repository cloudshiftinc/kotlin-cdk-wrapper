@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::IoT::ThingPrincipalAttachment` resource to attach a principal (an X.509 certificate
 * or another credential) to a thing.
 *
 * For more information about working with AWS IoT things and principals, see
 * [Authorization](https://docs.aws.amazon.com/iot/latest/developerguide/authorization.html) in the
 * *AWS IoT Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnThingPrincipalAttachment cfnThingPrincipalAttachment =
 * CfnThingPrincipalAttachment.Builder.create(this, "MyCfnThingPrincipalAttachment")
 * .principal("principal")
 * .thingName("thingName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html)
 */
public open class CfnThingPrincipalAttachment(
  cdkObject: software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnThingPrincipalAttachmentProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnThingPrincipalAttachmentProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnThingPrincipalAttachmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnThingPrincipalAttachmentProps(props)
  )

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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment = wrapped.cdkObject as
        software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment
  }
}
