package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnListener internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnListener,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Name (ARN) of your accelerator.
   */
  public open fun acceleratorArn(): String = unwrap(this).getAcceleratorArn()

  /**
   * The Amazon Resource Name (ARN) of your accelerator.
   */
  public open fun acceleratorArn(`value`: String) {
    unwrap(this).setAcceleratorArn(`value`)
  }

  /**
   * The ARN of the listener, such as
   * `arn:aws:globalaccelerator::012345678901:accelerator/1234abcd-abcd-1234-abcd-1234abcdefgh/listener/0123vxyz`
   * .
   */
  public open fun attrListenerArn(): String = unwrap(this).getAttrListenerArn()

  /**
   * Client affinity lets you direct all requests from a user to the same endpoint, if you have
   * stateful applications, regardless of the port and protocol of the client request.
   */
  public open fun clientAffinity(): String? = unwrap(this).getClientAffinity()

  /**
   * Client affinity lets you direct all requests from a user to the same endpoint, if you have
   * stateful applications, regardless of the port and protocol of the client request.
   */
  public open fun clientAffinity(`value`: String) {
    unwrap(this).setClientAffinity(`value`)
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
   * The list of port ranges for the connections from clients to the accelerator.
   */
  public open fun portRanges(): Any = unwrap(this).getPortRanges()

  /**
   * The list of port ranges for the connections from clients to the accelerator.
   */
  public open fun portRanges(`value`: IResolvable) {
    unwrap(this).setPortRanges(`value`.let(IResolvable::unwrap))
  }

  /**
   * The list of port ranges for the connections from clients to the accelerator.
   */
  public open fun portRanges(__idx_ac66f0: List<Any>) {
    unwrap(this).setPortRanges(__idx_ac66f0)
  }

  /**
   * The list of port ranges for the connections from clients to the accelerator.
   */
  public open fun portRanges(vararg __idx_ac66f0: Any): Unit = portRanges(__idx_ac66f0.toList())

  /**
   * The protocol for the connections from clients to the accelerator.
   */
  public open fun protocol(): String = unwrap(this).getProtocol()

  /**
   * The protocol for the connections from clients to the accelerator.
   */
  public open fun protocol(`value`: String) {
    unwrap(this).setProtocol(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.globalaccelerator.CfnListener].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of your accelerator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-acceleratorarn)
     * @param acceleratorArn The Amazon Resource Name (ARN) of your accelerator. 
     */
    public fun acceleratorArn(acceleratorArn: String)

    /**
     * Client affinity lets you direct all requests from a user to the same endpoint, if you have
     * stateful applications, regardless of the port and protocol of the client request.
     *
     * Client affinity gives you control over whether to always route each client to the same
     * specific endpoint.
     *
     * AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal
     * endpoint for a connection. If client affinity is `NONE` , Global Accelerator uses the
     * "five-tuple" (5-tuple) properties—source IP address, source port, destination IP address,
     * destination port, and protocol—to select the hash value, and then chooses the best endpoint.
     * However, with this setting, if someone uses different ports to connect to Global Accelerator,
     * their connections might not be always routed to the same endpoint because the hash value
     * changes.
     *
     * If you want a given client to always be routed to the same endpoint, set client affinity to
     * `SOURCE_IP` instead. When you use the `SOURCE_IP` setting, Global Accelerator uses the
     * "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to
     * select the hash value.
     *
     * The default value is `NONE` .
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-clientaffinity)
     * @param clientAffinity Client affinity lets you direct all requests from a user to the same
     * endpoint, if you have stateful applications, regardless of the port and protocol of the client
     * request. 
     */
    public fun clientAffinity(clientAffinity: String)

    /**
     * The list of port ranges for the connections from clients to the accelerator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-portranges)
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    public fun portRanges(portRanges: IResolvable)

    /**
     * The list of port ranges for the connections from clients to the accelerator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-portranges)
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    public fun portRanges(portRanges: List<Any>)

    /**
     * The list of port ranges for the connections from clients to the accelerator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-portranges)
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    public fun portRanges(vararg portRanges: Any)

    /**
     * The protocol for the connections from clients to the accelerator.
     *
     * Default: - "TCP"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-protocol)
     * @param protocol The protocol for the connections from clients to the accelerator. 
     */
    public fun protocol(protocol: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.CfnListener.Builder =
        software.amazon.awscdk.services.globalaccelerator.CfnListener.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of your accelerator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-acceleratorarn)
     * @param acceleratorArn The Amazon Resource Name (ARN) of your accelerator. 
     */
    override fun acceleratorArn(acceleratorArn: String) {
      cdkBuilder.acceleratorArn(acceleratorArn)
    }

    /**
     * Client affinity lets you direct all requests from a user to the same endpoint, if you have
     * stateful applications, regardless of the port and protocol of the client request.
     *
     * Client affinity gives you control over whether to always route each client to the same
     * specific endpoint.
     *
     * AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal
     * endpoint for a connection. If client affinity is `NONE` , Global Accelerator uses the
     * "five-tuple" (5-tuple) properties—source IP address, source port, destination IP address,
     * destination port, and protocol—to select the hash value, and then chooses the best endpoint.
     * However, with this setting, if someone uses different ports to connect to Global Accelerator,
     * their connections might not be always routed to the same endpoint because the hash value
     * changes.
     *
     * If you want a given client to always be routed to the same endpoint, set client affinity to
     * `SOURCE_IP` instead. When you use the `SOURCE_IP` setting, Global Accelerator uses the
     * "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to
     * select the hash value.
     *
     * The default value is `NONE` .
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-clientaffinity)
     * @param clientAffinity Client affinity lets you direct all requests from a user to the same
     * endpoint, if you have stateful applications, regardless of the port and protocol of the client
     * request. 
     */
    override fun clientAffinity(clientAffinity: String) {
      cdkBuilder.clientAffinity(clientAffinity)
    }

    /**
     * The list of port ranges for the connections from clients to the accelerator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-portranges)
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    override fun portRanges(portRanges: IResolvable) {
      cdkBuilder.portRanges(portRanges.let(IResolvable::unwrap))
    }

    /**
     * The list of port ranges for the connections from clients to the accelerator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-portranges)
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    override fun portRanges(portRanges: List<Any>) {
      cdkBuilder.portRanges(portRanges)
    }

    /**
     * The list of port ranges for the connections from clients to the accelerator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-portranges)
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    override fun portRanges(vararg portRanges: Any): Unit = portRanges(portRanges.toList())

    /**
     * The protocol for the connections from clients to the accelerator.
     *
     * Default: - "TCP"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-protocol)
     * @param protocol The protocol for the connections from clients to the accelerator. 
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.CfnListener =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.globalaccelerator.CfnListener.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnListener {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnListener(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnListener):
        CfnListener = CfnListener(cdkObject)

    internal fun unwrap(wrapped: CfnListener):
        software.amazon.awscdk.services.globalaccelerator.CfnListener = wrapped.cdkObject
  }

  public interface PortRangeProperty {
    /**
     * The first port in the range of ports, inclusive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-listener-portrange.html#cfn-globalaccelerator-listener-portrange-fromport)
     */
    public fun fromPort(): Number

    /**
     * The last port in the range of ports, inclusive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-listener-portrange.html#cfn-globalaccelerator-listener-portrange-toport)
     */
    public fun toPort(): Number

    /**
     * A builder for [PortRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fromPort The first port in the range of ports, inclusive. 
       */
      public fun fromPort(fromPort: Number)

      /**
       * @param toPort The last port in the range of ports, inclusive. 
       */
      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.globalaccelerator.CfnListener.PortRangeProperty.Builder =
          software.amazon.awscdk.services.globalaccelerator.CfnListener.PortRangeProperty.builder()

      /**
       * @param fromPort The first port in the range of ports, inclusive. 
       */
      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      /**
       * @param toPort The last port in the range of ports, inclusive. 
       */
      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build():
          software.amazon.awscdk.services.globalaccelerator.CfnListener.PortRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.globalaccelerator.CfnListener.PortRangeProperty,
    ) : CdkObject(cdkObject), PortRangeProperty {
      /**
       * The first port in the range of ports, inclusive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-listener-portrange.html#cfn-globalaccelerator-listener-portrange-fromport)
       */
      override fun fromPort(): Number = unwrap(this).getFromPort()

      /**
       * The last port in the range of ports, inclusive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-listener-portrange.html#cfn-globalaccelerator-listener-portrange-toport)
       */
      override fun toPort(): Number = unwrap(this).getToPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnListener.PortRangeProperty):
          PortRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortRangeProperty):
          software.amazon.awscdk.services.globalaccelerator.CfnListener.PortRangeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.globalaccelerator.CfnListener.PortRangeProperty
    }
  }
}
