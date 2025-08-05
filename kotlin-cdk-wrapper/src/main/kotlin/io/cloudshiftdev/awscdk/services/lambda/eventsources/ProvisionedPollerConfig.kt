@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * (Amazon MSK and self-managed Apache Kafka only) The provisioned mode configuration for the event
 * source.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.glue.CfnRegistry;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.ManagedKafkaEventSource;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.GlueSchemaRegistry;
 * // Your MSK cluster arn
 * String clusterArn;
 * Function myFunction;
 * // The Kafka topic you want to subscribe to
 * String topic = "some-cool-topic";
 * // Your Glue Schema Registry
 * CfnRegistry glueRegistry = CfnRegistry.Builder.create(this, "Registry")
 * .name("schema-registry")
 * .description("Schema registry for event source")
 * .build();
 * myFunction.addEventSource(ManagedKafkaEventSource.Builder.create()
 * .clusterArn(clusterArn)
 * .topic(topic)
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * .provisionedPollerConfig(ProvisionedPollerConfig.builder()
 * .minimumPollers(1)
 * .maximumPollers(3)
 * .build())
 * .schemaRegistryConfig(GlueSchemaRegistry.Builder.create()
 * .schemaRegistry(glueRegistry)
 * .eventRecordFormat(EventRecordFormat.JSON)
 * .schemaValidationConfigs(List.of(KafkaSchemaValidationConfig.builder().attribute(KafkaSchemaValidationAttribute.KEY).build()))
 * .build())
 * .build());
 * ```
 */
public interface ProvisionedPollerConfig {
  /**
   * The maximum number of pollers that can be provisioned.
   *
   * Default: 200
   */
  public fun maximumPollers(): Number

  /**
   * The minimum number of pollers that should be provisioned.
   *
   * Default: 1
   */
  public fun minimumPollers(): Number

  /**
   * A builder for [ProvisionedPollerConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maximumPollers The maximum number of pollers that can be provisioned. 
     */
    public fun maximumPollers(maximumPollers: Number)

    /**
     * @param minimumPollers The minimum number of pollers that should be provisioned. 
     */
    public fun minimumPollers(minimumPollers: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.ProvisionedPollerConfig.Builder =
        software.amazon.awscdk.services.lambda.eventsources.ProvisionedPollerConfig.builder()

    /**
     * @param maximumPollers The maximum number of pollers that can be provisioned. 
     */
    override fun maximumPollers(maximumPollers: Number) {
      cdkBuilder.maximumPollers(maximumPollers)
    }

    /**
     * @param minimumPollers The minimum number of pollers that should be provisioned. 
     */
    override fun minimumPollers(minimumPollers: Number) {
      cdkBuilder.minimumPollers(minimumPollers)
    }

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.ProvisionedPollerConfig
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.eventsources.ProvisionedPollerConfig,
  ) : CdkObject(cdkObject),
      ProvisionedPollerConfig {
    /**
     * The maximum number of pollers that can be provisioned.
     *
     * Default: 200
     */
    override fun maximumPollers(): Number = unwrap(this).getMaximumPollers()

    /**
     * The minimum number of pollers that should be provisioned.
     *
     * Default: 1
     */
    override fun minimumPollers(): Number = unwrap(this).getMinimumPollers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionedPollerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.ProvisionedPollerConfig):
        ProvisionedPollerConfig = CdkObjectWrappers.wrap(cdkObject) as? ProvisionedPollerConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProvisionedPollerConfig):
        software.amazon.awscdk.services.lambda.eventsources.ProvisionedPollerConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.ProvisionedPollerConfig
  }
}
