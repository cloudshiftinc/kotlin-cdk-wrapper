@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.groundstation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a Dataflow Endpoint Group request.
 *
 * Dataflow endpoint groups contain a list of endpoints. When the name of a dataflow endpoint group
 * is specified in a mission profile, the Ground Station service will connect to the endpoints and flow
 * data during a contact.
 *
 * For more information about dataflow endpoint groups, see [Dataflow Endpoint
 * Groups](https://docs.aws.amazon.com/ground-station/latest/ug/dataflowendpointgroups.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.groundstation.*;
 * CfnDataflowEndpointGroup cfnDataflowEndpointGroup = CfnDataflowEndpointGroup.Builder.create(this,
 * "MyCfnDataflowEndpointGroup")
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
public open class CfnDataflowEndpointGroup internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the dataflow endpoint group, such as
   * `arn:aws:groundstation:us-east-2:1234567890:dataflow-endpoint-group/9940bf3b-d2ba-427e-9906-842b5e5d2296`
   * .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * UUID of a dataflow endpoint group.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Amount of time, in seconds, after a contact ends that the Ground Station Dataflow Endpoint
   * Group will be in a `POSTPASS` state.
   */
  public open fun contactPostPassDurationSeconds(): Number? =
      unwrap(this).getContactPostPassDurationSeconds()

  /**
   * Amount of time, in seconds, after a contact ends that the Ground Station Dataflow Endpoint
   * Group will be in a `POSTPASS` state.
   */
  public open fun contactPostPassDurationSeconds(`value`: Number) {
    unwrap(this).setContactPostPassDurationSeconds(`value`)
  }

  /**
   * Amount of time, in seconds, before a contact starts that the Ground Station Dataflow Endpoint
   * Group will be in a `PREPASS` state.
   */
  public open fun contactPrePassDurationSeconds(): Number? =
      unwrap(this).getContactPrePassDurationSeconds()

  /**
   * Amount of time, in seconds, before a contact starts that the Ground Station Dataflow Endpoint
   * Group will be in a `PREPASS` state.
   */
  public open fun contactPrePassDurationSeconds(`value`: Number) {
    unwrap(this).setContactPrePassDurationSeconds(`value`)
  }

  /**
   * List of Endpoint Details, containing address and port for each endpoint.
   */
  public open fun endpointDetails(): Any = unwrap(this).getEndpointDetails()

  /**
   * List of Endpoint Details, containing address and port for each endpoint.
   */
  public open fun endpointDetails(`value`: IResolvable) {
    unwrap(this).setEndpointDetails(`value`.let(IResolvable::unwrap))
  }

  /**
   * List of Endpoint Details, containing address and port for each endpoint.
   */
  public open fun endpointDetails(`value`: List<Any>) {
    unwrap(this).setEndpointDetails(`value`)
  }

  /**
   * List of Endpoint Details, containing address and port for each endpoint.
   */
  public open fun endpointDetails(vararg `value`: Any): Unit = endpointDetails(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags assigned to a resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Tags assigned to a resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Tags assigned to a resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.groundstation.CfnDataflowEndpointGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Amount of time, in seconds, after a contact ends that the Ground Station Dataflow Endpoint
     * Group will be in a `POSTPASS` state.
     *
     * A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow
     * Endpoint Group enters and exits the `POSTPASS` state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-contactpostpassdurationseconds)
     * @param contactPostPassDurationSeconds Amount of time, in seconds, after a contact ends that
     * the Ground Station Dataflow Endpoint Group will be in a `POSTPASS` state. 
     */
    public fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number)

    /**
     * Amount of time, in seconds, before a contact starts that the Ground Station Dataflow Endpoint
     * Group will be in a `PREPASS` state.
     *
     * A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow
     * Endpoint Group enters and exits the `PREPASS` state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-contactprepassdurationseconds)
     * @param contactPrePassDurationSeconds Amount of time, in seconds, before a contact starts that
     * the Ground Station Dataflow Endpoint Group will be in a `PREPASS` state. 
     */
    public fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number)

    /**
     * List of Endpoint Details, containing address and port for each endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-endpointdetails)
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     * endpoint. 
     */
    public fun endpointDetails(endpointDetails: IResolvable)

    /**
     * List of Endpoint Details, containing address and port for each endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-endpointdetails)
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     * endpoint. 
     */
    public fun endpointDetails(endpointDetails: List<Any>)

    /**
     * List of Endpoint Details, containing address and port for each endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-endpointdetails)
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     * endpoint. 
     */
    public fun endpointDetails(vararg endpointDetails: Any)

    /**
     * Tags assigned to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-tags)
     * @param tags Tags assigned to a resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags assigned to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-tags)
     * @param tags Tags assigned to a resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.Builder =
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.Builder.create(scope,
        id)

    /**
     * Amount of time, in seconds, after a contact ends that the Ground Station Dataflow Endpoint
     * Group will be in a `POSTPASS` state.
     *
     * A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow
     * Endpoint Group enters and exits the `POSTPASS` state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-contactpostpassdurationseconds)
     * @param contactPostPassDurationSeconds Amount of time, in seconds, after a contact ends that
     * the Ground Station Dataflow Endpoint Group will be in a `POSTPASS` state. 
     */
    override fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number) {
      cdkBuilder.contactPostPassDurationSeconds(contactPostPassDurationSeconds)
    }

    /**
     * Amount of time, in seconds, before a contact starts that the Ground Station Dataflow Endpoint
     * Group will be in a `PREPASS` state.
     *
     * A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow
     * Endpoint Group enters and exits the `PREPASS` state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-contactprepassdurationseconds)
     * @param contactPrePassDurationSeconds Amount of time, in seconds, before a contact starts that
     * the Ground Station Dataflow Endpoint Group will be in a `PREPASS` state. 
     */
    override fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number) {
      cdkBuilder.contactPrePassDurationSeconds(contactPrePassDurationSeconds)
    }

    /**
     * List of Endpoint Details, containing address and port for each endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-endpointdetails)
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     * endpoint. 
     */
    override fun endpointDetails(endpointDetails: IResolvable) {
      cdkBuilder.endpointDetails(endpointDetails.let(IResolvable::unwrap))
    }

    /**
     * List of Endpoint Details, containing address and port for each endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-endpointdetails)
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     * endpoint. 
     */
    override fun endpointDetails(endpointDetails: List<Any>) {
      cdkBuilder.endpointDetails(endpointDetails)
    }

    /**
     * List of Endpoint Details, containing address and port for each endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-endpointdetails)
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     * endpoint. 
     */
    override fun endpointDetails(vararg endpointDetails: Any): Unit =
        endpointDetails(endpointDetails.toList())

    /**
     * Tags assigned to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-tags)
     * @param tags Tags assigned to a resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Tags assigned to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-tags)
     * @param tags Tags assigned to a resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataflowEndpointGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataflowEndpointGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup):
        CfnDataflowEndpointGroup = CfnDataflowEndpointGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDataflowEndpointGroup):
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup = wrapped.cdkObject
  }

  /**
   * The address of the endpoint, such as `192.168.1.1` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * SocketAddressProperty socketAddressProperty = SocketAddressProperty.builder()
   * .name("name")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-socketaddress.html)
   */
  public interface SocketAddressProperty {
    /**
     * The name of the endpoint, such as `Endpoint 1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-socketaddress.html#cfn-groundstation-dataflowendpointgroup-socketaddress-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The port of the endpoint, such as `55888` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-socketaddress.html#cfn-groundstation-dataflowendpointgroup-socketaddress-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * A builder for [SocketAddressProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the endpoint, such as `Endpoint 1` .
       */
      public fun name(name: String)

      /**
       * @param port The port of the endpoint, such as `55888` .
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty.builder()

      /**
       * @param name The name of the endpoint, such as `Endpoint 1` .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param port The port of the endpoint, such as `55888` .
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty,
    ) : CdkObject(cdkObject), SocketAddressProperty {
      /**
       * The name of the endpoint, such as `Endpoint 1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-socketaddress.html#cfn-groundstation-dataflowendpointgroup-socketaddress-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The port of the endpoint, such as `55888` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-socketaddress.html#cfn-groundstation-dataflowendpointgroup-socketaddress-port)
       */
      override fun port(): Number? = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SocketAddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty):
          SocketAddressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SocketAddressProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty
    }
  }

  /**
   * The security details and endpoint information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * EndpointDetailsProperty endpointDetailsProperty = EndpointDetailsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-endpointdetails.html)
   */
  public interface EndpointDetailsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-endpointdetails.html#cfn-groundstation-dataflowendpointgroup-endpointdetails-awsgroundstationagentendpoint)
     */
    public fun awsGroundStationAgentEndpoint(): Any? =
        unwrap(this).getAwsGroundStationAgentEndpoint()

    /**
     * Information about the endpoint such as name and the endpoint address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-endpointdetails.html#cfn-groundstation-dataflowendpointgroup-endpointdetails-endpoint)
     */
    public fun endpoint(): Any? = unwrap(this).getEndpoint()

    /**
     * The role ARN, and IDs for security groups and subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-endpointdetails.html#cfn-groundstation-dataflowendpointgroup-endpointdetails-securitydetails)
     */
    public fun securityDetails(): Any? = unwrap(this).getSecurityDetails()

    /**
     * A builder for [EndpointDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsGroundStationAgentEndpoint the value to be set.
       */
      public fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: IResolvable)

      /**
       * @param awsGroundStationAgentEndpoint the value to be set.
       */
      public
          fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: AwsGroundStationAgentEndpointProperty)

      /**
       * @param awsGroundStationAgentEndpoint the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edf47fab2f161f83d66b318160a181035ca11528d076564dc62e03d0642fe3c7")
      public
          fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: AwsGroundStationAgentEndpointProperty.Builder.() -> Unit)

      /**
       * @param endpoint Information about the endpoint such as name and the endpoint address.
       */
      public fun endpoint(endpoint: IResolvable)

      /**
       * @param endpoint Information about the endpoint such as name and the endpoint address.
       */
      public fun endpoint(endpoint: DataflowEndpointProperty)

      /**
       * @param endpoint Information about the endpoint such as name and the endpoint address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e83ed6fb7c6aa66fef82ae8c4ebb024d91310dc4da4bccd017b2ff8b12100dc")
      public fun endpoint(endpoint: DataflowEndpointProperty.Builder.() -> Unit)

      /**
       * @param securityDetails The role ARN, and IDs for security groups and subnets.
       */
      public fun securityDetails(securityDetails: IResolvable)

      /**
       * @param securityDetails The role ARN, and IDs for security groups and subnets.
       */
      public fun securityDetails(securityDetails: SecurityDetailsProperty)

      /**
       * @param securityDetails The role ARN, and IDs for security groups and subnets.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49418a0b3357df96503d6b4f912c4a3c0fe03ccb45b61bb2b119e8a87430407e")
      public fun securityDetails(securityDetails: SecurityDetailsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.EndpointDetailsProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.EndpointDetailsProperty.builder()

      /**
       * @param awsGroundStationAgentEndpoint the value to be set.
       */
      override fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: IResolvable) {
        cdkBuilder.awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint.let(IResolvable::unwrap))
      }

      /**
       * @param awsGroundStationAgentEndpoint the value to be set.
       */
      override
          fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: AwsGroundStationAgentEndpointProperty) {
        cdkBuilder.awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint.let(AwsGroundStationAgentEndpointProperty::unwrap))
      }

      /**
       * @param awsGroundStationAgentEndpoint the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edf47fab2f161f83d66b318160a181035ca11528d076564dc62e03d0642fe3c7")
      override
          fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: AwsGroundStationAgentEndpointProperty.Builder.() -> Unit):
          Unit =
          awsGroundStationAgentEndpoint(AwsGroundStationAgentEndpointProperty(awsGroundStationAgentEndpoint))

      /**
       * @param endpoint Information about the endpoint such as name and the endpoint address.
       */
      override fun endpoint(endpoint: IResolvable) {
        cdkBuilder.endpoint(endpoint.let(IResolvable::unwrap))
      }

      /**
       * @param endpoint Information about the endpoint such as name and the endpoint address.
       */
      override fun endpoint(endpoint: DataflowEndpointProperty) {
        cdkBuilder.endpoint(endpoint.let(DataflowEndpointProperty::unwrap))
      }

      /**
       * @param endpoint Information about the endpoint such as name and the endpoint address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e83ed6fb7c6aa66fef82ae8c4ebb024d91310dc4da4bccd017b2ff8b12100dc")
      override fun endpoint(endpoint: DataflowEndpointProperty.Builder.() -> Unit): Unit =
          endpoint(DataflowEndpointProperty(endpoint))

      /**
       * @param securityDetails The role ARN, and IDs for security groups and subnets.
       */
      override fun securityDetails(securityDetails: IResolvable) {
        cdkBuilder.securityDetails(securityDetails.let(IResolvable::unwrap))
      }

      /**
       * @param securityDetails The role ARN, and IDs for security groups and subnets.
       */
      override fun securityDetails(securityDetails: SecurityDetailsProperty) {
        cdkBuilder.securityDetails(securityDetails.let(SecurityDetailsProperty::unwrap))
      }

      /**
       * @param securityDetails The role ARN, and IDs for security groups and subnets.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49418a0b3357df96503d6b4f912c4a3c0fe03ccb45b61bb2b119e8a87430407e")
      override fun securityDetails(securityDetails: SecurityDetailsProperty.Builder.() -> Unit):
          Unit = securityDetails(SecurityDetailsProperty(securityDetails))

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.EndpointDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.EndpointDetailsProperty,
    ) : CdkObject(cdkObject), EndpointDetailsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-endpointdetails.html#cfn-groundstation-dataflowendpointgroup-endpointdetails-awsgroundstationagentendpoint)
       */
      override fun awsGroundStationAgentEndpoint(): Any? =
          unwrap(this).getAwsGroundStationAgentEndpoint()

      /**
       * Information about the endpoint such as name and the endpoint address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-endpointdetails.html#cfn-groundstation-dataflowendpointgroup-endpointdetails-endpoint)
       */
      override fun endpoint(): Any? = unwrap(this).getEndpoint()

      /**
       * The role ARN, and IDs for security groups and subnets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-endpointdetails.html#cfn-groundstation-dataflowendpointgroup-endpointdetails-securitydetails)
       */
      override fun securityDetails(): Any? = unwrap(this).getSecurityDetails()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.EndpointDetailsProperty):
          EndpointDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointDetailsProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.EndpointDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.EndpointDetailsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * RangedConnectionDetailsProperty rangedConnectionDetailsProperty =
   * RangedConnectionDetailsProperty.builder()
   * .mtu(123)
   * .socketAddress(RangedSocketAddressProperty.builder()
   * .name("name")
   * .portRange(IntegerRangeProperty.builder()
   * .maximum(123)
   * .minimum(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-rangedconnectiondetails.html)
   */
  public interface RangedConnectionDetailsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-rangedconnectiondetails.html#cfn-groundstation-dataflowendpointgroup-rangedconnectiondetails-mtu)
     */
    public fun mtu(): Number? = unwrap(this).getMtu()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-rangedconnectiondetails.html#cfn-groundstation-dataflowendpointgroup-rangedconnectiondetails-socketaddress)
     */
    public fun socketAddress(): Any? = unwrap(this).getSocketAddress()

    /**
     * A builder for [RangedConnectionDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mtu the value to be set.
       */
      public fun mtu(mtu: Number)

      /**
       * @param socketAddress the value to be set.
       */
      public fun socketAddress(socketAddress: IResolvable)

      /**
       * @param socketAddress the value to be set.
       */
      public fun socketAddress(socketAddress: RangedSocketAddressProperty)

      /**
       * @param socketAddress the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fac8a1455459461b9b6773852bcd890d1366152e576998fba98b1cdb23f6e8a")
      public fun socketAddress(socketAddress: RangedSocketAddressProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedConnectionDetailsProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedConnectionDetailsProperty.builder()

      /**
       * @param mtu the value to be set.
       */
      override fun mtu(mtu: Number) {
        cdkBuilder.mtu(mtu)
      }

      /**
       * @param socketAddress the value to be set.
       */
      override fun socketAddress(socketAddress: IResolvable) {
        cdkBuilder.socketAddress(socketAddress.let(IResolvable::unwrap))
      }

      /**
       * @param socketAddress the value to be set.
       */
      override fun socketAddress(socketAddress: RangedSocketAddressProperty) {
        cdkBuilder.socketAddress(socketAddress.let(RangedSocketAddressProperty::unwrap))
      }

      /**
       * @param socketAddress the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fac8a1455459461b9b6773852bcd890d1366152e576998fba98b1cdb23f6e8a")
      override fun socketAddress(socketAddress: RangedSocketAddressProperty.Builder.() -> Unit):
          Unit = socketAddress(RangedSocketAddressProperty(socketAddress))

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedConnectionDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedConnectionDetailsProperty,
    ) : CdkObject(cdkObject), RangedConnectionDetailsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-rangedconnectiondetails.html#cfn-groundstation-dataflowendpointgroup-rangedconnectiondetails-mtu)
       */
      override fun mtu(): Number? = unwrap(this).getMtu()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-rangedconnectiondetails.html#cfn-groundstation-dataflowendpointgroup-rangedconnectiondetails-socketaddress)
       */
      override fun socketAddress(): Any? = unwrap(this).getSocketAddress()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RangedConnectionDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedConnectionDetailsProperty):
          RangedConnectionDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RangedConnectionDetailsProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedConnectionDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedConnectionDetailsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * AwsGroundStationAgentEndpointProperty awsGroundStationAgentEndpointProperty =
   * AwsGroundStationAgentEndpointProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint.html)
   */
  public interface AwsGroundStationAgentEndpointProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint.html#cfn-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint-agentstatus)
     */
    public fun agentStatus(): String? = unwrap(this).getAgentStatus()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint.html#cfn-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint-auditresults)
     */
    public fun auditResults(): String? = unwrap(this).getAuditResults()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint.html#cfn-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint-egressaddress)
     */
    public fun egressAddress(): Any? = unwrap(this).getEgressAddress()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint.html#cfn-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint-ingressaddress)
     */
    public fun ingressAddress(): Any? = unwrap(this).getIngressAddress()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint.html#cfn-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [AwsGroundStationAgentEndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param agentStatus the value to be set.
       */
      public fun agentStatus(agentStatus: String)

      /**
       * @param auditResults the value to be set.
       */
      public fun auditResults(auditResults: String)

      /**
       * @param egressAddress the value to be set.
       */
      public fun egressAddress(egressAddress: IResolvable)

      /**
       * @param egressAddress the value to be set.
       */
      public fun egressAddress(egressAddress: ConnectionDetailsProperty)

      /**
       * @param egressAddress the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("336c132b0d25f767d1059a3ea84a3fa7d3b066d284d3f891e76cf01c17b8e8b2")
      public fun egressAddress(egressAddress: ConnectionDetailsProperty.Builder.() -> Unit)

      /**
       * @param ingressAddress the value to be set.
       */
      public fun ingressAddress(ingressAddress: IResolvable)

      /**
       * @param ingressAddress the value to be set.
       */
      public fun ingressAddress(ingressAddress: RangedConnectionDetailsProperty)

      /**
       * @param ingressAddress the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c53ea6ce13e333e8f4174ace094dcbce169eb410e806083728676510b763997")
      public fun ingressAddress(ingressAddress: RangedConnectionDetailsProperty.Builder.() -> Unit)

      /**
       * @param name the value to be set.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty.builder()

      /**
       * @param agentStatus the value to be set.
       */
      override fun agentStatus(agentStatus: String) {
        cdkBuilder.agentStatus(agentStatus)
      }

      /**
       * @param auditResults the value to be set.
       */
      override fun auditResults(auditResults: String) {
        cdkBuilder.auditResults(auditResults)
      }

      /**
       * @param egressAddress the value to be set.
       */
      override fun egressAddress(egressAddress: IResolvable) {
        cdkBuilder.egressAddress(egressAddress.let(IResolvable::unwrap))
      }

      /**
       * @param egressAddress the value to be set.
       */
      override fun egressAddress(egressAddress: ConnectionDetailsProperty) {
        cdkBuilder.egressAddress(egressAddress.let(ConnectionDetailsProperty::unwrap))
      }

      /**
       * @param egressAddress the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("336c132b0d25f767d1059a3ea84a3fa7d3b066d284d3f891e76cf01c17b8e8b2")
      override fun egressAddress(egressAddress: ConnectionDetailsProperty.Builder.() -> Unit): Unit
          = egressAddress(ConnectionDetailsProperty(egressAddress))

      /**
       * @param ingressAddress the value to be set.
       */
      override fun ingressAddress(ingressAddress: IResolvable) {
        cdkBuilder.ingressAddress(ingressAddress.let(IResolvable::unwrap))
      }

      /**
       * @param ingressAddress the value to be set.
       */
      override fun ingressAddress(ingressAddress: RangedConnectionDetailsProperty) {
        cdkBuilder.ingressAddress(ingressAddress.let(RangedConnectionDetailsProperty::unwrap))
      }

      /**
       * @param ingressAddress the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c53ea6ce13e333e8f4174ace094dcbce169eb410e806083728676510b763997")
      override
          fun ingressAddress(ingressAddress: RangedConnectionDetailsProperty.Builder.() -> Unit):
          Unit = ingressAddress(RangedConnectionDetailsProperty(ingressAddress))

      /**
       * @param name the value to be set.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty,
    ) : CdkObject(cdkObject), AwsGroundStationAgentEndpointProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint.html#cfn-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint-agentstatus)
       */
      override fun agentStatus(): String? = unwrap(this).getAgentStatus()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint.html#cfn-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint-auditresults)
       */
      override fun auditResults(): String? = unwrap(this).getAuditResults()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint.html#cfn-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint-egressaddress)
       */
      override fun egressAddress(): Any? = unwrap(this).getEgressAddress()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint.html#cfn-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint-ingressaddress)
       */
      override fun ingressAddress(): Any? = unwrap(this).getIngressAddress()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint.html#cfn-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AwsGroundStationAgentEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty):
          AwsGroundStationAgentEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsGroundStationAgentEndpointProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty
    }
  }

  /**
   * Contains information such as socket address and name that defines an endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * DataflowEndpointProperty dataflowEndpointProperty = DataflowEndpointProperty.builder()
   * .address(SocketAddressProperty.builder()
   * .name("name")
   * .port(123)
   * .build())
   * .mtu(123)
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-dataflowendpoint.html)
   */
  public interface DataflowEndpointProperty {
    /**
     * The address and port of an endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-dataflowendpoint.html#cfn-groundstation-dataflowendpointgroup-dataflowendpoint-address)
     */
    public fun address(): Any? = unwrap(this).getAddress()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-dataflowendpoint.html#cfn-groundstation-dataflowendpointgroup-dataflowendpoint-mtu)
     */
    public fun mtu(): Number? = unwrap(this).getMtu()

    /**
     * The endpoint name.
     *
     * When listing available contacts for a satellite, Ground Station searches for a dataflow
     * endpoint whose name matches the value specified by the dataflow endpoint config of the selected
     * mission profile. If no matching dataflow endpoints are found then Ground Station will not
     * display any available contacts for the satellite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-dataflowendpoint.html#cfn-groundstation-dataflowendpointgroup-dataflowendpoint-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [DataflowEndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The address and port of an endpoint.
       */
      public fun address(address: IResolvable)

      /**
       * @param address The address and port of an endpoint.
       */
      public fun address(address: SocketAddressProperty)

      /**
       * @param address The address and port of an endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c22281e2c1be722282ec553df97b7e8c25b0d1520a7c5d2582e1117650aa4fe")
      public fun address(address: SocketAddressProperty.Builder.() -> Unit)

      /**
       * @param mtu the value to be set.
       */
      public fun mtu(mtu: Number)

      /**
       * @param name The endpoint name.
       * When listing available contacts for a satellite, Ground Station searches for a dataflow
       * endpoint whose name matches the value specified by the dataflow endpoint config of the
       * selected mission profile. If no matching dataflow endpoints are found then Ground Station will
       * not display any available contacts for the satellite.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty.builder()

      /**
       * @param address The address and port of an endpoint.
       */
      override fun address(address: IResolvable) {
        cdkBuilder.address(address.let(IResolvable::unwrap))
      }

      /**
       * @param address The address and port of an endpoint.
       */
      override fun address(address: SocketAddressProperty) {
        cdkBuilder.address(address.let(SocketAddressProperty::unwrap))
      }

      /**
       * @param address The address and port of an endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c22281e2c1be722282ec553df97b7e8c25b0d1520a7c5d2582e1117650aa4fe")
      override fun address(address: SocketAddressProperty.Builder.() -> Unit): Unit =
          address(SocketAddressProperty(address))

      /**
       * @param mtu the value to be set.
       */
      override fun mtu(mtu: Number) {
        cdkBuilder.mtu(mtu)
      }

      /**
       * @param name The endpoint name.
       * When listing available contacts for a satellite, Ground Station searches for a dataflow
       * endpoint whose name matches the value specified by the dataflow endpoint config of the
       * selected mission profile. If no matching dataflow endpoints are found then Ground Station will
       * not display any available contacts for the satellite.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty,
    ) : CdkObject(cdkObject), DataflowEndpointProperty {
      /**
       * The address and port of an endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-dataflowendpoint.html#cfn-groundstation-dataflowendpointgroup-dataflowendpoint-address)
       */
      override fun address(): Any? = unwrap(this).getAddress()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-dataflowendpoint.html#cfn-groundstation-dataflowendpointgroup-dataflowendpoint-mtu)
       */
      override fun mtu(): Number? = unwrap(this).getMtu()

      /**
       * The endpoint name.
       *
       * When listing available contacts for a satellite, Ground Station searches for a dataflow
       * endpoint whose name matches the value specified by the dataflow endpoint config of the
       * selected mission profile. If no matching dataflow endpoints are found then Ground Station will
       * not display any available contacts for the satellite.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-dataflowendpoint.html#cfn-groundstation-dataflowendpointgroup-dataflowendpoint-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataflowEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty):
          DataflowEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataflowEndpointProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * RangedSocketAddressProperty rangedSocketAddressProperty = RangedSocketAddressProperty.builder()
   * .name("name")
   * .portRange(IntegerRangeProperty.builder()
   * .maximum(123)
   * .minimum(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-rangedsocketaddress.html)
   */
  public interface RangedSocketAddressProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-rangedsocketaddress.html#cfn-groundstation-dataflowendpointgroup-rangedsocketaddress-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-rangedsocketaddress.html#cfn-groundstation-dataflowendpointgroup-rangedsocketaddress-portrange)
     */
    public fun portRange(): Any? = unwrap(this).getPortRange()

    /**
     * A builder for [RangedSocketAddressProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name the value to be set.
       */
      public fun name(name: String)

      /**
       * @param portRange the value to be set.
       */
      public fun portRange(portRange: IResolvable)

      /**
       * @param portRange the value to be set.
       */
      public fun portRange(portRange: IntegerRangeProperty)

      /**
       * @param portRange the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cde4cf2cf5372804eb7a2b7a391279e90db97ba40d1079ce4579f149aee5dd89")
      public fun portRange(portRange: IntegerRangeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedSocketAddressProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedSocketAddressProperty.builder()

      /**
       * @param name the value to be set.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param portRange the value to be set.
       */
      override fun portRange(portRange: IResolvable) {
        cdkBuilder.portRange(portRange.let(IResolvable::unwrap))
      }

      /**
       * @param portRange the value to be set.
       */
      override fun portRange(portRange: IntegerRangeProperty) {
        cdkBuilder.portRange(portRange.let(IntegerRangeProperty::unwrap))
      }

      /**
       * @param portRange the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cde4cf2cf5372804eb7a2b7a391279e90db97ba40d1079ce4579f149aee5dd89")
      override fun portRange(portRange: IntegerRangeProperty.Builder.() -> Unit): Unit =
          portRange(IntegerRangeProperty(portRange))

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedSocketAddressProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedSocketAddressProperty,
    ) : CdkObject(cdkObject), RangedSocketAddressProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-rangedsocketaddress.html#cfn-groundstation-dataflowendpointgroup-rangedsocketaddress-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-rangedsocketaddress.html#cfn-groundstation-dataflowendpointgroup-rangedsocketaddress-portrange)
       */
      override fun portRange(): Any? = unwrap(this).getPortRange()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RangedSocketAddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedSocketAddressProperty):
          RangedSocketAddressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RangedSocketAddressProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedSocketAddressProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedSocketAddressProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * ConnectionDetailsProperty connectionDetailsProperty = ConnectionDetailsProperty.builder()
   * .mtu(123)
   * .socketAddress(SocketAddressProperty.builder()
   * .name("name")
   * .port(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-connectiondetails.html)
   */
  public interface ConnectionDetailsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-connectiondetails.html#cfn-groundstation-dataflowendpointgroup-connectiondetails-mtu)
     */
    public fun mtu(): Number? = unwrap(this).getMtu()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-connectiondetails.html#cfn-groundstation-dataflowendpointgroup-connectiondetails-socketaddress)
     */
    public fun socketAddress(): Any? = unwrap(this).getSocketAddress()

    /**
     * A builder for [ConnectionDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mtu the value to be set.
       */
      public fun mtu(mtu: Number)

      /**
       * @param socketAddress the value to be set.
       */
      public fun socketAddress(socketAddress: IResolvable)

      /**
       * @param socketAddress the value to be set.
       */
      public fun socketAddress(socketAddress: SocketAddressProperty)

      /**
       * @param socketAddress the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81ed04a1adb8c8052f056c410ed46e12541ca7ba459450fe5089a62403e919be")
      public fun socketAddress(socketAddress: SocketAddressProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.ConnectionDetailsProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.ConnectionDetailsProperty.builder()

      /**
       * @param mtu the value to be set.
       */
      override fun mtu(mtu: Number) {
        cdkBuilder.mtu(mtu)
      }

      /**
       * @param socketAddress the value to be set.
       */
      override fun socketAddress(socketAddress: IResolvable) {
        cdkBuilder.socketAddress(socketAddress.let(IResolvable::unwrap))
      }

      /**
       * @param socketAddress the value to be set.
       */
      override fun socketAddress(socketAddress: SocketAddressProperty) {
        cdkBuilder.socketAddress(socketAddress.let(SocketAddressProperty::unwrap))
      }

      /**
       * @param socketAddress the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81ed04a1adb8c8052f056c410ed46e12541ca7ba459450fe5089a62403e919be")
      override fun socketAddress(socketAddress: SocketAddressProperty.Builder.() -> Unit): Unit =
          socketAddress(SocketAddressProperty(socketAddress))

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.ConnectionDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.ConnectionDetailsProperty,
    ) : CdkObject(cdkObject), ConnectionDetailsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-connectiondetails.html#cfn-groundstation-dataflowendpointgroup-connectiondetails-mtu)
       */
      override fun mtu(): Number? = unwrap(this).getMtu()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-connectiondetails.html#cfn-groundstation-dataflowendpointgroup-connectiondetails-socketaddress)
       */
      override fun socketAddress(): Any? = unwrap(this).getSocketAddress()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.ConnectionDetailsProperty):
          ConnectionDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionDetailsProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.ConnectionDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.ConnectionDetailsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * IntegerRangeProperty integerRangeProperty = IntegerRangeProperty.builder()
   * .maximum(123)
   * .minimum(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-integerrange.html)
   */
  public interface IntegerRangeProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-integerrange.html#cfn-groundstation-dataflowendpointgroup-integerrange-maximum)
     */
    public fun maximum(): Number? = unwrap(this).getMaximum()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-integerrange.html#cfn-groundstation-dataflowendpointgroup-integerrange-minimum)
     */
    public fun minimum(): Number? = unwrap(this).getMinimum()

    /**
     * A builder for [IntegerRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximum the value to be set.
       */
      public fun maximum(maximum: Number)

      /**
       * @param minimum the value to be set.
       */
      public fun minimum(minimum: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.IntegerRangeProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.IntegerRangeProperty.builder()

      /**
       * @param maximum the value to be set.
       */
      override fun maximum(maximum: Number) {
        cdkBuilder.maximum(maximum)
      }

      /**
       * @param minimum the value to be set.
       */
      override fun minimum(minimum: Number) {
        cdkBuilder.minimum(minimum)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.IntegerRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.IntegerRangeProperty,
    ) : CdkObject(cdkObject), IntegerRangeProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-integerrange.html#cfn-groundstation-dataflowendpointgroup-integerrange-maximum)
       */
      override fun maximum(): Number? = unwrap(this).getMaximum()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-integerrange.html#cfn-groundstation-dataflowendpointgroup-integerrange-minimum)
       */
      override fun minimum(): Number? = unwrap(this).getMinimum()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntegerRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.IntegerRangeProperty):
          IntegerRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegerRangeProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.IntegerRangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.IntegerRangeProperty
    }
  }

  /**
   * Information about IAM roles, subnets, and security groups needed for this
   * DataflowEndpointGroup.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * SecurityDetailsProperty securityDetailsProperty = SecurityDetailsProperty.builder()
   * .roleArn("roleArn")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-securitydetails.html)
   */
  public interface SecurityDetailsProperty {
    /**
     * The ARN of a role which Ground Station has permission to assume, such as
     * `arn:aws:iam::1234567890:role/DataDeliveryServiceRole` .
     *
     * Ground Station will assume this role and create an ENI in your VPC on the specified subnet
     * upon creation of a dataflow endpoint group. This ENI is used as the ingress/egress point for
     * data streamed during a satellite contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-securitydetails.html#cfn-groundstation-dataflowendpointgroup-securitydetails-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The security group Ids of the security role, such as `sg-1234567890abcdef0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-securitydetails.html#cfn-groundstation-dataflowendpointgroup-securitydetails-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * The subnet Ids of the security details, such as `subnet-12345678` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-securitydetails.html#cfn-groundstation-dataflowendpointgroup-securitydetails-subnetids)
     */
    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * A builder for [SecurityDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param roleArn The ARN of a role which Ground Station has permission to assume, such as
       * `arn:aws:iam::1234567890:role/DataDeliveryServiceRole` .
       * Ground Station will assume this role and create an ENI in your VPC on the specified subnet
       * upon creation of a dataflow endpoint group. This ENI is used as the ingress/egress point for
       * data streamed during a satellite contact.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param securityGroupIds The security group Ids of the security role, such as
       * `sg-1234567890abcdef0` .
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The security group Ids of the security role, such as
       * `sg-1234567890abcdef0` .
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds The subnet Ids of the security details, such as `subnet-12345678` .
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds The subnet Ids of the security details, such as `subnet-12345678` .
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty.builder()

      /**
       * @param roleArn The ARN of a role which Ground Station has permission to assume, such as
       * `arn:aws:iam::1234567890:role/DataDeliveryServiceRole` .
       * Ground Station will assume this role and create an ENI in your VPC on the specified subnet
       * upon creation of a dataflow endpoint group. This ENI is used as the ingress/egress point for
       * data streamed during a satellite contact.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param securityGroupIds The security group Ids of the security role, such as
       * `sg-1234567890abcdef0` .
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The security group Ids of the security role, such as
       * `sg-1234567890abcdef0` .
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds The subnet Ids of the security details, such as `subnet-12345678` .
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds The subnet Ids of the security details, such as `subnet-12345678` .
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty,
    ) : CdkObject(cdkObject), SecurityDetailsProperty {
      /**
       * The ARN of a role which Ground Station has permission to assume, such as
       * `arn:aws:iam::1234567890:role/DataDeliveryServiceRole` .
       *
       * Ground Station will assume this role and create an ENI in your VPC on the specified subnet
       * upon creation of a dataflow endpoint group. This ENI is used as the ingress/egress point for
       * data streamed during a satellite contact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-securitydetails.html#cfn-groundstation-dataflowendpointgroup-securitydetails-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * The security group Ids of the security role, such as `sg-1234567890abcdef0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-securitydetails.html#cfn-groundstation-dataflowendpointgroup-securitydetails-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * The subnet Ids of the security details, such as `subnet-12345678` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-securitydetails.html#cfn-groundstation-dataflowendpointgroup-securitydetails-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SecurityDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty):
          SecurityDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecurityDetailsProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty
    }
  }
}
