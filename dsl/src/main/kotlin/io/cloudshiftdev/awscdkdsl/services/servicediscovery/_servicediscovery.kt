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

package io.cloudshiftdev.awscdkdsl.services.servicediscovery

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.AliasTargetInstance
import software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps
import software.amazon.awscdk.services.servicediscovery.BaseInstanceProps
import software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps
import software.amazon.awscdk.services.servicediscovery.BaseServiceProps
import software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace
import software.amazon.awscdk.services.servicediscovery.CfnHttpNamespaceProps
import software.amazon.awscdk.services.servicediscovery.CfnInstance
import software.amazon.awscdk.services.servicediscovery.CfnInstanceProps
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps
import software.amazon.awscdk.services.servicediscovery.CfnService
import software.amazon.awscdk.services.servicediscovery.CfnServiceProps
import software.amazon.awscdk.services.servicediscovery.CnameInstance
import software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps
import software.amazon.awscdk.services.servicediscovery.CnameInstanceProps
import software.amazon.awscdk.services.servicediscovery.DnsServiceProps
import software.amazon.awscdk.services.servicediscovery.HealthCheckConfig
import software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig
import software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes
import software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps
import software.amazon.awscdk.services.servicediscovery.IHttpNamespace
import software.amazon.awscdk.services.servicediscovery.IPrivateDnsNamespace
import software.amazon.awscdk.services.servicediscovery.IPublicDnsNamespace
import software.amazon.awscdk.services.servicediscovery.IService
import software.amazon.awscdk.services.servicediscovery.IpInstance
import software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps
import software.amazon.awscdk.services.servicediscovery.IpInstanceProps
import software.amazon.awscdk.services.servicediscovery.NonIpInstance
import software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps
import software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceAttributes
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps
import software.amazon.awscdk.services.servicediscovery.ServiceAttributes
import software.amazon.awscdk.services.servicediscovery.ServiceProps
import software.constructs.Construct

public object servicediscovery {
    /**
     * Instance that uses Route 53 Alias record type.
     *
     * Currently, the only resource types supported are Elastic Load Balancers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * Service service;
     * AliasTargetInstance aliasTargetInstance = AliasTargetInstance.Builder.create(this,
     * "MyAliasTargetInstance")
     * .dnsName("dnsName")
     * .service(service)
     * // the properties below are optional
     * .customAttributes(Map.of(
     * "customAttributesKey", "customAttributes"))
     * .instanceId("instanceId")
     * .build();
     * ```
     */
    public inline fun aliasTargetInstance(
        scope: Construct,
        id: String,
        block: AliasTargetInstanceDsl.() -> Unit = {},
    ): AliasTargetInstance {
        val builder = AliasTargetInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * Service service;
     * AliasTargetInstanceProps aliasTargetInstanceProps = AliasTargetInstanceProps.builder()
     * .dnsName("dnsName")
     * .service(service)
     * // the properties below are optional
     * .customAttributes(Map.of(
     * "customAttributesKey", "customAttributes"))
     * .instanceId("instanceId")
     * .build();
     * ```
     */
    public inline fun aliasTargetInstanceProps(
        block: AliasTargetInstancePropsDsl.() -> Unit = {}
    ): AliasTargetInstanceProps {
        val builder = AliasTargetInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used when the resource that's associated with the service instance is accessible using values
     * other than an IP address or a domain name (CNAME), i.e. for non-ip-instances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * BaseInstanceProps baseInstanceProps = BaseInstanceProps.builder()
     * .customAttributes(Map.of(
     * "customAttributesKey", "customAttributes"))
     * .instanceId("instanceId")
     * .build();
     * ```
     */
    public inline fun baseInstanceProps(
        block: BaseInstancePropsDsl.() -> Unit = {}
    ): BaseInstanceProps {
        val builder = BaseInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * BaseNamespaceProps baseNamespaceProps = BaseNamespaceProps.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     */
    public inline fun baseNamespaceProps(
        block: BaseNamespacePropsDsl.() -> Unit = {}
    ): BaseNamespaceProps {
        val builder = BaseNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Basic props needed to create a service in a given namespace.
     *
     * Used by HttpNamespace.createService
     *
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.*;
     * App app = new App();
     * Stack stack = new Stack(app, "aws-servicediscovery-integ");
     * HttpNamespace namespace = HttpNamespace.Builder.create(stack, "MyNamespace")
     * .name("MyHTTPNamespace")
     * .build();
     * Service service1 = namespace.createService("NonIpService", BaseServiceProps.builder()
     * .description("service registering non-ip instances")
     * .build());
     * service1.registerNonIpInstance("NonIpInstance", NonIpInstanceBaseProps.builder()
     * .customAttributes(Map.of("arn", "arn:aws:s3:::mybucket"))
     * .build());
     * Service service2 = namespace.createService("IpService", BaseServiceProps.builder()
     * .description("service registering ip instances")
     * .healthCheck(HealthCheckConfig.builder()
     * .type(HealthCheckType.HTTP)
     * .resourcePath("/check")
     * .build())
     * .build());
     * service2.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
     * .ipv4("54.239.25.192")
     * .build());
     * app.synth();
     * ```
     */
    public inline fun baseServiceProps(
        block: BaseServicePropsDsl.() -> Unit = {}
    ): BaseServiceProps {
        val builder = BaseServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `HttpNamespace` resource is an AWS Cloud Map resource type that contains information
     * about an HTTP namespace.
     *
     * Service instances that you register using an HTTP namespace can be discovered using a
     * `DiscoverInstances` request but can't be discovered using DNS.
     *
     * For the current quota on the number of namespaces that you can create using the same AWS
     * account, see
     * [AWS Cloud Map quotas](https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html)
     * in the ** .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * CfnHttpNamespace cfnHttpNamespace = CfnHttpNamespace.Builder.create(this, "MyCfnHttpNamespace")
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html)
     */
    public inline fun cfnHttpNamespace(
        scope: Construct,
        id: String,
        block: CfnHttpNamespaceDsl.() -> Unit = {},
    ): CfnHttpNamespace {
        val builder = CfnHttpNamespaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnHttpNamespace`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * CfnHttpNamespaceProps cfnHttpNamespaceProps = CfnHttpNamespaceProps.builder()
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html)
     */
    public inline fun cfnHttpNamespaceProps(
        block: CfnHttpNamespacePropsDsl.() -> Unit = {}
    ): CfnHttpNamespaceProps {
        val builder = CfnHttpNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains information about an instance that AWS Cloud Map creates when
     * you submit a `RegisterInstance` request.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * Object instanceAttributes;
     * CfnInstance cfnInstance = CfnInstance.Builder.create(this, "MyCfnInstance")
     * .instanceAttributes(instanceAttributes)
     * .serviceId("serviceId")
     * // the properties below are optional
     * .instanceId("instanceId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html)
     */
    public inline fun cfnInstance(
        scope: Construct,
        id: String,
        block: CfnInstanceDsl.() -> Unit = {},
    ): CfnInstance {
        val builder = CfnInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInstance`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * Object instanceAttributes;
     * CfnInstanceProps cfnInstanceProps = CfnInstanceProps.builder()
     * .instanceAttributes(instanceAttributes)
     * .serviceId("serviceId")
     * // the properties below are optional
     * .instanceId("instanceId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html)
     */
    public inline fun cfnInstanceProps(
        block: CfnInstancePropsDsl.() -> Unit = {}
    ): CfnInstanceProps {
        val builder = CfnInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a private namespace based on DNS, which is visible only inside a specified Amazon
     * VPC.
     *
     * The namespace defines your service naming scheme. For example, if you name your namespace
     * `example.com` and name your service `backend` , the resulting DNS name for the service is
     * `backend.example.com` . Service instances that are registered using a private DNS namespace
     * can be discovered using either a `DiscoverInstances` request or using DNS. For the current
     * quota on the number of namespaces that you can create using the same AWS account , see
     * [AWS Cloud Map quotas](https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html)
     * in the *AWS Cloud Map Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * CfnPrivateDnsNamespace cfnPrivateDnsNamespace = CfnPrivateDnsNamespace.Builder.create(this,
     * "MyCfnPrivateDnsNamespace")
     * .name("name")
     * .vpc("vpc")
     * // the properties below are optional
     * .description("description")
     * .properties(PropertiesProperty.builder()
     * .dnsProperties(PrivateDnsPropertiesMutableProperty.builder()
     * .soa(SOAProperty.builder()
     * .ttl(123)
     * .build())
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html)
     */
    public inline fun cfnPrivateDnsNamespace(
        scope: Construct,
        id: String,
        block: CfnPrivateDnsNamespaceDsl.() -> Unit = {},
    ): CfnPrivateDnsNamespace {
        val builder = CfnPrivateDnsNamespaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * DNS properties for the private DNS namespace.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * PrivateDnsPropertiesMutableProperty privateDnsPropertiesMutableProperty =
     * PrivateDnsPropertiesMutableProperty.builder()
     * .soa(SOAProperty.builder()
     * .ttl(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-privatednsnamespace-privatednspropertiesmutable.html)
     */
    public inline fun cfnPrivateDnsNamespacePrivateDnsPropertiesMutableProperty(
        block: CfnPrivateDnsNamespacePrivateDnsPropertiesMutablePropertyDsl.() -> Unit = {}
    ): CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty {
        val builder = CfnPrivateDnsNamespacePrivateDnsPropertiesMutablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the private DNS namespace.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * PropertiesProperty propertiesProperty = PropertiesProperty.builder()
     * .dnsProperties(PrivateDnsPropertiesMutableProperty.builder()
     * .soa(SOAProperty.builder()
     * .ttl(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-privatednsnamespace-properties.html)
     */
    public inline fun cfnPrivateDnsNamespacePropertiesProperty(
        block: CfnPrivateDnsNamespacePropertiesPropertyDsl.() -> Unit = {}
    ): CfnPrivateDnsNamespace.PropertiesProperty {
        val builder = CfnPrivateDnsNamespacePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPrivateDnsNamespace`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * CfnPrivateDnsNamespaceProps cfnPrivateDnsNamespaceProps = CfnPrivateDnsNamespaceProps.builder()
     * .name("name")
     * .vpc("vpc")
     * // the properties below are optional
     * .description("description")
     * .properties(PropertiesProperty.builder()
     * .dnsProperties(PrivateDnsPropertiesMutableProperty.builder()
     * .soa(SOAProperty.builder()
     * .ttl(123)
     * .build())
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html)
     */
    public inline fun cfnPrivateDnsNamespaceProps(
        block: CfnPrivateDnsNamespacePropsDsl.() -> Unit = {}
    ): CfnPrivateDnsNamespaceProps {
        val builder = CfnPrivateDnsNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Start of Authority (SOA) properties for a public or private DNS namespace.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * SOAProperty sOAProperty = SOAProperty.builder()
     * .ttl(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-privatednsnamespace-soa.html)
     */
    public inline fun cfnPrivateDnsNamespaceSOAProperty(
        block: CfnPrivateDnsNamespaceSOAPropertyDsl.() -> Unit = {}
    ): CfnPrivateDnsNamespace.SOAProperty {
        val builder = CfnPrivateDnsNamespaceSOAPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a public namespace based on DNS, which is visible on the internet.
     *
     * The namespace defines your service naming scheme. For example, if you name your namespace
     * `example.com` and name your service `backend` , the resulting DNS name for the service is
     * `backend.example.com` . You can discover instances that were registered with a public DNS
     * namespace by using either a `DiscoverInstances` request or using DNS. For the current quota
     * on the number of namespaces that you can create using the same AWS account , see
     * [AWS Cloud Map quotas](https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html)
     * in the *AWS Cloud Map Developer Guide* .
     *
     * The `CreatePublicDnsNamespace` API operation is not supported in the AWS GovCloud (US)
     * Regions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * CfnPublicDnsNamespace cfnPublicDnsNamespace = CfnPublicDnsNamespace.Builder.create(this,
     * "MyCfnPublicDnsNamespace")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .properties(PropertiesProperty.builder()
     * .dnsProperties(PublicDnsPropertiesMutableProperty.builder()
     * .soa(SOAProperty.builder()
     * .ttl(123)
     * .build())
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html)
     */
    public inline fun cfnPublicDnsNamespace(
        scope: Construct,
        id: String,
        block: CfnPublicDnsNamespaceDsl.() -> Unit = {},
    ): CfnPublicDnsNamespace {
        val builder = CfnPublicDnsNamespaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the public DNS namespace.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * PropertiesProperty propertiesProperty = PropertiesProperty.builder()
     * .dnsProperties(PublicDnsPropertiesMutableProperty.builder()
     * .soa(SOAProperty.builder()
     * .ttl(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-publicdnsnamespace-properties.html)
     */
    public inline fun cfnPublicDnsNamespacePropertiesProperty(
        block: CfnPublicDnsNamespacePropertiesPropertyDsl.() -> Unit = {}
    ): CfnPublicDnsNamespace.PropertiesProperty {
        val builder = CfnPublicDnsNamespacePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPublicDnsNamespace`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * CfnPublicDnsNamespaceProps cfnPublicDnsNamespaceProps = CfnPublicDnsNamespaceProps.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .properties(PropertiesProperty.builder()
     * .dnsProperties(PublicDnsPropertiesMutableProperty.builder()
     * .soa(SOAProperty.builder()
     * .ttl(123)
     * .build())
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html)
     */
    public inline fun cfnPublicDnsNamespaceProps(
        block: CfnPublicDnsNamespacePropsDsl.() -> Unit = {}
    ): CfnPublicDnsNamespaceProps {
        val builder = CfnPublicDnsNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * DNS properties for the public DNS namespace.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * PublicDnsPropertiesMutableProperty publicDnsPropertiesMutableProperty =
     * PublicDnsPropertiesMutableProperty.builder()
     * .soa(SOAProperty.builder()
     * .ttl(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-publicdnsnamespace-publicdnspropertiesmutable.html)
     */
    public inline fun cfnPublicDnsNamespacePublicDnsPropertiesMutableProperty(
        block: CfnPublicDnsNamespacePublicDnsPropertiesMutablePropertyDsl.() -> Unit = {}
    ): CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty {
        val builder = CfnPublicDnsNamespacePublicDnsPropertiesMutablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Start of Authority (SOA) properties for a public or private DNS namespace.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * SOAProperty sOAProperty = SOAProperty.builder()
     * .ttl(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-publicdnsnamespace-soa.html)
     */
    public inline fun cfnPublicDnsNamespaceSOAProperty(
        block: CfnPublicDnsNamespaceSOAPropertyDsl.() -> Unit = {}
    ): CfnPublicDnsNamespace.SOAProperty {
        val builder = CfnPublicDnsNamespaceSOAPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains information about a service, which defines the configuration of
     * the following entities:.
     * * For public and private DNS namespaces, one of the following combinations of DNS records in
     *   Amazon Route 53:
     * * A
     * * AAAA
     * * A and AAAA
     * * SRV
     * * CNAME
     * * Optionally, a health check
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * CfnService cfnService = CfnService.Builder.create(this, "MyCfnService")
     * .description("description")
     * .dnsConfig(DnsConfigProperty.builder()
     * .dnsRecords(List.of(DnsRecordProperty.builder()
     * .ttl(123)
     * .type("type")
     * .build()))
     * // the properties below are optional
     * .namespaceId("namespaceId")
     * .routingPolicy("routingPolicy")
     * .build())
     * .healthCheckConfig(HealthCheckConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .failureThreshold(123)
     * .resourcePath("resourcePath")
     * .build())
     * .healthCheckCustomConfig(HealthCheckCustomConfigProperty.builder()
     * .failureThreshold(123)
     * .build())
     * .name("name")
     * .namespaceId("namespaceId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html)
     */
    public inline fun cfnService(
        scope: Construct,
        id: String,
        block: CfnServiceDsl.() -> Unit = {},
    ): CfnService {
        val builder = CfnServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains information about the Amazon Route 53 DNS records that you want
     * AWS Cloud Map to create when you register an instance.
     *
     * The record types of a service can only be changed by deleting the service and recreating it
     * with a new `Dnsconfig` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * DnsConfigProperty dnsConfigProperty = DnsConfigProperty.builder()
     * .dnsRecords(List.of(DnsRecordProperty.builder()
     * .ttl(123)
     * .type("type")
     * .build()))
     * // the properties below are optional
     * .namespaceId("namespaceId")
     * .routingPolicy("routingPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html)
     */
    public inline fun cfnServiceDnsConfigProperty(
        block: CfnServiceDnsConfigPropertyDsl.() -> Unit = {}
    ): CfnService.DnsConfigProperty {
        val builder = CfnServiceDnsConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains information about the Route 53 DNS records that you want AWS
     * Cloud Map to create when you register an instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * DnsRecordProperty dnsRecordProperty = DnsRecordProperty.builder()
     * .ttl(123)
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html)
     */
    public inline fun cfnServiceDnsRecordProperty(
        block: CfnServiceDnsRecordPropertyDsl.() -> Unit = {}
    ): CfnService.DnsRecordProperty {
        val builder = CfnServiceDnsRecordPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * *Public DNS and HTTP namespaces only.* A complex type that contains settings for an optional
     * health check. If you specify settings for a health check, AWS Cloud Map associates the health
     * check with the records that you specify in `DnsConfig` .
     *
     * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
     * or `HealthCheckConfig` but not both.
     *
     * Health checks are basic Route 53 health checks that monitor an AWS endpoint. For information
     * about pricing for health checks, see
     * [Amazon Route 53 Pricing](https://docs.aws.amazon.com/route53/pricing/) .
     *
     * Note the following about configuring health checks.
     * * **A and AAAA records** - If `DnsConfig` includes configurations for both `A` and `AAAA`
     *   records, AWS Cloud Map creates a health check that uses the IPv4 address to check the
     *   health of the resource. If the endpoint tthat's specified by the IPv4 address is unhealthy,
     *   Route 53 considers both the `A` and `AAAA` records to be unhealthy.
     * * **CNAME records** - You can't specify settings for `HealthCheckConfig` when the `DNSConfig`
     *   includes `CNAME` for the value of `Type` . If you do, the `CreateService` request will fail
     *   with an `InvalidInput` error.
     * * **Request interval** - A Route 53 health checker in each health-checking AWS Region sends a
     *   health check request to an endpoint every 30 seconds. On average, your endpoint receives a
     *   health check request about every two seconds. However, health checkers don't coordinate
     *   with one another. Therefore, you might sometimes see several requests in one second that's
     *   followed by a few seconds with no health checks at all.
     * * **Health checking regions** - Health checkers perform checks from all Route 53
     *   health-checking Regions. For a list of the current Regions, see
     *   [Regions](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html#Route53-Type-HealthCheckConfig-Regions)
     *   .
     * * **Alias records** - When you register an instance, if you include the `AWS_ALIAS_DNS_NAME`
     *   attribute, AWS Cloud Map creates a Route 53 alias record. Note the following:
     * * Route 53 automatically sets `EvaluateTargetHealth` to true for alias records. When
     *   `EvaluateTargetHealth` is true, the alias record inherits the health of the referenced AWS
     *   resource. such as an ELB load balancer. For more information, see
     *   [EvaluateTargetHealth](https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-EvaluateTargetHealth)
     *   .
     * * If you include `HealthCheckConfig` and then use the service to register an instance that
     *   creates an alias record, Route 53 doesn't create the health check.
     * * **Charges for health checks** - Health checks are basic Route 53 health checks that monitor
     *   an AWS endpoint. For information about pricing for health checks, see
     *   [Amazon Route 53 Pricing](https://docs.aws.amazon.com/route53/pricing/) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * HealthCheckConfigProperty healthCheckConfigProperty = HealthCheckConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .failureThreshold(123)
     * .resourcePath("resourcePath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html)
     */
    public inline fun cfnServiceHealthCheckConfigProperty(
        block: CfnServiceHealthCheckConfigPropertyDsl.() -> Unit = {}
    ): CfnService.HealthCheckConfigProperty {
        val builder = CfnServiceHealthCheckConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains information about an optional custom health check.
     *
     * A custom health check, which requires that you use a third-party health checker to evaluate
     * the health of your resources, is useful in the following circumstances:
     * * You can't use a health check that's defined by `HealthCheckConfig` because the resource
     *   isn't available over the internet. For example, you can use a custom health check when the
     *   instance is in an Amazon VPC. (To check the health of resources in a VPC, the health
     *   checker must also be in the VPC.)
     * * You want to use a third-party health checker regardless of where your resources are
     *   located.
     *
     * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
     * or `HealthCheckConfig` but not both.
     *
     * To change the status of a custom health check, submit an `UpdateInstanceCustomHealthStatus`
     * request. AWS Cloud Map doesn't monitor the status of the resource, it just keeps a record of
     * the status specified in the most recent `UpdateInstanceCustomHealthStatus` request.
     *
     * Here's how custom health checks work:
     * * You create a service.
     * * You register an instance.
     * * You configure a third-party health checker to monitor the resource that's associated with
     *   the new instance.
     *
     * AWS Cloud Map doesn't check the health of the resource directly.
     * * The third-party health-checker determines that the resource is unhealthy and notifies your
     *   application.
     * * Your application submits an `UpdateInstanceCustomHealthStatus` request.
     * * AWS Cloud Map waits for 30 seconds.
     * * If another `UpdateInstanceCustomHealthStatus` request doesn't arrive during that time to
     *   change the status back to healthy, AWS Cloud Map stops routing traffic to the resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * HealthCheckCustomConfigProperty healthCheckCustomConfigProperty =
     * HealthCheckCustomConfigProperty.builder()
     * .failureThreshold(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html)
     */
    public inline fun cfnServiceHealthCheckCustomConfigProperty(
        block: CfnServiceHealthCheckCustomConfigPropertyDsl.() -> Unit = {}
    ): CfnService.HealthCheckCustomConfigProperty {
        val builder = CfnServiceHealthCheckCustomConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnService`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * CfnServiceProps cfnServiceProps = CfnServiceProps.builder()
     * .description("description")
     * .dnsConfig(DnsConfigProperty.builder()
     * .dnsRecords(List.of(DnsRecordProperty.builder()
     * .ttl(123)
     * .type("type")
     * .build()))
     * // the properties below are optional
     * .namespaceId("namespaceId")
     * .routingPolicy("routingPolicy")
     * .build())
     * .healthCheckConfig(HealthCheckConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .failureThreshold(123)
     * .resourcePath("resourcePath")
     * .build())
     * .healthCheckCustomConfig(HealthCheckCustomConfigProperty.builder()
     * .failureThreshold(123)
     * .build())
     * .name("name")
     * .namespaceId("namespaceId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html)
     */
    public inline fun cfnServiceProps(block: CfnServicePropsDsl.() -> Unit = {}): CfnServiceProps {
        val builder = CfnServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Instance that is accessible using a domain name (CNAME).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * Service service;
     * CnameInstance cnameInstance = CnameInstance.Builder.create(this, "MyCnameInstance")
     * .instanceCname("instanceCname")
     * .service(service)
     * // the properties below are optional
     * .customAttributes(Map.of(
     * "customAttributesKey", "customAttributes"))
     * .instanceId("instanceId")
     * .build();
     * ```
     */
    public inline fun cnameInstance(
        scope: Construct,
        id: String,
        block: CnameInstanceDsl.() -> Unit = {},
    ): CnameInstance {
        val builder = CnameInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.*;
     * App app = new App();
     * Stack stack = new Stack(app, "aws-servicediscovery-integ");
     * PublicDnsNamespace namespace = PublicDnsNamespace.Builder.create(stack, "Namespace")
     * .name("foobar.com")
     * .build();
     * Service service = namespace.createService("Service", DnsServiceProps.builder()
     * .name("foo")
     * .dnsRecordType(DnsRecordType.CNAME)
     * .dnsTtl(Duration.seconds(30))
     * .build());
     * service.registerCnameInstance("CnameInstance", CnameInstanceBaseProps.builder()
     * .instanceCname("service.pizza")
     * .build());
     * app.synth();
     * ```
     */
    public inline fun cnameInstanceBaseProps(
        block: CnameInstanceBasePropsDsl.() -> Unit = {}
    ): CnameInstanceBaseProps {
        val builder = CnameInstanceBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * Service service;
     * CnameInstanceProps cnameInstanceProps = CnameInstanceProps.builder()
     * .instanceCname("instanceCname")
     * .service(service)
     * // the properties below are optional
     * .customAttributes(Map.of(
     * "customAttributesKey", "customAttributes"))
     * .instanceId("instanceId")
     * .build();
     * ```
     */
    public inline fun cnameInstanceProps(
        block: CnameInstancePropsDsl.() -> Unit = {}
    ): CnameInstanceProps {
        val builder = CnameInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Service props needed to create a service in a given namespace.
     *
     * Used by createService() for PrivateDnsNamespace and PublicDnsNamespace
     *
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.*;
     * App app = new App();
     * Stack stack = new Stack(app, "aws-servicediscovery-integ");
     * PublicDnsNamespace namespace = PublicDnsNamespace.Builder.create(stack, "Namespace")
     * .name("foobar.com")
     * .build();
     * Service service = namespace.createService("Service", DnsServiceProps.builder()
     * .name("foo")
     * .dnsRecordType(DnsRecordType.A)
     * .dnsTtl(Duration.seconds(30))
     * .healthCheck(HealthCheckConfig.builder()
     * .type(HealthCheckType.HTTPS)
     * .resourcePath("/healthcheck")
     * .failureThreshold(2)
     * .build())
     * .build());
     * service.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
     * .ipv4("54.239.25.192")
     * .port(443)
     * .build());
     * app.synth();
     * ```
     */
    public inline fun dnsServiceProps(block: DnsServicePropsDsl.() -> Unit = {}): DnsServiceProps {
        val builder = DnsServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for an optional Amazon Route 53 health check.
     *
     * If you specify settings for a health check, AWS Cloud Map associates the health check with
     * all the records that you specify in DnsConfig. Only valid with a PublicDnsNamespace.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.*;
     * App app = new App();
     * Stack stack = new Stack(app, "aws-servicediscovery-integ");
     * HttpNamespace namespace = HttpNamespace.Builder.create(stack, "MyNamespace")
     * .name("MyHTTPNamespace")
     * .build();
     * Service service1 = namespace.createService("NonIpService", BaseServiceProps.builder()
     * .description("service registering non-ip instances")
     * .build());
     * service1.registerNonIpInstance("NonIpInstance", NonIpInstanceBaseProps.builder()
     * .customAttributes(Map.of("arn", "arn:aws:s3:::mybucket"))
     * .build());
     * Service service2 = namespace.createService("IpService", BaseServiceProps.builder()
     * .description("service registering ip instances")
     * .healthCheck(HealthCheckConfig.builder()
     * .type(HealthCheckType.HTTP)
     * .resourcePath("/check")
     * .build())
     * .build());
     * service2.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
     * .ipv4("54.239.25.192")
     * .build());
     * app.synth();
     * ```
     */
    public inline fun healthCheckConfig(
        block: HealthCheckConfigDsl.() -> Unit = {}
    ): HealthCheckConfig {
        val builder = HealthCheckConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies information about an optional custom health check.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * HealthCheckCustomConfig healthCheckCustomConfig = HealthCheckCustomConfig.builder()
     * .failureThreshold(123)
     * .build();
     * ```
     */
    public inline fun healthCheckCustomConfig(
        block: HealthCheckCustomConfigDsl.() -> Unit = {}
    ): HealthCheckCustomConfig {
        val builder = HealthCheckCustomConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define an HTTP Namespace.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.*;
     * App app = new App();
     * Stack stack = new Stack(app, "aws-servicediscovery-integ");
     * HttpNamespace namespace = HttpNamespace.Builder.create(stack, "MyNamespace")
     * .name("MyHTTPNamespace")
     * .build();
     * Service service1 = namespace.createService("NonIpService", BaseServiceProps.builder()
     * .description("service registering non-ip instances")
     * .build());
     * service1.registerNonIpInstance("NonIpInstance", NonIpInstanceBaseProps.builder()
     * .customAttributes(Map.of("arn", "arn:aws:s3:::mybucket"))
     * .build());
     * Service service2 = namespace.createService("IpService", BaseServiceProps.builder()
     * .description("service registering ip instances")
     * .healthCheck(HealthCheckConfig.builder()
     * .type(HealthCheckType.HTTP)
     * .resourcePath("/check")
     * .build())
     * .build());
     * service2.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
     * .ipv4("54.239.25.192")
     * .build());
     * app.synth();
     * ```
     */
    public inline fun httpNamespace(
        scope: Construct,
        id: String,
        block: HttpNamespaceDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.servicediscovery.HttpNamespace {
        val builder = HttpNamespaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * HttpNamespaceAttributes httpNamespaceAttributes = HttpNamespaceAttributes.builder()
     * .namespaceArn("namespaceArn")
     * .namespaceId("namespaceId")
     * .namespaceName("namespaceName")
     * .build();
     * ```
     */
    public inline fun httpNamespaceAttributes(
        block: HttpNamespaceAttributesDsl.() -> Unit = {}
    ): HttpNamespaceAttributes {
        val builder = HttpNamespaceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.*;
     * App app = new App();
     * Stack stack = new Stack(app, "aws-servicediscovery-integ");
     * HttpNamespace namespace = HttpNamespace.Builder.create(stack, "MyNamespace")
     * .name("MyHTTPNamespace")
     * .build();
     * Service service1 = namespace.createService("NonIpService", BaseServiceProps.builder()
     * .description("service registering non-ip instances")
     * .build());
     * service1.registerNonIpInstance("NonIpInstance", NonIpInstanceBaseProps.builder()
     * .customAttributes(Map.of("arn", "arn:aws:s3:::mybucket"))
     * .build());
     * Service service2 = namespace.createService("IpService", BaseServiceProps.builder()
     * .description("service registering ip instances")
     * .healthCheck(HealthCheckConfig.builder()
     * .type(HealthCheckType.HTTP)
     * .resourcePath("/check")
     * .build())
     * .build());
     * service2.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
     * .ipv4("54.239.25.192")
     * .build());
     * app.synth();
     * ```
     */
    public inline fun httpNamespaceProps(
        block: HttpNamespacePropsDsl.() -> Unit = {}
    ): HttpNamespaceProps {
        val builder = HttpNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Instance that is accessible using an IP address.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * Service service;
     * IpInstance ipInstance = IpInstance.Builder.create(this, "MyIpInstance")
     * .service(service)
     * // the properties below are optional
     * .customAttributes(Map.of(
     * "customAttributesKey", "customAttributes"))
     * .instanceId("instanceId")
     * .ipv4("ipv4")
     * .ipv6("ipv6")
     * .port(123)
     * .build();
     * ```
     */
    public inline fun ipInstance(
        scope: Construct,
        id: String,
        block: IpInstanceDsl.() -> Unit = {},
    ): IpInstance {
        val builder = IpInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.*;
     * App app = new App();
     * Stack stack = new Stack(app, "aws-servicediscovery-integ");
     * HttpNamespace namespace = HttpNamespace.Builder.create(stack, "MyNamespace")
     * .name("MyHTTPNamespace")
     * .build();
     * Service service1 = namespace.createService("NonIpService", BaseServiceProps.builder()
     * .description("service registering non-ip instances")
     * .build());
     * service1.registerNonIpInstance("NonIpInstance", NonIpInstanceBaseProps.builder()
     * .customAttributes(Map.of("arn", "arn:aws:s3:::mybucket"))
     * .build());
     * Service service2 = namespace.createService("IpService", BaseServiceProps.builder()
     * .description("service registering ip instances")
     * .healthCheck(HealthCheckConfig.builder()
     * .type(HealthCheckType.HTTP)
     * .resourcePath("/check")
     * .build())
     * .build());
     * service2.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
     * .ipv4("54.239.25.192")
     * .build());
     * app.synth();
     * ```
     */
    public inline fun ipInstanceBaseProps(
        block: IpInstanceBasePropsDsl.() -> Unit = {}
    ): IpInstanceBaseProps {
        val builder = IpInstanceBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * Service service;
     * IpInstanceProps ipInstanceProps = IpInstanceProps.builder()
     * .service(service)
     * // the properties below are optional
     * .customAttributes(Map.of(
     * "customAttributesKey", "customAttributes"))
     * .instanceId("instanceId")
     * .ipv4("ipv4")
     * .ipv6("ipv6")
     * .port(123)
     * .build();
     * ```
     */
    public inline fun ipInstanceProps(block: IpInstancePropsDsl.() -> Unit = {}): IpInstanceProps {
        val builder = IpInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Instance accessible using values other than an IP address or a domain name (CNAME).
     *
     * Specify the other values in Custom attributes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * Service service;
     * NonIpInstance nonIpInstance = NonIpInstance.Builder.create(this, "MyNonIpInstance")
     * .service(service)
     * // the properties below are optional
     * .customAttributes(Map.of(
     * "customAttributesKey", "customAttributes"))
     * .instanceId("instanceId")
     * .build();
     * ```
     */
    public inline fun nonIpInstance(
        scope: Construct,
        id: String,
        block: NonIpInstanceDsl.() -> Unit = {},
    ): NonIpInstance {
        val builder = NonIpInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.*;
     * App app = new App();
     * Stack stack = new Stack(app, "aws-servicediscovery-integ");
     * HttpNamespace namespace = HttpNamespace.Builder.create(stack, "MyNamespace")
     * .name("MyHTTPNamespace")
     * .build();
     * Service service1 = namespace.createService("NonIpService", BaseServiceProps.builder()
     * .description("service registering non-ip instances")
     * .build());
     * service1.registerNonIpInstance("NonIpInstance", NonIpInstanceBaseProps.builder()
     * .customAttributes(Map.of("arn", "arn:aws:s3:::mybucket"))
     * .build());
     * Service service2 = namespace.createService("IpService", BaseServiceProps.builder()
     * .description("service registering ip instances")
     * .healthCheck(HealthCheckConfig.builder()
     * .type(HealthCheckType.HTTP)
     * .resourcePath("/check")
     * .build())
     * .build());
     * service2.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
     * .ipv4("54.239.25.192")
     * .build());
     * app.synth();
     * ```
     */
    public inline fun nonIpInstanceBaseProps(
        block: NonIpInstanceBasePropsDsl.() -> Unit = {}
    ): NonIpInstanceBaseProps {
        val builder = NonIpInstanceBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * Service service;
     * NonIpInstanceProps nonIpInstanceProps = NonIpInstanceProps.builder()
     * .service(service)
     * // the properties below are optional
     * .customAttributes(Map.of(
     * "customAttributesKey", "customAttributes"))
     * .instanceId("instanceId")
     * .build();
     * ```
     */
    public inline fun nonIpInstanceProps(
        block: NonIpInstancePropsDsl.() -> Unit = {}
    ): NonIpInstanceProps {
        val builder = NonIpInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a Service Discovery HTTP Namespace.
     *
     * Example:
     * ```
     * Mesh mesh;
     * // Cloud Map service discovery is currently required for host ejection by outlier detection
     * Vpc vpc = new Vpc(this, "vpc");
     * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "test-namespace")
     * .vpc(vpc)
     * .name("domain.local")
     * .build();
     * Service service = namespace.createService("Svc");
     * VirtualNode node = mesh.addVirtualNode("virtual-node", VirtualNodeBaseProps.builder()
     * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
     * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
     * .outlierDetection(OutlierDetection.builder()
     * .baseEjectionDuration(Duration.seconds(10))
     * .interval(Duration.seconds(30))
     * .maxEjectionPercent(50)
     * .maxServerErrors(5)
     * .build())
     * .build())))
     * .build());
     * ```
     */
    public inline fun privateDnsNamespace(
        scope: Construct,
        id: String,
        block: PrivateDnsNamespaceDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace {
        val builder = PrivateDnsNamespaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * PrivateDnsNamespaceAttributes privateDnsNamespaceAttributes =
     * PrivateDnsNamespaceAttributes.builder()
     * .namespaceArn("namespaceArn")
     * .namespaceId("namespaceId")
     * .namespaceName("namespaceName")
     * .build();
     * ```
     */
    public inline fun privateDnsNamespaceAttributes(
        block: PrivateDnsNamespaceAttributesDsl.() -> Unit = {}
    ): PrivateDnsNamespaceAttributes {
        val builder = PrivateDnsNamespaceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Mesh mesh;
     * // Cloud Map service discovery is currently required for host ejection by outlier detection
     * Vpc vpc = new Vpc(this, "vpc");
     * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "test-namespace")
     * .vpc(vpc)
     * .name("domain.local")
     * .build();
     * Service service = namespace.createService("Svc");
     * VirtualNode node = mesh.addVirtualNode("virtual-node", VirtualNodeBaseProps.builder()
     * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
     * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
     * .outlierDetection(OutlierDetection.builder()
     * .baseEjectionDuration(Duration.seconds(10))
     * .interval(Duration.seconds(30))
     * .maxEjectionPercent(50)
     * .maxServerErrors(5)
     * .build())
     * .build())))
     * .build());
     * ```
     */
    public inline fun privateDnsNamespaceProps(
        block: PrivateDnsNamespacePropsDsl.() -> Unit = {}
    ): PrivateDnsNamespaceProps {
        val builder = PrivateDnsNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a Public DNS Namespace.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.*;
     * App app = new App();
     * Stack stack = new Stack(app, "aws-servicediscovery-integ");
     * PublicDnsNamespace namespace = PublicDnsNamespace.Builder.create(stack, "Namespace")
     * .name("foobar.com")
     * .build();
     * Service service = namespace.createService("Service", DnsServiceProps.builder()
     * .name("foo")
     * .dnsRecordType(DnsRecordType.A)
     * .dnsTtl(Duration.seconds(30))
     * .healthCheck(HealthCheckConfig.builder()
     * .type(HealthCheckType.HTTPS)
     * .resourcePath("/healthcheck")
     * .failureThreshold(2)
     * .build())
     * .build());
     * service.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
     * .ipv4("54.239.25.192")
     * .port(443)
     * .build());
     * app.synth();
     * ```
     */
    public inline fun publicDnsNamespace(
        scope: Construct,
        id: String,
        block: PublicDnsNamespaceDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace {
        val builder = PublicDnsNamespaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * PublicDnsNamespaceAttributes publicDnsNamespaceAttributes =
     * PublicDnsNamespaceAttributes.builder()
     * .namespaceArn("namespaceArn")
     * .namespaceId("namespaceId")
     * .namespaceName("namespaceName")
     * .build();
     * ```
     */
    public inline fun publicDnsNamespaceAttributes(
        block: PublicDnsNamespaceAttributesDsl.() -> Unit = {}
    ): PublicDnsNamespaceAttributes {
        val builder = PublicDnsNamespaceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.*;
     * App app = new App();
     * Stack stack = new Stack(app, "aws-servicediscovery-integ");
     * PublicDnsNamespace namespace = PublicDnsNamespace.Builder.create(stack, "Namespace")
     * .name("foobar.com")
     * .build();
     * Service service = namespace.createService("Service", DnsServiceProps.builder()
     * .name("foo")
     * .dnsRecordType(DnsRecordType.A)
     * .dnsTtl(Duration.seconds(30))
     * .healthCheck(HealthCheckConfig.builder()
     * .type(HealthCheckType.HTTPS)
     * .resourcePath("/healthcheck")
     * .failureThreshold(2)
     * .build())
     * .build());
     * service.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
     * .ipv4("54.239.25.192")
     * .port(443)
     * .build());
     * app.synth();
     * ```
     */
    public inline fun publicDnsNamespaceProps(
        block: PublicDnsNamespacePropsDsl.() -> Unit = {}
    ): PublicDnsNamespaceProps {
        val builder = PublicDnsNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a CloudMap Service.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.*;
     * App app = new App();
     * Stack stack = new Stack(app, "aws-servicediscovery-integ");
     * PublicDnsNamespace namespace = PublicDnsNamespace.Builder.create(stack, "Namespace")
     * .name("foobar.com")
     * .build();
     * Service service = namespace.createService("Service", DnsServiceProps.builder()
     * .name("foo")
     * .dnsRecordType(DnsRecordType.A)
     * .dnsTtl(Duration.seconds(30))
     * .healthCheck(HealthCheckConfig.builder()
     * .type(HealthCheckType.HTTPS)
     * .resourcePath("/healthcheck")
     * .failureThreshold(2)
     * .build())
     * .build());
     * service.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
     * .ipv4("54.239.25.192")
     * .port(443)
     * .build());
     * app.synth();
     * ```
     */
    public inline fun service(
        scope: Construct,
        id: String,
        block: ServiceDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.servicediscovery.Service {
        val builder = ServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicediscovery.*;
     * INamespace namespace;
     * ServiceAttributes serviceAttributes = ServiceAttributes.builder()
     * .dnsRecordType(DnsRecordType.A)
     * .namespace(namespace)
     * .routingPolicy(RoutingPolicy.WEIGHTED)
     * .serviceArn("serviceArn")
     * .serviceId("serviceId")
     * .serviceName("serviceName")
     * // the properties below are optional
     * .discoveryType(DiscoveryType.API)
     * .build();
     * ```
     */
    public inline fun serviceAttributes(
        block: ServiceAttributesDsl.() -> Unit = {}
    ): ServiceAttributes {
        val builder = ServiceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.servicediscovery.*;
     * INamespace namespace;
     * ServiceProps serviceProps = ServiceProps.builder()
     * .namespace(namespace)
     * // the properties below are optional
     * .customHealthCheck(HealthCheckCustomConfig.builder()
     * .failureThreshold(123)
     * .build())
     * .description("description")
     * .discoveryType(DiscoveryType.API)
     * .dnsRecordType(DnsRecordType.A)
     * .dnsTtl(Duration.minutes(30))
     * .healthCheck(HealthCheckConfig.builder()
     * .failureThreshold(123)
     * .resourcePath("resourcePath")
     * .type(HealthCheckType.HTTP)
     * .build())
     * .loadBalancer(false)
     * .name("name")
     * .routingPolicy(RoutingPolicy.WEIGHTED)
     * .build();
     * ```
     */
    public inline fun serviceProps(block: ServicePropsDsl.() -> Unit = {}): ServiceProps {
        val builder = ServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public object HttpNamespace {
        public fun fromHttpNamespaceAttributes(
            scope: Construct,
            id: String,
            block: HttpNamespaceAttributesDsl.() -> Unit = {},
        ): IHttpNamespace {
            val builder = HttpNamespaceAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.servicediscovery.HttpNamespace
                .fromHttpNamespaceAttributes(scope, id, builder.build())
        }
    }

    public object PrivateDnsNamespace {
        public fun fromPrivateDnsNamespaceAttributes(
            scope: Construct,
            id: String,
            block: PrivateDnsNamespaceAttributesDsl.() -> Unit = {},
        ): IPrivateDnsNamespace {
            val builder = PrivateDnsNamespaceAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace
                .fromPrivateDnsNamespaceAttributes(scope, id, builder.build())
        }
    }

    public object PublicDnsNamespace {
        public fun fromPublicDnsNamespaceAttributes(
            scope: Construct,
            id: String,
            block: PublicDnsNamespaceAttributesDsl.() -> Unit = {},
        ): IPublicDnsNamespace {
            val builder = PublicDnsNamespaceAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace
                .fromPublicDnsNamespaceAttributes(scope, id, builder.build())
        }
    }

    public object Service {
        public fun fromServiceAttributes(
            scope: Construct,
            id: String,
            block: ServiceAttributesDsl.() -> Unit = {},
        ): IService {
            val builder = ServiceAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.servicediscovery.Service.fromServiceAttributes(
                scope,
                id,
                builder.build()
            )
        }
    }
}
