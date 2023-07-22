@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appintegrations

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration
import software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps
import software.amazon.awscdk.services.appintegrations.CfnEventIntegration
import software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps
import software.constructs.Construct

public object appintegrations {
  /**
   * Creates and persists a DataIntegration resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appintegrations.*;
   * Object filters;
   * Object objectConfiguration;
   * CfnDataIntegration cfnDataIntegration = CfnDataIntegration.Builder.create(this,
   * "MyCfnDataIntegration")
   * .kmsKey("kmsKey")
   * .name("name")
   * .scheduleConfig(ScheduleConfigProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * // the properties below are optional
   * .firstExecutionFrom("firstExecutionFrom")
   * .object("object")
   * .build())
   * .sourceUri("sourceUri")
   * // the properties below are optional
   * .description("description")
   * .fileConfiguration(FileConfigurationProperty.builder()
   * .folders(List.of("folders"))
   * // the properties below are optional
   * .filters(filters)
   * .build())
   * .objectConfiguration(objectConfiguration)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html)
   */
  public inline fun cfnDataIntegration(
    scope: Construct,
    id: String,
    block: CfnDataIntegrationDsl.() -> Unit = {},
  ): CfnDataIntegration {
    val builder = CfnDataIntegrationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The configuration for what files should be pulled from the source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appintegrations.*;
   * Object filters;
   * FileConfigurationProperty fileConfigurationProperty = FileConfigurationProperty.builder()
   * .folders(List.of("folders"))
   * // the properties below are optional
   * .filters(filters)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-fileconfiguration.html)
   */
  public inline
      fun cfnDataIntegrationFileConfigurationProperty(block: CfnDataIntegrationFileConfigurationPropertyDsl.() -> Unit
      = {}): CfnDataIntegration.FileConfigurationProperty {
    val builder = CfnDataIntegrationFileConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnDataIntegration`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appintegrations.*;
   * Object filters;
   * Object objectConfiguration;
   * CfnDataIntegrationProps cfnDataIntegrationProps = CfnDataIntegrationProps.builder()
   * .kmsKey("kmsKey")
   * .name("name")
   * .scheduleConfig(ScheduleConfigProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * // the properties below are optional
   * .firstExecutionFrom("firstExecutionFrom")
   * .object("object")
   * .build())
   * .sourceUri("sourceUri")
   * // the properties below are optional
   * .description("description")
   * .fileConfiguration(FileConfigurationProperty.builder()
   * .folders(List.of("folders"))
   * // the properties below are optional
   * .filters(filters)
   * .build())
   * .objectConfiguration(objectConfiguration)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html)
   */
  public inline fun cfnDataIntegrationProps(block: CfnDataIntegrationPropsDsl.() -> Unit = {}):
      CfnDataIntegrationProps {
    val builder = CfnDataIntegrationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The name of the data and how often it should be pulled from the source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appintegrations.*;
   * ScheduleConfigProperty scheduleConfigProperty = ScheduleConfigProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * // the properties below are optional
   * .firstExecutionFrom("firstExecutionFrom")
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-scheduleconfig.html)
   */
  public inline
      fun cfnDataIntegrationScheduleConfigProperty(block: CfnDataIntegrationScheduleConfigPropertyDsl.() -> Unit
      = {}): CfnDataIntegration.ScheduleConfigProperty {
    val builder = CfnDataIntegrationScheduleConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates an event integration.
   *
   * You provide a name, description, and a reference to an Amazon EventBridge bus in your account
   * and a partner event source that will push events to that bus. No objects are created in your
   * account, only metadata that is persisted on the EventIntegration control plane.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appintegrations.*;
   * CfnEventIntegration cfnEventIntegration = CfnEventIntegration.Builder.create(this,
   * "MyCfnEventIntegration")
   * .eventBridgeBus("eventBridgeBus")
   * .eventFilter(EventFilterProperty.builder()
   * .source("source")
   * .build())
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html)
   */
  public inline fun cfnEventIntegration(
    scope: Construct,
    id: String,
    block: CfnEventIntegrationDsl.() -> Unit = {},
  ): CfnEventIntegration {
    val builder = CfnEventIntegrationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The event integration filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appintegrations.*;
   * EventFilterProperty eventFilterProperty = EventFilterProperty.builder()
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-eventintegration-eventfilter.html)
   */
  public inline
      fun cfnEventIntegrationEventFilterProperty(block: CfnEventIntegrationEventFilterPropertyDsl.() -> Unit
      = {}): CfnEventIntegration.EventFilterProperty {
    val builder = CfnEventIntegrationEventFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnEventIntegration`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appintegrations.*;
   * CfnEventIntegrationProps cfnEventIntegrationProps = CfnEventIntegrationProps.builder()
   * .eventBridgeBus("eventBridgeBus")
   * .eventFilter(EventFilterProperty.builder()
   * .source("source")
   * .build())
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html)
   */
  public inline fun cfnEventIntegrationProps(block: CfnEventIntegrationPropsDsl.() -> Unit = {}):
      CfnEventIntegrationProps {
    val builder = CfnEventIntegrationPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
