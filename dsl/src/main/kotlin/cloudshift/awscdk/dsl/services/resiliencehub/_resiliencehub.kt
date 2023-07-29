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

package cloudshift.awscdk.dsl.services.resiliencehub

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resiliencehub.CfnApp
import software.amazon.awscdk.services.resiliencehub.CfnAppProps
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps
import software.constructs.Construct

public object resiliencehub {
    /**
     * Creates an AWS Resilience Hub application.
     *
     * An AWS Resilience Hub application is a collection of AWS resources structured to prevent and
     * recover AWS application disruptions. To describe a AWS Resilience Hub application, you
     * provide an application name, resources from one or more AWS CloudFormation stacks, AWS
     * Resource Groups , Terraform state files, AppRegistry applications, and an appropriate
     * resiliency policy. In addition, you can also add resources that are located on Amazon Elastic
     * Kubernetes Service ( Amazon EKS ) clusters as optional resources. For more information about
     * the number of resources supported per application, see
     * [Service quotas](https://docs.aws.amazon.com/general/latest/gr/resiliencehub.html#limits_resiliencehub)
     * .
     *
     * After you create an AWS Resilience Hub application, you publish it so that you can run a
     * resiliency assessment on it. You can then use recommendations from the assessment to improve
     * resiliency by running another assessment, comparing results, and then iterating the process
     * until you achieve your goals for recovery time objective (RTO) and recovery point objective
     * (RPO).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.resiliencehub.*;
     * CfnApp cfnApp = CfnApp.Builder.create(this, "MyCfnApp")
     * .appTemplateBody("appTemplateBody")
     * .name("name")
     * .resourceMappings(List.of(ResourceMappingProperty.builder()
     * .mappingType("mappingType")
     * .physicalResourceId(PhysicalResourceIdProperty.builder()
     * .identifier("identifier")
     * .type("type")
     * // the properties below are optional
     * .awsAccountId("awsAccountId")
     * .awsRegion("awsRegion")
     * .build())
     * // the properties below are optional
     * .eksSourceName("eksSourceName")
     * .logicalStackName("logicalStackName")
     * .resourceName("resourceName")
     * .terraformSourceName("terraformSourceName")
     * .build()))
     * // the properties below are optional
     * .appAssessmentSchedule("appAssessmentSchedule")
     * .description("description")
     * .resiliencyPolicyArn("resiliencyPolicyArn")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html)
     */
    public inline fun cfnApp(
        scope: Construct,
        id: String,
        block: CfnAppDsl.() -> Unit = {},
    ): CfnApp {
        val builder = CfnAppDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a physical resource identifier.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.resiliencehub.*;
     * PhysicalResourceIdProperty physicalResourceIdProperty = PhysicalResourceIdProperty.builder()
     * .identifier("identifier")
     * .type("type")
     * // the properties below are optional
     * .awsAccountId("awsAccountId")
     * .awsRegion("awsRegion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-physicalresourceid.html)
     */
    public inline fun cfnAppPhysicalResourceIdProperty(
        block: CfnAppPhysicalResourceIdPropertyDsl.() -> Unit = {}
    ): CfnApp.PhysicalResourceIdProperty {
        val builder = CfnAppPhysicalResourceIdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApp`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.resiliencehub.*;
     * CfnAppProps cfnAppProps = CfnAppProps.builder()
     * .appTemplateBody("appTemplateBody")
     * .name("name")
     * .resourceMappings(List.of(ResourceMappingProperty.builder()
     * .mappingType("mappingType")
     * .physicalResourceId(PhysicalResourceIdProperty.builder()
     * .identifier("identifier")
     * .type("type")
     * // the properties below are optional
     * .awsAccountId("awsAccountId")
     * .awsRegion("awsRegion")
     * .build())
     * // the properties below are optional
     * .eksSourceName("eksSourceName")
     * .logicalStackName("logicalStackName")
     * .resourceName("resourceName")
     * .terraformSourceName("terraformSourceName")
     * .build()))
     * // the properties below are optional
     * .appAssessmentSchedule("appAssessmentSchedule")
     * .description("description")
     * .resiliencyPolicyArn("resiliencyPolicyArn")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html)
     */
    public inline fun cfnAppProps(block: CfnAppPropsDsl.() -> Unit = {}): CfnAppProps {
        val builder = CfnAppPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a resource mapping.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.resiliencehub.*;
     * ResourceMappingProperty resourceMappingProperty = ResourceMappingProperty.builder()
     * .mappingType("mappingType")
     * .physicalResourceId(PhysicalResourceIdProperty.builder()
     * .identifier("identifier")
     * .type("type")
     * // the properties below are optional
     * .awsAccountId("awsAccountId")
     * .awsRegion("awsRegion")
     * .build())
     * // the properties below are optional
     * .eksSourceName("eksSourceName")
     * .logicalStackName("logicalStackName")
     * .resourceName("resourceName")
     * .terraformSourceName("terraformSourceName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-resourcemapping.html)
     */
    public inline fun cfnAppResourceMappingProperty(
        block: CfnAppResourceMappingPropertyDsl.() -> Unit = {}
    ): CfnApp.ResourceMappingProperty {
        val builder = CfnAppResourceMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a resiliency policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.resiliencehub.*;
     * CfnResiliencyPolicy cfnResiliencyPolicy = CfnResiliencyPolicy.Builder.create(this,
     * "MyCfnResiliencyPolicy")
     * .policy(Map.of(
     * "policyKey", FailurePolicyProperty.builder()
     * .rpoInSecs(123)
     * .rtoInSecs(123)
     * .build()))
     * .policyName("policyName")
     * .tier("tier")
     * // the properties below are optional
     * .dataLocationConstraint("dataLocationConstraint")
     * .policyDescription("policyDescription")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html)
     */
    public inline fun cfnResiliencyPolicy(
        scope: Construct,
        id: String,
        block: CfnResiliencyPolicyDsl.() -> Unit = {},
    ): CfnResiliencyPolicy {
        val builder = CfnResiliencyPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a failure policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.resiliencehub.*;
     * FailurePolicyProperty failurePolicyProperty = FailurePolicyProperty.builder()
     * .rpoInSecs(123)
     * .rtoInSecs(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-resiliencypolicy-failurepolicy.html)
     */
    public inline fun cfnResiliencyPolicyFailurePolicyProperty(
        block: CfnResiliencyPolicyFailurePolicyPropertyDsl.() -> Unit = {}
    ): CfnResiliencyPolicy.FailurePolicyProperty {
        val builder = CfnResiliencyPolicyFailurePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResiliencyPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.resiliencehub.*;
     * CfnResiliencyPolicyProps cfnResiliencyPolicyProps = CfnResiliencyPolicyProps.builder()
     * .policy(Map.of(
     * "policyKey", FailurePolicyProperty.builder()
     * .rpoInSecs(123)
     * .rtoInSecs(123)
     * .build()))
     * .policyName("policyName")
     * .tier("tier")
     * // the properties below are optional
     * .dataLocationConstraint("dataLocationConstraint")
     * .policyDescription("policyDescription")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html)
     */
    public inline fun cfnResiliencyPolicyProps(
        block: CfnResiliencyPolicyPropsDsl.() -> Unit = {}
    ): CfnResiliencyPolicyProps {
        val builder = CfnResiliencyPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
