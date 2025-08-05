@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRegistry`.
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
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-registry.html)
 */
public interface CfnRegistryProps {
  /**
   * A description of the registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-registry.html#cfn-glue-registry-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-registry.html#cfn-glue-registry-name)
   */
  public fun name(): String

  /**
   * AWS tags that contain a key value pair and may be searched by console, command line, or API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-registry.html#cfn-glue-registry-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRegistryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the registry.
     */
    public fun description(description: String)

    /**
     * @param name The name of the registry. 
     */
    public fun name(name: String)

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnRegistryProps.Builder =
        software.amazon.awscdk.services.glue.CfnRegistryProps.builder()

    /**
     * @param description A description of the registry.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the registry. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.glue.CfnRegistryProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.glue.CfnRegistryProps,
  ) : CdkObject(cdkObject),
      CfnRegistryProps {
    /**
     * A description of the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-registry.html#cfn-glue-registry-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-registry.html#cfn-glue-registry-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * AWS tags that contain a key value pair and may be searched by console, command line, or API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-registry.html#cfn-glue-registry-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRegistryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnRegistryProps):
        CfnRegistryProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRegistryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRegistryProps):
        software.amazon.awscdk.services.glue.CfnRegistryProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.glue.CfnRegistryProps
  }
}
