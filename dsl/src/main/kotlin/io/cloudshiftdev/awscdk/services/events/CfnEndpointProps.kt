package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnEndpointProps {
  /**
   * A description for the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The event buses being used by the endpoint.
   *
   * *Exactly* : `2`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-eventbuses)
   */
  public fun eventBuses(): Any

  /**
   * The name of the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Whether event replication was enabled or disabled for this endpoint.
   *
   * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
   * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-replicationconfig)
   */
  public fun replicationConfig(): Any? = unwrap(this).getReplicationConfig()

  /**
   * The ARN of the role used by event replication for the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The routing configuration of the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-routingconfig)
   */
  public fun routingConfig(): Any

  /**
   * A builder for [CfnEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description for the endpoint.
     */
    public fun description(description: String)

    /**
     * @param eventBuses The event buses being used by the endpoint. 
     * *Exactly* : `2`
     */
    public fun eventBuses(eventBuses: IResolvable)

    /**
     * @param eventBuses The event buses being used by the endpoint. 
     * *Exactly* : `2`
     */
    public fun eventBuses(eventBuses: List<Any>)

    /**
     * @param eventBuses The event buses being used by the endpoint. 
     * *Exactly* : `2`
     */
    public fun eventBuses(vararg eventBuses: Any)

    /**
     * @param name The name of the endpoint.
     */
    public fun name(name: String)

    /**
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
     * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     */
    public fun replicationConfig(replicationConfig: IResolvable)

    /**
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
     * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     */
    public fun replicationConfig(replicationConfig: CfnEndpoint.ReplicationConfigProperty)

    /**
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
     * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fa351b7c019bc3e7c126243278aa13713c2b4c485c414a3586f5d73b4a79371")
    public
        fun replicationConfig(replicationConfig: CfnEndpoint.ReplicationConfigProperty.Builder.() -> Unit)

    /**
     * @param roleArn The ARN of the role used by event replication for the endpoint.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param routingConfig The routing configuration of the endpoint. 
     */
    public fun routingConfig(routingConfig: IResolvable)

    /**
     * @param routingConfig The routing configuration of the endpoint. 
     */
    public fun routingConfig(routingConfig: CfnEndpoint.RoutingConfigProperty)

    /**
     * @param routingConfig The routing configuration of the endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e415056e0d0613e9acaa9f8469885a733c09738b15fe55931dd1df0efdaebce1")
    public fun routingConfig(routingConfig: CfnEndpoint.RoutingConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnEndpointProps.Builder =
        software.amazon.awscdk.services.events.CfnEndpointProps.builder()

    /**
     * @param description A description for the endpoint.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eventBuses The event buses being used by the endpoint. 
     * *Exactly* : `2`
     */
    override fun eventBuses(eventBuses: IResolvable) {
      cdkBuilder.eventBuses(eventBuses.let(IResolvable::unwrap))
    }

    /**
     * @param eventBuses The event buses being used by the endpoint. 
     * *Exactly* : `2`
     */
    override fun eventBuses(eventBuses: List<Any>) {
      cdkBuilder.eventBuses(eventBuses)
    }

    /**
     * @param eventBuses The event buses being used by the endpoint. 
     * *Exactly* : `2`
     */
    override fun eventBuses(vararg eventBuses: Any): Unit = eventBuses(eventBuses.toList())

    /**
     * @param name The name of the endpoint.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
     * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     */
    override fun replicationConfig(replicationConfig: IResolvable) {
      cdkBuilder.replicationConfig(replicationConfig.let(IResolvable::unwrap))
    }

    /**
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
     * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     */
    override fun replicationConfig(replicationConfig: CfnEndpoint.ReplicationConfigProperty) {
      cdkBuilder.replicationConfig(replicationConfig.let(CfnEndpoint.ReplicationConfigProperty::unwrap))
    }

    /**
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
     * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fa351b7c019bc3e7c126243278aa13713c2b4c485c414a3586f5d73b4a79371")
    override
        fun replicationConfig(replicationConfig: CfnEndpoint.ReplicationConfigProperty.Builder.() -> Unit):
        Unit = replicationConfig(CfnEndpoint.ReplicationConfigProperty(replicationConfig))

    /**
     * @param roleArn The ARN of the role used by event replication for the endpoint.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param routingConfig The routing configuration of the endpoint. 
     */
    override fun routingConfig(routingConfig: IResolvable) {
      cdkBuilder.routingConfig(routingConfig.let(IResolvable::unwrap))
    }

    /**
     * @param routingConfig The routing configuration of the endpoint. 
     */
    override fun routingConfig(routingConfig: CfnEndpoint.RoutingConfigProperty) {
      cdkBuilder.routingConfig(routingConfig.let(CfnEndpoint.RoutingConfigProperty::unwrap))
    }

    /**
     * @param routingConfig The routing configuration of the endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e415056e0d0613e9acaa9f8469885a733c09738b15fe55931dd1df0efdaebce1")
    override fun routingConfig(routingConfig: CfnEndpoint.RoutingConfigProperty.Builder.() -> Unit):
        Unit = routingConfig(CfnEndpoint.RoutingConfigProperty(routingConfig))

    public fun build(): software.amazon.awscdk.services.events.CfnEndpointProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.CfnEndpointProps,
  ) : CdkObject(cdkObject), CfnEndpointProps {
    /**
     * A description for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The event buses being used by the endpoint.
     *
     * *Exactly* : `2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-eventbuses)
     */
    override fun eventBuses(): Any = unwrap(this).getEventBuses()

    /**
     * The name of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Whether event replication was enabled or disabled for this endpoint.
     *
     * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
     * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-replicationconfig)
     */
    override fun replicationConfig(): Any? = unwrap(this).getReplicationConfig()

    /**
     * The ARN of the role used by event replication for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The routing configuration of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-routingconfig)
     */
    override fun routingConfig(): Any = unwrap(this).getRoutingConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpointProps):
        CfnEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointProps):
        software.amazon.awscdk.services.events.CfnEndpointProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.events.CfnEndpointProps
  }
}
