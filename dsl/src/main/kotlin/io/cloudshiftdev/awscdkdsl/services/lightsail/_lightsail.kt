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

package io.cloudshiftdev.awscdkdsl.services.lightsail

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnAlarm
import software.amazon.awscdk.services.lightsail.CfnAlarmProps
import software.amazon.awscdk.services.lightsail.CfnBucket
import software.amazon.awscdk.services.lightsail.CfnBucketProps
import software.amazon.awscdk.services.lightsail.CfnCertificate
import software.amazon.awscdk.services.lightsail.CfnCertificateProps
import software.amazon.awscdk.services.lightsail.CfnContainer
import software.amazon.awscdk.services.lightsail.CfnContainerProps
import software.amazon.awscdk.services.lightsail.CfnDatabase
import software.amazon.awscdk.services.lightsail.CfnDatabaseProps
import software.amazon.awscdk.services.lightsail.CfnDisk
import software.amazon.awscdk.services.lightsail.CfnDiskProps
import software.amazon.awscdk.services.lightsail.CfnDistribution
import software.amazon.awscdk.services.lightsail.CfnDistributionProps
import software.amazon.awscdk.services.lightsail.CfnInstance
import software.amazon.awscdk.services.lightsail.CfnInstanceProps
import software.amazon.awscdk.services.lightsail.CfnLoadBalancer
import software.amazon.awscdk.services.lightsail.CfnLoadBalancerProps
import software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate
import software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps
import software.amazon.awscdk.services.lightsail.CfnStaticIp
import software.amazon.awscdk.services.lightsail.CfnStaticIpProps
import software.constructs.Construct

public object lightsail {
    /**
     * The `AWS::Lightsail::Alarm` resource specifies an alarm that can be used to monitor a single
     * metric for one of your Lightsail resources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnAlarm cfnAlarm = CfnAlarm.Builder.create(this, "MyCfnAlarm")
     * .alarmName("alarmName")
     * .comparisonOperator("comparisonOperator")
     * .evaluationPeriods(123)
     * .metricName("metricName")
     * .monitoredResourceName("monitoredResourceName")
     * .threshold(123)
     * // the properties below are optional
     * .contactProtocols(List.of("contactProtocols"))
     * .datapointsToAlarm(123)
     * .notificationEnabled(false)
     * .notificationTriggers(List.of("notificationTriggers"))
     * .treatMissingData("treatMissingData")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html)
     */
    public inline fun cfnAlarm(
        scope: Construct,
        id: String,
        block: CfnAlarmDsl.() -> Unit = {},
    ): CfnAlarm {
        val builder = CfnAlarmDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAlarm`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnAlarmProps cfnAlarmProps = CfnAlarmProps.builder()
     * .alarmName("alarmName")
     * .comparisonOperator("comparisonOperator")
     * .evaluationPeriods(123)
     * .metricName("metricName")
     * .monitoredResourceName("monitoredResourceName")
     * .threshold(123)
     * // the properties below are optional
     * .contactProtocols(List.of("contactProtocols"))
     * .datapointsToAlarm(123)
     * .notificationEnabled(false)
     * .notificationTriggers(List.of("notificationTriggers"))
     * .treatMissingData("treatMissingData")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html)
     */
    public inline fun cfnAlarmProps(block: CfnAlarmPropsDsl.() -> Unit = {}): CfnAlarmProps {
        val builder = CfnAlarmPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lightsail::Bucket` resource specifies a bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnBucket cfnBucket = CfnBucket.Builder.create(this, "MyCfnBucket")
     * .bucketName("bucketName")
     * .bundleId("bundleId")
     * // the properties below are optional
     * .accessRules(AccessRulesProperty.builder()
     * .allowPublicOverrides(false)
     * .objectAccess("objectAccess")
     * .build())
     * .objectVersioning(false)
     * .readOnlyAccessAccounts(List.of("readOnlyAccessAccounts"))
     * .resourcesReceivingAccess(List.of("resourcesReceivingAccess"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html)
     */
    public inline fun cfnBucket(
        scope: Construct,
        id: String,
        block: CfnBucketDsl.() -> Unit = {},
    ): CfnBucket {
        val builder = CfnBucketDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * `AccessRules` is a property of the
     * [AWS::Lightsail::Bucket](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html)
     * resource. It describes access rules for a bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * AccessRulesProperty accessRulesProperty = AccessRulesProperty.builder()
     * .allowPublicOverrides(false)
     * .objectAccess("objectAccess")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-bucket-accessrules.html)
     */
    public inline fun cfnBucketAccessRulesProperty(
        block: CfnBucketAccessRulesPropertyDsl.() -> Unit = {}
    ): CfnBucket.AccessRulesProperty {
        val builder = CfnBucketAccessRulesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBucket`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnBucketProps cfnBucketProps = CfnBucketProps.builder()
     * .bucketName("bucketName")
     * .bundleId("bundleId")
     * // the properties below are optional
     * .accessRules(AccessRulesProperty.builder()
     * .allowPublicOverrides(false)
     * .objectAccess("objectAccess")
     * .build())
     * .objectVersioning(false)
     * .readOnlyAccessAccounts(List.of("readOnlyAccessAccounts"))
     * .resourcesReceivingAccess(List.of("resourcesReceivingAccess"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html)
     */
    public inline fun cfnBucketProps(block: CfnBucketPropsDsl.() -> Unit = {}): CfnBucketProps {
        val builder = CfnBucketPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lightsail::Certificate` resource specifies an SSL/TLS certificate that you can use
     * with a content delivery network (CDN) distribution and a container service.
     *
     * For information about certificates that you can use with a load balancer, see
     * [AWS::Lightsail::LoadBalancerTlsCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnCertificate cfnCertificate = CfnCertificate.Builder.create(this, "MyCfnCertificate")
     * .certificateName("certificateName")
     * .domainName("domainName")
     * // the properties below are optional
     * .subjectAlternativeNames(List.of("subjectAlternativeNames"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     */
    public inline fun cfnCertificate(
        scope: Construct,
        id: String,
        block: CfnCertificateDsl.() -> Unit = {},
    ): CfnCertificate {
        val builder = CfnCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCertificate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnCertificateProps cfnCertificateProps = CfnCertificateProps.builder()
     * .certificateName("certificateName")
     * .domainName("domainName")
     * // the properties below are optional
     * .subjectAlternativeNames(List.of("subjectAlternativeNames"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     */
    public inline fun cfnCertificateProps(
        block: CfnCertificatePropsDsl.() -> Unit = {}
    ): CfnCertificateProps {
        val builder = CfnCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lightsail::Container` resource specifies a container service.
     *
     * A Lightsail container service is a compute resource to which you can deploy containers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnContainer cfnContainer = CfnContainer.Builder.create(this, "MyCfnContainer")
     * .power("power")
     * .scale(123)
     * .serviceName("serviceName")
     * // the properties below are optional
     * .containerServiceDeployment(ContainerServiceDeploymentProperty.builder()
     * .containers(List.of(ContainerProperty.builder()
     * .command(List.of("command"))
     * .containerName("containerName")
     * .environment(List.of(EnvironmentVariableProperty.builder()
     * .value("value")
     * .variable("variable")
     * .build()))
     * .image("image")
     * .ports(List.of(PortInfoProperty.builder()
     * .port("port")
     * .protocol("protocol")
     * .build()))
     * .build()))
     * .publicEndpoint(PublicEndpointProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .healthCheckConfig(HealthCheckConfigProperty.builder()
     * .healthyThreshold(123)
     * .intervalSeconds(123)
     * .path("path")
     * .successCodes("successCodes")
     * .timeoutSeconds(123)
     * .unhealthyThreshold(123)
     * .build())
     * .build())
     * .build())
     * .isDisabled(false)
     * .privateRegistryAccess(PrivateRegistryAccessProperty.builder()
     * .ecrImagePullerRole(EcrImagePullerRoleProperty.builder()
     * .isActive(false)
     * .principalArn("principalArn")
     * .build())
     * .build())
     * .publicDomainNames(List.of(PublicDomainNameProperty.builder()
     * .certificateName("certificateName")
     * .domainNames(List.of("domainNames"))
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html)
     */
    public inline fun cfnContainer(
        scope: Construct,
        id: String,
        block: CfnContainerDsl.() -> Unit = {},
    ): CfnContainer {
        val builder = CfnContainerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * `Container` is a property of the
     * [ContainerServiceDeployment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-containerservicedeployment.html)
     * property. It describes the settings of a container that will be launched, or that is
     * launched, to an Amazon Lightsail container service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * ContainerProperty containerProperty = ContainerProperty.builder()
     * .command(List.of("command"))
     * .containerName("containerName")
     * .environment(List.of(EnvironmentVariableProperty.builder()
     * .value("value")
     * .variable("variable")
     * .build()))
     * .image("image")
     * .ports(List.of(PortInfoProperty.builder()
     * .port("port")
     * .protocol("protocol")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html)
     */
    public inline fun cfnContainerContainerProperty(
        block: CfnContainerContainerPropertyDsl.() -> Unit = {}
    ): CfnContainer.ContainerProperty {
        val builder = CfnContainerContainerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `ContainerServiceDeployment` is a property of the
     * [AWS::Lightsail::Container](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html)
     * resource. It describes a container deployment configuration of a container service.
     *
     * A deployment specifies the settings, such as the ports and launch command, of containers that
     * are deployed to your container service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * ContainerServiceDeploymentProperty containerServiceDeploymentProperty =
     * ContainerServiceDeploymentProperty.builder()
     * .containers(List.of(ContainerProperty.builder()
     * .command(List.of("command"))
     * .containerName("containerName")
     * .environment(List.of(EnvironmentVariableProperty.builder()
     * .value("value")
     * .variable("variable")
     * .build()))
     * .image("image")
     * .ports(List.of(PortInfoProperty.builder()
     * .port("port")
     * .protocol("protocol")
     * .build()))
     * .build()))
     * .publicEndpoint(PublicEndpointProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .healthCheckConfig(HealthCheckConfigProperty.builder()
     * .healthyThreshold(123)
     * .intervalSeconds(123)
     * .path("path")
     * .successCodes("successCodes")
     * .timeoutSeconds(123)
     * .unhealthyThreshold(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-containerservicedeployment.html)
     */
    public inline fun cfnContainerContainerServiceDeploymentProperty(
        block: CfnContainerContainerServiceDeploymentPropertyDsl.() -> Unit = {}
    ): CfnContainer.ContainerServiceDeploymentProperty {
        val builder = CfnContainerContainerServiceDeploymentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the IAM role that you can use to grant a Lightsail container service access to
     * Amazon ECR private repositories.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * EcrImagePullerRoleProperty ecrImagePullerRoleProperty = EcrImagePullerRoleProperty.builder()
     * .isActive(false)
     * .principalArn("principalArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-ecrimagepullerrole.html)
     */
    public inline fun cfnContainerEcrImagePullerRoleProperty(
        block: CfnContainerEcrImagePullerRolePropertyDsl.() -> Unit = {}
    ): CfnContainer.EcrImagePullerRoleProperty {
        val builder = CfnContainerEcrImagePullerRolePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `EnvironmentVariable` is a property of the
     * [Container](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html)
     * property. It describes the environment variables of a container on a container service which
     * are key-value parameters that provide dynamic configuration of the application or script run
     * by the container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * EnvironmentVariableProperty environmentVariableProperty = EnvironmentVariableProperty.builder()
     * .value("value")
     * .variable("variable")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-environmentvariable.html)
     */
    public inline fun cfnContainerEnvironmentVariableProperty(
        block: CfnContainerEnvironmentVariablePropertyDsl.() -> Unit = {}
    ): CfnContainer.EnvironmentVariableProperty {
        val builder = CfnContainerEnvironmentVariablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `HealthCheckConfig` is a property of the
     * [PublicEndpoint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicendpoint.html)
     * property. It describes the healthcheck configuration of a container deployment on a container
     * service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * HealthCheckConfigProperty healthCheckConfigProperty = HealthCheckConfigProperty.builder()
     * .healthyThreshold(123)
     * .intervalSeconds(123)
     * .path("path")
     * .successCodes("successCodes")
     * .timeoutSeconds(123)
     * .unhealthyThreshold(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-healthcheckconfig.html)
     */
    public inline fun cfnContainerHealthCheckConfigProperty(
        block: CfnContainerHealthCheckConfigPropertyDsl.() -> Unit = {}
    ): CfnContainer.HealthCheckConfigProperty {
        val builder = CfnContainerHealthCheckConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `PortInfo` is a property of the
     * [Container](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html)
     * property. It describes the ports to open and the protocols to use for a container on a Amazon
     * Lightsail container service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * PortInfoProperty portInfoProperty = PortInfoProperty.builder()
     * .port("port")
     * .protocol("protocol")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-portinfo.html)
     */
    public inline fun cfnContainerPortInfoProperty(
        block: CfnContainerPortInfoPropertyDsl.() -> Unit = {}
    ): CfnContainer.PortInfoProperty {
        val builder = CfnContainerPortInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the configuration for an Amazon Lightsail container service to access private
     * container image repositories, such as Amazon Elastic Container Registry ( Amazon ECR )
     * private repositories.
     *
     * For more information, see
     * [Configuring access to an Amazon ECR private repository for an Amazon Lightsail container service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
     * in the *Amazon Lightsail Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * PrivateRegistryAccessProperty privateRegistryAccessProperty =
     * PrivateRegistryAccessProperty.builder()
     * .ecrImagePullerRole(EcrImagePullerRoleProperty.builder()
     * .isActive(false)
     * .principalArn("principalArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-privateregistryaccess.html)
     */
    public inline fun cfnContainerPrivateRegistryAccessProperty(
        block: CfnContainerPrivateRegistryAccessPropertyDsl.() -> Unit = {}
    ): CfnContainer.PrivateRegistryAccessProperty {
        val builder = CfnContainerPrivateRegistryAccessPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnContainer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnContainerProps cfnContainerProps = CfnContainerProps.builder()
     * .power("power")
     * .scale(123)
     * .serviceName("serviceName")
     * // the properties below are optional
     * .containerServiceDeployment(ContainerServiceDeploymentProperty.builder()
     * .containers(List.of(ContainerProperty.builder()
     * .command(List.of("command"))
     * .containerName("containerName")
     * .environment(List.of(EnvironmentVariableProperty.builder()
     * .value("value")
     * .variable("variable")
     * .build()))
     * .image("image")
     * .ports(List.of(PortInfoProperty.builder()
     * .port("port")
     * .protocol("protocol")
     * .build()))
     * .build()))
     * .publicEndpoint(PublicEndpointProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .healthCheckConfig(HealthCheckConfigProperty.builder()
     * .healthyThreshold(123)
     * .intervalSeconds(123)
     * .path("path")
     * .successCodes("successCodes")
     * .timeoutSeconds(123)
     * .unhealthyThreshold(123)
     * .build())
     * .build())
     * .build())
     * .isDisabled(false)
     * .privateRegistryAccess(PrivateRegistryAccessProperty.builder()
     * .ecrImagePullerRole(EcrImagePullerRoleProperty.builder()
     * .isActive(false)
     * .principalArn("principalArn")
     * .build())
     * .build())
     * .publicDomainNames(List.of(PublicDomainNameProperty.builder()
     * .certificateName("certificateName")
     * .domainNames(List.of("domainNames"))
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html)
     */
    public inline fun cfnContainerProps(
        block: CfnContainerPropsDsl.() -> Unit = {}
    ): CfnContainerProps {
        val builder = CfnContainerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `PublicDomainName` is a property of the
     * [AWS::Lightsail::Container](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html)
     * resource. It describes the public domain names to use with a container service, such as
     * `example.com` and `www.example.com` . It also describes the certificates to use with a
     * container service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * PublicDomainNameProperty publicDomainNameProperty = PublicDomainNameProperty.builder()
     * .certificateName("certificateName")
     * .domainNames(List.of("domainNames"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicdomainname.html)
     */
    public inline fun cfnContainerPublicDomainNameProperty(
        block: CfnContainerPublicDomainNamePropertyDsl.() -> Unit = {}
    ): CfnContainer.PublicDomainNameProperty {
        val builder = CfnContainerPublicDomainNamePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `PublicEndpoint` is a property of the
     * [ContainerServiceDeployment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-containerservicedeployment.html)
     * property. It describes describes the settings of the public endpoint of a container on a
     * container service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * PublicEndpointProperty publicEndpointProperty = PublicEndpointProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .healthCheckConfig(HealthCheckConfigProperty.builder()
     * .healthyThreshold(123)
     * .intervalSeconds(123)
     * .path("path")
     * .successCodes("successCodes")
     * .timeoutSeconds(123)
     * .unhealthyThreshold(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicendpoint.html)
     */
    public inline fun cfnContainerPublicEndpointProperty(
        block: CfnContainerPublicEndpointPropertyDsl.() -> Unit = {}
    ): CfnContainer.PublicEndpointProperty {
        val builder = CfnContainerPublicEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lightsail::Database` resource specifies an Amazon Lightsail database.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnDatabase cfnDatabase = CfnDatabase.Builder.create(this, "MyCfnDatabase")
     * .masterDatabaseName("masterDatabaseName")
     * .masterUsername("masterUsername")
     * .relationalDatabaseBlueprintId("relationalDatabaseBlueprintId")
     * .relationalDatabaseBundleId("relationalDatabaseBundleId")
     * .relationalDatabaseName("relationalDatabaseName")
     * // the properties below are optional
     * .availabilityZone("availabilityZone")
     * .backupRetention(false)
     * .caCertificateIdentifier("caCertificateIdentifier")
     * .masterUserPassword("masterUserPassword")
     * .preferredBackupWindow("preferredBackupWindow")
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .publiclyAccessible(false)
     * .relationalDatabaseParameters(List.of(RelationalDatabaseParameterProperty.builder()
     * .allowedValues("allowedValues")
     * .applyMethod("applyMethod")
     * .applyType("applyType")
     * .dataType("dataType")
     * .description("description")
     * .isModifiable(false)
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build()))
     * .rotateMasterUserPassword(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html)
     */
    public inline fun cfnDatabase(
        scope: Construct,
        id: String,
        block: CfnDatabaseDsl.() -> Unit = {},
    ): CfnDatabase {
        val builder = CfnDatabaseDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDatabase`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnDatabaseProps cfnDatabaseProps = CfnDatabaseProps.builder()
     * .masterDatabaseName("masterDatabaseName")
     * .masterUsername("masterUsername")
     * .relationalDatabaseBlueprintId("relationalDatabaseBlueprintId")
     * .relationalDatabaseBundleId("relationalDatabaseBundleId")
     * .relationalDatabaseName("relationalDatabaseName")
     * // the properties below are optional
     * .availabilityZone("availabilityZone")
     * .backupRetention(false)
     * .caCertificateIdentifier("caCertificateIdentifier")
     * .masterUserPassword("masterUserPassword")
     * .preferredBackupWindow("preferredBackupWindow")
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .publiclyAccessible(false)
     * .relationalDatabaseParameters(List.of(RelationalDatabaseParameterProperty.builder()
     * .allowedValues("allowedValues")
     * .applyMethod("applyMethod")
     * .applyType("applyType")
     * .dataType("dataType")
     * .description("description")
     * .isModifiable(false)
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build()))
     * .rotateMasterUserPassword(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html)
     */
    public inline fun cfnDatabaseProps(
        block: CfnDatabasePropsDsl.() -> Unit = {}
    ): CfnDatabaseProps {
        val builder = CfnDatabasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `RelationalDatabaseParameter` is a property of the
     * [AWS::Lightsail::Database](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html)
     * resource. It describes parameters for the database.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * RelationalDatabaseParameterProperty relationalDatabaseParameterProperty =
     * RelationalDatabaseParameterProperty.builder()
     * .allowedValues("allowedValues")
     * .applyMethod("applyMethod")
     * .applyType("applyType")
     * .dataType("dataType")
     * .description("description")
     * .isModifiable(false)
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html)
     */
    public inline fun cfnDatabaseRelationalDatabaseParameterProperty(
        block: CfnDatabaseRelationalDatabaseParameterPropertyDsl.() -> Unit = {}
    ): CfnDatabase.RelationalDatabaseParameterProperty {
        val builder = CfnDatabaseRelationalDatabaseParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lightsail::Disk` resource specifies a disk that can be attached to an Amazon
     * Lightsail instance that is in the same AWS Region and Availability Zone.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnDisk cfnDisk = CfnDisk.Builder.create(this, "MyCfnDisk")
     * .diskName("diskName")
     * .sizeInGb(123)
     * // the properties below are optional
     * .addOns(List.of(AddOnProperty.builder()
     * .addOnType("addOnType")
     * // the properties below are optional
     * .autoSnapshotAddOnRequest(AutoSnapshotAddOnProperty.builder()
     * .snapshotTimeOfDay("snapshotTimeOfDay")
     * .build())
     * .status("status")
     * .build()))
     * .availabilityZone("availabilityZone")
     * .location(LocationProperty.builder()
     * .availabilityZone("availabilityZone")
     * .regionName("regionName")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html)
     */
    public inline fun cfnDisk(
        scope: Construct,
        id: String,
        block: CfnDiskDsl.() -> Unit = {},
    ): CfnDisk {
        val builder = CfnDiskDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * `AddOn` is a property of the
     * [AWS::Lightsail::Disk](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html)
     * resource. It describes the add-ons for a disk.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * AddOnProperty addOnProperty = AddOnProperty.builder()
     * .addOnType("addOnType")
     * // the properties below are optional
     * .autoSnapshotAddOnRequest(AutoSnapshotAddOnProperty.builder()
     * .snapshotTimeOfDay("snapshotTimeOfDay")
     * .build())
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-addon.html)
     */
    public inline fun cfnDiskAddOnProperty(
        block: CfnDiskAddOnPropertyDsl.() -> Unit = {}
    ): CfnDisk.AddOnProperty {
        val builder = CfnDiskAddOnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `AutoSnapshotAddOn` is a property of the
     * [AddOn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-addon.html)
     * property. It describes the automatic snapshot add-on for a disk.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * AutoSnapshotAddOnProperty autoSnapshotAddOnProperty = AutoSnapshotAddOnProperty.builder()
     * .snapshotTimeOfDay("snapshotTimeOfDay")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-autosnapshotaddon.html)
     */
    public inline fun cfnDiskAutoSnapshotAddOnProperty(
        block: CfnDiskAutoSnapshotAddOnPropertyDsl.() -> Unit = {}
    ): CfnDisk.AutoSnapshotAddOnProperty {
        val builder = CfnDiskAutoSnapshotAddOnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS Region and Availability Zone where the disk is located.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * LocationProperty locationProperty = LocationProperty.builder()
     * .availabilityZone("availabilityZone")
     * .regionName("regionName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-location.html)
     */
    public inline fun cfnDiskLocationProperty(
        block: CfnDiskLocationPropertyDsl.() -> Unit = {}
    ): CfnDisk.LocationProperty {
        val builder = CfnDiskLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDisk`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnDiskProps cfnDiskProps = CfnDiskProps.builder()
     * .diskName("diskName")
     * .sizeInGb(123)
     * // the properties below are optional
     * .addOns(List.of(AddOnProperty.builder()
     * .addOnType("addOnType")
     * // the properties below are optional
     * .autoSnapshotAddOnRequest(AutoSnapshotAddOnProperty.builder()
     * .snapshotTimeOfDay("snapshotTimeOfDay")
     * .build())
     * .status("status")
     * .build()))
     * .availabilityZone("availabilityZone")
     * .location(LocationProperty.builder()
     * .availabilityZone("availabilityZone")
     * .regionName("regionName")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html)
     */
    public inline fun cfnDiskProps(block: CfnDiskPropsDsl.() -> Unit = {}): CfnDiskProps {
        val builder = CfnDiskPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lightsail::Distribution` resource specifies a content delivery network (CDN)
     * distribution.
     *
     * You can create distributions only in the `us-east-1` AWS Region.
     *
     * A distribution is a globally distributed network of caching servers that improve the
     * performance of your website or web application hosted on a Lightsail instance, static content
     * hosted on a Lightsail bucket, or through a Lightsail load balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnDistribution cfnDistribution = CfnDistribution.Builder.create(this, "MyCfnDistribution")
     * .bundleId("bundleId")
     * .defaultCacheBehavior(CacheBehaviorProperty.builder()
     * .behavior("behavior")
     * .build())
     * .distributionName("distributionName")
     * .origin(InputOriginProperty.builder()
     * .name("name")
     * .protocolPolicy("protocolPolicy")
     * .regionName("regionName")
     * .build())
     * // the properties below are optional
     * .cacheBehaviors(List.of(CacheBehaviorPerPathProperty.builder()
     * .behavior("behavior")
     * .path("path")
     * .build()))
     * .cacheBehaviorSettings(CacheSettingsProperty.builder()
     * .allowedHttpMethods("allowedHttpMethods")
     * .cachedHttpMethods("cachedHttpMethods")
     * .defaultTtl(123)
     * .forwardedCookies(CookieObjectProperty.builder()
     * .cookiesAllowList(List.of("cookiesAllowList"))
     * .option("option")
     * .build())
     * .forwardedHeaders(HeaderObjectProperty.builder()
     * .headersAllowList(List.of("headersAllowList"))
     * .option("option")
     * .build())
     * .forwardedQueryStrings(QueryStringObjectProperty.builder()
     * .option(false)
     * .queryStringsAllowList(List.of("queryStringsAllowList"))
     * .build())
     * .maximumTtl(123)
     * .minimumTtl(123)
     * .build())
     * .certificateName("certificateName")
     * .ipAddressType("ipAddressType")
     * .isEnabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html)
     */
    public inline fun cfnDistribution(
        scope: Construct,
        id: String,
        block: CfnDistributionDsl.() -> Unit = {},
    ): CfnDistribution {
        val builder = CfnDistributionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * `CacheBehaviorPerPath` is a property of the
     * [AWS::Lightsail::Distribution](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html)
     * resource. It describes the per-path cache behavior of an Amazon Lightsail content delivery
     * network (CDN) distribution.
     *
     * Use a per-path cache behavior to override the default cache behavior of a distribution, or to
     * add an exception to it. For example, if you set the `CacheBehavior` to `cache` , you can use
     * a per-path cache behavior to specify a directory, file, or file type that your distribution
     * will cache. If you don’t want your distribution to cache a specified directory, file, or file
     * type, set the per-path cache behavior to `dont-cache` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CacheBehaviorPerPathProperty cacheBehaviorPerPathProperty =
     * CacheBehaviorPerPathProperty.builder()
     * .behavior("behavior")
     * .path("path")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachebehaviorperpath.html)
     */
    public inline fun cfnDistributionCacheBehaviorPerPathProperty(
        block: CfnDistributionCacheBehaviorPerPathPropertyDsl.() -> Unit = {}
    ): CfnDistribution.CacheBehaviorPerPathProperty {
        val builder = CfnDistributionCacheBehaviorPerPathPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `CacheBehavior` is a property of the
     * [AWS::Lightsail::Distribution](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html)
     * resource. It describes the default cache behavior of an Amazon Lightsail content delivery
     * network (CDN) distribution.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CacheBehaviorProperty cacheBehaviorProperty = CacheBehaviorProperty.builder()
     * .behavior("behavior")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachebehavior.html)
     */
    public inline fun cfnDistributionCacheBehaviorProperty(
        block: CfnDistributionCacheBehaviorPropertyDsl.() -> Unit = {}
    ): CfnDistribution.CacheBehaviorProperty {
        val builder = CfnDistributionCacheBehaviorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `CacheSettings` is a property of the
     * [AWS::Lightsail::Distribution](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html)
     * resource. It describes the cache settings of an Amazon Lightsail content delivery network
     * (CDN) distribution.
     *
     * These settings apply only to your distribution’s `CacheBehaviors` that have a `Behavior` of
     * `cache` . This includes the `DefaultCacheBehavior` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CacheSettingsProperty cacheSettingsProperty = CacheSettingsProperty.builder()
     * .allowedHttpMethods("allowedHttpMethods")
     * .cachedHttpMethods("cachedHttpMethods")
     * .defaultTtl(123)
     * .forwardedCookies(CookieObjectProperty.builder()
     * .cookiesAllowList(List.of("cookiesAllowList"))
     * .option("option")
     * .build())
     * .forwardedHeaders(HeaderObjectProperty.builder()
     * .headersAllowList(List.of("headersAllowList"))
     * .option("option")
     * .build())
     * .forwardedQueryStrings(QueryStringObjectProperty.builder()
     * .option(false)
     * .queryStringsAllowList(List.of("queryStringsAllowList"))
     * .build())
     * .maximumTtl(123)
     * .minimumTtl(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html)
     */
    public inline fun cfnDistributionCacheSettingsProperty(
        block: CfnDistributionCacheSettingsPropertyDsl.() -> Unit = {}
    ): CfnDistribution.CacheSettingsProperty {
        val builder = CfnDistributionCacheSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `CookieObject` is a property of the
     * [CacheSettings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html)
     * property. It describes whether an Amazon Lightsail content delivery network (CDN)
     * distribution forwards cookies to the origin and, if so, which ones.
     *
     * For the cookies that you specify, your distribution caches separate versions of the specified
     * content based on the cookie values in viewer requests.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CookieObjectProperty cookieObjectProperty = CookieObjectProperty.builder()
     * .cookiesAllowList(List.of("cookiesAllowList"))
     * .option("option")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cookieobject.html)
     */
    public inline fun cfnDistributionCookieObjectProperty(
        block: CfnDistributionCookieObjectPropertyDsl.() -> Unit = {}
    ): CfnDistribution.CookieObjectProperty {
        val builder = CfnDistributionCookieObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `HeaderObject` is a property of the
     * [CacheSettings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html)
     * property. It describes the request headers used by your distribution, which caches your
     * content based on the request headers.
     *
     * For the headers that you specify, your distribution caches separate versions of the specified
     * content based on the header values in viewer requests. For example, suppose that viewer
     * requests for logo.jpg contain a custom product header that has a value of either acme or
     * apex. Also, suppose that you configure your distribution to cache your content based on
     * values in the product header. Your distribution forwards the product header to the origin and
     * caches the response from the origin once for each header value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * HeaderObjectProperty headerObjectProperty = HeaderObjectProperty.builder()
     * .headersAllowList(List.of("headersAllowList"))
     * .option("option")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-headerobject.html)
     */
    public inline fun cfnDistributionHeaderObjectProperty(
        block: CfnDistributionHeaderObjectPropertyDsl.() -> Unit = {}
    ): CfnDistribution.HeaderObjectProperty {
        val builder = CfnDistributionHeaderObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `InputOrigin` is a property of the
     * [AWS::Lightsail::Distribution](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html)
     * resource. It describes the origin resource of an Amazon Lightsail content delivery network
     * (CDN) distribution.
     *
     * An origin can be a instance, bucket, or load balancer. A distribution pulls content from an
     * origin, caches it, and serves it to viewers through a worldwide network of edge servers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * InputOriginProperty inputOriginProperty = InputOriginProperty.builder()
     * .name("name")
     * .protocolPolicy("protocolPolicy")
     * .regionName("regionName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-inputorigin.html)
     */
    public inline fun cfnDistributionInputOriginProperty(
        block: CfnDistributionInputOriginPropertyDsl.() -> Unit = {}
    ): CfnDistribution.InputOriginProperty {
        val builder = CfnDistributionInputOriginPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDistribution`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnDistributionProps cfnDistributionProps = CfnDistributionProps.builder()
     * .bundleId("bundleId")
     * .defaultCacheBehavior(CacheBehaviorProperty.builder()
     * .behavior("behavior")
     * .build())
     * .distributionName("distributionName")
     * .origin(InputOriginProperty.builder()
     * .name("name")
     * .protocolPolicy("protocolPolicy")
     * .regionName("regionName")
     * .build())
     * // the properties below are optional
     * .cacheBehaviors(List.of(CacheBehaviorPerPathProperty.builder()
     * .behavior("behavior")
     * .path("path")
     * .build()))
     * .cacheBehaviorSettings(CacheSettingsProperty.builder()
     * .allowedHttpMethods("allowedHttpMethods")
     * .cachedHttpMethods("cachedHttpMethods")
     * .defaultTtl(123)
     * .forwardedCookies(CookieObjectProperty.builder()
     * .cookiesAllowList(List.of("cookiesAllowList"))
     * .option("option")
     * .build())
     * .forwardedHeaders(HeaderObjectProperty.builder()
     * .headersAllowList(List.of("headersAllowList"))
     * .option("option")
     * .build())
     * .forwardedQueryStrings(QueryStringObjectProperty.builder()
     * .option(false)
     * .queryStringsAllowList(List.of("queryStringsAllowList"))
     * .build())
     * .maximumTtl(123)
     * .minimumTtl(123)
     * .build())
     * .certificateName("certificateName")
     * .ipAddressType("ipAddressType")
     * .isEnabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html)
     */
    public inline fun cfnDistributionProps(
        block: CfnDistributionPropsDsl.() -> Unit = {}
    ): CfnDistributionProps {
        val builder = CfnDistributionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `QueryStringObject` is a property of the
     * [CacheSettings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html)
     * property. It describes the query string parameters that an Amazon Lightsail content delivery
     * network (CDN) distribution to bases caching on.
     *
     * For the query strings that you specify, your distribution caches separate versions of the
     * specified content based on the query string values in viewer requests.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * QueryStringObjectProperty queryStringObjectProperty = QueryStringObjectProperty.builder()
     * .option(false)
     * .queryStringsAllowList(List.of("queryStringsAllowList"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-querystringobject.html)
     */
    public inline fun cfnDistributionQueryStringObjectProperty(
        block: CfnDistributionQueryStringObjectPropertyDsl.() -> Unit = {}
    ): CfnDistribution.QueryStringObjectProperty {
        val builder = CfnDistributionQueryStringObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lightsail::Instance` resource specifies an Amazon Lightsail instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnInstance cfnInstance = CfnInstance.Builder.create(this, "MyCfnInstance")
     * .blueprintId("blueprintId")
     * .bundleId("bundleId")
     * .instanceName("instanceName")
     * // the properties below are optional
     * .addOns(List.of(AddOnProperty.builder()
     * .addOnType("addOnType")
     * // the properties below are optional
     * .autoSnapshotAddOnRequest(AutoSnapshotAddOnProperty.builder()
     * .snapshotTimeOfDay("snapshotTimeOfDay")
     * .build())
     * .status("status")
     * .build()))
     * .availabilityZone("availabilityZone")
     * .hardware(HardwareProperty.builder()
     * .cpuCount(123)
     * .disks(List.of(DiskProperty.builder()
     * .diskName("diskName")
     * .path("path")
     * // the properties below are optional
     * .attachedTo("attachedTo")
     * .attachmentState("attachmentState")
     * .iops(123)
     * .isSystemDisk(false)
     * .sizeInGb("sizeInGb")
     * .build()))
     * .ramSizeInGb(123)
     * .build())
     * .keyPairName("keyPairName")
     * .location(LocationProperty.builder()
     * .availabilityZone("availabilityZone")
     * .regionName("regionName")
     * .build())
     * .networking(NetworkingProperty.builder()
     * .ports(List.of(PortProperty.builder()
     * .accessDirection("accessDirection")
     * .accessFrom("accessFrom")
     * .accessType("accessType")
     * .cidrListAliases(List.of("cidrListAliases"))
     * .cidrs(List.of("cidrs"))
     * .commonName("commonName")
     * .fromPort(123)
     * .ipv6Cidrs(List.of("ipv6Cidrs"))
     * .protocol("protocol")
     * .toPort(123)
     * .build()))
     * // the properties below are optional
     * .monthlyTransfer(MonthlyTransferProperty.builder()
     * .gbPerMonthAllocated("gbPerMonthAllocated")
     * .build())
     * .build())
     * .state(StateProperty.builder()
     * .code(123)
     * .name("name")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userData("userData")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html)
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
     * `AddOn` is a property of the
     * [AWS::Lightsail::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html)
     * resource. It describes the add-ons for an instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * AddOnProperty addOnProperty = AddOnProperty.builder()
     * .addOnType("addOnType")
     * // the properties below are optional
     * .autoSnapshotAddOnRequest(AutoSnapshotAddOnProperty.builder()
     * .snapshotTimeOfDay("snapshotTimeOfDay")
     * .build())
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-addon.html)
     */
    public inline fun cfnInstanceAddOnProperty(
        block: CfnInstanceAddOnPropertyDsl.() -> Unit = {}
    ): CfnInstance.AddOnProperty {
        val builder = CfnInstanceAddOnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `AutoSnapshotAddOn` is a property of the
     * [AddOn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-addon.html)
     * property. It describes the automatic snapshot add-on for an instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * AutoSnapshotAddOnProperty autoSnapshotAddOnProperty = AutoSnapshotAddOnProperty.builder()
     * .snapshotTimeOfDay("snapshotTimeOfDay")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-autosnapshotaddon.html)
     */
    public inline fun cfnInstanceAutoSnapshotAddOnProperty(
        block: CfnInstanceAutoSnapshotAddOnPropertyDsl.() -> Unit = {}
    ): CfnInstance.AutoSnapshotAddOnProperty {
        val builder = CfnInstanceAutoSnapshotAddOnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `Disk` is a property of the
     * [Hardware](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-hardware.html)
     * property. It describes a disk attached to an instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * DiskProperty diskProperty = DiskProperty.builder()
     * .diskName("diskName")
     * .path("path")
     * // the properties below are optional
     * .attachedTo("attachedTo")
     * .attachmentState("attachmentState")
     * .iops(123)
     * .isSystemDisk(false)
     * .sizeInGb("sizeInGb")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html)
     */
    public inline fun cfnInstanceDiskProperty(
        block: CfnInstanceDiskPropertyDsl.() -> Unit = {}
    ): CfnInstance.DiskProperty {
        val builder = CfnInstanceDiskPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `Hardware` is a property of the
     * [AWS::Lightsail::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html)
     * resource. It describes the hardware properties for the instance, such as the vCPU count,
     * attached disks, and amount of RAM.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * HardwareProperty hardwareProperty = HardwareProperty.builder()
     * .cpuCount(123)
     * .disks(List.of(DiskProperty.builder()
     * .diskName("diskName")
     * .path("path")
     * // the properties below are optional
     * .attachedTo("attachedTo")
     * .attachmentState("attachmentState")
     * .iops(123)
     * .isSystemDisk(false)
     * .sizeInGb("sizeInGb")
     * .build()))
     * .ramSizeInGb(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-hardware.html)
     */
    public inline fun cfnInstanceHardwareProperty(
        block: CfnInstanceHardwarePropertyDsl.() -> Unit = {}
    ): CfnInstance.HardwareProperty {
        val builder = CfnInstanceHardwarePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `Location` is a property of the
     * [AWS::Lightsail::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html)
     * resource. It describes the location for an instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * LocationProperty locationProperty = LocationProperty.builder()
     * .availabilityZone("availabilityZone")
     * .regionName("regionName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-location.html)
     */
    public inline fun cfnInstanceLocationProperty(
        block: CfnInstanceLocationPropertyDsl.() -> Unit = {}
    ): CfnInstance.LocationProperty {
        val builder = CfnInstanceLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `MonthlyTransfer` is a property of the
     * [Networking](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-networking.html)
     * property. It describes the amount of allocated monthly data transfer (in GB) for an instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * MonthlyTransferProperty monthlyTransferProperty = MonthlyTransferProperty.builder()
     * .gbPerMonthAllocated("gbPerMonthAllocated")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-monthlytransfer.html)
     */
    public inline fun cfnInstanceMonthlyTransferProperty(
        block: CfnInstanceMonthlyTransferPropertyDsl.() -> Unit = {}
    ): CfnInstance.MonthlyTransferProperty {
        val builder = CfnInstanceMonthlyTransferPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `Networking` is a property of the
     * [AWS::Lightsail::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html)
     * resource. It describes the public ports and the monthly amount of data transfer allocated for
     * the instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * NetworkingProperty networkingProperty = NetworkingProperty.builder()
     * .ports(List.of(PortProperty.builder()
     * .accessDirection("accessDirection")
     * .accessFrom("accessFrom")
     * .accessType("accessType")
     * .cidrListAliases(List.of("cidrListAliases"))
     * .cidrs(List.of("cidrs"))
     * .commonName("commonName")
     * .fromPort(123)
     * .ipv6Cidrs(List.of("ipv6Cidrs"))
     * .protocol("protocol")
     * .toPort(123)
     * .build()))
     * // the properties below are optional
     * .monthlyTransfer(MonthlyTransferProperty.builder()
     * .gbPerMonthAllocated("gbPerMonthAllocated")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-networking.html)
     */
    public inline fun cfnInstanceNetworkingProperty(
        block: CfnInstanceNetworkingPropertyDsl.() -> Unit = {}
    ): CfnInstance.NetworkingProperty {
        val builder = CfnInstanceNetworkingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `Port` is a property of the
     * [Networking](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-networking.html)
     * property. It describes information about ports for an instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * PortProperty portProperty = PortProperty.builder()
     * .accessDirection("accessDirection")
     * .accessFrom("accessFrom")
     * .accessType("accessType")
     * .cidrListAliases(List.of("cidrListAliases"))
     * .cidrs(List.of("cidrs"))
     * .commonName("commonName")
     * .fromPort(123)
     * .ipv6Cidrs(List.of("ipv6Cidrs"))
     * .protocol("protocol")
     * .toPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html)
     */
    public inline fun cfnInstancePortProperty(
        block: CfnInstancePortPropertyDsl.() -> Unit = {}
    ): CfnInstance.PortProperty {
        val builder = CfnInstancePortPropertyDsl()
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
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnInstanceProps cfnInstanceProps = CfnInstanceProps.builder()
     * .blueprintId("blueprintId")
     * .bundleId("bundleId")
     * .instanceName("instanceName")
     * // the properties below are optional
     * .addOns(List.of(AddOnProperty.builder()
     * .addOnType("addOnType")
     * // the properties below are optional
     * .autoSnapshotAddOnRequest(AutoSnapshotAddOnProperty.builder()
     * .snapshotTimeOfDay("snapshotTimeOfDay")
     * .build())
     * .status("status")
     * .build()))
     * .availabilityZone("availabilityZone")
     * .hardware(HardwareProperty.builder()
     * .cpuCount(123)
     * .disks(List.of(DiskProperty.builder()
     * .diskName("diskName")
     * .path("path")
     * // the properties below are optional
     * .attachedTo("attachedTo")
     * .attachmentState("attachmentState")
     * .iops(123)
     * .isSystemDisk(false)
     * .sizeInGb("sizeInGb")
     * .build()))
     * .ramSizeInGb(123)
     * .build())
     * .keyPairName("keyPairName")
     * .location(LocationProperty.builder()
     * .availabilityZone("availabilityZone")
     * .regionName("regionName")
     * .build())
     * .networking(NetworkingProperty.builder()
     * .ports(List.of(PortProperty.builder()
     * .accessDirection("accessDirection")
     * .accessFrom("accessFrom")
     * .accessType("accessType")
     * .cidrListAliases(List.of("cidrListAliases"))
     * .cidrs(List.of("cidrs"))
     * .commonName("commonName")
     * .fromPort(123)
     * .ipv6Cidrs(List.of("ipv6Cidrs"))
     * .protocol("protocol")
     * .toPort(123)
     * .build()))
     * // the properties below are optional
     * .monthlyTransfer(MonthlyTransferProperty.builder()
     * .gbPerMonthAllocated("gbPerMonthAllocated")
     * .build())
     * .build())
     * .state(StateProperty.builder()
     * .code(123)
     * .name("name")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userData("userData")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html)
     */
    public inline fun cfnInstanceProps(
        block: CfnInstancePropsDsl.() -> Unit = {}
    ): CfnInstanceProps {
        val builder = CfnInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `State` is a property of the
     * [AWS::Lightsail::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html)
     * resource. It describes the status code and the state (for example, `running` ) of an
     * instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * StateProperty stateProperty = StateProperty.builder()
     * .code(123)
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-state.html)
     */
    public inline fun cfnInstanceStateProperty(
        block: CfnInstanceStatePropertyDsl.() -> Unit = {}
    ): CfnInstance.StateProperty {
        val builder = CfnInstanceStatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lightsail::LoadBalancer` resource specifies a load balancer that can be used with
     * Lightsail instances.
     *
     * You cannot attach a TLS certificate to a load balancer using the
     * `AWS::Lightsail::LoadBalancer` resource type. Instead, use the
     * `AWS::Lightsail::LoadBalancerTlsCertificate` resource type to create a certificate and attach
     * it to a load balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnLoadBalancer cfnLoadBalancer = CfnLoadBalancer.Builder.create(this, "MyCfnLoadBalancer")
     * .instancePort(123)
     * .loadBalancerName("loadBalancerName")
     * // the properties below are optional
     * .attachedInstances(List.of("attachedInstances"))
     * .healthCheckPath("healthCheckPath")
     * .ipAddressType("ipAddressType")
     * .sessionStickinessEnabled(false)
     * .sessionStickinessLbCookieDurationSeconds("sessionStickinessLbCookieDurationSeconds")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tlsPolicyName("tlsPolicyName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html)
     */
    public inline fun cfnLoadBalancer(
        scope: Construct,
        id: String,
        block: CfnLoadBalancerDsl.() -> Unit = {},
    ): CfnLoadBalancer {
        val builder = CfnLoadBalancerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLoadBalancer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnLoadBalancerProps cfnLoadBalancerProps = CfnLoadBalancerProps.builder()
     * .instancePort(123)
     * .loadBalancerName("loadBalancerName")
     * // the properties below are optional
     * .attachedInstances(List.of("attachedInstances"))
     * .healthCheckPath("healthCheckPath")
     * .ipAddressType("ipAddressType")
     * .sessionStickinessEnabled(false)
     * .sessionStickinessLbCookieDurationSeconds("sessionStickinessLbCookieDurationSeconds")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tlsPolicyName("tlsPolicyName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html)
     */
    public inline fun cfnLoadBalancerProps(
        block: CfnLoadBalancerPropsDsl.() -> Unit = {}
    ): CfnLoadBalancerProps {
        val builder = CfnLoadBalancerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lightsail::LoadBalancerTlsCertificate` resource specifies a TLS certificate that
     * can be used with a Lightsail load balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnLoadBalancerTlsCertificate cfnLoadBalancerTlsCertificate =
     * CfnLoadBalancerTlsCertificate.Builder.create(this, "MyCfnLoadBalancerTlsCertificate")
     * .certificateDomainName("certificateDomainName")
     * .certificateName("certificateName")
     * .loadBalancerName("loadBalancerName")
     * // the properties below are optional
     * .certificateAlternativeNames(List.of("certificateAlternativeNames"))
     * .httpsRedirectionEnabled(false)
     * .isAttached(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html)
     */
    public inline fun cfnLoadBalancerTlsCertificate(
        scope: Construct,
        id: String,
        block: CfnLoadBalancerTlsCertificateDsl.() -> Unit = {},
    ): CfnLoadBalancerTlsCertificate {
        val builder = CfnLoadBalancerTlsCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLoadBalancerTlsCertificate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnLoadBalancerTlsCertificateProps cfnLoadBalancerTlsCertificateProps =
     * CfnLoadBalancerTlsCertificateProps.builder()
     * .certificateDomainName("certificateDomainName")
     * .certificateName("certificateName")
     * .loadBalancerName("loadBalancerName")
     * // the properties below are optional
     * .certificateAlternativeNames(List.of("certificateAlternativeNames"))
     * .httpsRedirectionEnabled(false)
     * .isAttached(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html)
     */
    public inline fun cfnLoadBalancerTlsCertificateProps(
        block: CfnLoadBalancerTlsCertificatePropsDsl.() -> Unit = {}
    ): CfnLoadBalancerTlsCertificateProps {
        val builder = CfnLoadBalancerTlsCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lightsail::StaticIp` resource specifies a static IP that can be attached to an
     * Amazon Lightsail instance that is in the same AWS Region and Availability Zone.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnStaticIp cfnStaticIp = CfnStaticIp.Builder.create(this, "MyCfnStaticIp")
     * .staticIpName("staticIpName")
     * // the properties below are optional
     * .attachedTo("attachedTo")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html)
     */
    public inline fun cfnStaticIp(
        scope: Construct,
        id: String,
        block: CfnStaticIpDsl.() -> Unit = {},
    ): CfnStaticIp {
        val builder = CfnStaticIpDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStaticIp`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lightsail.*;
     * CfnStaticIpProps cfnStaticIpProps = CfnStaticIpProps.builder()
     * .staticIpName("staticIpName")
     * // the properties below are optional
     * .attachedTo("attachedTo")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html)
     */
    public inline fun cfnStaticIpProps(
        block: CfnStaticIpPropsDsl.() -> Unit = {}
    ): CfnStaticIpProps {
        val builder = CfnStaticIpPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
