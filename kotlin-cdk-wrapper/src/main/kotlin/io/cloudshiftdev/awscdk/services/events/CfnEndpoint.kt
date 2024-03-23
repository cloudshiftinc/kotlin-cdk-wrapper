@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A global endpoint used to improve your application's availability by making it regional-fault
 * tolerant.
 *
 * For more information about global endpoints, see [Making applications Regional-fault tolerant
 * with global endpoints and event
 * replication](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-global-endpoints.html) in
 * the *Amazon EventBridge User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * CfnEndpoint cfnEndpoint = CfnEndpoint.Builder.create(this, "MyCfnEndpoint")
 * .eventBuses(List.of(EndpointEventBusProperty.builder()
 * .eventBusArn("eventBusArn")
 * .build()))
 * .routingConfig(RoutingConfigProperty.builder()
 * .failoverConfig(FailoverConfigProperty.builder()
 * .primary(PrimaryProperty.builder()
 * .healthCheck("healthCheck")
 * .build())
 * .secondary(SecondaryProperty.builder()
 * .route("route")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .replicationConfig(ReplicationConfigProperty.builder()
 * .state("state")
 * .build())
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html)
 */
public open class CfnEndpoint(
  cdkObject: software.amazon.awscdk.services.events.CfnEndpoint,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEndpointProps,
  ) :
      this(software.amazon.awscdk.services.events.CfnEndpoint(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnEndpointProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEndpointProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEndpointProps(props)
  )

  /**
   * The ARN of the endpoint.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the endpoint.
   */
  public open fun attrEndpointId(): String = unwrap(this).getAttrEndpointId()

  /**
   * The URL of the endpoint.
   */
  public open fun attrEndpointUrl(): String = unwrap(this).getAttrEndpointUrl()

  /**
   * The main Region of the endpoint.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The reason the endpoint is in its current state.
   */
  public open fun attrStateReason(): String = unwrap(this).getAttrStateReason()

  /**
   * A description for the endpoint.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the endpoint.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The event buses being used by the endpoint.
   */
  public open fun eventBuses(): Any = unwrap(this).getEventBuses()

  /**
   * The event buses being used by the endpoint.
   */
  public open fun eventBuses(`value`: IResolvable) {
    unwrap(this).setEventBuses(`value`.let(IResolvable::unwrap))
  }

  /**
   * The event buses being used by the endpoint.
   */
  public open fun eventBuses(`value`: List<Any>) {
    unwrap(this).setEventBuses(`value`)
  }

  /**
   * The event buses being used by the endpoint.
   */
  public open fun eventBuses(vararg `value`: Any): Unit = eventBuses(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the endpoint.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the endpoint.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Whether event replication was enabled or disabled for this endpoint.
   */
  public open fun replicationConfig(): Any? = unwrap(this).getReplicationConfig()

  /**
   * Whether event replication was enabled or disabled for this endpoint.
   */
  public open fun replicationConfig(`value`: IResolvable) {
    unwrap(this).setReplicationConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Whether event replication was enabled or disabled for this endpoint.
   */
  public open fun replicationConfig(`value`: ReplicationConfigProperty) {
    unwrap(this).setReplicationConfig(`value`.let(ReplicationConfigProperty::unwrap))
  }

  /**
   * Whether event replication was enabled or disabled for this endpoint.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bb179bb413e7502bfecb694cd445f0eea606b383ed87bbf3f6df0b8e4e28b62f")
  public open fun replicationConfig(`value`: ReplicationConfigProperty.Builder.() -> Unit): Unit =
      replicationConfig(ReplicationConfigProperty(`value`))

  /**
   * The ARN of the role used by event replication for the endpoint.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The ARN of the role used by event replication for the endpoint.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The routing configuration of the endpoint.
   */
  public open fun routingConfig(): Any = unwrap(this).getRoutingConfig()

  /**
   * The routing configuration of the endpoint.
   */
  public open fun routingConfig(`value`: IResolvable) {
    unwrap(this).setRoutingConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The routing configuration of the endpoint.
   */
  public open fun routingConfig(`value`: RoutingConfigProperty) {
    unwrap(this).setRoutingConfig(`value`.let(RoutingConfigProperty::unwrap))
  }

  /**
   * The routing configuration of the endpoint.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("018e5d0a7fc0c3ea68061bda3bed3517c5cfadb6b6d79d23fd4f3c688698d42c")
  public open fun routingConfig(`value`: RoutingConfigProperty.Builder.() -> Unit): Unit =
      routingConfig(RoutingConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.CfnEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-description)
     * @param description A description for the endpoint. 
     */
    public fun description(description: String)

    /**
     * The event buses being used by the endpoint.
     *
     * *Exactly* : `2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-eventbuses)
     * @param eventBuses The event buses being used by the endpoint. 
     */
    public fun eventBuses(eventBuses: IResolvable)

    /**
     * The event buses being used by the endpoint.
     *
     * *Exactly* : `2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-eventbuses)
     * @param eventBuses The event buses being used by the endpoint. 
     */
    public fun eventBuses(eventBuses: List<Any>)

    /**
     * The event buses being used by the endpoint.
     *
     * *Exactly* : `2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-eventbuses)
     * @param eventBuses The event buses being used by the endpoint. 
     */
    public fun eventBuses(vararg eventBuses: Any)

    /**
     * The name of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-name)
     * @param name The name of the endpoint. 
     */
    public fun name(name: String)

    /**
     * Whether event replication was enabled or disabled for this endpoint.
     *
     * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
     * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-replicationconfig)
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     * 
     */
    public fun replicationConfig(replicationConfig: IResolvable)

    /**
     * Whether event replication was enabled or disabled for this endpoint.
     *
     * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
     * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-replicationconfig)
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     * 
     */
    public fun replicationConfig(replicationConfig: ReplicationConfigProperty)

    /**
     * Whether event replication was enabled or disabled for this endpoint.
     *
     * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
     * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-replicationconfig)
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9fbd3c3749022dff789ce44ab31bef0639788cee39515b62e26328cf9cca128")
    public fun replicationConfig(replicationConfig: ReplicationConfigProperty.Builder.() -> Unit)

    /**
     * The ARN of the role used by event replication for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-rolearn)
     * @param roleArn The ARN of the role used by event replication for the endpoint. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The routing configuration of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-routingconfig)
     * @param routingConfig The routing configuration of the endpoint. 
     */
    public fun routingConfig(routingConfig: IResolvable)

    /**
     * The routing configuration of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-routingconfig)
     * @param routingConfig The routing configuration of the endpoint. 
     */
    public fun routingConfig(routingConfig: RoutingConfigProperty)

    /**
     * The routing configuration of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-routingconfig)
     * @param routingConfig The routing configuration of the endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34380cb8c43c8004bcf1af22bf8bc416de468b6de50c36decd7bd5cf34e72171")
    public fun routingConfig(routingConfig: RoutingConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnEndpoint.Builder =
        software.amazon.awscdk.services.events.CfnEndpoint.Builder.create(scope, id)

    /**
     * A description for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-description)
     * @param description A description for the endpoint. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The event buses being used by the endpoint.
     *
     * *Exactly* : `2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-eventbuses)
     * @param eventBuses The event buses being used by the endpoint. 
     */
    override fun eventBuses(eventBuses: IResolvable) {
      cdkBuilder.eventBuses(eventBuses.let(IResolvable::unwrap))
    }

    /**
     * The event buses being used by the endpoint.
     *
     * *Exactly* : `2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-eventbuses)
     * @param eventBuses The event buses being used by the endpoint. 
     */
    override fun eventBuses(eventBuses: List<Any>) {
      cdkBuilder.eventBuses(eventBuses)
    }

    /**
     * The event buses being used by the endpoint.
     *
     * *Exactly* : `2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-eventbuses)
     * @param eventBuses The event buses being used by the endpoint. 
     */
    override fun eventBuses(vararg eventBuses: Any): Unit = eventBuses(eventBuses.toList())

    /**
     * The name of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-name)
     * @param name The name of the endpoint. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Whether event replication was enabled or disabled for this endpoint.
     *
     * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
     * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-replicationconfig)
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     * 
     */
    override fun replicationConfig(replicationConfig: IResolvable) {
      cdkBuilder.replicationConfig(replicationConfig.let(IResolvable::unwrap))
    }

    /**
     * Whether event replication was enabled or disabled for this endpoint.
     *
     * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
     * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-replicationconfig)
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     * 
     */
    override fun replicationConfig(replicationConfig: ReplicationConfigProperty) {
      cdkBuilder.replicationConfig(replicationConfig.let(ReplicationConfigProperty::unwrap))
    }

    /**
     * Whether event replication was enabled or disabled for this endpoint.
     *
     * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
     * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-replicationconfig)
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9fbd3c3749022dff789ce44ab31bef0639788cee39515b62e26328cf9cca128")
    override fun replicationConfig(replicationConfig: ReplicationConfigProperty.Builder.() -> Unit):
        Unit = replicationConfig(ReplicationConfigProperty(replicationConfig))

    /**
     * The ARN of the role used by event replication for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-rolearn)
     * @param roleArn The ARN of the role used by event replication for the endpoint. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The routing configuration of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-routingconfig)
     * @param routingConfig The routing configuration of the endpoint. 
     */
    override fun routingConfig(routingConfig: IResolvable) {
      cdkBuilder.routingConfig(routingConfig.let(IResolvable::unwrap))
    }

    /**
     * The routing configuration of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-routingconfig)
     * @param routingConfig The routing configuration of the endpoint. 
     */
    override fun routingConfig(routingConfig: RoutingConfigProperty) {
      cdkBuilder.routingConfig(routingConfig.let(RoutingConfigProperty::unwrap))
    }

    /**
     * The routing configuration of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-routingconfig)
     * @param routingConfig The routing configuration of the endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34380cb8c43c8004bcf1af22bf8bc416de468b6de50c36decd7bd5cf34e72171")
    override fun routingConfig(routingConfig: RoutingConfigProperty.Builder.() -> Unit): Unit =
        routingConfig(RoutingConfigProperty(routingConfig))

    public fun build(): software.amazon.awscdk.services.events.CfnEndpoint = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.events.CfnEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpoint): CfnEndpoint =
        CfnEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnEndpoint): software.amazon.awscdk.services.events.CfnEndpoint =
        wrapped.cdkObject as software.amazon.awscdk.services.events.CfnEndpoint
  }

  /**
   * The event buses the endpoint is associated with.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * EndpointEventBusProperty endpointEventBusProperty = EndpointEventBusProperty.builder()
   * .eventBusArn("eventBusArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-endpointeventbus.html)
   */
  public interface EndpointEventBusProperty {
    /**
     * The ARN of the event bus the endpoint is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-endpointeventbus.html#cfn-events-endpoint-endpointeventbus-eventbusarn)
     */
    public fun eventBusArn(): String

    /**
     * A builder for [EndpointEventBusProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventBusArn The ARN of the event bus the endpoint is associated with. 
       */
      public fun eventBusArn(eventBusArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEndpoint.EndpointEventBusProperty.Builder =
          software.amazon.awscdk.services.events.CfnEndpoint.EndpointEventBusProperty.builder()

      /**
       * @param eventBusArn The ARN of the event bus the endpoint is associated with. 
       */
      override fun eventBusArn(eventBusArn: String) {
        cdkBuilder.eventBusArn(eventBusArn)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnEndpoint.EndpointEventBusProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.EndpointEventBusProperty,
    ) : CdkObject(cdkObject), EndpointEventBusProperty {
      /**
       * The ARN of the event bus the endpoint is associated with.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-endpointeventbus.html#cfn-events-endpoint-endpointeventbus-eventbusarn)
       */
      override fun eventBusArn(): String = unwrap(this).getEventBusArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointEventBusProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.EndpointEventBusProperty):
          EndpointEventBusProperty = CdkObjectWrappers.wrap(cdkObject) as? EndpointEventBusProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointEventBusProperty):
          software.amazon.awscdk.services.events.CfnEndpoint.EndpointEventBusProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnEndpoint.EndpointEventBusProperty
    }
  }

  /**
   * The failover configuration for an endpoint.
   *
   * This includes what triggers failover and what happens when it's triggered.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * FailoverConfigProperty failoverConfigProperty = FailoverConfigProperty.builder()
   * .primary(PrimaryProperty.builder()
   * .healthCheck("healthCheck")
   * .build())
   * .secondary(SecondaryProperty.builder()
   * .route("route")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-failoverconfig.html)
   */
  public interface FailoverConfigProperty {
    /**
     * The main Region of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-failoverconfig.html#cfn-events-endpoint-failoverconfig-primary)
     */
    public fun primary(): Any

    /**
     * The Region that events are routed to when failover is triggered or event replication is
     * enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-failoverconfig.html#cfn-events-endpoint-failoverconfig-secondary)
     */
    public fun secondary(): Any

    /**
     * A builder for [FailoverConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param primary The main Region of the endpoint. 
       */
      public fun primary(primary: IResolvable)

      /**
       * @param primary The main Region of the endpoint. 
       */
      public fun primary(primary: PrimaryProperty)

      /**
       * @param primary The main Region of the endpoint. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a62d771df973cb5a72c7e270f89dc23414aeb08f5fc9e9937444f26f565b90c")
      public fun primary(primary: PrimaryProperty.Builder.() -> Unit)

      /**
       * @param secondary The Region that events are routed to when failover is triggered or event
       * replication is enabled. 
       */
      public fun secondary(secondary: IResolvable)

      /**
       * @param secondary The Region that events are routed to when failover is triggered or event
       * replication is enabled. 
       */
      public fun secondary(secondary: SecondaryProperty)

      /**
       * @param secondary The Region that events are routed to when failover is triggered or event
       * replication is enabled. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fff17fb41c63512ded3ee3d510421c5944b3c4000dda52c8ec07e507182c8de1")
      public fun secondary(secondary: SecondaryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEndpoint.FailoverConfigProperty.Builder =
          software.amazon.awscdk.services.events.CfnEndpoint.FailoverConfigProperty.builder()

      /**
       * @param primary The main Region of the endpoint. 
       */
      override fun primary(primary: IResolvable) {
        cdkBuilder.primary(primary.let(IResolvable::unwrap))
      }

      /**
       * @param primary The main Region of the endpoint. 
       */
      override fun primary(primary: PrimaryProperty) {
        cdkBuilder.primary(primary.let(PrimaryProperty::unwrap))
      }

      /**
       * @param primary The main Region of the endpoint. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a62d771df973cb5a72c7e270f89dc23414aeb08f5fc9e9937444f26f565b90c")
      override fun primary(primary: PrimaryProperty.Builder.() -> Unit): Unit =
          primary(PrimaryProperty(primary))

      /**
       * @param secondary The Region that events are routed to when failover is triggered or event
       * replication is enabled. 
       */
      override fun secondary(secondary: IResolvable) {
        cdkBuilder.secondary(secondary.let(IResolvable::unwrap))
      }

      /**
       * @param secondary The Region that events are routed to when failover is triggered or event
       * replication is enabled. 
       */
      override fun secondary(secondary: SecondaryProperty) {
        cdkBuilder.secondary(secondary.let(SecondaryProperty::unwrap))
      }

      /**
       * @param secondary The Region that events are routed to when failover is triggered or event
       * replication is enabled. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fff17fb41c63512ded3ee3d510421c5944b3c4000dda52c8ec07e507182c8de1")
      override fun secondary(secondary: SecondaryProperty.Builder.() -> Unit): Unit =
          secondary(SecondaryProperty(secondary))

      public fun build(): software.amazon.awscdk.services.events.CfnEndpoint.FailoverConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.FailoverConfigProperty,
    ) : CdkObject(cdkObject), FailoverConfigProperty {
      /**
       * The main Region of the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-failoverconfig.html#cfn-events-endpoint-failoverconfig-primary)
       */
      override fun primary(): Any = unwrap(this).getPrimary()

      /**
       * The Region that events are routed to when failover is triggered or event replication is
       * enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-failoverconfig.html#cfn-events-endpoint-failoverconfig-secondary)
       */
      override fun secondary(): Any = unwrap(this).getSecondary()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FailoverConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.FailoverConfigProperty):
          FailoverConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? FailoverConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FailoverConfigProperty):
          software.amazon.awscdk.services.events.CfnEndpoint.FailoverConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnEndpoint.FailoverConfigProperty
    }
  }

  /**
   * The primary Region of the endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * PrimaryProperty primaryProperty = PrimaryProperty.builder()
   * .healthCheck("healthCheck")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-primary.html)
   */
  public interface PrimaryProperty {
    /**
     * The ARN of the health check used by the endpoint to determine whether failover is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-primary.html#cfn-events-endpoint-primary-healthcheck)
     */
    public fun healthCheck(): String

    /**
     * A builder for [PrimaryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param healthCheck The ARN of the health check used by the endpoint to determine whether
       * failover is triggered. 
       */
      public fun healthCheck(healthCheck: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEndpoint.PrimaryProperty.Builder =
          software.amazon.awscdk.services.events.CfnEndpoint.PrimaryProperty.builder()

      /**
       * @param healthCheck The ARN of the health check used by the endpoint to determine whether
       * failover is triggered. 
       */
      override fun healthCheck(healthCheck: String) {
        cdkBuilder.healthCheck(healthCheck)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnEndpoint.PrimaryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.PrimaryProperty,
    ) : CdkObject(cdkObject), PrimaryProperty {
      /**
       * The ARN of the health check used by the endpoint to determine whether failover is
       * triggered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-primary.html#cfn-events-endpoint-primary-healthcheck)
       */
      override fun healthCheck(): String = unwrap(this).getHealthCheck()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrimaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.PrimaryProperty):
          PrimaryProperty = CdkObjectWrappers.wrap(cdkObject) as? PrimaryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrimaryProperty):
          software.amazon.awscdk.services.events.CfnEndpoint.PrimaryProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.events.CfnEndpoint.PrimaryProperty
    }
  }

  /**
   * Endpoints can replicate all events to the secondary Region.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * ReplicationConfigProperty replicationConfigProperty = ReplicationConfigProperty.builder()
   * .state("state")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-replicationconfig.html)
   */
  public interface ReplicationConfigProperty {
    /**
     * The state of event replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-replicationconfig.html#cfn-events-endpoint-replicationconfig-state)
     */
    public fun state(): String

    /**
     * A builder for [ReplicationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state The state of event replication. 
       */
      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEndpoint.ReplicationConfigProperty.Builder =
          software.amazon.awscdk.services.events.CfnEndpoint.ReplicationConfigProperty.builder()

      /**
       * @param state The state of event replication. 
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnEndpoint.ReplicationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.ReplicationConfigProperty,
    ) : CdkObject(cdkObject), ReplicationConfigProperty {
      /**
       * The state of event replication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-replicationconfig.html#cfn-events-endpoint-replicationconfig-state)
       */
      override fun state(): String = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.ReplicationConfigProperty):
          ReplicationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReplicationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationConfigProperty):
          software.amazon.awscdk.services.events.CfnEndpoint.ReplicationConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnEndpoint.ReplicationConfigProperty
    }
  }

  /**
   * The routing configuration of the endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * RoutingConfigProperty routingConfigProperty = RoutingConfigProperty.builder()
   * .failoverConfig(FailoverConfigProperty.builder()
   * .primary(PrimaryProperty.builder()
   * .healthCheck("healthCheck")
   * .build())
   * .secondary(SecondaryProperty.builder()
   * .route("route")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-routingconfig.html)
   */
  public interface RoutingConfigProperty {
    /**
     * The failover configuration for an endpoint.
     *
     * This includes what triggers failover and what happens when it's triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-routingconfig.html#cfn-events-endpoint-routingconfig-failoverconfig)
     */
    public fun failoverConfig(): Any

    /**
     * A builder for [RoutingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param failoverConfig The failover configuration for an endpoint. 
       * This includes what triggers failover and what happens when it's triggered.
       */
      public fun failoverConfig(failoverConfig: IResolvable)

      /**
       * @param failoverConfig The failover configuration for an endpoint. 
       * This includes what triggers failover and what happens when it's triggered.
       */
      public fun failoverConfig(failoverConfig: FailoverConfigProperty)

      /**
       * @param failoverConfig The failover configuration for an endpoint. 
       * This includes what triggers failover and what happens when it's triggered.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39c201bc9a8b40ad793a154eff923fe9e833d8422279f2fa895ef34d06ea5b98")
      public fun failoverConfig(failoverConfig: FailoverConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEndpoint.RoutingConfigProperty.Builder =
          software.amazon.awscdk.services.events.CfnEndpoint.RoutingConfigProperty.builder()

      /**
       * @param failoverConfig The failover configuration for an endpoint. 
       * This includes what triggers failover and what happens when it's triggered.
       */
      override fun failoverConfig(failoverConfig: IResolvable) {
        cdkBuilder.failoverConfig(failoverConfig.let(IResolvable::unwrap))
      }

      /**
       * @param failoverConfig The failover configuration for an endpoint. 
       * This includes what triggers failover and what happens when it's triggered.
       */
      override fun failoverConfig(failoverConfig: FailoverConfigProperty) {
        cdkBuilder.failoverConfig(failoverConfig.let(FailoverConfigProperty::unwrap))
      }

      /**
       * @param failoverConfig The failover configuration for an endpoint. 
       * This includes what triggers failover and what happens when it's triggered.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39c201bc9a8b40ad793a154eff923fe9e833d8422279f2fa895ef34d06ea5b98")
      override fun failoverConfig(failoverConfig: FailoverConfigProperty.Builder.() -> Unit): Unit =
          failoverConfig(FailoverConfigProperty(failoverConfig))

      public fun build(): software.amazon.awscdk.services.events.CfnEndpoint.RoutingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.RoutingConfigProperty,
    ) : CdkObject(cdkObject), RoutingConfigProperty {
      /**
       * The failover configuration for an endpoint.
       *
       * This includes what triggers failover and what happens when it's triggered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-routingconfig.html#cfn-events-endpoint-routingconfig-failoverconfig)
       */
      override fun failoverConfig(): Any = unwrap(this).getFailoverConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RoutingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.RoutingConfigProperty):
          RoutingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? RoutingConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoutingConfigProperty):
          software.amazon.awscdk.services.events.CfnEndpoint.RoutingConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnEndpoint.RoutingConfigProperty
    }
  }

  /**
   * The secondary Region that processes events when failover is triggered or replication is
   * enabled.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * SecondaryProperty secondaryProperty = SecondaryProperty.builder()
   * .route("route")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-secondary.html)
   */
  public interface SecondaryProperty {
    /**
     * Defines the secondary Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-secondary.html#cfn-events-endpoint-secondary-route)
     */
    public fun route(): String

    /**
     * A builder for [SecondaryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param route Defines the secondary Region. 
       */
      public fun route(route: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEndpoint.SecondaryProperty.Builder =
          software.amazon.awscdk.services.events.CfnEndpoint.SecondaryProperty.builder()

      /**
       * @param route Defines the secondary Region. 
       */
      override fun route(route: String) {
        cdkBuilder.route(route)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnEndpoint.SecondaryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.SecondaryProperty,
    ) : CdkObject(cdkObject), SecondaryProperty {
      /**
       * Defines the secondary Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-secondary.html#cfn-events-endpoint-secondary-route)
       */
      override fun route(): String = unwrap(this).getRoute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SecondaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.SecondaryProperty):
          SecondaryProperty = CdkObjectWrappers.wrap(cdkObject) as? SecondaryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecondaryProperty):
          software.amazon.awscdk.services.events.CfnEndpoint.SecondaryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnEndpoint.SecondaryProperty
    }
  }
}
