@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Physical ID of the custom resource.
 *
 * Example:
 *
 * ```
 * AwsCustomResource getParameter = AwsCustomResource.Builder.create(this,
 * "AssociateVPCWithHostedZone")
 * .onCreate(AwsSdkCall.builder()
 * .assumedRoleArn("arn:aws:iam::OTHERACCOUNT:role/CrossAccount/ManageHostedZoneConnections")
 * .service("Route53")
 * .action("AssociateVPCWithHostedZone")
 * .parameters(Map.of(
 * "HostedZoneId", "hz-123",
 * "VPC", Map.of(
 * "VPCId", "vpc-123",
 * "VPCRegion", "region-for-vpc")))
 * .physicalResourceId(PhysicalResourceId.of("${vpcStack.SharedVpc.VpcId}-${vpcStack.Region}-${PrivateHostedZone.HostedZoneId}"))
 * .build())
 * //Will ignore any resource and use the assumedRoleArn as resource and 'sts:AssumeRole' for
 * service:action
 * .policy(AwsCustomResourcePolicy.fromSdkCalls(SdkCallsPolicyOptions.builder()
 * .resources(AwsCustomResourcePolicy.ANY_RESOURCE)
 * .build()))
 * .build();
 * ```
 */
public open class PhysicalResourceId(
  cdkObject: software.amazon.awscdk.customresources.PhysicalResourceId,
) : CdkObject(cdkObject) {
  /**
   * Literal string to be used as the physical id.
   */
  public open fun id(): String? = unwrap(this).getId()

  /**
   * Path to a response data element to be used as the physical id.
   */
  public open fun responsePath(): String? = unwrap(this).getResponsePath()

  public companion object {
    public fun fromResponse(responsePath: String): PhysicalResourceId =
        software.amazon.awscdk.customresources.PhysicalResourceId.fromResponse(responsePath).let(PhysicalResourceId::wrap)

    public fun of(id: String): PhysicalResourceId =
        software.amazon.awscdk.customresources.PhysicalResourceId.of(id).let(PhysicalResourceId::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.PhysicalResourceId):
        PhysicalResourceId = PhysicalResourceId(cdkObject)

    internal fun unwrap(wrapped: PhysicalResourceId):
        software.amazon.awscdk.customresources.PhysicalResourceId = wrapped.cdkObject as
        software.amazon.awscdk.customresources.PhysicalResourceId
  }
}
