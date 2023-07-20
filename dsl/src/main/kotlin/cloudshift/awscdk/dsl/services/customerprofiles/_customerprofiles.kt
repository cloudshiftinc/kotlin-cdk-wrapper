@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.customerprofiles

import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps
import software.amazon.awscdk.services.customerprofiles.CfnDomain
import software.amazon.awscdk.services.customerprofiles.CfnDomainProps
import software.amazon.awscdk.services.customerprofiles.CfnEventStream
import software.amazon.awscdk.services.customerprofiles.CfnEventStreamProps
import software.amazon.awscdk.services.customerprofiles.CfnIntegration
import software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps
import software.amazon.awscdk.services.customerprofiles.CfnObjectType
import software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object customerprofiles {
    public inline fun cfnCalculatedAttributeDefinition(
        scope: Construct,
        id: String,
        block: CfnCalculatedAttributeDefinitionDsl.() -> Unit = {},
    ): CfnCalculatedAttributeDefinition {
        val builder = CfnCalculatedAttributeDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCalculatedAttributeDefinitionAttributeDetailsProperty(
        block: CfnCalculatedAttributeDefinitionAttributeDetailsPropertyDsl.() -> Unit =
            {},
    ): CfnCalculatedAttributeDefinition.AttributeDetailsProperty {
        val builder = CfnCalculatedAttributeDefinitionAttributeDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCalculatedAttributeDefinitionAttributeItemProperty(
        block: CfnCalculatedAttributeDefinitionAttributeItemPropertyDsl.() -> Unit =
            {},
    ): CfnCalculatedAttributeDefinition.AttributeItemProperty {
        val builder = CfnCalculatedAttributeDefinitionAttributeItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCalculatedAttributeDefinitionConditionsProperty(
        block: CfnCalculatedAttributeDefinitionConditionsPropertyDsl.() -> Unit =
            {},
    ): CfnCalculatedAttributeDefinition.ConditionsProperty {
        val builder = CfnCalculatedAttributeDefinitionConditionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCalculatedAttributeDefinitionProps(
        block: CfnCalculatedAttributeDefinitionPropsDsl.() -> Unit =
            {},
    ): CfnCalculatedAttributeDefinitionProps {
        val builder = CfnCalculatedAttributeDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCalculatedAttributeDefinitionRangeProperty(
        block: CfnCalculatedAttributeDefinitionRangePropertyDsl.() -> Unit =
            {},
    ): CfnCalculatedAttributeDefinition.RangeProperty {
        val builder = CfnCalculatedAttributeDefinitionRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCalculatedAttributeDefinitionThresholdProperty(
        block: CfnCalculatedAttributeDefinitionThresholdPropertyDsl.() -> Unit =
            {},
    ): CfnCalculatedAttributeDefinition.ThresholdProperty {
        val builder = CfnCalculatedAttributeDefinitionThresholdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDomain(
        scope: Construct,
        id: String,
        block: CfnDomainDsl.() -> Unit = {},
    ): CfnDomain {
        val builder = CfnDomainDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDomainProps(block: CfnDomainPropsDsl.() -> Unit = {}): CfnDomainProps {
        val builder = CfnDomainPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEventStream(
        scope: Construct,
        id: String,
        block: CfnEventStreamDsl.() -> Unit = {},
    ): CfnEventStream {
        val builder = CfnEventStreamDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEventStreamDestinationDetailsProperty(
        block: CfnEventStreamDestinationDetailsPropertyDsl.() -> Unit =
            {},
    ): CfnEventStream.DestinationDetailsProperty {
        val builder = CfnEventStreamDestinationDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEventStreamProps(block: CfnEventStreamPropsDsl.() -> Unit = {}): CfnEventStreamProps {
        val builder = CfnEventStreamPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegration(
        scope: Construct,
        id: String,
        block: CfnIntegrationDsl.() -> Unit = {},
    ): CfnIntegration {
        val builder = CfnIntegrationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationConnectorOperatorProperty(
        block: CfnIntegrationConnectorOperatorPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.ConnectorOperatorProperty {
        val builder = CfnIntegrationConnectorOperatorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationFlowDefinitionProperty(
        block: CfnIntegrationFlowDefinitionPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.FlowDefinitionProperty {
        val builder = CfnIntegrationFlowDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationIncrementalPullConfigProperty(
        block: CfnIntegrationIncrementalPullConfigPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.IncrementalPullConfigProperty {
        val builder = CfnIntegrationIncrementalPullConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationMarketoSourcePropertiesProperty(
        block: CfnIntegrationMarketoSourcePropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.MarketoSourcePropertiesProperty {
        val builder = CfnIntegrationMarketoSourcePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationObjectTypeMappingProperty(
        block: CfnIntegrationObjectTypeMappingPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.ObjectTypeMappingProperty {
        val builder = CfnIntegrationObjectTypeMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationProps(block: CfnIntegrationPropsDsl.() -> Unit = {}): CfnIntegrationProps {
        val builder = CfnIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationS3SourcePropertiesProperty(
        block: CfnIntegrationS3SourcePropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.S3SourcePropertiesProperty {
        val builder = CfnIntegrationS3SourcePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationSalesforceSourcePropertiesProperty(
        block: CfnIntegrationSalesforceSourcePropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.SalesforceSourcePropertiesProperty {
        val builder = CfnIntegrationSalesforceSourcePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationScheduledTriggerPropertiesProperty(
        block: CfnIntegrationScheduledTriggerPropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.ScheduledTriggerPropertiesProperty {
        val builder = CfnIntegrationScheduledTriggerPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationServiceNowSourcePropertiesProperty(
        block: CfnIntegrationServiceNowSourcePropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.ServiceNowSourcePropertiesProperty {
        val builder = CfnIntegrationServiceNowSourcePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationSourceConnectorPropertiesProperty(
        block: CfnIntegrationSourceConnectorPropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.SourceConnectorPropertiesProperty {
        val builder = CfnIntegrationSourceConnectorPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationSourceFlowConfigProperty(
        block: CfnIntegrationSourceFlowConfigPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.SourceFlowConfigProperty {
        val builder = CfnIntegrationSourceFlowConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationTaskPropertiesMapProperty(
        block: CfnIntegrationTaskPropertiesMapPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.TaskPropertiesMapProperty {
        val builder = CfnIntegrationTaskPropertiesMapPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationTaskProperty(
        block: CfnIntegrationTaskPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.TaskProperty {
        val builder = CfnIntegrationTaskPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationTriggerConfigProperty(
        block: CfnIntegrationTriggerConfigPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.TriggerConfigProperty {
        val builder = CfnIntegrationTriggerConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationTriggerPropertiesProperty(
        block: CfnIntegrationTriggerPropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.TriggerPropertiesProperty {
        val builder = CfnIntegrationTriggerPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationZendeskSourcePropertiesProperty(
        block: CfnIntegrationZendeskSourcePropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnIntegration.ZendeskSourcePropertiesProperty {
        val builder = CfnIntegrationZendeskSourcePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnObjectType(
        scope: Construct,
        id: String,
        block: CfnObjectTypeDsl.() -> Unit = {},
    ): CfnObjectType {
        val builder = CfnObjectTypeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnObjectTypeFieldMapProperty(
        block: CfnObjectTypeFieldMapPropertyDsl.() -> Unit =
            {},
    ): CfnObjectType.FieldMapProperty {
        val builder = CfnObjectTypeFieldMapPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnObjectTypeKeyMapProperty(
        block: CfnObjectTypeKeyMapPropertyDsl.() -> Unit =
            {},
    ): CfnObjectType.KeyMapProperty {
        val builder = CfnObjectTypeKeyMapPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnObjectTypeObjectTypeFieldProperty(
        block: CfnObjectTypeObjectTypeFieldPropertyDsl.() -> Unit =
            {},
    ): CfnObjectType.ObjectTypeFieldProperty {
        val builder = CfnObjectTypeObjectTypeFieldPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnObjectTypeObjectTypeKeyProperty(
        block: CfnObjectTypeObjectTypeKeyPropertyDsl.() -> Unit =
            {},
    ): CfnObjectType.ObjectTypeKeyProperty {
        val builder = CfnObjectTypeObjectTypeKeyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnObjectTypeProps(block: CfnObjectTypePropsDsl.() -> Unit = {}): CfnObjectTypeProps {
        val builder = CfnObjectTypePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
