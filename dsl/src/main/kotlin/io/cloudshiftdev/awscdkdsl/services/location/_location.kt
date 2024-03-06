@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.location

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnAPIKey
import software.amazon.awscdk.services.location.CfnAPIKeyProps
import software.amazon.awscdk.services.location.CfnGeofenceCollection
import software.amazon.awscdk.services.location.CfnGeofenceCollectionProps
import software.amazon.awscdk.services.location.CfnMap
import software.amazon.awscdk.services.location.CfnMapProps
import software.amazon.awscdk.services.location.CfnPlaceIndex
import software.amazon.awscdk.services.location.CfnPlaceIndexProps
import software.amazon.awscdk.services.location.CfnRouteCalculator
import software.amazon.awscdk.services.location.CfnRouteCalculatorProps
import software.amazon.awscdk.services.location.CfnTracker
import software.amazon.awscdk.services.location.CfnTrackerConsumer
import software.amazon.awscdk.services.location.CfnTrackerConsumerProps
import software.amazon.awscdk.services.location.CfnTrackerProps
import software.constructs.Construct

public object location {
    /**
     * The API key resource in your AWS account, which lets you grant actions for Amazon Location
     * resources to the API key bearer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * CfnAPIKey cfnAPIKey = CfnAPIKey.Builder.create(this, "MyCfnAPIKey")
     * .keyName("keyName")
     * .restrictions(ApiKeyRestrictionsProperty.builder()
     * .allowActions(List.of("allowActions"))
     * .allowResources(List.of("allowResources"))
     * // the properties below are optional
     * .allowReferers(List.of("allowReferers"))
     * .build())
     * // the properties below are optional
     * .description("description")
     * .expireTime("expireTime")
     * .forceDelete(false)
     * .forceUpdate(false)
     * .noExpiry(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html)
     */
    public inline fun cfnAPIKey(
        scope: Construct,
        id: String,
        block: CfnAPIKeyDsl.() -> Unit = {},
    ): CfnAPIKey {
        val builder = CfnAPIKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * API Restrictions on the allowed actions, resources, and referers for an API key resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * ApiKeyRestrictionsProperty apiKeyRestrictionsProperty = ApiKeyRestrictionsProperty.builder()
     * .allowActions(List.of("allowActions"))
     * .allowResources(List.of("allowResources"))
     * // the properties below are optional
     * .allowReferers(List.of("allowReferers"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-apikey-apikeyrestrictions.html)
     */
    public inline fun cfnAPIKeyApiKeyRestrictionsProperty(
        block: CfnAPIKeyApiKeyRestrictionsPropertyDsl.() -> Unit = {}
    ): CfnAPIKey.ApiKeyRestrictionsProperty {
        val builder = CfnAPIKeyApiKeyRestrictionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAPIKey`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * CfnAPIKeyProps cfnAPIKeyProps = CfnAPIKeyProps.builder()
     * .keyName("keyName")
     * .restrictions(ApiKeyRestrictionsProperty.builder()
     * .allowActions(List.of("allowActions"))
     * .allowResources(List.of("allowResources"))
     * // the properties below are optional
     * .allowReferers(List.of("allowReferers"))
     * .build())
     * // the properties below are optional
     * .description("description")
     * .expireTime("expireTime")
     * .forceDelete(false)
     * .forceUpdate(false)
     * .noExpiry(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html)
     */
    public inline fun cfnAPIKeyProps(block: CfnAPIKeyPropsDsl.() -> Unit = {}): CfnAPIKeyProps {
        val builder = CfnAPIKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Location::GeofenceCollection` resource specifies the ability to detect and act when
     * a tracked device enters or exits a defined geographical boundary known as a geofence.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * CfnGeofenceCollection cfnGeofenceCollection = CfnGeofenceCollection.Builder.create(this,
     * "MyCfnGeofenceCollection")
     * .collectionName("collectionName")
     * // the properties below are optional
     * .description("description")
     * .kmsKeyId("kmsKeyId")
     * .pricingPlan("pricingPlan")
     * .pricingPlanDataSource("pricingPlanDataSource")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html)
     */
    public inline fun cfnGeofenceCollection(
        scope: Construct,
        id: String,
        block: CfnGeofenceCollectionDsl.() -> Unit = {},
    ): CfnGeofenceCollection {
        val builder = CfnGeofenceCollectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGeofenceCollection`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * CfnGeofenceCollectionProps cfnGeofenceCollectionProps = CfnGeofenceCollectionProps.builder()
     * .collectionName("collectionName")
     * // the properties below are optional
     * .description("description")
     * .kmsKeyId("kmsKeyId")
     * .pricingPlan("pricingPlan")
     * .pricingPlanDataSource("pricingPlanDataSource")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html)
     */
    public inline fun cfnGeofenceCollectionProps(
        block: CfnGeofenceCollectionPropsDsl.() -> Unit = {}
    ): CfnGeofenceCollectionProps {
        val builder = CfnGeofenceCollectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Location::Map` resource specifies a map resource in your AWS account, which
     * provides map tiles of different styles sourced from global location data providers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * CfnMap cfnMap = CfnMap.Builder.create(this, "MyCfnMap")
     * .configuration(MapConfigurationProperty.builder()
     * .style("style")
     * // the properties below are optional
     * .customLayers(List.of("customLayers"))
     * .politicalView("politicalView")
     * .build())
     * .mapName("mapName")
     * // the properties below are optional
     * .description("description")
     * .pricingPlan("pricingPlan")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html)
     */
    public inline fun cfnMap(
        scope: Construct,
        id: String,
        block: CfnMapDsl.() -> Unit = {},
    ): CfnMap {
        val builder = CfnMapDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the map tile style selected from an available provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * MapConfigurationProperty mapConfigurationProperty = MapConfigurationProperty.builder()
     * .style("style")
     * // the properties below are optional
     * .customLayers(List.of("customLayers"))
     * .politicalView("politicalView")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-map-mapconfiguration.html)
     */
    public inline fun cfnMapMapConfigurationProperty(
        block: CfnMapMapConfigurationPropertyDsl.() -> Unit = {}
    ): CfnMap.MapConfigurationProperty {
        val builder = CfnMapMapConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMap`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * CfnMapProps cfnMapProps = CfnMapProps.builder()
     * .configuration(MapConfigurationProperty.builder()
     * .style("style")
     * // the properties below are optional
     * .customLayers(List.of("customLayers"))
     * .politicalView("politicalView")
     * .build())
     * .mapName("mapName")
     * // the properties below are optional
     * .description("description")
     * .pricingPlan("pricingPlan")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html)
     */
    public inline fun cfnMapProps(block: CfnMapPropsDsl.() -> Unit = {}): CfnMapProps {
        val builder = CfnMapPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a place index resource in your AWS account.
     *
     * Use a place index resource to geocode addresses and other text queries by using the
     * `SearchPlaceIndexForText` operation, and reverse geocode coordinates by using the
     * `SearchPlaceIndexForPosition` operation, and enable autosuggestions by using the
     * `SearchPlaceIndexForSuggestions` operation.
     *
     * If your application is tracking or routing assets you use in your business, such as delivery
     * vehicles or employees, you must not use Esri as your geolocation provider. See section 82 of
     * the [AWS service terms](https://docs.aws.amazon.com/service-terms) for more details.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * CfnPlaceIndex cfnPlaceIndex = CfnPlaceIndex.Builder.create(this, "MyCfnPlaceIndex")
     * .dataSource("dataSource")
     * .indexName("indexName")
     * // the properties below are optional
     * .dataSourceConfiguration(DataSourceConfigurationProperty.builder()
     * .intendedUse("intendedUse")
     * .build())
     * .description("description")
     * .pricingPlan("pricingPlan")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html)
     */
    public inline fun cfnPlaceIndex(
        scope: Construct,
        id: String,
        block: CfnPlaceIndexDsl.() -> Unit = {},
    ): CfnPlaceIndex {
        val builder = CfnPlaceIndexDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the data storage option requesting Places.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * DataSourceConfigurationProperty dataSourceConfigurationProperty =
     * DataSourceConfigurationProperty.builder()
     * .intendedUse("intendedUse")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-placeindex-datasourceconfiguration.html)
     */
    public inline fun cfnPlaceIndexDataSourceConfigurationProperty(
        block: CfnPlaceIndexDataSourceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnPlaceIndex.DataSourceConfigurationProperty {
        val builder = CfnPlaceIndexDataSourceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPlaceIndex`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * CfnPlaceIndexProps cfnPlaceIndexProps = CfnPlaceIndexProps.builder()
     * .dataSource("dataSource")
     * .indexName("indexName")
     * // the properties below are optional
     * .dataSourceConfiguration(DataSourceConfigurationProperty.builder()
     * .intendedUse("intendedUse")
     * .build())
     * .description("description")
     * .pricingPlan("pricingPlan")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-placeindex.html)
     */
    public inline fun cfnPlaceIndexProps(
        block: CfnPlaceIndexPropsDsl.() -> Unit = {}
    ): CfnPlaceIndexProps {
        val builder = CfnPlaceIndexPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a route calculator resource in your AWS account.
     *
     * You can send requests to a route calculator resource to estimate travel time, distance, and
     * get directions. A route calculator sources traffic and road network data from your chosen
     * data provider.
     *
     * If your application is tracking or routing assets you use in your business, such as delivery
     * vehicles or employees, you must not use Esri as your geolocation provider. See section 82 of
     * the [AWS service terms](https://docs.aws.amazon.com/service-terms) for more details.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * CfnRouteCalculator cfnRouteCalculator = CfnRouteCalculator.Builder.create(this,
     * "MyCfnRouteCalculator")
     * .calculatorName("calculatorName")
     * .dataSource("dataSource")
     * // the properties below are optional
     * .description("description")
     * .pricingPlan("pricingPlan")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html)
     */
    public inline fun cfnRouteCalculator(
        scope: Construct,
        id: String,
        block: CfnRouteCalculatorDsl.() -> Unit = {},
    ): CfnRouteCalculator {
        val builder = CfnRouteCalculatorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRouteCalculator`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * CfnRouteCalculatorProps cfnRouteCalculatorProps = CfnRouteCalculatorProps.builder()
     * .calculatorName("calculatorName")
     * .dataSource("dataSource")
     * // the properties below are optional
     * .description("description")
     * .pricingPlan("pricingPlan")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-routecalculator.html)
     */
    public inline fun cfnRouteCalculatorProps(
        block: CfnRouteCalculatorPropsDsl.() -> Unit = {}
    ): CfnRouteCalculatorProps {
        val builder = CfnRouteCalculatorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a tracker resource in your AWS account , which lets you receive current and
     * historical location of devices.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * CfnTracker cfnTracker = CfnTracker.Builder.create(this, "MyCfnTracker")
     * .trackerName("trackerName")
     * // the properties below are optional
     * .description("description")
     * .eventBridgeEnabled(false)
     * .kmsKeyEnableGeospatialQueries(false)
     * .kmsKeyId("kmsKeyId")
     * .positionFiltering("positionFiltering")
     * .pricingPlan("pricingPlan")
     * .pricingPlanDataSource("pricingPlanDataSource")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html)
     */
    public inline fun cfnTracker(
        scope: Construct,
        id: String,
        block: CfnTrackerDsl.() -> Unit = {},
    ): CfnTracker {
        val builder = CfnTrackerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Location::TrackerConsumer` resource specifies an association between a geofence
     * collection and a tracker resource.
     *
     * The geofence collection is referred to as the *consumer* of the tracker. This allows the
     * tracker resource to communicate location data to the linked geofence collection.
     *
     * Currently not supported — Cross-account configurations, such as creating associations between
     * a tracker resource in one account and a geofence collection in another account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * CfnTrackerConsumer cfnTrackerConsumer = CfnTrackerConsumer.Builder.create(this,
     * "MyCfnTrackerConsumer")
     * .consumerArn("consumerArn")
     * .trackerName("trackerName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-trackerconsumer.html)
     */
    public inline fun cfnTrackerConsumer(
        scope: Construct,
        id: String,
        block: CfnTrackerConsumerDsl.() -> Unit = {},
    ): CfnTrackerConsumer {
        val builder = CfnTrackerConsumerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTrackerConsumer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * CfnTrackerConsumerProps cfnTrackerConsumerProps = CfnTrackerConsumerProps.builder()
     * .consumerArn("consumerArn")
     * .trackerName("trackerName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-trackerconsumer.html)
     */
    public inline fun cfnTrackerConsumerProps(
        block: CfnTrackerConsumerPropsDsl.() -> Unit = {}
    ): CfnTrackerConsumerProps {
        val builder = CfnTrackerConsumerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTracker`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.location.*;
     * CfnTrackerProps cfnTrackerProps = CfnTrackerProps.builder()
     * .trackerName("trackerName")
     * // the properties below are optional
     * .description("description")
     * .eventBridgeEnabled(false)
     * .kmsKeyEnableGeospatialQueries(false)
     * .kmsKeyId("kmsKeyId")
     * .positionFiltering("positionFiltering")
     * .pricingPlan("pricingPlan")
     * .pricingPlanDataSource("pricingPlanDataSource")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html)
     */
    public inline fun cfnTrackerProps(block: CfnTrackerPropsDsl.() -> Unit = {}): CfnTrackerProps {
        val builder = CfnTrackerPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
