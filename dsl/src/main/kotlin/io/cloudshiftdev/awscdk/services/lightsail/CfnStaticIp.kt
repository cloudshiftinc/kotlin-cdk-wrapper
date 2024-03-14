package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStaticIp internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lightsail.CfnStaticIp,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The instance that the static IP is attached to.
   */
  public open fun attachedTo(): String? = unwrap(this).getAttachedTo()

  /**
   * The instance that the static IP is attached to.
   */
  public open fun attachedTo(`value`: String) {
    unwrap(this).setAttachedTo(`value`)
  }

  /**
   * The IP address of the static IP.
   */
  public open fun attrIpAddress(): String = unwrap(this).getAttrIpAddress()

  /**
   * A Boolean value indicating whether the static IP is attached to an instance.
   */
  public open fun attrIsAttached(): IResolvable =
      unwrap(this).getAttrIsAttached().let(IResolvable::wrap)

  /**
   * The Amazon Resource Name (ARN) of the static IP (for example,
   * `arn:aws:lightsail:us-east-2:123456789101:StaticIp/244ad76f-8aad-4741-809f-12345EXAMPLE` ).
   */
  public open fun attrStaticIpArn(): String = unwrap(this).getAttrStaticIpArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the static IP.
   */
  public open fun staticIpName(): String = unwrap(this).getStaticIpName()

  /**
   * The name of the static IP.
   */
  public open fun staticIpName(`value`: String) {
    unwrap(this).setStaticIpName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lightsail.CfnStaticIp].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The instance that the static IP is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html#cfn-lightsail-staticip-attachedto)
     * @param attachedTo The instance that the static IP is attached to. 
     */
    public fun attachedTo(attachedTo: String)

    /**
     * The name of the static IP.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html#cfn-lightsail-staticip-staticipname)
     * @param staticIpName The name of the static IP. 
     */
    public fun staticIpName(staticIpName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnStaticIp.Builder =
        software.amazon.awscdk.services.lightsail.CfnStaticIp.Builder.create(scope, id)

    /**
     * The instance that the static IP is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html#cfn-lightsail-staticip-attachedto)
     * @param attachedTo The instance that the static IP is attached to. 
     */
    override fun attachedTo(attachedTo: String) {
      cdkBuilder.attachedTo(attachedTo)
    }

    /**
     * The name of the static IP.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html#cfn-lightsail-staticip-staticipname)
     * @param staticIpName The name of the static IP. 
     */
    override fun staticIpName(staticIpName: String) {
      cdkBuilder.staticIpName(staticIpName)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnStaticIp = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStaticIp {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStaticIp(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnStaticIp): CfnStaticIp
        = CfnStaticIp(cdkObject)

    internal fun unwrap(wrapped: CfnStaticIp): software.amazon.awscdk.services.lightsail.CfnStaticIp
        = wrapped.cdkObject
  }
}
