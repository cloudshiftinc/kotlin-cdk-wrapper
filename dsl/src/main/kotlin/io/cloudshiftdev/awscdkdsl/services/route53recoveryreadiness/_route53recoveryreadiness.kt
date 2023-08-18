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

package io.cloudshiftdev.awscdkdsl.services.route53recoveryreadiness

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoveryreadiness.CfnCell
import software.amazon.awscdk.services.route53recoveryreadiness.CfnCellProps
import software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck
import software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps
import software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup
import software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps
import software.constructs.Construct

public object route53recoveryreadiness {
    /**
     * Creates a cell in recovery group in Amazon Route 53 Application Recovery Controller.
     *
     * A cell in Route 53 ARC represents replicas or independent units of failover in your
     * application. It groups within it all the AWS resources that are necessary for your
     * application to run independently. Typically, you would have define one set of resources in a
     * primary cell and another set in a standby cell in your recovery group.
     *
     * After you set up the cells for your application, you can create readiness checks in Route 53
     * ARC to continually audit readiness for AWS resource quotas, capacity, network routing
     * policies, and other predefined rules.
     *
     * You can set up notifications about changes that would affect your ability to fail over to a
     * replica and recover. However, you should make decisions about whether to fail away from or to
     * a replica based on your monitoring and health check systems. You should consider readiness
     * checks as a complementary service to those systems.
     *
     * Route 53 ARC Readiness supports us-east-1 and us-west-2 AWS Regions only.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoveryreadiness.*;
     * CfnCell cfnCell = CfnCell.Builder.create(this, "MyCfnCell")
     * .cellName("cellName")
     * .cells(List.of("cells"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html)
     */
    public inline fun cfnCell(
        scope: Construct,
        id: String,
        block: CfnCellDsl.() -> Unit = {},
    ): CfnCell {
        val builder = CfnCellDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCell`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoveryreadiness.*;
     * CfnCellProps cfnCellProps = CfnCellProps.builder()
     * .cellName("cellName")
     * .cells(List.of("cells"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html)
     */
    public inline fun cfnCellProps(block: CfnCellPropsDsl.() -> Unit = {}): CfnCellProps {
        val builder = CfnCellPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a readiness check in Amazon Route 53 Application Recovery Controller.
     *
     * A readiness check continually monitors a resource set in your application, such as a set of
     * Amazon Aurora instances, that Route 53 ARC is auditing recovery readiness for. The audits run
     * once every minute on every resource that's associated with a readiness check.
     *
     * Every resource type has a set of rules associated with it that Route 53 ARC uses to audit
     * resources for readiness. For more information, see
     * [Readiness rules descriptions](https://docs.aws.amazon.com/r53recovery/latest/dg/recovery-readiness.rules-resources.html)
     * in the Amazon Route 53 Application Recovery Controller Developer Guide.
     *
     * Route 53 ARC Readiness supports us-east-1 and us-west-2 AWS Regions only.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoveryreadiness.*;
     * CfnReadinessCheck cfnReadinessCheck = CfnReadinessCheck.Builder.create(this,
     * "MyCfnReadinessCheck")
     * .readinessCheckName("readinessCheckName")
     * .resourceSetName("resourceSetName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html)
     */
    public inline fun cfnReadinessCheck(
        scope: Construct,
        id: String,
        block: CfnReadinessCheckDsl.() -> Unit = {},
    ): CfnReadinessCheck {
        val builder = CfnReadinessCheckDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnReadinessCheck`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoveryreadiness.*;
     * CfnReadinessCheckProps cfnReadinessCheckProps = CfnReadinessCheckProps.builder()
     * .readinessCheckName("readinessCheckName")
     * .resourceSetName("resourceSetName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html)
     */
    public inline fun cfnReadinessCheckProps(
        block: CfnReadinessCheckPropsDsl.() -> Unit = {}
    ): CfnReadinessCheckProps {
        val builder = CfnReadinessCheckPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a recovery group in Amazon Route 53 Application Recovery Controller.
     *
     * A recovery group represents your application. It typically consists of two or more cells that
     * are replicas of each other in terms of resources and functionality, so that you can fail over
     * from one to the other, for example, from one Region to another. You create recovery groups so
     * you can use readiness checks to audit resources in your application.
     *
     * For more information, see
     * [Readiness checks, resource sets, and readiness scopes](https://docs.aws.amazon.com/r53recovery/latest/dg/recovery-readiness.recovery-groups.readiness-scope.html)
     * in the Amazon Route 53 Application Recovery Controller Developer Guide.
     *
     * Route 53 ARC Readiness supports us-east-1 and us-west-2 AWS Regions only.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoveryreadiness.*;
     * CfnRecoveryGroup cfnRecoveryGroup = CfnRecoveryGroup.Builder.create(this, "MyCfnRecoveryGroup")
     * .cells(List.of("cells"))
     * .recoveryGroupName("recoveryGroupName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html)
     */
    public inline fun cfnRecoveryGroup(
        scope: Construct,
        id: String,
        block: CfnRecoveryGroupDsl.() -> Unit = {},
    ): CfnRecoveryGroup {
        val builder = CfnRecoveryGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRecoveryGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoveryreadiness.*;
     * CfnRecoveryGroupProps cfnRecoveryGroupProps = CfnRecoveryGroupProps.builder()
     * .cells(List.of("cells"))
     * .recoveryGroupName("recoveryGroupName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html)
     */
    public inline fun cfnRecoveryGroupProps(
        block: CfnRecoveryGroupPropsDsl.() -> Unit = {}
    ): CfnRecoveryGroupProps {
        val builder = CfnRecoveryGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a resource set in Amazon Route 53 Application Recovery Controller.
     *
     * A resource set is a set of resources of one type, such as Network Load Balancers, that span
     * multiple cells. You can associate a resource set with a readiness check to have Route 53 ARC
     * continually monitor the resources in the set for failover readiness.
     *
     * You typically create a resource set and a readiness check for each supported type of AWS
     * resource in your application.
     *
     * For more information, see
     * [Readiness checks, resource sets, and readiness scopes](https://docs.aws.amazon.com/r53recovery/latest/dg/recovery-readiness.recovery-groups.readiness-scope.html)
     * in the Amazon Route 53 Application Recovery Controller Developer Guide.
     *
     * Route 53 ARC Readiness supports us-east-1 and us-west-2 AWS Regions only.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoveryreadiness.*;
     * CfnResourceSet cfnResourceSet = CfnResourceSet.Builder.create(this, "MyCfnResourceSet")
     * .resources(List.of(ResourceProperty.builder()
     * .componentId("componentId")
     * .dnsTargetResource(DNSTargetResourceProperty.builder()
     * .domainName("domainName")
     * .hostedZoneArn("hostedZoneArn")
     * .recordSetId("recordSetId")
     * .recordType("recordType")
     * .targetResource(TargetResourceProperty.builder()
     * .nlbResource(NLBResourceProperty.builder()
     * .arn("arn")
     * .build())
     * .r53Resource(R53ResourceRecordProperty.builder()
     * .domainName("domainName")
     * .recordSetId("recordSetId")
     * .build())
     * .build())
     * .build())
     * .readinessScopes(List.of("readinessScopes"))
     * .resourceArn("resourceArn")
     * .build()))
     * .resourceSetType("resourceSetType")
     * // the properties below are optional
     * .resourceSetName("resourceSetName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html)
     */
    public inline fun cfnResourceSet(
        scope: Construct,
        id: String,
        block: CfnResourceSetDsl.() -> Unit = {},
    ): CfnResourceSet {
        val builder = CfnResourceSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A component for DNS/routing control readiness checks and architecture checks.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoveryreadiness.*;
     * DNSTargetResourceProperty dNSTargetResourceProperty = DNSTargetResourceProperty.builder()
     * .domainName("domainName")
     * .hostedZoneArn("hostedZoneArn")
     * .recordSetId("recordSetId")
     * .recordType("recordType")
     * .targetResource(TargetResourceProperty.builder()
     * .nlbResource(NLBResourceProperty.builder()
     * .arn("arn")
     * .build())
     * .r53Resource(R53ResourceRecordProperty.builder()
     * .domainName("domainName")
     * .recordSetId("recordSetId")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-dnstargetresource.html)
     */
    public inline fun cfnResourceSetDNSTargetResourceProperty(
        block: CfnResourceSetDNSTargetResourcePropertyDsl.() -> Unit = {}
    ): CfnResourceSet.DNSTargetResourceProperty {
        val builder = CfnResourceSetDNSTargetResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Network Load Balancer resource that a DNS target resource points to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoveryreadiness.*;
     * NLBResourceProperty nLBResourceProperty = NLBResourceProperty.builder()
     * .arn("arn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-nlbresource.html)
     */
    public inline fun cfnResourceSetNLBResourceProperty(
        block: CfnResourceSetNLBResourcePropertyDsl.() -> Unit = {}
    ): CfnResourceSet.NLBResourceProperty {
        val builder = CfnResourceSetNLBResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourceSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoveryreadiness.*;
     * CfnResourceSetProps cfnResourceSetProps = CfnResourceSetProps.builder()
     * .resources(List.of(ResourceProperty.builder()
     * .componentId("componentId")
     * .dnsTargetResource(DNSTargetResourceProperty.builder()
     * .domainName("domainName")
     * .hostedZoneArn("hostedZoneArn")
     * .recordSetId("recordSetId")
     * .recordType("recordType")
     * .targetResource(TargetResourceProperty.builder()
     * .nlbResource(NLBResourceProperty.builder()
     * .arn("arn")
     * .build())
     * .r53Resource(R53ResourceRecordProperty.builder()
     * .domainName("domainName")
     * .recordSetId("recordSetId")
     * .build())
     * .build())
     * .build())
     * .readinessScopes(List.of("readinessScopes"))
     * .resourceArn("resourceArn")
     * .build()))
     * .resourceSetType("resourceSetType")
     * // the properties below are optional
     * .resourceSetName("resourceSetName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html)
     */
    public inline fun cfnResourceSetProps(
        block: CfnResourceSetPropsDsl.() -> Unit = {}
    ): CfnResourceSetProps {
        val builder = CfnResourceSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon Route 53 resource that a DNS target resource record points to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoveryreadiness.*;
     * R53ResourceRecordProperty r53ResourceRecordProperty = R53ResourceRecordProperty.builder()
     * .domainName("domainName")
     * .recordSetId("recordSetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-r53resourcerecord.html)
     */
    public inline fun cfnResourceSetR53ResourceRecordProperty(
        block: CfnResourceSetR53ResourceRecordPropertyDsl.() -> Unit = {}
    ): CfnResourceSet.R53ResourceRecordProperty {
        val builder = CfnResourceSetR53ResourceRecordPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The resource element of a resource set.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoveryreadiness.*;
     * ResourceProperty resourceProperty = ResourceProperty.builder()
     * .componentId("componentId")
     * .dnsTargetResource(DNSTargetResourceProperty.builder()
     * .domainName("domainName")
     * .hostedZoneArn("hostedZoneArn")
     * .recordSetId("recordSetId")
     * .recordType("recordType")
     * .targetResource(TargetResourceProperty.builder()
     * .nlbResource(NLBResourceProperty.builder()
     * .arn("arn")
     * .build())
     * .r53Resource(R53ResourceRecordProperty.builder()
     * .domainName("domainName")
     * .recordSetId("recordSetId")
     * .build())
     * .build())
     * .build())
     * .readinessScopes(List.of("readinessScopes"))
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-resource.html)
     */
    public inline fun cfnResourceSetResourceProperty(
        block: CfnResourceSetResourcePropertyDsl.() -> Unit = {}
    ): CfnResourceSet.ResourceProperty {
        val builder = CfnResourceSetResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The target resource that the Route 53 record points to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoveryreadiness.*;
     * TargetResourceProperty targetResourceProperty = TargetResourceProperty.builder()
     * .nlbResource(NLBResourceProperty.builder()
     * .arn("arn")
     * .build())
     * .r53Resource(R53ResourceRecordProperty.builder()
     * .domainName("domainName")
     * .recordSetId("recordSetId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-targetresource.html)
     */
    public inline fun cfnResourceSetTargetResourceProperty(
        block: CfnResourceSetTargetResourcePropertyDsl.() -> Unit = {}
    ): CfnResourceSet.TargetResourceProperty {
        val builder = CfnResourceSetTargetResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
