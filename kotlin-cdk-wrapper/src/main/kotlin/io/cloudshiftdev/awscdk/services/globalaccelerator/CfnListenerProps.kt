@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnListener`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
 * CfnListenerProps cfnListenerProps = CfnListenerProps.builder()
 * .acceleratorArn("acceleratorArn")
 * .portRanges(List.of(PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .protocol("protocol")
 * // the properties below are optional
 * .clientAffinity("clientAffinity")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html)
 */
public interface CfnListenerProps {
  /**
   * The Amazon Resource Name (ARN) of your accelerator.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-acceleratorarn)
   */
  public fun acceleratorArn(): String

  /**
   * Client affinity lets you direct all requests from a user to the same endpoint, if you have
   * stateful applications, regardless of the port and protocol of the client request.
   *
   * Client affinity gives you control over whether to always route each client to the same specific
   * endpoint.
   *
   * AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint
   * for a connection. If client affinity is `NONE` , Global Accelerator uses the "five-tuple"
   * (5-tuple) properties—source IP address, source port, destination IP address, destination port, and
   * protocol—to select the hash value, and then chooses the best endpoint. However, with this setting,
   * if someone uses different ports to connect to Global Accelerator, their connections might not be
   * always routed to the same endpoint because the hash value changes.
   *
   * If you want a given client to always be routed to the same endpoint, set client affinity to
   * `SOURCE_IP` instead. When you use the `SOURCE_IP` setting, Global Accelerator uses the "two-tuple"
   * (2-tuple) properties— source (client) IP address and destination IP address—to select the hash
   * value.
   *
   * The default value is `NONE` .
   *
   * Default: - "NONE"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-clientaffinity)
   */
  public fun clientAffinity(): String? = unwrap(this).getClientAffinity()

  /**
   * The list of port ranges for the connections from clients to the accelerator.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-portranges)
   */
  public fun portRanges(): Any

  /**
   * The protocol for the connections from clients to the accelerator.
   *
   * Default: - "TCP"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-protocol)
   */
  public fun protocol(): String

  /**
   * A builder for [CfnListenerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param acceleratorArn The Amazon Resource Name (ARN) of your accelerator. 
     */
    public fun acceleratorArn(acceleratorArn: String)

    /**
     * @param clientAffinity Client affinity lets you direct all requests from a user to the same
     * endpoint, if you have stateful applications, regardless of the port and protocol of the client
     * request.
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
     */
    public fun clientAffinity(clientAffinity: String)

    /**
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    public fun portRanges(portRanges: IResolvable)

    /**
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    public fun portRanges(portRanges: List<Any>)

    /**
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    public fun portRanges(vararg portRanges: Any)

    /**
     * @param protocol The protocol for the connections from clients to the accelerator. 
     */
    public fun protocol(protocol: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.CfnListenerProps.Builder =
        software.amazon.awscdk.services.globalaccelerator.CfnListenerProps.builder()

    /**
     * @param acceleratorArn The Amazon Resource Name (ARN) of your accelerator. 
     */
    override fun acceleratorArn(acceleratorArn: String) {
      cdkBuilder.acceleratorArn(acceleratorArn)
    }

    /**
     * @param clientAffinity Client affinity lets you direct all requests from a user to the same
     * endpoint, if you have stateful applications, regardless of the port and protocol of the client
     * request.
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
     */
    override fun clientAffinity(clientAffinity: String) {
      cdkBuilder.clientAffinity(clientAffinity)
    }

    /**
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    override fun portRanges(portRanges: IResolvable) {
      cdkBuilder.portRanges(portRanges.let(IResolvable::unwrap))
    }

    /**
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    override fun portRanges(portRanges: List<Any>) {
      cdkBuilder.portRanges(portRanges.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    override fun portRanges(vararg portRanges: Any): Unit = portRanges(portRanges.toList())

    /**
     * @param protocol The protocol for the connections from clients to the accelerator. 
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.CfnListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnListenerProps,
  ) : CdkObject(cdkObject), CfnListenerProps {
    /**
     * The Amazon Resource Name (ARN) of your accelerator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-acceleratorarn)
     */
    override fun acceleratorArn(): String = unwrap(this).getAcceleratorArn()

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
     */
    override fun clientAffinity(): String? = unwrap(this).getClientAffinity()

    /**
     * The list of port ranges for the connections from clients to the accelerator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-portranges)
     */
    override fun portRanges(): Any = unwrap(this).getPortRanges()

    /**
     * The protocol for the connections from clients to the accelerator.
     *
     * Default: - "TCP"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-protocol)
     */
    override fun protocol(): String = unwrap(this).getProtocol()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnListenerProps):
        CfnListenerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnListenerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnListenerProps):
        software.amazon.awscdk.services.globalaccelerator.CfnListenerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.CfnListenerProps
  }
}
