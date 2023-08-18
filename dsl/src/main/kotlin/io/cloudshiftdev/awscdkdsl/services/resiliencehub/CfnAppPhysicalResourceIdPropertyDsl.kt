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

package io.cloudshiftdev.awscdkdsl.services.resiliencehub

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.resiliencehub.CfnApp

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
@CdkDslMarker
public class CfnAppPhysicalResourceIdPropertyDsl {
    private val cdkBuilder: CfnApp.PhysicalResourceIdProperty.Builder =
        CfnApp.PhysicalResourceIdProperty.builder()

    /** @param awsAccountId The AWS account that owns the physical resource. */
    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    /** @param awsRegion The AWS Region that the physical resource is located in. */
    public fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
    }

    /** @param identifier Identifier of the physical resource. */
    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    /**
     * @param type Specifies the type of physical resource identifier.
     * * **Arn** - The resource identifier is an Amazon Resource Name (ARN) and it can identify the
     *   following list of resources:
     * * `AWS::ECS::Service`
     * * `AWS::EFS::FileSystem`
     * * `AWS::ElasticLoadBalancingV2::LoadBalancer`
     * * `AWS::Lambda::Function`
     * * `AWS::SNS::Topic`
     * * **Native** - The resource identifier is an AWS Resilience Hub -native identifier and it can
     *   identify the following list of resources:
     * * `AWS::ApiGateway::RestApi`
     * * `AWS::ApiGatewayV2::Api`
     * * `AWS::AutoScaling::AutoScalingGroup`
     * * `AWS::DocDB::DBCluster`
     * * `AWS::DocDB::DBGlobalCluster`
     * * `AWS::DocDB::DBInstance`
     * * `AWS::DynamoDB::GlobalTable`
     * * `AWS::DynamoDB::Table`
     * * `AWS::EC2::EC2Fleet`
     * * `AWS::EC2::Instance`
     * * `AWS::EC2::NatGateway`
     * * `AWS::EC2::Volume`
     * * `AWS::ElasticLoadBalancing::LoadBalancer`
     * * `AWS::RDS::DBCluster`
     * * `AWS::RDS::DBInstance`
     * * `AWS::RDS::GlobalCluster`
     * * `AWS::Route53::RecordSet`
     * * `AWS::S3::Bucket`
     * * `AWS::SQS::Queue`
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnApp.PhysicalResourceIdProperty = cdkBuilder.build()
}
