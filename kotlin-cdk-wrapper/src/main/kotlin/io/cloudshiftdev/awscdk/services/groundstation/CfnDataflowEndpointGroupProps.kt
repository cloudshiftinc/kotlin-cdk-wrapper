@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.groundstation

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDataflowEndpointGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.groundstation.*;
 * CfnDataflowEndpointGroupProps cfnDataflowEndpointGroupProps =
 * CfnDataflowEndpointGroupProps.builder()
 * .endpointDetails(List.of(EndpointDetailsProperty.builder()
 * .awsGroundStationAgentEndpoint(AwsGroundStationAgentEndpointProperty.builder()
 * .agentStatus("agentStatus")
 * .auditResults("auditResults")
 * .egressAddress(ConnectionDetailsProperty.builder()
 * .mtu(123)
 * .socketAddress(SocketAddressProperty.builder()
 * .name("name")
 * .port(123)
 * .build())
 * .build())
 * .ingressAddress(RangedConnectionDetailsProperty.builder()
 * .mtu(123)
 * .socketAddress(RangedSocketAddressProperty.builder()
 * .name("name")
 * .portRange(IntegerRangeProperty.builder()
 * .maximum(123)
 * .minimum(123)
 * .build())
 * .build())
 * .build())
 * .name("name")
 * .build())
 * .endpoint(DataflowEndpointProperty.builder()
 * .address(SocketAddressProperty.builder()
 * .name("name")
 * .port(123)
 * .build())
 * .mtu(123)
 * .name("name")
 * .build())
 * .securityDetails(SecurityDetailsProperty.builder()
 * .roleArn("roleArn")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build()))
 * // the properties below are optional
 * .contactPostPassDurationSeconds(123)
 * .contactPrePassDurationSeconds(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html)
 */
public interface CfnDataflowEndpointGroupProps {
  /**
   * Amount of time, in seconds, after a contact ends that the Ground Station Dataflow Endpoint
   * Group will be in a `POSTPASS` state.
   *
   * A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow
   * Endpoint Group enters and exits the `POSTPASS` state.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-contactpostpassdurationseconds)
   */
  public fun contactPostPassDurationSeconds(): Number? =
      unwrap(this).getContactPostPassDurationSeconds()

  /**
   * Amount of time, in seconds, before a contact starts that the Ground Station Dataflow Endpoint
   * Group will be in a `PREPASS` state.
   *
   * A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow
   * Endpoint Group enters and exits the `PREPASS` state.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-contactprepassdurationseconds)
   */
  public fun contactPrePassDurationSeconds(): Number? =
      unwrap(this).getContactPrePassDurationSeconds()

  /**
   * List of Endpoint Details, containing address and port for each endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-endpointdetails)
   */
  public fun endpointDetails(): Any

  /**
   * Tags assigned to a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDataflowEndpointGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contactPostPassDurationSeconds Amount of time, in seconds, after a contact ends that
     * the Ground Station Dataflow Endpoint Group will be in a `POSTPASS` state.
     * A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow
     * Endpoint Group enters and exits the `POSTPASS` state.
     */
    public fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number)

    /**
     * @param contactPrePassDurationSeconds Amount of time, in seconds, before a contact starts that
     * the Ground Station Dataflow Endpoint Group will be in a `PREPASS` state.
     * A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow
     * Endpoint Group enters and exits the `PREPASS` state.
     */
    public fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number)

    /**
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     * endpoint. 
     */
    public fun endpointDetails(endpointDetails: IResolvable)

    /**
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     * endpoint. 
     */
    public fun endpointDetails(endpointDetails: List<Any>)

    /**
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     * endpoint. 
     */
    public fun endpointDetails(vararg endpointDetails: Any)

    /**
     * @param tags Tags assigned to a resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags assigned to a resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps.Builder =
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps.builder()

    /**
     * @param contactPostPassDurationSeconds Amount of time, in seconds, after a contact ends that
     * the Ground Station Dataflow Endpoint Group will be in a `POSTPASS` state.
     * A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow
     * Endpoint Group enters and exits the `POSTPASS` state.
     */
    override fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number) {
      cdkBuilder.contactPostPassDurationSeconds(contactPostPassDurationSeconds)
    }

    /**
     * @param contactPrePassDurationSeconds Amount of time, in seconds, before a contact starts that
     * the Ground Station Dataflow Endpoint Group will be in a `PREPASS` state.
     * A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow
     * Endpoint Group enters and exits the `PREPASS` state.
     */
    override fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number) {
      cdkBuilder.contactPrePassDurationSeconds(contactPrePassDurationSeconds)
    }

    /**
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     * endpoint. 
     */
    override fun endpointDetails(endpointDetails: IResolvable) {
      cdkBuilder.endpointDetails(endpointDetails.let(IResolvable::unwrap))
    }

    /**
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     * endpoint. 
     */
    override fun endpointDetails(endpointDetails: List<Any>) {
      cdkBuilder.endpointDetails(endpointDetails)
    }

    /**
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     * endpoint. 
     */
    override fun endpointDetails(vararg endpointDetails: Any): Unit =
        endpointDetails(endpointDetails.toList())

    /**
     * @param tags Tags assigned to a resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Tags assigned to a resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps,
  ) : CdkObject(cdkObject), CfnDataflowEndpointGroupProps {
    /**
     * Amount of time, in seconds, after a contact ends that the Ground Station Dataflow Endpoint
     * Group will be in a `POSTPASS` state.
     *
     * A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow
     * Endpoint Group enters and exits the `POSTPASS` state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-contactpostpassdurationseconds)
     */
    override fun contactPostPassDurationSeconds(): Number? =
        unwrap(this).getContactPostPassDurationSeconds()

    /**
     * Amount of time, in seconds, before a contact starts that the Ground Station Dataflow Endpoint
     * Group will be in a `PREPASS` state.
     *
     * A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow
     * Endpoint Group enters and exits the `PREPASS` state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-contactprepassdurationseconds)
     */
    override fun contactPrePassDurationSeconds(): Number? =
        unwrap(this).getContactPrePassDurationSeconds()

    /**
     * List of Endpoint Details, containing address and port for each endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-endpointdetails)
     */
    override fun endpointDetails(): Any = unwrap(this).getEndpointDetails()

    /**
     * Tags assigned to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataflowEndpointGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps):
        CfnDataflowEndpointGroupProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnDataflowEndpointGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataflowEndpointGroupProps):
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps
  }
}
