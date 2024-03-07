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

package io.cloudshiftdev.awscdkdsl.services.route53

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.ARecord
import software.amazon.awscdk.services.route53.ARecordProps
import software.amazon.awscdk.services.route53.AaaaRecord
import software.amazon.awscdk.services.route53.AaaaRecordProps
import software.amazon.awscdk.services.route53.AliasRecordTargetConfig
import software.amazon.awscdk.services.route53.CaaAmazonRecord
import software.amazon.awscdk.services.route53.CaaAmazonRecordProps
import software.amazon.awscdk.services.route53.CaaRecord
import software.amazon.awscdk.services.route53.CaaRecordProps
import software.amazon.awscdk.services.route53.CaaRecordValue
import software.amazon.awscdk.services.route53.CfnCidrCollection
import software.amazon.awscdk.services.route53.CfnCidrCollectionProps
import software.amazon.awscdk.services.route53.CfnDNSSEC
import software.amazon.awscdk.services.route53.CfnDNSSECProps
import software.amazon.awscdk.services.route53.CfnHealthCheck
import software.amazon.awscdk.services.route53.CfnHealthCheckProps
import software.amazon.awscdk.services.route53.CfnHostedZone
import software.amazon.awscdk.services.route53.CfnHostedZoneProps
import software.amazon.awscdk.services.route53.CfnKeySigningKey
import software.amazon.awscdk.services.route53.CfnKeySigningKeyProps
import software.amazon.awscdk.services.route53.CfnRecordSet
import software.amazon.awscdk.services.route53.CfnRecordSetGroup
import software.amazon.awscdk.services.route53.CfnRecordSetGroupProps
import software.amazon.awscdk.services.route53.CfnRecordSetProps
import software.amazon.awscdk.services.route53.CnameRecord
import software.amazon.awscdk.services.route53.CnameRecordProps
import software.amazon.awscdk.services.route53.CommonHostedZoneProps
import software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord
import software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps
import software.amazon.awscdk.services.route53.DsRecord
import software.amazon.awscdk.services.route53.DsRecordProps
import software.amazon.awscdk.services.route53.HostedZoneAttributes
import software.amazon.awscdk.services.route53.HostedZoneProps
import software.amazon.awscdk.services.route53.HostedZoneProviderProps
import software.amazon.awscdk.services.route53.IHostedZone
import software.amazon.awscdk.services.route53.IPublicHostedZone
import software.amazon.awscdk.services.route53.MxRecord
import software.amazon.awscdk.services.route53.MxRecordProps
import software.amazon.awscdk.services.route53.MxRecordValue
import software.amazon.awscdk.services.route53.NsRecord
import software.amazon.awscdk.services.route53.NsRecordProps
import software.amazon.awscdk.services.route53.PrivateHostedZone
import software.amazon.awscdk.services.route53.PrivateHostedZoneProps
import software.amazon.awscdk.services.route53.PublicHostedZoneAttributes
import software.amazon.awscdk.services.route53.PublicHostedZoneProps
import software.amazon.awscdk.services.route53.RecordSet
import software.amazon.awscdk.services.route53.RecordSetOptions
import software.amazon.awscdk.services.route53.RecordSetProps
import software.amazon.awscdk.services.route53.SrvRecord
import software.amazon.awscdk.services.route53.SrvRecordProps
import software.amazon.awscdk.services.route53.SrvRecordValue
import software.amazon.awscdk.services.route53.TxtRecord
import software.amazon.awscdk.services.route53.TxtRecordProps
import software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName
import software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps
import software.amazon.awscdk.services.route53.ZoneDelegationOptions
import software.amazon.awscdk.services.route53.ZoneDelegationRecord
import software.amazon.awscdk.services.route53.ZoneDelegationRecordProps
import software.constructs.Construct

public object route53 {
    /**
     * A DNS A record.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.apigateway.*;
     * HostedZone zone;
     * LambdaRestApi restApi;
     * ARecord.Builder.create(this, "AliasRecord")
     * .zone(zone)
     * .target(RecordTarget.fromAlias(new ApiGateway(restApi)))
     * .build();
     * ```
     */
    public inline fun aRecord(
        scope: Construct,
        id: String,
        block: ARecordDsl.() -> Unit = {},
    ): ARecord {
        val builder = ARecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a ARecord.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.apigateway.*;
     * HostedZone zone;
     * LambdaRestApi restApi;
     * ARecord.Builder.create(this, "AliasRecord")
     * .zone(zone)
     * .target(RecordTarget.fromAlias(new ApiGateway(restApi)))
     * .build();
     * ```
     */
    public inline fun aRecordProps(block: ARecordPropsDsl.() -> Unit = {}): ARecordProps {
        val builder = ARecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A DNS AAAA record.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudfront.*;
     * HostedZone myZone;
     * CloudFrontWebDistribution distribution;
     * AaaaRecord.Builder.create(this, "Alias")
     * .zone(myZone)
     * .target(RecordTarget.fromAlias(new CloudFrontTarget(distribution)))
     * .build();
     * ```
     */
    public inline fun aaaaRecord(
        scope: Construct,
        id: String,
        block: AaaaRecordDsl.() -> Unit = {},
    ): AaaaRecord {
        val builder = AaaaRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a AaaaRecord.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudfront.*;
     * HostedZone myZone;
     * CloudFrontWebDistribution distribution;
     * AaaaRecord.Builder.create(this, "Alias")
     * .zone(myZone)
     * .target(RecordTarget.fromAlias(new CloudFrontTarget(distribution)))
     * .build();
     * ```
     */
    public inline fun aaaaRecordProps(block: AaaaRecordPropsDsl.() -> Unit = {}): AaaaRecordProps {
        val builder = AaaaRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the properties of an alias target destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * AliasRecordTargetConfig aliasRecordTargetConfig = AliasRecordTargetConfig.builder()
     * .dnsName("dnsName")
     * .hostedZoneId("hostedZoneId")
     * .build();
     * ```
     */
    public inline fun aliasRecordTargetConfig(
        block: AliasRecordTargetConfigDsl.() -> Unit = {}
    ): AliasRecordTargetConfig {
        val builder = AliasRecordTargetConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A DNS Amazon CAA record.
     *
     * A CAA record to restrict certificate authorities allowed to issue certificates for a domain
     * to Amazon only.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.route53.*;
     * GeoLocation geoLocation;
     * HostedZone hostedZone;
     * CaaAmazonRecord caaAmazonRecord = CaaAmazonRecord.Builder.create(this, "MyCaaAmazonRecord")
     * .zone(hostedZone)
     * // the properties below are optional
     * .comment("comment")
     * .deleteExisting(false)
     * .geoLocation(geoLocation)
     * .multiValueAnswer(false)
     * .recordName("recordName")
     * .region("region")
     * .setIdentifier("setIdentifier")
     * .ttl(Duration.minutes(30))
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun caaAmazonRecord(
        scope: Construct,
        id: String,
        block: CaaAmazonRecordDsl.() -> Unit = {},
    ): CaaAmazonRecord {
        val builder = CaaAmazonRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a CaaAmazonRecord.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.route53.*;
     * GeoLocation geoLocation;
     * HostedZone hostedZone;
     * CaaAmazonRecordProps caaAmazonRecordProps = CaaAmazonRecordProps.builder()
     * .zone(hostedZone)
     * // the properties below are optional
     * .comment("comment")
     * .deleteExisting(false)
     * .geoLocation(geoLocation)
     * .multiValueAnswer(false)
     * .recordName("recordName")
     * .region("region")
     * .setIdentifier("setIdentifier")
     * .ttl(Duration.minutes(30))
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun caaAmazonRecordProps(
        block: CaaAmazonRecordPropsDsl.() -> Unit = {}
    ): CaaAmazonRecordProps {
        val builder = CaaAmazonRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A DNS CAA record.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.route53.*;
     * GeoLocation geoLocation;
     * HostedZone hostedZone;
     * CaaRecord caaRecord = CaaRecord.Builder.create(this, "MyCaaRecord")
     * .values(List.of(CaaRecordValue.builder()
     * .flag(123)
     * .tag(CaaTag.ISSUE)
     * .value("value")
     * .build()))
     * .zone(hostedZone)
     * // the properties below are optional
     * .comment("comment")
     * .deleteExisting(false)
     * .geoLocation(geoLocation)
     * .multiValueAnswer(false)
     * .recordName("recordName")
     * .region("region")
     * .setIdentifier("setIdentifier")
     * .ttl(Duration.minutes(30))
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun caaRecord(
        scope: Construct,
        id: String,
        block: CaaRecordDsl.() -> Unit = {},
    ): CaaRecord {
        val builder = CaaRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a CaaRecord.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.route53.*;
     * GeoLocation geoLocation;
     * HostedZone hostedZone;
     * CaaRecordProps caaRecordProps = CaaRecordProps.builder()
     * .values(List.of(CaaRecordValue.builder()
     * .flag(123)
     * .tag(CaaTag.ISSUE)
     * .value("value")
     * .build()))
     * .zone(hostedZone)
     * // the properties below are optional
     * .comment("comment")
     * .deleteExisting(false)
     * .geoLocation(geoLocation)
     * .multiValueAnswer(false)
     * .recordName("recordName")
     * .region("region")
     * .setIdentifier("setIdentifier")
     * .ttl(Duration.minutes(30))
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun caaRecordProps(block: CaaRecordPropsDsl.() -> Unit = {}): CaaRecordProps {
        val builder = CaaRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a CAA record value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CaaRecordValue caaRecordValue = CaaRecordValue.builder()
     * .flag(123)
     * .tag(CaaTag.ISSUE)
     * .value("value")
     * .build();
     * ```
     */
    public inline fun caaRecordValue(block: CaaRecordValueDsl.() -> Unit = {}): CaaRecordValue {
        val builder = CaaRecordValueDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a CIDR collection in the current AWS account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CfnCidrCollection cfnCidrCollection = CfnCidrCollection.Builder.create(this,
     * "MyCfnCidrCollection")
     * .name("name")
     * // the properties below are optional
     * .locations(List.of(LocationProperty.builder()
     * .cidrList(List.of("cidrList"))
     * .locationName("locationName")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html)
     */
    public inline fun cfnCidrCollection(
        scope: Construct,
        id: String,
        block: CfnCidrCollectionDsl.() -> Unit = {},
    ): CfnCidrCollection {
        val builder = CfnCidrCollectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the list of CIDR blocks for a CIDR location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * LocationProperty locationProperty = LocationProperty.builder()
     * .cidrList(List.of("cidrList"))
     * .locationName("locationName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-cidrcollection-location.html)
     */
    public inline fun cfnCidrCollectionLocationProperty(
        block: CfnCidrCollectionLocationPropertyDsl.() -> Unit = {}
    ): CfnCidrCollection.LocationProperty {
        val builder = CfnCidrCollectionLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCidrCollection`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CfnCidrCollectionProps cfnCidrCollectionProps = CfnCidrCollectionProps.builder()
     * .name("name")
     * // the properties below are optional
     * .locations(List.of(LocationProperty.builder()
     * .cidrList(List.of("cidrList"))
     * .locationName("locationName")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html)
     */
    public inline fun cfnCidrCollectionProps(
        block: CfnCidrCollectionPropsDsl.() -> Unit = {}
    ): CfnCidrCollectionProps {
        val builder = CfnCidrCollectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Route53::DNSSEC` resource is used to enable DNSSEC signing in a hosted zone.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CfnDNSSEC cfnDNSSEC = CfnDNSSEC.Builder.create(this, "MyCfnDNSSEC")
     * .hostedZoneId("hostedZoneId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-dnssec.html)
     */
    public inline fun cfnDNSSEC(
        scope: Construct,
        id: String,
        block: CfnDNSSECDsl.() -> Unit = {},
    ): CfnDNSSEC {
        val builder = CfnDNSSECDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDNSSEC`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CfnDNSSECProps cfnDNSSECProps = CfnDNSSECProps.builder()
     * .hostedZoneId("hostedZoneId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-dnssec.html)
     */
    public inline fun cfnDNSSECProps(block: CfnDNSSECPropsDsl.() -> Unit = {}): CfnDNSSECProps {
        val builder = CfnDNSSECPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Route53::HealthCheck` resource is a Route 53 resource type that contains settings
     * for a Route 53 health check.
     *
     * For information about associating health checks with records, see
     * [HealthCheckId](https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResourceRecordSet.html#Route53-Type-ResourceRecordSet-HealthCheckId)
     * in
     * [ChangeResourceRecordSets](https://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html)
     * .
     *
     * You can't create a health check with simple routing.
     *
     * *ELB Load Balancers*
     *
     * If you're registering EC2 instances with an Elastic Load Balancing (ELB) load balancer, do
     * not create Amazon Route 53 health checks for the EC2 instances. When you register an EC2
     * instance with a load balancer, you configure settings for an ELB health check, which performs
     * a similar function to a Route 53 health check.
     *
     * *Private Hosted Zones*
     *
     * You can associate health checks with failover records in a private hosted zone. Note the
     * following:
     * * Route 53 health checkers are outside the VPC. To check the health of an endpoint within a
     *   VPC by IP address, you must assign a public IP address to the instance in the VPC.
     * * You can configure a health checker to check the health of an external resource that the
     *   instance relies on, such as a database server.
     * * You can create a CloudWatch metric, associate an alarm with the metric, and then create a
     *   health check that is based on the state of the alarm. For example, you might create a
     *   CloudWatch metric that checks the status of the Amazon EC2 `StatusCheckFailed` metric, add
     *   an alarm to the metric, and then create a health check that is based on the state of the
     *   alarm. For information about creating CloudWatch metrics and alarms by using the CloudWatch
     *   console, see the
     *   [Amazon CloudWatch User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/WhatIsCloudWatch.html)
     *   .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CfnHealthCheck cfnHealthCheck = CfnHealthCheck.Builder.create(this, "MyCfnHealthCheck")
     * .healthCheckConfig(HealthCheckConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .alarmIdentifier(AlarmIdentifierProperty.builder()
     * .name("name")
     * .region("region")
     * .build())
     * .childHealthChecks(List.of("childHealthChecks"))
     * .enableSni(false)
     * .failureThreshold(123)
     * .fullyQualifiedDomainName("fullyQualifiedDomainName")
     * .healthThreshold(123)
     * .insufficientDataHealthStatus("insufficientDataHealthStatus")
     * .inverted(false)
     * .ipAddress("ipAddress")
     * .measureLatency(false)
     * .port(123)
     * .regions(List.of("regions"))
     * .requestInterval(123)
     * .resourcePath("resourcePath")
     * .routingControlArn("routingControlArn")
     * .searchString("searchString")
     * .build())
     * // the properties below are optional
     * .healthCheckTags(List.of(HealthCheckTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html)
     */
    public inline fun cfnHealthCheck(
        scope: Construct,
        id: String,
        block: CfnHealthCheckDsl.() -> Unit = {},
    ): CfnHealthCheck {
        val builder = CfnHealthCheckDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health
     * checkers to use to determine whether the specified health check is healthy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * AlarmIdentifierProperty alarmIdentifierProperty = AlarmIdentifierProperty.builder()
     * .name("name")
     * .region("region")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html)
     */
    public inline fun cfnHealthCheckAlarmIdentifierProperty(
        block: CfnHealthCheckAlarmIdentifierPropertyDsl.() -> Unit = {}
    ): CfnHealthCheck.AlarmIdentifierProperty {
        val builder = CfnHealthCheckAlarmIdentifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains information about the health check.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * HealthCheckConfigProperty healthCheckConfigProperty = HealthCheckConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .alarmIdentifier(AlarmIdentifierProperty.builder()
     * .name("name")
     * .region("region")
     * .build())
     * .childHealthChecks(List.of("childHealthChecks"))
     * .enableSni(false)
     * .failureThreshold(123)
     * .fullyQualifiedDomainName("fullyQualifiedDomainName")
     * .healthThreshold(123)
     * .insufficientDataHealthStatus("insufficientDataHealthStatus")
     * .inverted(false)
     * .ipAddress("ipAddress")
     * .measureLatency(false)
     * .port(123)
     * .regions(List.of("regions"))
     * .requestInterval(123)
     * .resourcePath("resourcePath")
     * .routingControlArn("routingControlArn")
     * .searchString("searchString")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html)
     */
    public inline fun cfnHealthCheckHealthCheckConfigProperty(
        block: CfnHealthCheckHealthCheckConfigPropertyDsl.() -> Unit = {}
    ): CfnHealthCheck.HealthCheckConfigProperty {
        val builder = CfnHealthCheckHealthCheckConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `HealthCheckTag` property describes one key-value pair that is associated with an
     * `AWS::Route53::HealthCheck` resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * HealthCheckTagProperty healthCheckTagProperty = HealthCheckTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthchecktag.html)
     */
    public inline fun cfnHealthCheckHealthCheckTagProperty(
        block: CfnHealthCheckHealthCheckTagPropertyDsl.() -> Unit = {}
    ): CfnHealthCheck.HealthCheckTagProperty {
        val builder = CfnHealthCheckHealthCheckTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnHealthCheck`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CfnHealthCheckProps cfnHealthCheckProps = CfnHealthCheckProps.builder()
     * .healthCheckConfig(HealthCheckConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .alarmIdentifier(AlarmIdentifierProperty.builder()
     * .name("name")
     * .region("region")
     * .build())
     * .childHealthChecks(List.of("childHealthChecks"))
     * .enableSni(false)
     * .failureThreshold(123)
     * .fullyQualifiedDomainName("fullyQualifiedDomainName")
     * .healthThreshold(123)
     * .insufficientDataHealthStatus("insufficientDataHealthStatus")
     * .inverted(false)
     * .ipAddress("ipAddress")
     * .measureLatency(false)
     * .port(123)
     * .regions(List.of("regions"))
     * .requestInterval(123)
     * .resourcePath("resourcePath")
     * .routingControlArn("routingControlArn")
     * .searchString("searchString")
     * .build())
     * // the properties below are optional
     * .healthCheckTags(List.of(HealthCheckTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html)
     */
    public inline fun cfnHealthCheckProps(
        block: CfnHealthCheckPropsDsl.() -> Unit = {}
    ): CfnHealthCheckProps {
        val builder = CfnHealthCheckPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new public or private hosted zone.
     *
     * You create records in a public hosted zone to define how you want to route traffic on the
     * internet for a domain, such as example.com, and its subdomains (apex.example.com,
     * acme.example.com). You create records in a private hosted zone to define how you want to
     * route traffic for a domain and its subdomains within one or more Amazon Virtual Private
     * Clouds (Amazon VPCs).
     *
     * You can't convert a public hosted zone to a private hosted zone or vice versa. Instead, you
     * must create a new hosted zone with the same name and create new resource record sets.
     *
     * For more information about charges for hosted zones, see
     * [Amazon Route 53 Pricing](https://docs.aws.amazon.com/route53/pricing/) .
     *
     * Note the following:
     * * You can't create a hosted zone for a top-level domain (TLD) such as .com.
     * * If your domain is registered with a registrar other than Route 53, you must update the name
     *   servers with your registrar to make Route 53 the DNS service for the domain. For more
     *   information, see
     *   [Migrating DNS Service for an Existing Domain to Amazon Route 53](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/MigratingDNS.html)
     *   in the *Amazon Route 53 Developer Guide* .
     *
     * When you submit a `CreateHostedZone` request, the initial status of the hosted zone is
     * `PENDING` . For public hosted zones, this means that the NS and SOA records are not yet
     * available on all Route 53 DNS servers. When the NS and SOA records are available, the status
     * of the zone changes to `INSYNC` .
     *
     * The `CreateHostedZone` request requires the caller to have an `ec2:DescribeVpcs` permission.
     *
     * When creating private hosted zones, the Amazon VPC must belong to the same partition where
     * the hosted zone is created. A partition is a group of AWS Regions . Each AWS account is
     * scoped to one partition.
     *
     * The following are the supported partitions:
     * * `aws` - AWS Regions
     * * `aws-cn` - China Regions
     * * `aws-us-gov` - AWS GovCloud (US) Region
     *
     * For more information, see
     * [Access Management](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
     * in the *AWS General Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CfnHostedZone cfnHostedZone = CfnHostedZone.Builder.create(this, "MyCfnHostedZone")
     * .hostedZoneConfig(HostedZoneConfigProperty.builder()
     * .comment("comment")
     * .build())
     * .hostedZoneTags(List.of(HostedZoneTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .name("name")
     * .queryLoggingConfig(QueryLoggingConfigProperty.builder()
     * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
     * .build())
     * .vpcs(List.of(VPCProperty.builder()
     * .vpcId("vpcId")
     * .vpcRegion("vpcRegion")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html)
     */
    public inline fun cfnHostedZone(
        scope: Construct,
        id: String,
        block: CfnHostedZoneDsl.() -> Unit = {},
    ): CfnHostedZone {
        val builder = CfnHostedZoneDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains an optional comment about your hosted zone.
     *
     * If you don't want to specify a comment, omit both the `HostedZoneConfig` and `Comment`
     * elements.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * HostedZoneConfigProperty hostedZoneConfigProperty = HostedZoneConfigProperty.builder()
     * .comment("comment")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzoneconfig.html)
     */
    public inline fun cfnHostedZoneHostedZoneConfigProperty(
        block: CfnHostedZoneHostedZoneConfigPropertyDsl.() -> Unit = {}
    ): CfnHostedZone.HostedZoneConfigProperty {
        val builder = CfnHostedZoneHostedZoneConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains information about a tag that you want to add or edit for the
     * specified health check or hosted zone.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * HostedZoneTagProperty hostedZoneTagProperty = HostedZoneTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetag.html)
     */
    public inline fun cfnHostedZoneHostedZoneTagProperty(
        block: CfnHostedZoneHostedZoneTagPropertyDsl.() -> Unit = {}
    ): CfnHostedZone.HostedZoneTagProperty {
        val builder = CfnHostedZoneHostedZoneTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnHostedZone`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CfnHostedZoneProps cfnHostedZoneProps = CfnHostedZoneProps.builder()
     * .hostedZoneConfig(HostedZoneConfigProperty.builder()
     * .comment("comment")
     * .build())
     * .hostedZoneTags(List.of(HostedZoneTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .name("name")
     * .queryLoggingConfig(QueryLoggingConfigProperty.builder()
     * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
     * .build())
     * .vpcs(List.of(VPCProperty.builder()
     * .vpcId("vpcId")
     * .vpcRegion("vpcRegion")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html)
     */
    public inline fun cfnHostedZoneProps(
        block: CfnHostedZonePropsDsl.() -> Unit = {}
    ): CfnHostedZoneProps {
        val builder = CfnHostedZonePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains information about a configuration for DNS query logging.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * QueryLoggingConfigProperty queryLoggingConfigProperty = QueryLoggingConfigProperty.builder()
     * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html)
     */
    public inline fun cfnHostedZoneQueryLoggingConfigProperty(
        block: CfnHostedZoneQueryLoggingConfigPropertyDsl.() -> Unit = {}
    ): CfnHostedZone.QueryLoggingConfigProperty {
        val builder = CfnHostedZoneQueryLoggingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * *Private hosted zones only:* A complex type that contains information about an Amazon VPC.
     *
     * Route 53 Resolver uses the records in the private hosted zone to route traffic in that VPC.
     *
     * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * VPCProperty vPCProperty = VPCProperty.builder()
     * .vpcId("vpcId")
     * .vpcRegion("vpcRegion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-vpc.html)
     */
    public inline fun cfnHostedZoneVPCProperty(
        block: CfnHostedZoneVPCPropertyDsl.() -> Unit = {}
    ): CfnHostedZone.VPCProperty {
        val builder = CfnHostedZoneVPCPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Route53::KeySigningKey` resource creates a new key-signing key (KSK) in a hosted
     * zone.
     *
     * The hosted zone ID is passed as a parameter in the KSK properties. You can specify the
     * properties of this KSK using the `Name` , `Status` , and `KeyManagementServiceArn` properties
     * of the resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CfnKeySigningKey cfnKeySigningKey = CfnKeySigningKey.Builder.create(this, "MyCfnKeySigningKey")
     * .hostedZoneId("hostedZoneId")
     * .keyManagementServiceArn("keyManagementServiceArn")
     * .name("name")
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html)
     */
    public inline fun cfnKeySigningKey(
        scope: Construct,
        id: String,
        block: CfnKeySigningKeyDsl.() -> Unit = {},
    ): CfnKeySigningKey {
        val builder = CfnKeySigningKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnKeySigningKey`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CfnKeySigningKeyProps cfnKeySigningKeyProps = CfnKeySigningKeyProps.builder()
     * .hostedZoneId("hostedZoneId")
     * .keyManagementServiceArn("keyManagementServiceArn")
     * .name("name")
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html)
     */
    public inline fun cfnKeySigningKeyProps(
        block: CfnKeySigningKeyPropsDsl.() -> Unit = {}
    ): CfnKeySigningKeyProps {
        val builder = CfnKeySigningKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the record that you want to create.
     *
     * The `AWS::Route53::RecordSet` type can be used as a standalone resource or as an embedded
     * property in the `AWS::Route53::RecordSetGroup` type. Note that some `AWS::Route53::RecordSet`
     * properties are valid only when used within `AWS::Route53::RecordSetGroup` .
     *
     * For more information, see
     * [ChangeResourceRecordSets](https://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html)
     * in the *Amazon Route 53 API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CfnRecordSet cfnRecordSet = CfnRecordSet.Builder.create(this, "MyCfnRecordSet")
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .aliasTarget(AliasTargetProperty.builder()
     * .dnsName("dnsName")
     * .hostedZoneId("hostedZoneId")
     * // the properties below are optional
     * .evaluateTargetHealth(false)
     * .build())
     * .cidrRoutingConfig(CidrRoutingConfigProperty.builder()
     * .collectionId("collectionId")
     * .locationName("locationName")
     * .build())
     * .comment("comment")
     * .failover("failover")
     * .geoLocation(GeoLocationProperty.builder()
     * .continentCode("continentCode")
     * .countryCode("countryCode")
     * .subdivisionCode("subdivisionCode")
     * .build())
     * .geoProximityLocation(GeoProximityLocationProperty.builder()
     * .awsRegion("awsRegion")
     * .bias(123)
     * .coordinates(CoordinatesProperty.builder()
     * .latitude("latitude")
     * .longitude("longitude")
     * .build())
     * .localZoneGroup("localZoneGroup")
     * .build())
     * .healthCheckId("healthCheckId")
     * .hostedZoneId("hostedZoneId")
     * .hostedZoneName("hostedZoneName")
     * .multiValueAnswer(false)
     * .region("region")
     * .resourceRecords(List.of("resourceRecords"))
     * .setIdentifier("setIdentifier")
     * .ttl("ttl")
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html)
     */
    public inline fun cfnRecordSet(
        scope: Construct,
        id: String,
        block: CfnRecordSetDsl.() -> Unit = {},
    ): CfnRecordSet {
        val builder = CfnRecordSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * *Alias records only:* Information about the AWS resource, such as a CloudFront distribution
     * or an Amazon S3 bucket, that you want to route traffic to.
     *
     * When creating records for a private hosted zone, note the following:
     * * Creating geolocation alias and latency alias records in a private hosted zone is allowed
     *   but not supported.
     * * For information about creating failover records in a private hosted zone, see
     *   [Configuring Failover in a Private Hosted Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     *   .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * AliasTargetProperty aliasTargetProperty = AliasTargetProperty.builder()
     * .dnsName("dnsName")
     * .hostedZoneId("hostedZoneId")
     * // the properties below are optional
     * .evaluateTargetHealth(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-aliastarget.html)
     */
    public inline fun cfnRecordSetAliasTargetProperty(
        block: CfnRecordSetAliasTargetPropertyDsl.() -> Unit = {}
    ): CfnRecordSet.AliasTargetProperty {
        val builder = CfnRecordSetAliasTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The object that is specified in resource record set object when you are linking a resource
     * record set to a CIDR location.
     *
     * A `LocationName` with an asterisk “*” can be used to create a default CIDR record.
     * `CollectionId` is still required for default record.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CidrRoutingConfigProperty cidrRoutingConfigProperty = CidrRoutingConfigProperty.builder()
     * .collectionId("collectionId")
     * .locationName("locationName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-cidrroutingconfig.html)
     */
    public inline fun cfnRecordSetCidrRoutingConfigProperty(
        block: CfnRecordSetCidrRoutingConfigPropertyDsl.() -> Unit = {}
    ): CfnRecordSet.CidrRoutingConfigProperty {
        val builder = CfnRecordSetCidrRoutingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that lists the coordinates for a geoproximity resource record.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CoordinatesProperty coordinatesProperty = CoordinatesProperty.builder()
     * .latitude("latitude")
     * .longitude("longitude")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-coordinates.html)
     */
    public inline fun cfnRecordSetCoordinatesProperty(
        block: CfnRecordSetCoordinatesPropertyDsl.() -> Unit = {}
    ): CfnRecordSet.CoordinatesProperty {
        val builder = CfnRecordSetCoordinatesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains information about a geographic location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * GeoLocationProperty geoLocationProperty = GeoLocationProperty.builder()
     * .continentCode("continentCode")
     * .countryCode("countryCode")
     * .subdivisionCode("subdivisionCode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html)
     */
    public inline fun cfnRecordSetGeoLocationProperty(
        block: CfnRecordSetGeoLocationPropertyDsl.() -> Unit = {}
    ): CfnRecordSet.GeoLocationProperty {
        val builder = CfnRecordSetGeoLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (Resource record sets only): A complex type that lets you specify where your resources are
     * located.
     *
     * Only one of `LocalZoneGroup` , `Coordinates` , or `AWS Region` is allowed per request at a
     * time.
     *
     * For more information about geoproximity routing, see
     * [Geoproximity routing](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy-geoproximity.html)
     * in the *Amazon Route 53 Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * GeoProximityLocationProperty geoProximityLocationProperty =
     * GeoProximityLocationProperty.builder()
     * .awsRegion("awsRegion")
     * .bias(123)
     * .coordinates(CoordinatesProperty.builder()
     * .latitude("latitude")
     * .longitude("longitude")
     * .build())
     * .localZoneGroup("localZoneGroup")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geoproximitylocation.html)
     */
    public inline fun cfnRecordSetGeoProximityLocationProperty(
        block: CfnRecordSetGeoProximityLocationPropertyDsl.() -> Unit = {}
    ): CfnRecordSet.GeoProximityLocationProperty {
        val builder = CfnRecordSetGeoProximityLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains an optional comment, the name and ID of the hosted zone that you
     * want to make changes in, and values for the records that you want to create.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CfnRecordSetGroup cfnRecordSetGroup = CfnRecordSetGroup.Builder.create(this,
     * "MyCfnRecordSetGroup")
     * .comment("comment")
     * .hostedZoneId("hostedZoneId")
     * .hostedZoneName("hostedZoneName")
     * .recordSets(List.of(RecordSetProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .aliasTarget(AliasTargetProperty.builder()
     * .dnsName("dnsName")
     * .hostedZoneId("hostedZoneId")
     * // the properties below are optional
     * .evaluateTargetHealth(false)
     * .build())
     * .cidrRoutingConfig(CidrRoutingConfigProperty.builder()
     * .collectionId("collectionId")
     * .locationName("locationName")
     * .build())
     * .failover("failover")
     * .geoLocation(GeoLocationProperty.builder()
     * .continentCode("continentCode")
     * .countryCode("countryCode")
     * .subdivisionCode("subdivisionCode")
     * .build())
     * .geoProximityLocation(GeoProximityLocationProperty.builder()
     * .awsRegion("awsRegion")
     * .bias(123)
     * .coordinates(CoordinatesProperty.builder()
     * .latitude("latitude")
     * .longitude("longitude")
     * .build())
     * .localZoneGroup("localZoneGroup")
     * .build())
     * .healthCheckId("healthCheckId")
     * .hostedZoneId("hostedZoneId")
     * .hostedZoneName("hostedZoneName")
     * .multiValueAnswer(false)
     * .region("region")
     * .resourceRecords(List.of("resourceRecords"))
     * .setIdentifier("setIdentifier")
     * .ttl("ttl")
     * .weight(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html)
     */
    public inline fun cfnRecordSetGroup(
        scope: Construct,
        id: String,
        block: CfnRecordSetGroupDsl.() -> Unit = {},
    ): CfnRecordSetGroup {
        val builder = CfnRecordSetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * *Alias records only:* Information about the AWS resource, such as a CloudFront distribution
     * or an Amazon S3 bucket, that you want to route traffic to.
     *
     * When creating records for a private hosted zone, note the following:
     * * Creating geolocation alias and latency alias records in a private hosted zone is allowed
     *   but not supported.
     * * For information about creating failover records in a private hosted zone, see
     *   [Configuring Failover in a Private Hosted Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     *   .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * AliasTargetProperty aliasTargetProperty = AliasTargetProperty.builder()
     * .dnsName("dnsName")
     * .hostedZoneId("hostedZoneId")
     * // the properties below are optional
     * .evaluateTargetHealth(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-aliastarget.html)
     */
    public inline fun cfnRecordSetGroupAliasTargetProperty(
        block: CfnRecordSetGroupAliasTargetPropertyDsl.() -> Unit = {}
    ): CfnRecordSetGroup.AliasTargetProperty {
        val builder = CfnRecordSetGroupAliasTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The object that is specified in resource record set object when you are linking a resource
     * record set to a CIDR location.
     *
     * A `LocationName` with an asterisk “*” can be used to create a default CIDR record.
     * `CollectionId` is still required for default record.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CidrRoutingConfigProperty cidrRoutingConfigProperty = CidrRoutingConfigProperty.builder()
     * .collectionId("collectionId")
     * .locationName("locationName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-cidrroutingconfig.html)
     */
    public inline fun cfnRecordSetGroupCidrRoutingConfigProperty(
        block: CfnRecordSetGroupCidrRoutingConfigPropertyDsl.() -> Unit = {}
    ): CfnRecordSetGroup.CidrRoutingConfigProperty {
        val builder = CfnRecordSetGroupCidrRoutingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that lists the coordinates for a geoproximity resource record.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CoordinatesProperty coordinatesProperty = CoordinatesProperty.builder()
     * .latitude("latitude")
     * .longitude("longitude")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-coordinates.html)
     */
    public inline fun cfnRecordSetGroupCoordinatesProperty(
        block: CfnRecordSetGroupCoordinatesPropertyDsl.() -> Unit = {}
    ): CfnRecordSetGroup.CoordinatesProperty {
        val builder = CfnRecordSetGroupCoordinatesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains information about a geographic location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * GeoLocationProperty geoLocationProperty = GeoLocationProperty.builder()
     * .continentCode("continentCode")
     * .countryCode("countryCode")
     * .subdivisionCode("subdivisionCode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geolocation.html)
     */
    public inline fun cfnRecordSetGroupGeoLocationProperty(
        block: CfnRecordSetGroupGeoLocationPropertyDsl.() -> Unit = {}
    ): CfnRecordSetGroup.GeoLocationProperty {
        val builder = CfnRecordSetGroupGeoLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (Resource record sets only): A complex type that lets you specify where your resources are
     * located.
     *
     * Only one of `LocalZoneGroup` , `Coordinates` , or `AWS Region` is allowed per request at a
     * time.
     *
     * For more information about geoproximity routing, see
     * [Geoproximity routing](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy-geoproximity.html)
     * in the *Amazon Route 53 Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * GeoProximityLocationProperty geoProximityLocationProperty =
     * GeoProximityLocationProperty.builder()
     * .awsRegion("awsRegion")
     * .bias(123)
     * .coordinates(CoordinatesProperty.builder()
     * .latitude("latitude")
     * .longitude("longitude")
     * .build())
     * .localZoneGroup("localZoneGroup")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geoproximitylocation.html)
     */
    public inline fun cfnRecordSetGroupGeoProximityLocationProperty(
        block: CfnRecordSetGroupGeoProximityLocationPropertyDsl.() -> Unit = {}
    ): CfnRecordSetGroup.GeoProximityLocationProperty {
        val builder = CfnRecordSetGroupGeoProximityLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRecordSetGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CfnRecordSetGroupProps cfnRecordSetGroupProps = CfnRecordSetGroupProps.builder()
     * .comment("comment")
     * .hostedZoneId("hostedZoneId")
     * .hostedZoneName("hostedZoneName")
     * .recordSets(List.of(RecordSetProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .aliasTarget(AliasTargetProperty.builder()
     * .dnsName("dnsName")
     * .hostedZoneId("hostedZoneId")
     * // the properties below are optional
     * .evaluateTargetHealth(false)
     * .build())
     * .cidrRoutingConfig(CidrRoutingConfigProperty.builder()
     * .collectionId("collectionId")
     * .locationName("locationName")
     * .build())
     * .failover("failover")
     * .geoLocation(GeoLocationProperty.builder()
     * .continentCode("continentCode")
     * .countryCode("countryCode")
     * .subdivisionCode("subdivisionCode")
     * .build())
     * .geoProximityLocation(GeoProximityLocationProperty.builder()
     * .awsRegion("awsRegion")
     * .bias(123)
     * .coordinates(CoordinatesProperty.builder()
     * .latitude("latitude")
     * .longitude("longitude")
     * .build())
     * .localZoneGroup("localZoneGroup")
     * .build())
     * .healthCheckId("healthCheckId")
     * .hostedZoneId("hostedZoneId")
     * .hostedZoneName("hostedZoneName")
     * .multiValueAnswer(false)
     * .region("region")
     * .resourceRecords(List.of("resourceRecords"))
     * .setIdentifier("setIdentifier")
     * .ttl("ttl")
     * .weight(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html)
     */
    public inline fun cfnRecordSetGroupProps(
        block: CfnRecordSetGroupPropsDsl.() -> Unit = {}
    ): CfnRecordSetGroupProps {
        val builder = CfnRecordSetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about one record that you want to create.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * RecordSetProperty recordSetProperty = RecordSetProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .aliasTarget(AliasTargetProperty.builder()
     * .dnsName("dnsName")
     * .hostedZoneId("hostedZoneId")
     * // the properties below are optional
     * .evaluateTargetHealth(false)
     * .build())
     * .cidrRoutingConfig(CidrRoutingConfigProperty.builder()
     * .collectionId("collectionId")
     * .locationName("locationName")
     * .build())
     * .failover("failover")
     * .geoLocation(GeoLocationProperty.builder()
     * .continentCode("continentCode")
     * .countryCode("countryCode")
     * .subdivisionCode("subdivisionCode")
     * .build())
     * .geoProximityLocation(GeoProximityLocationProperty.builder()
     * .awsRegion("awsRegion")
     * .bias(123)
     * .coordinates(CoordinatesProperty.builder()
     * .latitude("latitude")
     * .longitude("longitude")
     * .build())
     * .localZoneGroup("localZoneGroup")
     * .build())
     * .healthCheckId("healthCheckId")
     * .hostedZoneId("hostedZoneId")
     * .hostedZoneName("hostedZoneName")
     * .multiValueAnswer(false)
     * .region("region")
     * .resourceRecords(List.of("resourceRecords"))
     * .setIdentifier("setIdentifier")
     * .ttl("ttl")
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html)
     */
    public inline fun cfnRecordSetGroupRecordSetProperty(
        block: CfnRecordSetGroupRecordSetPropertyDsl.() -> Unit = {}
    ): CfnRecordSetGroup.RecordSetProperty {
        val builder = CfnRecordSetGroupRecordSetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRecordSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CfnRecordSetProps cfnRecordSetProps = CfnRecordSetProps.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .aliasTarget(AliasTargetProperty.builder()
     * .dnsName("dnsName")
     * .hostedZoneId("hostedZoneId")
     * // the properties below are optional
     * .evaluateTargetHealth(false)
     * .build())
     * .cidrRoutingConfig(CidrRoutingConfigProperty.builder()
     * .collectionId("collectionId")
     * .locationName("locationName")
     * .build())
     * .comment("comment")
     * .failover("failover")
     * .geoLocation(GeoLocationProperty.builder()
     * .continentCode("continentCode")
     * .countryCode("countryCode")
     * .subdivisionCode("subdivisionCode")
     * .build())
     * .geoProximityLocation(GeoProximityLocationProperty.builder()
     * .awsRegion("awsRegion")
     * .bias(123)
     * .coordinates(CoordinatesProperty.builder()
     * .latitude("latitude")
     * .longitude("longitude")
     * .build())
     * .localZoneGroup("localZoneGroup")
     * .build())
     * .healthCheckId("healthCheckId")
     * .hostedZoneId("hostedZoneId")
     * .hostedZoneName("hostedZoneName")
     * .multiValueAnswer(false)
     * .region("region")
     * .resourceRecords(List.of("resourceRecords"))
     * .setIdentifier("setIdentifier")
     * .ttl("ttl")
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html)
     */
    public inline fun cfnRecordSetProps(
        block: CfnRecordSetPropsDsl.() -> Unit = {}
    ): CfnRecordSetProps {
        val builder = CfnRecordSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A DNS CNAME record.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.certificatemanager.*;
     * import software.amazon.awscdk.services.route53.*;
     * // hosted zone and route53 features
     * String hostedZoneId;
     * String zoneName = "example.com";
     * String myDomainName = "api.example.com";
     * Certificate certificate = Certificate.Builder.create(this,
     * "cert").domainName(myDomainName).build();
     * SchemaFile schema = SchemaFile.Builder.create().filePath("mySchemaFile").build();
     * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
     * .name("myApi")
     * .definition(Definition.fromSchema(schema))
     * .domainName(DomainOptions.builder()
     * .certificate(certificate)
     * .domainName(myDomainName)
     * .build())
     * .build();
     * // hosted zone for adding appsync domain
     * IHostedZone zone = HostedZone.fromHostedZoneAttributes(this, "HostedZone",
     * HostedZoneAttributes.builder()
     * .hostedZoneId(hostedZoneId)
     * .zoneName(zoneName)
     * .build());
     * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
     * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
     * CnameRecord.Builder.create(this, "CnameApiRecord")
     * .recordName("api")
     * .zone(zone)
     * .domainName(api.getAppSyncDomainName())
     * .build();
     * ```
     */
    public inline fun cnameRecord(
        scope: Construct,
        id: String,
        block: CnameRecordDsl.() -> Unit = {},
    ): CnameRecord {
        val builder = CnameRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a CnameRecord.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.certificatemanager.*;
     * import software.amazon.awscdk.services.route53.*;
     * // hosted zone and route53 features
     * String hostedZoneId;
     * String zoneName = "example.com";
     * String myDomainName = "api.example.com";
     * Certificate certificate = Certificate.Builder.create(this,
     * "cert").domainName(myDomainName).build();
     * SchemaFile schema = SchemaFile.Builder.create().filePath("mySchemaFile").build();
     * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
     * .name("myApi")
     * .definition(Definition.fromSchema(schema))
     * .domainName(DomainOptions.builder()
     * .certificate(certificate)
     * .domainName(myDomainName)
     * .build())
     * .build();
     * // hosted zone for adding appsync domain
     * IHostedZone zone = HostedZone.fromHostedZoneAttributes(this, "HostedZone",
     * HostedZoneAttributes.builder()
     * .hostedZoneId(hostedZoneId)
     * .zoneName(zoneName)
     * .build());
     * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
     * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
     * CnameRecord.Builder.create(this, "CnameApiRecord")
     * .recordName("api")
     * .zone(zone)
     * .domainName(api.getAppSyncDomainName())
     * .build();
     * ```
     */
    public inline fun cnameRecordProps(
        block: CnameRecordPropsDsl.() -> Unit = {}
    ): CnameRecordProps {
        val builder = CnameRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Common properties to create a Route 53 hosted zone.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * CommonHostedZoneProps commonHostedZoneProps = CommonHostedZoneProps.builder()
     * .zoneName("zoneName")
     * // the properties below are optional
     * .addTrailingDot(false)
     * .comment("comment")
     * .queryLogsLogGroupArn("queryLogsLogGroupArn")
     * .build();
     * ```
     */
    public inline fun commonHostedZoneProps(
        block: CommonHostedZonePropsDsl.() -> Unit = {}
    ): CommonHostedZoneProps {
        val builder = CommonHostedZonePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Cross Account Zone Delegation record.
     *
     * Example:
     * ```
     * PublicHostedZone subZone = PublicHostedZone.Builder.create(this, "SubZone")
     * .zoneName("sub.someexample.com")
     * .build();
     * // import the delegation role by constructing the roleArn
     * String delegationRoleArn = Stack.of(this).formatArn(ArnComponents.builder()
     * .region("") // IAM is global in each partition
     * .service("iam")
     * .account("parent-account-id")
     * .resource("role")
     * .resourceName("MyDelegationRole")
     * .build());
     * IRole delegationRole = Role.fromRoleArn(this, "DelegationRole", delegationRoleArn);
     * // create the record
     * // create the record
     * CrossAccountZoneDelegationRecord.Builder.create(this, "delegate")
     * .delegatedZone(subZone)
     * .parentHostedZoneName("someexample.com") // or you can use parentHostedZoneId
     * .delegationRole(delegationRole)
     * .build();
     * ```
     */
    public inline fun crossAccountZoneDelegationRecord(
        scope: Construct,
        id: String,
        block: CrossAccountZoneDelegationRecordDsl.() -> Unit = {},
    ): CrossAccountZoneDelegationRecord {
        val builder = CrossAccountZoneDelegationRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a CrossAccountZoneDelegationRecord.
     *
     * Example:
     * ```
     * PublicHostedZone subZone = PublicHostedZone.Builder.create(this, "SubZone")
     * .zoneName("sub.someexample.com")
     * .build();
     * // import the delegation role by constructing the roleArn
     * String delegationRoleArn = Stack.of(this).formatArn(ArnComponents.builder()
     * .region("") // IAM is global in each partition
     * .service("iam")
     * .account("parent-account-id")
     * .resource("role")
     * .resourceName("MyDelegationRole")
     * .build());
     * IRole delegationRole = Role.fromRoleArn(this, "DelegationRole", delegationRoleArn);
     * // create the record
     * // create the record
     * CrossAccountZoneDelegationRecord.Builder.create(this, "delegate")
     * .delegatedZone(subZone)
     * .parentHostedZoneName("someexample.com") // or you can use parentHostedZoneId
     * .delegationRole(delegationRole)
     * .build();
     * ```
     */
    public inline fun crossAccountZoneDelegationRecordProps(
        block: CrossAccountZoneDelegationRecordPropsDsl.() -> Unit = {}
    ): CrossAccountZoneDelegationRecordProps {
        val builder = CrossAccountZoneDelegationRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A DNS DS record.
     *
     * Example:
     * ```
     * HostedZone myZone;
     * DsRecord.Builder.create(this, "DSRecord")
     * .zone(myZone)
     * .recordName("foo")
     * .values(List.of("12345 3 1 123456789abcdef67890123456789abcdef67890"))
     * .ttl(Duration.minutes(90))
     * .build();
     * ```
     */
    public inline fun dsRecord(
        scope: Construct,
        id: String,
        block: DsRecordDsl.() -> Unit = {},
    ): DsRecord {
        val builder = DsRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a DSRecord.
     *
     * Example:
     * ```
     * HostedZone myZone;
     * DsRecord.Builder.create(this, "DSRecord")
     * .zone(myZone)
     * .recordName("foo")
     * .values(List.of("12345 3 1 123456789abcdef67890123456789abcdef67890"))
     * .ttl(Duration.minutes(90))
     * .build();
     * ```
     */
    public inline fun dsRecordProps(block: DsRecordPropsDsl.() -> Unit = {}): DsRecordProps {
        val builder = DsRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Container for records, and records contain information about how to route traffic for a
     * specific domain, such as example.com and its subdomains (acme.example.com,
     * zenith.example.com).
     *
     * Example:
     * ```
     * HostedZone myHostedZone = HostedZone.Builder.create(this, "HostedZone")
     * .zoneName("example.com")
     * .build();
     * Certificate.Builder.create(this, "Certificate")
     * .domainName("hello.example.com")
     * .certificateName("Hello World Service") // Optionally provide an certificate name
     * .validation(CertificateValidation.fromDns(myHostedZone))
     * .build();
     * ```
     */
    public inline fun hostedZone(
        scope: Construct,
        id: String,
        block: HostedZoneDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.route53.HostedZone {
        val builder = HostedZoneDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Reference to a hosted zone.
     *
     * Example:
     * ```
     * App app;
     * Stack stack = Stack.Builder.create(app, "Stack")
     * .crossRegionReferences(true)
     * .env(Environment.builder()
     * .region("us-east-2")
     * .build())
     * .build();
     * HttpsRedirect.Builder.create(this, "Redirect")
     * .recordNames(List.of("foo.example.com"))
     * .targetDomain("bar.example.com")
     * .zone(HostedZone.fromHostedZoneAttributes(this, "HostedZone", HostedZoneAttributes.builder()
     * .hostedZoneId("ID")
     * .zoneName("example.com")
     * .build()))
     * .build();
     * ```
     */
    public inline fun hostedZoneAttributes(
        block: HostedZoneAttributesDsl.() -> Unit = {}
    ): HostedZoneAttributes {
        val builder = HostedZoneAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of a new hosted zone.
     *
     * Example:
     * ```
     * HostedZone hostedZone = HostedZone.Builder.create(this,
     * "MyHostedZone").zoneName("example.org").build();
     * Metric metric = Metric.Builder.create()
     * .namespace("AWS/Route53")
     * .metricName("DNSQueries")
     * .dimensionsMap(Map.of(
     * "HostedZoneId", hostedZone.getHostedZoneId()))
     * .build();
     * ```
     */
    public inline fun hostedZoneProps(block: HostedZonePropsDsl.() -> Unit = {}): HostedZoneProps {
        val builder = HostedZonePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Zone properties for looking up the Hosted Zone.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * String recordName = "www";
     * String domainName = "example.com";
     * Bucket bucketWebsite = Bucket.Builder.create(this, "BucketWebsite")
     * .bucketName(List.of(recordName, domainName).join(".")) // www.example.com
     * .publicReadAccess(true)
     * .websiteIndexDocument("index.html")
     * .build();
     * IHostedZone zone = HostedZone.fromLookup(this, "Zone",
     * HostedZoneProviderProps.builder().domainName(domainName).build()); // example.com
     * // example.com
     * ARecord.Builder.create(this, "AliasRecord")
     * .zone(zone)
     * .recordName(recordName) // www
     * .target(RecordTarget.fromAlias(new BucketWebsiteTarget(bucketWebsite)))
     * .build();
     * ```
     */
    public inline fun hostedZoneProviderProps(
        block: HostedZoneProviderPropsDsl.() -> Unit = {}
    ): HostedZoneProviderProps {
        val builder = HostedZoneProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A DNS MX record.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.route53.*;
     * GeoLocation geoLocation;
     * HostedZone hostedZone;
     * MxRecord mxRecord = MxRecord.Builder.create(this, "MyMxRecord")
     * .values(List.of(MxRecordValue.builder()
     * .hostName("hostName")
     * .priority(123)
     * .build()))
     * .zone(hostedZone)
     * // the properties below are optional
     * .comment("comment")
     * .deleteExisting(false)
     * .geoLocation(geoLocation)
     * .multiValueAnswer(false)
     * .recordName("recordName")
     * .region("region")
     * .setIdentifier("setIdentifier")
     * .ttl(Duration.minutes(30))
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun mxRecord(
        scope: Construct,
        id: String,
        block: MxRecordDsl.() -> Unit = {},
    ): MxRecord {
        val builder = MxRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a MxRecord.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.route53.*;
     * GeoLocation geoLocation;
     * HostedZone hostedZone;
     * MxRecordProps mxRecordProps = MxRecordProps.builder()
     * .values(List.of(MxRecordValue.builder()
     * .hostName("hostName")
     * .priority(123)
     * .build()))
     * .zone(hostedZone)
     * // the properties below are optional
     * .comment("comment")
     * .deleteExisting(false)
     * .geoLocation(geoLocation)
     * .multiValueAnswer(false)
     * .recordName("recordName")
     * .region("region")
     * .setIdentifier("setIdentifier")
     * .ttl(Duration.minutes(30))
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun mxRecordProps(block: MxRecordPropsDsl.() -> Unit = {}): MxRecordProps {
        val builder = MxRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a MX record value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * MxRecordValue mxRecordValue = MxRecordValue.builder()
     * .hostName("hostName")
     * .priority(123)
     * .build();
     * ```
     */
    public inline fun mxRecordValue(block: MxRecordValueDsl.() -> Unit = {}): MxRecordValue {
        val builder = MxRecordValueDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A DNS NS record.
     *
     * Example:
     * ```
     * HostedZone myZone;
     * NsRecord.Builder.create(this, "NSRecord")
     * .zone(myZone)
     * .recordName("foo")
     * .values(List.of("ns-1.awsdns.co.uk.", "ns-2.awsdns.com."))
     * .ttl(Duration.minutes(90))
     * .build();
     * ```
     */
    public inline fun nsRecord(
        scope: Construct,
        id: String,
        block: NsRecordDsl.() -> Unit = {},
    ): NsRecord {
        val builder = NsRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a NSRecord.
     *
     * Example:
     * ```
     * HostedZone myZone;
     * NsRecord.Builder.create(this, "NSRecord")
     * .zone(myZone)
     * .recordName("foo")
     * .values(List.of("ns-1.awsdns.co.uk.", "ns-2.awsdns.com."))
     * .ttl(Duration.minutes(90))
     * .build();
     * ```
     */
    public inline fun nsRecordProps(block: NsRecordPropsDsl.() -> Unit = {}): NsRecordProps {
        val builder = NsRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a Route53 private hosted zone for use in one or more VPCs.
     *
     * Note that `enableDnsHostnames` and `enableDnsSupport` must have been enabled for the VPC
     * you're configuring for private hosted zones.
     *
     * Example:
     * ```
     * Vpc vpc;
     * PrivateHostedZone zone = PrivateHostedZone.Builder.create(this, "HostedZone")
     * .zoneName("fully.qualified.domain.com")
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun privateHostedZone(
        scope: Construct,
        id: String,
        block: PrivateHostedZoneDsl.() -> Unit = {},
    ): PrivateHostedZone {
        val builder = PrivateHostedZoneDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to create a Route 53 private hosted zone.
     *
     * Example:
     * ```
     * Vpc vpc;
     * PrivateHostedZone zone = PrivateHostedZone.Builder.create(this, "HostedZone")
     * .zoneName("fully.qualified.domain.com")
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun privateHostedZoneProps(
        block: PrivateHostedZonePropsDsl.() -> Unit = {}
    ): PrivateHostedZoneProps {
        val builder = PrivateHostedZonePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a Route53 public hosted zone.
     *
     * Example:
     * ```
     * Stack stack1 = Stack.Builder.create(app, "Stack1")
     * .env(Environment.builder()
     * .region("us-east-1")
     * .build())
     * .crossRegionReferences(true)
     * .build();
     * Certificate cert = Certificate.Builder.create(stack1, "Cert")
     * .domainName("*.example.com")
     * .validation(CertificateValidation.fromDns(PublicHostedZone.fromHostedZoneId(stack1, "Zone",
     * "Z0329774B51CGXTDQV3X")))
     * .build();
     * Stack stack2 = Stack.Builder.create(app, "Stack2")
     * .env(Environment.builder()
     * .region("us-east-2")
     * .build())
     * .crossRegionReferences(true)
     * .build();
     * Distribution.Builder.create(stack2, "Distribution")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(new HttpOrigin("example.com"))
     * .build())
     * .domainNames(List.of("dev.example.com"))
     * .certificate(cert)
     * .build();
     * ```
     */
    public inline fun publicHostedZone(
        scope: Construct,
        id: String,
        block: PublicHostedZoneDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.route53.PublicHostedZone {
        val builder = PublicHostedZoneDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Reference to a public hosted zone.
     *
     * Example:
     * ```
     * IPublicHostedZone zoneFromAttributes = PublicHostedZone.fromPublicHostedZoneAttributes(this,
     * "MyZone", PublicHostedZoneAttributes.builder()
     * .zoneName("example.com")
     * .hostedZoneId("ZOJJZC49E0EPZ")
     * .build());
     * // Does not know zoneName
     * IPublicHostedZone zoneFromId = PublicHostedZone.fromPublicHostedZoneId(this, "MyZone",
     * "ZOJJZC49E0EPZ");
     * ```
     */
    public inline fun publicHostedZoneAttributes(
        block: PublicHostedZoneAttributesDsl.() -> Unit = {}
    ): PublicHostedZoneAttributes {
        val builder = PublicHostedZoneAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a PublicHostedZone.
     *
     * Example:
     * ```
     * PublicHostedZone parentZone = PublicHostedZone.Builder.create(this, "HostedZone")
     * .zoneName("someexample.com")
     * .build();
     * Role crossAccountRole = Role.Builder.create(this, "CrossAccountRole")
     * // The role name must be predictable
     * .roleName("MyDelegationRole")
     * // The other account
     * .assumedBy(new AccountPrincipal("12345678901"))
     * // You can scope down this role policy to be least privileged.
     * // If you want the other account to be able to manage specific records,
     * // you can scope down by resource and/or normalized record names
     * .inlinePolicies(Map.of(
     * "crossAccountPolicy", PolicyDocument.Builder.create()
     * .statements(List.of(
     * PolicyStatement.Builder.create()
     * .sid("ListHostedZonesByName")
     * .effect(Effect.ALLOW)
     * .actions(List.of("route53:ListHostedZonesByName"))
     * .resources(List.of("*"))
     * .build(),
     * PolicyStatement.Builder.create()
     * .sid("GetHostedZoneAndChangeResourceRecordSet")
     * .effect(Effect.ALLOW)
     * .actions(List.of("route53:GetHostedZone", "route53:ChangeResourceRecordSet"))
     * // This example assumes the RecordSet subdomain.somexample.com
     * // is contained in the HostedZone
     * .resources(List.of("arn:aws:route53:::hostedzone/HZID00000000000000000"))
     * .conditions(Map.of(
     * "ForAllValues:StringLike", Map.of(
     * "route53:ChangeResourceRecordSetsNormalizedRecordNames",
     * List.of("subdomain.someexample.com"))))
     * .build()))
     * .build()))
     * .build();
     * parentZone.grantDelegation(crossAccountRole);
     * ```
     */
    public inline fun publicHostedZoneProps(
        block: PublicHostedZonePropsDsl.() -> Unit = {}
    ): PublicHostedZoneProps {
        val builder = PublicHostedZonePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A record set.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.route53.*;
     * GeoLocation geoLocation;
     * HostedZone hostedZone;
     * RecordTarget recordTarget;
     * RecordSet recordSet = RecordSet.Builder.create(this, "MyRecordSet")
     * .recordType(RecordType.A)
     * .target(recordTarget)
     * .zone(hostedZone)
     * // the properties below are optional
     * .comment("comment")
     * .deleteExisting(false)
     * .geoLocation(geoLocation)
     * .multiValueAnswer(false)
     * .recordName("recordName")
     * .region("region")
     * .setIdentifier("setIdentifier")
     * .ttl(Duration.minutes(30))
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun recordSet(
        scope: Construct,
        id: String,
        block: RecordSetDsl.() -> Unit = {},
    ): RecordSet {
        val builder = RecordSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a RecordSet.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.route53.*;
     * GeoLocation geoLocation;
     * HostedZone hostedZone;
     * RecordSetOptions recordSetOptions = RecordSetOptions.builder()
     * .zone(hostedZone)
     * // the properties below are optional
     * .comment("comment")
     * .deleteExisting(false)
     * .geoLocation(geoLocation)
     * .multiValueAnswer(false)
     * .recordName("recordName")
     * .region("region")
     * .setIdentifier("setIdentifier")
     * .ttl(Duration.minutes(30))
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun recordSetOptions(
        block: RecordSetOptionsDsl.() -> Unit = {}
    ): RecordSetOptions {
        val builder = RecordSetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a RecordSet.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.route53.*;
     * GeoLocation geoLocation;
     * HostedZone hostedZone;
     * RecordTarget recordTarget;
     * RecordSetProps recordSetProps = RecordSetProps.builder()
     * .recordType(RecordType.A)
     * .target(recordTarget)
     * .zone(hostedZone)
     * // the properties below are optional
     * .comment("comment")
     * .deleteExisting(false)
     * .geoLocation(geoLocation)
     * .multiValueAnswer(false)
     * .recordName("recordName")
     * .region("region")
     * .setIdentifier("setIdentifier")
     * .ttl(Duration.minutes(30))
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun recordSetProps(block: RecordSetPropsDsl.() -> Unit = {}): RecordSetProps {
        val builder = RecordSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A DNS SRV record.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.route53.*;
     * GeoLocation geoLocation;
     * HostedZone hostedZone;
     * SrvRecord srvRecord = SrvRecord.Builder.create(this, "MySrvRecord")
     * .values(List.of(SrvRecordValue.builder()
     * .hostName("hostName")
     * .port(123)
     * .priority(123)
     * .weight(123)
     * .build()))
     * .zone(hostedZone)
     * // the properties below are optional
     * .comment("comment")
     * .deleteExisting(false)
     * .geoLocation(geoLocation)
     * .multiValueAnswer(false)
     * .recordName("recordName")
     * .region("region")
     * .setIdentifier("setIdentifier")
     * .ttl(Duration.minutes(30))
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun srvRecord(
        scope: Construct,
        id: String,
        block: SrvRecordDsl.() -> Unit = {},
    ): SrvRecord {
        val builder = SrvRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a SrvRecord.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.route53.*;
     * GeoLocation geoLocation;
     * HostedZone hostedZone;
     * SrvRecordProps srvRecordProps = SrvRecordProps.builder()
     * .values(List.of(SrvRecordValue.builder()
     * .hostName("hostName")
     * .port(123)
     * .priority(123)
     * .weight(123)
     * .build()))
     * .zone(hostedZone)
     * // the properties below are optional
     * .comment("comment")
     * .deleteExisting(false)
     * .geoLocation(geoLocation)
     * .multiValueAnswer(false)
     * .recordName("recordName")
     * .region("region")
     * .setIdentifier("setIdentifier")
     * .ttl(Duration.minutes(30))
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun srvRecordProps(block: SrvRecordPropsDsl.() -> Unit = {}): SrvRecordProps {
        val builder = SrvRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a SRV record value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53.*;
     * SrvRecordValue srvRecordValue = SrvRecordValue.builder()
     * .hostName("hostName")
     * .port(123)
     * .priority(123)
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun srvRecordValue(block: SrvRecordValueDsl.() -> Unit = {}): SrvRecordValue {
        val builder = SrvRecordValueDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A DNS TXT record.
     *
     * Example:
     * ```
     * HostedZone myZone;
     * TxtRecord.Builder.create(this, "TXTRecord")
     * .zone(myZone)
     * .recordName("_foo") // If the name ends with a ".", it will be used as-is;
     * // if it ends with a "." followed by the zone name, a trailing "." will be added automatically;
     * // otherwise, a ".", the zone name, and a trailing "." will be added automatically.
     * // Defaults to zone root if not specified.
     * .values(List.of("Bar!", "Baz?"))
     * .ttl(Duration.minutes(90))
     * .build();
     * ```
     */
    public inline fun txtRecord(
        scope: Construct,
        id: String,
        block: TxtRecordDsl.() -> Unit = {},
    ): TxtRecord {
        val builder = TxtRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a TxtRecord.
     *
     * Example:
     * ```
     * HostedZone myZone;
     * TxtRecord.Builder.create(this, "TXTRecord")
     * .zone(myZone)
     * .recordName("_foo") // If the name ends with a ".", it will be used as-is;
     * // if it ends with a "." followed by the zone name, a trailing "." will be added automatically;
     * // otherwise, a ".", the zone name, and a trailing "." will be added automatically.
     * // Defaults to zone root if not specified.
     * .values(List.of("Bar!", "Baz?"))
     * .ttl(Duration.minutes(90))
     * .build();
     * ```
     */
    public inline fun txtRecordProps(block: TxtRecordPropsDsl.() -> Unit = {}): TxtRecordProps {
        val builder = TxtRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Private DNS configuration for a VPC endpoint service.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.route53.PublicHostedZone;
     * import software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName;
     * PublicHostedZone zone;
     * VpcEndpointService vpces;
     * VpcEndpointServiceDomainName.Builder.create(this, "EndpointDomain")
     * .endpointService(vpces)
     * .domainName("my-stuff.aws-cdk.dev")
     * .publicHostedZone(zone)
     * .build();
     * ```
     */
    public inline fun vpcEndpointServiceDomainName(
        scope: Construct,
        id: String,
        block: VpcEndpointServiceDomainNameDsl.() -> Unit = {},
    ): VpcEndpointServiceDomainName {
        val builder = VpcEndpointServiceDomainNameDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to configure a VPC Endpoint Service domain name.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.route53.PublicHostedZone;
     * import software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName;
     * PublicHostedZone zone;
     * VpcEndpointService vpces;
     * VpcEndpointServiceDomainName.Builder.create(this, "EndpointDomain")
     * .endpointService(vpces)
     * .domainName("my-stuff.aws-cdk.dev")
     * .publicHostedZone(zone)
     * .build();
     * ```
     */
    public inline fun vpcEndpointServiceDomainNameProps(
        block: VpcEndpointServiceDomainNamePropsDsl.() -> Unit = {}
    ): VpcEndpointServiceDomainNameProps {
        val builder = VpcEndpointServiceDomainNamePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options available when creating a delegation relationship from one PublicHostedZone to
     * another.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.route53.*;
     * ZoneDelegationOptions zoneDelegationOptions = ZoneDelegationOptions.builder()
     * .comment("comment")
     * .ttl(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun zoneDelegationOptions(
        block: ZoneDelegationOptionsDsl.() -> Unit = {}
    ): ZoneDelegationOptions {
        val builder = ZoneDelegationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A record to delegate further lookups to a different set of name servers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.route53.*;
     * GeoLocation geoLocation;
     * HostedZone hostedZone;
     * ZoneDelegationRecord zoneDelegationRecord = ZoneDelegationRecord.Builder.create(this,
     * "MyZoneDelegationRecord")
     * .nameServers(List.of("nameServers"))
     * .zone(hostedZone)
     * // the properties below are optional
     * .comment("comment")
     * .deleteExisting(false)
     * .geoLocation(geoLocation)
     * .multiValueAnswer(false)
     * .recordName("recordName")
     * .region("region")
     * .setIdentifier("setIdentifier")
     * .ttl(Duration.minutes(30))
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun zoneDelegationRecord(
        scope: Construct,
        id: String,
        block: ZoneDelegationRecordDsl.() -> Unit = {},
    ): ZoneDelegationRecord {
        val builder = ZoneDelegationRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a ZoneDelegationRecord.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.route53.*;
     * GeoLocation geoLocation;
     * HostedZone hostedZone;
     * ZoneDelegationRecordProps zoneDelegationRecordProps = ZoneDelegationRecordProps.builder()
     * .nameServers(List.of("nameServers"))
     * .zone(hostedZone)
     * // the properties below are optional
     * .comment("comment")
     * .deleteExisting(false)
     * .geoLocation(geoLocation)
     * .multiValueAnswer(false)
     * .recordName("recordName")
     * .region("region")
     * .setIdentifier("setIdentifier")
     * .ttl(Duration.minutes(30))
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun zoneDelegationRecordProps(
        block: ZoneDelegationRecordPropsDsl.() -> Unit = {}
    ): ZoneDelegationRecordProps {
        val builder = ZoneDelegationRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public object HostedZone {
        public fun fromHostedZoneAttributes(
            scope: Construct,
            id: String,
            block: HostedZoneAttributesDsl.() -> Unit = {},
        ): IHostedZone {
            val builder = HostedZoneAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.route53.HostedZone.fromHostedZoneAttributes(
                scope,
                id,
                builder.build()
            )
        }

        public fun fromLookup(
            scope: Construct,
            id: String,
            block: HostedZoneProviderPropsDsl.() -> Unit = {},
        ): IHostedZone {
            val builder = HostedZoneProviderPropsDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.route53.HostedZone.fromLookup(
                scope,
                id,
                builder.build()
            )
        }
    }

    public object PublicHostedZone {
        public fun fromPublicHostedZoneAttributes(
            scope: Construct,
            id: String,
            block: PublicHostedZoneAttributesDsl.() -> Unit = {},
        ): IPublicHostedZone {
            val builder = PublicHostedZoneAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.route53.PublicHostedZone
                .fromPublicHostedZoneAttributes(scope, id, builder.build())
        }
    }
}
